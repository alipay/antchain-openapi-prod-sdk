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


class TripDuration(TeaModel):
    def __init__(
        self,
        value: str = None,
        unit: str = None,
    ):
        # 时间
        self.value = value
        # 时间单位
        self.unit = unit

    def validate(self):
        self.validate_required(self.value, 'value')
        self.validate_required(self.unit, 'unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.value is not None:
            result['value'] = self.value
        if self.unit is not None:
            result['unit'] = self.unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        return self


class DictionaryInfoBO(TeaModel):
    def __init__(
        self,
        label: str = None,
        value: str = None,
    ):
        # 字典key
        self.label = label
        # 字典value
        self.value = value

    def validate(self):
        self.validate_required(self.label, 'label')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.label is not None:
            result['label'] = self.label
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('label') is not None:
            self.label = m.get('label')
        if m.get('value') is not None:
            self.value = m.get('value')
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


class QueryChainDataTransactionResultData(TeaModel):
    def __init__(
        self,
        biz_scene: str = None,
        data_scene: str = None,
        asset_id: str = None,
        tenant_id: str = None,
        text_hash: str = None,
        timestamp: int = None,
    ):
        # 所属业务
        self.biz_scene = biz_scene
        # 数据资产类型
        self.data_scene = data_scene
        # 资产ID
        self.asset_id = asset_id
        # 租户id
        self.tenant_id = tenant_id
        # 业务数据hash
        self.text_hash = text_hash
        # 时间
        self.timestamp = timestamp

    def validate(self):
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.data_scene, 'data_scene')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.text_hash, 'text_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.data_scene is not None:
            result['data_scene'] = self.data_scene
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.text_hash is not None:
            result['text_hash'] = self.text_hash
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('data_scene') is not None:
            self.data_scene = m.get('data_scene')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('text_hash') is not None:
            self.text_hash = m.get('text_hash')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
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


class GoodsDigitalFingerprintPointIdentificationResult(TeaModel):
    def __init__(
        self,
        sub_point_name: str = None,
        result: str = None,
        grade: str = None,
    ):
        # 子鉴定项
        self.sub_point_name = sub_point_name
        # 商品数字指纹鉴定子项鉴定结果
        self.result = result
        # 鉴定子项鉴定得分
        self.grade = grade

    def validate(self):
        self.validate_required(self.sub_point_name, 'sub_point_name')
        self.validate_required(self.result, 'result')
        self.validate_required(self.grade, 'grade')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_point_name is not None:
            result['sub_point_name'] = self.sub_point_name
        if self.result is not None:
            result['result'] = self.result
        if self.grade is not None:
            result['grade'] = self.grade
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_point_name') is not None:
            self.sub_point_name = m.get('sub_point_name')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('grade') is not None:
            self.grade = m.get('grade')
        return self


class EBikeOperationLog(TeaModel):
    def __init__(
        self,
        time: str = None,
        tenant: str = None,
        app_id: str = None,
        user_id: str = None,
        device_id: str = None,
        operate_time: str = None,
        operate_desc: str = None,
        success: bool = None,
        level: str = None,
    ):
        # 日志时间
        self.time = time
        # 租户
        self.tenant = tenant
        # 小程序应用Id
        self.app_id = app_id
        # 用户id
        self.user_id = user_id
        # 设备id
        self.device_id = device_id
        # 操作时间
        self.operate_time = operate_time
        # 操作描述
        self.operate_desc = operate_desc
        # 操作是否成功
        self.success = success
        # 日志等级(info、warn、error)
        self.level = level

    def validate(self):
        self.validate_required(self.time, 'time')
        self.validate_required(self.tenant, 'tenant')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.operate_time, 'operate_time')
        self.validate_required(self.operate_desc, 'operate_desc')
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.time is not None:
            result['time'] = self.time
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.operate_time is not None:
            result['operate_time'] = self.operate_time
        if self.operate_desc is not None:
            result['operate_desc'] = self.operate_desc
        if self.success is not None:
            result['success'] = self.success
        if self.level is not None:
            result['level'] = self.level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('operate_time') is not None:
            self.operate_time = m.get('operate_time')
        if m.get('operate_desc') is not None:
            self.operate_desc = m.get('operate_desc')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('level') is not None:
            self.level = m.get('level')
        return self


class GoodsDigitalFingerprintPoint(TeaModel):
    def __init__(
        self,
        sub_point_name: str = None,
        micro_image_url: str = None,
        macro_image_url: str = None,
    ):
        # 鉴定点子项
        self.sub_point_name = sub_point_name
        # 微观图片url
        self.micro_image_url = micro_image_url
        # 宏观图片url
        self.macro_image_url = macro_image_url

    def validate(self):
        self.validate_required(self.sub_point_name, 'sub_point_name')
        self.validate_required(self.micro_image_url, 'micro_image_url')
        self.validate_required(self.macro_image_url, 'macro_image_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_point_name is not None:
            result['sub_point_name'] = self.sub_point_name
        if self.micro_image_url is not None:
            result['micro_image_url'] = self.micro_image_url
        if self.macro_image_url is not None:
            result['macro_image_url'] = self.macro_image_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_point_name') is not None:
            self.sub_point_name = m.get('sub_point_name')
        if m.get('micro_image_url') is not None:
            self.micro_image_url = m.get('micro_image_url')
        if m.get('macro_image_url') is not None:
            self.macro_image_url = m.get('macro_image_url')
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


class IotBasicDeviceOrderItem(TeaModel):
    def __init__(
        self,
        device_did: str = None,
        device_sn: str = None,
        payment_amount: str = None,
    ):
        # 蚂蚁链IoT平台设备唯一ID
        self.device_did = device_did
        # 设备唯一编号
        self.device_sn = device_sn
        # 设备金额，精确到小数后两位
        self.payment_amount = payment_amount

    def validate(self):
        self.validate_required(self.device_did, 'device_did')
        self.validate_required(self.device_sn, 'device_sn')
        self.validate_required(self.payment_amount, 'payment_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_did is not None:
            result['device_did'] = self.device_did
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.payment_amount is not None:
            result['payment_amount'] = self.payment_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_did') is not None:
            self.device_did = m.get('device_did')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('payment_amount') is not None:
            self.payment_amount = m.get('payment_amount')
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


class GoodsDigitalFingerprintIdentifyResultData(TeaModel):
    def __init__(
        self,
        identification_result: str = None,
        description: str = None,
        point_identification_results: List[GoodsDigitalFingerprintPointIdentificationResult] = None,
    ):
        # 鉴定结果
        self.identification_result = identification_result
        # 鉴定结果描述
        self.description = description
        # 商品数字指纹鉴定点鉴定结果列表
        self.point_identification_results = point_identification_results

    def validate(self):
        self.validate_required(self.identification_result, 'identification_result')
        self.validate_required(self.description, 'description')
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
        if self.description is not None:
            result['description'] = self.description
        result['point_identification_results'] = []
        if self.point_identification_results is not None:
            for k in self.point_identification_results:
                result['point_identification_results'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identification_result') is not None:
            self.identification_result = m.get('identification_result')
        if m.get('description') is not None:
            self.description = m.get('description')
        self.point_identification_results = []
        if m.get('point_identification_results') is not None:
            for k in m.get('point_identification_results'):
                temp_model = GoodsDigitalFingerprintPointIdentificationResult()
                self.point_identification_results.append(temp_model.from_map(k))
        return self


class JtData(TeaModel):
    def __init__(
        self,
        trustiot_id: int = None,
        trustiot_entity_id: int = None,
        processed_content: str = None,
        delta_mileage: int = None,
        biz_type: str = None,
        alarm_sub_type: int = None,
        related_trust_entity_id: str = None,
        report_date: str = None,
    ):
        # 数据的可信平台唯一ID
        self.trustiot_id = trustiot_id
        # IoT可信平台设备唯一ID
        self.trustiot_entity_id = trustiot_entity_id
        # 上报原文解析处理之后的数据
        self.processed_content = processed_content
        # 和上一次上报数据里程对比，新增的里程数
        self.delta_mileage = delta_mileage
        # 正常位置信息：LOCATION
        # 告警信息：ALARM_BASIC、 ALARM_ADAS、 ALARM_DSM、 ALARM_ACCELEROMETER
        self.biz_type = biz_type
        # 告警子类型
        # //ADAS
        # 10001: 前向碰撞报警
        # 10002: 车辆偏离报警
        # 10003: 车距过近报警
        # 10004: 行人碰撞报警
        # 10005: 频繁变道报警
        # 10006: 道路标识超限报警
        # 10007: 障碍物报警 //10008~10015 保留
        # 10016: 道路标志识别事件
        # 10017: 主动抓拍事件 //10018~10031 保留
        # //DSM
        # 10101: 疲劳驾驶报警
        # 10102: 接打电话报警
        # 10103: 抽烟报警报警
        # 10104: 分神驾驶报警
        # 10105: 驾驶员异常报警 //10106~10115 保留
        # 10116: 自动抓拍事件
        # 10117: 驾驶员变更事件 //10118~10031 保留
        # //加速度
        # 11701: 急加速
        # 11702: 急减速
        # 11703: 急转弯
        self.alarm_sub_type = alarm_sub_type
        # 关联设备唯一ID
        self.related_trust_entity_id = related_trust_entity_id
        # 日报日期
        self.report_date = report_date

    def validate(self):
        self.validate_required(self.trustiot_id, 'trustiot_id')
        self.validate_required(self.trustiot_entity_id, 'trustiot_entity_id')
        self.validate_required(self.processed_content, 'processed_content')
        self.validate_required(self.biz_type, 'biz_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trustiot_id is not None:
            result['trustiot_id'] = self.trustiot_id
        if self.trustiot_entity_id is not None:
            result['trustiot_entity_id'] = self.trustiot_entity_id
        if self.processed_content is not None:
            result['processed_content'] = self.processed_content
        if self.delta_mileage is not None:
            result['delta_mileage'] = self.delta_mileage
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.alarm_sub_type is not None:
            result['alarm_sub_type'] = self.alarm_sub_type
        if self.related_trust_entity_id is not None:
            result['related_trust_entity_id'] = self.related_trust_entity_id
        if self.report_date is not None:
            result['report_date'] = self.report_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trustiot_id') is not None:
            self.trustiot_id = m.get('trustiot_id')
        if m.get('trustiot_entity_id') is not None:
            self.trustiot_entity_id = m.get('trustiot_entity_id')
        if m.get('processed_content') is not None:
            self.processed_content = m.get('processed_content')
        if m.get('delta_mileage') is not None:
            self.delta_mileage = m.get('delta_mileage')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('alarm_sub_type') is not None:
            self.alarm_sub_type = m.get('alarm_sub_type')
        if m.get('related_trust_entity_id') is not None:
            self.related_trust_entity_id = m.get('related_trust_entity_id')
        if m.get('report_date') is not None:
            self.report_date = m.get('report_date')
        return self


class RentContractInfo(TeaModel):
    def __init__(
        self,
        contract_id: str = None,
        lease_time: str = None,
        checkin_date: str = None,
        checkout_date: str = None,
    ):
        # 租赁合同ID
        self.contract_id = contract_id
        # 租约时间
        self.lease_time = lease_time
        # 入住时间
        self.checkin_date = checkin_date
        # 退租时间
        self.checkout_date = checkout_date

    def validate(self):
        self.validate_required(self.contract_id, 'contract_id')
        self.validate_required(self.lease_time, 'lease_time')
        self.validate_required(self.checkin_date, 'checkin_date')
        self.validate_required(self.checkout_date, 'checkout_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.lease_time is not None:
            result['lease_time'] = self.lease_time
        if self.checkin_date is not None:
            result['checkin_date'] = self.checkin_date
        if self.checkout_date is not None:
            result['checkout_date'] = self.checkout_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('lease_time') is not None:
            self.lease_time = m.get('lease_time')
        if m.get('checkin_date') is not None:
            self.checkin_date = m.get('checkin_date')
        if m.get('checkout_date') is not None:
            self.checkout_date = m.get('checkout_date')
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
        # 数据模型ID
        self.device_data_model_id = device_data_model_id
        # 固定填写RAW_DATA
        self.device_feature = device_feature
        # true : 设备ID已存在时返回存在的设备关联字段;
        # false : 设备ID已存在时直接抛出异常；
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


class CodeListView(TeaModel):
    def __init__(
        self,
        data_code: str = None,
        data_name: str = None,
    ):
        # 数据code
        self.data_code = data_code
        # 数据名称
        self.data_name = data_name

    def validate(self):
        self.validate_required(self.data_code, 'data_code')
        self.validate_required(self.data_name, 'data_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data_code is not None:
            result['data_code'] = self.data_code
        if self.data_name is not None:
            result['data_name'] = self.data_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data_code') is not None:
            self.data_code = m.get('data_code')
        if m.get('data_name') is not None:
            self.data_name = m.get('data_name')
        return self


class CarKeyInitData(TeaModel):
    def __init__(
        self,
        root_pub_key: str = None,
        tuid: str = None,
        biz_priv_key: str = None,
        device_priv_key: str = None,
        key_less_authy: str = None,
    ):
        # IIFFAA 根密钥
        self.root_pub_key = root_pub_key
        # IIFAA 设备唯一ID
        self.tuid = tuid
        # 业务密钥
        self.biz_priv_key = biz_priv_key
        # 设备唯一密钥
        self.device_priv_key = device_priv_key
        # 无感空车凭证
        self.key_less_authy = key_less_authy

    def validate(self):
        self.validate_required(self.root_pub_key, 'root_pub_key')
        self.validate_required(self.tuid, 'tuid')
        self.validate_required(self.biz_priv_key, 'biz_priv_key')
        self.validate_required(self.device_priv_key, 'device_priv_key')
        self.validate_required(self.key_less_authy, 'key_less_authy')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.root_pub_key is not None:
            result['root_pub_key'] = self.root_pub_key
        if self.tuid is not None:
            result['tuid'] = self.tuid
        if self.biz_priv_key is not None:
            result['biz_priv_key'] = self.biz_priv_key
        if self.device_priv_key is not None:
            result['device_priv_key'] = self.device_priv_key
        if self.key_less_authy is not None:
            result['key_less_authy'] = self.key_less_authy
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('root_pub_key') is not None:
            self.root_pub_key = m.get('root_pub_key')
        if m.get('tuid') is not None:
            self.tuid = m.get('tuid')
        if m.get('biz_priv_key') is not None:
            self.biz_priv_key = m.get('biz_priv_key')
        if m.get('device_priv_key') is not None:
            self.device_priv_key = m.get('device_priv_key')
        if m.get('key_less_authy') is not None:
            self.key_less_authy = m.get('key_less_authy')
        return self


class IotbasicAppManagerPageInfo(TeaModel):
    def __init__(
        self,
        file_format: str = None,
        file_size: int = None,
        module_name: str = None,
        device_category: str = None,
        device_category_name: str = None,
        package_name: str = None,
        remark: str = None,
        apk_version: str = None,
        apk_type: int = None,
        apk_name: str = None,
        apk_id: str = None,
        download_count: int = None,
        install_count: int = None,
        device_model: str = None,
    ):
        # 应用类型
        self.file_format = file_format
        # 应用大小
        self.file_size = file_size
        # 应用模块名称
        self.module_name = module_name
        # 设备品类code
        self.device_category = device_category
        # 设备品类名称
        self.device_category_name = device_category_name
        # 应用模块包名
        self.package_name = package_name
        # 应用描述
        self.remark = remark
        # 应用版本号
        self.apk_version = apk_version
        # 应用包类型（整包：0/差分：1）
        self.apk_type = apk_type
        # 应用名称
        self.apk_name = apk_name
        # 应用包id
        self.apk_id = apk_id
        # 下载次数
        self.download_count = download_count
        # 安装次数
        self.install_count = install_count
        # 设备型号
        self.device_model = device_model

    def validate(self):
        self.validate_required(self.file_format, 'file_format')
        self.validate_required(self.file_size, 'file_size')
        self.validate_required(self.module_name, 'module_name')
        self.validate_required(self.device_category, 'device_category')
        self.validate_required(self.device_category_name, 'device_category_name')
        self.validate_required(self.package_name, 'package_name')
        self.validate_required(self.apk_version, 'apk_version')
        self.validate_required(self.apk_type, 'apk_type')
        self.validate_required(self.apk_name, 'apk_name')
        self.validate_required(self.apk_id, 'apk_id')
        self.validate_required(self.download_count, 'download_count')
        self.validate_required(self.install_count, 'install_count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_format is not None:
            result['file_format'] = self.file_format
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.module_name is not None:
            result['module_name'] = self.module_name
        if self.device_category is not None:
            result['device_category'] = self.device_category
        if self.device_category_name is not None:
            result['device_category_name'] = self.device_category_name
        if self.package_name is not None:
            result['package_name'] = self.package_name
        if self.remark is not None:
            result['remark'] = self.remark
        if self.apk_version is not None:
            result['apk_version'] = self.apk_version
        if self.apk_type is not None:
            result['apk_type'] = self.apk_type
        if self.apk_name is not None:
            result['apk_name'] = self.apk_name
        if self.apk_id is not None:
            result['apk_id'] = self.apk_id
        if self.download_count is not None:
            result['download_count'] = self.download_count
        if self.install_count is not None:
            result['install_count'] = self.install_count
        if self.device_model is not None:
            result['device_model'] = self.device_model
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_format') is not None:
            self.file_format = m.get('file_format')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('module_name') is not None:
            self.module_name = m.get('module_name')
        if m.get('device_category') is not None:
            self.device_category = m.get('device_category')
        if m.get('device_category_name') is not None:
            self.device_category_name = m.get('device_category_name')
        if m.get('package_name') is not None:
            self.package_name = m.get('package_name')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        if m.get('apk_version') is not None:
            self.apk_version = m.get('apk_version')
        if m.get('apk_type') is not None:
            self.apk_type = m.get('apk_type')
        if m.get('apk_name') is not None:
            self.apk_name = m.get('apk_name')
        if m.get('apk_id') is not None:
            self.apk_id = m.get('apk_id')
        if m.get('download_count') is not None:
            self.download_count = m.get('download_count')
        if m.get('install_count') is not None:
            self.install_count = m.get('install_count')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        return self


class FourWheelerCarEvent(TeaModel):
    def __init__(
        self,
        event_type: str = None,
        end_time: int = None,
        lng: str = None,
        lat: str = None,
        start_speed: str = None,
        end_speed: str = None,
        average_speed: str = None,
        turning_angle: str = None,
        duration: str = None,
    ):
        # 驾驶事件的类型，如正常驾驶、碰撞、急转弯、启动熄火等。
        self.event_type = event_type
        # 驾驶事件的结束时间
        self.end_time = end_time
        # 驾驶事件发生地点的经度坐标
        self.lng = lng
        # 驾驶事件发生地点的纬度坐标
        self.lat = lat
        # 驾驶事件开始的速度
        self.start_speed = start_speed
        # 驾驶事件结束时的速度
        self.end_speed = end_speed
        # 驾驶过程中的平均速度
        self.average_speed = average_speed
        # 驾驶过程中车辆的转弯角度
        self.turning_angle = turning_angle
        # 驾驶事件的持续时间（以秒为单位)
        self.duration = duration

    def validate(self):
        self.validate_required(self.event_type, 'event_type')
        self.validate_required(self.end_time, 'end_time')
        self.validate_required(self.lng, 'lng')
        self.validate_required(self.lat, 'lat')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.event_type is not None:
            result['event_type'] = self.event_type
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.lng is not None:
            result['lng'] = self.lng
        if self.lat is not None:
            result['lat'] = self.lat
        if self.start_speed is not None:
            result['start_speed'] = self.start_speed
        if self.end_speed is not None:
            result['end_speed'] = self.end_speed
        if self.average_speed is not None:
            result['average_speed'] = self.average_speed
        if self.turning_angle is not None:
            result['turning_angle'] = self.turning_angle
        if self.duration is not None:
            result['duration'] = self.duration
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('event_type') is not None:
            self.event_type = m.get('event_type')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('lng') is not None:
            self.lng = m.get('lng')
        if m.get('lat') is not None:
            self.lat = m.get('lat')
        if m.get('start_speed') is not None:
            self.start_speed = m.get('start_speed')
        if m.get('end_speed') is not None:
            self.end_speed = m.get('end_speed')
        if m.get('average_speed') is not None:
            self.average_speed = m.get('average_speed')
        if m.get('turning_angle') is not None:
            self.turning_angle = m.get('turning_angle')
        if m.get('duration') is not None:
            self.duration = m.get('duration')
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


class Data(TeaModel):
    def __init__(
        self,
        provision_data: str = None,
        remaining: int = None,
    ):
        # provision数据
        self.provision_data = provision_data
        # 余量
        self.remaining = remaining

    def validate(self):
        self.validate_required(self.provision_data, 'provision_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.provision_data is not None:
            result['provision_data'] = self.provision_data
        if self.remaining is not None:
            result['remaining'] = self.remaining
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('provision_data') is not None:
            self.provision_data = m.get('provision_data')
        if m.get('remaining') is not None:
            self.remaining = m.get('remaining')
        return self


class IotbasicDeviceModelFixedAttributeFailInfo(TeaModel):
    def __init__(
        self,
        attribute_name: str = None,
        attribute_value: str = None,
        data_type: str = None,
        data_range_min: int = None,
        data_range_max: int = None,
        error_code: str = None,
        error_message: str = None,
    ):
        # 属性说明
        self.attribute_name = attribute_name
        # 属性名称
        self.attribute_value = attribute_value
        # 数据值类型 字符串：string 数字：long
        self.data_type = data_type
        # dataType为string时，表示数据长度最小值 dataType为long时，表示数据范围最小值
        self.data_range_min = data_range_min
        # dataType为string时，表示数据长度最大值 dataType为long时，表示数据范围最大值
        self.data_range_max = data_range_max
        # 失败code
        self.error_code = error_code
        # 失败消息
        self.error_message = error_message

    def validate(self):
        self.validate_required(self.attribute_name, 'attribute_name')
        self.validate_required(self.attribute_value, 'attribute_value')
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.data_range_min, 'data_range_min')
        self.validate_required(self.data_range_max, 'data_range_max')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.error_message, 'error_message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.attribute_name is not None:
            result['attribute_name'] = self.attribute_name
        if self.attribute_value is not None:
            result['attribute_value'] = self.attribute_value
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.data_range_min is not None:
            result['data_range_min'] = self.data_range_min
        if self.data_range_max is not None:
            result['data_range_max'] = self.data_range_max
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('attribute_name') is not None:
            self.attribute_name = m.get('attribute_name')
        if m.get('attribute_value') is not None:
            self.attribute_value = m.get('attribute_value')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('data_range_min') is not None:
            self.data_range_min = m.get('data_range_min')
        if m.get('data_range_max') is not None:
            self.data_range_max = m.get('data_range_max')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class RelatedEntity(TeaModel):
    def __init__(
        self,
        entity_type: str = None,
        related_entity_trustiot_id: int = None,
    ):
        # 所关联实体的类型
        self.entity_type = entity_type
        # 所关联实体的trustiot唯一ID
        self.related_entity_trustiot_id = related_entity_trustiot_id

    def validate(self):
        self.validate_required(self.entity_type, 'entity_type')
        self.validate_required(self.related_entity_trustiot_id, 'related_entity_trustiot_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.entity_type is not None:
            result['entity_type'] = self.entity_type
        if self.related_entity_trustiot_id is not None:
            result['related_entity_trustiot_id'] = self.related_entity_trustiot_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('entity_type') is not None:
            self.entity_type = m.get('entity_type')
        if m.get('related_entity_trustiot_id') is not None:
            self.related_entity_trustiot_id = m.get('related_entity_trustiot_id')
        return self


class IotBasicDeviceRegisterInfo(TeaModel):
    def __init__(
        self,
        device_specs: str = None,
        device_model: str = None,
        device_name: str = None,
        device_sn: str = None,
        nick_name: str = None,
        location: str = None,
        device_ext: str = None,
        sec_id: str = None,
    ):
        # 设备规格
        self.device_specs = device_specs
        # 设备型号
        self.device_model = device_model
        # 设备名称
        self.device_name = device_name
        # 设备sn
        self.device_sn = device_sn
        # 设备标签
        self.nick_name = nick_name
        # 安装位置
        self.location = location
        # 设备扩展信息
        self.device_ext = device_ext
        # 设备安全认证ID
        self.sec_id = sec_id

    def validate(self):
        self.validate_required(self.device_specs, 'device_specs')
        self.validate_required(self.device_model, 'device_model')
        self.validate_required(self.device_name, 'device_name')
        self.validate_required(self.device_sn, 'device_sn')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_specs is not None:
            result['device_specs'] = self.device_specs
        if self.device_model is not None:
            result['device_model'] = self.device_model
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        if self.location is not None:
            result['location'] = self.location
        if self.device_ext is not None:
            result['device_ext'] = self.device_ext
        if self.sec_id is not None:
            result['sec_id'] = self.sec_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_specs') is not None:
            self.device_specs = m.get('device_specs')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('device_ext') is not None:
            self.device_ext = m.get('device_ext')
        if m.get('sec_id') is not None:
            self.sec_id = m.get('sec_id')
        return self


class CustomEntityInfo(TeaModel):
    def __init__(
        self,
        customer_entity_type: str = None,
        customer_entity_content: str = None,
    ):
        # 客户自定义实体类型，默认为JSSDK_ACCOUNT
        self.customer_entity_type = customer_entity_type
        # 客户自定义实体内容
        self.customer_entity_content = customer_entity_content

    def validate(self):
        self.validate_required(self.customer_entity_type, 'customer_entity_type')
        self.validate_required(self.customer_entity_content, 'customer_entity_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.customer_entity_type is not None:
            result['customer_entity_type'] = self.customer_entity_type
        if self.customer_entity_content is not None:
            result['customer_entity_content'] = self.customer_entity_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('customer_entity_type') is not None:
            self.customer_entity_type = m.get('customer_entity_type')
        if m.get('customer_entity_content') is not None:
            self.customer_entity_content = m.get('customer_entity_content')
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


class XrUserTicketResultInfo(TeaModel):
    def __init__(
        self,
        xr_ticket_pool_name: str = None,
        count: int = None,
        error_msg: str = None,
        xr_ticket_code: str = None,
    ):
        # xr通行证资源池名称
        self.xr_ticket_pool_name = xr_ticket_pool_name
        # 购买数量，失败列表有值
        self.count = count
        # 失败原因，失败列表有值
        self.error_msg = error_msg
        # 通行证编号，成功列表有值
        self.xr_ticket_code = xr_ticket_code

    def validate(self):
        self.validate_required(self.xr_ticket_pool_name, 'xr_ticket_pool_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.xr_ticket_pool_name is not None:
            result['xr_ticket_pool_name'] = self.xr_ticket_pool_name
        if self.count is not None:
            result['count'] = self.count
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.xr_ticket_code is not None:
            result['xr_ticket_code'] = self.xr_ticket_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('xr_ticket_pool_name') is not None:
            self.xr_ticket_pool_name = m.get('xr_ticket_pool_name')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('xr_ticket_code') is not None:
            self.xr_ticket_code = m.get('xr_ticket_code')
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


class GrantDeviceInfo(TeaModel):
    def __init__(
        self,
        device_id: str = None,
        auth_record_id: str = None,
    ):
        # 授权ID
        self.device_id = device_id
        # 授权ID
        self.auth_record_id = auth_record_id

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.auth_record_id, 'auth_record_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.auth_record_id is not None:
            result['auth_record_id'] = self.auth_record_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('auth_record_id') is not None:
            self.auth_record_id = m.get('auth_record_id')
        return self


class IotbasicReleaseOrderInfo(TeaModel):
    def __init__(
        self,
        apk_name: str = None,
        apk_version: str = None,
        order_id: str = None,
        order_name: str = None,
        status: str = None,
        release_time: str = None,
        release_total: int = None,
        release_finished: int = None,
        status_change_time: str = None,
    ):
        # 应用名称
        self.apk_name = apk_name
        # 应用版本号
        self.apk_version = apk_version
        # 工单id
        self.order_id = order_id
        # 工单名称
        self.order_name = order_name
        # 发布批次状态
        # 升级中：IN_PROGRESS
        # 取消中：CANCELING
        # 部分成功：PARTIAL_SUCCESS
        # 部分失败：PARTIAL_FAILED
        # 部分取消：PARTIAL_CANCELED
        # 全部成功：ALL_SUCCESS
        # 全部失败：ALL_FAILED
        # 全部取消：ALL_CANCELED
        self.status = status
        # 发布时间
        self.release_time = release_time
        # 设备升级总数
        self.release_total = release_total
        # 设备升级完成数
        self.release_finished = release_finished
        # 工单状态变更时间
        self.status_change_time = status_change_time

    def validate(self):
        self.validate_required(self.apk_name, 'apk_name')
        self.validate_required(self.apk_version, 'apk_version')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.order_name, 'order_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.release_time, 'release_time')
        self.validate_required(self.release_total, 'release_total')
        self.validate_required(self.release_finished, 'release_finished')
        self.validate_required(self.status_change_time, 'status_change_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.apk_name is not None:
            result['apk_name'] = self.apk_name
        if self.apk_version is not None:
            result['apk_version'] = self.apk_version
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_name is not None:
            result['order_name'] = self.order_name
        if self.status is not None:
            result['status'] = self.status
        if self.release_time is not None:
            result['release_time'] = self.release_time
        if self.release_total is not None:
            result['release_total'] = self.release_total
        if self.release_finished is not None:
            result['release_finished'] = self.release_finished
        if self.status_change_time is not None:
            result['status_change_time'] = self.status_change_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apk_name') is not None:
            self.apk_name = m.get('apk_name')
        if m.get('apk_version') is not None:
            self.apk_version = m.get('apk_version')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_name') is not None:
            self.order_name = m.get('order_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        if m.get('release_total') is not None:
            self.release_total = m.get('release_total')
        if m.get('release_finished') is not None:
            self.release_finished = m.get('release_finished')
        if m.get('status_change_time') is not None:
            self.status_change_time = m.get('status_change_time')
        return self


class ProjectSpaceInfo(TeaModel):
    def __init__(
        self,
        project_name: str = None,
        project_code: str = None,
        project_desc: str = None,
    ):
        # 项目名称
        self.project_name = project_name
        # 项目编码
        self.project_code = project_code
        # 项目描述
        self.project_desc = project_desc

    def validate(self):
        self.validate_required(self.project_name, 'project_name')
        self.validate_required(self.project_code, 'project_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.project_code is not None:
            result['project_code'] = self.project_code
        if self.project_desc is not None:
            result['project_desc'] = self.project_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        if m.get('project_desc') is not None:
            self.project_desc = m.get('project_desc')
        return self


class InstanceInfo(TeaModel):
    def __init__(
        self,
        instance_id: str = None,
        instance_name: str = None,
    ):
        # 实例id
        self.instance_id = instance_id
        # 实例名称
        self.instance_name = instance_name

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.instance_name, 'instance_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.instance_name is not None:
            result['instance_name'] = self.instance_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('instance_name') is not None:
            self.instance_name = m.get('instance_name')
        return self


class QueryTransactionResultInfo(TeaModel):
    def __init__(
        self,
        block_hash: str = None,
        parent_block_hash: str = None,
        timestamp: str = None,
        gas: int = None,
        from_: str = None,
        to: str = None,
        tx_type: str = None,
        data: QueryChainDataTransactionResultData = None,
    ):
        # 区块hash
        self.block_hash = block_hash
        # 父区块hash
        self.parent_block_hash = parent_block_hash
        # 交易时间戳
        self.timestamp = timestamp
        # 该交易所能消耗的最大gas
        self.gas = gas
        # 交易发起方账户
        self.from_ = from_
        # 交易接收方账户
        self.to = to
        # 交易类型
        self.tx_type = tx_type
        # 交易返回的数据
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.block_hash is not None:
            result['block_hash'] = self.block_hash
        if self.parent_block_hash is not None:
            result['parent_block_hash'] = self.parent_block_hash
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.gas is not None:
            result['gas'] = self.gas
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.tx_type is not None:
            result['tx_type'] = self.tx_type
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('block_hash') is not None:
            self.block_hash = m.get('block_hash')
        if m.get('parent_block_hash') is not None:
            self.parent_block_hash = m.get('parent_block_hash')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('gas') is not None:
            self.gas = m.get('gas')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('tx_type') is not None:
            self.tx_type = m.get('tx_type')
        if m.get('data') is not None:
            temp_model = QueryChainDataTransactionResultData()
            self.data = temp_model.from_map(m['data'])
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


class HouseInfo(TeaModel):
    def __init__(
        self,
        house_id: str = None,
        lease_mode: str = None,
        acreage: str = None,
        structure: int = None,
        addr: str = None,
        lock_id: str = None,
        ammeter_id: str = None,
    ):
        # 房源唯一ID
        self.house_id = house_id
        # 租赁模式
        self.lease_mode = lease_mode
        # 面积平方
        self.acreage = acreage
        # 房源类型：0住宅、1别墅、
        # 2商铺、3写字楼
        self.structure = structure
        # 房屋地址
        self.addr = addr
        # 门锁设备DID
        self.lock_id = lock_id
        # 电表设备DID
        self.ammeter_id = ammeter_id

    def validate(self):
        self.validate_required(self.house_id, 'house_id')
        self.validate_required(self.structure, 'structure')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.house_id is not None:
            result['house_id'] = self.house_id
        if self.lease_mode is not None:
            result['lease_mode'] = self.lease_mode
        if self.acreage is not None:
            result['acreage'] = self.acreage
        if self.structure is not None:
            result['structure'] = self.structure
        if self.addr is not None:
            result['addr'] = self.addr
        if self.lock_id is not None:
            result['lock_id'] = self.lock_id
        if self.ammeter_id is not None:
            result['ammeter_id'] = self.ammeter_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('house_id') is not None:
            self.house_id = m.get('house_id')
        if m.get('lease_mode') is not None:
            self.lease_mode = m.get('lease_mode')
        if m.get('acreage') is not None:
            self.acreage = m.get('acreage')
        if m.get('structure') is not None:
            self.structure = m.get('structure')
        if m.get('addr') is not None:
            self.addr = m.get('addr')
        if m.get('lock_id') is not None:
            self.lock_id = m.get('lock_id')
        if m.get('ammeter_id') is not None:
            self.ammeter_id = m.get('ammeter_id')
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


class CategoryInfo(TeaModel):
    def __init__(
        self,
        category_name: str = None,
        category_code: str = None,
        remark: str = None,
        industry: str = None,
        scene: str = None,
    ):
        # 品类名称
        self.category_name = category_name
        # 品类编码
        self.category_code = category_code
        # 描述内容
        self.remark = remark
        # 行业
        self.industry = industry
        # 场景
        self.scene = scene

    def validate(self):
        self.validate_required(self.category_name, 'category_name')
        self.validate_required(self.category_code, 'category_code')
        self.validate_required(self.industry, 'industry')
        self.validate_required(self.scene, 'scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.category_name is not None:
            result['category_name'] = self.category_name
        if self.category_code is not None:
            result['category_code'] = self.category_code
        if self.remark is not None:
            result['remark'] = self.remark
        if self.industry is not None:
            result['industry'] = self.industry
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('category_name') is not None:
            self.category_name = m.get('category_name')
        if m.get('category_code') is not None:
            self.category_code = m.get('category_code')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class CollectContent(TeaModel):
    def __init__(
        self,
        chain_device_id: str = None,
        trustiot_device_id: int = None,
        content: str = None,
        signature: str = None,
        extra_data: str = None,
        data_model_id: str = None,
    ):
        # 链上设备ID（与可信设备ID至少填一项）
        self.chain_device_id = chain_device_id
        # 可信设备ID（与链上设备ID至少填一项）
        self.trustiot_device_id = trustiot_device_id
        # 收集的内容
        self.content = content
        # 对内容的签名
        self.signature = signature
        # 服务端发送的扩展数据（非可信设备直接产生的数据）
        self.extra_data = extra_data
        # 数据模型Id
        self.data_model_id = data_model_id

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.trustiot_device_id is not None:
            result['trustiot_device_id'] = self.trustiot_device_id
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
        if m.get('trustiot_device_id') is not None:
            self.trustiot_device_id = m.get('trustiot_device_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        if m.get('data_model_id') is not None:
            self.data_model_id = m.get('data_model_id')
        return self


class RentBillItem(TeaModel):
    def __init__(
        self,
        bill_item_id: str = None,
        bill_item_name: str = None,
        bill_item_begin: str = None,
        bill_item_end: str = None,
        bill_item_money: str = None,
        payment_state: str = None,
    ):
        # 租约分期ID
        self.bill_item_id = bill_item_id
        # 租约分期名称
        self.bill_item_name = bill_item_name
        # 租期开始日期
        self.bill_item_begin = bill_item_begin
        # 租期结束日期
        self.bill_item_end = bill_item_end
        # 租约金额
        self.bill_item_money = bill_item_money
        # 租约支付状态
        self.payment_state = payment_state

    def validate(self):
        self.validate_required(self.bill_item_id, 'bill_item_id')
        self.validate_required(self.bill_item_begin, 'bill_item_begin')
        self.validate_required(self.bill_item_end, 'bill_item_end')
        self.validate_required(self.bill_item_money, 'bill_item_money')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bill_item_id is not None:
            result['bill_item_id'] = self.bill_item_id
        if self.bill_item_name is not None:
            result['bill_item_name'] = self.bill_item_name
        if self.bill_item_begin is not None:
            result['bill_item_begin'] = self.bill_item_begin
        if self.bill_item_end is not None:
            result['bill_item_end'] = self.bill_item_end
        if self.bill_item_money is not None:
            result['bill_item_money'] = self.bill_item_money
        if self.payment_state is not None:
            result['payment_state'] = self.payment_state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bill_item_id') is not None:
            self.bill_item_id = m.get('bill_item_id')
        if m.get('bill_item_name') is not None:
            self.bill_item_name = m.get('bill_item_name')
        if m.get('bill_item_begin') is not None:
            self.bill_item_begin = m.get('bill_item_begin')
        if m.get('bill_item_end') is not None:
            self.bill_item_end = m.get('bill_item_end')
        if m.get('bill_item_money') is not None:
            self.bill_item_money = m.get('bill_item_money')
        if m.get('payment_state') is not None:
            self.payment_state = m.get('payment_state')
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


class EntityChainData(TeaModel):
    def __init__(
        self,
        entity_id: str = None,
        content: str = None,
        sign: str = None,
        tx_hash: str = None,
    ):
        # 实体ID
        self.entity_id = entity_id
        # 数据原文
        self.content = content
        # 数据原文对应的签名
        self.sign = sign
        # 数据原文上链哈希
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.entity_id, 'entity_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.sign, 'sign')
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.entity_id is not None:
            result['entity_id'] = self.entity_id
        if self.content is not None:
            result['content'] = self.content
        if self.sign is not None:
            result['sign'] = self.sign
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('entity_id') is not None:
            self.entity_id = m.get('entity_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('sign') is not None:
            self.sign = m.get('sign')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class DataModel(TeaModel):
    def __init__(
        self,
        data_model_id: str = None,
        data_model_name: str = None,
        data_model: str = None,
        biz_type: str = None,
        customer_version: str = None,
        data_demo: str = None,
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
        # 数据样例
        self.data_demo = data_demo

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
        if self.data_demo is not None:
            result['data_demo'] = self.data_demo
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
        if m.get('data_demo') is not None:
            self.data_demo = m.get('data_demo')
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


class XrTicketPoolSuccessList(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        resource_id: str = None,
        valid_time: str = None,
        test_time: int = None,
        xr_apps: str = None,
        max_pool_count: int = None,
        xr_ticket_pool_name: str = None,
        xr_verification_type: str = None,
    ):
        # 租户id
        self.tenant_id = tenant_id
        # 资源id
        self.resource_id = resource_id
        # 有效期
        self.valid_time = valid_time
        # 体验时长
        self.test_time = test_time
        # vr设备集合
        self.xr_apps = xr_apps
        # 券池最大数
        self.max_pool_count = max_pool_count
        # 券池名称
        self.xr_ticket_pool_name = xr_ticket_pool_name
        # 核销类型
        self.xr_verification_type = xr_verification_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.valid_time, 'valid_time')
        self.validate_required(self.test_time, 'test_time')
        self.validate_required(self.max_pool_count, 'max_pool_count')
        self.validate_required(self.xr_ticket_pool_name, 'xr_ticket_pool_name')
        self.validate_required(self.xr_verification_type, 'xr_verification_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.test_time is not None:
            result['test_time'] = self.test_time
        if self.xr_apps is not None:
            result['xr_apps'] = self.xr_apps
        if self.max_pool_count is not None:
            result['max_pool_count'] = self.max_pool_count
        if self.xr_ticket_pool_name is not None:
            result['xr_ticket_pool_name'] = self.xr_ticket_pool_name
        if self.xr_verification_type is not None:
            result['xr_verification_type'] = self.xr_verification_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('test_time') is not None:
            self.test_time = m.get('test_time')
        if m.get('xr_apps') is not None:
            self.xr_apps = m.get('xr_apps')
        if m.get('max_pool_count') is not None:
            self.max_pool_count = m.get('max_pool_count')
        if m.get('xr_ticket_pool_name') is not None:
            self.xr_ticket_pool_name = m.get('xr_ticket_pool_name')
        if m.get('xr_verification_type') is not None:
            self.xr_verification_type = m.get('xr_verification_type')
        return self


class AgentInfoVO(TeaModel):
    def __init__(
        self,
        agent_id: str = None,
        agent_name: str = None,
        lang_code: str = None,
        tts_voice_id: str = None,
        system_prompt: str = None,
        llm_model_list: List[DictionaryInfoBO] = None,
        tts_voice_list: List[DictionaryInfoBO] = None,
        language_list: List[DictionaryInfoBO] = None,
        parent_template_agent_name: str = None,
    ):
        # 智能体ID
        self.agent_id = agent_id
        # 智能体名称
        self.agent_name = agent_name
        # 语言编码
        self.lang_code = lang_code
        # 音色ID
        self.tts_voice_id = tts_voice_id
        # 系统提示词
        self.system_prompt = system_prompt
        # 可选模型列表
        self.llm_model_list = llm_model_list
        # 可选音色列表
        self.tts_voice_list = tts_voice_list
        # 可选语言列表
        self.language_list = language_list
        # 父模板智能体名称
        self.parent_template_agent_name = parent_template_agent_name

    def validate(self):
        self.validate_required(self.agent_id, 'agent_id')
        self.validate_required(self.agent_name, 'agent_name')
        self.validate_required(self.lang_code, 'lang_code')
        self.validate_required(self.tts_voice_id, 'tts_voice_id')
        self.validate_required(self.system_prompt, 'system_prompt')
        if self.llm_model_list:
            for k in self.llm_model_list:
                if k:
                    k.validate()
        if self.tts_voice_list:
            for k in self.tts_voice_list:
                if k:
                    k.validate()
        if self.language_list:
            for k in self.language_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.lang_code is not None:
            result['lang_code'] = self.lang_code
        if self.tts_voice_id is not None:
            result['tts_voice_id'] = self.tts_voice_id
        if self.system_prompt is not None:
            result['system_prompt'] = self.system_prompt
        result['llm_model_list'] = []
        if self.llm_model_list is not None:
            for k in self.llm_model_list:
                result['llm_model_list'].append(k.to_map() if k else None)
        result['tts_voice_list'] = []
        if self.tts_voice_list is not None:
            for k in self.tts_voice_list:
                result['tts_voice_list'].append(k.to_map() if k else None)
        result['language_list'] = []
        if self.language_list is not None:
            for k in self.language_list:
                result['language_list'].append(k.to_map() if k else None)
        if self.parent_template_agent_name is not None:
            result['parent_template_agent_name'] = self.parent_template_agent_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('lang_code') is not None:
            self.lang_code = m.get('lang_code')
        if m.get('tts_voice_id') is not None:
            self.tts_voice_id = m.get('tts_voice_id')
        if m.get('system_prompt') is not None:
            self.system_prompt = m.get('system_prompt')
        self.llm_model_list = []
        if m.get('llm_model_list') is not None:
            for k in m.get('llm_model_list'):
                temp_model = DictionaryInfoBO()
                self.llm_model_list.append(temp_model.from_map(k))
        self.tts_voice_list = []
        if m.get('tts_voice_list') is not None:
            for k in m.get('tts_voice_list'):
                temp_model = DictionaryInfoBO()
                self.tts_voice_list.append(temp_model.from_map(k))
        self.language_list = []
        if m.get('language_list') is not None:
            for k in m.get('language_list'):
                temp_model = DictionaryInfoBO()
                self.language_list.append(temp_model.from_map(k))
        if m.get('parent_template_agent_name') is not None:
            self.parent_template_agent_name = m.get('parent_template_agent_name')
        return self


class AssetElementRelationInfo(TeaModel):
    def __init__(
        self,
        source_element_id: str = None,
        target_element_id: str = None,
        relation_type: int = None,
        relation_dependency_type: str = None,
        relation_dependency: str = None,
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
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('source_element_name') is not None:
            self.source_element_name = m.get('source_element_name')
        if m.get('target_element_name') is not None:
            self.target_element_name = m.get('target_element_name')
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


class IotBasicDeviceRegisterFail(TeaModel):
    def __init__(
        self,
        device_name: str = None,
        device_sn: str = None,
        code: str = None,
        message: str = None,
    ):
        # 设备名称
        self.device_name = device_name
        # 设备sn
        self.device_sn = device_sn
        # 错误编码
        self.code = code
        # 错误描述
        self.message = message

    def validate(self):
        self.validate_required(self.device_name, 'device_name')
        self.validate_required(self.device_sn, 'device_sn')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
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
        trustiot_device_id: int = None,
    ):
        # 设备ID，一般是设备的出厂编码或业务上的资产ID
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
        # 可信设备ID
        self.trustiot_device_id = trustiot_device_id

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
        if m.get('trustiot_device_id') is not None:
            self.trustiot_device_id = m.get('trustiot_device_id')
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


class DeviceOperateInfo(TeaModel):
    def __init__(
        self,
        device_did: str = None,
        signature: str = None,
    ):
        # 蚂蚁链iot平台设备ID
        self.device_did = device_did
        # 设备签名
        self.signature = signature

    def validate(self):
        self.validate_required(self.device_did, 'device_did')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_did is not None:
            result['device_did'] = self.device_did
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_did') is not None:
            self.device_did = m.get('device_did')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
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


class XrUserTicketDetail(TeaModel):
    def __init__(
        self,
        biz_scene: str = None,
        tenant_id: str = None,
        xr_ticket_code: str = None,
        xr_ticket_pool_name: str = None,
        user_id: str = None,
        resource_id: str = None,
        resource_name: str = None,
        status: str = None,
        valid_time: str = None,
        instance_id: str = None,
        xr_verification_time: str = None,
        sample_start_time: str = None,
        sample_end_time: str = None,
        xr_verification_type: str = None,
        instance_name: str = None,
        test_time: int = None,
        xr_apps: str = None,
    ):
        # 业务类型
        self.biz_scene = biz_scene
        # 所属客户
        self.tenant_id = tenant_id
        # 用户通行证编码
        self.xr_ticket_code = xr_ticket_code
        # xr通行证资源池名称
        self.xr_ticket_pool_name = xr_ticket_pool_name
        # 用户id
        self.user_id = user_id
        # 资源id
        self.resource_id = resource_id
        # 资源名称
        self.resource_name = resource_name
        # 用户通行证状态
        self.status = status
        # 有效期
        self.valid_time = valid_time
        # 实例id
        self.instance_id = instance_id
        # 核销时间
        self.xr_verification_time = xr_verification_time
        # 体验开始时间
        self.sample_start_time = sample_start_time
        # 体验结束时间
        self.sample_end_time = sample_end_time
        # 核销类型
        self.xr_verification_type = xr_verification_type
        # 实例名称
        self.instance_name = instance_name
        # 体验时长，分
        self.test_time = test_time
        # vr应用集合
        self.xr_apps = xr_apps

    def validate(self):
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.xr_ticket_code, 'xr_ticket_code')
        self.validate_required(self.xr_ticket_pool_name, 'xr_ticket_pool_name')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.resource_name, 'resource_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.valid_time, 'valid_time')
        self.validate_required(self.xr_verification_type, 'xr_verification_type')
        self.validate_required(self.test_time, 'test_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.xr_ticket_code is not None:
            result['xr_ticket_code'] = self.xr_ticket_code
        if self.xr_ticket_pool_name is not None:
            result['xr_ticket_pool_name'] = self.xr_ticket_pool_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.resource_name is not None:
            result['resource_name'] = self.resource_name
        if self.status is not None:
            result['status'] = self.status
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.xr_verification_time is not None:
            result['xr_verification_time'] = self.xr_verification_time
        if self.sample_start_time is not None:
            result['sample_start_time'] = self.sample_start_time
        if self.sample_end_time is not None:
            result['sample_end_time'] = self.sample_end_time
        if self.xr_verification_type is not None:
            result['xr_verification_type'] = self.xr_verification_type
        if self.instance_name is not None:
            result['instance_name'] = self.instance_name
        if self.test_time is not None:
            result['test_time'] = self.test_time
        if self.xr_apps is not None:
            result['xr_apps'] = self.xr_apps
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('xr_ticket_code') is not None:
            self.xr_ticket_code = m.get('xr_ticket_code')
        if m.get('xr_ticket_pool_name') is not None:
            self.xr_ticket_pool_name = m.get('xr_ticket_pool_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('resource_name') is not None:
            self.resource_name = m.get('resource_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('xr_verification_time') is not None:
            self.xr_verification_time = m.get('xr_verification_time')
        if m.get('sample_start_time') is not None:
            self.sample_start_time = m.get('sample_start_time')
        if m.get('sample_end_time') is not None:
            self.sample_end_time = m.get('sample_end_time')
        if m.get('xr_verification_type') is not None:
            self.xr_verification_type = m.get('xr_verification_type')
        if m.get('instance_name') is not None:
            self.instance_name = m.get('instance_name')
        if m.get('test_time') is not None:
            self.test_time = m.get('test_time')
        if m.get('xr_apps') is not None:
            self.xr_apps = m.get('xr_apps')
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


class DeviceInfos(TeaModel):
    def __init__(
        self,
        tuid: str = None,
        device_status: str = None,
        device_ota_version: str = None,
    ):
        # tuid
        self.tuid = tuid
        # 设备状态
        self.device_status = device_status
        # ota version
        self.device_ota_version = device_ota_version

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tuid is not None:
            result['tuid'] = self.tuid
        if self.device_status is not None:
            result['device_status'] = self.device_status
        if self.device_ota_version is not None:
            result['device_ota_version'] = self.device_ota_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tuid') is not None:
            self.tuid = m.get('tuid')
        if m.get('device_status') is not None:
            self.device_status = m.get('device_status')
        if m.get('device_ota_version') is not None:
            self.device_ota_version = m.get('device_ota_version')
        return self


class AiAgentChatHistoryBO(TeaModel):
    def __init__(
        self,
        client_id: str = None,
        client_type: str = None,
        conversation_content: str = None,
        conversation_type: str = None,
        session_id: str = None,
        time: str = None,
    ):
        # 客户端ID
        self.client_id = client_id
        # 客户端类型
        self.client_type = client_type
        # 对话内容
        self.conversation_content = conversation_content
        # 对话类型
        self.conversation_type = conversation_type
        # 会话ID
        self.session_id = session_id
        # 对话时间（格式化后的时间）
        self.time = time

    def validate(self):
        self.validate_required(self.client_id, 'client_id')
        self.validate_required(self.client_type, 'client_type')
        self.validate_required(self.conversation_content, 'conversation_content')
        self.validate_required(self.conversation_type, 'conversation_type')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.time, 'time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.client_type is not None:
            result['client_type'] = self.client_type
        if self.conversation_content is not None:
            result['conversation_content'] = self.conversation_content
        if self.conversation_type is not None:
            result['conversation_type'] = self.conversation_type
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.time is not None:
            result['time'] = self.time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('client_type') is not None:
            self.client_type = m.get('client_type')
        if m.get('conversation_content') is not None:
            self.conversation_content = m.get('conversation_content')
        if m.get('conversation_type') is not None:
            self.conversation_type = m.get('conversation_type')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('time') is not None:
            self.time = m.get('time')
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


class TaskInfo(TeaModel):
    def __init__(
        self,
        plan_id: int = None,
        plan_step_id: int = None,
        task_id: int = None,
        action_id: int = None,
        task_type: str = None,
    ):
        # 升级计划Id
        self.plan_id = plan_id
        # 刷库计划步骤id
        self.plan_step_id = plan_step_id
        # 任务id
        self.task_id = task_id
        # action_id
        self.action_id = action_id
        # 任务类型
        self.task_type = task_type

    def validate(self):
        if self.plan_id is not None:
            self.validate_minimum(self.plan_id, 'plan_id', 0)
        if self.plan_step_id is not None:
            self.validate_minimum(self.plan_step_id, 'plan_step_id', 0)
        if self.task_id is not None:
            self.validate_minimum(self.task_id, 'task_id', 0)
        if self.action_id is not None:
            self.validate_minimum(self.action_id, 'action_id', 0)
        self.validate_required(self.task_type, 'task_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.plan_id is not None:
            result['plan_id'] = self.plan_id
        if self.plan_step_id is not None:
            result['plan_step_id'] = self.plan_step_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.action_id is not None:
            result['action_id'] = self.action_id
        if self.task_type is not None:
            result['task_type'] = self.task_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('plan_id') is not None:
            self.plan_id = m.get('plan_id')
        if m.get('plan_step_id') is not None:
            self.plan_step_id = m.get('plan_step_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('action_id') is not None:
            self.action_id = m.get('action_id')
        if m.get('task_type') is not None:
            self.task_type = m.get('task_type')
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


class DeviceTripProperties(TeaModel):
    def __init__(
        self,
        report_time: str = None,
        power_status: str = None,
        endurance_mileage: str = None,
        total_mileage: str = None,
        speed: str = None,
        coord: str = None,
        location: str = None,
        rein: str = None,
        spd_bd: str = None,
        cs: str = None,
        eqst: str = None,
    ):
        # 上报时间
        self.report_time = report_time
        # 1
        self.power_status = power_status
        # 1
        self.endurance_mileage = endurance_mileage
        # 1
        self.total_mileage = total_mileage
        # 1
        self.speed = speed
        # 1
        self.coord = coord
        # 1
        self.location = location
        # 1
        self.rein = rein
        # 1
        self.spd_bd = spd_bd
        # 1
        self.cs = cs
        # 1
        self.eqst = eqst

    def validate(self):
        self.validate_required(self.report_time, 'report_time')
        self.validate_required(self.power_status, 'power_status')
        self.validate_required(self.endurance_mileage, 'endurance_mileage')
        self.validate_required(self.total_mileage, 'total_mileage')
        self.validate_required(self.speed, 'speed')
        self.validate_required(self.coord, 'coord')
        self.validate_required(self.location, 'location')
        self.validate_required(self.rein, 'rein')
        self.validate_required(self.spd_bd, 'spd_bd')
        self.validate_required(self.cs, 'cs')
        self.validate_required(self.eqst, 'eqst')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.report_time is not None:
            result['report_time'] = self.report_time
        if self.power_status is not None:
            result['power_status'] = self.power_status
        if self.endurance_mileage is not None:
            result['endurance_mileage'] = self.endurance_mileage
        if self.total_mileage is not None:
            result['total_mileage'] = self.total_mileage
        if self.speed is not None:
            result['speed'] = self.speed
        if self.coord is not None:
            result['coord'] = self.coord
        if self.location is not None:
            result['location'] = self.location
        if self.rein is not None:
            result['rein'] = self.rein
        if self.spd_bd is not None:
            result['spd_bd'] = self.spd_bd
        if self.cs is not None:
            result['cs'] = self.cs
        if self.eqst is not None:
            result['eqst'] = self.eqst
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('report_time') is not None:
            self.report_time = m.get('report_time')
        if m.get('power_status') is not None:
            self.power_status = m.get('power_status')
        if m.get('endurance_mileage') is not None:
            self.endurance_mileage = m.get('endurance_mileage')
        if m.get('total_mileage') is not None:
            self.total_mileage = m.get('total_mileage')
        if m.get('speed') is not None:
            self.speed = m.get('speed')
        if m.get('coord') is not None:
            self.coord = m.get('coord')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('rein') is not None:
            self.rein = m.get('rein')
        if m.get('spd_bd') is not None:
            self.spd_bd = m.get('spd_bd')
        if m.get('cs') is not None:
            self.cs = m.get('cs')
        if m.get('eqst') is not None:
            self.eqst = m.get('eqst')
        return self


class IotbasicCategoryIndustrySceneInfo(TeaModel):
    def __init__(
        self,
        industry: str = None,
        scene: str = None,
    ):
        # 行业
        self.industry = industry
        # 场景
        self.scene = scene

    def validate(self):
        self.validate_required(self.industry, 'industry')
        self.validate_required(self.scene, 'scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.industry is not None:
            result['industry'] = self.industry
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class IotbasicDeviceModelFixedAttributeInfo(TeaModel):
    def __init__(
        self,
        attribute_name: str = None,
        attribute_value: str = None,
        data_type: str = None,
        data_range_min: int = None,
        data_range_max: int = None,
    ):
        # 属性说明
        self.attribute_name = attribute_name
        # 属性名称
        self.attribute_value = attribute_value
        # 数据值类型
        # 字符串：string
        # 数字：long
        self.data_type = data_type
        # dataType为string时，表示数据长度最小值
        # dataType为long时，表示数据范围最小值
        self.data_range_min = data_range_min
        # dataType为string时，表示数据长度最大值
        # dataType为long时，表示数据范围最大值
        self.data_range_max = data_range_max

    def validate(self):
        self.validate_required(self.attribute_name, 'attribute_name')
        self.validate_required(self.attribute_value, 'attribute_value')
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.data_range_min, 'data_range_min')
        self.validate_required(self.data_range_max, 'data_range_max')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.attribute_name is not None:
            result['attribute_name'] = self.attribute_name
        if self.attribute_value is not None:
            result['attribute_value'] = self.attribute_value
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.data_range_min is not None:
            result['data_range_min'] = self.data_range_min
        if self.data_range_max is not None:
            result['data_range_max'] = self.data_range_max
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('attribute_name') is not None:
            self.attribute_name = m.get('attribute_name')
        if m.get('attribute_value') is not None:
            self.attribute_value = m.get('attribute_value')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('data_range_min') is not None:
            self.data_range_min = m.get('data_range_min')
        if m.get('data_range_max') is not None:
            self.data_range_max = m.get('data_range_max')
        return self


class BatchJobDetail(TeaModel):
    def __init__(
        self,
        batch_id: str = None,
        batch_name: str = None,
        status: str = None,
        tenant_id: int = None,
        trigger_mode: str = None,
        scheduled_time: int = None,
        actual_start_time: int = None,
        actual_end_time: int = None,
        total_count: int = None,
        success_count: int = None,
        failed_count: int = None,
        operator: str = None,
    ):
        # 批次Id
        self.batch_id = batch_id
        # 批次名称
        self.batch_name = batch_name
        # 批次状态
        self.status = status
        # 租户Id
        self.tenant_id = tenant_id
        # 触发模式
        self.trigger_mode = trigger_mode
        # 定时执行时间戳
        self.scheduled_time = scheduled_time
        # 实际开始时间戳
        self.actual_start_time = actual_start_time
        # 实际结束时间戳
        self.actual_end_time = actual_end_time
        # 总设备数
        self.total_count = total_count
        # 成功数
        self.success_count = success_count
        # 失败数
        self.failed_count = failed_count
        # 操作人
        self.operator = operator

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        if self.batch_name is not None:
            result['batch_name'] = self.batch_name
        if self.status is not None:
            result['status'] = self.status
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.trigger_mode is not None:
            result['trigger_mode'] = self.trigger_mode
        if self.scheduled_time is not None:
            result['scheduled_time'] = self.scheduled_time
        if self.actual_start_time is not None:
            result['actual_start_time'] = self.actual_start_time
        if self.actual_end_time is not None:
            result['actual_end_time'] = self.actual_end_time
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.failed_count is not None:
            result['failed_count'] = self.failed_count
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        if m.get('batch_name') is not None:
            self.batch_name = m.get('batch_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('trigger_mode') is not None:
            self.trigger_mode = m.get('trigger_mode')
        if m.get('scheduled_time') is not None:
            self.scheduled_time = m.get('scheduled_time')
        if m.get('actual_start_time') is not None:
            self.actual_start_time = m.get('actual_start_time')
        if m.get('actual_end_time') is not None:
            self.actual_end_time = m.get('actual_end_time')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('failed_count') is not None:
            self.failed_count = m.get('failed_count')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class TripDetail(TeaModel):
    def __init__(
        self,
        trip_id: str = None,
        start_time: int = None,
        end_time: int = None,
        mileage: str = None,
        duration: TripDuration = None,
        max_speed: str = None,
        avg_speed: str = None,
        first_address: str = None,
        last_address: str = None,
        first_location_time: int = None,
        last_location_time: int = None,
    ):
        # 行程id
        self.trip_id = trip_id
        # 开始时间
        self.start_time = start_time
        # 结束时间
        self.end_time = end_time
        # 行驶里程
        self.mileage = mileage
        # 单次用时
        self.duration = duration
        # 最高速度
        self.max_speed = max_speed
        # 平均速度
        self.avg_speed = avg_speed
        # 开始地址
        self.first_address = first_address
        # 结束地址
        self.last_address = last_address
        # 最开始定位时间
        self.first_location_time = first_location_time
        # 最后结束定位时间
        self.last_location_time = last_location_time

    def validate(self):
        self.validate_required(self.trip_id, 'trip_id')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')
        self.validate_required(self.mileage, 'mileage')
        self.validate_required(self.duration, 'duration')
        if self.duration:
            self.duration.validate()
        self.validate_required(self.max_speed, 'max_speed')
        self.validate_required(self.avg_speed, 'avg_speed')
        self.validate_required(self.first_address, 'first_address')
        self.validate_required(self.last_address, 'last_address')
        self.validate_required(self.first_location_time, 'first_location_time')
        self.validate_required(self.last_location_time, 'last_location_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trip_id is not None:
            result['trip_id'] = self.trip_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.mileage is not None:
            result['mileage'] = self.mileage
        if self.duration is not None:
            result['duration'] = self.duration.to_map()
        if self.max_speed is not None:
            result['max_speed'] = self.max_speed
        if self.avg_speed is not None:
            result['avg_speed'] = self.avg_speed
        if self.first_address is not None:
            result['first_address'] = self.first_address
        if self.last_address is not None:
            result['last_address'] = self.last_address
        if self.first_location_time is not None:
            result['first_location_time'] = self.first_location_time
        if self.last_location_time is not None:
            result['last_location_time'] = self.last_location_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trip_id') is not None:
            self.trip_id = m.get('trip_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('mileage') is not None:
            self.mileage = m.get('mileage')
        if m.get('duration') is not None:
            temp_model = TripDuration()
            self.duration = temp_model.from_map(m['duration'])
        if m.get('max_speed') is not None:
            self.max_speed = m.get('max_speed')
        if m.get('avg_speed') is not None:
            self.avg_speed = m.get('avg_speed')
        if m.get('first_address') is not None:
            self.first_address = m.get('first_address')
        if m.get('last_address') is not None:
            self.last_address = m.get('last_address')
        if m.get('first_location_time') is not None:
            self.first_location_time = m.get('first_location_time')
        if m.get('last_location_time') is not None:
            self.last_location_time = m.get('last_location_time')
        return self


class XrTicketPoolFailList(TeaModel):
    def __init__(
        self,
        xr_ticket_pool_name: str = None,
        resource_id: str = None,
        error_code: str = None,
        tenant_id: str = None,
        error_msg: str = None,
        xr_verification_type: str = None,
    ):
        # 券名称
        self.xr_ticket_pool_name = xr_ticket_pool_name
        # 资源id
        self.resource_id = resource_id
        # 错误码
        self.error_code = error_code
        # 租户id
        self.tenant_id = tenant_id
        # 错误信息
        self.error_msg = error_msg
        # 核销类型
        self.xr_verification_type = xr_verification_type

    def validate(self):
        self.validate_required(self.xr_ticket_pool_name, 'xr_ticket_pool_name')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.error_msg, 'error_msg')
        self.validate_required(self.xr_verification_type, 'xr_verification_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.xr_ticket_pool_name is not None:
            result['xr_ticket_pool_name'] = self.xr_ticket_pool_name
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.xr_verification_type is not None:
            result['xr_verification_type'] = self.xr_verification_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('xr_ticket_pool_name') is not None:
            self.xr_ticket_pool_name = m.get('xr_ticket_pool_name')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('xr_verification_type') is not None:
            self.xr_verification_type = m.get('xr_verification_type')
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


class EmpowerDeviceInfo(TeaModel):
    def __init__(
        self,
        device_id: str = None,
        auth_status: str = None,
        remove_time: int = None,
    ):
        # 设备ID
        self.device_id = device_id
        # ACCEPTED(接受)/REVOKED(撤销)
        self.auth_status = auth_status
        # 移除授权时间，毫秒级时间戳
        self.remove_time = remove_time

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.auth_status, 'auth_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        if self.remove_time is not None:
            result['remove_time'] = self.remove_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        if m.get('remove_time') is not None:
            self.remove_time = m.get('remove_time')
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


class XrVerificationModelVo(TeaModel):
    def __init__(
        self,
        instance_id: str = None,
        instance_name: str = None,
        valid_time: str = None,
        sevice_status: str = None,
        device_status: str = None,
        resource_id: str = None,
        resource_name: str = None,
        type: str = None,
    ):
        # 核销资源生成的实例，xr设备对应设备did
        self.instance_id = instance_id
        # 生成的实例名称，xr设备就的对应的具体设备sn
        self.instance_name = instance_name
        # 线下场有效期
        self.valid_time = valid_time
        # 服务状态：INIT初始化、SERVICING服务中、PAUSED已暂停、EXPIRED停用
        self.sevice_status = sevice_status
        # 设备状态：INIT 初始化、ONLINE 在线、OFFLINE 离线、FAULT 故障、ACTIVATED 激活
        self.device_status = device_status
        # 唯一ID，对应线下场code
        self.resource_id = resource_id
        # 对应线下场名称
        self.resource_name = resource_name
        # 核销类型
        self.type = type

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.instance_name, 'instance_name')
        self.validate_required(self.valid_time, 'valid_time')
        self.validate_required(self.sevice_status, 'sevice_status')
        self.validate_required(self.device_status, 'device_status')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.resource_name, 'resource_name')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.instance_name is not None:
            result['instance_name'] = self.instance_name
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.sevice_status is not None:
            result['sevice_status'] = self.sevice_status
        if self.device_status is not None:
            result['device_status'] = self.device_status
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.resource_name is not None:
            result['resource_name'] = self.resource_name
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('instance_name') is not None:
            self.instance_name = m.get('instance_name')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('sevice_status') is not None:
            self.sevice_status = m.get('sevice_status')
        if m.get('device_status') is not None:
            self.device_status = m.get('device_status')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('resource_name') is not None:
            self.resource_name = m.get('resource_name')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class BizStatusInfoOp(TeaModel):
    def __init__(
        self,
        biz_type: str = None,
        biz_status: str = None,
        op_time: str = None,
    ):
        # 业务状态类型
        self.biz_type = biz_type
        # 业务状态
        self.biz_status = biz_status
        # 时间
        self.op_time = op_time

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.biz_status, 'biz_status')
        self.validate_required(self.op_time, 'op_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.biz_status is not None:
            result['biz_status'] = self.biz_status
        if self.op_time is not None:
            result['op_time'] = self.op_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('biz_status') is not None:
            self.biz_status = m.get('biz_status')
        if m.get('op_time') is not None:
            self.op_time = m.get('op_time')
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


class DeviceCollectFail(TeaModel):
    def __init__(
        self,
        collect_id: str = None,
        code: str = None,
        message: str = None,
    ):
        # 上链数据采集ID
        self.collect_id = collect_id
        # 错误码
        self.code = code
        # 错误信息
        self.message = message

    def validate(self):
        self.validate_required(self.collect_id, 'collect_id')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.collect_id is not None:
            result['collect_id'] = self.collect_id
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('collect_id') is not None:
            self.collect_id = m.get('collect_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
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


class JtMedia(TeaModel):
    def __init__(
        self,
        media_id: str = None,
        name: str = None,
        url: str = None,
        gmt_create: int = None,
        media_type: str = None,
    ):
        # 多媒体ID
        self.media_id = media_id
        # 文件名称
        self.name = name
        # 可访问的url
        self.url = url
        # 上传时间
        self.gmt_create = gmt_create
        # 多媒体类型枚举：IMAGE 图像；AUDIO 音频；VIDEO视频； UN_KNOW  未知；
        self.media_type = media_type

    def validate(self):
        self.validate_required(self.media_id, 'media_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.url, 'url')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.media_type, 'media_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.media_id is not None:
            result['media_id'] = self.media_id
        if self.name is not None:
            result['name'] = self.name
        if self.url is not None:
            result['url'] = self.url
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.media_type is not None:
            result['media_type'] = self.media_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('media_id') is not None:
            self.media_id = m.get('media_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('media_type') is not None:
            self.media_type = m.get('media_type')
        return self


class TripStatistics(TeaModel):
    def __init__(
        self,
        total_mileage: str = None,
        total_duration: TripDuration = None,
        total_count: int = None,
        period_code: int = None,
    ):
        # 总里程
        self.total_mileage = total_mileage
        # 时间体
        self.total_duration = total_duration
        # 总次数
        self.total_count = total_count
        # 时期码
        self.period_code = period_code

    def validate(self):
        self.validate_required(self.total_mileage, 'total_mileage')
        self.validate_required(self.total_duration, 'total_duration')
        if self.total_duration:
            self.total_duration.validate()
        self.validate_required(self.total_count, 'total_count')
        self.validate_required(self.period_code, 'period_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total_mileage is not None:
            result['total_mileage'] = self.total_mileage
        if self.total_duration is not None:
            result['total_duration'] = self.total_duration.to_map()
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.period_code is not None:
            result['period_code'] = self.period_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total_mileage') is not None:
            self.total_mileage = m.get('total_mileage')
        if m.get('total_duration') is not None:
            temp_model = TripDuration()
            self.total_duration = temp_model.from_map(m['total_duration'])
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('period_code') is not None:
            self.period_code = m.get('period_code')
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


class TaskDetail(TeaModel):
    def __init__(
        self,
        batch_id: str = None,
        tuid: str = None,
        device_name: str = None,
        status: str = None,
        invoke_time: int = None,
        error_msg: str = None,
        retry_count: int = None,
    ):
        # 批次id
        self.batch_id = batch_id
        # tuid
        self.tuid = tuid
        # device_name
        self.device_name = device_name
        # 状态
        self.status = status
        # 调用时间
        self.invoke_time = invoke_time
        # 错误信息
        self.error_msg = error_msg
        # 重试次数
        self.retry_count = retry_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        if self.tuid is not None:
            result['tuid'] = self.tuid
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.status is not None:
            result['status'] = self.status
        if self.invoke_time is not None:
            result['invoke_time'] = self.invoke_time
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.retry_count is not None:
            result['retry_count'] = self.retry_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        if m.get('tuid') is not None:
            self.tuid = m.get('tuid')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('invoke_time') is not None:
            self.invoke_time = m.get('invoke_time')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('retry_count') is not None:
            self.retry_count = m.get('retry_count')
        return self


class EventSpecs(TeaModel):
    def __init__(
        self,
        event_model_id: str = None,
        return_hash: bool = None,
        biz_type: str = None,
        submit_date: str = None,
        is_repaired: bool = None,
    ):
        # 物模型事件ID
        self.event_model_id = event_model_id
        # 是否返回上链HASH，缺省值按false处理
        self.return_hash = return_hash
        # 业务数据标识
        self.biz_type = biz_type
        # 提交日期
        self.submit_date = submit_date
        # 是否是补数据内容
        self.is_repaired = is_repaired

    def validate(self):
        self.validate_required(self.event_model_id, 'event_model_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.event_model_id is not None:
            result['event_model_id'] = self.event_model_id
        if self.return_hash is not None:
            result['return_hash'] = self.return_hash
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.submit_date is not None:
            result['submit_date'] = self.submit_date
        if self.is_repaired is not None:
            result['is_repaired'] = self.is_repaired
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('event_model_id') is not None:
            self.event_model_id = m.get('event_model_id')
        if m.get('return_hash') is not None:
            self.return_hash = m.get('return_hash')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('submit_date') is not None:
            self.submit_date = m.get('submit_date')
        if m.get('is_repaired') is not None:
            self.is_repaired = m.get('is_repaired')
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


class XrTicketPoolBatchReq(TeaModel):
    def __init__(
        self,
        resource_id: str = None,
        valid_time: str = None,
        test_time: int = None,
        xr_apps: str = None,
        max_pool_count: int = None,
        xr_ticket_pool_name: str = None,
        xr_verification_type: str = None,
    ):
        # 资源id
        self.resource_id = resource_id
        # 通行证有效期
        self.valid_time = valid_time
        # 体验时长
        self.test_time = test_time
        # vr设备集合
        self.xr_apps = xr_apps
        # 券池最大出票数
        self.max_pool_count = max_pool_count
        # 通行证名称
        self.xr_ticket_pool_name = xr_ticket_pool_name
        # 核销类型
        self.xr_verification_type = xr_verification_type

    def validate(self):
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.valid_time, 'valid_time')
        self.validate_required(self.test_time, 'test_time')
        self.validate_required(self.max_pool_count, 'max_pool_count')
        self.validate_required(self.xr_ticket_pool_name, 'xr_ticket_pool_name')
        self.validate_required(self.xr_verification_type, 'xr_verification_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.test_time is not None:
            result['test_time'] = self.test_time
        if self.xr_apps is not None:
            result['xr_apps'] = self.xr_apps
        if self.max_pool_count is not None:
            result['max_pool_count'] = self.max_pool_count
        if self.xr_ticket_pool_name is not None:
            result['xr_ticket_pool_name'] = self.xr_ticket_pool_name
        if self.xr_verification_type is not None:
            result['xr_verification_type'] = self.xr_verification_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('test_time') is not None:
            self.test_time = m.get('test_time')
        if m.get('xr_apps') is not None:
            self.xr_apps = m.get('xr_apps')
        if m.get('max_pool_count') is not None:
            self.max_pool_count = m.get('max_pool_count')
        if m.get('xr_ticket_pool_name') is not None:
            self.xr_ticket_pool_name = m.get('xr_ticket_pool_name')
        if m.get('xr_verification_type') is not None:
            self.xr_verification_type = m.get('xr_verification_type')
        return self


class DeviceControlFail(TeaModel):
    def __init__(
        self,
        device_did: str = None,
        code: str = None,
        message: str = None,
    ):
        # 设备did
        self.device_did = device_did
        # 操作失败code
        self.code = code
        # 操作失败信息
        self.message = message

    def validate(self):
        self.validate_required(self.device_did, 'device_did')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_did is not None:
            result['device_did'] = self.device_did
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_did') is not None:
            self.device_did = m.get('device_did')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
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
        # 
        self.device_id = device_id
        # 数据模型ID
        self.device_data_model_id = device_data_model_id
        # 设备端经过蚂蚁SDK或模组初始化得到的注册信息
        self.device_reg_content = device_reg_content
        # 蚂蚁侧SDK或模组对device_reg_content的签名
        self.device_reg_signature = device_reg_signature
        # sdk版本号，由蚂蚁侧提供
        self.sdk_id = sdk_id
        # 设备类型编码，联系蚂蚁侧获取设备类型编码
        # 
        self.device_type_code = device_type_code
        # 设备单价 单位：分
        # 
        self.initial_price = initial_price
        # 出厂时间
        # 
        self.factory_time = factory_time
        # 投放时间
        # 
        self.release_time = release_time
        # 额外信息，联系蚂蚁侧获取参数格式
        # 
        self.extra_info = extra_info
        # 资产所有人标识（统一社会信用代码）
        # 
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


class XrTicketPoolItem(TeaModel):
    def __init__(
        self,
        biz_scene: str = None,
        xr_ticket_pool_name: str = None,
        resource_id: str = None,
        valid_time: str = None,
        test_time: int = None,
        status: str = None,
        use_status: str = None,
        resource_name: str = None,
        xr_apps: str = None,
        max_pool_count: int = None,
        tenant_id: str = None,
        xr_verification_type: str = None,
        surplus_count: int = None,
        issued_count: int = None,
    ):
        # 业务类型
        self.biz_scene = biz_scene
        # 通行证名称
        self.xr_ticket_pool_name = xr_ticket_pool_name
        # 资源id
        self.resource_id = resource_id
        # 有效期
        self.valid_time = valid_time
        # 体验时长
        self.test_time = test_time
        # 通行证状态：EXPIRED：已过期  VALID：有效  SALED：已出售
        self.status = status
        # 判断已发放数量>0(USED：已使用)  判断已发放数量=0(NOT_USED：未使用)
        self.use_status = use_status
        # 资源名称
        self.resource_name = resource_name
        # 设备集合
        self.xr_apps = xr_apps
        # 券池最大票数
        self.max_pool_count = max_pool_count
        # 租户id
        self.tenant_id = tenant_id
        # 核销类型
        self.xr_verification_type = xr_verification_type
        # 剩余可用券数量
        self.surplus_count = surplus_count
        # 已发放数量 （总数-剩余数量）
        self.issued_count = issued_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.xr_ticket_pool_name is not None:
            result['xr_ticket_pool_name'] = self.xr_ticket_pool_name
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.test_time is not None:
            result['test_time'] = self.test_time
        if self.status is not None:
            result['status'] = self.status
        if self.use_status is not None:
            result['use_status'] = self.use_status
        if self.resource_name is not None:
            result['resource_name'] = self.resource_name
        if self.xr_apps is not None:
            result['xr_apps'] = self.xr_apps
        if self.max_pool_count is not None:
            result['max_pool_count'] = self.max_pool_count
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.xr_verification_type is not None:
            result['xr_verification_type'] = self.xr_verification_type
        if self.surplus_count is not None:
            result['surplus_count'] = self.surplus_count
        if self.issued_count is not None:
            result['issued_count'] = self.issued_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('xr_ticket_pool_name') is not None:
            self.xr_ticket_pool_name = m.get('xr_ticket_pool_name')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('test_time') is not None:
            self.test_time = m.get('test_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('use_status') is not None:
            self.use_status = m.get('use_status')
        if m.get('resource_name') is not None:
            self.resource_name = m.get('resource_name')
        if m.get('xr_apps') is not None:
            self.xr_apps = m.get('xr_apps')
        if m.get('max_pool_count') is not None:
            self.max_pool_count = m.get('max_pool_count')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('xr_verification_type') is not None:
            self.xr_verification_type = m.get('xr_verification_type')
        if m.get('surplus_count') is not None:
            self.surplus_count = m.get('surplus_count')
        if m.get('issued_count') is not None:
            self.issued_count = m.get('issued_count')
        return self


class KytApplyParams(TeaModel):
    def __init__(
        self,
        device_type: str = None,
        cred_type: str = None,
        brand_id: str = None,
        generate_code: str = None,
        protocol_type: str = None,
        key_less: str = None,
        mac: str = None,
        ble_name: str = None,
        channel: str = None,
    ):
        # 设备类型
        self.device_type = device_type
        # 凭证类型
        self.cred_type = cred_type
        # 品牌
        self.brand_id = brand_id
        # 凭证内容
        self.generate_code = generate_code
        # 协议类型
        self.protocol_type = protocol_type
        # 无感参数
        self.key_less = key_less
        # mac
        self.mac = mac
        # ble_name
        self.ble_name = ble_name
        # 通道
        self.channel = channel

    def validate(self):
        self.validate_required(self.brand_id, 'brand_id')
        self.validate_required(self.protocol_type, 'protocol_type')
        self.validate_required(self.key_less, 'key_less')
        self.validate_required(self.mac, 'mac')
        self.validate_required(self.ble_name, 'ble_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_type is not None:
            result['device_type'] = self.device_type
        if self.cred_type is not None:
            result['cred_type'] = self.cred_type
        if self.brand_id is not None:
            result['brand_id'] = self.brand_id
        if self.generate_code is not None:
            result['generate_code'] = self.generate_code
        if self.protocol_type is not None:
            result['protocol_type'] = self.protocol_type
        if self.key_less is not None:
            result['key_less'] = self.key_less
        if self.mac is not None:
            result['mac'] = self.mac
        if self.ble_name is not None:
            result['ble_name'] = self.ble_name
        if self.channel is not None:
            result['channel'] = self.channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        if m.get('cred_type') is not None:
            self.cred_type = m.get('cred_type')
        if m.get('brand_id') is not None:
            self.brand_id = m.get('brand_id')
        if m.get('generate_code') is not None:
            self.generate_code = m.get('generate_code')
        if m.get('protocol_type') is not None:
            self.protocol_type = m.get('protocol_type')
        if m.get('key_less') is not None:
            self.key_less = m.get('key_less')
        if m.get('mac') is not None:
            self.mac = m.get('mac')
        if m.get('ble_name') is not None:
            self.ble_name = m.get('ble_name')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
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


class TripView(TeaModel):
    def __init__(
        self,
        trip_begin_time: str = None,
        trip_end_time: str = None,
        trip_total_distance: int = None,
        trip_time: int = None,
    ):
        # 开始时间
        self.trip_begin_time = trip_begin_time
        # 结束时间
        self.trip_end_time = trip_end_time
        # 行驶公里数
        self.trip_total_distance = trip_total_distance
        # 用时
        self.trip_time = trip_time

    def validate(self):
        self.validate_required(self.trip_begin_time, 'trip_begin_time')
        if self.trip_begin_time is not None:
            self.validate_pattern(self.trip_begin_time, 'trip_begin_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.trip_end_time, 'trip_end_time')
        if self.trip_end_time is not None:
            self.validate_pattern(self.trip_end_time, 'trip_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.trip_total_distance, 'trip_total_distance')
        self.validate_required(self.trip_time, 'trip_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trip_begin_time is not None:
            result['trip_begin_time'] = self.trip_begin_time
        if self.trip_end_time is not None:
            result['trip_end_time'] = self.trip_end_time
        if self.trip_total_distance is not None:
            result['trip_total_distance'] = self.trip_total_distance
        if self.trip_time is not None:
            result['trip_time'] = self.trip_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trip_begin_time') is not None:
            self.trip_begin_time = m.get('trip_begin_time')
        if m.get('trip_end_time') is not None:
            self.trip_end_time = m.get('trip_end_time')
        if m.get('trip_total_distance') is not None:
            self.trip_total_distance = m.get('trip_total_distance')
        if m.get('trip_time') is not None:
            self.trip_time = m.get('trip_time')
        return self


class TripTraceView(TeaModel):
    def __init__(
        self,
        begin_time: str = None,
        end_time: str = None,
        avg_speed: int = None,
        max_speed: int = None,
        last_location_time: str = None,
        last_location: str = None,
    ):
        # 开始时间
        self.begin_time = begin_time
        # 结束时间
        self.end_time = end_time
        # 平均速度
        self.avg_speed = avg_speed
        # 最大速度
        self.max_speed = max_speed
        # 最后定位时间
        self.last_location_time = last_location_time
        # 最后定位地址
        self.last_location = last_location

    def validate(self):
        self.validate_required(self.begin_time, 'begin_time')
        if self.begin_time is not None:
            self.validate_pattern(self.begin_time, 'begin_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.avg_speed, 'avg_speed')
        self.validate_required(self.max_speed, 'max_speed')
        self.validate_required(self.last_location_time, 'last_location_time')
        if self.last_location_time is not None:
            self.validate_pattern(self.last_location_time, 'last_location_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.last_location, 'last_location')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.begin_time is not None:
            result['begin_time'] = self.begin_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.avg_speed is not None:
            result['avg_speed'] = self.avg_speed
        if self.max_speed is not None:
            result['max_speed'] = self.max_speed
        if self.last_location_time is not None:
            result['last_location_time'] = self.last_location_time
        if self.last_location is not None:
            result['last_location'] = self.last_location
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('begin_time') is not None:
            self.begin_time = m.get('begin_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('avg_speed') is not None:
            self.avg_speed = m.get('avg_speed')
        if m.get('max_speed') is not None:
            self.max_speed = m.get('max_speed')
        if m.get('last_location_time') is not None:
            self.last_location_time = m.get('last_location_time')
        if m.get('last_location') is not None:
            self.last_location = m.get('last_location')
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


class BaiQrcodeParseRespData(TeaModel):
    def __init__(
        self,
        code_value: List[str] = None,
    ):
        # 二维码内容
        self.code_value = code_value

    def validate(self):
        self.validate_required(self.code_value, 'code_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code_value is not None:
            result['code_value'] = self.code_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code_value') is not None:
            self.code_value = m.get('code_value')
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


class IotbasicDigitalKeyDeviceInfo(TeaModel):
    def __init__(
        self,
        devid: str = None,
        dev_name: str = None,
        sn: str = None,
        ccid: str = None,
        msisdn: str = None,
        ver: str = None,
    ):
        # 设备id
        self.devid = devid
        # 设备名称
        self.dev_name = dev_name
        # 设备sn
        self.sn = sn
        # Ccid
        self.ccid = ccid
        # Msisdn
        self.msisdn = msisdn
        # tbox固件版本号(16进制)
        self.ver = ver

    def validate(self):
        self.validate_required(self.devid, 'devid')
        self.validate_required(self.dev_name, 'dev_name')
        self.validate_required(self.sn, 'sn')
        self.validate_required(self.ccid, 'ccid')
        self.validate_required(self.msisdn, 'msisdn')
        self.validate_required(self.ver, 'ver')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.devid is not None:
            result['devid'] = self.devid
        if self.dev_name is not None:
            result['dev_name'] = self.dev_name
        if self.sn is not None:
            result['sn'] = self.sn
        if self.ccid is not None:
            result['ccid'] = self.ccid
        if self.msisdn is not None:
            result['msisdn'] = self.msisdn
        if self.ver is not None:
            result['ver'] = self.ver
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('devid') is not None:
            self.devid = m.get('devid')
        if m.get('dev_name') is not None:
            self.dev_name = m.get('dev_name')
        if m.get('sn') is not None:
            self.sn = m.get('sn')
        if m.get('ccid') is not None:
            self.ccid = m.get('ccid')
        if m.get('msisdn') is not None:
            self.msisdn = m.get('msisdn')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        return self


class BaiQrcodeParseReqData(TeaModel):
    def __init__(
        self,
        image_url: str = None,
    ):
        # 待识别图片的url
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.image_url, 'image_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.image_url is not None:
            result['image_url'] = self.image_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('image_url') is not None:
            self.image_url = m.get('image_url')
        return self


class JtDevice(TeaModel):
    def __init__(
        self,
        device_id: str = None,
        scene: str = None,
        trustiot_device_id: int = None,
        gmt_create: int = None,
        online: bool = None,
        device_model: str = None,
        terminal_type: str = None,
    ):
        # 设备ID
        self.device_id = device_id
        # 场景码
        self.scene = scene
        # 可信设备ID
        self.trustiot_device_id = trustiot_device_id
        # 设备注册时间
        self.gmt_create = gmt_create
        # 设备是否在线
        self.online = online
        # 设备型号
        self.device_model = device_model
        # 终端型号
        self.terminal_type = terminal_type

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.trustiot_device_id, 'trustiot_device_id')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.online, 'online')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.scene is not None:
            result['scene'] = self.scene
        if self.trustiot_device_id is not None:
            result['trustiot_device_id'] = self.trustiot_device_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.online is not None:
            result['online'] = self.online
        if self.device_model is not None:
            result['device_model'] = self.device_model
        if self.terminal_type is not None:
            result['terminal_type'] = self.terminal_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('trustiot_device_id') is not None:
            self.trustiot_device_id = m.get('trustiot_device_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('online') is not None:
            self.online = m.get('online')
        if m.get('device_model') is not None:
            self.device_model = m.get('device_model')
        if m.get('terminal_type') is not None:
            self.terminal_type = m.get('terminal_type')
        return self


class IotbasicOtaModuleInfo(TeaModel):
    def __init__(
        self,
        module_name: str = None,
        last_version: str = None,
    ):
        # OTA模块名称
        self.module_name = module_name
        # 最新版本号
        self.last_version = last_version

    def validate(self):
        self.validate_required(self.module_name, 'module_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.module_name is not None:
            result['module_name'] = self.module_name
        if self.last_version is not None:
            result['last_version'] = self.last_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('module_name') is not None:
            self.module_name = m.get('module_name')
        if m.get('last_version') is not None:
            self.last_version = m.get('last_version')
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


class IotbasicDeviceModelAttributeFailInfo(TeaModel):
    def __init__(
        self,
        model_value: str = None,
        specs_list: List[str] = None,
        error_code: str = None,
        error_message: str = None,
    ):
        # 型号
        self.model_value = model_value
        # 规格列表 为空表示使用标准规格
        self.specs_list = specs_list
        # 失败code
        self.error_code = error_code
        # 失败消息
        self.error_message = error_message

    def validate(self):
        self.validate_required(self.model_value, 'model_value')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.error_message, 'error_message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model_value is not None:
            result['model_value'] = self.model_value
        if self.specs_list is not None:
            result['specs_list'] = self.specs_list
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_value') is not None:
            self.model_value = m.get('model_value')
        if m.get('specs_list') is not None:
            self.specs_list = m.get('specs_list')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class SendCollectorResult(TeaModel):
    def __init__(
        self,
        tx_hash: str = None,
        original_index: int = None,
        error_code: str = None,
        error_msg: str = None,
        extra_info: str = None,
    ):
        # 数据的链上哈希
        self.tx_hash = tx_hash
        # 原入参的数组索引
        self.original_index = original_index
        # 失败数据对应的异常码，成功时该字段为空
        self.error_code = error_code
        # 异常信息
        self.error_msg = error_msg
        # 返回的扩展信息
        self.extra_info = extra_info

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.original_index, 'original_index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('original_index') is not None:
            self.original_index = m.get('original_index')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        return self


class EBikeOperationLogPageResponse(TeaModel):
    def __init__(
        self,
        page_index: int = None,
        page_size: int = None,
        total_size: int = None,
        total_pages: int = None,
        page_data: List[EBikeOperationLog] = None,
    ):
        # 页数
        # 
        self.page_index = page_index
        # 页码
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
                temp_model = EBikeOperationLog()
                self.page_data.append(temp_model.from_map(k))
        return self


class GoodsDigitalFingerprintRegisterResultData(TeaModel):
    def __init__(
        self,
        success: bool = None,
        describe: str = None,
    ):
        # 指纹图片入库是否成功
        self.success = success
        # 失败原因
        self.describe = describe

    def validate(self):
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.describe is not None:
            result['describe'] = self.describe
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('describe') is not None:
            self.describe = m.get('describe')
        return self


class IotbasicReleaseDeviceInfo(TeaModel):
    def __init__(
        self,
        apk_name: str = None,
        apk_version: str = None,
        order_id: str = None,
        order_name: str = None,
        task_id: str = None,
        order_detail_id: str = None,
        device_sn: str = None,
        device_id: str = None,
        status: str = None,
        release_time: str = None,
        upgrade_time: str = None,
    ):
        # 应用名称
        self.apk_name = apk_name
        # 应用版本号
        self.apk_version = apk_version
        # 工单id
        self.order_id = order_id
        # 工单名称
        self.order_name = order_name
        # 任务id
        self.task_id = task_id
        # 设备升级任务唯一id
        self.order_detail_id = order_detail_id
        # 设备sn
        self.device_sn = device_sn
        # 设备id
        self.device_id = device_id
        # 设备升级状态
        # 待确认：CONFIRM
        # 待推送：QUEUED
        # 已推送：NOTIFIED
        # 升级中：IN_PROGRESS
        # 升级成功：SUCCEEDED
        # 升级失败：FAILED
        # 已取消：CANCELED
        # 升级超时：TIMEOUT
        self.status = status
        # 发布时间
        self.release_time = release_time
        # 升级完成时间
        self.upgrade_time = upgrade_time

    def validate(self):
        self.validate_required(self.apk_name, 'apk_name')
        self.validate_required(self.apk_version, 'apk_version')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.order_name, 'order_name')
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.order_detail_id, 'order_detail_id')
        self.validate_required(self.device_sn, 'device_sn')
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.apk_name is not None:
            result['apk_name'] = self.apk_name
        if self.apk_version is not None:
            result['apk_version'] = self.apk_version
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_name is not None:
            result['order_name'] = self.order_name
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.order_detail_id is not None:
            result['order_detail_id'] = self.order_detail_id
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.status is not None:
            result['status'] = self.status
        if self.release_time is not None:
            result['release_time'] = self.release_time
        if self.upgrade_time is not None:
            result['upgrade_time'] = self.upgrade_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apk_name') is not None:
            self.apk_name = m.get('apk_name')
        if m.get('apk_version') is not None:
            self.apk_version = m.get('apk_version')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_name') is not None:
            self.order_name = m.get('order_name')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('order_detail_id') is not None:
            self.order_detail_id = m.get('order_detail_id')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        if m.get('upgrade_time') is not None:
            self.upgrade_time = m.get('upgrade_time')
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


class TripStatisticsView(TeaModel):
    def __init__(
        self,
        total_distance: str = None,
        total_duration: str = None,
        trip_count: str = None,
        last_trip_distance: str = None,
        last_trip_avg_speed: str = None,
        last_trip_max_speed: str = None,
        last_trip_spend_time: str = None,
    ):
        # 过去七天内所有行驶记录的总里程	，单位km
        self.total_distance = total_distance
        # 行驶总用时
        self.total_duration = total_duration
        # 骑行次数
        self.trip_count = trip_count
        # 最近一次行驶的里程
        self.last_trip_distance = last_trip_distance
        # 最近一次行驶的平均速度	，单位  km/h
        self.last_trip_avg_speed = last_trip_avg_speed
        # 最近一次行驶的最大速度
        self.last_trip_max_speed = last_trip_max_speed
        # 最后一次行驶用时
        self.last_trip_spend_time = last_trip_spend_time

    def validate(self):
        self.validate_required(self.total_distance, 'total_distance')
        self.validate_required(self.total_duration, 'total_duration')
        self.validate_required(self.trip_count, 'trip_count')
        self.validate_required(self.last_trip_distance, 'last_trip_distance')
        self.validate_required(self.last_trip_avg_speed, 'last_trip_avg_speed')
        self.validate_required(self.last_trip_max_speed, 'last_trip_max_speed')
        self.validate_required(self.last_trip_spend_time, 'last_trip_spend_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total_distance is not None:
            result['total_distance'] = self.total_distance
        if self.total_duration is not None:
            result['total_duration'] = self.total_duration
        if self.trip_count is not None:
            result['trip_count'] = self.trip_count
        if self.last_trip_distance is not None:
            result['last_trip_distance'] = self.last_trip_distance
        if self.last_trip_avg_speed is not None:
            result['last_trip_avg_speed'] = self.last_trip_avg_speed
        if self.last_trip_max_speed is not None:
            result['last_trip_max_speed'] = self.last_trip_max_speed
        if self.last_trip_spend_time is not None:
            result['last_trip_spend_time'] = self.last_trip_spend_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total_distance') is not None:
            self.total_distance = m.get('total_distance')
        if m.get('total_duration') is not None:
            self.total_duration = m.get('total_duration')
        if m.get('trip_count') is not None:
            self.trip_count = m.get('trip_count')
        if m.get('last_trip_distance') is not None:
            self.last_trip_distance = m.get('last_trip_distance')
        if m.get('last_trip_avg_speed') is not None:
            self.last_trip_avg_speed = m.get('last_trip_avg_speed')
        if m.get('last_trip_max_speed') is not None:
            self.last_trip_max_speed = m.get('last_trip_max_speed')
        if m.get('last_trip_spend_time') is not None:
            self.last_trip_spend_time = m.get('last_trip_spend_time')
        return self


class DeviceOrderFail(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        device_did: str = None,
        code: str = None,
        message: str = None,
    ):
        # 订单id
        self.order_id = order_id
        # 设备did
        self.device_did = device_did
        # 返回code
        self.code = code
        # 失败
        self.message = message

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.device_did, 'device_did')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.device_did is not None:
            result['device_did'] = self.device_did
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('device_did') is not None:
            self.device_did = m.get('device_did')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
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


class AgentSessionVO(TeaModel):
    def __init__(
        self,
        session_id: str = None,
        user_id: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
    ):
        # 会话ID
        self.session_id = session_id
        # 用户ID
        self.user_id = user_id
        # 会话创建时间
        self.gmt_create = gmt_create
        # 会话修改时间
        self.gmt_modified = gmt_modified

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class DeviceCollectResult(TeaModel):
    def __init__(
        self,
        collect_id: str = None,
        antchain_id: str = None,
    ):
        # 上链数据采集ID
        self.collect_id = collect_id
        # 上链id
        self.antchain_id = antchain_id

    def validate(self):
        self.validate_required(self.collect_id, 'collect_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.collect_id is not None:
            result['collect_id'] = self.collect_id
        if self.antchain_id is not None:
            result['antchain_id'] = self.antchain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('collect_id') is not None:
            self.collect_id = m.get('collect_id')
        if m.get('antchain_id') is not None:
            self.antchain_id = m.get('antchain_id')
        return self


class TrustiotDeviceIdMap(TeaModel):
    def __init__(
        self,
        trustiot_device_id: int = None,
        device_id: str = None,
        chain_device_id: str = None,
    ):
        # 可信设备ID
        self.trustiot_device_id = trustiot_device_id
        # 设备ID
        self.device_id = device_id
        # 设备注册的上链哈希
        self.chain_device_id = chain_device_id

    def validate(self):
        self.validate_required(self.trustiot_device_id, 'trustiot_device_id')
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.chain_device_id, 'chain_device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trustiot_device_id is not None:
            result['trustiot_device_id'] = self.trustiot_device_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trustiot_device_id') is not None:
            self.trustiot_device_id = m.get('trustiot_device_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
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


class AntdigitalWithHoldResponse(TeaModel):
    def __init__(
        self,
        code: str = None,
        msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
        data: str = None,
        signature: str = None,
    ):
        # 网关返回码
        self.code = code
        # 网关返回码描述
        self.msg = msg
        # 务返回码
        self.sub_code = sub_code
        # 业务返回码描述
        self.sub_msg = sub_msg
        # 结果返回内容
        self.data = data
        # 响应签名
        self.signature = signature

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.sub_code, 'sub_code')
        self.validate_required(self.sub_msg, 'sub_msg')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        if self.data is not None:
            result['data'] = self.data
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class SubMerchantParams(TeaModel):
    def __init__(
        self,
        sub_merchant_id: str = None,
        sub_merchant_name: str = None,
        sub_merchant_service_name: str = None,
        sub_merchant_service_description: str = None,
    ):
        # 子商户的商户id
        self.sub_merchant_id = sub_merchant_id
        # 子商户的商户名称
        self.sub_merchant_name = sub_merchant_name
        # 子商户的服务名称
        self.sub_merchant_service_name = sub_merchant_service_name
        # 子商户的服务描述
        self.sub_merchant_service_description = sub_merchant_service_description

    def validate(self):
        self.validate_required(self.sub_merchant_id, 'sub_merchant_id')
        self.validate_required(self.sub_merchant_name, 'sub_merchant_name')
        self.validate_required(self.sub_merchant_service_name, 'sub_merchant_service_name')
        self.validate_required(self.sub_merchant_service_description, 'sub_merchant_service_description')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_merchant_id is not None:
            result['sub_merchant_id'] = self.sub_merchant_id
        if self.sub_merchant_name is not None:
            result['sub_merchant_name'] = self.sub_merchant_name
        if self.sub_merchant_service_name is not None:
            result['sub_merchant_service_name'] = self.sub_merchant_service_name
        if self.sub_merchant_service_description is not None:
            result['sub_merchant_service_description'] = self.sub_merchant_service_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_merchant_id') is not None:
            self.sub_merchant_id = m.get('sub_merchant_id')
        if m.get('sub_merchant_name') is not None:
            self.sub_merchant_name = m.get('sub_merchant_name')
        if m.get('sub_merchant_service_name') is not None:
            self.sub_merchant_service_name = m.get('sub_merchant_service_name')
        if m.get('sub_merchant_service_description') is not None:
            self.sub_merchant_service_description = m.get('sub_merchant_service_description')
        return self


class ChainModelResult(TeaModel):
    def __init__(
        self,
        biz_scene: str = None,
        data_scene: str = None,
        asset_id: str = None,
        asset_data: str = None,
        tenant_id: str = None,
        tx_time: str = None,
        business_id: str = None,
        antchain_id: str = None,
    ):
        # 所属业务
        self.biz_scene = biz_scene
        # 资产类型
        self.data_scene = data_scene
        # 资产id
        self.asset_id = asset_id
        # 资产数据内容json
        self.asset_data = asset_data
        # 租户id
        self.tenant_id = tenant_id
        # 上链时间
        self.tx_time = tx_time
        # 业务ID
        self.business_id = business_id
        # 上链id
        self.antchain_id = antchain_id

    def validate(self):
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.data_scene, 'data_scene')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.asset_data, 'asset_data')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.tx_time, 'tx_time')
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.antchain_id, 'antchain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.data_scene is not None:
            result['data_scene'] = self.data_scene
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.asset_data is not None:
            result['asset_data'] = self.asset_data
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.antchain_id is not None:
            result['antchain_id'] = self.antchain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('data_scene') is not None:
            self.data_scene = m.get('data_scene')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('asset_data') is not None:
            self.asset_data = m.get('asset_data')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('antchain_id') is not None:
            self.antchain_id = m.get('antchain_id')
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


class XrUserTicketPageInfo(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        xr_ticket_code: str = None,
        xr_ticket_pool_name: str = None,
        resource_name: str = None,
        status: str = None,
        valid_time: str = None,
        biz_scene: str = None,
        tenant_id: str = None,
        xr_verification_type: str = None,
    ):
        # 用户id
        self.user_id = user_id
        # 用户通行证编码
        self.xr_ticket_code = xr_ticket_code
        # xr通行证资源池名称
        self.xr_ticket_pool_name = xr_ticket_pool_name
        # 资源名称
        self.resource_name = resource_name
        # 用户通行证状态
        self.status = status
        # 有效期
        self.valid_time = valid_time
        # 所属业务
        self.biz_scene = biz_scene
        # 租户id
        self.tenant_id = tenant_id
        # 核销类型
        self.xr_verification_type = xr_verification_type

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.xr_ticket_code, 'xr_ticket_code')
        self.validate_required(self.xr_ticket_pool_name, 'xr_ticket_pool_name')
        self.validate_required(self.resource_name, 'resource_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.valid_time, 'valid_time')
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.xr_verification_type, 'xr_verification_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.xr_ticket_code is not None:
            result['xr_ticket_code'] = self.xr_ticket_code
        if self.xr_ticket_pool_name is not None:
            result['xr_ticket_pool_name'] = self.xr_ticket_pool_name
        if self.resource_name is not None:
            result['resource_name'] = self.resource_name
        if self.status is not None:
            result['status'] = self.status
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.xr_verification_type is not None:
            result['xr_verification_type'] = self.xr_verification_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('xr_ticket_code') is not None:
            self.xr_ticket_code = m.get('xr_ticket_code')
        if m.get('xr_ticket_pool_name') is not None:
            self.xr_ticket_pool_name = m.get('xr_ticket_pool_name')
        if m.get('resource_name') is not None:
            self.resource_name = m.get('resource_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('xr_verification_type') is not None:
            self.xr_verification_type = m.get('xr_verification_type')
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


class OrderPushInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        order_collect_time: str = None,
        total_amount: str = None,
        tenant_id: str = None,
    ):
        # 订单号
        self.order_id = order_id
        # 时间戳，取订单上链timestamp字段
        self.order_collect_time = order_collect_time
        # 订单总金额
        self.total_amount = total_amount
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.order_collect_time, 'order_collect_time')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_collect_time is not None:
            result['order_collect_time'] = self.order_collect_time
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_collect_time') is not None:
            self.order_collect_time = m.get('order_collect_time')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class SkuGrantStockInfoResp(TeaModel):
    def __init__(
        self,
        product_model: str = None,
        product_form: str = None,
        features: List[str] = None,
        cert_num: int = None,
    ):
        # 产品型号
        self.product_model = product_model
        # 产品形式，取值范围： SOFTWARE_HARDWARE：软硬一体（SE方案）, SOFTWARE：纯软（非SE方案）
        self.product_form = product_form
        # 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
        self.features = features
        # 授权数量(指当前证书凭证种类下未消耗的证书数量)
        self.cert_num = cert_num

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_model is not None:
            result['product_model'] = self.product_model
        if self.product_form is not None:
            result['product_form'] = self.product_form
        if self.features is not None:
            result['features'] = self.features
        if self.cert_num is not None:
            result['cert_num'] = self.cert_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_model') is not None:
            self.product_model = m.get('product_model')
        if m.get('product_form') is not None:
            self.product_form = m.get('product_form')
        if m.get('features') is not None:
            self.features = m.get('features')
        if m.get('cert_num') is not None:
            self.cert_num = m.get('cert_num')
        return self


class DeviceOrderResult(TeaModel):
    def __init__(
        self,
        antchain_id: str = None,
        order_id: str = None,
    ):
        # 上链id
        self.antchain_id = antchain_id
        # 订单id
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.antchain_id, 'antchain_id')
        self.validate_required(self.order_id, 'order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.antchain_id is not None:
            result['antchain_id'] = self.antchain_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('antchain_id') is not None:
            self.antchain_id = m.get('antchain_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class ThingModelEventVO(TeaModel):
    def __init__(
        self,
        name: str = None,
        feature_id: str = None,
        biz_type: str = None,
        event_properties: str = None,
    ):
        # 名称
        self.name = name
        # 物模型功能Id
        self.feature_id = feature_id
        # 业务标识
        self.biz_type = biz_type
        # 事件属性列表
        self.event_properties = event_properties

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.feature_id, 'feature_id')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.event_properties, 'event_properties')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.feature_id is not None:
            result['feature_id'] = self.feature_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.event_properties is not None:
            result['event_properties'] = self.event_properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('feature_id') is not None:
            self.feature_id = m.get('feature_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('event_properties') is not None:
            self.event_properties = m.get('event_properties')
        return self


class IotBasicDeviceRegisterResult(TeaModel):
    def __init__(
        self,
        device_did: str = None,
        private_key: str = None,
        device_name: str = None,
        device_sn: str = None,
        sec_key: str = None,
        service_status: str = None,
    ):
        # 设备did
        self.device_did = device_did
        # 设备密钥
        self.private_key = private_key
        # 设备名称
        self.device_name = device_name
        # 设备sn
        self.device_sn = device_sn
        # 设备认证密钥密文，需要下发安全认证SDK完成设备激活
        self.sec_key = sec_key
        # 设备认证密钥状态
        self.service_status = service_status

    def validate(self):
        self.validate_required(self.device_did, 'device_did')
        self.validate_required(self.private_key, 'private_key')
        self.validate_required(self.device_name, 'device_name')
        self.validate_required(self.device_sn, 'device_sn')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_did is not None:
            result['device_did'] = self.device_did
        if self.private_key is not None:
            result['private_key'] = self.private_key
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.sec_key is not None:
            result['sec_key'] = self.sec_key
        if self.service_status is not None:
            result['service_status'] = self.service_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_did') is not None:
            self.device_did = m.get('device_did')
        if m.get('private_key') is not None:
            self.private_key = m.get('private_key')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('sec_key') is not None:
            self.sec_key = m.get('sec_key')
        if m.get('service_status') is not None:
            self.service_status = m.get('service_status')
        return self


class IotbasicDeviceModelAttributeInfo(TeaModel):
    def __init__(
        self,
        model_value: str = None,
        specs_list: List[str] = None,
    ):
        # 型号
        self.model_value = model_value
        # 规格列表
        # 为空表示使用标准规格
        self.specs_list = specs_list

    def validate(self):
        self.validate_required(self.model_value, 'model_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model_value is not None:
            result['model_value'] = self.model_value
        if self.specs_list is not None:
            result['specs_list'] = self.specs_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_value') is not None:
            self.model_value = m.get('model_value')
        if m.get('specs_list') is not None:
            self.specs_list = m.get('specs_list')
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


class OnlinePressureTestTask(TeaModel):
    def __init__(
        self,
        gmt_create: str = None,
        gmt_modified: str = None,
        scene: str = None,
        component_id_list: str = None,
        customer_pt_report: str = None,
        pt_start_time: str = None,
        pt_end_time: str = None,
        pt_status: str = None,
        work_order_id: str = None,
        project_id: str = None,
        pt_task_id: str = None,
        failure_reason: str = None,
        extra_info: str = None,
    ):
        # DATE
        self.gmt_create = gmt_create
        # 修改时间
        # 
        self.gmt_modified = gmt_modified
        # 产线场景码
        # 
        self.scene = scene
        # 压测的目标设备可信信根设备的唯一标识，JSONArray字符串
        # 
        self.component_id_list = component_id_list
        # 客户侧的压测报告
        # 
        self.customer_pt_report = customer_pt_report
        # 压测开始时间
        # 
        self.pt_start_time = pt_start_time
        # 压测结束时间
        # 
        self.pt_end_time = pt_end_time
        # RUNNING: 正在执行 SUCCESS : 测试通过 FAILED : 测试不通过
        # 
        self.pt_status = pt_status
        # 关联SIT环境的工单ID
        # 
        self.work_order_id = work_order_id
        # 关联SIT环境的项目ID
        # 
        self.project_id = project_id
        # 产线压测任务ID
        self.pt_task_id = pt_task_id
        # 压测不通过的原因
        self.failure_reason = failure_reason
        # 拓展信息
        self.extra_info = extra_info

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.component_id_list, 'component_id_list')
        self.validate_required(self.pt_start_time, 'pt_start_time')
        if self.pt_start_time is not None:
            self.validate_pattern(self.pt_start_time, 'pt_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.pt_end_time, 'pt_end_time')
        if self.pt_end_time is not None:
            self.validate_pattern(self.pt_end_time, 'pt_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.pt_status, 'pt_status')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.pt_task_id, 'pt_task_id')
        self.validate_required(self.failure_reason, 'failure_reason')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.scene is not None:
            result['scene'] = self.scene
        if self.component_id_list is not None:
            result['component_id_list'] = self.component_id_list
        if self.customer_pt_report is not None:
            result['customer_pt_report'] = self.customer_pt_report
        if self.pt_start_time is not None:
            result['pt_start_time'] = self.pt_start_time
        if self.pt_end_time is not None:
            result['pt_end_time'] = self.pt_end_time
        if self.pt_status is not None:
            result['pt_status'] = self.pt_status
        if self.work_order_id is not None:
            result['work_order_id'] = self.work_order_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.pt_task_id is not None:
            result['pt_task_id'] = self.pt_task_id
        if self.failure_reason is not None:
            result['failure_reason'] = self.failure_reason
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('component_id_list') is not None:
            self.component_id_list = m.get('component_id_list')
        if m.get('customer_pt_report') is not None:
            self.customer_pt_report = m.get('customer_pt_report')
        if m.get('pt_start_time') is not None:
            self.pt_start_time = m.get('pt_start_time')
        if m.get('pt_end_time') is not None:
            self.pt_end_time = m.get('pt_end_time')
        if m.get('pt_status') is not None:
            self.pt_status = m.get('pt_status')
        if m.get('work_order_id') is not None:
            self.work_order_id = m.get('work_order_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('pt_task_id') is not None:
            self.pt_task_id = m.get('pt_task_id')
        if m.get('failure_reason') is not None:
            self.failure_reason = m.get('failure_reason')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        return self


class CustomerDeviceItem(TeaModel):
    def __init__(
        self,
        id: int = None,
        tenant_id: str = None,
        account_id: str = None,
        device_type: str = None,
        device_sn: str = None,
        device_did: str = None,
        valide_time: str = None,
        device_status: str = None,
        service_status: str = None,
        screen_status: str = None,
    ):
        # id
        self.id = id
        # 租户id
        self.tenant_id = tenant_id
        # 账号id
        self.account_id = account_id
        # 设备品类-型号-规格
        self.device_type = device_type
        # 设备sn
        self.device_sn = device_sn
        # 设备did
        self.device_did = device_did
        # 服务有效期
        self.valide_time = valide_time
        # 设备状态
        self.device_status = device_status
        # 服务状态
        self.service_status = service_status
        # 屏幕状态 开屏、锁屏
        self.screen_status = screen_status

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.device_type, 'device_type')
        self.validate_required(self.device_sn, 'device_sn')
        self.validate_required(self.device_did, 'device_did')
        self.validate_required(self.valide_time, 'valide_time')
        self.validate_required(self.device_status, 'device_status')
        self.validate_required(self.service_status, 'service_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.device_type is not None:
            result['device_type'] = self.device_type
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.device_did is not None:
            result['device_did'] = self.device_did
        if self.valide_time is not None:
            result['valide_time'] = self.valide_time
        if self.device_status is not None:
            result['device_status'] = self.device_status
        if self.service_status is not None:
            result['service_status'] = self.service_status
        if self.screen_status is not None:
            result['screen_status'] = self.screen_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('device_did') is not None:
            self.device_did = m.get('device_did')
        if m.get('valide_time') is not None:
            self.valide_time = m.get('valide_time')
        if m.get('device_status') is not None:
            self.device_status = m.get('device_status')
        if m.get('service_status') is not None:
            self.service_status = m.get('service_status')
        if m.get('screen_status') is not None:
            self.screen_status = m.get('screen_status')
        return self


class JtExtraData(TeaModel):
    def __init__(
        self,
        delta_mileage: int = None,
        max_speed: int = None,
        avg_speed: int = None,
    ):
        # 查询的时间范围内的行驶总里程
        self.delta_mileage = delta_mileage
        # 最大车速
        self.max_speed = max_speed
        # 平均车速
        self.avg_speed = avg_speed

    def validate(self):
        self.validate_required(self.delta_mileage, 'delta_mileage')
        self.validate_required(self.max_speed, 'max_speed')
        self.validate_required(self.avg_speed, 'avg_speed')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.delta_mileage is not None:
            result['delta_mileage'] = self.delta_mileage
        if self.max_speed is not None:
            result['max_speed'] = self.max_speed
        if self.avg_speed is not None:
            result['avg_speed'] = self.avg_speed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('delta_mileage') is not None:
            self.delta_mileage = m.get('delta_mileage')
        if m.get('max_speed') is not None:
            self.max_speed = m.get('max_speed')
        if m.get('avg_speed') is not None:
            self.avg_speed = m.get('avg_speed')
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


class XrUserTicketInfo(TeaModel):
    def __init__(
        self,
        xr_ticket_pool_name: str = None,
        count: int = None,
    ):
        # xr通行证资源池名称
        self.xr_ticket_pool_name = xr_ticket_pool_name
        # 购买数量
        self.count = count

    def validate(self):
        self.validate_required(self.xr_ticket_pool_name, 'xr_ticket_pool_name')
        self.validate_required(self.count, 'count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.xr_ticket_pool_name is not None:
            result['xr_ticket_pool_name'] = self.xr_ticket_pool_name
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('xr_ticket_pool_name') is not None:
            self.xr_ticket_pool_name = m.get('xr_ticket_pool_name')
        if m.get('count') is not None:
            self.count = m.get('count')
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
        trustiot_device_id: int = None,
        biz_id: str = None,
        biz_type: str = None,
        content: str = None,
    ):
        # 设备链上ID（与scene参数、可信设备ID至少有一个参数不为空）
        self.chain_device_id = chain_device_id
        # 可信设备ID（与scene参数、设备链上ID至少有一个参数不为空）
        self.trustiot_device_id = trustiot_device_id
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
        if self.trustiot_device_id is not None:
            result['trustiot_device_id'] = self.trustiot_device_id
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
        if m.get('trustiot_device_id') is not None:
            self.trustiot_device_id = m.get('trustiot_device_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class TripTrace(TeaModel):
    def __init__(
        self,
        device_location: str = None,
    ):
        # 定位数据
        self.device_location = device_location

    def validate(self):
        self.validate_required(self.device_location, 'device_location')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_location is not None:
            result['device_location'] = self.device_location
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_location') is not None:
            self.device_location = m.get('device_location')
        return self


class QueryDeviceTransactionResultData(TeaModel):
    def __init__(
        self,
        corp_name: str = None,
        scene: str = None,
        device_imei: str = None,
        device_sn: str = None,
        price: str = None,
        device_did: str = None,
        device_tuid: str = None,
        device_specs: str = None,
        tenant_id: str = None,
        account_name: str = None,
    ):
        # 设备所属厂商
        self.corp_name = corp_name
        # 场景码,所属项目
        self.scene = scene
        # IMEI
        self.device_imei = device_imei
        # 设备sn
        self.device_sn = device_sn
        # 设备金额
        self.price = price
        # 设备分布式身份did
        self.device_did = device_did
        # 设备终端唯一ID
        self.device_tuid = device_tuid
        # 设备参数:品类+型号+规格
        self.device_specs = device_specs
        # 所属租户
        self.tenant_id = tenant_id
        # 所属账号
        self.account_name = account_name

    def validate(self):
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.device_sn, 'device_sn')
        self.validate_required(self.device_did, 'device_did')
        self.validate_required(self.device_specs, 'device_specs')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.account_name, 'account_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.scene is not None:
            result['scene'] = self.scene
        if self.device_imei is not None:
            result['device_imei'] = self.device_imei
        if self.device_sn is not None:
            result['device_sn'] = self.device_sn
        if self.price is not None:
            result['price'] = self.price
        if self.device_did is not None:
            result['device_did'] = self.device_did
        if self.device_tuid is not None:
            result['device_tuid'] = self.device_tuid
        if self.device_specs is not None:
            result['device_specs'] = self.device_specs
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.account_name is not None:
            result['account_name'] = self.account_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('device_imei') is not None:
            self.device_imei = m.get('device_imei')
        if m.get('device_sn') is not None:
            self.device_sn = m.get('device_sn')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('device_did') is not None:
            self.device_did = m.get('device_did')
        if m.get('device_tuid') is not None:
            self.device_tuid = m.get('device_tuid')
        if m.get('device_specs') is not None:
            self.device_specs = m.get('device_specs')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
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


class GoodsDigitalFingerprintUserInfo(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        user_role: str = None,
        channel: str = None,
        relation_user_id_list: List[str] = None,
    ):
        # 平台注册用户id
        self.user_id = user_id
        # 用户角色
        self.user_role = user_role
        # 用户登录id来源
        self.channel = channel
        # 作为平台使用方，提供对应的渠道用户id列表
        self.relation_user_id_list = relation_user_id_list

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_role, 'user_role')
        self.validate_required(self.channel, 'channel')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_role is not None:
            result['user_role'] = self.user_role
        if self.channel is not None:
            result['channel'] = self.channel
        if self.relation_user_id_list is not None:
            result['relation_user_id_list'] = self.relation_user_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_role') is not None:
            self.user_role = m.get('user_role')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('relation_user_id_list') is not None:
            self.relation_user_id_list = m.get('relation_user_id_list')
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


class IotbasicDigitalKeyDeviceNoShipInfo(TeaModel):
    def __init__(
        self,
        devid: str = None,
        sn: str = None,
        ccid: str = None,
        imei: str = None,
        ver: str = None,
        peps_ver: str = None,
        ble_ver: str = None,
    ):
        # 设备id
        self.devid = devid
        # 设备sn
        self.sn = sn
        # ccid
        self.ccid = ccid
        # imei
        self.imei = imei
        # tbox固件版本号(16进制)
        self.ver = ver
        # PEPS系统固件版本号(16进制)
        self.peps_ver = peps_ver
        # 蓝牙固件版本号(16进制)
        self.ble_ver = ble_ver

    def validate(self):
        self.validate_required(self.devid, 'devid')
        self.validate_required(self.sn, 'sn')
        self.validate_required(self.ccid, 'ccid')
        self.validate_required(self.imei, 'imei')
        self.validate_required(self.ver, 'ver')
        self.validate_required(self.peps_ver, 'peps_ver')
        self.validate_required(self.ble_ver, 'ble_ver')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.devid is not None:
            result['devid'] = self.devid
        if self.sn is not None:
            result['sn'] = self.sn
        if self.ccid is not None:
            result['ccid'] = self.ccid
        if self.imei is not None:
            result['imei'] = self.imei
        if self.ver is not None:
            result['ver'] = self.ver
        if self.peps_ver is not None:
            result['peps_ver'] = self.peps_ver
        if self.ble_ver is not None:
            result['ble_ver'] = self.ble_ver
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('devid') is not None:
            self.devid = m.get('devid')
        if m.get('sn') is not None:
            self.sn = m.get('sn')
        if m.get('ccid') is not None:
            self.ccid = m.get('ccid')
        if m.get('imei') is not None:
            self.imei = m.get('imei')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('peps_ver') is not None:
            self.peps_ver = m.get('peps_ver')
        if m.get('ble_ver') is not None:
            self.ble_ver = m.get('ble_ver')
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
        # 设备数据签名
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


class GoodsDigitalFingerprintInfo(TeaModel):
    def __init__(
        self,
        category: str = None,
        brand: str = None,
        style: str = None,
        goods_points: List[GoodsDigitalFingerprintPoint] = None,
        goods_id: str = None,
    ):
        # 品类
        self.category = category
        # 品牌
        self.brand = brand
        # 款式
        self.style = style
        # 商品数字指纹鉴定点列表
        self.goods_points = goods_points
        # 商品id
        self.goods_id = goods_id

    def validate(self):
        self.validate_required(self.category, 'category')
        self.validate_required(self.brand, 'brand')
        self.validate_required(self.style, 'style')
        self.validate_required(self.goods_points, 'goods_points')
        if self.goods_points:
            for k in self.goods_points:
                if k:
                    k.validate()
        self.validate_required(self.goods_id, 'goods_id')
        if self.goods_id is not None:
            self.validate_max_length(self.goods_id, 'goods_id', 128)

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
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
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
                temp_model = GoodsDigitalFingerprintPoint()
                self.goods_points.append(temp_model.from_map(k))
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
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


class DeviceorderRequest(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        order_status: str = None,
        merchant_id: str = None,
        order_device_list: List[IotBasicDeviceOrderItem] = None,
        total_amount: str = None,
    ):
        # 订单id
        self.order_id = order_id
        # 支付状态
        self.order_status = order_status
        # 商家唯一id
        self.merchant_id = merchant_id
        # 设备订单元素集合
        self.order_device_list = order_device_list
        # 订单总金额，精确到小数点后两位
        self.total_amount = total_amount

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.order_status, 'order_status')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_device_list, 'order_device_list')
        if self.order_device_list:
            for k in self.order_device_list:
                if k:
                    k.validate()
        self.validate_required(self.total_amount, 'total_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        result['order_device_list'] = []
        if self.order_device_list is not None:
            for k in self.order_device_list:
                result['order_device_list'].append(k.to_map() if k else None)
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        self.order_device_list = []
        if m.get('order_device_list') is not None:
            for k in m.get('order_device_list'):
                temp_model = IotBasicDeviceOrderItem()
                self.order_device_list.append(temp_model.from_map(k))
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        return self


class CollectInfo(TeaModel):
    def __init__(
        self,
        asset_id: str = None,
        data_scene: str = None,
        asset_data: str = None,
        collect_id: str = None,
    ):
        # 资产ID
        self.asset_id = asset_id
        # 数据资产类型
        self.data_scene = data_scene
        # 资产数据内容，业务要上链的数据JSON格式
        self.asset_data = asset_data
        # 上链数据采集id
        self.collect_id = collect_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.data_scene, 'data_scene')
        self.validate_required(self.asset_data, 'asset_data')
        self.validate_required(self.collect_id, 'collect_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.data_scene is not None:
            result['data_scene'] = self.data_scene
        if self.asset_data is not None:
            result['asset_data'] = self.asset_data
        if self.collect_id is not None:
            result['collect_id'] = self.collect_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('data_scene') is not None:
            self.data_scene = m.get('data_scene')
        if m.get('asset_data') is not None:
            self.asset_data = m.get('asset_data')
        if m.get('collect_id') is not None:
            self.collect_id = m.get('collect_id')
        return self


class IdListView(TeaModel):
    def __init__(
        self,
        data_id: int = None,
        data_name: str = None,
    ):
        # 数据id
        self.data_id = data_id
        # 数据名称
        self.data_name = data_name

    def validate(self):
        self.validate_required(self.data_id, 'data_id')
        self.validate_required(self.data_name, 'data_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.data_name is not None:
            result['data_name'] = self.data_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('data_name') is not None:
            self.data_name = m.get('data_name')
        return self


class QueryBlockchainBotIoaAgentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        agent_id: str = None,
        client_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 智能体ID
        self.agent_id = agent_id
        # 客户端ID，一般是设备MAC地址，若没有agentId时可传入client_id查询对应的agent_id
        self.client_id = client_id

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
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.client_id is not None:
            result['client_id'] = self.client_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        return self


class QueryBlockchainBotIoaAgentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        agent_info: AgentInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 智能体信息视图对象
        self.agent_info = agent_info

    def validate(self):
        if self.agent_info:
            self.agent_info.validate()

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
        if self.agent_info is not None:
            result['agent_info'] = self.agent_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('agent_info') is not None:
            temp_model = AgentInfoVO()
            self.agent_info = temp_model.from_map(m['agent_info'])
        return self


class SaveBlockchainBotIoaAgentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        agent_id: str = None,
        agent_name: str = None,
        lang_code: str = None,
        tts_voice_id: str = None,
        system_prompt: str = None,
        parent_template_agent_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 智能体ID
        self.agent_id = agent_id
        # 智能体名称
        self.agent_name = agent_name
        # 语言Code
        self.lang_code = lang_code
        # 音色ID
        self.tts_voice_id = tts_voice_id
        # 系统提示词
        self.system_prompt = system_prompt
        # 父模板智能体ID
        self.parent_template_agent_id = parent_template_agent_id

    def validate(self):
        self.validate_required(self.agent_id, 'agent_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.lang_code is not None:
            result['lang_code'] = self.lang_code
        if self.tts_voice_id is not None:
            result['tts_voice_id'] = self.tts_voice_id
        if self.system_prompt is not None:
            result['system_prompt'] = self.system_prompt
        if self.parent_template_agent_id is not None:
            result['parent_template_agent_id'] = self.parent_template_agent_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('lang_code') is not None:
            self.lang_code = m.get('lang_code')
        if m.get('tts_voice_id') is not None:
            self.tts_voice_id = m.get('tts_voice_id')
        if m.get('system_prompt') is not None:
            self.system_prompt = m.get('system_prompt')
        if m.get('parent_template_agent_id') is not None:
            self.parent_template_agent_id = m.get('parent_template_agent_id')
        return self


class SaveBlockchainBotIoaAgentResponse(TeaModel):
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


class QueryBlockchainBotIoaTemplatesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        agent_id: str = None,
        client_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 智能体ID
        self.agent_id = agent_id
        # 客户端ID（如MAC地址）
        self.client_id = client_id

    def validate(self):
        self.validate_required(self.agent_id, 'agent_id')
        self.validate_required(self.client_id, 'client_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.client_id is not None:
            result['client_id'] = self.client_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        return self


class QueryBlockchainBotIoaTemplatesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_agent_list: List[AgentInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 智能体模板 VO集合
        self.template_agent_list = template_agent_list

    def validate(self):
        if self.template_agent_list:
            for k in self.template_agent_list:
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
        result['template_agent_list'] = []
        if self.template_agent_list is not None:
            for k in self.template_agent_list:
                result['template_agent_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.template_agent_list = []
        if m.get('template_agent_list') is not None:
            for k in m.get('template_agent_list'):
                temp_model = AgentInfoVO()
                self.template_agent_list.append(temp_model.from_map(k))
        return self


class QueryBlockchainBotAgentchatHistoryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        session_id: str = None,
        page_index: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 会话ID
        self.session_id = session_id
        # 页码
        self.page_index = page_index
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
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
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryBlockchainBotAgentchatHistoryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page_num: int = None,
        page_size: int = None,
        pages: int = None,
        list: List[AiAgentChatHistoryBO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页结果总数
        self.total = total
        # 当前页码 （从第一页开始）
        self.page_num = page_num
        # 每页大小
        self.page_size = page_size
        # 总页数
        self.pages = pages
        # 对话内容集合
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.pages is not None:
            result['pages'] = self.pages
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
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
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('pages') is not None:
            self.pages = m.get('pages')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = AiAgentChatHistoryBO()
                self.list.append(temp_model.from_map(k))
        return self


class QueryBlockchainBotAgentSessionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        client_id: str = None,
        user_id: str = None,
        page_index: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户端ID
        self.client_id = client_id
        # 用户ID
        self.user_id = user_id
        # 页码
        self.page_index = page_index
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.client_id, 'client_id')
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
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryBlockchainBotAgentSessionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page_num: int = None,
        page_size: int = None,
        pages: int = None,
        list: List[AgentSessionVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页结果总数
        self.total = total
        # 当前页码 （从第一页开始）
        self.page_num = page_num
        # 每页大小
        self.page_size = page_size
        # 总页数
        self.pages = pages
        # 会话集合
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.pages is not None:
            result['pages'] = self.pages
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
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
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('pages') is not None:
            self.pages = m.get('pages')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = AgentSessionVO()
                self.list.append(temp_model.from_map(k))
        return self


