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


class InitFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
        identity_param: str = None,
        metainfo: str = None,
        operation_type: str = None,
        ref_img: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # metainfo环境参数
        self.metainfo = metainfo
        # 操作类型
        # 
        self.operation_type = operation_type
        # 比对源图片
        # 
        self.ref_img = ref_img

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.identity_param, 'identity_param')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        return self


class InitFaceauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        zim_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        # 
        self.result_msg_sub = result_msg_sub
        # 实人认证id
        self.zim_id = zim_id

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class QueryFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
        zim_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务单据号，用于核对和排查
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # zimId，用于查询认证结果
        self.zim_id = zim_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.zim_id, 'zim_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class QueryFaceauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class InitFaceplusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        identity_param: str = None,
        metainfo: str = None,
        extern_param: str = None,
        operation_type: str = None,
        ref_img: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务唯一单号
        self.biz_id = biz_id
        # 身份，需要公钥加密
        self.identity_param = identity_param
        # 客户端采集
        self.metainfo = metainfo
        # 外部参数
        self.extern_param = extern_param
        # 操作类型
        self.operation_type = operation_type
        # 比对源图片
        self.ref_img = ref_img

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.identity_param, 'identity_param')
        self.validate_required(self.metainfo, 'metainfo')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        return self


class InitFaceplusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        zim_id: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证会话唯一标识
        self.zim_id = zim_id
        # 结果码
        self.result_code_sub = result_code_sub
        # 结果信息
        # 
        self.result_msg_sub = result_msg_sub
        # 外部参数
        self.extern_info = extern_info

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
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class QueryFaceplusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        zim_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证会话唯一标识
        self.zim_id = zim_id
        # 唯一单号
        self.biz_id = biz_id
        # 外部参数
        # 
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.zim_id, 'zim_id')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class QueryFaceplusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.result_code_sub = result_code_sub
        # 结果信息
        self.result_msg_sub = result_msg_sub
        # 外部参数
        # 
        self.extern_info = extern_info

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
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class QueryFaceauthFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        zim_id: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # zoloz认证会话主键
        self.zim_id = zim_id
        # 预留扩展业务参数
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.zim_id, 'zim_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class QueryFaceauthFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 结果码
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class CertifyServermodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        extern_param: str = None,
        identity_param: str = None,
        auth_img: str = None,
        auth_img_type: str = None,
        operation_type: str = None,
        ref_img: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # 待认证图片，默认base64格式
        self.auth_img = auth_img
        # 待认证图片类型，不传默认为base64后的图片，可以扩展Blob/video等类型
        self.auth_img_type = auth_img_type
        # 操作类型，operation_type为custom时表示自定义模式，需要用户上传比对源图片
        self.operation_type = operation_type
        # 比对源图片
        self.ref_img = ref_img

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.extern_param, 'extern_param')
        self.validate_required(self.identity_param, 'identity_param')
        self.validate_required(self.auth_img, 'auth_img')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.auth_img is not None:
            result['auth_img'] = self.auth_img
        if self.auth_img_type is not None:
            result['auth_img_type'] = self.auth_img_type
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('auth_img') is not None:
            self.auth_img = m.get('auth_img')
        if m.get('auth_img_type') is not None:
            self.auth_img_type = m.get('auth_img_type')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        return self


class CertifyServermodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class InitCertifyrecordRealpersonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        charge_code: str = None,
        extern_param: str = None,
        identity_param: str = None,
        metainfo: str = None,
        operation_type: str = None,
        ref_img: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 计费规则码
        self.charge_code = charge_code
        # 
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # metainfo环境参数
        self.metainfo = metainfo
        # 操作类型
        self.operation_type = operation_type
        # 比对源图片
        self.ref_img = ref_img

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.charge_code, 'charge_code')
        self.validate_required(self.identity_param, 'identity_param')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.charge_code is not None:
            result['charge_code'] = self.charge_code
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('charge_code') is not None:
            self.charge_code = m.get('charge_code')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        return self


class InitCertifyrecordRealpersonResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        certify_id: str = None,
        certify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub
        # 认证单据号
        self.certify_id = certify_id
        # 认证h5 url
        self.certify_url = certify_url

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.certify_url is not None:
            result['certify_url'] = self.certify_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('certify_url') is not None:
            self.certify_url = m.get('certify_url')
        return self


class InitCertifyrecordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        charge_code: str = None,
        extern_param: str = None,
        metainfo: str = None,
        operation_type: str = None,
        ref_img: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 计费规则码
        self.charge_code = charge_code
        # 预留扩展业务参数
        self.extern_param = extern_param
        # metainfo环境参数
        self.metainfo = metainfo
        # 操作类型
        self.operation_type = operation_type
        # 比对源图片
        self.ref_img = ref_img

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.charge_code, 'charge_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.charge_code is not None:
            result['charge_code'] = self.charge_code
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.ref_img is not None:
            result['ref_img'] = self.ref_img
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('charge_code') is not None:
            self.charge_code = m.get('charge_code')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('ref_img') is not None:
            self.ref_img = m.get('ref_img')
        return self


class InitCertifyrecordResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        certify_id: str = None,
        certify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub
        # 认证单据号
        self.certify_id = certify_id
        # 认证h5 url
        self.certify_url = certify_url

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.certify_url is not None:
            result['certify_url'] = self.certify_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('certify_url') is not None:
            self.certify_url = m.get('certify_url')
        return self


class QueryCertifyrecordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extern_param: str = None,
        certify_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # certifyId，用于查询认证结果
        self.certify_id = certify_id

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        return self


class QueryCertifyrecordResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class UploadOcrServermodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        operation_type: str = None,
        extern_param: str = None,
        content: str = None,
        content_sig: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 操作类型
        self.operation_type = operation_type
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 对称密钥加密的ocr内容
        self.content = content
        # 非对称密钥加密后的对称密钥
        self.content_sig = content_sig

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.content, 'content')
        self.validate_required(self.content_sig, 'content_sig')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.content is not None:
            result['content'] = self.content
        if self.content_sig is not None:
            result['content_sig'] = self.content_sig
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('content_sig') is not None:
            self.content_sig = m.get('content_sig')
        return self


class UploadOcrServermodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        extern_info: str = None,
        result_code_sub: str = None,
        result_msg_sub: str = None,
        certify_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.extern_info = extern_info
        # 产品结果明细，不影响决策
        self.result_code_sub = result_code_sub
        # result_code_sub对应的文案
        self.result_msg_sub = result_msg_sub
        # 认证单据号
        self.certify_id = certify_id

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
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        if self.result_code_sub is not None:
            result['result_code_sub'] = self.result_code_sub
        if self.result_msg_sub is not None:
            result['result_msg_sub'] = self.result_msg_sub
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        return self


