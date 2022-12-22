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


class UploaderInfo(TeaModel):
    def __init__(
        self,
        cert_hash: str = None,
        uploader: str = None,
        upload_time: int = None,
        longitude: str = None,
        latitude: str = None,
    ):
        # 上传者证书hash
        self.cert_hash = cert_hash
        # 上传者身份证明
        self.uploader = uploader
        # 上传时间
        self.upload_time = upload_time
        # 经度
        self.longitude = longitude
        # 纬度
        self.latitude = latitude

    def validate(self):
        self.validate_required(self.cert_hash, 'cert_hash')
        self.validate_required(self.uploader, 'uploader')
        self.validate_required(self.upload_time, 'upload_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cert_hash is not None:
            result['cert_hash'] = self.cert_hash
        if self.uploader is not None:
            result['uploader'] = self.uploader
        if self.upload_time is not None:
            result['upload_time'] = self.upload_time
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.latitude is not None:
            result['latitude'] = self.latitude
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cert_hash') is not None:
            self.cert_hash = m.get('cert_hash')
        if m.get('uploader') is not None:
            self.uploader = m.get('uploader')
        if m.get('upload_time') is not None:
            self.upload_time = m.get('upload_time')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        return self


class BlockInfo(TeaModel):
    def __init__(
        self,
        block_height: int = None,
        timestamp: int = None,
        tx_hash: str = None,
    ):
        # 块高度
        self.block_height = block_height
        # 成块时间戳
        self.timestamp = timestamp
        # 交易摘要
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.block_height, 'block_height')
        self.validate_required(self.timestamp, 'timestamp')
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class PhaseItem(TeaModel):
    def __init__(
        self,
        title: str = None,
        type: str = None,
        value: str = None,
        ext_info: str = None,
    ):
        # 标题
        self.title = title
        # 类型
        # TEXT: 文本，
        # IMAGE： 图片,
        # VIDEO:  视频,
        # LONGTEXT: 长文本,
        # MAP: 地图,
        # BANNER: 广告位,
        # PDF: pdf文件,
        # CERTIFICATE: 认证信息
        # NESTED： 嵌套类型
        # CUSTOMIZE： 自定义类型
        self.type = type
        # 值
        self.value = value
        # 扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.type, 'type')
        self.validate_required(self.value, 'value')
        self.validate_required(self.ext_info, 'ext_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.value is not None:
            result['value'] = self.value
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class ScanUserInfo(TeaModel):
    def __init__(
        self,
        nick: str = None,
        user_id: str = None,
        longitude: int = None,
        latitude: int = None,
        src_type: str = None,
        scan_time: int = None,
    ):
        # 用户昵称
        self.nick = nick
        # 用户ID
        self.user_id = user_id
        # 经度
        self.longitude = longitude
        # 纬度
        self.latitude = latitude
        # 用户来源
        self.src_type = src_type
        # 扫码时间
        self.scan_time = scan_time

    def validate(self):
        self.validate_required(self.nick, 'nick')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.longitude, 'longitude')
        self.validate_required(self.latitude, 'latitude')
        self.validate_required(self.src_type, 'src_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.nick is not None:
            result['nick'] = self.nick
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.src_type is not None:
            result['src_type'] = self.src_type
        if self.scan_time is not None:
            result['scan_time'] = self.scan_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('nick') is not None:
            self.nick = m.get('nick')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('src_type') is not None:
            self.src_type = m.get('src_type')
        if m.get('scan_time') is not None:
            self.scan_time = m.get('scan_time')
        return self


class CodeRegisterInfo(TeaModel):
    def __init__(
        self,
        code: str = None,
        status: str = None,
        relation_codes: List[str] = None,
        biz_labels: List[str] = None,
        content: str = None,
        tx_hash: str = None,
        unique_id: str = None,
    ):
        # 溯源码，代表该账户的唯一资源标识
        self.code = code
        # 状态,客户自定义状态，用于过滤查询使用
        self.status = status
        # 关联溯源码列表，可以通过接口查询关联溯源码绑定的信息
        self.relation_codes = relation_codes
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
        self.biz_labels = biz_labels
        # 注册内容
        self.content = content
        # 区块链上交易哈希
        self.tx_hash = tx_hash
        # 注册溯源码记录唯一标识
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.status is not None:
            result['status'] = self.status
        if self.relation_codes is not None:
            result['relation_codes'] = self.relation_codes
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.content is not None:
            result['content'] = self.content
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('relation_codes') is not None:
            self.relation_codes = m.get('relation_codes')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class CodeRelationInfo(TeaModel):
    def __init__(
        self,
        code: str = None,
        status: str = None,
        content: str = None,
        tx_hash: str = None,
        biz_labels: List[str] = None,
        unique_id: str = None,
    ):
        # 溯源码，代表该账户的唯一资源标识
        self.code = code
        # 状态,客户自定义状态，用于过滤查询使用，仅支持字母数字构成
        # 
        self.status = status
        # 关联内容
        self.content = content
        # 区块链上交易哈希
        self.tx_hash = tx_hash
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
        self.biz_labels = biz_labels
        # 溯源码信息关联记录唯一标识
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.status is not None:
            result['status'] = self.status
        if self.content is not None:
            result['content'] = self.content
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class BlockChainTransactionInfo(TeaModel):
    def __init__(
        self,
        tx_hash: str = None,
        biz_id: str = None,
        gas_used: str = None,
        parent_hash: str = None,
        receipt_root: str = None,
        state_root: str = None,
        transaction_root: str = None,
        version: str = None,
        number: int = None,
        timestamp: int = None,
    ):
        # 区块链上交易哈希
        self.tx_hash = tx_hash
        # 区块链标识
        self.biz_id = biz_id
        # 消耗gas数量
        self.gas_used = gas_used
        # 父区块哈希
        self.parent_hash = parent_hash
        # 收据根
        self.receipt_root = receipt_root
        # 状态树根
        self.state_root = state_root
        # 交易根
        self.transaction_root = transaction_root
        # 版本
        self.version = version
        # 区块高度
        self.number = number
        # 成块时间
        self.timestamp = timestamp

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.gas_used, 'gas_used')
        self.validate_required(self.parent_hash, 'parent_hash')
        self.validate_required(self.receipt_root, 'receipt_root')
        self.validate_required(self.state_root, 'state_root')
        self.validate_required(self.transaction_root, 'transaction_root')
        self.validate_required(self.version, 'version')
        self.validate_required(self.number, 'number')
        self.validate_required(self.timestamp, 'timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.gas_used is not None:
            result['gas_used'] = self.gas_used
        if self.parent_hash is not None:
            result['parent_hash'] = self.parent_hash
        if self.receipt_root is not None:
            result['receipt_root'] = self.receipt_root
        if self.state_root is not None:
            result['state_root'] = self.state_root
        if self.transaction_root is not None:
            result['transaction_root'] = self.transaction_root
        if self.version is not None:
            result['version'] = self.version
        if self.number is not None:
            result['number'] = self.number
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('gas_used') is not None:
            self.gas_used = m.get('gas_used')
        if m.get('parent_hash') is not None:
            self.parent_hash = m.get('parent_hash')
        if m.get('receipt_root') is not None:
            self.receipt_root = m.get('receipt_root')
        if m.get('state_root') is not None:
            self.state_root = m.get('state_root')
        if m.get('transaction_root') is not None:
            self.transaction_root = m.get('transaction_root')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('number') is not None:
            self.number = m.get('number')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class ScanHeadInfo(TeaModel):
    def __init__(
        self,
        scan_time: int = None,
        scan_count: int = None,
        scan_addr: str = None,
    ):
        # 扫描时间
        self.scan_time = scan_time
        # 扫码次数
        self.scan_count = scan_count
        # 扫码地址
        self.scan_addr = scan_addr

    def validate(self):
        self.validate_required(self.scan_time, 'scan_time')
        self.validate_required(self.scan_count, 'scan_count')
        self.validate_required(self.scan_addr, 'scan_addr')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scan_time is not None:
            result['scan_time'] = self.scan_time
        if self.scan_count is not None:
            result['scan_count'] = self.scan_count
        if self.scan_addr is not None:
            result['scan_addr'] = self.scan_addr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scan_time') is not None:
            self.scan_time = m.get('scan_time')
        if m.get('scan_count') is not None:
            self.scan_count = m.get('scan_count')
        if m.get('scan_addr') is not None:
            self.scan_addr = m.get('scan_addr')
        return self


class PhaseInfo(TeaModel):
    def __init__(
        self,
        name: str = None,
        items: List[PhaseItem] = None,
        upload_info: UploaderInfo = None,
        block_info: BlockInfo = None,
    ):
        # 环节名称
        self.name = name
        # 环节项
        self.items = items
        # 上传者信息
        self.upload_info = upload_info
        # 区块信息
        self.block_info = block_info

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.items, 'items')
        if self.items:
            for k in self.items:
                if k:
                    k.validate()
        self.validate_required(self.upload_info, 'upload_info')
        if self.upload_info:
            self.upload_info.validate()
        self.validate_required(self.block_info, 'block_info')
        if self.block_info:
            self.block_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        result['items'] = []
        if self.items is not None:
            for k in self.items:
                result['items'].append(k.to_map() if k else None)
        if self.upload_info is not None:
            result['upload_info'] = self.upload_info.to_map()
        if self.block_info is not None:
            result['block_info'] = self.block_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        self.items = []
        if m.get('items') is not None:
            for k in m.get('items'):
                temp_model = PhaseItem()
                self.items.append(temp_model.from_map(k))
        if m.get('upload_info') is not None:
            temp_model = UploaderInfo()
            self.upload_info = temp_model.from_map(m['upload_info'])
        if m.get('block_info') is not None:
            temp_model = BlockInfo()
            self.block_info = temp_model.from_map(m['block_info'])
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


class RecognizeAntiQrcodeacRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_type: str = None,
        image_str: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 上传图片使用的设备类型,用于更精准的识别,非必填。
        self.device_type = device_type
        # Base64格式的图片数据
        self.image_str = image_str
        # 图片文件id，通过小程序拍照，上传的二维码图片信息。
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

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
        if self.device_type is not None:
            result['device_type'] = self.device_type
        if self.image_str is not None:
            result['image_str'] = self.image_str
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        if m.get('image_str') is not None:
            self.image_str = m.get('image_str')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class RecognizeAntiQrcodeacResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        detect_state: str = None,
        detect_desc: str = None,
        encrypt_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 解码结果,0:失败,1:成功，如果解码成功，可忽略detectState字段返回结果
        self.code = code
        # 识别状态
        self.detect_state = detect_state
        # 识别状态描述
        self.detect_desc = detect_desc
        # 加密数据
        self.encrypt_data = encrypt_data

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
        if self.detect_state is not None:
            result['detect_state'] = self.detect_state
        if self.detect_desc is not None:
            result['detect_desc'] = self.detect_desc
        if self.encrypt_data is not None:
            result['encrypt_data'] = self.encrypt_data
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
        if m.get('detect_state') is not None:
            self.detect_state = m.get('detect_state')
        if m.get('detect_desc') is not None:
            self.detect_desc = m.get('detect_desc')
        if m.get('encrypt_data') is not None:
            self.encrypt_data = m.get('encrypt_data')
        return self


class InitAntiImagesyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        code_type: str = None,
        batch_no: str = None,
        total: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 防伪码类型标识,由蚂蚁侧分配
        self.code_type = code_type
        # 防伪码批次号
        self.batch_no = batch_no
        # 批次下要上传的防伪码总数
        self.total = total

    def validate(self):
        self.validate_required(self.code_type, 'code_type')
        self.validate_required(self.batch_no, 'batch_no')
        self.validate_required(self.total, 'total')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.code_type is not None:
            result['code_type'] = self.code_type
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('code_type') is not None:
            self.code_type = m.get('code_type')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class InitAntiImagesyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        batch_no: str = None,
        total: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批次号
        self.batch_no = batch_no
        # 批次下的访问码总数
        self.total = total

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
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
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
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class UploadAntiImagesyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        code_type: str = None,
        code: str = None,
        batch_no: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 防伪码类型
        self.code_type = code_type
        # 防伪码码值
        self.code = code
        # 批次号码
        self.batch_no = batch_no
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.code_type, 'code_type')
        self.validate_required(self.code, 'code')
        self.validate_required(self.batch_no, 'batch_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.code_type is not None:
            result['code_type'] = self.code_type
        if self.code is not None:
            result['code'] = self.code
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('code_type') is not None:
            self.code_type = m.get('code_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadAntiImagesyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 防伪码码值
        self.code = code

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
        return self


class FinishAntiImagesyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_no: str = None,
        code_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批次号
        self.batch_no = batch_no
        # 防伪码类型
        self.code_type = code_type

    def validate(self):
        self.validate_required(self.batch_no, 'batch_no')
        self.validate_required(self.code_type, 'code_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        if self.code_type is not None:
            result['code_type'] = self.code_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('code_type') is not None:
            self.code_type = m.get('code_type')
        return self


class FinishAntiImagesyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        batch_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批次号
        self.batch_no = batch_no

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
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        return self


class CreateAntiQrcodeimageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        qr_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 要生成图片二维码的字符串信息
        self.qr_code = qr_code

    def validate(self):
        self.validate_required(self.qr_code, 'qr_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.qr_code is not None:
            result['qr_code'] = self.qr_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('qr_code') is not None:
            self.qr_code = m.get('qr_code')
        return self


class CreateAntiQrcodeimageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        qrcode_url: str = None,
        generate_code: str = None,
        generate_message: str = None,
        unable_generate_solution: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的二维码图片的oss地址
        self.qrcode_url = qrcode_url
        # 生成结果码，用于异常场景下细化错误信息
        self.generate_code = generate_code
        # 生成结果码含义,用于异常场景下细化错误信息
        self.generate_message = generate_message
        # 生成失败时的解决方案,用于异常场景下细化错误信息
        self.unable_generate_solution = unable_generate_solution

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
        if self.qrcode_url is not None:
            result['qrcode_url'] = self.qrcode_url
        if self.generate_code is not None:
            result['generate_code'] = self.generate_code
        if self.generate_message is not None:
            result['generate_message'] = self.generate_message
        if self.unable_generate_solution is not None:
            result['unable_generate_solution'] = self.unable_generate_solution
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('qrcode_url') is not None:
            self.qrcode_url = m.get('qrcode_url')
        if m.get('generate_code') is not None:
            self.generate_code = m.get('generate_code')
        if m.get('generate_message') is not None:
            self.generate_message = m.get('generate_message')
        if m.get('unable_generate_solution') is not None:
            self.unable_generate_solution = m.get('unable_generate_solution')
        return self


class CreateCodeRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        status: str = None,
        biz_labels: List[str] = None,
        content: str = None,
        relation_codes: List[str] = None,
        recursion_type: str = None,
        up_chain_flag: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识
        self.code = code
        # 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
        self.status = status
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        self.biz_labels = biz_labels
        # 注册内容
        self.content = content
        # 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。
        # 可以通过接口查询关联溯源码绑定的信息。
        self.relation_codes = relation_codes
        # 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下，
        # NO_CHECK:  不做递归检查;
        # TREE_CHECK: 树结构检查;
        # DAG_CHECK: 有向无环图检查;
        self.recursion_type = recursion_type
        # 是否上链，默认true。
        # 为false时，仅做DB数据保存不上链。
        # 若content数据大小超过要求限制，仅会保存content的hash值上链
        self.up_chain_flag = up_chain_flag

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.status, 'status')
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 32)
        if self.recursion_type is not None:
            self.validate_max_length(self.recursion_type, 'recursion_type', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.status is not None:
            result['status'] = self.status
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.content is not None:
            result['content'] = self.content
        if self.relation_codes is not None:
            result['relation_codes'] = self.relation_codes
        if self.recursion_type is not None:
            result['recursion_type'] = self.recursion_type
        if self.up_chain_flag is not None:
            result['up_chain_flag'] = self.up_chain_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('relation_codes') is not None:
            self.relation_codes = m.get('relation_codes')
        if m.get('recursion_type') is not None:
            self.recursion_type = m.get('recursion_type')
        if m.get('up_chain_flag') is not None:
            self.up_chain_flag = m.get('up_chain_flag')
        return self


class CreateCodeRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        unique_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链上交易哈希
        self.tx_hash = tx_hash
        # 注册记录唯一标识
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class DeleteCodeRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识
        self.code = code
        # 注册记录唯一标识
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.unique_id, 'unique_id')
        if self.unique_id is not None:
            self.validate_max_length(self.unique_id, 'unique_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class DeleteCodeRegistrationResponse(TeaModel):
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


class CreateCodeRelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        status: str = None,
        biz_labels: List[str] = None,
        up_chain_flag: bool = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识
        self.code = code
        # 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
        self.status = status
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        self.biz_labels = biz_labels
        # 是否上链，默认true。 为false时，仅做DB数据保存不上链。
        # 若content数据大小超过要求限制，仅会保存content的hash值上链
        self.up_chain_flag = up_chain_flag
        # 关联内容
        # 
        self.content = content

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.status, 'status')
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.status is not None:
            result['status'] = self.status
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.up_chain_flag is not None:
            result['up_chain_flag'] = self.up_chain_flag
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('up_chain_flag') is not None:
            self.up_chain_flag = m.get('up_chain_flag')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class CreateCodeRelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        unique_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链上交易哈希
        self.tx_hash = tx_hash
        # 绑定信息记录唯一标识
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class DeleteCodeRelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识
        self.code = code
        # 关联信息记录唯一标识
        # 
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.unique_id, 'unique_id')
        if self.unique_id is not None:
            self.validate_max_length(self.unique_id, 'unique_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class DeleteCodeRelationResponse(TeaModel):
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


class QueryCodeCombineRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        page_num: int = None,
        page_size: int = None,
        biz_labels: List[str] = None,
        status: str = None,
        recursion_flag: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识
        self.code = code
        # 页码,当且仅当pageNum=1时返回溯源码最新注册信息
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        self.biz_labels = biz_labels
        # 状态,客户自定义状态，用于过滤查询使用，只能由字符+数字构成，多个可以用"|"分隔
        self.status = status
        # 是否递归查询，默认false, 最多递归5层
        # 
        self.recursion_flag = recursion_flag

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.page_num, 'page_num')
        if self.page_num is not None:
            self.validate_minimum(self.page_num, 'page_num', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 200)
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 256)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.status is not None:
            result['status'] = self.status
        if self.recursion_flag is not None:
            result['recursion_flag'] = self.recursion_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('recursion_flag') is not None:
            self.recursion_flag = m.get('recursion_flag')
        return self


class QueryCodeCombineResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        register_info: CodeRegisterInfo = None,
        relation_infos: List[CodeRelationInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总数据量
        self.total = total
        # 注册码信息
        self.register_info = register_info
        # 关联信息
        self.relation_infos = relation_infos

    def validate(self):
        if self.register_info:
            self.register_info.validate()
        if self.relation_infos:
            for k in self.relation_infos:
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
        if self.total is not None:
            result['total'] = self.total
        if self.register_info is not None:
            result['register_info'] = self.register_info.to_map()
        result['relation_infos'] = []
        if self.relation_infos is not None:
            for k in self.relation_infos:
                result['relation_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('register_info') is not None:
            temp_model = CodeRegisterInfo()
            self.register_info = temp_model.from_map(m['register_info'])
        self.relation_infos = []
        if m.get('relation_infos') is not None:
            for k in m.get('relation_infos'):
                temp_model = CodeRelationInfo()
                self.relation_infos.append(temp_model.from_map(k))
        return self


class QueryCodeRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        page_num: int = None,
        page_size: int = None,
        biz_labels: List[str] = None,
        unique_id: str = None,
        status: str = None,
        sort_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        # 
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识
        self.code = code
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        self.biz_labels = biz_labels
        # 注册记录唯一标识
        self.unique_id = unique_id
        # 状态,客户自定义状态，用于过滤查询使用。
        # 状态信息只能由字母+数字构成，多个状态可以用"|"分隔
        self.status = status
        # 仅能取如下值范围：
        # 1. ASC     按注册时间升序
        # 2. DESC   按注册时间降序
        # 默认降序
        self.sort_type = sort_type

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.page_num, 'page_num')
        if self.page_num is not None:
            self.validate_minimum(self.page_num, 'page_num', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 200)
        if self.unique_id is not None:
            self.validate_max_length(self.unique_id, 'unique_id', 64)
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 256)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.status is not None:
            result['status'] = self.status
        if self.sort_type is not None:
            result['sort_type'] = self.sort_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('sort_type') is not None:
            self.sort_type = m.get('sort_type')
        return self


class QueryCodeRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        data: List[CodeRegisterInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总数据量
        self.total = total
        # 溯源码历史注册信息
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
        if self.total is not None:
            result['total'] = self.total
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
        if m.get('total') is not None:
            self.total = m.get('total')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = CodeRegisterInfo()
                self.data.append(temp_model.from_map(k))
        return self


class QueryCodeRelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        page_num: int = None,
        page_size: int = None,
        biz_labels: List[str] = None,
        unique_id: str = None,
        status: str = None,
        sort_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识
        self.code = code
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        self.biz_labels = biz_labels
        # 绑定信息记录唯一标识
        self.unique_id = unique_id
        # 状态,客户自定义状态，用于过滤查询使用，只能由字符+数字构成，多个可以用"|"分隔
        self.status = status
        # 仅能取如下值范围： 1. ASC 按注册时间升序 2. DESC 按注册时间降序 默认降序
        self.sort_type = sort_type

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.page_num, 'page_num')
        if self.page_num is not None:
            self.validate_minimum(self.page_num, 'page_num', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 200)
        if self.unique_id is not None:
            self.validate_max_length(self.unique_id, 'unique_id', 64)
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 256)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.status is not None:
            result['status'] = self.status
        if self.sort_type is not None:
            result['sort_type'] = self.sort_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('sort_type') is not None:
            self.sort_type = m.get('sort_type')
        return self


class QueryCodeRelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        data: List[CodeRelationInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总历史记录条数
        self.total = total
        # 溯源码关联信息列表
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
        if self.total is not None:
            result['total'] = self.total
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
        if m.get('total') is not None:
            self.total = m.get('total')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = CodeRelationInfo()
                self.data.append(temp_model.from_map(k))
        return self


class AddCodeDepositRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        content: str = None,
        biz_labels: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签
        self.biz_type = biz_type
        # 存证内容
        # 
        self.content = content
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        self.biz_labels = biz_labels

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.content is not None:
            result['content'] = self.content
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        return self


class AddCodeDepositResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        unique_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链上交易哈希
        self.tx_hash = tx_hash
        # 注册记录唯一标识
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class QueryCodeCertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        tx_hash: str = None,
        content_flag: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        self.biz_type = biz_type
        # 区块链上交易哈希
        self.tx_hash = tx_hash
        # 是否展示交易具体内容，默认false
        self.content_flag = content_flag

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.tx_hash, 'tx_hash')
        if self.tx_hash is not None:
            self.validate_max_length(self.tx_hash, 'tx_hash', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.content_flag is not None:
            result['content_flag'] = self.content_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('content_flag') is not None:
            self.content_flag = m.get('content_flag')
        return self


class QueryCodeCertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content: str = None,
        chain_transaction_info: BlockChainTransactionInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证内容。
        # 在注册溯源码、溯源码关联信息等接口调用情况下，上链内容会包装加密后上链。
        # 因此返回内容不可读，需要按照指定要求解密读取。
        self.content = content
        # 链交易信息
        self.chain_transaction_info = chain_transaction_info

    def validate(self):
        if self.chain_transaction_info:
            self.chain_transaction_info.validate()

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
        if self.content is not None:
            result['content'] = self.content
        if self.chain_transaction_info is not None:
            result['chain_transaction_info'] = self.chain_transaction_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('chain_transaction_info') is not None:
            temp_model = BlockChainTransactionInfo()
            self.chain_transaction_info = temp_model.from_map(m['chain_transaction_info'])
        return self


class QueryCodeStatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        start_time: int = None,
        end_time: int = None,
        code_type: str = None,
        biz_labels: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签
        # 
        self.biz_type = biz_type
        # 开始时间
        self.start_time = start_time
        # 截止时间
        self.end_time = end_time
        # 支持以下查询维度：
        # REGISTRATION  注册码统计
        # RELATION  关联码信息统计
        # DEPOSIT    存证信息统计
        self.code_type = code_type
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        self.biz_labels = biz_labels

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        if self.code_type is not None:
            self.validate_max_length(self.code_type, 'code_type', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.code_type is not None:
            result['code_type'] = self.code_type
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('code_type') is not None:
            self.code_type = m.get('code_type')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        return self


class QueryCodeStatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        transaction_size: int = None,
        chain_capacity: int = None,
        record_size: int = None,
        valid_size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上链交易量
        self.transaction_size = transaction_size
        # 上链总数据存储容量占用
        self.chain_capacity = chain_capacity
        # 记录条数，包括上链和未上链的总数据条数
        self.record_size = record_size
        # 对重复操作仅做一次记录的数据统计量。eg: 实际溯源码注册量，实际绑定信息的数据量。
        self.valid_size = valid_size

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
        if self.transaction_size is not None:
            result['transaction_size'] = self.transaction_size
        if self.chain_capacity is not None:
            result['chain_capacity'] = self.chain_capacity
        if self.record_size is not None:
            result['record_size'] = self.record_size
        if self.valid_size is not None:
            result['valid_size'] = self.valid_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('transaction_size') is not None:
            self.transaction_size = m.get('transaction_size')
        if m.get('chain_capacity') is not None:
            self.chain_capacity = m.get('chain_capacity')
        if m.get('record_size') is not None:
            self.record_size = m.get('record_size')
        if m.get('valid_size') is not None:
            self.valid_size = m.get('valid_size')
        return self


class AddCodeRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        status: str = None,
        biz_labels: List[str] = None,
        content: str = None,
        relation_codes: List[str] = None,
        recursion_type: str = None,
        up_chain_flag: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识
        self.code = code
        # 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
        # 
        self.status = status
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        self.biz_labels = biz_labels
        # 注册内容
        # 
        self.content = content
        # 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。 可以通过接口查询关联溯源码绑定的信息。
        self.relation_codes = relation_codes
        # 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下，
        # NO_CHECK: 不做递归检查;
        # TREE_CHECK: 树结构检查;
        # DAG_CHECK: 有向无环图检查;
        self.recursion_type = recursion_type
        # 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
        self.up_chain_flag = up_chain_flag

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.status, 'status')
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 32)
        if self.recursion_type is not None:
            self.validate_max_length(self.recursion_type, 'recursion_type', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.status is not None:
            result['status'] = self.status
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.content is not None:
            result['content'] = self.content
        if self.relation_codes is not None:
            result['relation_codes'] = self.relation_codes
        if self.recursion_type is not None:
            result['recursion_type'] = self.recursion_type
        if self.up_chain_flag is not None:
            result['up_chain_flag'] = self.up_chain_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('relation_codes') is not None:
            self.relation_codes = m.get('relation_codes')
        if m.get('recursion_type') is not None:
            self.recursion_type = m.get('recursion_type')
        if m.get('up_chain_flag') is not None:
            self.up_chain_flag = m.get('up_chain_flag')
        return self


class AddCodeRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        unique_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链上交易哈希
        self.tx_hash = tx_hash
        # 注册记录唯一标识
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class UpdateCodeRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        unique_id: str = None,
        status: str = None,
        biz_labels: List[str] = None,
        content: str = None,
        relation_codes: List[str] = None,
        recursion_type: str = None,
        up_chain_flag: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识。该字段不更新，仅做过滤使用。
        self.code = code
        # 注册记录唯一标识
        self.unique_id = unique_id
        # 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
        self.status = status
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64。
        # 若已上链，则不可更新该信息。
        self.biz_labels = biz_labels
        # 注册内容。若已上链，则不可更新该信息。
        # 
        self.content = content
        # 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。 可以通过接口查询关联溯源码绑定的信息。若已上链，则不可更新该信息。
        self.relation_codes = relation_codes
        # 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下，
        # NO_CHECK: 不做递归检查;
        # TREE_CHECK: 树结构检查;
        # DAG_CHECK: 有向无环图检查;
        self.recursion_type = recursion_type
        # 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
        self.up_chain_flag = up_chain_flag

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.unique_id, 'unique_id')
        if self.unique_id is not None:
            self.validate_max_length(self.unique_id, 'unique_id', 64)
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 32)
        if self.recursion_type is not None:
            self.validate_max_length(self.recursion_type, 'recursion_type', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.status is not None:
            result['status'] = self.status
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.content is not None:
            result['content'] = self.content
        if self.relation_codes is not None:
            result['relation_codes'] = self.relation_codes
        if self.recursion_type is not None:
            result['recursion_type'] = self.recursion_type
        if self.up_chain_flag is not None:
            result['up_chain_flag'] = self.up_chain_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('relation_codes') is not None:
            self.relation_codes = m.get('relation_codes')
        if m.get('recursion_type') is not None:
            self.recursion_type = m.get('recursion_type')
        if m.get('up_chain_flag') is not None:
            self.up_chain_flag = m.get('up_chain_flag')
        return self


class UpdateCodeRegistrationResponse(TeaModel):
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
        # 区块链上交易哈希
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


class AddCodeRelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        status: str = None,
        biz_labels: List[str] = None,
        up_chain_flag: bool = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        # 
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识
        # 
        self.code = code
        # 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
        # 
        self.status = status
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        self.biz_labels = biz_labels
        # 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
        self.up_chain_flag = up_chain_flag
        # 关联内容
        # 
        self.content = content

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.status, 'status')
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.status is not None:
            result['status'] = self.status
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.up_chain_flag is not None:
            result['up_chain_flag'] = self.up_chain_flag
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('up_chain_flag') is not None:
            self.up_chain_flag = m.get('up_chain_flag')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class AddCodeRelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        unique_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链上交易哈希
        self.tx_hash = tx_hash
        # 绑定信息记录唯一标识
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class UpdateCodeRelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
        code: str = None,
        unique_id: str = None,
        status: str = None,
        biz_labels: List[str] = None,
        up_chain_flag: bool = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型，客户自定义标签，做code数据隔离使用
        self.biz_type = biz_type
        # 溯源码，代表该账户的唯一资源标识
        # 
        self.code = code
        # 绑定信息记录唯一标识
        self.unique_id = unique_id
        # 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
        self.status = status
        # 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64。若已上链，则不可更新该信息。
        self.biz_labels = biz_labels
        # 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
        self.up_chain_flag = up_chain_flag
        # 关联信息内容。若已上链，则不可更新该信息。
        self.content = content

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.unique_id, 'unique_id')
        if self.unique_id is not None:
            self.validate_max_length(self.unique_id, 'unique_id', 64)
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.code is not None:
            result['code'] = self.code
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.status is not None:
            result['status'] = self.status
        if self.biz_labels is not None:
            result['biz_labels'] = self.biz_labels
        if self.up_chain_flag is not None:
            result['up_chain_flag'] = self.up_chain_flag
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('biz_labels') is not None:
            self.biz_labels = m.get('biz_labels')
        if m.get('up_chain_flag') is not None:
            self.up_chain_flag = m.get('up_chain_flag')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class UpdateCodeRelationResponse(TeaModel):
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


class QueryMiniCodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        code: str = None,
        user_info: ScanUserInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 溯源码
        self.code = code
        # 用户信息
        self.user_info = user_info

    def validate(self):
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        if self.user_info:
            self.user_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.code is not None:
            result['code'] = self.code
        if self.user_info is not None:
            result['user_info'] = self.user_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('user_info') is not None:
            temp_model = ScanUserInfo()
            self.user_info = temp_model.from_map(m['user_info'])
        return self


class QueryMiniCodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        scan_info: ScanHeadInfo = None,
        phase_infos: List[PhaseInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 首次扫描信息
        self.scan_info = scan_info
        # 溯源环节信息列表
        self.phase_infos = phase_infos

    def validate(self):
        if self.scan_info:
            self.scan_info.validate()
        if self.phase_infos:
            for k in self.phase_infos:
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
        if self.scan_info is not None:
            result['scan_info'] = self.scan_info.to_map()
        result['phase_infos'] = []
        if self.phase_infos is not None:
            for k in self.phase_infos:
                result['phase_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('scan_info') is not None:
            temp_model = ScanHeadInfo()
            self.scan_info = temp_model.from_map(m['scan_info'])
        self.phase_infos = []
        if m.get('phase_infos') is not None:
            for k in m.get('phase_infos'):
                temp_model = PhaseInfo()
                self.phase_infos.append(temp_model.from_map(k))
        return self


class QueryMiniCertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        code: str = None,
        tx_hash: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 溯源码信息
        self.code = code
        # 交易哈希
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)
        self.validate_required(self.tx_hash, 'tx_hash')
        if self.tx_hash is not None:
            self.validate_max_length(self.tx_hash, 'tx_hash', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.code is not None:
            result['code'] = self.code
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class QueryMiniCertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        block_info: BlockInfo = None,
        upload_info: UploaderInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块信息
        self.block_info = block_info
        # 上传者信息
        self.upload_info = upload_info

    def validate(self):
        if self.block_info:
            self.block_info.validate()
        if self.upload_info:
            self.upload_info.validate()

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
        if self.block_info is not None:
            result['block_info'] = self.block_info.to_map()
        if self.upload_info is not None:
            result['upload_info'] = self.upload_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('block_info') is not None:
            temp_model = BlockInfo()
            self.block_info = temp_model.from_map(m['block_info'])
        if m.get('upload_info') is not None:
            temp_model = UploaderInfo()
            self.upload_info = temp_model.from_map(m['upload_info'])
        return self


class VerifyMiniNfcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        code: str = None,
        uid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 动态秘钥字符串信息
        self.code = code
        # NFC UID
        self.uid = uid

    def validate(self):
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 160)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.code is not None:
            result['code'] = self.code
        if self.uid is not None:
            result['uid'] = self.uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        return self


class VerifyMiniNfcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        message: str = None,
        code: str = None,
        uid: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 校验结果
        self.status = status
        # 校验信息
        self.message = message
        # 校验解析溯源码
        self.code = code
        # NFC UID
        self.uid = uid

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
        if self.message is not None:
            result['message'] = self.message
        if self.code is not None:
            result['code'] = self.code
        if self.uid is not None:
            result['uid'] = self.uid
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
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
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


