# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import BinaryIO, List


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


class RuleItem(TeaModel):
    def __init__(
        self,
        id: str = None,
        proportion: str = None,
    ):
        # 分账方Id
        self.id = id
        # 分账份额，总份额100，保留2位小数
        self.proportion = proportion

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.proportion, 'proportion')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.proportion is not None:
            result['proportion'] = self.proportion
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('proportion') is not None:
            self.proportion = m.get('proportion')
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


class CreateDepositRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        service_id: str = None,
        base_info_json: str = None,
        extension_info_json: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务幂等id
        self.order_id = order_id
        # 服务实例id
        self.service_id = service_id
        # 基础信息json
        self.base_info_json = base_info_json
        # 额外信息json
        self.extension_info_json = extension_info_json
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.base_info_json is not None:
            result['base_info_json'] = self.base_info_json
        if self.extension_info_json is not None:
            result['extension_info_json'] = self.extension_info_json
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
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('base_info_json') is not None:
            self.base_info_json = m.get('base_info_json')
        if m.get('extension_info_json') is not None:
            self.extension_info_json = m.get('extension_info_json')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class CreateDepositResponse(TeaModel):
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


class QueryDepositRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        service_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务幂等id
        self.order_id = order_id
        # 服务实例id
        self.service_id = service_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        return self


class QueryDepositResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        service_id: str = None,
        base_info_json: str = None,
        extension_info_json: str = None,
        tx_hash: str = None,
        block_number: int = None,
        timestamp: int = None,
        file_url: str = None,
        file_id: str = None,
        file_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务幂等id
        self.order_id = order_id
        # 服务实例id
        self.service_id = service_id
        # 基础信息json
        self.base_info_json = base_info_json
        # 额外信息json
        self.extension_info_json = extension_info_json
        # 交易hash
        self.tx_hash = tx_hash
        # 块高
        self.block_number = block_number
        # 交易时间戳
        self.timestamp = timestamp
        # 文件地址
        self.file_url = file_url
        # 文件id
        self.file_id = file_id
        # 文件哈希
        self.file_hash = file_hash

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.base_info_json is not None:
            result['base_info_json'] = self.base_info_json
        if self.extension_info_json is not None:
            result['extension_info_json'] = self.extension_info_json
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('base_info_json') is not None:
            self.base_info_json = m.get('base_info_json')
        if m.get('extension_info_json') is not None:
            self.extension_info_json = m.get('extension_info_json')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        return self


class QueryDepositCertificateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        service_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务幂等id
        self.order_id = order_id
        # 合约服务实例id
        self.service_id = service_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        return self


class QueryDepositCertificateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        service_id: str = None,
        base_info_json: str = None,
        extension_info_json: str = None,
        tx_hash: str = None,
        block_number: int = None,
        timestamp: int = None,
        file_url: str = None,
        file_id: str = None,
        file_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务幂等id
        self.order_id = order_id
        # 服务实例id
        self.service_id = service_id
        # 基础信息json
        self.base_info_json = base_info_json
        # 额外信息json
        self.extension_info_json = extension_info_json
        # 交易hash
        self.tx_hash = tx_hash
        # 块高
        self.block_number = block_number
        # 交易时间戳
        self.timestamp = timestamp
        # 文件地址
        self.file_url = file_url
        # 文件id
        self.file_id = file_id
        # 文件哈希
        self.file_hash = file_hash

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.base_info_json is not None:
            result['base_info_json'] = self.base_info_json
        if self.extension_info_json is not None:
            result['extension_info_json'] = self.extension_info_json
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('base_info_json') is not None:
            self.base_info_json = m.get('base_info_json')
        if m.get('extension_info_json') is not None:
            self.extension_info_json = m.get('extension_info_json')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        return self


class CreateDepositCertificateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        service_id: str = None,
        base_info_json: str = None,
        extension_info_json: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务幂等id
        self.order_id = order_id
        # 合约服务实例id
        self.service_id = service_id
        # 基础信息json
        self.base_info_json = base_info_json
        # 额外信息json
        self.extension_info_json = extension_info_json
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.base_info_json is not None:
            result['base_info_json'] = self.base_info_json
        if self.extension_info_json is not None:
            result['extension_info_json'] = self.extension_info_json
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
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('base_info_json') is not None:
            self.base_info_json = m.get('base_info_json')
        if m.get('extension_info_json') is not None:
            self.extension_info_json = m.get('extension_info_json')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class CreateDepositCertificateResponse(TeaModel):
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


class QueryDepositCharityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        service_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务幂等id
        self.order_id = order_id
        # 合约服务实例id
        self.service_id = service_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        return self


class QueryDepositCharityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        service_id: str = None,
        base_info_json: str = None,
        extension_info_json: str = None,
        tx_hash: str = None,
        block_number: int = None,
        timestamp: int = None,
        file_url: str = None,
        file_id: str = None,
        file_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务幂等id
        self.order_id = order_id
        # 服务实例id
        self.service_id = service_id
        # 基础信息json
        self.base_info_json = base_info_json
        # 额外信息json
        self.extension_info_json = extension_info_json
        # 交易hash
        self.tx_hash = tx_hash
        # 块高
        self.block_number = block_number
        # 交易时间戳
        self.timestamp = timestamp
        # 文件地址
        self.file_url = file_url
        # 文件id
        self.file_id = file_id
        # 文件哈希
        self.file_hash = file_hash

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.base_info_json is not None:
            result['base_info_json'] = self.base_info_json
        if self.extension_info_json is not None:
            result['extension_info_json'] = self.extension_info_json
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('base_info_json') is not None:
            self.base_info_json = m.get('base_info_json')
        if m.get('extension_info_json') is not None:
            self.extension_info_json = m.get('extension_info_json')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        return self


class CreateDepositCharityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        service_id: str = None,
        base_info_json: str = None,
        extension_info_json: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务幂等id
        self.order_id = order_id
        # 合约服务实例id
        self.service_id = service_id
        # 基础信息json
        self.base_info_json = base_info_json
        # 额外信息json
        self.extension_info_json = extension_info_json
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.base_info_json is not None:
            result['base_info_json'] = self.base_info_json
        if self.extension_info_json is not None:
            result['extension_info_json'] = self.extension_info_json
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
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('base_info_json') is not None:
            self.base_info_json = m.get('base_info_json')
        if m.get('extension_info_json') is not None:
            self.extension_info_json = m.get('extension_info_json')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class CreateDepositCharityResponse(TeaModel):
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


class QueryDepositSweepstakesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        service_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务幂等id
        self.order_id = order_id
        # 合约服务实例id
        self.service_id = service_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        return self


class QueryDepositSweepstakesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        service_id: str = None,
        base_info_json: str = None,
        extension_info_json: str = None,
        tx_hash: str = None,
        block_number: int = None,
        timestamp: int = None,
        file_url: str = None,
        file_id: str = None,
        file_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务幂等id
        self.order_id = order_id
        # 服务实例id
        self.service_id = service_id
        # 基础信息json
        self.base_info_json = base_info_json
        # 额外信息json
        self.extension_info_json = extension_info_json
        # 交易hash
        self.tx_hash = tx_hash
        # 块高
        self.block_number = block_number
        # 交易时间戳
        self.timestamp = timestamp
        # 文件地址
        self.file_url = file_url
        # 文件id
        self.file_id = file_id
        # 文件哈希
        self.file_hash = file_hash

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.base_info_json is not None:
            result['base_info_json'] = self.base_info_json
        if self.extension_info_json is not None:
            result['extension_info_json'] = self.extension_info_json
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_hash is not None:
            result['file_hash'] = self.file_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('base_info_json') is not None:
            self.base_info_json = m.get('base_info_json')
        if m.get('extension_info_json') is not None:
            self.extension_info_json = m.get('extension_info_json')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_hash') is not None:
            self.file_hash = m.get('file_hash')
        return self


class CreateDepositSweepstakesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        service_id: str = None,
        base_info_json: str = None,
        extension_info_json: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务幂等id
        self.order_id = order_id
        # 合约服务实例id
        self.service_id = service_id
        # 基础信息json
        self.base_info_json = base_info_json
        # 额外信息json
        self.extension_info_json = extension_info_json
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.base_info_json is not None:
            result['base_info_json'] = self.base_info_json
        if self.extension_info_json is not None:
            result['extension_info_json'] = self.extension_info_json
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
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('base_info_json') is not None:
            self.base_info_json = m.get('base_info_json')
        if m.get('extension_info_json') is not None:
            self.extension_info_json = m.get('extension_info_json')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class CreateDepositSweepstakesResponse(TeaModel):
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


class SetGeneralDepositRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        data: str = None,
        service_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务ID
        self.id = id
        # 要存储的数据，推荐json格式
        self.data = data
        # 合约服务实例id
        self.service_id = service_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.data, 'data')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.data is not None:
            result['data'] = self.data
        if self.service_id is not None:
            result['service_id'] = self.service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        return self


class SetGeneralDepositResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约调用交易哈希
        self.tx_hash = tx_hash
        # 合约调用交易块高
        self.block_number = block_number
        # 合约返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class GetGeneralDepositRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
        service_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务ID
        self.id = id
        # 合约服务实例id
        self.service_id = service_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.service_id, 'service_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        return self


class GetGeneralDepositResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 调用合约交易哈希
        self.tx_hash = tx_hash
        # 合约调用交易块高
        self.block_number = block_number
        # 合约返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class PayGeneralRightsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        from_: str = None,
        to: str = None,
        id: int = None,
        amount: int = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约服务实例Id
        self.service_id = service_id
        # 持有账号的地址
        self.from_ = from_
        # 接收账号的地址
        self.to = to
        # 数据资产ID
        self.id = id
        # 要转增的数据资产数量
        self.amount = amount
        # 扩展数据
        self.data = data

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.id, 'id')
        self.validate_required(self.amount, 'amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.id is not None:
            result['id'] = self.id
        if self.amount is not None:
            result['amount'] = self.amount
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class PayGeneralRightsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        result: str = None,
        code: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约调用交易哈希
        self.tx_hash = tx_hash
        # 合约调用交易块高
        self.block_number = block_number
        # 合约返回结果
        self.result = result
        # 错误码
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.result is not None:
            result['result'] = self.result
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class UploadExtendRightsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        description: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        data: str = None,
        author: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 名称
        self.name = name
        # 描述
        self.description = description
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 扩展字段
        self.data = data
        # 作者或发型方
        self.author = author

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.author, 'author')

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
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.data is not None:
            result['data'] = self.data
        if self.author is not None:
            result['author'] = self.author
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
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('author') is not None:
            self.author = m.get('author')
        return self


class UploadExtendRightsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        rights_id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据资产id
        self.rights_id = rights_id

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
        if self.rights_id is not None:
            result['rights_id'] = self.rights_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('rights_id') is not None:
            self.rights_id = m.get('rights_id')
        return self


class CreateExtendRightsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        account_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 账号名称
        self.account_name = account_name

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
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
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.account_name is not None:
            result['account_name'] = self.account_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        return self


class CreateExtendRightsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        address: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链上账户地址
        self.address = address

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
        if self.address is not None:
            result['address'] = self.address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('address') is not None:
            self.address = m.get('address')
        return self


class RegisterGeneralRightsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        account: str = None,
        id: int = None,
        amount: int = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 创建链上账户时指定的accountName
        self.account = account
        # 通过调用托管资源接口返回的资源id
        self.id = id
        # 要铸造的数据资产数量
        self.amount = amount
        # 扩展参数
        self.data = data

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.account, 'account')
        self.validate_required(self.id, 'id')
        self.validate_required(self.amount, 'amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.account is not None:
            result['account'] = self.account
        if self.id is not None:
            result['id'] = self.id
        if self.amount is not None:
            result['amount'] = self.amount
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class RegisterGeneralRightsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        result: str = None,
        code: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约调用交易哈希
        self.tx_hash = tx_hash
        # 合约调用交易块高
        self.block_number = block_number
        # 合约返回结果
        self.result = result
        # 错误码
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.result is not None:
            result['result'] = self.result
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class GetGeneralRightsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        token_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约示例id
        self.service_id = service_id
        # 数据资产id
        self.token_id = token_id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.token_id, 'token_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.token_id is not None:
            result['token_id'] = self.token_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('token_id') is not None:
            self.token_id = m.get('token_id')
        return self


class GetGeneralRightsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        result: str = None,
        code: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约调用交易哈希
        self.tx_hash = tx_hash
        # 合约调用交易块高
        self.block_number = block_number
        # 合约返回结果
        self.result = result
        # 错误码
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.result is not None:
            result['result'] = self.result
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class RegisterGeneralDivideRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        id: str = None,
        code: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 自定义Id,重复则更新
        self.id = id
        # 企业营业证编号，或唯一ID
        self.code = code
        # 企业名称
        self.name = name

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.id, 'id')
        if self.id is not None:
            self.validate_max_length(self.id, 'id', 64)
        self.validate_required(self.code, 'code')
        if self.code is not None:
            self.validate_max_length(self.code, 'code', 100)
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.id is not None:
            result['id'] = self.id
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class RegisterGeneralDivideResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryGeneralDivideRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 分账方Id
        self.id = id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class QueryGeneralDivideResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class SetGeneralDivideRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        rule_id: str = None,
        rule_item_list: List[RuleItem] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 自定义分账规则唯一ID
        self.rule_id = rule_id
        # 分账方，分账方不能重复配置
        self.rule_item_list = rule_item_list

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.rule_id, 'rule_id')
        if self.rule_id is not None:
            self.validate_max_length(self.rule_id, 'rule_id', 64)
        self.validate_required(self.rule_item_list, 'rule_item_list')
        if self.rule_item_list:
            for k in self.rule_item_list:
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
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.rule_id is not None:
            result['rule_id'] = self.rule_id
        result['rule_item_list'] = []
        if self.rule_item_list is not None:
            for k in self.rule_item_list:
                result['rule_item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('rule_id') is not None:
            self.rule_id = m.get('rule_id')
        self.rule_item_list = []
        if m.get('rule_item_list') is not None:
            for k in m.get('rule_item_list'):
                temp_model = RuleItem()
                self.rule_item_list.append(temp_model.from_map(k))
        return self


class SetGeneralDivideResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class GetGeneralDivideRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        rule_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 分账规则ID
        self.rule_id = rule_id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.rule_id, 'rule_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.rule_id is not None:
            result['rule_id'] = self.rule_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('rule_id') is not None:
            self.rule_id = m.get('rule_id')
        return self


class GetGeneralDivideResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class DeleteGeneralDivideRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 分账方Id
        self.id = id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DeleteGeneralDivideResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class PayGeneralDivideRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        order_id: str = None,
        from_: str = None,
        payer: str = None,
        pay_type: str = None,
        pay_time: str = None,
        status: str = None,
        to: str = None,
        amount: str = None,
        rule_id: str = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 订单编号 ( 编号不能重复)
        self.order_id = order_id
        # 发起人
        self.from_ = from_
        # 付款人
        self.payer = payer
        # 支付方式
        self.pay_type = pay_type
        # 支付时间
        self.pay_time = pay_time
        # 支付状态
        self.status = status
        # 收款人
        self.to = to
        # 订单金额（保留3位小数）
        self.amount = amount
        # 分账规则id （根据规则进行分账）
        self.rule_id = rule_id
        # 扩展json
        self.data = data

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 256)
        self.validate_required(self.from_, 'from_')
        if self.from_ is not None:
            self.validate_max_length(self.from_, 'from_', 100)
        self.validate_required(self.payer, 'payer')
        if self.payer is not None:
            self.validate_max_length(self.payer, 'payer', 100)
        self.validate_required(self.pay_type, 'pay_type')
        if self.pay_type is not None:
            self.validate_max_length(self.pay_type, 'pay_type', 100)
        self.validate_required(self.pay_time, 'pay_time')
        if self.pay_time is not None:
            self.validate_max_length(self.pay_time, 'pay_time', 100)
        self.validate_required(self.status, 'status')
        if self.status is not None:
            self.validate_max_length(self.status, 'status', 100)
        self.validate_required(self.to, 'to')
        if self.to is not None:
            self.validate_max_length(self.to, 'to', 100)
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.rule_id, 'rule_id')
        if self.data is not None:
            self.validate_max_length(self.data, 'data', 2000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.from_ is not None:
            result['from'] = self.from_
        if self.payer is not None:
            result['payer'] = self.payer
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        if self.pay_time is not None:
            result['pay_time'] = self.pay_time
        if self.status is not None:
            result['status'] = self.status
        if self.to is not None:
            result['to'] = self.to
        if self.amount is not None:
            result['amount'] = self.amount
        if self.rule_id is not None:
            result['rule_id'] = self.rule_id
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('payer') is not None:
            self.payer = m.get('payer')
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        if m.get('pay_time') is not None:
            self.pay_time = m.get('pay_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('rule_id') is not None:
            self.rule_id = m.get('rule_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class PayGeneralDivideResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class PullGeneralDivideRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 分账方Id
        self.id = id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class PullGeneralDivideResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class BatchqueryGeneralDivideRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 订单编号
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.order_id, 'order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class BatchqueryGeneralDivideResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class GetGeneralTourismRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        token_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 数据资产id
        self.token_id = token_id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.token_id, 'token_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.token_id is not None:
            result['token_id'] = self.token_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('token_id') is not None:
            self.token_id = m.get('token_id')
        return self


class GetGeneralTourismResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class RegisterGeneralTourismRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        account: str = None,
        id: int = None,
        amount: int = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 创建链上账户时指定的accountName
        self.account = account
        # 通过调用托管资源接口返回的资源id
        self.id = id
        # 要铸造的数据资产数量
        self.amount = amount
        # 扩展参数
        self.data = data

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.account, 'account')
        self.validate_required(self.id, 'id')
        self.validate_required(self.amount, 'amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.account is not None:
            result['account'] = self.account
        if self.id is not None:
            result['id'] = self.id
        if self.amount is not None:
            result['amount'] = self.amount
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class RegisterGeneralTourismResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class PayGeneralTourismRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        from_: str = None,
        to: str = None,
        id: int = None,
        amount: int = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 持有账号的地址
        self.from_ = from_
        # 接收账号的地址
        self.to = to
        # 数据资产ID
        self.id = id
        # 要转增的数据资产数量
        self.amount = amount
        # 扩展数据
        self.data = data

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.id, 'id')
        self.validate_required(self.amount, 'amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.id is not None:
            result['id'] = self.id
        if self.amount is not None:
            result['amount'] = self.amount
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class PayGeneralTourismResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class GetGeneralTicketsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        token_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 数据资产id
        self.token_id = token_id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.token_id, 'token_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.token_id is not None:
            result['token_id'] = self.token_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('token_id') is not None:
            self.token_id = m.get('token_id')
        return self


class GetGeneralTicketsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class RegisterGeneralTicketsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        account: str = None,
        id: int = None,
        amount: int = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 创建链上账户时指定的accountName
        self.account = account
        # 通过调用托管资源接口返回的资源id
        self.id = id
        # 要铸造的数据资产数量
        self.amount = amount
        # 扩展参数
        self.data = data

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.account, 'account')
        self.validate_required(self.id, 'id')
        self.validate_required(self.amount, 'amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.account is not None:
            result['account'] = self.account
        if self.id is not None:
            result['id'] = self.id
        if self.amount is not None:
            result['amount'] = self.amount
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class RegisterGeneralTicketsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class PayGeneralTicketsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        from_: str = None,
        to: str = None,
        id: int = None,
        amount: int = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 持有账号的地址
        self.from_ = from_
        # 接收账号的地址
        self.to = to
        # 数据资产ID
        self.id = id
        # 要转增的数据资产数量
        self.amount = amount
        # 扩展数据
        self.data = data

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.id, 'id')
        self.validate_required(self.amount, 'amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.id is not None:
            result['id'] = self.id
        if self.amount is not None:
            result['amount'] = self.amount
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class PayGeneralTicketsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class UpdateGeneralDivideRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        rule_id: str = None,
        user_id: str = None,
        str_status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 分账规则ID
        self.rule_id = rule_id
        # 分账方用户ID
        self.user_id = user_id
        # 确认状态，0: 待确认；1:确认；2：拒绝
        self.str_status = str_status

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.rule_id, 'rule_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.str_status, 'str_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.rule_id is not None:
            result['rule_id'] = self.rule_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.str_status is not None:
            result['str_status'] = self.str_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('rule_id') is not None:
            self.rule_id = m.get('rule_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('str_status') is not None:
            self.str_status = m.get('str_status')
        return self


class UpdateGeneralDivideResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易HASH
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class ListGeneralDivideRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        user_id: str = None,
        str_start_index: str = None,
        str_end_index: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约实例id
        self.service_id = service_id
        # 分账方ID
        self.user_id = user_id
        # 分账列表起始序号
        self.str_start_index = str_start_index
        # 分账明细查询截止序号
        self.str_end_index = str_end_index

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.str_start_index, 'str_start_index')
        self.validate_required(self.str_end_index, 'str_end_index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.str_start_index is not None:
            result['str_start_index'] = self.str_start_index
        if self.str_end_index is not None:
            result['str_end_index'] = self.str_end_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('str_start_index') is not None:
            self.str_start_index = m.get('str_start_index')
        if m.get('str_end_index') is not None:
            self.str_end_index = m.get('str_end_index')
        return self


class ListGeneralDivideResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易Hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 错误码
        self.code = code
        # 返回结果，json格式，data为分账明细数据
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class GetGeneralRightsbalanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        account: str = None,
        id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合约服务实例id
        self.service_id = service_id
        # 账号的地址
        self.account = account
        # 数据资产ID
        self.id = id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.account, 'account')
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.account is not None:
            result['account'] = self.account
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class GetGeneralRightsbalanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_hash: str = None,
        block_number: int = None,
        code: int = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易hash
        self.tx_hash = tx_hash
        # 区块高度
        self.block_number = block_number
        # 执行结果，0:成功
        self.code = code
        # 合约接口返回结果
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
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('result') is not None:
            self.result = m.get('result')
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


