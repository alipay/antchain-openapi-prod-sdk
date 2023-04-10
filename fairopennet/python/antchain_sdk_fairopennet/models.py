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


class StaticDsl(TeaModel):
    def __init__(
        self,
        space_id: str = None,
        flow_id: str = None,
        consent_on: bool = None,
        parameters: str = None,
    ):
        # 
        self.space_id = space_id
        # 
        self.flow_id = flow_id
        # 
        self.consent_on = consent_on
        # 
        self.parameters = parameters

    def validate(self):
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.flow_id, 'flow_id')
        self.validate_required(self.consent_on, 'consent_on')
        self.validate_required(self.parameters, 'parameters')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.consent_on is not None:
            result['consent_on'] = self.consent_on
        if self.parameters is not None:
            result['parameters'] = self.parameters
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('consent_on') is not None:
            self.consent_on = m.get('consent_on')
        if m.get('parameters') is not None:
            self.parameters = m.get('parameters')
        return self


class DynamicDsl(TeaModel):
    def __init__(
        self,
        flow_id: str = None,
        instance_id: str = None,
        auto_start: bool = None,
        parameters: str = None,
    ):
        # 
        self.flow_id = flow_id
        # 
        self.instance_id = instance_id
        # 
        self.auto_start = auto_start
        # 
        self.parameters = parameters

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.auto_start, 'auto_start')
        self.validate_required(self.parameters, 'parameters')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.auto_start is not None:
            result['auto_start'] = self.auto_start
        if self.parameters is not None:
            result['parameters'] = self.parameters
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('auto_start') is not None:
            self.auto_start = m.get('auto_start')
        if m.get('parameters') is not None:
            self.parameters = m.get('parameters')
        return self


class GetNetworkStatusInput(TeaModel):
    def __init__(
        self,
        network_id: str = None,
    ):
        # 网络的networkId
        self.network_id = network_id

    def validate(self):
        self.validate_required(self.network_id, 'network_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.network_id is not None:
            result['network_id'] = self.network_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        return self


class AddPartyToSpaceInput(TeaModel):
    def __init__(
        self,
        network_id: str = None,
        space_id: str = None,
        node_id: str = None,
        party_id: str = None,
    ):
        # 
        self.network_id = network_id
        # 
        self.space_id = space_id
        # 
        self.node_id = node_id
        # 
        self.party_id = party_id

    def validate(self):
        self.validate_required(self.network_id, 'network_id')
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.party_id, 'party_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.network_id is not None:
            result['network_id'] = self.network_id
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.party_id is not None:
            result['party_id'] = self.party_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('party_id') is not None:
            self.party_id = m.get('party_id')
        return self


class Cnet(TeaModel):
    def __init__(
        self,
        id: str = None,
        blockchain_num: str = None,
        my_normal_node_id: str = None,
        governance_contract: str = None,
        my_role: str = None,
        party_list: List[str] = None,
    ):
        # 
        self.id = id
        # 
        self.blockchain_num = blockchain_num
        # 
        self.my_normal_node_id = my_normal_node_id
        # 
        self.governance_contract = governance_contract
        # 
        self.my_role = my_role
        # 
        self.party_list = party_list

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.blockchain_num, 'blockchain_num')
        self.validate_required(self.my_normal_node_id, 'my_normal_node_id')
        self.validate_required(self.governance_contract, 'governance_contract')
        self.validate_required(self.my_role, 'my_role')
        self.validate_required(self.party_list, 'party_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.blockchain_num is not None:
            result['blockchain_num'] = self.blockchain_num
        if self.my_normal_node_id is not None:
            result['my_normal_node_id'] = self.my_normal_node_id
        if self.governance_contract is not None:
            result['governance_contract'] = self.governance_contract
        if self.my_role is not None:
            result['my_role'] = self.my_role
        if self.party_list is not None:
            result['party_list'] = self.party_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('blockchain_num') is not None:
            self.blockchain_num = m.get('blockchain_num')
        if m.get('my_normal_node_id') is not None:
            self.my_normal_node_id = m.get('my_normal_node_id')
        if m.get('governance_contract') is not None:
            self.governance_contract = m.get('governance_contract')
        if m.get('my_role') is not None:
            self.my_role = m.get('my_role')
        if m.get('party_list') is not None:
            self.party_list = m.get('party_list')
        return self


class DynamicFlowConfig(TeaModel):
    def __init__(
        self,
        network_id: str = None,
        space_id: str = None,
        dsl: DynamicDsl = None,
    ):
        # 
        self.network_id = network_id
        # 
        self.space_id = space_id
        # 
        self.dsl = dsl

    def validate(self):
        self.validate_required(self.network_id, 'network_id')
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.dsl, 'dsl')
        if self.dsl:
            self.dsl.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.network_id is not None:
            result['network_id'] = self.network_id
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.dsl is not None:
            result['dsl'] = self.dsl.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('dsl') is not None:
            temp_model = DynamicDsl()
            self.dsl = temp_model.from_map(m['dsl'])
        return self


class StaticFlowConfig(TeaModel):
    def __init__(
        self,
        network_id: str = None,
        dsl: StaticDsl = None,
    ):
        # 
        self.network_id = network_id
        # 
        self.dsl = dsl

    def validate(self):
        self.validate_required(self.network_id, 'network_id')
        self.validate_required(self.dsl, 'dsl')
        if self.dsl:
            self.dsl.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.network_id is not None:
            result['network_id'] = self.network_id
        if self.dsl is not None:
            result['dsl'] = self.dsl.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        if m.get('dsl') is not None:
            temp_model = StaticDsl()
            self.dsl = temp_model.from_map(m['dsl'])
        return self


class FairComputeClientConfig(TeaModel):
    def __init__(
        self,
        host: str = None,
        port: int = None,
        ssl_cert_chain: str = None,
        ssl_private_key: str = None,
        ssl_trust_cert_collection: str = None,
        ssl_authority: str = None,
    ):
        # 服务host
        self.host = host
        # 服务端口
        self.port = port
        # TLS连接配置【暂不支持】
        self.ssl_cert_chain = ssl_cert_chain
        # TLS连接配置【暂不支持】
        self.ssl_private_key = ssl_private_key
        # TLS连接配置【暂不支持】
        self.ssl_trust_cert_collection = ssl_trust_cert_collection
        # TLS连接配置【暂不支持】
        self.ssl_authority = ssl_authority

    def validate(self):
        self.validate_required(self.host, 'host')
        self.validate_required(self.port, 'port')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.host is not None:
            result['host'] = self.host
        if self.port is not None:
            result['port'] = self.port
        if self.ssl_cert_chain is not None:
            result['ssl_cert_chain'] = self.ssl_cert_chain
        if self.ssl_private_key is not None:
            result['ssl_private_key'] = self.ssl_private_key
        if self.ssl_trust_cert_collection is not None:
            result['ssl_trust_cert_collection'] = self.ssl_trust_cert_collection
        if self.ssl_authority is not None:
            result['ssl_authority'] = self.ssl_authority
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('port') is not None:
            self.port = m.get('port')
        if m.get('ssl_cert_chain') is not None:
            self.ssl_cert_chain = m.get('ssl_cert_chain')
        if m.get('ssl_private_key') is not None:
            self.ssl_private_key = m.get('ssl_private_key')
        if m.get('ssl_trust_cert_collection') is not None:
            self.ssl_trust_cert_collection = m.get('ssl_trust_cert_collection')
        if m.get('ssl_authority') is not None:
            self.ssl_authority = m.get('ssl_authority')
        return self


class CreateSpaceInput(TeaModel):
    def __init__(
        self,
        network_id: str = None,
        space_id: str = None,
    ):
        # 
        self.network_id = network_id
        # 
        self.space_id = space_id

    def validate(self):
        self.validate_required(self.network_id, 'network_id')
        self.validate_required(self.space_id, 'space_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.network_id is not None:
            result['network_id'] = self.network_id
        if self.space_id is not None:
            result['space_id'] = self.space_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        return self


class NormalNodeIdentityInfo(TeaModel):
    def __init__(
        self,
        node_id: str = None,
        identity_info: str = None,
    ):
        # 
        self.node_id = node_id
        # 
        self.identity_info = identity_info

    def validate(self):
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.identity_info, 'identity_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.identity_info is not None:
            result['identity_info'] = self.identity_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('identity_info') is not None:
            self.identity_info = m.get('identity_info')
        return self


class PartyInfo(TeaModel):
    def __init__(
        self,
        party_id: str = None,
        desc: str = None,
        private_key: str = None,
        private_key_passwd: str = None,
        recover_key: str = None,
        recovery_key_passwd: str = None,
    ):
        # 
        self.party_id = party_id
        # 
        self.desc = desc
        # 
        self.private_key = private_key
        # 
        self.private_key_passwd = private_key_passwd
        # 
        self.recover_key = recover_key
        # 
        self.recovery_key_passwd = recovery_key_passwd

    def validate(self):
        self.validate_required(self.party_id, 'party_id')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.private_key, 'private_key')
        self.validate_required(self.private_key_passwd, 'private_key_passwd')
        self.validate_required(self.recover_key, 'recover_key')
        self.validate_required(self.recovery_key_passwd, 'recovery_key_passwd')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.party_id is not None:
            result['party_id'] = self.party_id
        if self.desc is not None:
            result['desc'] = self.desc
        if self.private_key is not None:
            result['private_key'] = self.private_key
        if self.private_key_passwd is not None:
            result['private_key_passwd'] = self.private_key_passwd
        if self.recover_key is not None:
            result['recover_key'] = self.recover_key
        if self.recovery_key_passwd is not None:
            result['recovery_key_passwd'] = self.recovery_key_passwd
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('party_id') is not None:
            self.party_id = m.get('party_id')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('private_key') is not None:
            self.private_key = m.get('private_key')
        if m.get('private_key_passwd') is not None:
            self.private_key_passwd = m.get('private_key_passwd')
        if m.get('recover_key') is not None:
            self.recover_key = m.get('recover_key')
        if m.get('recovery_key_passwd') is not None:
            self.recovery_key_passwd = m.get('recovery_key_passwd')
        return self


class FlowInstanceLocator(TeaModel):
    def __init__(
        self,
        network_id: str = None,
        space_id: str = None,
        flow_id: str = None,
        instance_id: str = None,
    ):
        # 
        self.network_id = network_id
        # 
        self.space_id = space_id
        # 
        self.flow_id = flow_id
        # 
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.network_id, 'network_id')
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.flow_id, 'flow_id')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.network_id is not None:
            result['network_id'] = self.network_id
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class TestStruct(TeaModel):
    def __init__(
        self,
        name: str = None,
        msg: str = None,
    ):
        # 测试名称
        self.name = name
        # 消息体
        self.msg = msg

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.msg, 'msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class FlowInstanceStatus(TeaModel):
    def __init__(
        self,
        space_id: str = None,
        flow_id: str = None,
        instance_id: str = None,
        consent_on: bool = None,
        auto_start: bool = None,
        static_parameters: str = None,
        dynamic_parameters: str = None,
        total_components: int = None,
        completed_components: int = None,
        error_code: str = None,
        error_message: str = None,
        status: int = None,
    ):
        # 
        self.space_id = space_id
        # 
        self.flow_id = flow_id
        # 
        self.instance_id = instance_id
        # 
        self.consent_on = consent_on
        # 
        self.auto_start = auto_start
        # 
        self.static_parameters = static_parameters
        # 
        self.dynamic_parameters = dynamic_parameters
        # 
        self.total_components = total_components
        # 
        self.completed_components = completed_components
        # 
        self.error_code = error_code
        # 
        self.error_message = error_message
        # 
        self.status = status

    def validate(self):
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.flow_id, 'flow_id')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.consent_on, 'consent_on')
        self.validate_required(self.auto_start, 'auto_start')
        self.validate_required(self.static_parameters, 'static_parameters')
        self.validate_required(self.dynamic_parameters, 'dynamic_parameters')
        self.validate_required(self.total_components, 'total_components')
        self.validate_required(self.completed_components, 'completed_components')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.error_message, 'error_message')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.consent_on is not None:
            result['consent_on'] = self.consent_on
        if self.auto_start is not None:
            result['auto_start'] = self.auto_start
        if self.static_parameters is not None:
            result['static_parameters'] = self.static_parameters
        if self.dynamic_parameters is not None:
            result['dynamic_parameters'] = self.dynamic_parameters
        if self.total_components is not None:
            result['total_components'] = self.total_components
        if self.completed_components is not None:
            result['completed_components'] = self.completed_components
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('consent_on') is not None:
            self.consent_on = m.get('consent_on')
        if m.get('auto_start') is not None:
            self.auto_start = m.get('auto_start')
        if m.get('static_parameters') is not None:
            self.static_parameters = m.get('static_parameters')
        if m.get('dynamic_parameters') is not None:
            self.dynamic_parameters = m.get('dynamic_parameters')
        if m.get('total_components') is not None:
            self.total_components = m.get('total_components')
        if m.get('completed_components') is not None:
            self.completed_components = m.get('completed_components')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class NetworkStatusInfo(TeaModel):
    def __init__(
        self,
        network_status: str = None,
    ):
        # 协作网络状态枚举类型
        self.network_status = network_status

    def validate(self):
        self.validate_required(self.network_status, 'network_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.network_status is not None:
            result['network_status'] = self.network_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('network_status') is not None:
            self.network_status = m.get('network_status')
        return self


class NetworkEntranceInfo(TeaModel):
    def __init__(
        self,
        network_id: str = None,
        entrance_info: str = None,
    ):
        # 
        self.network_id = network_id
        # 
        self.entrance_info = entrance_info

    def validate(self):
        self.validate_required(self.network_id, 'network_id')
        self.validate_required(self.entrance_info, 'entrance_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.network_id is not None:
            result['network_id'] = self.network_id
        if self.entrance_info is not None:
            result['entrance_info'] = self.entrance_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        if m.get('entrance_info') is not None:
            self.entrance_info = m.get('entrance_info')
        return self


class CubeNode(TeaModel):
    def __init__(
        self,
        domain: str = None,
        endpoints: List[str] = None,
        node_id: str = None,
        node_id_hash: str = None,
        node_public_key: str = None,
        is_connected: bool = None,
        type: int = None,
    ):
        # 无
        self.domain = domain
        # 无
        self.endpoints = endpoints
        # 
        self.node_id = node_id
        # 
        self.node_id_hash = node_id_hash
        # 
        self.node_public_key = node_public_key
        # 
        self.is_connected = is_connected
        # 
        self.type = type

    def validate(self):
        self.validate_required(self.domain, 'domain')
        self.validate_required(self.endpoints, 'endpoints')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.node_id_hash, 'node_id_hash')
        self.validate_required(self.node_public_key, 'node_public_key')
        self.validate_required(self.is_connected, 'is_connected')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.domain is not None:
            result['domain'] = self.domain
        if self.endpoints is not None:
            result['endpoints'] = self.endpoints
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_id_hash is not None:
            result['node_id_hash'] = self.node_id_hash
        if self.node_public_key is not None:
            result['node_public_key'] = self.node_public_key
        if self.is_connected is not None:
            result['is_connected'] = self.is_connected
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('endpoints') is not None:
            self.endpoints = m.get('endpoints')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_id_hash') is not None:
            self.node_id_hash = m.get('node_id_hash')
        if m.get('node_public_key') is not None:
            self.node_public_key = m.get('node_public_key')
        if m.get('is_connected') is not None:
            self.is_connected = m.get('is_connected')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class GetGovernanceModuleNetworkIdOutput(TeaModel):
    def __init__(
        self,
        network_id: str = None,
    ):
        # networkID
        self.network_id = network_id

    def validate(self):
        self.validate_required(self.network_id, 'network_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.network_id is not None:
            result['network_id'] = self.network_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
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


class StartTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data: TestStruct = None,
        extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # TestApi入参
        self.data = data
        # 额外字段
        self.extra = extra

    def validate(self):
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
        if self.data is not None:
            result['data'] = self.data.to_map()
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data') is not None:
            temp_model = TestStruct()
            self.data = temp_model.from_map(m['data'])
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class StartTestResponse(TeaModel):
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


class InitClientConfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        config: FairComputeClientConfig = None,
        extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.config = config
        # 
        self.extra = extra

    def validate(self):
        self.validate_required(self.config, 'config')
        if self.config:
            self.config.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.config is not None:
            result['config'] = self.config.to_map()
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('config') is not None:
            temp_model = FairComputeClientConfig()
            self.config = temp_model.from_map(m['config'])
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class InitClientConfigResponse(TeaModel):
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


class StartClientRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.extra = extra

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
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class StartClientResponse(TeaModel):
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


class GetGovernancemoduleNetworkidRequest(TeaModel):
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


class GetGovernancemoduleNetworkidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        network_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.network_id = network_id

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
        if self.network_id is not None:
            result['network_id'] = self.network_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        return self


class GetNetworkStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        network_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.network_id = network_id

    def validate(self):
        self.validate_required(self.network_id, 'network_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.network_id is not None:
            result['network_id'] = self.network_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        return self


class GetNetworkStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        network_status_info: NetworkStatusInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.network_status_info = network_status_info

    def validate(self):
        if self.network_status_info:
            self.network_status_info.validate()

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
        if self.network_status_info is not None:
            result['network_status_info'] = self.network_status_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('network_status_info') is not None:
            temp_model = NetworkStatusInfo()
            self.network_status_info = temp_model.from_map(m['network_status_info'])
        return self


class GetMycubenodeInfoRequest(TeaModel):
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


class GetMycubenodeInfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cube_node: CubeNode = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.cube_node = cube_node

    def validate(self):
        if self.cube_node:
            self.cube_node.validate()

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
        if self.cube_node is not None:
            result['cube_node'] = self.cube_node.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cube_node') is not None:
            temp_model = CubeNode()
            self.cube_node = temp_model.from_map(m['cube_node'])
        return self


class AddTrustedcubenodeInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cube_node: CubeNode = None,
        extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.cube_node = cube_node
        # 
        self.extra = extra

    def validate(self):
        self.validate_required(self.cube_node, 'cube_node')
        if self.cube_node:
            self.cube_node.validate()
        self.validate_required(self.extra, 'extra')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cube_node is not None:
            result['cube_node'] = self.cube_node.to_map()
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cube_node') is not None:
            temp_model = CubeNode()
            self.cube_node = temp_model.from_map(m['cube_node'])
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class AddTrustedcubenodeInfoResponse(TeaModel):
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


class RegisterNormalNodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        info: NormalNodeIdentityInfo = None,
        extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.info = info
        # 
        self.extra = extra

    def validate(self):
        self.validate_required(self.info, 'info')
        if self.info:
            self.info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.info is not None:
            result['info'] = self.info.to_map()
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('info') is not None:
            temp_model = NormalNodeIdentityInfo()
            self.info = temp_model.from_map(m['info'])
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class RegisterNormalNodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        network_entrance_info: NetworkEntranceInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.network_entrance_info = network_entrance_info

    def validate(self):
        if self.network_entrance_info:
            self.network_entrance_info.validate()

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
        if self.network_entrance_info is not None:
            result['network_entrance_info'] = self.network_entrance_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('network_entrance_info') is not None:
            temp_model = NetworkEntranceInfo()
            self.network_entrance_info = temp_model.from_map(m['network_entrance_info'])
        return self


class CreateSpaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        network_id: str = None,
        space_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.network_id = network_id
        # 
        self.space_id = space_id

    def validate(self):
        self.validate_required(self.network_id, 'network_id')
        self.validate_required(self.space_id, 'space_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.network_id is not None:
            result['network_id'] = self.network_id
        if self.space_id is not None:
            result['space_id'] = self.space_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        return self


class CreateSpaceResponse(TeaModel):
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


class AddPartySpaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        network_id: str = None,
        space_id: str = None,
        node_id: str = None,
        party_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.network_id = network_id
        # 
        self.space_id = space_id
        # 
        self.node_id = node_id
        # 
        self.party_id = party_id

    def validate(self):
        self.validate_required(self.network_id, 'network_id')
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.party_id, 'party_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.network_id is not None:
            result['network_id'] = self.network_id
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.party_id is not None:
            result['party_id'] = self.party_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('party_id') is not None:
            self.party_id = m.get('party_id')
        return self


class AddPartySpaceResponse(TeaModel):
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


class GetNetworkSnapshotRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        network_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.network_id = network_id

    def validate(self):
        self.validate_required(self.network_id, 'network_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.network_id is not None:
            result['network_id'] = self.network_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        return self


class GetNetworkSnapshotResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cnet: Cnet = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.cnet = cnet

    def validate(self):
        if self.cnet:
            self.cnet.validate()

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
        if self.cnet is not None:
            result['cnet'] = self.cnet.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cnet') is not None:
            temp_model = Cnet()
            self.cnet = temp_model.from_map(m['cnet'])
        return self


class StopClientRequest(TeaModel):
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


class StopClientResponse(TeaModel):
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


class GetNormalmoduleNodeidRequest(TeaModel):
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


class GetNormalmoduleNodeidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        node_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.node_id = node_id

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
        if self.node_id is not None:
            result['node_id'] = self.node_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        return self


class AddPartyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        info: PartyInfo = None,
        extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.info = info
        # 
        self.extra = extra

    def validate(self):
        self.validate_required(self.info, 'info')
        if self.info:
            self.info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.info is not None:
            result['info'] = self.info.to_map()
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('info') is not None:
            temp_model = PartyInfo()
            self.info = temp_model.from_map(m['info'])
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class AddPartyResponse(TeaModel):
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


class GetNormalnodeIdentityinfoRequest(TeaModel):
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


class GetNormalnodeIdentityinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        normal_node_identity_info: NormalNodeIdentityInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.normal_node_identity_info = normal_node_identity_info

    def validate(self):
        if self.normal_node_identity_info:
            self.normal_node_identity_info.validate()

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
        if self.normal_node_identity_info is not None:
            result['normal_node_identity_info'] = self.normal_node_identity_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('normal_node_identity_info') is not None:
            temp_model = NormalNodeIdentityInfo()
            self.normal_node_identity_info = temp_model.from_map(m['normal_node_identity_info'])
        return self


class AddNetworkNormalnodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        info: NetworkEntranceInfo = None,
        extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.info = info
        # 
        self.extra = extra

    def validate(self):
        self.validate_required(self.info, 'info')
        if self.info:
            self.info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.info is not None:
            result['info'] = self.info.to_map()
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('info') is not None:
            temp_model = NetworkEntranceInfo()
            self.info = temp_model.from_map(m['info'])
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class AddNetworkNormalnodeResponse(TeaModel):
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


class GetAllcubenodeInfoRequest(TeaModel):
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


class GetAllcubenodeInfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        all_cube_nodes: List[CubeNode] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.all_cube_nodes = all_cube_nodes

    def validate(self):
        if self.all_cube_nodes:
            for k in self.all_cube_nodes:
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
        result['all_cube_nodes'] = []
        if self.all_cube_nodes is not None:
            for k in self.all_cube_nodes:
                result['all_cube_nodes'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.all_cube_nodes = []
        if m.get('all_cube_nodes') is not None:
            for k in m.get('all_cube_nodes'):
                temp_model = CubeNode()
                self.all_cube_nodes.append(temp_model.from_map(k))
        return self


class ApplyPartyNetworkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        network_id: str = None,
        party_id: str = None,
        account_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.network_id = network_id
        # 
        self.party_id = party_id
        # 
        self.account_name = account_name

    def validate(self):
        self.validate_required(self.network_id, 'network_id')
        self.validate_required(self.party_id, 'party_id')
        self.validate_required(self.account_name, 'account_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.network_id is not None:
            result['network_id'] = self.network_id
        if self.party_id is not None:
            result['party_id'] = self.party_id
        if self.account_name is not None:
            result['account_name'] = self.account_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        if m.get('party_id') is not None:
            self.party_id = m.get('party_id')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        return self


class ApplyPartyNetworkResponse(TeaModel):
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


class CreateFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        party_id: str = None,
        config: StaticFlowConfig = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.party_id = party_id
        # 
        self.config = config

    def validate(self):
        self.validate_required(self.party_id, 'party_id')
        self.validate_required(self.config, 'config')
        if self.config:
            self.config.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.party_id is not None:
            result['party_id'] = self.party_id
        if self.config is not None:
            result['config'] = self.config.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('party_id') is not None:
            self.party_id = m.get('party_id')
        if m.get('config') is not None:
            temp_model = StaticFlowConfig()
            self.config = temp_model.from_map(m['config'])
        return self


class CreateFlowResponse(TeaModel):
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


class RunFlowInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        party_id: str = None,
        config: DynamicFlowConfig = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.party_id = party_id
        # 
        self.config = config

    def validate(self):
        self.validate_required(self.party_id, 'party_id')
        self.validate_required(self.config, 'config')
        if self.config:
            self.config.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.party_id is not None:
            result['party_id'] = self.party_id
        if self.config is not None:
            result['config'] = self.config.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('party_id') is not None:
            self.party_id = m.get('party_id')
        if m.get('config') is not None:
            temp_model = DynamicFlowConfig()
            self.config = temp_model.from_map(m['config'])
        return self


class RunFlowInstanceResponse(TeaModel):
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


class StopFlowinstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        network_id: str = None,
        space_id: str = None,
        party_id: str = None,
        flow_id: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.network_id = network_id
        # 
        self.space_id = space_id
        # 
        self.party_id = party_id
        # 
        self.flow_id = flow_id
        # 
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.network_id, 'network_id')
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.party_id, 'party_id')
        self.validate_required(self.flow_id, 'flow_id')
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
        if self.network_id is not None:
            result['network_id'] = self.network_id
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.party_id is not None:
            result['party_id'] = self.party_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('network_id') is not None:
            self.network_id = m.get('network_id')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('party_id') is not None:
            self.party_id = m.get('party_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class StopFlowinstanceResponse(TeaModel):
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


class QueryFlowinstanceStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        config: FlowInstanceLocator = None,
        extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        self.config = config
        # 
        self.extra = extra

    def validate(self):
        self.validate_required(self.config, 'config')
        if self.config:
            self.config.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.config is not None:
            result['config'] = self.config.to_map()
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('config') is not None:
            temp_model = FlowInstanceLocator()
            self.config = temp_model.from_map(m['config'])
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class QueryFlowinstanceStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: FlowInstanceStatus = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        self.status = status

    def validate(self):
        if self.status:
            self.status.validate()

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
            result['status'] = self.status.to_map()
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
            temp_model = FlowInstanceStatus()
            self.status = temp_model.from_map(m['status'])
        return self


class UploadFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        file_name: str = None,
        extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # file_id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 文件名
        self.file_name = file_name
        # 扩展字段
        self.extra = extra

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.file_name, 'file_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class UploadFileResponse(TeaModel):
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


class DownloadFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        file_name: str = None,
        extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # file_id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 文件名
        self.file_name = file_name
        # 
        self.extra = extra

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.file_name, 'file_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class DownloadFileResponse(TeaModel):
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


