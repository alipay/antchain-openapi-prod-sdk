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


class BlockchainInfoDTO(TeaModel):
    def __init__(
        self,
        tx_hash: str = None,
        tx_time: int = None,
    ):
        # 交易hash
        self.tx_hash = tx_hash
        # 交易时间戳
        self.tx_time = tx_time

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.tx_time, 'tx_time')

    def to_map(self):
        result = dict()
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
        return self


class GoodsDTO(TeaModel):
    def __init__(
        self,
        goods_id: str = None,
        template_id: str = None,
        content: str = None,
        qr_code: str = None,
        blockchain_info: BlockchainInfoDTO = None,
    ):
        # 商品id
        self.goods_id = goods_id
        # 商品模板id
        self.template_id = template_id
        # 商品内容
        self.content = content
        # 二维码地址
        self.qr_code = qr_code
        # 区块链信息
        self.blockchain_info = blockchain_info

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.qr_code, 'qr_code')
        self.validate_required(self.blockchain_info, 'blockchain_info')
        if self.blockchain_info:
            self.blockchain_info.validate()

    def to_map(self):
        result = dict()
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.content is not None:
            result['content'] = self.content
        if self.qr_code is not None:
            result['qr_code'] = self.qr_code
        if self.blockchain_info is not None:
            result['blockchain_info'] = self.blockchain_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('qr_code') is not None:
            self.qr_code = m.get('qr_code')
        if m.get('blockchain_info') is not None:
            temp_model = BlockchainInfoDTO()
            self.blockchain_info = temp_model.from_map(m['blockchain_info'])
        return self


class TraceInfoDTO(TeaModel):
    def __init__(
        self,
        operate_type_desc: str = None,
        operate_time: int = None,
        operator_id: str = None,
        operator_name: str = None,
        content: str = None,
    ):
        # 操作描述
        self.operate_type_desc = operate_type_desc
        # 操作时间，时间戳
        self.operate_time = operate_time
        # 操作人id
        self.operator_id = operator_id
        # 操作人名称
        self.operator_name = operator_name
        # 操作内容
        self.content = content

    def validate(self):
        self.validate_required(self.operate_type_desc, 'operate_type_desc')
        self.validate_required(self.operate_time, 'operate_time')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.operator_name, 'operator_name')
        self.validate_required(self.content, 'content')

    def to_map(self):
        result = dict()
        if self.operate_type_desc is not None:
            result['operate_type_desc'] = self.operate_type_desc
        if self.operate_time is not None:
            result['operate_time'] = self.operate_time
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.operator_name is not None:
            result['operator_name'] = self.operator_name
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('operate_type_desc') is not None:
            self.operate_type_desc = m.get('operate_type_desc')
        if m.get('operate_time') is not None:
            self.operate_time = m.get('operate_time')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('operator_name') is not None:
            self.operator_name = m.get('operator_name')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class GoodsTemplateDTO(TeaModel):
    def __init__(
        self,
        template_id: str = None,
        name: str = None,
        content: str = None,
    ):
        # 模板id
        self.template_id = template_id
        # 商品名称
        self.name = name
        # 商品模板描述
        self.content = content

    def validate(self):
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.content, 'content')

    def to_map(self):
        result = dict()
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.name is not None:
            result['name'] = self.name
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class CreateLeagueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_type: str = None,
        league_name: str = None,
        scene_desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 酒证:WINE_ASSET,茶证:TEA_ASSET,艺术物证:ARTISTIC_ASSET
        self.scene_type = scene_type
        # 联盟名称
        self.league_name = league_name
        # 黄酒集市
        self.scene_desc = scene_desc

    def validate(self):
        self.validate_required(self.scene_type, 'scene_type')
        self.validate_required(self.league_name, 'league_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_type is not None:
            result['scene_type'] = self.scene_type
        if self.league_name is not None:
            result['league_name'] = self.league_name
        if self.scene_desc is not None:
            result['scene_desc'] = self.scene_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_type') is not None:
            self.scene_type = m.get('scene_type')
        if m.get('league_name') is not None:
            self.league_name = m.get('league_name')
        if m.get('scene_desc') is not None:
            self.scene_desc = m.get('scene_desc')
        return self


class CreateLeagueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        league_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 联盟id
        self.league_id = league_id

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
        if self.league_id is not None:
            result['league_id'] = self.league_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        return self


class CancelLeagueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        league_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟id
        self.league_id = league_id

    def validate(self):
        self.validate_required(self.league_id, 'league_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.league_id is not None:
            result['league_id'] = self.league_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        return self


class CancelLeagueResponse(TeaModel):
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


class CreateUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_name: str = None,
        league_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        phone: str = None,
        email: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户昵称
        self.user_name = user_name
        # 联盟id
        self.league_id = league_id
        # 真实姓名
        self.cert_name = cert_name
        # 身份证号
        self.cert_no = cert_no
        # 手机号
        self.phone = phone
        # 邮箱
        self.email = email

    def validate(self):
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.league_id, 'league_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.league_id is not None:
            result['league_id'] = self.league_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.phone is not None:
            result['phone'] = self.phone
        if self.email is not None:
            result['email'] = self.email
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('email') is not None:
            self.email = m.get('email')
        return self


class CreateUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户id
        self.user_id = user_id

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
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class UpdateUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        user_name: str = None,
        cert_name: str = None,
        cert_no: str = None,
        phone: str = None,
        email: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 用户昵称
        self.user_name = user_name
        # 真实姓名
        self.cert_name = cert_name
        # 身份证号
        self.cert_no = cert_no
        # 手机号
        self.phone = phone
        # 邮箱
        self.email = email

    def validate(self):
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.phone is not None:
            result['phone'] = self.phone
        if self.email is not None:
            result['email'] = self.email
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('email') is not None:
            self.email = m.get('email')
        return self


class UpdateUserResponse(TeaModel):
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


class BindUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        platform: str = None,
        open_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 支付宝：ALIPAY
        self.platform = platform
        # 开放平台用户id
        self.open_id = open_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.platform, 'platform')
        self.validate_required(self.open_id, 'open_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.platform is not None:
            result['platform'] = self.platform
        if self.open_id is not None:
            result['open_id'] = self.open_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('platform') is not None:
            self.platform = m.get('platform')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        return self


class BindUserResponse(TeaModel):
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


class UnbindUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        platform: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 支付宝：ALIPAY
        self.platform = platform

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.platform, 'platform')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.platform is not None:
            result['platform'] = self.platform
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('platform') is not None:
            self.platform = m.get('platform')
        return self


class UnbindUserResponse(TeaModel):
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


class CreateGoodstemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        content: str = None,
        league_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品名称
        self.name = name
        # 商品定义描述，格式如示例
        self.content = content
        # 联盟id
        self.league_id = league_id

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.content, 'content')
        self.validate_required(self.league_id, 'league_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.content is not None:
            result['content'] = self.content
        if self.league_id is not None:
            result['league_id'] = self.league_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('league_id') is not None:
            self.league_id = m.get('league_id')
        return self


class CreateGoodstemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板id
        self.template_id = template_id

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
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class UpdateGoodstemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_id: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模板id
        self.template_id = template_id
        # 商品定义描述，格式如示例
        self.content = content

    def validate(self):
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.content, 'content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class UpdateGoodstemplateResponse(TeaModel):
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


class CancelGoodstemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模板id
        self.template_id = template_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class CancelGoodstemplateResponse(TeaModel):
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


class QueryGoodstemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_id: str = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品模板id，如果传入这个字段，返回的列表只有一条数据
        self.template_id = template_id
        # 当前页数
        self.current_page = current_page
        # 每页大小，最大为20
        self.page_size = page_size

    def validate(self):
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 20)
            self.validate_minimum(self.page_size, 'page_size', 1)

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryGoodstemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        goodstemplate_list: List[GoodsTemplateDTO] = None,
        total_page: int = None,
        current_page: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品模板列表
        self.goodstemplate_list = goodstemplate_list
        # 总页数
        self.total_page = total_page
        # 当前页数
        self.current_page = current_page

    def validate(self):
        if self.goodstemplate_list:
            for k in self.goodstemplate_list:
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
        result['goodstemplate_list'] = []
        if self.goodstemplate_list is not None:
            for k in self.goodstemplate_list:
                result['goodstemplate_list'].append(k.to_map() if k else None)
        if self.total_page is not None:
            result['total_page'] = self.total_page
        if self.current_page is not None:
            result['current_page'] = self.current_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.goodstemplate_list = []
        if m.get('goodstemplate_list') is not None:
            for k in m.get('goodstemplate_list'):
                temp_model = GoodsTemplateDTO()
                self.goodstemplate_list.append(temp_model.from_map(k))
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        return self


class CreateGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_id: str = None,
        user_id: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品模板id
        self.template_id = template_id
        # 用户id
        self.user_id = user_id
        # 商品信息
        self.content = content

    def validate(self):
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.content, 'content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class CreateGoodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        goods_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品id
        self.goods_id = goods_id

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
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        return self


class UpdateGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        goods_id: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品id
        self.goods_id = goods_id
        # 商品详情
        self.content = content

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')
        self.validate_required(self.content, 'content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class UpdateGoodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        blockchain_info: BlockchainInfoDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链交易信息
        self.blockchain_info = blockchain_info

    def validate(self):
        if self.blockchain_info:
            self.blockchain_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.blockchain_info is not None:
            result['blockchain_info'] = self.blockchain_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('blockchain_info') is not None:
            temp_model = BlockchainInfoDTO()
            self.blockchain_info = temp_model.from_map(m['blockchain_info'])
        return self


class SendGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        goods_id: str = None,
        transferee_id: str = None,
        amount: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品id
        self.goods_id = goods_id
        # 接收人用户id
        self.transferee_id = transferee_id
        # 转让金额，单位分
        self.amount = amount

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')
        self.validate_required(self.transferee_id, 'transferee_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.transferee_id is not None:
            result['transferee_id'] = self.transferee_id
        if self.amount is not None:
            result['amount'] = self.amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('transferee_id') is not None:
            self.transferee_id = m.get('transferee_id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        return self


class SendGoodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        blockchain_info: BlockchainInfoDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 区块链交易信息
        self.blockchain_info = blockchain_info

    def validate(self):
        if self.blockchain_info:
            self.blockchain_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.blockchain_info is not None:
            result['blockchain_info'] = self.blockchain_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('blockchain_info') is not None:
            temp_model = BlockchainInfoDTO()
            self.blockchain_info = temp_model.from_map(m['blockchain_info'])
        return self


class QueryGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        goods_id: str = None,
        trace_type: str = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品id
        self.goods_id = goods_id
        # 溯源信息枚举：ASSET_ONLY，只返回物权信息；LIST_ROAM_TRACE，转让溯源信息；LIST_TRACE，所有溯源信息；ASSET_ALL，返回以上所有信息（默认）
        self.trace_type = trace_type
        # 当前页（默认为1）
        self.current_page = current_page
        # 页大小（默认为10）
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.trace_type is not None:
            result['trace_type'] = self.trace_type
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('trace_type') is not None:
            self.trace_type = m.get('trace_type')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryGoodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        goods: GoodsDTO = None,
        trace_info_list: List[TraceInfoDTO] = None,
        roam_trace_list: List[TraceInfoDTO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品信息
        self.goods = goods
        # 溯源信息列表
        self.trace_info_list = trace_info_list
        # 流转信息列表
        self.roam_trace_list = roam_trace_list

    def validate(self):
        if self.goods:
            self.goods.validate()
        if self.trace_info_list:
            for k in self.trace_info_list:
                if k:
                    k.validate()
        if self.roam_trace_list:
            for k in self.roam_trace_list:
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
        if self.goods is not None:
            result['goods'] = self.goods.to_map()
        result['trace_info_list'] = []
        if self.trace_info_list is not None:
            for k in self.trace_info_list:
                result['trace_info_list'].append(k.to_map() if k else None)
        result['roam_trace_list'] = []
        if self.roam_trace_list is not None:
            for k in self.roam_trace_list:
                result['roam_trace_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('goods') is not None:
            temp_model = GoodsDTO()
            self.goods = temp_model.from_map(m['goods'])
        self.trace_info_list = []
        if m.get('trace_info_list') is not None:
            for k in m.get('trace_info_list'):
                temp_model = TraceInfoDTO()
                self.trace_info_list.append(temp_model.from_map(k))
        self.roam_trace_list = []
        if m.get('roam_trace_list') is not None:
            for k in m.get('roam_trace_list'):
                temp_model = TraceInfoDTO()
                self.roam_trace_list.append(temp_model.from_map(k))
        return self


class PagequeryGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        current_page: int = None,
        page_size: int = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 当前页
        self.current_page = current_page
        # 每页大小，最大20
        self.page_size = page_size
        # 数据范围类型：ALL_ASSET，所有物证；EFFECTIVE_ASSET，已生效物证；INVALID_ASSET，已失效物证。
        self.type = type

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 20)
            self.validate_minimum(self.page_size, 'page_size', 1)
        self.validate_required(self.type, 'type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class PagequeryGoodsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        total_page: int = None,
        goods_list: List[GoodsDTO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页
        self.current_page = current_page
        # 总页数
        self.total_page = total_page
        # 商品列表
        self.goods_list = goods_list

    def validate(self):
        if self.goods_list:
            for k in self.goods_list:
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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['goods_list'] = []
        if self.goods_list is not None:
            for k in self.goods_list:
                result['goods_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.goods_list = []
        if m.get('goods_list') is not None:
            for k in m.get('goods_list'):
                temp_model = GoodsDTO()
                self.goods_list.append(temp_model.from_map(k))
        return self


class CreateGoodsOperateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        goods_id: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品id
        self.goods_id = goods_id
        # 操作内容
        self.content = content

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')
        self.validate_required(self.content, 'content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class CreateGoodsOperateResponse(TeaModel):
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


class CancelGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        goods_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品核销
        self.goods_id = goods_id

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        return self


class CancelGoodsResponse(TeaModel):
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


class DisableGoodsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        goods_id: str = None,
        status_desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商品id
        self.goods_id = goods_id
        # 异常状态描述
        self.status_desc = status_desc

    def validate(self):
        self.validate_required(self.goods_id, 'goods_id')
        self.validate_required(self.status_desc, 'status_desc')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.goods_id is not None:
            result['goods_id'] = self.goods_id
        if self.status_desc is not None:
            result['status_desc'] = self.status_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('goods_id') is not None:
            self.goods_id = m.get('goods_id')
        if m.get('status_desc') is not None:
            self.status_desc = m.get('status_desc')
        return self


class DisableGoodsResponse(TeaModel):
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


