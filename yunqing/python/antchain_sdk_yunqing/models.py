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


class ResourcePool(TeaModel):
    def __init__(
        self,
        name: str = None,
        provider: str = None,
        resource_type: str = None,
        access_info: str = None,
        cloud_id: str = None,
    ):
        # 资源池名称, Local站点下唯一
        self.name = name
        # 资源的提供者, ALB,SLB,ALISQL,RDS,OCEANBASE,AFS,OSS,ECS,ALIYUNECS
        self.provider = provider
        # 支持的资源类型
        self.resource_type = resource_type
        # 资源池访问信息
        self.access_info = access_info
        # 所属cloud的id
        self.cloud_id = cloud_id

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.provider, 'provider')
        self.validate_required(self.resource_type, 'resource_type')
        self.validate_required(self.access_info, 'access_info')
        self.validate_required(self.cloud_id, 'cloud_id')

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.provider is not None:
            result['provider'] = self.provider
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        if self.access_info is not None:
            result['access_info'] = self.access_info
        if self.cloud_id is not None:
            result['cloud_id'] = self.cloud_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        if m.get('access_info') is not None:
            self.access_info = m.get('access_info')
        if m.get('cloud_id') is not None:
            self.cloud_id = m.get('cloud_id')
        return self


class Zone(TeaModel):
    def __init__(
        self,
        identity: str = None,
        name: str = None,
        region_id: str = None,
        resource_pools: List[ResourcePool] = None,
        zone_id: str = None,
        display_name: str = None,
    ):
        # 机房的标识（与阿里云对齐）
        self.identity = identity
        # 机房的名字
        self.name = name
        # 地域的id
        self.region_id = region_id
        # 机房内关联的资源池列表
        self.resource_pools = resource_pools
        # 机房的id
        self.zone_id = zone_id
        # 显示的名字
        self.display_name = display_name

    def validate(self):
        self.validate_required(self.identity, 'identity')
        self.validate_required(self.name, 'name')
        self.validate_required(self.region_id, 'region_id')
        self.validate_required(self.resource_pools, 'resource_pools')
        if self.resource_pools:
            for k in self.resource_pools:
                if k:
                    k.validate()
        self.validate_required(self.zone_id, 'zone_id')
        self.validate_required(self.display_name, 'display_name')

    def to_map(self):
        result = dict()
        if self.identity is not None:
            result['identity'] = self.identity
        if self.name is not None:
            result['name'] = self.name
        if self.region_id is not None:
            result['region_id'] = self.region_id
        result['resource_pools'] = []
        if self.resource_pools is not None:
            for k in self.resource_pools:
                result['resource_pools'].append(k.to_map() if k else None)
        if self.zone_id is not None:
            result['zone_id'] = self.zone_id
        if self.display_name is not None:
            result['display_name'] = self.display_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identity') is not None:
            self.identity = m.get('identity')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        self.resource_pools = []
        if m.get('resource_pools') is not None:
            for k in m.get('resource_pools'):
                temp_model = ResourcePool()
                self.resource_pools.append(temp_model.from_map(k))
        if m.get('zone_id') is not None:
            self.zone_id = m.get('zone_id')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        return self


class Region(TeaModel):
    def __init__(
        self,
        identity: str = None,
        name: str = None,
        region_id: str = None,
        display_name: str = None,
        city: str = None,
        tag: str = None,
    ):
        # 地域标识（与阿里云identity对齐）
        self.identity = identity
        # 地域的名字
        self.name = name
        # region的id
        self.region_id = region_id
        # 显示的名字，可重复
        self.display_name = display_name
        # 所在城市
        self.city = city
        # 是否金区：FINANCIAL， NON_FINANCIAL
        self.tag = tag

    def validate(self):
        self.validate_required(self.identity, 'identity')
        self.validate_required(self.name, 'name')
        self.validate_required(self.region_id, 'region_id')
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.city, 'city')
        self.validate_required(self.tag, 'tag')

    def to_map(self):
        result = dict()
        if self.identity is not None:
            result['identity'] = self.identity
        if self.name is not None:
            result['name'] = self.name
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.city is not None:
            result['city'] = self.city
        if self.tag is not None:
            result['tag'] = self.tag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identity') is not None:
            self.identity = m.get('identity')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        return self


class PodInfo(TeaModel):
    def __init__(
        self,
        pod_name: str = None,
        container_name: str = None,
        ip: str = None,
        host_ip: str = None,
        host_name: str = None,
        cpu: str = None,
        memory: str = None,
        status: str = None,
    ):
        # podname
        self.pod_name = pod_name
        # 容器name
        self.container_name = container_name
        # ip
        self.ip = ip
        # host ip
        self.host_ip = host_ip
        # hostname
        self.host_name = host_name
        # cpu
        self.cpu = cpu
        # 内存
        self.memory = memory
        # status
        self.status = status

    def validate(self):
        self.validate_required(self.pod_name, 'pod_name')
        self.validate_required(self.container_name, 'container_name')
        self.validate_required(self.ip, 'ip')
        self.validate_required(self.host_ip, 'host_ip')

    def to_map(self):
        result = dict()
        if self.pod_name is not None:
            result['pod_name'] = self.pod_name
        if self.container_name is not None:
            result['container_name'] = self.container_name
        if self.ip is not None:
            result['ip'] = self.ip
        if self.host_ip is not None:
            result['host_ip'] = self.host_ip
        if self.host_name is not None:
            result['host_name'] = self.host_name
        if self.cpu is not None:
            result['cpu'] = self.cpu
        if self.memory is not None:
            result['memory'] = self.memory
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pod_name') is not None:
            self.pod_name = m.get('pod_name')
        if m.get('container_name') is not None:
            self.container_name = m.get('container_name')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        if m.get('host_ip') is not None:
            self.host_ip = m.get('host_ip')
        if m.get('host_name') is not None:
            self.host_name = m.get('host_name')
        if m.get('cpu') is not None:
            self.cpu = m.get('cpu')
        if m.get('memory') is not None:
            self.memory = m.get('memory')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class Cell(TeaModel):
    def __init__(
        self,
        cell_group_id: str = None,
        cell_id: str = None,
        color: str = None,
        default_weight: int = None,
        gray: bool = None,
        name: str = None,
        region_id: str = None,
        type: str = None,
        workspace_id: str = None,
        zone_id: str = None,
        display_name: str = None,
    ):
        # LDC下cellGroup的ID
        self.cell_group_id = cell_group_id
        # 单元的id
        self.cell_id = cell_id
        # LDC的蓝绿着色
        self.color = color
        # LDC的默认权重
        self.default_weight = default_weight
        # LDC下是否灰度
        self.gray = gray
        # 单元的名字
        self.name = name
        # 所在地域的id
        self.region_id = region_id
        # LDC的GRCZone类型
        self.type = type
        # 工作空间id
        self.workspace_id = workspace_id
        # 所属机房的id
        self.zone_id = zone_id
        # 显示的名字
        self.display_name = display_name

    def validate(self):
        self.validate_required(self.cell_id, 'cell_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.region_id, 'region_id')
        self.validate_required(self.workspace_id, 'workspace_id')
        self.validate_required(self.zone_id, 'zone_id')
        self.validate_required(self.display_name, 'display_name')

    def to_map(self):
        result = dict()
        if self.cell_group_id is not None:
            result['cell_group_id'] = self.cell_group_id
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        if self.color is not None:
            result['color'] = self.color
        if self.default_weight is not None:
            result['default_weight'] = self.default_weight
        if self.gray is not None:
            result['gray'] = self.gray
        if self.name is not None:
            result['name'] = self.name
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.type is not None:
            result['type'] = self.type
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.zone_id is not None:
            result['zone_id'] = self.zone_id
        if self.display_name is not None:
            result['display_name'] = self.display_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cell_group_id') is not None:
            self.cell_group_id = m.get('cell_group_id')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        if m.get('color') is not None:
            self.color = m.get('color')
        if m.get('default_weight') is not None:
            self.default_weight = m.get('default_weight')
        if m.get('gray') is not None:
            self.gray = m.get('gray')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('zone_id') is not None:
            self.zone_id = m.get('zone_id')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        return self


class ParamData(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
        type: str = None,
        security_level: str = None,
    ):
        # 参数key
        self.key = key
        # 参数值
        self.value = value
        # 类型, 对应Data的paramGroup
        self.type = type
        # 安全级别，脱敏用
        self.security_level = security_level

    def validate(self):
        self.validate_required(self.key, 'key')

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        if self.type is not None:
            result['type'] = self.type
        if self.security_level is not None:
            result['security_level'] = self.security_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('security_level') is not None:
            self.security_level = m.get('security_level')
        return self


class Cloud(TeaModel):
    def __init__(
        self,
        cloud_id: str = None,
        name: str = None,
    ):
        # 云的ID
        self.cloud_id = cloud_id
        # 云的名字
        self.name = name

    def validate(self):
        self.validate_required(self.cloud_id, 'cloud_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.cloud_id is not None:
            result['cloud_id'] = self.cloud_id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cloud_id') is not None:
            self.cloud_id = m.get('cloud_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class Container(TeaModel):
    def __init__(
        self,
        app_version: str = None,
        cpu: int = None,
        host_ip: str = None,
        host_name: str = None,
        id: str = None,
        image: str = None,
        ip: str = None,
        memory: int = None,
        name: str = None,
        pod: str = None,
        resource_pool_id: str = None,
        status: str = None,
        app_name: str = None,
    ):
        # 应用版本
        self.app_version = app_version
        # cpu核数，单位C。
        self.cpu = cpu
        # 宿主机ip。
        self.host_ip = host_ip
        # 宿主机名称。
        self.host_name = host_name
        # 容器id。
        self.id = id
        # 容器镜像。
        self.image = image
        # 容器ip。
        self.ip = ip
        # 内存大小，单位M。
        self.memory = memory
        # 容器名称。
        self.name = name
        # 容器所在的pod。
        self.pod = pod
        # 资源所属的资源池的唯一标识。
        self.resource_pool_id = resource_pool_id
        # 容器状态。
        self.status = status
        # 应用名
        self.app_name = app_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.app_version is not None:
            result['app_version'] = self.app_version
        if self.cpu is not None:
            result['cpu'] = self.cpu
        if self.host_ip is not None:
            result['host_ip'] = self.host_ip
        if self.host_name is not None:
            result['host_name'] = self.host_name
        if self.id is not None:
            result['id'] = self.id
        if self.image is not None:
            result['image'] = self.image
        if self.ip is not None:
            result['ip'] = self.ip
        if self.memory is not None:
            result['memory'] = self.memory
        if self.name is not None:
            result['name'] = self.name
        if self.pod is not None:
            result['pod'] = self.pod
        if self.resource_pool_id is not None:
            result['resource_pool_id'] = self.resource_pool_id
        if self.status is not None:
            result['status'] = self.status
        if self.app_name is not None:
            result['app_name'] = self.app_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_version') is not None:
            self.app_version = m.get('app_version')
        if m.get('cpu') is not None:
            self.cpu = m.get('cpu')
        if m.get('host_ip') is not None:
            self.host_ip = m.get('host_ip')
        if m.get('host_name') is not None:
            self.host_name = m.get('host_name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('image') is not None:
            self.image = m.get('image')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        if m.get('memory') is not None:
            self.memory = m.get('memory')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('pod') is not None:
            self.pod = m.get('pod')
        if m.get('resource_pool_id') is not None:
            self.resource_pool_id = m.get('resource_pool_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        return self


class Tenant(TeaModel):
    def __init__(
        self,
        name: str = None,
        tanent_id: str = None,
    ):
        # 租户名
        self.name = name
        # 租户id
        self.tanent_id = tanent_id

    def validate(self):
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.tanent_id is not None:
            result['tanent_id'] = self.tanent_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tanent_id') is not None:
            self.tanent_id = m.get('tanent_id')
        return self


class AppInfo(TeaModel):
    def __init__(
        self,
        namespace: str = None,
        pod_list: List[PodInfo] = None,
        app_name: str = None,
        app_version: str = None,
    ):
        # 集群里面该app的namespace
        self.namespace = namespace
        # pod信息列表
        self.pod_list = pod_list
        # 应用名称
        self.app_name = app_name
        # ap version
        self.app_version = app_version

    def validate(self):
        self.validate_required(self.namespace, 'namespace')
        self.validate_required(self.pod_list, 'pod_list')
        if self.pod_list:
            for k in self.pod_list:
                if k:
                    k.validate()
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.app_version, 'app_version')

    def to_map(self):
        result = dict()
        if self.namespace is not None:
            result['namespace'] = self.namespace
        result['pod_list'] = []
        if self.pod_list is not None:
            for k in self.pod_list:
                result['pod_list'].append(k.to_map() if k else None)
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.app_version is not None:
            result['app_version'] = self.app_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('namespace') is not None:
            self.namespace = m.get('namespace')
        self.pod_list = []
        if m.get('pod_list') is not None:
            for k in m.get('pod_list'):
                temp_model = PodInfo()
                self.pod_list.append(temp_model.from_map(k))
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('app_version') is not None:
            self.app_version = m.get('app_version')
        return self


class CellGroup(TeaModel):
    def __init__(
        self,
        cell_group_id: str = None,
        default_gzone: str = None,
        elastic: bool = None,
        name: str = None,
        normal_drstat: str = None,
        press_drstat: str = None,
        type: str = None,
        display_name: str = None,
    ):
        # cellGroup的id
        self.cell_group_id = cell_group_id
        # 默认gzone cell的id
        self.default_gzone = default_gzone
        # 是否弹性
        self.elastic = elastic
        # cellGroup的名字
        self.name = name
        # 暂时不知道啥意思
        self.normal_drstat = normal_drstat
        # 暂时不知道啥意思
        self.press_drstat = press_drstat
        # LDC下cellGroup的类型
        self.type = type
        # 显示的名字
        self.display_name = display_name

    def validate(self):
        self.validate_required(self.cell_group_id, 'cell_group_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.display_name, 'display_name')

    def to_map(self):
        result = dict()
        if self.cell_group_id is not None:
            result['cell_group_id'] = self.cell_group_id
        if self.default_gzone is not None:
            result['default_gzone'] = self.default_gzone
        if self.elastic is not None:
            result['elastic'] = self.elastic
        if self.name is not None:
            result['name'] = self.name
        if self.normal_drstat is not None:
            result['normal_drstat'] = self.normal_drstat
        if self.press_drstat is not None:
            result['press_drstat'] = self.press_drstat
        if self.type is not None:
            result['type'] = self.type
        if self.display_name is not None:
            result['display_name'] = self.display_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cell_group_id') is not None:
            self.cell_group_id = m.get('cell_group_id')
        if m.get('default_gzone') is not None:
            self.default_gzone = m.get('default_gzone')
        if m.get('elastic') is not None:
            self.elastic = m.get('elastic')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('normal_drstat') is not None:
            self.normal_drstat = m.get('normal_drstat')
        if m.get('press_drstat') is not None:
            self.press_drstat = m.get('press_drstat')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        return self


class Workspace(TeaModel):
    def __init__(
        self,
        cells: List[Cell] = None,
        display_name: str = None,
        name: str = None,
        region: Region = None,
        workspace_id: str = None,
        zones: List[Zone] = None,
    ):
        # 包含的单元（逻辑机房）
        self.cells = cells
        # 显示的名字
        self.display_name = display_name
        # workspace的名字
        self.name = name
        # 所属地域
        self.region = region
        # 工作空间的id
        self.workspace_id = workspace_id
        # 机房列表
        self.zones = zones

    def validate(self):
        self.validate_required(self.cells, 'cells')
        if self.cells:
            for k in self.cells:
                if k:
                    k.validate()
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.name, 'name')
        self.validate_required(self.region, 'region')
        if self.region:
            self.region.validate()
        self.validate_required(self.workspace_id, 'workspace_id')
        self.validate_required(self.zones, 'zones')
        if self.zones:
            for k in self.zones:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['cells'] = []
        if self.cells is not None:
            for k in self.cells:
                result['cells'].append(k.to_map() if k else None)
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.name is not None:
            result['name'] = self.name
        if self.region is not None:
            result['region'] = self.region.to_map()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        result['zones'] = []
        if self.zones is not None:
            for k in self.zones:
                result['zones'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.cells = []
        if m.get('cells') is not None:
            for k in m.get('cells'):
                temp_model = Cell()
                self.cells.append(temp_model.from_map(k))
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('region') is not None:
            temp_model = Region()
            self.region = temp_model.from_map(m['region'])
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        self.zones = []
        if m.get('zones') is not None:
            for k in m.get('zones'):
                temp_model = Zone()
                self.zones.append(temp_model.from_map(k))
        return self


class ContainerInfo(TeaModel):
    def __init__(
        self,
        log: str = None,
        status: str = None,
        utc_create: str = None,
        utc_end: str = None,
        utc_modified: str = None,
        utc_start: str = None,
    ):
        # 容器日志
        self.log = log
        # 容器节点状态
        self.status = status
        # 创建时间
        self.utc_create = utc_create
        # 结束时间
        self.utc_end = utc_end
        # 修改时间
        self.utc_modified = utc_modified
        # 开始时间
        self.utc_start = utc_start

    def validate(self):
        self.validate_required(self.log, 'log')
        self.validate_required(self.status, 'status')
        self.validate_required(self.utc_create, 'utc_create')
        if self.utc_create is not None:
            self.validate_pattern(self.utc_create, 'utc_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.utc_end, 'utc_end')
        if self.utc_end is not None:
            self.validate_pattern(self.utc_end, 'utc_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.utc_modified, 'utc_modified')
        if self.utc_modified is not None:
            self.validate_pattern(self.utc_modified, 'utc_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.utc_start, 'utc_start')
        if self.utc_start is not None:
            self.validate_pattern(self.utc_start, 'utc_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.log is not None:
            result['log'] = self.log
        if self.status is not None:
            result['status'] = self.status
        if self.utc_create is not None:
            result['utc_create'] = self.utc_create
        if self.utc_end is not None:
            result['utc_end'] = self.utc_end
        if self.utc_modified is not None:
            result['utc_modified'] = self.utc_modified
        if self.utc_start is not None:
            result['utc_start'] = self.utc_start
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('log') is not None:
            self.log = m.get('log')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('utc_create') is not None:
            self.utc_create = m.get('utc_create')
        if m.get('utc_end') is not None:
            self.utc_end = m.get('utc_end')
        if m.get('utc_modified') is not None:
            self.utc_modified = m.get('utc_modified')
        if m.get('utc_start') is not None:
            self.utc_start = m.get('utc_start')
        return self


class BackendServer(TeaModel):
    def __init__(
        self,
        container_id: str = None,
        container_resource_pool_id: str = None,
        lb_resource_pool_id: str = None,
        load_balancer_id: str = None,
        weight: int = None,
    ):
        # 容器id。
        self.container_id = container_id
        # 容器所在的资源池id。
        self.container_resource_pool_id = container_resource_pool_id
        # 资源池id。
        self.lb_resource_pool_id = lb_resource_pool_id
        # 负载均衡实例id。
        self.load_balancer_id = load_balancer_id
        # 权重。
        self.weight = weight

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.container_id is not None:
            result['container_id'] = self.container_id
        if self.container_resource_pool_id is not None:
            result['container_resource_pool_id'] = self.container_resource_pool_id
        if self.lb_resource_pool_id is not None:
            result['lb_resource_pool_id'] = self.lb_resource_pool_id
        if self.load_balancer_id is not None:
            result['load_balancer_id'] = self.load_balancer_id
        if self.weight is not None:
            result['weight'] = self.weight
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('container_id') is not None:
            self.container_id = m.get('container_id')
        if m.get('container_resource_pool_id') is not None:
            self.container_resource_pool_id = m.get('container_resource_pool_id')
        if m.get('lb_resource_pool_id') is not None:
            self.lb_resource_pool_id = m.get('lb_resource_pool_id')
        if m.get('load_balancer_id') is not None:
            self.load_balancer_id = m.get('load_balancer_id')
        if m.get('weight') is not None:
            self.weight = m.get('weight')
        return self


class ProdInfo(TeaModel):
    def __init__(
        self,
        app_infos: List[AppInfo] = None,
        prod_name: str = None,
        prod_version: str = None,
    ):
        # 应用实例信息
        self.app_infos = app_infos
        # 产品名
        self.prod_name = prod_name
        # prod version
        self.prod_version = prod_version

    def validate(self):
        self.validate_required(self.app_infos, 'app_infos')
        if self.app_infos:
            for k in self.app_infos:
                if k:
                    k.validate()
        self.validate_required(self.prod_name, 'prod_name')
        self.validate_required(self.prod_version, 'prod_version')

    def to_map(self):
        result = dict()
        result['app_infos'] = []
        if self.app_infos is not None:
            for k in self.app_infos:
                result['app_infos'].append(k.to_map() if k else None)
        if self.prod_name is not None:
            result['prod_name'] = self.prod_name
        if self.prod_version is not None:
            result['prod_version'] = self.prod_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.app_infos = []
        if m.get('app_infos') is not None:
            for k in m.get('app_infos'):
                temp_model = AppInfo()
                self.app_infos.append(temp_model.from_map(k))
        if m.get('prod_name') is not None:
            self.prod_name = m.get('prod_name')
        if m.get('prod_version') is not None:
            self.prod_version = m.get('prod_version')
        return self


class AppServiceInfo(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        app_version: str = None,
        cell_id: str = None,
        containers: List[Container] = None,
        deploy_unit: str = None,
        env_id: str = None,
        id: str = None,
        product_code: str = None,
        product_group_identity: str = None,
        product_group_name: str = None,
        status: str = None,
    ):
        # 应用名称
        self.app_name = app_name
        # 应用版本
        self.app_version = app_version
        # 所属单元ID
        self.cell_id = cell_id
        # 容器列表。
        self.containers = containers
        # 部署单元名称，产品实例下唯一。
        self.deploy_unit = deploy_unit
        # 环境唯一标识。
        self.env_id = env_id
        # 应用服务实例唯一标识。
        self.id = id
        # 产品码
        self.product_code = product_code
        # 所属产品分组唯一标识。
        self.product_group_identity = product_group_identity
        # 所属产品分组名称。
        self.product_group_name = product_group_name
        # 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
        self.status = status

    def validate(self):
        self.validate_required(self.cell_id, 'cell_id')
        if self.containers:
            for k in self.containers:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.app_version is not None:
            result['app_version'] = self.app_version
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        result['containers'] = []
        if self.containers is not None:
            for k in self.containers:
                result['containers'].append(k.to_map() if k else None)
        if self.deploy_unit is not None:
            result['deploy_unit'] = self.deploy_unit
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.id is not None:
            result['id'] = self.id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_group_identity is not None:
            result['product_group_identity'] = self.product_group_identity
        if self.product_group_name is not None:
            result['product_group_name'] = self.product_group_name
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('app_version') is not None:
            self.app_version = m.get('app_version')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        self.containers = []
        if m.get('containers') is not None:
            for k in m.get('containers'):
                temp_model = Container()
                self.containers.append(temp_model.from_map(k))
        if m.get('deploy_unit') is not None:
            self.deploy_unit = m.get('deploy_unit')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_group_identity') is not None:
            self.product_group_identity = m.get('product_group_identity')
        if m.get('product_group_name') is not None:
            self.product_group_name = m.get('product_group_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class AppParamData(TeaModel):
    def __init__(
        self,
        prod_code: str = None,
        app_name: str = None,
        app_params: List[ParamData] = None,
    ):
        # 产品码
        self.prod_code = prod_code
        # 应用名
        self.app_name = app_name
        # 应用启动参数
        self.app_params = app_params

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.app_params, 'app_params')
        if self.app_params:
            for k in self.app_params:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.app_name is not None:
            result['app_name'] = self.app_name
        result['app_params'] = []
        if self.app_params is not None:
            for k in self.app_params:
                result['app_params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        self.app_params = []
        if m.get('app_params') is not None:
            for k in m.get('app_params'):
                temp_model = ParamData()
                self.app_params.append(temp_model.from_map(k))
        return self


class AppPreviewTask(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        need_deploy: bool = None,
    ):
        # app name
        self.app_name = app_name
        # 是否需要部署
        self.need_deploy = need_deploy

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.need_deploy, 'need_deploy')

    def to_map(self):
        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.need_deploy is not None:
            result['need_deploy'] = self.need_deploy
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('need_deploy') is not None:
            self.need_deploy = m.get('need_deploy')
        return self


class Env(TeaModel):
    def __init__(
        self,
        cell_groups: List[CellGroup] = None,
        cloud: Cloud = None,
        cluster_id: str = None,
        display_name: str = None,
        env_id: str = None,
        id: str = None,
        ldc: bool = None,
        name: str = None,
        stack: str = None,
        tenant: Tenant = None,
        workspaces: List[Workspace] = None,
        workspace_id: str = None,
        env_type: str = None,
    ):
        # cellGroup的列表
        self.cell_groups = cell_groups
        # 云信息
        self.cloud = cloud
        # 关联的ake集群id
        self.cluster_id = cluster_id
        # 环境名
        self.display_name = display_name
        # 环境的id
        self.env_id = env_id
        # （已废弃）环境唯一标识。
        self.id = id
        # 是否ldc环境
        self.ldc = ldc
        # 环境名称。
        self.name = name
        # （已废弃）环境底座iaas技术栈。
        self.stack = stack
        # 租户信息
        self.tenant = tenant
        # 工作空间列表
        self.workspaces = workspaces
        # （已废弃）兼容逻辑老的workspace逻辑，非监控产品勿依赖。
        self.workspace_id = workspace_id
        # 环境类型
        self.env_type = env_type

    def validate(self):
        self.validate_required(self.cell_groups, 'cell_groups')
        if self.cell_groups:
            for k in self.cell_groups:
                if k:
                    k.validate()
        self.validate_required(self.cloud, 'cloud')
        if self.cloud:
            self.cloud.validate()
        self.validate_required(self.cluster_id, 'cluster_id')
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.ldc, 'ldc')
        self.validate_required(self.name, 'name')
        if self.tenant:
            self.tenant.validate()
        self.validate_required(self.workspaces, 'workspaces')
        if self.workspaces:
            for k in self.workspaces:
                if k:
                    k.validate()
        self.validate_required(self.env_type, 'env_type')

    def to_map(self):
        result = dict()
        result['cell_groups'] = []
        if self.cell_groups is not None:
            for k in self.cell_groups:
                result['cell_groups'].append(k.to_map() if k else None)
        if self.cloud is not None:
            result['cloud'] = self.cloud.to_map()
        if self.cluster_id is not None:
            result['cluster_id'] = self.cluster_id
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.id is not None:
            result['id'] = self.id
        if self.ldc is not None:
            result['ldc'] = self.ldc
        if self.name is not None:
            result['name'] = self.name
        if self.stack is not None:
            result['stack'] = self.stack
        if self.tenant is not None:
            result['tenant'] = self.tenant.to_map()
        result['workspaces'] = []
        if self.workspaces is not None:
            for k in self.workspaces:
                result['workspaces'].append(k.to_map() if k else None)
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.env_type is not None:
            result['env_type'] = self.env_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.cell_groups = []
        if m.get('cell_groups') is not None:
            for k in m.get('cell_groups'):
                temp_model = CellGroup()
                self.cell_groups.append(temp_model.from_map(k))
        if m.get('cloud') is not None:
            temp_model = Cloud()
            self.cloud = temp_model.from_map(m['cloud'])
        if m.get('cluster_id') is not None:
            self.cluster_id = m.get('cluster_id')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('ldc') is not None:
            self.ldc = m.get('ldc')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('stack') is not None:
            self.stack = m.get('stack')
        if m.get('tenant') is not None:
            temp_model = Tenant()
            self.tenant = temp_model.from_map(m['tenant'])
        self.workspaces = []
        if m.get('workspaces') is not None:
            for k in m.get('workspaces'):
                temp_model = Workspace()
                self.workspaces.append(temp_model.from_map(k))
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('env_type') is not None:
            self.env_type = m.get('env_type')
        return self


class Listener(TeaModel):
    def __init__(
        self,
        backend_server_port: int = None,
        listener_port: int = None,
        load_balancer_id: str = None,
        protocol: str = None,
        resource_pool_id: str = None,
    ):
        # 后端端口。
        self.backend_server_port = backend_server_port
        # 前端端口。
        self.listener_port = listener_port
        # 负载均衡实例id。
        self.load_balancer_id = load_balancer_id
        # 监听器协议。HTTP/HTTPS/TCP
        self.protocol = protocol
        # 资源池id。
        self.resource_pool_id = resource_pool_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.backend_server_port is not None:
            result['backend_server_port'] = self.backend_server_port
        if self.listener_port is not None:
            result['listener_port'] = self.listener_port
        if self.load_balancer_id is not None:
            result['load_balancer_id'] = self.load_balancer_id
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.resource_pool_id is not None:
            result['resource_pool_id'] = self.resource_pool_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('backend_server_port') is not None:
            self.backend_server_port = m.get('backend_server_port')
        if m.get('listener_port') is not None:
            self.listener_port = m.get('listener_port')
        if m.get('load_balancer_id') is not None:
            self.load_balancer_id = m.get('load_balancer_id')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('resource_pool_id') is not None:
            self.resource_pool_id = m.get('resource_pool_id')
        return self


class OpenAPI(TeaModel):
    def __init__(
        self,
        method: str = None,
        version: str = None,
    ):
        # API方法
        self.method = method
        # API版本号
        self.version = version

    def validate(self):
        self.validate_required(self.method, 'method')
        self.validate_required(self.version, 'version')

    def to_map(self):
        result = dict()
        if self.method is not None:
            result['method'] = self.method
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('method') is not None:
            self.method = m.get('method')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class AutoTestCase(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        app_version: str = None,
        case_level: str = None,
        case_name: str = None,
        case_status: str = None,
        case_type: str = None,
        class_name: str = None,
        detail: str = None,
        duration: int = None,
        id: str = None,
        method_name: str = None,
    ):
        # 测试应用本身的名字
        self.app_name = app_name
        # 测试应用本身的版本
        self.app_version = app_version
        # case的级别
        self.case_level = case_level
        # case的名字
        self.case_name = case_name
        # case的状态
        self.case_status = case_status
        # case的类型
        self.case_type = case_type
        # case的类
        self.class_name = class_name
        # 详情
        self.detail = detail
        # case运行的时间，单位毫秒
        self.duration = duration
        # case的id
        self.id = id
        # 测试方法名
        self.method_name = method_name

    def validate(self):
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.app_version, 'app_version')
        self.validate_required(self.case_level, 'case_level')
        self.validate_required(self.case_name, 'case_name')
        self.validate_required(self.case_status, 'case_status')
        self.validate_required(self.case_type, 'case_type')
        self.validate_required(self.class_name, 'class_name')
        self.validate_required(self.duration, 'duration')
        self.validate_required(self.id, 'id')
        self.validate_required(self.method_name, 'method_name')

    def to_map(self):
        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.app_version is not None:
            result['app_version'] = self.app_version
        if self.case_level is not None:
            result['case_level'] = self.case_level
        if self.case_name is not None:
            result['case_name'] = self.case_name
        if self.case_status is not None:
            result['case_status'] = self.case_status
        if self.case_type is not None:
            result['case_type'] = self.case_type
        if self.class_name is not None:
            result['class_name'] = self.class_name
        if self.detail is not None:
            result['detail'] = self.detail
        if self.duration is not None:
            result['duration'] = self.duration
        if self.id is not None:
            result['id'] = self.id
        if self.method_name is not None:
            result['method_name'] = self.method_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('app_version') is not None:
            self.app_version = m.get('app_version')
        if m.get('case_level') is not None:
            self.case_level = m.get('case_level')
        if m.get('case_name') is not None:
            self.case_name = m.get('case_name')
        if m.get('case_status') is not None:
            self.case_status = m.get('case_status')
        if m.get('case_type') is not None:
            self.case_type = m.get('case_type')
        if m.get('class_name') is not None:
            self.class_name = m.get('class_name')
        if m.get('detail') is not None:
            self.detail = m.get('detail')
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('method_name') is not None:
            self.method_name = m.get('method_name')
        return self


class Database(TeaModel):
    def __init__(
        self,
        name: str = None,
        port: int = None,
        provider: str = None,
        resource_id: str = None,
        resource_pool_id: str = None,
        url: str = None,
    ):
        # acgotonecore_db_-4784849131397729849。
        self.name = name
        # 数据库访问端口。
        self.port = port
        # 数据库类型。MYSQL  |  OCEANBASE。
        self.provider = provider
        # 实例id。
        self.resource_id = resource_id
        # 资源池id。
        self.resource_pool_id = resource_pool_id
        # 数据库访问地址。
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.port is not None:
            result['port'] = self.port
        if self.provider is not None:
            result['provider'] = self.provider
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.resource_pool_id is not None:
            result['resource_pool_id'] = self.resource_pool_id
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('port') is not None:
            self.port = m.get('port')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('resource_pool_id') is not None:
            self.resource_pool_id = m.get('resource_pool_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class Application(TeaModel):
    def __init__(
        self,
        application_name: str = None,
        product_code: str = None,
    ):
        # 应用英文名
        self.application_name = application_name
        # 应用所属的产品的产品码
        self.product_code = product_code

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.application_name is not None:
            result['application_name'] = self.application_name
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('application_name') is not None:
            self.application_name = m.get('application_name')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class ProductInstance(TeaModel):
    def __init__(
        self,
        cell_id: str = None,
        env_id: str = None,
        product_code: str = None,
        product_version: str = None,
        status: str = None,
        utc_create: str = None,
        utc_modified: str = None,
        deploy_topology_identity: str = None,
        deploy_spec_identity: str = None,
    ):
        # 单元ID
        self.cell_id = cell_id
        # 产品实例所在的环境唯一标识。
        self.env_id = env_id
        # 产品码。
        self.product_code = product_code
        # 产品版本。
        self.product_version = product_version
        # 产品基线状态
        self.status = status
        # 产品创建时间
        self.utc_create = utc_create
        # 产品修改时间
        self.utc_modified = utc_modified
        # 产品拓扑id
        self.deploy_topology_identity = deploy_topology_identity
        # 部署规格id
        self.deploy_spec_identity = deploy_spec_identity

    def validate(self):
        if self.utc_create is not None:
            self.validate_pattern(self.utc_create, 'utc_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.utc_modified is not None:
            self.validate_pattern(self.utc_modified, 'utc_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_version is not None:
            result['product_version'] = self.product_version
        if self.status is not None:
            result['status'] = self.status
        if self.utc_create is not None:
            result['utc_create'] = self.utc_create
        if self.utc_modified is not None:
            result['utc_modified'] = self.utc_modified
        if self.deploy_topology_identity is not None:
            result['deploy_topology_identity'] = self.deploy_topology_identity
        if self.deploy_spec_identity is not None:
            result['deploy_spec_identity'] = self.deploy_spec_identity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_version') is not None:
            self.product_version = m.get('product_version')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('utc_create') is not None:
            self.utc_create = m.get('utc_create')
        if m.get('utc_modified') is not None:
            self.utc_modified = m.get('utc_modified')
        if m.get('deploy_topology_identity') is not None:
            self.deploy_topology_identity = m.get('deploy_topology_identity')
        if m.get('deploy_spec_identity') is not None:
            self.deploy_spec_identity = m.get('deploy_spec_identity')
        return self


class AppService(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        app_version: str = None,
        cell_id: str = None,
        deploy_unit: str = None,
        deploy_zone: str = None,
        env_id: str = None,
        id: str = None,
        product_code: str = None,
        status: str = None,
        app_type: str = None,
    ):
        # 应用英文名。
        self.app_name = app_name
        # 应用版本
        self.app_version = app_version
        # 单元ID
        self.cell_id = cell_id
        # 部署单元名称，产品实例下唯一。
        self.deploy_unit = deploy_unit
        # 部署域。
        self.deploy_zone = deploy_zone
        # 环境唯一标识
        self.env_id = env_id
        # 应用服务实例唯一标识。
        self.id = id
        # 应用所属的产品的产品码
        self.product_code = product_code
        # 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
        self.status = status
        # 应用类型：BUSINESS | JOB | CONTROLLER
        self.app_type = app_type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.app_version is not None:
            result['app_version'] = self.app_version
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        if self.deploy_unit is not None:
            result['deploy_unit'] = self.deploy_unit
        if self.deploy_zone is not None:
            result['deploy_zone'] = self.deploy_zone
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.id is not None:
            result['id'] = self.id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.status is not None:
            result['status'] = self.status
        if self.app_type is not None:
            result['app_type'] = self.app_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('app_version') is not None:
            self.app_version = m.get('app_version')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        if m.get('deploy_unit') is not None:
            self.deploy_unit = m.get('deploy_unit')
        if m.get('deploy_zone') is not None:
            self.deploy_zone = m.get('deploy_zone')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('app_type') is not None:
            self.app_type = m.get('app_type')
        return self


class DeployUnit(TeaModel):
    def __init__(
        self,
        cell_id: str = None,
        env_id: str = None,
        identity: str = None,
        name: str = None,
        product_code: str = None,
        unit_ig: str = None,
    ):
        # 单元ID
        self.cell_id = cell_id
        # 环境唯一标识。
        self.env_id = env_id
        # 部署单元id，产品实例下唯一。
        self.identity = identity
        # 部署单元名称。
        self.name = name
        # 产品码。
        self.product_code = product_code
        # 用户传入部署单元标识，如果没有传入，则为deployment_unit_identity
        self.unit_ig = unit_ig

    def validate(self):
        self.validate_required(self.cell_id, 'cell_id')
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.identity, 'identity')
        self.validate_required(self.name, 'name')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.unit_ig, 'unit_ig')

    def to_map(self):
        result = dict()
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.identity is not None:
            result['identity'] = self.identity
        if self.name is not None:
            result['name'] = self.name
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.unit_ig is not None:
            result['unit_ig'] = self.unit_ig
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('identity') is not None:
            self.identity = m.get('identity')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('unit_ig') is not None:
            self.unit_ig = m.get('unit_ig')
        return self


class Schema(TeaModel):
    def __init__(
        self,
        database: Database = None,
        name: str = None,
        resource_pool_id: str = None,
    ):
        # schema所属的数据库实例信息。
        self.database = database
        # schema名称。
        self.name = name
        # 资源所属的资源池id。
        self.resource_pool_id = resource_pool_id

    def validate(self):
        if self.database:
            self.database.validate()

    def to_map(self):
        result = dict()
        if self.database is not None:
            result['database'] = self.database.to_map()
        if self.name is not None:
            result['name'] = self.name
        if self.resource_pool_id is not None:
            result['resource_pool_id'] = self.resource_pool_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('database') is not None:
            temp_model = Database()
            self.database = temp_model.from_map(m['database'])
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('resource_pool_id') is not None:
            self.resource_pool_id = m.get('resource_pool_id')
        return self


class ProdPreviewTasks(TeaModel):
    def __init__(
        self,
        app_preview_tasks: List[AppPreviewTask] = None,
    ):
        # 应用是否需要部署
        self.app_preview_tasks = app_preview_tasks

    def validate(self):
        self.validate_required(self.app_preview_tasks, 'app_preview_tasks')
        if self.app_preview_tasks:
            for k in self.app_preview_tasks:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['app_preview_tasks'] = []
        if self.app_preview_tasks is not None:
            for k in self.app_preview_tasks:
                result['app_preview_tasks'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.app_preview_tasks = []
        if m.get('app_preview_tasks') is not None:
            for k in m.get('app_preview_tasks'):
                temp_model = AppPreviewTask()
                self.app_preview_tasks.append(temp_model.from_map(k))
        return self


class System(TeaModel):
    def __init__(
        self,
        commit_id: str = None,
        envs: List[Env] = None,
        open_apis: List[OpenAPI] = None,
        version: str = None,
    ):
        # 系统的代码commit
        self.commit_id = commit_id
        # 管理的环境列表
        self.envs = envs
        # 支持的OpenAPI列表
        self.open_apis = open_apis
        # 云游的产品版本号, 该值可能为空
        self.version = version

    def validate(self):
        self.validate_required(self.commit_id, 'commit_id')
        self.validate_required(self.envs, 'envs')
        if self.envs:
            for k in self.envs:
                if k:
                    k.validate()
        self.validate_required(self.open_apis, 'open_apis')
        if self.open_apis:
            for k in self.open_apis:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.commit_id is not None:
            result['commit_id'] = self.commit_id
        result['envs'] = []
        if self.envs is not None:
            for k in self.envs:
                result['envs'].append(k.to_map() if k else None)
        result['open_apis'] = []
        if self.open_apis is not None:
            for k in self.open_apis:
                result['open_apis'].append(k.to_map() if k else None)
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('commit_id') is not None:
            self.commit_id = m.get('commit_id')
        self.envs = []
        if m.get('envs') is not None:
            for k in m.get('envs'):
                temp_model = Env()
                self.envs.append(temp_model.from_map(k))
        self.open_apis = []
        if m.get('open_apis') is not None:
            for k in m.get('open_apis'):
                temp_model = OpenAPI()
                self.open_apis.append(temp_model.from_map(k))
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class UnitResource(TeaModel):
    def __init__(
        self,
        address: str = None,
        env_id: str = None,
        id: str = None,
        name: str = None,
        port: int = None,
        resource_type: str = None,
        zone_id: str = None,
    ):
        # 资源地址
        self.address = address
        # 环境标识
        self.env_id = env_id
        # 资源ID
        self.id = id
        # 资源名称
        self.name = name
        # 资源端口
        self.port = port
        # 资源类型:CONTAINER,LB,DB,CACHE,APP,STORAGE
        self.resource_type = resource_type
        # zone标识
        self.zone_id = zone_id

    def validate(self):
        self.validate_required(self.address, 'address')
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.resource_type, 'resource_type')
        self.validate_required(self.zone_id, 'zone_id')

    def to_map(self):
        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.port is not None:
            result['port'] = self.port
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        if self.zone_id is not None:
            result['zone_id'] = self.zone_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('port') is not None:
            self.port = m.get('port')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        if m.get('zone_id') is not None:
            self.zone_id = m.get('zone_id')
        return self


class NodeExecutionLog(TeaModel):
    def __init__(
        self,
        node_action: str = None,
        message: str = None,
    ):
        # 当前节点的动作
        self.node_action = node_action
        # 当前节点的执行日志信息
        self.message = message

    def validate(self):
        self.validate_required(self.node_action, 'node_action')
        self.validate_required(self.message, 'message')

    def to_map(self):
        result = dict()
        if self.node_action is not None:
            result['node_action'] = self.node_action
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('node_action') is not None:
            self.node_action = m.get('node_action')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class BoxData(TeaModel):
    def __init__(
        self,
        type: str = None,
        data: str = None,
        version: str = None,
    ):
        # 装箱数据类型
        self.type = type
        # 装箱的json数据
        self.data = data
        # 装箱数据版本
        self.version = version

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.data, 'data')
        self.validate_required(self.version, 'version')

    def to_map(self):
        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.data is not None:
            result['data'] = self.data
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class AutoTestLog(TeaModel):
    def __init__(
        self,
        id: str = None,
        message: str = None,
        node_action: str = None,
        node_id: str = None,
        stage: str = None,
        utc_create: str = None,
        utc_modified: str = None,
    ):
        # 日志id
        self.id = id
        # 日志内容
        self.message = message
        # 节点执行的动作
        self.node_action = node_action
        # 节点id
        self.node_id = node_id
        # 节点所处的阶段
        self.stage = stage
        # 创建时间
        self.utc_create = utc_create
        # 修改时间
        self.utc_modified = utc_modified

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.message, 'message')
        self.validate_required(self.node_action, 'node_action')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.stage, 'stage')
        self.validate_required(self.utc_create, 'utc_create')
        self.validate_required(self.utc_modified, 'utc_modified')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.message is not None:
            result['message'] = self.message
        if self.node_action is not None:
            result['node_action'] = self.node_action
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.stage is not None:
            result['stage'] = self.stage
        if self.utc_create is not None:
            result['utc_create'] = self.utc_create
        if self.utc_modified is not None:
            result['utc_modified'] = self.utc_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('node_action') is not None:
            self.node_action = m.get('node_action')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('stage') is not None:
            self.stage = m.get('stage')
        if m.get('utc_create') is not None:
            self.utc_create = m.get('utc_create')
        if m.get('utc_modified') is not None:
            self.utc_modified = m.get('utc_modified')
        return self


class OpsPlan(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        env_id: str = None,
        solution_id: str = None,
        ops_type: str = None,
        plan_type: str = None,
        creator: str = None,
        creator_name: str = None,
        ops_plan_status: str = None,
        utc_create: str = None,
        utc_modified: str = None,
    ):
        # id
        self.id = id
        # 名称
        self.name = name
        # 环境Id
        self.env_id = env_id
        # 解决方案Id
        self.solution_id = solution_id
        # 发布单类型
        self.ops_type = ops_type
        # 发布单类型
        self.plan_type = plan_type
        # 创建人id
        self.creator = creator
        # 创建人名称
        self.creator_name = creator_name
        # 发布单状态
        self.ops_plan_status = ops_plan_status
        # 创建时间
        self.utc_create = utc_create
        # 修改时间
        self.utc_modified = utc_modified

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.solution_id, 'solution_id')
        self.validate_required(self.ops_type, 'ops_type')
        self.validate_required(self.plan_type, 'plan_type')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.creator_name, 'creator_name')
        self.validate_required(self.ops_plan_status, 'ops_plan_status')
        self.validate_required(self.utc_create, 'utc_create')
        if self.utc_create is not None:
            self.validate_pattern(self.utc_create, 'utc_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.utc_modified, 'utc_modified')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.solution_id is not None:
            result['solution_id'] = self.solution_id
        if self.ops_type is not None:
            result['ops_type'] = self.ops_type
        if self.plan_type is not None:
            result['plan_type'] = self.plan_type
        if self.creator is not None:
            result['creator'] = self.creator
        if self.creator_name is not None:
            result['creator_name'] = self.creator_name
        if self.ops_plan_status is not None:
            result['ops_plan_status'] = self.ops_plan_status
        if self.utc_create is not None:
            result['utc_create'] = self.utc_create
        if self.utc_modified is not None:
            result['utc_modified'] = self.utc_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('solution_id') is not None:
            self.solution_id = m.get('solution_id')
        if m.get('ops_type') is not None:
            self.ops_type = m.get('ops_type')
        if m.get('plan_type') is not None:
            self.plan_type = m.get('plan_type')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('creator_name') is not None:
            self.creator_name = m.get('creator_name')
        if m.get('ops_plan_status') is not None:
            self.ops_plan_status = m.get('ops_plan_status')
        if m.get('utc_create') is not None:
            self.utc_create = m.get('utc_create')
        if m.get('utc_modified') is not None:
            self.utc_modified = m.get('utc_modified')
        return self


class UnitInstanceInfo(TeaModel):
    def __init__(
        self,
        app_services: List[AppServiceInfo] = None,
    ):
        # 部署单元内服务实例列表
        self.app_services = app_services

    def validate(self):
        self.validate_required(self.app_services, 'app_services')
        if self.app_services:
            for k in self.app_services:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['app_services'] = []
        if self.app_services is not None:
            for k in self.app_services:
                result['app_services'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.app_services = []
        if m.get('app_services') is not None:
            for k in m.get('app_services'):
                temp_model = AppServiceInfo()
                self.app_services.append(temp_model.from_map(k))
        return self


class AutoTestProdResult(TeaModel):
    def __init__(
        self,
        cases: List[AutoTestCase] = None,
        containers: List[ContainerInfo] = None,
        deploy_unit: str = None,
        prod_code: str = None,
        status: str = None,
        utc_create: str = None,
        utc_end: str = None,
        utc_modified: str = None,
        utc_start: str = None,
        cell_id: str = None,
    ):
        # 测试用例
        self.cases = cases
        # 容器信息
        self.containers = containers
        # 部署单元id
        self.deploy_unit = deploy_unit
        # 产品码
        self.prod_code = prod_code
        # 产品测试状态
        self.status = status
        # 测试创建时间
        self.utc_create = utc_create
        # 结束时间
        self.utc_end = utc_end
        # 测试修改时间
        self.utc_modified = utc_modified
        # 测试开始时间
        self.utc_start = utc_start
        # 单元的id
        self.cell_id = cell_id

    def validate(self):
        self.validate_required(self.cases, 'cases')
        if self.cases:
            for k in self.cases:
                if k:
                    k.validate()
        self.validate_required(self.containers, 'containers')
        if self.containers:
            for k in self.containers:
                if k:
                    k.validate()
        self.validate_required(self.deploy_unit, 'deploy_unit')
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.status, 'status')
        self.validate_required(self.utc_create, 'utc_create')
        if self.utc_create is not None:
            self.validate_pattern(self.utc_create, 'utc_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.utc_end is not None:
            self.validate_pattern(self.utc_end, 'utc_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.utc_modified, 'utc_modified')
        if self.utc_modified is not None:
            self.validate_pattern(self.utc_modified, 'utc_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.utc_start is not None:
            self.validate_pattern(self.utc_start, 'utc_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.cell_id, 'cell_id')

    def to_map(self):
        result = dict()
        result['cases'] = []
        if self.cases is not None:
            for k in self.cases:
                result['cases'].append(k.to_map() if k else None)
        result['containers'] = []
        if self.containers is not None:
            for k in self.containers:
                result['containers'].append(k.to_map() if k else None)
        if self.deploy_unit is not None:
            result['deploy_unit'] = self.deploy_unit
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.status is not None:
            result['status'] = self.status
        if self.utc_create is not None:
            result['utc_create'] = self.utc_create
        if self.utc_end is not None:
            result['utc_end'] = self.utc_end
        if self.utc_modified is not None:
            result['utc_modified'] = self.utc_modified
        if self.utc_start is not None:
            result['utc_start'] = self.utc_start
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.cases = []
        if m.get('cases') is not None:
            for k in m.get('cases'):
                temp_model = AutoTestCase()
                self.cases.append(temp_model.from_map(k))
        self.containers = []
        if m.get('containers') is not None:
            for k in m.get('containers'):
                temp_model = ContainerInfo()
                self.containers.append(temp_model.from_map(k))
        if m.get('deploy_unit') is not None:
            self.deploy_unit = m.get('deploy_unit')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('utc_create') is not None:
            self.utc_create = m.get('utc_create')
        if m.get('utc_end') is not None:
            self.utc_end = m.get('utc_end')
        if m.get('utc_modified') is not None:
            self.utc_modified = m.get('utc_modified')
        if m.get('utc_start') is not None:
            self.utc_start = m.get('utc_start')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        return self


class LoadBalancer(TeaModel):
    def __init__(
        self,
        address_type: str = None,
        backend_servers: List[BackendServer] = None,
        domain: str = None,
        listeners: List[Listener] = None,
        name: str = None,
        provider: str = None,
        resource_id: str = None,
        resource_pool_id: str = None,
        vip: str = None,
    ):
        # 地址类型。INTRANET/INTERNET/OFFICE
        self.address_type = address_type
        # 后端服务器列表。
        self.backend_servers = backend_servers
        # 实例域名。
        self.domain = domain
        # 监听器列表。
        self.listeners = listeners
        # 实例名称。
        self.name = name
        # 类型。SLB/ALB。
        self.provider = provider
        # 实例id。
        self.resource_id = resource_id
        # 资源池id。
        self.resource_pool_id = resource_pool_id
        # vip地址。
        self.vip = vip

    def validate(self):
        if self.backend_servers:
            for k in self.backend_servers:
                if k:
                    k.validate()
        if self.listeners:
            for k in self.listeners:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.address_type is not None:
            result['address_type'] = self.address_type
        result['backend_servers'] = []
        if self.backend_servers is not None:
            for k in self.backend_servers:
                result['backend_servers'].append(k.to_map() if k else None)
        if self.domain is not None:
            result['domain'] = self.domain
        result['listeners'] = []
        if self.listeners is not None:
            for k in self.listeners:
                result['listeners'].append(k.to_map() if k else None)
        if self.name is not None:
            result['name'] = self.name
        if self.provider is not None:
            result['provider'] = self.provider
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.resource_pool_id is not None:
            result['resource_pool_id'] = self.resource_pool_id
        if self.vip is not None:
            result['vip'] = self.vip
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address_type') is not None:
            self.address_type = m.get('address_type')
        self.backend_servers = []
        if m.get('backend_servers') is not None:
            for k in m.get('backend_servers'):
                temp_model = BackendServer()
                self.backend_servers.append(temp_model.from_map(k))
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        self.listeners = []
        if m.get('listeners') is not None:
            for k in m.get('listeners'):
                temp_model = Listener()
                self.listeners.append(temp_model.from_map(k))
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('resource_pool_id') is not None:
            self.resource_pool_id = m.get('resource_pool_id')
        if m.get('vip') is not None:
            self.vip = m.get('vip')
        return self


class SolutionInstance(TeaModel):
    def __init__(
        self,
        solution_id: str = None,
        env_id: str = None,
        name: str = None,
        status: str = None,
    ):
        # 解决方案id
        self.solution_id = solution_id
        # 环境ID
        self.env_id = env_id
        # 解决方案的名字
        self.name = name
        # 解决方案的状态
        self.status = status

    def validate(self):
        self.validate_required(self.solution_id, 'solution_id')
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.status, 'status')

    def to_map(self):
        result = dict()
        if self.solution_id is not None:
            result['solution_id'] = self.solution_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.name is not None:
            result['name'] = self.name
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('solution_id') is not None:
            self.solution_id = m.get('solution_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class UserAuth(TeaModel):
    def __init__(
        self,
        condition: str = None,
        condition_key: str = None,
        nick_name: str = None,
        primary: bool = None,
        real_name: str = None,
        role: str = None,
        source_id: str = None,
        status: str = None,
        user_id: str = None,
    ):
        # 授权条件,  Local的授权条件使用正则规则, 其中 # 为特殊分隔符, 在权限比较时需要移除该符号
        self.condition = condition
        # YUNYOU_LOCAL_AUTH_KEY
        self.condition_key = condition_key
        # 用户昵称, 如果是域内, 就是花名
        self.nick_name = nick_name
        # 是否为负责人
        self.primary = primary
        # 用户姓名
        self.real_name = real_name
        # PROCESS_ENGINEER: 全局运维工程师
        # PROD_PROCESS_ENGINEER: 产品运维工程师
        # DELIVERY_ENGINEER: 交付工程师
        # ENV_MANAGER: 环境管理员
        # LOCAL_OBSERVER: 观察者
        # AKE_PROCESS_ENGINEER: AKE运维工程师
        self.role = role
        # ID来源, 该ID用于Global和Local进行信息同步使用, 因此该值就是域账号
        self.source_id = source_id
        # 授权状态,
        # WAIT_REGIST: 等待用户注册
        # ACTIVE: 授权已经生效
        # DELETED: 授权已经删除
        self.status = status
        # 用户ID, 该值为IAM上的User.ID属性
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.condition, 'condition')
        self.validate_required(self.condition_key, 'condition_key')
        self.validate_required(self.primary, 'primary')
        self.validate_required(self.real_name, 'real_name')
        self.validate_required(self.role, 'role')
        self.validate_required(self.status, 'status')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.condition is not None:
            result['condition'] = self.condition
        if self.condition_key is not None:
            result['condition_key'] = self.condition_key
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        if self.primary is not None:
            result['primary'] = self.primary
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.role is not None:
            result['role'] = self.role
        if self.source_id is not None:
            result['source_id'] = self.source_id
        if self.status is not None:
            result['status'] = self.status
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('condition') is not None:
            self.condition = m.get('condition')
        if m.get('condition_key') is not None:
            self.condition_key = m.get('condition_key')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
        if m.get('primary') is not None:
            self.primary = m.get('primary')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('source_id') is not None:
            self.source_id = m.get('source_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class ClusterInfo(TeaModel):
    def __init__(
        self,
        prod_infos: List[ProdInfo] = None,
    ):
        # 产品信息
        self.prod_infos = prod_infos

    def validate(self):
        self.validate_required(self.prod_infos, 'prod_infos')
        if self.prod_infos:
            for k in self.prod_infos:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['prod_infos'] = []
        if self.prod_infos is not None:
            for k in self.prod_infos:
                result['prod_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.prod_infos = []
        if m.get('prod_infos') is not None:
            for k in m.get('prod_infos'):
                temp_model = ProdInfo()
                self.prod_infos.append(temp_model.from_map(k))
        return self


class AutoTestProduct(TeaModel):
    def __init__(
        self,
        deploy_unit: str = None,
        prod_code: str = None,
        app_param_data: List[AppParamData] = None,
    ):
        # 部署单元id
        self.deploy_unit = deploy_unit
        # 产品码
        self.prod_code = prod_code
        # 应用启动参数数据
        self.app_param_data = app_param_data

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        if self.app_param_data:
            for k in self.app_param_data:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.deploy_unit is not None:
            result['deploy_unit'] = self.deploy_unit
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        result['app_param_data'] = []
        if self.app_param_data is not None:
            for k in self.app_param_data:
                result['app_param_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('deploy_unit') is not None:
            self.deploy_unit = m.get('deploy_unit')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        self.app_param_data = []
        if m.get('app_param_data') is not None:
            for k in m.get('app_param_data'):
                temp_model = AppParamData()
                self.app_param_data.append(temp_model.from_map(k))
        return self


class CreateAppopsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_service_ids: List[str] = None,
        container_ids: List[str] = None,
        env_id: str = None,
        ops_action: str = None,
        ops_dimension: str = None,
        cell_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 执行运维操作的目标应用列表。
        self.app_service_ids = app_service_ids
        # 执行运维操作的目标容器列表。当ops_dimension为CONTAINER时，该参数必填。
        self.container_ids = container_ids
        # 目标环境唯一标识。
        self.env_id = env_id
        # 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启，RECOVERY_RESTART：容灾重启，DISABLE_SLB_TRAFFIC:应用摘流，ENABLE_SLB_TRAFFIC:应用挂流。
        self.ops_action = ops_action
        # 应用运维维度。两种取值：APP_SERVICE、CONTAINER。
        self.ops_dimension = ops_dimension
        # 要执行运维操作的应用服务实例所在的单元。
        self.cell_id = cell_id

    def validate(self):
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.ops_action, 'ops_action')
        self.validate_required(self.ops_dimension, 'ops_dimension')
        self.validate_required(self.cell_id, 'cell_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_service_ids is not None:
            result['app_service_ids'] = self.app_service_ids
        if self.container_ids is not None:
            result['container_ids'] = self.container_ids
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.ops_action is not None:
            result['ops_action'] = self.ops_action
        if self.ops_dimension is not None:
            result['ops_dimension'] = self.ops_dimension
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_service_ids') is not None:
            self.app_service_ids = m.get('app_service_ids')
        if m.get('container_ids') is not None:
            self.container_ids = m.get('container_ids')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('ops_action') is not None:
            self.ops_action = m.get('ops_action')
        if m.get('ops_dimension') is not None:
            self.ops_dimension = m.get('ops_dimension')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        return self


class CreateAppopsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 运维单id。
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class GetAppopsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ops_plan_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 运维单id。
        self.ops_plan_id = ops_plan_id

    def validate(self):
        self.validate_required(self.ops_plan_id, 'ops_plan_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class GetAppopsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        failed_nodes: List[NodeExecutionLog] = None,
        log: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 执行失败的节点
        self.failed_nodes = failed_nodes
        # 运维单执行日志。
        self.log = log
        # 运维单状态。取值列表：UNINITIALIZED:待初始化；ININTIALIZING:初始化中；INITIALIZED:初始化完成；EXECUTING:执行中；SUCCEEDED：执行成功；FAILED：执行失败；其他待补充。
        self.status = status

    def validate(self):
        if self.failed_nodes:
            for k in self.failed_nodes:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['failed_nodes'] = []
        if self.failed_nodes is not None:
            for k in self.failed_nodes:
                result['failed_nodes'].append(k.to_map() if k else None)
        if self.log is not None:
            result['log'] = self.log
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
        self.failed_nodes = []
        if m.get('failed_nodes') is not None:
            for k in m.get('failed_nodes'):
                temp_model = NodeExecutionLog()
                self.failed_nodes.append(temp_model.from_map(k))
        if m.get('log') is not None:
            self.log = m.get('log')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class RetryAppopsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ops_plan_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 运维单id。
        self.ops_plan_id = ops_plan_id

    def validate(self):
        self.validate_required(self.ops_plan_id, 'ops_plan_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class RetryAppopsResponse(TeaModel):
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


class CancelAppopsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ops_plan_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 运维单id。
        self.ops_plan_id = ops_plan_id

    def validate(self):
        self.validate_required(self.ops_plan_id, 'ops_plan_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class CancelAppopsResponse(TeaModel):
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


class ScaleProdinstanceAppserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_service_id: str = None,
        target_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用服务实例唯一标识。
        self.app_service_id = app_service_id
        # 集群容器目标数量。如果target_num>当前集群num，则扩容target_num-num个容器；如果target_num<当前集群num，则随机缩容target_num-num个容器。
        self.target_num = target_num

    def validate(self):
        self.validate_required(self.app_service_id, 'app_service_id')
        self.validate_required(self.target_num, 'target_num')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_service_id is not None:
            result['app_service_id'] = self.app_service_id
        if self.target_num is not None:
            result['target_num'] = self.target_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_service_id') is not None:
            self.app_service_id = m.get('app_service_id')
        if m.get('target_num') is not None:
            self.target_num = m.get('target_num')
        return self


class ScaleProdinstanceAppserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 运维单id。
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class ListEnvRequest(TeaModel):
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


class ListEnvResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        envs: List[Env] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 环境列表。
        self.envs = envs

    def validate(self):
        if self.envs:
            for k in self.envs:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['envs'] = []
        if self.envs is not None:
            for k in self.envs:
                result['envs'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.envs = []
        if m.get('envs') is not None:
            for k in m.get('envs'):
                temp_model = Env()
                self.envs.append(temp_model.from_map(k))
        return self


class GetProdinstanceAppserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_service_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用服务实例id。
        self.app_service_id = app_service_id

    def validate(self):
        self.validate_required(self.app_service_id, 'app_service_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_service_id is not None:
            result['app_service_id'] = self.app_service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_service_id') is not None:
            self.app_service_id = m.get('app_service_id')
        return self


class GetProdinstanceAppserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_name: str = None,
        app_version: str = None,
        cell_id: str = None,
        containers: List[Container] = None,
        deploy_unit: str = None,
        deploy_zone: str = None,
        env_id: str = None,
        load_balancers: List[LoadBalancer] = None,
        product_code: str = None,
        schemas: List[Schema] = None,
        id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 应用名。
        self.app_name = app_name
        # 应用版本。
        self.app_version = app_version
        # 单元ID
        self.cell_id = cell_id
        # 容器列表。
        self.containers = containers
        # 部署单元。
        self.deploy_unit = deploy_unit
        # 部署域。
        self.deploy_zone = deploy_zone
        # 环境唯一标识。
        self.env_id = env_id
        # 负载均衡列表。
        self.load_balancers = load_balancers
        # 产品码。
        self.product_code = product_code
        # 数据库列表。
        self.schemas = schemas
        # app service id，该openapi 的入参
        self.id = id

    def validate(self):
        if self.containers:
            for k in self.containers:
                if k:
                    k.validate()
        if self.load_balancers:
            for k in self.load_balancers:
                if k:
                    k.validate()
        if self.schemas:
            for k in self.schemas:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.app_version is not None:
            result['app_version'] = self.app_version
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        result['containers'] = []
        if self.containers is not None:
            for k in self.containers:
                result['containers'].append(k.to_map() if k else None)
        if self.deploy_unit is not None:
            result['deploy_unit'] = self.deploy_unit
        if self.deploy_zone is not None:
            result['deploy_zone'] = self.deploy_zone
        if self.env_id is not None:
            result['env_id'] = self.env_id
        result['load_balancers'] = []
        if self.load_balancers is not None:
            for k in self.load_balancers:
                result['load_balancers'].append(k.to_map() if k else None)
        if self.product_code is not None:
            result['product_code'] = self.product_code
        result['schemas'] = []
        if self.schemas is not None:
            for k in self.schemas:
                result['schemas'].append(k.to_map() if k else None)
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('app_version') is not None:
            self.app_version = m.get('app_version')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        self.containers = []
        if m.get('containers') is not None:
            for k in m.get('containers'):
                temp_model = Container()
                self.containers.append(temp_model.from_map(k))
        if m.get('deploy_unit') is not None:
            self.deploy_unit = m.get('deploy_unit')
        if m.get('deploy_zone') is not None:
            self.deploy_zone = m.get('deploy_zone')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        self.load_balancers = []
        if m.get('load_balancers') is not None:
            for k in m.get('load_balancers'):
                temp_model = LoadBalancer()
                self.load_balancers.append(temp_model.from_map(k))
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        self.schemas = []
        if m.get('schemas') is not None:
            for k in m.get('schemas'):
                temp_model = Schema()
                self.schemas.append(temp_model.from_map(k))
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class QueryProdinstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cell_id: str = None,
        env_id: str = None,
        page_num: int = None,
        page_size: int = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 单元ID
        self.cell_id = cell_id
        # 环境唯一标识。
        self.env_id = env_id
        # 当前页码。
        self.page_num = page_num
        # 分页大小。默认值为10，最大值100。
        self.page_size = page_size
        # 产品码。
        self.product_code = product_code

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class QueryProdinstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        product_instances: List[ProductInstance] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页码。
        self.page_num = page_num
        # 分页大小。
        self.page_size = page_size
        # 产品实例列表。
        self.product_instances = product_instances
        # 总数。
        self.total_count = total_count

    def validate(self):
        if self.product_instances:
            for k in self.product_instances:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['product_instances'] = []
        if self.product_instances is not None:
            for k in self.product_instances:
                result['product_instances'].append(k.to_map() if k else None)
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
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.product_instances = []
        if m.get('product_instances') is not None:
            for k in m.get('product_instances'):
                temp_model = ProductInstance()
                self.product_instances.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class UninstallProdinstanceAppserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_service_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用服务实例id。
        self.app_service_id = app_service_id

    def validate(self):
        self.validate_required(self.app_service_id, 'app_service_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_service_id is not None:
            result['app_service_id'] = self.app_service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_service_id') is not None:
            self.app_service_id = m.get('app_service_id')
        return self


class UninstallProdinstanceAppserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 运维单id。
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class CreateProdinstanceDeployunitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
        product_code: str = None,
        unit_id: str = None,
        unit_name: str = None,
        cell_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境标识
        self.env_id = env_id
        # 云游内产品码
        self.product_code = product_code
        # 执行部署单元实例id
        self.unit_id = unit_id
        # 部署单元名称
        self.unit_name = unit_name
        # 单元ID
        self.cell_id = cell_id

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.unit_id, 'unit_id')
        self.validate_required(self.unit_name, 'unit_name')
        self.validate_required(self.cell_id, 'cell_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.unit_id is not None:
            result['unit_id'] = self.unit_id
        if self.unit_name is not None:
            result['unit_name'] = self.unit_name
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('unit_id') is not None:
            self.unit_id = m.get('unit_id')
        if m.get('unit_name') is not None:
            self.unit_name = m.get('unit_name')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        return self


class CreateProdinstanceDeployunitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布单ID
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class QueryUnitinstanceCreationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ops_plan_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发布单ID
        self.ops_plan_id = ops_plan_id

    def validate(self):
        self.validate_required(self.ops_plan_id, 'ops_plan_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class QueryUnitinstanceCreationResponse(TeaModel):
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
        # 发布单状态
        self.status = status

    def validate(self):
        pass

    def to_map(self):
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


class GetUnitDetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
        product_code: str = None,
        unit_instance_identity: str = None,
        cell_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境标识
        self.env_id = env_id
        # 产品码
        self.product_code = product_code
        # 单元实例标识
        self.unit_instance_identity = unit_instance_identity
        # 单元ID
        self.cell_id = cell_id

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.unit_instance_identity, 'unit_instance_identity')
        self.validate_required(self.cell_id, 'cell_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.unit_instance_identity is not None:
            result['unit_instance_identity'] = self.unit_instance_identity
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('unit_instance_identity') is not None:
            self.unit_instance_identity = m.get('unit_instance_identity')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        return self


class GetUnitDetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        resources: List[UnitResource] = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 单元内资源列表
        self.resources = resources
        # 单元状态
        self.status = status

    def validate(self):
        if self.resources:
            for k in self.resources:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['resources'] = []
        if self.resources is not None:
            for k in self.resources:
                result['resources'].append(k.to_map() if k else None)
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
        self.resources = []
        if m.get('resources') is not None:
            for k in m.get('resources'):
                temp_model = UnitResource()
                self.resources.append(temp_model.from_map(k))
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryProdinstanceAppserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        cell_id: str = None,
        deploy_unit: str = None,
        deploy_zone: str = None,
        env_id: str = None,
        page_num: int = None,
        page_size: int = None,
        product_code: str = None,
        product_group: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名，当前版本应用名不是全局唯一的，请结合产品码一起查询。
        self.app_name = app_name
        # 单元ID
        self.cell_id = cell_id
        # 部署单元。
        self.deploy_unit = deploy_unit
        # 部署域。当前版本暂不支持。
        self.deploy_zone = deploy_zone
        # 环境唯一标识。
        self.env_id = env_id
        # 当前页码，默认为1。
        self.page_num = page_num
        # 分页大小，默认10，最大100。
        self.page_size = page_size
        # 产品码。
        self.product_code = product_code
        # 产品分组。如果入参设置了产品码，则默认忽略产品分组。
        self.product_group = product_group

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        if self.deploy_unit is not None:
            result['deploy_unit'] = self.deploy_unit
        if self.deploy_zone is not None:
            result['deploy_zone'] = self.deploy_zone
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_group is not None:
            result['product_group'] = self.product_group
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        if m.get('deploy_unit') is not None:
            self.deploy_unit = m.get('deploy_unit')
        if m.get('deploy_zone') is not None:
            self.deploy_zone = m.get('deploy_zone')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_group') is not None:
            self.product_group = m.get('product_group')
        return self


class QueryProdinstanceAppserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_services: List[AppService] = None,
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
        # 应用服务实例列表。
        self.app_services = app_services
        # 当前页码。
        self.page_num = page_num
        # 分页大小。
        self.page_size = page_size
        # 服务实例总数。
        self.total_count = total_count

    def validate(self):
        if self.app_services:
            for k in self.app_services:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['app_services'] = []
        if self.app_services is not None:
            for k in self.app_services:
                result['app_services'].append(k.to_map() if k else None)
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
        self.app_services = []
        if m.get('app_services') is not None:
            for k in m.get('app_services'):
                temp_model = AppService()
                self.app_services.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class GetProdinstanceDeployunitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cell_id: str = None,
        env_id: str = None,
        product_code: str = None,
        unit_id: str = None,
        unit_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 单元ID
        self.cell_id = cell_id
        # 环境唯一标识
        self.env_id = env_id
        # 产品码
        self.product_code = product_code
        # 用户传入部署单元标识
        self.unit_id = unit_id
        # 单元实例ID
        self.unit_instance_id = unit_instance_id

    def validate(self):
        self.validate_required(self.cell_id, 'cell_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.unit_instance_id, 'unit_instance_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.unit_id is not None:
            result['unit_id'] = self.unit_id
        if self.unit_instance_id is not None:
            result['unit_instance_id'] = self.unit_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('unit_id') is not None:
            self.unit_id = m.get('unit_id')
        if m.get('unit_instance_id') is not None:
            self.unit_instance_id = m.get('unit_instance_id')
        return self


class GetProdinstanceDeployunitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_services: List[AppServiceInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # app实例列表
        self.app_services = app_services

    def validate(self):
        if self.app_services:
            for k in self.app_services:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['app_services'] = []
        if self.app_services is not None:
            for k in self.app_services:
                result['app_services'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.app_services = []
        if m.get('app_services') is not None:
            for k in m.get('app_services'):
                temp_model = AppServiceInfo()
                self.app_services.append(temp_model.from_map(k))
        return self


class ListProdinstanceDeployunitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
        product_code: str = None,
        cell_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境唯一标识。
        self.env_id = env_id
        # 产品码。
        self.product_code = product_code
        # 单元ID
        self.cell_id = cell_id

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.cell_id, 'cell_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        return self


class ListProdinstanceDeployunitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        deploy_units: List[DeployUnit] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 部署单元列表。
        self.deploy_units = deploy_units

    def validate(self):
        if self.deploy_units:
            for k in self.deploy_units:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['deploy_units'] = []
        if self.deploy_units is not None:
            for k in self.deploy_units:
                result['deploy_units'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.deploy_units = []
        if m.get('deploy_units') is not None:
            for k in m.get('deploy_units'):
                temp_model = DeployUnit()
                self.deploy_units.append(temp_model.from_map(k))
        return self


class ScaleoutProdinstanceAppserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_service_id: str = None,
        target_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用服务实例唯一标识。
        self.app_service_id = app_service_id
        # 集群容器目标数量。target_num需要大于当前集群容器数量，扩容（target_num-当前集群容器数量）个容器。
        self.target_num = target_num

    def validate(self):
        self.validate_required(self.app_service_id, 'app_service_id')
        self.validate_required(self.target_num, 'target_num')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_service_id is not None:
            result['app_service_id'] = self.app_service_id
        if self.target_num is not None:
            result['target_num'] = self.target_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_service_id') is not None:
            self.app_service_id = m.get('app_service_id')
        if m.get('target_num') is not None:
            self.target_num = m.get('target_num')
        return self


class ScaleoutProdinstanceAppserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 运维单id。
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class QueryAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        condition_prefix: str = None,
        statuses: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 条件前缀, 一般传入环境ID
        self.condition_prefix = condition_prefix
        # 授权状态
        self.statuses = statuses

    def validate(self):
        self.validate_required(self.statuses, 'statuses')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.condition_prefix is not None:
            result['condition_prefix'] = self.condition_prefix
        if self.statuses is not None:
            result['statuses'] = self.statuses
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('condition_prefix') is not None:
            self.condition_prefix = m.get('condition_prefix')
        if m.get('statuses') is not None:
            self.statuses = m.get('statuses')
        return self


class QueryAuthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[UserAuth] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户授权
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
                temp_model = UserAuth()
                self.data.append(temp_model.from_map(k))
        return self


class ImportAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        condition: str = None,
        condition_key: str = None,
        deleted: bool = None,
        md_5: str = None,
        nick_name: str = None,
        primary: bool = None,
        real_name: str = None,
        role: str = None,
        source_id: str = None,
        work_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权的条件
        self.condition = condition
        # 授权的KEY, 目前Local只有YUNYOU_LOCAL_AUTH_KEY
        self.condition_key = condition_key
        # 是否被删除授权
        self.deleted = deleted
        # 授权的MD5
        self.md_5 = md_5
        # 昵称
        self.nick_name = nick_name
        # 是否为负责人
        self.primary = primary
        # 用户真名
        self.real_name = real_name
        # 角色
        self.role = role
        # 用户的域账号
        self.source_id = source_id
        # 工号
        self.work_no = work_no

    def validate(self):
        self.validate_required(self.condition, 'condition')
        self.validate_required(self.condition_key, 'condition_key')
        self.validate_required(self.deleted, 'deleted')
        self.validate_required(self.md_5, 'md_5')
        self.validate_required(self.primary, 'primary')
        self.validate_required(self.real_name, 'real_name')
        self.validate_required(self.role, 'role')
        self.validate_required(self.source_id, 'source_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.condition is not None:
            result['condition'] = self.condition
        if self.condition_key is not None:
            result['condition_key'] = self.condition_key
        if self.deleted is not None:
            result['deleted'] = self.deleted
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        if self.primary is not None:
            result['primary'] = self.primary
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.role is not None:
            result['role'] = self.role
        if self.source_id is not None:
            result['source_id'] = self.source_id
        if self.work_no is not None:
            result['work_no'] = self.work_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('condition') is not None:
            self.condition = m.get('condition')
        if m.get('condition_key') is not None:
            self.condition_key = m.get('condition_key')
        if m.get('deleted') is not None:
            self.deleted = m.get('deleted')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
        if m.get('primary') is not None:
            self.primary = m.get('primary')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('source_id') is not None:
            self.source_id = m.get('source_id')
        if m.get('work_no') is not None:
            self.work_no = m.get('work_no')
        return self


class ImportAuthResponse(TeaModel):
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


class GetSystemRequest(TeaModel):
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


class GetSystemResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: System = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回数据
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = System()
            self.data = temp_model.from_map(m['data'])
        return self


class ScaleinProdinstanceAppserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_service_id: str = None,
        container_ids: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用服务实例唯一标识。
        self.app_service_id = app_service_id
        # 执行运维操作的目标容器列表。
        self.container_ids = container_ids

    def validate(self):
        self.validate_required(self.app_service_id, 'app_service_id')
        self.validate_required(self.container_ids, 'container_ids')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_service_id is not None:
            result['app_service_id'] = self.app_service_id
        if self.container_ids is not None:
            result['container_ids'] = self.container_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_service_id') is not None:
            self.app_service_id = m.get('app_service_id')
        if m.get('container_ids') is not None:
            self.container_ids = m.get('container_ids')
        return self


class ScaleinProdinstanceAppserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 运维单id。
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class AllProdinstanceAppserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cell_id: str = None,
        env_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 单元ID
        self.cell_id = cell_id
        # 环境唯一标识。
        self.env_id = env_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        return self


class AllProdinstanceAppserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_service_infos: List[AppServiceInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 应用服务实例详情列表。
        self.app_service_infos = app_service_infos

    def validate(self):
        if self.app_service_infos:
            for k in self.app_service_infos:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['app_service_infos'] = []
        if self.app_service_infos is not None:
            for k in self.app_service_infos:
                result['app_service_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.app_service_infos = []
        if m.get('app_service_infos') is not None:
            for k in m.get('app_service_infos'):
                temp_model = AppServiceInfo()
                self.app_service_infos.append(temp_model.from_map(k))
        return self


class CreateAutotestopsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
        name: str = None,
        products: List[AutoTestProduct] = None,
        cell_id: str = None,
        auto_test_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境id
        self.env_id = env_id
        # 测试单名字
        self.name = name
        # 需要测试的产品
        self.products = products
        # 单元的id
        self.cell_id = cell_id
        # 如果未设置，默认返回NORMAL_JOB，NORMAL_JOB：通用一次任务；HAS_JOB：巡检一次任务
        # 
        # 
        self.auto_test_type = auto_test_type

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.products, 'products')
        if self.products:
            for k in self.products:
                if k:
                    k.validate()
        self.validate_required(self.cell_id, 'cell_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.name is not None:
            result['name'] = self.name
        result['products'] = []
        if self.products is not None:
            for k in self.products:
                result['products'].append(k.to_map() if k else None)
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        if self.auto_test_type is not None:
            result['auto_test_type'] = self.auto_test_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        self.products = []
        if m.get('products') is not None:
            for k in m.get('products'):
                temp_model = AutoTestProduct()
                self.products.append(temp_model.from_map(k))
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        if m.get('auto_test_type') is not None:
            self.auto_test_type = m.get('auto_test_type')
        return self


class CreateAutotestopsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 测试单的id
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class GetAutotestopsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ops_plan_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 测试单id
        self.ops_plan_id = ops_plan_id

    def validate(self):
        self.validate_required(self.ops_plan_id, 'ops_plan_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class GetAutotestopsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        env_id: str = None,
        name: str = None,
        ops_plan_id: str = None,
        prod_test_result: List[AutoTestProdResult] = None,
        status: str = None,
        utc_create: str = None,
        utc_end: str = None,
        utc_modified: str = None,
        utc_start: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 所属环境id
        self.env_id = env_id
        # 测试单名字
        self.name = name
        # 测试单的id
        self.ops_plan_id = ops_plan_id
        # 产品测试结果
        self.prod_test_result = prod_test_result
        # 当前状态
        self.status = status
        # 测试单创建时间
        self.utc_create = utc_create
        # 测试单结束时间
        self.utc_end = utc_end
        # 测试单修改时间
        self.utc_modified = utc_modified
        # 测试单开始时间
        self.utc_start = utc_start

    def validate(self):
        if self.prod_test_result:
            for k in self.prod_test_result:
                if k:
                    k.validate()
        if self.utc_create is not None:
            self.validate_pattern(self.utc_create, 'utc_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.utc_end is not None:
            self.validate_pattern(self.utc_end, 'utc_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.utc_modified is not None:
            self.validate_pattern(self.utc_modified, 'utc_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.utc_start is not None:
            self.validate_pattern(self.utc_start, 'utc_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.name is not None:
            result['name'] = self.name
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        result['prod_test_result'] = []
        if self.prod_test_result is not None:
            for k in self.prod_test_result:
                result['prod_test_result'].append(k.to_map() if k else None)
        if self.status is not None:
            result['status'] = self.status
        if self.utc_create is not None:
            result['utc_create'] = self.utc_create
        if self.utc_end is not None:
            result['utc_end'] = self.utc_end
        if self.utc_modified is not None:
            result['utc_modified'] = self.utc_modified
        if self.utc_start is not None:
            result['utc_start'] = self.utc_start
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        self.prod_test_result = []
        if m.get('prod_test_result') is not None:
            for k in m.get('prod_test_result'):
                temp_model = AutoTestProdResult()
                self.prod_test_result.append(temp_model.from_map(k))
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('utc_create') is not None:
            self.utc_create = m.get('utc_create')
        if m.get('utc_end') is not None:
            self.utc_end = m.get('utc_end')
        if m.get('utc_modified') is not None:
            self.utc_modified = m.get('utc_modified')
        if m.get('utc_start') is not None:
            self.utc_start = m.get('utc_start')
        return self


class ExportBaselineRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
        cell_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境id
        self.env_id = env_id
        # 单元id
        # 当cell_id为null时，回流资源池等公共信息。
        # 当cell_id不为null时，回流单元内的prod instance
        self.cell_id = cell_id

    def validate(self):
        self.validate_required(self.env_id, 'env_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        return self


class ExportBaselineResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        datas: List[BoxData] = None,
        type: str = None,
        version: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 回流数据箱
        self.datas = datas
        # 基线导出固定为BACK_FLOW
        self.type = type
        # 回流数据版本
        self.version = version

    def validate(self):
        if self.datas:
            for k in self.datas:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['datas'] = []
        if self.datas is not None:
            for k in self.datas:
                result['datas'].append(k.to_map() if k else None)
        if self.type is not None:
            result['type'] = self.type
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.datas = []
        if m.get('datas') is not None:
            for k in m.get('datas'):
                temp_model = BoxData()
                self.datas.append(temp_model.from_map(k))
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class CreateAppdeployRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apps: List[str] = None,
        cell_ids: List[str] = None,
        prod_code: str = None,
        solution_id: str = None,
        force: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用码
        self.apps = apps
        # 将要发布的单元id
        self.cell_ids = cell_ids
        # 产品码
        self.prod_code = prod_code
        # 解决方案id
        self.solution_id = solution_id
        # 是否强制重发
        self.force = force

    def validate(self):
        self.validate_required(self.apps, 'apps')
        self.validate_required(self.cell_ids, 'cell_ids')
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.solution_id, 'solution_id')
        self.validate_required(self.force, 'force')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apps is not None:
            result['apps'] = self.apps
        if self.cell_ids is not None:
            result['cell_ids'] = self.cell_ids
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.solution_id is not None:
            result['solution_id'] = self.solution_id
        if self.force is not None:
            result['force'] = self.force
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apps') is not None:
            self.apps = m.get('apps')
        if m.get('cell_ids') is not None:
            self.cell_ids = m.get('cell_ids')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('solution_id') is not None:
            self.solution_id = m.get('solution_id')
        if m.get('force') is not None:
            self.force = m.get('force')
        return self


class CreateAppdeployResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布单id
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class QuerySolutioninstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境id
        self.env_id = env_id
        # 当前页码，默认为1。
        self.page_num = page_num
        # 分页大小，默认10，最大100。
        # 
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.env_id, 'env_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
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
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QuerySolutioninstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        solution_instances: List[SolutionInstance] = None,
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
        # 解决方案
        self.solution_instances = solution_instances
        # 当前页码。
        # 
        self.page_num = page_num
        # 分页大小。
        # 
        self.page_size = page_size
        # 服务实例总数。
        # 
        self.total_count = total_count

    def validate(self):
        if self.solution_instances:
            for k in self.solution_instances:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['solution_instances'] = []
        if self.solution_instances is not None:
            for k in self.solution_instances:
                result['solution_instances'].append(k.to_map() if k else None)
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
        self.solution_instances = []
        if m.get('solution_instances') is not None:
            for k in m.get('solution_instances'):
                temp_model = SolutionInstance()
                self.solution_instances.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class ImportSolutioninstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        box_data: str = None,
        env_id: str = None,
        work_no: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
        self.box_data = box_data
        # 环境id
        self.env_id = env_id
        # 工号
        self.work_no = work_no
        # 花名
        self.name = name

    def validate(self):
        self.validate_required(self.box_data, 'box_data')
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.work_no, 'work_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.box_data is not None:
            result['box_data'] = self.box_data
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.work_no is not None:
            result['work_no'] = self.work_no
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('box_data') is not None:
            self.box_data = m.get('box_data')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('work_no') is not None:
            self.work_no = m.get('work_no')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class ImportSolutioninstanceResponse(TeaModel):
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


class CheckSolutioninstanceImportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
        box_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境id
        self.env_id = env_id
        # com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
        self.box_data = box_data

    def validate(self):
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.box_data, 'box_data')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.box_data is not None:
            result['box_data'] = self.box_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('box_data') is not None:
            self.box_data = m.get('box_data')
        return self


class CheckSolutioninstanceImportResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        enabled: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否可以导入此解决方案
        self.enabled = enabled

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.enabled is not None:
            result['enabled'] = self.enabled
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('enabled') is not None:
            self.enabled = m.get('enabled')
        return self


class DescribeSolutioninstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        solution_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 解决方案id
        self.solution_id = solution_id

    def validate(self):
        self.validate_required(self.solution_id, 'solution_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.solution_id is not None:
            result['solution_id'] = self.solution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('solution_id') is not None:
            self.solution_id = m.get('solution_id')
        return self


class DescribeSolutioninstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        supported_actions: List[OpenAPI] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支持的api列表
        self.supported_actions = supported_actions

    def validate(self):
        if self.supported_actions:
            for k in self.supported_actions:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['supported_actions'] = []
        if self.supported_actions is not None:
            for k in self.supported_actions:
                result['supported_actions'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.supported_actions = []
        if m.get('supported_actions') is not None:
            for k in m.get('supported_actions'):
                temp_model = OpenAPI()
                self.supported_actions.append(temp_model.from_map(k))
        return self


class DeprecateSolutioninstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        solution_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 解决方案id
        self.solution_id = solution_id

    def validate(self):
        self.validate_required(self.solution_id, 'solution_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.solution_id is not None:
            result['solution_id'] = self.solution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('solution_id') is not None:
            self.solution_id = m.get('solution_id')
        return self


class DeprecateSolutioninstanceResponse(TeaModel):
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


class FinishSolutioninstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        solution_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 解决方案id
        self.solution_id = solution_id

    def validate(self):
        self.validate_required(self.solution_id, 'solution_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.solution_id is not None:
            result['solution_id'] = self.solution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('solution_id') is not None:
            self.solution_id = m.get('solution_id')
        return self


class FinishSolutioninstanceResponse(TeaModel):
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


class ReopenSolutioninstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        solution_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 解决方案id
        self.solution_id = solution_id

    def validate(self):
        self.validate_required(self.solution_id, 'solution_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.solution_id is not None:
            result['solution_id'] = self.solution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('solution_id') is not None:
            self.solution_id = m.get('solution_id')
        return self


class ReopenSolutioninstanceResponse(TeaModel):
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


class ImportEnvMetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        box_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
        self.box_data = box_data

    def validate(self):
        self.validate_required(self.box_data, 'box_data')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.box_data is not None:
            result['box_data'] = self.box_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('box_data') is not None:
            self.box_data = m.get('box_data')
        return self


class ImportEnvMetaResponse(TeaModel):
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


class ImportProdMetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        box_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
        self.box_data = box_data

    def validate(self):
        self.validate_required(self.box_data, 'box_data')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.box_data is not None:
            result['box_data'] = self.box_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('box_data') is not None:
            self.box_data = m.get('box_data')
        return self


class ImportProdMetaResponse(TeaModel):
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


class UninstallProdinstanceDeployunitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cell_id: str = None,
        env_id: str = None,
        product_code: str = None,
        unit_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 单元ID
        self.cell_id = cell_id
        # 环境唯一标识
        self.env_id = env_id
        # 产品码
        self.product_code = product_code
        # 单元实例ID
        self.unit_instance_id = unit_instance_id

    def validate(self):
        self.validate_required(self.cell_id, 'cell_id')
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.unit_instance_id, 'unit_instance_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cell_id is not None:
            result['cell_id'] = self.cell_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.unit_instance_id is not None:
            result['unit_instance_id'] = self.unit_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cell_id') is not None:
            self.cell_id = m.get('cell_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('unit_instance_id') is not None:
            self.unit_instance_id = m.get('unit_instance_id')
        return self


class UninstallProdinstanceDeployunitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布单ID
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class QueryClusterPodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境id
        self.env_id = env_id

    def validate(self):
        self.validate_required(self.env_id, 'env_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        return self


class QueryClusterPodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cluster_info: ClusterInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 集群内部详情
        self.cluster_info = cluster_info

    def validate(self):
        if self.cluster_info:
            self.cluster_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.cluster_info is not None:
            result['cluster_info'] = self.cluster_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cluster_info') is not None:
            temp_model = ClusterInfo()
            self.cluster_info = temp_model.from_map(m['cluster_info'])
        return self


class QueryClusterKubeconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境变量
        self.env_id = env_id

    def validate(self):
        self.validate_required(self.env_id, 'env_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        return self


class QueryClusterKubeconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        kube_config: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # kube_config
        self.kube_config = kube_config

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.kube_config is not None:
            result['kube_config'] = self.kube_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('kube_config') is not None:
            self.kube_config = m.get('kube_config')
        return self


class EnableDynamicslbRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        envid: str = None,
        unitinstanceid: str = None,
        prodcode: str = None,
        appname: str = None,
        protocol: str = None,
        port: int = None,
        targetport: int = None,
        bandwidth: int = None,
        loadbalancername: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # envid
        self.envid = envid
        # 部署单元id
        self.unitinstanceid = unitinstanceid
        # prodCode
        self.prodcode = prodcode
        # appname
        self.appname = appname
        # protocol
        self.protocol = protocol
        # 端口号
        self.port = port
        # 目标端口号
        self.targetport = targetport
        # 区间[-1 , 5120]
        self.bandwidth = bandwidth
        # SLB名称
        self.loadbalancername = loadbalancername

    def validate(self):
        self.validate_required(self.envid, 'envid')
        self.validate_required(self.unitinstanceid, 'unitinstanceid')
        self.validate_required(self.prodcode, 'prodcode')
        self.validate_required(self.appname, 'appname')
        self.validate_required(self.protocol, 'protocol')
        self.validate_required(self.port, 'port')
        self.validate_required(self.targetport, 'targetport')
        self.validate_required(self.bandwidth, 'bandwidth')
        self.validate_required(self.loadbalancername, 'loadbalancername')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.envid is not None:
            result['envid'] = self.envid
        if self.unitinstanceid is not None:
            result['unitinstanceid'] = self.unitinstanceid
        if self.prodcode is not None:
            result['prodcode'] = self.prodcode
        if self.appname is not None:
            result['appname'] = self.appname
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.port is not None:
            result['port'] = self.port
        if self.targetport is not None:
            result['targetport'] = self.targetport
        if self.bandwidth is not None:
            result['bandwidth'] = self.bandwidth
        if self.loadbalancername is not None:
            result['loadbalancername'] = self.loadbalancername
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('envid') is not None:
            self.envid = m.get('envid')
        if m.get('unitinstanceid') is not None:
            self.unitinstanceid = m.get('unitinstanceid')
        if m.get('prodcode') is not None:
            self.prodcode = m.get('prodcode')
        if m.get('appname') is not None:
            self.appname = m.get('appname')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('port') is not None:
            self.port = m.get('port')
        if m.get('targetport') is not None:
            self.targetport = m.get('targetport')
        if m.get('bandwidth') is not None:
            self.bandwidth = m.get('bandwidth')
        if m.get('loadbalancername') is not None:
            self.loadbalancername = m.get('loadbalancername')
        return self


class EnableDynamicslbResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        publicslbip: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # slb创建结果
        self.success = success
        # 生成的slb公网地址
        self.publicslbip = publicslbip

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        if self.publicslbip is not None:
            result['publicslbip'] = self.publicslbip
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
        if m.get('publicslbip') is not None:
            self.publicslbip = m.get('publicslbip')
        return self


class DisableDynamicslbRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        envid: str = None,
        unitinstanceid: str = None,
        prodcode: str = None,
        appname: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # envid
        self.envid = envid
        # 部署单元id
        self.unitinstanceid = unitinstanceid
        # prodcode
        self.prodcode = prodcode
        # appname
        self.appname = appname

    def validate(self):
        self.validate_required(self.envid, 'envid')
        self.validate_required(self.unitinstanceid, 'unitinstanceid')
        self.validate_required(self.prodcode, 'prodcode')
        self.validate_required(self.appname, 'appname')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.envid is not None:
            result['envid'] = self.envid
        if self.unitinstanceid is not None:
            result['unitinstanceid'] = self.unitinstanceid
        if self.prodcode is not None:
            result['prodcode'] = self.prodcode
        if self.appname is not None:
            result['appname'] = self.appname
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('envid') is not None:
            self.envid = m.get('envid')
        if m.get('unitinstanceid') is not None:
            self.unitinstanceid = m.get('unitinstanceid')
        if m.get('prodcode') is not None:
            self.prodcode = m.get('prodcode')
        if m.get('appname') is not None:
            self.appname = m.get('appname')
        return self


class DisableDynamicslbResponse(TeaModel):
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


class ExecClusterDnsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
        prod_code: str = None,
        app_names: List[str] = None,
        ops_action: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境id
        self.env_id = env_id
        # 产品码
        self.prod_code = prod_code
        # 应用名列表
        self.app_names = app_names
        # dns域名的绑定/解绑
        self.ops_action = ops_action

    def validate(self):
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.app_names, 'app_names')
        self.validate_required(self.ops_action, 'ops_action')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.app_names is not None:
            result['app_names'] = self.app_names
        if self.ops_action is not None:
            result['ops_action'] = self.ops_action
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('app_names') is not None:
            self.app_names = m.get('app_names')
        if m.get('ops_action') is not None:
            self.ops_action = m.get('ops_action')
        return self


class ExecClusterDnsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布单id
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class OfflineClusterContainerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
        prod_code: str = None,
        app_name: str = None,
        pod_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境id
        self.env_id = env_id
        # 产品码
        self.prod_code = prod_code
        # 应用名
        self.app_name = app_name
        # pod名字
        self.pod_name = pod_name

    def validate(self):
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.pod_name, 'pod_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.pod_name is not None:
            result['pod_name'] = self.pod_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('pod_name') is not None:
            self.pod_name = m.get('pod_name')
        return self


class OfflineClusterContainerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布单id
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class OnlineClusterContainerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        env_id: str = None,
        prod_code: str = None,
        app_name: str = None,
        pod_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境id
        self.env_id = env_id
        # 产品码
        self.prod_code = prod_code
        # 应用名
        self.app_name = app_name
        # pod name
        self.pod_name = pod_name

    def validate(self):
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.pod_name, 'pod_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.pod_name is not None:
            result['pod_name'] = self.pod_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('pod_name') is not None:
            self.pod_name = m.get('pod_name')
        return self


class OnlineClusterContainerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plan_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布单id
        self.ops_plan_id = ops_plan_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.ops_plan_id is not None:
            result['ops_plan_id'] = self.ops_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ops_plan_id') is not None:
            self.ops_plan_id = m.get('ops_plan_id')
        return self


class QueryAppparamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        prod_code: str = None,
        app_name: str = None,
        env_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品code
        self.prod_code = prod_code
        # 应用名
        self.app_name = app_name
        # 环境id
        self.env_id = env_id

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.app_name, 'app_name')
        self.validate_required(self.env_id, 'env_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.env_id is not None:
            result['env_id'] = self.env_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        return self


class QueryAppparamResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        env_id: str = None,
        prod_code: str = None,
        app_name: str = None,
        app_params: List[ParamData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 环境id
        self.env_id = env_id
        # 产品码
        self.prod_code = prod_code
        # 应用名
        self.app_name = app_name
        # 启动参数的key-value列表
        self.app_params = app_params

    def validate(self):
        if self.app_params:
            for k in self.app_params:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.app_name is not None:
            result['app_name'] = self.app_name
        result['app_params'] = []
        if self.app_params is not None:
            for k in self.app_params:
                result['app_params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        self.app_params = []
        if m.get('app_params') is not None:
            for k in m.get('app_params'):
                temp_model = ParamData()
                self.app_params.append(temp_model.from_map(k))
        return self


class PagequerySolutionOpsplanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        solution_id: str = None,
        env_id: str = None,
        current_page: str = None,
        page_size: str = None,
        plan_type: str = None,
        ops_plan_status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 解决方案Id
        self.solution_id = solution_id
        # 环境Id
        self.env_id = env_id
        # 当前页
        self.current_page = current_page
        # 分页大小
        self.page_size = page_size
        # RELEASE
        self.plan_type = plan_type
        # FAILED
        self.ops_plan_status = ops_plan_status

    def validate(self):
        self.validate_required(self.solution_id, 'solution_id')
        self.validate_required(self.env_id, 'env_id')
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.plan_type, 'plan_type')
        self.validate_required(self.ops_plan_status, 'ops_plan_status')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.solution_id is not None:
            result['solution_id'] = self.solution_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.plan_type is not None:
            result['plan_type'] = self.plan_type
        if self.ops_plan_status is not None:
            result['ops_plan_status'] = self.ops_plan_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('solution_id') is not None:
            self.solution_id = m.get('solution_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('plan_type') is not None:
            self.plan_type = m.get('plan_type')
        if m.get('ops_plan_status') is not None:
            self.ops_plan_status = m.get('ops_plan_status')
        return self


class PagequerySolutionOpsplanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ops_plans: List[OpsPlan] = None,
        total_count: int = None,
        page_size: int = None,
        current_page: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发布单列表
        self.ops_plans = ops_plans
        # 总数
        self.total_count = total_count
        # 页大小
        self.page_size = page_size
        # 当前页
        self.current_page = current_page

    def validate(self):
        if self.ops_plans:
            for k in self.ops_plans:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['ops_plans'] = []
        if self.ops_plans is not None:
            for k in self.ops_plans:
                result['ops_plans'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current_page is not None:
            result['current_page'] = self.current_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.ops_plans = []
        if m.get('ops_plans') is not None:
            for k in m.get('ops_plans'):
                temp_model = OpsPlan()
                self.ops_plans.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        return self


class ConfirmSolutionPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        solution_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 解决方案Id
        self.solution_id = solution_id

    def validate(self):
        self.validate_required(self.solution_id, 'solution_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.solution_id is not None:
            result['solution_id'] = self.solution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('solution_id') is not None:
            self.solution_id = m.get('solution_id')
        return self


class ConfirmSolutionPlanResponse(TeaModel):
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


class QuerySolutionPreviewtaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        solution_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 解决方案id
        self.solution_id = solution_id

    def validate(self):
        self.validate_required(self.solution_id, 'solution_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.solution_id is not None:
            result['solution_id'] = self.solution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('solution_id') is not None:
            self.solution_id = m.get('solution_id')
        return self


class QuerySolutionPreviewtaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        prod_preview_tasks: List[ProdPreviewTasks] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 产品预览任务查询
        self.prod_preview_tasks = prod_preview_tasks

    def validate(self):
        if self.prod_preview_tasks:
            for k in self.prod_preview_tasks:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['prod_preview_tasks'] = []
        if self.prod_preview_tasks is not None:
            for k in self.prod_preview_tasks:
                result['prod_preview_tasks'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.prod_preview_tasks = []
        if m.get('prod_preview_tasks') is not None:
            for k in m.get('prod_preview_tasks'):
                temp_model = ProdPreviewTasks()
                self.prod_preview_tasks.append(temp_model.from_map(k))
        return self


