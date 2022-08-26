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


class ALiYunPagination(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        page_number: int = None,
        total_count: int = None,
    ):
        # 分页大小
        self.page_size = page_size
        # 分页编号
        self.page_number = page_number
        # 总数大小
        self.total_count = total_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class ALiYunAntChain(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        ant_chain_name: str = None,
        chain_type: str = None,
        cipher_suit: str = None,
        create_time: int = None,
        expire_time: int = None,
        instance_id: str = None,
        is_admin: bool = None,
        member_status: str = None,
        merkle_tree_suit: str = None,
        network: str = None,
        node_num: int = None,
        region_id: str = None,
        resource_size: str = None,
        tls_algo: str = None,
        version: str = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # 链名称
        self.ant_chain_name = ant_chain_name
        # 链的类型
        self.chain_type = chain_type
        # cipher_suit
        self.cipher_suit = cipher_suit
        # 创建时间
        self.create_time = create_time
        # expire_time
        self.expire_time = expire_time
        # instance_id
        self.instance_id = instance_id
        # is_admin
        self.is_admin = is_admin
        # 成员状态
        self.member_status = member_status
        # merkle_tree_suit
        self.merkle_tree_suit = merkle_tree_suit
        # Network
        self.network = network
        # 节点数
        self.node_num = node_num
        # 区域信息
        self.region_id = region_id
        # 链的资源大小
        self.resource_size = resource_size
        # 算法参数
        self.tls_algo = tls_algo
        # 版本信息
        self.version = version

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.ant_chain_name is not None:
            result['ant_chain_name'] = self.ant_chain_name
        if self.chain_type is not None:
            result['chain_type'] = self.chain_type
        if self.cipher_suit is not None:
            result['cipher_suit'] = self.cipher_suit
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.is_admin is not None:
            result['is_admin'] = self.is_admin
        if self.member_status is not None:
            result['member_status'] = self.member_status
        if self.merkle_tree_suit is not None:
            result['merkle_tree_suit'] = self.merkle_tree_suit
        if self.network is not None:
            result['network'] = self.network
        if self.node_num is not None:
            result['node_num'] = self.node_num
        if self.region_id is not None:
            result['region_id'] = self.region_id
        if self.resource_size is not None:
            result['resource_size'] = self.resource_size
        if self.tls_algo is not None:
            result['tls_algo'] = self.tls_algo
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('ant_chain_name') is not None:
            self.ant_chain_name = m.get('ant_chain_name')
        if m.get('chain_type') is not None:
            self.chain_type = m.get('chain_type')
        if m.get('cipher_suit') is not None:
            self.cipher_suit = m.get('cipher_suit')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('is_admin') is not None:
            self.is_admin = m.get('is_admin')
        if m.get('member_status') is not None:
            self.member_status = m.get('member_status')
        if m.get('merkle_tree_suit') is not None:
            self.merkle_tree_suit = m.get('merkle_tree_suit')
        if m.get('network') is not None:
            self.network = m.get('network')
        if m.get('node_num') is not None:
            self.node_num = m.get('node_num')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        if m.get('resource_size') is not None:
            self.resource_size = m.get('resource_size')
        if m.get('tls_algo') is not None:
            self.tls_algo = m.get('tls_algo')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class ALiYunAccount(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        account: str = None,
        account_public_key: str = None,
        account_recovery_key: str = None,
        account_status: str = None,
        member_name: str = None,
        create_time: int = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # account
        self.account = account
        # account_public_key
        self.account_public_key = account_public_key
        # account_recovery_key
        self.account_recovery_key = account_recovery_key
        # account_status
        self.account_status = account_status
        # 机构信息
        self.member_name = member_name
        # 创建时间
        self.create_time = create_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.account is not None:
            result['account'] = self.account
        if self.account_public_key is not None:
            result['account_public_key'] = self.account_public_key
        if self.account_recovery_key is not None:
            result['account_recovery_key'] = self.account_recovery_key
        if self.account_status is not None:
            result['account_status'] = self.account_status
        if self.member_name is not None:
            result['member_name'] = self.member_name
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('account_public_key') is not None:
            self.account_public_key = m.get('account_public_key')
        if m.get('account_recovery_key') is not None:
            self.account_recovery_key = m.get('account_recovery_key')
        if m.get('account_status') is not None:
            self.account_status = m.get('account_status')
        if m.get('member_name') is not None:
            self.member_name = m.get('member_name')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        return self


class ALiYunChainNodeInfo(TeaModel):
    def __init__(
        self,
        block_height: int = None,
        node_name: str = None,
        status: bool = None,
        version: str = None,
        node_id: str = None,
        node_ip: str = None,
        node_port: str = None,
        node_type: str = None,
        node_state: str = None,
        node_source: str = None,
        disk_use: str = None,
        disk_total: str = None,
        public_key: str = None,
    ):
        # block_height
        self.block_height = block_height
        # node_name
        self.node_name = node_name
        # status
        self.status = status
        # version
        self.version = version
        # 节点id
        self.node_id = node_id
        # 节点ip
        self.node_ip = node_ip
        # 节点的端口
        self.node_port = node_port
        # 节点类型
        self.node_type = node_type
        # 节点状态
        self.node_state = node_state
        # 节点来源
        self.node_source = node_source
        # 节点存储空间使用量
        self.disk_use = disk_use
        # 节点存储总空间大小
        self.disk_total = disk_total
        # 节点公钥
        self.public_key = public_key

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.node_name is not None:
            result['node_name'] = self.node_name
        if self.status is not None:
            result['status'] = self.status
        if self.version is not None:
            result['version'] = self.version
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_ip is not None:
            result['node_ip'] = self.node_ip
        if self.node_port is not None:
            result['node_port'] = self.node_port
        if self.node_type is not None:
            result['node_type'] = self.node_type
        if self.node_state is not None:
            result['node_state'] = self.node_state
        if self.node_source is not None:
            result['node_source'] = self.node_source
        if self.disk_use is not None:
            result['disk_use'] = self.disk_use
        if self.disk_total is not None:
            result['disk_total'] = self.disk_total
        if self.public_key is not None:
            result['public_key'] = self.public_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('node_name') is not None:
            self.node_name = m.get('node_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_ip') is not None:
            self.node_ip = m.get('node_ip')
        if m.get('node_port') is not None:
            self.node_port = m.get('node_port')
        if m.get('node_type') is not None:
            self.node_type = m.get('node_type')
        if m.get('node_state') is not None:
            self.node_state = m.get('node_state')
        if m.get('node_source') is not None:
            self.node_source = m.get('node_source')
        if m.get('disk_use') is not None:
            self.disk_use = m.get('disk_use')
        if m.get('disk_total') is not None:
            self.disk_total = m.get('disk_total')
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
        return self


class ALiYunAntConsortium(TeaModel):
    def __init__(
        self,
        chain_num: int = None,
        consortium_description: str = None,
        consortium_id: str = None,
        consortium_name: str = None,
        create_time: int = None,
        is_empty_consortium: bool = None,
        member_num: int = None,
        role: str = None,
        status: str = None,
    ):
        # 链的数量
        self.chain_num = chain_num
        # 联盟描述
        self.consortium_description = consortium_description
        # 联盟id
        self.consortium_id = consortium_id
        # 联盟名称
        self.consortium_name = consortium_name
        # 时间戳
        self.create_time = create_time
        # 是否为空联盟
        self.is_empty_consortium = is_empty_consortium
        # 成员数量
        self.member_num = member_num
        # 角色
        self.role = role
        # 状态值
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.chain_num is not None:
            result['chain_num'] = self.chain_num
        if self.consortium_description is not None:
            result['consortium_description'] = self.consortium_description
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.consortium_name is not None:
            result['consortium_name'] = self.consortium_name
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.is_empty_consortium is not None:
            result['is_empty_consortium'] = self.is_empty_consortium
        if self.member_num is not None:
            result['member_num'] = self.member_num
        if self.role is not None:
            result['role'] = self.role
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_num') is not None:
            self.chain_num = m.get('chain_num')
        if m.get('consortium_description') is not None:
            self.consortium_description = m.get('consortium_description')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('consortium_name') is not None:
            self.consortium_name = m.get('consortium_name')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('is_empty_consortium') is not None:
            self.is_empty_consortium = m.get('is_empty_consortium')
        if m.get('member_num') is not None:
            self.member_num = m.get('member_num')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ALiYunMember(TeaModel):
    def __init__(
        self,
        join_time: int = None,
        member_id: str = None,
        member_name: str = None,
        role: str = None,
        status: str = None,
    ):
        # 加入时间
        self.join_time = join_time
        # 成员id
        self.member_id = member_id
        # 成员名称
        self.member_name = member_name
        # 角色
        self.role = role
        # 状态
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.join_time is not None:
            result['join_time'] = self.join_time
        if self.member_id is not None:
            result['member_id'] = self.member_id
        if self.member_name is not None:
            result['member_name'] = self.member_name
        if self.role is not None:
            result['role'] = self.role
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('join_time') is not None:
            self.join_time = m.get('join_time')
        if m.get('member_id') is not None:
            self.member_id = m.get('member_id')
        if m.get('member_name') is not None:
            self.member_name = m.get('member_name')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ALiYunChainSubnet(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        name: str = None,
        node_sum: int = None,
        monitor: bool = None,
        block_height: str = None,
        transaction_sum: int = None,
        create_time: int = None,
        status: str = None,
        consortium_member: bool = None,
        main_chain_id: str = None,
        rest: str = None,
        group_id: str = None,
    ):
        # 子链id
        self.ant_chain_id = ant_chain_id
        # 子链名称
        self.name = name
        # 子链节点数
        self.node_sum = node_sum
        # 子链监控状态
        self.monitor = monitor
        # 子链的块高
        self.block_height = block_height
        # 子链的业务总数
        self.transaction_sum = transaction_sum
        # 子链的创建时间
        self.create_time = create_time
        # 子链的状态
        self.status = status
        # 子链的权限
        self.consortium_member = consortium_member
        # 主链id
        self.main_chain_id = main_chain_id
        # rest申请状态
        self.rest = rest
        # 子链序号
        self.group_id = group_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.name is not None:
            result['name'] = self.name
        if self.node_sum is not None:
            result['node_sum'] = self.node_sum
        if self.monitor is not None:
            result['monitor'] = self.monitor
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.transaction_sum is not None:
            result['transaction_sum'] = self.transaction_sum
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.status is not None:
            result['status'] = self.status
        if self.consortium_member is not None:
            result['consortium_member'] = self.consortium_member
        if self.main_chain_id is not None:
            result['main_chain_id'] = self.main_chain_id
        if self.rest is not None:
            result['rest'] = self.rest
        if self.group_id is not None:
            result['group_id'] = self.group_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('node_sum') is not None:
            self.node_sum = m.get('node_sum')
        if m.get('monitor') is not None:
            self.monitor = m.get('monitor')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('transaction_sum') is not None:
            self.transaction_sum = m.get('transaction_sum')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('consortium_member') is not None:
            self.consortium_member = m.get('consortium_member')
        if m.get('main_chain_id') is not None:
            self.main_chain_id = m.get('main_chain_id')
        if m.get('rest') is not None:
            self.rest = m.get('rest')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        return self


class ALiYunChainSubnetCheck(TeaModel):
    def __init__(
        self,
        check_result: str = None,
        consortium_member_list: List[str] = None,
        chain_node_info_list: List[ALiYunChainNodeInfo] = None,
        consortium_admin: bool = None,
        consortium_member_info_list: List[ALiYunMember] = None,
        pagination: ALiYunPagination = None,
    ):
        # 检查结果
        self.check_result = check_result
        # 子链成员列表
        self.consortium_member_list = consortium_member_list
        # 节点信息列表
        self.chain_node_info_list = chain_node_info_list
        # 联盟管理员
        self.consortium_admin = consortium_admin
        # 子链成员列表
        self.consortium_member_info_list = consortium_member_info_list
        # 分页信息
        self.pagination = pagination

    def validate(self):
        if self.chain_node_info_list:
            for k in self.chain_node_info_list:
                if k:
                    k.validate()
        if self.consortium_member_info_list:
            for k in self.consortium_member_info_list:
                if k:
                    k.validate()
        if self.pagination:
            self.pagination.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.check_result is not None:
            result['check_result'] = self.check_result
        if self.consortium_member_list is not None:
            result['consortium_member_list'] = self.consortium_member_list
        result['chain_node_info_list'] = []
        if self.chain_node_info_list is not None:
            for k in self.chain_node_info_list:
                result['chain_node_info_list'].append(k.to_map() if k else None)
        if self.consortium_admin is not None:
            result['consortium_admin'] = self.consortium_admin
        result['consortium_member_info_list'] = []
        if self.consortium_member_info_list is not None:
            for k in self.consortium_member_info_list:
                result['consortium_member_info_list'].append(k.to_map() if k else None)
        if self.pagination is not None:
            result['pagination'] = self.pagination.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('check_result') is not None:
            self.check_result = m.get('check_result')
        if m.get('consortium_member_list') is not None:
            self.consortium_member_list = m.get('consortium_member_list')
        self.chain_node_info_list = []
        if m.get('chain_node_info_list') is not None:
            for k in m.get('chain_node_info_list'):
                temp_model = ALiYunChainNodeInfo()
                self.chain_node_info_list.append(temp_model.from_map(k))
        if m.get('consortium_admin') is not None:
            self.consortium_admin = m.get('consortium_admin')
        self.consortium_member_info_list = []
        if m.get('consortium_member_info_list') is not None:
            for k in m.get('consortium_member_info_list'):
                temp_model = ALiYunMember()
                self.consortium_member_info_list.append(temp_model.from_map(k))
        if m.get('pagination') is not None:
            temp_model = ALiYunPagination()
            self.pagination = temp_model.from_map(m['pagination'])
        return self


class ALiYunChainSubnetList(TeaModel):
    def __init__(
        self,
        ant_chain_id: str = None,
        blockchain_name: str = None,
        consortium_admin: bool = None,
        blockchain_subnet_list: List[ALiYunChainSubnet] = None,
    ):
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # 子链名称
        self.blockchain_name = blockchain_name
        # 联盟管理员
        self.consortium_admin = consortium_admin
        # 子链列表信息
        self.blockchain_subnet_list = blockchain_subnet_list

    def validate(self):
        if self.blockchain_subnet_list:
            for k in self.blockchain_subnet_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.blockchain_name is not None:
            result['blockchain_name'] = self.blockchain_name
        if self.consortium_admin is not None:
            result['consortium_admin'] = self.consortium_admin
        result['blockchain_subnet_list'] = []
        if self.blockchain_subnet_list is not None:
            for k in self.blockchain_subnet_list:
                result['blockchain_subnet_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('blockchain_name') is not None:
            self.blockchain_name = m.get('blockchain_name')
        if m.get('consortium_admin') is not None:
            self.consortium_admin = m.get('consortium_admin')
        self.blockchain_subnet_list = []
        if m.get('blockchain_subnet_list') is not None:
            for k in m.get('blockchain_subnet_list'):
                temp_model = ALiYunChainSubnet()
                self.blockchain_subnet_list.append(temp_model.from_map(k))
        return self


class ALiYunChainAccount(TeaModel):
    def __init__(
        self,
        account: str = None,
        account_private_key: str = None,
        account_public_key: str = None,
        account_recover_private_key: str = None,
        account_recover_public_key: str = None,
        ant_chain_id: str = None,
    ):
        # account
        self.account = account
        # account_private_key
        self.account_private_key = account_private_key
        # account_public_key
        self.account_public_key = account_public_key
        # account_recover_private_key
        self.account_recover_private_key = account_recover_private_key
        # account_recover_public_key
        self.account_recover_public_key = account_recover_public_key
        # ant_chain_id
        self.ant_chain_id = ant_chain_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account is not None:
            result['account'] = self.account
        if self.account_private_key is not None:
            result['account_private_key'] = self.account_private_key
        if self.account_public_key is not None:
            result['account_public_key'] = self.account_public_key
        if self.account_recover_private_key is not None:
            result['account_recover_private_key'] = self.account_recover_private_key
        if self.account_recover_public_key is not None:
            result['account_recover_public_key'] = self.account_recover_public_key
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('account_private_key') is not None:
            self.account_private_key = m.get('account_private_key')
        if m.get('account_public_key') is not None:
            self.account_public_key = m.get('account_public_key')
        if m.get('account_recover_private_key') is not None:
            self.account_recover_private_key = m.get('account_recover_private_key')
        if m.get('account_recover_public_key') is not None:
            self.account_recover_public_key = m.get('account_recover_public_key')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        return self


class ALiYunUnion(TeaModel):
    def __init__(
        self,
        ant_chains: List[ALiYunAntChain] = None,
        ant_consortiums: List[ALiYunAntConsortium] = None,
        consortium_id: str = None,
        is_exist: bool = None,
        members: List[ALiYunMember] = None,
        pagination: ALiYunPagination = None,
    ):
        # 联盟内链的集合
        self.ant_chains = ant_chains
        # 联盟信息
        self.ant_consortiums = ant_consortiums
        # 联盟Id
        self.consortium_id = consortium_id
        # is_exist
        self.is_exist = is_exist
        # 联盟成员信息
        self.members = members
        # 阿里云分页属性
        self.pagination = pagination

    def validate(self):
        if self.ant_chains:
            for k in self.ant_chains:
                if k:
                    k.validate()
        if self.ant_consortiums:
            for k in self.ant_consortiums:
                if k:
                    k.validate()
        if self.members:
            for k in self.members:
                if k:
                    k.validate()
        if self.pagination:
            self.pagination.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['ant_chains'] = []
        if self.ant_chains is not None:
            for k in self.ant_chains:
                result['ant_chains'].append(k.to_map() if k else None)
        result['ant_consortiums'] = []
        if self.ant_consortiums is not None:
            for k in self.ant_consortiums:
                result['ant_consortiums'].append(k.to_map() if k else None)
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.is_exist is not None:
            result['is_exist'] = self.is_exist
        result['members'] = []
        if self.members is not None:
            for k in self.members:
                result['members'].append(k.to_map() if k else None)
        if self.pagination is not None:
            result['pagination'] = self.pagination.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.ant_chains = []
        if m.get('ant_chains') is not None:
            for k in m.get('ant_chains'):
                temp_model = ALiYunAntChain()
                self.ant_chains.append(temp_model.from_map(k))
        self.ant_consortiums = []
        if m.get('ant_consortiums') is not None:
            for k in m.get('ant_consortiums'):
                temp_model = ALiYunAntConsortium()
                self.ant_consortiums.append(temp_model.from_map(k))
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('is_exist') is not None:
            self.is_exist = m.get('is_exist')
        self.members = []
        if m.get('members') is not None:
            for k in m.get('members'):
                temp_model = ALiYunMember()
                self.members.append(temp_model.from_map(k))
        if m.get('pagination') is not None:
            temp_model = ALiYunPagination()
            self.pagination = temp_model.from_map(m['pagination'])
        return self


class ALiYunAccountList(TeaModel):
    def __init__(
        self,
        pagination: ALiYunPagination = None,
        accounts: List[ALiYunAccount] = None,
        consortium_admin: bool = None,
    ):
        # pagination
        self.pagination = pagination
        # accounts
        self.accounts = accounts
        # 联盟管理员
        self.consortium_admin = consortium_admin

    def validate(self):
        if self.pagination:
            self.pagination.validate()
        if self.accounts:
            for k in self.accounts:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pagination is not None:
            result['pagination'] = self.pagination.to_map()
        result['accounts'] = []
        if self.accounts is not None:
            for k in self.accounts:
                result['accounts'].append(k.to_map() if k else None)
        if self.consortium_admin is not None:
            result['consortium_admin'] = self.consortium_admin
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pagination') is not None:
            temp_model = ALiYunPagination()
            self.pagination = temp_model.from_map(m['pagination'])
        self.accounts = []
        if m.get('accounts') is not None:
            for k in m.get('accounts'):
                temp_model = ALiYunAccount()
                self.accounts.append(temp_model.from_map(k))
        if m.get('consortium_admin') is not None:
            self.consortium_admin = m.get('consortium_admin')
        return self


class BaasUnionInfo(TeaModel):
    def __init__(
        self,
        union_name: str = None,
        union_description: str = None,
        union_user: str = None,
        union_user_cell: str = None,
        union_user_mail: str = None,
    ):
        # 联盟名称
        self.union_name = union_name
        # 描述
        self.union_description = union_description
        # 联系人
        self.union_user = union_user
        # 联盟联系人手机号码
        self.union_user_cell = union_user_cell
        # 联盟联系人邮箱
        self.union_user_mail = union_user_mail

    def validate(self):
        self.validate_required(self.union_name, 'union_name')
        self.validate_required(self.union_description, 'union_description')
        self.validate_required(self.union_user, 'union_user')
        self.validate_required(self.union_user_cell, 'union_user_cell')
        self.validate_required(self.union_user_mail, 'union_user_mail')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.union_name is not None:
            result['union_name'] = self.union_name
        if self.union_description is not None:
            result['union_description'] = self.union_description
        if self.union_user is not None:
            result['union_user'] = self.union_user
        if self.union_user_cell is not None:
            result['union_user_cell'] = self.union_user_cell
        if self.union_user_mail is not None:
            result['union_user_mail'] = self.union_user_mail
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('union_name') is not None:
            self.union_name = m.get('union_name')
        if m.get('union_description') is not None:
            self.union_description = m.get('union_description')
        if m.get('union_user') is not None:
            self.union_user = m.get('union_user')
        if m.get('union_user_cell') is not None:
            self.union_user_cell = m.get('union_user_cell')
        if m.get('union_user_mail') is not None:
            self.union_user_mail = m.get('union_user_mail')
        return self


class ALiYunChainRest(TeaModel):
    def __init__(
        self,
        access_id: str = None,
        create_time: int = None,
        rest: str = None,
        update_time: int = None,
        result: str = None,
    ):
        # access_id
        self.access_id = access_id
        # create_time
        self.create_time = create_time
        # rest
        self.rest = rest
        # update_time
        self.update_time = update_time
        # REST开通结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_id is not None:
            result['access_id'] = self.access_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.rest is not None:
            result['rest'] = self.rest
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_id') is not None:
            self.access_id = m.get('access_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('rest') is not None:
            self.rest = m.get('rest')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class CreateBaasBlockchainInstanceInnerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        blockchain_name: str = None,
        blockchain_tag: str = None,
        blockchain_type: str = None,
        create_union_info: BaasUnionInfo = None,
        node_number: int = None,
        union_id: int = None,
        group_code: str = None,
        group_sub_code: str = None,
        test_chain: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链名称
        self.blockchain_name = blockchain_name
        # 链打标内容
        self.blockchain_tag = blockchain_tag
        # Tee链/企业版/企业版  enterprise
        self.blockchain_type = blockchain_type
        # 待创建联盟的信息
        self.create_union_info = create_union_info
        # 节点数
        self.node_number = node_number
        # 联盟id
        self.union_id = union_id
        # 业务线code
        self.group_code = group_code
        # 业务线子码
        self.group_sub_code = group_sub_code
        # 是否需要创建测试链
        self.test_chain = test_chain

    def validate(self):
        self.validate_required(self.blockchain_name, 'blockchain_name')
        self.validate_required(self.blockchain_type, 'blockchain_type')
        if self.create_union_info:
            self.create_union_info.validate()
        self.validate_required(self.node_number, 'node_number')
        self.validate_required(self.group_code, 'group_code')
        self.validate_required(self.group_sub_code, 'group_sub_code')
        self.validate_required(self.test_chain, 'test_chain')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.blockchain_name is not None:
            result['blockchain_name'] = self.blockchain_name
        if self.blockchain_tag is not None:
            result['blockchain_tag'] = self.blockchain_tag
        if self.blockchain_type is not None:
            result['blockchain_type'] = self.blockchain_type
        if self.create_union_info is not None:
            result['create_union_info'] = self.create_union_info.to_map()
        if self.node_number is not None:
            result['node_number'] = self.node_number
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.group_code is not None:
            result['group_code'] = self.group_code
        if self.group_sub_code is not None:
            result['group_sub_code'] = self.group_sub_code
        if self.test_chain is not None:
            result['test_chain'] = self.test_chain
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('blockchain_name') is not None:
            self.blockchain_name = m.get('blockchain_name')
        if m.get('blockchain_tag') is not None:
            self.blockchain_tag = m.get('blockchain_tag')
        if m.get('blockchain_type') is not None:
            self.blockchain_type = m.get('blockchain_type')
        if m.get('create_union_info') is not None:
            temp_model = BaasUnionInfo()
            self.create_union_info = temp_model.from_map(m['create_union_info'])
        if m.get('node_number') is not None:
            self.node_number = m.get('node_number')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('group_code') is not None:
            self.group_code = m.get('group_code')
        if m.get('group_sub_code') is not None:
            self.group_sub_code = m.get('group_sub_code')
        if m.get('test_chain') is not None:
            self.test_chain = m.get('test_chain')
        return self


class CreateBaasBlockchainInstanceInnerResponse(TeaModel):
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
        # instanceId
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


class ApplyBaasChainAccountAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account: str = None,
        ant_chain_id: str = None,
        password: str = None,
        recover_password: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # account
        self.account = account
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # password
        self.password = password
        # recover_password
        self.recover_password = recover_password

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
        if self.account is not None:
            result['account'] = self.account
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.password is not None:
            result['password'] = self.password
        if self.recover_password is not None:
            result['recover_password'] = self.recover_password
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('recover_password') is not None:
            self.recover_password = m.get('recover_password')
        return self


class ApplyBaasChainAccountAntResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunChainAccount = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunChainAccount()
            self.result = temp_model.from_map(m['result'])
        return self


class CreateBaasChainAccountAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account: str = None,
        account_pub_key: str = None,
        account_recover_pub_key: str = None,
        ant_chain_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # account
        self.account = account
        # account_pub_key
        self.account_pub_key = account_pub_key
        # account_recover_pub_key
        self.account_recover_pub_key = account_recover_pub_key
        # ant_chain_id
        self.ant_chain_id = ant_chain_id

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
        if self.account is not None:
            result['account'] = self.account
        if self.account_pub_key is not None:
            result['account_pub_key'] = self.account_pub_key
        if self.account_recover_pub_key is not None:
            result['account_recover_pub_key'] = self.account_recover_pub_key
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('account_pub_key') is not None:
            self.account_pub_key = m.get('account_pub_key')
        if m.get('account_recover_pub_key') is not None:
            self.account_recover_pub_key = m.get('account_recover_pub_key')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        return self


class CreateBaasChainAccountAntResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunChainAccount = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunChainAccount()
            self.result = temp_model.from_map(m['result'])
        return self


class FreezeBaasChainAccountAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account: str = None,
        ant_chain_id: str = None,
        region_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # account
        self.account = account
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # region_id
        self.region_id = region_id

    def validate(self):
        self.validate_required(self.account, 'account')
        self.validate_required(self.ant_chain_id, 'ant_chain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account is not None:
            result['account'] = self.account
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.region_id is not None:
            result['region_id'] = self.region_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        return self


class FreezeBaasChainAccountAntResponse(TeaModel):
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
        # result
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


class QueryBaasChainAccountAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # page_number
        self.page_number = page_number
        # page_size
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.ant_chain_id, 'ant_chain_id')
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
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryBaasChainAccountAntResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunAccountList = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunAccountList()
            self.result = temp_model.from_map(m['result'])
        return self


class UnfreezeBaasChainAccountAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account: str = None,
        ant_chain_id: str = None,
        region_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # account
        self.account = account
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # region_id
        self.region_id = region_id

    def validate(self):
        self.validate_required(self.ant_chain_id, 'ant_chain_id')
        self.validate_required(self.region_id, 'region_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.account is not None:
            result['account'] = self.account
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.region_id is not None:
            result['region_id'] = self.region_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        return self


class UnfreezeBaasChainAccountAntResponse(TeaModel):
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
        # result
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


class UpdateBaasChainNameAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        ant_chain_name: str = None,
        region_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # ant_chain_name
        self.ant_chain_name = ant_chain_name
        # region_id
        self.region_id = region_id

    def validate(self):
        self.validate_required(self.ant_chain_id, 'ant_chain_id')
        self.validate_required(self.ant_chain_name, 'ant_chain_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.ant_chain_name is not None:
            result['ant_chain_name'] = self.ant_chain_name
        if self.region_id is not None:
            result['region_id'] = self.region_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('ant_chain_name') is not None:
            self.ant_chain_name = m.get('ant_chain_name')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        return self


class UpdateBaasChainNameAntResponse(TeaModel):
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
        # result
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


class CreateBaasChainSubnetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        subnet_name: str = None,
        node_id: str = None,
        consortium_member: str = None,
        consortium_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 主链id
        self.ant_chain_id = ant_chain_id
        # 子链名称
        self.subnet_name = subnet_name
        # 节点的id
        self.node_id = node_id
        # 联盟成员
        self.consortium_member = consortium_member
        # 联盟id
        self.consortium_id = consortium_id

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
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.subnet_name is not None:
            result['subnet_name'] = self.subnet_name
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.consortium_member is not None:
            result['consortium_member'] = self.consortium_member
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('subnet_name') is not None:
            self.subnet_name = m.get('subnet_name')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('consortium_member') is not None:
            self.consortium_member = m.get('consortium_member')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        return self


class CreateBaasChainSubnetResponse(TeaModel):
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
        # 建链结果
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


class CheckBaasChainSubnetCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id

    def validate(self):
        self.validate_required(self.ant_chain_id, 'ant_chain_id')
        self.validate_required(self.consortium_id, 'consortium_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        return self


class CheckBaasChainSubnetCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunChainSubnetCheck = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 检查结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunChainSubnetCheck()
            self.result = temp_model.from_map(m['result'])
        return self


class ExecBaasChainSubnetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
        operate_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 子链id
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id
        # 子链操作的枚举类型
        self.operate_type = operate_type

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
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.operate_type is not None:
            result['operate_type'] = self.operate_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('operate_type') is not None:
            self.operate_type = m.get('operate_type')
        return self


class ExecBaasChainSubnetResponse(TeaModel):
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
        # 子链启停的结果
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


class AddBaasChainSubnetMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
        consortium_member_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 子链id
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id
        # 联盟成员id
        self.consortium_member_id = consortium_member_id

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
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.consortium_member_id is not None:
            result['consortium_member_id'] = self.consortium_member_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('consortium_member_id') is not None:
            self.consortium_member_id = m.get('consortium_member_id')
        return self


class AddBaasChainSubnetMemberResponse(TeaModel):
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
        # 子链添加成员的结果
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


class CheckBaasChainSubnetMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 子链id
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id

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
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        return self


class CheckBaasChainSubnetMemberResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunChainSubnetCheck = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 子链的机构列表
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunChainSubnetCheck()
            self.result = temp_model.from_map(m['result'])
        return self


class DeleteBaasChainSubnetMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
        member_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 子链id
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id
        # 子链成员id
        self.member_id = member_id

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
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.member_id is not None:
            result['member_id'] = self.member_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('member_id') is not None:
            self.member_id = m.get('member_id')
        return self


class DeleteBaasChainSubnetMemberResponse(TeaModel):
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
        # 子链成员删除结果
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


class QueryBaasChainSubnetMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
        page_number: str = None,
        page_size: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 子链id
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id
        # 分页编号
        self.page_number = page_number
        # 分页大小
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
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryBaasChainSubnetMemberResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunChainSubnetCheck = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 子链机构信息
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunChainSubnetCheck()
            self.result = temp_model.from_map(m['result'])
        return self


class UpdateBaasChainSubnetNameRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
        subnet_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 子链id
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id
        # 子链名称
        self.subnet_name = subnet_name

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
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.subnet_name is not None:
            result['subnet_name'] = self.subnet_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('subnet_name') is not None:
            self.subnet_name = m.get('subnet_name')
        return self


class UpdateBaasChainSubnetNameResponse(TeaModel):
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
        # 修改子链的结果
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


class QueryBaasChainSubnetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链id
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id

    def validate(self):
        self.validate_required(self.ant_chain_id, 'ant_chain_id')
        self.validate_required(self.consortium_id, 'consortium_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        return self


class QueryBaasChainSubnetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunChainSubnetList = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 子链列表信息
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunChainSubnetList()
            self.result = temp_model.from_map(m['result'])
        return self


class ApplyBaasChainSubnetRestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 子链id
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id

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
        if self.ant_chain_id is not None:
            result['ant_chain_id'] = self.ant_chain_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        return self


class ApplyBaasChainSubnetRestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunChainRest = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 阿里云REST开通结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunChainRest()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryBaasUnionChainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        consortium_id: str = None,
        page_number: int = None,
        page_size: int = None,
        region_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟id
        self.consortium_id = consortium_id
        # 分页编号
        self.page_number = page_number
        # 分页大小
        self.page_size = page_size
        # region_id
        self.region_id = region_id

    def validate(self):
        self.validate_required(self.consortium_id, 'consortium_id')
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
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.region_id is not None:
            result['region_id'] = self.region_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        return self


class QueryBaasUnionChainResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunUnion = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 联盟内链数据
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunUnion()
            self.result = temp_model.from_map(m['result'])
        return self


class CreateBaasUnionUnionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        consortium_description: str = None,
        consortium_name: str = None,
        region_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟描述
        self.consortium_description = consortium_description
        # 联盟名称
        self.consortium_name = consortium_name
        # 区域信息
        self.region_id = region_id

    def validate(self):
        self.validate_required(self.consortium_name, 'consortium_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.consortium_description is not None:
            result['consortium_description'] = self.consortium_description
        if self.consortium_name is not None:
            result['consortium_name'] = self.consortium_name
        if self.region_id is not None:
            result['region_id'] = self.region_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('consortium_description') is not None:
            self.consortium_description = m.get('consortium_description')
        if m.get('consortium_name') is not None:
            self.consortium_name = m.get('consortium_name')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        return self


class CreateBaasUnionUnionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunUnion = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 联盟信息
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunUnion()
            self.result = temp_model.from_map(m['result'])
        return self


class DeleteBaasUnionUnionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        consortium_id: str = None,
        region_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.consortium_id = consortium_id
        # 区域id
        self.region_id = region_id

    def validate(self):
        self.validate_required(self.consortium_id, 'consortium_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.region_id is not None:
            result['region_id'] = self.region_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        return self


class DeleteBaasUnionUnionResponse(TeaModel):
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
        # 结果信息
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


class QueryBaasUnionUnionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_number: str = None,
        page_size: str = None,
        region_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分页编号
        self.page_number = page_number
        # 分页大小
        self.page_size = page_size
        # 区域信息
        self.region_id = region_id

    def validate(self):
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
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.region_id is not None:
            result['region_id'] = self.region_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        return self


class QueryBaasUnionUnionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ALiYunUnion = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 阿里云联盟查询结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
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
            result['result'] = self.result.to_map()
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
            temp_model = ALiYunUnion()
            self.result = temp_model.from_map(m['result'])
        return self


class UpdateBaasUnionUnionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        consortium_description: str = None,
        consortium_id: str = None,
        consortium_name: str = None,
        region_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟描述
        self.consortium_description = consortium_description
        # 联盟id
        self.consortium_id = consortium_id
        # 联盟名称
        self.consortium_name = consortium_name
        # 区域信息
        self.region_id = region_id

    def validate(self):
        self.validate_required(self.consortium_id, 'consortium_id')
        self.validate_required(self.consortium_name, 'consortium_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.consortium_description is not None:
            result['consortium_description'] = self.consortium_description
        if self.consortium_id is not None:
            result['consortium_id'] = self.consortium_id
        if self.consortium_name is not None:
            result['consortium_name'] = self.consortium_name
        if self.region_id is not None:
            result['region_id'] = self.region_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('consortium_description') is not None:
            self.consortium_description = m.get('consortium_description')
        if m.get('consortium_id') is not None:
            self.consortium_id = m.get('consortium_id')
        if m.get('consortium_name') is not None:
            self.consortium_name = m.get('consortium_name')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        return self


class UpdateBaasUnionUnionResponse(TeaModel):
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
        # 结果信息
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


