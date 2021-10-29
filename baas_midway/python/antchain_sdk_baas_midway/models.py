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


class BlockchainInfo(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        blockchain_name: str = None,
        parent_biz_id: str = None,
    ):
        # 链节点ID
        self.biz_id = biz_id
        # 区块链名称
        self.blockchain_name = blockchain_name
        # 当前链如果为主链，该字段为空；否则该字段为子链对应的主链ID
        self.parent_biz_id = parent_biz_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.blockchain_name, 'blockchain_name')

    def to_map(self):
        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.blockchain_name is not None:
            result['blockchain_name'] = self.blockchain_name
        if self.parent_biz_id is not None:
            result['parent_biz_id'] = self.parent_biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('blockchain_name') is not None:
            self.blockchain_name = m.get('blockchain_name')
        if m.get('parent_biz_id') is not None:
            self.parent_biz_id = m.get('parent_biz_id')
        return self


class NodeInfo(TeaModel):
    def __init__(
        self,
        public_ip: str = None,
        private_ip: str = None,
        client_port: str = None,
        p_2p_port: str = None,
    ):
        # 公网IP
        self.public_ip = public_ip
        # 内网IP
        self.private_ip = private_ip
        # 连接端口
        self.client_port = client_port
        # 共识端口
        self.p_2p_port = p_2p_port

    def validate(self):
        self.validate_required(self.public_ip, 'public_ip')
        self.validate_required(self.private_ip, 'private_ip')
        self.validate_required(self.client_port, 'client_port')
        self.validate_required(self.p_2p_port, 'p_2p_port')

    def to_map(self):
        result = dict()
        if self.public_ip is not None:
            result['public_ip'] = self.public_ip
        if self.private_ip is not None:
            result['private_ip'] = self.private_ip
        if self.client_port is not None:
            result['client_port'] = self.client_port
        if self.p_2p_port is not None:
            result['p2p_port'] = self.p_2p_port
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('public_ip') is not None:
            self.public_ip = m.get('public_ip')
        if m.get('private_ip') is not None:
            self.private_ip = m.get('private_ip')
        if m.get('client_port') is not None:
            self.client_port = m.get('client_port')
        if m.get('p2p_port') is not None:
            self.p_2p_port = m.get('p2p_port')
        return self


class QueryNodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        return self


class QueryNodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        node_info_list: List[NodeInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链节点信息
        self.node_info_list = node_info_list

    def validate(self):
        if self.node_info_list:
            for k in self.node_info_list:
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
        result['node_info_list'] = []
        if self.node_info_list is not None:
            for k in self.node_info_list:
                result['node_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.node_info_list = []
        if m.get('node_info_list') is not None:
            for k in m.get('node_info_list'):
                temp_model = NodeInfo()
                self.node_info_list.append(temp_model.from_map(k))
        return self


class QueryBlockchainRequest(TeaModel):
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


class QueryBlockchainResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        blockchain_info_list: List[BlockchainInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链信息列表
        self.blockchain_info_list = blockchain_info_list

    def validate(self):
        if self.blockchain_info_list:
            for k in self.blockchain_info_list:
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
        result['blockchain_info_list'] = []
        if self.blockchain_info_list is not None:
            for k in self.blockchain_info_list:
                result['blockchain_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.blockchain_info_list = []
        if m.get('blockchain_info_list') is not None:
            for k in m.get('blockchain_info_list'):
                temp_model = BlockchainInfo()
                self.blockchain_info_list.append(temp_model.from_map(k))
        return self


class DownloadCaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        return self


class DownloadCaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trust_ca_content: str = None,
        ca_format: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 根CA证书内容
        self.trust_ca_content = trust_ca_content
        # CA证书格式，目前只有X509
        self.ca_format = ca_format

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
        if self.trust_ca_content is not None:
            result['trust_ca_content'] = self.trust_ca_content
        if self.ca_format is not None:
            result['ca_format'] = self.ca_format
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trust_ca_content') is not None:
            self.trust_ca_content = m.get('trust_ca_content')
        if m.get('ca_format') is not None:
            self.ca_format = m.get('ca_format')
        return self


class CreateTlsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tls_algo: str = None,
        password: str = None,
        key_format: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 非对称加密算法
        self.tls_algo = tls_algo
        # 密码
        self.password = password
        # 封装格式
        self.key_format = key_format

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tls_algo is not None:
            result['tls_algo'] = self.tls_algo
        if self.password is not None:
            result['password'] = self.password
        if self.key_format is not None:
            result['key_format'] = self.key_format
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tls_algo') is not None:
            self.tls_algo = m.get('tls_algo')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('key_format') is not None:
            self.key_format = m.get('key_format')
        return self


class CreateTlsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        client_cert: str = None,
        client_key: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户端TLS证书
        self.client_cert = client_cert
        # 客户端TLS密钥
        self.client_key = client_key

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
        if self.client_cert is not None:
            result['client_cert'] = self.client_cert
        if self.client_key is not None:
            result['client_key'] = self.client_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('client_cert') is not None:
            self.client_cert = m.get('client_cert')
        if m.get('client_key') is not None:
            self.client_key = m.get('client_key')
        return self


