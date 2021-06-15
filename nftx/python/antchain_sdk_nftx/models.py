# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


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


class File(TeaModel):
    def __init__(
        self,
        path: str = None,
        name: str = None,
        type: str = None,
    ):
        # 文件的可访问路径
        self.path = path
        # 文件名称
        self.name = name
        # IMAGE("IMAGE","图片"),
        # VIDEO("VIDEO","视频"),
        # ;
        self.type = type

    def validate(self):
        self.validate_required(self.path, 'path')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')

    def to_map(self):
        result = dict()
        if self.path is not None:
            result['path'] = self.path
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('path') is not None:
            self.path = m.get('path')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ImportNftCreateandpublishRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        sku_name: str = None,
        sku_type: str = None,
        quantity: int = None,
        enable_c2c: bool = None,
        author: str = None,
        owner: str = None,
        create_time: str = None,
        biz_type: str = None,
        description: str = None,
        jump_url: str = None,
        files: File = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 对端自己的项目id；用作幂等字段
        self.project_id = project_id
        # NFT艺术品的名称
        self.sku_name = sku_name
        # IMAGE("IMAGE","图片"),
        # VIDEO("VIDEO","视频"),
        # ;
        self.sku_type = sku_type
        # 发行数量
        self.quantity = quantity
        # 是否支持C2C流转：true是可流转，false是不可流转；
        self.enable_c2c = enable_c2c
        # 艺术品作者
        self.author = author
        # 艺术品拥有者
        self.owner = owner
        # 艺术品创作时间
        self.create_time = create_time
        # 用于标识NFT资产来自特定的产品，用作特殊的交互跳转需求，非必填字段
        self.biz_type = biz_type
        # nft简介信息
        self.description = description
        # 跳转链接
        self.jump_url = jump_url
        # nft发行的艺术品文件
        self.files = files

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.sku_name, 'sku_name')
        self.validate_required(self.sku_type, 'sku_type')
        self.validate_required(self.quantity, 'quantity')
        self.validate_required(self.enable_c2c, 'enable_c2c')
        self.validate_required(self.author, 'author')
        self.validate_required(self.owner, 'owner')
        self.validate_required(self.create_time, 'create_time')
        if self.create_time is not None:
            self.validate_pattern(self.create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.description, 'description')
        self.validate_required(self.files, 'files')
        if self.files:
            self.files.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.sku_type is not None:
            result['sku_type'] = self.sku_type
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.enable_c2c is not None:
            result['enable_c2c'] = self.enable_c2c
        if self.author is not None:
            result['author'] = self.author
        if self.owner is not None:
            result['owner'] = self.owner
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.description is not None:
            result['description'] = self.description
        if self.jump_url is not None:
            result['jump_url'] = self.jump_url
        if self.files is not None:
            result['files'] = self.files.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('sku_name') is not None:
            self.sku_name = m.get('sku_name')
        if m.get('sku_type') is not None:
            self.sku_type = m.get('sku_type')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('enable_c2c') is not None:
            self.enable_c2c = m.get('enable_c2c')
        if m.get('author') is not None:
            self.author = m.get('author')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('jump_url') is not None:
            self.jump_url = m.get('jump_url')
        if m.get('files') is not None:
            temp_model = File()
            self.files = temp_model.from_map(m['files'])
        return self


class ImportNftCreateandpublishResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NFT发行成功的商品id
        self.sku_id = sku_id

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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        return self


