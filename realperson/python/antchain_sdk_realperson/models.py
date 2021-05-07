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


class QueryFacevrfServerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certify_id: str = None,
        extern_param: str = None,
        material_hash: str = None,
        outer_order_no: str = None,
        scene_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 实人认证唯一标识
        self.certify_id = certify_id
        # 预留扩展业务参数
        self.extern_param = extern_param
        # 认证材料（如人脸图像）的哈希
        self.material_hash = material_hash
        # 外部唯一标识。用于定位。
        # 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        self.outer_order_no = outer_order_no
        # 场景ID
        self.scene_id = scene_id

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.scene_id, 'scene_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.material_hash is not None:
            result['material_hash'] = self.material_hash
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
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
        if m.get('material_hash') is not None:
            self.material_hash = m.get('material_hash')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        return self


class QueryFacevrfServerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        identity_info: str = None,
        material_info: str = None,
        material_matched: str = None,
        passed: str = None,
        reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证的主体信息，一般的认证场景返回为空
        self.identity_info = identity_info
        # 认证主体附件信息，一般的认证场景都是返回空
        self.material_info = material_info
        # 认证材料哈希是否匹配
        self.material_matched = material_matched
        # 是否通过，通过为T，不通过为F
        self.passed = passed
        # 业务失败原因
        self.reason = reason

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
        if self.identity_info is not None:
            result['identity_info'] = self.identity_info
        if self.material_info is not None:
            result['material_info'] = self.material_info
        if self.material_matched is not None:
            result['material_matched'] = self.material_matched
        if self.passed is not None:
            result['passed'] = self.passed
        if self.reason is not None:
            result['reason'] = self.reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('identity_info') is not None:
            self.identity_info = m.get('identity_info')
        if m.get('material_info') is not None:
            self.material_info = m.get('material_info')
        if m.get('material_matched') is not None:
            self.material_matched = m.get('material_matched')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        return self


class CreateFacevrfServerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        callback_url: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        extern_param: str = None,
        facial_picture_ref: str = None,
        identity_type: str = None,
        meta_info: str = None,
        outer_order_no: str = None,
        return_url: str = None,
        scene_id: str = None,
        user_id: str = None,
        user_ip: str = None,
        user_mobile: str = None,
        callback_need_retry: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证模式码
        self.biz_code = biz_code
        # h5认证完成后，服务端回调此地址通知商户认证结果
        self.callback_url = callback_url
        # 真实姓名
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型，如身份证
        self.cert_type = cert_type
        # 预留扩展参数
        self.extern_param = extern_param
        # 自定义比对源人脸图像，base64编码格式
        self.facial_picture_ref = facial_picture_ref
        # 身份信息来源类型，如证件
        self.identity_type = identity_type
        # metainfo 环境参数，需要通过客户端 SDK 获取
        self.meta_info = meta_info
        # 外部唯一标识。用于定位。
        # 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        self.outer_order_no = outer_order_no
        # 回跳地址
        self.return_url = return_url
        # 场景ID
        self.scene_id = scene_id
        # 商户自定义的用户ID
        self.user_id = user_id
        # 用户的IP
        self.user_ip = user_ip
        # 用户的手机号
        self.user_mobile = user_mobile
        # callbackUrl回调时是否需要重试，默认false(不需要重试)
        self.callback_need_retry = callback_need_retry

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.identity_type, 'identity_type')
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.scene_id, 'scene_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.facial_picture_ref is not None:
            result['facial_picture_ref'] = self.facial_picture_ref
        if self.identity_type is not None:
            result['identity_type'] = self.identity_type
        if self.meta_info is not None:
            result['meta_info'] = self.meta_info
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_ip is not None:
            result['user_ip'] = self.user_ip
        if self.user_mobile is not None:
            result['user_mobile'] = self.user_mobile
        if self.callback_need_retry is not None:
            result['callback_need_retry'] = self.callback_need_retry
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('facial_picture_ref') is not None:
            self.facial_picture_ref = m.get('facial_picture_ref')
        if m.get('identity_type') is not None:
            self.identity_type = m.get('identity_type')
        if m.get('meta_info') is not None:
            self.meta_info = m.get('meta_info')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_ip') is not None:
            self.user_ip = m.get('user_ip')
        if m.get('user_mobile') is not None:
            self.user_mobile = m.get('user_mobile')
        if m.get('callback_need_retry') is not None:
            self.callback_need_retry = m.get('callback_need_retry')
        return self


class CreateFacevrfServerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
        certify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实人认证唯一标识
        self.certify_id = certify_id
        # 认证地址。只在特定场景返回。
        self.certify_url = certify_url

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
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('certify_url') is not None:
            self.certify_url = m.get('certify_url')
        return self


class ExecFacevrfServerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        extern_param: str = None,
        facial_picture_ref: str = None,
        identity_type: str = None,
        outer_order_no: str = None,
        scene_id: str = None,
        user_id: str = None,
        user_ip: str = None,
        user_mobile: str = None,
        facial_picture_auth: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 真实姓名
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型，如身份证
        self.cert_type = cert_type
        # 预留扩展参数
        self.extern_param = extern_param
        # 自定义比对源人脸图像，base64编码格式
        self.facial_picture_ref = facial_picture_ref
        # 身份信息来源类型，如证件
        self.identity_type = identity_type
        # 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        self.outer_order_no = outer_order_no
        # 场景ID
        self.scene_id = scene_id
        # 商户自定义的用户ID
        self.user_id = user_id
        # 用户的IP
        self.user_ip = user_ip
        # 用户的手机号（或其哈希值）
        self.user_mobile = user_mobile
        # 待认证的人脸图像，base64编码格式
        self.facial_picture_auth = facial_picture_auth

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.identity_type, 'identity_type')
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.scene_id, 'scene_id')
        self.validate_required(self.facial_picture_auth, 'facial_picture_auth')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        if self.facial_picture_ref is not None:
            result['facial_picture_ref'] = self.facial_picture_ref
        if self.identity_type is not None:
            result['identity_type'] = self.identity_type
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_ip is not None:
            result['user_ip'] = self.user_ip
        if self.user_mobile is not None:
            result['user_mobile'] = self.user_mobile
        if self.facial_picture_auth is not None:
            result['facial_picture_auth'] = self.facial_picture_auth
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        if m.get('facial_picture_ref') is not None:
            self.facial_picture_ref = m.get('facial_picture_ref')
        if m.get('identity_type') is not None:
            self.identity_type = m.get('identity_type')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_ip') is not None:
            self.user_ip = m.get('user_ip')
        if m.get('user_mobile') is not None:
            self.user_mobile = m.get('user_mobile')
        if m.get('facial_picture_auth') is not None:
            self.facial_picture_auth = m.get('facial_picture_auth')
        return self


class ExecFacevrfServerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
        passed: str = None,
        reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 认证ID
        self.certify_id = certify_id
        # 是否通过，通过为T，不通过为F
        self.passed = passed
        # 业务失败原因
        self.reason = reason

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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.passed is not None:
            result['passed'] = self.passed
        if self.reason is not None:
            result['reason'] = self.reason
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
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        return self


class GetFacevrfEvidenceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certify_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 某次刷脸的certifyId
        self.certify_id = certify_id

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        return self


class GetFacevrfEvidenceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_id: str = None,
        onchain_id: str = None,
        onchain_status: str = None,
        pdf_expired: bool = None,
        pdf_content: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 刷脸的certifyId，原样返回
        self.certify_id = certify_id
        # 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
        self.onchain_id = onchain_id
        # 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
        self.onchain_status = onchain_status
        # pdf存证是否已经过期，不支持超过6个月的存证获取
        self.pdf_expired = pdf_expired
        # 存证pdf文件内容的base64
        self.pdf_content = pdf_content

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
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.onchain_id is not None:
            result['onchain_id'] = self.onchain_id
        if self.onchain_status is not None:
            result['onchain_status'] = self.onchain_status
        if self.pdf_expired is not None:
            result['pdf_expired'] = self.pdf_expired
        if self.pdf_content is not None:
            result['pdf_content'] = self.pdf_content
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
        if m.get('onchain_id') is not None:
            self.onchain_id = m.get('onchain_id')
        if m.get('onchain_status') is not None:
            self.onchain_status = m.get('onchain_status')
        if m.get('pdf_expired') is not None:
            self.pdf_expired = m.get('pdf_expired')
        if m.get('pdf_content') is not None:
            self.pdf_content = m.get('pdf_content')
        return self


class CheckIndividualidTwometaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        cert_name: str = None,
        cert_no: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        self.outer_order_no = outer_order_no
        # 姓名
        self.cert_name = cert_name
        # 身份证号码
        self.cert_no = cert_no
        # map结果的json数据格式，预留字段
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class CheckIndividualidTwometaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        match: str = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # true:匹配成功  false：匹配失败
        self.match = match
        # 扩展信息，预留字段
        self.extern_info = extern_info

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
        if self.match is not None:
            result['match'] = self.match
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
        if m.get('match') is not None:
            self.match = m.get('match')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


