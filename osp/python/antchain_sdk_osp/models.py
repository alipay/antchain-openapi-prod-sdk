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


class MeterDataItemModel(TeaModel):
    def __init__(
        self,
        item_code: str = None,
        item_value: int = None,
    ):
        # 计量项名称
        self.item_code = item_code
        # 计量项值
        self.item_value = item_value

    def validate(self):
        self.validate_required(self.item_code, 'item_code')
        self.validate_required(self.item_value, 'item_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.item_code is not None:
            result['item_code'] = self.item_code
        if self.item_value is not None:
            result['item_value'] = self.item_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('item_code') is not None:
            self.item_code = m.get('item_code')
        if m.get('item_value') is not None:
            self.item_value = m.get('item_value')
        return self


class ClusterMeta(TeaModel):
    def __init__(
        self,
        cluster_id: str = None,
        cluster_name: str = None,
        region: str = None,
    ):
        # 集群唯一标识
        self.cluster_id = cluster_id
        # 集群名字
        self.cluster_name = cluster_name
        # 区域
        self.region = region

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        if self.region is not None:
            result['region'] = self.region
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        if m.get('region') is not None:
            self.region = m.get('region')
        return self


class KeyValuePair(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class MiddlewareCluster(TeaModel):
    def __init__(
        self,
        cluster_id: str = None,
        cluster_name: str = None,
        enable_regions: List[str] = None,
        enable_data_centers: List[str] = None,
        enable_zones: List[str] = None,
        acvip_endpoint: str = None,
    ):
        # 集群id
        self.cluster_id = cluster_id
        # 集群名字
        self.cluster_name = cluster_name
        # 支持的region 列表
        self.enable_regions = enable_regions
        # 支持的dataCenter 列表
        self.enable_data_centers = enable_data_centers
        # 支持的zone 列表
        self.enable_zones = enable_zones
        # acvip 地址
        self.acvip_endpoint = acvip_endpoint

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.enable_regions, 'enable_regions')
        self.validate_required(self.acvip_endpoint, 'acvip_endpoint')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        if self.enable_regions is not None:
            result['enable_regions'] = self.enable_regions
        if self.enable_data_centers is not None:
            result['enable_data_centers'] = self.enable_data_centers
        if self.enable_zones is not None:
            result['enable_zones'] = self.enable_zones
        if self.acvip_endpoint is not None:
            result['acvip_endpoint'] = self.acvip_endpoint
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        if m.get('enable_regions') is not None:
            self.enable_regions = m.get('enable_regions')
        if m.get('enable_data_centers') is not None:
            self.enable_data_centers = m.get('enable_data_centers')
        if m.get('enable_zones') is not None:
            self.enable_zones = m.get('enable_zones')
        if m.get('acvip_endpoint') is not None:
            self.acvip_endpoint = m.get('acvip_endpoint')
        return self


class AksEndpoint(TeaModel):
    def __init__(
        self,
        access_key: str = None,
        access_secret: str = None,
        endpoint: str = None,
        instance_id: str = None,
        tenant: str = None,
        workspace: str = None,
        mesh: List[KeyValuePair] = None,
    ):
        # access_key
        self.access_key = access_key
        # access_secret
        self.access_secret = access_secret
        # acvip的地址
        self.endpoint = endpoint
        # 产品id
        self.instance_id = instance_id
        # 租户名
        self.tenant = tenant
        # 工作区
        self.workspace = workspace
        # 表示mesh的配置信息, 用key/value的形式给出.
        self.mesh = mesh

    def validate(self):
        self.validate_required(self.access_key, 'access_key')
        self.validate_required(self.access_secret, 'access_secret')
        self.validate_required(self.endpoint, 'endpoint')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.tenant, 'tenant')
        self.validate_required(self.workspace, 'workspace')
        self.validate_required(self.mesh, 'mesh')
        if self.mesh:
            for k in self.mesh:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        if self.endpoint is not None:
            result['endpoint'] = self.endpoint
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.workspace is not None:
            result['workspace'] = self.workspace
        result['mesh'] = []
        if self.mesh is not None:
            for k in self.mesh:
                result['mesh'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('endpoint') is not None:
            self.endpoint = m.get('endpoint')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('workspace') is not None:
            self.workspace = m.get('workspace')
        self.mesh = []
        if m.get('mesh') is not None:
            for k in m.get('mesh'):
                temp_model = KeyValuePair()
                self.mesh.append(temp_model.from_map(k))
        return self


class AccessKey(TeaModel):
    def __init__(
        self,
        accesskey: str = None,
        creator: str = None,
        gmtcreate: str = None,
        id: int = None,
        instanceid: str = None,
        isencrypted: bool = None,
        name: str = None,
        secretkey: str = None,
    ):
        # AK
        self.accesskey = accesskey
        # 实体创建者
        self.creator = creator
        # 创建时间
        self.gmtcreate = gmtcreate
        # 实体Id
        self.id = id
        # 实例Id
        self.instanceid = instanceid
        # 是否加密
        self.isencrypted = isencrypted
        # 实体名称
        self.name = name
        # SK
        self.secretkey = secretkey

    def validate(self):
        self.validate_required(self.accesskey, 'accesskey')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.gmtcreate, 'gmtcreate')
        if self.gmtcreate is not None:
            self.validate_pattern(self.gmtcreate, 'gmtcreate', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.id, 'id')
        self.validate_required(self.instanceid, 'instanceid')
        self.validate_required(self.isencrypted, 'isencrypted')
        self.validate_required(self.name, 'name')
        self.validate_required(self.secretkey, 'secretkey')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.accesskey is not None:
            result['accesskey'] = self.accesskey
        if self.creator is not None:
            result['creator'] = self.creator
        if self.gmtcreate is not None:
            result['gmtcreate'] = self.gmtcreate
        if self.id is not None:
            result['id'] = self.id
        if self.instanceid is not None:
            result['instanceid'] = self.instanceid
        if self.isencrypted is not None:
            result['isencrypted'] = self.isencrypted
        if self.name is not None:
            result['name'] = self.name
        if self.secretkey is not None:
            result['secretkey'] = self.secretkey
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('accesskey') is not None:
            self.accesskey = m.get('accesskey')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('gmtcreate') is not None:
            self.gmtcreate = m.get('gmtcreate')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instanceid') is not None:
            self.instanceid = m.get('instanceid')
        if m.get('isencrypted') is not None:
            self.isencrypted = m.get('isencrypted')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('secretkey') is not None:
            self.secretkey = m.get('secretkey')
        return self


class Product(TeaModel):
    def __init__(
        self,
        id: int = None,
        product_name: str = None,
        product_code: str = None,
        opening_status: str = None,
        running_status: str = None,
    ):
        # 产品id
        self.id = id
        # 产品名称
        self.product_name = product_name
        # 产品代码
        self.product_code = product_code
        # 开通状态, T为已开通, F为未开通
        self.opening_status = opening_status
        # 运行状态的枚举值:
        # running 正在运行
        # stopped 已经停止
        # starting 正在启动
        # start_fail 启动失败
        # stopping 正在停止
        # stop_fail 停止失败
        # arrearage 因为欠费, 已经停止
        # stopping_arr 因为欠费, 正在停止
        # 
        self.running_status = running_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.opening_status is not None:
            result['opening_status'] = self.opening_status
        if self.running_status is not None:
            result['running_status'] = self.running_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('opening_status') is not None:
            self.opening_status = m.get('opening_status')
        if m.get('running_status') is not None:
            self.running_status = m.get('running_status')
        return self


class MeterDataModel(TeaModel):
    def __init__(
        self,
        meter_date: str = None,
        meter_data_item_list: List[MeterDataItemModel] = None,
    ):
        # 时间
        self.meter_date = meter_date
        # 计量数据项
        self.meter_data_item_list = meter_data_item_list

    def validate(self):
        self.validate_required(self.meter_date, 'meter_date')
        self.validate_required(self.meter_data_item_list, 'meter_data_item_list')
        if self.meter_data_item_list:
            for k in self.meter_data_item_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.meter_date is not None:
            result['meter_date'] = self.meter_date
        result['meter_data_item_list'] = []
        if self.meter_data_item_list is not None:
            for k in self.meter_data_item_list:
                result['meter_data_item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('meter_date') is not None:
            self.meter_date = m.get('meter_date')
        self.meter_data_item_list = []
        if m.get('meter_data_item_list') is not None:
            for k in m.get('meter_data_item_list'):
                temp_model = MeterDataItemModel()
                self.meter_data_item_list.append(temp_model.from_map(k))
        return self


class BindInstance(TeaModel):
    def __init__(
        self,
        cluster_id: str = None,
        cluster_name: str = None,
        regions: List[str] = None,
        data_centers: str = None,
        zones: str = None,
        instance_id: str = None,
        acvip_endpoint: str = None,
        workspace_group: str = None,
        tenant_id: str = None,
    ):
        # 集群id
        self.cluster_id = cluster_id
        # 集群名字
        self.cluster_name = cluster_name
        # 支持的region
        self.regions = regions
        # 支持的dataCenter
        self.data_centers = data_centers
        # 支持的zone 列表
        self.zones = zones
        # 绑定后的instanceId 信息
        self.instance_id = instance_id
        # acvip 地址
        self.acvip_endpoint = acvip_endpoint
        # 工作空间组
        self.workspace_group = workspace_group
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.regions, 'regions')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.acvip_endpoint, 'acvip_endpoint')
        self.validate_required(self.workspace_group, 'workspace_group')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        if self.regions is not None:
            result['regions'] = self.regions
        if self.data_centers is not None:
            result['data_centers'] = self.data_centers
        if self.zones is not None:
            result['zones'] = self.zones
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.acvip_endpoint is not None:
            result['acvip_endpoint'] = self.acvip_endpoint
        if self.workspace_group is not None:
            result['workspace_group'] = self.workspace_group
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        if m.get('regions') is not None:
            self.regions = m.get('regions')
        if m.get('data_centers') is not None:
            self.data_centers = m.get('data_centers')
        if m.get('zones') is not None:
            self.zones = m.get('zones')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('acvip_endpoint') is not None:
            self.acvip_endpoint = m.get('acvip_endpoint')
        if m.get('workspace_group') is not None:
            self.workspace_group = m.get('workspace_group')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class ClusterMode(TeaModel):
    def __init__(
        self,
        cluster_mode: str = None,
        regions: List[ClusterMeta] = None,
    ):
        # 集群模式
        self.cluster_mode = cluster_mode
        # 区域
        self.regions = regions

    def validate(self):
        self.validate_required(self.cluster_mode, 'cluster_mode')
        self.validate_required(self.regions, 'regions')
        if self.regions:
            for k in self.regions:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cluster_mode is not None:
            result['cluster_mode'] = self.cluster_mode
        result['regions'] = []
        if self.regions is not None:
            for k in self.regions:
                result['regions'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cluster_mode') is not None:
            self.cluster_mode = m.get('cluster_mode')
        self.regions = []
        if m.get('regions') is not None:
            for k in m.get('regions'):
                temp_model = ClusterMeta()
                self.regions.append(temp_model.from_map(k))
        return self


class Instance(TeaModel):
    def __init__(
        self,
        instance_id: str = None,
        tenant: str = None,
        workspace: str = None,
    ):
        # 实例id
        self.instance_id = instance_id
        # 租户
        self.tenant = tenant
        # 工作空间
        self.workspace = workspace

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.workspace is not None:
            result['workspace'] = self.workspace
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('workspace') is not None:
            self.workspace = m.get('workspace')
        return self


class QueryInstancesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant: str = None,
        workspace: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户
        self.tenant = tenant
        # 工作空间, 选填, 如果指定了工作空间, 就只返回这个工作空间关联的信息
        self.workspace = workspace
        # 当前页码，默认为1
        self.page_num = page_num
        # 分页大小，默认10
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.workspace is not None:
            result['workspace'] = self.workspace
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('workspace') is not None:
            self.workspace = m.get('workspace')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryInstancesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        instances: List[Instance] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户列表
        self.instances = instances
        # 当前页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size
        # 记录总数
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.instances, 'instances')
        if self.instances:
            for k in self.instances:
                if k:
                    k.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_count, 'total_count')

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
        result['instances'] = []
        if self.instances is not None:
            for k in self.instances:
                result['instances'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.instances = []
        if m.get('instances') is not None:
            for k in m.get('instances'):
                temp_model = Instance()
                self.instances.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class QueryProductsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_name: str = None,
        instance_id: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品名称, 选填, 如果指定了产品名称就只返回指定产品的信息
        self.product_name = product_name
        # 实例id
        self.instance_id = instance_id
        # 当前页码，默认为1
        self.page_num = page_num
        # 分页大小，默认10
        self.page_size = page_size

    def validate(self):
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
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryProductsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        products: List[Product] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 产品列表
        self.products = products
        # 当前页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size
        # 记录总数
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.products, 'products')
        if self.products:
            for k in self.products:
                if k:
                    k.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_count, 'total_count')

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
        result['products'] = []
        if self.products is not None:
            for k in self.products:
                result['products'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.products = []
        if m.get('products') is not None:
            for k in m.get('products'):
                temp_model = Product()
                self.products.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class QueryEndpointsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        network: str = None,
        page_num: int = None,
        page_size: int = None,
        tenant: str = None,
        workspace: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 网络类型, classic, vpc
        self.network = network
        # 当前页数
        self.page_num = page_num
        # 分页大小, 考虑到数据量并不多, 建议设置分页足够大(就10几个), 比如100, 一次性拿走所有数据
        self.page_size = page_size
        # 租户名
        self.tenant = tenant
        # 工作区名称, 如果不填, 则返回全部workspace的信息
        self.workspace = workspace

    def validate(self):
        self.validate_required(self.network, 'network')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.network is not None:
            result['network'] = self.network
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.workspace is not None:
            result['workspace'] = self.workspace
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('network') is not None:
            self.network = m.get('network')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('workspace') is not None:
            self.workspace = m.get('workspace')
        return self


class QueryEndpointsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        endpoints: List[AksEndpoint] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # endpoint信息
        self.endpoints = endpoints
        # 当前页数
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size
        # 总记录数
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.endpoints, 'endpoints')
        if self.endpoints:
            for k in self.endpoints:
                if k:
                    k.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_count, 'total_count')

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
        result['endpoints'] = []
        if self.endpoints is not None:
            for k in self.endpoints:
                result['endpoints'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.endpoints = []
        if m.get('endpoints') is not None:
            for k in m.get('endpoints'):
                temp_model = AksEndpoint()
                self.endpoints.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class ScaleoutClustersRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_center: str = None,
        domain: str = None,
        instance_id: str = None,
        network_type: str = None,
        product: str = None,
        service_ip: str = None,
        service_port: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据中心
        self.data_center = data_center
        # 生效 Domain
        self.domain = domain
        # 生效 instanceId，如果是需要全局生效使用 ALL_INSTANCE_ID
        self.instance_id = instance_id
        # 网络类型，无特殊需求填写 CLASSIC
        self.network_type = network_type
        # 产品名称
        self.product = product
        # 扩容 IP
        self.service_ip = service_ip
        # 生效端口
        self.service_port = service_port

    def validate(self):
        self.validate_required(self.data_center, 'data_center')
        self.validate_required(self.domain, 'domain')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.network_type, 'network_type')
        self.validate_required(self.product, 'product')
        self.validate_required(self.service_ip, 'service_ip')
        self.validate_required(self.service_port, 'service_port')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_center is not None:
            result['data_center'] = self.data_center
        if self.domain is not None:
            result['domain'] = self.domain
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.network_type is not None:
            result['network_type'] = self.network_type
        if self.product is not None:
            result['product'] = self.product
        if self.service_ip is not None:
            result['service_ip'] = self.service_ip
        if self.service_port is not None:
            result['service_port'] = self.service_port
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_center') is not None:
            self.data_center = m.get('data_center')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('network_type') is not None:
            self.network_type = m.get('network_type')
        if m.get('product') is not None:
            self.product = m.get('product')
        if m.get('service_ip') is not None:
            self.service_ip = m.get('service_ip')
        if m.get('service_port') is not None:
            self.service_port = m.get('service_port')
        return self


class ScaleoutClustersResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作结果
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


class ScaleinClusterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_center: str = None,
        domain: str = None,
        instance_id: str = None,
        network_type: str = None,
        product: str = None,
        service_ip: str = None,
        service_port: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据中心
        self.data_center = data_center
        # 生效 domain
        self.domain = domain
        # 生效实例 ID，全部生效则为 ALL_INSTANCE_ID
        self.instance_id = instance_id
        # 网络类型，无特殊情况填写 CLASSIC
        self.network_type = network_type
        # 产品名称
        self.product = product
        # 缩容 IP
        self.service_ip = service_ip
        # 生效端口
        self.service_port = service_port

    def validate(self):
        self.validate_required(self.data_center, 'data_center')
        self.validate_required(self.domain, 'domain')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.network_type, 'network_type')
        self.validate_required(self.product, 'product')
        self.validate_required(self.service_ip, 'service_ip')
        self.validate_required(self.service_port, 'service_port')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_center is not None:
            result['data_center'] = self.data_center
        if self.domain is not None:
            result['domain'] = self.domain
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.network_type is not None:
            result['network_type'] = self.network_type
        if self.product is not None:
            result['product'] = self.product
        if self.service_ip is not None:
            result['service_ip'] = self.service_ip
        if self.service_port is not None:
            result['service_port'] = self.service_port
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_center') is not None:
            self.data_center = m.get('data_center')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('network_type') is not None:
            self.network_type = m.get('network_type')
        if m.get('product') is not None:
            self.product = m.get('product')
        if m.get('service_ip') is not None:
            self.service_ip = m.get('service_ip')
        if m.get('service_port') is not None:
            self.service_port = m.get('service_port')
        return self


class ScaleinClusterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作是否成功
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


class SetClustersRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        domain: str = None,
        enable: bool = None,
        instance_id: str = None,
        service_ip: str = None,
        network_type: str = None,
        product: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 生效域名
        self.domain = domain
        # 开启/关闭
        self.enable = enable
        # 生效实例 ID，如果全部则为 ALL_INSTANCE_ID
        self.instance_id = instance_id
        # 作用 IP
        self.service_ip = service_ip
        # 网络类型，如果无特殊需求 CLASSIC
        self.network_type = network_type
        # 产品名称
        self.product = product

    def validate(self):
        self.validate_required(self.domain, 'domain')
        self.validate_required(self.enable, 'enable')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.service_ip, 'service_ip')
        self.validate_required(self.network_type, 'network_type')
        self.validate_required(self.product, 'product')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.domain is not None:
            result['domain'] = self.domain
        if self.enable is not None:
            result['enable'] = self.enable
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.service_ip is not None:
            result['service_ip'] = self.service_ip
        if self.network_type is not None:
            result['network_type'] = self.network_type
        if self.product is not None:
            result['product'] = self.product
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('enable') is not None:
            self.enable = m.get('enable')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('service_ip') is not None:
            self.service_ip = m.get('service_ip')
        if m.get('network_type') is not None:
            self.network_type = m.get('network_type')
        if m.get('product') is not None:
            self.product = m.get('product')
        return self


class SetClustersResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作是否成功
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


class GetInstancesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        middleware_tenant: str = None,
        middleware_workspace: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 共享中间件实例id
        self.instance_id = instance_id
        # 租户name
        self.middleware_tenant = middleware_tenant
        # workspace name
        self.middleware_workspace = middleware_workspace

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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.middleware_tenant is not None:
            result['middleware_tenant'] = self.middleware_tenant
        if self.middleware_workspace is not None:
            result['middleware_workspace'] = self.middleware_workspace
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('middleware_tenant') is not None:
            self.middleware_tenant = m.get('middleware_tenant')
        if m.get('middleware_workspace') is not None:
            self.middleware_workspace = m.get('middleware_workspace')
        return self


class GetInstancesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        instance_id: str = None,
        middleware_tenant: str = None,
        middleware_workspace: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # instance id
        self.instance_id = instance_id
        # 之所以不叫tenant是为了防止和openapi内置的tenant字段冲突.
        self.middleware_tenant = middleware_tenant
        # 之所以不叫workspace是为了防止和openapi内置的workspace字段冲突.
        self.middleware_workspace = middleware_workspace

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
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.middleware_tenant is not None:
            result['middleware_tenant'] = self.middleware_tenant
        if self.middleware_workspace is not None:
            result['middleware_workspace'] = self.middleware_workspace
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('middleware_tenant') is not None:
            self.middleware_tenant = m.get('middleware_tenant')
        if m.get('middleware_workspace') is not None:
            self.middleware_workspace = m.get('middleware_workspace')
        return self


class CreateAccesskeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 该参数是一个instanceId
        self.instance_id = instance_id
        # 该字段为AK/SK的创建名
        self.name = name

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CreateAccesskeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accesskey: AccessKey = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # AccessKey对象
        self.accesskey = accesskey

    def validate(self):
        if self.accesskey:
            self.accesskey.validate()

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
        if self.accesskey is not None:
            result['accesskey'] = self.accesskey.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('accesskey') is not None:
            temp_model = AccessKey()
            self.accesskey = temp_model.from_map(m['accesskey'])
        return self


class GetAccesskeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        instance_id: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 该参数是一个instanceId
        self.instance_id = instance_id
        # 
        # 该字段为AK/SK的创建名
        self.name = name

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class GetAccesskeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accesskey: AccessKey = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # AccessKey对象
        self.accesskey = accesskey

    def validate(self):
        if self.accesskey:
            self.accesskey.validate()

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
        if self.accesskey is not None:
            result['accesskey'] = self.accesskey.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('accesskey') is not None:
            temp_model = AccessKey()
            self.accesskey = temp_model.from_map(m['accesskey'])
        return self


class GetMiddlewareMetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 工作空间
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.workspace_id, 'workspace_id')

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
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetMiddlewareMetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        instance_id: str = None,
        acvip_endpoint: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户id
        self.tenant_id = tenant_id
        # 工作空间
        self.workspace_id = workspace_id
        # instanceId
        self.instance_id = instance_id
        # acvip 连接地址
        self.acvip_endpoint = acvip_endpoint

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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.acvip_endpoint is not None:
            result['acvip_endpoint'] = self.acvip_endpoint
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('acvip_endpoint') is not None:
            self.acvip_endpoint = m.get('acvip_endpoint')
        return self


class GetWorkspacegroupInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_group: str = None,
        cluster_id: str = None,
        need_real: bool = None,
        workspace: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 工作空间组
        self.workspace_group = workspace_group
        # 集群id
        self.cluster_id = cluster_id
        # 是否需要原始的instanceId
        self.need_real = need_real
        # workspace
        self.workspace = workspace

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.workspace_group, 'workspace_group')

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
        if self.workspace_group is not None:
            result['workspace_group'] = self.workspace_group
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.need_real is not None:
            result['need_real'] = self.need_real
        if self.workspace is not None:
            result['workspace'] = self.workspace
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_group') is not None:
            self.workspace_group = m.get('workspace_group')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('need_real') is not None:
            self.need_real = m.get('need_real')
        if m.get('workspace') is not None:
            self.workspace = m.get('workspace')
        return self


class GetWorkspacegroupInstanceResponse(TeaModel):
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
        # instanceId
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


class QueryMiddlewareClustermodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_group: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # XXX
        self.tenant_id = tenant_id
        # workspace_group
        self.workspace_group = workspace_group

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.workspace_group, 'workspace_group')

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
        if self.workspace_group is not None:
            result['workspace_group'] = self.workspace_group
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_group') is not None:
            self.workspace_group = m.get('workspace_group')
        return self


class QueryMiddlewareClustermodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ClusterMode = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 集群模式
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
            temp_model = ClusterMode()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryMiddlewareClustersRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryMiddlewareClustersResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[MiddlewareCluster] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 集群列表
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = MiddlewareCluster()
                self.data.append(temp_model.from_map(k))
        return self


class BindMiddlewareInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_group: str = None,
        cluster_id: str = None,
        workspaces: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 工作空间组
        self.workspace_group = workspace_group
        # region
        self.cluster_id = cluster_id
        # 工作空间，多个中间使用"," 隔开
        self.workspaces = workspaces

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.workspace_group, 'workspace_group')
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.workspaces, 'workspaces')

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
        if self.workspace_group is not None:
            result['workspace_group'] = self.workspace_group
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.workspaces is not None:
            result['workspaces'] = self.workspaces
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_group') is not None:
            self.workspace_group = m.get('workspace_group')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('workspaces') is not None:
            self.workspaces = m.get('workspaces')
        return self


class BindMiddlewareInstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BindInstance = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回绑定实例信息
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
            temp_model = BindInstance()
            self.data = temp_model.from_map(m['data'])
        return self


class UnbindMiddlewareInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_group: str = None,
        cluster_id: str = None,
        workspaces: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 工作空间
        self.workspace_group = workspace_group
        # 集群id
        self.cluster_id = cluster_id
        # 工作空间，如果有多个则使用 "," 隔开
        self.workspaces = workspaces

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.workspace_group, 'workspace_group')
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.workspaces, 'workspaces')

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
        if self.workspace_group is not None:
            result['workspace_group'] = self.workspace_group
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.workspaces is not None:
            result['workspaces'] = self.workspaces
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_group') is not None:
            self.workspace_group = m.get('workspace_group')
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('workspaces') is not None:
            self.workspaces = m.get('workspaces')
        return self


class UnbindMiddlewareInstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果
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


class PushLicenceMeterdataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_code: str = None,
        commodity_code: str = None,
        spec_code: str = None,
        instance_id: str = None,
        user_id: str = None,
        data: str = None,
        gmt_meter: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品Code
        self.product_code = product_code
        # 商品code
        self.commodity_code = commodity_code
        # 规格
        self.spec_code = spec_code
        # 实例ID, 如果是SOFA产品，则表示SOFA的实例ID。
        # 如果不传则认为是当前环境的总使用量；
        # 如果传了则认为是特定instanceId内的使用量
        self.instance_id = instance_id
        # 用户id
        self.user_id = user_id
        # 原始计量数据，KV结构。
        # 每一对KV 对应一个计量项及其值；Key 为计量项Code，value为其具体的值。比如，某产品有TPS 和节点数两个计量项。
        self.data = data
        # 用量发生的时间
        self.gmt_meter = gmt_meter

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.data, 'data')
        self.validate_required(self.gmt_meter, 'gmt_meter')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.data is not None:
            result['data'] = self.data
        if self.gmt_meter is not None:
            result['gmt_meter'] = self.gmt_meter
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('gmt_meter') is not None:
            self.gmt_meter = m.get('gmt_meter')
        return self


class PushLicenceMeterdataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        need_retry: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否推送成功
        self.success = success
        # 是否需要重发，success为false情况下才有意义
        self.need_retry = need_retry

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
        if self.need_retry is not None:
            result['need_retry'] = self.need_retry
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
        if m.get('need_retry') is not None:
            self.need_retry = m.get('need_retry')
        return self


class PagequeryLicenceMeterdataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_code: str = None,
        commodity_code: str = None,
        instance_id: str = None,
        meter_begin: str = None,
        meter_end: str = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品Code，如果不传参数，默认是“SOFA”
        self.product_code = product_code
        # 传入商品Code，必填：mesh、mq、dtx 等
        self.commodity_code = commodity_code
        # SOFA的实例ID。
        # 如果不传则查询总量（合并所有实例的数据）
        self.instance_id = instance_id
        # 计量开始时间，只支持整点时间
        self.meter_begin = meter_begin
        # 计量结束时间，只支持整点时间（不包含）
        self.meter_end = meter_end
        # 当前页码
        self.current_page = current_page
        # 每页显示条数
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.meter_begin, 'meter_begin')
        self.validate_required(self.meter_end, 'meter_end')
        self.validate_required(self.current_page, 'current_page')
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
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.meter_begin is not None:
            result['meter_begin'] = self.meter_begin
        if self.meter_end is not None:
            result['meter_end'] = self.meter_end
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
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('meter_begin') is not None:
            self.meter_begin = m.get('meter_begin')
        if m.get('meter_end') is not None:
            self.meter_end = m.get('meter_end')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryLicenceMeterdataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        current_page: int = None,
        total_page: str = None,
        meter_data_list: List[MeterDataModel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 当前页码
        self.current_page = current_page
        # 总页数
        self.total_page = total_page
        # 计量数据
        self.meter_data_list = meter_data_list

    def validate(self):
        if self.meter_data_list:
            for k in self.meter_data_list:
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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['meter_data_list'] = []
        if self.meter_data_list is not None:
            for k in self.meter_data_list:
                result['meter_data_list'].append(k.to_map() if k else None)
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
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.meter_data_list = []
        if m.get('meter_data_list') is not None:
            for k in m.get('meter_data_list'):
                temp_model = MeterDataModel()
                self.meter_data_list.append(temp_model.from_map(k))
        return self


