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


class RegistryInfoVO(TeaModel):
    def __init__(
        self,
        workspace_id: str = None,
        tenant_id: str = None,
        registry_id: str = None,
        registry_type: str = None,
        registry_name: str = None,
        access_key: str = None,
        secret_key: str = None,
        sys_count: int = None,
        host: List[str] = None,
        can_delete: bool = None,
        port: int = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        operator: str = None,
        pub_protocol: str = None,
        can_update: bool = None,
        registry_group: str = None,
        protocol_version: str = None,
        name_space: str = None,
        cluster_name: str = None,
    ):
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id
        # 注册中心标识
        self.registry_id = registry_id
        # 注册中心类型
        self.registry_type = registry_type
        # 名称
        self.registry_name = registry_name
        # access_key
        self.access_key = access_key
        # secret_key
        self.secret_key = secret_key
        # 集群数量
        self.sys_count = sys_count
        # host
        self.host = host
        # can_delete
        self.can_delete = can_delete
        # port
        self.port = port
        # gmt_create
        self.gmt_create = gmt_create
        # gmt_modified
        self.gmt_modified = gmt_modified
        # operator
        self.operator = operator
        # pub协议标识
        self.pub_protocol = pub_protocol
        # can_update
        self.can_update = can_update
        # 注册中心分组
        self.registry_group = registry_group
        # 协议版本
        self.protocol_version = protocol_version
        # 命名空间
        self.name_space = name_space
        # 集群名称
        self.cluster_name = cluster_name

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.registry_id is not None:
            result['registry_id'] = self.registry_id
        if self.registry_type is not None:
            result['registry_type'] = self.registry_type
        if self.registry_name is not None:
            result['registry_name'] = self.registry_name
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.secret_key is not None:
            result['secret_key'] = self.secret_key
        if self.sys_count is not None:
            result['sys_count'] = self.sys_count
        if self.host is not None:
            result['host'] = self.host
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.port is not None:
            result['port'] = self.port
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.operator is not None:
            result['operator'] = self.operator
        if self.pub_protocol is not None:
            result['pub_protocol'] = self.pub_protocol
        if self.can_update is not None:
            result['can_update'] = self.can_update
        if self.registry_group is not None:
            result['registry_group'] = self.registry_group
        if self.protocol_version is not None:
            result['protocol_version'] = self.protocol_version
        if self.name_space is not None:
            result['name_space'] = self.name_space
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('registry_id') is not None:
            self.registry_id = m.get('registry_id')
        if m.get('registry_type') is not None:
            self.registry_type = m.get('registry_type')
        if m.get('registry_name') is not None:
            self.registry_name = m.get('registry_name')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('secret_key') is not None:
            self.secret_key = m.get('secret_key')
        if m.get('sys_count') is not None:
            self.sys_count = m.get('sys_count')
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('port') is not None:
            self.port = m.get('port')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('pub_protocol') is not None:
            self.pub_protocol = m.get('pub_protocol')
        if m.get('can_update') is not None:
            self.can_update = m.get('can_update')
        if m.get('registry_group') is not None:
            self.registry_group = m.get('registry_group')
        if m.get('protocol_version') is not None:
            self.protocol_version = m.get('protocol_version')
        if m.get('name_space') is not None:
            self.name_space = m.get('name_space')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        return self


class AuthenticationConfigVO(TeaModel):
    def __init__(
        self,
        access_key: str = None,
        secret_key: str = None,
    ):
        # access_key
        self.access_key = access_key
        # secret_key
        self.secret_key = secret_key

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.secret_key is not None:
            result['secret_key'] = self.secret_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('secret_key') is not None:
            self.secret_key = m.get('secret_key')
        return self


class SystemClusterVO(TeaModel):
    def __init__(
        self,
        api_count: int = None,
        authentication_config: AuthenticationConfigVO = None,
        authentication_type: str = None,
        can_delete: bool = None,
        description: str = None,
        external_auth_count: int = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        host: List[str] = None,
        lb_type: str = None,
        operator: str = None,
        port: int = None,
        instance_id: str = None,
        sys_id: str = None,
        sys_name: str = None,
        sys_type: str = None,
        tenant_id: str = None,
        unique_id: str = None,
        upstream_protocol: str = None,
        url_type: str = None,
        vpc_id: str = None,
        workspace_id: str = None,
        registry_id: str = None,
        registry_info: RegistryInfoVO = None,
        triple_host: str = None,
        need_tls: bool = None,
        tls_type: str = None,
    ):
        # api数
        self.api_count = api_count
        # 认证配置
        self.authentication_config = authentication_config
        # 认证方式
        self.authentication_type = authentication_type
        # 是否可以删除
        self.can_delete = can_delete
        # 描述
        self.description = description
        # 绑定的外部授权数量
        self.external_auth_count = external_auth_count
        # gmt_create
        self.gmt_create = gmt_create
        # gmt_modified
        self.gmt_modified = gmt_modified
        # 系统host地址
        self.host = host
        # 负载均衡策略类型
        self.lb_type = lb_type
        # 创建人
        self.operator = operator
        # 端口
        self.port = port
        # 实例id
        self.instance_id = instance_id
        # sys_id
        self.sys_id = sys_id
        # sys_name
        self.sys_name = sys_name
        # 系统类型(手工配置/sofa注册中心/zk)
        self.sys_type = sys_type
        # tenant_id
        self.tenant_id = tenant_id
        # unique_id
        self.unique_id = unique_id
        # upstream_protocol
        self.upstream_protocol = upstream_protocol
        # 下发协议的开头
        self.url_type = url_type
        # vpc_id
        self.vpc_id = vpc_id
        # workspace_id
        self.workspace_id = workspace_id
        # registry_id
        self.registry_id = registry_id
        # registry_info
        self.registry_info = registry_info
        # triple域名
        self.triple_host = triple_host
        # need_tls
        self.need_tls = need_tls
        # 证书类型
        self.tls_type = tls_type

    def validate(self):
        if self.authentication_config:
            self.authentication_config.validate()
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.registry_info:
            self.registry_info.validate()

    def to_map(self):
        result = dict()
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.authentication_config is not None:
            result['authentication_config'] = self.authentication_config.to_map()
        if self.authentication_type is not None:
            result['authentication_type'] = self.authentication_type
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.description is not None:
            result['description'] = self.description
        if self.external_auth_count is not None:
            result['external_auth_count'] = self.external_auth_count
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.host is not None:
            result['host'] = self.host
        if self.lb_type is not None:
            result['lb_type'] = self.lb_type
        if self.operator is not None:
            result['operator'] = self.operator
        if self.port is not None:
            result['port'] = self.port
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.sys_id is not None:
            result['sys_id'] = self.sys_id
        if self.sys_name is not None:
            result['sys_name'] = self.sys_name
        if self.sys_type is not None:
            result['sys_type'] = self.sys_type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.upstream_protocol is not None:
            result['upstream_protocol'] = self.upstream_protocol
        if self.url_type is not None:
            result['url_type'] = self.url_type
        if self.vpc_id is not None:
            result['vpc_id'] = self.vpc_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.registry_id is not None:
            result['registry_id'] = self.registry_id
        if self.registry_info is not None:
            result['registry_info'] = self.registry_info.to_map()
        if self.triple_host is not None:
            result['triple_host'] = self.triple_host
        if self.need_tls is not None:
            result['need_tls'] = self.need_tls
        if self.tls_type is not None:
            result['tls_type'] = self.tls_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('authentication_config') is not None:
            temp_model = AuthenticationConfigVO()
            self.authentication_config = temp_model.from_map(m['authentication_config'])
        if m.get('authentication_type') is not None:
            self.authentication_type = m.get('authentication_type')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('external_auth_count') is not None:
            self.external_auth_count = m.get('external_auth_count')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('lb_type') is not None:
            self.lb_type = m.get('lb_type')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('port') is not None:
            self.port = m.get('port')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('sys_id') is not None:
            self.sys_id = m.get('sys_id')
        if m.get('sys_name') is not None:
            self.sys_name = m.get('sys_name')
        if m.get('sys_type') is not None:
            self.sys_type = m.get('sys_type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('upstream_protocol') is not None:
            self.upstream_protocol = m.get('upstream_protocol')
        if m.get('url_type') is not None:
            self.url_type = m.get('url_type')
        if m.get('vpc_id') is not None:
            self.vpc_id = m.get('vpc_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('registry_id') is not None:
            self.registry_id = m.get('registry_id')
        if m.get('registry_info') is not None:
            temp_model = RegistryInfoVO()
            self.registry_info = temp_model.from_map(m['registry_info'])
        if m.get('triple_host') is not None:
            self.triple_host = m.get('triple_host')
        if m.get('need_tls') is not None:
            self.need_tls = m.get('need_tls')
        if m.get('tls_type') is not None:
            self.tls_type = m.get('tls_type')
        return self


class ProtocolVO(TeaModel):
    def __init__(
        self,
        protocol: str = None,
        port: str = None,
    ):
        # 协议类型
        self.protocol = protocol
        # 端口
        self.port = port

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.port is not None:
            result['port'] = self.port
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('port') is not None:
            self.port = m.get('port')
        return self


class EncryptConfigVO(TeaModel):
    def __init__(
        self,
        app_id: str = None,
        encryption_status: str = None,
        encrypt_type: str = None,
        key_pair: str = None,
        private_key: str = None,
        pub_key: str = None,
        workspace_id: str = None,
    ):
        # app_id
        self.app_id = app_id
        # 加密状态
        self.encryption_status = encryption_status
        # 加密类型
        self.encrypt_type = encrypt_type
        # key_pair
        self.key_pair = key_pair
        # private_key
        self.private_key = private_key
        # pub_key
        self.pub_key = pub_key
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.encryption_status is not None:
            result['encryption_status'] = self.encryption_status
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.key_pair is not None:
            result['key_pair'] = self.key_pair
        if self.private_key is not None:
            result['private_key'] = self.private_key
        if self.pub_key is not None:
            result['pub_key'] = self.pub_key
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('encryption_status') is not None:
            self.encryption_status = m.get('encryption_status')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('key_pair') is not None:
            self.key_pair = m.get('key_pair')
        if m.get('private_key') is not None:
            self.private_key = m.get('private_key')
        if m.get('pub_key') is not None:
            self.pub_key = m.get('pub_key')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class RouterConfigVO(TeaModel):
    def __init__(
        self,
        arg_key: str = None,
        arg_value: str = None,
        match_type: str = None,
        param_location: str = None,
        router_type: str = None,
        system_cluster: SystemClusterVO = None,
        sys_id: str = None,
        weight: int = None,
        interception_rule: str = None,
    ):
        # argKey
        self.arg_key = arg_key
        # argValue
        self.arg_value = arg_value
        # matchType
        self.match_type = match_type
        # param_location
        self.param_location = param_location
        # router_type
        self.router_type = router_type
        # systemCluster
        self.system_cluster = system_cluster
        # sys_id
        self.sys_id = sys_id
        # weight
        self.weight = weight
        # interceptionRule
        self.interception_rule = interception_rule

    def validate(self):
        if self.system_cluster:
            self.system_cluster.validate()

    def to_map(self):
        result = dict()
        if self.arg_key is not None:
            result['arg_key'] = self.arg_key
        if self.arg_value is not None:
            result['arg_value'] = self.arg_value
        if self.match_type is not None:
            result['match_type'] = self.match_type
        if self.param_location is not None:
            result['param_location'] = self.param_location
        if self.router_type is not None:
            result['router_type'] = self.router_type
        if self.system_cluster is not None:
            result['system_cluster'] = self.system_cluster.to_map()
        if self.sys_id is not None:
            result['sys_id'] = self.sys_id
        if self.weight is not None:
            result['weight'] = self.weight
        if self.interception_rule is not None:
            result['interception_rule'] = self.interception_rule
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('arg_key') is not None:
            self.arg_key = m.get('arg_key')
        if m.get('arg_value') is not None:
            self.arg_value = m.get('arg_value')
        if m.get('match_type') is not None:
            self.match_type = m.get('match_type')
        if m.get('param_location') is not None:
            self.param_location = m.get('param_location')
        if m.get('router_type') is not None:
            self.router_type = m.get('router_type')
        if m.get('system_cluster') is not None:
            temp_model = SystemClusterVO()
            self.system_cluster = temp_model.from_map(m['system_cluster'])
        if m.get('sys_id') is not None:
            self.sys_id = m.get('sys_id')
        if m.get('weight') is not None:
            self.weight = m.get('weight')
        if m.get('interception_rule') is not None:
            self.interception_rule = m.get('interception_rule')
        return self


class ApiRspCodeVO(TeaModel):
    def __init__(
        self,
        error_code: str = None,
        error_msg: str = None,
        error_desc: str = None,
    ):
        # error_code
        self.error_code = error_code
        # error_msg
        self.error_msg = error_msg
        # error_desc
        self.error_desc = error_desc

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.error_desc is not None:
            result['error_desc'] = self.error_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('error_desc') is not None:
            self.error_desc = m.get('error_desc')
        return self


class ApiGroupDomainVO(TeaModel):
    def __init__(
        self,
        gmt_create: str = None,
        gmt_modified: str = None,
        api_group_id: str = None,
        domain_name: str = None,
    ):
        # gmt_create
        self.gmt_create = gmt_create
        # gmt_modified
        self.gmt_modified = gmt_modified
        # api_group_id
        self.api_group_id = api_group_id
        # domain_name
        self.domain_name = domain_name

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.domain_name is not None:
            result['domain_name'] = self.domain_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('domain_name') is not None:
            self.domain_name = m.get('domain_name')
        return self


class RouterInfoVO(TeaModel):
    def __init__(
        self,
        api_count: int = None,
        can_delete: bool = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        operator: str = None,
        router_configs: List[RouterConfigVO] = None,
        router_id: str = None,
        router_name: str = None,
        router_type: str = None,
        upstream_protocol: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # api数
        self.api_count = api_count
        # 是否可以删除
        self.can_delete = can_delete
        # 创建时间
        self.gmt_create = gmt_create
        # 更改时间
        self.gmt_modified = gmt_modified
        # operator
        self.operator = operator
        # routerConfigs
        self.router_configs = router_configs
        # router_id
        self.router_id = router_id
        # routerName
        self.router_name = router_name
        # routerType
        self.router_type = router_type
        # upstream_protocol
        self.upstream_protocol = upstream_protocol
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.router_configs:
            for k in self.router_configs:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.operator is not None:
            result['operator'] = self.operator
        result['router_configs'] = []
        if self.router_configs is not None:
            for k in self.router_configs:
                result['router_configs'].append(k.to_map() if k else None)
        if self.router_id is not None:
            result['router_id'] = self.router_id
        if self.router_name is not None:
            result['router_name'] = self.router_name
        if self.router_type is not None:
            result['router_type'] = self.router_type
        if self.upstream_protocol is not None:
            result['upstream_protocol'] = self.upstream_protocol
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        self.router_configs = []
        if m.get('router_configs') is not None:
            for k in m.get('router_configs'):
                temp_model = RouterConfigVO()
                self.router_configs.append(temp_model.from_map(k))
        if m.get('router_id') is not None:
            self.router_id = m.get('router_id')
        if m.get('router_name') is not None:
            self.router_name = m.get('router_name')
        if m.get('router_type') is not None:
            self.router_type = m.get('router_type')
        if m.get('upstream_protocol') is not None:
            self.upstream_protocol = m.get('upstream_protocol')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AppInfoVO(TeaModel):
    def __init__(
        self,
        api_count: int = None,
        app_id: str = None,
        app_name: str = None,
        app_secret: str = None,
        app_type: str = None,
        authentication_config: AuthenticationConfigVO = None,
        can_delete: bool = None,
        description: str = None,
        encrypt_config: EncryptConfigVO = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        operator: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # api_count
        self.api_count = api_count
        # app_id
        self.app_id = app_id
        # app_name
        self.app_name = app_name
        # appSecret
        self.app_secret = app_secret
        # app类型
        self.app_type = app_type
        # authenticationConfig
        self.authentication_config = authentication_config
        # 是否可以删除
        self.can_delete = can_delete
        # description
        self.description = description
        # encryptConfig
        self.encrypt_config = encrypt_config
        # 创建时间
        self.gmt_create = gmt_create
        # 更改时间
        self.gmt_modified = gmt_modified
        # operator
        self.operator = operator
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.authentication_config:
            self.authentication_config.validate()
        if self.encrypt_config:
            self.encrypt_config.validate()
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.app_secret is not None:
            result['app_secret'] = self.app_secret
        if self.app_type is not None:
            result['app_type'] = self.app_type
        if self.authentication_config is not None:
            result['authentication_config'] = self.authentication_config.to_map()
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.description is not None:
            result['description'] = self.description
        if self.encrypt_config is not None:
            result['encrypt_config'] = self.encrypt_config.to_map()
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.operator is not None:
            result['operator'] = self.operator
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('app_secret') is not None:
            self.app_secret = m.get('app_secret')
        if m.get('app_type') is not None:
            self.app_type = m.get('app_type')
        if m.get('authentication_config') is not None:
            temp_model = AuthenticationConfigVO()
            self.authentication_config = temp_model.from_map(m['authentication_config'])
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('encrypt_config') is not None:
            temp_model = EncryptConfigVO()
            self.encrypt_config = temp_model.from_map(m['encrypt_config'])
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class RegistryVO(TeaModel):
    def __init__(
        self,
        host: str = None,
        protocol_support: List[ProtocolVO] = None,
        type: str = None,
    ):
        # host
        self.host = host
        # protocol_support
        self.protocol_support = protocol_support
        # 注册中心类型
        self.type = type

    def validate(self):
        if self.protocol_support:
            for k in self.protocol_support:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.host is not None:
            result['host'] = self.host
        result['protocol_support'] = []
        if self.protocol_support is not None:
            for k in self.protocol_support:
                result['protocol_support'].append(k.to_map() if k else None)
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('host') is not None:
            self.host = m.get('host')
        self.protocol_support = []
        if m.get('protocol_support') is not None:
            for k in m.get('protocol_support'):
                temp_model = ProtocolVO()
                self.protocol_support.append(temp_model.from_map(k))
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ApiParamVO(TeaModel):
    def __init__(
        self,
        api_id: str = None,
        default_value: str = None,
        description: str = None,
        failure_demo: str = None,
        location: str = None,
        name: str = None,
        ref_type: str = None,
        required: bool = None,
        rsp_code_list: List[ApiRspCodeVO] = None,
        success_demo: str = None,
        type: str = None,
        upstream_location: str = None,
        upstream_name: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # API标识
        self.api_id = api_id
        # default_value
        self.default_value = default_value
        # description
        self.description = description
        # failure_demo
        self.failure_demo = failure_demo
        # location
        self.location = location
        # name
        self.name = name
        # 引用的模型类型
        self.ref_type = ref_type
        # 是否必填
        self.required = required
        # rsp_code_list
        self.rsp_code_list = rsp_code_list
        # success_demo
        self.success_demo = success_demo
        # 数据类型
        self.type = type
        # upstreamLocation
        self.upstream_location = upstream_location
        # upstream_name
        self.upstream_name = upstream_name
        # 工作空间标识
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        if self.rsp_code_list:
            for k in self.rsp_code_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.default_value is not None:
            result['default_value'] = self.default_value
        if self.description is not None:
            result['description'] = self.description
        if self.failure_demo is not None:
            result['failure_demo'] = self.failure_demo
        if self.location is not None:
            result['location'] = self.location
        if self.name is not None:
            result['name'] = self.name
        if self.ref_type is not None:
            result['ref_type'] = self.ref_type
        if self.required is not None:
            result['required'] = self.required
        result['rsp_code_list'] = []
        if self.rsp_code_list is not None:
            for k in self.rsp_code_list:
                result['rsp_code_list'].append(k.to_map() if k else None)
        if self.success_demo is not None:
            result['success_demo'] = self.success_demo
        if self.type is not None:
            result['type'] = self.type
        if self.upstream_location is not None:
            result['upstream_location'] = self.upstream_location
        if self.upstream_name is not None:
            result['upstream_name'] = self.upstream_name
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('default_value') is not None:
            self.default_value = m.get('default_value')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('failure_demo') is not None:
            self.failure_demo = m.get('failure_demo')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('ref_type') is not None:
            self.ref_type = m.get('ref_type')
        if m.get('required') is not None:
            self.required = m.get('required')
        self.rsp_code_list = []
        if m.get('rsp_code_list') is not None:
            for k in m.get('rsp_code_list'):
                temp_model = ApiRspCodeVO()
                self.rsp_code_list.append(temp_model.from_map(k))
        if m.get('success_demo') is not None:
            self.success_demo = m.get('success_demo')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('upstream_location') is not None:
            self.upstream_location = m.get('upstream_location')
        if m.get('upstream_name') is not None:
            self.upstream_name = m.get('upstream_name')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class ApiModelParamVO(TeaModel):
    def __init__(
        self,
        default_value: str = None,
        description: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        model_id: str = None,
        operation: str = None,
        param_id: str = None,
        param_name: str = None,
        param_type: str = None,
        ref_model_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # 默认值
        self.default_value = default_value
        # 描述
        self.description = description
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 模型id
        self.model_id = model_id
        # 模型提交 操作
        self.operation = operation
        # 模型参数id（唯一标识）
        self.param_id = param_id
        # 参数名
        self.param_name = param_name
        # 参数类型
        self.param_type = param_type
        # 引用模型id
        self.ref_model_id = ref_model_id
        # 工作空间标识
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.default_value is not None:
            result['default_value'] = self.default_value
        if self.description is not None:
            result['description'] = self.description
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.operation is not None:
            result['operation'] = self.operation
        if self.param_id is not None:
            result['param_id'] = self.param_id
        if self.param_name is not None:
            result['param_name'] = self.param_name
        if self.param_type is not None:
            result['param_type'] = self.param_type
        if self.ref_model_id is not None:
            result['ref_model_id'] = self.ref_model_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('default_value') is not None:
            self.default_value = m.get('default_value')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('operation') is not None:
            self.operation = m.get('operation')
        if m.get('param_id') is not None:
            self.param_id = m.get('param_id')
        if m.get('param_name') is not None:
            self.param_name = m.get('param_name')
        if m.get('param_type') is not None:
            self.param_type = m.get('param_type')
        if m.get('ref_model_id') is not None:
            self.ref_model_id = m.get('ref_model_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ApiCacheKeyVO(TeaModel):
    def __init__(
        self,
        key: str = None,
        location: str = None,
    ):
        # key
        self.key = key
        # location
        self.location = location

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.location is not None:
            result['location'] = self.location
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('location') is not None:
            self.location = m.get('location')
        return self


class ApiGroupVO(TeaModel):
    def __init__(
        self,
        api_count: int = None,
        api_group_id: str = None,
        auth_user_switch: str = None,
        can_delete: bool = None,
        description: str = None,
        domain_name: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        group_name: str = None,
        need_api_auth_user: bool = None,
        operator: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        operation_permission: bool = None,
        domain_type: str = None,
        domain_list: List[ApiGroupDomainVO] = None,
    ):
        # api数
        self.api_count = api_count
        # 分组标识(全局唯一)
        self.api_group_id = api_group_id
        # 用户授权开关
        self.auth_user_switch = auth_user_switch
        # 是否可以删除
        self.can_delete = can_delete
        # 描述
        self.description = description
        # 域名
        self.domain_name = domain_name
        # 创建时间
        self.gmt_create = gmt_create
        # 更改时间
        self.gmt_modified = gmt_modified
        # 分组名
        self.group_name = group_name
        # need_api_auth_user
        self.need_api_auth_user = need_api_auth_user
        # 创建人
        self.operator = operator
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # 是否可操作
        self.operation_permission = operation_permission
        # DEFAULT|CUSTOM
        self.domain_type = domain_type
        # 自定义域名
        self.domain_list = domain_list

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.domain_list:
            for k in self.domain_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.auth_user_switch is not None:
            result['auth_user_switch'] = self.auth_user_switch
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.description is not None:
            result['description'] = self.description
        if self.domain_name is not None:
            result['domain_name'] = self.domain_name
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.group_name is not None:
            result['group_name'] = self.group_name
        if self.need_api_auth_user is not None:
            result['need_api_auth_user'] = self.need_api_auth_user
        if self.operator is not None:
            result['operator'] = self.operator
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.operation_permission is not None:
            result['operation_permission'] = self.operation_permission
        if self.domain_type is not None:
            result['domain_type'] = self.domain_type
        result['domain_list'] = []
        if self.domain_list is not None:
            for k in self.domain_list:
                result['domain_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('auth_user_switch') is not None:
            self.auth_user_switch = m.get('auth_user_switch')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('domain_name') is not None:
            self.domain_name = m.get('domain_name')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('group_name') is not None:
            self.group_name = m.get('group_name')
        if m.get('need_api_auth_user') is not None:
            self.need_api_auth_user = m.get('need_api_auth_user')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('operation_permission') is not None:
            self.operation_permission = m.get('operation_permission')
        if m.get('domain_type') is not None:
            self.domain_type = m.get('domain_type')
        self.domain_list = []
        if m.get('domain_list') is not None:
            for k in m.get('domain_list'):
                temp_model = ApiGroupDomainVO()
                self.domain_list.append(temp_model.from_map(k))
        return self


class AuthAppInfoVO(TeaModel):
    def __init__(
        self,
        api_count: int = None,
        app_type: str = None,
        auth_app_info_id: str = None,
        auth_app_type: str = None,
        can_delete: bool = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        operator: str = None,
        sub_app_company: str = None,
        sub_app_desc: str = None,
        sub_app_id: str = None,
        sub_app_info: AppInfoVO = None,
        sub_tenant_id: str = None,
        sub_workspace_id: str = None,
        api_id: str = None,
        app_name: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # api数
        self.api_count = api_count
        # 应用类型
        self.app_type = app_type
        # auth_app_info_id
        self.auth_app_info_id = auth_app_info_id
        # authAppType
        self.auth_app_type = auth_app_type
        # 是否可以删除
        self.can_delete = can_delete
        # 创建时间
        self.gmt_create = gmt_create
        # 更改时间
        self.gmt_modified = gmt_modified
        # operator
        self.operator = operator
        # subAppCompany
        self.sub_app_company = sub_app_company
        # subAppDesc
        self.sub_app_desc = sub_app_desc
        # 订阅方appid
        self.sub_app_id = sub_app_id
        # sub_app_info
        self.sub_app_info = sub_app_info
        # subTenantId
        self.sub_tenant_id = sub_tenant_id
        # subWorkspaceId
        self.sub_workspace_id = sub_workspace_id
        # api标识
        self.api_id = api_id
        # 应用名称
        self.app_name = app_name
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.sub_app_info:
            self.sub_app_info.validate()

    def to_map(self):
        result = dict()
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.app_type is not None:
            result['app_type'] = self.app_type
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
        if self.auth_app_type is not None:
            result['auth_app_type'] = self.auth_app_type
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.operator is not None:
            result['operator'] = self.operator
        if self.sub_app_company is not None:
            result['sub_app_company'] = self.sub_app_company
        if self.sub_app_desc is not None:
            result['sub_app_desc'] = self.sub_app_desc
        if self.sub_app_id is not None:
            result['sub_app_id'] = self.sub_app_id
        if self.sub_app_info is not None:
            result['sub_app_info'] = self.sub_app_info.to_map()
        if self.sub_tenant_id is not None:
            result['sub_tenant_id'] = self.sub_tenant_id
        if self.sub_workspace_id is not None:
            result['sub_workspace_id'] = self.sub_workspace_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('app_type') is not None:
            self.app_type = m.get('app_type')
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('auth_app_type') is not None:
            self.auth_app_type = m.get('auth_app_type')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('sub_app_company') is not None:
            self.sub_app_company = m.get('sub_app_company')
        if m.get('sub_app_desc') is not None:
            self.sub_app_desc = m.get('sub_app_desc')
        if m.get('sub_app_id') is not None:
            self.sub_app_id = m.get('sub_app_id')
        if m.get('sub_app_info') is not None:
            temp_model = AppInfoVO()
            self.sub_app_info = temp_model.from_map(m['sub_app_info'])
        if m.get('sub_tenant_id') is not None:
            self.sub_tenant_id = m.get('sub_tenant_id')
        if m.get('sub_workspace_id') is not None:
            self.sub_workspace_id = m.get('sub_workspace_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class ApiCrossZoneVO(TeaModel):
    def __init__(
        self,
        workspace_id: str = None,
        tenant_id: str = None,
        api_id: str = None,
        gw_id: str = None,
        sys_type: str = None,
        type: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        registry_id: str = None,
    ):
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id
        # api_id
        self.api_id = api_id
        # gw_id
        self.gw_id = gw_id
        # 注册中心类型
        self.sys_type = sys_type
        # 网关类型
        self.type = type
        # 创建时间
        self.gmt_create = gmt_create
        # 更新时间
        self.gmt_modified = gmt_modified
        # registry_id
        self.registry_id = registry_id

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.gw_id is not None:
            result['gw_id'] = self.gw_id
        if self.sys_type is not None:
            result['sys_type'] = self.sys_type
        if self.type is not None:
            result['type'] = self.type
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.registry_id is not None:
            result['registry_id'] = self.registry_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('gw_id') is not None:
            self.gw_id = m.get('gw_id')
        if m.get('sys_type') is not None:
            self.sys_type = m.get('sys_type')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('registry_id') is not None:
            self.registry_id = m.get('registry_id')
        return self


class ApiMockConfigVO(TeaModel):
    def __init__(
        self,
        mock_data: str = None,
    ):
        # mock_data
        self.mock_data = mock_data

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.mock_data is not None:
            result['mock_data'] = self.mock_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('mock_data') is not None:
            self.mock_data = m.get('mock_data')
        return self


class ExternalAuthInfoVO(TeaModel):
    def __init__(
        self,
        api_count: int = None,
        cache_switch: str = None,
        cache_ttl: int = None,
        can_delete: bool = None,
        description: str = None,
        external_auth_id: str = None,
        external_auth_name: str = None,
        function_name: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        interface_name: str = None,
        method: str = None,
        operation_type: str = None,
        operator: str = None,
        params: List[ApiParamVO] = None,
        router_id: str = None,
        router_info: RouterInfoVO = None,
        router_type: str = None,
        system_cluster: SystemClusterVO = None,
        sys_id: str = None,
        tenant_id: str = None,
        timeout: int = None,
        unique_id: str = None,
        upstream_path: str = None,
        upstream_protocol: str = None,
        upstream_type: str = None,
        workspace_id: str = None,
    ):
        # 绑定api数量
        self.api_count = api_count
        # 缓存开关
        self.cache_switch = cache_switch
        # 缓存时间
        self.cache_ttl = cache_ttl
        # 能否删除
        self.can_delete = can_delete
        # description
        self.description = description
        # 外部系统标识
        self.external_auth_id = external_auth_id
        # 外部授权名称
        self.external_auth_name = external_auth_name
        # 
        # 方法名
        self.function_name = function_name
        # 
        # 创建时间
        self.gmt_create = gmt_create
        # 
        # 更改时间
        self.gmt_modified = gmt_modified
        # 后端接口名
        self.interface_name = interface_name
        # 请求方法
        self.method = method
        # operationtype
        self.operation_type = operation_type
        # 
        # 创建人
        self.operator = operator
        # 外部api参数
        self.params = params
        # 路由标识
        self.router_id = router_id
        # 路由规则
        self.router_info = router_info
        # 路由策略类型
        self.router_type = router_type
        # SystemClusterVO
        self.system_cluster = system_cluster
        # 系统集群标识
        self.sys_id = sys_id
        # 
        # 租户标识
        self.tenant_id = tenant_id
        # timeout
        self.timeout = timeout
        # 服务标识
        self.unique_id = unique_id
        # 后端路径
        self.upstream_path = upstream_path
        # 后端协议类型
        self.upstream_protocol = upstream_protocol
        # 后端服务类型
        self.upstream_type = upstream_type
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.params:
            for k in self.params:
                if k:
                    k.validate()
        if self.router_info:
            self.router_info.validate()
        if self.system_cluster:
            self.system_cluster.validate()

    def to_map(self):
        result = dict()
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.cache_switch is not None:
            result['cache_switch'] = self.cache_switch
        if self.cache_ttl is not None:
            result['cache_ttl'] = self.cache_ttl
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.description is not None:
            result['description'] = self.description
        if self.external_auth_id is not None:
            result['external_auth_id'] = self.external_auth_id
        if self.external_auth_name is not None:
            result['external_auth_name'] = self.external_auth_name
        if self.function_name is not None:
            result['function_name'] = self.function_name
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.interface_name is not None:
            result['interface_name'] = self.interface_name
        if self.method is not None:
            result['method'] = self.method
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.operator is not None:
            result['operator'] = self.operator
        result['params'] = []
        if self.params is not None:
            for k in self.params:
                result['params'].append(k.to_map() if k else None)
        if self.router_id is not None:
            result['router_id'] = self.router_id
        if self.router_info is not None:
            result['router_info'] = self.router_info.to_map()
        if self.router_type is not None:
            result['router_type'] = self.router_type
        if self.system_cluster is not None:
            result['system_cluster'] = self.system_cluster.to_map()
        if self.sys_id is not None:
            result['sys_id'] = self.sys_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.upstream_path is not None:
            result['upstream_path'] = self.upstream_path
        if self.upstream_protocol is not None:
            result['upstream_protocol'] = self.upstream_protocol
        if self.upstream_type is not None:
            result['upstream_type'] = self.upstream_type
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('cache_switch') is not None:
            self.cache_switch = m.get('cache_switch')
        if m.get('cache_ttl') is not None:
            self.cache_ttl = m.get('cache_ttl')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('external_auth_id') is not None:
            self.external_auth_id = m.get('external_auth_id')
        if m.get('external_auth_name') is not None:
            self.external_auth_name = m.get('external_auth_name')
        if m.get('function_name') is not None:
            self.function_name = m.get('function_name')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('interface_name') is not None:
            self.interface_name = m.get('interface_name')
        if m.get('method') is not None:
            self.method = m.get('method')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        self.params = []
        if m.get('params') is not None:
            for k in m.get('params'):
                temp_model = ApiParamVO()
                self.params.append(temp_model.from_map(k))
        if m.get('router_id') is not None:
            self.router_id = m.get('router_id')
        if m.get('router_info') is not None:
            temp_model = RouterInfoVO()
            self.router_info = temp_model.from_map(m['router_info'])
        if m.get('router_type') is not None:
            self.router_type = m.get('router_type')
        if m.get('system_cluster') is not None:
            temp_model = SystemClusterVO()
            self.system_cluster = temp_model.from_map(m['system_cluster'])
        if m.get('sys_id') is not None:
            self.sys_id = m.get('sys_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('upstream_path') is not None:
            self.upstream_path = m.get('upstream_path')
        if m.get('upstream_protocol') is not None:
            self.upstream_protocol = m.get('upstream_protocol')
        if m.get('upstream_type') is not None:
            self.upstream_type = m.get('upstream_type')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class SwitchVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        key: str = None,
        name: str = None,
        value: str = None,
    ):
        # 唯一标识
        self.id = id
        # 键值
        self.key = key
        # 名称
        self.name = name
        # 开关
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.key is not None:
            result['key'] = self.key
        if self.name is not None:
            result['name'] = self.name
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class ApiflowOutputVO(TeaModel):
    def __init__(
        self,
        name: str = None,
        mapping_name: str = None,
    ):
        # name
        self.name = name
        # mapping_name
        self.mapping_name = mapping_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.mapping_name is not None:
            result['mapping_name'] = self.mapping_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('mapping_name') is not None:
            self.mapping_name = m.get('mapping_name')
        return self


class GateWayConfigVO(TeaModel):
    def __init__(
        self,
        gateway_id: str = None,
        host: str = None,
        id: str = None,
        name: str = None,
        routers: List[RegistryVO] = None,
        tenant_id: str = None,
        workspace_id: str = None,
        zone: str = None,
        weight: int = None,
    ):
        # 唯一标识
        self.gateway_id = gateway_id
        # host
        self.host = host
        # 唯一性标识
        self.id = id
        # zone名称、网关名称
        self.name = name
        # 注册中心
        self.routers = routers
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # zone
        self.zone = zone
        # 流量比例
        self.weight = weight

    def validate(self):
        if self.routers:
            for k in self.routers:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.gateway_id is not None:
            result['gateway_id'] = self.gateway_id
        if self.host is not None:
            result['host'] = self.host
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        result['routers'] = []
        if self.routers is not None:
            for k in self.routers:
                result['routers'].append(k.to_map() if k else None)
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.zone is not None:
            result['zone'] = self.zone
        if self.weight is not None:
            result['weight'] = self.weight
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('gateway_id') is not None:
            self.gateway_id = m.get('gateway_id')
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        self.routers = []
        if m.get('routers') is not None:
            for k in m.get('routers'):
                temp_model = RegistryVO()
                self.routers.append(temp_model.from_map(k))
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('zone') is not None:
            self.zone = m.get('zone')
        if m.get('weight') is not None:
            self.weight = m.get('weight')
        return self


class CorsInfoVO(TeaModel):
    def __init__(
        self,
        allow_credentials: bool = None,
        allow_headers: List[str] = None,
        allow_methods: List[str] = None,
        allow_origins: List[str] = None,
        api_count: int = None,
        cors_id: str = None,
        cors_name: str = None,
        cors_scop: str = None,
        cors_status: str = None,
        expose_headers: List[str] = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        max_age: int = None,
        operator: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # 是否允许发送COOKIE
        self.allow_credentials = allow_credentials
        # 允许的 request headers
        self.allow_headers = allow_headers
        # 允许的http method
        self.allow_methods = allow_methods
        # 允许的 ORIGIN
        self.allow_origins = allow_origins
        # API数量
        self.api_count = api_count
        # cors标识
        self.cors_id = cors_id
        # cors名称
        self.cors_name = cors_name
        # cors_scop
        self.cors_scop = cors_scop
        # cors状态
        self.cors_status = cors_status
        # 允许暴露的 reponse header
        self.expose_headers = expose_headers
        # 创建时间
        self.gmt_create = gmt_create
        # 更新时间
        self.gmt_modified = gmt_modified
        # 预检请求的有效期
        self.max_age = max_age
        # 创建人
        self.operator = operator
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.allow_credentials is not None:
            result['allow_credentials'] = self.allow_credentials
        if self.allow_headers is not None:
            result['allow_headers'] = self.allow_headers
        if self.allow_methods is not None:
            result['allow_methods'] = self.allow_methods
        if self.allow_origins is not None:
            result['allow_origins'] = self.allow_origins
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.cors_id is not None:
            result['cors_id'] = self.cors_id
        if self.cors_name is not None:
            result['cors_name'] = self.cors_name
        if self.cors_scop is not None:
            result['cors_scop'] = self.cors_scop
        if self.cors_status is not None:
            result['cors_status'] = self.cors_status
        if self.expose_headers is not None:
            result['expose_headers'] = self.expose_headers
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.max_age is not None:
            result['max_age'] = self.max_age
        if self.operator is not None:
            result['operator'] = self.operator
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('allow_credentials') is not None:
            self.allow_credentials = m.get('allow_credentials')
        if m.get('allow_headers') is not None:
            self.allow_headers = m.get('allow_headers')
        if m.get('allow_methods') is not None:
            self.allow_methods = m.get('allow_methods')
        if m.get('allow_origins') is not None:
            self.allow_origins = m.get('allow_origins')
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('cors_id') is not None:
            self.cors_id = m.get('cors_id')
        if m.get('cors_name') is not None:
            self.cors_name = m.get('cors_name')
        if m.get('cors_scop') is not None:
            self.cors_scop = m.get('cors_scop')
        if m.get('cors_status') is not None:
            self.cors_status = m.get('cors_status')
        if m.get('expose_headers') is not None:
            self.expose_headers = m.get('expose_headers')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('max_age') is not None:
            self.max_age = m.get('max_age')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class StrategyInfoVO(TeaModel):
    def __init__(
        self,
        workspace_id: str = None,
        tenant_id: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        strategy_id: str = None,
        strategy_name: str = None,
        strategy_status: str = None,
        operator: str = None,
        api_count: int = None,
        description: str = None,
        strategy_type: str = None,
        host: List[str] = None,
        can_delete: bool = None,
    ):
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id
        # 创建时间
        self.gmt_create = gmt_create
        # 更新时间
        self.gmt_modified = gmt_modified
        # 策略唯一标识
        self.strategy_id = strategy_id
        # 策略名称
        self.strategy_name = strategy_name
        # 策略状态
        self.strategy_status = strategy_status
        # 操作人
        self.operator = operator
        # 
        # API数量
        self.api_count = api_count
        # 策略描述
        self.description = description
        # 策略类型
        self.strategy_type = strategy_type
        # 名单集合
        self.host = host
        # true, false
        self.can_delete = can_delete

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        if self.strategy_name is not None:
            result['strategy_name'] = self.strategy_name
        if self.strategy_status is not None:
            result['strategy_status'] = self.strategy_status
        if self.operator is not None:
            result['operator'] = self.operator
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.description is not None:
            result['description'] = self.description
        if self.strategy_type is not None:
            result['strategy_type'] = self.strategy_type
        if self.host is not None:
            result['host'] = self.host
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('strategy_name') is not None:
            self.strategy_name = m.get('strategy_name')
        if m.get('strategy_status') is not None:
            self.strategy_status = m.get('strategy_status')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('strategy_type') is not None:
            self.strategy_type = m.get('strategy_type')
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        return self


class ActionResult(TeaModel):
    def __init__(
        self,
        code: str = None,
        error_message: str = None,
        id: str = None,
        success: bool = None,
    ):
        # 错误码
        self.code = code
        # 报错信息
        self.error_message = error_message
        # id
        self.id = id
        # 是否挂载成功
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.id is not None:
            result['id'] = self.id
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ApiModelVO(TeaModel):
    def __init__(
        self,
        api_count: int = None,
        api_model_id: str = None,
        can_delete: bool = None,
        description: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        model_config: str = None,
        model_name: str = None,
        model_params: List[ApiModelParamVO] = None,
        operator: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        children: str = None,
        model_type: str = None,
    ):
        # 绑定的api数量
        self.api_count = api_count
        # 模板id(全局唯一)
        self.api_model_id = api_model_id
        # 是否可以删除
        self.can_delete = can_delete
        # API模型描述
        self.description = description
        # 创建时间
        self.gmt_create = gmt_create
        # 
        # 更改时间
        self.gmt_modified = gmt_modified
        # 模型配置
        self.model_config = model_config
        # 模型名称
        self.model_name = model_name
        # 数据模型参数
        self.model_params = model_params
        # 创建人
        # 
        self.operator = operator
        # 租户id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # children
        self.children = children
        # option 表示模型是多参数
        self.model_type = model_type

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.model_params:
            for k in self.model_params:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.api_model_id is not None:
            result['api_model_id'] = self.api_model_id
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.description is not None:
            result['description'] = self.description
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.model_config is not None:
            result['model_config'] = self.model_config
        if self.model_name is not None:
            result['model_name'] = self.model_name
        result['model_params'] = []
        if self.model_params is not None:
            for k in self.model_params:
                result['model_params'].append(k.to_map() if k else None)
        if self.operator is not None:
            result['operator'] = self.operator
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.children is not None:
            result['children'] = self.children
        if self.model_type is not None:
            result['model_type'] = self.model_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('api_model_id') is not None:
            self.api_model_id = m.get('api_model_id')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('model_config') is not None:
            self.model_config = m.get('model_config')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        self.model_params = []
        if m.get('model_params') is not None:
            for k in m.get('model_params'):
                temp_model = ApiModelParamVO()
                self.model_params.append(temp_model.from_map(k))
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('children') is not None:
            self.children = m.get('children')
        if m.get('model_type') is not None:
            self.model_type = m.get('model_type')
        return self


class LimitConfigVO(TeaModel):
    def __init__(
        self,
        need_limit: bool = None,
        limit: int = None,
        limit_rsp_type: str = None,
        rsp_msg: str = None,
    ):
        # 是否需要限制
        self.need_limit = need_limit
        # 限制阈值
        self.limit = limit
        # 限制响应类型
        self.limit_rsp_type = limit_rsp_type
        # 响应信息
        self.rsp_msg = rsp_msg

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.need_limit is not None:
            result['need_limit'] = self.need_limit
        if self.limit is not None:
            result['limit'] = self.limit
        if self.limit_rsp_type is not None:
            result['limit_rsp_type'] = self.limit_rsp_type
        if self.rsp_msg is not None:
            result['rsp_msg'] = self.rsp_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('need_limit') is not None:
            self.need_limit = m.get('need_limit')
        if m.get('limit') is not None:
            self.limit = m.get('limit')
        if m.get('limit_rsp_type') is not None:
            self.limit_rsp_type = m.get('limit_rsp_type')
        if m.get('rsp_msg') is not None:
            self.rsp_msg = m.get('rsp_msg')
        return self


class ApiCacheVO(TeaModel):
    def __init__(
        self,
        need_cache: bool = None,
        ttl: int = None,
        cache_keys: List[ApiCacheKeyVO] = None,
    ):
        # 是否需要缓存
        self.need_cache = need_cache
        # TTL
        self.ttl = ttl
        # cacheKeys
        self.cache_keys = cache_keys

    def validate(self):
        if self.cache_keys:
            for k in self.cache_keys:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.need_cache is not None:
            result['need_cache'] = self.need_cache
        if self.ttl is not None:
            result['ttl'] = self.ttl
        result['cache_keys'] = []
        if self.cache_keys is not None:
            for k in self.cache_keys:
                result['cache_keys'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('need_cache') is not None:
            self.need_cache = m.get('need_cache')
        if m.get('ttl') is not None:
            self.ttl = m.get('ttl')
        self.cache_keys = []
        if m.get('cache_keys') is not None:
            for k in m.get('cache_keys'):
                temp_model = ApiCacheKeyVO()
                self.cache_keys.append(temp_model.from_map(k))
        return self


class ParamMappingInfoVO(TeaModel):
    def __init__(
        self,
        api_count: int = None,
        can_delete: bool = None,
        config_template: str = None,
        description: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        mapping_type: str = None,
        operator: str = None,
        param_mapping_id: str = None,
        param_mapping_name: str = None,
        script_config: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        config_template_name: str = None,
    ):
        # api_count
        self.api_count = api_count
        # can_delete
        self.can_delete = can_delete
        # 配置模板
        self.config_template = config_template
        # 描述
        self.description = description
        # gmt_create
        self.gmt_create = gmt_create
        # gmt_modified
        self.gmt_modified = gmt_modified
        # 映射类型
        self.mapping_type = mapping_type
        # 创建人
        self.operator = operator
        # param_mapping_id
        self.param_mapping_id = param_mapping_id
        # 参数映射名称
        self.param_mapping_name = param_mapping_name
        # 脚本配置
        self.script_config = script_config
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # 配置模板名称
        self.config_template_name = config_template_name

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.config_template is not None:
            result['config_template'] = self.config_template
        if self.description is not None:
            result['description'] = self.description
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.mapping_type is not None:
            result['mapping_type'] = self.mapping_type
        if self.operator is not None:
            result['operator'] = self.operator
        if self.param_mapping_id is not None:
            result['param_mapping_id'] = self.param_mapping_id
        if self.param_mapping_name is not None:
            result['param_mapping_name'] = self.param_mapping_name
        if self.script_config is not None:
            result['script_config'] = self.script_config
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.config_template_name is not None:
            result['config_template_name'] = self.config_template_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('config_template') is not None:
            self.config_template = m.get('config_template')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('mapping_type') is not None:
            self.mapping_type = m.get('mapping_type')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('param_mapping_id') is not None:
            self.param_mapping_id = m.get('param_mapping_id')
        if m.get('param_mapping_name') is not None:
            self.param_mapping_name = m.get('param_mapping_name')
        if m.get('script_config') is not None:
            self.script_config = m.get('script_config')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('config_template_name') is not None:
            self.config_template_name = m.get('config_template_name')
        return self


class OrderInfo(TeaModel):
    def __init__(
        self,
        key: str = None,
        order: str = None,
    ):
        # 要排序的字段
        self.key = key
        # 升序or降序
        self.order = order

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.order, 'order')

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.order is not None:
            result['order'] = self.order
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('order') is not None:
            self.order = m.get('order')
        return self


class ApiVersionVO(TeaModel):
    def __init__(
        self,
        api_id: str = None,
        edit_operator: str = None,
        gmt_create: str = None,
        gmt_edit: str = None,
        gmt_modified: str = None,
        gmt_offline: str = None,
        gmt_online: str = None,
        offline_desc: str = None,
        offline_operator: str = None,
        online_desc: str = None,
        online_operator: str = None,
        version_id: str = None,
        version_no: str = None,
        version_status: str = None,
        can_online: bool = None,
    ):
        # API标识
        self.api_id = api_id
        # editOperator
        self.edit_operator = edit_operator
        # 创建时间
        self.gmt_create = gmt_create
        # 编辑时间
        self.gmt_edit = gmt_edit
        # 更改时间
        self.gmt_modified = gmt_modified
        # gmtOffline
        self.gmt_offline = gmt_offline
        # gmtOnline
        self.gmt_online = gmt_online
        # offlineDesc
        self.offline_desc = offline_desc
        # offlineOperator
        self.offline_operator = offline_operator
        # onlineDesc
        self.online_desc = online_desc
        # onlineOperator
        self.online_operator = online_operator
        # versionId
        self.version_id = version_id
        # 版本号
        self.version_no = version_no
        # versionStatus
        self.version_status = version_status
        # 能否发布
        self.can_online = can_online

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_edit is not None:
            self.validate_pattern(self.gmt_edit, 'gmt_edit', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_offline is not None:
            self.validate_pattern(self.gmt_offline, 'gmt_offline', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_online is not None:
            self.validate_pattern(self.gmt_online, 'gmt_online', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.edit_operator is not None:
            result['edit_operator'] = self.edit_operator
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_edit is not None:
            result['gmt_edit'] = self.gmt_edit
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.gmt_offline is not None:
            result['gmt_offline'] = self.gmt_offline
        if self.gmt_online is not None:
            result['gmt_online'] = self.gmt_online
        if self.offline_desc is not None:
            result['offline_desc'] = self.offline_desc
        if self.offline_operator is not None:
            result['offline_operator'] = self.offline_operator
        if self.online_desc is not None:
            result['online_desc'] = self.online_desc
        if self.online_operator is not None:
            result['online_operator'] = self.online_operator
        if self.version_id is not None:
            result['version_id'] = self.version_id
        if self.version_no is not None:
            result['version_no'] = self.version_no
        if self.version_status is not None:
            result['version_status'] = self.version_status
        if self.can_online is not None:
            result['can_online'] = self.can_online
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('edit_operator') is not None:
            self.edit_operator = m.get('edit_operator')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_edit') is not None:
            self.gmt_edit = m.get('gmt_edit')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('gmt_offline') is not None:
            self.gmt_offline = m.get('gmt_offline')
        if m.get('gmt_online') is not None:
            self.gmt_online = m.get('gmt_online')
        if m.get('offline_desc') is not None:
            self.offline_desc = m.get('offline_desc')
        if m.get('offline_operator') is not None:
            self.offline_operator = m.get('offline_operator')
        if m.get('online_desc') is not None:
            self.online_desc = m.get('online_desc')
        if m.get('online_operator') is not None:
            self.online_operator = m.get('online_operator')
        if m.get('version_id') is not None:
            self.version_id = m.get('version_id')
        if m.get('version_no') is not None:
            self.version_no = m.get('version_no')
        if m.get('version_status') is not None:
            self.version_status = m.get('version_status')
        if m.get('can_online') is not None:
            self.can_online = m.get('can_online')
        return self


class SofaGwAuthenticationVO(TeaModel):
    def __init__(
        self,
        auth_access_key: str = None,
        auth_secret_key: str = None,
        id: int = None,
    ):
        # 
        # access key
        # 
        # 
        self.auth_access_key = auth_access_key
        # secret key
        self.auth_secret_key = auth_secret_key
        # id
        self.id = id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_access_key is not None:
            result['auth_access_key'] = self.auth_access_key
        if self.auth_secret_key is not None:
            result['auth_secret_key'] = self.auth_secret_key
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_access_key') is not None:
            self.auth_access_key = m.get('auth_access_key')
        if m.get('auth_secret_key') is not None:
            self.auth_secret_key = m.get('auth_secret_key')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class ApiflowMachineDefVO(TeaModel):
    def __init__(
        self,
        api_count: int = None,
        workspace_id: str = None,
        tenant_id: str = None,
        instance_id: str = None,
        can_delete: bool = None,
        id: str = None,
        name: str = None,
        app_name: str = None,
        type: str = None,
        comment: str = None,
        ver: str = None,
        gmt_create: str = None,
        status: str = None,
        recover_strategy: str = None,
        content: str = None,
        machine_status: str = None,
        field_mapping: str = None,
    ):
        # 
        # api数
        self.api_count = api_count
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id
        # instance_id
        self.instance_id = instance_id
        # can_delete
        self.can_delete = can_delete
        # id
        self.id = id
        # name
        self.name = name
        # app_name
        self.app_name = app_name
        # type
        self.type = type
        # comment
        self.comment = comment
        # ver
        self.ver = ver
        # gmt_create
        self.gmt_create = gmt_create
        # status
        self.status = status
        # recover_strategy
        self.recover_strategy = recover_strategy
        # content
        self.content = content
        # machine_status
        self.machine_status = machine_status
        # field_mapping
        self.field_mapping = field_mapping

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.type is not None:
            result['type'] = self.type
        if self.comment is not None:
            result['comment'] = self.comment
        if self.ver is not None:
            result['ver'] = self.ver
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.status is not None:
            result['status'] = self.status
        if self.recover_strategy is not None:
            result['recover_strategy'] = self.recover_strategy
        if self.content is not None:
            result['content'] = self.content
        if self.machine_status is not None:
            result['machine_status'] = self.machine_status
        if self.field_mapping is not None:
            result['field_mapping'] = self.field_mapping
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('recover_strategy') is not None:
            self.recover_strategy = m.get('recover_strategy')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('machine_status') is not None:
            self.machine_status = m.get('machine_status')
        if m.get('field_mapping') is not None:
            self.field_mapping = m.get('field_mapping')
        return self


class SystemConfigVO(TeaModel):
    def __init__(
        self,
        config_key: str = None,
        config_value: str = None,
        description: str = None,
        gateway_list: List[GateWayConfigVO] = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        instance_id: str = None,
        operator: str = None,
        switch_list: List[SwitchVO] = None,
    ):
        # config_key
        self.config_key = config_key
        # config_value
        self.config_value = config_value
        # 描述
        self.description = description
        # gateway_list
        self.gateway_list = gateway_list
        # 创建时间
        self.gmt_create = gmt_create
        # 更改时间
        self.gmt_modified = gmt_modified
        # instance_id
        self.instance_id = instance_id
        # 创建人
        self.operator = operator
        # switch_list
        self.switch_list = switch_list

    def validate(self):
        if self.gateway_list:
            for k in self.gateway_list:
                if k:
                    k.validate()
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.switch_list:
            for k in self.switch_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.config_key is not None:
            result['config_key'] = self.config_key
        if self.config_value is not None:
            result['config_value'] = self.config_value
        if self.description is not None:
            result['description'] = self.description
        result['gateway_list'] = []
        if self.gateway_list is not None:
            for k in self.gateway_list:
                result['gateway_list'].append(k.to_map() if k else None)
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.operator is not None:
            result['operator'] = self.operator
        result['switch_list'] = []
        if self.switch_list is not None:
            for k in self.switch_list:
                result['switch_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('config_key') is not None:
            self.config_key = m.get('config_key')
        if m.get('config_value') is not None:
            self.config_value = m.get('config_value')
        if m.get('description') is not None:
            self.description = m.get('description')
        self.gateway_list = []
        if m.get('gateway_list') is not None:
            for k in m.get('gateway_list'):
                temp_model = GateWayConfigVO()
                self.gateway_list.append(temp_model.from_map(k))
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        self.switch_list = []
        if m.get('switch_list') is not None:
            for k in m.get('switch_list'):
                temp_model = SwitchVO()
                self.switch_list.append(temp_model.from_map(k))
        return self


class ApiTransferVO(TeaModel):
    def __init__(
        self,
        api_cache_model: ApiCacheVO = None,
        api_group: ApiGroupVO = None,
        api_group_id: str = None,
        api_group_name: str = None,
        api_id: str = None,
        api_limit_config: LimitConfigVO = None,
        api_mock_config: ApiMockConfigVO = None,
        api_name: str = None,
        api_status: str = None,
        app_type: str = None,
        authentication_type: str = None,
        auth_app_count: int = None,
        can_delete: bool = None,
        charset: str = None,
        check_result: str = None,
        complete_interface_name: str = None,
        content_type: str = None,
        cors_id: str = None,
        cors_info: CorsInfoVO = None,
        current_version_no: str = None,
        description: str = None,
        domain_name: str = None,
        downstream_protocol: str = None,
        edit_version: ApiVersionVO = None,
        edit_version_no: str = None,
        external_auth: ExternalAuthInfoVO = None,
        external_auth_id: str = None,
        function_name: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        interface_name: str = None,
        method: str = None,
        online_version: ApiVersionVO = None,
        online_version_no: str = None,
        operation_type: str = None,
        operator: str = None,
        path: str = None,
        path_match_type: str = None,
        req_params: List[ApiParamVO] = None,
        req_param_mapping: ParamMappingInfoVO = None,
        req_param_mapping_id: str = None,
        req_param_mapping_type: str = None,
        resp_param_mapping: ParamMappingInfoVO = None,
        resp_param_mapping_id: str = None,
        router_id: str = None,
        router_info: RouterInfoVO = None,
        router_type: str = None,
        rsq_param: ApiParamVO = None,
        system_cluster: SystemClusterVO = None,
        sys_id: str = None,
        target_workspace_id: str = None,
        tenant_id: str = None,
        timeout: int = None,
        unique_id: str = None,
        update_config_list: List[str] = None,
        upstream_param_mappings: List[ApiParamVO] = None,
        upstream_path: str = None,
        upstream_protocol: str = None,
        upstream_type: str = None,
        workspace_id: str = None,
        import_result: str = None,
        domain_list: List[ApiGroupDomainVO] = None,
        strategy_id: str = None,
        strategy_info: StrategyInfoVO = None,
        api_type: str = None,
        api_cross_zone_list: List[ApiCrossZoneVO] = None,
        registry_group: str = None,
        parameter: List[str] = None,
        up_function_name: str = None,
        param_path_list: List[str] = None,
        service_version: str = None,
        auth_app_info_id: str = None,
        operation_permission: bool = None,
        data_encryption: str = None,
        egress_list: List[GateWayConfigVO] = None,
        history_version_list: List[ApiVersionVO] = None,
        ingress: str = None,
        model: str = None,
        req_model_id: str = None,
        req_model_name: str = None,
        req_type: str = None,
        resp_model_id: str = None,
        resp_model_name: str = None,
        resp_type: str = None,
        ingress_list: List[GateWayConfigVO] = None,
        content: str = None,
        api_count: int = None,
        field_mapping: List[ApiflowOutputVO] = None,
        need_tls: bool = None,
    ):
        # API缓存模型
        self.api_cache_model = api_cache_model
        # api_group
        self.api_group = api_group
        # API分组标识
        self.api_group_id = api_group_id
        # 所属API分组名称
        self.api_group_name = api_group_name
        # API标识
        self.api_id = api_id
        # API限流配置
        self.api_limit_config = api_limit_config
        # api_mock_config
        self.api_mock_config = api_mock_config
        # API名称
        self.api_name = api_name
        # apiStatus
        self.api_status = api_status
        # 授权应用类型
        self.app_type = app_type
        # authentication_type
        self.authentication_type = authentication_type
        # auth_app_count
        self.auth_app_count = auth_app_count
        # 是否可以删除
        self.can_delete = can_delete
        # charset
        self.charset = charset
        # 重复的配置  信息详情
        self.check_result = check_result
        # 完整interface_name
        self.complete_interface_name = complete_interface_name
        # contentType
        self.content_type = content_type
        # cors_id
        self.cors_id = cors_id
        # cors_info
        self.cors_info = cors_info
        # 当前显示的版本
        self.current_version_no = current_version_no
        # description
        self.description = description
        # API分组域名
        self.domain_name = domain_name
        # downstreamProtocol
        self.downstream_protocol = downstream_protocol
        # 编辑中的版本
        self.edit_version = edit_version
        # 编辑中的API版本号
        self.edit_version_no = edit_version_no
        # external_auth
        self.external_auth = external_auth
        # 外部系统标识
        self.external_auth_id = external_auth_id
        # 方法名
        self.function_name = function_name
        # 创建时间
        self.gmt_create = gmt_create
        # 更改时间
        self.gmt_modified = gmt_modified
        # 接口名称
        self.interface_name = interface_name
        # method
        self.method = method
        # onlineVersion
        self.online_version = online_version
        # 发布中的API版本号
        self.online_version_no = online_version_no
        # operation_type
        self.operation_type = operation_type
        # 创建人
        self.operator = operator
        # path
        self.path = path
        # 路径匹配类型
        self.path_match_type = path_match_type
        # reqParams
        self.req_params = req_params
        # reqparammapping
        self.req_param_mapping = req_param_mapping
        # 请求参数映射标识
        self.req_param_mapping_id = req_param_mapping_id
        # 参数映射类型（普通\高级）
        self.req_param_mapping_type = req_param_mapping_type
        # respparammapping
        self.resp_param_mapping = resp_param_mapping
        # 响应参数标识
        self.resp_param_mapping_id = resp_param_mapping_id
        # router_id
        self.router_id = router_id
        # 
        # 路由规则
        self.router_info = router_info
        # 路由策略类型
        self.router_type = router_type
        # rsqParam
        self.rsq_param = rsq_param
        # 
        # 后端集群
        self.system_cluster = system_cluster
        # sys_id
        self.sys_id = sys_id
        # 目标工作空间标识
        self.target_workspace_id = target_workspace_id
        # 租户标识
        self.tenant_id = tenant_id
        # timeout
        self.timeout = timeout
        # 服务标识
        self.unique_id = unique_id
        # 需要覆盖的配置
        self.update_config_list = update_config_list
        # upstreamParamMappings
        self.upstream_param_mappings = upstream_param_mappings
        # upstreamPath
        self.upstream_path = upstream_path
        # upstreamProtocol
        self.upstream_protocol = upstream_protocol
        # 后端服务类型
        self.upstream_type = upstream_type
        # 工作空间标识
        self.workspace_id = workspace_id
        # 导入失败的原因
        self.import_result = import_result
        # domain_list
        self.domain_list = domain_list
        # 策略ID
        self.strategy_id = strategy_id
        # 策略详情
        self.strategy_info = strategy_info
        # crossZone双网关 (api 类型)
        self.api_type = api_type
        # api的网关配置列表
        self.api_cross_zone_list = api_cross_zone_list
        # registry_group
        self.registry_group = registry_group
        # parameter
        self.parameter = parameter
        # up_function_name
        self.up_function_name = up_function_name
        # param_path_list
        self.param_path_list = param_path_list
        # dubbo发布服务版本
        self.service_version = service_version
        # auth_app_info_id
        self.auth_app_info_id = auth_app_info_id
        # operation_permission
        self.operation_permission = operation_permission
        # data_encryption
        self.data_encryption = data_encryption
        # egress_list
        self.egress_list = egress_list
        # history_version_list
        self.history_version_list = history_version_list
        # GateWayConfigVO
        self.ingress = ingress
        # model
        self.model = model
        # req_model_id
        self.req_model_id = req_model_id
        # req_model_name
        self.req_model_name = req_model_name
        # req_type
        self.req_type = req_type
        # resp_model_id
        self.resp_model_id = resp_model_id
        # resp_model_name
        self.resp_model_name = resp_model_name
        # resp_type
        self.resp_type = resp_type
        # ingress_list
        self.ingress_list = ingress_list
        # content
        self.content = content
        # api_count
        self.api_count = api_count
        # field_mapping
        self.field_mapping = field_mapping
        # need_tls
        self.need_tls = need_tls

    def validate(self):
        if self.api_cache_model:
            self.api_cache_model.validate()
        if self.api_group:
            self.api_group.validate()
        if self.api_limit_config:
            self.api_limit_config.validate()
        if self.api_mock_config:
            self.api_mock_config.validate()
        if self.cors_info:
            self.cors_info.validate()
        if self.edit_version:
            self.edit_version.validate()
        if self.external_auth:
            self.external_auth.validate()
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.online_version:
            self.online_version.validate()
        if self.req_params:
            for k in self.req_params:
                if k:
                    k.validate()
        if self.req_param_mapping:
            self.req_param_mapping.validate()
        if self.resp_param_mapping:
            self.resp_param_mapping.validate()
        if self.router_info:
            self.router_info.validate()
        if self.rsq_param:
            self.rsq_param.validate()
        if self.system_cluster:
            self.system_cluster.validate()
        if self.upstream_param_mappings:
            for k in self.upstream_param_mappings:
                if k:
                    k.validate()
        if self.domain_list:
            for k in self.domain_list:
                if k:
                    k.validate()
        if self.strategy_info:
            self.strategy_info.validate()
        if self.api_cross_zone_list:
            for k in self.api_cross_zone_list:
                if k:
                    k.validate()
        if self.egress_list:
            for k in self.egress_list:
                if k:
                    k.validate()
        if self.history_version_list:
            for k in self.history_version_list:
                if k:
                    k.validate()
        if self.ingress_list:
            for k in self.ingress_list:
                if k:
                    k.validate()
        if self.field_mapping:
            for k in self.field_mapping:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.api_cache_model is not None:
            result['api_cache_model'] = self.api_cache_model.to_map()
        if self.api_group is not None:
            result['api_group'] = self.api_group.to_map()
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.api_group_name is not None:
            result['api_group_name'] = self.api_group_name
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.api_limit_config is not None:
            result['api_limit_config'] = self.api_limit_config.to_map()
        if self.api_mock_config is not None:
            result['api_mock_config'] = self.api_mock_config.to_map()
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.api_status is not None:
            result['api_status'] = self.api_status
        if self.app_type is not None:
            result['app_type'] = self.app_type
        if self.authentication_type is not None:
            result['authentication_type'] = self.authentication_type
        if self.auth_app_count is not None:
            result['auth_app_count'] = self.auth_app_count
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.charset is not None:
            result['charset'] = self.charset
        if self.check_result is not None:
            result['check_result'] = self.check_result
        if self.complete_interface_name is not None:
            result['complete_interface_name'] = self.complete_interface_name
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.cors_id is not None:
            result['cors_id'] = self.cors_id
        if self.cors_info is not None:
            result['cors_info'] = self.cors_info.to_map()
        if self.current_version_no is not None:
            result['current_version_no'] = self.current_version_no
        if self.description is not None:
            result['description'] = self.description
        if self.domain_name is not None:
            result['domain_name'] = self.domain_name
        if self.downstream_protocol is not None:
            result['downstream_protocol'] = self.downstream_protocol
        if self.edit_version is not None:
            result['edit_version'] = self.edit_version.to_map()
        if self.edit_version_no is not None:
            result['edit_version_no'] = self.edit_version_no
        if self.external_auth is not None:
            result['external_auth'] = self.external_auth.to_map()
        if self.external_auth_id is not None:
            result['external_auth_id'] = self.external_auth_id
        if self.function_name is not None:
            result['function_name'] = self.function_name
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.interface_name is not None:
            result['interface_name'] = self.interface_name
        if self.method is not None:
            result['method'] = self.method
        if self.online_version is not None:
            result['online_version'] = self.online_version.to_map()
        if self.online_version_no is not None:
            result['online_version_no'] = self.online_version_no
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.operator is not None:
            result['operator'] = self.operator
        if self.path is not None:
            result['path'] = self.path
        if self.path_match_type is not None:
            result['path_match_type'] = self.path_match_type
        result['req_params'] = []
        if self.req_params is not None:
            for k in self.req_params:
                result['req_params'].append(k.to_map() if k else None)
        if self.req_param_mapping is not None:
            result['req_param_mapping'] = self.req_param_mapping.to_map()
        if self.req_param_mapping_id is not None:
            result['req_param_mapping_id'] = self.req_param_mapping_id
        if self.req_param_mapping_type is not None:
            result['req_param_mapping_type'] = self.req_param_mapping_type
        if self.resp_param_mapping is not None:
            result['resp_param_mapping'] = self.resp_param_mapping.to_map()
        if self.resp_param_mapping_id is not None:
            result['resp_param_mapping_id'] = self.resp_param_mapping_id
        if self.router_id is not None:
            result['router_id'] = self.router_id
        if self.router_info is not None:
            result['router_info'] = self.router_info.to_map()
        if self.router_type is not None:
            result['router_type'] = self.router_type
        if self.rsq_param is not None:
            result['rsq_param'] = self.rsq_param.to_map()
        if self.system_cluster is not None:
            result['system_cluster'] = self.system_cluster.to_map()
        if self.sys_id is not None:
            result['sys_id'] = self.sys_id
        if self.target_workspace_id is not None:
            result['target_workspace_id'] = self.target_workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.update_config_list is not None:
            result['update_config_list'] = self.update_config_list
        result['upstream_param_mappings'] = []
        if self.upstream_param_mappings is not None:
            for k in self.upstream_param_mappings:
                result['upstream_param_mappings'].append(k.to_map() if k else None)
        if self.upstream_path is not None:
            result['upstream_path'] = self.upstream_path
        if self.upstream_protocol is not None:
            result['upstream_protocol'] = self.upstream_protocol
        if self.upstream_type is not None:
            result['upstream_type'] = self.upstream_type
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.import_result is not None:
            result['import_result'] = self.import_result
        result['domain_list'] = []
        if self.domain_list is not None:
            for k in self.domain_list:
                result['domain_list'].append(k.to_map() if k else None)
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        if self.strategy_info is not None:
            result['strategy_info'] = self.strategy_info.to_map()
        if self.api_type is not None:
            result['api_type'] = self.api_type
        result['api_cross_zone_list'] = []
        if self.api_cross_zone_list is not None:
            for k in self.api_cross_zone_list:
                result['api_cross_zone_list'].append(k.to_map() if k else None)
        if self.registry_group is not None:
            result['registry_group'] = self.registry_group
        if self.parameter is not None:
            result['parameter'] = self.parameter
        if self.up_function_name is not None:
            result['up_function_name'] = self.up_function_name
        if self.param_path_list is not None:
            result['param_path_list'] = self.param_path_list
        if self.service_version is not None:
            result['service_version'] = self.service_version
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
        if self.operation_permission is not None:
            result['operation_permission'] = self.operation_permission
        if self.data_encryption is not None:
            result['data_encryption'] = self.data_encryption
        result['egress_list'] = []
        if self.egress_list is not None:
            for k in self.egress_list:
                result['egress_list'].append(k.to_map() if k else None)
        result['history_version_list'] = []
        if self.history_version_list is not None:
            for k in self.history_version_list:
                result['history_version_list'].append(k.to_map() if k else None)
        if self.ingress is not None:
            result['ingress'] = self.ingress
        if self.model is not None:
            result['model'] = self.model
        if self.req_model_id is not None:
            result['req_model_id'] = self.req_model_id
        if self.req_model_name is not None:
            result['req_model_name'] = self.req_model_name
        if self.req_type is not None:
            result['req_type'] = self.req_type
        if self.resp_model_id is not None:
            result['resp_model_id'] = self.resp_model_id
        if self.resp_model_name is not None:
            result['resp_model_name'] = self.resp_model_name
        if self.resp_type is not None:
            result['resp_type'] = self.resp_type
        result['ingress_list'] = []
        if self.ingress_list is not None:
            for k in self.ingress_list:
                result['ingress_list'].append(k.to_map() if k else None)
        if self.content is not None:
            result['content'] = self.content
        if self.api_count is not None:
            result['api_count'] = self.api_count
        result['field_mapping'] = []
        if self.field_mapping is not None:
            for k in self.field_mapping:
                result['field_mapping'].append(k.to_map() if k else None)
        if self.need_tls is not None:
            result['need_tls'] = self.need_tls
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_cache_model') is not None:
            temp_model = ApiCacheVO()
            self.api_cache_model = temp_model.from_map(m['api_cache_model'])
        if m.get('api_group') is not None:
            temp_model = ApiGroupVO()
            self.api_group = temp_model.from_map(m['api_group'])
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('api_group_name') is not None:
            self.api_group_name = m.get('api_group_name')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('api_limit_config') is not None:
            temp_model = LimitConfigVO()
            self.api_limit_config = temp_model.from_map(m['api_limit_config'])
        if m.get('api_mock_config') is not None:
            temp_model = ApiMockConfigVO()
            self.api_mock_config = temp_model.from_map(m['api_mock_config'])
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('api_status') is not None:
            self.api_status = m.get('api_status')
        if m.get('app_type') is not None:
            self.app_type = m.get('app_type')
        if m.get('authentication_type') is not None:
            self.authentication_type = m.get('authentication_type')
        if m.get('auth_app_count') is not None:
            self.auth_app_count = m.get('auth_app_count')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('charset') is not None:
            self.charset = m.get('charset')
        if m.get('check_result') is not None:
            self.check_result = m.get('check_result')
        if m.get('complete_interface_name') is not None:
            self.complete_interface_name = m.get('complete_interface_name')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('cors_id') is not None:
            self.cors_id = m.get('cors_id')
        if m.get('cors_info') is not None:
            temp_model = CorsInfoVO()
            self.cors_info = temp_model.from_map(m['cors_info'])
        if m.get('current_version_no') is not None:
            self.current_version_no = m.get('current_version_no')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('domain_name') is not None:
            self.domain_name = m.get('domain_name')
        if m.get('downstream_protocol') is not None:
            self.downstream_protocol = m.get('downstream_protocol')
        if m.get('edit_version') is not None:
            temp_model = ApiVersionVO()
            self.edit_version = temp_model.from_map(m['edit_version'])
        if m.get('edit_version_no') is not None:
            self.edit_version_no = m.get('edit_version_no')
        if m.get('external_auth') is not None:
            temp_model = ExternalAuthInfoVO()
            self.external_auth = temp_model.from_map(m['external_auth'])
        if m.get('external_auth_id') is not None:
            self.external_auth_id = m.get('external_auth_id')
        if m.get('function_name') is not None:
            self.function_name = m.get('function_name')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('interface_name') is not None:
            self.interface_name = m.get('interface_name')
        if m.get('method') is not None:
            self.method = m.get('method')
        if m.get('online_version') is not None:
            temp_model = ApiVersionVO()
            self.online_version = temp_model.from_map(m['online_version'])
        if m.get('online_version_no') is not None:
            self.online_version_no = m.get('online_version_no')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('path') is not None:
            self.path = m.get('path')
        if m.get('path_match_type') is not None:
            self.path_match_type = m.get('path_match_type')
        self.req_params = []
        if m.get('req_params') is not None:
            for k in m.get('req_params'):
                temp_model = ApiParamVO()
                self.req_params.append(temp_model.from_map(k))
        if m.get('req_param_mapping') is not None:
            temp_model = ParamMappingInfoVO()
            self.req_param_mapping = temp_model.from_map(m['req_param_mapping'])
        if m.get('req_param_mapping_id') is not None:
            self.req_param_mapping_id = m.get('req_param_mapping_id')
        if m.get('req_param_mapping_type') is not None:
            self.req_param_mapping_type = m.get('req_param_mapping_type')
        if m.get('resp_param_mapping') is not None:
            temp_model = ParamMappingInfoVO()
            self.resp_param_mapping = temp_model.from_map(m['resp_param_mapping'])
        if m.get('resp_param_mapping_id') is not None:
            self.resp_param_mapping_id = m.get('resp_param_mapping_id')
        if m.get('router_id') is not None:
            self.router_id = m.get('router_id')
        if m.get('router_info') is not None:
            temp_model = RouterInfoVO()
            self.router_info = temp_model.from_map(m['router_info'])
        if m.get('router_type') is not None:
            self.router_type = m.get('router_type')
        if m.get('rsq_param') is not None:
            temp_model = ApiParamVO()
            self.rsq_param = temp_model.from_map(m['rsq_param'])
        if m.get('system_cluster') is not None:
            temp_model = SystemClusterVO()
            self.system_cluster = temp_model.from_map(m['system_cluster'])
        if m.get('sys_id') is not None:
            self.sys_id = m.get('sys_id')
        if m.get('target_workspace_id') is not None:
            self.target_workspace_id = m.get('target_workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('update_config_list') is not None:
            self.update_config_list = m.get('update_config_list')
        self.upstream_param_mappings = []
        if m.get('upstream_param_mappings') is not None:
            for k in m.get('upstream_param_mappings'):
                temp_model = ApiParamVO()
                self.upstream_param_mappings.append(temp_model.from_map(k))
        if m.get('upstream_path') is not None:
            self.upstream_path = m.get('upstream_path')
        if m.get('upstream_protocol') is not None:
            self.upstream_protocol = m.get('upstream_protocol')
        if m.get('upstream_type') is not None:
            self.upstream_type = m.get('upstream_type')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('import_result') is not None:
            self.import_result = m.get('import_result')
        self.domain_list = []
        if m.get('domain_list') is not None:
            for k in m.get('domain_list'):
                temp_model = ApiGroupDomainVO()
                self.domain_list.append(temp_model.from_map(k))
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('strategy_info') is not None:
            temp_model = StrategyInfoVO()
            self.strategy_info = temp_model.from_map(m['strategy_info'])
        if m.get('api_type') is not None:
            self.api_type = m.get('api_type')
        self.api_cross_zone_list = []
        if m.get('api_cross_zone_list') is not None:
            for k in m.get('api_cross_zone_list'):
                temp_model = ApiCrossZoneVO()
                self.api_cross_zone_list.append(temp_model.from_map(k))
        if m.get('registry_group') is not None:
            self.registry_group = m.get('registry_group')
        if m.get('parameter') is not None:
            self.parameter = m.get('parameter')
        if m.get('up_function_name') is not None:
            self.up_function_name = m.get('up_function_name')
        if m.get('param_path_list') is not None:
            self.param_path_list = m.get('param_path_list')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('operation_permission') is not None:
            self.operation_permission = m.get('operation_permission')
        if m.get('data_encryption') is not None:
            self.data_encryption = m.get('data_encryption')
        self.egress_list = []
        if m.get('egress_list') is not None:
            for k in m.get('egress_list'):
                temp_model = GateWayConfigVO()
                self.egress_list.append(temp_model.from_map(k))
        self.history_version_list = []
        if m.get('history_version_list') is not None:
            for k in m.get('history_version_list'):
                temp_model = ApiVersionVO()
                self.history_version_list.append(temp_model.from_map(k))
        if m.get('ingress') is not None:
            self.ingress = m.get('ingress')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('req_model_id') is not None:
            self.req_model_id = m.get('req_model_id')
        if m.get('req_model_name') is not None:
            self.req_model_name = m.get('req_model_name')
        if m.get('req_type') is not None:
            self.req_type = m.get('req_type')
        if m.get('resp_model_id') is not None:
            self.resp_model_id = m.get('resp_model_id')
        if m.get('resp_model_name') is not None:
            self.resp_model_name = m.get('resp_model_name')
        if m.get('resp_type') is not None:
            self.resp_type = m.get('resp_type')
        self.ingress_list = []
        if m.get('ingress_list') is not None:
            for k in m.get('ingress_list'):
                temp_model = GateWayConfigVO()
                self.ingress_list.append(temp_model.from_map(k))
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        self.field_mapping = []
        if m.get('field_mapping') is not None:
            for k in m.get('field_mapping'):
                temp_model = ApiflowOutputVO()
                self.field_mapping.append(temp_model.from_map(k))
        if m.get('need_tls') is not None:
            self.need_tls = m.get('need_tls')
        return self


class ApiInfoVO(TeaModel):
    def __init__(
        self,
        api_cache_model: ApiCacheVO = None,
        api_cross_zone_list: List[ApiCrossZoneVO] = None,
        api_group_id: str = None,
        api_group_name: str = None,
        api_id: str = None,
        api_limit_config: LimitConfigVO = None,
        api_mock_config: ApiMockConfigVO = None,
        api_name: str = None,
        api_status: str = None,
        api_type: str = None,
        app_type: str = None,
        authentication_type: str = None,
        auth_app_count: int = None,
        auth_app_info_id: str = None,
        can_delete: bool = None,
        operation_permission: bool = None,
        charset: str = None,
        complete_interface_name: str = None,
        content_type: str = None,
        cors_id: str = None,
        cors_info: CorsInfoVO = None,
        current_version_no: str = None,
        data_encryption: str = None,
        description: str = None,
        domain_name: str = None,
        downstream_protocol: str = None,
        edit_version: ApiVersionVO = None,
        edit_version_no: str = None,
        egress_list: List[GateWayConfigVO] = None,
        external_auth: ExternalAuthInfoVO = None,
        external_auth_id: str = None,
        function_name: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        history_version_list: List[ApiVersionVO] = None,
        ingress: GateWayConfigVO = None,
        interface_name: str = None,
        method: str = None,
        model: str = None,
        online_version: ApiVersionVO = None,
        online_version_no: str = None,
        operation_type: str = None,
        operator: str = None,
        path: str = None,
        path_match_type: str = None,
        req_model_id: str = None,
        req_model_name: str = None,
        req_params: List[ApiParamVO] = None,
        req_param_mapping: ParamMappingInfoVO = None,
        req_param_mapping_id: str = None,
        req_param_mapping_type: str = None,
        req_type: str = None,
        resp_model_id: str = None,
        resp_model_name: str = None,
        resp_param_mapping: ParamMappingInfoVO = None,
        resp_param_mapping_id: str = None,
        resp_type: str = None,
        router_id: str = None,
        router_info: RouterInfoVO = None,
        router_type: str = None,
        rsq_param: ApiParamVO = None,
        system_cluster: SystemClusterVO = None,
        sys_id: str = None,
        tenant_id: str = None,
        timeout: int = None,
        unique_id: str = None,
        upstream_param_mappings: List[ApiParamVO] = None,
        upstream_path: str = None,
        upstream_protocol: str = None,
        upstream_type: str = None,
        workspace_id: str = None,
        strategy_id: str = None,
        strategy_info: StrategyInfoVO = None,
        domain_list: List[ApiGroupDomainVO] = None,
        registry_group: str = None,
        param_path_list: List[str] = None,
        up_function_name: str = None,
        service_version: str = None,
        ingress_list: List[GateWayConfigVO] = None,
        content: str = None,
        api_count: int = None,
        field_mapping: List[ApiflowOutputVO] = None,
        need_tls: bool = None,
        api_group_info: ApiGroupVO = None,
        auth_app_info_list: List[AuthAppInfoVO] = None,
        req_model_info: ApiModelVO = None,
        rsp_model_info: ApiModelVO = None,
        instance_id: str = None,
    ):
        # API缓存模型
        self.api_cache_model = api_cache_model
        # api的网关配置列表
        self.api_cross_zone_list = api_cross_zone_list
        # API分组标识
        self.api_group_id = api_group_id
        # 所属API分组名称
        self.api_group_name = api_group_name
        # API标识
        self.api_id = api_id
        # API限流配置
        self.api_limit_config = api_limit_config
        # api_mock_config
        self.api_mock_config = api_mock_config
        # API名称
        self.api_name = api_name
        # apiStatus
        self.api_status = api_status
        # crossZone双网关 (api 类型)
        self.api_type = api_type
        # 授权应用类型
        self.app_type = app_type
        # authentication_type
        self.authentication_type = authentication_type
        # auth_app_count
        self.auth_app_count = auth_app_count
        # 授权应用Id
        self.auth_app_info_id = auth_app_info_id
        # 是否可以删除
        self.can_delete = can_delete
        # 操作权限
        self.operation_permission = operation_permission
        # charset
        self.charset = charset
        # 完整interfacename
        self.complete_interface_name = complete_interface_name
        # contentType
        self.content_type = content_type
        # cors_id
        self.cors_id = cors_id
        # cors_info
        self.cors_info = cors_info
        # 当前显示的版本
        self.current_version_no = current_version_no
        # 数据加密
        self.data_encryption = data_encryption
        # description
        self.description = description
        # API分组域名
        self.domain_name = domain_name
        # downstreamProtocol
        self.downstream_protocol = downstream_protocol
        # edit_version
        self.edit_version = edit_version
        # 编辑中的API版本号
        self.edit_version_no = edit_version_no
        # 出口网关列表
        self.egress_list = egress_list
        # external_auth
        self.external_auth = external_auth
        # 外部系统标识
        self.external_auth_id = external_auth_id
        # 方法名
        self.function_name = function_name
        # 创建时间
        self.gmt_create = gmt_create
        # 更改时间
        self.gmt_modified = gmt_modified
        # history_version
        self.history_version_list = history_version_list
        # 入口网关
        self.ingress = ingress
        # 接口名称
        self.interface_name = interface_name
        # method
        self.method = method
        # 网关模式
        self.model = model
        # onlineVersion
        self.online_version = online_version
        # 发布中的API版本号
        self.online_version_no = online_version_no
        # operationType
        self.operation_type = operation_type
        # 创建人
        self.operator = operator
        # path
        self.path = path
        # 路径匹配类型
        self.path_match_type = path_match_type
        # 请求body模型id
        self.req_model_id = req_model_id
        # 请求模型名称
        self.req_model_name = req_model_name
        # reqParams
        self.req_params = req_params
        # reqparammapping
        self.req_param_mapping = req_param_mapping
        # 请求参数映射标识
        self.req_param_mapping_id = req_param_mapping_id
        # 参数映射类型（普通\高级）
        self.req_param_mapping_type = req_param_mapping_type
        # body类型一级参数
        self.req_type = req_type
        # 响应参数模型
        self.resp_model_id = resp_model_id
        # 响应模型名称
        self.resp_model_name = resp_model_name
        # respparammapping
        self.resp_param_mapping = resp_param_mapping
        # 响应参数标识
        self.resp_param_mapping_id = resp_param_mapping_id
        # 响应参数一级类型
        self.resp_type = resp_type
        # router_id
        self.router_id = router_id
        # 路由规则
        self.router_info = router_info
        # 路由策略类型
        self.router_type = router_type
        # rsqParam
        self.rsq_param = rsq_param
        # 后端集群
        self.system_cluster = system_cluster
        # sys_id
        self.sys_id = sys_id
        # 租户标识
        self.tenant_id = tenant_id
        # timeout
        self.timeout = timeout
        # unique_id
        self.unique_id = unique_id
        # upstreamParamMappings
        self.upstream_param_mappings = upstream_param_mappings
        # upstreamPath
        self.upstream_path = upstream_path
        # upstreamProtocol
        self.upstream_protocol = upstream_protocol
        # 后端服务类型
        self.upstream_type = upstream_type
        # 工作空间标识
        self.workspace_id = workspace_id
        # 策略ID
        self.strategy_id = strategy_id
        # 策略详情
        self.strategy_info = strategy_info
        # domain_list
        self.domain_list = domain_list
        # registry_group
        self.registry_group = registry_group
        # param_path_list
        self.param_path_list = param_path_list
        # 后端方法名
        self.up_function_name = up_function_name
        # dubbo发布服务版本
        self.service_version = service_version
        # 入口网关
        self.ingress_list = ingress_list
        # content
        self.content = content
        # api_count
        self.api_count = api_count
        # 流程编排的返回参数映射
        self.field_mapping = field_mapping
        # triple协议证书开关
        self.need_tls = need_tls
        # api_group_info
        self.api_group_info = api_group_info
        # 授权对象列表
        self.auth_app_info_list = auth_app_info_list
        # 请求body数据模型
        self.req_model_info = req_model_info
        # 返回body数据模型
        self.rsp_model_info = rsp_model_info
        # 实例ID
        self.instance_id = instance_id

    def validate(self):
        if self.api_cache_model:
            self.api_cache_model.validate()
        if self.api_cross_zone_list:
            for k in self.api_cross_zone_list:
                if k:
                    k.validate()
        if self.api_limit_config:
            self.api_limit_config.validate()
        if self.api_mock_config:
            self.api_mock_config.validate()
        if self.cors_info:
            self.cors_info.validate()
        if self.edit_version:
            self.edit_version.validate()
        if self.egress_list:
            for k in self.egress_list:
                if k:
                    k.validate()
        if self.external_auth:
            self.external_auth.validate()
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.history_version_list:
            for k in self.history_version_list:
                if k:
                    k.validate()
        if self.ingress:
            self.ingress.validate()
        if self.online_version:
            self.online_version.validate()
        if self.req_params:
            for k in self.req_params:
                if k:
                    k.validate()
        if self.req_param_mapping:
            self.req_param_mapping.validate()
        if self.resp_param_mapping:
            self.resp_param_mapping.validate()
        if self.router_info:
            self.router_info.validate()
        if self.rsq_param:
            self.rsq_param.validate()
        if self.system_cluster:
            self.system_cluster.validate()
        if self.upstream_param_mappings:
            for k in self.upstream_param_mappings:
                if k:
                    k.validate()
        if self.strategy_info:
            self.strategy_info.validate()
        if self.domain_list:
            for k in self.domain_list:
                if k:
                    k.validate()
        if self.ingress_list:
            for k in self.ingress_list:
                if k:
                    k.validate()
        if self.field_mapping:
            for k in self.field_mapping:
                if k:
                    k.validate()
        if self.api_group_info:
            self.api_group_info.validate()
        if self.auth_app_info_list:
            for k in self.auth_app_info_list:
                if k:
                    k.validate()
        if self.req_model_info:
            self.req_model_info.validate()
        if self.rsp_model_info:
            self.rsp_model_info.validate()

    def to_map(self):
        result = dict()
        if self.api_cache_model is not None:
            result['api_cache_model'] = self.api_cache_model.to_map()
        result['api_cross_zone_list'] = []
        if self.api_cross_zone_list is not None:
            for k in self.api_cross_zone_list:
                result['api_cross_zone_list'].append(k.to_map() if k else None)
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.api_group_name is not None:
            result['api_group_name'] = self.api_group_name
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.api_limit_config is not None:
            result['api_limit_config'] = self.api_limit_config.to_map()
        if self.api_mock_config is not None:
            result['api_mock_config'] = self.api_mock_config.to_map()
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.api_status is not None:
            result['api_status'] = self.api_status
        if self.api_type is not None:
            result['api_type'] = self.api_type
        if self.app_type is not None:
            result['app_type'] = self.app_type
        if self.authentication_type is not None:
            result['authentication_type'] = self.authentication_type
        if self.auth_app_count is not None:
            result['auth_app_count'] = self.auth_app_count
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
        if self.can_delete is not None:
            result['can_delete'] = self.can_delete
        if self.operation_permission is not None:
            result['operation_permission'] = self.operation_permission
        if self.charset is not None:
            result['charset'] = self.charset
        if self.complete_interface_name is not None:
            result['complete_interface_name'] = self.complete_interface_name
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.cors_id is not None:
            result['cors_id'] = self.cors_id
        if self.cors_info is not None:
            result['cors_info'] = self.cors_info.to_map()
        if self.current_version_no is not None:
            result['current_version_no'] = self.current_version_no
        if self.data_encryption is not None:
            result['data_encryption'] = self.data_encryption
        if self.description is not None:
            result['description'] = self.description
        if self.domain_name is not None:
            result['domain_name'] = self.domain_name
        if self.downstream_protocol is not None:
            result['downstream_protocol'] = self.downstream_protocol
        if self.edit_version is not None:
            result['edit_version'] = self.edit_version.to_map()
        if self.edit_version_no is not None:
            result['edit_version_no'] = self.edit_version_no
        result['egress_list'] = []
        if self.egress_list is not None:
            for k in self.egress_list:
                result['egress_list'].append(k.to_map() if k else None)
        if self.external_auth is not None:
            result['external_auth'] = self.external_auth.to_map()
        if self.external_auth_id is not None:
            result['external_auth_id'] = self.external_auth_id
        if self.function_name is not None:
            result['function_name'] = self.function_name
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        result['history_version_list'] = []
        if self.history_version_list is not None:
            for k in self.history_version_list:
                result['history_version_list'].append(k.to_map() if k else None)
        if self.ingress is not None:
            result['ingress'] = self.ingress.to_map()
        if self.interface_name is not None:
            result['interface_name'] = self.interface_name
        if self.method is not None:
            result['method'] = self.method
        if self.model is not None:
            result['model'] = self.model
        if self.online_version is not None:
            result['online_version'] = self.online_version.to_map()
        if self.online_version_no is not None:
            result['online_version_no'] = self.online_version_no
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.operator is not None:
            result['operator'] = self.operator
        if self.path is not None:
            result['path'] = self.path
        if self.path_match_type is not None:
            result['path_match_type'] = self.path_match_type
        if self.req_model_id is not None:
            result['req_model_id'] = self.req_model_id
        if self.req_model_name is not None:
            result['req_model_name'] = self.req_model_name
        result['req_params'] = []
        if self.req_params is not None:
            for k in self.req_params:
                result['req_params'].append(k.to_map() if k else None)
        if self.req_param_mapping is not None:
            result['req_param_mapping'] = self.req_param_mapping.to_map()
        if self.req_param_mapping_id is not None:
            result['req_param_mapping_id'] = self.req_param_mapping_id
        if self.req_param_mapping_type is not None:
            result['req_param_mapping_type'] = self.req_param_mapping_type
        if self.req_type is not None:
            result['req_type'] = self.req_type
        if self.resp_model_id is not None:
            result['resp_model_id'] = self.resp_model_id
        if self.resp_model_name is not None:
            result['resp_model_name'] = self.resp_model_name
        if self.resp_param_mapping is not None:
            result['resp_param_mapping'] = self.resp_param_mapping.to_map()
        if self.resp_param_mapping_id is not None:
            result['resp_param_mapping_id'] = self.resp_param_mapping_id
        if self.resp_type is not None:
            result['resp_type'] = self.resp_type
        if self.router_id is not None:
            result['router_id'] = self.router_id
        if self.router_info is not None:
            result['router_info'] = self.router_info.to_map()
        if self.router_type is not None:
            result['router_type'] = self.router_type
        if self.rsq_param is not None:
            result['rsq_param'] = self.rsq_param.to_map()
        if self.system_cluster is not None:
            result['system_cluster'] = self.system_cluster.to_map()
        if self.sys_id is not None:
            result['sys_id'] = self.sys_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        result['upstream_param_mappings'] = []
        if self.upstream_param_mappings is not None:
            for k in self.upstream_param_mappings:
                result['upstream_param_mappings'].append(k.to_map() if k else None)
        if self.upstream_path is not None:
            result['upstream_path'] = self.upstream_path
        if self.upstream_protocol is not None:
            result['upstream_protocol'] = self.upstream_protocol
        if self.upstream_type is not None:
            result['upstream_type'] = self.upstream_type
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        if self.strategy_info is not None:
            result['strategy_info'] = self.strategy_info.to_map()
        result['domain_list'] = []
        if self.domain_list is not None:
            for k in self.domain_list:
                result['domain_list'].append(k.to_map() if k else None)
        if self.registry_group is not None:
            result['registry_group'] = self.registry_group
        if self.param_path_list is not None:
            result['param_path_list'] = self.param_path_list
        if self.up_function_name is not None:
            result['up_function_name'] = self.up_function_name
        if self.service_version is not None:
            result['service_version'] = self.service_version
        result['ingress_list'] = []
        if self.ingress_list is not None:
            for k in self.ingress_list:
                result['ingress_list'].append(k.to_map() if k else None)
        if self.content is not None:
            result['content'] = self.content
        if self.api_count is not None:
            result['api_count'] = self.api_count
        result['field_mapping'] = []
        if self.field_mapping is not None:
            for k in self.field_mapping:
                result['field_mapping'].append(k.to_map() if k else None)
        if self.need_tls is not None:
            result['need_tls'] = self.need_tls
        if self.api_group_info is not None:
            result['api_group_info'] = self.api_group_info.to_map()
        result['auth_app_info_list'] = []
        if self.auth_app_info_list is not None:
            for k in self.auth_app_info_list:
                result['auth_app_info_list'].append(k.to_map() if k else None)
        if self.req_model_info is not None:
            result['req_model_info'] = self.req_model_info.to_map()
        if self.rsp_model_info is not None:
            result['rsp_model_info'] = self.rsp_model_info.to_map()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_cache_model') is not None:
            temp_model = ApiCacheVO()
            self.api_cache_model = temp_model.from_map(m['api_cache_model'])
        self.api_cross_zone_list = []
        if m.get('api_cross_zone_list') is not None:
            for k in m.get('api_cross_zone_list'):
                temp_model = ApiCrossZoneVO()
                self.api_cross_zone_list.append(temp_model.from_map(k))
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('api_group_name') is not None:
            self.api_group_name = m.get('api_group_name')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('api_limit_config') is not None:
            temp_model = LimitConfigVO()
            self.api_limit_config = temp_model.from_map(m['api_limit_config'])
        if m.get('api_mock_config') is not None:
            temp_model = ApiMockConfigVO()
            self.api_mock_config = temp_model.from_map(m['api_mock_config'])
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('api_status') is not None:
            self.api_status = m.get('api_status')
        if m.get('api_type') is not None:
            self.api_type = m.get('api_type')
        if m.get('app_type') is not None:
            self.app_type = m.get('app_type')
        if m.get('authentication_type') is not None:
            self.authentication_type = m.get('authentication_type')
        if m.get('auth_app_count') is not None:
            self.auth_app_count = m.get('auth_app_count')
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('can_delete') is not None:
            self.can_delete = m.get('can_delete')
        if m.get('operation_permission') is not None:
            self.operation_permission = m.get('operation_permission')
        if m.get('charset') is not None:
            self.charset = m.get('charset')
        if m.get('complete_interface_name') is not None:
            self.complete_interface_name = m.get('complete_interface_name')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('cors_id') is not None:
            self.cors_id = m.get('cors_id')
        if m.get('cors_info') is not None:
            temp_model = CorsInfoVO()
            self.cors_info = temp_model.from_map(m['cors_info'])
        if m.get('current_version_no') is not None:
            self.current_version_no = m.get('current_version_no')
        if m.get('data_encryption') is not None:
            self.data_encryption = m.get('data_encryption')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('domain_name') is not None:
            self.domain_name = m.get('domain_name')
        if m.get('downstream_protocol') is not None:
            self.downstream_protocol = m.get('downstream_protocol')
        if m.get('edit_version') is not None:
            temp_model = ApiVersionVO()
            self.edit_version = temp_model.from_map(m['edit_version'])
        if m.get('edit_version_no') is not None:
            self.edit_version_no = m.get('edit_version_no')
        self.egress_list = []
        if m.get('egress_list') is not None:
            for k in m.get('egress_list'):
                temp_model = GateWayConfigVO()
                self.egress_list.append(temp_model.from_map(k))
        if m.get('external_auth') is not None:
            temp_model = ExternalAuthInfoVO()
            self.external_auth = temp_model.from_map(m['external_auth'])
        if m.get('external_auth_id') is not None:
            self.external_auth_id = m.get('external_auth_id')
        if m.get('function_name') is not None:
            self.function_name = m.get('function_name')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        self.history_version_list = []
        if m.get('history_version_list') is not None:
            for k in m.get('history_version_list'):
                temp_model = ApiVersionVO()
                self.history_version_list.append(temp_model.from_map(k))
        if m.get('ingress') is not None:
            temp_model = GateWayConfigVO()
            self.ingress = temp_model.from_map(m['ingress'])
        if m.get('interface_name') is not None:
            self.interface_name = m.get('interface_name')
        if m.get('method') is not None:
            self.method = m.get('method')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('online_version') is not None:
            temp_model = ApiVersionVO()
            self.online_version = temp_model.from_map(m['online_version'])
        if m.get('online_version_no') is not None:
            self.online_version_no = m.get('online_version_no')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('path') is not None:
            self.path = m.get('path')
        if m.get('path_match_type') is not None:
            self.path_match_type = m.get('path_match_type')
        if m.get('req_model_id') is not None:
            self.req_model_id = m.get('req_model_id')
        if m.get('req_model_name') is not None:
            self.req_model_name = m.get('req_model_name')
        self.req_params = []
        if m.get('req_params') is not None:
            for k in m.get('req_params'):
                temp_model = ApiParamVO()
                self.req_params.append(temp_model.from_map(k))
        if m.get('req_param_mapping') is not None:
            temp_model = ParamMappingInfoVO()
            self.req_param_mapping = temp_model.from_map(m['req_param_mapping'])
        if m.get('req_param_mapping_id') is not None:
            self.req_param_mapping_id = m.get('req_param_mapping_id')
        if m.get('req_param_mapping_type') is not None:
            self.req_param_mapping_type = m.get('req_param_mapping_type')
        if m.get('req_type') is not None:
            self.req_type = m.get('req_type')
        if m.get('resp_model_id') is not None:
            self.resp_model_id = m.get('resp_model_id')
        if m.get('resp_model_name') is not None:
            self.resp_model_name = m.get('resp_model_name')
        if m.get('resp_param_mapping') is not None:
            temp_model = ParamMappingInfoVO()
            self.resp_param_mapping = temp_model.from_map(m['resp_param_mapping'])
        if m.get('resp_param_mapping_id') is not None:
            self.resp_param_mapping_id = m.get('resp_param_mapping_id')
        if m.get('resp_type') is not None:
            self.resp_type = m.get('resp_type')
        if m.get('router_id') is not None:
            self.router_id = m.get('router_id')
        if m.get('router_info') is not None:
            temp_model = RouterInfoVO()
            self.router_info = temp_model.from_map(m['router_info'])
        if m.get('router_type') is not None:
            self.router_type = m.get('router_type')
        if m.get('rsq_param') is not None:
            temp_model = ApiParamVO()
            self.rsq_param = temp_model.from_map(m['rsq_param'])
        if m.get('system_cluster') is not None:
            temp_model = SystemClusterVO()
            self.system_cluster = temp_model.from_map(m['system_cluster'])
        if m.get('sys_id') is not None:
            self.sys_id = m.get('sys_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        self.upstream_param_mappings = []
        if m.get('upstream_param_mappings') is not None:
            for k in m.get('upstream_param_mappings'):
                temp_model = ApiParamVO()
                self.upstream_param_mappings.append(temp_model.from_map(k))
        if m.get('upstream_path') is not None:
            self.upstream_path = m.get('upstream_path')
        if m.get('upstream_protocol') is not None:
            self.upstream_protocol = m.get('upstream_protocol')
        if m.get('upstream_type') is not None:
            self.upstream_type = m.get('upstream_type')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('strategy_info') is not None:
            temp_model = StrategyInfoVO()
            self.strategy_info = temp_model.from_map(m['strategy_info'])
        self.domain_list = []
        if m.get('domain_list') is not None:
            for k in m.get('domain_list'):
                temp_model = ApiGroupDomainVO()
                self.domain_list.append(temp_model.from_map(k))
        if m.get('registry_group') is not None:
            self.registry_group = m.get('registry_group')
        if m.get('param_path_list') is not None:
            self.param_path_list = m.get('param_path_list')
        if m.get('up_function_name') is not None:
            self.up_function_name = m.get('up_function_name')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        self.ingress_list = []
        if m.get('ingress_list') is not None:
            for k in m.get('ingress_list'):
                temp_model = GateWayConfigVO()
                self.ingress_list.append(temp_model.from_map(k))
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        self.field_mapping = []
        if m.get('field_mapping') is not None:
            for k in m.get('field_mapping'):
                temp_model = ApiflowOutputVO()
                self.field_mapping.append(temp_model.from_map(k))
        if m.get('need_tls') is not None:
            self.need_tls = m.get('need_tls')
        if m.get('api_group_info') is not None:
            temp_model = ApiGroupVO()
            self.api_group_info = temp_model.from_map(m['api_group_info'])
        self.auth_app_info_list = []
        if m.get('auth_app_info_list') is not None:
            for k in m.get('auth_app_info_list'):
                temp_model = AuthAppInfoVO()
                self.auth_app_info_list.append(temp_model.from_map(k))
        if m.get('req_model_info') is not None:
            temp_model = ApiModelVO()
            self.req_model_info = temp_model.from_map(m['req_model_info'])
        if m.get('rsp_model_info') is not None:
            temp_model = ApiModelVO()
            self.rsp_model_info = temp_model.from_map(m['rsp_model_info'])
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class SofaGwHostVO(TeaModel):
    def __init__(
        self,
        address: str = None,
        host_name: str = None,
        meta_data: str = None,
    ):
        # 服务器地址，域名或ip(:端口)
        self.address = address
        # host name
        self.host_name = host_name
        # 元信息
        self.meta_data = meta_data

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.host_name is not None:
            result['host_name'] = self.host_name
        if self.meta_data is not None:
            result['meta_data'] = self.meta_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('host_name') is not None:
            self.host_name = m.get('host_name')
        if m.get('meta_data') is not None:
            self.meta_data = m.get('meta_data')
        return self


class SofaGwUpstreamVO(TeaModel):
    def __init__(
        self,
        method: str = None,
        schema: str = None,
        timeout: int = None,
        url: str = None,
        verify: bool = None,
    ):
        # GET/POST/PUT/DELETE
        self.method = method
        # 协议
        self.schema = schema
        # timeout
        self.timeout = timeout
        # url
        self.url = url
        # 是否签名
        self.verify = verify

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.method is not None:
            result['method'] = self.method
        if self.schema is not None:
            result['schema'] = self.schema
        if self.timeout is not None:
            result['timeout'] = self.timeout
        if self.url is not None:
            result['url'] = self.url
        if self.verify is not None:
            result['verify'] = self.verify
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('method') is not None:
            self.method = m.get('method')
        if m.get('schema') is not None:
            self.schema = m.get('schema')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('verify') is not None:
            self.verify = m.get('verify')
        return self


class ApiflowMachineInstVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        machine_id: str = None,
        tenant_id: str = None,
        parent_id: str = None,
        gmt_started: str = None,
        business_key: str = None,
        start_params: str = None,
        gmt_end: str = None,
        excep: str = None,
        end_params: str = None,
        status: str = None,
        compensation_status: str = None,
        is_running: bool = None,
        gmt_updated: str = None,
    ):
        # id
        self.id = id
        # machine_id
        self.machine_id = machine_id
        # tenant_id
        self.tenant_id = tenant_id
        # parent_id
        self.parent_id = parent_id
        # gmt_started
        self.gmt_started = gmt_started
        # business_key
        self.business_key = business_key
        # start_params
        self.start_params = start_params
        # gmt_end
        self.gmt_end = gmt_end
        # excep
        self.excep = excep
        # end_params
        self.end_params = end_params
        # status
        self.status = status
        # compensation_status
        self.compensation_status = compensation_status
        # is_running
        self.is_running = is_running
        # gmt_updated
        self.gmt_updated = gmt_updated

    def validate(self):
        if self.gmt_started is not None:
            self.validate_pattern(self.gmt_started, 'gmt_started', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_end is not None:
            self.validate_pattern(self.gmt_end, 'gmt_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_updated is not None:
            self.validate_pattern(self.gmt_updated, 'gmt_updated', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.machine_id is not None:
            result['machine_id'] = self.machine_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.gmt_started is not None:
            result['gmt_started'] = self.gmt_started
        if self.business_key is not None:
            result['business_key'] = self.business_key
        if self.start_params is not None:
            result['start_params'] = self.start_params
        if self.gmt_end is not None:
            result['gmt_end'] = self.gmt_end
        if self.excep is not None:
            result['excep'] = self.excep
        if self.end_params is not None:
            result['end_params'] = self.end_params
        if self.status is not None:
            result['status'] = self.status
        if self.compensation_status is not None:
            result['compensation_status'] = self.compensation_status
        if self.is_running is not None:
            result['is_running'] = self.is_running
        if self.gmt_updated is not None:
            result['gmt_updated'] = self.gmt_updated
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('machine_id') is not None:
            self.machine_id = m.get('machine_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('gmt_started') is not None:
            self.gmt_started = m.get('gmt_started')
        if m.get('business_key') is not None:
            self.business_key = m.get('business_key')
        if m.get('start_params') is not None:
            self.start_params = m.get('start_params')
        if m.get('gmt_end') is not None:
            self.gmt_end = m.get('gmt_end')
        if m.get('excep') is not None:
            self.excep = m.get('excep')
        if m.get('end_params') is not None:
            self.end_params = m.get('end_params')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('compensation_status') is not None:
            self.compensation_status = m.get('compensation_status')
        if m.get('is_running') is not None:
            self.is_running = m.get('is_running')
        if m.get('gmt_updated') is not None:
            self.gmt_updated = m.get('gmt_updated')
        return self


class BatchActionResult(TeaModel):
    def __init__(
        self,
        results: List[ActionResult] = None,
        total_count: int = None,
        success_count: int = None,
        failed_count: int = None,
    ):
        # 批量挂载结果
        self.results = results
        # total_count
        self.total_count = total_count
        # success_count
        self.success_count = success_count
        # failed_count
        self.failed_count = failed_count

    def validate(self):
        if self.results:
            for k in self.results:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['results'] = []
        if self.results is not None:
            for k in self.results:
                result['results'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.failed_count is not None:
            result['failed_count'] = self.failed_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.results = []
        if m.get('results') is not None:
            for k in m.get('results'):
                temp_model = ActionResult()
                self.results.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('failed_count') is not None:
            self.failed_count = m.get('failed_count')
        return self


class ImportResult(TeaModel):
    def __init__(
        self,
        code: str = None,
        error_config: str = None,
        error_message: str = None,
        id: str = None,
        name: str = None,
        success: bool = None,
        config_name: str = None,
    ):
        # code
        self.code = code
        # 覆盖报错的配置
        self.error_config = error_config
        # error_message
        self.error_message = error_message
        # API的ID
        self.id = id
        # API的名称
        self.name = name
        # 覆盖成功的标识
        self.success = success
        # 覆盖失败的配置名称
        self.config_name = config_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.error_config is not None:
            result['error_config'] = self.error_config
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.success is not None:
            result['success'] = self.success
        if self.config_name is not None:
            result['config_name'] = self.config_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('error_config') is not None:
            self.error_config = m.get('error_config')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('config_name') is not None:
            self.config_name = m.get('config_name')
        return self


class ApiTestParamVO(TeaModel):
    def __init__(
        self,
        location: str = None,
        key: str = None,
        value: str = None,
    ):
        # location
        self.location = location
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.location is not None:
            result['location'] = self.location
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class ApiflowInstVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        machine_inst_id: str = None,
        name: str = None,
        type: str = None,
        service_name: str = None,
        service_method: str = None,
        service_type: str = None,
        business_key: str = None,
        state_id_compensated_for: str = None,
        state_id_retried_for: str = None,
        gmt_started: str = None,
        is_for_update: bool = None,
        input_params: str = None,
        output_params: str = None,
        status: str = None,
        excep: str = None,
        gmt_updated: str = None,
        gmt_end: str = None,
    ):
        # id
        self.id = id
        # machine_inst_id
        self.machine_inst_id = machine_inst_id
        # name
        self.name = name
        # type
        self.type = type
        # service_name
        self.service_name = service_name
        # service_method
        self.service_method = service_method
        # service_type
        self.service_type = service_type
        # business_key
        self.business_key = business_key
        # state_id_compensated_for
        self.state_id_compensated_for = state_id_compensated_for
        # state_id_retried_for
        self.state_id_retried_for = state_id_retried_for
        # gmt_started
        self.gmt_started = gmt_started
        # is_for_update
        self.is_for_update = is_for_update
        # input_params
        self.input_params = input_params
        # output_params
        self.output_params = output_params
        # status
        self.status = status
        # excep
        self.excep = excep
        # gmt_updated
        self.gmt_updated = gmt_updated
        # gmt_end
        self.gmt_end = gmt_end

    def validate(self):
        if self.gmt_started is not None:
            self.validate_pattern(self.gmt_started, 'gmt_started', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_updated is not None:
            self.validate_pattern(self.gmt_updated, 'gmt_updated', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_end is not None:
            self.validate_pattern(self.gmt_end, 'gmt_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.machine_inst_id is not None:
            result['machine_inst_id'] = self.machine_inst_id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.service_name is not None:
            result['service_name'] = self.service_name
        if self.service_method is not None:
            result['service_method'] = self.service_method
        if self.service_type is not None:
            result['service_type'] = self.service_type
        if self.business_key is not None:
            result['business_key'] = self.business_key
        if self.state_id_compensated_for is not None:
            result['state_id_compensated_for'] = self.state_id_compensated_for
        if self.state_id_retried_for is not None:
            result['state_id_retried_for'] = self.state_id_retried_for
        if self.gmt_started is not None:
            result['gmt_started'] = self.gmt_started
        if self.is_for_update is not None:
            result['is_for_update'] = self.is_for_update
        if self.input_params is not None:
            result['input_params'] = self.input_params
        if self.output_params is not None:
            result['output_params'] = self.output_params
        if self.status is not None:
            result['status'] = self.status
        if self.excep is not None:
            result['excep'] = self.excep
        if self.gmt_updated is not None:
            result['gmt_updated'] = self.gmt_updated
        if self.gmt_end is not None:
            result['gmt_end'] = self.gmt_end
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('machine_inst_id') is not None:
            self.machine_inst_id = m.get('machine_inst_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        if m.get('service_method') is not None:
            self.service_method = m.get('service_method')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        if m.get('business_key') is not None:
            self.business_key = m.get('business_key')
        if m.get('state_id_compensated_for') is not None:
            self.state_id_compensated_for = m.get('state_id_compensated_for')
        if m.get('state_id_retried_for') is not None:
            self.state_id_retried_for = m.get('state_id_retried_for')
        if m.get('gmt_started') is not None:
            self.gmt_started = m.get('gmt_started')
        if m.get('is_for_update') is not None:
            self.is_for_update = m.get('is_for_update')
        if m.get('input_params') is not None:
            self.input_params = m.get('input_params')
        if m.get('output_params') is not None:
            self.output_params = m.get('output_params')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('excep') is not None:
            self.excep = m.get('excep')
        if m.get('gmt_updated') is not None:
            self.gmt_updated = m.get('gmt_updated')
        if m.get('gmt_end') is not None:
            self.gmt_end = m.get('gmt_end')
        return self


class OperatorVO(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        customer: str = None,
        email: str = None,
        id: str = None,
        login_name: str = None,
        mobile: str = None,
        nick_name: str = None,
        real_name: str = None,
        status: str = None,
        tenants: List[str] = None,
        update_time: str = None,
        work_no: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # 创建时间
        self.create_time = create_time
        # 企业的唯一标识
        self.customer = customer
        # 邮箱
        self.email = email
        # 操作员ID
        self.id = id
        # 登录名
        self.login_name = login_name
        # 手机号
        self.mobile = mobile
        # 昵称
        self.nick_name = nick_name
        # 真实姓名
        self.real_name = real_name
        # 操作员状态
        self.status = status
        # 租户
        self.tenants = tenants
        # 操作员最近一次修改时间，ISO8601格式
        self.update_time = update_time
        # 操作员工号
        self.work_no = work_no
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.email is not None:
            result['email'] = self.email
        if self.id is not None:
            result['id'] = self.id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
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
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ContactInfoVO(TeaModel):
    def __init__(
        self,
        auth_app_info_id: str = None,
        company: str = None,
        contact_id: str = None,
        mail: str = None,
        name: str = None,
        tel: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
    ):
        # 授权App标识
        self.auth_app_info_id = auth_app_info_id
        # 公司名称
        self.company = company
        # 联系方式标识
        self.contact_id = contact_id
        # 电子邮箱
        self.mail = mail
        # 联系人姓名
        self.name = name
        # 电话号码
        self.tel = tel
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # 创建时间
        self.gmt_create = gmt_create
        # 更新时间
        self.gmt_modified = gmt_modified

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
        if self.company is not None:
            result['company'] = self.company
        if self.contact_id is not None:
            result['contact_id'] = self.contact_id
        if self.mail is not None:
            result['mail'] = self.mail
        if self.name is not None:
            result['name'] = self.name
        if self.tel is not None:
            result['tel'] = self.tel
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('company') is not None:
            self.company = m.get('company')
        if m.get('contact_id') is not None:
            self.contact_id = m.get('contact_id')
        if m.get('mail') is not None:
            self.mail = m.get('mail')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tel') is not None:
            self.tel = m.get('tel')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class SofaGwControlVO(TeaModel):
    def __init__(
        self,
        add_items: List[str] = None,
        instance_id: str = None,
        items: List[str] = None,
        match: str = None,
        remove_items: List[str] = None,
        service_name: str = None,
        sub_type: str = None,
        type: str = None,
    ):
        # 要添加的授权的app_name列表
        self.add_items = add_items
        # 实例标识
        self.instance_id = instance_id
        # 授权的app_name列表
        self.items = items
        # 固定值：app
        self.match = match
        # 要删除的授权的app_name列表
        self.remove_items = remove_items
        # service name
        self.service_name = service_name
        # 子类型，固定值：whitelist
        self.sub_type = sub_type
        # 控制类型，固定值：access-control
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.add_items is not None:
            result['add_items'] = self.add_items
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.items is not None:
            result['items'] = self.items
        if self.match is not None:
            result['match'] = self.match
        if self.remove_items is not None:
            result['remove_items'] = self.remove_items
        if self.service_name is not None:
            result['service_name'] = self.service_name
        if self.sub_type is not None:
            result['sub_type'] = self.sub_type
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('add_items') is not None:
            self.add_items = m.get('add_items')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('items') is not None:
            self.items = m.get('items')
        if m.get('match') is not None:
            self.match = m.get('match')
        if m.get('remove_items') is not None:
            self.remove_items = m.get('remove_items')
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        if m.get('sub_type') is not None:
            self.sub_type = m.get('sub_type')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class MonitorData(TeaModel):
    def __init__(
        self,
        timestamp: int = None,
        value: int = None,
    ):
        # 时间点
        self.timestamp = timestamp
        # value
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class PageInfo(TeaModel):
    def __init__(
        self,
        order_infos: List[OrderInfo] = None,
        page_index: int = None,
        page_size: int = None,
        total: int = None,
    ):
        # 排序信息
        self.order_infos = order_infos
        # 当前页
        self.page_index = page_index
        # 每页记录数
        self.page_size = page_size
        # 总数
        self.total = total

    def validate(self):
        if self.order_infos:
            for k in self.order_infos:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['order_infos'] = []
        if self.order_infos is not None:
            for k in self.order_infos:
                result['order_infos'].append(k.to_map() if k else None)
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.order_infos = []
        if m.get('order_infos') is not None:
            for k in m.get('order_infos'):
                temp_model = OrderInfo()
                self.order_infos.append(temp_model.from_map(k))
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class SofaGwDownstream(TeaModel):
    def __init__(
        self,
        auth: List[SofaGwAuthenticationVO] = None,
        method: str = None,
        schema: str = None,
        url: str = None,
        verify: bool = None,
    ):
        # 认证信息
        self.auth = auth
        # GET/POST/PUT/DELETE
        self.method = method
        # 协议
        self.schema = schema
        # url
        self.url = url
        # 是否签名
        self.verify = verify

    def validate(self):
        if self.auth:
            for k in self.auth:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['auth'] = []
        if self.auth is not None:
            for k in self.auth:
                result['auth'].append(k.to_map() if k else None)
        if self.method is not None:
            result['method'] = self.method
        if self.schema is not None:
            result['schema'] = self.schema
        if self.url is not None:
            result['url'] = self.url
        if self.verify is not None:
            result['verify'] = self.verify
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.auth = []
        if m.get('auth') is not None:
            for k in m.get('auth'):
                temp_model = SofaGwAuthenticationVO()
                self.auth.append(temp_model.from_map(k))
        if m.get('method') is not None:
            self.method = m.get('method')
        if m.get('schema') is not None:
            self.schema = m.get('schema')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('verify') is not None:
            self.verify = m.get('verify')
        return self


class AuthUserInfoVO(TeaModel):
    def __init__(
        self,
        api_group_id: str = None,
        api_id: str = None,
        auth_status: str = None,
        auth_user_id: str = None,
        customer: str = None,
        email: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        login_name: str = None,
        mobile: str = None,
        nick_name: str = None,
        operator: str = None,
        real_name: str = None,
        status: str = None,
        tenant_id: str = None,
        user_id: str = None,
        workspace_id: str = None,
        work_no: str = None,
        can_auth: bool = None,
    ):
        # api分组标识符
        self.api_group_id = api_group_id
        # api标识符
        self.api_id = api_id
        # 授权状态
        self.auth_status = auth_status
        # 授权用户唯一标识
        self.auth_user_id = auth_user_id
        # 企业的唯一标识
        self.customer = customer
        # 邮箱
        self.email = email
        # 创建日期
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 登录名
        self.login_name = login_name
        # 手机号
        self.mobile = mobile
        # 昵称
        self.nick_name = nick_name
        # operator
        self.operator = operator
        # 真实性名
        self.real_name = real_name
        # 操作员状态
        self.status = status
        # 租户ID
        self.tenant_id = tenant_id
        # 用户标识
        self.user_id = user_id
        # workspace id
        self.workspace_id = workspace_id
        # 工号
        self.work_no = work_no
        # 能否操作授权
        self.can_auth = can_auth

    def validate(self):
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        if self.auth_user_id is not None:
            result['auth_user_id'] = self.auth_user_id
        if self.customer is not None:
            result['customer'] = self.customer
        if self.email is not None:
            result['email'] = self.email
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        if self.operator is not None:
            result['operator'] = self.operator
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.status is not None:
            result['status'] = self.status
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.work_no is not None:
            result['work_no'] = self.work_no
        if self.can_auth is not None:
            result['can_auth'] = self.can_auth
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        if m.get('auth_user_id') is not None:
            self.auth_user_id = m.get('auth_user_id')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('work_no') is not None:
            self.work_no = m.get('work_no')
        if m.get('can_auth') is not None:
            self.can_auth = m.get('can_auth')
        return self


class AppInfoPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[AppInfoVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # pageInfo
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = AppInfoVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class RegistryInfoQueryVO(TeaModel):
    def __init__(
        self,
        fuzzy_search: bool = None,
        page_info: PageInfo = None,
        query: RegistryInfoVO = None,
    ):
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search
        # page_info
        self.page_info = page_info
        # query
        self.query = query

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = RegistryInfoVO()
            self.query = temp_model.from_map(m['query'])
        return self


class RouterInfoPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[RouterInfoVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # pageInfo
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = RouterInfoVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class ApiGroupAuthUserConfigVO(TeaModel):
    def __init__(
        self,
        api_auth_user_switch: str = None,
        check_master: bool = None,
        need_api_auth_user: bool = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # api授权管理开关
        self.api_auth_user_switch = api_auth_user_switch
        # 是否是管理员
        self.check_master = check_master
        # 需要api授权管理
        self.need_api_auth_user = need_api_auth_user
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.api_auth_user_switch is not None:
            result['api_auth_user_switch'] = self.api_auth_user_switch
        if self.check_master is not None:
            result['check_master'] = self.check_master
        if self.need_api_auth_user is not None:
            result['need_api_auth_user'] = self.need_api_auth_user
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_auth_user_switch') is not None:
            self.api_auth_user_switch = m.get('api_auth_user_switch')
        if m.get('check_master') is not None:
            self.check_master = m.get('check_master')
        if m.get('need_api_auth_user') is not None:
            self.need_api_auth_user = m.get('need_api_auth_user')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AuthAppInfoPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[AuthAppInfoVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # pageInfo
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = AuthAppInfoVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class ParamMappingInfoPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[ParamMappingInfoVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # pageInfo
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ParamMappingInfoVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class SofaGwClusterVO(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        hosts: List[SofaGwHostVO] = None,
        id: int = None,
        instance_id: str = None,
        name: str = None,
    ):
        # app name
        self.app_name = app_name
        # hosts
        self.hosts = hosts
        # id
        self.id = id
        # 实例标识
        self.instance_id = instance_id
        # 集群名
        self.name = name

    def validate(self):
        if self.hosts:
            for k in self.hosts:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        result['hosts'] = []
        if self.hosts is not None:
            for k in self.hosts:
                result['hosts'].append(k.to_map() if k else None)
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        self.hosts = []
        if m.get('hosts') is not None:
            for k in m.get('hosts'):
                temp_model = SofaGwHostVO()
                self.hosts.append(temp_model.from_map(k))
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class RegistryInfoPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[RegistryInfoVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # page_info
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = RegistryInfoVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class MonitoryRequest(TeaModel):
    def __init__(
        self,
        api_id: str = None,
        app_id: str = None,
        code: str = None,
        start_time: int = None,
        end_time: int = None,
    ):
        # API标识
        self.api_id = api_id
        # App标识
        self.app_id = app_id
        # code
        self.code = code
        # 开始时间
        self.start_time = start_time
        # end_time
        self.end_time = end_time

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.code is not None:
            result['code'] = self.code
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class ContactInfoPagedListVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        list: List[ContactInfoVO] = None,
    ):
        # 分页信息
        self.page_info = page_info
        # 联系方式列表
        self.list = list

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ContactInfoVO()
                self.list.append(temp_model.from_map(k))
        return self


class StrategyPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[StrategyInfoVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # 分页信息
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = StrategyInfoVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class SystemClusterPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[SystemClusterVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # page_info
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = SystemClusterVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class AppInfoQueryVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        query: AppInfoVO = None,
    ):
        # pageInfo
        self.page_info = page_info
        # query
        self.query = query

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = AppInfoVO()
            self.query = temp_model.from_map(m['query'])
        return self


class ApiflowMachineDefQueryVO(TeaModel):
    def __init__(
        self,
        fuzzy_search: bool = None,
        page_info: PageInfo = None,
        query: ApiflowMachineDefVO = None,
    ):
        # fuzzy_search
        self.fuzzy_search = fuzzy_search
        # page_info
        self.page_info = page_info
        # query
        self.query = query

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = ApiflowMachineDefVO()
            self.query = temp_model.from_map(m['query'])
        return self


class LdcInfoVO(TeaModel):
    def __init__(
        self,
        enable: bool = None,
        param_location: str = None,
        param_key: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # 是否开启
        self.enable = enable
        # 参数位置
        self.param_location = param_location
        # 参数名
        self.param_key = param_key
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.enable is not None:
            result['enable'] = self.enable
        if self.param_location is not None:
            result['param_location'] = self.param_location
        if self.param_key is not None:
            result['param_key'] = self.param_key
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('enable') is not None:
            self.enable = m.get('enable')
        if m.get('param_location') is not None:
            self.param_location = m.get('param_location')
        if m.get('param_key') is not None:
            self.param_key = m.get('param_key')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ContactInfoQueryVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        query: ContactInfoVO = None,
        fuzzy_search: bool = None,
    ):
        # 分页信息
        self.page_info = page_info
        # query
        self.query = query
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = ContactInfoVO()
            self.query = temp_model.from_map(m['query'])
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        return self


class ApiGroupQueryVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        query: ApiGroupVO = None,
        fuzzy_search: bool = None,
    ):
        # page_info
        self.page_info = page_info
        # query
        self.query = query
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = ApiGroupVO()
            self.query = temp_model.from_map(m['query'])
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        return self


class EngineVO(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        workspace_id: str = None,
        template_id: str = None,
        engine_type: str = None,
        add_request: bool = None,
        add_timestamp: bool = None,
        save_to_db: bool = None,
        params: str = None,
    ):
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # 流程编排标识
        self.template_id = template_id
        # 内嵌模式、云端模式
        self.engine_type = engine_type
        # add_request
        self.add_request = add_request
        # add_timestamp
        self.add_timestamp = add_timestamp
        # save_to_db
        self.save_to_db = save_to_db
        # 流程编排  （内嵌模式）初始化的入参
        self.params = params

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.engine_type is not None:
            result['engine_type'] = self.engine_type
        if self.add_request is not None:
            result['add_request'] = self.add_request
        if self.add_timestamp is not None:
            result['add_timestamp'] = self.add_timestamp
        if self.save_to_db is not None:
            result['save_to_db'] = self.save_to_db
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('engine_type') is not None:
            self.engine_type = m.get('engine_type')
        if m.get('add_request') is not None:
            self.add_request = m.get('add_request')
        if m.get('add_timestamp') is not None:
            self.add_timestamp = m.get('add_timestamp')
        if m.get('save_to_db') is not None:
            self.save_to_db = m.get('save_to_db')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class ParamMappingInfoQueryVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        query: ParamMappingInfoVO = None,
        fuzzy_search: bool = None,
    ):
        # pageInfo
        self.page_info = page_info
        # query
        self.query = query
        # 支持模糊查询
        self.fuzzy_search = fuzzy_search

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = ParamMappingInfoVO()
            self.query = temp_model.from_map(m['query'])
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        return self


class ApiTestReqVO(TeaModel):
    def __init__(
        self,
        api_id: str = None,
        app_id: str = None,
        params: List[ApiTestParamVO] = None,
        payload: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # API标识
        self.api_id = api_id
        # 应用标识
        self.app_id = app_id
        # params
        self.params = params
        # payload
        self.payload = payload
        # tenant_id
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.params:
            for k in self.params:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        result['params'] = []
        if self.params is not None:
            for k in self.params:
                result['params'].append(k.to_map() if k else None)
        if self.payload is not None:
            result['payload'] = self.payload
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        self.params = []
        if m.get('params') is not None:
            for k in m.get('params'):
                temp_model = ApiTestParamVO()
                self.params.append(temp_model.from_map(k))
        if m.get('payload') is not None:
            self.payload = m.get('payload')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class SystemClusterQueryVO(TeaModel):
    def __init__(
        self,
        fuzzy_search: bool = None,
        page_info: PageInfo = None,
        query: SystemClusterVO = None,
    ):
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search
        # page_info
        self.page_info = page_info
        # query
        self.query = query

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = SystemClusterVO()
            self.query = temp_model.from_map(m['query'])
        return self


class AuthAppInfoQueryVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        query: AuthAppInfoVO = None,
        query_condition: str = None,
        fuzzy_search: bool = None,
    ):
        # pageInfo
        self.page_info = page_info
        # query
        self.query = query
        # 自定义查询条件
        self.query_condition = query_condition
        # 是否支持模糊查询
        self.fuzzy_search = fuzzy_search

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        if self.query_condition is not None:
            result['query_condition'] = self.query_condition
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = AuthAppInfoVO()
            self.query = temp_model.from_map(m['query'])
        if m.get('query_condition') is not None:
            self.query_condition = m.get('query_condition')
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        return self


class AuthUserInfoQueryVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        query: AuthUserInfoVO = None,
        fuzzy_search: bool = None,
    ):
        # pageInfo
        self.page_info = page_info
        # OperatorVO
        self.query = query
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = AuthUserInfoVO()
            self.query = temp_model.from_map(m['query'])
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        return self


class HomePageVO(TeaModel):
    def __init__(
        self,
        api_group_count: int = None,
        api_count: int = None,
        app_count: int = None,
    ):
        # api分组数量
        self.api_group_count = api_group_count
        # api数量
        self.api_count = api_count
        # app数量
        self.app_count = app_count

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.api_group_count is not None:
            result['api_group_count'] = self.api_group_count
        if self.api_count is not None:
            result['api_count'] = self.api_count
        if self.app_count is not None:
            result['app_count'] = self.app_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_group_count') is not None:
            self.api_group_count = m.get('api_group_count')
        if m.get('api_count') is not None:
            self.api_count = m.get('api_count')
        if m.get('app_count') is not None:
            self.app_count = m.get('app_count')
        return self


class ApiflowMachineInstQueryVO(TeaModel):
    def __init__(
        self,
        fuzzy_search: bool = None,
        page_info: PageInfo = None,
        query: ApiflowMachineInstVO = None,
    ):
        # fuzzy_search
        self.fuzzy_search = fuzzy_search
        # page_info
        self.page_info = page_info
        # query
        self.query = query

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = ApiflowMachineInstVO()
            self.query = temp_model.from_map(m['query'])
        return self


class ApiModelQueryVO(TeaModel):
    def __init__(
        self,
        fuzzy_search: bool = None,
        page_info: PageInfo = None,
        query: ApiModelVO = None,
    ):
        # 支持模糊查询
        self.fuzzy_search = fuzzy_search
        # page_info
        self.page_info = page_info
        # query
        self.query = query

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = ApiModelVO()
            self.query = temp_model.from_map(m['query'])
        return self


class ExternalAuthInfoQueryVO(TeaModel):
    def __init__(
        self,
        fuzzy_search: bool = None,
        page_info: PageInfo = None,
        query: ExternalAuthInfoVO = None,
    ):
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search
        # pageInfo
        self.page_info = page_info
        # query
        self.query = query

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = ExternalAuthInfoVO()
            self.query = temp_model.from_map(m['query'])
        return self


class SofaGwService(TeaModel):
    def __init__(
        self,
        app_name: str = None,
        cluster_name: str = None,
        controls: List[SofaGwControlVO] = None,
        downstream: SofaGwDownstream = None,
        id: int = None,
        instance_id: str = None,
        name: str = None,
        service_version: str = None,
        status: str = None,
        upstream: SofaGwUpstreamVO = None,
    ):
        # app name
        self.app_name = app_name
        # cluster name
        self.cluster_name = cluster_name
        # controls
        self.controls = controls
        # downstream
        self.downstream = downstream
        # id
        self.id = id
        # 实例标识
        self.instance_id = instance_id
        # service name
        self.name = name
        # service_version
        self.service_version = service_version
        # 上线:online, 下线:offline
        self.status = status
        # upstream
        self.upstream = upstream

    def validate(self):
        if self.controls:
            for k in self.controls:
                if k:
                    k.validate()
        if self.downstream:
            self.downstream.validate()
        if self.upstream:
            self.upstream.validate()

    def to_map(self):
        result = dict()
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.cluster_name is not None:
            result['cluster_name'] = self.cluster_name
        result['controls'] = []
        if self.controls is not None:
            for k in self.controls:
                result['controls'].append(k.to_map() if k else None)
        if self.downstream is not None:
            result['downstream'] = self.downstream.to_map()
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.service_version is not None:
            result['service_version'] = self.service_version
        if self.status is not None:
            result['status'] = self.status
        if self.upstream is not None:
            result['upstream'] = self.upstream.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('cluster_name') is not None:
            self.cluster_name = m.get('cluster_name')
        self.controls = []
        if m.get('controls') is not None:
            for k in m.get('controls'):
                temp_model = SofaGwControlVO()
                self.controls.append(temp_model.from_map(k))
        if m.get('downstream') is not None:
            temp_model = SofaGwDownstream()
            self.downstream = temp_model.from_map(m['downstream'])
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('upstream') is not None:
            temp_model = SofaGwUpstreamVO()
            self.upstream = temp_model.from_map(m['upstream'])
        return self


class ApiTransferResult(TeaModel):
    def __init__(
        self,
        api_transfer_list: List[ApiTransferVO] = None,
        batch_action_result: BatchActionResult = None,
        file_name: str = None,
        apiflow_list: List[ApiInfoVO] = None,
    ):
        # api配置
        self.api_transfer_list = api_transfer_list
        # 批量转移结果
        self.batch_action_result = batch_action_result
        # file_name
        self.file_name = file_name
        # 流程编排列表
        self.apiflow_list = apiflow_list

    def validate(self):
        if self.api_transfer_list:
            for k in self.api_transfer_list:
                if k:
                    k.validate()
        if self.batch_action_result:
            self.batch_action_result.validate()
        if self.apiflow_list:
            for k in self.apiflow_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['api_transfer_list'] = []
        if self.api_transfer_list is not None:
            for k in self.api_transfer_list:
                result['api_transfer_list'].append(k.to_map() if k else None)
        if self.batch_action_result is not None:
            result['batch_action_result'] = self.batch_action_result.to_map()
        if self.file_name is not None:
            result['file_name'] = self.file_name
        result['apiflow_list'] = []
        if self.apiflow_list is not None:
            for k in self.apiflow_list:
                result['apiflow_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.api_transfer_list = []
        if m.get('api_transfer_list') is not None:
            for k in m.get('api_transfer_list'):
                temp_model = ApiTransferVO()
                self.api_transfer_list.append(temp_model.from_map(k))
        if m.get('batch_action_result') is not None:
            temp_model = BatchActionResult()
            self.batch_action_result = temp_model.from_map(m['batch_action_result'])
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        self.apiflow_list = []
        if m.get('apiflow_list') is not None:
            for k in m.get('apiflow_list'):
                temp_model = ApiInfoVO()
                self.apiflow_list.append(temp_model.from_map(k))
        return self


class BatchImportResult(TeaModel):
    def __init__(
        self,
        failed_count: int = None,
        repeat_api_list: List[ApiTransferVO] = None,
        results: List[ImportResult] = None,
        success_count: int = None,
        total_count: int = None,
        success_api_list: List[ApiInfoVO] = None,
    ):
        # failed_count
        self.failed_count = failed_count
        # 重复的API列表
        self.repeat_api_list = repeat_api_list
        # results
        self.results = results
        # success_count
        self.success_count = success_count
        # total_count
        self.total_count = total_count
        # 导入成功的API列表
        self.success_api_list = success_api_list

    def validate(self):
        if self.repeat_api_list:
            for k in self.repeat_api_list:
                if k:
                    k.validate()
        if self.results:
            for k in self.results:
                if k:
                    k.validate()
        if self.success_api_list:
            for k in self.success_api_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.failed_count is not None:
            result['failed_count'] = self.failed_count
        result['repeat_api_list'] = []
        if self.repeat_api_list is not None:
            for k in self.repeat_api_list:
                result['repeat_api_list'].append(k.to_map() if k else None)
        result['results'] = []
        if self.results is not None:
            for k in self.results:
                result['results'].append(k.to_map() if k else None)
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['success_api_list'] = []
        if self.success_api_list is not None:
            for k in self.success_api_list:
                result['success_api_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('failed_count') is not None:
            self.failed_count = m.get('failed_count')
        self.repeat_api_list = []
        if m.get('repeat_api_list') is not None:
            for k in m.get('repeat_api_list'):
                temp_model = ApiTransferVO()
                self.repeat_api_list.append(temp_model.from_map(k))
        self.results = []
        if m.get('results') is not None:
            for k in m.get('results'):
                temp_model = ImportResult()
                self.results.append(temp_model.from_map(k))
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.success_api_list = []
        if m.get('success_api_list') is not None:
            for k in m.get('success_api_list'):
                temp_model = ApiInfoVO()
                self.success_api_list.append(temp_model.from_map(k))
        return self


class ApiflowMachineDefPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[ApiflowMachineDefVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # page_info
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ApiflowMachineDefVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class OperatorPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[OperatorVO] = None,
        page_info: PageInfo = None,
    ):
        # 当前页的数据
        self.list = list
        # page_info
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = OperatorVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class CorsInfoPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[CorsInfoVO] = None,
        page_info: PageInfo = None,
    ):
        # cors列表
        self.list = list
        # 分页信息
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = CorsInfoVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class ApiInfoPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[ApiInfoVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # pageInfo
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ApiInfoVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class OperatorQueryVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        query: OperatorVO = None,
    ):
        # pageInfo
        self.page_info = page_info
        # query
        self.query = query

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = OperatorVO()
            self.query = temp_model.from_map(m['query'])
        return self


class CheckApiResult(TeaModel):
    def __init__(
        self,
        all_api_list: List[ApiTransferVO] = None,
        failed_api_list: List[ApiTransferVO] = None,
        success_api_list: List[ApiTransferVO] = None,
        check_result: str = None,
    ):
        # 导入的所有的API集合
        self.all_api_list = all_api_list
        # API或者配置中有重复的集合
        self.failed_api_list = failed_api_list
        # 
        # API包括配置无重复的集合
        self.success_api_list = success_api_list
        # 失败api配置详情
        self.check_result = check_result

    def validate(self):
        if self.all_api_list:
            for k in self.all_api_list:
                if k:
                    k.validate()
        if self.failed_api_list:
            for k in self.failed_api_list:
                if k:
                    k.validate()
        if self.success_api_list:
            for k in self.success_api_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['all_api_list'] = []
        if self.all_api_list is not None:
            for k in self.all_api_list:
                result['all_api_list'].append(k.to_map() if k else None)
        result['failed_api_list'] = []
        if self.failed_api_list is not None:
            for k in self.failed_api_list:
                result['failed_api_list'].append(k.to_map() if k else None)
        result['success_api_list'] = []
        if self.success_api_list is not None:
            for k in self.success_api_list:
                result['success_api_list'].append(k.to_map() if k else None)
        if self.check_result is not None:
            result['check_result'] = self.check_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.all_api_list = []
        if m.get('all_api_list') is not None:
            for k in m.get('all_api_list'):
                temp_model = ApiTransferVO()
                self.all_api_list.append(temp_model.from_map(k))
        self.failed_api_list = []
        if m.get('failed_api_list') is not None:
            for k in m.get('failed_api_list'):
                temp_model = ApiTransferVO()
                self.failed_api_list.append(temp_model.from_map(k))
        self.success_api_list = []
        if m.get('success_api_list') is not None:
            for k in m.get('success_api_list'):
                temp_model = ApiTransferVO()
                self.success_api_list.append(temp_model.from_map(k))
        if m.get('check_result') is not None:
            self.check_result = m.get('check_result')
        return self


class ApiflowTestReqVO(TeaModel):
    def __init__(
        self,
        api_id: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
        machine_name: str = None,
        input_params: List[ApiTestParamVO] = None,
        output_params: List[ApiflowOutputVO] = None,
    ):
        # api_id
        self.api_id = api_id
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id
        # machine_name
        self.machine_name = machine_name
        # params
        self.input_params = input_params
        # output_params
        self.output_params = output_params

    def validate(self):
        if self.input_params:
            for k in self.input_params:
                if k:
                    k.validate()
        if self.output_params:
            for k in self.output_params:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.machine_name is not None:
            result['machine_name'] = self.machine_name
        result['input_params'] = []
        if self.input_params is not None:
            for k in self.input_params:
                result['input_params'].append(k.to_map() if k else None)
        result['output_params'] = []
        if self.output_params is not None:
            for k in self.output_params:
                result['output_params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('machine_name') is not None:
            self.machine_name = m.get('machine_name')
        self.input_params = []
        if m.get('input_params') is not None:
            for k in m.get('input_params'):
                temp_model = ApiTestParamVO()
                self.input_params.append(temp_model.from_map(k))
        self.output_params = []
        if m.get('output_params') is not None:
            for k in m.get('output_params'):
                temp_model = ApiflowOutputVO()
                self.output_params.append(temp_model.from_map(k))
        return self


class MonitoryAggregationVO(TeaModel):
    def __init__(
        self,
        invoke_num: List[MonitorData] = None,
        qps: List[MonitorData] = None,
        rt: List[MonitorData] = None,
        err_code: List[MonitorData] = None,
        err_rate: List[MonitorData] = None,
        byte_in: List[MonitorData] = None,
        byte_out: List[MonitorData] = None,
    ):
        # invoke_num
        self.invoke_num = invoke_num
        # qps
        self.qps = qps
        # rt
        self.rt = rt
        # 错误码
        self.err_code = err_code
        # 错误率
        self.err_rate = err_rate
        # byte_in
        self.byte_in = byte_in
        # byte_out
        self.byte_out = byte_out

    def validate(self):
        if self.invoke_num:
            for k in self.invoke_num:
                if k:
                    k.validate()
        if self.qps:
            for k in self.qps:
                if k:
                    k.validate()
        if self.rt:
            for k in self.rt:
                if k:
                    k.validate()
        if self.err_code:
            for k in self.err_code:
                if k:
                    k.validate()
        if self.err_rate:
            for k in self.err_rate:
                if k:
                    k.validate()
        if self.byte_in:
            for k in self.byte_in:
                if k:
                    k.validate()
        if self.byte_out:
            for k in self.byte_out:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['invoke_num'] = []
        if self.invoke_num is not None:
            for k in self.invoke_num:
                result['invoke_num'].append(k.to_map() if k else None)
        result['qps'] = []
        if self.qps is not None:
            for k in self.qps:
                result['qps'].append(k.to_map() if k else None)
        result['rt'] = []
        if self.rt is not None:
            for k in self.rt:
                result['rt'].append(k.to_map() if k else None)
        result['err_code'] = []
        if self.err_code is not None:
            for k in self.err_code:
                result['err_code'].append(k.to_map() if k else None)
        result['err_rate'] = []
        if self.err_rate is not None:
            for k in self.err_rate:
                result['err_rate'].append(k.to_map() if k else None)
        result['byte_in'] = []
        if self.byte_in is not None:
            for k in self.byte_in:
                result['byte_in'].append(k.to_map() if k else None)
        result['byte_out'] = []
        if self.byte_out is not None:
            for k in self.byte_out:
                result['byte_out'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.invoke_num = []
        if m.get('invoke_num') is not None:
            for k in m.get('invoke_num'):
                temp_model = MonitorData()
                self.invoke_num.append(temp_model.from_map(k))
        self.qps = []
        if m.get('qps') is not None:
            for k in m.get('qps'):
                temp_model = MonitorData()
                self.qps.append(temp_model.from_map(k))
        self.rt = []
        if m.get('rt') is not None:
            for k in m.get('rt'):
                temp_model = MonitorData()
                self.rt.append(temp_model.from_map(k))
        self.err_code = []
        if m.get('err_code') is not None:
            for k in m.get('err_code'):
                temp_model = MonitorData()
                self.err_code.append(temp_model.from_map(k))
        self.err_rate = []
        if m.get('err_rate') is not None:
            for k in m.get('err_rate'):
                temp_model = MonitorData()
                self.err_rate.append(temp_model.from_map(k))
        self.byte_in = []
        if m.get('byte_in') is not None:
            for k in m.get('byte_in'):
                temp_model = MonitorData()
                self.byte_in.append(temp_model.from_map(k))
        self.byte_out = []
        if m.get('byte_out') is not None:
            for k in m.get('byte_out'):
                temp_model = MonitorData()
                self.byte_out.append(temp_model.from_map(k))
        return self


class ApiGroupPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[ApiGroupVO] = None,
        page_info: PageInfo = None,
    ):
        # 当前页的数据
        self.list = list
        # page_info
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ApiGroupVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class ApiTestRspVO(TeaModel):
    def __init__(
        self,
        code: str = None,
        cost: int = None,
        size: int = None,
        payload: str = None,
        headers: List[ApiTestParamVO] = None,
    ):
        # code
        self.code = code
        # cost
        self.cost = cost
        # size
        self.size = size
        # payload
        self.payload = payload
        # headers
        self.headers = headers

    def validate(self):
        if self.headers:
            for k in self.headers:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.cost is not None:
            result['cost'] = self.cost
        if self.size is not None:
            result['size'] = self.size
        if self.payload is not None:
            result['payload'] = self.payload
        result['headers'] = []
        if self.headers is not None:
            for k in self.headers:
                result['headers'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('cost') is not None:
            self.cost = m.get('cost')
        if m.get('size') is not None:
            self.size = m.get('size')
        if m.get('payload') is not None:
            self.payload = m.get('payload')
        self.headers = []
        if m.get('headers') is not None:
            for k in m.get('headers'):
                temp_model = ApiTestParamVO()
                self.headers.append(temp_model.from_map(k))
        return self


class ApiflowInstPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[ApiflowInstVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # page_info
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ApiflowInstVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class SofaGwAppVO(TeaModel):
    def __init__(
        self,
        authentications: List[SofaGwAuthenticationVO] = None,
        description: str = None,
        id: int = None,
        instance_id: str = None,
        name: str = None,
        services: List[str] = None,
        type: str = None,
    ):
        # 应用认证信息
        self.authentications = authentications
        # 应用描述信息
        self.description = description
        # 实例标识
        self.id = id
        # 实例标识
        self.instance_id = instance_id
        # 名称
        self.name = name
        # services
        self.services = services
        # api分组(服务提供方)用 PUBLISHER，应用(服务使用方)用 SUBSCRIBER
        self.type = type

    def validate(self):
        if self.authentications:
            for k in self.authentications:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['authentications'] = []
        if self.authentications is not None:
            for k in self.authentications:
                result['authentications'].append(k.to_map() if k else None)
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.services is not None:
            result['services'] = self.services
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.authentications = []
        if m.get('authentications') is not None:
            for k in m.get('authentications'):
                temp_model = SofaGwAuthenticationVO()
                self.authentications.append(temp_model.from_map(k))
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('services') is not None:
            self.services = m.get('services')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ApiInfoQueryVO(TeaModel):
    def __init__(
        self,
        fuzzy_search: bool = None,
        page_info: PageInfo = None,
        query: ApiInfoVO = None,
        query_condition: str = None,
    ):
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search
        # pageInfo
        self.page_info = page_info
        # query
        self.query = query
        # 自定义查询条件
        self.query_condition = query_condition

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        if self.query_condition is not None:
            result['query_condition'] = self.query_condition
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = ApiInfoVO()
            self.query = temp_model.from_map(m['query'])
        if m.get('query_condition') is not None:
            self.query_condition = m.get('query_condition')
        return self


class AuthUserInfoPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[AuthUserInfoVO] = None,
        page_info: PageInfo = None,
    ):
        # 当前页的数据
        self.list = list
        # page_info
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = AuthUserInfoVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class ApiModelPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[ApiModelVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # page_info
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ApiModelVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class ApiflowInstQueryVO(TeaModel):
    def __init__(
        self,
        fuzzy_search: bool = None,
        page_info: PageInfo = None,
        query: ApiflowInstVO = None,
    ):
        # fuzzy_search
        self.fuzzy_search = fuzzy_search
        # page_info
        self.page_info = page_info
        # query
        self.query = query

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = ApiflowInstVO()
            self.query = temp_model.from_map(m['query'])
        return self


class CorsInfoQueryVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        query: CorsInfoVO = None,
        fuzzy_search: bool = None,
    ):
        # 分页信息
        self.page_info = page_info
        # query
        self.query = query
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = CorsInfoVO()
            self.query = temp_model.from_map(m['query'])
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        return self


class ApiflowMachineInstPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[ApiflowMachineInstVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # page_info
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ApiflowMachineInstVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class StrategyInfoQueryVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        query: StrategyInfoVO = None,
        fuzzy_search: bool = None,
    ):
        # 分页信息
        self.page_info = page_info
        # query
        self.query = query
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = StrategyInfoVO()
            self.query = temp_model.from_map(m['query'])
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        return self


class ExternalAuthInfoPagedListVO(TeaModel):
    def __init__(
        self,
        list: List[ExternalAuthInfoVO] = None,
        page_info: PageInfo = None,
    ):
        # list
        self.list = list
        # pageInfo
        self.page_info = page_info

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        result = dict()
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ExternalAuthInfoVO()
                self.list.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class RouterInfoQueryVO(TeaModel):
    def __init__(
        self,
        page_info: PageInfo = None,
        query: RouterInfoVO = None,
        fuzzy_search: bool = None,
    ):
        # pageInfo
        self.page_info = page_info
        # query
        self.query = query
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = RouterInfoVO()
            self.query = temp_model.from_map(m['query'])
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        return self


class SystemConfigQueryVO(TeaModel):
    def __init__(
        self,
        fuzzy_search: bool = None,
        page_info: PageInfo = None,
        query: SystemConfigVO = None,
    ):
        # 是否模糊搜索
        self.fuzzy_search = fuzzy_search
        # page_info
        self.page_info = page_info
        # query
        self.query = query

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.query:
            self.query.validate()

    def to_map(self):
        result = dict()
        if self.fuzzy_search is not None:
            result['fuzzy_search'] = self.fuzzy_search
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fuzzy_search') is not None:
            self.fuzzy_search = m.get('fuzzy_search')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('query') is not None:
            temp_model = SystemConfigVO()
            self.query = temp_model.from_map(m['query'])
        return self


class CreateApigroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiGroupVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiGroupVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateApigroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiGroupVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiGroupVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllApigroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiGroupQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiGroupQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllApigroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiGroupVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiGroupVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListApigroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiGroupQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiGroupQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListApigroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiGroupPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiGroupPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateSysRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: SystemClusterVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = SystemClusterVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateSysResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SystemClusterVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = SystemClusterVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllSysRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: SystemClusterQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = SystemClusterQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllSysResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[SystemClusterVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = SystemClusterVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListSysRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: SystemClusterQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = SystemClusterQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListSysResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SystemClusterPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = SystemClusterPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class GetApigroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_group_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_group_id
        self.api_group_id = api_group_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_group_id, 'api_group_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
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
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetApigroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiGroupVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiGroupVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateApigroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiGroupVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiGroupVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateApigroupResponse(TeaModel):
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
        # data
        self.data = data

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


class DeleteApigroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_group_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_group_id
        self.api_group_id = api_group_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_group_id, 'api_group_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
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
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteApigroupResponse(TeaModel):
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
        # data
        self.data = data

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


class CreateApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateApiResponse(TeaModel):
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
        # data
        self.data = data

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


class AllApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class GetApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        api_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id = api_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # api_type
        self.api_type = api_type

    def validate(self):
        self.validate_required(self.api_id, 'api_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_type is not None:
            result['api_type'] = self.api_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('api_type') is not None:
            self.api_type = m.get('api_type')
        return self


class GetApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateAppRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: AppInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = AppInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateAppResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AppInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AppInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateAppRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: AppInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户 标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = AppInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateAppResponse(TeaModel):
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
        # data
        self.data = data

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


class AllAppRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: AppInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = AppInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllAppResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AppInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = AppInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListAppRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: AppInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = AppInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListAppResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AppInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AppInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class GetAppRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        query_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # App标识
        self.app_id = app_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # 查询类型，不填默认查询传递的wsId的appId,填写outer可以查询跨租户app
        self.query_type = query_type

    def validate(self):
        self.validate_required(self.app_id, 'app_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.query_type is not None:
            result['query_type'] = self.query_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('query_type') is not None:
            self.query_type = m.get('query_type')
        return self


class GetAppResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AppInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AppInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: AuthAppInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = AuthAppInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateAuthappResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AuthAppInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AuthAppInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: AuthAppInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = AuthAppInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateAuthappResponse(TeaModel):
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
        # data
        self.data = data

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


class DeleteAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_app_info_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权App信息标识
        self.auth_app_info_id = auth_app_info_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.auth_app_info_id, 'auth_app_info_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
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
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteAuthappResponse(TeaModel):
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
        # data
        self.data = data

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


class AllAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: AuthAppInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = AuthAppInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllAuthappResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AuthAppInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = AuthAppInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: AuthAppInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间 标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = AuthAppInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListAuthappResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AuthAppInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AuthAppInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class GetAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_app_info_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权App信息标识
        self.auth_app_info_id = auth_app_info_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.auth_app_info_id, 'auth_app_info_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
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
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetAuthappResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AuthAppInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AuthAppInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateRouterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: RouterInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = RouterInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateRouterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RouterInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = RouterInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateRouterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: RouterInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = RouterInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateRouterResponse(TeaModel):
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
        # data
        self.data = data

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


class DeleteRouterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        router_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 路由规则标识
        self.router_id = router_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.router_id, 'router_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.router_id is not None:
            result['router_id'] = self.router_id
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
        if m.get('router_id') is not None:
            self.router_id = m.get('router_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteRouterResponse(TeaModel):
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
        # data
        self.data = data

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


class AllRouterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: RouterInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = RouterInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllRouterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[RouterInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = RouterInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListRouterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: RouterInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = RouterInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListRouterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RouterInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = RouterInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class GetRouterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        router_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 路由规则标识
        self.router_id = router_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.router_id, 'router_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.router_id is not None:
            result['router_id'] = self.router_id
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
        if m.get('router_id') is not None:
            self.router_id = m.get('router_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetRouterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RouterInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = RouterInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateSysRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: SystemClusterVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = SystemClusterVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateSysResponse(TeaModel):
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
        # data
        self.data = data

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


class DeleteSysRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sys_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 后端集群标识
        self.sys_id = sys_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.sys_id, 'sys_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sys_id is not None:
            result['sys_id'] = self.sys_id
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
        if m.get('sys_id') is not None:
            self.sys_id = m.get('sys_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteSysResponse(TeaModel):
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
        # data
        self.data = data

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


class GetSysRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sys_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 后端集群标识
        self.sys_id = sys_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.sys_id, 'sys_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sys_id is not None:
            result['sys_id'] = self.sys_id
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
        if m.get('sys_id') is not None:
            self.sys_id = m.get('sys_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetSysResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SystemClusterVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = SystemClusterVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllApigroupApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_group_id: str = None,
        param: ApiInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API分组标识
        self.api_group_id = api_group_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_group_id, 'api_group_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllApigroupApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class DeleteAppRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # App标识
        self.app_id = app_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.app_id, 'app_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
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
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteAppResponse(TeaModel):
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
        # data
        self.data = data

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


class DeleteApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        api_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id = api_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # api_type
        self.api_type = api_type

    def validate(self):
        self.validate_required(self.api_id, 'api_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_type is not None:
            result['api_type'] = self.api_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('api_type') is not None:
            self.api_type = m.get('api_type')
        return self


class DeleteApiResponse(TeaModel):
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
        # data
        self.data = data

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


class ListApigroupApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_group_id: str = None,
        param: ApiInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API分组标识
        self.api_group_id = api_group_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_group_id, 'api_group_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListApigroupApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ListAuthappApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_app_info_id: str = None,
        param: ApiInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权API标识
        self.auth_app_info_id = auth_app_info_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.auth_app_info_id, 'auth_app_info_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListAuthappApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllSysApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        sys_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 后端集群标识
        self.sys_id = sys_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()
        self.validate_required(self.sys_id, 'sys_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.sys_id is not None:
            result['sys_id'] = self.sys_id
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('sys_id') is not None:
            self.sys_id = m.get('sys_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllSysApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListSysApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        sys_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 后端集群标识
        self.sys_id = sys_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()
        self.validate_required(self.sys_id, 'sys_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.sys_id is not None:
            result['sys_id'] = self.sys_id
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('sys_id') is not None:
            self.sys_id = m.get('sys_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListSysApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllRouterApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        router_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 路由规则ID
        self.router_id = router_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.router_id is not None:
            result['router_id'] = self.router_id
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('router_id') is not None:
            self.router_id = m.get('router_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllRouterApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListRouterApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        router_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 路由规则ID
        self.router_id = router_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.router_id is not None:
            result['router_id'] = self.router_id
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('router_id') is not None:
            self.router_id = m.get('router_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListRouterApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateApiVersionnoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        tenant_id: str = None,
        version_no: str = None,
        workspace_id: str = None,
        api_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id = api_id
        # 租户标识
        self.tenant_id = tenant_id
        # 版本号
        self.version_no = version_no
        # 工作空间标识
        self.workspace_id = workspace_id
        # api_type
        self.api_type = api_type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.version_no is not None:
            result['version_no'] = self.version_no
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_type is not None:
            result['api_type'] = self.api_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('version_no') is not None:
            self.version_no = m.get('version_no')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('api_type') is not None:
            self.api_type = m.get('api_type')
        return self


class UpdateApiVersionnoResponse(TeaModel):
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
        # data
        self.data = data

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


class OfflineApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id_list: List[str] = None,
        offline_desc: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        api_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id_list = api_id_list
        # 下线描述
        self.offline_desc = offline_desc
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # api_type
        self.api_type = api_type

    def validate(self):
        self.validate_required(self.api_id_list, 'api_id_list')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id_list is not None:
            result['api_id_list'] = self.api_id_list
        if self.offline_desc is not None:
            result['offline_desc'] = self.offline_desc
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_type is not None:
            result['api_type'] = self.api_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id_list') is not None:
            self.api_id_list = m.get('api_id_list')
        if m.get('offline_desc') is not None:
            self.offline_desc = m.get('offline_desc')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('api_type') is not None:
            self.api_type = m.get('api_type')
        return self


class OfflineApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class AllAuthappApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_app_info_id: str = None,
        param: ApiInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权App标识
        self.auth_app_info_id = auth_app_info_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.auth_app_info_id, 'auth_app_info_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllAuthappApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class MountApiAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        auth_app_info_id_list: List[str] = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id = api_id
        # 授权App标识列表
        self.auth_app_info_id_list = auth_app_info_id_list
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_id, 'api_id')
        self.validate_required(self.auth_app_info_id_list, 'auth_app_info_id_list')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.auth_app_info_id_list is not None:
            result['auth_app_info_id_list'] = self.auth_app_info_id_list
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
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('auth_app_info_id_list') is not None:
            self.auth_app_info_id_list = m.get('auth_app_info_id_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class MountApiAuthappResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class OnlineApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id_list: List[str] = None,
        online_desc: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        api_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id_list = api_id_list
        # 上线描述
        self.online_desc = online_desc
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # api_type
        self.api_type = api_type

    def validate(self):
        self.validate_required(self.api_id_list, 'api_id_list')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id_list is not None:
            result['api_id_list'] = self.api_id_list
        if self.online_desc is not None:
            result['online_desc'] = self.online_desc
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_type is not None:
            result['api_type'] = self.api_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id_list') is not None:
            self.api_id_list = m.get('api_id_list')
        if m.get('online_desc') is not None:
            self.online_desc = m.get('online_desc')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('api_type') is not None:
            self.api_type = m.get('api_type')
        return self


class OnlineApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class AllApiAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        param: AuthAppInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id = api_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_id, 'api_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('param') is not None:
            temp_model = AuthAppInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllApiAuthappResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AuthAppInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = AuthAppInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListApiAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        param: AuthAppInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id = api_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_id, 'api_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('param') is not None:
            temp_model = AuthAppInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListApiAuthappResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AuthAppInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AuthAppInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllAppApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        param: ApiInfoQueryVO = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # App标识
        self.app_id = app_id
        # param
        self.param = param
        # 工作空间标识
        self.workspace_id = workspace_id
        # 租户标识
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class AllAppApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListAppApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        param: ApiInfoQueryVO = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # App标识
        self.app_id = app_id
        # param
        self.param = param
        # 工作空间标识
        self.workspace_id = workspace_id
        # 租户标识
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class ListAppApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class GetCommonRandomakskRequest(TeaModel):
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
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
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


class GetCommonRandomakskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AuthenticationConfigVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AuthenticationConfigVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateContactRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ContactInfoVO = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 工作空间标识
        self.workspace_id = workspace_id
        # 租户标识
        self.tenant_id = tenant_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('param') is not None:
            temp_model = ContactInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class CreateContactResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ContactInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ContactInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateContactRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ContactInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ContactInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateContactResponse(TeaModel):
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
        # data
        self.data = data

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


class DeleteContactRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        contact_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # 联系方式标识
        self.contact_id = contact_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.contact_id is not None:
            result['contact_id'] = self.contact_id
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
        if m.get('contact_id') is not None:
            self.contact_id = m.get('contact_id')
        return self


class DeleteContactResponse(TeaModel):
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
        # data
        self.data = data

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


class GetContactRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        contact_id: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联系方式标识
        self.contact_id = contact_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # 租户标识
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.contact_id is not None:
            result['contact_id'] = self.contact_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('contact_id') is not None:
            self.contact_id = m.get('contact_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class GetContactResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ContactInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ContactInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ListContactRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ContactInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ContactInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListContactResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ContactInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ContactInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ListContactAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_app_info_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        param: ContactInfoQueryVO = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权App ID
        self.auth_app_info_id = auth_app_info_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # param
        self.param = param

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('param') is not None:
            temp_model = ContactInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        return self


class ListContactAuthappResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ContactInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ContactInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UnmountApiAuthappRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        auth_app_info_id_list: List[str] = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_id
        self.api_id = api_id
        # auth_app_info_id_list
        self.auth_app_info_id_list = auth_app_info_id_list
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_id, 'api_id')
        self.validate_required(self.auth_app_info_id_list, 'auth_app_info_id_list')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.auth_app_info_id_list is not None:
            result['auth_app_info_id_list'] = self.auth_app_info_id_list
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
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('auth_app_info_id_list') is not None:
            self.auth_app_info_id_list = m.get('auth_app_info_id_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UnmountApiAuthappResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class GetApiVersionapiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        tenant_id: str = None,
        version_id: str = None,
        workspace_id: str = None,
        api_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_id
        self.api_id = api_id
        # tenant_id
        self.tenant_id = tenant_id
        # version_id
        self.version_id = version_id
        # workspace_id
        self.workspace_id = workspace_id
        # api_type
        self.api_type = api_type

    def validate(self):
        self.validate_required(self.api_id, 'api_id')
        self.validate_required(self.version_id, 'version_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.version_id is not None:
            result['version_id'] = self.version_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_type is not None:
            result['api_type'] = self.api_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('version_id') is not None:
            self.version_id = m.get('version_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('api_type') is not None:
            self.api_type = m.get('api_type')
        return self


class GetApiVersionapiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateCorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: CorsInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = CorsInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateCorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: CorsInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = CorsInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateCorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: CorsInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = CorsInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateCorsResponse(TeaModel):
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
        # data
        self.data = data

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


class DeleteCorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cors_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 路由规则标识
        self.cors_id = cors_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cors_id is not None:
            result['cors_id'] = self.cors_id
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
        if m.get('cors_id') is not None:
            self.cors_id = m.get('cors_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteCorsResponse(TeaModel):
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
        # data
        self.data = data

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


class AllCorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: CorsInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = CorsInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllCorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[CorsInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = CorsInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListCorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: CorsInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = CorsInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListCorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: CorsInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = CorsInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class GetCorsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cors_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 路由规则标识
        self.cors_id = cors_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cors_id is not None:
            result['cors_id'] = self.cors_id
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
        if m.get('cors_id') is not None:
            self.cors_id = m.get('cors_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetCorsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: CorsInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = CorsInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllCorsApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        cors_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # cors标识
        self.cors_id = cors_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.cors_id is not None:
            result['cors_id'] = self.cors_id
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('cors_id') is not None:
            self.cors_id = m.get('cors_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllCorsApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListCorsApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        cors_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # cors标识
        self.cors_id = cors_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.cors_id is not None:
            result['cors_id'] = self.cors_id
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('cors_id') is not None:
            self.cors_id = m.get('cors_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListCorsApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class MountCorsApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id_list: List[str] = None,
        cors_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 绑定的API ID列表
        self.api_id_list = api_id_list
        # cors标识
        self.cors_id = cors_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id_list is not None:
            result['api_id_list'] = self.api_id_list
        if self.cors_id is not None:
            result['cors_id'] = self.cors_id
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
        if m.get('api_id_list') is not None:
            self.api_id_list = m.get('api_id_list')
        if m.get('cors_id') is not None:
            self.cors_id = m.get('cors_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class MountCorsApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class UnmountCorsApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id_list: List[str] = None,
        cors_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 绑定的API ID列表
        self.api_id_list = api_id_list
        # cors标识
        self.cors_id = cors_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id_list is not None:
            result['api_id_list'] = self.api_id_list
        if self.cors_id is not None:
            result['cors_id'] = self.cors_id
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
        if m.get('api_id_list') is not None:
            self.api_id_list = m.get('api_id_list')
        if m.get('cors_id') is not None:
            self.cors_id = m.get('cors_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UnmountCorsApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ExecTestHttpRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiTestReqVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiTestReqVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ExecTestHttpResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiTestRspVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiTestRspVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateApiAuthapplimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        auth_app_info_id: str = None,
        limit_config: LimitConfigVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id = api_id
        # 授权应用标识
        self.auth_app_info_id = auth_app_info_id
        # 限流配置
        self.limit_config = limit_config
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.limit_config:
            self.limit_config.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
        if self.limit_config is not None:
            result['limit_config'] = self.limit_config.to_map()
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
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('limit_config') is not None:
            temp_model = LimitConfigVO()
            self.limit_config = temp_model.from_map(m['limit_config'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateApiAuthapplimitResponse(TeaModel):
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
        # data
        self.data = data

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


class GetApiAuthapplimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        auth_app_info_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_id
        self.api_id = api_id
        # 授权应用标识
        self.auth_app_info_id = auth_app_info_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
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
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetApiAuthapplimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LimitConfigVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = LimitConfigVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateApiLimitconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        limit_config: LimitConfigVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id = api_id
        # 限流配置
        self.limit_config = limit_config
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_id, 'api_id')
        if self.limit_config:
            self.limit_config.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.limit_config is not None:
            result['limit_config'] = self.limit_config.to_map()
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
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('limit_config') is not None:
            temp_model = LimitConfigVO()
            self.limit_config = temp_model.from_map(m['limit_config'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateApiLimitconfigResponse(TeaModel):
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
        # data
        self.data = data

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


class UpdateApiCacheinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        param: ApiCacheVO = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id = api_id
        # param
        self.param = param
        # 工作空间标识
        self.workspace_id = workspace_id
        # 租户标识
        self.tenant_id = tenant_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('param') is not None:
            temp_model = ApiCacheVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class UpdateApiCacheinfoResponse(TeaModel):
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
        # data
        self.data = data

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


class QueryMonitorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        param: MonitoryRequest = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # param
        self.param = param

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = MonitoryRequest()
            self.param = temp_model.from_map(m['param'])
        return self


class QueryMonitorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: MonitoryAggregationVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = MonitoryAggregationVO()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryResultcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # 租户标识
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryResultcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
        self.data = data

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


class OnlineApiVersionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        online_desc: str = None,
        tenant_id: str = None,
        version_id: str = None,
        workspace_id: str = None,
        api_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_id
        self.api_id = api_id
        # online_desc
        self.online_desc = online_desc
        # tenant_id
        self.tenant_id = tenant_id
        # version_id
        self.version_id = version_id
        # workspace_id
        self.workspace_id = workspace_id
        # api_type
        self.api_type = api_type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.online_desc is not None:
            result['online_desc'] = self.online_desc
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.version_id is not None:
            result['version_id'] = self.version_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_type is not None:
            result['api_type'] = self.api_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('online_desc') is not None:
            self.online_desc = m.get('online_desc')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('version_id') is not None:
            self.version_id = m.get('version_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('api_type') is not None:
            self.api_type = m.get('api_type')
        return self


class OnlineApiVersionResponse(TeaModel):
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
        # data
        self.data = data

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


class CreateLdcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: LdcInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = LdcInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateLdcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LdcInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = LdcInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateLdcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: LdcInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = LdcInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateLdcResponse(TeaModel):
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
        # data
        self.data = data

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


class DeleteLdcRequest(TeaModel):
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
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.workspace_id, 'workspace_id')

    def to_map(self):
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


class DeleteLdcResponse(TeaModel):
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
        # data
        self.data = data

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


class GetLdcRequest(TeaModel):
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
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.workspace_id, 'workspace_id')

    def to_map(self):
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


class GetLdcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LdcInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = LdcInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class SaveLdcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: LdcInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = LdcInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class SaveLdcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LdcInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = LdcInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class MountAuthappApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_info_id_list: List[str] = None,
        auth_app_info_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api标识列表
        self.api_info_id_list = api_info_id_list
        # 授权APP标识
        self.auth_app_info_id = auth_app_info_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_info_id_list, 'api_info_id_list')
        self.validate_required(self.auth_app_info_id, 'auth_app_info_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_info_id_list is not None:
            result['api_info_id_list'] = self.api_info_id_list
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
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
        if m.get('api_info_id_list') is not None:
            self.api_info_id_list = m.get('api_info_id_list')
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class MountAuthappApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class UnmountAuthappApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_info_id_list: List[str] = None,
        auth_app_info_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api标识列表
        self.api_info_id_list = api_info_id_list
        # 授权APP标识
        self.auth_app_info_id = auth_app_info_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_info_id_list, 'api_info_id_list')
        self.validate_required(self.auth_app_info_id, 'auth_app_info_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_info_id_list is not None:
            result['api_info_id_list'] = self.api_info_id_list
        if self.auth_app_info_id is not None:
            result['auth_app_info_id'] = self.auth_app_info_id
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
        if m.get('api_info_id_list') is not None:
            self.api_info_id_list = m.get('api_info_id_list')
        if m.get('auth_app_info_id') is not None:
            self.auth_app_info_id = m.get('auth_app_info_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UnmountAuthappApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ImportApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_group_id: str = None,
        api_transfer_list: str = None,
        tenant_id: str = None,
        update_flag: bool = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分组id
        self.api_group_id = api_group_id
        # api_transfer_list字符串
        self.api_transfer_list = api_transfer_list
        # 租户标识
        self.tenant_id = tenant_id
        # null效验api及配置是否重复，true覆盖，false跳过
        self.update_flag = update_flag
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.api_transfer_list is not None:
            result['api_transfer_list'] = self.api_transfer_list
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.update_flag is not None:
            result['update_flag'] = self.update_flag
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('api_transfer_list') is not None:
            self.api_transfer_list = m.get('api_transfer_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('update_flag') is not None:
            self.update_flag = m.get('update_flag')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ImportApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchImportResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchImportResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ExportApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_info_id_list: List[str] = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # apiId集合
        self.api_info_id_list = api_info_id_list
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_info_id_list, 'api_info_id_list')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_info_id_list is not None:
            result['api_info_id_list'] = self.api_info_id_list
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
        if m.get('api_info_id_list') is not None:
            self.api_info_id_list = m.get('api_info_id_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ExportApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiTransferResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiTransferResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ExportApigroupApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_group_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API分组标识
        self.api_group_id = api_group_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_group_id, 'api_group_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
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
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ExportApigroupApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiTransferResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiTransferResult()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateParammappingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ParamMappingInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ParamMappingInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateParammappingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ParamMappingInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ParamMappingInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateParammappingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ParamMappingInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ParamMappingInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateParammappingResponse(TeaModel):
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
        # data
        self.data = data

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


class DeleteParammappingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param_mapping_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 参数映射标识
        self.param_mapping_id = param_mapping_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.param_mapping_id, 'param_mapping_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param_mapping_id is not None:
            result['param_mapping_id'] = self.param_mapping_id
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
        if m.get('param_mapping_id') is not None:
            self.param_mapping_id = m.get('param_mapping_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteParammappingResponse(TeaModel):
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
        # data
        self.data = data

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


class ListParammappingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ParamMappingInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ParamMappingInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListParammappingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ParamMappingInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ParamMappingInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllParammappingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ParamMappingInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ParamMappingInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllParammappingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ParamMappingInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ParamMappingInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class GetParammappingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param_mapping_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 参数映射标识
        self.param_mapping_id = param_mapping_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        # 
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.param_mapping_id, 'param_mapping_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param_mapping_id is not None:
            result['param_mapping_id'] = self.param_mapping_id
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
        if m.get('param_mapping_id') is not None:
            self.param_mapping_id = m.get('param_mapping_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetParammappingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ParamMappingInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ParamMappingInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ListParammappingApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        param_mapping_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 参数映射标识
        self.param_mapping_id = param_mapping_id
        # 
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()
        self.validate_required(self.param_mapping_id, 'param_mapping_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.param_mapping_id is not None:
            result['param_mapping_id'] = self.param_mapping_id
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('param_mapping_id') is not None:
            self.param_mapping_id = m.get('param_mapping_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListParammappingApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllApimodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiModelQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        # 
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiModelQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllApimodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiModelVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiModelVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListApimodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiModelQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiModelQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListApimodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiModelPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiModelPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateApimodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiModelVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiModelVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateApimodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiModelVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiModelVO()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteApimodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_model_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_model_id
        self.api_model_id = api_model_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_model_id, 'api_model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_model_id is not None:
            result['api_model_id'] = self.api_model_id
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
        if m.get('api_model_id') is not None:
            self.api_model_id = m.get('api_model_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteApimodelResponse(TeaModel):
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
        # data
        self.data = data

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


class GetApimodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_model_id: str = None,
        model_name: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_model_id
        self.api_model_id = api_model_id
        # 查询模型的名称
        self.model_name = model_name
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_model_id, 'api_model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_model_id is not None:
            result['api_model_id'] = self.api_model_id
        if self.model_name is not None:
            result['model_name'] = self.model_name
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
        if m.get('api_model_id') is not None:
            self.api_model_id = m.get('api_model_id')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetApimodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiModelVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiModelVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateApimodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiModelVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiModelVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateApimodelResponse(TeaModel):
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
        # data
        self.data = data

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


class AllApimodelApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_model_id: str = None,
        param: ApiInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模型id
        self.api_model_id = api_model_id
        # param
        self.param = param
        # 
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_model_id, 'api_model_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_model_id is not None:
            result['api_model_id'] = self.api_model_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('api_model_id') is not None:
            self.api_model_id = m.get('api_model_id')
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllApimodelApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListApimodelApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_model_id: str = None,
        param: ApiInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模型ID
        self.api_model_id = api_model_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_model_id, 'api_model_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_model_id is not None:
            result['api_model_id'] = self.api_model_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('api_model_id') is not None:
            self.api_model_id = m.get('api_model_id')
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListApimodelApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateExternalauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ExternalAuthInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ExternalAuthInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateExternalauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ExternalAuthInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ExternalAuthInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateExternalauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ExternalAuthInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ExternalAuthInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateExternalauthResponse(TeaModel):
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
        # data
        self.data = data

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


class DeleteExternalauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        external_auth_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部授权标识
        self.external_auth_id = external_auth_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.external_auth_id, 'external_auth_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.external_auth_id is not None:
            result['external_auth_id'] = self.external_auth_id
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
        if m.get('external_auth_id') is not None:
            self.external_auth_id = m.get('external_auth_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteExternalauthResponse(TeaModel):
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
        # data
        self.data = data

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


class GetExternalauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        external_auth_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部授权标识
        self.external_auth_id = external_auth_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.external_auth_id, 'external_auth_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.external_auth_id is not None:
            result['external_auth_id'] = self.external_auth_id
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
        if m.get('external_auth_id') is not None:
            self.external_auth_id = m.get('external_auth_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetExternalauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ExternalAuthInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ExternalAuthInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ListExternalauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ExternalAuthInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ExternalAuthInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListExternalauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ExternalAuthInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ExternalAuthInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllExternalauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ExternalAuthInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ExternalAuthInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllExternalauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ExternalAuthInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ExternalAuthInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class MountExternalauthApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_info_id_list: List[str] = None,
        external_auth_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api标识列表
        self.api_info_id_list = api_info_id_list
        # 外部授权标识
        self.external_auth_id = external_auth_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_info_id_list, 'api_info_id_list')
        self.validate_required(self.external_auth_id, 'external_auth_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_info_id_list is not None:
            result['api_info_id_list'] = self.api_info_id_list
        if self.external_auth_id is not None:
            result['external_auth_id'] = self.external_auth_id
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
        if m.get('api_info_id_list') is not None:
            self.api_info_id_list = m.get('api_info_id_list')
        if m.get('external_auth_id') is not None:
            self.external_auth_id = m.get('external_auth_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class MountExternalauthApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class UnmountExternalauthApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_info_id_list: List[str] = None,
        external_auth_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api标识列表
        self.api_info_id_list = api_info_id_list
        # 外部授权标识
        self.external_auth_id = external_auth_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_info_id_list, 'api_info_id_list')
        self.validate_required(self.external_auth_id, 'external_auth_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_info_id_list is not None:
            result['api_info_id_list'] = self.api_info_id_list
        if self.external_auth_id is not None:
            result['external_auth_id'] = self.external_auth_id
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
        if m.get('api_info_id_list') is not None:
            self.api_info_id_list = m.get('api_info_id_list')
        if m.get('external_auth_id') is not None:
            self.external_auth_id = m.get('external_auth_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UnmountExternalauthApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteApimodelParamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        api_model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模型参数id
        self.param_id = param_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # 最外层的父类模型id
        self.api_model_id = api_model_id

    def validate(self):
        self.validate_required(self.param_id, 'param_id')
        self.validate_required(self.api_model_id, 'api_model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param_id is not None:
            result['param_id'] = self.param_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_model_id is not None:
            result['api_model_id'] = self.api_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('param_id') is not None:
            self.param_id = m.get('param_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('api_model_id') is not None:
            self.api_model_id = m.get('api_model_id')
        return self


class DeleteApimodelParamResponse(TeaModel):
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
        # data
        self.data = data

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


class UpdateApimodelParamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiModelParamVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiModelParamVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateApimodelParamResponse(TeaModel):
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
        # data
        self.data = data

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


class CreateApimodelParamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiModelParamVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiModelParamVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateApimodelParamResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiModelParamVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiModelParamVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ListExternalauthApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        external_auth_id: str = None,
        param: ApiInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部授权标识符
        self.external_auth_id = external_auth_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.external_auth_id, 'external_auth_id')
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.external_auth_id is not None:
            result['external_auth_id'] = self.external_auth_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('external_auth_id') is not None:
            self.external_auth_id = m.get('external_auth_id')
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListExternalauthApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CheckApimodelParamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        model_id: str = None,
        ref_model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # 校检的模型id
        self.model_id = model_id
        # 模型引用的id
        self.ref_model_id = ref_model_id

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.ref_model_id, 'ref_model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.ref_model_id is not None:
            result['ref_model_id'] = self.ref_model_id
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
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('ref_model_id') is not None:
            self.ref_model_id = m.get('ref_model_id')
        return self


class CheckApimodelParamResponse(TeaModel):
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
        # data
        self.data = data

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


class ResolveApimodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        model_name: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        description: str = None,
        package_name: str = None,
        json: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待解析的父类模型名称
        self.model_name = model_name
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # description
        self.description = description
        # 包名
        self.package_name = package_name
        # json
        self.json = json
        # type
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.description is not None:
            result['description'] = self.description
        if self.package_name is not None:
            result['package_name'] = self.package_name
        if self.json is not None:
            result['json'] = self.json
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('package_name') is not None:
            self.package_name = m.get('package_name')
        if m.get('json') is not None:
            self.json = m.get('json')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ResolveApimodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiModelVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据模型
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
            temp_model = ApiModelVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ImportApimodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiModelVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # apimodelVO
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiModelVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ImportApimodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiModelVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 导入后的模型
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
            temp_model = ApiModelVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ApplyApimodelMgsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        model_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # modelDataSource指mgs平台  get模型返回的json字符串
        self.model_list = model_list

    def validate(self):
        self.validate_required(self.model_list, 'model_list')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.model_list is not None:
            result['model_list'] = self.model_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('model_list') is not None:
            self.model_list = m.get('model_list')
        return self


class ApplyApimodelMgsResponse(TeaModel):
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
        # 数据迁移成功失败
        self.data = data

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


class ListOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: OperatorQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = OperatorQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListOperatorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: OperatorPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = OperatorPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateApigroupAuthuserconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiGroupAuthUserConfigVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_auth_user_config
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiGroupAuthUserConfigVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateApigroupAuthuserconfigResponse(TeaModel):
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
        # data
        self.data = data

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


class GetApigroupAuthuserconfigRequest(TeaModel):
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
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
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


class GetApigroupAuthuserconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiGroupAuthUserConfigVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiGroupAuthUserConfigVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AddApigroupAuthuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_group_id: str = None,
        operator_id_list: List[str] = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # API标识
        self.api_group_id = api_group_id
        # 用户标识列表
        self.operator_id_list = operator_id_list
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_group_id, 'api_group_id')
        self.validate_required(self.operator_id_list, 'operator_id_list')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.operator_id_list is not None:
            result['operator_id_list'] = self.operator_id_list
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
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('operator_id_list') is not None:
            self.operator_id_list = m.get('operator_id_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AddApigroupAuthuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class MountApigroupAuthuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_group_id: str = None,
        auth_status: str = None,
        auth_user_id_list: List[str] = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api标识
        self.api_group_id = api_group_id
        # 授权状态
        self.auth_status = auth_status
        # 授权用户Id列表
        self.auth_user_id_list = auth_user_id_list
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_group_id, 'api_group_id')
        self.validate_required(self.auth_status, 'auth_status')
        self.validate_required(self.auth_user_id_list, 'auth_user_id_list')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        if self.auth_user_id_list is not None:
            result['auth_user_id_list'] = self.auth_user_id_list
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
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        if m.get('auth_user_id_list') is not None:
            self.auth_user_id_list = m.get('auth_user_id_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class MountApigroupAuthuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class UnmountApigroupAuthuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_group_id: str = None,
        auth_user_id_list: List[str] = None,
        tenant_id: str = None,
        workspace_id: str = None,
        auth_status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api分组标识
        self.api_group_id = api_group_id
        # 授权用户Id列表
        self.auth_user_id_list = auth_user_id_list
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # 授权状态
        self.auth_status = auth_status

    def validate(self):
        self.validate_required(self.api_group_id, 'api_group_id')
        self.validate_required(self.auth_user_id_list, 'auth_user_id_list')
        self.validate_required(self.auth_status, 'auth_status')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.auth_user_id_list is not None:
            result['auth_user_id_list'] = self.auth_user_id_list
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('auth_user_id_list') is not None:
            self.auth_user_id_list = m.get('auth_user_id_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        return self


class UnmountApigroupAuthuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ListApigroupAuthuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: AuthUserInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = AuthUserInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListApigroupAuthuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AuthUserInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AuthUserInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteApigroupAuthuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_group_id: str = None,
        user_id_list: List[str] = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api分组标识
        self.api_group_id = api_group_id
        # 用户id列表
        self.user_id_list = user_id_list
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_group_id, 'api_group_id')
        self.validate_required(self.user_id_list, 'user_id_list')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.user_id_list is not None:
            result['user_id_list'] = self.user_id_list
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
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('user_id_list') is not None:
            self.user_id_list = m.get('user_id_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteApigroupAuthuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class VerifyApiApigroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        api_group_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # api分组标识
        self.api_group_id = api_group_id

    def validate(self):
        self.validate_required(self.api_group_id, 'api_group_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
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
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        return self


class VerifyApiApigroupResponse(TeaModel):
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
        # api
        self.data = data

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


class UpdateAppAuthapiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_info_id_list: List[str] = None,
        app_id: str = None,
        encryption_status: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api标识列表
        self.api_info_id_list = api_info_id_list
        # app标识
        self.app_id = app_id
        # 加密状态
        self.encryption_status = encryption_status
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_info_id_list, 'api_info_id_list')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.encryption_status, 'encryption_status')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_info_id_list is not None:
            result['api_info_id_list'] = self.api_info_id_list
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.encryption_status is not None:
            result['encryption_status'] = self.encryption_status
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
        if m.get('api_info_id_list') is not None:
            self.api_info_id_list = m.get('api_info_id_list')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('encryption_status') is not None:
            self.encryption_status = m.get('encryption_status')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateAppAuthapiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # app
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateGwconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: SystemConfigVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = SystemConfigVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateGwconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SystemConfigVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = SystemConfigVO()
            self.data = temp_model.from_map(m['data'])
        return self


class GetGwconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        config_key: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # config_key
        self.config_key = config_key
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.config_key is not None:
            result['config_key'] = self.config_key
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
        if m.get('config_key') is not None:
            self.config_key = m.get('config_key')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetGwconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SystemConfigVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = SystemConfigVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateGwconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: SystemConfigVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
        gw_id_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id
        # 更新的网关id
        self.gw_id_list = gw_id_list

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.gw_id_list is not None:
            result['gw_id_list'] = self.gw_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('param') is not None:
            temp_model = SystemConfigVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('gw_id_list') is not None:
            self.gw_id_list = m.get('gw_id_list')
        return self


class UpdateGwconfigResponse(TeaModel):
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
        # data
        self.data = data

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


class AllGwconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        param: SystemConfigQueryVO = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 租户标识
        self.tenant_id = tenant_id
        # param
        self.param = param
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = SystemConfigQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllGwconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[GateWayConfigVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = GateWayConfigVO()
                self.data.append(temp_model.from_map(k))
        return self


class GetInstanceRequest(TeaModel):
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
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
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


class GetInstanceResponse(TeaModel):
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
        # instance_id
        self.data = data

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


class CheckGwconfigDeleteRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        config_key: str = None,
        param: GateWayConfigVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # zone和网关标识
        self.config_key = config_key
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.config_key is not None:
            result['config_key'] = self.config_key
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('config_key') is not None:
            self.config_key = m.get('config_key')
        if m.get('param') is not None:
            temp_model = GateWayConfigVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CheckGwconfigDeleteResponse(TeaModel):
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
        # true, false
        self.data = data

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


class CheckGwconfigUpdateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        config_key: str = None,
        gateway_id_list: List[str] = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # zone和网关标识
        self.config_key = config_key
        # param
        self.gateway_id_list = gateway_id_list
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.config_key is not None:
            result['config_key'] = self.config_key
        if self.gateway_id_list is not None:
            result['gateway_id_list'] = self.gateway_id_list
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
        if m.get('config_key') is not None:
            self.config_key = m.get('config_key')
        if m.get('gateway_id_list') is not None:
            self.gateway_id_list = m.get('gateway_id_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CheckGwconfigUpdateResponse(TeaModel):
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
        # data
        self.data = data

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


class CreateApiGwconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateApiGwconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateApiGwconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoVO = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('param') is not None:
            temp_model = ApiInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class UpdateApiGwconfigResponse(TeaModel):
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
        # data
        self.data = data

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


class CheckApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api参数
        self.param = param
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CheckApiResponse(TeaModel):
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
        # true成功，false失败
        self.data = data

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


class CheckSysUpdateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sys_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.sys_id = sys_id
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sys_id is not None:
            result['sys_id'] = self.sys_id
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
        if m.get('sys_id') is not None:
            self.sys_id = m.get('sys_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CheckSysUpdateResponse(TeaModel):
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
        # data
        self.data = data

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


class GetApiHistoryversionapiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        tenant_id: str = None,
        version_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_id
        self.api_id = api_id
        # tenant_id
        self.tenant_id = tenant_id
        # version_id
        self.version_id = version_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_id, 'api_id')
        self.validate_required(self.version_id, 'version_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.version_id is not None:
            result['version_id'] = self.version_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('version_id') is not None:
            self.version_id = m.get('version_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetApiHistoryversionapiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class AllStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: StrategyInfoQueryVO = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # 
        # 工作空间标识
        self.workspace_id = workspace_id
        # 租户标识
        self.tenant_id = tenant_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('param') is not None:
            temp_model = StrategyInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class AllStrategyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[StrategyInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = StrategyInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class AllStrategyApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        strategy_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # strategy_id
        self.strategy_id = strategy_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllStrategyApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListStrategyApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoQueryVO = None,
        strategy_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # strategy_id
        self.strategy_id = strategy_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
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
        if m.get('param') is not None:
            temp_model = ApiInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListStrategyApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class MountStrategyApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id_list: List[str] = None,
        strategy_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 绑定的API ID列表
        self.api_id_list = api_id_list
        # strategy_id
        self.strategy_id = strategy_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id_list is not None:
            result['api_id_list'] = self.api_id_list
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
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
        if m.get('api_id_list') is not None:
            self.api_id_list = m.get('api_id_list')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class MountStrategyApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class UnmountStrategyApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id_list: List[str] = None,
        strategy_id: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 绑定的API ID列表
        self.api_id_list = api_id_list
        # strategy_id
        self.strategy_id = strategy_id
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id_list is not None:
            result['api_id_list'] = self.api_id_list
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id_list') is not None:
            self.api_id_list = m.get('api_id_list')
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class UnmountStrategyApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchActionResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = BatchActionResult()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: StrategyInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = StrategyInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateStrategyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: StrategyInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = StrategyInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        strategy_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # strategy_id
        self.strategy_id = strategy_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
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
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteStrategyResponse(TeaModel):
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
        # data
        self.data = data

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


class GetStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        strategy_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # strategy_id
        self.strategy_id = strategy_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.strategy_id is not None:
            result['strategy_id'] = self.strategy_id
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
        if m.get('strategy_id') is not None:
            self.strategy_id = m.get('strategy_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetStrategyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: StrategyInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = StrategyInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ListStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: StrategyInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = StrategyInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListStrategyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: StrategyPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = StrategyPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: StrategyInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = StrategyInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateStrategyResponse(TeaModel):
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
        # data
        self.data = data

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


class GetHomeRequest(TeaModel):
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
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
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


class GetHomeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: HomePageVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = HomePageVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CheckApigroupDomainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiGroupDomainVO = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('param') is not None:
            temp_model = ApiGroupDomainVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class CheckApigroupDomainResponse(TeaModel):
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
        # 
        # true成功，false失败
        self.data = data

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


class GetApigroupDomainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class GetApigroupDomainResponse(TeaModel):
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
        # data
        self.data = data

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


class GetApiSwaggerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_info_id_list: List[str] = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识列表
        self.api_info_id_list = api_info_id_list
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_info_id_list, 'api_info_id_list')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_info_id_list is not None:
            result['api_info_id_list'] = self.api_info_id_list
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
        if m.get('api_info_id_list') is not None:
            self.api_info_id_list = m.get('api_info_id_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetApiSwaggerResponse(TeaModel):
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
        # swaggerJson
        self.data = data

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


class DownloadApiSwaggerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_info_id_list: List[str] = None,
        swagger_json_str: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识列表
        self.api_info_id_list = api_info_id_list
        # swaggerJson
        self.swagger_json_str = swagger_json_str
        # 租户标识
        self.tenant_id = tenant_id
        # 工作空间标识
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_info_id_list is not None:
            result['api_info_id_list'] = self.api_info_id_list
        if self.swagger_json_str is not None:
            result['swagger_json_str'] = self.swagger_json_str
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
        if m.get('api_info_id_list') is not None:
            self.api_info_id_list = m.get('api_info_id_list')
        if m.get('swagger_json_str') is not None:
            self.swagger_json_str = m.get('swagger_json_str')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DownloadApiSwaggerResponse(TeaModel):
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
        # data
        self.data = data

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


class DownloadApimodelCodegenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        api_group_id: str = None,
        package_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # APp标识列表
        self.app_id = app_id
        # 租户标识
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # api_group_id
        self.api_group_id = api_group_id
        # package_name
        self.package_name = package_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_group_id is not None:
            result['api_group_id'] = self.api_group_id
        if self.package_name is not None:
            result['package_name'] = self.package_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('api_group_id') is not None:
            self.api_group_id = m.get('api_group_id')
        if m.get('package_name') is not None:
            self.package_name = m.get('package_name')
        return self


class DownloadApimodelCodegenResponse(TeaModel):
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
        # data
        self.data = data

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


class GetGwconfigGatewayswitchRequest(TeaModel):
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
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
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


class GetGwconfigGatewayswitchResponse(TeaModel):
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
        # data
        self.data = data

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


class AllRegistryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: RegistryInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = RegistryInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllRegistryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[RegistryInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = RegistryInfoVO()
                self.data.append(temp_model.from_map(k))
        return self


class AllRegistrySysRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: SystemClusterQueryVO = None,
        registry_id: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # registry_id
        self.registry_id = registry_id
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.registry_id is not None:
            result['registry_id'] = self.registry_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('param') is not None:
            temp_model = SystemClusterQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('registry_id') is not None:
            self.registry_id = m.get('registry_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class AllRegistrySysResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[SystemClusterVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = SystemClusterVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListRegistrySysRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: SystemClusterQueryVO = None,
        registry_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # registry_id
        self.registry_id = registry_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
        if self.registry_id is not None:
            result['registry_id'] = self.registry_id
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
        if m.get('param') is not None:
            temp_model = SystemClusterQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('registry_id') is not None:
            self.registry_id = m.get('registry_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListRegistrySysResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SystemClusterPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = SystemClusterPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateRegistryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: RegistryInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = RegistryInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateRegistryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RegistryInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = RegistryInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteRegistryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        registry_id: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # registry_id
        self.registry_id = registry_id
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.registry_id, 'registry_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.registry_id is not None:
            result['registry_id'] = self.registry_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('registry_id') is not None:
            self.registry_id = m.get('registry_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class DeleteRegistryResponse(TeaModel):
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
        # data
        self.data = data

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


class GetRegistryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        registry_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # registry_id
        self.registry_id = registry_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.registry_id, 'registry_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.registry_id is not None:
            result['registry_id'] = self.registry_id
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
        if m.get('registry_id') is not None:
            self.registry_id = m.get('registry_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class GetRegistryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RegistryInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = RegistryInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class ListRegistryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: RegistryInfoQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = RegistryInfoQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListRegistryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RegistryInfoPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = RegistryInfoPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateRegistryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: RegistryInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = RegistryInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateRegistryResponse(TeaModel):
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
        # data
        self.data = data

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


class ExecApiflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        param: ApiflowTestReqVO = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # param
        self.param = param

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiflowTestReqVO()
            self.param = temp_model.from_map(m['param'])
        return self


class ExecApiflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiTestRspVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiTestRspVO()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteApiflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_id
        self.api_id = api_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        self.validate_required(self.api_id, 'api_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
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
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class DeleteApiflowResponse(TeaModel):
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
        # data
        self.data = data

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


class AllApiflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiflowMachineDefQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiflowMachineDefQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class AllApiflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ApiflowMachineDefVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
                temp_model = ApiflowMachineDefVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListApiflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiflowMachineDefQueryVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiflowMachineDefQueryVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class ListApiflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiflowMachineDefPagedListVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiflowMachineDefPagedListVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateApiflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class CreateApiflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class GetApiflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        api_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # API标识
        self.api_id = api_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # api_type
        self.api_type = api_type

    def validate(self):
        self.validate_required(self.api_id, 'api_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_id is not None:
            result['api_id'] = self.api_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.api_type is not None:
            result['api_type'] = self.api_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_id') is not None:
            self.api_id = m.get('api_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('api_type') is not None:
            self.api_type = m.get('api_type')
        return self


class GetApiflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ApiInfoVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = ApiInfoVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateApiflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param: ApiInfoVO = None,
        tenant_id: str = None,
        workspace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # param
        self.param = param
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.param:
            self.param.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param is not None:
            result['param'] = self.param.to_map()
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
        if m.get('param') is not None:
            temp_model = ApiInfoVO()
            self.param = temp_model.from_map(m['param'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class UpdateApiflowResponse(TeaModel):
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
        # data
        self.data = data

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


class GetApimodelJsonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_model_id: str = None,
        tenant_id: str = None,
        workspace_id: str = None,
        model_type: str = None,
        use_default: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api_model_id
        self.api_model_id = api_model_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # model_type
        self.model_type = model_type
        # 是否使用默认值
        self.use_default = use_default

    def validate(self):
        self.validate_required(self.api_model_id, 'api_model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_model_id is not None:
            result['api_model_id'] = self.api_model_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.model_type is not None:
            result['model_type'] = self.model_type
        if self.use_default is not None:
            result['use_default'] = self.use_default
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_model_id') is not None:
            self.api_model_id = m.get('api_model_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('model_type') is not None:
            self.model_type = m.get('model_type')
        if m.get('use_default') is not None:
            self.use_default = m.get('use_default')
        return self


class GetApimodelJsonResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        req_params: List[ApiParamVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
        self.data = data
        # req_params
        self.req_params = req_params

    def validate(self):
        if self.req_params:
            for k in self.req_params:
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
        if self.data is not None:
            result['data'] = self.data
        result['req_params'] = []
        if self.req_params is not None:
            for k in self.req_params:
                result['req_params'].append(k.to_map() if k else None)
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
        self.req_params = []
        if m.get('req_params') is not None:
            for k in m.get('req_params'):
                temp_model = ApiParamVO()
                self.req_params.append(temp_model.from_map(k))
        return self


class ReplaceApimodelJsonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
        param: List[ApiTestParamVO] = None,
        json: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id
        # ApiTestParamVO
        self.param = param
        # json
        self.json = json

    def validate(self):
        if self.param:
            for k in self.param:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        result['param'] = []
        if self.param is not None:
            for k in self.param:
                result['param'].append(k.to_map() if k else None)
        if self.json is not None:
            result['json'] = self.json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        self.param = []
        if m.get('param') is not None:
            for k in m.get('param'):
                temp_model = ApiTestParamVO()
                self.param.append(temp_model.from_map(k))
        if m.get('json') is not None:
            self.json = m.get('json')
        return self


class ReplaceApimodelJsonResponse(TeaModel):
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
        # data
        self.data = data

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


class GetGwconfigTripleswitchRequest(TeaModel):
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
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
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


class GetGwconfigTripleswitchResponse(TeaModel):
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
        # data
        self.data = data

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


class QueryGwconfigTripleswitchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # workspace_id
        self.workspace_id = workspace_id
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryGwconfigTripleswitchResponse(TeaModel):
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
        # data
        self.data = data

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


