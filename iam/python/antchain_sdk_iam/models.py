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


class Condition(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        self.key = key
        self.value = value

    def validate(self):
        pass

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


class AliyunResource(TeaModel):
    def __init__(
        self,
        resource: str = None,
        resource_tenant: str = None,
    ):
        # resource_type/resource_id
        self.resource = resource
        # 资源所属的租户
        self.resource_tenant = resource_tenant

    def validate(self):
        self.validate_required(self.resource, 'resource')
        self.validate_required(self.resource_tenant, 'resource_tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.resource is not None:
            result['resource'] = self.resource
        if self.resource_tenant is not None:
            result['resource_tenant'] = self.resource_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('resource') is not None:
            self.resource = m.get('resource')
        if m.get('resource_tenant') is not None:
            self.resource_tenant = m.get('resource_tenant')
        return self


class AuthenticateEvent(TeaModel):
    def __init__(
        self,
        actions: List[str] = None,
        actor_id: str = None,
        conditions: List[Condition] = None,
        id: str = None,
    ):
        # 鉴权操作列表
        self.actions = actions
        # 鉴权对象ID
        self.actor_id = actor_id
        # 鉴权条件
        self.conditions = conditions
        # 唯一ID
        self.id = id

    def validate(self):
        self.validate_required(self.actions, 'actions')
        self.validate_required(self.actor_id, 'actor_id')
        if self.conditions:
            for k in self.conditions:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.actions is not None:
            result['actions'] = self.actions
        if self.actor_id is not None:
            result['actor_id'] = self.actor_id
        result['conditions'] = []
        if self.conditions is not None:
            for k in self.conditions:
                result['conditions'].append(k.to_map() if k else None)
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('actions') is not None:
            self.actions = m.get('actions')
        if m.get('actor_id') is not None:
            self.actor_id = m.get('actor_id')
        self.conditions = []
        if m.get('conditions') is not None:
            for k in m.get('conditions'):
                temp_model = Condition()
                self.conditions.append(temp_model.from_map(k))
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class OnexExtraInfo(TeaModel):
    def __init__(
        self,
        path: str = None,
        method: str = None,
    ):
        # Onex接口路径
        self.path = path
        # Onex接口的HTTP Method
        self.method = method

    def validate(self):
        self.validate_required(self.path, 'path')
        self.validate_required(self.method, 'method')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.path is not None:
            result['path'] = self.path
        if self.method is not None:
            result['method'] = self.method
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('path') is not None:
            self.path = m.get('path')
        if m.get('method') is not None:
            self.method = m.get('method')
        return self


class AliyunRamAuthContext(TeaModel):
    def __init__(
        self,
        action: str = None,
        conditions: List[Condition] = None,
        id: str = None,
        region_id: str = None,
        resources: List[AliyunResource] = None,
        service_name: str = None,
    ):
        # 操作名称
        self.action = action
        # 条件
        self.conditions = conditions
        # 唯一ID
        self.id = id
        # regionId
        self.region_id = region_id
        # 资源
        self.resources = resources
        # 服务名称
        self.service_name = service_name

    def validate(self):
        self.validate_required(self.action, 'action')
        if self.conditions:
            for k in self.conditions:
                if k:
                    k.validate()
        self.validate_required(self.region_id, 'region_id')
        self.validate_required(self.resources, 'resources')
        if self.resources:
            for k in self.resources:
                if k:
                    k.validate()
        self.validate_required(self.service_name, 'service_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action is not None:
            result['action'] = self.action
        result['conditions'] = []
        if self.conditions is not None:
            for k in self.conditions:
                result['conditions'].append(k.to_map() if k else None)
        if self.id is not None:
            result['id'] = self.id
        if self.region_id is not None:
            result['region_id'] = self.region_id
        result['resources'] = []
        if self.resources is not None:
            for k in self.resources:
                result['resources'].append(k.to_map() if k else None)
        if self.service_name is not None:
            result['service_name'] = self.service_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action') is not None:
            self.action = m.get('action')
        self.conditions = []
        if m.get('conditions') is not None:
            for k in m.get('conditions'):
                temp_model = Condition()
                self.conditions.append(temp_model.from_map(k))
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        self.resources = []
        if m.get('resources') is not None:
            for k in m.get('resources'):
                temp_model = AliyunResource()
                self.resources.append(temp_model.from_map(k))
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        return self


class ScopeEntity(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        self.key = key
        self.value = value

    def validate(self):
        pass

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


class AliyunPopRequestInfo(TeaModel):
    def __init__(
        self,
        access_key_id: str = None,
        ak_mfa_present: bool = None,
        ak_proxy: str = None,
        api_name: str = None,
        app_ip: str = None,
        caller_bid: str = None,
        caller_parent_id: str = None,
        caller_type: str = None,
        caller_uid: str = None,
        proxy_original_security_transport: bool = None,
        proxy_original_source_ip: str = None,
        proxy_trust_transport_info: bool = None,
        request_id: str = None,
        security_token: str = None,
        security_transport: bool = None,
        source_ip: str = None,
        sts_token_caller_bid: str = None,
        sts_token_caller_uid: str = None,
        sts_token_principal_id: str = None,
        sts_token_role_id: str = None,
        sts_token_user_id: str = None,
        version: str = None,
    ):
        # AccessKey
        self.access_key_id = access_key_id
        # 是否开启MFA
        self.ak_mfa_present = ak_mfa_present
        # Ak系统中记录的客户端代理信息，比如来源于Ecs控制台的请求取之就是EcsConsole
        self.ak_proxy = ak_proxy
        # API名称
        self.api_name = api_name
        # 调用者IP
        # 
        self.app_ip = app_ip
        # 调用者BID
        self.caller_bid = caller_bid
        # 调用者主账号ID
        self.caller_parent_id = caller_parent_id
        # 调用者类型，支持partner, customer, sub, AssumedRoleUser
        self.caller_type = caller_type
        # 调用者ID
        self.caller_uid = caller_uid
        # 用户原始请求是否使用https
        self.proxy_original_security_transport = proxy_original_security_transport
        # 用户原始IP
        # 
        self.proxy_original_source_ip = proxy_original_source_ip
        # 提交给网关的原始IP等信息是否可信
        self.proxy_trust_transport_info = proxy_trust_transport_info
        # request_id
        self.request_id = request_id
        # STS token
        self.security_token = security_token
        # security_transport
        self.security_transport = security_transport
        # 来源IP
        self.source_ip = source_ip
        # StsTokenAccountBID，创建子账号的主账号 的BID。使用StsToken调用POP时才有此参数
        self.sts_token_caller_bid = sts_token_caller_bid
        # STS token调用者ID
        self.sts_token_caller_uid = sts_token_caller_uid
        # 子账号id:sessioname。调用者阿里云principalId，使用StsToken调用POP时才有此参数
        self.sts_token_principal_id = sts_token_principal_id
        # 调用者阿里云roleId，使用StsToken调用POP时才有此参数
        # 
        self.sts_token_role_id = sts_token_role_id
        # STS token绑定用户ID
        self.sts_token_user_id = sts_token_user_id
        # 版本
        self.version = version

    def validate(self):
        self.validate_required(self.caller_type, 'caller_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_key_id is not None:
            result['access_key_id'] = self.access_key_id
        if self.ak_mfa_present is not None:
            result['ak_mfa_present'] = self.ak_mfa_present
        if self.ak_proxy is not None:
            result['ak_proxy'] = self.ak_proxy
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.app_ip is not None:
            result['app_ip'] = self.app_ip
        if self.caller_bid is not None:
            result['caller_bid'] = self.caller_bid
        if self.caller_parent_id is not None:
            result['caller_parent_id'] = self.caller_parent_id
        if self.caller_type is not None:
            result['caller_type'] = self.caller_type
        if self.caller_uid is not None:
            result['caller_uid'] = self.caller_uid
        if self.proxy_original_security_transport is not None:
            result['proxy_original_security_transport'] = self.proxy_original_security_transport
        if self.proxy_original_source_ip is not None:
            result['proxy_original_source_ip'] = self.proxy_original_source_ip
        if self.proxy_trust_transport_info is not None:
            result['proxy_trust_transport_info'] = self.proxy_trust_transport_info
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.security_token is not None:
            result['security_token'] = self.security_token
        if self.security_transport is not None:
            result['security_transport'] = self.security_transport
        if self.source_ip is not None:
            result['source_ip'] = self.source_ip
        if self.sts_token_caller_bid is not None:
            result['sts_token_caller_bid'] = self.sts_token_caller_bid
        if self.sts_token_caller_uid is not None:
            result['sts_token_caller_uid'] = self.sts_token_caller_uid
        if self.sts_token_principal_id is not None:
            result['sts_token_principal_id'] = self.sts_token_principal_id
        if self.sts_token_role_id is not None:
            result['sts_token_role_id'] = self.sts_token_role_id
        if self.sts_token_user_id is not None:
            result['sts_token_user_id'] = self.sts_token_user_id
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_key_id') is not None:
            self.access_key_id = m.get('access_key_id')
        if m.get('ak_mfa_present') is not None:
            self.ak_mfa_present = m.get('ak_mfa_present')
        if m.get('ak_proxy') is not None:
            self.ak_proxy = m.get('ak_proxy')
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('app_ip') is not None:
            self.app_ip = m.get('app_ip')
        if m.get('caller_bid') is not None:
            self.caller_bid = m.get('caller_bid')
        if m.get('caller_parent_id') is not None:
            self.caller_parent_id = m.get('caller_parent_id')
        if m.get('caller_type') is not None:
            self.caller_type = m.get('caller_type')
        if m.get('caller_uid') is not None:
            self.caller_uid = m.get('caller_uid')
        if m.get('proxy_original_security_transport') is not None:
            self.proxy_original_security_transport = m.get('proxy_original_security_transport')
        if m.get('proxy_original_source_ip') is not None:
            self.proxy_original_source_ip = m.get('proxy_original_source_ip')
        if m.get('proxy_trust_transport_info') is not None:
            self.proxy_trust_transport_info = m.get('proxy_trust_transport_info')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('security_token') is not None:
            self.security_token = m.get('security_token')
        if m.get('security_transport') is not None:
            self.security_transport = m.get('security_transport')
        if m.get('source_ip') is not None:
            self.source_ip = m.get('source_ip')
        if m.get('sts_token_caller_bid') is not None:
            self.sts_token_caller_bid = m.get('sts_token_caller_bid')
        if m.get('sts_token_caller_uid') is not None:
            self.sts_token_caller_uid = m.get('sts_token_caller_uid')
        if m.get('sts_token_principal_id') is not None:
            self.sts_token_principal_id = m.get('sts_token_principal_id')
        if m.get('sts_token_role_id') is not None:
            self.sts_token_role_id = m.get('sts_token_role_id')
        if m.get('sts_token_user_id') is not None:
            self.sts_token_user_id = m.get('sts_token_user_id')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class StsActorBinding(TeaModel):
    def __init__(
        self,
        actor_id: str = None,
        bind_id: str = None,
        bind_type: str = None,
    ):
        # 虚拟身份ID
        self.actor_id = actor_id
        # 受信对象ID
        self.bind_id = bind_id
        # 虚拟身份受信类型，可以为TENANT或者ALIYUN_SERVICE
        self.bind_type = bind_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.actor_id is not None:
            result['actor_id'] = self.actor_id
        if self.bind_id is not None:
            result['bind_id'] = self.bind_id
        if self.bind_type is not None:
            result['bind_type'] = self.bind_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('actor_id') is not None:
            self.actor_id = m.get('actor_id')
        if m.get('bind_id') is not None:
            self.bind_id = m.get('bind_id')
        if m.get('bind_type') is not None:
            self.bind_type = m.get('bind_type')
        return self


class Action(TeaModel):
    def __init__(
        self,
        description: str = None,
        id: str = None,
        name: str = None,
    ):
        # 操作点描述
        self.description = description
        # 操作点ID
        self.id = id
        # 操作点名称
        self.name = name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class OperationType(TeaModel):
    def __init__(
        self,
        description: str = None,
        display_name: str = None,
        enabled: str = None,
        name: str = None,
        product: str = None,
        source: str = None,
        onex_extra_info: OnexExtraInfo = None,
        resource_type: str = None,
        resource_exp: str = None,
    ):
        # 操作描述
        self.description = description
        # 展示名称
        self.display_name = display_name
        # 是否启用
        self.enabled = enabled
        # 操作名称
        self.name = name
        # 产品码
        self.product = product
        # 操作来源
        self.source = source
        # Onex接口额外信息
        self.onex_extra_info = onex_extra_info
        # 资源类型
        self.resource_type = resource_type
        # 资源表达式
        self.resource_exp = resource_exp

    def validate(self):
        self.validate_required(self.description, 'description')
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.enabled, 'enabled')
        self.validate_required(self.name, 'name')
        self.validate_required(self.product, 'product')
        self.validate_required(self.source, 'source')
        if self.onex_extra_info:
            self.onex_extra_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.description is not None:
            result['description'] = self.description
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.enabled is not None:
            result['enabled'] = self.enabled
        if self.name is not None:
            result['name'] = self.name
        if self.product is not None:
            result['product'] = self.product
        if self.source is not None:
            result['source'] = self.source
        if self.onex_extra_info is not None:
            result['onex_extra_info'] = self.onex_extra_info.to_map()
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        if self.resource_exp is not None:
            result['resource_exp'] = self.resource_exp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('enabled') is not None:
            self.enabled = m.get('enabled')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('product') is not None:
            self.product = m.get('product')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('onex_extra_info') is not None:
            temp_model = OnexExtraInfo()
            self.onex_extra_info = temp_model.from_map(m['onex_extra_info'])
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        if m.get('resource_exp') is not None:
            self.resource_exp = m.get('resource_exp')
        return self


class DepartmentUser(TeaModel):
    def __init__(
        self,
        department_code: str = None,
        user_id: str = None,
        type: str = None,
    ):
        # 部门唯一码
        self.department_code = department_code
        # 用户 id
        self.user_id = user_id
        # 部门成员类型，
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.department_code is not None:
            result['department_code'] = self.department_code
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('department_code') is not None:
            self.department_code = m.get('department_code')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class AliyunAuthenticateBatchEvent(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        ram_auth_contexts: List[AliyunRamAuthContext] = None,
        request_info: AliyunPopRequestInfo = None,
    ):
        # 金融云用户ID
        self.user_id = user_id
        # 阿里云鉴权列表
        self.ram_auth_contexts = ram_auth_contexts
        # BSB透传下来的阿里云信息
        self.request_info = request_info

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.ram_auth_contexts, 'ram_auth_contexts')
        if self.ram_auth_contexts:
            for k in self.ram_auth_contexts:
                if k:
                    k.validate()
        self.validate_required(self.request_info, 'request_info')
        if self.request_info:
            self.request_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        result['ram_auth_contexts'] = []
        if self.ram_auth_contexts is not None:
            for k in self.ram_auth_contexts:
                result['ram_auth_contexts'].append(k.to_map() if k else None)
        if self.request_info is not None:
            result['request_info'] = self.request_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        self.ram_auth_contexts = []
        if m.get('ram_auth_contexts') is not None:
            for k in m.get('ram_auth_contexts'):
                temp_model = AliyunRamAuthContext()
                self.ram_auth_contexts.append(temp_model.from_map(k))
        if m.get('request_info') is not None:
            temp_model = AliyunPopRequestInfo()
            self.request_info = temp_model.from_map(m['request_info'])
        return self


class Judgement(TeaModel):
    def __init__(
        self,
        id: str = None,
        pass_: bool = None,
        reason: str = None,
        solution: str = None,
    ):
        # 唯一ID
        self.id = id
        # 是否通过
        self.pass_ = pass_
        # 失败原因
        self.reason = reason
        # 解决方案
        self.solution = solution

    def validate(self):
        self.validate_required(self.pass_, 'pass_')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.pass_ is not None:
            result['pass'] = self.pass_
        if self.reason is not None:
            result['reason'] = self.reason
        if self.solution is not None:
            result['solution'] = self.solution
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('pass') is not None:
            self.pass_ = m.get('pass')
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        if m.get('solution') is not None:
            self.solution = m.get('solution')
        return self


class Role(TeaModel):
    def __init__(
        self,
        actions: List[Action] = None,
        create_time: str = None,
        description: str = None,
        id: str = None,
        name: str = None,
        tenant: str = None,
        type: str = None,
        update_time: str = None,
    ):
        # 操作点列表
        self.actions = actions
        # 创建时间，ISO8601格式
        self.create_time = create_time
        # 角色描述
        self.description = description
        # 角色ID
        self.id = id
        # 角色名称
        self.name = name
        # 角色归属租户
        self.tenant = tenant
        # 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
        self.type = type
        # 更新时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        if self.actions:
            for k in self.actions:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['actions'] = []
        if self.actions is not None:
            for k in self.actions:
                result['actions'].append(k.to_map() if k else None)
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.type is not None:
            result['type'] = self.type
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.actions = []
        if m.get('actions') is not None:
            for k in m.get('actions'):
                temp_model = Action()
                self.actions.append(temp_model.from_map(k))
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class AuthGroup(TeaModel):
    def __init__(
        self,
        creation_time: str = None,
        id: str = None,
        name: str = None,
        update_time: str = None,
    ):
        # 创建时间，ISO8601格式
        self.creation_time = creation_time
        # 授权组ID
        self.id = id
        # 授权组名称
        self.name = name
        # 更新时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.creation_time is not None:
            result['creation_time'] = self.creation_time
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('creation_time') is not None:
            self.creation_time = m.get('creation_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class AccessKey(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        id: str = None,
        secret: str = None,
        status: str = None,
        update_time: str = None,
    ):
        # AccessKey创建时间，ISO8601格式
        self.create_time = create_time
        # AccessKey唯一标识
        self.id = id
        # AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
        self.secret = secret
        # 状态
        self.status = status
        # AccessKey最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.secret is not None:
            result['secret'] = self.secret
        if self.status is not None:
            result['status'] = self.status
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('secret') is not None:
            self.secret = m.get('secret')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class StsActor(TeaModel):
    def __init__(
        self,
        bindings: List[StsActorBinding] = None,
        description: str = None,
        name: str = None,
        tenant: str = None,
    ):
        # 虚拟身份受信关系集合，通常只包含一个
        self.bindings = bindings
        # 针对虚拟身份的描述
        self.description = description
        # 虚拟身份名称，租户内唯一
        self.name = name
        # 虚拟身份所在租户
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.bindings, 'bindings')
        if self.bindings:
            for k in self.bindings:
                if k:
                    k.validate()
        self.validate_required(self.name, 'name')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['bindings'] = []
        if self.bindings is not None:
            for k in self.bindings:
                result['bindings'].append(k.to_map() if k else None)
        if self.description is not None:
            result['description'] = self.description
        if self.name is not None:
            result['name'] = self.name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.bindings = []
        if m.get('bindings') is not None:
            for k in m.get('bindings'):
                temp_model = StsActorBinding()
                self.bindings.append(temp_model.from_map(k))
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class AuthPolicy(TeaModel):
    def __init__(
        self,
        ability_id: str = None,
        ability_type: str = None,
        conditions: List[Condition] = None,
        create_time: str = None,
        description: str = None,
        id: str = None,
        name: str = None,
        scope_entities: List[ScopeEntity] = None,
        tenant: str = None,
        type: str = None,
        update_time: str = None,
    ):
        # 授权能力Id
        self.ability_id = ability_id
        # 授权能力类型（ROLE：角色，ACTION：操作）
        self.ability_type = ability_type
        # 授权条件
        self.conditions = conditions
        # 创建时间，ISO8601格式
        self.create_time = create_time
        # 权限策略描述
        self.description = description
        # 授权策略ID
        self.id = id
        # 授权策略名称
        self.name = name
        # 授权条件
        self.scope_entities = scope_entities
        # 授权策略归属租户
        self.tenant = tenant
        # 授权策略类型（CUSTOM：自定义授权策略）
        self.type = type
        # 更新时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        if self.conditions:
            for k in self.conditions:
                if k:
                    k.validate()
        if self.scope_entities:
            for k in self.scope_entities:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ability_id is not None:
            result['ability_id'] = self.ability_id
        if self.ability_type is not None:
            result['ability_type'] = self.ability_type
        result['conditions'] = []
        if self.conditions is not None:
            for k in self.conditions:
                result['conditions'].append(k.to_map() if k else None)
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        result['scope_entities'] = []
        if self.scope_entities is not None:
            for k in self.scope_entities:
                result['scope_entities'].append(k.to_map() if k else None)
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.type is not None:
            result['type'] = self.type
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ability_id') is not None:
            self.ability_id = m.get('ability_id')
        if m.get('ability_type') is not None:
            self.ability_type = m.get('ability_type')
        self.conditions = []
        if m.get('conditions') is not None:
            for k in m.get('conditions'):
                temp_model = Condition()
                self.conditions.append(temp_model.from_map(k))
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        self.scope_entities = []
        if m.get('scope_entities') is not None:
            for k in m.get('scope_entities'):
                temp_model = ScopeEntity()
                self.scope_entities.append(temp_model.from_map(k))
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class Tenant(TeaModel):
    def __init__(
        self,
        ant_account: str = None,
        ant_uid: str = None,
        business_owner_id: str = None,
        create_time: str = None,
        customer: str = None,
        description: str = None,
        id: str = None,
        internal_id: str = None,
        name: str = None,
        update_time: str = None,
        tags: List[str] = None,
    ):
        # 蚂蚁通行证签约账户
        self.ant_account = ant_account
        # 蚂蚁通行证uid
        self.ant_uid = ant_uid
        # 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
        self.business_owner_id = business_owner_id
        # 租户创建时间，ISO8601格式
        self.create_time = create_time
        # 租户所在的企业的唯一标识
        self.customer = customer
        # 租户描述信息
        self.description = description
        # 租户唯一标识
        self.id = id
        # 租户内部id
        self.internal_id = internal_id
        # 租户显示名称
        self.name = name
        # 租户最近一次修改时间，ISO8601格式
        self.update_time = update_time
        # 标签
        self.tags = tags

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_account is not None:
            result['ant_account'] = self.ant_account
        if self.ant_uid is not None:
            result['ant_uid'] = self.ant_uid
        if self.business_owner_id is not None:
            result['business_owner_id'] = self.business_owner_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.internal_id is not None:
            result['internal_id'] = self.internal_id
        if self.name is not None:
            result['name'] = self.name
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.tags is not None:
            result['tags'] = self.tags
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_account') is not None:
            self.ant_account = m.get('ant_account')
        if m.get('ant_uid') is not None:
            self.ant_uid = m.get('ant_uid')
        if m.get('business_owner_id') is not None:
            self.business_owner_id = m.get('business_owner_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('internal_id') is not None:
            self.internal_id = m.get('internal_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('tags') is not None:
            self.tags = m.get('tags')
        return self


class Department(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        description: str = None,
        parent_code: str = None,
        parent_path: str = None,
        customer_id: str = None,
        is_leaf: bool = None,
        creation_time: str = None,
        update_time: str = None,
    ):
        # 部门唯一代码
        self.code = code
        # 部门名称
        self.name = name
        # 部门描述信息
        self.description = description
        # 父部门 code
        self.parent_code = parent_code
        # 父部门一直到根节点的路径，例如：DP0000000001/DP0000000002
        self.parent_path = parent_path
        # 企业 id
        self.customer_id = customer_id
        # 是否为叶子结点
        self.is_leaf = is_leaf
        # 创建时间，ISO8601格式
        self.creation_time = creation_time
        # 更新时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.parent_code is not None:
            result['parent_code'] = self.parent_code
        if self.parent_path is not None:
            result['parent_path'] = self.parent_path
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.is_leaf is not None:
            result['is_leaf'] = self.is_leaf
        if self.creation_time is not None:
            result['creation_time'] = self.creation_time
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('parent_code') is not None:
            self.parent_code = m.get('parent_code')
        if m.get('parent_path') is not None:
            self.parent_path = m.get('parent_path')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('is_leaf') is not None:
            self.is_leaf = m.get('is_leaf')
        if m.get('creation_time') is not None:
            self.creation_time = m.get('creation_time')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class AuthenticateBatchEvent(TeaModel):
    def __init__(
        self,
        events: List[AuthenticateEvent] = None,
    ):
        # 鉴权事件列表
        self.events = events

    def validate(self):
        self.validate_required(self.events, 'events')
        if self.events:
            for k in self.events:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['events'] = []
        if self.events is not None:
            for k in self.events:
                result['events'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.events = []
        if m.get('events') is not None:
            for k in m.get('events'):
                temp_model = AuthenticateEvent()
                self.events.append(temp_model.from_map(k))
        return self


class Accessor(TeaModel):
    def __init__(
        self,
        access_key: str = None,
        access_secret: str = None,
        account: str = None,
        create_time: str = None,
        id: str = None,
        type: str = None,
    ):
        # Accessor关联的AccessKey
        self.access_key = access_key
        # Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
        self.access_secret = access_secret
        # AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
        self.account = account
        # AccessKey创建时间，ISO8601格式
        self.create_time = create_time
        # Accessor唯一标识
        self.id = id
        # Accessor类型(RAM/ACCOUNT)
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        if self.account is not None:
            result['account'] = self.account
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class Customer(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        id: str = None,
        name: str = None,
        update_time: str = None,
    ):
        # 企业创建时间，ISO8601格式
        self.create_time = create_time
        # 企业ID
        self.id = id
        # 企业名称
        self.name = name
        # 企业最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class MfaConfig(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        status: str = None,
        type: str = None,
        secret_key: str = None,
        last_generated_time: str = None,
        verify_attempts: int = None,
        first_failure_time: str = None,
    ):
        # 用户id
        self.user_id = user_id
        # MFA状态, 取值范围：ENABLED, DISABLED
        self.status = status
        # MFA类型，取值范围：SELF(自有MFA), SYMANTEC(赛门铁克MFA)
        self.type = type
        # 密钥
        self.secret_key = secret_key
        # 最后一次密钥生成时间
        self.last_generated_time = last_generated_time
        # (校验失败时)重试校验的次数, 0 代表不限次数
        self.verify_attempts = verify_attempts
        # 第一次校验失败时间, ISO8601格式
        self.first_failure_time = first_failure_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.status is not None:
            result['status'] = self.status
        if self.type is not None:
            result['type'] = self.type
        if self.secret_key is not None:
            result['secret_key'] = self.secret_key
        if self.last_generated_time is not None:
            result['last_generated_time'] = self.last_generated_time
        if self.verify_attempts is not None:
            result['verify_attempts'] = self.verify_attempts
        if self.first_failure_time is not None:
            result['first_failure_time'] = self.first_failure_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('secret_key') is not None:
            self.secret_key = m.get('secret_key')
        if m.get('last_generated_time') is not None:
            self.last_generated_time = m.get('last_generated_time')
        if m.get('verify_attempts') is not None:
            self.verify_attempts = m.get('verify_attempts')
        if m.get('first_failure_time') is not None:
            self.first_failure_time = m.get('first_failure_time')
        return self


class Group(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        description: str = None,
    ):
        # 成员组ID
        self.id = id
        # 成员组名称
        self.name = name
        # 成员组描述
        self.description = description

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class Operator(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        customer: str = None,
        email: str = None,
        external_id: str = None,
        external_system: str = None,
        id: str = None,
        is_master: bool = None,
        login_name: str = None,
        mobile: str = None,
        nickname: str = None,
        real_name: str = None,
        status: str = None,
        tenants: List[str] = None,
        update_time: str = None,
        work_no: str = None,
        department_code: str = None,
        last_login_time: str = None,
    ):
        # 操作员创建时间，ISO8601格式
        self.create_time = create_time
        # 操作员所在的企业
        self.customer = customer
        # 邮箱
        self.email = email
        # 外部对接系统操作员id
        self.external_id = external_id
        # 外部对接系统类型
        self.external_system = external_system
        # 操作员ID
        self.id = id
        # 是否是主账号
        self.is_master = is_master
        # 登录名
        self.login_name = login_name
        # 手机号
        self.mobile = mobile
        # 昵称
        self.nickname = nickname
        # 真实姓名
        self.real_name = real_name
        # 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
        self.status = status
        # 操作员加入的租户列表
        self.tenants = tenants
        # 操作员最近一次修改时间，ISO8601格式
        self.update_time = update_time
        # 操作员工号
        self.work_no = work_no
        # 部门唯一码
        self.department_code = department_code
        # 最近一次登录时间，为空则代表没有登录过，ISO8601格式，
        self.last_login_time = last_login_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.email is not None:
            result['email'] = self.email
        if self.external_id is not None:
            result['external_id'] = self.external_id
        if self.external_system is not None:
            result['external_system'] = self.external_system
        if self.id is not None:
            result['id'] = self.id
        if self.is_master is not None:
            result['is_master'] = self.is_master
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.nickname is not None:
            result['nickname'] = self.nickname
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.status is not None:
            result['status'] = self.status
        if self.tenants is not None:
            result['tenants'] = self.tenants
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.work_no is not None:
            result['work_no'] = self.work_no
        if self.department_code is not None:
            result['department_code'] = self.department_code
        if self.last_login_time is not None:
            result['last_login_time'] = self.last_login_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('external_id') is not None:
            self.external_id = m.get('external_id')
        if m.get('external_system') is not None:
            self.external_system = m.get('external_system')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('is_master') is not None:
            self.is_master = m.get('is_master')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('nickname') is not None:
            self.nickname = m.get('nickname')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tenants') is not None:
            self.tenants = m.get('tenants')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('work_no') is not None:
            self.work_no = m.get('work_no')
        if m.get('department_code') is not None:
            self.department_code = m.get('department_code')
        if m.get('last_login_time') is not None:
            self.last_login_time = m.get('last_login_time')
        return self


class GetRoleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        role_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 角色ID
        self.role_id = role_id

    def validate(self):
        self.validate_required(self.role_id, 'role_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.role_id is not None:
            result['role_id'] = self.role_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('role_id') is not None:
            self.role_id = m.get('role_id')
        return self


class GetRoleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        actions: List[Action] = None,
        create_time: str = None,
        description: str = None,
        id: str = None,
        name: str = None,
        tenant: str = None,
        type: str = None,
        update_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 角色所包含的操作点
        self.actions = actions
        # 创建时间,ISO8601格式
        self.create_time = create_time
        # 角色描述
        self.description = description
        # 角色Id
        self.id = id
        # 角色名称
        self.name = name
        # 角色归属租户
        self.tenant = tenant
        # 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
        self.type = type
        # 更新时间,ISO8601格式
        self.update_time = update_time

    def validate(self):
        if self.actions:
            for k in self.actions:
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
        result['actions'] = []
        if self.actions is not None:
            for k in self.actions:
                result['actions'].append(k.to_map() if k else None)
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.type is not None:
            result['type'] = self.type
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.actions = []
        if m.get('actions') is not None:
            for k in m.get('actions'):
                temp_model = Action()
                self.actions.append(temp_model.from_map(k))
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class QueryPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        actor_id: str = None,
        actor_type: str = None,
        page_num: int = None,
        page_size: int = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 授权对象id
        self.actor_id = actor_id
        # 授权对象类型
        self.actor_type = actor_type
        # 当前页，默认值为1
        self.page_num = page_num
        # 分页大小，默认值为10
        self.page_size = page_size
        # 授权策略所属租户
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.actor_id, 'actor_id')
        self.validate_required(self.actor_type, 'actor_type')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.actor_id is not None:
            result['actor_id'] = self.actor_id
        if self.actor_type is not None:
            result['actor_type'] = self.actor_type
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('actor_id') is not None:
            self.actor_id = m.get('actor_id')
        if m.get('actor_type') is not None:
            self.actor_type = m.get('actor_type')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class QueryPolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        policies: List[AuthPolicy] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 传入的页码, 如果没有传入, 则取默认值1
        self.page_num = page_num
        # 传入的页大小, 如果没有传入, 则取默认值10
        self.page_size = page_size
        # 授权策略列表
        self.policies = policies
        # 查询结果的总条目数量
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.policies, 'policies')
        if self.policies:
            for k in self.policies:
                if k:
                    k.validate()
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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['policies'] = []
        if self.policies is not None:
            for k in self.policies:
                result['policies'].append(k.to_map() if k else None)
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
        self.policies = []
        if m.get('policies') is not None:
            for k in m.get('policies'):
                temp_model = AuthPolicy()
                self.policies.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class QueryGroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        member_id: str = None,
        name: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 授权组成员ID。授权组成员是操作员
        self.member_id = member_id
        # 授权组名称
        self.name = name
        # 当前页码，默认为1
        self.page_num = page_num
        # 分页大小，默认10
        self.page_size = page_size

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.member_id is not None:
            result['member_id'] = self.member_id
        if self.name is not None:
            result['name'] = self.name
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('member_id') is not None:
            self.member_id = m.get('member_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryGroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        groups: List[AuthGroup] = None,
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
        # 授权组列表
        self.groups = groups
        # 当前页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size
        # 应用总数
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.groups, 'groups')
        if self.groups:
            for k in self.groups:
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
        result['groups'] = []
        if self.groups is not None:
            for k in self.groups:
                result['groups'].append(k.to_map() if k else None)
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
        self.groups = []
        if m.get('groups') is not None:
            for k in m.get('groups'):
                temp_model = AuthGroup()
                self.groups.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class CreatePolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        ability_id: str = None,
        ability_type: str = None,
        conditons: List[Condition] = None,
        description: str = None,
        name: str = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 角色Id
        self.ability_id = ability_id
        # 授权能力类型（ROLE：角色)
        self.ability_type = ability_type
        # 授权策略的限制条件
        self.conditons = conditons
        # 策略的描述
        self.description = description
        # 授权策略名称
        self.name = name
        # 八位租户ID
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.ability_id, 'ability_id')
        self.validate_required(self.ability_type, 'ability_type')
        if self.conditons:
            for k in self.conditons:
                if k:
                    k.validate()
        self.validate_required(self.name, 'name')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.ability_id is not None:
            result['ability_id'] = self.ability_id
        if self.ability_type is not None:
            result['ability_type'] = self.ability_type
        result['conditons'] = []
        if self.conditons is not None:
            for k in self.conditons:
                result['conditons'].append(k.to_map() if k else None)
        if self.description is not None:
            result['description'] = self.description
        if self.name is not None:
            result['name'] = self.name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('ability_id') is not None:
            self.ability_id = m.get('ability_id')
        if m.get('ability_type') is not None:
            self.ability_type = m.get('ability_type')
        self.conditons = []
        if m.get('conditons') is not None:
            for k in m.get('conditons'):
                temp_model = Condition()
                self.conditons.append(temp_model.from_map(k))
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class CreatePolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        policy_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权策略id
        self.policy_id = policy_id

    def validate(self):
        self.validate_required(self.policy_id, 'policy_id')

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
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        return self


class DeletePolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        policy_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 授权策略Id
        self.policy_id = policy_id

    def validate(self):
        self.validate_required(self.policy_id, 'policy_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        return self


class DeletePolicyResponse(TeaModel):
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


class AttachPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        actor_id: str = None,
        actor_type: str = None,
        policy_id: str = None,
        login_name: str = None,
        policy_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 授权对象Id
        self.actor_id = actor_id
        # 授权对象类型
        self.actor_type = actor_type
        # 授权策略Id
        self.policy_id = policy_id
        # 授权操作员的登录名，当配置actor_id与actor_type时可不填
        self.login_name = login_name
        # 授权策略的唯一名称，当配置policy_id时可不填
        self.policy_name = policy_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.actor_id is not None:
            result['actor_id'] = self.actor_id
        if self.actor_type is not None:
            result['actor_type'] = self.actor_type
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.policy_name is not None:
            result['policy_name'] = self.policy_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('actor_id') is not None:
            self.actor_id = m.get('actor_id')
        if m.get('actor_type') is not None:
            self.actor_type = m.get('actor_type')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('policy_name') is not None:
            self.policy_name = m.get('policy_name')
        return self


class AttachPolicyResponse(TeaModel):
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


class DetachPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        actor_id: str = None,
        actor_type: str = None,
        policy_id: str = None,
        login_name: str = None,
        policy_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 授权对象Id
        self.actor_id = actor_id
        # 授权对象类型
        self.actor_type = actor_type
        # 授权策略Id
        self.policy_id = policy_id
        # 授权操作员的登录名，当配置actor_id与actor_type时可不填
        self.login_name = login_name
        # 授权策略的唯一名称，当配置policy_id时可不填
        self.policy_name = policy_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.actor_id is not None:
            result['actor_id'] = self.actor_id
        if self.actor_type is not None:
            result['actor_type'] = self.actor_type
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.policy_name is not None:
            result['policy_name'] = self.policy_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('actor_id') is not None:
            self.actor_id = m.get('actor_id')
        if m.get('actor_type') is not None:
            self.actor_type = m.get('actor_type')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('policy_name') is not None:
            self.policy_name = m.get('policy_name')
        return self


class DetachPolicyResponse(TeaModel):
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


class ListPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        actor_id: str = None,
        actor_type: str = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 授权对象id
        self.actor_id = actor_id
        # 授权对象类型
        self.actor_type = actor_type
        # 授权策略所属租户
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.actor_id, 'actor_id')
        self.validate_required(self.actor_type, 'actor_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.actor_id is not None:
            result['actor_id'] = self.actor_id
        if self.actor_type is not None:
            result['actor_type'] = self.actor_type
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('actor_id') is not None:
            self.actor_id = m.get('actor_id')
        if m.get('actor_type') is not None:
            self.actor_type = m.get('actor_type')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class ListPolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        policies: List[AuthPolicy] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权策略列表
        self.policies = policies

    def validate(self):
        self.validate_required(self.policies, 'policies')
        if self.policies:
            for k in self.policies:
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
        result['policies'] = []
        if self.policies is not None:
            for k in self.policies:
                result['policies'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.policies = []
        if m.get('policies') is not None:
            for k in m.get('policies'):
                temp_model = AuthPolicy()
                self.policies.append(temp_model.from_map(k))
        return self


class JudgeAuthorityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        action_id: str = None,
        conditions: List[Condition] = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作点id
        self.action_id = action_id
        # 鉴权条件
        self.conditions = conditions
        # 鉴权对象id
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.action_id, 'action_id')
        if self.conditions:
            for k in self.conditions:
                if k:
                    k.validate()
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.action_id is not None:
            result['action_id'] = self.action_id
        result['conditions'] = []
        if self.conditions is not None:
            for k in self.conditions:
                result['conditions'].append(k.to_map() if k else None)
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('action_id') is not None:
            self.action_id = m.get('action_id')
        self.conditions = []
        if m.get('conditions') is not None:
            for k in m.get('conditions'):
                temp_model = Condition()
                self.conditions.append(temp_model.from_map(k))
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class JudgeAuthorityResponse(TeaModel):
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
        # 判断结果。true：鉴权通过；false：鉴权未通过
        self.result = result

    def validate(self):
        self.validate_required(self.result, 'result')

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


class CreateProductActionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        action_id: str = None,
        category_id: str = None,
        description: str = None,
        name: str = None,
        product: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作点ID
        self.action_id = action_id
        # 操作点所属功能分类ID
        self.category_id = category_id
        # 操作点描述
        self.description = description
        # 操作点名称
        self.name = name
        # 操作点所属产品
        self.product = product

    def validate(self):
        self.validate_required(self.action_id, 'action_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.product, 'product')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.action_id is not None:
            result['action_id'] = self.action_id
        if self.category_id is not None:
            result['category_id'] = self.category_id
        if self.description is not None:
            result['description'] = self.description
        if self.name is not None:
            result['name'] = self.name
        if self.product is not None:
            result['product'] = self.product
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('action_id') is not None:
            self.action_id = m.get('action_id')
        if m.get('category_id') is not None:
            self.category_id = m.get('category_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('product') is not None:
            self.product = m.get('product')
        return self


class CreateProductActionResponse(TeaModel):
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


class VerifyOauthTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        access_token: str = None,
        extend: bool = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # token值
        self.access_token = access_token
        # 是否刷新access_token有限期
        self.extend = extend
        # token应用场景，LOGIN或AUTH
        self.scene = scene

    def validate(self):
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.scene, 'scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.extend is not None:
            result['extend'] = self.extend
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('extend') is not None:
            self.extend = m.get('extend')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class VerifyOauthTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: str = None,
        type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # token关联的用户id
        self.id = id
        # token关联的用户类型
        self.type = type

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
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class VerifySessionTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # token值
        self.token = token

    def validate(self):
        self.validate_required(self.token, 'token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class VerifySessionTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        customer: str = None,
        login_name: str = None,
        tenants: List[str] = None,
        user_id: str = None,
        tenant_details: List[Tenant] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户所在企业的唯一标识
        self.customer = customer
        # 登录名
        self.login_name = login_name
        # 用户加入的租户ID列表
        self.tenants = tenants
        # session关联的用户id
        self.user_id = user_id
        # 租户详情列表
        self.tenant_details = tenant_details

    def validate(self):
        if self.tenant_details:
            for k in self.tenant_details:
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
        if self.customer is not None:
            result['customer'] = self.customer
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.tenants is not None:
            result['tenants'] = self.tenants
        if self.user_id is not None:
            result['user_id'] = self.user_id
        result['tenant_details'] = []
        if self.tenant_details is not None:
            for k in self.tenant_details:
                result['tenant_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('tenants') is not None:
            self.tenants = m.get('tenants')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        self.tenant_details = []
        if m.get('tenant_details') is not None:
            for k in m.get('tenant_details'):
                temp_model = Tenant()
                self.tenant_details.append(temp_model.from_map(k))
        return self


class ListRoleOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        role_id: str = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 角色ID
        self.role_id = role_id
        # 租户信息
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.role_id, 'role_id')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.role_id is not None:
            result['role_id'] = self.role_id
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('role_id') is not None:
            self.role_id = m.get('role_id')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class ListRoleOperatorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        operators: List[Operator] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作员列表
        self.operators = operators

    def validate(self):
        self.validate_required(self.operators, 'operators')
        if self.operators:
            for k in self.operators:
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
        result['operators'] = []
        if self.operators is not None:
            for k in self.operators:
                result['operators'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.operators = []
        if m.get('operators') is not None:
            for k in m.get('operators'):
                temp_model = Operator()
                self.operators.append(temp_model.from_map(k))
        return self


class ApplyTrustloginUrlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        goto_url: str = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 跳转地址
        self.goto_url = goto_url
        # 操作员id
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.goto_url, 'goto_url')
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.goto_url is not None:
            result['goto_url'] = self.goto_url
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('goto_url') is not None:
            self.goto_url = m.get('goto_url')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class ApplyTrustloginUrlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trust_login_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 信登URL
        self.trust_login_url = trust_login_url

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
        if self.trust_login_url is not None:
            result['trust_login_url'] = self.trust_login_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trust_login_url') is not None:
            self.trust_login_url = m.get('trust_login_url')
        return self


class AssumeStsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        actor_name: str = None,
        actor_tenant: str = None,
        duration_seconds: int = None,
        session_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 虚拟身份唯一名称
        self.actor_name = actor_name
        # 虚拟身份所属租户
        self.actor_tenant = actor_tenant
        # 过期时间，单位为秒，范围900-3600，默认为3600
        self.duration_seconds = duration_seconds
        # 会话名称
        self.session_name = session_name

    def validate(self):
        self.validate_required(self.actor_name, 'actor_name')
        self.validate_required(self.actor_tenant, 'actor_tenant')
        self.validate_required(self.session_name, 'session_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.actor_name is not None:
            result['actor_name'] = self.actor_name
        if self.actor_tenant is not None:
            result['actor_tenant'] = self.actor_tenant
        if self.duration_seconds is not None:
            result['duration_seconds'] = self.duration_seconds
        if self.session_name is not None:
            result['session_name'] = self.session_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('actor_name') is not None:
            self.actor_name = m.get('actor_name')
        if m.get('actor_tenant') is not None:
            self.actor_tenant = m.get('actor_tenant')
        if m.get('duration_seconds') is not None:
            self.duration_seconds = m.get('duration_seconds')
        if m.get('session_name') is not None:
            self.session_name = m.get('session_name')
        return self


class AssumeStsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_key: str = None,
        access_secret: str = None,
        expired_time: int = None,
        security_token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 安全令牌accessKey
        self.access_key = access_key
        # 安全令牌accessSecret
        self.access_secret = access_secret
        # 过期时间戳，单位为毫秒
        self.expired_time = expired_time
        # 安全令牌
        self.security_token = security_token

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
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.security_token is not None:
            result['security_token'] = self.security_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('security_token') is not None:
            self.security_token = m.get('security_token')
        return self


class CreateStsActorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        bindings: List[StsActorBinding] = None,
        description: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 虚拟身份受信关系集合，通常只包含一个
        self.bindings = bindings
        # 针对虚拟身份的描述
        self.description = description
        # 虚拟身份名称，租户内唯一
        self.name = name

    def validate(self):
        self.validate_required(self.bindings, 'bindings')
        if self.bindings:
            for k in self.bindings:
                if k:
                    k.validate()
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        result['bindings'] = []
        if self.bindings is not None:
            for k in self.bindings:
                result['bindings'].append(k.to_map() if k else None)
        if self.description is not None:
            result['description'] = self.description
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        self.bindings = []
        if m.get('bindings') is not None:
            for k in m.get('bindings'):
                temp_model = StsActorBinding()
                self.bindings.append(temp_model.from_map(k))
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CreateStsActorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        actor_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 虚拟身份ID
        self.actor_id = actor_id

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
        if self.actor_id is not None:
            result['actor_id'] = self.actor_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('actor_id') is not None:
            self.actor_id = m.get('actor_id')
        return self


class DeleteStsActorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        actor_id: str = None,
        actor_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 虚拟身份ID，与虚拟身份名称两个参数二选一传入
        self.actor_id = actor_id
        # 虚拟身份名称，与虚拟身份名称两个参数二选一传入
        self.actor_name = actor_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.actor_id is not None:
            result['actor_id'] = self.actor_id
        if self.actor_name is not None:
            result['actor_name'] = self.actor_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('actor_id') is not None:
            self.actor_id = m.get('actor_id')
        if m.get('actor_name') is not None:
            self.actor_name = m.get('actor_name')
        return self


class DeleteStsActorResponse(TeaModel):
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


class GetStsActorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        actor_id: str = None,
        actor_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 虚拟身份ID，与虚拟身份名称两个参数二选一传入
        self.actor_id = actor_id
        # 虚拟身份名称，与虚拟身份名称两个参数二选一传入
        self.actor_name = actor_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.actor_id is not None:
            result['actor_id'] = self.actor_id
        if self.actor_name is not None:
            result['actor_name'] = self.actor_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('actor_id') is not None:
            self.actor_id = m.get('actor_id')
        if m.get('actor_name') is not None:
            self.actor_name = m.get('actor_name')
        return self


class GetStsActorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        bindings: List[StsActorBinding] = None,
        description: str = None,
        id: str = None,
        name: str = None,
        tenant: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 虚拟身份受信关系集合，通常只包含一个
        self.bindings = bindings
        # 针对虚拟身份的描述
        self.description = description
        # 虚拟身份ID
        self.id = id
        # 虚拟身份名称，租户内唯一
        self.name = name
        # 虚拟身份所在租户
        self.tenant = tenant

    def validate(self):
        if self.bindings:
            for k in self.bindings:
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
        result['bindings'] = []
        if self.bindings is not None:
            for k in self.bindings:
                result['bindings'].append(k.to_map() if k else None)
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.bindings = []
        if m.get('bindings') is not None:
            for k in m.get('bindings'):
                temp_model = StsActorBinding()
                self.bindings.append(temp_model.from_map(k))
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class ListStsActorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class ListStsActorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        actors: List[StsActor] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 虚拟身份列表
        self.actors = actors

    def validate(self):
        if self.actors:
            for k in self.actors:
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
        result['actors'] = []
        if self.actors is not None:
            for k in self.actors:
                result['actors'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.actors = []
        if m.get('actors') is not None:
            for k in m.get('actors'):
                temp_model = StsActor()
                self.actors.append(temp_model.from_map(k))
        return self


class UpdateStsActorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        actor_id: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 虚拟身份ID
        self.actor_id = actor_id
        # 针对虚拟身份的描述
        self.description = description

    def validate(self):
        self.validate_required(self.actor_id, 'actor_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.actor_id is not None:
            result['actor_id'] = self.actor_id
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('actor_id') is not None:
            self.actor_id = m.get('actor_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class UpdateStsActorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        bindings: List[StsActorBinding] = None,
        description: str = None,
        id: str = None,
        name: str = None,
        tenant: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 虚拟身份受信关系集合，通常只包含一个
        self.bindings = bindings
        # 针对虚拟身份的描述
        self.description = description
        # 虚拟身份ID
        self.id = id
        # 虚拟身份名称，租户内唯一
        self.name = name
        # 虚拟身份所在租户
        self.tenant = tenant

    def validate(self):
        if self.bindings:
            for k in self.bindings:
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
        result['bindings'] = []
        if self.bindings is not None:
            for k in self.bindings:
                result['bindings'].append(k.to_map() if k else None)
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.bindings = []
        if m.get('bindings') is not None:
            for k in m.get('bindings'):
                temp_model = StsActorBinding()
                self.bindings.append(temp_model.from_map(k))
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class QueryRoleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        page_num: int = None,
        page_size: int = None,
        paging: bool = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 角色名称
        self.name = name
        # 当前页,默认1
        self.page_num = page_num
        # 分页大小，取值范围[1~50],默认10
        self.page_size = page_size
        # 是否分页，默认true
        self.paging = paging
        # 角色类型，自定义角色为CUSTOM或者系统角色为COMMON
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.paging is not None:
            result['paging'] = self.paging
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('paging') is not None:
            self.paging = m.get('paging')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryRoleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        roles: List[Role] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size
        # 角色列表
        self.roles = roles
        # 记录总数
        self.total_count = total_count

    def validate(self):
        if self.roles:
            for k in self.roles:
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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['roles'] = []
        if self.roles is not None:
            for k in self.roles:
                result['roles'].append(k.to_map() if k else None)
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
        self.roles = []
        if m.get('roles') is not None:
            for k in m.get('roles'):
                temp_model = Role()
                self.roles.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class GetIaasaccountBaseinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class GetIaasaccountBaseinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        account: str = None,
        id: str = None,
        source_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账号名称
        self.account = account
        # 账号ID
        self.id = id
        # iaas账号类型
        # ALIYUN_BID: 阿里云BID类型
        # ALIYUN_BID_MIG: 原本是阿里云BID类型，迁移后可两侧登录
        # ALIYUN_MPK: 阿里云MPK类型
        # ALIYUN_LOCALIZATION: 阿里云一方化类型
        self.source_type = source_type

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
        if self.account is not None:
            result['account'] = self.account
        if self.id is not None:
            result['id'] = self.id
        if self.source_type is not None:
            result['source_type'] = self.source_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        return self


class VerifyPasswordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        encrypted_password: str = None,
        login_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 加密过的密码值，使用AccessSecret进行3DES加密
        self.encrypted_password = encrypted_password
        # 登录名
        self.login_name = login_name

    def validate(self):
        self.validate_required(self.encrypted_password, 'encrypted_password')
        self.validate_required(self.login_name, 'login_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.encrypted_password is not None:
            result['encrypted_password'] = self.encrypted_password
        if self.login_name is not None:
            result['login_name'] = self.login_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('encrypted_password') is not None:
            self.encrypted_password = m.get('encrypted_password')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class VerifyPasswordResponse(TeaModel):
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


class UpdateOperatorStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_id: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作员ID
        self.operator_id = operator_id
        # 要更新到的状态，FROZEN为冻结，NORMAL为正常
        self.status = status

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class UpdateOperatorStatusResponse(TeaModel):
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


class FreezeOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作员ID
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class FreezeOperatorResponse(TeaModel):
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


class UnfreezeOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作员ID
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class UnfreezeOperatorResponse(TeaModel):
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


class GetInternalMasterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        iaas_id: str = None,
        master_id: str = None,
        source_system: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 阿里云PK
        self.iaas_id = iaas_id
        # 主账号ID
        self.master_id = master_id
        # 来源系统，例如MAYI，ALBABACLOUD
        self.source_system = source_system

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.iaas_id is not None:
            result['iaas_id'] = self.iaas_id
        if self.master_id is not None:
            result['master_id'] = self.master_id
        if self.source_system is not None:
            result['source_system'] = self.source_system
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('iaas_id') is not None:
            self.iaas_id = m.get('iaas_id')
        if m.get('master_id') is not None:
            self.master_id = m.get('master_id')
        if m.get('source_system') is not None:
            self.source_system = m.get('source_system')
        return self


class GetInternalMasterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cert_no: str = None,
        cert_type: str = None,
        customer_id: str = None,
        email: str = None,
        firm_name: str = None,
        havana_id: str = None,
        id: str = None,
        login_name: str = None,
        mobile: str = None,
        real_name: str = None,
        source_user_type: str = None,
        industry_label: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证件ID
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 所属客户ID
        self.customer_id = customer_id
        # 邮箱
        self.email = email
        # 企业认证名称
        self.firm_name = firm_name
        # havanaId
        self.havana_id = havana_id
        # 主账号ID
        self.id = id
        # 登录名
        self.login_name = login_name
        # 手机
        self.mobile = mobile
        # 真实姓名
        self.real_name = real_name
        # 来源用户类型，CUSTOMER（企业用户），PERSONAL（个人用户）
        self.source_user_type = source_user_type
        # 主账号行业标签，I表示金融机构，C表示特殊机构，N表示非金融机构
        self.industry_label = industry_label

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
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.email is not None:
            result['email'] = self.email
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.havana_id is not None:
            result['havana_id'] = self.havana_id
        if self.id is not None:
            result['id'] = self.id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.source_user_type is not None:
            result['source_user_type'] = self.source_user_type
        if self.industry_label is not None:
            result['industry_label'] = self.industry_label
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('havana_id') is not None:
            self.havana_id = m.get('havana_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('source_user_type') is not None:
            self.source_user_type = m.get('source_user_type')
        if m.get('industry_label') is not None:
            self.industry_label = m.get('industry_label')
        return self


class GetAliyunUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 阿里云用户ID
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class GetAliyunUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: str = None,
        login_name: str = None,
        name: str = None,
        ram_display_name: str = None,
        tenant: str = None,
        type: str = None,
        display_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 阿里云用户ID
        self.id = id
        # 主账号类型下有值，即type为ENTERPRISE和PERSONAL时有值
        self.login_name = login_name
        # 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
        self.name = name
        # RAM子账号的显示名称
        self.ram_display_name = ram_display_name
        # 用户所属租户
        self.tenant = tenant
        # 阿里云用户类型，分为主账号企业（ENTERPRISE），主账号个人（PERSONAL），和子账号（RAM）
        self.type = type
        # 显示名
        self.display_name = display_name

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
        if self.id is not None:
            result['id'] = self.id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.name is not None:
            result['name'] = self.name
        if self.ram_display_name is not None:
            result['ram_display_name'] = self.ram_display_name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.type is not None:
            result['type'] = self.type
        if self.display_name is not None:
            result['display_name'] = self.display_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('ram_display_name') is not None:
            self.ram_display_name = m.get('ram_display_name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        return self


class JudgeAliyunAuthorityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        action: str = None,
        aliyun_resources: List[AliyunResource] = None,
        conditions: List[Condition] = None,
        region_id: str = None,
        request_info: AliyunPopRequestInfo = None,
        service_name: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 阿里云POP API名称
        self.action = action
        # 阿里云资源描述数组
        self.aliyun_resources = aliyun_resources
        # 自定义条件
        self.conditions = conditions
        # regionId
        self.region_id = region_id
        # 阿里云POP透传参数
        self.request_info = request_info
        # 阿里云服务名称
        self.service_name = service_name
        # 0000000001
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.action, 'action')
        self.validate_required(self.aliyun_resources, 'aliyun_resources')
        if self.aliyun_resources:
            for k in self.aliyun_resources:
                if k:
                    k.validate()
        if self.conditions:
            for k in self.conditions:
                if k:
                    k.validate()
        self.validate_required(self.region_id, 'region_id')
        self.validate_required(self.request_info, 'request_info')
        if self.request_info:
            self.request_info.validate()
        self.validate_required(self.service_name, 'service_name')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.action is not None:
            result['action'] = self.action
        result['aliyun_resources'] = []
        if self.aliyun_resources is not None:
            for k in self.aliyun_resources:
                result['aliyun_resources'].append(k.to_map() if k else None)
        result['conditions'] = []
        if self.conditions is not None:
            for k in self.conditions:
                result['conditions'].append(k.to_map() if k else None)
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.request_info is not None:
            result['request_info'] = self.request_info.to_map()
        if self.service_name is not None:
            result['service_name'] = self.service_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('action') is not None:
            self.action = m.get('action')
        self.aliyun_resources = []
        if m.get('aliyun_resources') is not None:
            for k in m.get('aliyun_resources'):
                temp_model = AliyunResource()
                self.aliyun_resources.append(temp_model.from_map(k))
        self.conditions = []
        if m.get('conditions') is not None:
            for k in m.get('conditions'):
                temp_model = Condition()
                self.conditions.append(temp_model.from_map(k))
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('request_info') is not None:
            temp_model = AliyunPopRequestInfo()
            self.request_info = temp_model.from_map(m['request_info'])
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class JudgeAliyunAuthorityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
        reason: str = None,
        solution: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 权限校验是否通过
        self.result = result
        # 失败原因
        self.reason = reason
        # 解决方案
        self.solution = solution

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
        if self.reason is not None:
            result['reason'] = self.reason
        if self.solution is not None:
            result['solution'] = self.solution
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
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        if m.get('solution') is not None:
            self.solution = m.get('solution')
        return self


class GetSessionAccessorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        authorization: str = None,
        user_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 登录态
        self.authorization = authorization
        # 用户所属租户
        self.user_tenant = user_tenant

    def validate(self):
        self.validate_required(self.authorization, 'authorization')
        self.validate_required(self.user_tenant, 'user_tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.authorization is not None:
            result['authorization'] = self.authorization
        if self.user_tenant is not None:
            result['user_tenant'] = self.user_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('authorization') is not None:
            self.authorization = m.get('authorization')
        if m.get('user_tenant') is not None:
            self.user_tenant = m.get('user_tenant')
        return self


class GetSessionAccessorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_key: str = None,
        access_secret: str = None,
        tenant: str = None,
        user_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # access_key
        self.access_key = access_key
        # access_secret
        self.access_secret = access_secret
        # 关联租户名称
        self.tenant = tenant
        # 用户ID
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
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        if self.tenant is not None:
            result['tenant'] = self.tenant
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
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class UpdatePasswordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        login_name: str = None,
        new_encrypted_password: str = None,
        old_encrypted_password: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 登录名
        self.login_name = login_name
        # 加密过的新密码值，使用AccessSecret进行3DES加密
        # 
        self.new_encrypted_password = new_encrypted_password
        # 加密过的旧密码值，使用AccessSecret进行DES加密
        # 
        self.old_encrypted_password = old_encrypted_password

    def validate(self):
        self.validate_required(self.login_name, 'login_name')
        self.validate_required(self.new_encrypted_password, 'new_encrypted_password')
        self.validate_required(self.old_encrypted_password, 'old_encrypted_password')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.new_encrypted_password is not None:
            result['new_encrypted_password'] = self.new_encrypted_password
        if self.old_encrypted_password is not None:
            result['old_encrypted_password'] = self.old_encrypted_password
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('new_encrypted_password') is not None:
            self.new_encrypted_password = m.get('new_encrypted_password')
        if m.get('old_encrypted_password') is not None:
            self.old_encrypted_password = m.get('old_encrypted_password')
        return self


class UpdatePasswordResponse(TeaModel):
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


class JudgeMultiauthorityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        batch_event: AuthenticateBatchEvent = None,
        context: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 批量鉴权对象
        self.batch_event = batch_event
        # 上下文信息
        self.context = context

    def validate(self):
        self.validate_required(self.batch_event, 'batch_event')
        if self.batch_event:
            self.batch_event.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.batch_event is not None:
            result['batch_event'] = self.batch_event.to_map()
        if self.context is not None:
            result['context'] = self.context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('batch_event') is not None:
            temp_model = AuthenticateBatchEvent()
            self.batch_event = temp_model.from_map(m['batch_event'])
        if m.get('context') is not None:
            self.context = m.get('context')
        return self


class JudgeMultiauthorityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        judgements: List[Judgement] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 鉴权结果列表
        self.judgements = judgements

    def validate(self):
        if self.judgements:
            for k in self.judgements:
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
        result['judgements'] = []
        if self.judgements is not None:
            for k in self.judgements:
                result['judgements'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.judgements = []
        if m.get('judgements') is not None:
            for k in m.get('judgements'):
                temp_model = Judgement()
                self.judgements.append(temp_model.from_map(k))
        return self


class JudgeAliyunMultiauthorityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        batch_event: AliyunAuthenticateBatchEvent = None,
        context: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 阿里云批量鉴权
        self.batch_event = batch_event
        # 上下文信息
        self.context = context

    def validate(self):
        self.validate_required(self.batch_event, 'batch_event')
        if self.batch_event:
            self.batch_event.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.batch_event is not None:
            result['batch_event'] = self.batch_event.to_map()
        if self.context is not None:
            result['context'] = self.context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('batch_event') is not None:
            temp_model = AliyunAuthenticateBatchEvent()
            self.batch_event = temp_model.from_map(m['batch_event'])
        if m.get('context') is not None:
            self.context = m.get('context')
        return self


class JudgeAliyunMultiauthorityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        judgements: List[Judgement] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 鉴权结果列表
        self.judgements = judgements

    def validate(self):
        if self.judgements:
            for k in self.judgements:
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
        result['judgements'] = []
        if self.judgements is not None:
            for k in self.judgements:
                result['judgements'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.judgements = []
        if m.get('judgements') is not None:
            for k in m.get('judgements'):
                temp_model = Judgement()
                self.judgements.append(temp_model.from_map(k))
        return self


class GetAccessorCurrentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class GetAccessorCurrentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: str = None,
        login_name: str = None,
        name: str = None,
        tenant: str = None,
        type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 一方化链路为阿里云用户ID，蚂蚁链路为金融云用户ID
        self.id = id
        # 登录名
        self.login_name = login_name
        # 一方化链路：
        # 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
        # 蚂蚁链路：
        # 用户真实姓名
        # 
        self.name = name
        # 当前AK所属租户
        self.tenant = tenant
        # 一方化链路：
        # 阿里云用户类型，主账号为CUSTOMER，操作员为SUB，RAM角色为RAM_ROLE
        # 蚂蚁链路：
        # 主账号为MASTER，操作员为OPERATOR，服务账号为SERVICE
        self.type = type

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
        if self.id is not None:
            result['id'] = self.id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.name is not None:
            result['name'] = self.name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class GetServiceaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        service_account_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 服务账号名称
        self.name = name
        # 服务账号ID
        self.service_account_id = service_account_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.service_account_id is not None:
            result['service_account_id'] = self.service_account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('service_account_id') is not None:
            self.service_account_id = m.get('service_account_id')
        return self


class GetServiceaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        alias: str = None,
        description: str = None,
        id: str = None,
        name: str = None,
        tenant: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 服务账号别名
        self.alias = alias
        # 服务账号描述
        self.description = description
        # 服务账号ID
        self.id = id
        # 服务账号名称
        self.name = name
        # 服务账号所属租户
        self.tenant = tenant

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
        if self.alias is not None:
            result['alias'] = self.alias
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class CreateServiceaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        description: str = None,
        alias: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 服务账号描述
        self.description = description
        # 服务账号别名
        self.alias = alias

    def validate(self):
        self.validate_required(self.alias, 'alias')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.description is not None:
            result['description'] = self.description
        if self.alias is not None:
            result['alias'] = self.alias
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        return self


class CreateServiceaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_key: str = None,
        access_secret: str = None,
        alias: str = None,
        description: str = None,
        id: str = None,
        name: str = None,
        tenant: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 服务账号AK
        self.access_key = access_key
        # 服务账号SK
        self.access_secret = access_secret
        # 服务账号别名
        self.alias = alias
        # 服务账号描述
        self.description = description
        # 服务账号ID
        self.id = id
        # 服务账号名称
        self.name = name
        # 服务账号所属租户
        self.tenant = tenant

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
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        if self.alias is not None:
            result['alias'] = self.alias
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class DeleteServiceaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        service_account_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 服务账号名称
        self.name = name
        # 服务账号ID
        self.service_account_id = service_account_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.service_account_id is not None:
            result['service_account_id'] = self.service_account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('service_account_id') is not None:
            self.service_account_id = m.get('service_account_id')
        return self


class DeleteServiceaccountResponse(TeaModel):
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


class UpdateServiceaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        alias: str = None,
        description: str = None,
        name: str = None,
        service_account_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 服务账号别名
        self.alias = alias
        # 服务账号描述
        self.description = description
        # 服务账号名称，与服务账号ID任选其一传入
        self.name = name
        # 服务账号ID
        self.service_account_id = service_account_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.alias is not None:
            result['alias'] = self.alias
        if self.description is not None:
            result['description'] = self.description
        if self.name is not None:
            result['name'] = self.name
        if self.service_account_id is not None:
            result['service_account_id'] = self.service_account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('service_account_id') is not None:
            self.service_account_id = m.get('service_account_id')
        return self


class UpdateServiceaccountResponse(TeaModel):
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


class RemoveTenantMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作员ID
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class RemoveTenantMemberResponse(TeaModel):
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


class CreateGroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 名称
        self.name = name
        # 描述
        self.description = description

    def validate(self):
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class CreateGroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成员组ID
        self.id = id

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
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DeleteGroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        group_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 成员组ID
        self.group_id = group_id

    def validate(self):
        self.validate_required(self.group_id, 'group_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.group_id is not None:
            result['group_id'] = self.group_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        return self


class DeleteGroupResponse(TeaModel):
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


class UpdateGroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        group_id: str = None,
        name: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 成员组ID
        self.group_id = group_id
        # 名称
        self.name = name
        # 描述
        self.description = description

    def validate(self):
        self.validate_required(self.group_id, 'group_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.group_id is not None:
            result['group_id'] = self.group_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class UpdateGroupResponse(TeaModel):
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


class AddGroupMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        group_id: str = None,
        operator_ids: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 成员组ID
        self.group_id = group_id
        # 操作员ID
        self.operator_ids = operator_ids

    def validate(self):
        self.validate_required(self.group_id, 'group_id')
        self.validate_required(self.operator_ids, 'operator_ids')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.group_id is not None:
            result['group_id'] = self.group_id
        if self.operator_ids is not None:
            result['operator_ids'] = self.operator_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        if m.get('operator_ids') is not None:
            self.operator_ids = m.get('operator_ids')
        return self


class AddGroupMemberResponse(TeaModel):
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


class RemoveGroupMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        group_id: str = None,
        operator_ids: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 成员组ID
        self.group_id = group_id
        # 操作员ID
        self.operator_ids = operator_ids

    def validate(self):
        self.validate_required(self.group_id, 'group_id')
        self.validate_required(self.operator_ids, 'operator_ids')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.group_id is not None:
            result['group_id'] = self.group_id
        if self.operator_ids is not None:
            result['operator_ids'] = self.operator_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        if m.get('operator_ids') is not None:
            self.operator_ids = m.get('operator_ids')
        return self


class RemoveGroupMemberResponse(TeaModel):
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


class GetGroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        group_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 成员组ID
        self.group_id = group_id

    def validate(self):
        self.validate_required(self.group_id, 'group_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.group_id is not None:
            result['group_id'] = self.group_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        return self


class GetGroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: str = None,
        name: str = None,
        description: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成员组ID
        self.id = id
        # 名称
        self.name = name
        # 描述
        self.description = description

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
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class QueryGroupMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        group_id: str = None,
        page_size: int = None,
        current_page: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 成员组ID
        self.group_id = group_id
        # 页大小
        self.page_size = page_size
        # 当前页
        self.current_page = current_page

    def validate(self):
        self.validate_required(self.group_id, 'group_id')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 10)
        if self.current_page is not None:
            self.validate_minimum(self.current_page, 'current_page', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.group_id is not None:
            result['group_id'] = self.group_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current_page is not None:
            result['current_page'] = self.current_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        return self


class QueryGroupMemberResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        operators: List[Operator] = None,
        current_page: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成员列表
        self.operators = operators
        # 当前页
        self.current_page = current_page
        # 页大小
        self.page_size = page_size
        # 总计
        self.total_count = total_count

    def validate(self):
        if self.operators:
            for k in self.operators:
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
        result['operators'] = []
        if self.operators is not None:
            for k in self.operators:
                result['operators'].append(k.to_map() if k else None)
        if self.current_page is not None:
            result['current_page'] = self.current_page
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
        self.operators = []
        if m.get('operators') is not None:
            for k in m.get('operators'):
                temp_model = Operator()
                self.operators.append(temp_model.from_map(k))
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class ListOperatorGroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作员ID
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class ListOperatorGroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        groups: List[Group] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成员组列表
        self.groups = groups

    def validate(self):
        if self.groups:
            for k in self.groups:
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
        result['groups'] = []
        if self.groups is not None:
            for k in self.groups:
                result['groups'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.groups = []
        if m.get('groups') is not None:
            for k in m.get('groups'):
                temp_model = Group()
                self.groups.append(temp_model.from_map(k))
        return self


class AddRoleActionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        role_id: str = None,
        actions: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 角色ID
        self.role_id = role_id
        # 权限码
        self.actions = actions

    def validate(self):
        self.validate_required(self.role_id, 'role_id')
        self.validate_required(self.actions, 'actions')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.role_id is not None:
            result['role_id'] = self.role_id
        if self.actions is not None:
            result['actions'] = self.actions
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('role_id') is not None:
            self.role_id = m.get('role_id')
        if m.get('actions') is not None:
            self.actions = m.get('actions')
        return self


class AddRoleActionResponse(TeaModel):
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


class RemoveRoleActionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        role_id: str = None,
        actions: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 角色ID
        self.role_id = role_id
        # 权限码
        self.actions = actions

    def validate(self):
        self.validate_required(self.role_id, 'role_id')
        self.validate_required(self.actions, 'actions')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.role_id is not None:
            result['role_id'] = self.role_id
        if self.actions is not None:
            result['actions'] = self.actions
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('role_id') is not None:
            self.role_id = m.get('role_id')
        if m.get('actions') is not None:
            self.actions = m.get('actions')
        return self


class RemoveRoleActionResponse(TeaModel):
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


class CreateRoleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        description: str = None,
        actions: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 名称
        self.name = name
        # 描述
        self.description = description
        # 权限码列表
        self.actions = actions

    def validate(self):
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.actions is not None:
            result['actions'] = self.actions
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('actions') is not None:
            self.actions = m.get('actions')
        return self


class CreateRoleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 角色ID
        self.id = id

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
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DeleteRoleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        role_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 角色ID
        self.role_id = role_id

    def validate(self):
        self.validate_required(self.role_id, 'role_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.role_id is not None:
            result['role_id'] = self.role_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('role_id') is not None:
            self.role_id = m.get('role_id')
        return self


class DeleteRoleResponse(TeaModel):
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


class UpdateRoleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        role_id: str = None,
        name: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 角色ID
        self.role_id = role_id
        # 名称
        self.name = name
        # 描述
        self.description = description

    def validate(self):
        self.validate_required(self.role_id, 'role_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.role_id is not None:
            result['role_id'] = self.role_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('role_id') is not None:
            self.role_id = m.get('role_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class UpdateRoleResponse(TeaModel):
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


class GetDepartmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 部门唯一代码
        self.code = code

    def validate(self):
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class GetDepartmentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        name: str = None,
        description: str = None,
        parent_code: str = None,
        customer_id: str = None,
        is_leaf: bool = None,
        creation_time: str = None,
        update_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 部门唯一代码
        self.code = code
        # 部门名称
        self.name = name
        # 部门描述信息
        self.description = description
        # 父部门 code
        self.parent_code = parent_code
        # 企业 id
        self.customer_id = customer_id
        # 是否为叶子结点
        self.is_leaf = is_leaf
        # 创建时间，ISO8601格式
        self.creation_time = creation_time
        # 更新时间，ISO8601格式
        self.update_time = update_time

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
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.parent_code is not None:
            result['parent_code'] = self.parent_code
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.is_leaf is not None:
            result['is_leaf'] = self.is_leaf
        if self.creation_time is not None:
            result['creation_time'] = self.creation_time
        if self.update_time is not None:
            result['update_time'] = self.update_time
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
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('parent_code') is not None:
            self.parent_code = m.get('parent_code')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('is_leaf') is not None:
            self.is_leaf = m.get('is_leaf')
        if m.get('creation_time') is not None:
            self.creation_time = m.get('creation_time')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class CreateDepartmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        code: str = None,
        name: str = None,
        description: str = None,
        parent_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 部门唯一码
        self.code = code
        # 部门名称
        self.name = name
        # 部门描述信息
        self.description = description
        # 父部门 code，如果需要创建根部门，需填：ROOT
        self.parent_code = parent_code

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.parent_code, 'parent_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.parent_code is not None:
            result['parent_code'] = self.parent_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('parent_code') is not None:
            self.parent_code = m.get('parent_code')
        return self


class CreateDepartmentResponse(TeaModel):
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


class UpdateDepartmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        code: str = None,
        name: str = None,
        description: str = None,
        parent_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 部门唯一码
        self.code = code
        # 部门名称
        self.name = name
        # 部门描述信息
        self.description = description
        # 父部们唯一码
        self.parent_code = parent_code

    def validate(self):
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.parent_code is not None:
            result['parent_code'] = self.parent_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('parent_code') is not None:
            self.parent_code = m.get('parent_code')
        return self


class UpdateDepartmentResponse(TeaModel):
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


class DeleteDepartmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 部门唯一码
        self.code = code

    def validate(self):
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class DeleteDepartmentResponse(TeaModel):
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


class PagequeryDepartmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        code: str = None,
        name: str = None,
        description: str = None,
        parent_code: str = None,
        page_size: int = None,
        page_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 部门唯一码
        self.code = code
        # 部门名称
        self.name = name
        # 部门描述信息
        self.description = description
        # 父部门唯一码
        self.parent_code = parent_code
        # 分页大小
        self.page_size = page_size
        # 当前页
        self.page_num = page_num

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.parent_code is not None:
            result['parent_code'] = self.parent_code
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_num is not None:
            result['page_num'] = self.page_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('parent_code') is not None:
            self.parent_code = m.get('parent_code')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        return self


class PagequeryDepartmentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        departments: List[Department] = None,
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
        # 部门列表
        self.departments = departments
        # 当前页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size
        # 总数
        self.total_count = total_count

    def validate(self):
        if self.departments:
            for k in self.departments:
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
        result['departments'] = []
        if self.departments is not None:
            for k in self.departments:
                result['departments'].append(k.to_map() if k else None)
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
        self.departments = []
        if m.get('departments') is not None:
            for k in m.get('departments'):
                temp_model = Department()
                self.departments.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class BatchqueryDepartmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        codes: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 部门唯一码
        self.codes = codes

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.codes is not None:
            result['codes'] = self.codes
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('codes') is not None:
            self.codes = m.get('codes')
        return self


class BatchqueryDepartmentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        departments: List[Department] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 部门列表
        self.departments = departments

    def validate(self):
        if self.departments:
            for k in self.departments:
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
        result['departments'] = []
        if self.departments is not None:
            for k in self.departments:
                result['departments'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.departments = []
        if m.get('departments') is not None:
            for k in m.get('departments'):
                temp_model = Department()
                self.departments.append(temp_model.from_map(k))
        return self


class SaveDepartmentUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        department_users: List[DepartmentUser] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 待添加或更新的部门成员关系列表
        self.department_users = department_users

    def validate(self):
        self.validate_required(self.department_users, 'department_users')
        if self.department_users:
            for k in self.department_users:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        result['department_users'] = []
        if self.department_users is not None:
            for k in self.department_users:
                result['department_users'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        self.department_users = []
        if m.get('department_users') is not None:
            for k in m.get('department_users'):
                temp_model = DepartmentUser()
                self.department_users.append(temp_model.from_map(k))
        return self


class SaveDepartmentUserResponse(TeaModel):
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


class RemoveDepartmentUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        department_users: List[DepartmentUser] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 待删除的部门成员关系列表
        self.department_users = department_users

    def validate(self):
        self.validate_required(self.department_users, 'department_users')
        if self.department_users:
            for k in self.department_users:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        result['department_users'] = []
        if self.department_users is not None:
            for k in self.department_users:
                result['department_users'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        self.department_users = []
        if m.get('department_users') is not None:
            for k in m.get('department_users'):
                temp_model = DepartmentUser()
                self.department_users.append(temp_model.from_map(k))
        return self


class RemoveDepartmentUserResponse(TeaModel):
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


class QueryDepartmentUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        department_code: str = None,
        user_id: str = None,
        type: str = None,
        page_size: int = None,
        page_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 部门唯一码
        self.department_code = department_code
        # 用户 id
        self.user_id = user_id
        # 部门成员类型
        self.type = type
        # 分页大小
        self.page_size = page_size
        # 当前页
        self.page_num = page_num

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.department_code is not None:
            result['department_code'] = self.department_code
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.type is not None:
            result['type'] = self.type
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_num is not None:
            result['page_num'] = self.page_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('department_code') is not None:
            self.department_code = m.get('department_code')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        return self


class QueryDepartmentUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        department_users: List[DepartmentUser] = None,
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
        # 部门成员列表
        self.department_users = department_users
        # 当前页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size
        # 总数
        self.total_count = total_count

    def validate(self):
        if self.department_users:
            for k in self.department_users:
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
        result['department_users'] = []
        if self.department_users is not None:
            for k in self.department_users:
                result['department_users'].append(k.to_map() if k else None)
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
        self.department_users = []
        if m.get('department_users') is not None:
            for k in m.get('department_users'):
                temp_model = DepartmentUser()
                self.department_users.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class GetLoginconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class GetLoginconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        password_min_length: int = None,
        password_max_length: int = None,
        password_lowercase_letter: bool = None,
        password_uppercase_letter: bool = None,
        password_letter: bool = None,
        password_digit: bool = None,
        password_special_char: bool = None,
        password_valid_check: bool = None,
        password_valid_period: int = None,
        password_expired_login: bool = None,
        password_history_check: bool = None,
        password_history_num: int = None,
        verify_attempts_check: bool = None,
        verify_attempts_window: int = None,
        verify_attempts_threshold: int = None,
        lockout_duration: int = None,
        active_check: bool = None,
        active_period: int = None,
        password_self_manage: bool = None,
        mfa_self_manage: bool = None,
        status: str = None,
        concurrent_ip_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 密码最小长度
        self.password_min_length = password_min_length
        # 密码最大长度
        self.password_max_length = password_max_length
        # 密码是否必须包含小写字母
        self.password_lowercase_letter = password_lowercase_letter
        # 密码是否必须包含大写字母
        self.password_uppercase_letter = password_uppercase_letter
        # 密码是否必须包含字母
        self.password_letter = password_letter
        # 密码是否必须包含数字
        self.password_digit = password_digit
        # 密码是否必须包含特殊字符
        self.password_special_char = password_special_char
        # 是否检查密码有效
        self.password_valid_check = password_valid_check
        # 密码有效期
        self.password_valid_period = password_valid_period
        # 密码过期后是否允许登录
        self.password_expired_login = password_expired_login
        # 是否检查密码历史
        self.password_history_check = password_history_check
        # 密码历史个数
        self.password_history_num = password_history_num
        # 重试校验是否触发锁定
        self.verify_attempts_check = verify_attempts_check
        # 重试校验窗口
        self.verify_attempts_window = verify_attempts_window
        # 重试校验触发锁定阈值
        self.verify_attempts_threshold = verify_attempts_threshold
        # 锁定时间
        self.lockout_duration = lockout_duration
        # 是否检查账户活跃
        self.active_check = active_check
        # 活跃周期，非活跃时锁定登录
        self.active_period = active_period
        # 是否允许自主管理密码
        self.password_self_manage = password_self_manage
        # 是否允许自主管理MFA
        self.mfa_self_manage = mfa_self_manage
        # 状态, 取值范围：NORMAL(正常状态), LOCK(锁定), ONE_PARTY_MIGRATING(一方化迁移中), ONE_PARTY_MIGRATION_LOCK(一方化迁移完成，禁用蚂蚁登录)
        self.status = status
        # 并发登录的ip数量，小于1表示不限制
        self.concurrent_ip_count = concurrent_ip_count

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
        if self.password_min_length is not None:
            result['password_min_length'] = self.password_min_length
        if self.password_max_length is not None:
            result['password_max_length'] = self.password_max_length
        if self.password_lowercase_letter is not None:
            result['password_lowercase_letter'] = self.password_lowercase_letter
        if self.password_uppercase_letter is not None:
            result['password_uppercase_letter'] = self.password_uppercase_letter
        if self.password_letter is not None:
            result['password_letter'] = self.password_letter
        if self.password_digit is not None:
            result['password_digit'] = self.password_digit
        if self.password_special_char is not None:
            result['password_special_char'] = self.password_special_char
        if self.password_valid_check is not None:
            result['password_valid_check'] = self.password_valid_check
        if self.password_valid_period is not None:
            result['password_valid_period'] = self.password_valid_period
        if self.password_expired_login is not None:
            result['password_expired_login'] = self.password_expired_login
        if self.password_history_check is not None:
            result['password_history_check'] = self.password_history_check
        if self.password_history_num is not None:
            result['password_history_num'] = self.password_history_num
        if self.verify_attempts_check is not None:
            result['verify_attempts_check'] = self.verify_attempts_check
        if self.verify_attempts_window is not None:
            result['verify_attempts_window'] = self.verify_attempts_window
        if self.verify_attempts_threshold is not None:
            result['verify_attempts_threshold'] = self.verify_attempts_threshold
        if self.lockout_duration is not None:
            result['lockout_duration'] = self.lockout_duration
        if self.active_check is not None:
            result['active_check'] = self.active_check
        if self.active_period is not None:
            result['active_period'] = self.active_period
        if self.password_self_manage is not None:
            result['password_self_manage'] = self.password_self_manage
        if self.mfa_self_manage is not None:
            result['mfa_self_manage'] = self.mfa_self_manage
        if self.status is not None:
            result['status'] = self.status
        if self.concurrent_ip_count is not None:
            result['concurrent_ip_count'] = self.concurrent_ip_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('password_min_length') is not None:
            self.password_min_length = m.get('password_min_length')
        if m.get('password_max_length') is not None:
            self.password_max_length = m.get('password_max_length')
        if m.get('password_lowercase_letter') is not None:
            self.password_lowercase_letter = m.get('password_lowercase_letter')
        if m.get('password_uppercase_letter') is not None:
            self.password_uppercase_letter = m.get('password_uppercase_letter')
        if m.get('password_letter') is not None:
            self.password_letter = m.get('password_letter')
        if m.get('password_digit') is not None:
            self.password_digit = m.get('password_digit')
        if m.get('password_special_char') is not None:
            self.password_special_char = m.get('password_special_char')
        if m.get('password_valid_check') is not None:
            self.password_valid_check = m.get('password_valid_check')
        if m.get('password_valid_period') is not None:
            self.password_valid_period = m.get('password_valid_period')
        if m.get('password_expired_login') is not None:
            self.password_expired_login = m.get('password_expired_login')
        if m.get('password_history_check') is not None:
            self.password_history_check = m.get('password_history_check')
        if m.get('password_history_num') is not None:
            self.password_history_num = m.get('password_history_num')
        if m.get('verify_attempts_check') is not None:
            self.verify_attempts_check = m.get('verify_attempts_check')
        if m.get('verify_attempts_window') is not None:
            self.verify_attempts_window = m.get('verify_attempts_window')
        if m.get('verify_attempts_threshold') is not None:
            self.verify_attempts_threshold = m.get('verify_attempts_threshold')
        if m.get('lockout_duration') is not None:
            self.lockout_duration = m.get('lockout_duration')
        if m.get('active_check') is not None:
            self.active_check = m.get('active_check')
        if m.get('active_period') is not None:
            self.active_period = m.get('active_period')
        if m.get('password_self_manage') is not None:
            self.password_self_manage = m.get('password_self_manage')
        if m.get('mfa_self_manage') is not None:
            self.mfa_self_manage = m.get('mfa_self_manage')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('concurrent_ip_count') is not None:
            self.concurrent_ip_count = m.get('concurrent_ip_count')
        return self


class UpdateLoginconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        password_min_length: int = None,
        password_max_length: int = None,
        password_lowercase_letter: bool = None,
        password_uppercase_letter: bool = None,
        password_letter: bool = None,
        password_digit: bool = None,
        password_special_char: bool = None,
        password_valid_check: bool = None,
        password_valid_period: int = None,
        password_expired_login: bool = None,
        password_history_check: bool = None,
        password_history_num: int = None,
        verify_attempts_check: bool = None,
        verify_attempts_window: int = None,
        verify_attempts_threshold: int = None,
        lockout_duration: int = None,
        active_check: bool = None,
        active_period: int = None,
        password_self_manage: bool = None,
        mfa_self_manage: bool = None,
        concurrent_ip_count: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 密码最小长度
        self.password_min_length = password_min_length
        # 密码最大长度
        self.password_max_length = password_max_length
        # 密码是否必须包含小写字母
        self.password_lowercase_letter = password_lowercase_letter
        # 密码是否必须包含大写字母
        self.password_uppercase_letter = password_uppercase_letter
        # 密码是否必须包含字母
        self.password_letter = password_letter
        # 密码是否必须包含数字
        self.password_digit = password_digit
        # 密码是否必须包含特殊字符
        self.password_special_char = password_special_char
        # 是否检查密码有效
        self.password_valid_check = password_valid_check
        # 密码有效期
        self.password_valid_period = password_valid_period
        # 密码过期后是否允许登录
        self.password_expired_login = password_expired_login
        # 是否检查密码历史
        self.password_history_check = password_history_check
        # 密码历史个数
        self.password_history_num = password_history_num
        # 重试校验是否触发锁定
        self.verify_attempts_check = verify_attempts_check
        # 重试校验窗口
        self.verify_attempts_window = verify_attempts_window
        # 重试校验触发锁定阈值
        self.verify_attempts_threshold = verify_attempts_threshold
        # 锁定时间
        self.lockout_duration = lockout_duration
        # 是否检查账户活跃
        self.active_check = active_check
        # 活跃周期，非活跃时锁定登录
        self.active_period = active_period
        # 是否允许自主管理密码
        self.password_self_manage = password_self_manage
        # 是否允许自主管理MFA
        self.mfa_self_manage = mfa_self_manage
        # 并发登录的ip数量，小于1表示不限制
        self.concurrent_ip_count = concurrent_ip_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.password_min_length is not None:
            result['password_min_length'] = self.password_min_length
        if self.password_max_length is not None:
            result['password_max_length'] = self.password_max_length
        if self.password_lowercase_letter is not None:
            result['password_lowercase_letter'] = self.password_lowercase_letter
        if self.password_uppercase_letter is not None:
            result['password_uppercase_letter'] = self.password_uppercase_letter
        if self.password_letter is not None:
            result['password_letter'] = self.password_letter
        if self.password_digit is not None:
            result['password_digit'] = self.password_digit
        if self.password_special_char is not None:
            result['password_special_char'] = self.password_special_char
        if self.password_valid_check is not None:
            result['password_valid_check'] = self.password_valid_check
        if self.password_valid_period is not None:
            result['password_valid_period'] = self.password_valid_period
        if self.password_expired_login is not None:
            result['password_expired_login'] = self.password_expired_login
        if self.password_history_check is not None:
            result['password_history_check'] = self.password_history_check
        if self.password_history_num is not None:
            result['password_history_num'] = self.password_history_num
        if self.verify_attempts_check is not None:
            result['verify_attempts_check'] = self.verify_attempts_check
        if self.verify_attempts_window is not None:
            result['verify_attempts_window'] = self.verify_attempts_window
        if self.verify_attempts_threshold is not None:
            result['verify_attempts_threshold'] = self.verify_attempts_threshold
        if self.lockout_duration is not None:
            result['lockout_duration'] = self.lockout_duration
        if self.active_check is not None:
            result['active_check'] = self.active_check
        if self.active_period is not None:
            result['active_period'] = self.active_period
        if self.password_self_manage is not None:
            result['password_self_manage'] = self.password_self_manage
        if self.mfa_self_manage is not None:
            result['mfa_self_manage'] = self.mfa_self_manage
        if self.concurrent_ip_count is not None:
            result['concurrent_ip_count'] = self.concurrent_ip_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('password_min_length') is not None:
            self.password_min_length = m.get('password_min_length')
        if m.get('password_max_length') is not None:
            self.password_max_length = m.get('password_max_length')
        if m.get('password_lowercase_letter') is not None:
            self.password_lowercase_letter = m.get('password_lowercase_letter')
        if m.get('password_uppercase_letter') is not None:
            self.password_uppercase_letter = m.get('password_uppercase_letter')
        if m.get('password_letter') is not None:
            self.password_letter = m.get('password_letter')
        if m.get('password_digit') is not None:
            self.password_digit = m.get('password_digit')
        if m.get('password_special_char') is not None:
            self.password_special_char = m.get('password_special_char')
        if m.get('password_valid_check') is not None:
            self.password_valid_check = m.get('password_valid_check')
        if m.get('password_valid_period') is not None:
            self.password_valid_period = m.get('password_valid_period')
        if m.get('password_expired_login') is not None:
            self.password_expired_login = m.get('password_expired_login')
        if m.get('password_history_check') is not None:
            self.password_history_check = m.get('password_history_check')
        if m.get('password_history_num') is not None:
            self.password_history_num = m.get('password_history_num')
        if m.get('verify_attempts_check') is not None:
            self.verify_attempts_check = m.get('verify_attempts_check')
        if m.get('verify_attempts_window') is not None:
            self.verify_attempts_window = m.get('verify_attempts_window')
        if m.get('verify_attempts_threshold') is not None:
            self.verify_attempts_threshold = m.get('verify_attempts_threshold')
        if m.get('lockout_duration') is not None:
            self.lockout_duration = m.get('lockout_duration')
        if m.get('active_check') is not None:
            self.active_check = m.get('active_check')
        if m.get('active_period') is not None:
            self.active_period = m.get('active_period')
        if m.get('password_self_manage') is not None:
            self.password_self_manage = m.get('password_self_manage')
        if m.get('mfa_self_manage') is not None:
            self.mfa_self_manage = m.get('mfa_self_manage')
        if m.get('concurrent_ip_count') is not None:
            self.concurrent_ip_count = m.get('concurrent_ip_count')
        return self


class UpdateLoginconfigResponse(TeaModel):
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


class GetMfaStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class GetMfaStatusResponse(TeaModel):
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
        # MFA状态, 取值范围：ENABLED, DISABLED
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


class EnableMfaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        verification_code: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户 id
        self.user_id = user_id
        # 验证码
        self.verification_code = verification_code

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.verification_code, 'verification_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.verification_code is not None:
            result['verification_code'] = self.verification_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('verification_code') is not None:
            self.verification_code = m.get('verification_code')
        return self


class EnableMfaResponse(TeaModel):
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


class DisableMfaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        verification_code: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户 id
        self.user_id = user_id
        # 验证码
        self.verification_code = verification_code

    def validate(self):
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.verification_code is not None:
            result['verification_code'] = self.verification_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('verification_code') is not None:
            self.verification_code = m.get('verification_code')
        return self


class DisableMfaResponse(TeaModel):
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


class InitMfaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户 id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class InitMfaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        secret_key: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 密钥
        self.secret_key = secret_key

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
        if self.secret_key is not None:
            result['secret_key'] = self.secret_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('secret_key') is not None:
            self.secret_key = m.get('secret_key')
        return self


class VerifyMfaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        verification_code: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户 id
        self.user_id = user_id
        # 验证码
        self.verification_code = verification_code

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.verification_code, 'verification_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.verification_code is not None:
            result['verification_code'] = self.verification_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('verification_code') is not None:
            self.verification_code = m.get('verification_code')
        return self


class VerifyMfaResponse(TeaModel):
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
        # 校验结果
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


class GetMfaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户 id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class GetMfaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_id: str = None,
        status: str = None,
        secret_key: str = None,
        last_generated_time: str = None,
        verify_attempts: int = None,
        first_failure_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户 id
        self.user_id = user_id
        # MFA状态, 取值范围：ENABLED, DISABLED
        self.status = status
        # 密钥
        self.secret_key = secret_key
        # 最后一次密钥生成时间
        self.last_generated_time = last_generated_time
        # (校验失败时)重试校验的次数
        self.verify_attempts = verify_attempts
        # 第一次校验失败时间
        self.first_failure_time = first_failure_time

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
        if self.status is not None:
            result['status'] = self.status
        if self.secret_key is not None:
            result['secret_key'] = self.secret_key
        if self.last_generated_time is not None:
            result['last_generated_time'] = self.last_generated_time
        if self.verify_attempts is not None:
            result['verify_attempts'] = self.verify_attempts
        if self.first_failure_time is not None:
            result['first_failure_time'] = self.first_failure_time
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
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('secret_key') is not None:
            self.secret_key = m.get('secret_key')
        if m.get('last_generated_time') is not None:
            self.last_generated_time = m.get('last_generated_time')
        if m.get('verify_attempts') is not None:
            self.verify_attempts = m.get('verify_attempts')
        if m.get('first_failure_time') is not None:
            self.first_failure_time = m.get('first_failure_time')
        return self


class UpdateOperatorPasswordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        login_name: str = None,
        new_encrypted_password: str = None,
        old_encrypted_password: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 登录名
        self.login_name = login_name
        # 加密过的新密码值，使用AccessSecret进行3DES加密
        self.new_encrypted_password = new_encrypted_password
        # 加密过的旧密码值，使用AccessSecret进行DES加密
        self.old_encrypted_password = old_encrypted_password

    def validate(self):
        self.validate_required(self.login_name, 'login_name')
        self.validate_required(self.new_encrypted_password, 'new_encrypted_password')
        self.validate_required(self.old_encrypted_password, 'old_encrypted_password')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.new_encrypted_password is not None:
            result['new_encrypted_password'] = self.new_encrypted_password
        if self.old_encrypted_password is not None:
            result['old_encrypted_password'] = self.old_encrypted_password
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('new_encrypted_password') is not None:
            self.new_encrypted_password = m.get('new_encrypted_password')
        if m.get('old_encrypted_password') is not None:
            self.old_encrypted_password = m.get('old_encrypted_password')
        return self


class UpdateOperatorPasswordResponse(TeaModel):
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


class ResetOperatorPasswordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        login_name: str = None,
        new_encrypted_password: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 登录名
        self.login_name = login_name
        # 加密过的新密码值，使用AccessSecret进行3DES加密
        self.new_encrypted_password = new_encrypted_password
        # 登录凭证状态，取值范围：NORMAL, EXPIRED
        # 
        # 默认为 NORMAL，设为 EXPIRED 用户登录时会要求重置密码
        self.status = status

    def validate(self):
        self.validate_required(self.login_name, 'login_name')
        self.validate_required(self.new_encrypted_password, 'new_encrypted_password')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.new_encrypted_password is not None:
            result['new_encrypted_password'] = self.new_encrypted_password
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('new_encrypted_password') is not None:
            self.new_encrypted_password = m.get('new_encrypted_password')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ResetOperatorPasswordResponse(TeaModel):
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


class BatchqueryOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_ids: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户id列表
        self.operator_ids = operator_ids

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_ids is not None:
            result['operator_ids'] = self.operator_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_ids') is not None:
            self.operator_ids = m.get('operator_ids')
        return self


class BatchqueryOperatorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        operators: List[Operator] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作员列表
        self.operators = operators

    def validate(self):
        if self.operators:
            for k in self.operators:
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
        result['operators'] = []
        if self.operators is not None:
            for k in self.operators:
                result['operators'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.operators = []
        if m.get('operators') is not None:
            for k in m.get('operators'):
                temp_model = Operator()
                self.operators.append(temp_model.from_map(k))
        return self


class PushOperationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operation_code: str = None,
        params: str = None,
        region: str = None,
        resource_id: str = None,
        resource_type: str = None,
        response: str = None,
        source: str = None,
        source_ip_address: str = None,
        time: str = None,
        trace_id: str = None,
        user_agent: str = None,
        user_id: str = None,
        user_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # {产品}.{资源}.{子资源}.{操作}
        self.operation_code = operation_code
        # 操作参数
        self.params = params
        # 可用区域信息，非必填
        self.region = region
        # 资源ID
        self.resource_id = resource_id
        # 资源类型
        self.resource_type = resource_type
        # 相应结果
        self.response = response
        # 操作来源，由接入方上报自身系统host
        self.source = source
        # 操作来源IP，由接入方上报
        self.source_ip_address = source_ip_address
        # 触发时间
        self.time = time
        # TraceId用于事件追踪
        self.trace_id = trace_id
        # agent信息
        self.user_agent = user_agent
        # 用户ID
        self.user_id = user_id
        # 租户8位ID
        self.user_tenant = user_tenant

    def validate(self):
        self.validate_required(self.operation_code, 'operation_code')
        self.validate_required(self.params, 'params')
        self.validate_required(self.time, 'time')
        if self.time is not None:
            self.validate_pattern(self.time, 'time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_tenant, 'user_tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operation_code is not None:
            result['operation_code'] = self.operation_code
        if self.params is not None:
            result['params'] = self.params
        if self.region is not None:
            result['region'] = self.region
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        if self.response is not None:
            result['response'] = self.response
        if self.source is not None:
            result['source'] = self.source
        if self.source_ip_address is not None:
            result['source_ip_address'] = self.source_ip_address
        if self.time is not None:
            result['time'] = self.time
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.user_agent is not None:
            result['user_agent'] = self.user_agent
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_tenant is not None:
            result['user_tenant'] = self.user_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operation_code') is not None:
            self.operation_code = m.get('operation_code')
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('region') is not None:
            self.region = m.get('region')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        if m.get('response') is not None:
            self.response = m.get('response')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('source_ip_address') is not None:
            self.source_ip_address = m.get('source_ip_address')
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('user_agent') is not None:
            self.user_agent = m.get('user_agent')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_tenant') is not None:
            self.user_tenant = m.get('user_tenant')
        return self


class PushOperationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        unique_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 事件唯一ID
        self.unique_id = unique_id

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
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class QueryOperationtypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product: str = None,
        source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.product = product
        # 来源信息
        self.source = source

    def validate(self):
        self.validate_required(self.product, 'product')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product is not None:
            result['product'] = self.product
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product') is not None:
            self.product = m.get('product')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class QueryOperationtypeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        operation_types: List[OperationType] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作类型列表
        self.operation_types = operation_types

    def validate(self):
        if self.operation_types:
            for k in self.operation_types:
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
        result['operation_types'] = []
        if self.operation_types is not None:
            for k in self.operation_types:
                result['operation_types'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.operation_types = []
        if m.get('operation_types') is not None:
            for k in m.get('operation_types'):
                temp_model = OperationType()
                self.operation_types.append(temp_model.from_map(k))
        return self


class GetOperationtypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作类型名称
        self.name = name

    def validate(self):
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class GetOperationtypeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: OperationType = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作类型
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
            temp_model = OperationType()
            self.data = temp_model.from_map(m['data'])
        return self


class AddTenantMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作员唯一id
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class AddTenantMemberResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_key: str = None,
        access_secret: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # Accessor关联的AccessKey
        self.access_key = access_key
        # Accessor关联的AccessKey的密钥
        self.access_secret = access_secret

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
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        return self


class GetOperatorLogintokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class GetOperatorLogintokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        login_token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 一次性登录认证 token
        self.login_token = login_token

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
        if self.login_token is not None:
            result['login_token'] = self.login_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('login_token') is not None:
            self.login_token = m.get('login_token')
        return self


class ApplyTrustloginTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        source_system: str = None,
        login_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户ID
        self.user_id = user_id
        # 系统来源
        self.source_system = source_system
        # 登录账号
        self.login_name = login_name

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.source_system, 'source_system')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.source_system is not None:
            result['source_system'] = self.source_system
        if self.login_name is not None:
            result['login_name'] = self.login_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('source_system') is not None:
            self.source_system = m.get('source_system')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class ApplyTrustloginTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_token: str = None,
        user_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用于登录的token
        self.access_token = access_token
        # 用户ID
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
        if self.access_token is not None:
            result['access_token'] = self.access_token
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
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class VerifyTrustloginTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        source_system: str = None,
        access_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户ID
        self.user_id = user_id
        # 系统来源
        self.source_system = source_system
        # 申请免密登录时获取的token
        self.access_token = access_token

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.source_system, 'source_system')
        self.validate_required(self.access_token, 'access_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.source_system is not None:
            result['source_system'] = self.source_system
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('source_system') is not None:
            self.source_system = m.get('source_system')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class VerifyTrustloginTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_id: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户ID
        self.user_id = user_id
        # 验证结果，valid有效，invalid无效
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
        if self.user_id is not None:
            result['user_id'] = self.user_id
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
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


