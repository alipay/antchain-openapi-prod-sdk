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


class AccessChainInfo(TeaModel):
    def __init__(
        self,
        acl_id: str = None,
        description: str = None,
        gmt_create: str = None,
        grant_domain: str = None,
        owner_domain: str = None,
        resource_type: str = None,
    ):
        # 授权访问链关系ID
        self.acl_id = acl_id
        # 详细描述
        self.description = description
        # 关系创建时间
        self.gmt_create = gmt_create
        # 被授权的链的链域名
        self.grant_domain = grant_domain
        # 授权链链域名
        self.owner_domain = owner_domain
        # 授权可以访问的数据类型
        self.resource_type = resource_type

    def validate(self):
        self.validate_required(self.acl_id, 'acl_id')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.grant_domain, 'grant_domain')
        self.validate_required(self.owner_domain, 'owner_domain')
        self.validate_required(self.resource_type, 'resource_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.acl_id is not None:
            result['acl_id'] = self.acl_id
        if self.description is not None:
            result['description'] = self.description
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.grant_domain is not None:
            result['grant_domain'] = self.grant_domain
        if self.owner_domain is not None:
            result['owner_domain'] = self.owner_domain
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('acl_id') is not None:
            self.acl_id = m.get('acl_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('grant_domain') is not None:
            self.grant_domain = m.get('grant_domain')
        if m.get('owner_domain') is not None:
            self.owner_domain = m.get('owner_domain')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        return self


class MyChainInfo(TeaModel):
    def __init__(
        self,
        blockchain_id: str = None,
        description: str = None,
        domain: str = None,
        gmt_create: str = None,
        reg_status: str = None,
        type: str = None,
    ):
        # 区块链id
        self.blockchain_id = blockchain_id
        # 详细描述
        self.description = description
        # 链域名
        self.domain = domain
        # 创建日期
        self.gmt_create = gmt_create
        # 注册状态INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
        self.reg_status = reg_status
        # 链类型：MYCHAIN_010, FABRIC_14
        # 
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.blockchain_id is not None:
            result['blockchain_id'] = self.blockchain_id
        if self.description is not None:
            result['description'] = self.description
        if self.domain is not None:
            result['domain'] = self.domain
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.reg_status is not None:
            result['reg_status'] = self.reg_status
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('blockchain_id') is not None:
            self.blockchain_id = m.get('blockchain_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('reg_status') is not None:
            self.reg_status = m.get('reg_status')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class DomainCert(TeaModel):
    def __init__(
        self,
        domain: str = None,
        issuer_public_key: str = None,
        issuer_signature: str = None,
        subject_public_key: str = None,
    ):
        # 链域名
        # 
        self.domain = domain
        # 签发者公钥
        self.issuer_public_key = issuer_public_key
        # 签发者签名
        self.issuer_signature = issuer_signature
        # 接受者公钥
        self.subject_public_key = subject_public_key

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.domain is not None:
            result['domain'] = self.domain
        if self.issuer_public_key is not None:
            result['issuer_public_key'] = self.issuer_public_key
        if self.issuer_signature is not None:
            result['issuer_signature'] = self.issuer_signature
        if self.subject_public_key is not None:
            result['subject_public_key'] = self.subject_public_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('issuer_public_key') is not None:
            self.issuer_public_key = m.get('issuer_public_key')
        if m.get('issuer_signature') is not None:
            self.issuer_signature = m.get('issuer_signature')
        if m.get('subject_public_key') is not None:
            self.subject_public_key = m.get('subject_public_key')
        return self


class CrossChainInfo(TeaModel):
    def __init__(
        self,
        acl_id: str = None,
        description: str = None,
        gmt_create: str = None,
        grant_domain: str = None,
        grant_identity: str = None,
        owner_domain: str = None,
        owner_identity: str = None,
    ):
        # 授权映射关系id
        self.acl_id = acl_id
        # 详细描述
        self.description = description
        # 授权关系创建时间
        self.gmt_create = gmt_create
        # 授权链的链域名
        self.grant_domain = grant_domain
        # 授权合约在授权链上地址
        self.grant_identity = grant_identity
        # 自有链链域名
        self.owner_domain = owner_domain
        # 自有合约在链上地址
        self.owner_identity = owner_identity

    def validate(self):
        self.validate_required(self.acl_id, 'acl_id')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.grant_domain, 'grant_domain')
        self.validate_required(self.grant_identity, 'grant_identity')
        self.validate_required(self.owner_domain, 'owner_domain')
        self.validate_required(self.owner_identity, 'owner_identity')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.acl_id is not None:
            result['acl_id'] = self.acl_id
        if self.description is not None:
            result['description'] = self.description
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.grant_domain is not None:
            result['grant_domain'] = self.grant_domain
        if self.grant_identity is not None:
            result['grant_identity'] = self.grant_identity
        if self.owner_domain is not None:
            result['owner_domain'] = self.owner_domain
        if self.owner_identity is not None:
            result['owner_identity'] = self.owner_identity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('acl_id') is not None:
            self.acl_id = m.get('acl_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('grant_domain') is not None:
            self.grant_domain = m.get('grant_domain')
        if m.get('grant_identity') is not None:
            self.grant_identity = m.get('grant_identity')
        if m.get('owner_domain') is not None:
            self.owner_domain = m.get('owner_domain')
        if m.get('owner_identity') is not None:
            self.owner_identity = m.get('owner_identity')
        return self


class OdatsRegisteredBlockChainInfo(TeaModel):
    def __init__(
        self,
        blockchain_id: str = None,
        description: str = None,
        domain: str = None,
        gmt_create: str = None,
        reg_status: str = None,
        type: str = None,
    ):
        # 区块链id
        self.blockchain_id = blockchain_id
        # 详细描述
        self.description = description
        # 链域名
        self.domain = domain
        # 注册时间
        self.gmt_create = gmt_create
        # 链注册状态
        # INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
        self.reg_status = reg_status
        # 链类型
        self.type = type

    def validate(self):
        self.validate_required(self.blockchain_id, 'blockchain_id')
        self.validate_required(self.domain, 'domain')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.reg_status, 'reg_status')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.blockchain_id is not None:
            result['blockchain_id'] = self.blockchain_id
        if self.description is not None:
            result['description'] = self.description
        if self.domain is not None:
            result['domain'] = self.domain
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.reg_status is not None:
            result['reg_status'] = self.reg_status
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('blockchain_id') is not None:
            self.blockchain_id = m.get('blockchain_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('reg_status') is not None:
            self.reg_status = m.get('reg_status')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class BlockchainBasicInfo(TeaModel):
    def __init__(
        self,
        blockchain_id: str = None,
        description: str = None,
        domain: str = None,
        gmt_create: str = None,
        info: str = None,
        reg_status: str = None,
        type: str = None,
    ):
        # 链id
        self.blockchain_id = blockchain_id
        # 描述
        self.description = description
        # 链域名
        self.domain = domain
        # 创建时间，13位时间戳
        self.gmt_create = gmt_create
        # 根据type会返回不通的json格式，表示不同类型的链配置； mychain: { "bizid": "", "tlsCert": "", "tlsCaCert": "", "account": "", "anchoredBlockHeight": 19876, "anchoredBlockHash": "" } fabric: { "channel": "", "userMspId": "", "userCert": "" }
        self.info = info
        # 注册状态
        # 
        self.reg_status = reg_status
        # 链类型
        # 
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.blockchain_id is not None:
            result['blockchain_id'] = self.blockchain_id
        if self.description is not None:
            result['description'] = self.description
        if self.domain is not None:
            result['domain'] = self.domain
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.info is not None:
            result['info'] = self.info
        if self.reg_status is not None:
            result['reg_status'] = self.reg_status
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('blockchain_id') is not None:
            self.blockchain_id = m.get('blockchain_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('info') is not None:
            self.info = m.get('info')
        if m.get('reg_status') is not None:
            self.reg_status = m.get('reg_status')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ConfigYamlInfo(TeaModel):
    def __init__(
        self,
        channel_name_list: List[str] = None,
        validator_peer_name_list: List[str] = None,
    ):
        # 通道列表
        self.channel_name_list = channel_name_list
        # 验证节点名称列表
        self.validator_peer_name_list = validator_peer_name_list

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.channel_name_list is not None:
            result['channel_name_list'] = self.channel_name_list
        if self.validator_peer_name_list is not None:
            result['validator_peer_name_list'] = self.validator_peer_name_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('channel_name_list') is not None:
            self.channel_name_list = m.get('channel_name_list')
        if m.get('validator_peer_name_list') is not None:
            self.validator_peer_name_list = m.get('validator_peer_name_list')
        return self


class UdnsCert(TeaModel):
    def __init__(
        self,
        anchored_block_hash: str = None,
        anchored_block_height: int = None,
        blockchain_id: str = None,
        chaincode: str = None,
        channel: str = None,
        detail_info: str = None,
        domain: str = None,
        poa_cert_public_key_hash_list: List[str] = None,
        subject_public_key: str = None,
        svn: int = None,
        type: str = None,
        udns_base_64: str = None,
        validator_cert_list: int = None,
        version: str = None,
    ):
        # 锚定块hash
        self.anchored_block_hash = anchored_block_hash
        # 锚定块高度。
        self.anchored_block_height = anchored_block_height
        # 区块链id
        self.blockchain_id = blockchain_id
        # fabric 链码
        self.chaincode = chaincode
        # 通道名。
        self.channel = channel
        # {"anchoredBlockcHeight": 12345, "anchoredBlockHash": "abcefgh", "poaCertPublicKeyHashList": ["abcdefg","abcdefg"]}
        self.detail_info = detail_info
        # 链域名
        self.domain = domain
        # 证书公钥列表
        # 
        self.poa_cert_public_key_hash_list = poa_cert_public_key_hash_list
        # 目标公钥
        self.subject_public_key = subject_public_key
        # 目标svn
        self.svn = svn
        # 区块链类型：MYCHAIN_010, FABRIC_14
        # 
        self.type = type
        # base64编码后的udns
        self.udns_base_64 = udns_base_64
        # 验证者证书列表
        self.validator_cert_list = validator_cert_list
        # 版本号
        self.version = version

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.anchored_block_hash is not None:
            result['anchored_block_hash'] = self.anchored_block_hash
        if self.anchored_block_height is not None:
            result['anchored_block_height'] = self.anchored_block_height
        if self.blockchain_id is not None:
            result['blockchain_id'] = self.blockchain_id
        if self.chaincode is not None:
            result['chaincode'] = self.chaincode
        if self.channel is not None:
            result['channel'] = self.channel
        if self.detail_info is not None:
            result['detail_info'] = self.detail_info
        if self.domain is not None:
            result['domain'] = self.domain
        if self.poa_cert_public_key_hash_list is not None:
            result['poa_cert_public_key_hash_list'] = self.poa_cert_public_key_hash_list
        if self.subject_public_key is not None:
            result['subject_public_key'] = self.subject_public_key
        if self.svn is not None:
            result['svn'] = self.svn
        if self.type is not None:
            result['type'] = self.type
        if self.udns_base_64 is not None:
            result['udns_base64'] = self.udns_base_64
        if self.validator_cert_list is not None:
            result['validator_cert_list'] = self.validator_cert_list
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('anchored_block_hash') is not None:
            self.anchored_block_hash = m.get('anchored_block_hash')
        if m.get('anchored_block_height') is not None:
            self.anchored_block_height = m.get('anchored_block_height')
        if m.get('blockchain_id') is not None:
            self.blockchain_id = m.get('blockchain_id')
        if m.get('chaincode') is not None:
            self.chaincode = m.get('chaincode')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('detail_info') is not None:
            self.detail_info = m.get('detail_info')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('poa_cert_public_key_hash_list') is not None:
            self.poa_cert_public_key_hash_list = m.get('poa_cert_public_key_hash_list')
        if m.get('subject_public_key') is not None:
            self.subject_public_key = m.get('subject_public_key')
        if m.get('svn') is not None:
            self.svn = m.get('svn')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('udns_base64') is not None:
            self.udns_base_64 = m.get('udns_base64')
        if m.get('validator_cert_list') is not None:
            self.validator_cert_list = m.get('validator_cert_list')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class FabricChainInfo(TeaModel):
    def __init__(
        self,
        blockchain_id: str = None,
        description: str = None,
        domain: str = None,
        gmt_create: str = None,
        reg_status: str = None,
        type: str = None,
    ):
        # 区块链id
        # 
        self.blockchain_id = blockchain_id
        # 描述
        self.description = description
        # 链域名
        self.domain = domain
        # 创建时间
        self.gmt_create = gmt_create
        # 链注册状态INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
        self.reg_status = reg_status
        # 区块链类型：MYCHAIN_010, FABRIC_14
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.blockchain_id is not None:
            result['blockchain_id'] = self.blockchain_id
        if self.description is not None:
            result['description'] = self.description
        if self.domain is not None:
            result['domain'] = self.domain
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.reg_status is not None:
            result['reg_status'] = self.reg_status
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('blockchain_id') is not None:
            self.blockchain_id = m.get('blockchain_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('reg_status') is not None:
            self.reg_status = m.get('reg_status')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class BlockchainContractInfo(TeaModel):
    def __init__(
        self,
        am_contract_address: str = None,
        blockchain_id: str = None,
        chain_code: str = None,
        oracle_contract_address: str = None,
        p_2p_contract_address: str = None,
        wasm_am_contract_address: str = None,
        wasm_oracle_contract_address: str = None,
        wasm_p2p_contract_address: str = None,
    ):
        # mychain上系统合约“am合约”的地址
        self.am_contract_address = am_contract_address
        # 区块链id
        self.blockchain_id = blockchain_id
        # fabric合约
        self.chain_code = chain_code
        # mychain系统合约“oracle合约”地址
        # 
        self.oracle_contract_address = oracle_contract_address
        # mychain链上系统合约“p2p合约”地址
        # 
        self.p_2p_contract_address = p_2p_contract_address
        # mychain上wasm版系统合约“am合约”的链上地址
        self.wasm_am_contract_address = wasm_am_contract_address
        # mychain wasm版系统合约“orcale合约”地址
        self.wasm_oracle_contract_address = wasm_oracle_contract_address
        # mychain上wasm版系统合约“p2p合约”链上地址
        self.wasm_p2p_contract_address = wasm_p2p_contract_address

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.am_contract_address is not None:
            result['am_contract_address'] = self.am_contract_address
        if self.blockchain_id is not None:
            result['blockchain_id'] = self.blockchain_id
        if self.chain_code is not None:
            result['chain_code'] = self.chain_code
        if self.oracle_contract_address is not None:
            result['oracle_contract_address'] = self.oracle_contract_address
        if self.p_2p_contract_address is not None:
            result['p2p_contract_address'] = self.p_2p_contract_address
        if self.wasm_am_contract_address is not None:
            result['wasm_am_contract_address'] = self.wasm_am_contract_address
        if self.wasm_oracle_contract_address is not None:
            result['wasm_oracle_contract_address'] = self.wasm_oracle_contract_address
        if self.wasm_p2p_contract_address is not None:
            result['wasm_p2p_contract_address'] = self.wasm_p2p_contract_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('am_contract_address') is not None:
            self.am_contract_address = m.get('am_contract_address')
        if m.get('blockchain_id') is not None:
            self.blockchain_id = m.get('blockchain_id')
        if m.get('chain_code') is not None:
            self.chain_code = m.get('chain_code')
        if m.get('oracle_contract_address') is not None:
            self.oracle_contract_address = m.get('oracle_contract_address')
        if m.get('p2p_contract_address') is not None:
            self.p_2p_contract_address = m.get('p2p_contract_address')
        if m.get('wasm_am_contract_address') is not None:
            self.wasm_am_contract_address = m.get('wasm_am_contract_address')
        if m.get('wasm_oracle_contract_address') is not None:
            self.wasm_oracle_contract_address = m.get('wasm_oracle_contract_address')
        if m.get('wasm_p2p_contract_address') is not None:
            self.wasm_p2p_contract_address = m.get('wasm_p2p_contract_address')
        return self


class StartBaasOdatsAccesschainAuthorizeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        description: str = None,
        grant_domain: str = None,
        owner_domain: str = None,
        resource_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 详细描述
        self.description = description
        # 被授权链domain
        self.grant_domain = grant_domain
        # 授权链域名
        self.owner_domain = owner_domain
        # 资源类型
        self.resource_type = resource_type

    def validate(self):
        self.validate_required(self.grant_domain, 'grant_domain')
        self.validate_required(self.owner_domain, 'owner_domain')
        self.validate_required(self.resource_type, 'resource_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.description is not None:
            result['description'] = self.description
        if self.grant_domain is not None:
            result['grant_domain'] = self.grant_domain
        if self.owner_domain is not None:
            result['owner_domain'] = self.owner_domain
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('grant_domain') is not None:
            self.grant_domain = m.get('grant_domain')
        if m.get('owner_domain') is not None:
            self.owner_domain = m.get('owner_domain')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        return self


class StartBaasOdatsAccesschainAuthorizeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AccessChainInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跨链数据访问授权信息
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
            temp_model = AccessChainInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateBaasOdatsAccesschainAuthorizeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        acl_id: str = None,
        description: str = None,
        resource_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权关系id
        self.acl_id = acl_id
        # 详细描述
        self.description = description
        # 授权资源类型
        self.resource_type = resource_type

    def validate(self):
        self.validate_required(self.acl_id, 'acl_id')
        self.validate_required(self.resource_type, 'resource_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.acl_id is not None:
            result['acl_id'] = self.acl_id
        if self.description is not None:
            result['description'] = self.description
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('acl_id') is not None:
            self.acl_id = m.get('acl_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        return self


class UpdateBaasOdatsAccesschainAuthorizeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AccessChainInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跨链访问数据授权信息
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
            temp_model = AccessChainInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class ListBaasOdatsAccesschainAuthorizedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        owner_domain: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 自有链链域名
        self.owner_domain = owner_domain
        # 页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.owner_domain, 'owner_domain')
        self.validate_required(self.page_num, 'page_num')
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
        if self.owner_domain is not None:
            result['owner_domain'] = self.owner_domain
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
        if m.get('owner_domain') is not None:
            self.owner_domain = m.get('owner_domain')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListBaasOdatsAccesschainAuthorizedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AccessChainInfo] = None,
        page_num: int = None,
        page_size: int = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 访问链权限信息列表
        self.data = data
        # 分页页码。
        self.page_num = page_num
        # 当前页大小
        self.page_size = page_size
        # 总行数
        self.total = total

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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
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
                temp_model = AccessChainInfo()
                self.data.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class ListBaasOdatsAccesschainGrantedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        grant_domain: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被授权链的链域名
        self.grant_domain = grant_domain
        # 页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.grant_domain, 'grant_domain')
        self.validate_required(self.page_num, 'page_num')
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
        if self.grant_domain is not None:
            result['grant_domain'] = self.grant_domain
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
        if m.get('grant_domain') is not None:
            self.grant_domain = m.get('grant_domain')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListBaasOdatsAccesschainGrantedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AccessChainInfo] = None,
        page_num: int = None,
        page_size: int = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权访问链列表
        self.data = data
        # 当前页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总行数
        self.total = total

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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
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
                temp_model = AccessChainInfo()
                self.data.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class ListBaasOdatsAccesschainResourcetypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        domain: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链域名
        self.domain = domain

    def validate(self):
        self.validate_required(self.domain, 'domain')

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        return self


class ListBaasOdatsAccesschainResourcetypeResponse(TeaModel):
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
        # 可以访问的数据类型
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


class DisableBaasOdatsAclRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        acl_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权关系id
        self.acl_id = acl_id

    def validate(self):
        self.validate_required(self.acl_id, 'acl_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.acl_id is not None:
            result['acl_id'] = self.acl_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('acl_id') is not None:
            self.acl_id = m.get('acl_id')
        return self


class DisableBaasOdatsAclResponse(TeaModel):
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


class QueryBaasOdatsActivestatusRequest(TeaModel):
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


class QueryBaasOdatsActivestatusResponse(TeaModel):
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
        # 返回开通状态， NOT_ACTIVATED： 未开通；PENDING_APPROVAL：待审批；  ACTIVATED：开通
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


class QueryBaasOdatsAgreementRequest(TeaModel):
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


class QueryBaasOdatsAgreementResponse(TeaModel):
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
        # 用户同意授权状态
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


class SaveBaasOdatsAgreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户是否同意服务协议
        self.status = status

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
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class SaveBaasOdatsAgreementResponse(TeaModel):
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


class QueryBaasOdatsBlockchainBaseinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        blockchain_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链id
        self.blockchain_id = blockchain_id

    def validate(self):
        self.validate_required(self.blockchain_id, 'blockchain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.blockchain_id is not None:
            result['blockchain_id'] = self.blockchain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('blockchain_id') is not None:
            self.blockchain_id = m.get('blockchain_id')
        return self


class QueryBaasOdatsBlockchainBaseinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BlockchainBasicInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回的区块链基本信息
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
            temp_model = BlockchainBasicInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryBaasOdatsBlockchainContractinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        blockchain_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链id
        self.blockchain_id = blockchain_id

    def validate(self):
        self.validate_required(self.blockchain_id, 'blockchain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.blockchain_id is not None:
            result['blockchain_id'] = self.blockchain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('blockchain_id') is not None:
            self.blockchain_id = m.get('blockchain_id')
        return self


class QueryBaasOdatsBlockchainContractinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BlockchainContractInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回的区块链合约信息
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
            temp_model = BlockchainContractInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateBaasOdatsCrosschaimAuthorizeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        acl_id: str = None,
        description: str = None,
        grant_identity: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待更新授权关系ID
        self.acl_id = acl_id
        # 详细描述
        self.description = description
        # 被授权合约链上地址
        self.grant_identity = grant_identity

    def validate(self):
        self.validate_required(self.acl_id, 'acl_id')
        self.validate_required(self.grant_identity, 'grant_identity')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.acl_id is not None:
            result['acl_id'] = self.acl_id
        if self.description is not None:
            result['description'] = self.description
        if self.grant_identity is not None:
            result['grant_identity'] = self.grant_identity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('acl_id') is not None:
            self.acl_id = m.get('acl_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('grant_identity') is not None:
            self.grant_identity = m.get('grant_identity')
        return self


class UpdateBaasOdatsCrosschaimAuthorizeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: CrossChainInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跨链调用授权信息
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
            temp_model = CrossChainInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class StartBaasOdatsCrosschainAuthorizeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        description: str = None,
        grant_domain: str = None,
        grant_identity: str = None,
        owner_domain: str = None,
        owner_identity: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 详细描述
        self.description = description
        # 被授权链域名
        self.grant_domain = grant_domain
        # 被授权合约链上地址
        self.grant_identity = grant_identity
        # 授权链的链域名
        self.owner_domain = owner_domain
        # 授权合约链上地址
        self.owner_identity = owner_identity

    def validate(self):
        self.validate_required(self.grant_domain, 'grant_domain')
        self.validate_required(self.grant_identity, 'grant_identity')
        self.validate_required(self.owner_domain, 'owner_domain')
        self.validate_required(self.owner_identity, 'owner_identity')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.description is not None:
            result['description'] = self.description
        if self.grant_domain is not None:
            result['grant_domain'] = self.grant_domain
        if self.grant_identity is not None:
            result['grant_identity'] = self.grant_identity
        if self.owner_domain is not None:
            result['owner_domain'] = self.owner_domain
        if self.owner_identity is not None:
            result['owner_identity'] = self.owner_identity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('grant_domain') is not None:
            self.grant_domain = m.get('grant_domain')
        if m.get('grant_identity') is not None:
            self.grant_identity = m.get('grant_identity')
        if m.get('owner_domain') is not None:
            self.owner_domain = m.get('owner_domain')
        if m.get('owner_identity') is not None:
            self.owner_identity = m.get('owner_identity')
        return self


class StartBaasOdatsCrosschainAuthorizeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: CrossChainInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跨链调用信息结构体
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
            temp_model = CrossChainInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class ListBaasOdatsCrosschainAuthorizedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        owner_domain: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 自有链的链域名
        self.owner_domain = owner_domain
        # 分页页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.owner_domain, 'owner_domain')
        self.validate_required(self.page_num, 'page_num')
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
        if self.owner_domain is not None:
            result['owner_domain'] = self.owner_domain
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
        if m.get('owner_domain') is not None:
            self.owner_domain = m.get('owner_domain')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListBaasOdatsCrosschainAuthorizedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[CrossChainInfo] = None,
        page_num: int = None,
        page_size: int = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跨链信息列表
        self.data = data
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总行数
        self.total = total

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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
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
                temp_model = CrossChainInfo()
                self.data.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class ListBaasOdatsCrosschainGrantedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        grant_domain: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被授权链的链域名
        self.grant_domain = grant_domain
        # 页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.grant_domain, 'grant_domain')
        self.validate_required(self.page_num, 'page_num')
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
        if self.grant_domain is not None:
            result['grant_domain'] = self.grant_domain
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
        if m.get('grant_domain') is not None:
            self.grant_domain = m.get('grant_domain')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListBaasOdatsCrosschainGrantedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[CrossChainInfo] = None,
        page_num: int = None,
        page_size: int = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跨链调用授权列表
        self.data = data
        # 当前页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总行数
        self.total = total

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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
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
                temp_model = CrossChainInfo()
                self.data.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class QueryBaasOdatsDomaincertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        domain: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链域名
        self.domain = domain

    def validate(self):
        self.validate_required(self.domain, 'domain')

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        return self


class QueryBaasOdatsDomaincertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: DomainCert = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 域名证书信息
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
            temp_model = DomainCert()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryBaasOdatsFabricCcRequest(TeaModel):
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


class QueryBaasOdatsFabricCcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chaincode: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约内容
        self.chaincode = chaincode

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
        if self.chaincode is not None:
            result['chaincode'] = self.chaincode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chaincode') is not None:
            self.chaincode = m.get('chaincode')
        return self


class QueryBaasOdatsFabricChaincodepathRequest(TeaModel):
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


class QueryBaasOdatsFabricChaincodepathResponse(TeaModel):
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
        # 上次cc的oss临时路径
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


class StartBaasOdatsFabricConfigyamlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        config_yaml: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # fabir yaml配置文件
        self.config_yaml = config_yaml

    def validate(self):
        self.validate_required(self.config_yaml, 'config_yaml')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.config_yaml is not None:
            result['config_yaml'] = self.config_yaml
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('config_yaml') is not None:
            self.config_yaml = m.get('config_yaml')
        return self


class StartBaasOdatsFabricConfigyamlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ConfigYamlInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 解析后的fabric 信息
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
            temp_model = ConfigYamlInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class StartBaasOdatsFabricRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        channel_name: str = None,
        config_yaml: str = None,
        description: str = None,
        domain: str = None,
        secret: str = None,
        username: str = None,
        user_cert: str = None,
        user_key: str = None,
        validator_peer_name_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 通道名
        self.channel_name = channel_name
        # fabric yaml 配置文件
        self.config_yaml = config_yaml
        # 详细描述
        self.description = description
        # 链域名
        self.domain = domain
        # fabric 密码
        self.secret = secret
        # fabir链接用户名
        self.username = username
        # fabric用户证书
        self.user_cert = user_cert
        # fabric用户密钥
        self.user_key = user_key
        # 验证节点列表
        self.validator_peer_name_list = validator_peer_name_list

    def validate(self):
        self.validate_required(self.channel_name, 'channel_name')
        self.validate_required(self.config_yaml, 'config_yaml')
        self.validate_required(self.description, 'description')
        self.validate_required(self.domain, 'domain')
        self.validate_required(self.validator_peer_name_list, 'validator_peer_name_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        if self.config_yaml is not None:
            result['config_yaml'] = self.config_yaml
        if self.description is not None:
            result['description'] = self.description
        if self.domain is not None:
            result['domain'] = self.domain
        if self.secret is not None:
            result['secret'] = self.secret
        if self.username is not None:
            result['username'] = self.username
        if self.user_cert is not None:
            result['user_cert'] = self.user_cert
        if self.user_key is not None:
            result['user_key'] = self.user_key
        if self.validator_peer_name_list is not None:
            result['validator_peer_name_list'] = self.validator_peer_name_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('config_yaml') is not None:
            self.config_yaml = m.get('config_yaml')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('secret') is not None:
            self.secret = m.get('secret')
        if m.get('username') is not None:
            self.username = m.get('username')
        if m.get('user_cert') is not None:
            self.user_cert = m.get('user_cert')
        if m.get('user_key') is not None:
            self.user_key = m.get('user_key')
        if m.get('validator_peer_name_list') is not None:
            self.validator_peer_name_list = m.get('validator_peer_name_list')
        return self


class StartBaasOdatsFabricResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: FabricChainInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # fabric chain info的信息
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
            temp_model = FabricChainInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class StartBaasOdatsMychainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        anchored_block_height: int = None,
        bizid: str = None,
        description: str = None,
        domain: str = None,
        mychain_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 锚定块高
        self.anchored_block_height = anchored_block_height
        # 链id
        self.bizid = bizid
        # 详细描述
        self.description = description
        # 链域名
        self.domain = domain
        # {"mychainInfo":{"caCert":" mychain对应的cacert ","consensusNodeInfo":[{"ip":"","port":""},{"ip":"","port":""}]},"mychainAccount":{"account":"使用的链上账户","privateKey":"","privateKeyPwd":"","publicKey":"","recoveryPrivateKey":"","recoveryPrivateKeyPwd":"","recoveryPublicKey":""},"mychainTlsCert":{"cert":"链接链的证书","privateKey":"","privateKeyPwd":""}}
        self.mychain_info = mychain_info

    def validate(self):
        self.validate_required(self.description, 'description')
        self.validate_required(self.domain, 'domain')
        self.validate_required(self.mychain_info, 'mychain_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.anchored_block_height is not None:
            result['anchored_block_height'] = self.anchored_block_height
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.description is not None:
            result['description'] = self.description
        if self.domain is not None:
            result['domain'] = self.domain
        if self.mychain_info is not None:
            result['mychain_info'] = self.mychain_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('anchored_block_height') is not None:
            self.anchored_block_height = m.get('anchored_block_height')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        if m.get('mychain_info') is not None:
            self.mychain_info = m.get('mychain_info')
        return self


class StartBaasOdatsMychainResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: MyChainInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回注册的mychain的信息
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
            temp_model = MyChainInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class ListBaasOdatsRegisteredblockchainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
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
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListBaasOdatsRegisteredblockchainResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[OdatsRegisteredBlockChainInfo] = None,
        page_num: int = None,
        page_size: int = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 注册list列表
        self.data = data
        # 当前页码。
        self.page_num = page_num
        # 当前页大小
        self.page_size = page_size
        # 总行数
        self.total = total

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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
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
                temp_model = OdatsRegisteredBlockChainInfo()
                self.data.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class QueryBaasOdatsUdnscertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        domain: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链域名
        self.domain = domain

    def validate(self):
        self.validate_required(self.domain, 'domain')

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('domain') is not None:
            self.domain = m.get('domain')
        return self


class QueryBaasOdatsUdnscertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: UdnsCert = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # udns cert 信息
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
            temp_model = UdnsCert()
            self.data = temp_model.from_map(m['data'])
        return self


