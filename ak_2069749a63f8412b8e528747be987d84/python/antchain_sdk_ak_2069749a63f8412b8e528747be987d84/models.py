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


class QueryBaasChainNodeAntRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        region_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ant_chain_id
        self.ant_chain_id = ant_chain_id
        # region_id
        self.region_id = region_id

    def validate(self):
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
        if m.get('ant_chain_id') is not None:
            self.ant_chain_id = m.get('ant_chain_id')
        if m.get('region_id') is not None:
            self.region_id = m.get('region_id')
        return self


class QueryBaasChainNodeAntResponse(TeaModel):
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


class AddBaasChainSubnetNodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
        node_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 子链节点
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id
        # 节点id
        self.node_id = node_id

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
        if self.node_id is not None:
            result['node_id'] = self.node_id
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
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        return self


class AddBaasChainSubnetNodeResponse(TeaModel):
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
        # 添加节点的结果
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


class CheckBaasChainSubnetNodeRequest(TeaModel):
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


class CheckBaasChainSubnetNodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ALiYunChainNodeInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 阿里云节点信息列表
        self.result = result

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
                temp_model = ALiYunChainNodeInfo()
                self.result.append(temp_model.from_map(k))
        return self


class DeleteBaasChainSubnetNodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ant_chain_id: str = None,
        consortium_id: str = None,
        node_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 子链id
        self.ant_chain_id = ant_chain_id
        # 联盟id
        self.consortium_id = consortium_id
        # 待删除的节点id
        self.node_id = node_id

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
        if self.node_id is not None:
            result['node_id'] = self.node_id
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
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        return self


class DeleteBaasChainSubnetNodeResponse(TeaModel):
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
        # 删除节点的结果
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


class QueryBaasChainSubnetNodeRequest(TeaModel):
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


class QueryBaasChainSubnetNodeResponse(TeaModel):
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
        # 子链节点信息列表
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


