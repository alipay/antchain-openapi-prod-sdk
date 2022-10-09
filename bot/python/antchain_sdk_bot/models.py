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


class BaiResourceLocation(TeaModel):
    def __init__(
        self,
        location_type: str = None,
        location_value: str = None,
    ):
        # 资源定位类型
        # HTTP_URL：资源url
        # STRING_BASE64：资源base64字符串（不带base64头部）
        self.location_type = location_type
        # 资源定位值
        self.location_value = location_value

    def validate(self):
        self.validate_required(self.location_type, 'location_type')
        self.validate_required(self.location_value, 'location_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.location_type is not None:
            result['location_type'] = self.location_type
        if self.location_value is not None:
            result['location_value'] = self.location_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('location_type') is not None:
            self.location_type = m.get('location_type')
        if m.get('location_value') is not None:
            self.location_value = m.get('location_value')
        return self


class IotBasicPermissionData(TeaModel):
    def __init__(
        self,
        permission_code: str = None,
        permission_name: str = None,
        permission_data: str = None,
        permission_type: str = None,
        module: str = None,
    ):
        # 权限编码
        self.permission_code = permission_code
        # 权限名称
        self.permission_name = permission_name
        # 权限内容
        self.permission_data = permission_data
        # 权限类型
        self.permission_type = permission_type
        # 权限模块
        self.module = module

    def validate(self):
        self.validate_required(self.permission_code, 'permission_code')
        self.validate_required(self.permission_name, 'permission_name')
        self.validate_required(self.permission_data, 'permission_data')
        self.validate_required(self.permission_type, 'permission_type')
        self.validate_required(self.module, 'module')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.permission_code is not None:
            result['permission_code'] = self.permission_code
        if self.permission_name is not None:
            result['permission_name'] = self.permission_name
        if self.permission_data is not None:
            result['permission_data'] = self.permission_data
        if self.permission_type is not None:
            result['permission_type'] = self.permission_type
        if self.module is not None:
            result['module'] = self.module
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('permission_code') is not None:
            self.permission_code = m.get('permission_code')
        if m.get('permission_name') is not None:
            self.permission_name = m.get('permission_name')
        if m.get('permission_data') is not None:
            self.permission_data = m.get('permission_data')
        if m.get('permission_type') is not None:
            self.permission_type = m.get('permission_type')
        if m.get('module') is not None:
            self.module = m.get('module')
        return self


class AlertStrategy(TeaModel):
    def __init__(
        self,
        id: int = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        tenant_name: str = None,
        scene: str = None,
        strategy_type: str = None,
        strategy_detail: str = None,
        enabled: bool = None,
        remark: str = None,
    ):
        # 主键ID
        self.id = id
        # 创建时间
        self.gmt_create = gmt_create
        # 更新时间
        self.gmt_modified = gmt_modified
        # 租户
        self.tenant_name = tenant_name
        # 场景码
        # 
        self.scene = scene
        # 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
        self.strategy_type = strategy_type
        # 策略详情，json格式
        self.strategy_detail = strategy_detail
        # 是否启用，默认false
        self.enabled = enabled
        # 备注
        self.remark = remark

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.strategy_type, 'strategy_type')
        self.validate_required(self.strategy_detail, 'strategy_detail')
        self.validate_required(self.enabled, 'enabled')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.scene is not None:
            result['scene'] = self.scene
        if self.strategy_type is not None:
            result['strategy_type'] = self.strategy_type
        if self.strategy_detail is not None:
            result['strategy_detail'] = self.strategy_detail
        if self.enabled is not None:
            result['enabled'] = self.enabled
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('strategy_type') is not None:
            self.strategy_type = m.get('strategy_type')
        if m.get('strategy_detail') is not None:
            self.strategy_detail = m.get('strategy_detail')
        if m.get('enabled') is not None:
            self.enabled = m.get('enabled')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class SdkModel(TeaModel):
    def __init__(
        self,
        id: int = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        verify_key: str = None,
        sdk_version_str: str = None,
        meta_model: str = None,
        platform: str = None,
        corp_name: str = None,
    ):
        # 主键id
        self.id = id
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 设备SDK公钥
        self.verify_key = verify_key
        # SDK版本号
        self.sdk_version_str = sdk_version_str
        # sdk模型
        self.meta_model = meta_model
        # 平台
        self.platform = platform
        # 公司名称
        self.corp_name = corp_name

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.verify_key, 'verify_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.verify_key is not None:
            result['verify_key'] = self.verify_key
        if self.sdk_version_str is not None:
            result['sdk_version_str'] = self.sdk_version_str
        if self.meta_model is not None:
            result['meta_model'] = self.meta_model
        if self.platform is not None:
            result['platform'] = self.platform
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('verify_key') is not None:
            self.verify_key = m.get('verify_key')
        if m.get('sdk_version_str') is not None:
            self.sdk_version_str = m.get('sdk_version_str')
        if m.get('meta_model') is not None:
            self.meta_model = m.get('meta_model')
        if m.get('platform') is not None:
            self.platform = m.get('platform')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        return self


class GoodsIdAndCount(TeaModel):
    def __init__(
        self,
        goods_sku_id: int = None,
        count: int = None,
    ):
        # 商品id
        self.goods_sku_id = goods_sku_id
        # 商品采购数量
        self.count = count

    def validate(self):
        self.validate_required(self.goods_sku_id, 'goods_sku_id')
        self.validate_required(self.count, 'count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.goods_sku_id is not None:
            result['goods_sku_id'] = self.goods_sku_id
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('goods_sku_id') is not None:
            self.goods_sku_id = m.get('goods_sku_id')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class ProductKeyModel(TeaModel):
    def __init__(
        self,
        id: int = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        product_key: str = None,
        scene: str = None,
        tenant_name: str = None,
        data_model_id: str = None,
        sdk_version_prefix: str = None,
        manufacturer: str = None,
        customer: str = None,
    ):
        # 主键id
        self.id = id
        # 创建时间
        self.gmt_create = gmt_create
        # 更新时间
        self.gmt_modified = gmt_modified
        # 设备端ProductKey
        self.product_key = product_key
        # 场景码
        self.scene = scene
        # 租户Id
        self.tenant_name = tenant_name
        # 数据模型id
        self.data_model_id = data_model_id
        # sdk前缀
        self.sdk_version_prefix = sdk_version_prefix
        # 制造商
        self.manufacturer = manufacturer
        # 顾客
        self.customer = customer

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.product_key, 'product_key')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.data_model_id, 'data_model_id')
        self.validate_required(self.sdk_version_prefix, 'sdk_version_prefix')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.product_key is not None:
            result['product_key'] = self.product_key
        if self.scene is not None:
            result['scene'] = self.scene
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        if self.sdk_version_prefix is not None:
            result['sdk_version_prefix'] = self.sdk_version_prefix
        if self.manufacturer is not None:
            result['manufacturer'] = self.manufacturer
        if self.customer is not None:
            result['customer'] = self.customer
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('product_key') is not None:
            self.product_key = m.get('product_key')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        if m.get('sdk_version_prefix') is not None:
            self.sdk_version_prefix = m.get('sdk_version_prefix')
        if m.get('manufacturer') is not None:
            self.manufacturer = m.get('manufacturer')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        return self


class SceneModel(TeaModel):
    def __init__(
        self,
        id: int = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        scene_name: str = None,
        escrowed: str = None,
        private_key_password: str = None,
        tenant_name: str = None,
        scene_type: str = None,
        skip_pegasus: bool = None,
        customer_processor: str = None,
    ):
        # 主键id
        self.id = id
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 场景名
        self.scene_name = scene_name
        # 是否托管
        self.escrowed = escrowed
        # 私钥密码
        self.private_key_password = private_key_password
        # 租户
        self.tenant_name = tenant_name
        # 场景类型
        self.scene_type = scene_type
        # 是否跳过中台数据校验处理
        self.skip_pegasus = skip_pegasus
        # 定制数据处理类 , 使用用逗号分隔
        self.customer_processor = customer_processor

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.scene_name, 'scene_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.scene_name is not None:
            result['scene_name'] = self.scene_name
        if self.escrowed is not None:
            result['escrowed'] = self.escrowed
        if self.private_key_password is not None:
            result['private_key_password'] = self.private_key_password
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.scene_type is not None:
            result['scene_type'] = self.scene_type
        if self.skip_pegasus is not None:
            result['skip_pegasus'] = self.skip_pegasus
        if self.customer_processor is not None:
            result['customer_processor'] = self.customer_processor
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('scene_name') is not None:
            self.scene_name = m.get('scene_name')
        if m.get('escrowed') is not None:
            self.escrowed = m.get('escrowed')
        if m.get('private_key_password') is not None:
            self.private_key_password = m.get('private_key_password')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('scene_type') is not None:
            self.scene_type = m.get('scene_type')
        if m.get('skip_pegasus') is not None:
            self.skip_pegasus = m.get('skip_pegasus')
        if m.get('customer_processor') is not None:
            self.customer_processor = m.get('customer_processor')
        return self


class BaiGoodsPoint(TeaModel):
    def __init__(
        self,
        point_name: str = None,
        sub_point_name: str = None,
        image_url: str = None,
        image_base_64: str = None,
        user_point_id: str = None,
    ):
        # 鉴定点名称
        self.point_name = point_name
        # 鉴定点子项
        self.sub_point_name = sub_point_name
        # 鉴定点图片的url
        self.image_url = image_url
        # 图片内容base64编码的字符串，该字段与image_url至少一个非空，同时传入以image_url为准
        self.image_base_64 = image_base_64
        # 用户侧鉴定单关联id
        self.user_point_id = user_point_id

    def validate(self):
        self.validate_required(self.point_name, 'point_name')
        self.validate_required(self.sub_point_name, 'sub_point_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.point_name is not None:
            result['point_name'] = self.point_name
        if self.sub_point_name is not None:
            result['sub_point_name'] = self.sub_point_name
        if self.image_url is not None:
            result['image_url'] = self.image_url
        if self.image_base_64 is not None:
            result['image_base64'] = self.image_base_64
        if self.user_point_id is not None:
            result['user_point_id'] = self.user_point_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('point_name') is not None:
            self.point_name = m.get('point_name')
        if m.get('sub_point_name') is not None:
            self.sub_point_name = m.get('sub_point_name')
        if m.get('image_url') is not None:
            self.image_url = m.get('image_url')
        if m.get('image_base64') is not None:
            self.image_base_64 = m.get('image_base64')
        if m.get('user_point_id') is not None:
            self.user_point_id = m.get('user_point_id')
        return self


class DataVerifyFailureData(TeaModel):
    def __init__(
        self,
        id: int = None,
        gmt_create: str = None,
        scene: str = None,
        device_id: str = None,
        dis_device_id: str = None,
        type: int = None,
        public_key: str = None,
        format_type: int = None,
        content_id: str = None,
        content: str = None,
        signature: str = None,
        fail_message: str = None,
        extra_data: str = None,
        source: int = None,
    ):
        # 主键id
        self.id = id
        # 创建时间
        self.gmt_create = gmt_create
        # Alipay-0101
        self.scene = scene
        # 设备ID
        self.device_id = device_id
        # 发行设备ID
        self.dis_device_id = dis_device_id
        # 类型：0:数据上报;1:数据完整性校验
        self.type = type
        # c89b65a2e3afd604977c0....
        self.public_key = public_key
        # 验签类型：0(RAW_DATA)；1(公钥格式为PEM)；2(公钥格式为DER)
        self.format_type = format_type
        # 验证内容hash
        self.content_id = content_id
        # 验证内容
        self.content = content
        # 签名
        self.signature = signature
        # 错误信息
        self.fail_message = fail_message
        # 补充数据
        self.extra_data = extra_data
        # 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
        self.source = source

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.scene is not None:
            result['scene'] = self.scene
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.dis_device_id is not None:
            result['dis_device_id'] = self.dis_device_id
        if self.type is not None:
            result['type'] = self.type
        if self.public_key is not None:
            result['public_key'] = self.public_key
        if self.format_type is not None:
            result['format_type'] = self.format_type
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.content is not None:
            result['content'] = self.content
        if self.signature is not None:
            result['signature'] = self.signature
        if self.fail_message is not None:
            result['fail_message'] = self.fail_message
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('dis_device_id') is not None:
            self.dis_device_id = m.get('dis_device_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
        if m.get('format_type') is not None:
            self.format_type = m.get('format_type')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('fail_message') is not None:
            self.fail_message = m.get('fail_message')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class RawData(TeaModel):
    def __init__(
        self,
        chain_device_id: str = None,
        content: str = None,
        device_id: str = None,
        tx_hash: str = None,
        tx_time: int = None,
        chain_peripheral_id: str = None,
        peripheral_id: str = None,
    ):
        # 链上设备id
        self.chain_device_id = chain_device_id
        # 数据内容
        self.content = content
        # 设备id
        self.device_id = device_id
        # 上链哈希
        self.tx_hash = tx_hash
        # 上链时间
        self.tx_time = tx_time
        # 链上外围设备ID
        self.chain_peripheral_id = chain_peripheral_id
        # 外围设备ID
        self.peripheral_id = peripheral_id

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.tx_time, 'tx_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.content is not None:
            result['content'] = self.content
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
        if self.chain_peripheral_id is not None:
            result['chain_peripheral_id'] = self.chain_peripheral_id
        if self.peripheral_id is not None:
            result['peripheral_id'] = self.peripheral_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
        if m.get('chain_peripheral_id') is not None:
            self.chain_peripheral_id = m.get('chain_peripheral_id')
        if m.get('peripheral_id') is not None:
            self.peripheral_id = m.get('peripheral_id')
        return self


class IotBasicRolePermission(TeaModel):
    def __init__(
        self,
        role_code: str = None,
        role_name: str = None,
        permission_list: List[IotBasicPermissionData] = None,
    ):
        # 角色编码
        self.role_code = role_code
        # 角色名称
        self.role_name = role_name
        # 权限列表
        self.permission_list = permission_list

    def validate(self):
        self.validate_required(self.role_code, 'role_code')
        self.validate_required(self.role_name, 'role_name')
        self.validate_required(self.permission_list, 'permission_list')
        if self.permission_list:
            for k in self.permission_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.role_code is not None:
            result['role_code'] = self.role_code
        if self.role_name is not None:
            result['role_name'] = self.role_name
        result['permission_list'] = []
        if self.permission_list is not None:
            for k in self.permission_list:
                result['permission_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('role_code') is not None:
            self.role_code = m.get('role_code')
        if m.get('role_name') is not None:
            self.role_name = m.get('role_name')
        self.permission_list = []
        if m.get('permission_list') is not None:
            for k in m.get('permission_list'):
                temp_model = IotBasicPermissionData()
                self.permission_list.append(temp_model.from_map(k))
        return self


class PermissionedTenantModel(TeaModel):
    def __init__(
        self,
        id: int = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        tenant_name: str = None,
        org_name: str = None,
        owner: str = None,
        gateway_private_key: str = None,
        gateway_public_key: str = None,
    ):
        # 主键Id
        self.id = id
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 租户名称
        self.tenant_name = tenant_name
        # 公司名称
        self.org_name = org_name
        # 租户所有人标识
        self.owner = owner
        # 网关私钥
        self.gateway_private_key = gateway_private_key
        # 网关公钥
        self.gateway_public_key = gateway_public_key

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.org_name, 'org_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.owner is not None:
            result['owner'] = self.owner
        if self.gateway_private_key is not None:
            result['gateway_private_key'] = self.gateway_private_key
        if self.gateway_public_key is not None:
            result['gateway_public_key'] = self.gateway_public_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('gateway_private_key') is not None:
            self.gateway_private_key = m.get('gateway_private_key')
        if m.get('gateway_public_key') is not None:
            self.gateway_public_key = m.get('gateway_public_key')
        return self


class BaiGoodsPointIdentificationResult(TeaModel):
    def __init__(
        self,
        point_name: str = None,
        sub_point_name: str = None,
        result: str = None,
        grade: str = None,
        user_point_id: str = None,
        appraise_message: str = None,
        resource_location: BaiResourceLocation = None,
    ):
        # 鉴定点大项名称
        self.point_name = point_name
        # 鉴定点子项名称
        self.sub_point_name = sub_point_name
        # 单点鉴定结果
        # REAL：鉴定为真
        # FAKE：鉴定为假
        # UNABLE_IDENTIFY：无法鉴定
        self.result = result
        # 鉴定分数
        self.grade = grade
        # 用户侧的鉴定点point_id，直接将用户传入的user_point_id返回
        self.user_point_id = user_point_id
        # 鉴定评价
        self.appraise_message = appraise_message
        # 鉴定点图片资源定位符
        self.resource_location = resource_location

    def validate(self):
        self.validate_required(self.point_name, 'point_name')
        self.validate_required(self.sub_point_name, 'sub_point_name')
        self.validate_required(self.result, 'result')
        if self.resource_location:
            self.resource_location.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.point_name is not None:
            result['point_name'] = self.point_name
        if self.sub_point_name is not None:
            result['sub_point_name'] = self.sub_point_name
        if self.result is not None:
            result['result'] = self.result
        if self.grade is not None:
            result['grade'] = self.grade
        if self.user_point_id is not None:
            result['user_point_id'] = self.user_point_id
        if self.appraise_message is not None:
            result['appraise_message'] = self.appraise_message
        if self.resource_location is not None:
            result['resource_location'] = self.resource_location.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('point_name') is not None:
            self.point_name = m.get('point_name')
        if m.get('sub_point_name') is not None:
            self.sub_point_name = m.get('sub_point_name')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('grade') is not None:
            self.grade = m.get('grade')
        if m.get('user_point_id') is not None:
            self.user_point_id = m.get('user_point_id')
        if m.get('appraise_message') is not None:
            self.appraise_message = m.get('appraise_message')
        if m.get('resource_location') is not None:
            temp_model = BaiResourceLocation()
            self.resource_location = temp_model.from_map(m['resource_location'])
        return self


class BaiQrcodeVerifyReqData(TeaModel):
    def __init__(
        self,
        query_image_url: str = None,
    ):
        # 二维码图片url
        self.query_image_url = query_image_url

    def validate(self):
        self.validate_required(self.query_image_url, 'query_image_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.query_image_url is not None:
            result['query_image_url'] = self.query_image_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('query_image_url') is not None:
            self.query_image_url = m.get('query_image_url')
        return self


class SdkPageResponse(TeaModel):
    def __init__(
        self,
        page_index: int = None,
        page_size: int = None,
        total_size: int = None,
        total_pages: int = None,
        page_data: List[SdkModel] = None,
    ):
        # 页数
        # 
        self.page_index = page_index
        # 页码
        # 
        self.page_size = page_size
        # 总记录数
        # 
        self.total_size = total_size
        # 总页数
        # 
        self.total_pages = total_pages
        # 数据
        self.page_data = page_data

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_size, 'total_size')
        self.validate_required(self.total_pages, 'total_pages')
        self.validate_required(self.page_data, 'page_data')
        if self.page_data:
            for k in self.page_data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_size is not None:
            result['total_size'] = self.total_size
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        result['page_data'] = []
        if self.page_data is not None:
            for k in self.page_data:
                result['page_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        self.page_data = []
        if m.get('page_data') is not None:
            for k in m.get('page_data'):
                temp_model = SdkModel()
                self.page_data.append(temp_model.from_map(k))
        return self


class ThingsDidRegisterReq(TeaModel):
    def __init__(
        self,
        biz_type: str = None,
        owner_tenant_did: str = None,
        thing_extra_params: str = None,
        thing_origin_id: str = None,
        thing_origin_name: str = None,
        thing_type: int = None,
        thing_version: str = None,
        user_did: List[str] = None,
    ):
        # 业务编码，暂时保留，不需传入
        self.biz_type = biz_type
        # 信物链实体的所有者的分布式身份
        self.owner_tenant_did = owner_tenant_did
        # 信物链实体附加信息 不同实体身份，有不同的json组织格式...
        # 参考
        # DeviceRegisterReqModel，
        # SpaceRegisterReqModel，
        # CorporateReqModel，
        # WarehouseReqModel，
        # 
        self.thing_extra_params = thing_extra_params
        # 原始id，租户内同一类型实体唯一
        self.thing_origin_id = thing_origin_id
        # 实体原始名称
        self.thing_origin_name = thing_origin_name
        # 信物链实体身份
        # DID_TYPE_DEVICE_ALIYUN(0): 阿里云设备
        # DID_TYPE_DEVICE_PEGASUS(1): 链机设备
        # DID_TYPE_DEVICE_MCU(2): MCU设备
        # DID_TYPE_DEVICE_INTEL(3): intel设备
        # DID_TYPE_DEVICE_DEVICE(16384): 默认设备 ...
        # DID_TYPE_CORPORATE(65536): 组织实体
        # DID_TYPE_WAREHOUSE(131072)：仓库实体
        # DID_TYPE_SPACE(196608)： 空间实体
        self.thing_type = thing_type
        # 实体版本
        self.thing_version = thing_version
        # 信物链实体的使用方的分布式身份列表
        self.user_did = user_did

    def validate(self):
        self.validate_required(self.thing_origin_id, 'thing_origin_id')
        self.validate_required(self.thing_origin_name, 'thing_origin_name')
        self.validate_required(self.thing_type, 'thing_type')
        self.validate_required(self.thing_version, 'thing_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.owner_tenant_did is not None:
            result['owner_tenant_did'] = self.owner_tenant_did
        if self.thing_extra_params is not None:
            result['thing_extra_params'] = self.thing_extra_params
        if self.thing_origin_id is not None:
            result['thing_origin_id'] = self.thing_origin_id
        if self.thing_origin_name is not None:
            result['thing_origin_name'] = self.thing_origin_name
        if self.thing_type is not None:
            result['thing_type'] = self.thing_type
        if self.thing_version is not None:
            result['thing_version'] = self.thing_version
        if self.user_did is not None:
            result['user_did'] = self.user_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('owner_tenant_did') is not None:
            self.owner_tenant_did = m.get('owner_tenant_did')
        if m.get('thing_extra_params') is not None:
            self.thing_extra_params = m.get('thing_extra_params')
        if m.get('thing_origin_id') is not None:
            self.thing_origin_id = m.get('thing_origin_id')
        if m.get('thing_origin_name') is not None:
            self.thing_origin_name = m.get('thing_origin_name')
        if m.get('thing_type') is not None:
            self.thing_type = m.get('thing_type')
        if m.get('thing_version') is not None:
            self.thing_version = m.get('thing_version')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        return self


class BaiGoodsPointQueryRespData(TeaModel):
    def __init__(
        self,
        detection: bool = None,
        identification_result: str = None,
    ):
        # 识别结果
        # true：识别到鉴定点
        # false：未识别到鉴定点
        self.detection = detection
        # 鉴定结果
        # REAL：鉴定为真
        # FAKE：鉴定为假
        # UNABLE_IDENTIFY：无法鉴定
        self.identification_result = identification_result

    def validate(self):
        self.validate_required(self.detection, 'detection')
        self.validate_required(self.identification_result, 'identification_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.detection is not None:
            result['detection'] = self.detection
        if self.identification_result is not None:
            result['identification_result'] = self.identification_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('detection') is not None:
            self.detection = m.get('detection')
        if m.get('identification_result') is not None:
            self.identification_result = m.get('identification_result')
        return self


class BaiQrcodeVerifyRespData(TeaModel):
    def __init__(
        self,
        identification_result: str = None,
        identification_code: str = None,
        identification_message: str = None,
        unable_identify_solution: str = None,
    ):
        # 鉴定结果
        # REAL：通过
        # UNABLE_IDENTIFY：无法鉴定
        self.identification_result = identification_result
        # 辅助识别结果码
        self.identification_code = identification_code
        # 辅助识别信息
        self.identification_message = identification_message
        # 无法鉴定时的解决方案
        self.unable_identify_solution = unable_identify_solution

    def validate(self):
        self.validate_required(self.identification_result, 'identification_result')
        self.validate_required(self.identification_code, 'identification_code')
        self.validate_required(self.identification_message, 'identification_message')
        self.validate_required(self.unable_identify_solution, 'unable_identify_solution')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.identification_result is not None:
            result['identification_result'] = self.identification_result
        if self.identification_code is not None:
            result['identification_code'] = self.identification_code
        if self.identification_message is not None:
            result['identification_message'] = self.identification_message
        if self.unable_identify_solution is not None:
            result['unable_identify_solution'] = self.unable_identify_solution
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identification_result') is not None:
            self.identification_result = m.get('identification_result')
        if m.get('identification_code') is not None:
            self.identification_code = m.get('identification_code')
        if m.get('identification_message') is not None:
            self.identification_message = m.get('identification_message')
        if m.get('unable_identify_solution') is not None:
            self.unable_identify_solution = m.get('unable_identify_solution')
        return self


class BaiGoodsPointCheckRespData(TeaModel):
    def __init__(
        self,
        valid: bool = None,
    ):
        # 图片是否有效，无效则需要提示重拍
        self.valid = valid

    def validate(self):
        self.validate_required(self.valid, 'valid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.valid is not None:
            result['valid'] = self.valid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('valid') is not None:
            self.valid = m.get('valid')
        return self


class IotBasicDeviceQueryResponse(TeaModel):
    def __init__(
        self,
        device_name: str = None,
        device_sn: str = None,
        device_category_name: str = None,
        device_model: str = None,
        device_status: str = None,
        location: str = None,
        register_time: str = None,
        corp_name: str = None,
        tenant_id: str = None,
        customer_name: str = None,
        abnormal_code: str = None,
        device_did: str = None,
        account_id: str = None,
        account_name: str = None,
        service_status: str = None,
        app_version: str = None,
        validity_time: str = None,
    ):
        # 设备名称
        # 
        self.device_name = device_name
        # 设备序列号
        self.device_sn = device_sn
        # 设备品类名称
        self.device_category_name = device_category_name
        # 设备型号
        self.device_model = device_model
        # 设备状态
        self.device_status = device_status
        # 设备安装位置
        self.location = location
        # 设备注册时间
        self.register_time = register_time
        # 设备厂商
        self.corp_name = corp_name
        # 租户ID
        self.tenant_id = tenant_id
        # 客户名称
        self.customer_name = customer_name
        # 异常错误码
        self.abnormal_code = abnormal_code
        # 设备唯一身份id
        self.device_did = device_did
        # 账号ID
        self.account_id = account_id
        # 账户名称
        self.account_name = account_name
        # 设备服务状态
        self.service_status = service_status
        # 应用版本号
        self.app_version = app_version
        # 服务有效期
        self.validity_time = validity_time

    def validate(self):
        self.validate_required(self.device_name, 'device_name')
        self.validate_required(self.device_sn, 'device_sn')
        self.validate_required(self.device_category_name, 'device_category_name')
        self.validate_required(self.device_model, 'device_model')
        self.validate_required(self.register_time, 'register_time')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.customer_name, 'customer_name')
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.account_name, 'account_name')
        self.validate_required(self.service_status, 'service_status')
        self.validate_required(self.app_version, 'app_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.device_category_name is not None:
            result['device_category_name'] = self.device_category_name
        if self.device_model is not None:
            result['device_model'] = self.device_model
        if self.device_status is not None:
            result['device_status'] = self.device_status
        if self.location is not None:
            result['location'] = self.location
        if self.register_time is not None:
            result['register_time'] = self.register_time
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.abnormal_code is not None:
            result['abnormal_code'] = self.abnormal_code
        if self.device_did is not None:
            result['device_did'] = self.device_did
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.service_status is not None:
            result['service_status'] = self.service_status
        if self.app_version is not None:
            result['app_version'] = self.app_version
        if self.validity_time is not None:
            result['validity_time'] = self.validity_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('device_category_name') is not None:
            self.device_category_name = m.get('device_category_name')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        if m.get('device_status') is not None:
            self.device_status = m.get('device_status')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('register_time') is not None:
            self.register_time = m.get('register_time')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('abnormal_code') is not None:
            self.abnormal_code = m.get('abnormal_code')
        if m.get('device_did') is not None:
            self.device_did = m.get('device_did')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('service_status') is not None:
            self.service_status = m.get('service_status')
        if m.get('app_version') is not None:
            self.app_version = m.get('app_version')
        if m.get('validity_time') is not None:
            self.validity_time = m.get('validity_time')
        return self


class DataVerifyFailureDataPageResponse(TeaModel):
    def __init__(
        self,
        page_index: int = None,
        page_size: int = None,
        total_size: int = None,
        total_pages: int = None,
        page_data: List[DataVerifyFailureData] = None,
    ):
        # 页数
        # 
        self.page_index = page_index
        # 页码
        # 
        self.page_size = page_size
        # 总记录数
        # 
        self.total_size = total_size
        # 总页数
        # 
        self.total_pages = total_pages
        # 数据
        self.page_data = page_data

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_size, 'total_size')
        self.validate_required(self.total_pages, 'total_pages')
        self.validate_required(self.page_data, 'page_data')
        if self.page_data:
            for k in self.page_data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_size is not None:
            result['total_size'] = self.total_size
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        result['page_data'] = []
        if self.page_data is not None:
            for k in self.page_data:
                result['page_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        self.page_data = []
        if m.get('page_data') is not None:
            for k in m.get('page_data'):
                temp_model = DataVerifyFailureData()
                self.page_data.append(temp_model.from_map(k))
        return self


class TsmCommonCmd(TeaModel):
    def __init__(
        self,
        cla: int = None,
        data: List[int] = None,
        ins: int = None,
        lc: int = None,
        le: int = None,
        need_security_handle: bool = None,
        p_1: int = None,
        p_2: int = None,
    ):
        # private byte cla;
        self.cla = cla
        # host challenge data.
        self.data = data
        # private byte ins;
        self.ins = ins
        # private byte lc;
        self.lc = lc
        # private byte le = (byte) 0x00;
        self.le = le
        # private Boolean needSecurityHandle = Boolean.TRUE;
        self.need_security_handle = need_security_handle
        # private byte p1;
        self.p_1 = p_1
        # private byte p2 = (byte) 0x00;
        self.p_2 = p_2

    def validate(self):
        self.validate_required(self.cla, 'cla')
        self.validate_required(self.data, 'data')
        self.validate_required(self.ins, 'ins')
        self.validate_required(self.lc, 'lc')
        self.validate_required(self.p_1, 'p_1')
        self.validate_required(self.p_2, 'p_2')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cla is not None:
            result['cla'] = self.cla
        if self.data is not None:
            result['data'] = self.data
        if self.ins is not None:
            result['ins'] = self.ins
        if self.lc is not None:
            result['lc'] = self.lc
        if self.le is not None:
            result['le'] = self.le
        if self.need_security_handle is not None:
            result['need_security_handle'] = self.need_security_handle
        if self.p_1 is not None:
            result['p1'] = self.p_1
        if self.p_2 is not None:
            result['p2'] = self.p_2
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cla') is not None:
            self.cla = m.get('cla')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('ins') is not None:
            self.ins = m.get('ins')
        if m.get('lc') is not None:
            self.lc = m.get('lc')
        if m.get('le') is not None:
            self.le = m.get('le')
        if m.get('need_security_handle') is not None:
            self.need_security_handle = m.get('need_security_handle')
        if m.get('p1') is not None:
            self.p_1 = m.get('p1')
        if m.get('p2') is not None:
            self.p_2 = m.get('p2')
        return self


class TenantBindInfoReq(TeaModel):
    def __init__(
        self,
        extension: str = None,
        biz_type: str = None,
        tenant_uid: str = None,
        user_name: str = None,
    ):
        # 租户关联扩展信息
        self.extension = extension
        # 业务类型，默认空
        self.biz_type = biz_type
        # 组织机构代码，可为中文
        self.tenant_uid = tenant_uid
        # 组织结构名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.tenant_uid, 'tenant_uid')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.extension is not None:
            result['extension'] = self.extension
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.tenant_uid is not None:
            result['tenant_uid'] = self.tenant_uid
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('tenant_uid') is not None:
            self.tenant_uid = m.get('tenant_uid')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class EvidenceBaseModel(TeaModel):
    def __init__(
        self,
        biz_data: str = None,
        hash: str = None,
        meta_json: str = None,
    ):
        # 业务数据
        self.biz_data = biz_data
        # 证据哈希值
        self.hash = hash
        # 证据附属信息字段
        self.meta_json = meta_json

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_data is not None:
            result['biz_data'] = self.biz_data
        if self.hash is not None:
            result['hash'] = self.hash
        if self.meta_json is not None:
            result['meta_json'] = self.meta_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_data') is not None:
            self.biz_data = m.get('biz_data')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('meta_json') is not None:
            self.meta_json = m.get('meta_json')
        return self


class TlsnotaryUploadOssLinks(TeaModel):
    def __init__(
        self,
        cert_chain_digest_link: str = None,
        eml_file_link: str = None,
    ):
        # 证书链摘要文件的oss链接
        self.cert_chain_digest_link = cert_chain_digest_link
        # 邮件eml文件的oss链接
        self.eml_file_link = eml_file_link

    def validate(self):
        self.validate_required(self.cert_chain_digest_link, 'cert_chain_digest_link')
        self.validate_required(self.eml_file_link, 'eml_file_link')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cert_chain_digest_link is not None:
            result['cert_chain_digest_link'] = self.cert_chain_digest_link
        if self.eml_file_link is not None:
            result['eml_file_link'] = self.eml_file_link
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cert_chain_digest_link') is not None:
            self.cert_chain_digest_link = m.get('cert_chain_digest_link')
        if m.get('eml_file_link') is not None:
            self.eml_file_link = m.get('eml_file_link')
        return self


class BaiQrcodeComparisonReqData(TeaModel):
    def __init__(
        self,
        trace_id: str = None,
        query_image_location: BaiResourceLocation = None,
        gallery_image_location: BaiResourceLocation = None,
        downgrade: bool = None,
    ):
        # 扫码操作id，多次请求的trace_id相同代表短时间内在扫同一个码
        self.trace_id = trace_id
        # query图片定位信息
        self.query_image_location = query_image_location
        # gallery图片定位信息
        self.gallery_image_location = gallery_image_location
        # 是否允许降级
        self.downgrade = downgrade

    def validate(self):
        self.validate_required(self.trace_id, 'trace_id')
        if self.trace_id is not None:
            self.validate_max_length(self.trace_id, 'trace_id', 128)
        self.validate_required(self.query_image_location, 'query_image_location')
        if self.query_image_location:
            self.query_image_location.validate()
        self.validate_required(self.gallery_image_location, 'gallery_image_location')
        if self.gallery_image_location:
            self.gallery_image_location.validate()
        self.validate_required(self.downgrade, 'downgrade')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.query_image_location is not None:
            result['query_image_location'] = self.query_image_location.to_map()
        if self.gallery_image_location is not None:
            result['gallery_image_location'] = self.gallery_image_location.to_map()
        if self.downgrade is not None:
            result['downgrade'] = self.downgrade
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('query_image_location') is not None:
            temp_model = BaiResourceLocation()
            self.query_image_location = temp_model.from_map(m['query_image_location'])
        if m.get('gallery_image_location') is not None:
            temp_model = BaiResourceLocation()
            self.gallery_image_location = temp_model.from_map(m['gallery_image_location'])
        if m.get('downgrade') is not None:
            self.downgrade = m.get('downgrade')
        return self


class ThingsDidUpdateReq(TeaModel):
    def __init__(
        self,
        biz_type: str = None,
        thing_did: str = None,
        thing_extra_params: str = None,
        thing_version: str = None,
    ):
        # 业务类型，默认空
        self.biz_type = biz_type
        # 待更新的实体did
        self.thing_did = thing_did
        # 更新内容，参考更新请求不同实体类型结构体，对应不同实体类型不一样
        # 信物链实体附加信息 不同实体身份，有不同的json组织格式，
        # 参考 DeviceRegisterReqModel， SpaceRegisterReqModel， CorporateReqModel， WarehouseReqModel，
        self.thing_extra_params = thing_extra_params
        # 更新后的实体版本
        self.thing_version = thing_version

    def validate(self):
        self.validate_required(self.thing_did, 'thing_did')
        self.validate_required(self.thing_version, 'thing_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.thing_did is not None:
            result['thing_did'] = self.thing_did
        if self.thing_extra_params is not None:
            result['thing_extra_params'] = self.thing_extra_params
        if self.thing_version is not None:
            result['thing_version'] = self.thing_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('thing_did') is not None:
            self.thing_did = m.get('thing_did')
        if m.get('thing_extra_params') is not None:
            self.thing_extra_params = m.get('thing_extra_params')
        if m.get('thing_version') is not None:
            self.thing_version = m.get('thing_version')
        return self


class LabelChainResult(TeaModel):
    def __init__(
        self,
        label_id: str = None,
        asset_id: str = None,
        tx_hash: str = None,
        error_code: str = None,
        error_msg: str = None,
    ):
        # 标签ID
        self.label_id = label_id
        # 业务资产ID，接入方自行定义
        self.asset_id = asset_id
        # 标签最近一次上链的txHash
        self.tx_hash = tx_hash
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_msg = error_msg

    def validate(self):
        self.validate_required(self.label_id, 'label_id')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.error_msg, 'error_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.label_id is not None:
            result['label_id'] = self.label_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('label_id') is not None:
            self.label_id = m.get('label_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class WarehouseReqModel(TeaModel):
    def __init__(
        self,
        address: str = None,
        area: int = None,
        elevation: int = None,
        height: int = None,
        latitude: int = None,
        longitude: int = None,
        nation: str = None,
        other_info: str = None,
        status: str = None,
        type: str = None,
    ):
        # 详细地址
        self.address = address
        # 面积 平方米单位*1e4
        self.area = area
        # 海拔 米单位*1e2
        self.elevation = elevation
        # 仓库高度 米单位*1e2
        self.height = height
        # 纬度 度数单位*1e9
        self.latitude = latitude
        # 经度 度数单位*1e9
        self.longitude = longitude
        # 所在国家，中国
        self.nation = nation
        # 其他信息
        self.other_info = other_info
        # 仓库状态, AVAILABLE, IN_USE, DELETED, 自定义
        self.status = status
        # 仓库类型
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.area is not None:
            result['area'] = self.area
        if self.elevation is not None:
            result['elevation'] = self.elevation
        if self.height is not None:
            result['height'] = self.height
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.nation is not None:
            result['nation'] = self.nation
        if self.other_info is not None:
            result['other_info'] = self.other_info
        if self.status is not None:
            result['status'] = self.status
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('area') is not None:
            self.area = m.get('area')
        if m.get('elevation') is not None:
            self.elevation = m.get('elevation')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('nation') is not None:
            self.nation = m.get('nation')
        if m.get('other_info') is not None:
            self.other_info = m.get('other_info')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class PurchaseOrderInfoDetail(TeaModel):
    def __init__(
        self,
        order_number: str = None,
        consignee_name: str = None,
        consignee_id_number: str = None,
        consignee_phone: str = None,
        consignee_address: str = None,
        supplier_name: str = None,
        supplier_id: str = None,
        lease_id: str = None,
        goods_id_and_count: List[GoodsIdAndCount] = None,
    ):
        # 租赁订单号
        # 
        self.order_number = order_number
        # 收货人姓名
        # 
        self.consignee_name = consignee_name
        # 收货人身份证号
        self.consignee_id_number = consignee_id_number
        # 收货人手机号
        # 
        self.consignee_phone = consignee_phone
        # 收货人地址
        self.consignee_address = consignee_address
        # 供货商名称
        # 
        self.supplier_name = supplier_name
        # 供货商租户id
        # 
        self.supplier_id = supplier_id
        # 采购商id
        # 
        self.lease_id = lease_id
        # 商品信息列表
        self.goods_id_and_count = goods_id_and_count

    def validate(self):
        self.validate_required(self.order_number, 'order_number')
        self.validate_required(self.consignee_name, 'consignee_name')
        self.validate_required(self.consignee_id_number, 'consignee_id_number')
        self.validate_required(self.consignee_phone, 'consignee_phone')
        self.validate_required(self.consignee_address, 'consignee_address')
        self.validate_required(self.supplier_name, 'supplier_name')
        self.validate_required(self.supplier_id, 'supplier_id')
        self.validate_required(self.lease_id, 'lease_id')
        self.validate_required(self.goods_id_and_count, 'goods_id_and_count')
        if self.goods_id_and_count:
            for k in self.goods_id_and_count:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_number is not None:
            result['order_number'] = self.order_number
        if self.consignee_name is not None:
            result['consignee_name'] = self.consignee_name
        if self.consignee_id_number is not None:
            result['consignee_id_number'] = self.consignee_id_number
        if self.consignee_phone is not None:
            result['consignee_phone'] = self.consignee_phone
        if self.consignee_address is not None:
            result['consignee_address'] = self.consignee_address
        if self.supplier_name is not None:
            result['supplier_name'] = self.supplier_name
        if self.supplier_id is not None:
            result['supplier_id'] = self.supplier_id
        if self.lease_id is not None:
            result['lease_id'] = self.lease_id
        result['goods_id_and_count'] = []
        if self.goods_id_and_count is not None:
            for k in self.goods_id_and_count:
                result['goods_id_and_count'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_number') is not None:
            self.order_number = m.get('order_number')
        if m.get('consignee_name') is not None:
            self.consignee_name = m.get('consignee_name')
        if m.get('consignee_id_number') is not None:
            self.consignee_id_number = m.get('consignee_id_number')
        if m.get('consignee_phone') is not None:
            self.consignee_phone = m.get('consignee_phone')
        if m.get('consignee_address') is not None:
            self.consignee_address = m.get('consignee_address')
        if m.get('supplier_name') is not None:
            self.supplier_name = m.get('supplier_name')
        if m.get('supplier_id') is not None:
            self.supplier_id = m.get('supplier_id')
        if m.get('lease_id') is not None:
            self.lease_id = m.get('lease_id')
        self.goods_id_and_count = []
        if m.get('goods_id_and_count') is not None:
            for k in m.get('goods_id_and_count'):
                temp_model = GoodsIdAndCount()
                self.goods_id_and_count.append(temp_model.from_map(k))
        return self


class ComputerInfo(TeaModel):
    def __init__(
        self,
        colour: str = None,
        colour_number: str = None,
        computer_model: str = None,
        config_param: str = None,
        video_card: str = None,
        screen_size: str = None,
        cpu: str = None,
        memory: str = None,
        disk_size: str = None,
    ):
        # 颜色
        self.colour = colour
        # 色值
        self.colour_number = colour_number
        # 电脑型号
        self.computer_model = computer_model
        # 配置参数
        self.config_param = config_param
        # 显卡
        self.video_card = video_card
        # 屏幕
        self.screen_size = screen_size
        # 电脑CPU
        self.cpu = cpu
        # 电脑内存
        self.memory = memory
        # 电脑硬盘
        self.disk_size = disk_size

    def validate(self):
        self.validate_required(self.cpu, 'cpu')
        self.validate_required(self.memory, 'memory')
        self.validate_required(self.disk_size, 'disk_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.colour is not None:
            result['colour'] = self.colour
        if self.colour_number is not None:
            result['colour_number'] = self.colour_number
        if self.computer_model is not None:
            result['computer_model'] = self.computer_model
        if self.config_param is not None:
            result['config_param'] = self.config_param
        if self.video_card is not None:
            result['video_card'] = self.video_card
        if self.screen_size is not None:
            result['screen_size'] = self.screen_size
        if self.cpu is not None:
            result['cpu'] = self.cpu
        if self.memory is not None:
            result['memory'] = self.memory
        if self.disk_size is not None:
            result['disk_size'] = self.disk_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('colour') is not None:
            self.colour = m.get('colour')
        if m.get('colour_number') is not None:
            self.colour_number = m.get('colour_number')
        if m.get('computer_model') is not None:
            self.computer_model = m.get('computer_model')
        if m.get('config_param') is not None:
            self.config_param = m.get('config_param')
        if m.get('video_card') is not None:
            self.video_card = m.get('video_card')
        if m.get('screen_size') is not None:
            self.screen_size = m.get('screen_size')
        if m.get('cpu') is not None:
            self.cpu = m.get('cpu')
        if m.get('memory') is not None:
            self.memory = m.get('memory')
        if m.get('disk_size') is not None:
            self.disk_size = m.get('disk_size')
        return self


class EvidenceQueryInfoReq(TeaModel):
    def __init__(
        self,
        device_signature: str = None,
        device_uid: str = None,
        query_type: str = None,
        tx_hash: str = None,
    ):
        # 暂时保留
        self.device_signature = device_signature
        # 暂时保留
        self.device_uid = device_uid
        # 不同上链方式
        # "CZ": 普通存证
        # "IOTPAY": 支付存证
        # "RAW": 文本上链
        # "TTTS": 溯源存证
        self.query_type = query_type
        # 查询的链上交易txHash
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.query_type, 'query_type')
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_signature is not None:
            result['device_signature'] = self.device_signature
        if self.device_uid is not None:
            result['device_uid'] = self.device_uid
        if self.query_type is not None:
            result['query_type'] = self.query_type
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_signature') is not None:
            self.device_signature = m.get('device_signature')
        if m.get('device_uid') is not None:
            self.device_uid = m.get('device_uid')
        if m.get('query_type') is not None:
            self.query_type = m.get('query_type')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class BaiGoodsComparisonReqData(TeaModel):
    def __init__(
        self,
        category: str = None,
        brand: str = None,
        style: str = None,
        goods_points: List[BaiGoodsPoint] = None,
        out_state: str = None,
    ):
        # 品类
        self.category = category
        # 品牌
        self.brand = brand
        # 款式
        self.style = style
        # 商品鉴定点列表
        self.goods_points = goods_points
        # 用户自定义字符串，系统不做处理，会在响应体中带回
        self.out_state = out_state

    def validate(self):
        self.validate_required(self.category, 'category')
        self.validate_required(self.brand, 'brand')
        self.validate_required(self.style, 'style')
        self.validate_required(self.goods_points, 'goods_points')
        if self.goods_points:
            for k in self.goods_points:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.category is not None:
            result['category'] = self.category
        if self.brand is not None:
            result['brand'] = self.brand
        if self.style is not None:
            result['style'] = self.style
        result['goods_points'] = []
        if self.goods_points is not None:
            for k in self.goods_points:
                result['goods_points'].append(k.to_map() if k else None)
        if self.out_state is not None:
            result['out_state'] = self.out_state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('brand') is not None:
            self.brand = m.get('brand')
        if m.get('style') is not None:
            self.style = m.get('style')
        self.goods_points = []
        if m.get('goods_points') is not None:
            for k in m.get('goods_points'):
                temp_model = BaiGoodsPoint()
                self.goods_points.append(temp_model.from_map(k))
        if m.get('out_state') is not None:
            self.out_state = m.get('out_state')
        return self


class SendCollectorResult(TeaModel):
    def __init__(
        self,
        tx_hash: str = None,
    ):
        # 数据内容content的上链交易哈希
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class DeviceDisableData(TeaModel):
    def __init__(
        self,
        device_sn: str = None,
        corp_name: str = None,
    ):
        # 设备sn号
        self.device_sn = device_sn
        # 厂商
        self.corp_name = corp_name

    def validate(self):
        self.validate_required(self.device_sn, 'device_sn')
        self.validate_required(self.corp_name, 'corp_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        return self


class IotDeviceAttributeRelationshipData(TeaModel):
    def __init__(
        self,
        id: int = None,
        device_category: str = None,
        relation_type: str = None,
        corp_name: str = None,
        device_model: str = None,
        device_specs: str = None,
        hardware_module: str = None,
    ):
        # id
        self.id = id
        # 设备品类名称
        self.device_category = device_category
        # 关系类型
        self.relation_type = relation_type
        # 厂商名称
        self.corp_name = corp_name
        # 设备型号
        self.device_model = device_model
        # 设备规格
        self.device_specs = device_specs
        # 硬件模块
        self.hardware_module = hardware_module

    def validate(self):
        self.validate_required(self.device_category, 'device_category')
        self.validate_required(self.relation_type, 'relation_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.device_category is not None:
            result['device_category'] = self.device_category
        if self.relation_type is not None:
            result['relation_type'] = self.relation_type
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.device_model is not None:
            result['device_model'] = self.device_model
        if self.device_specs is not None:
            result['device_specs'] = self.device_specs
        if self.hardware_module is not None:
            result['hardware_module'] = self.hardware_module
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('device_category') is not None:
            self.device_category = m.get('device_category')
        if m.get('relation_type') is not None:
            self.relation_type = m.get('relation_type')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        if m.get('device_specs') is not None:
            self.device_specs = m.get('device_specs')
        if m.get('hardware_module') is not None:
            self.hardware_module = m.get('hardware_module')
        return self


class InsertPurchaseOrderFailInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        fail_reason: str = None,
    ):
        # 订单ID
        self.order_id = order_id
        # 订单保存失败的原因
        self.fail_reason = fail_reason

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.fail_reason, 'fail_reason')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        return self


class TenantProjectCreateReq(TeaModel):
    def __init__(
        self,
        biz_type: str = None,
        blockchain_type: int = None,
        blockchain_uid: str = None,
        project_name: str = None,
    ):
        # 业务类型，默认空
        self.biz_type = biz_type
        # 可选的，项目关联的区块链类型，1/2/3代表存证/合约等类型
        self.blockchain_type = blockchain_type
        # 可选的，项目关联的区块链uid
        self.blockchain_uid = blockchain_uid
        # 租户下唯一项目名称，用以标识项目聚合的存证等信息
        self.project_name = project_name

    def validate(self):
        self.validate_required(self.project_name, 'project_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.blockchain_type is not None:
            result['blockchain_type'] = self.blockchain_type
        if self.blockchain_uid is not None:
            result['blockchain_uid'] = self.blockchain_uid
        if self.project_name is not None:
            result['project_name'] = self.project_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('blockchain_type') is not None:
            self.blockchain_type = m.get('blockchain_type')
        if m.get('blockchain_uid') is not None:
            self.blockchain_uid = m.get('blockchain_uid')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        return self


class ScfLeaseEqpInfo(TeaModel):
    def __init__(
        self,
        device_type: str = None,
        operation_date: str = None,
        gmt_modified: str = None,
        maintenance_money: str = None,
        maintain_record: str = None,
        device_no: str = None,
        gmt_create: str = None,
        sorting_num: str = None,
        operation_minute: str = None,
        am_num: str = None,
        pm_num: str = None,
        id: str = None,
        device_acceptance_date: str = None,
        data_update_time: str = None,
    ):
        # 设备类型
        self.device_type = device_type
        # 运营日期
        self.operation_date = operation_date
        # 修改时间
        self.gmt_modified = gmt_modified
        # 维修金比例
        self.maintenance_money = maintenance_money
        # 当日设备维修记录
        self.maintain_record = maintain_record
        # 设备识别号
        self.device_no = device_no
        # 创建时间
        self.gmt_create = gmt_create
        # 当日分拣单数
        self.sorting_num = sorting_num
        # 当日运营时长,单位分钟
        self.operation_minute = operation_minute
        # 04:00-16:00分拣单数/（派件分拣单数）
        self.am_num = am_num
        # 16:00-04:00分拣单数/ （揽件分拣单数)
        self.pm_num = pm_num
        # id
        self.id = id
        # 设备验收日期
        self.device_acceptance_date = device_acceptance_date
        # 数据更新时间
        self.data_update_time = data_update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_type is not None:
            result['device_type'] = self.device_type
        if self.operation_date is not None:
            result['operation_date'] = self.operation_date
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.maintenance_money is not None:
            result['maintenance_money'] = self.maintenance_money
        if self.maintain_record is not None:
            result['maintain_record'] = self.maintain_record
        if self.device_no is not None:
            result['device_no'] = self.device_no
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.sorting_num is not None:
            result['sorting_num'] = self.sorting_num
        if self.operation_minute is not None:
            result['operation_minute'] = self.operation_minute
        if self.am_num is not None:
            result['am_num'] = self.am_num
        if self.pm_num is not None:
            result['pm_num'] = self.pm_num
        if self.id is not None:
            result['id'] = self.id
        if self.device_acceptance_date is not None:
            result['device_acceptance_date'] = self.device_acceptance_date
        if self.data_update_time is not None:
            result['data_update_time'] = self.data_update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        if m.get('operation_date') is not None:
            self.operation_date = m.get('operation_date')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('maintenance_money') is not None:
            self.maintenance_money = m.get('maintenance_money')
        if m.get('maintain_record') is not None:
            self.maintain_record = m.get('maintain_record')
        if m.get('device_no') is not None:
            self.device_no = m.get('device_no')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('sorting_num') is not None:
            self.sorting_num = m.get('sorting_num')
        if m.get('operation_minute') is not None:
            self.operation_minute = m.get('operation_minute')
        if m.get('am_num') is not None:
            self.am_num = m.get('am_num')
        if m.get('pm_num') is not None:
            self.pm_num = m.get('pm_num')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('device_acceptance_date') is not None:
            self.device_acceptance_date = m.get('device_acceptance_date')
        if m.get('data_update_time') is not None:
            self.data_update_time = m.get('data_update_time')
        return self


class IotBasicDeviceHardWareModule(TeaModel):
    def __init__(
        self,
        specs_id: int = None,
        hardware_module_id: int = None,
        hardware_module_name: str = None,
        hardware_module_value: str = None,
        hardware_module_param: str = None,
    ):
        # 所属规格
        self.specs_id = specs_id
        # 硬件模块ID
        self.hardware_module_id = hardware_module_id
        # 模块名称
        self.hardware_module_name = hardware_module_name
        # 模块编码
        self.hardware_module_value = hardware_module_value
        # 模块参数
        self.hardware_module_param = hardware_module_param

    def validate(self):
        self.validate_required(self.specs_id, 'specs_id')
        self.validate_required(self.hardware_module_id, 'hardware_module_id')
        self.validate_required(self.hardware_module_name, 'hardware_module_name')
        self.validate_required(self.hardware_module_value, 'hardware_module_value')
        self.validate_required(self.hardware_module_param, 'hardware_module_param')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.specs_id is not None:
            result['specs_id'] = self.specs_id
        if self.hardware_module_id is not None:
            result['hardware_module_id'] = self.hardware_module_id
        if self.hardware_module_name is not None:
            result['hardware_module_name'] = self.hardware_module_name
        if self.hardware_module_value is not None:
            result['hardware_module_value'] = self.hardware_module_value
        if self.hardware_module_param is not None:
            result['hardware_module_param'] = self.hardware_module_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('specs_id') is not None:
            self.specs_id = m.get('specs_id')
        if m.get('hardware_module_id') is not None:
            self.hardware_module_id = m.get('hardware_module_id')
        if m.get('hardware_module_name') is not None:
            self.hardware_module_name = m.get('hardware_module_name')
        if m.get('hardware_module_value') is not None:
            self.hardware_module_value = m.get('hardware_module_value')
        if m.get('hardware_module_param') is not None:
            self.hardware_module_param = m.get('hardware_module_param')
        return self


class EvidenceStorageReq(TeaModel):
    def __init__(
        self,
        biz_data: str = None,
        category: str = None,
        iot_did: str = None,
        hash: str = None,
        meta_json: str = None,
        project_uid: str = None,
    ):
        # 业务数据，原文上链，或者加密（label若为CRYPTO）上链，上链后的业务数据，通过授权可被区块链其他业务方查询
        self.biz_data = biz_data
        # 不同上链方式
        # 空/"": 默认
        # "TTTS": 溯源
        # "IOTPAY": 支付
        # "CZ": 存证
        # "RAW":文本
        self.category = category
        # 上链实体id(设备/空间)
        # 不可和project_uid同时为空
        self.iot_did = iot_did
        # 需要上链的证据的哈希值
        self.hash = hash
        # 上链的附属信息
        self.meta_json = meta_json
        # 上链的项目id,
        # 不可和iot_did同时为空
        self.project_uid = project_uid

    def validate(self):
        self.validate_required(self.category, 'category')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_data is not None:
            result['biz_data'] = self.biz_data
        if self.category is not None:
            result['category'] = self.category
        if self.iot_did is not None:
            result['iot_did'] = self.iot_did
        if self.hash is not None:
            result['hash'] = self.hash
        if self.meta_json is not None:
            result['meta_json'] = self.meta_json
        if self.project_uid is not None:
            result['project_uid'] = self.project_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_data') is not None:
            self.biz_data = m.get('biz_data')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('iot_did') is not None:
            self.iot_did = m.get('iot_did')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('meta_json') is not None:
            self.meta_json = m.get('meta_json')
        if m.get('project_uid') is not None:
            self.project_uid = m.get('project_uid')
        return self


class BaiQrcodeComparisonRespData(TeaModel):
    def __init__(
        self,
        identification_result: str = None,
        identification_code: str = None,
        identification_message: str = None,
        unable_identify_solution: str = None,
    ):
        # 识别结果（REAL：真   FAKE：假   UNABLE_IDENTIFY：无法识别）
        self.identification_result = identification_result
        # 辅助识别结果码
        self.identification_code = identification_code
        # 辅助识别信息
        self.identification_message = identification_message
        # 无法识别时提示的解决方案
        self.unable_identify_solution = unable_identify_solution

    def validate(self):
        self.validate_required(self.identification_result, 'identification_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.identification_result is not None:
            result['identification_result'] = self.identification_result
        if self.identification_code is not None:
            result['identification_code'] = self.identification_code
        if self.identification_message is not None:
            result['identification_message'] = self.identification_message
        if self.unable_identify_solution is not None:
            result['unable_identify_solution'] = self.unable_identify_solution
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identification_result') is not None:
            self.identification_result = m.get('identification_result')
        if m.get('identification_code') is not None:
            self.identification_code = m.get('identification_code')
        if m.get('identification_message') is not None:
            self.identification_message = m.get('identification_message')
        if m.get('unable_identify_solution') is not None:
            self.unable_identify_solution = m.get('unable_identify_solution')
        return self


class CollectLabelContent(TeaModel):
    def __init__(
        self,
        chain_device_id: str = None,
        content: str = None,
        signature: str = None,
        extra_data: str = None,
    ):
        # 链上设备ID
        self.chain_device_id = chain_device_id
        # 1.设备端上报数据内容
        # 2.与设备上报的数据一致，服务端不可修改
        # 3.解析后需与DataModel匹配
        # 4.映射 Label 对象结构化存储
        # 5.转为JSON后如果是JSONObject 映射单个 Label
        # 6.转为JSON后如果是JSONArray 映射多个 Label
        self.content = content
        # content的签名
        # 与设备上报的签名保持一致，服务端不可修改
        self.signature = signature
        # 未经设备签名的附加数据JSON String
        # 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
        self.extra_data = extra_data

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.content is not None:
            result['content'] = self.content
        if self.signature is not None:
            result['signature'] = self.signature
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        return self


class CollectContent(TeaModel):
    def __init__(
        self,
        chain_device_id: str = None,
        content: str = None,
        signature: str = None,
        extra_data: str = None,
        data_model_id: str = None,
    ):
        # 链上设备Id
        self.chain_device_id = chain_device_id
        # 收集的内容
        self.content = content
        # 对内容的签名
        self.signature = signature
        # 服务端发送的扩展数据（非可信设备直接产生的数据）
        self.extra_data = extra_data
        # 数据模型Id
        self.data_model_id = data_model_id

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.content is not None:
            result['content'] = self.content
        if self.signature is not None:
            result['signature'] = self.signature
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        return self


class BaiQrcodeGenerateReqData(TeaModel):
    def __init__(
        self,
        qrcode_content: str = None,
    ):
        # 二维码的码值
        self.qrcode_content = qrcode_content

    def validate(self):
        self.validate_required(self.qrcode_content, 'qrcode_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.qrcode_content is not None:
            result['qrcode_content'] = self.qrcode_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('qrcode_content') is not None:
            self.qrcode_content = m.get('qrcode_content')
        return self


class ProductKeyPageResponse(TeaModel):
    def __init__(
        self,
        page_index: int = None,
        page_size: int = None,
        total_size: int = None,
        total_pages: int = None,
        page_data: List[ProductKeyModel] = None,
    ):
        # 页数
        # 
        self.page_index = page_index
        # 页码
        # 
        self.page_size = page_size
        # 总记录数
        # 
        self.total_size = total_size
        # 总页数
        # 
        self.total_pages = total_pages
        # 数据
        self.page_data = page_data

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_size, 'total_size')
        self.validate_required(self.total_pages, 'total_pages')
        self.validate_required(self.page_data, 'page_data')
        if self.page_data:
            for k in self.page_data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_size is not None:
            result['total_size'] = self.total_size
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        result['page_data'] = []
        if self.page_data is not None:
            for k in self.page_data:
                result['page_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        self.page_data = []
        if m.get('page_data') is not None:
            for k in m.get('page_data'):
                temp_model = ProductKeyModel()
                self.page_data.append(temp_model.from_map(k))
        return self


class DataModel(TeaModel):
    def __init__(
        self,
        data_model_id: str = None,
        data_model_name: str = None,
        data_model: str = None,
        biz_type: str = None,
        customer_version: str = None,
    ):
        # 数据模型Id
        self.data_model_id = data_model_id
        # 数据模型名称
        self.data_model_name = data_model_name
        # 数据模型
        self.data_model = data_model
        # 数据模型类别
        self.biz_type = biz_type
        # 用户自定义版本
        self.customer_version = customer_version

    def validate(self):
        self.validate_required(self.data_model_id, 'data_model_id')
        self.validate_required(self.data_model, 'data_model')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        if self.data_model_name is not None:
            result['data_model_name'] = self.data_model_name
        if self.data_model is not None:
            result['data_model'] = self.data_model
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.customer_version is not None:
            result['customer_version'] = self.customer_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        if m.get('data_model_name') is not None:
            self.data_model_name = m.get('data_model_name')
        if m.get('data_model') is not None:
            self.data_model = m.get('data_model')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('customer_version') is not None:
            self.customer_version = m.get('customer_version')
        return self


class SpaceRegisterReqModel(TeaModel):
    def __init__(
        self,
        area: int = None,
        biz_type: str = None,
        elevation: int = None,
        height: int = None,
        latitude: int = None,
        longitude: int = None,
        other_info: str = None,
        parent_did: str = None,
        service_endpoint: str = None,
        status: str = None,
        type: str = None,
    ):
        # 面积 平方米单位*1e4
        self.area = area
        # 自定义业务类型，例如选择：危险品/非危险品/食品
        self.biz_type = biz_type
        # 海拔 米单位*1e2
        self.elevation = elevation
        # 高度 米单位*1e2
        self.height = height
        # 纬度 度数单位*1e9
        self.latitude = latitude
        # 经度 度数单位*1e9
        self.longitude = longitude
        # 自定义其他字段
        self.other_info = other_info
        # 父类型，在业务中自定义关联，例如仓位的父节点是仓库
        self.parent_did = parent_did
        # 可填入符合w3c did定义的服务节点
        self.service_endpoint = service_endpoint
        # 空间状态，自定义
        self.status = status
        # 空间类型，例如冷藏/冷冻/通道/平面/立体
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.area is not None:
            result['area'] = self.area
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.elevation is not None:
            result['elevation'] = self.elevation
        if self.height is not None:
            result['height'] = self.height
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.other_info is not None:
            result['other_info'] = self.other_info
        if self.parent_did is not None:
            result['parent_did'] = self.parent_did
        if self.service_endpoint is not None:
            result['service_endpoint'] = self.service_endpoint
        if self.status is not None:
            result['status'] = self.status
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('area') is not None:
            self.area = m.get('area')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('elevation') is not None:
            self.elevation = m.get('elevation')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('other_info') is not None:
            self.other_info = m.get('other_info')
        if m.get('parent_did') is not None:
            self.parent_did = m.get('parent_did')
        if m.get('service_endpoint') is not None:
            self.service_endpoint = m.get('service_endpoint')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class LabelTrace(TeaModel):
    def __init__(
        self,
        content: str = None,
        tx_hash: str = None,
        tx_time: str = None,
        error_code: str = None,
        error_msg: str = None,
        is_success: bool = None,
        version: int = None,
    ):
        # 操作内容
        self.content = content
        # 链上哈希
        self.tx_hash = tx_hash
        # 上链时间
        self.tx_time = tx_time
        # 上链失败的错误码
        self.error_code = error_code
        # 上链失败的错误信息
        self.error_msg = error_msg
        # 是否上链成功
        self.is_success = is_success
        # 标签对应资产版本号
        self.version = version

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')
        if self.tx_time is not None:
            self.validate_pattern(self.tx_time, 'tx_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content is not None:
            result['content'] = self.content
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.is_success is not None:
            result['is_success'] = self.is_success
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('is_success') is not None:
            self.is_success = m.get('is_success')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class BaiQrcodeGenerateRespData(TeaModel):
    def __init__(
        self,
        generate_result: str = None,
        generate_code: str = None,
        generate_message: str = None,
        unable_generate_solution: str = None,
    ):
        # 二维码的base64字符串
        self.generate_result = generate_result
        # 生成结果码
        self.generate_code = generate_code
        # 用于异常场景下细化错误信息
        self.generate_message = generate_message
        # 生成失败时的解决方案，用于异常场景下细化错误信息
        self.unable_generate_solution = unable_generate_solution

    def validate(self):
        self.validate_required(self.generate_result, 'generate_result')
        self.validate_required(self.generate_code, 'generate_code')
        self.validate_required(self.generate_message, 'generate_message')
        self.validate_required(self.unable_generate_solution, 'unable_generate_solution')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.generate_result is not None:
            result['generate_result'] = self.generate_result
        if self.generate_code is not None:
            result['generate_code'] = self.generate_code
        if self.generate_message is not None:
            result['generate_message'] = self.generate_message
        if self.unable_generate_solution is not None:
            result['unable_generate_solution'] = self.unable_generate_solution
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('generate_result') is not None:
            self.generate_result = m.get('generate_result')
        if m.get('generate_code') is not None:
            self.generate_code = m.get('generate_code')
        if m.get('generate_message') is not None:
            self.generate_message = m.get('generate_message')
        if m.get('unable_generate_solution') is not None:
            self.unable_generate_solution = m.get('unable_generate_solution')
        return self


class ChargeDetail(TeaModel):
    def __init__(
        self,
        detail_start_time: str = None,
        detail_end_time: str = None,
        elec_price: str = None,
        service_price: str = None,
        detail_power: str = None,
        detail_elec_money: str = None,
        detail_service_money: str = None,
    ):
        # 开始时间
        self.detail_start_time = detail_start_time
        # 结束时间
        self.detail_end_time = detail_end_time
        # 时段电价，小数点后4位
        self.elec_price = elec_price
        # 时段服务费价格，小数点后4位
        self.service_price = service_price
        # 时段充电量，单位：度，小数点后2位
        self.detail_power = detail_power
        # 时段电费，小数点后2位
        self.detail_elec_money = detail_elec_money
        # 时段服务费，小数点后2位
        self.detail_service_money = detail_service_money

    def validate(self):
        self.validate_required(self.detail_start_time, 'detail_start_time')
        if self.detail_start_time is not None:
            self.validate_pattern(self.detail_start_time, 'detail_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.detail_end_time, 'detail_end_time')
        if self.detail_end_time is not None:
            self.validate_pattern(self.detail_end_time, 'detail_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.detail_power, 'detail_power')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.detail_start_time is not None:
            result['detail_start_time'] = self.detail_start_time
        if self.detail_end_time is not None:
            result['detail_end_time'] = self.detail_end_time
        if self.elec_price is not None:
            result['elec_price'] = self.elec_price
        if self.service_price is not None:
            result['service_price'] = self.service_price
        if self.detail_power is not None:
            result['detail_power'] = self.detail_power
        if self.detail_elec_money is not None:
            result['detail_elec_money'] = self.detail_elec_money
        if self.detail_service_money is not None:
            result['detail_service_money'] = self.detail_service_money
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('detail_start_time') is not None:
            self.detail_start_time = m.get('detail_start_time')
        if m.get('detail_end_time') is not None:
            self.detail_end_time = m.get('detail_end_time')
        if m.get('elec_price') is not None:
            self.elec_price = m.get('elec_price')
        if m.get('service_price') is not None:
            self.service_price = m.get('service_price')
        if m.get('detail_power') is not None:
            self.detail_power = m.get('detail_power')
        if m.get('detail_elec_money') is not None:
            self.detail_elec_money = m.get('detail_elec_money')
        if m.get('detail_service_money') is not None:
            self.detail_service_money = m.get('detail_service_money')
        return self


class Peripheral(TeaModel):
    def __init__(
        self,
        peripheral_id: str = None,
        peripheral_data_model_id: str = None,
        scene: str = None,
        peripheral_name: str = None,
        corp_name: str = None,
        chain_peripheral_id: str = None,
        tx_hash: str = None,
        tx_time: int = None,
        device_type_code: int = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
    ):
        # 外围设备Id
        self.peripheral_id = peripheral_id
        # 数据模型id
        # 
        self.peripheral_data_model_id = peripheral_data_model_id
        # 场景码
        # 
        self.scene = scene
        # 外围设备名称
        # 
        self.peripheral_name = peripheral_name
        # 厂商名称
        # 
        self.corp_name = corp_name
        # 链上外围设备Id
        # 
        self.chain_peripheral_id = chain_peripheral_id
        # 链上哈希
        self.tx_hash = tx_hash
        # 上链时间
        self.tx_time = tx_time
        # 设备类型编码，必填，对应资管平台中的设备类型
        # 
        # 枚举值：
        # 
        # 车辆 1000
        # 车辆 四轮车 1001
        # 车辆 四轮车 纯电四轮车 1002
        # 车辆 四轮车 混动四轮车 1003
        # 车辆 四轮车 燃油四轮车 1004
        # 车辆 两轮车 1011
        # 车辆 两轮车 两轮单车 1012
        # 车辆 两轮车 两轮助力车 1013
        # 
        # 换电柜 2000
        # 换电柜 二轮车换电柜 2001
        # 
        # 电池 3000
        # 电池 磷酸铁电池 3001
        # 电池 三元锂电池 3002
        # 
        # 回收设备 4000
        # 
        # 垃圾分类回收 4001
        # 
        # 洗车机 5000
        self.device_type_code = device_type_code
        # 单价，单位分
        self.initial_price = initial_price
        # 出厂时间
        self.factory_time = factory_time
        # 投放时间
        self.release_time = release_time

    def validate(self):
        self.validate_required(self.peripheral_id, 'peripheral_id')
        self.validate_required(self.peripheral_data_model_id, 'peripheral_data_model_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.chain_peripheral_id, 'chain_peripheral_id')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.tx_time, 'tx_time')
        self.validate_required(self.device_type_code, 'device_type_code')
        self.validate_required(self.initial_price, 'initial_price')
        self.validate_required(self.factory_time, 'factory_time')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.release_time, 'release_time')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.peripheral_id is not None:
            result['peripheral_id'] = self.peripheral_id
        if self.peripheral_data_model_id is not None:
            result['peripheral_data_model_id'] = self.peripheral_data_model_id
        if self.scene is not None:
            result['scene'] = self.scene
        if self.peripheral_name is not None:
            result['peripheral_name'] = self.peripheral_name
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.chain_peripheral_id is not None:
            result['chain_peripheral_id'] = self.chain_peripheral_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
        if self.device_type_code is not None:
            result['device_type_code'] = self.device_type_code
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('peripheral_id') is not None:
            self.peripheral_id = m.get('peripheral_id')
        if m.get('peripheral_data_model_id') is not None:
            self.peripheral_data_model_id = m.get('peripheral_data_model_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('peripheral_name') is not None:
            self.peripheral_name = m.get('peripheral_name')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('chain_peripheral_id') is not None:
            self.chain_peripheral_id = m.get('chain_peripheral_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
        if m.get('device_type_code') is not None:
            self.device_type_code = m.get('device_type_code')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        return self


class UpdateDeviceSpaceReq(TeaModel):
    def __init__(
        self,
        device_did: str = None,
        update_mode: int = None,
        device_space: List[str] = None,
    ):
        # API要更新的设备DID
        self.device_did = device_did
        # 0-全部更新 (暂不支持)
        # 1-添加
        # 2-删除
        # 
        self.update_mode = update_mode
        # API要更新的设备部署库位
        self.device_space = device_space

    def validate(self):
        self.validate_required(self.device_did, 'device_did')
        self.validate_required(self.update_mode, 'update_mode')
        self.validate_required(self.device_space, 'device_space')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_did is not None:
            result['device_did'] = self.device_did
        if self.update_mode is not None:
            result['update_mode'] = self.update_mode
        if self.device_space is not None:
            result['device_space'] = self.device_space
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_did') is not None:
            self.device_did = m.get('device_did')
        if m.get('update_mode') is not None:
            self.update_mode = m.get('update_mode')
        if m.get('device_space') is not None:
            self.device_space = m.get('device_space')
        return self


class ThingsDidBaseRegisterRequest(TeaModel):
    def __init__(
        self,
        owner_tenant_did: str = None,
        user_did: List[str] = None,
        thing_type: str = None,
        thing_origin_id: str = None,
        thing_origin_name: str = None,
        thing_version: str = None,
        biz_type: str = None,
        thing_extra_params: str = None,
    ):
        # 信物链实体的所有者的分布式身份
        self.owner_tenant_did = owner_tenant_did
        # 信物链实体的使用方的分布式身份列表
        self.user_did = user_did
        # 信物链实体身份
        # DID_TYPE_DEVICE_ALIYUN: 阿里云设备
        # DID_TYPE_DEVICE_PEGASUS: 链机设备
        # DID_TYPE_DEVICE_MCU: MCU设备
        # DID_TYPE_DEVICE_INTEL: intel设备
        # DID_TYPE_DEVICE_DEVICE: 默认设备
        # ...
        # DID_TYPE_CORPORATE:  组织实体
        # DID_TYPE_WAREHOUSE：仓库实体
        # DID_TYPE_SPACE： 空间实体
        self.thing_type = thing_type
        # 原始id，租户内同一类型实体唯一
        self.thing_origin_id = thing_origin_id
        # 实体原始名称
        self.thing_origin_name = thing_origin_name
        # 实体版本
        self.thing_version = thing_version
        # 业务编码
        self.biz_type = biz_type
        # 信物链实体附加信息
        # 不同实体身份，有不同的json组织格式，参考另外技术文档
        self.thing_extra_params = thing_extra_params

    def validate(self):
        self.validate_required(self.thing_type, 'thing_type')
        self.validate_required(self.thing_origin_id, 'thing_origin_id')
        self.validate_required(self.thing_origin_name, 'thing_origin_name')
        self.validate_required(self.thing_version, 'thing_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.owner_tenant_did is not None:
            result['owner_tenant_did'] = self.owner_tenant_did
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.thing_type is not None:
            result['thing_type'] = self.thing_type
        if self.thing_origin_id is not None:
            result['thing_origin_id'] = self.thing_origin_id
        if self.thing_origin_name is not None:
            result['thing_origin_name'] = self.thing_origin_name
        if self.thing_version is not None:
            result['thing_version'] = self.thing_version
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.thing_extra_params is not None:
            result['thing_extra_params'] = self.thing_extra_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('owner_tenant_did') is not None:
            self.owner_tenant_did = m.get('owner_tenant_did')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('thing_type') is not None:
            self.thing_type = m.get('thing_type')
        if m.get('thing_origin_id') is not None:
            self.thing_origin_id = m.get('thing_origin_id')
        if m.get('thing_origin_name') is not None:
            self.thing_origin_name = m.get('thing_origin_name')
        if m.get('thing_version') is not None:
            self.thing_version = m.get('thing_version')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('thing_extra_params') is not None:
            self.thing_extra_params = m.get('thing_extra_params')
        return self


class AlertStrategyPageResponse(TeaModel):
    def __init__(
        self,
        page_index: int = None,
        page_size: int = None,
        total_size: int = None,
        total_pages: int = None,
        page_data: List[AlertStrategy] = None,
    ):
        # 页数
        # 
        self.page_index = page_index
        # 页码
        # 
        self.page_size = page_size
        # 总记录数
        # 
        self.total_size = total_size
        # 总页数
        # 
        self.total_pages = total_pages
        # 数据
        self.page_data = page_data

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_size, 'total_size')
        self.validate_required(self.total_pages, 'total_pages')
        self.validate_required(self.page_data, 'page_data')
        if self.page_data:
            for k in self.page_data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_size is not None:
            result['total_size'] = self.total_size
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        result['page_data'] = []
        if self.page_data is not None:
            for k in self.page_data:
                result['page_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        self.page_data = []
        if m.get('page_data') is not None:
            for k in m.get('page_data'):
                temp_model = AlertStrategy()
                self.page_data.append(temp_model.from_map(k))
        return self


class ScenePageResponse(TeaModel):
    def __init__(
        self,
        page_index: int = None,
        page_size: int = None,
        total_size: int = None,
        total_pages: int = None,
        page_data: List[SceneModel] = None,
    ):
        # 页数
        # 
        self.page_index = page_index
        # 页码
        # 
        self.page_size = page_size
        # 总记录数
        # 
        self.total_size = total_size
        # 总页数
        # 
        self.total_pages = total_pages
        # 数据
        self.page_data = page_data

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_size, 'total_size')
        self.validate_required(self.total_pages, 'total_pages')
        self.validate_required(self.page_data, 'page_data')
        if self.page_data:
            for k in self.page_data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_size is not None:
            result['total_size'] = self.total_size
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        result['page_data'] = []
        if self.page_data is not None:
            for k in self.page_data:
                result['page_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        self.page_data = []
        if m.get('page_data') is not None:
            for k in m.get('page_data'):
                temp_model = SceneModel()
                self.page_data.append(temp_model.from_map(k))
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
        chain_device_id: str = None,
        tx_hash: str = None,
        tx_time: int = None,
        device_type_code: int = None,
        initial_price: int = None,
        release_time: str = None,
        factory_time: str = None,
        device_status: str = None,
    ):
        # 设备实体唯一Id
        self.device_id = device_id
        # 数据模型Id
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
        # 
        # 
        self.device_iccid = device_iccid
        # 设备扩展信息
        self.extra_info = extra_info
        # 设备链上Id
        self.chain_device_id = chain_device_id
        # 上链哈希
        self.tx_hash = tx_hash
        # 上链时间
        self.tx_time = tx_time
        # 设备类型编码，必填，对应资管平台中的设备类型
        # 
        # 枚举值：
        # 
        # 车辆 1000
        # 车辆 四轮车 1001
        # 车辆 四轮车 纯电四轮车 1002
        # 车辆 四轮车 混动四轮车 1003
        # 车辆 四轮车 燃油四轮车 1004
        # 车辆 两轮车 1011
        # 车辆 两轮车 两轮单车 1012
        # 车辆 两轮车 两轮助力车 1013
        # 
        # 换电柜 2000
        # 换电柜 二轮车换电柜 2001
        # 
        # 电池 3000
        # 电池 磷酸铁电池 3001
        # 电池 三元锂电池 3002
        # 
        # 回收设备 4000
        # 
        # 垃圾分类回收 4001
        # 
        # 洗车机 5000
        self.device_type_code = device_type_code
        # 单价
        self.initial_price = initial_price
        # 投放时间
        self.release_time = release_time
        # 出厂时间
        self.factory_time = factory_time
        # 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
        self.device_status = device_status

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.device_data_model_id, 'device_data_model_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.device_imei, 'device_imei')
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.tx_time, 'tx_time')
        self.validate_required(self.device_type_code, 'device_type_code')
        self.validate_required(self.initial_price, 'initial_price')
        self.validate_required(self.release_time, 'release_time')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.factory_time, 'factory_time')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
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
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
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
        return self


class AddProductInfo(TeaModel):
    def __init__(
        self,
        product_name: str = None,
        product_code: str = None,
        remark: str = None,
    ):
        # 产品名称
        self.product_name = product_name
        # 产品code
        self.product_code = product_code
        # 产品描述
        self.remark = remark

    def validate(self):
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class DidBaseQueryResp(TeaModel):
    def __init__(
        self,
        auth_level: int = None,
        cert_public_key: str = None,
        cert_text: str = None,
        did_extension: str = None,
        did_public_key: str = None,
        did_username: str = None,
        owner_did: str = None,
        spaces_attached: List[str] = None,
        things_attached: List[str] = None,
        thing_attribute: str = None,
        thing_id: str = None,
        thing_model_id: str = None,
        thing_service_endpoint: str = None,
        thing_status: str = None,
        thing_type: int = None,
        thing_version: str = None,
        user_did_list: List[str] = None,
        did: str = None,
    ):
        # 授权水平，0-默认关联授权
        self.auth_level = auth_level
        # 证书公钥，特定实体可查询
        self.cert_public_key = cert_public_key
        # 证书文本，特定实体可以查询
        self.cert_text = cert_text
        # DID扩展，设备/企业组织/仓库/空间的解析同ThingExtraParams
        self.did_extension = did_extension
        # did公钥，特定w3c did实体可查询
        self.did_public_key = did_public_key
        # DID用户名，w3c did实体可查询
        self.did_username = did_username
        # 所有者DID
        self.owner_did = owner_did
        # 实体附属空间列表，例如仓库下属库位，设备关联库位等
        self.spaces_attached = spaces_attached
        # 实体附属实体列表，例如空间关联设备列表
        self.things_attached = things_attached
        # 实体属性，在阿里云iot设备，对应三元组
        self.thing_attribute = thing_attribute
        # 原始ID
        self.thing_id = thing_id
        # 实体物模型id
        self.thing_model_id = thing_model_id
        # 服务端点，可实现w3c service endpoint
        self.thing_service_endpoint = thing_service_endpoint
        # 设备状态需要是通过 updateStatus api更新，
        # 其他状态通过updateThingsDid api更新
        self.thing_status = thing_status
        # 实体类型，注册时候的类型
        # 0: 阿里云设备
        # 1: 链机设备
        # 2: MCU设备
        # 3: INTEL设备
        # 16384:  默认设备
        # 65536: 组织身份
        # 131072: 仓库身份
        # 196608: 空间身份
        self.thing_type = thing_type
        # 实体版本
        self.thing_version = thing_version
        # 使用者DID列表
        self.user_did_list = user_did_list
        # 查询的did
        self.did = did

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_level is not None:
            result['auth_level'] = self.auth_level
        if self.cert_public_key is not None:
            result['cert_public_key'] = self.cert_public_key
        if self.cert_text is not None:
            result['cert_text'] = self.cert_text
        if self.did_extension is not None:
            result['did_extension'] = self.did_extension
        if self.did_public_key is not None:
            result['did_public_key'] = self.did_public_key
        if self.did_username is not None:
            result['did_username'] = self.did_username
        if self.owner_did is not None:
            result['owner_did'] = self.owner_did
        if self.spaces_attached is not None:
            result['spaces_attached'] = self.spaces_attached
        if self.things_attached is not None:
            result['things_attached'] = self.things_attached
        if self.thing_attribute is not None:
            result['thing_attribute'] = self.thing_attribute
        if self.thing_id is not None:
            result['thing_id'] = self.thing_id
        if self.thing_model_id is not None:
            result['thing_model_id'] = self.thing_model_id
        if self.thing_service_endpoint is not None:
            result['thing_service_endpoint'] = self.thing_service_endpoint
        if self.thing_status is not None:
            result['thing_status'] = self.thing_status
        if self.thing_type is not None:
            result['thing_type'] = self.thing_type
        if self.thing_version is not None:
            result['thing_version'] = self.thing_version
        if self.user_did_list is not None:
            result['user_did_list'] = self.user_did_list
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_level') is not None:
            self.auth_level = m.get('auth_level')
        if m.get('cert_public_key') is not None:
            self.cert_public_key = m.get('cert_public_key')
        if m.get('cert_text') is not None:
            self.cert_text = m.get('cert_text')
        if m.get('did_extension') is not None:
            self.did_extension = m.get('did_extension')
        if m.get('did_public_key') is not None:
            self.did_public_key = m.get('did_public_key')
        if m.get('did_username') is not None:
            self.did_username = m.get('did_username')
        if m.get('owner_did') is not None:
            self.owner_did = m.get('owner_did')
        if m.get('spaces_attached') is not None:
            self.spaces_attached = m.get('spaces_attached')
        if m.get('things_attached') is not None:
            self.things_attached = m.get('things_attached')
        if m.get('thing_attribute') is not None:
            self.thing_attribute = m.get('thing_attribute')
        if m.get('thing_id') is not None:
            self.thing_id = m.get('thing_id')
        if m.get('thing_model_id') is not None:
            self.thing_model_id = m.get('thing_model_id')
        if m.get('thing_service_endpoint') is not None:
            self.thing_service_endpoint = m.get('thing_service_endpoint')
        if m.get('thing_status') is not None:
            self.thing_status = m.get('thing_status')
        if m.get('thing_type') is not None:
            self.thing_type = m.get('thing_type')
        if m.get('thing_version') is not None:
            self.thing_version = m.get('thing_version')
        if m.get('user_did_list') is not None:
            self.user_did_list = m.get('user_did_list')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class DeviceRegisterReqModel(TeaModel):
    def __init__(
        self,
        auth_level: int = None,
        device_attribute: str = None,
        device_model_id: str = None,
        other_info: str = None,
        service_endpoint: str = None,
        status: str = None,
    ):
        # 保留
        self.auth_level = auth_level
        # 设备属性字符串，
        # 阿里云设备类型，填入三元组
        self.device_attribute = device_attribute
        # 物模型ID，参考其他文档
        self.device_model_id = device_model_id
        # 可传入自定义信息
        self.other_info = other_info
        # 业务自定义，可以传入该实体的w3c服务节点
        self.service_endpoint = service_endpoint
        # 保留，默认
        # STATUS_REGISTERED(3)
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_level is not None:
            result['auth_level'] = self.auth_level
        if self.device_attribute is not None:
            result['device_attribute'] = self.device_attribute
        if self.device_model_id is not None:
            result['device_model_id'] = self.device_model_id
        if self.other_info is not None:
            result['other_info'] = self.other_info
        if self.service_endpoint is not None:
            result['service_endpoint'] = self.service_endpoint
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_level') is not None:
            self.auth_level = m.get('auth_level')
        if m.get('device_attribute') is not None:
            self.device_attribute = m.get('device_attribute')
        if m.get('device_model_id') is not None:
            self.device_model_id = m.get('device_model_id')
        if m.get('other_info') is not None:
            self.other_info = m.get('other_info')
        if m.get('service_endpoint') is not None:
            self.service_endpoint = m.get('service_endpoint')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class IotBasicUserRequest(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        cloud_user_id: str = None,
        login_name: str = None,
    ):
        # 租户ID
        self.tenant_id = tenant_id
        # 金融云用户id
        self.cloud_user_id = cloud_user_id
        # 登录名
        self.login_name = login_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.cloud_user_id is not None:
            result['cloud_user_id'] = self.cloud_user_id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('cloud_user_id') is not None:
            self.cloud_user_id = m.get('cloud_user_id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class BizContentGroup(TeaModel):
    def __init__(
        self,
        chain_device_id: str = None,
        biz_id: str = None,
        biz_type: str = None,
        content: str = None,
    ):
        # 设备链上Id，与scene参数至少有一个参数不为空
        # 
        # 
        self.chain_device_id = chain_device_id
        # 业务Id
        # 
        # 
        self.biz_id = biz_id
        # 业务类型
        # 
        # 
        self.biz_type = biz_type
        # 数据内容 JSON字符串
        # 
        # 
        self.content = content

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class ScfLeaseEqpInfoQueryRequest(TeaModel):
    def __init__(
        self,
        device_no: str = None,
        operation_date: str = None,
    ):
        # 设备识别号
        self.device_no = device_no
        # 运营日期
        self.operation_date = operation_date

    def validate(self):
        self.validate_required(self.device_no, 'device_no')
        self.validate_required(self.operation_date, 'operation_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_no is not None:
            result['device_no'] = self.device_no
        if self.operation_date is not None:
            result['operation_date'] = self.operation_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_no') is not None:
            self.device_no = m.get('device_no')
        if m.get('operation_date') is not None:
            self.operation_date = m.get('operation_date')
        return self


class CorporateReqModel(TeaModel):
    def __init__(
        self,
        address: str = None,
        business_address: str = None,
        business_scope: str = None,
        certify_date: str = None,
        licence_expire_date: str = None,
        nation: str = None,
        type: str = None,
    ):
        # 组织地址
        self.address = address
        # 运营地址
        self.business_address = business_address
        # 经营类目
        self.business_scope = business_scope
        # 注册时间，字符串类型
        self.certify_date = certify_date
        # 营业执照有效期，字符串
        self.licence_expire_date = licence_expire_date
        # 国家
        self.nation = nation
        # 组织类型
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.business_address is not None:
            result['business_address'] = self.business_address
        if self.business_scope is not None:
            result['business_scope'] = self.business_scope
        if self.certify_date is not None:
            result['certify_date'] = self.certify_date
        if self.licence_expire_date is not None:
            result['licence_expire_date'] = self.licence_expire_date
        if self.nation is not None:
            result['nation'] = self.nation
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('business_address') is not None:
            self.business_address = m.get('business_address')
        if m.get('business_scope') is not None:
            self.business_scope = m.get('business_scope')
        if m.get('certify_date') is not None:
            self.certify_date = m.get('certify_date')
        if m.get('licence_expire_date') is not None:
            self.licence_expire_date = m.get('licence_expire_date')
        if m.get('nation') is not None:
            self.nation = m.get('nation')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class DidBaseQueryReq(TeaModel):
    def __init__(
        self,
        data_filter: List[str] = None,
        on_chain: bool = None,
        things_did_list: List[str] = None,
    ):
        # * "thingId"       原始ID
        # * "certText"      证书文本
        # * "certPublicKey"证书公钥
        # * "didPublicKey" DID公钥
        # * "didExtension"  DID扩展，设备/企业组织/仓库/空间的解析同thingsExtraParams
        # * "didUsername"   DID用户名
        # * "ownerDid"      所有者DID
        # * "userDid"       使用者DID
        # * "thingType"     实体类型，设备/企业组织/仓库/空间等
        # * "thingStatus"   实体状态
        # * "thingModelId" 实体物模型类型
        # * "thingAttribute"实体属性
        # * "thingVersion"  实体版本
        # * "spacesAttached"关联空间列表
        # * "thingsAttached"关联实体列表（例：库位关联设备）
        # * "authLevel"     授权等级
        # * "thingServiceEndpoint" 服务列表
        self.data_filter = data_filter
        # 是否从链上查询，从链上查询将返回txHash值
        self.on_chain = on_chain
        # 需要查询的实体Did列表，同一次查询的Did须为相同类型
        self.things_did_list = things_did_list

    def validate(self):
        self.validate_required(self.data_filter, 'data_filter')
        self.validate_required(self.on_chain, 'on_chain')
        self.validate_required(self.things_did_list, 'things_did_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data_filter is not None:
            result['data_filter'] = self.data_filter
        if self.on_chain is not None:
            result['on_chain'] = self.on_chain
        if self.things_did_list is not None:
            result['things_did_list'] = self.things_did_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data_filter') is not None:
            self.data_filter = m.get('data_filter')
        if m.get('on_chain') is not None:
            self.on_chain = m.get('on_chain')
        if m.get('things_did_list') is not None:
            self.things_did_list = m.get('things_did_list')
        return self


class BaiGoodsComparisonResponse(TeaModel):
    def __init__(
        self,
        identification_result: str = None,
        identification_message: str = None,
        identification_code: str = None,
    ):
        # 鉴定结果（REAL：为真   FAKE：为假   UNABLE_IDENTIFY：无法鉴定）
        self.identification_result = identification_result
        # 鉴定补充信息
        self.identification_message = identification_message
        # 鉴定信息code
        self.identification_code = identification_code

    def validate(self):
        self.validate_required(self.identification_result, 'identification_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.identification_result is not None:
            result['identification_result'] = self.identification_result
        if self.identification_message is not None:
            result['identification_message'] = self.identification_message
        if self.identification_code is not None:
            result['identification_code'] = self.identification_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identification_result') is not None:
            self.identification_result = m.get('identification_result')
        if m.get('identification_message') is not None:
            self.identification_message = m.get('identification_message')
        if m.get('identification_code') is not None:
            self.identification_code = m.get('identification_code')
        return self


class CollectLabelRawContent(TeaModel):
    def __init__(
        self,
        content: str = None,
        data_model_id: str = None,
    ):
        # 1.设备端上报数据内容 2.与设备上报的数据一致，服务端不可修改 3.解析后需与DataModel匹配 4.映射 Label 对象结构化存储 5.转为JSON后如果是JSONObject 映射单个 Label 6.转为JSON后如果是JSONArray 映射多个 Label
        self.content = content
        # 数据模型ID
        self.data_model_id = data_model_id

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.data_model_id, 'data_model_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content is not None:
            result['content'] = self.content
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        return self


class PermissionedTenantPageResponse(TeaModel):
    def __init__(
        self,
        page_index: int = None,
        page_size: int = None,
        total_size: int = None,
        total_pages: int = None,
        page_data: List[PermissionedTenantModel] = None,
    ):
        # 页数
        self.page_index = page_index
        # 页码
        self.page_size = page_size
        # 总记录数
        self.total_size = total_size
        # 总页数
        self.total_pages = total_pages
        # 数据
        self.page_data = page_data

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_size, 'total_size')
        self.validate_required(self.total_pages, 'total_pages')
        self.validate_required(self.page_data, 'page_data')
        if self.page_data:
            for k in self.page_data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_size is not None:
            result['total_size'] = self.total_size
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        result['page_data'] = []
        if self.page_data is not None:
            for k in self.page_data:
                result['page_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        self.page_data = []
        if m.get('page_data') is not None:
            for k in m.get('page_data'):
                temp_model = PermissionedTenantModel()
                self.page_data.append(temp_model.from_map(k))
        return self


class DistributeDevice(TeaModel):
    def __init__(
        self,
        chain_device_id: str = None,
        device_id: str = None,
        distribute_device_id: str = None,
        scene: str = None,
        device_type: str = None,
        chain_peripheral_id: str = None,
        device_status: str = None,
    ):
        # 链上设备Id  （deviceType=DEVICE 时有值)
        self.chain_device_id = chain_device_id
        # 设备id
        self.device_id = device_id
        # 发行设备Id
        self.distribute_device_id = distribute_device_id
        # 场景码
        self.scene = scene
        # 设备类型 DEVICE : 设备 、PERIPHERAL : 外围设备
        self.device_type = device_type
        # 链上外围设备Id（deviceType=PERIPHERAL 时有值)
        self.chain_peripheral_id = chain_peripheral_id
        # 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
        self.device_status = device_status

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.distribute_device_id, 'distribute_device_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.device_type, 'device_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        if self.scene is not None:
            result['scene'] = self.scene
        if self.device_type is not None:
            result['device_type'] = self.device_type
        if self.chain_peripheral_id is not None:
            result['chain_peripheral_id'] = self.chain_peripheral_id
        if self.device_status is not None:
            result['device_status'] = self.device_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        if m.get('chain_peripheral_id') is not None:
            self.chain_peripheral_id = m.get('chain_peripheral_id')
        if m.get('device_status') is not None:
            self.device_status = m.get('device_status')
        return self


class BaiGoodsIdentificationRespData(TeaModel):
    def __init__(
        self,
        identification_result: str = None,
        grade: str = None,
        description: str = None,
        point_identification_results: List[BaiGoodsPointIdentificationResult] = None,
        appraise_message: str = None,
        out_state: str = None,
    ):
        # 鉴定结果
        # REAL：鉴定为真
        # FAKE：鉴定为假
        # UNABLE_IDENTIFY：无法鉴定
        self.identification_result = identification_result
        # 整体鉴定分数
        self.grade = grade
        # 整体鉴定报告描述
        self.description = description
        # 鉴定点鉴定结果列表
        self.point_identification_results = point_identification_results
        # 鉴定评价
        self.appraise_message = appraise_message
        # 用户自定义字符串，系统不做处理，会在响应体中带回
        self.out_state = out_state

    def validate(self):
        self.validate_required(self.identification_result, 'identification_result')
        self.validate_required(self.grade, 'grade')
        self.validate_required(self.point_identification_results, 'point_identification_results')
        if self.point_identification_results:
            for k in self.point_identification_results:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.identification_result is not None:
            result['identification_result'] = self.identification_result
        if self.grade is not None:
            result['grade'] = self.grade
        if self.description is not None:
            result['description'] = self.description
        result['point_identification_results'] = []
        if self.point_identification_results is not None:
            for k in self.point_identification_results:
                result['point_identification_results'].append(k.to_map() if k else None)
        if self.appraise_message is not None:
            result['appraise_message'] = self.appraise_message
        if self.out_state is not None:
            result['out_state'] = self.out_state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identification_result') is not None:
            self.identification_result = m.get('identification_result')
        if m.get('grade') is not None:
            self.grade = m.get('grade')
        if m.get('description') is not None:
            self.description = m.get('description')
        self.point_identification_results = []
        if m.get('point_identification_results') is not None:
            for k in m.get('point_identification_results'):
                temp_model = BaiGoodsPointIdentificationResult()
                self.point_identification_results.append(temp_model.from_map(k))
        if m.get('appraise_message') is not None:
            self.appraise_message = m.get('appraise_message')
        if m.get('out_state') is not None:
            self.out_state = m.get('out_state')
        return self


class IotBasicUserInfo(TeaModel):
    def __init__(
        self,
        tenant: str = None,
        cloud_user_id: str = None,
        login_name: str = None,
        permission_list: List[IotBasicRolePermission] = None,
    ):
        # 租户ID
        self.tenant = tenant
        # 金融云用户Id
        # 
        self.cloud_user_id = cloud_user_id
        # 金融云平台的登录名
        # 
        self.login_name = login_name
        # 权限集合
        self.permission_list = permission_list

    def validate(self):
        self.validate_required(self.tenant, 'tenant')
        self.validate_required(self.cloud_user_id, 'cloud_user_id')
        self.validate_required(self.login_name, 'login_name')
        self.validate_required(self.permission_list, 'permission_list')
        if self.permission_list:
            for k in self.permission_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.cloud_user_id is not None:
            result['cloud_user_id'] = self.cloud_user_id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        result['permission_list'] = []
        if self.permission_list is not None:
            for k in self.permission_list:
                result['permission_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('cloud_user_id') is not None:
            self.cloud_user_id = m.get('cloud_user_id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        self.permission_list = []
        if m.get('permission_list') is not None:
            for k in m.get('permission_list'):
                temp_model = IotBasicRolePermission()
                self.permission_list.append(temp_model.from_map(k))
        return self


class DistributeDataPackage(TeaModel):
    def __init__(
        self,
        data_list: List[RawData] = None,
        distribute_device_id: str = None,
        package_time: int = None,
    ):
        # 原始数据
        self.data_list = data_list
        # 发行设备Id
        self.distribute_device_id = distribute_device_id
        # 打包时间
        self.package_time = package_time

    def validate(self):
        self.validate_required(self.data_list, 'data_list')
        if self.data_list:
            for k in self.data_list:
                if k:
                    k.validate()
        self.validate_required(self.distribute_device_id, 'distribute_device_id')
        self.validate_required(self.package_time, 'package_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['data_list'] = []
        if self.data_list is not None:
            for k in self.data_list:
                result['data_list'].append(k.to_map() if k else None)
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        if self.package_time is not None:
            result['package_time'] = self.package_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.data_list = []
        if m.get('data_list') is not None:
            for k in m.get('data_list'):
                temp_model = RawData()
                self.data_list.append(temp_model.from_map(k))
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        if m.get('package_time') is not None:
            self.package_time = m.get('package_time')
        return self


class DeviceOverViewResponse(TeaModel):
    def __init__(
        self,
        device_category_name: str = None,
        device_total: int = None,
    ):
        # 设备品类名称
        self.device_category_name = device_category_name
        # 设备总数
        self.device_total = device_total

    def validate(self):
        self.validate_required(self.device_category_name, 'device_category_name')
        self.validate_required(self.device_total, 'device_total')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_category_name is not None:
            result['device_category_name'] = self.device_category_name
        if self.device_total is not None:
            result['device_total'] = self.device_total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_category_name') is not None:
            self.device_category_name = m.get('device_category_name')
        if m.get('device_total') is not None:
            self.device_total = m.get('device_total')
        return self


class PhoneInfo(TeaModel):
    def __init__(
        self,
        colour: str = None,
        colour_number: str = None,
        memory: str = None,
    ):
        # 颜色
        self.colour = colour
        # 色值
        self.colour_number = colour_number
        # 内存大小
        self.memory = memory

    def validate(self):
        self.validate_required(self.colour, 'colour')
        self.validate_required(self.colour_number, 'colour_number')
        self.validate_required(self.memory, 'memory')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.colour is not None:
            result['colour'] = self.colour
        if self.colour_number is not None:
            result['colour_number'] = self.colour_number
        if self.memory is not None:
            result['memory'] = self.memory
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('colour') is not None:
            self.colour = m.get('colour')
        if m.get('colour_number') is not None:
            self.colour_number = m.get('colour_number')
        if m.get('memory') is not None:
            self.memory = m.get('memory')
        return self


class IotBasicDeviceSpecs(TeaModel):
    def __init__(
        self,
        corp_value: str = None,
        corp_name: str = None,
        model_name: str = None,
        model_value: str = None,
        category_name: str = None,
        category_code: str = None,
        specs_id: int = None,
        specs_name: str = None,
        specs_value: str = None,
        specs_param: str = None,
    ):
        # 厂商编码
        self.corp_value = corp_value
        # 厂商名称
        self.corp_name = corp_name
        # 型号名称
        self.model_name = model_name
        # 型号编码
        self.model_value = model_value
        # 防疫机
        self.category_name = category_name
        # 设备品类编码
        self.category_code = category_code
        # 规格ID
        self.specs_id = specs_id
        # 规格名称
        self.specs_name = specs_name
        # 规格编码
        self.specs_value = specs_value
        # 规格参数
        self.specs_param = specs_param

    def validate(self):
        self.validate_required(self.corp_value, 'corp_value')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.model_name, 'model_name')
        self.validate_required(self.model_value, 'model_value')
        self.validate_required(self.category_name, 'category_name')
        self.validate_required(self.category_code, 'category_code')
        self.validate_required(self.specs_id, 'specs_id')
        self.validate_required(self.specs_name, 'specs_name')
        self.validate_required(self.specs_value, 'specs_value')
        self.validate_required(self.specs_param, 'specs_param')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.corp_value is not None:
            result['corp_value'] = self.corp_value
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.model_value is not None:
            result['model_value'] = self.model_value
        if self.category_name is not None:
            result['category_name'] = self.category_name
        if self.category_code is not None:
            result['category_code'] = self.category_code
        if self.specs_id is not None:
            result['specs_id'] = self.specs_id
        if self.specs_name is not None:
            result['specs_name'] = self.specs_name
        if self.specs_value is not None:
            result['specs_value'] = self.specs_value
        if self.specs_param is not None:
            result['specs_param'] = self.specs_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('corp_value') is not None:
            self.corp_value = m.get('corp_value')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('model_value') is not None:
            self.model_value = m.get('model_value')
        if m.get('category_name') is not None:
            self.category_name = m.get('category_name')
        if m.get('category_code') is not None:
            self.category_code = m.get('category_code')
        if m.get('specs_id') is not None:
            self.specs_id = m.get('specs_id')
        if m.get('specs_name') is not None:
            self.specs_name = m.get('specs_name')
        if m.get('specs_value') is not None:
            self.specs_value = m.get('specs_value')
        if m.get('specs_param') is not None:
            self.specs_param = m.get('specs_param')
        return self


class DidUpdateTenantReq(TeaModel):
    def __init__(
        self,
        thing_did: str = None,
        tenant_list: List[str] = None,
        tenant_role: str = None,
        op_mode: str = None,
    ):
        # 待更新实体身份did
        self.thing_did = thing_did
        # 待更新访问者列表
        self.tenant_list = tenant_list
        # 权限角色
        # TENANT_ROLE_OWNER
        # TENANT_ROLE_USER
        # TENANT_ROLE_OBSERVER
        self.tenant_role = tenant_role
        # 增加权限：THINGS_OP_MODE_ADD
        # 删除权限：THINGS_OP_MODE_REMOVE
        self.op_mode = op_mode

    def validate(self):
        self.validate_required(self.thing_did, 'thing_did')
        self.validate_required(self.tenant_list, 'tenant_list')
        self.validate_required(self.tenant_role, 'tenant_role')
        self.validate_required(self.op_mode, 'op_mode')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.thing_did is not None:
            result['thing_did'] = self.thing_did
        if self.tenant_list is not None:
            result['tenant_list'] = self.tenant_list
        if self.tenant_role is not None:
            result['tenant_role'] = self.tenant_role
        if self.op_mode is not None:
            result['op_mode'] = self.op_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('thing_did') is not None:
            self.thing_did = m.get('thing_did')
        if m.get('tenant_list') is not None:
            self.tenant_list = m.get('tenant_list')
        if m.get('tenant_role') is not None:
            self.tenant_role = m.get('tenant_role')
        if m.get('op_mode') is not None:
            self.op_mode = m.get('op_mode')
        return self


class BaiOcrResponse(TeaModel):
    def __init__(
        self,
        data: str = None,
    ):
        # 返回的结果体
        self.data = data

    def validate(self):
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data') is not None:
            self.data = m.get('data')
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


class OpenAcecContractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        product_code: str = None,
        tenant_id: str = None,
        instance_id: str = None,
        access_code: str = None,
        custom_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 产品码，全局唯一
        self.product_code = product_code
        # 开通产品的租户ID
        self.tenant_id = tenant_id
        # 实例Id
        self.instance_id = instance_id
        # 服务接入码
        self.access_code = access_code
        # 用户自定义数据
        self.custom_data = custom_data

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.access_code, 'access_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.access_code is not None:
            result['access_code'] = self.access_code
        if self.custom_data is not None:
            result['custom_data'] = self.custom_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        if m.get('custom_data') is not None:
            self.custom_data = m.get('custom_data')
        return self


class OpenAcecContractResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回字段
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class StopAcecContractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        product_code: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 产品码，全局唯一
        self.product_code = product_code
        # 产品实例Id
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class StopAcecContractResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回字段
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class ResumeAcecContractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        access_code: str = None,
        instance_id: str = None,
        order_no: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 服务接入码
        self.access_code = access_code
        # 实例Id
        self.instance_id = instance_id
        # 订单号
        self.order_no = order_no
        # 产品码，全局唯一
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.access_code, 'access_code')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.access_code is not None:
            result['access_code'] = self.access_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class ResumeAcecContractResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回字段
        # 
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CreateLeaseRealpersonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        identity_type: str = None,
        cert_type: str = None,
        cert_name: str = None,
        cert_no: str = None,
        outer_order_no: str = None,
        return_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 身份信息来源类型，当前仅支持证件（CERT_INFO）
        self.identity_type = identity_type
        # 证件类型，当前仅支持身份证（IDENTITY_CARD）
        self.cert_type = cert_type
        # 真实姓名
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 商户请求的唯一标识。
        # 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID
        self.outer_order_no = outer_order_no
        # 认证结束回跳地址
        self.return_url = return_url

    def validate(self):
        self.validate_required(self.identity_type, 'identity_type')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.return_url, 'return_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.identity_type is not None:
            result['identity_type'] = self.identity_type
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.return_url is not None:
            result['return_url'] = self.return_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('identity_type') is not None:
            self.identity_type = m.get('identity_type')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        return self


class CreateLeaseRealpersonResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回字段，JSON格式
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryLeaseRealpersonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certify_id: str = None,
        outer_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 实人认证的唯一标识
        self.certify_id = certify_id
        # 商户请求的唯一标识。 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID
        self.outer_order_no = outer_order_no

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')
        self.validate_required(self.outer_order_no, 'outer_order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        return self


class QueryLeaseRealpersonResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回字段，JSON格式
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryLeaseRiskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        user_name: str = None,
        cert_no: str = None,
        mobile: str = None,
        ip: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部系统的用户唯一ID
        self.user_id = user_id
        # 用户姓名
        self.user_name = user_name
        # 用户身份证号码
        self.cert_no = cert_no
        # 用户手机号码
        self.mobile = mobile
        # 用户IP地址
        self.ip = ip

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.ip, 'ip')

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
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.ip is not None:
            result['ip'] = self.ip
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        return self


class QueryLeaseRiskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回字段，JSON格式
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryBaiOcrRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_key: str = None,
        ocr_type: str = None,
        source_type: str = None,
        source_base_64: str = None,
        source_config_side: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用业务方身份标识，指明调用来源
        self.app_key = app_key
        # OCR服务的业务类型，目前支持：
        # businessLicense，营业执照识别
        # idCard，身份证识别
        # bankCard，银行卡识别
        # VATInvoice，增值税发票识别
        self.ocr_type = ocr_type
        # 请求的资源类型，目前支持：
        # image，图片
        # pdf，PDF复印件
        self.source_type = source_type
        # 图片或PDF等内容的base64内容字符串
        self.source_base_64 = source_base_64
        # 资源的附加属性
        # 如针对身份证识别，需要指定face(人像面)或back(国徽面)
        self.source_config_side = source_config_side

    def validate(self):
        self.validate_required(self.app_key, 'app_key')
        self.validate_required(self.ocr_type, 'ocr_type')
        self.validate_required(self.source_type, 'source_type')
        self.validate_required(self.source_base_64, 'source_base_64')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_key is not None:
            result['app_key'] = self.app_key
        if self.ocr_type is not None:
            result['ocr_type'] = self.ocr_type
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.source_base_64 is not None:
            result['source_base64'] = self.source_base_64
        if self.source_config_side is not None:
            result['source_config_side'] = self.source_config_side
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_key') is not None:
            self.app_key = m.get('app_key')
        if m.get('ocr_type') is not None:
            self.ocr_type = m.get('ocr_type')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('source_base64') is not None:
            self.source_base_64 = m.get('source_base64')
        if m.get('source_config_side') is not None:
            self.source_config_side = m.get('source_config_side')
        return self


class QueryBaiOcrResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果体，JSON字符串
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryAiidentificationQrcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_key: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户身份标识
        self.app_key = app_key
        # BaiQrcodeComparisonReqData转为JSONString后再getBytes
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.app_key, 'app_key')
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
        if self.app_key is not None:
            result['app_key'] = self.app_key
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
        if m.get('app_key') is not None:
            self.app_key = m.get('app_key')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class QueryAiidentificationQrcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BaiQrcodeComparisonRespData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
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
        if m.get('data') is not None:
            temp_model = BaiQrcodeComparisonRespData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryAiidentificationGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_key: str = None,
        goods_info: BaiGoodsComparisonReqData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户身份标识
        self.app_key = app_key
        # 鉴定商品信息
        self.goods_info = goods_info

    def validate(self):
        self.validate_required(self.app_key, 'app_key')
        self.validate_required(self.goods_info, 'goods_info')
        if self.goods_info:
            self.goods_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_key is not None:
            result['app_key'] = self.app_key
        if self.goods_info is not None:
            result['goods_info'] = self.goods_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_key') is not None:
            self.app_key = m.get('app_key')
        if m.get('goods_info') is not None:
            temp_model = BaiGoodsComparisonReqData()
            self.goods_info = temp_model.from_map(m['goods_info'])
        return self


class QueryAiidentificationGoodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BaiGoodsIdentificationRespData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
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
        if m.get('data') is not None:
            temp_model = BaiGoodsIdentificationRespData()
            self.data = temp_model.from_map(m['data'])
        return self


class CheckAiidentificationGoodspointRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_key: str = None,
        category: str = None,
        brand: str = None,
        style: str = None,
        point_info: BaiGoodsPoint = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户调用标识
        self.app_key = app_key
        # 品类
        self.category = category
        # 品牌
        self.brand = brand
        # 款式
        self.style = style
        # 鉴定点信息
        self.point_info = point_info

    def validate(self):
        self.validate_required(self.app_key, 'app_key')
        self.validate_required(self.category, 'category')
        self.validate_required(self.brand, 'brand')
        self.validate_required(self.style, 'style')
        self.validate_required(self.point_info, 'point_info')
        if self.point_info:
            self.point_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_key is not None:
            result['app_key'] = self.app_key
        if self.category is not None:
            result['category'] = self.category
        if self.brand is not None:
            result['brand'] = self.brand
        if self.style is not None:
            result['style'] = self.style
        if self.point_info is not None:
            result['point_info'] = self.point_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_key') is not None:
            self.app_key = m.get('app_key')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('brand') is not None:
            self.brand = m.get('brand')
        if m.get('style') is not None:
            self.style = m.get('style')
        if m.get('point_info') is not None:
            temp_model = BaiGoodsPoint()
            self.point_info = temp_model.from_map(m['point_info'])
        return self


class CheckAiidentificationGoodspointResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BaiGoodsPointCheckRespData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品鉴定点检测响应数据
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
        if m.get('data') is not None:
            temp_model = BaiGoodsPointCheckRespData()
            self.data = temp_model.from_map(m['data'])
        return self


class CheckAiidentificationQrcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_key: str = None,
        data: BaiQrcodeComparisonReqData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户标识
        self.app_key = app_key
        # 请求data
        self.data = data

    def validate(self):
        self.validate_required(self.app_key, 'app_key')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_key is not None:
            result['app_key'] = self.app_key
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_key') is not None:
            self.app_key = m.get('app_key')
        if m.get('data') is not None:
            temp_model = BaiQrcodeComparisonReqData()
            self.data = temp_model.from_map(m['data'])
        return self


class CheckAiidentificationQrcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BaiQrcodeComparisonRespData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
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
        if m.get('data') is not None:
            temp_model = BaiQrcodeComparisonRespData()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateAiidentificationQrcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_key: str = None,
        data: BaiQrcodeGenerateReqData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户身份标识
        self.app_key = app_key
        # 二维码生成请求的请求数据
        self.data = data

    def validate(self):
        self.validate_required(self.app_key, 'app_key')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_key is not None:
            result['app_key'] = self.app_key
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_key') is not None:
            self.app_key = m.get('app_key')
        if m.get('data') is not None:
            temp_model = BaiQrcodeGenerateReqData()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateAiidentificationQrcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BaiQrcodeGenerateRespData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
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
        if m.get('data') is not None:
            temp_model = BaiQrcodeGenerateRespData()
            self.data = temp_model.from_map(m['data'])
        return self


class VerifyAiidentificationQrcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_key: str = None,
        data: BaiQrcodeVerifyReqData = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户身份标识
        self.app_key = app_key
        # 溯源防伪码质检请求数据
        self.data = data

    def validate(self):
        self.validate_required(self.app_key, 'app_key')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_key is not None:
            result['app_key'] = self.app_key
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_key') is not None:
            self.app_key = m.get('app_key')
        if m.get('data') is not None:
            temp_model = BaiQrcodeVerifyReqData()
            self.data = temp_model.from_map(m['data'])
        return self


class VerifyAiidentificationQrcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BaiQrcodeVerifyRespData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 溯源防伪码质检响应结果
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
        if m.get('data') is not None:
            temp_model = BaiQrcodeVerifyRespData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryAiidentificationGoodspointRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_key: str = None,
        category: str = None,
        brand: str = None,
        style: str = None,
        point_info: BaiGoodsPoint = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户调用标识
        self.app_key = app_key
        # 品类
        self.category = category
        # 品牌
        self.brand = brand
        # 款式
        self.style = style
        # 鉴定点信息
        self.point_info = point_info

    def validate(self):
        self.validate_required(self.app_key, 'app_key')
        self.validate_required(self.category, 'category')
        self.validate_required(self.brand, 'brand')
        self.validate_required(self.style, 'style')
        self.validate_required(self.point_info, 'point_info')
        if self.point_info:
            self.point_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_key is not None:
            result['app_key'] = self.app_key
        if self.category is not None:
            result['category'] = self.category
        if self.brand is not None:
            result['brand'] = self.brand
        if self.style is not None:
            result['style'] = self.style
        if self.point_info is not None:
            result['point_info'] = self.point_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_key') is not None:
            self.app_key = m.get('app_key')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('brand') is not None:
            self.brand = m.get('brand')
        if m.get('style') is not None:
            self.style = m.get('style')
        if m.get('point_info') is not None:
            temp_model = BaiGoodsPoint()
            self.point_info = temp_model.from_map(m['point_info'])
        return self


class QueryAiidentificationGoodspointResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BaiGoodsPointQueryRespData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品鉴定点鉴定响应体
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
        if m.get('data') is not None:
            temp_model = BaiGoodsPointQueryRespData()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateAcsDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        scene: str = None,
        class_code: str = None,
        content: str = None,
        signature: str = None,
        device_name: str = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备ID
        self.device_id = device_id
        # 场景码-对应acs iot管控后台项目code
        self.scene = scene
        # 设备类型编码-对应acs iot管控后台设备类型编码
        self.class_code = class_code
        # 设备注册信息
        self.content = content
        # 设备注册信息 签名
        self.signature = signature
        # 设备名称
        self.device_name = device_name
        # 设备单价 单位：分
        self.initial_price = initial_price
        # 设备出厂时间
        self.factory_time = factory_time
        # 设备投放时间
        self.release_time = release_time

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.class_code, 'class_code')
        self.validate_required(self.content, 'content')
        self.validate_required(self.signature, 'signature')
        self.validate_required(self.device_name, 'device_name')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.scene is not None:
            result['scene'] = self.scene
        if self.class_code is not None:
            result['class_code'] = self.class_code
        if self.content is not None:
            result['content'] = self.content
        if self.signature is not None:
            result['signature'] = self.signature
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('class_code') is not None:
            self.class_code = m.get('class_code')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        return self


class CreateAcsDeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chain_deviceid: str = None,
        distribute_device_id: str = None,
        active_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链上设备Id
        self.chain_deviceid = chain_deviceid
        # 发行设备ID
        self.distribute_device_id = distribute_device_id
        # 设备激活文本-设备直连上链方式使用
        self.active_data = active_data

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
        if self.chain_deviceid is not None:
            result['chain_deviceid'] = self.chain_deviceid
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        if self.active_data is not None:
            result['active_data'] = self.active_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chain_deviceid') is not None:
            self.chain_deviceid = m.get('chain_deviceid')
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        if m.get('active_data') is not None:
            self.active_data = m.get('active_data')
        return self


class SendAcsCollectorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
        collect_content_list: List[CollectContent] = None,
        nonce: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链上设备Id
        # 
        self.chain_device_id = chain_device_id
        # 收集内容
        self.collect_content_list = collect_content_list
        # 随机数，防重放
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.collect_content_list, 'collect_content_list')
        if self.collect_content_list:
            for k in self.collect_content_list:
                if k:
                    k.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        result['collect_content_list'] = []
        if self.collect_content_list is not None:
            for k in self.collect_content_list:
                result['collect_content_list'].append(k.to_map() if k else None)
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        self.collect_content_list = []
        if m.get('collect_content_list') is not None:
            for k in m.get('collect_content_list'):
                temp_model = CollectContent()
                self.collect_content_list.append(temp_model.from_map(k))
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class SendAcsCollectorResponse(TeaModel):
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
        # 收集数据返回的上链结果
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


class QueryIotbasicDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        user_id: str = None,
        device_sn: str = None,
        category_code: str = None,
        device_model: str = None,
        corp_name: str = None,
        location: str = None,
        device_status: str = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户ID
        self.tenant_id = tenant_id
        # 当前登录用户ID
        self.user_id = user_id
        # 设备SN
        self.device_sn = device_sn
        # 设备品类code
        self.category_code = category_code
        # 设备型号
        self.device_model = device_model
        # 厂商名称
        self.corp_name = corp_name
        # 安装位置
        self.location = location
        # 设备状态，在线/离线、故障
        self.device_status = device_status
        # 指定显示返回结果中的第几页。
        # 
        self.current_page = current_page
        # 指定返回结果中每页显示的产品数量，最大值是200。
        # 
        # 
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.current_page, 'current_page')
        if self.current_page is not None:
            self.validate_minimum(self.current_page, 'current_page', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 200)
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.category_code is not None:
            result['category_code'] = self.category_code
        if self.device_model is not None:
            result['device_model'] = self.device_model
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.location is not None:
            result['location'] = self.location
        if self.device_status is not None:
            result['device_status'] = self.device_status
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('category_code') is not None:
            self.category_code = m.get('category_code')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('device_status') is not None:
            self.device_status = m.get('device_status')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryIotbasicDeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        page_count: int = None,
        page_size: int = None,
        total: int = None,
        device_list: List[IotBasicDeviceQueryResponse] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页号。
        # 
        # 
        self.current_page = current_page
        # 总页数
        self.page_count = page_count
        # 每页显示条数
        self.page_size = page_size
        # 总记录数
        self.total = total
        # 设备列表
        self.device_list = device_list

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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_count is not None:
            result['page_count'] = self.page_count
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        result['device_list'] = []
        if self.device_list is not None:
            for k in self.device_list:
                result['device_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_count') is not None:
            self.page_count = m.get('page_count')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.device_list = []
        if m.get('device_list') is not None:
            for k in m.get('device_list'):
                temp_model = IotBasicDeviceQueryResponse()
                self.device_list.append(temp_model.from_map(k))
        return self


class RecognizeIotbasicCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户ID
        self.tenant_id = tenant_id
        # 用户ID或操作员ID
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class RecognizeIotbasicCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        authorized: bool = None,
        device_list: List[DeviceOverViewResponse] = None,
        iot_role: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否授权开通IoT产品
        self.authorized = authorized
        # 设备数量列表
        self.device_list = device_list
        # 角色
        self.iot_role = iot_role

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
        if self.authorized is not None:
            result['authorized'] = self.authorized
        result['device_list'] = []
        if self.device_list is not None:
            for k in self.device_list:
                result['device_list'].append(k.to_map() if k else None)
        if self.iot_role is not None:
            result['iot_role'] = self.iot_role
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('authorized') is not None:
            self.authorized = m.get('authorized')
        self.device_list = []
        if m.get('device_list') is not None:
            for k in m.get('device_list'):
                temp_model = DeviceOverViewResponse()
                self.device_list.append(temp_model.from_map(k))
        if m.get('iot_role') is not None:
            self.iot_role = m.get('iot_role')
        return self


class CertifyIotbasicDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_sn: str = None,
        corp_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备序列号
        self.device_sn = device_sn
        # 设备厂商
        self.corp_name = corp_name

    def validate(self):
        self.validate_required(self.device_sn, 'device_sn')
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
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        return self


class CertifyIotbasicDeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        device_name: str = None,
        device_model: str = None,
        device_status: str = None,
        register_time: str = None,
        customer_name: str = None,
        tenant_id: str = None,
        app_version: str = None,
        service_status: str = None,
        account_id: str = None,
        account_name: str = None,
        user_role: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 设备名称
        self.device_name = device_name
        # 设备型号
        self.device_model = device_model
        # 设备状态
        self.device_status = device_status
        # 注册时间
        self.register_time = register_time
        # 客户名称
        self.customer_name = customer_name
        # 客户对应租户ID
        self.tenant_id = tenant_id
        # 客户端版本
        self.app_version = app_version
        # 服务状态
        self.service_status = service_status
        # 子账号ID
        self.account_id = account_id
        # 所属账号名称
        self.account_name = account_name
        # 子账号角色
        self.user_role = user_role

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
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.device_model is not None:
            result['device_model'] = self.device_model
        if self.device_status is not None:
            result['device_status'] = self.device_status
        if self.register_time is not None:
            result['register_time'] = self.register_time
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.app_version is not None:
            result['app_version'] = self.app_version
        if self.service_status is not None:
            result['service_status'] = self.service_status
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.user_role is not None:
            result['user_role'] = self.user_role
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        if m.get('device_status') is not None:
            self.device_status = m.get('device_status')
        if m.get('register_time') is not None:
            self.register_time = m.get('register_time')
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('app_version') is not None:
            self.app_version = m.get('app_version')
        if m.get('service_status') is not None:
            self.service_status = m.get('service_status')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('user_role') is not None:
            self.user_role = m.get('user_role')
        return self


class OperateIotbasicUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_list: List[IotBasicUserRequest] = None,
        iot_role: str = None,
        action: str = None,
        operator_id: str = None,
        param_sign: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 操作用户集合
        self.user_list = user_list
        # 要开通的角色
        self.iot_role = iot_role
        # 操作类型
        self.action = action
        # 操作人
        self.operator_id = operator_id
        # 参数签名校验
        self.param_sign = param_sign

    def validate(self):
        self.validate_required(self.user_list, 'user_list')
        if self.user_list:
            for k in self.user_list:
                if k:
                    k.validate()
        self.validate_required(self.action, 'action')
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['user_list'] = []
        if self.user_list is not None:
            for k in self.user_list:
                result['user_list'].append(k.to_map() if k else None)
        if self.iot_role is not None:
            result['iot_role'] = self.iot_role
        if self.action is not None:
            result['action'] = self.action
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.param_sign is not None:
            result['param_sign'] = self.param_sign
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.user_list = []
        if m.get('user_list') is not None:
            for k in m.get('user_list'):
                temp_model = IotBasicUserRequest()
                self.user_list.append(temp_model.from_map(k))
        if m.get('iot_role') is not None:
            self.iot_role = m.get('iot_role')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('param_sign') is not None:
            self.param_sign = m.get('param_sign')
        return self


class OperateIotbasicUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        fail_list: List[IotBasicUserRequest] = None,
        query_list: List[IotBasicUserInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作结果
        self.success = success
        # 操作失败集合
        self.fail_list = fail_list
        # 用户信息
        self.query_list = query_list

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k:
                    k.validate()
        if self.query_list:
            for k in self.query_list:
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
        if self.success is not None:
            result['success'] = self.success
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        result['query_list'] = []
        if self.query_list is not None:
            for k in self.query_list:
                result['query_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        self.fail_list = []
        if m.get('fail_list') is not None:
            for k in m.get('fail_list'):
                temp_model = IotBasicUserRequest()
                self.fail_list.append(temp_model.from_map(k))
        self.query_list = []
        if m.get('query_list') is not None:
            for k in m.get('query_list'):
                temp_model = IotBasicUserInfo()
                self.query_list.append(temp_model.from_map(k))
        return self


class OperateIotbasicPermissionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        operator_id: str = None,
        iot_role: str = None,
        permission_list: List[IotBasicPermissionData] = None,
        action: str = None,
        bind_permision: List[str] = None,
        param_sign: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 操作人
        # 
        self.operator_id = operator_id
        # 角色
        self.iot_role = iot_role
        # 待添加的权限集合
        self.permission_list = permission_list
        # 操作类型
        self.action = action
        # 绑定权限集合
        self.bind_permision = bind_permision
        # 参数签名校验
        self.param_sign = param_sign

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')
        if self.permission_list:
            for k in self.permission_list:
                if k:
                    k.validate()
        self.validate_required(self.action, 'action')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.iot_role is not None:
            result['iot_role'] = self.iot_role
        result['permission_list'] = []
        if self.permission_list is not None:
            for k in self.permission_list:
                result['permission_list'].append(k.to_map() if k else None)
        if self.action is not None:
            result['action'] = self.action
        if self.bind_permision is not None:
            result['bind_permision'] = self.bind_permision
        if self.param_sign is not None:
            result['param_sign'] = self.param_sign
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('iot_role') is not None:
            self.iot_role = m.get('iot_role')
        self.permission_list = []
        if m.get('permission_list') is not None:
            for k in m.get('permission_list'):
                temp_model = IotBasicPermissionData()
                self.permission_list.append(temp_model.from_map(k))
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('bind_permision') is not None:
            self.bind_permision = m.get('bind_permision')
        if m.get('param_sign') is not None:
            self.param_sign = m.get('param_sign')
        return self


class OperateIotbasicPermissionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        role_list: List[IotBasicRolePermission] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作结果
        self.success = success
        # 权限列表
        self.role_list = role_list

    def validate(self):
        if self.role_list:
            for k in self.role_list:
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
        if self.success is not None:
            result['success'] = self.success
        result['role_list'] = []
        if self.role_list is not None:
            for k in self.role_list:
                result['role_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        self.role_list = []
        if m.get('role_list') is not None:
            for k in m.get('role_list'):
                temp_model = IotBasicRolePermission()
                self.role_list.append(temp_model.from_map(k))
        return self


class QueryIotbasicSnRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        user_id: str = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户ID
        self.tenant_id = tenant_id
        # 当前登录用户ID
        # 
        self.user_id = user_id
        # 指定显示返回结果中的第几页。
        # 
        self.current_page = current_page
        # 指定返回结果中每页显示的产品数量，最大值是300。
        # 
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.current_page, 'current_page')
        if self.current_page is not None:
            self.validate_minimum(self.current_page, 'current_page', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 300)
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryIotbasicSnResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        page_count: int = None,
        page_size: int = None,
        total: int = None,
        sn_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页号。
        # 
        self.current_page = current_page
        # 总页数
        # 
        self.page_count = page_count
        # 每页显示条数
        # 
        self.page_size = page_size
        # 总记录数
        # 
        self.total = total
        # sn集合
        self.sn_list = sn_list

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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_count is not None:
            result['page_count'] = self.page_count
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        if self.sn_list is not None:
            result['sn_list'] = self.sn_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_count') is not None:
            self.page_count = m.get('page_count')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('sn_list') is not None:
            self.sn_list = m.get('sn_list')
        return self


class QueryDeviceSpecsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_sn: str = None,
        corp_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备SN
        self.device_sn = device_sn
        # 厂商编码
        self.corp_name = corp_name

    def validate(self):
        self.validate_required(self.device_sn, 'device_sn')
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
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        return self


class QueryDeviceSpecsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        device_specs: IotBasicDeviceSpecs = None,
        hardware_module_list: List[IotBasicDeviceHardWareModule] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 设备规格描述
        self.device_specs = device_specs
        # 硬件模块集合
        self.hardware_module_list = hardware_module_list

    def validate(self):
        if self.device_specs:
            self.device_specs.validate()
        if self.hardware_module_list:
            for k in self.hardware_module_list:
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
        if self.device_specs is not None:
            result['device_specs'] = self.device_specs.to_map()
        result['hardware_module_list'] = []
        if self.hardware_module_list is not None:
            for k in self.hardware_module_list:
                result['hardware_module_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('device_specs') is not None:
            temp_model = IotBasicDeviceSpecs()
            self.device_specs = temp_model.from_map(m['device_specs'])
        self.hardware_module_list = []
        if m.get('hardware_module_list') is not None:
            for k in m.get('hardware_module_list'):
                temp_model = IotBasicDeviceHardWareModule()
                self.hardware_module_list.append(temp_model.from_map(k))
        return self


class OperateIotbasicRelrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        device_category: str = None,
        relation_type: str = None,
        corp_name: str = None,
        device_model: str = None,
        device_specs: str = None,
        hardware_module: str = None,
        operate: str = None,
        param_sign: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备属性关系id
        self.id = id
        # 设备品类名称
        self.device_category = device_category
        # 数据关系类型
        self.relation_type = relation_type
        # 厂商名称
        self.corp_name = corp_name
        # TPS980	设备型号
        self.device_model = device_model
        # 设备规格
        self.device_specs = device_specs
        # 硬件模块
        self.hardware_module = hardware_module
        # ADD,EDIT,DELETE，QUERY；选择操作
        self.operate = operate
        # 参数签名校验
        self.param_sign = param_sign

    def validate(self):
        self.validate_required(self.device_category, 'device_category')
        self.validate_required(self.relation_type, 'relation_type')
        self.validate_required(self.operate, 'operate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.device_category is not None:
            result['device_category'] = self.device_category
        if self.relation_type is not None:
            result['relation_type'] = self.relation_type
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.device_model is not None:
            result['device_model'] = self.device_model
        if self.device_specs is not None:
            result['device_specs'] = self.device_specs
        if self.hardware_module is not None:
            result['hardware_module'] = self.hardware_module
        if self.operate is not None:
            result['operate'] = self.operate
        if self.param_sign is not None:
            result['param_sign'] = self.param_sign
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('device_category') is not None:
            self.device_category = m.get('device_category')
        if m.get('relation_type') is not None:
            self.relation_type = m.get('relation_type')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        if m.get('device_specs') is not None:
            self.device_specs = m.get('device_specs')
        if m.get('hardware_module') is not None:
            self.hardware_module = m.get('hardware_module')
        if m.get('operate') is not None:
            self.operate = m.get('operate')
        if m.get('param_sign') is not None:
            self.param_sign = m.get('param_sign')
        return self


class OperateIotbasicRelrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        iot_device_attribute_relationship_data: IotDeviceAttributeRelationshipData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作结果
        self.success = success
        # 设备属性关系数据
        self.iot_device_attribute_relationship_data = iot_device_attribute_relationship_data

    def validate(self):
        if self.iot_device_attribute_relationship_data:
            self.iot_device_attribute_relationship_data.validate()

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
        if self.success is not None:
            result['success'] = self.success
        if self.iot_device_attribute_relationship_data is not None:
            result['iot_device_attribute_relationship_data'] = self.iot_device_attribute_relationship_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('iot_device_attribute_relationship_data') is not None:
            temp_model = IotDeviceAttributeRelationshipData()
            self.iot_device_attribute_relationship_data = temp_model.from_map(m['iot_device_attribute_relationship_data'])
        return self


class OperateIotbasicDictionaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        device_category: str = None,
        dictionary_type: str = None,
        dictionary_name: str = None,
        dictionary_value: str = None,
        dictionary_param: str = None,
        action: str = None,
        param_sign: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # id
        self.id = id
        # 设备品类编码
        self.device_category = device_category
        # 字典数据类型
        self.dictionary_type = dictionary_type
        # 字典数据名称
        self.dictionary_name = dictionary_name
        # 字典数据值
        self.dictionary_value = dictionary_value
        # 硬件模块参数
        self.dictionary_param = dictionary_param
        # 选择操作
        self.action = action
        # 参数签名校验
        self.param_sign = param_sign

    def validate(self):
        self.validate_required(self.action, 'action')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.device_category is not None:
            result['device_category'] = self.device_category
        if self.dictionary_type is not None:
            result['dictionary_type'] = self.dictionary_type
        if self.dictionary_name is not None:
            result['dictionary_name'] = self.dictionary_name
        if self.dictionary_value is not None:
            result['dictionary_value'] = self.dictionary_value
        if self.dictionary_param is not None:
            result['dictionary_param'] = self.dictionary_param
        if self.action is not None:
            result['action'] = self.action
        if self.param_sign is not None:
            result['param_sign'] = self.param_sign
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('device_category') is not None:
            self.device_category = m.get('device_category')
        if m.get('dictionary_type') is not None:
            self.dictionary_type = m.get('dictionary_type')
        if m.get('dictionary_name') is not None:
            self.dictionary_name = m.get('dictionary_name')
        if m.get('dictionary_value') is not None:
            self.dictionary_value = m.get('dictionary_value')
        if m.get('dictionary_param') is not None:
            self.dictionary_param = m.get('dictionary_param')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('param_sign') is not None:
            self.param_sign = m.get('param_sign')
        return self


class OperateIotbasicDictionaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class OperateIotbasicCategoryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        category_name: str = None,
        industry: str = None,
        scene: str = None,
        category_type: str = None,
        remark: str = None,
        action: str = None,
        operator_id: str = None,
        param_sign: str = None,
        category_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 品类名称
        self.category_name = category_name
        # 行业
        self.industry = industry
        # 场景
        self.scene = scene
        # 品类类型：标准 | 自定义
        self.category_type = category_type
        # 描述内容
        self.remark = remark
        # 操作类型
        self.action = action
        # 操作人id
        self.operator_id = operator_id
        # 参数签名校验
        self.param_sign = param_sign
        # 品类code
        self.category_code = category_code

    def validate(self):
        self.validate_required(self.category_name, 'category_name')
        self.validate_required(self.industry, 'industry')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.category_type, 'category_type')
        self.validate_required(self.action, 'action')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.param_sign, 'param_sign')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.category_name is not None:
            result['category_name'] = self.category_name
        if self.industry is not None:
            result['industry'] = self.industry
        if self.scene is not None:
            result['scene'] = self.scene
        if self.category_type is not None:
            result['category_type'] = self.category_type
        if self.remark is not None:
            result['remark'] = self.remark
        if self.action is not None:
            result['action'] = self.action
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.param_sign is not None:
            result['param_sign'] = self.param_sign
        if self.category_code is not None:
            result['category_code'] = self.category_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('category_name') is not None:
            self.category_name = m.get('category_name')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('category_type') is not None:
            self.category_type = m.get('category_type')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('param_sign') is not None:
            self.param_sign = m.get('param_sign')
        if m.get('category_code') is not None:
            self.category_code = m.get('category_code')
        return self


class OperateIotbasicCategoryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作结果
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class OperateIotbasicControlconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        category_code: str = None,
        corp_name: str = None,
        device_model: str = None,
        control_model: str = None,
        is_register_notify: str = None,
        is_standard: str = None,
        is_gen_secret: str = None,
        service_provider: str = None,
        control_param: str = None,
        action: str = None,
        operator_id: str = None,
        param_sign: str = None,
        is_support_sec: str = None,
        device_specs: int = None,
        corp_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备品类编码
        self.category_code = category_code
        # 厂商
        self.corp_name = corp_name
        # 设备型号
        self.device_model = device_model
        # 管控模式
        self.control_model = control_model
        # 是否上链--注册设备后需上链存证，记录存证hash
        self.is_register_notify = is_register_notify
        # 是否标准设备-- 设备注册时 判断扩展属性 或展示时 显示扩展属性
        self.is_standard = is_standard
        # 是否生成密钥--注册设备时 生成密钥对， 存到 设备公钥(public_key)、deviceSecrect
        self.is_gen_secret = is_gen_secret
        # 接口地址
        self.service_provider = service_provider
        # 接口参数
        self.control_param = control_param
        # 操作类型
        self.action = action
        # 操作人id
        self.operator_id = operator_id
        # 参数签名校验
        self.param_sign = param_sign
        # 是否接入安全认证
        self.is_support_sec = is_support_sec
        # 设备规格ID
        self.device_specs = device_specs
        # 厂商ID
        self.corp_id = corp_id

    def validate(self):
        self.validate_required(self.category_code, 'category_code')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.control_model, 'control_model')
        self.validate_required(self.is_register_notify, 'is_register_notify')
        self.validate_required(self.is_standard, 'is_standard')
        self.validate_required(self.is_gen_secret, 'is_gen_secret')
        self.validate_required(self.action, 'action')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.param_sign, 'param_sign')
        self.validate_required(self.is_support_sec, 'is_support_sec')
        self.validate_required(self.corp_id, 'corp_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.category_code is not None:
            result['category_code'] = self.category_code
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.device_model is not None:
            result['device_model'] = self.device_model
        if self.control_model is not None:
            result['control_model'] = self.control_model
        if self.is_register_notify is not None:
            result['is_register_notify'] = self.is_register_notify
        if self.is_standard is not None:
            result['is_standard'] = self.is_standard
        if self.is_gen_secret is not None:
            result['is_gen_secret'] = self.is_gen_secret
        if self.service_provider is not None:
            result['service_provider'] = self.service_provider
        if self.control_param is not None:
            result['control_param'] = self.control_param
        if self.action is not None:
            result['action'] = self.action
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.param_sign is not None:
            result['param_sign'] = self.param_sign
        if self.is_support_sec is not None:
            result['is_support_sec'] = self.is_support_sec
        if self.device_specs is not None:
            result['device_specs'] = self.device_specs
        if self.corp_id is not None:
            result['corp_id'] = self.corp_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('category_code') is not None:
            self.category_code = m.get('category_code')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        if m.get('control_model') is not None:
            self.control_model = m.get('control_model')
        if m.get('is_register_notify') is not None:
            self.is_register_notify = m.get('is_register_notify')
        if m.get('is_standard') is not None:
            self.is_standard = m.get('is_standard')
        if m.get('is_gen_secret') is not None:
            self.is_gen_secret = m.get('is_gen_secret')
        if m.get('service_provider') is not None:
            self.service_provider = m.get('service_provider')
        if m.get('control_param') is not None:
            self.control_param = m.get('control_param')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('param_sign') is not None:
            self.param_sign = m.get('param_sign')
        if m.get('is_support_sec') is not None:
            self.is_support_sec = m.get('is_support_sec')
        if m.get('device_specs') is not None:
            self.device_specs = m.get('device_specs')
        if m.get('corp_id') is not None:
            self.corp_id = m.get('corp_id')
        return self


class OperateIotbasicControlconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class OperateIotbasicChainmodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        action: str = None,
        operator_id: str = None,
        param_sign: str = None,
        business: str = None,
        data_type: str = None,
        assets_id_key: str = None,
        assets_id_type: str = None,
        signature_check_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 操作类型
        self.action = action
        # 操作人id
        self.operator_id = operator_id
        # 参数签名校验
        self.param_sign = param_sign
        # 所属业务
        self.business = business
        # 资产数据类型
        self.data_type = data_type
        # 资产ID-key
        self.assets_id_key = assets_id_key
        # 资产ID-类型
        self.assets_id_type = assets_id_type
        # 签名验证方式
        self.signature_check_type = signature_check_type

    def validate(self):
        self.validate_required(self.action, 'action')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.param_sign, 'param_sign')
        self.validate_required(self.business, 'business')
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.assets_id_key, 'assets_id_key')
        self.validate_required(self.assets_id_type, 'assets_id_type')
        self.validate_required(self.signature_check_type, 'signature_check_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.action is not None:
            result['action'] = self.action
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.param_sign is not None:
            result['param_sign'] = self.param_sign
        if self.business is not None:
            result['business'] = self.business
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.assets_id_key is not None:
            result['assets_id_key'] = self.assets_id_key
        if self.assets_id_type is not None:
            result['assets_id_type'] = self.assets_id_type
        if self.signature_check_type is not None:
            result['signature_check_type'] = self.signature_check_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('param_sign') is not None:
            self.param_sign = m.get('param_sign')
        if m.get('business') is not None:
            self.business = m.get('business')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('assets_id_key') is not None:
            self.assets_id_key = m.get('assets_id_key')
        if m.get('assets_id_type') is not None:
            self.assets_id_type = m.get('assets_id_type')
        if m.get('signature_check_type') is not None:
            self.signature_check_type = m.get('signature_check_type')
        return self


class OperateIotbasicChainmodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class OperateIotbasicDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_disable_list: List[DeviceDisableData] = None,
        disable_operate_type: str = None,
        status: str = None,
        message: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备不可操作列表
        self.device_disable_list = device_disable_list
        # 不允许操作类型
        # DISABLE_CHAGE：不允许变更租户
        # DISABLE_EDIT：不允许编辑设备
        # DISABLE_DEL：不允许删除设备
        self.disable_operate_type = disable_operate_type
        # 操作状态
        self.status = status
        # 不允许操作提示，操作状态为true时必须有值
        self.message = message

    def validate(self):
        self.validate_required(self.device_disable_list, 'device_disable_list')
        if self.device_disable_list:
            for k in self.device_disable_list:
                if k:
                    k.validate()
        self.validate_required(self.disable_operate_type, 'disable_operate_type')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['device_disable_list'] = []
        if self.device_disable_list is not None:
            for k in self.device_disable_list:
                result['device_disable_list'].append(k.to_map() if k else None)
        if self.disable_operate_type is not None:
            result['disable_operate_type'] = self.disable_operate_type
        if self.status is not None:
            result['status'] = self.status
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.device_disable_list = []
        if m.get('device_disable_list') is not None:
            for k in m.get('device_disable_list'):
                temp_model = DeviceDisableData()
                self.device_disable_list.append(temp_model.from_map(k))
        if m.get('disable_operate_type') is not None:
            self.disable_operate_type = m.get('disable_operate_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class OperateIotbasicDeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryIotplatformPurchaseorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        serial_number: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 设备串号
        self.serial_number = serial_number

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.serial_number, 'serial_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.serial_number is not None:
            result['serial_number'] = self.serial_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('serial_number') is not None:
            self.serial_number = m.get('serial_number')
        return self


class QueryIotplatformPurchaseorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        goods_from_chain: bool = None,
        purchase_time: str = None,
        lease_name: str = None,
        purchase_order_price: str = None,
        goods_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否为链上采购商品，true：是，false：否
        self.goods_from_chain = goods_from_chain
        # 采购时间
        self.purchase_time = purchase_time
        # 采购商名称
        self.lease_name = lease_name
        # 采购价
        self.purchase_order_price = purchase_order_price
        # 商品名称
        self.goods_name = goods_name

    def validate(self):
        if self.purchase_time is not None:
            self.validate_pattern(self.purchase_time, 'purchase_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.goods_from_chain is not None:
            result['goods_from_chain'] = self.goods_from_chain
        if self.purchase_time is not None:
            result['purchase_time'] = self.purchase_time
        if self.lease_name is not None:
            result['lease_name'] = self.lease_name
        if self.purchase_order_price is not None:
            result['purchase_order_price'] = self.purchase_order_price
        if self.goods_name is not None:
            result['goods_name'] = self.goods_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('goods_from_chain') is not None:
            self.goods_from_chain = m.get('goods_from_chain')
        if m.get('purchase_time') is not None:
            self.purchase_time = m.get('purchase_time')
        if m.get('lease_name') is not None:
            self.lease_name = m.get('lease_name')
        if m.get('purchase_order_price') is not None:
            self.purchase_order_price = m.get('purchase_order_price')
        if m.get('goods_name') is not None:
            self.goods_name = m.get('goods_name')
        return self


class ImportIotplatformMeshidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        company_name: str = None,
        mesh_id: str = None,
        device_sn: str = None,
        type: str = None,
        agent_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户的金融云租户ID
        self.tenant_id = tenant_id
        # 客户的公司名称
        self.company_name = company_name
        # 设备按照MeshAgent后获取的MeshId
        self.mesh_id = mesh_id
        # 客户自定义的业务上使用的设备标识，需要与租赁业务上使用的ID进行对应
        self.device_sn = device_sn
        # 设备类型字段
        self.type = type
        # 代理商名称，用于二级代理模式
        self.agent_name = agent_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.mesh_id, 'mesh_id')
        self.validate_required(self.device_sn, 'device_sn')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.mesh_id is not None:
            result['mesh_id'] = self.mesh_id
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.type is not None:
            result['type'] = self.type
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('mesh_id') is not None:
            self.mesh_id = m.get('mesh_id')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        return self


class ImportIotplatformMeshidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        device_sn: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 提交绑定时的SN号，用于确认
        self.device_sn = device_sn

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
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        return self


class ImportPurchaseorderThirdpartyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_number: str = None,
        consignee_name: str = None,
        consignee_id_number: str = None,
        consignee_phone: str = None,
        consignee_address: str = None,
        supplier_name: str = None,
        supplier_id: str = None,
        lease_id: str = None,
        goods_list: List[GoodsIdAndCount] = None,
        idempot_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租赁订单号
        self.order_number = order_number
        # 收货人姓名
        self.consignee_name = consignee_name
        # 收货人身份证号
        self.consignee_id_number = consignee_id_number
        # 收货人手机号
        self.consignee_phone = consignee_phone
        # 收货人地址
        self.consignee_address = consignee_address
        # 供货商名称
        self.supplier_name = supplier_name
        # 供货商租户id
        self.supplier_id = supplier_id
        # 采购商租户id
        self.lease_id = lease_id
        # 商品信息列表
        self.goods_list = goods_list
        # 幂等号
        self.idempot_id = idempot_id

    def validate(self):
        self.validate_required(self.order_number, 'order_number')
        self.validate_required(self.consignee_name, 'consignee_name')
        self.validate_required(self.consignee_id_number, 'consignee_id_number')
        self.validate_required(self.consignee_phone, 'consignee_phone')
        self.validate_required(self.consignee_address, 'consignee_address')
        self.validate_required(self.supplier_name, 'supplier_name')
        self.validate_required(self.supplier_id, 'supplier_id')
        self.validate_required(self.lease_id, 'lease_id')
        self.validate_required(self.goods_list, 'goods_list')
        if self.goods_list:
            for k in self.goods_list:
                if k:
                    k.validate()
        self.validate_required(self.idempot_id, 'idempot_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_number is not None:
            result['order_number'] = self.order_number
        if self.consignee_name is not None:
            result['consignee_name'] = self.consignee_name
        if self.consignee_id_number is not None:
            result['consignee_id_number'] = self.consignee_id_number
        if self.consignee_phone is not None:
            result['consignee_phone'] = self.consignee_phone
        if self.consignee_address is not None:
            result['consignee_address'] = self.consignee_address
        if self.supplier_name is not None:
            result['supplier_name'] = self.supplier_name
        if self.supplier_id is not None:
            result['supplier_id'] = self.supplier_id
        if self.lease_id is not None:
            result['lease_id'] = self.lease_id
        result['goods_list'] = []
        if self.goods_list is not None:
            for k in self.goods_list:
                result['goods_list'].append(k.to_map() if k else None)
        if self.idempot_id is not None:
            result['idempot_id'] = self.idempot_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_number') is not None:
            self.order_number = m.get('order_number')
        if m.get('consignee_name') is not None:
            self.consignee_name = m.get('consignee_name')
        if m.get('consignee_id_number') is not None:
            self.consignee_id_number = m.get('consignee_id_number')
        if m.get('consignee_phone') is not None:
            self.consignee_phone = m.get('consignee_phone')
        if m.get('consignee_address') is not None:
            self.consignee_address = m.get('consignee_address')
        if m.get('supplier_name') is not None:
            self.supplier_name = m.get('supplier_name')
        if m.get('supplier_id') is not None:
            self.supplier_id = m.get('supplier_id')
        if m.get('lease_id') is not None:
            self.lease_id = m.get('lease_id')
        self.goods_list = []
        if m.get('goods_list') is not None:
            for k in m.get('goods_list'):
                temp_model = GoodsIdAndCount()
                self.goods_list.append(temp_model.from_map(k))
        if m.get('idempot_id') is not None:
            self.idempot_id = m.get('idempot_id')
        return self


class ImportPurchaseorderThirdpartyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        purchase_order_id: str = None,
        status: str = None,
        fail_map: InsertPurchaseOrderFailInfo = None,
        purchase_order_info_detail: PurchaseOrderInfoDetail = None,
        idempot_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 采购平台-采购详情id
        self.purchase_order_id = purchase_order_id
        # 当前状态
        # READY_DELIVER(0, "待发货"),
        # DELIVERED(1, "已发货"),
        # REFUSED(2, "已拒发"),
        # CANCELED(4, "已取消"),
        # REFUNDED(5, "已退货");
        # 
        self.status = status
        # InsertPurchaseOrderFailInfo
        self.fail_map = fail_map
        # 真实订单信息，成功不返回
        # 
        self.purchase_order_info_detail = purchase_order_info_detail
        # 幂等号
        self.idempot_id = idempot_id

    def validate(self):
        if self.fail_map:
            self.fail_map.validate()
        if self.purchase_order_info_detail:
            self.purchase_order_info_detail.validate()

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
        if self.purchase_order_id is not None:
            result['purchase_order_id'] = self.purchase_order_id
        if self.status is not None:
            result['status'] = self.status
        if self.fail_map is not None:
            result['fail_map'] = self.fail_map.to_map()
        if self.purchase_order_info_detail is not None:
            result['purchase_order_info_detail'] = self.purchase_order_info_detail.to_map()
        if self.idempot_id is not None:
            result['idempot_id'] = self.idempot_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('purchase_order_id') is not None:
            self.purchase_order_id = m.get('purchase_order_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('fail_map') is not None:
            temp_model = InsertPurchaseOrderFailInfo()
            self.fail_map = temp_model.from_map(m['fail_map'])
        if m.get('purchase_order_info_detail') is not None:
            temp_model = PurchaseOrderInfoDetail()
            self.purchase_order_info_detail = temp_model.from_map(m['purchase_order_info_detail'])
        if m.get('idempot_id') is not None:
            self.idempot_id = m.get('idempot_id')
        return self


class AddUserRoleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        role: str = None,
        support_abm: bool = None,
        includ_tax: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 账号标识，蚂蚁金融科技租户ID
        self.tenant_id = tenant_id
        # 租户名称
        self.tenant_name = tenant_name
        # 权限标识
        # LEASER(0),
        # BUYERS(1),
        # OWNER(2),
        # ADMIN(9);
        self.role = role
        # 是否支持abm远程
        self.support_abm = support_abm
        # 是否含税
        self.includ_tax = includ_tax

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.role, 'role')
        self.validate_required(self.support_abm, 'support_abm')
        self.validate_required(self.includ_tax, 'includ_tax')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.role is not None:
            result['role'] = self.role
        if self.support_abm is not None:
            result['support_abm'] = self.support_abm
        if self.includ_tax is not None:
            result['includ_tax'] = self.includ_tax
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('support_abm') is not None:
            self.support_abm = m.get('support_abm')
        if m.get('includ_tax') is not None:
            self.includ_tax = m.get('includ_tax')
        return self


class AddUserRoleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 新增的用户id
        self.user_id = user_id

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
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class AddGoodsSkuRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        type: str = None,
        second_type: str = None,
        brand: str = None,
        model: str = None,
        market_price: int = None,
        phone_info: PhoneInfo = None,
        computer_info: ComputerInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # GoodsTypeEnum,商品一级类目
        self.type = type
        # 商品二级类目
        self.second_type = second_type
        # 商品品牌
        self.brand = brand
        # 商品名称，型号
        self.model = model
        # 市场价
        self.market_price = market_price
        # 手机型号信息
        self.phone_info = phone_info
        # 电脑型号信息
        self.computer_info = computer_info

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.second_type, 'second_type')
        self.validate_required(self.brand, 'brand')
        self.validate_required(self.model, 'model')
        self.validate_required(self.market_price, 'market_price')
        if self.phone_info:
            self.phone_info.validate()
        if self.computer_info:
            self.computer_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.type is not None:
            result['type'] = self.type
        if self.second_type is not None:
            result['second_type'] = self.second_type
        if self.brand is not None:
            result['brand'] = self.brand
        if self.model is not None:
            result['model'] = self.model
        if self.market_price is not None:
            result['market_price'] = self.market_price
        if self.phone_info is not None:
            result['phone_info'] = self.phone_info.to_map()
        if self.computer_info is not None:
            result['computer_info'] = self.computer_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('second_type') is not None:
            self.second_type = m.get('second_type')
        if m.get('brand') is not None:
            self.brand = m.get('brand')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('market_price') is not None:
            self.market_price = m.get('market_price')
        if m.get('phone_info') is not None:
            temp_model = PhoneInfo()
            self.phone_info = temp_model.from_map(m['phone_info'])
        if m.get('computer_info') is not None:
            temp_model = ComputerInfo()
            self.computer_info = temp_model.from_map(m['computer_info'])
        return self


class AddGoodsSkuResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # SKU id
        self.sku_id = sku_id

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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        return self


class CreateDeviceDatamodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_model: str = None,
        data_model_name: str = None,
        biz_type: str = None,
        customer_version: str = None,
        transform_thing_model: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据模型
        self.data_model = data_model
        # 数据模型名称
        self.data_model_name = data_model_name
        # 数据模型类别
        self.biz_type = biz_type
        # 用户自定义版本
        self.customer_version = customer_version
        # 是否转化为物模型，默认false
        self.transform_thing_model = transform_thing_model

    def validate(self):
        self.validate_required(self.data_model, 'data_model')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_model is not None:
            result['data_model'] = self.data_model
        if self.data_model_name is not None:
            result['data_model_name'] = self.data_model_name
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.customer_version is not None:
            result['customer_version'] = self.customer_version
        if self.transform_thing_model is not None:
            result['transform_thing_model'] = self.transform_thing_model
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_model') is not None:
            self.data_model = m.get('data_model')
        if m.get('data_model_name') is not None:
            self.data_model_name = m.get('data_model_name')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('customer_version') is not None:
            self.customer_version = m.get('customer_version')
        if m.get('transform_thing_model') is not None:
            self.transform_thing_model = m.get('transform_thing_model')
        return self


class CreateDeviceDatamodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        device_data_model_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据模型id
        self.device_data_model_id = device_data_model_id

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
        if self.device_data_model_id is not None:
            result['device_data_model_id'] = self.device_data_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('device_data_model_id') is not None:
            self.device_data_model_id = m.get('device_data_model_id')
        return self


class GetDeviceDatamodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据模型Id
        self.data_model_id = data_model_id

    def validate(self):
        self.validate_required(self.data_model_id, 'data_model_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        return self


class GetDeviceDatamodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_model: DataModel = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据模型
        self.data_model = data_model

    def validate(self):
        if self.data_model:
            self.data_model.validate()

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
        if self.data_model is not None:
            result['data_model'] = self.data_model.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data_model') is not None:
            temp_model = DataModel()
            self.data_model = temp_model.from_map(m['data_model'])
        return self


class ImportDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        device_data_model_id: str = None,
        scene: str = None,
        device_imei: str = None,
        device_name: str = None,
        corp_name: str = None,
        device_feature: str = None,
        device_type_code: int = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
        device_type_id: str = None,
        device_public_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备Id
        self.device_id = device_id
        # 数据模型id
        self.device_data_model_id = device_data_model_id
        # 场景码
        self.scene = scene
        # 设备imei
        self.device_imei = device_imei
        # 设备名称
        self.device_name = device_name
        # 厂商名称
        self.corp_name = corp_name
        # 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
        self.device_feature = device_feature
        # 设备类型编码，必填，对应资管平台中的设备类型
        # 
        # 枚举值：
        # 
        # 车辆 1000
        # 车辆 四轮车 1001
        # 车辆 四轮车 纯电四轮车 1002
        # 车辆 四轮车 混动四轮车 1003
        # 车辆 四轮车 燃油四轮车 1004
        # 车辆 两轮车 1011
        # 车辆 两轮车 两轮单车 1012
        # 车辆 两轮车 两轮助力车 1013
        # 
        # 换电柜 2000
        # 换电柜 二轮车换电柜 2001
        # 
        # 电池 3000
        # 电池 磷酸铁电池 3001
        # 电池 三元锂电池 3002
        # 
        # 回收设备 4000
        # 
        # 垃圾分类回收 4001
        # 
        # 洗车机 5000
        # 通用计算设备	                6000
        # 移动设备		        6001
        # 智能手机	        6002
        # 工业掌机	        6003
        # 平板电脑	        6004
        # 云设备		        6011
        # 云计算服务器	6012
        self.device_type_code = device_type_code
        # 设备单价 单位：分
        self.initial_price = initial_price
        # 出厂时间
        self.factory_time = factory_time
        # 投放时间
        self.release_time = release_time
        # 设备类型，需要提前约定好
        self.device_type_id = device_type_id
        # 可信根派生公钥
        self.device_public_key = device_public_key

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.device_data_model_id, 'device_data_model_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.device_imei, 'device_imei')
        self.validate_required(self.device_feature, 'device_feature')
        self.validate_required(self.device_type_code, 'device_type_code')
        self.validate_required(self.initial_price, 'initial_price')
        self.validate_required(self.factory_time, 'factory_time')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.release_time, 'release_time')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
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
        if self.device_feature is not None:
            result['device_feature'] = self.device_feature
        if self.device_type_code is not None:
            result['device_type_code'] = self.device_type_code
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        if self.device_type_id is not None:
            result['device_type_id'] = self.device_type_id
        if self.device_public_key is not None:
            result['device_public_key'] = self.device_public_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
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
        if m.get('device_feature') is not None:
            self.device_feature = m.get('device_feature')
        if m.get('device_type_code') is not None:
            self.device_type_code = m.get('device_type_code')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        if m.get('device_type_id') is not None:
            self.device_type_id = m.get('device_type_id')
        if m.get('device_public_key') is not None:
            self.device_public_key = m.get('device_public_key')
        return self


class ImportDeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chain_device_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链上设备Id
        self.chain_device_id = chain_device_id

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
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        return self


class GetDeviceBychainidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链上设备Id
        self.chain_device_id = chain_device_id

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        return self


class GetDeviceBychainidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        device: Device = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 设备详情
        self.device = device

    def validate(self):
        if self.device:
            self.device.validate()

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
        if self.device is not None:
            result['device'] = self.device.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('device') is not None:
            temp_model = Device()
            self.device = temp_model.from_map(m['device'])
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
        # 设备信息不存在的deviceid集合
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


class ListDeviceBysceneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene = scene

    def validate(self):
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
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class ListDeviceBysceneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        device_list: List[Device] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 设备列表
        self.device_list = device_list

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
        return self


class UpdateDeviceInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
        device_imei: str = None,
        data_model_id: str = None,
        device_iccid: str = None,
        device_type_code: int = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
        device_name: str = None,
        extra_info: str = None,
        owner: str = None,
        owner_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链上设备Id
        self.chain_device_id = chain_device_id
        # 设备imei号
        self.device_imei = device_imei
        # 设备数据模型Id
        # 
        # 
        self.data_model_id = data_model_id
        # 设备ICCID
        # 
        # 
        self.device_iccid = device_iccid
        # deviceTypeCode 枚举
        # 
        # 车辆: 1000
        # 四轮车: 1001
        # 纯电四轮车:1002
        # 混动四轮车 1003
        # 燃油四轮车 : 1004
        # 
        # 两轮车:1011
        # 两轮单车:1012
        # 两轮助力车:1013
        # 
        # 换电柜 :2000
        # 二轮车换电柜:2001
        # 
        # 电池 :3000
        # 磷酸铁电池:3001
        # 三元锂电池:3002
        # 
        # 回收设备:4000
        # 垃圾分类回收:4001
        # 
        # 洗车机 :5000
        # 通用计算设备	                6000
        # 移动设备		        6001
        # 智能手机	        6002
        # 工业掌机	        6003
        # 平板电脑	        6004
        # 云设备		        6011
        # 云计算服务器	6012
        self.device_type_code = device_type_code
        # 设备单价 单位：分
        self.initial_price = initial_price
        # 出厂时间
        self.factory_time = factory_time
        # 投放时间
        self.release_time = release_time
        # 设备型号
        self.device_name = device_name
        # 额外信息
        self.extra_info = extra_info
        # 资产所有人标识（统一社会信用代码）
        self.owner = owner
        # 资产所有人名称
        self.owner_name = owner_name

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.device_imei is not None:
            result['device_imei'] = self.device_imei
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        if self.device_iccid is not None:
            result['device_iccid'] = self.device_iccid
        if self.device_type_code is not None:
            result['device_type_code'] = self.device_type_code
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.owner is not None:
            result['owner'] = self.owner
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('device_imei') is not None:
            self.device_imei = m.get('device_imei')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        if m.get('device_iccid') is not None:
            self.device_iccid = m.get('device_iccid')
        if m.get('device_type_code') is not None:
            self.device_type_code = m.get('device_type_code')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        return self


class UpdateDeviceInfoResponse(TeaModel):
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


class CreateDistributedeviceBydeviceidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        corp_name: str = None,
        device_data_model_id: str = None,
        device_id: str = None,
        device_imei: str = None,
        device_name: str = None,
        scene: str = None,
        device_feature: str = None,
        with_exist_device_id: bool = None,
        device_type_code: int = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
        extra_info: str = None,
        owner: str = None,
        owner_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 厂商名
        self.corp_name = corp_name
        # 数据模型Id
        self.device_data_model_id = device_data_model_id
        # 设备Id
        self.device_id = device_id
        # 设备imei号
        self.device_imei = device_imei
        # 设备名称
        self.device_name = device_name
        # 场景码
        self.scene = scene
        # 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
        self.device_feature = device_feature
        # 当用已发行设备发行时返回已发行id或返回错误
        self.with_exist_device_id = with_exist_device_id
        # 设备类型编码
        self.device_type_code = device_type_code
        # 设备单价 单位：分
        self.initial_price = initial_price
        # 出厂时间
        self.factory_time = factory_time
        # 投放时间
        self.release_time = release_time
        # 额外信息
        self.extra_info = extra_info
        # 资产所有人标识（统一社会信用代码）
        self.owner = owner
        # 资产所有人名称
        self.owner_name = owner_name

    def validate(self):
        self.validate_required(self.device_data_model_id, 'device_data_model_id')
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.scene, 'scene')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.device_data_model_id is not None:
            result['device_data_model_id'] = self.device_data_model_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.device_imei is not None:
            result['device_imei'] = self.device_imei
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.scene is not None:
            result['scene'] = self.scene
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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('device_data_model_id') is not None:
            self.device_data_model_id = m.get('device_data_model_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('device_imei') is not None:
            self.device_imei = m.get('device_imei')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
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
        return self


class CreateDistributedeviceBydeviceidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chain_device_id: str = None,
        distribute_device_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链上设备Id
        self.chain_device_id = chain_device_id
        # 发行设备Id
        self.distribute_device_id = distribute_device_id

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
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        return self


class CreateDistributedeviceBychainidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链上设备Id
        self.chain_device_id = chain_device_id

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        return self


class CreateDistributedeviceBychainidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行设备Id
        self.distribute_device_id = distribute_device_id

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
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        return self


class ReplaceDistributedeviceBychainidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
        distribute_device_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链上设备Id
        self.chain_device_id = chain_device_id
        # 发行设备Id
        self.distribute_device_id = distribute_device_id

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.distribute_device_id, 'distribute_device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        return self


class ReplaceDistributedeviceBychainidResponse(TeaModel):
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


class SendCollectorBychainidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
        collect_content_list: List[CollectContent] = None,
        nonce: str = None,
        data_model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链上设备Id
        self.chain_device_id = chain_device_id
        # 收集数据
        self.collect_content_list = collect_content_list
        # 随机数，防重放
        self.nonce = nonce
        # 数据模型Id
        self.data_model_id = data_model_id

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.collect_content_list, 'collect_content_list')
        if self.collect_content_list:
            for k in self.collect_content_list:
                if k:
                    k.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        result['collect_content_list'] = []
        if self.collect_content_list is not None:
            for k in self.collect_content_list:
                result['collect_content_list'].append(k.to_map() if k else None)
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        self.collect_content_list = []
        if m.get('collect_content_list') is not None:
            for k in m.get('collect_content_list'):
                temp_model = CollectContent()
                self.collect_content_list.append(temp_model.from_map(k))
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        return self


class SendCollectorBychainidResponse(TeaModel):
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
        # 收集数据返回的上链结果
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


class GetDistributedeviceBychainidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_id_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发行设备Id
        self.chain_id_list = chain_id_list

    def validate(self):
        self.validate_required(self.chain_id_list, 'chain_id_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_id_list is not None:
            result['chain_id_list'] = self.chain_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_id_list') is not None:
            self.chain_id_list = m.get('chain_id_list')
        return self


class GetDistributedeviceBychainidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_list: List[DistributeDevice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行设备
        self.distribute_device_list = distribute_device_list

    def validate(self):
        if self.distribute_device_list:
            for k in self.distribute_device_list:
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
        result['distribute_device_list'] = []
        if self.distribute_device_list is not None:
            for k in self.distribute_device_list:
                result['distribute_device_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.distribute_device_list = []
        if m.get('distribute_device_list') is not None:
            for k in m.get('distribute_device_list'):
                temp_model = DistributeDevice()
                self.distribute_device_list.append(temp_model.from_map(k))
        return self


class ListDistributedeviceBysceneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene = scene

    def validate(self):
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
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class ListDistributedeviceBysceneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_list: List[DistributeDevice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行设备
        self.distribute_device_list = distribute_device_list

    def validate(self):
        if self.distribute_device_list:
            for k in self.distribute_device_list:
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
        result['distribute_device_list'] = []
        if self.distribute_device_list is not None:
            for k in self.distribute_device_list:
                result['distribute_device_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.distribute_device_list = []
        if m.get('distribute_device_list') is not None:
            for k in m.get('distribute_device_list'):
                temp_model = DistributeDevice()
                self.distribute_device_list.append(temp_model.from_map(k))
        return self


class CreateConsumerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        consumer_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 消费者名称
        self.consumer_name = consumer_name

    def validate(self):
        self.validate_required(self.consumer_name, 'consumer_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.consumer_name is not None:
            result['consumer_name'] = self.consumer_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('consumer_name') is not None:
            self.consumer_name = m.get('consumer_name')
        return self


class CreateConsumerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        consumer_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 消费者Id
        self.consumer_id = consumer_id

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
        if self.consumer_id is not None:
            result['consumer_id'] = self.consumer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('consumer_id') is not None:
            self.consumer_id = m.get('consumer_id')
        return self


class SetConsumerSubscribeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        consumer_id: str = None,
        distribute_device_id_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 消费者Id
        self.consumer_id = consumer_id
        # 订阅的发行设备Id列表
        self.distribute_device_id_list = distribute_device_id_list

    def validate(self):
        self.validate_required(self.consumer_id, 'consumer_id')
        self.validate_required(self.distribute_device_id_list, 'distribute_device_id_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.consumer_id is not None:
            result['consumer_id'] = self.consumer_id
        if self.distribute_device_id_list is not None:
            result['distribute_device_id_list'] = self.distribute_device_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('consumer_id') is not None:
            self.consumer_id = m.get('consumer_id')
        if m.get('distribute_device_id_list') is not None:
            self.distribute_device_id_list = m.get('distribute_device_id_list')
        return self


class SetConsumerSubscribeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订阅的发行设备列表
        self.distribute_device_list = distribute_device_list

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
        if self.distribute_device_list is not None:
            result['distribute_device_list'] = self.distribute_device_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('distribute_device_list') is not None:
            self.distribute_device_list = m.get('distribute_device_list')
        return self


class SetConsumerUnsubscribeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        consumer_id: str = None,
        distribute_device_id_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 消费者id
        self.consumer_id = consumer_id
        # 发型设备Id列表
        self.distribute_device_id_list = distribute_device_id_list

    def validate(self):
        self.validate_required(self.consumer_id, 'consumer_id')
        self.validate_required(self.distribute_device_id_list, 'distribute_device_id_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.consumer_id is not None:
            result['consumer_id'] = self.consumer_id
        if self.distribute_device_id_list is not None:
            result['distribute_device_id_list'] = self.distribute_device_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('consumer_id') is not None:
            self.consumer_id = m.get('consumer_id')
        if m.get('distribute_device_id_list') is not None:
            self.distribute_device_id_list = m.get('distribute_device_id_list')
        return self


class SetConsumerUnsubscribeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行设备列表
        self.distribute_device_list = distribute_device_list

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
        if self.distribute_device_list is not None:
            result['distribute_device_list'] = self.distribute_device_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('distribute_device_list') is not None:
            self.distribute_device_list = m.get('distribute_device_list')
        return self


class PullConsumerDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        consumer_id: str = None,
        cursor: str = None,
        time_span: List[str] = None,
        device_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 消费者id
        self.consumer_id = consumer_id
        # 分页游标
        self.cursor = cursor
        # 获取的时间范围
        self.time_span = time_span
        # 类型：DEVICE、PERIPHERAL、ALL 默认为 ALL
        self.device_type = device_type

    def validate(self):
        self.validate_required(self.consumer_id, 'consumer_id')
        self.validate_required(self.cursor, 'cursor')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.consumer_id is not None:
            result['consumer_id'] = self.consumer_id
        if self.cursor is not None:
            result['cursor'] = self.cursor
        if self.time_span is not None:
            result['time_span'] = self.time_span
        if self.device_type is not None:
            result['device_type'] = self.device_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('consumer_id') is not None:
            self.consumer_id = m.get('consumer_id')
        if m.get('cursor') is not None:
            self.cursor = m.get('cursor')
        if m.get('time_span') is not None:
            self.time_span = m.get('time_span')
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        return self


class PullConsumerDatasourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cursor: str = None,
        data_package_list: List[DistributeDataPackage] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页游标
        self.cursor = cursor
        # 数据包列表
        self.data_package_list = data_package_list

    def validate(self):
        if self.data_package_list:
            for k in self.data_package_list:
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
        if self.cursor is not None:
            result['cursor'] = self.cursor
        result['data_package_list'] = []
        if self.data_package_list is not None:
            for k in self.data_package_list:
                result['data_package_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cursor') is not None:
            self.cursor = m.get('cursor')
        self.data_package_list = []
        if m.get('data_package_list') is not None:
            for k in m.get('data_package_list'):
                temp_model = DistributeDataPackage()
                self.data_package_list.append(temp_model.from_map(k))
        return self


class GetDistributedeviceBydeviceidRequest(TeaModel):
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
        # 设备Id
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


class GetDistributedeviceBydeviceidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_list: List[DistributeDevice] = None,
        miss_device_id_list: List[str] = None,
        success_device_id_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行设备
        self.distribute_device_list = distribute_device_list
        # 发行设备信息不存在的deviceid集合
        self.miss_device_id_list = miss_device_id_list
        # 成功获取到发行设备信息的deviceid集合
        self.success_device_id_list = success_device_id_list

    def validate(self):
        if self.distribute_device_list:
            for k in self.distribute_device_list:
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
        result['distribute_device_list'] = []
        if self.distribute_device_list is not None:
            for k in self.distribute_device_list:
                result['distribute_device_list'].append(k.to_map() if k else None)
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
        self.distribute_device_list = []
        if m.get('distribute_device_list') is not None:
            for k in m.get('distribute_device_list'):
                temp_model = DistributeDevice()
                self.distribute_device_list.append(temp_model.from_map(k))
        if m.get('miss_device_id_list') is not None:
            self.miss_device_id_list = m.get('miss_device_id_list')
        if m.get('success_device_id_list') is not None:
            self.success_device_id_list = m.get('success_device_id_list')
        return self


class GetDistributedeviceBydisidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        distribute_device_id_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发行设备id列表
        self.distribute_device_id_list = distribute_device_id_list

    def validate(self):
        self.validate_required(self.distribute_device_id_list, 'distribute_device_id_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.distribute_device_id_list is not None:
            result['distribute_device_id_list'] = self.distribute_device_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('distribute_device_id_list') is not None:
            self.distribute_device_id_list = m.get('distribute_device_id_list')
        return self


class GetDistributedeviceBydisidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_list: List[DistributeDevice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行设备列表
        self.distribute_device_list = distribute_device_list

    def validate(self):
        if self.distribute_device_list:
            for k in self.distribute_device_list:
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
        result['distribute_device_list'] = []
        if self.distribute_device_list is not None:
            for k in self.distribute_device_list:
                result['distribute_device_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.distribute_device_list = []
        if m.get('distribute_device_list') is not None:
            for k in m.get('distribute_device_list'):
                temp_model = DistributeDevice()
                self.distribute_device_list.append(temp_model.from_map(k))
        return self


class ImportPeripheralRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        corp_name: str = None,
        peripheral_data_model_id: str = None,
        peripheral_id: str = None,
        peripheral_name: str = None,
        scene: str = None,
        device_type_code: int = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 厂商名称
        self.corp_name = corp_name
        # 数据模型id
        self.peripheral_data_model_id = peripheral_data_model_id
        # 外围设备ID
        self.peripheral_id = peripheral_id
        # 外围设备名称
        self.peripheral_name = peripheral_name
        # 场景码
        self.scene = scene
        # 设备类型编码，必填，对应资管平台中的设备类型
        # 
        # 枚举值：
        # 
        # 车辆 1000
        # 车辆 四轮车 1001
        # 车辆 四轮车 纯电四轮车 1002
        # 车辆 四轮车 混动四轮车 1003
        # 车辆 四轮车 燃油四轮车 1004
        # 车辆 两轮车 1011
        # 车辆 两轮车 两轮单车 1012
        # 车辆 两轮车 两轮助力车 1013
        # 
        # 换电柜 2000
        # 换电柜 二轮车换电柜 2001
        # 
        # 电池 3000
        # 电池 磷酸铁电池 3001
        # 电池 三元锂电池 3002
        # 
        # 回收设备 4000
        # 
        # 垃圾分类回收 4001
        # 
        # 洗车机 5000
        self.device_type_code = device_type_code
        # 设备单价 单位：分
        self.initial_price = initial_price
        # 出厂时间
        self.factory_time = factory_time
        # 投放时间
        self.release_time = release_time

    def validate(self):
        self.validate_required(self.peripheral_data_model_id, 'peripheral_data_model_id')
        self.validate_required(self.peripheral_id, 'peripheral_id')
        self.validate_required(self.scene, 'scene')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.peripheral_data_model_id is not None:
            result['peripheral_data_model_id'] = self.peripheral_data_model_id
        if self.peripheral_id is not None:
            result['peripheral_id'] = self.peripheral_id
        if self.peripheral_name is not None:
            result['peripheral_name'] = self.peripheral_name
        if self.scene is not None:
            result['scene'] = self.scene
        if self.device_type_code is not None:
            result['device_type_code'] = self.device_type_code
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('peripheral_data_model_id') is not None:
            self.peripheral_data_model_id = m.get('peripheral_data_model_id')
        if m.get('peripheral_id') is not None:
            self.peripheral_id = m.get('peripheral_id')
        if m.get('peripheral_name') is not None:
            self.peripheral_name = m.get('peripheral_name')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('device_type_code') is not None:
            self.device_type_code = m.get('device_type_code')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        return self


class ImportPeripheralResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chain_peripheral_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链上外围设备Id
        # 
        # 
        self.chain_peripheral_id = chain_peripheral_id

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
        if self.chain_peripheral_id is not None:
            result['chain_peripheral_id'] = self.chain_peripheral_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chain_peripheral_id') is not None:
            self.chain_peripheral_id = m.get('chain_peripheral_id')
        return self


class GetPeripheralBychainperipheralidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_peripheral_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链上外围设备Id
        self.chain_peripheral_id = chain_peripheral_id

    def validate(self):
        self.validate_required(self.chain_peripheral_id, 'chain_peripheral_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_peripheral_id is not None:
            result['chain_peripheral_id'] = self.chain_peripheral_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_peripheral_id') is not None:
            self.chain_peripheral_id = m.get('chain_peripheral_id')
        return self


class GetPeripheralBychainperipheralidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        peripheral: Peripheral = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 外围设备信息
        self.peripheral = peripheral

    def validate(self):
        if self.peripheral:
            self.peripheral.validate()

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
        if self.peripheral is not None:
            result['peripheral'] = self.peripheral.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('peripheral') is not None:
            temp_model = Peripheral()
            self.peripheral = temp_model.from_map(m['peripheral'])
        return self


class GetPeripheralByperipheralidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        peripheral_id: str = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外围设备ID
        self.peripheral_id = peripheral_id
        # 场景码
        # 
        self.scene = scene

    def validate(self):
        self.validate_required(self.peripheral_id, 'peripheral_id')
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
        if self.peripheral_id is not None:
            result['peripheral_id'] = self.peripheral_id
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('peripheral_id') is not None:
            self.peripheral_id = m.get('peripheral_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class GetPeripheralByperipheralidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        peripheral: Peripheral = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 外围设备信息
        # 
        # 
        self.peripheral = peripheral

    def validate(self):
        if self.peripheral:
            self.peripheral.validate()

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
        if self.peripheral is not None:
            result['peripheral'] = self.peripheral.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('peripheral') is not None:
            temp_model = Peripheral()
            self.peripheral = temp_model.from_map(m['peripheral'])
        return self


class ListPeripheralBysceneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        # 
        self.scene = scene

    def validate(self):
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
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class ListPeripheralBysceneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        peripheral_list: List[Peripheral] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 外围设备信息列表
        # 
        # 
        self.peripheral_list = peripheral_list

    def validate(self):
        if self.peripheral_list:
            for k in self.peripheral_list:
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
        result['peripheral_list'] = []
        if self.peripheral_list is not None:
            for k in self.peripheral_list:
                result['peripheral_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.peripheral_list = []
        if m.get('peripheral_list') is not None:
            for k in m.get('peripheral_list'):
                temp_model = Peripheral()
                self.peripheral_list.append(temp_model.from_map(k))
        return self


class CreateDistributedeviceByperipheralidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        corp_name: str = None,
        peripheral_data_model_id: str = None,
        peripheral_id: str = None,
        peripheral_name: str = None,
        scene: str = None,
        device_type_code: int = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 厂商名称
        self.corp_name = corp_name
        # 数据模型id
        self.peripheral_data_model_id = peripheral_data_model_id
        # 外围设备ID
        self.peripheral_id = peripheral_id
        # 外围设备名称
        # 
        self.peripheral_name = peripheral_name
        # 场景码
        self.scene = scene
        # 设备类型编码
        self.device_type_code = device_type_code
        # 设备单价 单位：分
        self.initial_price = initial_price
        # 出厂时间
        self.factory_time = factory_time
        # 投放时间
        self.release_time = release_time

    def validate(self):
        self.validate_required(self.peripheral_data_model_id, 'peripheral_data_model_id')
        self.validate_required(self.peripheral_id, 'peripheral_id')
        self.validate_required(self.scene, 'scene')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.peripheral_data_model_id is not None:
            result['peripheral_data_model_id'] = self.peripheral_data_model_id
        if self.peripheral_id is not None:
            result['peripheral_id'] = self.peripheral_id
        if self.peripheral_name is not None:
            result['peripheral_name'] = self.peripheral_name
        if self.scene is not None:
            result['scene'] = self.scene
        if self.device_type_code is not None:
            result['device_type_code'] = self.device_type_code
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('peripheral_data_model_id') is not None:
            self.peripheral_data_model_id = m.get('peripheral_data_model_id')
        if m.get('peripheral_id') is not None:
            self.peripheral_id = m.get('peripheral_id')
        if m.get('peripheral_name') is not None:
            self.peripheral_name = m.get('peripheral_name')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('device_type_code') is not None:
            self.device_type_code = m.get('device_type_code')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        return self


class CreateDistributedeviceByperipheralidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_id: str = None,
        chain_peripheral_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行设备Id
        # 
        self.distribute_device_id = distribute_device_id
        # 链上外围设备Id
        # 
        self.chain_peripheral_id = chain_peripheral_id

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
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        if self.chain_peripheral_id is not None:
            result['chain_peripheral_id'] = self.chain_peripheral_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        if m.get('chain_peripheral_id') is not None:
            self.chain_peripheral_id = m.get('chain_peripheral_id')
        return self


class CreateDistributedeviceBychainperipheralidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_peripheral_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链上外围设备Id
        # 
        self.chain_peripheral_id = chain_peripheral_id

    def validate(self):
        self.validate_required(self.chain_peripheral_id, 'chain_peripheral_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_peripheral_id is not None:
            result['chain_peripheral_id'] = self.chain_peripheral_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_peripheral_id') is not None:
            self.chain_peripheral_id = m.get('chain_peripheral_id')
        return self


class CreateDistributedeviceBychainperipheralidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行外围设备Id
        # 
        self.distribute_device_id = distribute_device_id

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
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        return self


class ReplaceDistributedeviceBychainperipheralidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        distribute_device_id: str = None,
        chain_peripheral_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发行外围设备Id
        # 
        # 
        self.distribute_device_id = distribute_device_id
        # 链上外围设备ID
        self.chain_peripheral_id = chain_peripheral_id

    def validate(self):
        self.validate_required(self.distribute_device_id, 'distribute_device_id')
        self.validate_required(self.chain_peripheral_id, 'chain_peripheral_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        if self.chain_peripheral_id is not None:
            result['chain_peripheral_id'] = self.chain_peripheral_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        if m.get('chain_peripheral_id') is not None:
            self.chain_peripheral_id = m.get('chain_peripheral_id')
        return self


class ReplaceDistributedeviceBychainperipheralidResponse(TeaModel):
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


class ListDistributedeviceByperipheralsceneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene = scene

    def validate(self):
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
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class ListDistributedeviceByperipheralsceneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_list: List[DistributeDevice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行的外围设备信息数组
        # 
        self.distribute_device_list = distribute_device_list

    def validate(self):
        if self.distribute_device_list:
            for k in self.distribute_device_list:
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
        result['distribute_device_list'] = []
        if self.distribute_device_list is not None:
            for k in self.distribute_device_list:
                result['distribute_device_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.distribute_device_list = []
        if m.get('distribute_device_list') is not None:
            for k in m.get('distribute_device_list'):
                temp_model = DistributeDevice()
                self.distribute_device_list.append(temp_model.from_map(k))
        return self


class GetDistributedeviceByperipheralidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        peripheral_id_list: List[str] = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外围设备Id数组
        self.peripheral_id_list = peripheral_id_list
        # 场景码
        self.scene = scene

    def validate(self):
        self.validate_required(self.peripheral_id_list, 'peripheral_id_list')
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
        if self.peripheral_id_list is not None:
            result['peripheral_id_list'] = self.peripheral_id_list
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('peripheral_id_list') is not None:
            self.peripheral_id_list = m.get('peripheral_id_list')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class GetDistributedeviceByperipheralidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        distribute_device_list: List[DistributeDevice] = None,
        miss_peripheral_id_list: List[str] = None,
        success_peripheral_id_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行设备信息数组
        self.distribute_device_list = distribute_device_list
        # 发行设备信息不存在的外围设备ID集合
        self.miss_peripheral_id_list = miss_peripheral_id_list
        # 获取外围设备信息成功的外围设备ID集合
        self.success_peripheral_id_list = success_peripheral_id_list

    def validate(self):
        if self.distribute_device_list:
            for k in self.distribute_device_list:
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
        result['distribute_device_list'] = []
        if self.distribute_device_list is not None:
            for k in self.distribute_device_list:
                result['distribute_device_list'].append(k.to_map() if k else None)
        if self.miss_peripheral_id_list is not None:
            result['miss_peripheral_id_list'] = self.miss_peripheral_id_list
        if self.success_peripheral_id_list is not None:
            result['success_peripheral_id_list'] = self.success_peripheral_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.distribute_device_list = []
        if m.get('distribute_device_list') is not None:
            for k in m.get('distribute_device_list'):
                temp_model = DistributeDevice()
                self.distribute_device_list.append(temp_model.from_map(k))
        if m.get('miss_peripheral_id_list') is not None:
            self.miss_peripheral_id_list = m.get('miss_peripheral_id_list')
        if m.get('success_peripheral_id_list') is not None:
            self.success_peripheral_id_list = m.get('success_peripheral_id_list')
        return self


class CreateDistributedeviceBydeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        data_model_id: str = None,
        scene: str = None,
        content: str = None,
        signature: str = None,
        sdk_id: str = None,
        device_type_code: int = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
        device_name: str = None,
        owner: str = None,
        owner_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备Id
        # 
        self.device_id = device_id
        # 设备数据模型Id
        # 
        # 
        self.data_model_id = data_model_id
        # 场景码
        # 
        # 
        self.scene = scene
        # 设备注册信息
        # 
        # 
        self.content = content
        # 签名
        # 
        # 
        self.signature = signature
        # sdk版本号
        # 
        # 
        self.sdk_id = sdk_id
        # 设备类型编码，必填，对应资管平台中的设备类型
        # 
        # 枚举值：
        # 
        # 车辆 1000
        # 车辆 四轮车 1001
        # 车辆 四轮车 纯电四轮车 1002
        # 车辆 四轮车 混动四轮车 1003
        # 车辆 四轮车 燃油四轮车 1004
        # 车辆 两轮车 1011
        # 车辆 两轮车 两轮单车 1012
        # 车辆 两轮车 两轮助力车 1013
        # 
        # 换电柜 2000
        # 换电柜 二轮车换电柜 2001
        # 
        # 电池 3000
        # 电池 磷酸铁电池 3001
        # 电池 三元锂电池 3002
        # 
        # 回收设备 4000
        # 
        # 垃圾分类回收 4001
        # 
        # 洗车机 5000
        # 
        # 通用计算设备	                6000
        # 移动设备		        6001
        # 智能手机	        6002
        # 工业掌机	        6003
        # 平板电脑	        6004
        # 云设备		        6011
        # 云计算服务器	6012
        self.device_type_code = device_type_code
        # 设备单价 单位：分
        self.initial_price = initial_price
        # 出厂时间
        self.factory_time = factory_time
        # 投放时间
        self.release_time = release_time
        # 设备型号
        self.device_name = device_name
        # 资产所有人标识（统一社会信用代码）
        self.owner = owner
        # 资产所有人名称
        self.owner_name = owner_name

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.data_model_id, 'data_model_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.content, 'content')
        self.validate_required(self.signature, 'signature')
        self.validate_required(self.sdk_id, 'sdk_id')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.device_name, 'device_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        if self.scene is not None:
            result['scene'] = self.scene
        if self.content is not None:
            result['content'] = self.content
        if self.signature is not None:
            result['signature'] = self.signature
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
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.owner is not None:
            result['owner'] = self.owner
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
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
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        return self


class CreateDistributedeviceBydeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chain_deviceid: str = None,
        distribute_device_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链上设备Id
        # 
        # 
        self.chain_deviceid = chain_deviceid
        # 发行设备Id
        # 
        # 
        self.distribute_device_id = distribute_device_id

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
        if self.chain_deviceid is not None:
            result['chain_deviceid'] = self.chain_deviceid
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chain_deviceid') is not None:
            self.chain_deviceid = m.get('chain_deviceid')
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        return self


class CreateTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        cmd: str = None,
        extra: str = None,
        scene: str = None,
        device_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备Id
        # 
        # 
        self.device_id = device_id
        # 远程命令
        # 
        # 
        self.cmd = cmd
        # 附加信息
        # 
        # 
        self.extra = extra
        # 场景码
        # 
        # 
        self.scene = scene
        # 设备类型
        self.device_type = device_type

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.cmd, 'cmd')
        self.validate_required(self.extra, 'extra')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.device_type, 'device_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.cmd is not None:
            result['cmd'] = self.cmd
        if self.extra is not None:
            result['extra'] = self.extra
        if self.scene is not None:
            result['scene'] = self.scene
        if self.device_type is not None:
            result['device_type'] = self.device_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('cmd') is not None:
            self.cmd = m.get('cmd')
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        return self


class CreateTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务Id
        # 
        # 
        self.task_id = task_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务Id
        # 
        # 
        self.task_id = task_id
        # 场景码
        # 
        # 
        self.scene = scene

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class QueryTaskResponse(TeaModel):
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
        # 任务状态
        # 
        # 
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


class QueryAnalysisRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dis_id_list: List[str] = None,
        time: str = None,
        scene: str = None,
        scope: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发行设备Id集合
        # 
        # 
        self.dis_id_list = dis_id_list
        # 时间，格式YYYYMMDD
        # 
        # 
        self.time = time
        # 场景码
        self.scene = scene
        # SCENE : 场景设备资产分析   DEVICE：设备分析 BIZ：订单分析   ， 默认为DEVICE
        self.scope = scope

    def validate(self):
        self.validate_required(self.time, 'time')
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
        if self.dis_id_list is not None:
            result['dis_id_list'] = self.dis_id_list
        if self.time is not None:
            result['time'] = self.time
        if self.scene is not None:
            result['scene'] = self.scene
        if self.scope is not None:
            result['scope'] = self.scope
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dis_id_list') is not None:
            self.dis_id_list = m.get('dis_id_list')
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('scope') is not None:
            self.scope = m.get('scope')
        return self


class QueryAnalysisResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分析数据，根据不同场景的不同json串
        self.result_list = result_list

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
        if self.result_list is not None:
            result['result_list'] = self.result_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_list') is not None:
            self.result_list = m.get('result_list')
        return self


class SendCollectorBychainidmulRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: List[CollectContent] = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 上传数据
        # 
        # 
        self.content = content
        # 随机业务号，防重放
        # 
        # 
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.content, 'content')
        if self.content:
            for k in self.content:
                if k:
                    k.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['content'] = []
        if self.content is not None:
            for k in self.content:
                result['content'].append(k.to_map() if k else None)
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.content = []
        if m.get('content') is not None:
            for k in m.get('content'):
                temp_model = CollectContent()
                self.content.append(temp_model.from_map(k))
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class SendCollectorBychainidmulResponse(TeaModel):
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


class SendCollectorDevicebizdataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_model_id: str = None,
        nonce: str = None,
        content: List[BizContentGroup] = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据模型Id
        # 
        # 
        self.data_model_id = data_model_id
        # 业务号，防重放
        # 
        # 
        self.nonce = nonce
        # 上传数据
        self.content = content
        # 场景码，与content中的chainDeviceId至少有一个不为空
        self.scene = scene

    def validate(self):
        self.validate_required(self.data_model_id, 'data_model_id')
        self.validate_required(self.nonce, 'nonce')
        self.validate_required(self.content, 'content')
        if self.content:
            for k in self.content:
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
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        if self.nonce is not None:
            result['nonce'] = self.nonce
        result['content'] = []
        if self.content is not None:
            for k in self.content:
                result['content'].append(k.to_map() if k else None)
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        self.content = []
        if m.get('content') is not None:
            for k in m.get('content'):
                temp_model = BizContentGroup()
                self.content.append(temp_model.from_map(k))
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class SendCollectorDevicebizdataResponse(TeaModel):
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


class UpdateDeviceInfobydeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        data_model_id: str = None,
        scene: str = None,
        sdk_id: str = None,
        content: str = None,
        signature: str = None,
        device_type_code: int = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
        device_name: str = None,
        device_feature: str = None,
        extra_info: str = None,
        owner: str = None,
        owner_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备Id
        self.device_id = device_id
        # 设备数据模型Id
        # 
        # 
        self.data_model_id = data_model_id
        # 场景码
        # 
        # 
        self.scene = scene
        # sdk版本号
        # 
        # 
        self.sdk_id = sdk_id
        # 设备注册信息
        # 
        # 
        self.content = content
        # 签名
        self.signature = signature
        # 设备类型编码，必填，对应资管平台中的设备类型
        # 
        # 枚举值：
        # 
        # 车辆 1000
        # 车辆 四轮车 1001
        # 车辆 四轮车 纯电四轮车 1002
        # 车辆 四轮车 混动四轮车 1003
        # 车辆 四轮车 燃油四轮车 1004
        # 车辆 两轮车 1011
        # 车辆 两轮车 两轮单车 1012
        # 车辆 两轮车 两轮助力车 1013
        # 
        # 换电柜 2000
        # 换电柜 二轮车换电柜 2001
        # 
        # 电池 3000
        # 电池 磷酸铁电池 3001
        # 电池 三元锂电池 3002
        # 
        # 回收设备 4000
        # 
        # 垃圾分类回收 4001
        # 
        # 洗车机 5000
        # 
        # 通用计算设备	                6000
        # 移动设备		        6001
        # 智能手机	        6002
        # 工业掌机	        6003
        # 平板电脑	        6004
        # 云设备		        6011
        # 云计算服务器	6012
        self.device_type_code = device_type_code
        # 设备单价 单位：分
        self.initial_price = initial_price
        # 出厂时间
        # 
        self.factory_time = factory_time
        # 投放时间
        # 
        self.release_time = release_time
        # 设备型号
        self.device_name = device_name
        # 设备上报数据是否需要验签，取值范围（RAW_DATA、SIGNED_DATA），
        # SIGNED_DATA：需要验签
        # RAW_DATA：不需要验签
        self.device_feature = device_feature
        # 额外信息
        self.extra_info = extra_info
        # 资产所有人标识（统一社会信用代码）
        self.owner = owner
        # 资产所有人名称
        self.owner_name = owner_name

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.data_model_id, 'data_model_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.sdk_id, 'sdk_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.signature, 'signature')
        self.validate_required(self.device_type_code, 'device_type_code')
        self.validate_required(self.initial_price, 'initial_price')
        self.validate_required(self.factory_time, 'factory_time')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.release_time, 'release_time')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        if self.scene is not None:
            result['scene'] = self.scene
        if self.sdk_id is not None:
            result['sdk_id'] = self.sdk_id
        if self.content is not None:
            result['content'] = self.content
        if self.signature is not None:
            result['signature'] = self.signature
        if self.device_type_code is not None:
            result['device_type_code'] = self.device_type_code
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.device_feature is not None:
            result['device_feature'] = self.device_feature
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.owner is not None:
            result['owner'] = self.owner
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('sdk_id') is not None:
            self.sdk_id = m.get('sdk_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('device_type_code') is not None:
            self.device_type_code = m.get('device_type_code')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('device_feature') is not None:
            self.device_feature = m.get('device_feature')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        return self


class UpdateDeviceInfobydeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chain_device_id: str = None,
        distribute_device_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链上设备Id
        # 
        # 
        self.chain_device_id = chain_device_id
        # 发行设备Id
        # 
        # 
        self.distribute_device_id = distribute_device_id

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
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.distribute_device_id is not None:
            result['distribute_device_id'] = self.distribute_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('distribute_device_id') is not None:
            self.distribute_device_id = m.get('distribute_device_id')
        return self


class OfflineDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备链上Id
        # 
        # 
        self.chain_device_id = chain_device_id

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        return self


class OfflineDeviceResponse(TeaModel):
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


class ApplyMqtokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        device_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene = scene
        # 设备ID
        self.device_id = device_id

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.device_id, 'device_id')

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
        if self.device_id is not None:
            result['device_id'] = self.device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        return self


class ApplyMqtokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        token: str = None,
        access_key: str = None,
        instance_id: str = None,
        sub_topic: str = None,
        pub_topic: str = None,
        group_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 服务端返回的Token值，用于阿里云 MQTT连接
        self.token = token
        # 接入阿里云LMQ的所需的accessKey
        self.access_key = access_key
        # mqtt的instanceId
        self.instance_id = instance_id
        # mqtt的topic
        self.sub_topic = sub_topic
        # mqtt的topic
        self.pub_topic = pub_topic
        # mqtt的groupId
        self.group_id = group_id

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
        if self.token is not None:
            result['token'] = self.token
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.sub_topic is not None:
            result['sub_topic'] = self.sub_topic
        if self.pub_topic is not None:
            result['pub_topic'] = self.pub_topic
        if self.group_id is not None:
            result['group_id'] = self.group_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('sub_topic') is not None:
            self.sub_topic = m.get('sub_topic')
        if m.get('pub_topic') is not None:
            self.pub_topic = m.get('pub_topic')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        return self


class QueryDeviceRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        scene: str = None,
        device_public_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备Id，由接入方提供，场景内唯一
        self.device_id = device_id
        # 场景号
        self.scene = scene
        # 可信根派生公钥
        self.device_public_key = device_public_key

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.device_public_key, 'device_public_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.scene is not None:
            result['scene'] = self.scene
        if self.device_public_key is not None:
            result['device_public_key'] = self.device_public_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('device_public_key') is not None:
            self.device_public_key = m.get('device_public_key')
        return self


class QueryDeviceRegistrationResponse(TeaModel):
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


class AddAbnormalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        scene: str = None,
        abnormal_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备Id，由接入方提供，场景内唯一
        self.device_id = device_id
        # 场景号
        self.scene = scene
        # 异常类型编码KEY_NOT_FOUND、DEVICE_ID_MISMATCH 等
        self.abnormal_code = abnormal_code

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.abnormal_code, 'abnormal_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.scene is not None:
            result['scene'] = self.scene
        if self.abnormal_code is not None:
            result['abnormal_code'] = self.abnormal_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('abnormal_code') is not None:
            self.abnormal_code = m.get('abnormal_code')
        return self


class AddAbnormalResponse(TeaModel):
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


class OnlineDeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备链上ID
        self.chain_device_id = chain_device_id

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        return self


class OnlineDeviceResponse(TeaModel):
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


class OfflineDeviceByunregisterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 通过链上设备ID注销设备
        self.chain_device_id = chain_device_id

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        return self


class OfflineDeviceByunregisterResponse(TeaModel):
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


class QueryLabelTraceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        label_id: str = None,
        label_status: str = None,
        asset_id: str = None,
        operator: str = None,
        owner: str = None,
        process: str = None,
        action: str = None,
        start_time: str = None,
        end_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码 , 使用asset_id 查询时，scene也必须传入
        self.scene = scene
        # 标签Id
        self.label_id = label_id
        # 标签状态
        self.label_status = label_status
        # 资产Id
        self.asset_id = asset_id
        # 操作员
        self.operator = operator
        # 标签拥有者
        self.owner = owner
        # 标签所处流程
        self.process = process
        # 标签操作
        self.action = action
        # 开始时间
        self.start_time = start_time
        # 结束时间
        self.end_time = end_time

    def validate(self):
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.label_id is not None:
            result['label_id'] = self.label_id
        if self.label_status is not None:
            result['label_status'] = self.label_status
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.owner is not None:
            result['owner'] = self.owner
        if self.process is not None:
            result['process'] = self.process
        if self.action is not None:
            result['action'] = self.action
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('label_id') is not None:
            self.label_id = m.get('label_id')
        if m.get('label_status') is not None:
            self.label_status = m.get('label_status')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('process') is not None:
            self.process = m.get('process')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class QueryLabelTraceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        label_trace_list: List[LabelTrace] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 标签流转历史
        self.label_trace_list = label_trace_list

    def validate(self):
        if self.label_trace_list:
            for k in self.label_trace_list:
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
        result['label_trace_list'] = []
        if self.label_trace_list is not None:
            for k in self.label_trace_list:
                result['label_trace_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.label_trace_list = []
        if m.get('label_trace_list') is not None:
            for k in m.get('label_trace_list'):
                temp_model = LabelTrace()
                self.label_trace_list.append(temp_model.from_map(k))
        return self


class SyncLabelTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        collect_label_content_list: List[CollectLabelContent] = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene = scene
        # 收集标签数据
        self.collect_label_content_list = collect_label_content_list
        # 业务号
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.collect_label_content_list, 'collect_label_content_list')
        if self.collect_label_content_list:
            for k in self.collect_label_content_list:
                if k:
                    k.validate()
        self.validate_required(self.nonce, 'nonce')

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
        result['collect_label_content_list'] = []
        if self.collect_label_content_list is not None:
            for k in self.collect_label_content_list:
                result['collect_label_content_list'].append(k.to_map() if k else None)
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        self.collect_label_content_list = []
        if m.get('collect_label_content_list') is not None:
            for k in m.get('collect_label_content_list'):
                temp_model = CollectLabelContent()
                self.collect_label_content_list.append(temp_model.from_map(k))
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class SyncLabelTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_list: List[LabelChainResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 标签上链hash返回
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
                temp_model = LabelChainResult()
                self.result_list.append(temp_model.from_map(k))
        return self


class AddLabelAssetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        label_id: str = None,
        asset_id: str = None,
        device_type_code: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene = scene
        # 标签Id
        self.label_id = label_id
        # 资产Id
        self.asset_id = asset_id
        # 资产对应的设备类型码，对应资管平台中的设备类型
        self.device_type_code = device_type_code

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.label_id, 'label_id')
        self.validate_required(self.asset_id, 'asset_id')

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
        if self.label_id is not None:
            result['label_id'] = self.label_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.device_type_code is not None:
            result['device_type_code'] = self.device_type_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('label_id') is not None:
            self.label_id = m.get('label_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('device_type_code') is not None:
            self.device_type_code = m.get('device_type_code')
        return self


class AddLabelAssetResponse(TeaModel):
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


class QueryDataBytxhashRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        tx_hash: str = None,
        contract_method: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene = scene
        # 链上交易hash
        self.tx_hash = tx_hash
        # 上链类型枚举：
        # REGISTER_DEVICE	设备注册
        # DISTRIBUTE_DEVICE	设备发行
        # LABEL_DATA	标签流转数据收集
        # COLLECT_DATA	设备数据收集
        # DEVICE_BIZ_DATA	设备业务订单数据收集
        # REGISTER_PERIPHERAL_DEVICE	外围设备注册
        self.contract_method = contract_method

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.contract_method, 'contract_method')

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.contract_method is not None:
            result['contract_method'] = self.contract_method
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('contract_method') is not None:
            self.contract_method = m.get('contract_method')
        return self


class QueryDataBytxhashResponse(TeaModel):
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
        # 返回信息
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


class ExecUnprocessedTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        action: str = None,
        params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id
        # 任务名称枚举
        # confirm_device_state : 确认设备状态变更
        self.action = action
        # 任务参数
        self.params = params

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.action, 'action')
        self.validate_required(self.params, 'params')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.action is not None:
            result['action'] = self.action
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class ExecUnprocessedTaskResponse(TeaModel):
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


class SendCollectorSummarydataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        biz_type: str = None,
        submit_date: str = None,
        data_model_id: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 汇总所属的场景码
        self.scene = scene
        # 汇总的业务类型，同一个scene下可以有不同的业务类型，此字段用于区分业务类型
        self.biz_type = biz_type
        # 提交日期（汇总所属的日期）
        self.submit_date = submit_date
        # 汇总数据的数据模型ID
        self.data_model_id = data_model_id
        # 汇总数据的内容，格式遵循data_model_id制定的格式
        self.content = content

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.submit_date, 'submit_date')
        self.validate_required(self.data_model_id, 'data_model_id')
        self.validate_required(self.content, 'content')

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
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.submit_date is not None:
            result['submit_date'] = self.submit_date
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('submit_date') is not None:
            self.submit_date = m.get('submit_date')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class SendCollectorSummarydataResponse(TeaModel):
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


class AddCertificateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        organization_id: int = None,
        certificate: str = None,
        device_id: str = None,
        host_device_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 机构Id
        self.organization_id = organization_id
        # 证书内容
        self.certificate = certificate
        # 设备ID
        self.device_id = device_id
        # 主机设备ID
        self.host_device_id = host_device_id
        # 场景码
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.certificate, 'certificate')
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.host_device_id, 'host_device_id')
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.organization_id is not None:
            result['organization_id'] = self.organization_id
        if self.certificate is not None:
            result['certificate'] = self.certificate
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.host_device_id is not None:
            result['host_device_id'] = self.host_device_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('organization_id') is not None:
            self.organization_id = m.get('organization_id')
        if m.get('certificate') is not None:
            self.certificate = m.get('certificate')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('host_device_id') is not None:
            self.host_device_id = m.get('host_device_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class AddCertificateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_data: str = None,
        platform_signature: str = None,
        success: bool = None,
        error_code: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 原始数据
        self.raw_data = raw_data
        # 对raw_data的签名
        self.platform_signature = platform_signature
        # 执行结果成功与否
        self.success = success
        # 错误码
        self.error_code = error_code

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
        if self.raw_data is not None:
            result['raw_data'] = self.raw_data
        if self.platform_signature is not None:
            result['platform_signature'] = self.platform_signature
        if self.success is not None:
            result['success'] = self.success
        if self.error_code is not None:
            result['error_code'] = self.error_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_data') is not None:
            self.raw_data = m.get('raw_data')
        if m.get('platform_signature') is not None:
            self.platform_signature = m.get('platform_signature')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        return self


class AddTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_name: str = None,
        org_name: str = None,
        owner: str = None,
        gateway_private_key: str = None,
        gateway_public_key: str = None,
        generate_gateway_keys: bool = None,
        mock: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户
        self.tenant_name = tenant_name
        # 组织名称
        self.org_name = org_name
        # 企业执照号
        self.owner = owner
        # 网关私钥
        self.gateway_private_key = gateway_private_key
        # 网关公钥
        self.gateway_public_key = gateway_public_key
        # 是否需要生成秘钥对，默认为false
        self.generate_gateway_keys = generate_gateway_keys
        # 是否为测试租户
        self.mock = mock

    def validate(self):
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.org_name, 'org_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.owner is not None:
            result['owner'] = self.owner
        if self.gateway_private_key is not None:
            result['gateway_private_key'] = self.gateway_private_key
        if self.gateway_public_key is not None:
            result['gateway_public_key'] = self.gateway_public_key
        if self.generate_gateway_keys is not None:
            result['generate_gateway_keys'] = self.generate_gateway_keys
        if self.mock is not None:
            result['mock'] = self.mock
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('gateway_private_key') is not None:
            self.gateway_private_key = m.get('gateway_private_key')
        if m.get('gateway_public_key') is not None:
            self.gateway_public_key = m.get('gateway_public_key')
        if m.get('generate_gateway_keys') is not None:
            self.generate_gateway_keys = m.get('generate_gateway_keys')
        if m.get('mock') is not None:
            self.mock = m.get('mock')
        return self


class AddTenantResponse(TeaModel):
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


class AddSceneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_name: str = None,
        escrowed: str = None,
        private_key_password: str = None,
        tenant_name: str = None,
        scene_type: str = None,
        mock: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景名称
        self.scene_name = scene_name
        # 是否托管,取值范围为：NON_ESCROWED、ESCROWED
        self.escrowed = escrowed
        # 私钥密码
        self.private_key_password = private_key_password
        # 租户
        self.tenant_name = tenant_name
        # 场景类型
        self.scene_type = scene_type
        # 是否为测试数据
        self.mock = mock

    def validate(self):
        self.validate_required(self.scene_name, 'scene_name')
        self.validate_required(self.escrowed, 'escrowed')
        self.validate_required(self.private_key_password, 'private_key_password')
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.scene_type, 'scene_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_name is not None:
            result['scene_name'] = self.scene_name
        if self.escrowed is not None:
            result['escrowed'] = self.escrowed
        if self.private_key_password is not None:
            result['private_key_password'] = self.private_key_password
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.scene_type is not None:
            result['scene_type'] = self.scene_type
        if self.mock is not None:
            result['mock'] = self.mock
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_name') is not None:
            self.scene_name = m.get('scene_name')
        if m.get('escrowed') is not None:
            self.escrowed = m.get('escrowed')
        if m.get('private_key_password') is not None:
            self.private_key_password = m.get('private_key_password')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('scene_type') is not None:
            self.scene_type = m.get('scene_type')
        if m.get('mock') is not None:
            self.mock = m.get('mock')
        return self


class AddSceneResponse(TeaModel):
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


class DeploySceneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_name: str = None,
        bnaas_basic_service_did: str = None,
        baas_rest_biz_id: str = None,
        contract_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景名称
        self.scene_name = scene_name
        # bnaas did
        self.bnaas_basic_service_did = bnaas_basic_service_did
        # baas rest bizId
        self.baas_rest_biz_id = baas_rest_biz_id
        # 合约版本号
        self.contract_version = contract_version

    def validate(self):
        self.validate_required(self.scene_name, 'scene_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_name is not None:
            result['scene_name'] = self.scene_name
        if self.bnaas_basic_service_did is not None:
            result['bnaas_basic_service_did'] = self.bnaas_basic_service_did
        if self.baas_rest_biz_id is not None:
            result['baas_rest_biz_id'] = self.baas_rest_biz_id
        if self.contract_version is not None:
            result['contract_version'] = self.contract_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_name') is not None:
            self.scene_name = m.get('scene_name')
        if m.get('bnaas_basic_service_did') is not None:
            self.bnaas_basic_service_did = m.get('bnaas_basic_service_did')
        if m.get('baas_rest_biz_id') is not None:
            self.baas_rest_biz_id = m.get('baas_rest_biz_id')
        if m.get('contract_version') is not None:
            self.contract_version = m.get('contract_version')
        return self


class DeploySceneResponse(TeaModel):
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


class AddSdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        verify_key: str = None,
        sdk_version_str: str = None,
        meta_model: str = None,
        platform: str = None,
        corp_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备SDK公钥
        self.verify_key = verify_key
        # SDK版本号
        self.sdk_version_str = sdk_version_str
        # sdk模型，格式为json
        self.meta_model = meta_model
        # 平台
        self.platform = platform
        # 公司名称
        self.corp_name = corp_name

    def validate(self):
        self.validate_required(self.verify_key, 'verify_key')
        self.validate_required(self.sdk_version_str, 'sdk_version_str')
        self.validate_required(self.meta_model, 'meta_model')
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
        if self.verify_key is not None:
            result['verify_key'] = self.verify_key
        if self.sdk_version_str is not None:
            result['sdk_version_str'] = self.sdk_version_str
        if self.meta_model is not None:
            result['meta_model'] = self.meta_model
        if self.platform is not None:
            result['platform'] = self.platform
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('verify_key') is not None:
            self.verify_key = m.get('verify_key')
        if m.get('sdk_version_str') is not None:
            self.sdk_version_str = m.get('sdk_version_str')
        if m.get('meta_model') is not None:
            self.meta_model = m.get('meta_model')
        if m.get('platform') is not None:
            self.platform = m.get('platform')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        return self


class AddSdkResponse(TeaModel):
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


class UpdateSdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        verify_key: str = None,
        sdk_version_str: str = None,
        meta_model: str = None,
        platform: str = None,
        corp_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主键id
        self.id = id
        # 设备SDK公钥
        self.verify_key = verify_key
        # SDK版本号
        self.sdk_version_str = sdk_version_str
        # sdk模型，格式为json
        self.meta_model = meta_model
        # 平台
        self.platform = platform
        # 公司名称
        # 
        self.corp_name = corp_name

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.verify_key is not None:
            result['verify_key'] = self.verify_key
        if self.sdk_version_str is not None:
            result['sdk_version_str'] = self.sdk_version_str
        if self.meta_model is not None:
            result['meta_model'] = self.meta_model
        if self.platform is not None:
            result['platform'] = self.platform
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('verify_key') is not None:
            self.verify_key = m.get('verify_key')
        if m.get('sdk_version_str') is not None:
            self.sdk_version_str = m.get('sdk_version_str')
        if m.get('meta_model') is not None:
            self.meta_model = m.get('meta_model')
        if m.get('platform') is not None:
            self.platform = m.get('platform')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        return self


class UpdateSdkResponse(TeaModel):
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


class AddProductkeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_key: str = None,
        scene: str = None,
        tenant_name: str = None,
        data_model_id: str = None,
        sdk_version_prefix: str = None,
        manufacturer: str = None,
        customer: str = None,
        mock: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备端productKey
        self.product_key = product_key
        # 场景码
        self.scene = scene
        # 租户ID
        self.tenant_name = tenant_name
        # 数据模型
        self.data_model_id = data_model_id
        # sdk前缀
        self.sdk_version_prefix = sdk_version_prefix
        # 制造商
        self.manufacturer = manufacturer
        # 顾客
        self.customer = customer
        # 是否为测试数据
        self.mock = mock

    def validate(self):
        self.validate_required(self.product_key, 'product_key')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.data_model_id, 'data_model_id')
        self.validate_required(self.sdk_version_prefix, 'sdk_version_prefix')
        self.validate_required(self.manufacturer, 'manufacturer')
        self.validate_required(self.customer, 'customer')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_key is not None:
            result['product_key'] = self.product_key
        if self.scene is not None:
            result['scene'] = self.scene
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        if self.sdk_version_prefix is not None:
            result['sdk_version_prefix'] = self.sdk_version_prefix
        if self.manufacturer is not None:
            result['manufacturer'] = self.manufacturer
        if self.customer is not None:
            result['customer'] = self.customer
        if self.mock is not None:
            result['mock'] = self.mock
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_key') is not None:
            self.product_key = m.get('product_key')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        if m.get('sdk_version_prefix') is not None:
            self.sdk_version_prefix = m.get('sdk_version_prefix')
        if m.get('manufacturer') is not None:
            self.manufacturer = m.get('manufacturer')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('mock') is not None:
            self.mock = m.get('mock')
        return self


class AddProductkeyResponse(TeaModel):
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


class UpdateProductkeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        product_key: str = None,
        scene: str = None,
        tenant_name: str = None,
        data_model_id: str = None,
        sdk_version_prefix: str = None,
        manufacturer: str = None,
        customer: str = None,
        mock: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主键id
        self.id = id
        # 设备端productKey
        # 
        self.product_key = product_key
        # 场景码
        # 
        self.scene = scene
        # 租户ID
        # 
        self.tenant_name = tenant_name
        # 数据模型
        # 
        self.data_model_id = data_model_id
        # sdk前缀
        self.sdk_version_prefix = sdk_version_prefix
        # 制造商
        # 
        self.manufacturer = manufacturer
        # 顾客
        self.customer = customer
        # 是否为测试数据
        self.mock = mock

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.product_key is not None:
            result['product_key'] = self.product_key
        if self.scene is not None:
            result['scene'] = self.scene
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        if self.sdk_version_prefix is not None:
            result['sdk_version_prefix'] = self.sdk_version_prefix
        if self.manufacturer is not None:
            result['manufacturer'] = self.manufacturer
        if self.customer is not None:
            result['customer'] = self.customer
        if self.mock is not None:
            result['mock'] = self.mock
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('product_key') is not None:
            self.product_key = m.get('product_key')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        if m.get('sdk_version_prefix') is not None:
            self.sdk_version_prefix = m.get('sdk_version_prefix')
        if m.get('manufacturer') is not None:
            self.manufacturer = m.get('manufacturer')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('mock') is not None:
            self.mock = m.get('mock')
        return self


class UpdateProductkeyResponse(TeaModel):
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


class UpdateTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        tenant_name: str = None,
        org_name: str = None,
        owner: str = None,
        gateway_private_key: str = None,
        gateway_public_key: str = None,
        mock: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主键Id
        self.id = id
        # 租户
        self.tenant_name = tenant_name
        # 组织名称
        self.org_name = org_name
        # 企业执照号
        # 
        self.owner = owner
        # 网关私钥
        # 
        self.gateway_private_key = gateway_private_key
        # 网关公钥
        # 
        self.gateway_public_key = gateway_public_key
        # 是否为测试租户
        self.mock = mock

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.owner is not None:
            result['owner'] = self.owner
        if self.gateway_private_key is not None:
            result['gateway_private_key'] = self.gateway_private_key
        if self.gateway_public_key is not None:
            result['gateway_public_key'] = self.gateway_public_key
        if self.mock is not None:
            result['mock'] = self.mock
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('gateway_private_key') is not None:
            self.gateway_private_key = m.get('gateway_private_key')
        if m.get('gateway_public_key') is not None:
            self.gateway_public_key = m.get('gateway_public_key')
        if m.get('mock') is not None:
            self.mock = m.get('mock')
        return self


class UpdateTenantResponse(TeaModel):
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


class UpdateSceneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        skip_pegasus: bool = None,
        scene_name: str = None,
        tenant_name: str = None,
        scene_type: str = None,
        customer_processor: str = None,
        mock: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主键Id
        self.id = id
        # 是否跳过中台数据校验处理
        self.skip_pegasus = skip_pegasus
        # 场景名称
        # 
        self.scene_name = scene_name
        # 租户
        # 
        self.tenant_name = tenant_name
        # 场景类型
        # 
        self.scene_type = scene_type
        # 定制数据处理类 , 使用用逗号分隔
        self.customer_processor = customer_processor
        # 是否为测试数据
        self.mock = mock

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.skip_pegasus, 'skip_pegasus')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.skip_pegasus is not None:
            result['skip_pegasus'] = self.skip_pegasus
        if self.scene_name is not None:
            result['scene_name'] = self.scene_name
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.scene_type is not None:
            result['scene_type'] = self.scene_type
        if self.customer_processor is not None:
            result['customer_processor'] = self.customer_processor
        if self.mock is not None:
            result['mock'] = self.mock
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('skip_pegasus') is not None:
            self.skip_pegasus = m.get('skip_pegasus')
        if m.get('scene_name') is not None:
            self.scene_name = m.get('scene_name')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('scene_type') is not None:
            self.scene_type = m.get('scene_type')
        if m.get('customer_processor') is not None:
            self.customer_processor = m.get('customer_processor')
        if m.get('mock') is not None:
            self.mock = m.get('mock')
        return self


class UpdateSceneResponse(TeaModel):
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


class SendLabelTransferonasyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        collect_label_content_list: List[CollectLabelContent] = None,
        nonce: str = None,
        response_period: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        # 
        self.scene = scene
        # 收集的标签流转数据
        self.collect_label_content_list = collect_label_content_list
        # 业务号，防重放
        self.nonce = nonce
        # 1 业务端查询结果的最晚时间
        # 2 单位：天，最大值为30 天
        # 3 在responsePeriod 天之后，调用异步接口结果查询 将 无法获取异步接口的执行结果
        self.response_period = response_period

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.collect_label_content_list, 'collect_label_content_list')
        if self.collect_label_content_list:
            for k in self.collect_label_content_list:
                if k:
                    k.validate()
        self.validate_required(self.nonce, 'nonce')
        self.validate_required(self.response_period, 'response_period')

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
        result['collect_label_content_list'] = []
        if self.collect_label_content_list is not None:
            for k in self.collect_label_content_list:
                result['collect_label_content_list'].append(k.to_map() if k else None)
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.response_period is not None:
            result['response_period'] = self.response_period
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        self.collect_label_content_list = []
        if m.get('collect_label_content_list') is not None:
            for k in m.get('collect_label_content_list'):
                temp_model = CollectLabelContent()
                self.collect_label_content_list.append(temp_model.from_map(k))
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('response_period') is not None:
            self.response_period = m.get('response_period')
        return self


class SendLabelTransferonasyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口请求的唯一标识
        self.request_id = request_id

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryAsyncRequestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求的唯一标识
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryAsyncRequestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 执行状态 枚举
        # RUNNING	请求正在处理
        # SUCCESS	请求处理成功
        # FAILED	请求处理失败
        self.status = status
        # 异步接口的执行结果 ：根据同步接口的出参构建的JSON字符串
        self.response = response

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
        if self.response is not None:
            result['response'] = self.response
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
        if m.get('response') is not None:
            self.response = m.get('response')
        return self


class PagequeryTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_index: int = None,
        page_size: int = None,
        tenant_name: str = None,
        mock: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页数，默认1
        self.page_index = page_index
        # 页码大小，默认10，最大100
        self.page_size = page_size
        # 租户
        self.tenant_name = tenant_name
        # 是否为测试数据
        self.mock = mock

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
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
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.mock is not None:
            result['mock'] = self.mock
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('mock') is not None:
            self.mock = m.get('mock')
        return self


class PagequeryTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PermissionedTenantPageResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页查询结果
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
        if m.get('data') is not None:
            temp_model = PermissionedTenantPageResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequerySceneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_index: int = None,
        page_size: int = None,
        scene_name: str = None,
        tenant_name: str = None,
        mock: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页数，默认1
        self.page_index = page_index
        # 页码大小，默认10
        self.page_size = page_size
        # 场景码
        self.scene_name = scene_name
        # 租户
        self.tenant_name = tenant_name
        # 是否为测试数据
        self.mock = mock

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
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
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.scene_name is not None:
            result['scene_name'] = self.scene_name
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.mock is not None:
            result['mock'] = self.mock
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('scene_name') is not None:
            self.scene_name = m.get('scene_name')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('mock') is not None:
            self.mock = m.get('mock')
        return self


class PagequerySceneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ScenePageResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页查询结果
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
        if m.get('data') is not None:
            temp_model = ScenePageResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequerySdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_index: int = None,
        page_size: int = None,
        sdk_version_str: str = None,
        corp_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页数，默认1
        self.page_index = page_index
        # 页码大小，默认10，最大100
        self.page_size = page_size
        # sdk版本号
        self.sdk_version_str = sdk_version_str
        # 公司名称
        self.corp_name = corp_name

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
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
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.sdk_version_str is not None:
            result['sdk_version_str'] = self.sdk_version_str
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('sdk_version_str') is not None:
            self.sdk_version_str = m.get('sdk_version_str')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        return self


class PagequerySdkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SdkPageResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页查询结果
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
        if m.get('data') is not None:
            temp_model = SdkPageResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequeryProductkeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_index: int = None,
        page_size: int = None,
        product_key: str = None,
        scene: str = None,
        tenant_name: str = None,
        mock: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页数，默认1
        self.page_index = page_index
        # 页码大小，默认10，最大100
        self.page_size = page_size
        # 设备端productKey
        self.product_key = product_key
        # 场景码
        # 
        self.scene = scene
        # 租户ID
        # 
        self.tenant_name = tenant_name
        # 是否为测试数据
        self.mock = mock

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
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
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.product_key is not None:
            result['product_key'] = self.product_key
        if self.scene is not None:
            result['scene'] = self.scene
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.mock is not None:
            result['mock'] = self.mock
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('product_key') is not None:
            self.product_key = m.get('product_key')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('mock') is not None:
            self.mock = m.get('mock')
        return self


class PagequeryProductkeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ProductKeyPageResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页查询结果
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
        if m.get('data') is not None:
            temp_model = ProductKeyPageResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequeryDataverifyFailureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_index: int = None,
        page_size: int = None,
        scene: str = None,
        start_date: str = None,
        end_date: str = None,
        device_id: str = None,
        source: int = None,
        type: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页数，默认1
        self.page_index = page_index
        # 页码大小，默认10
        self.page_size = page_size
        # 场景码
        # 
        self.scene = scene
        # 起始查询时间
        self.start_date = start_date
        # 结束查询时间
        self.end_date = end_date
        # 设备ID（模糊查询）
        self.device_id = device_id
        # 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
        self.source = source
        # 类型：0:数据上报;1:数据完整性校验
        self.type = type

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.start_date, 'start_date')
        if self.start_date is not None:
            self.validate_pattern(self.start_date, 'start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_date, 'end_date')
        if self.end_date is not None:
            self.validate_pattern(self.end_date, 'end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.scene is not None:
            result['scene'] = self.scene
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.source is not None:
            result['source'] = self.source
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class PagequeryDataverifyFailureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: DataVerifyFailureDataPageResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据
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
        if m.get('data') is not None:
            temp_model = DataVerifyFailureDataPageResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class AddAlertStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_name: str = None,
        scene: str = None,
        strategy_type: str = None,
        strategy_detail: str = None,
        enabled: bool = None,
        remark: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户
        self.tenant_name = tenant_name
        # 场景码
        self.scene = scene
        # 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
        self.strategy_type = strategy_type
        # 策略详情，json格式
        self.strategy_detail = strategy_detail
        # 是否启用，默认false
        self.enabled = enabled
        # 备注
        self.remark = remark

    def validate(self):
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.strategy_type, 'strategy_type')
        self.validate_required(self.strategy_detail, 'strategy_detail')
        self.validate_required(self.enabled, 'enabled')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.scene is not None:
            result['scene'] = self.scene
        if self.strategy_type is not None:
            result['strategy_type'] = self.strategy_type
        if self.strategy_detail is not None:
            result['strategy_detail'] = self.strategy_detail
        if self.enabled is not None:
            result['enabled'] = self.enabled
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('strategy_type') is not None:
            self.strategy_type = m.get('strategy_type')
        if m.get('strategy_detail') is not None:
            self.strategy_detail = m.get('strategy_detail')
        if m.get('enabled') is not None:
            self.enabled = m.get('enabled')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class AddAlertStrategyResponse(TeaModel):
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


class UpdateAlertStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        tenant_name: str = None,
        scene: str = None,
        strategy_type: str = None,
        strategy_detail: str = None,
        enabled: bool = None,
        remark: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主键ID，更新依据
        self.id = id
        # 租户
        self.tenant_name = tenant_name
        # 场景码
        # 
        self.scene = scene
        # 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
        self.strategy_type = strategy_type
        # 策略详情，json格式
        self.strategy_detail = strategy_detail
        # 是否启用，默认false
        self.enabled = enabled
        # 备注
        # 
        self.remark = remark

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.enabled, 'enabled')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.scene is not None:
            result['scene'] = self.scene
        if self.strategy_type is not None:
            result['strategy_type'] = self.strategy_type
        if self.strategy_detail is not None:
            result['strategy_detail'] = self.strategy_detail
        if self.enabled is not None:
            result['enabled'] = self.enabled
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('strategy_type') is not None:
            self.strategy_type = m.get('strategy_type')
        if m.get('strategy_detail') is not None:
            self.strategy_detail = m.get('strategy_detail')
        if m.get('enabled') is not None:
            self.enabled = m.get('enabled')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class UpdateAlertStrategyResponse(TeaModel):
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


class PagequeryAlertStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_index: int = None,
        page_size: int = None,
        tenant_name: str = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页数，默认1
        self.page_index = page_index
        # 页码大小，默认10
        self.page_size = page_size
        # 租户
        self.tenant_name = tenant_name
        # 场景码
        # 
        self.scene = scene

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
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
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class PagequeryAlertStrategyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AlertStrategyPageResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据
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
        if m.get('data') is not None:
            temp_model = AlertStrategyPageResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class SyncLabelTransferrawRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        collect_label_raw_content_list: List[CollectLabelRawContent] = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        # 
        self.scene = scene
        # 收集标签数据
        self.collect_label_raw_content_list = collect_label_raw_content_list
        # 业务号
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.collect_label_raw_content_list, 'collect_label_raw_content_list')
        if self.collect_label_raw_content_list:
            for k in self.collect_label_raw_content_list:
                if k:
                    k.validate()
        self.validate_required(self.nonce, 'nonce')

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
        result['collect_label_raw_content_list'] = []
        if self.collect_label_raw_content_list is not None:
            for k in self.collect_label_raw_content_list:
                result['collect_label_raw_content_list'].append(k.to_map() if k else None)
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        self.collect_label_raw_content_list = []
        if m.get('collect_label_raw_content_list') is not None:
            for k in m.get('collect_label_raw_content_list'):
                temp_model = CollectLabelRawContent()
                self.collect_label_raw_content_list.append(temp_model.from_map(k))
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class SyncLabelTransferrawResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_list: List[LabelChainResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 标签上链hash返回
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
                temp_model = LabelChainResult()
                self.result_list.append(temp_model.from_map(k))
        return self


class SendLabelTransferrawonasyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        collect_label_raw_content_list: List[CollectLabelRawContent] = None,
        nonce: str = None,
        response_period: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        # 
        self.scene = scene
        # 收集的标签流转数据
        self.collect_label_raw_content_list = collect_label_raw_content_list
        # 业务号，防重放
        self.nonce = nonce
        # 1 业务端查询结果的最晚时间 2 单位：天，最大值为30 天 3 在responsePeriod 天之后，调用异步接口结果查询 将 无法获取异步接口的执行结果
        self.response_period = response_period

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.collect_label_raw_content_list, 'collect_label_raw_content_list')
        if self.collect_label_raw_content_list:
            for k in self.collect_label_raw_content_list:
                if k:
                    k.validate()
        self.validate_required(self.nonce, 'nonce')
        self.validate_required(self.response_period, 'response_period')

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
        result['collect_label_raw_content_list'] = []
        if self.collect_label_raw_content_list is not None:
            for k in self.collect_label_raw_content_list:
                result['collect_label_raw_content_list'].append(k.to_map() if k else None)
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.response_period is not None:
            result['response_period'] = self.response_period
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        self.collect_label_raw_content_list = []
        if m.get('collect_label_raw_content_list') is not None:
            for k in m.get('collect_label_raw_content_list'):
                temp_model = CollectLabelRawContent()
                self.collect_label_raw_content_list.append(temp_model.from_map(k))
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('response_period') is not None:
            self.response_period = m.get('response_period')
        return self


class SendLabelTransferrawonasyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口请求的唯一标识
        self.request_id = request_id

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryDockedDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        docked_method: str = None,
        scene: str = None,
        key: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 1. 已对接的接口名 ;
        # 2. docked_method可通过 实例化SDK中的Request模型后获取，例如：
        # String dockedMethod = new CreateDeviceDatamodelRequest().getMethod();
        self.docked_method = docked_method
        # 关键key为chainDeviceId 时不填
        self.scene = scene
        # 1. 接口中的关键key ，例如 deviceId ；
        # 2. key为chainDeviceId时，scene字段不填
        # 
        self.key = key

    def validate(self):
        self.validate_required(self.docked_method, 'docked_method')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.docked_method is not None:
            result['docked_method'] = self.docked_method
        if self.scene is not None:
            result['scene'] = self.scene
        if self.key is not None:
            result['key'] = self.key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('docked_method') is not None:
            self.docked_method = m.get('docked_method')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('key') is not None:
            self.key = m.get('key')
        return self


class QueryDockedDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 1. 根据不同的method返回不同的数据内容
        # 2. markdown格式的内容
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


class CreateDeviceRelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        subject_chain_device_id: str = None,
        predicate: str = None,
        object_chain_device_id_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主设备链上id
        self.subject_chain_device_id = subject_chain_device_id
        # 关系谓语，目前的取值范围：SUB_DEVICE（子设备）
        self.predicate = predicate
        # 关联设备链上id列表
        self.object_chain_device_id_list = object_chain_device_id_list

    def validate(self):
        self.validate_required(self.subject_chain_device_id, 'subject_chain_device_id')
        self.validate_required(self.predicate, 'predicate')
        self.validate_required(self.object_chain_device_id_list, 'object_chain_device_id_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.subject_chain_device_id is not None:
            result['subject_chain_device_id'] = self.subject_chain_device_id
        if self.predicate is not None:
            result['predicate'] = self.predicate
        if self.object_chain_device_id_list is not None:
            result['object_chain_device_id_list'] = self.object_chain_device_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('subject_chain_device_id') is not None:
            self.subject_chain_device_id = m.get('subject_chain_device_id')
        if m.get('predicate') is not None:
            self.predicate = m.get('predicate')
        if m.get('object_chain_device_id_list') is not None:
            self.object_chain_device_id_list = m.get('object_chain_device_id_list')
        return self


class CreateDeviceRelationResponse(TeaModel):
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


class DeleteDeviceRelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        subject_chain_device_id: str = None,
        predicate: str = None,
        object_chain_device_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主设备链上id
        self.subject_chain_device_id = subject_chain_device_id
        # 关系谓语，目前取值范围：SUB_DEVICE（子设备）
        self.predicate = predicate
        # 关联设备链上id
        self.object_chain_device_id = object_chain_device_id

    def validate(self):
        self.validate_required(self.subject_chain_device_id, 'subject_chain_device_id')
        self.validate_required(self.predicate, 'predicate')
        self.validate_required(self.object_chain_device_id, 'object_chain_device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.subject_chain_device_id is not None:
            result['subject_chain_device_id'] = self.subject_chain_device_id
        if self.predicate is not None:
            result['predicate'] = self.predicate
        if self.object_chain_device_id is not None:
            result['object_chain_device_id'] = self.object_chain_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('subject_chain_device_id') is not None:
            self.subject_chain_device_id = m.get('subject_chain_device_id')
        if m.get('predicate') is not None:
            self.predicate = m.get('predicate')
        if m.get('object_chain_device_id') is not None:
            self.object_chain_device_id = m.get('object_chain_device_id')
        return self


class DeleteDeviceRelationResponse(TeaModel):
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


class PushCollectotBychainidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
        collect_content_list: List[CollectContent] = None,
        nonce: str = None,
        data_model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链上设备Id
        self.chain_device_id = chain_device_id
        # 收集数据
        self.collect_content_list = collect_content_list
        # 随机数，防重放
        self.nonce = nonce
        # 数据模型Id
        self.data_model_id = data_model_id

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.collect_content_list, 'collect_content_list')
        if self.collect_content_list:
            for k in self.collect_content_list:
                if k:
                    k.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        result['collect_content_list'] = []
        if self.collect_content_list is not None:
            for k in self.collect_content_list:
                result['collect_content_list'].append(k.to_map() if k else None)
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        self.collect_content_list = []
        if m.get('collect_content_list') is not None:
            for k in m.get('collect_content_list'):
                temp_model = CollectContent()
                self.collect_content_list.append(temp_model.from_map(k))
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        return self


class PushCollectotBychainidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        push_result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 推送结果
        self.push_result = push_result

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
        if self.push_result is not None:
            result['push_result'] = self.push_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('push_result') is not None:
            self.push_result = m.get('push_result')
        return self


class NotifyPullstrategyChangestatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        operator_id: str = None,
        data: str = None,
        time_stamp: str = None,
        seq: str = None,
        sig: str = None,
        scene: str = None,
        data_model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 运营商标识
        self.operator_id = operator_id
        # 加密后的核心数据
        self.data = data
        # 接口请求时的时间戳信息，格式为yyyyMMddHHmmss
        self.time_stamp = time_stamp
        # 自增序列，4位自增序列取自时间戳，同一秒内按序列自增长，新秒重计
        self.seq = seq
        # 参数签名，原文为operatorId+data+timeStamp+seq
        self.sig = sig
        # 场景码
        self.scene = scene
        # 数据模型ID，用于校验data原文数据
        self.data_model_id = data_model_id

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.data, 'data')
        self.validate_required(self.time_stamp, 'time_stamp')
        self.validate_required(self.seq, 'seq')
        self.validate_required(self.sig, 'sig')
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
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.data is not None:
            result['data'] = self.data
        if self.time_stamp is not None:
            result['time_stamp'] = self.time_stamp
        if self.seq is not None:
            result['seq'] = self.seq
        if self.sig is not None:
            result['sig'] = self.sig
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('time_stamp') is not None:
            self.time_stamp = m.get('time_stamp')
        if m.get('seq') is not None:
            self.seq = m.get('seq')
        if m.get('sig') is not None:
            self.sig = m.get('sig')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        return self


class NotifyPullstrategyChangestatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        msg: str = None,
        ret: int = None,
        sig: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回参数密文
        self.data = data
        # 返回消息
        self.msg = msg
        # 返回值
        self.ret = ret
        # 签名，原文为ret+msg+data密文
        self.sig = sig

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
        if self.data is not None:
            result['data'] = self.data
        if self.msg is not None:
            result['msg'] = self.msg
        if self.ret is not None:
            result['ret'] = self.ret
        if self.sig is not None:
            result['sig'] = self.sig
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('ret') is not None:
            self.ret = m.get('ret')
        if m.get('sig') is not None:
            self.sig = m.get('sig')
        return self


class NotifyPullstrategyChargeorderinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        operator_id: str = None,
        data: str = None,
        time_stamp: str = None,
        seq: str = None,
        sig: str = None,
        scene: str = None,
        data_model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 运营商标识
        self.operator_id = operator_id
        # 加密后的核心数据
        self.data = data
        # 接口请求时的时间戳信息，格式为yyyyMMddHHmmss
        self.time_stamp = time_stamp
        # 自增序列，4位自增序列取自时间戳，同一秒内按序列自增长，新秒重计
        self.seq = seq
        # 参数签名，原文为operatorId+data+timeStamp+seq
        self.sig = sig
        # 场景码
        self.scene = scene
        # 数据模型ID，用于校验data原文数据
        self.data_model_id = data_model_id

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.data, 'data')
        self.validate_required(self.time_stamp, 'time_stamp')
        self.validate_required(self.seq, 'seq')
        self.validate_required(self.sig, 'sig')
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
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.data is not None:
            result['data'] = self.data
        if self.time_stamp is not None:
            result['time_stamp'] = self.time_stamp
        if self.seq is not None:
            result['seq'] = self.seq
        if self.sig is not None:
            result['sig'] = self.sig
        if self.scene is not None:
            result['scene'] = self.scene
        if self.data_model_id is not None:
            result['data_model_id'] = self.data_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('time_stamp') is not None:
            self.time_stamp = m.get('time_stamp')
        if m.get('seq') is not None:
            self.seq = m.get('seq')
        if m.get('sig') is not None:
            self.sig = m.get('sig')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        return self


class NotifyPullstrategyChargeorderinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        msg: str = None,
        ret: int = None,
        sig: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回参数密文
        self.data = data
        # 返回消息
        self.msg = msg
        # 返回值
        self.ret = ret
        # 签名，原文为ret+msg+data密文
        self.sig = sig

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
        if self.data is not None:
            result['data'] = self.data
        if self.msg is not None:
            result['msg'] = self.msg
        if self.ret is not None:
            result['ret'] = self.ret
        if self.sig is not None:
            result['sig'] = self.sig
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('ret') is not None:
            self.ret = m.get('ret')
        if m.get('sig') is not None:
            self.sig = m.get('sig')
        return self


class QueryScfleaseEqpinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request: List[ScfLeaseEqpInfoQueryRequest] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求体
        self.request = request

    def validate(self):
        self.validate_required(self.request, 'request')
        if self.request:
            for k in self.request:
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
        result['request'] = []
        if self.request is not None:
            for k in self.request:
                result['request'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.request = []
        if m.get('request') is not None:
            for k in m.get('request'):
                temp_model = ScfLeaseEqpInfoQueryRequest()
                self.request.append(temp_model.from_map(k))
        return self


class QueryScfleaseEqpinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ScfLeaseEqpInfo] = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询结果
        self.result = result
        # 成功/失败
        self.success = success

    def validate(self):
        if self.result:
            for k in self.result:
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
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ScfLeaseEqpInfo()
                self.result.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CreateCustomerEntityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        entity_id: str = None,
        entity_name: str = None,
        content: str = None,
        entity_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码，由蚂蚁提供
        self.scene = scene
        # 实体ID，场景内实体ID需要具有唯一性
        self.entity_id = entity_id
        # 实体名称, 例如：服务区地理围栏
        self.entity_name = entity_name
        # 实体内容 , 类型为字符串
        self.content = content
        # 实体类别 (枚举) ，由蚂蚁提供 ，例如地理围栏：GEOFENCE
        self.entity_type = entity_type

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.entity_id, 'entity_id')
        self.validate_required(self.entity_name, 'entity_name')
        self.validate_required(self.content, 'content')
        self.validate_required(self.entity_type, 'entity_type')

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
        if self.entity_id is not None:
            result['entity_id'] = self.entity_id
        if self.entity_name is not None:
            result['entity_name'] = self.entity_name
        if self.content is not None:
            result['content'] = self.content
        if self.entity_type is not None:
            result['entity_type'] = self.entity_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('entity_id') is not None:
            self.entity_id = m.get('entity_id')
        if m.get('entity_name') is not None:
            self.entity_name = m.get('entity_name')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('entity_type') is not None:
            self.entity_type = m.get('entity_type')
        return self


class CreateCustomerEntityResponse(TeaModel):
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


class UpdateCustomerEntityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        entity_id: str = None,
        entity_name: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码，由蚂蚁提供
        self.scene = scene
        # 实体ID
        # 
        self.entity_id = entity_id
        # 实体名称, 例如：服务区A地理围栏
        self.entity_name = entity_name
        # 实体内容 , 类型为字符串
        # 
        self.content = content

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.entity_id, 'entity_id')
        self.validate_required(self.entity_name, 'entity_name')
        self.validate_required(self.content, 'content')

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
        if self.entity_id is not None:
            result['entity_id'] = self.entity_id
        if self.entity_name is not None:
            result['entity_name'] = self.entity_name
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('entity_id') is not None:
            self.entity_id = m.get('entity_id')
        if m.get('entity_name') is not None:
            self.entity_name = m.get('entity_name')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class UpdateCustomerEntityResponse(TeaModel):
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


class CreateThingmodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        thing_model: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 物模型内容（多个物模型功能拼合的json）
        self.thing_model = thing_model

    def validate(self):
        self.validate_required(self.thing_model, 'thing_model')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.thing_model is not None:
            result['thing_model'] = self.thing_model
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('thing_model') is not None:
            self.thing_model = m.get('thing_model')
        return self


class CreateThingmodelResponse(TeaModel):
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


class QueryThingmodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class QueryThingmodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        thing_model: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户的物模型内容（多个物模型功能拼合的json）
        self.thing_model = thing_model

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
        if self.thing_model is not None:
            result['thing_model'] = self.thing_model
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('thing_model') is not None:
            self.thing_model = m.get('thing_model')
        return self


class ExecThingsdidOneapiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 暂无
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class ExecThingsdidOneapiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        raw_response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂无
        self.raw_response = raw_response

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
        if self.raw_response is not None:
            result['raw_response'] = self.raw_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('raw_response') is not None:
            self.raw_response = m.get('raw_response')
        return self


class StartEvidenceStoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_storage_req: EvidenceStorageReq = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 信物链存证结构体参数
        self.evidence_storage_req = evidence_storage_req
        # 输入唯一交易ID序号，客户端管理短时内唯一
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.evidence_storage_req, 'evidence_storage_req')
        if self.evidence_storage_req:
            self.evidence_storage_req.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_storage_req is not None:
            result['evidence_storage_req'] = self.evidence_storage_req.to_map()
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_storage_req') is not None:
            temp_model = EvidenceStorageReq()
            self.evidence_storage_req = temp_model.from_map(m['evidence_storage_req'])
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class StartEvidenceStoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cost_millis: int = None,
        data_index: str = None,
        ext_info: str = None,
        nonce: str = None,
        timestamp: int = None,
        tx_timestamp: int = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # API消耗时间（毫秒单位）
        self.cost_millis = cost_millis
        # 暂保留
        self.data_index = data_index
        # 上链附加备注信息，不做上链存储。
        self.ext_info = ext_info
        # 交易ID，等于输入参数同名字段
        self.nonce = nonce
        # 本地unix时间戳（毫秒单位）
        self.timestamp = timestamp
        # unix链上存储时间戳
        self.tx_timestamp = tx_timestamp
        # 链上交易地址txHash
        self.tx_hash = tx_hash

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
        if self.cost_millis is not None:
            result['cost_millis'] = self.cost_millis
        if self.data_index is not None:
            result['data_index'] = self.data_index
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.tx_timestamp is not None:
            result['tx_timestamp'] = self.tx_timestamp
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cost_millis') is not None:
            self.cost_millis = m.get('cost_millis')
        if m.get('data_index') is not None:
            self.data_index = m.get('data_index')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('tx_timestamp') is not None:
            self.tx_timestamp = m.get('tx_timestamp')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class StartEvidenceQueryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        evidence_query_info_req: EvidenceQueryInfoReq = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 信物链单条存证查询请求结构体
        self.evidence_query_info_req = evidence_query_info_req
        # 输入交易唯一ID，短时内唯一
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.evidence_query_info_req, 'evidence_query_info_req')
        if self.evidence_query_info_req:
            self.evidence_query_info_req.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.evidence_query_info_req is not None:
            result['evidence_query_info_req'] = self.evidence_query_info_req.to_map()
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('evidence_query_info_req') is not None:
            temp_model = EvidenceQueryInfoReq()
            self.evidence_query_info_req = temp_model.from_map(m['evidence_query_info_req'])
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class StartEvidenceQueryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        block_height: int = None,
        cost_millis: int = None,
        nonce: str = None,
        timestamp: int = None,
        tx_hash: str = None,
        tx_timestamp: int = None,
        data: EvidenceBaseModel = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易在区块链所在块高度
        self.block_height = block_height
        # API消耗时间（毫秒单位）
        self.cost_millis = cost_millis
        # 唯一ID，等于输入同名参数
        self.nonce = nonce
        # unix时间戳(毫秒单位)
        self.timestamp = timestamp
        # 区块链交易地址txHash
        self.tx_hash = tx_hash
        # 交易存储区块链的链上unix时间戳
        self.tx_timestamp = tx_timestamp
        # 信物链查询链上获取的数据，参考结构体定义
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
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.cost_millis is not None:
            result['cost_millis'] = self.cost_millis
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_timestamp is not None:
            result['tx_timestamp'] = self.tx_timestamp
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
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('cost_millis') is not None:
            self.cost_millis = m.get('cost_millis')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_timestamp') is not None:
            self.tx_timestamp = m.get('tx_timestamp')
        if m.get('data') is not None:
            temp_model = EvidenceBaseModel()
            self.data = temp_model.from_map(m['data'])
        return self


class StartThingsdidRegisterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        nonce: str = None,
        register_req: ThingsDidRegisterReq = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 信物链交易唯一ID，代表需要标识的操作ID
        self.nonce = nonce
        # 注册信物链身份实体请求结构体
        self.register_req = register_req

    def validate(self):
        self.validate_required(self.nonce, 'nonce')
        self.validate_required(self.register_req, 'register_req')
        if self.register_req:
            self.register_req.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.register_req is not None:
            result['register_req'] = self.register_req.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('register_req') is not None:
            temp_model = ThingsDidRegisterReq()
            self.register_req = temp_model.from_map(m['register_req'])
        return self


class StartThingsdidRegisterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        executed: bool = None,
        nonce: str = None,
        thing_did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 代表本操作是否是异步调用
        # true: 执行完全，非异步操作
        # false: 异步执行，需要根据nonce轮训状态
        self.executed = executed
        # 代表唯一交易ID，等于输入参数同名字段
        self.nonce = nonce
        # 注册成功返回的实体身份DID
        self.thing_did = thing_did

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
        if self.executed is not None:
            result['executed'] = self.executed
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.thing_did is not None:
            result['thing_did'] = self.thing_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('executed') is not None:
            self.executed = m.get('executed')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('thing_did') is not None:
            self.thing_did = m.get('thing_did')
        return self


class QueryThingsdidAsyncprocessRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        thing_did: str = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需要查询的实体Did，可为空
        self.thing_did = thing_did
        # 随机数唯一ID, 用以标识智能合约执行的索引交易ID，需要等于需要轮询的API的nonce
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.thing_did is not None:
            result['thing_did'] = self.thing_did
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('thing_did') is not None:
            self.thing_did = m.get('thing_did')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class QueryThingsdidAsyncprocessResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        thing_did: str = None,
        nonce: str = None,
        async_status: str = None,
        async_code: str = None,
        async_subcode: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 需要查询的实体Did，可为空
        self.thing_did = thing_did
        # 随机数, 用以标识智能合约执行的索引，等于输入
        self.nonce = nonce
        # 交易执行当前状态，原始文本，和async_code, async_subcode匹配，将来可能会删除此字段
        self.async_status = async_status
        # 从智能合约执行返回的结果编码，200成功，其他参考相应文档
        self.async_code = async_code
        # 可为空，代表async_code信息不能表示完整语义时的子结果码
        self.async_subcode = async_subcode

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
        if self.thing_did is not None:
            result['thing_did'] = self.thing_did
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.async_status is not None:
            result['async_status'] = self.async_status
        if self.async_code is not None:
            result['async_code'] = self.async_code
        if self.async_subcode is not None:
            result['async_subcode'] = self.async_subcode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('thing_did') is not None:
            self.thing_did = m.get('thing_did')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('async_status') is not None:
            self.async_status = m.get('async_status')
        if m.get('async_code') is not None:
            self.async_code = m.get('async_code')
        if m.get('async_subcode') is not None:
            self.async_subcode = m.get('async_subcode')
        return self


class UpdateThingsdidStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        nonce: str = None,
        status: str = None,
        thing_did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 交易唯一ID
        self.nonce = nonce
        # 状态取如下状态，注册设备身份，默认处于STATUS_REGISTERED，
        # 要更新为STATUS_COMMAND_STOP的设备必须处于STATUS_COMMAND_START，
        # 更新为STATUS_COMMAND_UNREGISTER后，无法更新为其他状态。
        # STATUS_COMMAND_UNREGISTER(注销),
        # STATUS_COMMAND_START(启用),
        # STATUS_COMMAND_STOP(),
        # STATUS_REGISTERED(3),
        self.status = status
        # 需要更新的实体did
        self.thing_did = thing_did

    def validate(self):
        self.validate_required(self.nonce, 'nonce')
        self.validate_required(self.status, 'status')
        self.validate_required(self.thing_did, 'thing_did')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.status is not None:
            result['status'] = self.status
        if self.thing_did is not None:
            result['thing_did'] = self.thing_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('thing_did') is not None:
            self.thing_did = m.get('thing_did')
        return self


class UpdateThingsdidStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        executed: bool = None,
        nonce: str = None,
        thing_did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 代表本操作是否是异步调用 true: 执行完全，非异步操作...
        self.executed = executed
        # 代表唯一交易ID，等于输入参数同名字段
        self.nonce = nonce
        # 注册成功返回的实体身份DID
        self.thing_did = thing_did

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
        if self.executed is not None:
            result['executed'] = self.executed
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.thing_did is not None:
            result['thing_did'] = self.thing_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('executed') is not None:
            self.executed = m.get('executed')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('thing_did') is not None:
            self.thing_did = m.get('thing_did')
        return self


class UpdateThingsdidDevicespaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        update_device_space_req: UpdateDeviceSpaceReq = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 参考结构体定义
        self.update_device_space_req = update_device_space_req
        # 交易唯一ID
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.update_device_space_req, 'update_device_space_req')
        if self.update_device_space_req:
            self.update_device_space_req.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.update_device_space_req is not None:
            result['update_device_space_req'] = self.update_device_space_req.to_map()
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('update_device_space_req') is not None:
            temp_model = UpdateDeviceSpaceReq()
            self.update_device_space_req = temp_model.from_map(m['update_device_space_req'])
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class UpdateThingsdidDevicespaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        executed: bool = None,
        nonce: str = None,
        thing_did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 代表本操作是否是异步调用 true: 执行完全，非异步操作
        self.executed = executed
        # 代表唯一交易ID，等于输入参数同名字段
        self.nonce = nonce
        # 注册成功返回的实体身份DID
        self.thing_did = thing_did

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
        if self.executed is not None:
            result['executed'] = self.executed
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.thing_did is not None:
            result['thing_did'] = self.thing_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('executed') is not None:
            self.executed = m.get('executed')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('thing_did') is not None:
            self.thing_did = m.get('thing_did')
        return self


class QueryThingsdidDidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        base_query_req: DidBaseQueryReq = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询请求结构体，参考结构体定义
        self.base_query_req = base_query_req
        # 唯一交易ID
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.base_query_req, 'base_query_req')
        if self.base_query_req:
            self.base_query_req.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.base_query_req is not None:
            result['base_query_req'] = self.base_query_req.to_map()
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('base_query_req') is not None:
            temp_model = DidBaseQueryReq()
            self.base_query_req = temp_model.from_map(m['base_query_req'])
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class QueryThingsdidDidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did_base_query_resp: List[DidBaseQueryResp] = None,
        nonce: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询请求返回结构体的数组列表，每一个元素对应一个did
        self.did_base_query_resp = did_base_query_resp
        # 交易唯一ID
        self.nonce = nonce

    def validate(self):
        if self.did_base_query_resp:
            for k in self.did_base_query_resp:
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
        result['did_base_query_resp'] = []
        if self.did_base_query_resp is not None:
            for k in self.did_base_query_resp:
                result['did_base_query_resp'].append(k.to_map() if k else None)
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.did_base_query_resp = []
        if m.get('did_base_query_resp') is not None:
            for k in m.get('did_base_query_resp'):
                temp_model = DidBaseQueryResp()
                self.did_base_query_resp.append(temp_model.from_map(k))
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class UpdateThingsdidDidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        did_update_req: ThingsDidUpdateReq = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 参考更新请求结构体
        self.did_update_req = did_update_req
        # 交易唯一ID
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.did_update_req, 'did_update_req')
        if self.did_update_req:
            self.did_update_req.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.did_update_req is not None:
            result['did_update_req'] = self.did_update_req.to_map()
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('did_update_req') is not None:
            temp_model = ThingsDidUpdateReq()
            self.did_update_req = temp_model.from_map(m['did_update_req'])
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class UpdateThingsdidDidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        thing_did: str = None,
        executed: bool = None,
        nonce: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 更新的实体DID，等于输入
        self.thing_did = thing_did
        # 异步执行标识，true代表已经完成执行，false代表异步返回，需要轮询nonce代表的交易
        self.executed = executed
        # 交易唯一ID
        self.nonce = nonce

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
        if self.thing_did is not None:
            result['thing_did'] = self.thing_did
        if self.executed is not None:
            result['executed'] = self.executed
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('thing_did') is not None:
            self.thing_did = m.get('thing_did')
        if m.get('executed') is not None:
            self.executed = m.get('executed')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class StartTenantBindinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bind_info_req: TenantBindInfoReq = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 参考结构体
        self.bind_info_req = bind_info_req
        # 交易唯一ID
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.bind_info_req, 'bind_info_req')
        if self.bind_info_req:
            self.bind_info_req.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bind_info_req is not None:
            result['bind_info_req'] = self.bind_info_req.to_map()
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bind_info_req') is not None:
            temp_model = TenantBindInfoReq()
            self.bind_info_req = temp_model.from_map(m['bind_info_req'])
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class StartTenantBindinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        key_id: str = None,
        key_secret: str = None,
        nonce: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实体did
        self.did = did
        # 非openapi访问模式https鉴权key_id,  暂保留
        self.key_id = key_id
        # 非openapi访问模式https鉴权key_secret,  暂保留
        self.key_secret = key_secret
        # 交易唯一ID
        self.nonce = nonce

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
        if self.did is not None:
            result['did'] = self.did
        if self.key_id is not None:
            result['key_id'] = self.key_id
        if self.key_secret is not None:
            result['key_secret'] = self.key_secret
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        if m.get('key_secret') is not None:
            self.key_secret = m.get('key_secret')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class CreateTenantProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        nonce: str = None,
        project_create_req: TenantProjectCreateReq = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 交易唯一ID
        self.nonce = nonce
        # 参考结构体
        self.project_create_req = project_create_req

    def validate(self):
        self.validate_required(self.nonce, 'nonce')
        self.validate_required(self.project_create_req, 'project_create_req')
        if self.project_create_req:
            self.project_create_req.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.project_create_req is not None:
            result['project_create_req'] = self.project_create_req.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('project_create_req') is not None:
            temp_model = TenantProjectCreateReq()
            self.project_create_req = temp_model.from_map(m['project_create_req'])
        return self


class CreateTenantProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_uid: str = None,
        nonce: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回租户唯一的项目id，可以用以管理不同业务。
        self.project_uid = project_uid
        # 交易唯一ID
        self.nonce = nonce

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
        if self.project_uid is not None:
            result['project_uid'] = self.project_uid
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('project_uid') is not None:
            self.project_uid = m.get('project_uid')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class UpdateThingsdidTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        nonce: str = None,
        update_tenant_req: DidUpdateTenantReq = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 交易唯一ID
        self.nonce = nonce
        # 实体更新访问权限参与方的请求结构体
        self.update_tenant_req = update_tenant_req

    def validate(self):
        self.validate_required(self.nonce, 'nonce')
        self.validate_required(self.update_tenant_req, 'update_tenant_req')
        if self.update_tenant_req:
            self.update_tenant_req.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.update_tenant_req is not None:
            result['update_tenant_req'] = self.update_tenant_req.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('update_tenant_req') is not None:
            temp_model = DidUpdateTenantReq()
            self.update_tenant_req = temp_model.from_map(m['update_tenant_req'])
        return self


class UpdateThingsdidTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nonce: str = None,
        executed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易唯一ID，等于输入
        self.nonce = nonce
        # 代表本操作是否是异步调用
        # true: 执行完全，非异步操作.
        self.executed = executed

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
        if self.nonce is not None:
            result['nonce'] = self.nonce
        if self.executed is not None:
            result['executed'] = self.executed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        if m.get('executed') is not None:
            self.executed = m.get('executed')
        return self


class LoadTsmCertificatetsmRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certificate: str = None,
        device_code: str = None,
        device_model: str = None,
        device_module: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # certificate
        self.certificate = certificate
        # BOT
        self.device_code = device_code
        # H0
        self.device_model = device_model
        # SE
        self.device_module = device_module

    def validate(self):
        self.validate_required(self.device_code, 'device_code')
        self.validate_required(self.device_model, 'device_model')
        self.validate_required(self.device_module, 'device_module')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certificate is not None:
            result['certificate'] = self.certificate
        if self.device_code is not None:
            result['device_code'] = self.device_code
        if self.device_model is not None:
            result['device_model'] = self.device_model
        if self.device_module is not None:
            result['device_module'] = self.device_module
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certificate') is not None:
            self.certificate = m.get('certificate')
        if m.get('device_code') is not None:
            self.device_code = m.get('device_code')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        if m.get('device_module') is not None:
            self.device_module = m.get('device_module')
        return self


class LoadTsmCertificatetsmResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cmd_list: List[TsmCommonCmd] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # LoadCertificateTSMCmdResponse implements Serializable
        self.cmd_list = cmd_list

    def validate(self):
        if self.cmd_list:
            for k in self.cmd_list:
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
        result['cmd_list'] = []
        if self.cmd_list is not None:
            for k in self.cmd_list:
                result['cmd_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.cmd_list = []
        if m.get('cmd_list') is not None:
            for k in m.get('cmd_list'):
                temp_model = TsmCommonCmd()
                self.cmd_list.append(temp_model.from_map(k))
        return self


class LoadTsmResourcefileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_code: str = None,
        device_model: str = None,
        device_module: str = None,
        file_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # BOT
        self.device_code = device_code
        # H0
        self.device_model = device_model
        # SE
        self.device_module = device_module
        # version
        self.file_version = file_version

    def validate(self):
        self.validate_required(self.device_code, 'device_code')
        self.validate_required(self.device_model, 'device_model')
        self.validate_required(self.device_module, 'device_module')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_code is not None:
            result['device_code'] = self.device_code
        if self.device_model is not None:
            result['device_model'] = self.device_model
        if self.device_module is not None:
            result['device_module'] = self.device_module
        if self.file_version is not None:
            result['file_version'] = self.file_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_code') is not None:
            self.device_code = m.get('device_code')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        if m.get('device_module') is not None:
            self.device_module = m.get('device_module')
        if m.get('file_version') is not None:
            self.file_version = m.get('file_version')
        return self


class LoadTsmResourcefileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_id: str = None,
        cmd_list: List[TsmCommonCmd] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # appId
        self.app_id = app_id
        # cmd_list
        self.cmd_list = cmd_list

    def validate(self):
        if self.cmd_list:
            for k in self.cmd_list:
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
        if self.app_id is not None:
            result['app_id'] = self.app_id
        result['cmd_list'] = []
        if self.cmd_list is not None:
            for k in self.cmd_list:
                result['cmd_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        self.cmd_list = []
        if m.get('cmd_list') is not None:
            for k in m.get('cmd_list'):
                temp_model = TsmCommonCmd()
                self.cmd_list.append(temp_model.from_map(k))
        return self


class StartTlsnotaryTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        oss_link: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 唯一的业务tlsnotary任务id
        self.task_id = task_id
        # 加固文件的oss链接
        self.oss_link = oss_link

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.oss_link, 'oss_link')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.oss_link is not None:
            result['oss_link'] = self.oss_link
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('oss_link') is not None:
            self.oss_link = m.get('oss_link')
        return self


class StartTlsnotaryTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        error_code: int = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 唯一的业务tlsnotary任务id
        self.task_id = task_id
        # 业务错误码
        self.error_code = error_code
        # 错误信息
        self.error_msg = error_msg

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class QueryTlsnotaryTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 唯一的业务 tlsnotary 任务 id
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryTlsnotaryTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        state: int = None,
        upload_oss_links: TlsnotaryUploadOssLinks = None,
        notary_signature: str = None,
        error_code: int = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 唯一的业务 tlsnotary 任务 id
        self.task_id = task_id
        # tlsnotary任务执行状态
        self.state = state
        # 上传文件oss链接
        self.upload_oss_links = upload_oss_links
        # 认证签名
        self.notary_signature = notary_signature
        # 业务错误码
        self.error_code = error_code
        # 业务错误信息
        self.error_msg = error_msg

    def validate(self):
        if self.upload_oss_links:
            self.upload_oss_links.validate()

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.state is not None:
            result['state'] = self.state
        if self.upload_oss_links is not None:
            result['upload_oss_links'] = self.upload_oss_links.to_map()
        if self.notary_signature is not None:
            result['notary_signature'] = self.notary_signature
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('upload_oss_links') is not None:
            temp_model = TlsnotaryUploadOssLinks()
            self.upload_oss_links = temp_model.from_map(m['upload_oss_links'])
        if m.get('notary_signature') is not None:
            self.notary_signature = m.get('notary_signature')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
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


