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


class CollectContent(TeaModel):
    def __init__(
        self,
        chain_device_id: str = None,
        content: str = None,
        signature: str = None,
        extra_data: str = None,
    ):
        # 链上设备Id
        # 
        self.chain_device_id = chain_device_id
        # 收集的内容
        # 
        self.content = content
        # 对内容的签名
        # 
        self.signature = signature
        # 服务端发送的扩展数据（非可信设备直接产生的数据）
        self.extra_data = extra_data

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        result = dict()
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.content is not None:
            result['content'] = self.content
        if self.signature is not None:
            result['signature'] = self.signature
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        return self


class CollectContentNoSign(TeaModel):
    def __init__(
        self,
        chain_device_id: str = None,
        content: str = None,
        extra_data: str = None,
    ):
        # 链上设备Id
        # 
        self.chain_device_id = chain_device_id
        # 收集内容
        self.content = content
        # 服务端发送的扩展数据（非可信设备直接产生的数据）
        self.extra_data = extra_data

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.content, 'content')

    def to_map(self):
        result = dict()
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.content is not None:
            result['content'] = self.content
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        return self


class SendCollectorResult(TeaModel):
    def __init__(
        self,
        tx_hash: str = None,
    ):
        # 数据内容content的上链交易哈希
        self.tx_hash = tx_hash

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')

    def to_map(self):
        result = dict()
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class CollectLabelContent(TeaModel):
    def __init__(
        self,
        chain_device_id: str = None,
        content: str = None,
        signature: str = None,
        extra_data: str = None,
    ):
        # 链上设备ID
        self.chain_device_id = chain_device_id
        # 1.设备端上报数据内容 2.与设备上报的数据一致，服务...
        # 
        self.content = content
        # content的签名 与设备上报的签名保持一致，服务端不可修改
        self.signature = signature
        # 未经设备签名的附加数据JSON String 注意：如果 content 批量解析 ，extraData也会批量复制融入解析后的content
        self.extra_data = extra_data

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        result = dict()
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        if self.content is not None:
            result['content'] = self.content
        if self.signature is not None:
            result['signature'] = self.signature
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        return self


class CreateDeviceBydeviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        project_code: str = None,
        class_code: str = None,
        content: str = None,
        device_name: str = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备ID
        self.device_id = device_id
        # 项目编码 -对应acs iot管控后台项目code
        self.project_code = project_code
        # 设备类型编码-对应acs iot管控后台设备类型code
        self.class_code = class_code
        # 注册内容
        self.content = content
        # 设备名称
        self.device_name = device_name
        # 设备单价 单位：分
        # 
        self.initial_price = initial_price
        # 出厂时间
        self.factory_time = factory_time
        # 投放时间
        self.release_time = release_time

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.project_code, 'project_code')
        self.validate_required(self.class_code, 'class_code')
        self.validate_required(self.content, 'content')
        self.validate_required(self.device_name, 'device_name')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.project_code is not None:
            result['project_code'] = self.project_code
        if self.class_code is not None:
            result['class_code'] = self.class_code
        if self.content is not None:
            result['content'] = self.content
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        if m.get('class_code') is not None:
            self.class_code = m.get('class_code')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        return self


class CreateDeviceBydeviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chain_device_did: str = None,
        active_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 链上唯一身份ID
        self.chain_device_did = chain_device_did
        # 设备激活文本-设备直连上链方式使用
        # 
        self.active_data = active_data

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
        if self.chain_device_did is not None:
            result['chain_device_did'] = self.chain_device_did
        if self.active_data is not None:
            result['active_data'] = self.active_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chain_device_did') is not None:
            self.chain_device_did = m.get('chain_device_did')
        if m.get('active_data') is not None:
            self.active_data = m.get('active_data')
        return self


class CreateDeviceBychainidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id: str = None,
        project_code: str = None,
        class_code: str = None,
        content: str = None,
        signature: str = None,
        device_name: str = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备ID
        self.device_id = device_id
        # 项目编码-对应acs iot管控后台项目code
        self.project_code = project_code
        # 设备类型编码-对应acs iot管控后台设备类型code
        self.class_code = class_code
        # 设备注册内容
        self.content = content
        # 设备注册内容签名
        self.signature = signature
        # 设备名称
        self.device_name = device_name
        # 设备单价 单位：分
        # 
        self.initial_price = initial_price
        # 设备出厂时间
        self.factory_time = factory_time
        # 设备投放时间
        self.release_time = release_time

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.project_code, 'project_code')
        self.validate_required(self.class_code, 'class_code')
        self.validate_required(self.content, 'content')
        self.validate_required(self.signature, 'signature')
        self.validate_required(self.device_name, 'device_name')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.project_code is not None:
            result['project_code'] = self.project_code
        if self.class_code is not None:
            result['class_code'] = self.class_code
        if self.content is not None:
            result['content'] = self.content
        if self.signature is not None:
            result['signature'] = self.signature
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('project_code') is not None:
            self.project_code = m.get('project_code')
        if m.get('class_code') is not None:
            self.class_code = m.get('class_code')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        return self


class CreateDeviceBychainidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chain_device_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 设备链上ID
        # 
        self.chain_device_id = chain_device_id

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
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        return self


class SendCollectorBychainidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chain_device_id: str = None,
        collect_content_list: List[CollectContent] = None,
        nonce: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备链id
        self.chain_device_id = chain_device_id
        # [{"name","1"},{"name","1"}]
        self.collect_content_list = collect_content_list
        # 随机数，防重放
        # 
        self.nonce = nonce

    def validate(self):
        self.validate_required(self.chain_device_id, 'chain_device_id')
        self.validate_required(self.collect_content_list, 'collect_content_list')
        if self.collect_content_list:
            for k in self.collect_content_list:
                if k:
                    k.validate()
        self.validate_required(self.nonce, 'nonce')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chain_device_id is not None:
            result['chain_device_id'] = self.chain_device_id
        result['collect_content_list'] = []
        if self.collect_content_list is not None:
            for k in self.collect_content_list:
                result['collect_content_list'].append(k.to_map() if k else None)
        if self.nonce is not None:
            result['nonce'] = self.nonce
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chain_device_id') is not None:
            self.chain_device_id = m.get('chain_device_id')
        self.collect_content_list = []
        if m.get('collect_content_list') is not None:
            for k in m.get('collect_content_list'):
                temp_model = CollectContent()
                self.collect_content_list.append(temp_model.from_map(k))
        if m.get('nonce') is not None:
            self.nonce = m.get('nonce')
        return self


class SendCollectorBychainidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_list: List[SendCollectorResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 收集数据返回的上链结果
        self.result_list = result_list

    def validate(self):
        if self.result_list:
            for k in self.result_list:
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
        result['result_list'] = []
        if self.result_list is not None:
            for k in self.result_list:
                result['result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result_list = []
        if m.get('result_list') is not None:
            for k in m.get('result_list'):
                temp_model = SendCollectorResult()
                self.result_list.append(temp_model.from_map(k))
        return self


