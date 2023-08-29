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


class InitAntchainEkycFaceauthWebsdkRequest(TeaModel):
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
        ref_img_oss_obj: str = None,
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
        self.operation_type = operation_type
        # 比对源图片
        self.ref_img = ref_img
        # 比对源照片oss方式中转
        self.ref_img_oss_obj = ref_img_oss_obj

    def validate(self):
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
        if self.ref_img_oss_obj is not None:
            result['ref_img_oss_obj'] = self.ref_img_oss_obj
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
        if m.get('ref_img_oss_obj') is not None:
            self.ref_img_oss_obj = m.get('ref_img_oss_obj')
        return self


class InitAntchainEkycFaceauthWebsdkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        zim_id: str = None,
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
        # 实人认证id
        self.zim_id = zim_id
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
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
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
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class InitAntchainEkycSingleZimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        meta_info: str = None,
        zim_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境参数
        self.meta_info = meta_info
        # 实人认证id
        self.zim_id = zim_id

    def validate(self):
        self.validate_required(self.meta_info, 'meta_info')
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
        if self.meta_info is not None:
            result['meta_info'] = self.meta_info
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('meta_info') is not None:
            self.meta_info = m.get('meta_info')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class InitAntchainEkycSingleZimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ext_params: str = None,
        protocol: str = None,
        ret_code: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.ext_params = ext_params
        # 协议
        self.protocol = protocol
        # 返回码
        self.ret_code = ret_code
        # 明细返回码
        self.ret_code_sub = ret_code_sub
        # 明细返回码对应的文案
        self.ret_message_sub = ret_message_sub

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
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.ret_code is not None:
            result['ret_code'] = self.ret_code
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('ret_code') is not None:
            self.ret_code = m.get('ret_code')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        return self


class VerifyAntchainEkycSingleZimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extern_param: str = None,
        zim_data: str = None,
        zim_id: str = None,
        zim_data_oss_obj: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展信息,Map的json格式
        self.extern_param = extern_param
        # 人脸业务参数
        self.zim_data = zim_data
        # 实人认证id
        self.zim_id = zim_id
        # zim_data可通过oss方式中转
        self.zim_data_oss_obj = zim_data_oss_obj

    def validate(self):
        self.validate_required(self.zim_data, 'zim_data')
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
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.zim_data is not None:
            result['zim_data'] = self.zim_data
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.zim_data_oss_obj is not None:
            result['zim_data_oss_obj'] = self.zim_data_oss_obj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('zim_data') is not None:
            self.zim_data = m.get('zim_data')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('zim_data_oss_obj') is not None:
            self.zim_data_oss_obj = m.get('zim_data_oss_obj')
        return self


class VerifyAntchainEkycSingleZimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ext_params: str = None,
        product_ret_code: str = None,
        validation_ret_code: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.ext_params = ext_params
        # 产品返回明细码
        self.product_ret_code = product_ret_code
        # 验证返回明细码
        self.validation_ret_code = validation_ret_code
        # 明细返回码
        self.ret_code_sub = ret_code_sub
        # 明细返回码对应的文案
        self.ret_message_sub = ret_message_sub

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
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        if self.product_ret_code is not None:
            result['product_ret_code'] = self.product_ret_code
        if self.validation_ret_code is not None:
            result['validation_ret_code'] = self.validation_ret_code
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        if m.get('product_ret_code') is not None:
            self.product_ret_code = m.get('product_ret_code')
        if m.get('validation_ret_code') is not None:
            self.validation_ret_code = m.get('validation_ret_code')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        return self


class InitAntchainEkycMultiZimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        meta_info: str = None,
        certify_id: str = None,
        product_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 环境参数
        self.meta_info = meta_info
        # 实人认证id
        self.certify_id = certify_id
        # 产品类型
        self.product_type = product_type

    def validate(self):
        self.validate_required(self.meta_info, 'meta_info')
        self.validate_required(self.certify_id, 'certify_id')
        self.validate_required(self.product_type, 'product_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.meta_info is not None:
            result['meta_info'] = self.meta_info
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.product_type is not None:
            result['product_type'] = self.product_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('meta_info') is not None:
            self.meta_info = m.get('meta_info')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        return self


class InitAntchainEkycMultiZimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ext_params: str = None,
        protocol: str = None,
        ret_code: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.ext_params = ext_params
        # 协议
        self.protocol = protocol
        # 返回码
        self.ret_code = ret_code
        # 明细返回码
        self.ret_code_sub = ret_code_sub
        # 明细返回码对应的文案
        self.ret_message_sub = ret_message_sub

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
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.ret_code is not None:
            result['ret_code'] = self.ret_code
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('ret_code') is not None:
            self.ret_code = m.get('ret_code')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        return self


class VerifyAntchainEkycMultiZimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extern_param: str = None,
        zim_data: str = None,
        certify_id: str = None,
        zim_data_oss_obj: str = None,
        product_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展信息,Map的json格式
        self.extern_param = extern_param
        # 人脸业务参数
        self.zim_data = zim_data
        # 实人认证id
        self.certify_id = certify_id
        # zim_data可通过oss方式中转
        self.zim_data_oss_obj = zim_data_oss_obj
        # 产品类型
        self.product_type = product_type

    def validate(self):
        self.validate_required(self.zim_data, 'zim_data')
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
        if self.zim_data is not None:
            result['zim_data'] = self.zim_data
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.zim_data_oss_obj is not None:
            result['zim_data_oss_obj'] = self.zim_data_oss_obj
        if self.product_type is not None:
            result['product_type'] = self.product_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('zim_data') is not None:
            self.zim_data = m.get('zim_data')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('zim_data_oss_obj') is not None:
            self.zim_data_oss_obj = m.get('zim_data_oss_obj')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        return self


class VerifyAntchainEkycMultiZimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ext_params: str = None,
        product_ret_code: str = None,
        validation_ret_code: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.ext_params = ext_params
        # 产品返回明细码
        self.product_ret_code = product_ret_code
        # 验证返回明细码
        self.validation_ret_code = validation_ret_code
        # 明细返回码
        self.ret_code_sub = ret_code_sub
        # 明细返回码对应的文案
        self.ret_message_sub = ret_message_sub

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
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        if self.product_ret_code is not None:
            result['product_ret_code'] = self.product_ret_code
        if self.validation_ret_code is not None:
            result['validation_ret_code'] = self.validation_ret_code
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        if m.get('product_ret_code') is not None:
            self.product_ret_code = m.get('product_ret_code')
        if m.get('validation_ret_code') is not None:
            self.validation_ret_code = m.get('validation_ret_code')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        return self


class ConfirmAntchainEkycMultiZimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certify_id: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 实人认证id
        self.certify_id = certify_id
        # 扩展信息,Map的json格式
        self.extern_param = extern_param

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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class ConfirmAntchainEkycMultiZimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ext_params: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.ext_params = ext_params
        # 明细返回码
        self.ret_code_sub = ret_code_sub
        # 明细返回码对应的文案
        self.ret_message_sub = ret_message_sub

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
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        return self


class InitAntchainEkycVerificationWebsdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        scene_id: str = None,
        extern_param: str = None,
        identity_param: str = None,
        metainfo: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 场景ID
        self.scene_id = scene_id
        # 预留扩展参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # metainfo环境参数
        self.metainfo = metainfo

    def validate(self):
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
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        return self


class InitAntchainEkycVerificationWebsdkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
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
        # 实人认证id
        self.certify_id = certify_id
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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
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
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


class InitAntchainEkycVerificationNativeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        scene_id: str = None,
        extern_param: str = None,
        identity_param: str = None,
        metainfo: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
        self.biz_id = biz_id
        # 场景ID
        self.scene_id = scene_id
        # 预留扩展参数
        self.extern_param = extern_param
        # 用户身份信息
        self.identity_param = identity_param
        # metainfo环境参数
        self.metainfo = metainfo

    def validate(self):
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
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param
        if self.metainfo is not None:
            result['metainfo'] = self.metainfo
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('identity_param') is not None:
            self.identity_param = m.get('identity_param')
        if m.get('metainfo') is not None:
            self.metainfo = m.get('metainfo')
        return self


class InitAntchainEkycVerificationNativeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
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
        # 实人认证id
        self.certify_id = certify_id
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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
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
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        if m.get('result_code_sub') is not None:
            self.result_code_sub = m.get('result_code_sub')
        if m.get('result_msg_sub') is not None:
            self.result_msg_sub = m.get('result_msg_sub')
        return self


