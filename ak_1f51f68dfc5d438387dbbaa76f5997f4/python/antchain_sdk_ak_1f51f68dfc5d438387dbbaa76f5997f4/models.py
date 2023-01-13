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


class QueryAntchainMytcMiniCertRequest(TeaModel):
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


class QueryAntchainMytcMiniCertResponse(TeaModel):
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


class QueryAntchainMytcMiniCodeRequest(TeaModel):
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


class QueryAntchainMytcMiniCodeResponse(TeaModel):
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


class VerifyAntchainMytcMiniNfcRequest(TeaModel):
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


class VerifyAntchainMytcMiniNfcResponse(TeaModel):
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


