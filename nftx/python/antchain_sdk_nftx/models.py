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


class File(TeaModel):
    def __init__(
        self,
        original_file_path: str = None,
        mini_image_path: str = None,
        name: str = None,
        type: str = None,
    ):
        # 原文件的可访问路径
        self.original_file_path = original_file_path
        # 缩略图的可访问路径
        self.mini_image_path = mini_image_path
        # 文件名称
        self.name = name
        # IMAGE("IMAGE", "图片"),
        # VIDEO("VIDEO", "视频"),
        # AUDIO("AUDIO","音频"),
        # THREE_DIMENSIONS("THREE_DIMENSIONS","3D模型")
        self.type = type

    def validate(self):
        self.validate_required(self.original_file_path, 'original_file_path')
        self.validate_required(self.mini_image_path, 'mini_image_path')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.original_file_path is not None:
            result['original_file_path'] = self.original_file_path
        if self.mini_image_path is not None:
            result['mini_image_path'] = self.mini_image_path
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('original_file_path') is not None:
            self.original_file_path = m.get('original_file_path')
        if m.get('mini_image_path') is not None:
            self.mini_image_path = m.get('mini_image_path')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class CToMResourceImg(TeaModel):
    def __init__(
        self,
        thumbnail_url: str = None,
        high_definition_url: str = None,
        key: str = None,
    ):
        # 预览图
        self.thumbnail_url = thumbnail_url
        # 高清图
        self.high_definition_url = high_definition_url
        # key
        self.key = key

    def validate(self):
        self.validate_required(self.thumbnail_url, 'thumbnail_url')
        self.validate_required(self.high_definition_url, 'high_definition_url')
        self.validate_required(self.key, 'key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.thumbnail_url is not None:
            result['thumbnail_url'] = self.thumbnail_url
        if self.high_definition_url is not None:
            result['high_definition_url'] = self.high_definition_url
        if self.key is not None:
            result['key'] = self.key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('thumbnail_url') is not None:
            self.thumbnail_url = m.get('thumbnail_url')
        if m.get('high_definition_url') is not None:
            self.high_definition_url = m.get('high_definition_url')
        if m.get('key') is not None:
            self.key = m.get('key')
        return self


class UserAsset(TeaModel):
    def __init__(
        self,
        sku_id: int = None,
        nft_id: str = None,
        sku_name: str = None,
        author_name: str = None,
        issuer_name: str = None,
        mini_image_path: str = None,
        asset_scene: str = None,
    ):
        # NFT商品的商品编码
        self.sku_id = sku_id
        # NFT资产的唯一编码
        self.nft_id = nft_id
        # NFT商品的名称
        self.sku_name = sku_name
        # NFT的创作者名称
        self.author_name = author_name
        # NFT的发行方名称
        self.issuer_name = issuer_name
        # 缩略图url，带5分钟鉴权
        self.mini_image_path = mini_image_path
        # 用户活动资产的场景
        self.asset_scene = asset_scene

    def validate(self):
        self.validate_required(self.sku_id, 'sku_id')
        self.validate_required(self.nft_id, 'nft_id')
        self.validate_required(self.sku_name, 'sku_name')
        self.validate_required(self.author_name, 'author_name')
        self.validate_required(self.issuer_name, 'issuer_name')
        self.validate_required(self.mini_image_path, 'mini_image_path')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.author_name is not None:
            result['author_name'] = self.author_name
        if self.issuer_name is not None:
            result['issuer_name'] = self.issuer_name
        if self.mini_image_path is not None:
            result['mini_image_path'] = self.mini_image_path
        if self.asset_scene is not None:
            result['asset_scene'] = self.asset_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('sku_name') is not None:
            self.sku_name = m.get('sku_name')
        if m.get('author_name') is not None:
            self.author_name = m.get('author_name')
        if m.get('issuer_name') is not None:
            self.issuer_name = m.get('issuer_name')
        if m.get('mini_image_path') is not None:
            self.mini_image_path = m.get('mini_image_path')
        if m.get('asset_scene') is not None:
            self.asset_scene = m.get('asset_scene')
        return self


class ImportNftCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        sku_name: str = None,
        sku_type: str = None,
        quantity: int = None,
        author: str = None,
        owner: str = None,
        creation_time: str = None,
        biz_type: str = None,
        description: str = None,
        jump_url: str = None,
        files: List[File] = None,
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
        # 艺术品作者
        self.author = author
        # 艺术品拥有者
        self.owner = owner
        # 艺术品创作时间
        self.creation_time = creation_time
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
        self.validate_required(self.author, 'author')
        self.validate_required(self.owner, 'owner')
        self.validate_required(self.creation_time, 'creation_time')
        if self.creation_time is not None:
            self.validate_pattern(self.creation_time, 'creation_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.description, 'description')
        self.validate_required(self.files, 'files')
        if self.files:
            for k in self.files:
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
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.sku_type is not None:
            result['sku_type'] = self.sku_type
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.author is not None:
            result['author'] = self.author
        if self.owner is not None:
            result['owner'] = self.owner
        if self.creation_time is not None:
            result['creation_time'] = self.creation_time
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.description is not None:
            result['description'] = self.description
        if self.jump_url is not None:
            result['jump_url'] = self.jump_url
        result['files'] = []
        if self.files is not None:
            for k in self.files:
                result['files'].append(k.to_map() if k else None)
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
        if m.get('author') is not None:
            self.author = m.get('author')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('creation_time') is not None:
            self.creation_time = m.get('creation_time')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('jump_url') is not None:
            self.jump_url = m.get('jump_url')
        self.files = []
        if m.get('files') is not None:
            for k in m.get('files'):
                temp_model = File()
                self.files.append(temp_model.from_map(k))
        return self


class ImportNftCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: int = None,
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


class QueryNftCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        sku_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 对端自己的项目id；NFT发行时用作幂等字段
        self.project_id = project_id
        # NFT发行成功的商品id，传入sku_id时以此为准做查询
        self.sku_id = sku_id

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        return self


class QueryNftCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: int = None,
        sku_status: str = None,
        sku_name: str = None,
        author_name: str = None,
        issuer_name: str = None,
        mini_image_path: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NFT发行成功的商品id
        self.sku_id = sku_id
        # INIT("INIT", "初始化"),
        # PROCESSING("PROCESSING", "资产创建中"),
        # FINISH("FINISH", "资产初始化完毕"),
        # ;
        self.sku_status = sku_status
        # NFT商品的名称
        self.sku_name = sku_name
        # 作者的名称
        self.author_name = author_name
        # 发行方的名称
        self.issuer_name = issuer_name
        # 缩略图展示路径
        self.mini_image_path = mini_image_path

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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.sku_status is not None:
            result['sku_status'] = self.sku_status
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.author_name is not None:
            result['author_name'] = self.author_name
        if self.issuer_name is not None:
            result['issuer_name'] = self.issuer_name
        if self.mini_image_path is not None:
            result['mini_image_path'] = self.mini_image_path
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
        if m.get('sku_status') is not None:
            self.sku_status = m.get('sku_status')
        if m.get('sku_name') is not None:
            self.sku_name = m.get('sku_name')
        if m.get('author_name') is not None:
            self.author_name = m.get('author_name')
        if m.get('issuer_name') is not None:
            self.issuer_name = m.get('issuer_name')
        if m.get('mini_image_path') is not None:
            self.mini_image_path = m.get('mini_image_path')
        return self


class ExecNftTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sku_id: int = None,
        to_id_no: str = None,
        to_id_type: str = None,
        order_no: str = None,
        order_time: str = None,
        price_cent: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # NFT发行成功的商品id
        self.sku_id = sku_id
        # C端用户的支付宝uid
        self.to_id_no = to_id_no
        # C端用户的支付宝账号类型
        self.to_id_type = to_id_type
        # 用户在商户购买的订单号，用作幂等字段
        self.order_no = order_no
        # 用户购买订单的时间
        self.order_time = order_time
        # 用户购买订单的价格，可以为0；用户的购买历史记录会展示
        self.price_cent = price_cent

    def validate(self):
        self.validate_required(self.sku_id, 'sku_id')
        self.validate_required(self.to_id_no, 'to_id_no')
        self.validate_required(self.to_id_type, 'to_id_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.order_time, 'order_time')
        if self.order_time is not None:
            self.validate_pattern(self.order_time, 'order_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.to_id_no is not None:
            result['to_id_no'] = self.to_id_no
        if self.to_id_type is not None:
            result['to_id_type'] = self.to_id_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.order_time is not None:
            result['order_time'] = self.order_time
        if self.price_cent is not None:
            result['price_cent'] = self.price_cent
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('to_id_no') is not None:
            self.to_id_no = m.get('to_id_no')
        if m.get('to_id_type') is not None:
            self.to_id_type = m.get('to_id_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('order_time') is not None:
            self.order_time = m.get('order_time')
        if m.get('price_cent') is not None:
            self.price_cent = m.get('price_cent')
        return self


class ExecNftTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: int = None,
        nft_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NFT发行成功的商品id
        self.sku_id = sku_id
        # NFT发行成功的商品，其中转给C端用户的特定一个token
        self.nft_id = nft_id

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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
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
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        return self


class SendNftTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        to_id_no: str = None,
        to_id_type: str = None,
        order_no: str = None,
        order_time: str = None,
        price_cent: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # NFT租户下唯一的项目编号
        self.project_id = project_id
        # 支付宝2088开头账号
        self.to_id_no = to_id_no
        # 账号类型，当前只支持支付宝账号
        self.to_id_type = to_id_type
        # 交易NFT时租户的唯一订单号
        self.order_no = order_no
        # 用户购买订单时间
        self.order_time = order_time
        # 购买NFT的金额，单位分
        self.price_cent = price_cent

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.to_id_no, 'to_id_no')
        self.validate_required(self.to_id_type, 'to_id_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.order_time, 'order_time')
        if self.order_time is not None:
            self.validate_pattern(self.order_time, 'order_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.to_id_no is not None:
            result['to_id_no'] = self.to_id_no
        if self.to_id_type is not None:
            result['to_id_type'] = self.to_id_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.order_time is not None:
            result['order_time'] = self.order_time
        if self.price_cent is not None:
            result['price_cent'] = self.price_cent
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('to_id_no') is not None:
            self.to_id_no = m.get('to_id_no')
        if m.get('to_id_type') is not None:
            self.to_id_type = m.get('to_id_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('order_time') is not None:
            self.order_time = m.get('order_time')
        if m.get('price_cent') is not None:
            self.price_cent = m.get('price_cent')
        return self


class SendNftTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: str = None,
        nft_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NFT商品编码
        self.sku_id = sku_id
        # 发放的NFT编码
        self.nft_id = nft_id

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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
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
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        return self


class QueryNftCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_no: str = None,
        id_type: str = None,
        nft_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户支付宝2088账号编码，16位
        self.id_no = id_no
        # 用户的账户类型
        self.id_type = id_type
        # NFT资产唯一编码
        self.nft_id = nft_id

    def validate(self):
        self.validate_required(self.id_no, 'id_no')
        self.validate_required(self.id_type, 'id_type')
        self.validate_required(self.nft_id, 'nft_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id_no is not None:
            result['id_no'] = self.id_no
        if self.id_type is not None:
            result['id_type'] = self.id_type
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_no') is not None:
            self.id_no = m.get('id_no')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        return self


class QueryNftCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: int = None,
        nft_id: str = None,
        sku_name: str = None,
        author_name: str = None,
        issuer_name: str = None,
        mini_image_path: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NFT商品的商品编码
        self.sku_id = sku_id
        # NFT资产的唯一编码
        self.nft_id = nft_id
        # NFT商品的名称
        self.sku_name = sku_name
        # NFT的创作者名称
        self.author_name = author_name
        # NFT的发行方名称
        self.issuer_name = issuer_name
        # 缩略图url，带5分钟鉴权
        self.mini_image_path = mini_image_path

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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.author_name is not None:
            result['author_name'] = self.author_name
        if self.issuer_name is not None:
            result['issuer_name'] = self.issuer_name
        if self.mini_image_path is not None:
            result['mini_image_path'] = self.mini_image_path
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
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('sku_name') is not None:
            self.sku_name = m.get('sku_name')
        if m.get('author_name') is not None:
            self.author_name = m.get('author_name')
        if m.get('issuer_name') is not None:
            self.issuer_name = m.get('issuer_name')
        if m.get('mini_image_path') is not None:
            self.mini_image_path = m.get('mini_image_path')
        return self


class QueryNftOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_no: str = None,
        id_type: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支付宝的2088账号
        self.id_no = id_no
        # 支付账号类型，该版本仅支持支付宝账号
        self.id_type = id_type
        # 租户的唯一映射订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.id_no, 'id_no')
        self.validate_required(self.id_type, 'id_type')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id_no is not None:
            result['id_no'] = self.id_no
        if self.id_type is not None:
            result['id_type'] = self.id_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_no') is not None:
            self.id_no = m.get('id_no')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class QueryNftOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: int = None,
        nft_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NFT商品编码
        self.sku_id = sku_id
        # NFT资产的唯一id
        self.nft_id = nft_id

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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
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
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        return self


class CreateNftIssuerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        sku_name: str = None,
        sku_type: str = None,
        quantity: int = None,
        author: str = None,
        issuer_name: str = None,
        sku_descrption: str = None,
        jump_url: str = None,
        biz_type: str = None,
        files: List[File] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户发行NFT的唯一编号
        self.project_id = project_id
        # NFT商品的名称
        self.sku_name = sku_name
        # NFT资产类型, 含IMAGE、VIDEO、FILE、AUDIO、THREE_DIMENSIONS等
        self.sku_type = sku_type
        # 铸造数量，100起
        self.quantity = quantity
        # NFT创作者
        self.author = author
        # 发行方名称
        self.issuer_name = issuer_name
        # NFT商品的描述
        self.sku_descrption = sku_descrption
        # 跳转链接
        self.jump_url = jump_url
        # 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，NFT_CUSTOMIZE（NFT定制）
        self.biz_type = biz_type
        # 素材文件结构
        self.files = files

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.sku_name, 'sku_name')
        self.validate_required(self.sku_type, 'sku_type')
        self.validate_required(self.quantity, 'quantity')
        self.validate_required(self.author, 'author')
        self.validate_required(self.issuer_name, 'issuer_name')
        self.validate_required(self.sku_descrption, 'sku_descrption')
        self.validate_required(self.files, 'files')
        if self.files:
            for k in self.files:
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
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.sku_type is not None:
            result['sku_type'] = self.sku_type
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.author is not None:
            result['author'] = self.author
        if self.issuer_name is not None:
            result['issuer_name'] = self.issuer_name
        if self.sku_descrption is not None:
            result['sku_descrption'] = self.sku_descrption
        if self.jump_url is not None:
            result['jump_url'] = self.jump_url
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        result['files'] = []
        if self.files is not None:
            for k in self.files:
                result['files'].append(k.to_map() if k else None)
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
        if m.get('author') is not None:
            self.author = m.get('author')
        if m.get('issuer_name') is not None:
            self.issuer_name = m.get('issuer_name')
        if m.get('sku_descrption') is not None:
            self.sku_descrption = m.get('sku_descrption')
        if m.get('jump_url') is not None:
            self.jump_url = m.get('jump_url')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        self.files = []
        if m.get('files') is not None:
            for k in m.get('files'):
                temp_model = File()
                self.files.append(temp_model.from_map(k))
        return self


class CreateNftIssuerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        project_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行任务编号
        self.task_id = task_id
        # 业务方发行NFT对应的唯一项目编号
        self.project_id = project_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class PagequeryNftCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page: int = None,
        page_size: int = None,
        id_no: str = None,
        id_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页码
        self.page = page
        # 页长
        self.page_size = page_size
        # 用户手机号或支付宝UID
        self.id_no = id_no
        # 用户ID类型，和id_no对应
        self.id_type = id_type

    def validate(self):
        self.validate_required(self.page, 'page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.id_no, 'id_no')
        self.validate_required(self.id_type, 'id_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.id_no is not None:
            result['id_no'] = self.id_no
        if self.id_type is not None:
            result['id_type'] = self.id_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('id_no') is not None:
            self.id_no = m.get('id_no')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        return self


class PagequeryNftCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page: int = None,
        page_size: int = None,
        total_count: int = None,
        uid: str = None,
        asset_list: List[UserAsset] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页码，查询时传入
        self.page = page
        # 页长，查询时传入
        self.page_size = page_size
        # 列表总数
        self.total_count = total_count
        # fans uid
        self.uid = uid
        # 用户资产列表
        self.asset_list = asset_list

    def validate(self):
        if self.asset_list:
            for k in self.asset_list:
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
        if self.page is not None:
            result['page'] = self.page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.uid is not None:
            result['uid'] = self.uid
        result['asset_list'] = []
        if self.asset_list is not None:
            for k in self.asset_list:
                result['asset_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page') is not None:
            self.page = m.get('page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        self.asset_list = []
        if m.get('asset_list') is not None:
            for k in m.get('asset_list'):
                temp_model = UserAsset()
                self.asset_list.append(temp_model.from_map(k))
        return self


class CreateNftPublishRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        sku_name: str = None,
        sku_type: str = None,
        quantity: int = None,
        author: str = None,
        author_type: str = None,
        issuer_name: str = None,
        sku_descrption: str = None,
        producer: str = None,
        producer_type: str = None,
        jump_url: str = None,
        biz_type: str = None,
        channel_tenant: str = None,
        files: List[File] = None,
        memo: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户发行NFT的唯一编号
        self.project_id = project_id
        # NFT商品的名称
        self.sku_name = sku_name
        # NFT资产类型, 含IMAGE(图片)、VIDEO(视频)、AUDIO(音频)、THREE_DIMENSIONS(3D模型)等
        self.sku_type = sku_type
        # 铸造数量，至少为1
        self.quantity = quantity
        # NFT创作者。中文或手机号和author_type对应
        self.author = author
        # 创作者类型。手机号或中文类型，和author对应
        self.author_type = author_type
        # 发行方名称
        self.issuer_name = issuer_name
        # NFT商品的描述
        self.sku_descrption = sku_descrption
        # 监制方。中文名或手机号，和producer_type对应
        self.producer = producer
        # 监制方类型。手机号或中文类型，和producer对应
        self.producer_type = producer_type
        # 跳转链接
        self.jump_url = jump_url
        # 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，
        self.biz_type = biz_type
        # 渠道租户
        self.channel_tenant = channel_tenant
        # 素材文件结构
        self.files = files
        # 备注信息
        self.memo = memo

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.sku_name, 'sku_name')
        self.validate_required(self.sku_type, 'sku_type')
        self.validate_required(self.quantity, 'quantity')
        self.validate_required(self.author, 'author')
        self.validate_required(self.author_type, 'author_type')
        self.validate_required(self.issuer_name, 'issuer_name')
        self.validate_required(self.sku_descrption, 'sku_descrption')
        self.validate_required(self.producer, 'producer')
        self.validate_required(self.producer_type, 'producer_type')
        self.validate_required(self.channel_tenant, 'channel_tenant')
        self.validate_required(self.files, 'files')
        if self.files:
            for k in self.files:
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
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.sku_type is not None:
            result['sku_type'] = self.sku_type
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.author is not None:
            result['author'] = self.author
        if self.author_type is not None:
            result['author_type'] = self.author_type
        if self.issuer_name is not None:
            result['issuer_name'] = self.issuer_name
        if self.sku_descrption is not None:
            result['sku_descrption'] = self.sku_descrption
        if self.producer is not None:
            result['producer'] = self.producer
        if self.producer_type is not None:
            result['producer_type'] = self.producer_type
        if self.jump_url is not None:
            result['jump_url'] = self.jump_url
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.channel_tenant is not None:
            result['channel_tenant'] = self.channel_tenant
        result['files'] = []
        if self.files is not None:
            for k in self.files:
                result['files'].append(k.to_map() if k else None)
        if self.memo is not None:
            result['memo'] = self.memo
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
        if m.get('author') is not None:
            self.author = m.get('author')
        if m.get('author_type') is not None:
            self.author_type = m.get('author_type')
        if m.get('issuer_name') is not None:
            self.issuer_name = m.get('issuer_name')
        if m.get('sku_descrption') is not None:
            self.sku_descrption = m.get('sku_descrption')
        if m.get('producer') is not None:
            self.producer = m.get('producer')
        if m.get('producer_type') is not None:
            self.producer_type = m.get('producer_type')
        if m.get('jump_url') is not None:
            self.jump_url = m.get('jump_url')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('channel_tenant') is not None:
            self.channel_tenant = m.get('channel_tenant')
        self.files = []
        if m.get('files') is not None:
            for k in m.get('files'):
                temp_model = File()
                self.files.append(temp_model.from_map(k))
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        return self


class CreateNftPublishResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        project_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发行任务编号
        self.task_id = task_id
        # 业务方发行NFT对应的唯一项目编号
        self.project_id = project_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class RunNftTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        to_id_no: str = None,
        to_id_type: str = None,
        order_no: str = None,
        price_cent: int = None,
        channel_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # NFT租户下唯一的项目编号
        self.project_id = project_id
        # 支付宝2088开头账号
        self.to_id_no = to_id_no
        # 账号类型，当前只支持支付宝账号
        self.to_id_type = to_id_type
        # 交易NFT时租户的唯一订单号
        self.order_no = order_no
        # 购买NFT的金额，单位分
        self.price_cent = price_cent
        # 渠道租户
        self.channel_tenant = channel_tenant

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.to_id_no, 'to_id_no')
        self.validate_required(self.to_id_type, 'to_id_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.channel_tenant, 'channel_tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.to_id_no is not None:
            result['to_id_no'] = self.to_id_no
        if self.to_id_type is not None:
            result['to_id_type'] = self.to_id_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.price_cent is not None:
            result['price_cent'] = self.price_cent
        if self.channel_tenant is not None:
            result['channel_tenant'] = self.channel_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('to_id_no') is not None:
            self.to_id_no = m.get('to_id_no')
        if m.get('to_id_type') is not None:
            self.to_id_type = m.get('to_id_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('price_cent') is not None:
            self.price_cent = m.get('price_cent')
        if m.get('channel_tenant') is not None:
            self.channel_tenant = m.get('channel_tenant')
        return self


class RunNftTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: str = None,
        nft_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NFT商品编码
        self.sku_id = sku_id
        # 发放的NFT编码
        self.nft_id = nft_id

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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
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
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        return self


class ApplyNftTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sku_id: int = None,
        to_id_no: str = None,
        to_id_type: str = None,
        order_no: str = None,
        price_cent: int = None,
        channel_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # NFT发行成功的商品id
        self.sku_id = sku_id
        # C端用户的支付宝uid
        self.to_id_no = to_id_no
        # 仅支持 支付宝账号类型
        self.to_id_type = to_id_type
        # 用户在商户购买的订单号，用作幂等字段
        self.order_no = order_no
        # 用户购买订单的价格，单位为分，可以为0；
        self.price_cent = price_cent
        # 渠道租户
        self.channel_tenant = channel_tenant

    def validate(self):
        self.validate_required(self.sku_id, 'sku_id')
        self.validate_required(self.to_id_no, 'to_id_no')
        self.validate_required(self.to_id_type, 'to_id_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.channel_tenant, 'channel_tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.to_id_no is not None:
            result['to_id_no'] = self.to_id_no
        if self.to_id_type is not None:
            result['to_id_type'] = self.to_id_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.price_cent is not None:
            result['price_cent'] = self.price_cent
        if self.channel_tenant is not None:
            result['channel_tenant'] = self.channel_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('to_id_no') is not None:
            self.to_id_no = m.get('to_id_no')
        if m.get('to_id_type') is not None:
            self.to_id_type = m.get('to_id_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('price_cent') is not None:
            self.price_cent = m.get('price_cent')
        if m.get('channel_tenant') is not None:
            self.channel_tenant = m.get('channel_tenant')
        return self


class ApplyNftTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: int = None,
        nft_id: str = None,
        uid: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NFT发行成功的商品id
        self.sku_id = sku_id
        # NFT发行成功的商品，其中转给C端用户的特定一个token
        self.nft_id = nft_id
        # fans uid
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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
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
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        return self


class ApplyNftTransferbyprojectwithchanneltenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        to_id_no: str = None,
        to_id_type: str = None,
        order_no: str = None,
        price_cent: int = None,
        channel_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # NFT租户下唯一的项目编号
        self.project_id = project_id
        # 支付宝2088开头账号
        self.to_id_no = to_id_no
        # 账号类型，当前只支持支付宝账号
        self.to_id_type = to_id_type
        # 交易NFT时租户的唯一订单号
        self.order_no = order_no
        # 购买NFT的金额，单位分
        self.price_cent = price_cent
        # 渠道租户
        self.channel_tenant = channel_tenant

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.to_id_no, 'to_id_no')
        self.validate_required(self.to_id_type, 'to_id_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.channel_tenant, 'channel_tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.to_id_no is not None:
            result['to_id_no'] = self.to_id_no
        if self.to_id_type is not None:
            result['to_id_type'] = self.to_id_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.price_cent is not None:
            result['price_cent'] = self.price_cent
        if self.channel_tenant is not None:
            result['channel_tenant'] = self.channel_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('to_id_no') is not None:
            self.to_id_no = m.get('to_id_no')
        if m.get('to_id_type') is not None:
            self.to_id_type = m.get('to_id_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('price_cent') is not None:
            self.price_cent = m.get('price_cent')
        if m.get('channel_tenant') is not None:
            self.channel_tenant = m.get('channel_tenant')
        return self


class ApplyNftTransferbyprojectwithchanneltenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sku_id: str = None,
        nft_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # NFT商品编码
        self.sku_id = sku_id
        # 发放的NFT编码
        self.nft_id = nft_id

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
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
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
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        return self


class QueryNftAssetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        access_token: str = None,
        nft_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 基于租户Id生成的对应访问服务端的accessToken
        self.access_token = access_token
        # 对应此藏品的nftId
        self.nft_id = nft_id

    def validate(self):
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.nft_id, 'nft_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        return self


class QueryNftAssetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nft_id: str = None,
        sku_name: str = None,
        sku_id: int = None,
        uni_hash: str = None,
        creation_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 藏品ID
        self.nft_id = nft_id
        # 藏品名称
        self.sku_name = sku_name
        # 藏品SKU ID
        self.sku_id = sku_id
        # 此藏品对应的uniHash值
        self.uni_hash = uni_hash
        # 藏品铸造时间
        self.creation_time = creation_time

    def validate(self):
        if self.creation_time is not None:
            self.validate_pattern(self.creation_time, 'creation_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.uni_hash is not None:
            result['uni_hash'] = self.uni_hash
        if self.creation_time is not None:
            result['creation_time'] = self.creation_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('sku_name') is not None:
            self.sku_name = m.get('sku_name')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('uni_hash') is not None:
            self.uni_hash = m.get('uni_hash')
        if m.get('creation_time') is not None:
            self.creation_time = m.get('creation_time')
        return self


class QueryNftAssetbyskuRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_no: str = None,
        id_type: str = None,
        sku_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 手机号或者支付宝uid或者open_uid
        self.id_no = id_no
        # 用户id类型
        self.id_type = id_type
        # sku_meta的ip_id
        self.sku_id = sku_id

    def validate(self):
        self.validate_required(self.id_no, 'id_no')
        self.validate_required(self.id_type, 'id_type')
        self.validate_required(self.sku_id, 'sku_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id_no is not None:
            result['id_no'] = self.id_no
        if self.id_type is not None:
            result['id_type'] = self.id_type
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_no') is not None:
            self.id_no = m.get('id_no')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        return self


class QueryNftAssetbyskuResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        asset_list: List[UserAsset] = None,
        alipay_uid: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户资产列表信息
        self.asset_list = asset_list
        # 支付宝账户id，特殊场景返回
        self.alipay_uid = alipay_uid

    def validate(self):
        if self.asset_list:
            for k in self.asset_list:
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
        result['asset_list'] = []
        if self.asset_list is not None:
            for k in self.asset_list:
                result['asset_list'].append(k.to_map() if k else None)
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.asset_list = []
        if m.get('asset_list') is not None:
            for k in m.get('asset_list'):
                temp_model = UserAsset()
                self.asset_list.append(temp_model.from_map(k))
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        return self


class PayOrderDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        external_order_no: str = None,
        amount_cent: int = None,
        pay_channel: str = None,
        subject: str = None,
        timeout_expire_second: int = None,
        access_token: str = None,
        return_url: str = None,
        nft_id: str = None,
        item_code: str = None,
        item_num: int = None,
        item_price_cent: int = None,
        resource_id: str = None,
        resource_type: str = None,
        wap_pay_use_get: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 接入方测订单号，保证全局唯一
        self.external_order_no = external_order_no
        # 订单金额，单位为分
        self.amount_cent = amount_cent
        # ALIPAY 表示小程序支付，ALIPAY_APP表示App支付, ALIPAY_WAP表示手机网站支付
        self.pay_channel = pay_channel
        # 订单标题，支付宝账单会展示
        self.subject = subject
        # 订单超时时间，秒级
        self.timeout_expire_second = timeout_expire_second
        # 接入方存储的accessToken
        self.access_token = access_token
        # 支付完成后的回跳地址
        self.return_url = return_url
        # AC编码
        self.nft_id = nft_id
        # 鲸探测分配的实物规格编码
        self.item_code = item_code
        # 用户购买的商品个数
        self.item_num = item_num
        # 商品单价，单位分
        self.item_price_cent = item_price_cent
        # 资源ID
        self.resource_id = resource_id
        # 根据实际情况传递
        self.resource_type = resource_type
        # 是否使用GET方法支持wap支付
        self.wap_pay_use_get = wap_pay_use_get

    def validate(self):
        self.validate_required(self.external_order_no, 'external_order_no')
        self.validate_required(self.amount_cent, 'amount_cent')
        self.validate_required(self.pay_channel, 'pay_channel')
        self.validate_required(self.subject, 'subject')
        self.validate_required(self.timeout_expire_second, 'timeout_expire_second')
        self.validate_required(self.access_token, 'access_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.external_order_no is not None:
            result['external_order_no'] = self.external_order_no
        if self.amount_cent is not None:
            result['amount_cent'] = self.amount_cent
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        if self.subject is not None:
            result['subject'] = self.subject
        if self.timeout_expire_second is not None:
            result['timeout_expire_second'] = self.timeout_expire_second
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.item_code is not None:
            result['item_code'] = self.item_code
        if self.item_num is not None:
            result['item_num'] = self.item_num
        if self.item_price_cent is not None:
            result['item_price_cent'] = self.item_price_cent
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        if self.wap_pay_use_get is not None:
            result['wap_pay_use_get'] = self.wap_pay_use_get
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('external_order_no') is not None:
            self.external_order_no = m.get('external_order_no')
        if m.get('amount_cent') is not None:
            self.amount_cent = m.get('amount_cent')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        if m.get('subject') is not None:
            self.subject = m.get('subject')
        if m.get('timeout_expire_second') is not None:
            self.timeout_expire_second = m.get('timeout_expire_second')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('item_code') is not None:
            self.item_code = m.get('item_code')
        if m.get('item_num') is not None:
            self.item_num = m.get('item_num')
        if m.get('item_price_cent') is not None:
            self.item_price_cent = m.get('item_price_cent')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        if m.get('wap_pay_use_get') is not None:
            self.wap_pay_use_get = m.get('wap_pay_use_get')
        return self


class PayOrderDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        open_order_no: str = None,
        pay_params: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 鲸探开放平台内部订单号
        self.open_order_no = open_order_no
        # json字符串
        self.pay_params = pay_params

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
        if self.open_order_no is not None:
            result['open_order_no'] = self.open_order_no
        if self.pay_params is not None:
            result['pay_params'] = self.pay_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('open_order_no') is not None:
            self.open_order_no = m.get('open_order_no')
        if m.get('pay_params') is not None:
            self.pay_params = m.get('pay_params')
        return self


class SyncOrderDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        external_order_no: str = None,
        external_order_status: str = None,
        open_order_no: str = None,
        open_user_id: str = None,
        update_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 接入方的订单号
        self.external_order_no = external_order_no
        # 目前支持两种状态 PAID、PAY_CANCEL
        self.external_order_status = external_order_status
        # 鲸探开放平台订单号
        self.open_order_no = open_order_no
        # 鲸探授权的用户加密的uid
        self.open_user_id = open_user_id
        # 同步改状态时的事件毫秒时间戳
        self.update_time = update_time

    def validate(self):
        self.validate_required(self.external_order_no, 'external_order_no')
        self.validate_required(self.external_order_status, 'external_order_status')
        self.validate_required(self.open_user_id, 'open_user_id')
        self.validate_required(self.update_time, 'update_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.external_order_no is not None:
            result['external_order_no'] = self.external_order_no
        if self.external_order_status is not None:
            result['external_order_status'] = self.external_order_status
        if self.open_order_no is not None:
            result['open_order_no'] = self.open_order_no
        if self.open_user_id is not None:
            result['open_user_id'] = self.open_user_id
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('external_order_no') is not None:
            self.external_order_no = m.get('external_order_no')
        if m.get('external_order_status') is not None:
            self.external_order_status = m.get('external_order_status')
        if m.get('open_order_no') is not None:
            self.open_order_no = m.get('open_order_no')
        if m.get('open_user_id') is not None:
            self.open_user_id = m.get('open_user_id')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class SyncOrderDataResponse(TeaModel):
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


class QueryResourceImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        access_token: str = None,
        type: str = None,
        resource_id: str = None,
        nft_id: str = None,
        need_hd_img: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # access_token
        self.access_token = access_token
        # 素材的类型（AIGC/NFT）
        self.type = type
        # 资源ID
        self.resource_id = resource_id
        # type为NFT必填
        self.nft_id = nft_id
        # 是否需要高清图
        self.need_hd_img = need_hd_img

    def validate(self):
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.type, 'type')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.need_hd_img, 'need_hd_img')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.type is not None:
            result['type'] = self.type
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.need_hd_img is not None:
            result['need_hd_img'] = self.need_hd_img
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('need_hd_img') is not None:
            self.need_hd_img = m.get('need_hd_img')
        return self


class QueryResourceImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nft_id: str = None,
        sku_name: str = None,
        uni_hash: str = None,
        creation_time: str = None,
        img_urls: List[CToMResourceImg] = None,
        high_definition_status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # nftID 藏品素材nftId，type为NFT时有值
        self.nft_id = nft_id
        # 具体藏品名称，type为NFT时有值
        self.sku_name = sku_name
        # nftId 的 算法计算的hash，该藏品唯一标识，type为NFT时有值
        self.uni_hash = uni_hash
        # Date	藏品铸造上链生成时间，例如2021.09.22 20:22:19，type为NFT时有值
        self.creation_time = creation_time
        # url列表
        self.img_urls = img_urls
        # int	高清图状态
        # 0 需要等待
        # 1 已完成
        self.high_definition_status = high_definition_status

    def validate(self):
        if self.creation_time is not None:
            self.validate_pattern(self.creation_time, 'creation_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.img_urls:
            for k in self.img_urls:
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
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.sku_name is not None:
            result['sku_name'] = self.sku_name
        if self.uni_hash is not None:
            result['uni_hash'] = self.uni_hash
        if self.creation_time is not None:
            result['creation_time'] = self.creation_time
        result['img_urls'] = []
        if self.img_urls is not None:
            for k in self.img_urls:
                result['img_urls'].append(k.to_map() if k else None)
        if self.high_definition_status is not None:
            result['high_definition_status'] = self.high_definition_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('sku_name') is not None:
            self.sku_name = m.get('sku_name')
        if m.get('uni_hash') is not None:
            self.uni_hash = m.get('uni_hash')
        if m.get('creation_time') is not None:
            self.creation_time = m.get('creation_time')
        self.img_urls = []
        if m.get('img_urls') is not None:
            for k in m.get('img_urls'):
                temp_model = CToMResourceImg()
                self.img_urls.append(temp_model.from_map(k))
        if m.get('high_definition_status') is not None:
            self.high_definition_status = m.get('high_definition_status')
        return self


class ImportResourceConsigneeinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        phone: str = None,
        delivery_address: str = None,
        email: str = None,
        lucky_phone: str = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 姓名
        self.name = name
        # 手机号
        self.phone = phone
        # 收货地址
        self.delivery_address = delivery_address
        # email
        self.email = email
        # 中奖人手机号
        self.lucky_phone = lucky_phone
        # 单据号，幂等用
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.delivery_address, 'delivery_address')
        self.validate_required(self.email, 'email')
        self.validate_required(self.lucky_phone, 'lucky_phone')
        self.validate_required(self.biz_no, 'biz_no')

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
        if self.phone is not None:
            result['phone'] = self.phone
        if self.delivery_address is not None:
            result['delivery_address'] = self.delivery_address
        if self.email is not None:
            result['email'] = self.email
        if self.lucky_phone is not None:
            result['lucky_phone'] = self.lucky_phone
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('delivery_address') is not None:
            self.delivery_address = m.get('delivery_address')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('lucky_phone') is not None:
            self.lucky_phone = m.get('lucky_phone')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class ImportResourceConsigneeinfoResponse(TeaModel):
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


class UpdateNftPropertyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_no: str = None,
        id_type: str = None,
        nft_id: str = None,
        source: str = None,
        update_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id标识
        self.id_no = id_no
        # 用户id类型
        self.id_type = id_type
        # 资产标识
        self.nft_id = nft_id
        # 更新的来源
        self.source = source
        # Json字符串：通过解析该字段，根据提前约定的key进行取值操作
        self.update_info = update_info

    def validate(self):
        self.validate_required(self.id_no, 'id_no')
        self.validate_required(self.id_type, 'id_type')
        self.validate_required(self.nft_id, 'nft_id')
        self.validate_required(self.source, 'source')
        self.validate_required(self.update_info, 'update_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id_no is not None:
            result['id_no'] = self.id_no
        if self.id_type is not None:
            result['id_type'] = self.id_type
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.source is not None:
            result['source'] = self.source
        if self.update_info is not None:
            result['update_info'] = self.update_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_no') is not None:
            self.id_no = m.get('id_no')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('update_info') is not None:
            self.update_info = m.get('update_info')
        return self


class UpdateNftPropertyResponse(TeaModel):
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


class ApplyOauthTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        grant_type: str = None,
        auth_code: str = None,
        refresh_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。
        # 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
        # 本期只支持authorization_code
        self.grant_type = grant_type
        # 授权码，用户对应用授权后得到。
        # 本参数在 grant_type 为 authorization_code 时必填；为 refresh_token 时不填。
        self.auth_code = auth_code
        # 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填
        self.refresh_token = refresh_token

    def validate(self):
        self.validate_required(self.grant_type, 'grant_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.grant_type is not None:
            result['grant_type'] = self.grant_type
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        if self.refresh_token is not None:
            result['refresh_token'] = self.refresh_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('grant_type') is not None:
            self.grant_type = m.get('grant_type')
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        if m.get('refresh_token') is not None:
            self.refresh_token = m.get('refresh_token')
        return self


class ApplyOauthTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_token: str = None,
        expire_time: str = None,
        open_user_id: str = None,
        refresh_token: str = None,
        refresh_expire_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 后续调用接口鉴权的token
        self.access_token = access_token
        # 到期时间
        self.expire_time = expire_time
        # openuid
        self.open_user_id = open_user_id
        # 预留字段，本期不使用
        self.refresh_token = refresh_token
        # 预留字段，本期不使用
        self.refresh_expire_time = refresh_expire_time

    def validate(self):
        if self.expire_time is not None:
            self.validate_pattern(self.expire_time, 'expire_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.refresh_expire_time is not None:
            self.validate_pattern(self.refresh_expire_time, 'refresh_expire_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.open_user_id is not None:
            result['open_user_id'] = self.open_user_id
        if self.refresh_token is not None:
            result['refresh_token'] = self.refresh_token
        if self.refresh_expire_time is not None:
            result['refresh_expire_time'] = self.refresh_expire_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('open_user_id') is not None:
            self.open_user_id = m.get('open_user_id')
        if m.get('refresh_token') is not None:
            self.refresh_token = m.get('refresh_token')
        if m.get('refresh_expire_time') is not None:
            self.refresh_expire_time = m.get('refresh_expire_time')
        return self


class QueryOauthUserinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        access_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权token
        self.access_token = access_token

    def validate(self):
        self.validate_required(self.access_token, 'access_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class QueryOauthUserinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nick_name: str = None,
        avatar: str = None,
        open_user_id: str = None,
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
        # open_user_id
        self.open_user_id = open_user_id

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
        if self.open_user_id is not None:
            result['open_user_id'] = self.open_user_id
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
        if m.get('open_user_id') is not None:
            self.open_user_id = m.get('open_user_id')
        return self


