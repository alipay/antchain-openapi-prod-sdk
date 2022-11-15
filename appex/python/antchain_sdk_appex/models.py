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


class NameValuePair(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 字段名称
        self.name = name
        # 字段值
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


class UserChannelDTO(TeaModel):
    def __init__(
        self,
        channel_name: str = None,
        public_acl: bool = None,
        creator_did: str = None,
        valid_time: str = None,
    ):
        # 通道名称
        self.channel_name = channel_name
        # 通道是否公开可访问
        self.public_acl = public_acl
        # 创建通道的用户did
        self.creator_did = creator_did
        # 权限到期时间
        self.valid_time = valid_time

    def validate(self):
        self.validate_required(self.channel_name, 'channel_name')
        self.validate_required(self.public_acl, 'public_acl')
        self.validate_required(self.creator_did, 'creator_did')
        self.validate_required(self.valid_time, 'valid_time')
        if self.valid_time is not None:
            self.validate_pattern(self.valid_time, 'valid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        if self.public_acl is not None:
            result['public_acl'] = self.public_acl
        if self.creator_did is not None:
            result['creator_did'] = self.creator_did
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('public_acl') is not None:
            self.public_acl = m.get('public_acl')
        if m.get('creator_did') is not None:
            self.creator_did = m.get('creator_did')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        return self


class AccountEntry(TeaModel):
    def __init__(
        self,
        account_name: str = None,
        account_id: str = None,
    ):
        # mychain的账户名字
        self.account_name = account_name
        # account_name的hash的hex string
        self.account_id = account_id

    def validate(self):
        self.validate_required(self.account_name, 'account_name')
        self.validate_required(self.account_id, 'account_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.account_id is not None:
            result['account_id'] = self.account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        return self


class AccessFilterDTO(TeaModel):
    def __init__(
        self,
        filter_name: str = None,
        path: str = None,
        target: List[str] = None,
    ):
        # 过滤器名称
        self.filter_name = filter_name
        # 要过滤的字段路径
        self.path = path
        # 路径字段的取值范围
        self.target = target

    def validate(self):
        self.validate_required(self.filter_name, 'filter_name')
        self.validate_required(self.path, 'path')
        self.validate_required(self.target, 'target')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.filter_name is not None:
            result['filter_name'] = self.filter_name
        if self.path is not None:
            result['path'] = self.path
        if self.target is not None:
            result['target'] = self.target
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('filter_name') is not None:
            self.filter_name = m.get('filter_name')
        if m.get('path') is not None:
            self.path = m.get('path')
        if m.get('target') is not None:
            self.target = m.get('target')
        return self


class ResultFilterDTO(TeaModel):
    def __init__(
        self,
        filter_name: str = None,
        path_list: List[str] = None,
    ):
        # 过滤器名称
        self.filter_name = filter_name
        # 要返回的字段路径列表
        self.path_list = path_list

    def validate(self):
        self.validate_required(self.filter_name, 'filter_name')
        self.validate_required(self.path_list, 'path_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.filter_name is not None:
            result['filter_name'] = self.filter_name
        if self.path_list is not None:
            result['path_list'] = self.path_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('filter_name') is not None:
            self.filter_name = m.get('filter_name')
        if m.get('path_list') is not None:
            self.path_list = m.get('path_list')
        return self


class ChannelDTO(TeaModel):
    def __init__(
        self,
        channel_name: str = None,
        public_acl: bool = None,
        user_did: str = None,
    ):
        # 通道名称
        self.channel_name = channel_name
        # 通道是否公开访问
        self.public_acl = public_acl
        # 通道创建账户
        self.user_did = user_did

    def validate(self):
        self.validate_required(self.channel_name, 'channel_name')
        self.validate_required(self.public_acl, 'public_acl')
        self.validate_required(self.user_did, 'user_did')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        if self.public_acl is not None:
            result['public_acl'] = self.public_acl
        if self.user_did is not None:
            result['user_did'] = self.user_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('public_acl') is not None:
            self.public_acl = m.get('public_acl')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        return self


class StatusDrive(TeaModel):
    def __init__(
        self,
        from_status: str = None,
        to_status: str = None,
        drive_hash: str = None,
        timestamp: int = None,
    ):
        # 起始状态
        self.from_status = from_status
        # 下一状态
        self.to_status = to_status
        # 驱动上链记录哈希
        self.drive_hash = drive_hash
        # 链上时间戳
        self.timestamp = timestamp

    def validate(self):
        self.validate_required(self.from_status, 'from_status')
        self.validate_required(self.to_status, 'to_status')
        self.validate_required(self.drive_hash, 'drive_hash')
        self.validate_required(self.timestamp, 'timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.from_status is not None:
            result['from_status'] = self.from_status
        if self.to_status is not None:
            result['to_status'] = self.to_status
        if self.drive_hash is not None:
            result['drive_hash'] = self.drive_hash
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('from_status') is not None:
            self.from_status = m.get('from_status')
        if m.get('to_status') is not None:
            self.to_status = m.get('to_status')
        if m.get('drive_hash') is not None:
            self.drive_hash = m.get('drive_hash')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class DataTransferObject(TeaModel):
    def __init__(
        self,
        from_: str = None,
        to: str = None,
        form_body: str = None,
        tx_hash: str = None,
        timestamp: int = None,
    ):
        # 发起方
        self.from_ = from_
        # 转交方
        self.to = to
        # 流转备注
        self.form_body = form_body
        # 链上流转记录
        self.tx_hash = tx_hash
        # 链上时间戳
        # 
        self.timestamp = timestamp

    def validate(self):
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.form_body, 'form_body')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.timestamp, 'timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.form_body is not None:
            result['form_body'] = self.form_body
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('form_body') is not None:
            self.form_body = m.get('form_body')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class NotaryRecord(TeaModel):
    def __init__(
        self,
        attributes: List[NameValuePair] = None,
        qr_code_url: str = None,
    ):
        # 存证记录
        self.attributes = attributes
        # 二维码链接
        self.qr_code_url = qr_code_url

    def validate(self):
        self.validate_required(self.attributes, 'attributes')
        if self.attributes:
            for k in self.attributes:
                if k:
                    k.validate()
        self.validate_required(self.qr_code_url, 'qr_code_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['attributes'] = []
        if self.attributes is not None:
            for k in self.attributes:
                result['attributes'].append(k.to_map() if k else None)
        if self.qr_code_url is not None:
            result['qr_code_url'] = self.qr_code_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.attributes = []
        if m.get('attributes') is not None:
            for k in m.get('attributes'):
                temp_model = NameValuePair()
                self.attributes.append(temp_model.from_map(k))
        if m.get('qr_code_url') is not None:
            self.qr_code_url = m.get('qr_code_url')
        return self


class FlowTemplate(TeaModel):
    def __init__(
        self,
        type: str = None,
        from_status: str = None,
        to_status: str = None,
        start_node: bool = None,
    ):
        # 业务单据类型
        self.type = type
        # 起始状态
        self.from_status = from_status
        # 目标状态
        self.to_status = to_status
        # 是否为状态流起始节点
        self.start_node = start_node

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.from_status, 'from_status')
        self.validate_required(self.to_status, 'to_status')
        self.validate_required(self.start_node, 'start_node')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.from_status is not None:
            result['from_status'] = self.from_status
        if self.to_status is not None:
            result['to_status'] = self.to_status
        if self.start_node is not None:
            result['start_node'] = self.start_node
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('from_status') is not None:
            self.from_status = m.get('from_status')
        if m.get('to_status') is not None:
            self.to_status = m.get('to_status')
        if m.get('start_node') is not None:
            self.start_node = m.get('start_node')
        return self


class FormIndexDTO(TeaModel):
    def __init__(
        self,
        form_id: str = None,
        form_type: str = None,
        block_height: int = None,
        tx_hash: str = None,
        tx_timestamp: str = None,
    ):
        # 业务表单ID
        self.form_id = form_id
        # 业务表单类型
        self.form_type = form_type
        # 块高
        self.block_height = block_height
        # 交易hash
        self.tx_hash = tx_hash
        # 交易时间戳
        self.tx_timestamp = tx_timestamp

    def validate(self):
        self.validate_required(self.form_id, 'form_id')
        self.validate_required(self.form_type, 'form_type')
        self.validate_required(self.block_height, 'block_height')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.tx_timestamp, 'tx_timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.form_id is not None:
            result['form_id'] = self.form_id
        if self.form_type is not None:
            result['form_type'] = self.form_type
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_timestamp is not None:
            result['tx_timestamp'] = self.tx_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('form_id') is not None:
            self.form_id = m.get('form_id')
        if m.get('form_type') is not None:
            self.form_type = m.get('form_type')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_timestamp') is not None:
            self.tx_timestamp = m.get('tx_timestamp')
        return self


class CreateMypocketChainaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        did: str = None,
        chain_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户的MyPocket账户对应的DID
        self.did = did
        # 区块链在MyPocket中的唯一ID
        self.chain_id = chain_id

    def validate(self):
        self.validate_required(self.did, 'did')
        self.validate_required(self.chain_id, 'chain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.did is not None:
            result['did'] = self.did
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        return self


class CreateMypocketChainaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        account_name: str = None,
        account_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # mychain账户名字
        self.account_name = account_name
        # account_name hash的hex字符串
        self.account_id = account_id

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
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.account_id is not None:
            result['account_id'] = self.account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        return self


class QueryMypocketChainaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        did: str = None,
        chain_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 要查询的链账户绑定的DID
        self.did = did
        # 要查询的区块链账户所在的链ID
        self.chain_id = chain_id

    def validate(self):
        self.validate_required(self.did, 'did')
        self.validate_required(self.chain_id, 'chain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.did is not None:
            result['did'] = self.did
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        return self


class QueryMypocketChainaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chain_accounts: List[AccountEntry] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 包含链账户的name和id
        self.chain_accounts = chain_accounts

    def validate(self):
        if self.chain_accounts:
            for k in self.chain_accounts:
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
        result['chain_accounts'] = []
        if self.chain_accounts is not None:
            for k in self.chain_accounts:
                result['chain_accounts'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.chain_accounts = []
        if m.get('chain_accounts') is not None:
            for k in m.get('chain_accounts'):
                temp_model = AccountEntry()
                self.chain_accounts.append(temp_model.from_map(k))
        return self


class CreateMypocketDidaccountbyalipayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alipay_uid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支付宝Uid
        self.alipay_uid = alipay_uid

    def validate(self):
        self.validate_required(self.alipay_uid, 'alipay_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        return self


class CreateMypocketDidaccountbyalipayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户的DID
        self.did = did

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
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class QueryMypocketDidaccountbyalipayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alipay_uid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支付宝Uid
        self.alipay_uid = alipay_uid

    def validate(self):
        self.validate_required(self.alipay_uid, 'alipay_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        return self


class QueryMypocketDidaccountbyalipayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 外部DApp应用通过支付宝UID查询普通用户did
        self.did = did

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
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class CreateMypocketEscrowchainaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        did: str = None,
        chain_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户did
        self.did = did
        # 链id
        self.chain_id = chain_id

    def validate(self):
        self.validate_required(self.did, 'did')
        self.validate_required(self.chain_id, 'chain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.did is not None:
            result['did'] = self.did
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        return self


class CreateMypocketEscrowchainaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        account_name: str = None,
        account_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户名称
        self.account_name = account_name
        # 链上id
        self.account_id = account_id

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
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.account_id is not None:
            result['account_id'] = self.account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        return self


class QueryMypocketEscrowchainaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        did: str = None,
        chain_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户did
        self.did = did
        # 链id
        self.chain_id = chain_id

    def validate(self):
        self.validate_required(self.did, 'did')
        self.validate_required(self.chain_id, 'chain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.did is not None:
            result['did'] = self.did
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        return self


class QueryMypocketEscrowchainaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chain_accounts: List[AccountEntry] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # DID对应的所有链上账户
        self.chain_accounts = chain_accounts

    def validate(self):
        if self.chain_accounts:
            for k in self.chain_accounts:
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
        result['chain_accounts'] = []
        if self.chain_accounts is not None:
            for k in self.chain_accounts:
                result['chain_accounts'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.chain_accounts = []
        if m.get('chain_accounts') is not None:
            for k in m.get('chain_accounts'):
                temp_model = AccountEntry()
                self.chain_accounts.append(temp_model.from_map(k))
        return self


class StartMypocketAppdidsignverifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        did_sign: str = None,
        payload: str = None,
        dapp_id: str = None,
        timestamp: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签名
        self.did_sign = did_sign
        # 签名原文
        self.payload = payload
        # 分配的dapp id，uuid v4格式
        self.dapp_id = dapp_id
        # epoch时间，毫秒
        self.timestamp = timestamp

    def validate(self):
        self.validate_required(self.did_sign, 'did_sign')
        self.validate_required(self.payload, 'payload')
        self.validate_required(self.dapp_id, 'dapp_id')
        self.validate_required(self.timestamp, 'timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.did_sign is not None:
            result['did_sign'] = self.did_sign
        if self.payload is not None:
            result['payload'] = self.payload
        if self.dapp_id is not None:
            result['dapp_id'] = self.dapp_id
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('did_sign') is not None:
            self.did_sign = m.get('did_sign')
        if m.get('payload') is not None:
            self.payload = m.get('payload')
        if m.get('dapp_id') is not None:
            self.dapp_id = m.get('dapp_id')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class StartMypocketAppdidsignverifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        is_valid: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签名是否合法
        self.is_valid = is_valid

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
        if self.is_valid is not None:
            result['is_valid'] = self.is_valid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('is_valid') is not None:
            self.is_valid = m.get('is_valid')
        return self


class StartMypocketUserdidsignverifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        did_sign: str = None,
        payload: str = None,
        user_did: str = None,
        timestamp: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签名
        self.did_sign = did_sign
        # 签名原文
        self.payload = payload
        # mychain did信息
        self.user_did = user_did
        # epoch时间，毫秒
        self.timestamp = timestamp

    def validate(self):
        self.validate_required(self.did_sign, 'did_sign')
        self.validate_required(self.payload, 'payload')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.timestamp, 'timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.did_sign is not None:
            result['did_sign'] = self.did_sign
        if self.payload is not None:
            result['payload'] = self.payload
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('did_sign') is not None:
            self.did_sign = m.get('did_sign')
        if m.get('payload') is not None:
            self.payload = m.get('payload')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class StartMypocketUserdidsignverifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        is_valid: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        # 签名是否合法
        self.is_valid = is_valid

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
        if self.is_valid is not None:
            result['is_valid'] = self.is_valid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('is_valid') is not None:
            self.is_valid = m.get('is_valid')
        return self


class QueryMypocketUserinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alipay_uid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支付宝uid
        self.alipay_uid = alipay_uid

    def validate(self):
        self.validate_required(self.alipay_uid, 'alipay_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        return self


class QueryMypocketUserinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nick_name: str = None,
        avatar: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户昵称
        self.nick_name = nick_name
        # 头像链接
        self.avatar = avatar

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
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        if self.avatar is not None:
            result['avatar'] = self.avatar
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
        if m.get('avatar') is not None:
            self.avatar = m.get('avatar')
        return self


class CreateUserDidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: int = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟标识（联盟ID）
        self.union_id = union_id
        # 参与方的业务类型，如仓库WMS, 电商平台PSP，银行BANK
        self.type = type

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class CreateUserDidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户创建的账户身份DID，用于向区块链上发交易
        self.user_did = user_did

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
        if self.user_did is not None:
            result['user_did'] = self.user_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        return self


class CreateUnionApplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 协作联盟名称
        self.name = name
        # 联盟描述
        self.description = description

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class CreateUnionApplyResponse(TeaModel):
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


class ConfirmUnionApplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        status: str = None,
        union_id: int = None,
        chain_id: str = None,
        chain_type: str = None,
        contract_name: str = None,
        contract_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 审核是否通过，SUCCESS,FAILURE,FREEZE
        self.status = status
        # 联盟id
        self.union_id = union_id
        # 区块链ID，status为SUCCESS时需要传入
        self.chain_id = chain_id
        # COMMON:普通链
        # TEE：TEE链
        # status为SUCCESS时需要填充
        self.chain_type = chain_type
        # TEE场景下要部署的链上合约名称，chain_type为TEE时需要传入
        self.contract_name = contract_name
        # 合约版本，TEE场景下需要传入
        self.contract_version = contract_version

    def validate(self):
        self.validate_required(self.status, 'status')
        self.validate_required(self.union_id, 'union_id')

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
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.chain_type is not None:
            result['chain_type'] = self.chain_type
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.contract_version is not None:
            result['contract_version'] = self.contract_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('chain_type') is not None:
            self.chain_type = m.get('chain_type')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('contract_version') is not None:
            self.contract_version = m.get('contract_version')
        return self


class ConfirmUnionApplyResponse(TeaModel):
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


class CreateUnionChannelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: int = None,
        channel_name: str = None,
        user_did: str = None,
        public_acl: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 通信通道的名称
        self.channel_name = channel_name
        # 发起创建channel的用户
        self.user_did = user_did
        # Channel中数据是否联盟内公开，true为公开可访问，支持后续更新是否公开
        self.public_acl = public_acl

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.public_acl, 'public_acl')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.public_acl is not None:
            result['public_acl'] = self.public_acl
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('public_acl') is not None:
            self.public_acl = m.get('public_acl')
        return self


class CreateUnionChannelResponse(TeaModel):
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


class ListUserChannelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: int = None,
        user_did: str = None,
        operate_type: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 发起账户
        self.user_did = user_did
        # 操作权限类型读、写，入参为WRITE, READ
        self.operate_type = operate_type
        # 页码，从1开始，不传默认查询第一页
        self.page_num = page_num
        # 页大小，不传的话默认100，页大小上限100
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.operate_type, 'operate_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.operate_type is not None:
            result['operate_type'] = self.operate_type
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
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('operate_type') is not None:
            self.operate_type = m.get('operate_type')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListUserChannelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        total_page: int = None,
        channel_list: List[UserChannelDTO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总页数
        self.total_page = total_page
        # 用户有读或写权限的非公开访问通道列表
        self.channel_list = channel_list

    def validate(self):
        if self.channel_list:
            for k in self.channel_list:
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
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['channel_list'] = []
        if self.channel_list is not None:
            for k in self.channel_list:
                result['channel_list'].append(k.to_map() if k else None)
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
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.channel_list = []
        if m.get('channel_list') is not None:
            for k in m.get('channel_list'):
                temp_model = UserChannelDTO()
                self.channel_list.append(temp_model.from_map(k))
        return self


class ListUnionPubchannelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: int = None,
        user_did: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 发起查询的账户
        self.user_did = user_did
        # 页码，不传默认为第一页
        self.page_num = page_num
        # 页大小，不传默认为100，页大小上限为100
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.user_did, 'user_did')
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
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
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
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListUnionPubchannelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        total_page: int = None,
        channel_list: List[ChannelDTO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总页数
        self.total_page = total_page
        # 公开可访问Channel列表
        self.channel_list = channel_list

    def validate(self):
        if self.channel_list:
            for k in self.channel_list:
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
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['channel_list'] = []
        if self.channel_list is not None:
            for k in self.channel_list:
                result['channel_list'].append(k.to_map() if k else None)
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
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.channel_list = []
        if m.get('channel_list') is not None:
            for k in m.get('channel_list'):
                temp_model = ChannelDTO()
                self.channel_list.append(temp_model.from_map(k))
        return self


class AuthChannelUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: int = None,
        channel_name: str = None,
        user_did: str = None,
        target_user_did: str = None,
        operate_type: str = None,
        valid_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # Channel名称
        self.channel_name = channel_name
        # 发起授权操作的账户
        self.user_did = user_did
        # 要授权的账户
        self.target_user_did = target_user_did
        # 要给用户分配读或写权限
        # READ,
        # WRITE;
        self.operate_type = operate_type
        # 授权有效期，为空时表示永久有效
        self.valid_time = valid_time

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.target_user_did, 'target_user_did')
        self.validate_required(self.operate_type, 'operate_type')
        if self.valid_time is not None:
            self.validate_pattern(self.valid_time, 'valid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.target_user_did is not None:
            result['target_user_did'] = self.target_user_did
        if self.operate_type is not None:
            result['operate_type'] = self.operate_type
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('target_user_did') is not None:
            self.target_user_did = m.get('target_user_did')
        if m.get('operate_type') is not None:
            self.operate_type = m.get('operate_type')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        return self


class AuthChannelUserResponse(TeaModel):
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


class CancelChannelUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: int = None,
        channel_name: str = None,
        user_did: str = None,
        target_user_did: str = None,
        operate_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # Channel名称
        self.channel_name = channel_name
        # 发起方账户
        self.user_did = user_did
        # 要取消授权的账户
        self.target_user_did = target_user_did
        # 要取消的操作权限类型
        self.operate_type = operate_type

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.target_user_did, 'target_user_did')
        self.validate_required(self.operate_type, 'operate_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.target_user_did is not None:
            result['target_user_did'] = self.target_user_did
        if self.operate_type is not None:
            result['operate_type'] = self.operate_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('target_user_did') is not None:
            self.target_user_did = m.get('target_user_did')
        if m.get('operate_type') is not None:
            self.operate_type = m.get('operate_type')
        return self


class CancelChannelUserResponse(TeaModel):
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


class CreateUnionFormRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_did: str = None,
        union_id: int = None,
        channel_name: str = None,
        form_id: str = None,
        form_type: str = None,
        form_body: str = None,
        graph_id: str = None,
        line_node: str = None,
        trace_id: str = None,
        parent_form_id_list: List[str] = None,
        child_form_id_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 上链账户
        self.user_did = user_did
        # 联盟ID
        self.union_id = union_id
        # Channel名称
        self.channel_name = channel_name
        # 业务单据号
        self.form_id = form_id
        # 业务单据类型
        self.form_type = form_type
        # 原生单据json字符串
        self.form_body = form_body
        # 用户自定义的图ID，开启图功能时传入
        self.graph_id = graph_id
        # 用户自定义的LineNode名称
        self.line_node = line_node
        # 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
        self.trace_id = trace_id
        # 表单的直接上游节点formId
        self.parent_form_id_list = parent_form_id_list
        # 表单的直接下游节点formId
        self.child_form_id_list = child_form_id_list

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')
        self.validate_required(self.form_id, 'form_id')
        self.validate_required(self.form_type, 'form_type')
        self.validate_required(self.form_body, 'form_body')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        if self.form_id is not None:
            result['form_id'] = self.form_id
        if self.form_type is not None:
            result['form_type'] = self.form_type
        if self.form_body is not None:
            result['form_body'] = self.form_body
        if self.graph_id is not None:
            result['graph_id'] = self.graph_id
        if self.line_node is not None:
            result['line_node'] = self.line_node
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.parent_form_id_list is not None:
            result['parent_form_id_list'] = self.parent_form_id_list
        if self.child_form_id_list is not None:
            result['child_form_id_list'] = self.child_form_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('form_id') is not None:
            self.form_id = m.get('form_id')
        if m.get('form_type') is not None:
            self.form_type = m.get('form_type')
        if m.get('form_body') is not None:
            self.form_body = m.get('form_body')
        if m.get('graph_id') is not None:
            self.graph_id = m.get('graph_id')
        if m.get('line_node') is not None:
            self.line_node = m.get('line_node')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('parent_form_id_list') is not None:
            self.parent_form_id_list = m.get('parent_form_id_list')
        if m.get('child_form_id_list') is not None:
            self.child_form_id_list = m.get('child_form_id_list')
        return self


class CreateUnionFormResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链上交易Hash
        self.tx_hash = tx_hash

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class QueryUnionFormRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_did: str = None,
        union_id: int = None,
        form_id: str = None,
        form_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发起方账户
        self.user_did = user_did
        # 联盟ID
        self.union_id = union_id
        # 业务单据ID
        self.form_id = form_id
        # 业务单据类型
        self.form_type = form_type

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.form_id, 'form_id')
        self.validate_required(self.form_type, 'form_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.form_id is not None:
            result['form_id'] = self.form_id
        if self.form_type is not None:
            result['form_type'] = self.form_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('form_id') is not None:
            self.form_id = m.get('form_id')
        if m.get('form_type') is not None:
            self.form_type = m.get('form_type')
        return self


class QueryUnionFormResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        block_height: int = None,
        tx_hash: str = None,
        tx_timestamp: str = None,
        form_id: str = None,
        form_type: str = None,
        content: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 块高
        self.block_height = block_height
        # 交易hash
        self.tx_hash = tx_hash
        # 交易时间戳
        self.tx_timestamp = tx_timestamp
        # 业务表单ID
        self.form_id = form_id
        # 业务单据类型
        self.form_type = form_type
        # 解密后原始表单内容
        self.content = content

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
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_timestamp is not None:
            result['tx_timestamp'] = self.tx_timestamp
        if self.form_id is not None:
            result['form_id'] = self.form_id
        if self.form_type is not None:
            result['form_type'] = self.form_type
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_timestamp') is not None:
            self.tx_timestamp = m.get('tx_timestamp')
        if m.get('form_id') is not None:
            self.form_id = m.get('form_id')
        if m.get('form_type') is not None:
            self.form_type = m.get('form_type')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class ListChannelUserformRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_did: str = None,
        union_id: int = None,
        channel_name: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发起方的账户
        self.user_did = user_did
        # 联盟ID
        self.union_id = union_id
        # Channel名称
        self.channel_name = channel_name
        # 页码，默认1
        self.page_num = page_num
        # 页大小，默认100
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')
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
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
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
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListChannelUserformResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        total_page: int = None,
        form_list: List[FormIndexDTO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总页数
        self.total_page = total_page
        # 表单列表
        self.form_list = form_list

    def validate(self):
        if self.form_list:
            for k in self.form_list:
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
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['form_list'] = []
        if self.form_list is not None:
            for k in self.form_list:
                result['form_list'].append(k.to_map() if k else None)
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
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.form_list = []
        if m.get('form_list') is not None:
            for k in m.get('form_list'):
                temp_model = FormIndexDTO()
                self.form_list.append(temp_model.from_map(k))
        return self


class CreateObjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_did: str = None,
        union_id: str = None,
        form_id: str = None,
        form_body: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链身份
        # 
        # 
        self.user_did = user_did
        # 联盟标识（联盟码）
        self.union_id = union_id
        # 归属权要流转的表单ID
        # 
        # 
        self.form_id = form_id
        # 物的信息
        # 
        # 
        self.form_body = form_body

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.form_id, 'form_id')
        self.validate_required(self.form_body, 'form_body')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.form_id is not None:
            result['form_id'] = self.form_id
        if self.form_body is not None:
            result['form_body'] = self.form_body
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('form_id') is not None:
            self.form_id = m.get('form_id')
        if m.get('form_body') is not None:
            self.form_body = m.get('form_body')
        return self


class CreateObjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        object_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易哈希，物的链上身份
        self.object_hash = object_hash

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
        if self.object_hash is not None:
            result['object_hash'] = self.object_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('object_hash') is not None:
            self.object_hash = m.get('object_hash')
        return self


class CreateObjectTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_did: str = None,
        union_id: str = None,
        object_hash: str = None,
        form_body: str = None,
        to_did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链身份
        self.user_did = user_did
        # 联盟标识（联盟码）
        self.union_id = union_id
        # 链上物体的身份，即物体（物权）上链接口返回的交易哈希
        self.object_hash = object_hash
        # 流转备注信息
        self.form_body = form_body
        # 数据归属权流转到的Did
        self.to_did = to_did

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.object_hash, 'object_hash')
        self.validate_required(self.to_did, 'to_did')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.object_hash is not None:
            result['object_hash'] = self.object_hash
        if self.form_body is not None:
            result['form_body'] = self.form_body
        if self.to_did is not None:
            result['to_did'] = self.to_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('object_hash') is not None:
            self.object_hash = m.get('object_hash')
        if m.get('form_body') is not None:
            self.form_body = m.get('form_body')
        if m.get('to_did') is not None:
            self.to_did = m.get('to_did')
        return self


class CreateObjectTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易Hash
        # 
        self.tx_hash = tx_hash

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class ListObjectTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_did: str = None,
        union_id: str = None,
        object_hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链身份
        self.user_did = user_did
        # 联盟标识（联盟码）
        self.union_id = union_id
        # 链上物体的身份
        self.object_hash = object_hash

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.object_hash, 'object_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.object_hash is not None:
            result['object_hash'] = self.object_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('object_hash') is not None:
            self.object_hash = m.get('object_hash')
        return self


class ListObjectTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_transfer_list: List[DataTransferObject] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据归属权流转列表
        # 
        self.data_transfer_list = data_transfer_list

    def validate(self):
        if self.data_transfer_list:
            for k in self.data_transfer_list:
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
        result['data_transfer_list'] = []
        if self.data_transfer_list is not None:
            for k in self.data_transfer_list:
                result['data_transfer_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data_transfer_list = []
        if m.get('data_transfer_list') is not None:
            for k in m.get('data_transfer_list'):
                temp_model = DataTransferObject()
                self.data_transfer_list.append(temp_model.from_map(k))
        return self


class CreateStatusflowTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        flow_name: str = None,
        flow_template: List[FlowTemplate] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 状态流模版名称
        self.flow_name = flow_name
        # 自定义流程入参DTO
        self.flow_template = flow_template

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.flow_name, 'flow_name')
        self.validate_required(self.flow_template, 'flow_template')
        if self.flow_template:
            for k in self.flow_template:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.flow_name is not None:
            result['flow_name'] = self.flow_name
        result['flow_template'] = []
        if self.flow_template is not None:
            for k in self.flow_template:
                result['flow_template'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('flow_name') is not None:
            self.flow_name = m.get('flow_name')
        self.flow_template = []
        if m.get('flow_template') is not None:
            for k in m.get('flow_template'):
                temp_model = FlowTemplate()
                self.flow_template.append(temp_model.from_map(k))
        return self


class CreateStatusflowTemplateResponse(TeaModel):
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


class DeleteStatusflowTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        flow_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 状态流模版名称
        self.flow_name = flow_name

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.flow_name, 'flow_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.flow_name is not None:
            result['flow_name'] = self.flow_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('flow_name') is not None:
            self.flow_name = m.get('flow_name')
        return self


class DeleteStatusflowTemplateResponse(TeaModel):
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


class QueryStatusflowTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        flow_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 状态流模版名称
        self.flow_name = flow_name

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.flow_name, 'flow_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.flow_name is not None:
            result['flow_name'] = self.flow_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('flow_name') is not None:
            self.flow_name = m.get('flow_name')
        return self


class QueryStatusflowTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        union_id: str = None,
        flow_name: str = None,
        list_template_process: List[FlowTemplate] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 联盟ID
        self.union_id = union_id
        # 状态流模版名称
        self.flow_name = flow_name
        # 自定义流程返回DTO
        self.list_template_process = list_template_process

    def validate(self):
        if self.list_template_process:
            for k in self.list_template_process:
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
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.flow_name is not None:
            result['flow_name'] = self.flow_name
        result['list_template_process'] = []
        if self.list_template_process is not None:
            for k in self.list_template_process:
                result['list_template_process'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('flow_name') is not None:
            self.flow_name = m.get('flow_name')
        self.list_template_process = []
        if m.get('list_template_process') is not None:
            for k in m.get('list_template_process'):
                temp_model = FlowTemplate()
                self.list_template_process.append(temp_model.from_map(k))
        return self


class StartDatastatusDriveRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_did: str = None,
        union_id: str = None,
        object_hash: str = None,
        form_type: str = None,
        form_body: str = None,
        drive_status: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链身份
        self.user_did = user_did
        # 联盟标识（联盟码）
        self.union_id = union_id
        # 链上物体的身份，即物体（物权）上链接口返回的交易哈希
        self.object_hash = object_hash
        # 进行驱动状态的环节业务类型
        self.form_type = form_type
        # 驱动状态的信息备注
        self.form_body = form_body
        # 是否驱动状态流转，前置条件配置了状态流转模版
        self.drive_status = drive_status

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.object_hash, 'object_hash')
        self.validate_required(self.form_type, 'form_type')
        self.validate_required(self.form_body, 'form_body')
        self.validate_required(self.drive_status, 'drive_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.object_hash is not None:
            result['object_hash'] = self.object_hash
        if self.form_type is not None:
            result['form_type'] = self.form_type
        if self.form_body is not None:
            result['form_body'] = self.form_body
        if self.drive_status is not None:
            result['drive_status'] = self.drive_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('object_hash') is not None:
            self.object_hash = m.get('object_hash')
        if m.get('form_type') is not None:
            self.form_type = m.get('form_type')
        if m.get('form_body') is not None:
            self.form_body = m.get('form_body')
        if m.get('drive_status') is not None:
            self.drive_status = m.get('drive_status')
        return self


class StartDatastatusDriveResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易Hash
        self.tx_hash = tx_hash

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class ListDatastatusDriveRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_did: str = None,
        union_id: str = None,
        tx_hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链身份
        # 
        self.user_did = user_did
        # 联盟标识（联盟码）
        # 
        self.union_id = union_id
        # 链上数据的身份
        # 
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class ListDatastatusDriveResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_status_drive_list: List[StatusDrive] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据状态流转
        # 
        self.data_status_drive_list = data_status_drive_list

    def validate(self):
        if self.data_status_drive_list:
            for k in self.data_status_drive_list:
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
        result['data_status_drive_list'] = []
        if self.data_status_drive_list is not None:
            for k in self.data_status_drive_list:
                result['data_status_drive_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data_status_drive_list = []
        if m.get('data_status_drive_list') is not None:
            for k in m.get('data_status_drive_list'):
                temp_model = StatusDrive()
                self.data_status_drive_list.append(temp_model.from_map(k))
        return self


class CreateAsynformFormRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_did: str = None,
        union_id: int = None,
        channel_name: str = None,
        form_id: str = None,
        form_type: str = None,
        form_body: str = None,
        graph_id: str = None,
        line_node: str = None,
        trace_id: str = None,
        parent_form_id_list: List[str] = None,
        child_form_id_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 上链账户
        self.user_did = user_did
        # 联盟ID
        # 
        self.union_id = union_id
        # Channel名称
        # 
        self.channel_name = channel_name
        # 业务单据号
        # 
        self.form_id = form_id
        # 业务单据类型
        # 
        self.form_type = form_type
        # 原生单据json字符串
        self.form_body = form_body
        # 用户自定义的图ID，开启图功能时传入
        # 
        self.graph_id = graph_id
        # 用户自定义的LineNode名称
        # 
        self.line_node = line_node
        # 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
        self.trace_id = trace_id
        # 表单的直接上游节点formId
        # 
        self.parent_form_id_list = parent_form_id_list
        # 表单的直接下游节点formId
        # 
        self.child_form_id_list = child_form_id_list

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.channel_name, 'channel_name')
        self.validate_required(self.form_id, 'form_id')
        self.validate_required(self.form_type, 'form_type')
        self.validate_required(self.form_body, 'form_body')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        if self.form_id is not None:
            result['form_id'] = self.form_id
        if self.form_type is not None:
            result['form_type'] = self.form_type
        if self.form_body is not None:
            result['form_body'] = self.form_body
        if self.graph_id is not None:
            result['graph_id'] = self.graph_id
        if self.line_node is not None:
            result['line_node'] = self.line_node
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.parent_form_id_list is not None:
            result['parent_form_id_list'] = self.parent_form_id_list
        if self.child_form_id_list is not None:
            result['child_form_id_list'] = self.child_form_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('form_id') is not None:
            self.form_id = m.get('form_id')
        if m.get('form_type') is not None:
            self.form_type = m.get('form_type')
        if m.get('form_body') is not None:
            self.form_body = m.get('form_body')
        if m.get('graph_id') is not None:
            self.graph_id = m.get('graph_id')
        if m.get('line_node') is not None:
            self.line_node = m.get('line_node')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('parent_form_id_list') is not None:
            self.parent_form_id_list = m.get('parent_form_id_list')
        if m.get('child_form_id_list') is not None:
            self.child_form_id_list = m.get('child_form_id_list')
        return self


class CreateAsynformFormResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易Hash
        # 
        self.tx_hash = tx_hash

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class PagequeryUnionFormRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: int = None,
        trace_id: str = None,
        start_time: str = None,
        end_time: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        # 
        self.union_id = union_id
        # 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
        self.trace_id = trace_id
        # 过滤时间段开始时间点
        self.start_time = start_time
        # 过滤时间段结束时间点
        self.end_time = end_time
        # 页码，默认从1开始
        self.page_num = page_num
        # 页大小，默认100，最大值限制为100
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.page_num, 'page_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
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
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryUnionFormResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        total_page: int = None,
        form_list: List[FormIndexDTO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 总页数
        self.total_page = total_page
        # 单据索引列表
        self.form_list = form_list

    def validate(self):
        if self.form_list:
            for k in self.form_list:
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
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['form_list'] = []
        if self.form_list is not None:
            for k in self.form_list:
                result['form_list'].append(k.to_map() if k else None)
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
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.form_list = []
        if m.get('form_list') is not None:
            for k in m.get('form_list'):
                temp_model = FormIndexDTO()
                self.form_list.append(temp_model.from_map(k))
        return self


class QueryAsynformStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_did: str = None,
        union_id: int = None,
        form_id: str = None,
        form_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发起方账户
        # 
        self.user_did = user_did
        # 联盟ID
        # 
        self.union_id = union_id
        # 业务单据ID
        # 
        self.form_id = form_id
        # 业务单据类型
        # 
        self.form_type = form_type

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.form_id, 'form_id')
        self.validate_required(self.form_type, 'form_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.form_id is not None:
            result['form_id'] = self.form_id
        if self.form_type is not None:
            result['form_type'] = self.form_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('form_id') is not None:
            self.form_id = m.get('form_id')
        if m.get('form_type') is not None:
            self.form_type = m.get('form_type')
        return self


class QueryAsynformStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        block_height: int = None,
        tx_hash: str = None,
        create_time: str = None,
        status: str = None,
        tx_timestamp: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 块高
        # 
        self.block_height = block_height
        # 交易hash
        # 
        self.tx_hash = tx_hash
        # 上传时间
        # 
        self.create_time = create_time
        # SUCCESS:上链成功, FAILURE:上链失败，UPLOADING:上链中
        self.status = status
        # 交易时间戳，成功上链时间
        # 
        self.tx_timestamp = tx_timestamp

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
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.status is not None:
            result['status'] = self.status
        if self.tx_timestamp is not None:
            result['tx_timestamp'] = self.tx_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tx_timestamp') is not None:
            self.tx_timestamp = m.get('tx_timestamp')
        return self


class QuerySolutionFastnotaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_did: str = None,
        biz_index_key_value: str = None,
        schema_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用did
        # 
        self.app_did = app_did
        # 索引字段的值
        # 
        self.biz_index_key_value = biz_index_key_value
        # 名称
        self.schema_name = schema_name

    def validate(self):
        self.validate_required(self.app_did, 'app_did')
        self.validate_required(self.biz_index_key_value, 'biz_index_key_value')
        self.validate_required(self.schema_name, 'schema_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_did is not None:
            result['app_did'] = self.app_did
        if self.biz_index_key_value is not None:
            result['biz_index_key_value'] = self.biz_index_key_value
        if self.schema_name is not None:
            result['schema_name'] = self.schema_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_did') is not None:
            self.app_did = m.get('app_did')
        if m.get('biz_index_key_value') is not None:
            self.biz_index_key_value = m.get('biz_index_key_value')
        if m.get('schema_name') is not None:
            self.schema_name = m.get('schema_name')
        return self


class QuerySolutionFastnotaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        notary_record: NotaryRecord = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证记录
        self.notary_record = notary_record

    def validate(self):
        if self.notary_record:
            self.notary_record.validate()

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
        if self.notary_record is not None:
            result['notary_record'] = self.notary_record.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('notary_record') is not None:
            temp_model = NotaryRecord()
            self.notary_record = temp_model.from_map(m['notary_record'])
        return self


class SaveSolutionFastnotaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_did: str = None,
        schema_name: str = None,
        attributes: List[NameValuePair] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用did
        # 
        self.app_did = app_did
        # 表名
        self.schema_name = schema_name
        # 存证数据
        self.attributes = attributes

    def validate(self):
        self.validate_required(self.app_did, 'app_did')
        self.validate_required(self.schema_name, 'schema_name')
        self.validate_required(self.attributes, 'attributes')
        if self.attributes:
            for k in self.attributes:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_did is not None:
            result['app_did'] = self.app_did
        if self.schema_name is not None:
            result['schema_name'] = self.schema_name
        result['attributes'] = []
        if self.attributes is not None:
            for k in self.attributes:
                result['attributes'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_did') is not None:
            self.app_did = m.get('app_did')
        if m.get('schema_name') is not None:
            self.schema_name = m.get('schema_name')
        self.attributes = []
        if m.get('attributes') is not None:
            for k in m.get('attributes'):
                temp_model = NameValuePair()
                self.attributes.append(temp_model.from_map(k))
        return self


class SaveSolutionFastnotaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易哈希
        # 
        self.tx_hash = tx_hash

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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class InitSolutionFilenotaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用did
        self.app_did = app_did

    def validate(self):
        self.validate_required(self.app_did, 'app_did')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_did is not None:
            result['app_did'] = self.app_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_did') is not None:
            self.app_did = m.get('app_did')
        return self


class InitSolutionFilenotaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_notary_id: str = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件存证id
        self.file_notary_id = file_notary_id
        # 上传url
        self.url = url

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
        if self.file_notary_id is not None:
            result['file_notary_id'] = self.file_notary_id
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_notary_id') is not None:
            self.file_notary_id = m.get('file_notary_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class SyncSolutionFilenotaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_did: str = None,
        file_notary_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用did
        # 
        self.app_did = app_did
        # 文件存证id
        # 
        self.file_notary_id = file_notary_id

    def validate(self):
        self.validate_required(self.app_did, 'app_did')
        self.validate_required(self.file_notary_id, 'file_notary_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_did is not None:
            result['app_did'] = self.app_did
        if self.file_notary_id is not None:
            result['file_notary_id'] = self.file_notary_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_did') is not None:
            self.app_did = m.get('app_did')
        if m.get('file_notary_id') is not None:
            self.file_notary_id = m.get('file_notary_id')
        return self


class SyncSolutionFilenotaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accepted: bool = None,
        denied_reason: str = None,
        file_notary_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否被接收
        # 
        self.accepted = accepted
        # 拒绝原因
        # 
        self.denied_reason = denied_reason
        # 文件存证id
        # 
        self.file_notary_id = file_notary_id

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
        if self.accepted is not None:
            result['accepted'] = self.accepted
        if self.denied_reason is not None:
            result['denied_reason'] = self.denied_reason
        if self.file_notary_id is not None:
            result['file_notary_id'] = self.file_notary_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('accepted') is not None:
            self.accepted = m.get('accepted')
        if m.get('denied_reason') is not None:
            self.denied_reason = m.get('denied_reason')
        if m.get('file_notary_id') is not None:
            self.file_notary_id = m.get('file_notary_id')
        return self


class GetSolutionFilenotarystatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_did: str = None,
        file_notary_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用did
        # 
        self.app_did = app_did
        # 文件存证id
        # 
        self.file_notary_id = file_notary_id

    def validate(self):
        self.validate_required(self.app_did, 'app_did')
        self.validate_required(self.file_notary_id, 'file_notary_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_did is not None:
            result['app_did'] = self.app_did
        if self.file_notary_id is not None:
            result['file_notary_id'] = self.file_notary_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_did') is not None:
            self.app_did = m.get('app_did')
        if m.get('file_notary_id') is not None:
            self.file_notary_id = m.get('file_notary_id')
        return self


class GetSolutionFilenotarystatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accepted: bool = None,
        denied_reason: str = None,
        file_notary_id: str = None,
        finished: bool = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证是否接受
        # 
        self.accepted = accepted
        # 存证拒绝原因
        # 
        self.denied_reason = denied_reason
        # 文件存证id
        # 
        self.file_notary_id = file_notary_id
        # 存证是否完成
        self.finished = finished
        # 存证哈希，存证未完成时为空
        # 
        self.tx_hash = tx_hash

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
        if self.accepted is not None:
            result['accepted'] = self.accepted
        if self.denied_reason is not None:
            result['denied_reason'] = self.denied_reason
        if self.file_notary_id is not None:
            result['file_notary_id'] = self.file_notary_id
        if self.finished is not None:
            result['finished'] = self.finished
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('accepted') is not None:
            self.accepted = m.get('accepted')
        if m.get('denied_reason') is not None:
            self.denied_reason = m.get('denied_reason')
        if m.get('file_notary_id') is not None:
            self.file_notary_id = m.get('file_notary_id')
        if m.get('finished') is not None:
            self.finished = m.get('finished')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class QuerySolutionFilenotaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_did: str = None,
        tx_hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用did
        # 
        self.app_did = app_did
        # 存证哈希
        # 
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.app_did, 'app_did')
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_did is not None:
            result['app_did'] = self.app_did
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_did') is not None:
            self.app_did = m.get('app_did')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class QuerySolutionFilenotaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_content_hash: str = None,
        qr_code_url: str = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件sha256哈希
        # 
        self.file_content_hash = file_content_hash
        # 小程序二维码对应的url
        # 
        self.qr_code_url = qr_code_url
        # 下载url
        self.url = url

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
        if self.file_content_hash is not None:
            result['file_content_hash'] = self.file_content_hash
        if self.qr_code_url is not None:
            result['qr_code_url'] = self.qr_code_url
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_content_hash') is not None:
            self.file_content_hash = m.get('file_content_hash')
        if m.get('qr_code_url') is not None:
            self.qr_code_url = m.get('qr_code_url')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class ExecContractServiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_did: str = None,
        contract_method: str = None,
        contract_name: str = None,
        exec_type: int = None,
        request_body: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用did
        self.app_did = app_did
        # 合约方法名
        self.contract_method = contract_method
        # 合约名称，当一个应用有多个合约时需要传入
        self.contract_name = contract_name
        # 1.同步交易，2.异步交易，3.Local
        # 如果不理解以上交易方式之间的区别请不要传入该参数，默认为同步交易
        self.exec_type = exec_type
        # 合约入参（格式为json）
        self.request_body = request_body

    def validate(self):
        self.validate_required(self.app_did, 'app_did')
        if self.app_did is not None:
            self.validate_max_length(self.app_did, 'app_did', 128)
        self.validate_required(self.contract_method, 'contract_method')
        if self.contract_method is not None:
            self.validate_max_length(self.contract_method, 'contract_method', 128)
        if self.contract_name is not None:
            self.validate_max_length(self.contract_name, 'contract_name', 128)
        self.validate_required(self.request_body, 'request_body')
        if self.request_body is not None:
            self.validate_max_length(self.request_body, 'request_body', 1024)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_did is not None:
            result['app_did'] = self.app_did
        if self.contract_method is not None:
            result['contract_method'] = self.contract_method
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.exec_type is not None:
            result['exec_type'] = self.exec_type
        if self.request_body is not None:
            result['request_body'] = self.request_body
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_did') is not None:
            self.app_did = m.get('app_did')
        if m.get('contract_method') is not None:
            self.contract_method = m.get('contract_method')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('exec_type') is not None:
            self.exec_type = m.get('exec_type')
        if m.get('request_body') is not None:
            self.request_body = m.get('request_body')
        return self


class ExecContractServiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_body: str = None,
        tx_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约执行结果
        self.response_body = response_body
        # 交易hash
        self.tx_hash = tx_hash

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
        if self.response_body is not None:
            result['response_body'] = self.response_body
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_body') is not None:
            self.response_body = m.get('response_body')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class InitSolutionBmsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        account: str = None,
        contract_id: str = None,
        contract_name: str = None,
        contract_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 账户名称
        self.account = account
        # 合约ID
        self.contract_id = contract_id
        # 合约名称
        self.contract_name = contract_name
        # 合约临时url
        self.contract_url = contract_url

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.account, 'account')
        self.validate_required(self.contract_id, 'contract_id')
        self.validate_required(self.contract_name, 'contract_name')
        self.validate_required(self.contract_url, 'contract_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.account is not None:
            result['account'] = self.account
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.contract_url is not None:
            result['contract_url'] = self.contract_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('contract_url') is not None:
            self.contract_url = m.get('contract_url')
        return self


class InitSolutionBmsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        app_did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 应用ID
        self.app_did = app_did

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
        if self.app_did is not None:
            result['app_did'] = self.app_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('app_did') is not None:
            self.app_did = m.get('app_did')
        return self


class QuerySolutionBmsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        contract_id: str = None,
        contract_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 合约ID
        self.contract_id = contract_id
        # 合约名称
        self.contract_name = contract_name

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.contract_id, 'contract_id')
        self.validate_required(self.contract_name, 'contract_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        return self


class QuerySolutionBmsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        temp_contract_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约oss存储url
        self.temp_contract_url = temp_contract_url

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
        if self.temp_contract_url is not None:
            result['temp_contract_url'] = self.temp_contract_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('temp_contract_url') is not None:
            self.temp_contract_url = m.get('temp_contract_url')
        return self


class DeploySolutionContractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bizid: str = None,
        operator: str = None,
        contract_name: str = None,
        commit_id: str = None,
        branch: str = None,
        git_repo: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.bizid = bizid
        # 链操作者信息
        self.operator = operator
        # 合约名称
        self.contract_name = contract_name
        # 提交记录ID
        self.commit_id = commit_id
        # 当前分支
        self.branch = branch
        # 合约仓库路径
        self.git_repo = git_repo

    def validate(self):
        self.validate_required(self.bizid, 'bizid')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.contract_name, 'contract_name')
        self.validate_required(self.commit_id, 'commit_id')
        self.validate_required(self.branch, 'branch')
        self.validate_required(self.git_repo, 'git_repo')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bizid is not None:
            result['bizid'] = self.bizid
        if self.operator is not None:
            result['operator'] = self.operator
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.commit_id is not None:
            result['commit_id'] = self.commit_id
        if self.branch is not None:
            result['branch'] = self.branch
        if self.git_repo is not None:
            result['git_repo'] = self.git_repo
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bizid') is not None:
            self.bizid = m.get('bizid')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('commit_id') is not None:
            self.commit_id = m.get('commit_id')
        if m.get('branch') is not None:
            self.branch = m.get('branch')
        if m.get('git_repo') is not None:
            self.git_repo = m.get('git_repo')
        return self


class DeploySolutionContractResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否部署成功
        self.success = success

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
        return self


