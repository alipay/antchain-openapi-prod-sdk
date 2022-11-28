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


class AudioMeta(TeaModel):
    def __init__(
        self,
        sample_freq: int = None,
        channels_num: int = None,
        bits: int = None,
        channel: int = None,
    ):
        # 采样率
        self.sample_freq = sample_freq
        # 音频道数
        self.channels_num = channels_num
        # 音频数据采样点所占位数
        self.bits = bits
        # 语音信道分离标识
        self.channel = channel

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sample_freq is not None:
            result['sample_freq'] = self.sample_freq
        if self.channels_num is not None:
            result['channels_num'] = self.channels_num
        if self.bits is not None:
            result['bits'] = self.bits
        if self.channel is not None:
            result['channel'] = self.channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sample_freq') is not None:
            self.sample_freq = m.get('sample_freq')
        if m.get('channels_num') is not None:
            self.channels_num = m.get('channels_num')
        if m.get('bits') is not None:
            self.bits = m.get('bits')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        return self


class Audio(TeaModel):
    def __init__(
        self,
        token: str = None,
        raw_data: str = None,
        audio_url: str = None,
    ):
        # 音频文件名称（单次请求保持唯一）
        self.token = token
        # 待认证的音频文件，base64编码格式
        self.raw_data = raw_data
        # 音频文件OSS地址
        self.audio_url = audio_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.token is not None:
            result['token'] = self.token
        if self.raw_data is not None:
            result['raw_data'] = self.raw_data
        if self.audio_url is not None:
            result['audio_url'] = self.audio_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('raw_data') is not None:
            self.raw_data = m.get('raw_data')
        if m.get('audio_url') is not None:
            self.audio_url = m.get('audio_url')
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
        enc_type: str = None,
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
        model: str = None,
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
        # cert_name、cert_no两个字段的传入模式。0：明文1：密文
        self.enc_type = enc_type
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
        # 活体检测的类型
        self.model = model

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.identity_type, 'identity_type')
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.scene_id, 'scene_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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
        if self.enc_type is not None:
            result['enc_type'] = self.enc_type
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
        if self.model is not None:
            result['model'] = self.model
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
        if m.get('enc_type') is not None:
            self.enc_type = m.get('enc_type')
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
        if m.get('model') is not None:
            self.model = m.get('model')
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
        enc_type: str = None,
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
        # cert_name、cert_no两个字段的传入模式0：明文1：密文
        self.enc_type = enc_type
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
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.enc_type is not None:
            result['enc_type'] = self.enc_type
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
        if m.get('enc_type') is not None:
            self.enc_type = m.get('enc_type')
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
        material_info: str = None,
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
        # 认证主体附件信息，包含共计类型等
        self.material_info = material_info

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
        if self.passed is not None:
            result['passed'] = self.passed
        if self.reason is not None:
            result['reason'] = self.reason
        if self.material_info is not None:
            result['material_info'] = self.material_info
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
        if m.get('material_info') is not None:
            self.material_info = m.get('material_info')
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
        scene: str = None,
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
        # 认证子类型
        self.scene = scene

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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
        if self.scene is not None:
            result['scene'] = self.scene
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
        if m.get('scene') is not None:
            self.scene = m.get('scene')
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


class CheckIndividualidThreemetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        cert_name: str = None,
        cert_no: str = None,
        mobile: str = None,
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
        # 手机号码
        self.mobile = mobile
        # map结果的json数据格式，预留字段
        # 
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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
        if self.mobile is not None:
            result['mobile'] = self.mobile
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
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class CheckIndividualidThreemetaResponse(TeaModel):
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
        # true:匹配成功 false：匹配失败
        self.match = match
        # 扩展信息，预留字段
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


class CheckIndividualidFourmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        cert_name: str = None,
        cert_no: str = None,
        mobile: str = None,
        bank_card: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        self.outer_order_no = outer_order_no
        # 姓名
        # 
        self.cert_name = cert_name
        # 身份证号码
        self.cert_no = cert_no
        # 手机号码
        self.mobile = mobile
        # 银行卡号
        self.bank_card = bank_card
        # map结果的json数据格式，预留字段
        # 
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.bank_card, 'bank_card')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.bank_card is not None:
            result['bank_card'] = self.bank_card
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
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('bank_card') is not None:
            self.bank_card = m.get('bank_card')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class CheckIndividualidFourmetaResponse(TeaModel):
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
        # true:匹配成功 false：匹配失败
        # 
        self.match = match
        # 扩展信息，预留字段
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


class CheckRouteThreemetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        cert_name: str = None,
        cert_no: str = None,
        mobile: str = None,
        scene: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        self.outer_order_no = outer_order_no
        # 姓名
        self.cert_name = cert_name
        # 身份证号
        self.cert_no = cert_no
        # 手机号
        self.mobile = mobile
        # 使用场景
        self.scene = scene
        # map结果的json数据格式，预留字段
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.scene, 'scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.scene is not None:
            result['scene'] = self.scene
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
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class CheckRouteThreemetaResponse(TeaModel):
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
        # true:匹配成功 false：匹配失败
        self.match = match
        # 扩展信息，预留字段
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


class CreateVoiceprintServermodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        user_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        audio_meta: AudioMeta = None,
        audios: List[Audio] = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        self.outer_order_no = outer_order_no
        # 商户自定义的用户ID
        self.user_id = user_id
        # 音频文件流
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 音频元数据
        self.audio_meta = audio_meta
        # 音频文件集合
        self.audios = audios
        # 预留扩展参数
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.audio_meta, 'audio_meta')
        if self.audio_meta:
            self.audio_meta.validate()
        self.validate_required(self.audios, 'audios')
        if self.audios:
            for k in self.audios:
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
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.audio_meta is not None:
            result['audio_meta'] = self.audio_meta.to_map()
        result['audios'] = []
        if self.audios is not None:
            for k in self.audios:
                result['audios'].append(k.to_map() if k else None)
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
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('audio_meta') is not None:
            temp_model = AudioMeta()
            self.audio_meta = temp_model.from_map(m['audio_meta'])
        self.audios = []
        if m.get('audios') is not None:
            for k in m.get('audios'):
                temp_model = Audio()
                self.audios.append(temp_model.from_map(k))
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class CreateVoiceprintServermodeResponse(TeaModel):
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
        # 扩展信息，预留字段
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


class VerifyVoiceprintServermodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        user_id: str = None,
        audio_auth: str = None,
        audio_url: str = None,
        audio_meta: AudioMeta = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        self.outer_order_no = outer_order_no
        # 商户自定义的用户ID
        self.user_id = user_id
        # 音频文件，base64编码格式
        # 
        self.audio_auth = audio_auth
        # 音频文件OSS地址
        self.audio_url = audio_url
        # 音频元数据
        self.audio_meta = audio_meta
        # 预留扩展参数
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.audio_meta, 'audio_meta')
        if self.audio_meta:
            self.audio_meta.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.audio_auth is not None:
            result['audio_auth'] = self.audio_auth
        if self.audio_url is not None:
            result['audio_url'] = self.audio_url
        if self.audio_meta is not None:
            result['audio_meta'] = self.audio_meta.to_map()
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
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('audio_auth') is not None:
            self.audio_auth = m.get('audio_auth')
        if m.get('audio_url') is not None:
            self.audio_url = m.get('audio_url')
        if m.get('audio_meta') is not None:
            temp_model = AudioMeta()
            self.audio_meta = temp_model.from_map(m['audio_meta'])
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class VerifyVoiceprintServermodeResponse(TeaModel):
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
        # 声纹认证唯一ID
        self.certify_id = certify_id
        # 扩展信息，预留字段
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


class CheckRouteTwometaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        cert_name: str = None,
        cert_no: str = None,
        scene: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        self.outer_order_no = outer_order_no
        # 姓名
        self.cert_name = cert_name
        # 身份证号
        self.cert_no = cert_no
        # 使用场景
        self.scene = scene
        # map结果的json数据格式，预留字段
        # 
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.scene, 'scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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
        if self.scene is not None:
            result['scene'] = self.scene
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
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class CheckRouteTwometaResponse(TeaModel):
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
        # true:匹配成功 false：匹配失败
        # 
        self.match = match
        # 扩展信息，预留字段
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


class QueryMobileRiskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        apdid_token: str = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        self.outer_order_no = outer_order_no
        # 设备身份临时标识
        self.apdid_token = apdid_token
        # 接口使用场景，不同场景下接口返回字段集合会有差异，可缺省
        self.scene = scene

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.apdid_token, 'apdid_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class QueryMobileRiskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        device_info: str = None,
        risk_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 设备相关数据，默认只返回apdid，由Map<String,String>序列化
        self.device_info = device_info
        # 设备风险标签，由Map<String,String>序列化
        self.risk_info = risk_info

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
        if self.device_info is not None:
            result['device_info'] = self.device_info
        if self.risk_info is not None:
            result['risk_info'] = self.risk_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('device_info') is not None:
            self.device_info = m.get('device_info')
        if m.get('risk_info') is not None:
            self.risk_info = m.get('risk_info')
        return self


class DetailFacevrfServerRequest(TeaModel):
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
        # 实人认证唯一标识
        self.certify_id = certify_id
        # 预留扩展业务参数
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


class DetailFacevrfServerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        state: str = None,
        identity_info: str = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # PASS：认证通过
        # FAIL：认证不通过
        # NO_RECODE：无认证记录
        # PROCESSING：认证中
        self.state = state
        # 认证人信息，包括姓名和身份证号，不加密
        # state为PASS/FAIL/PROCESSING时为JSON字符串，为NO_RECORD时为空
        self.identity_info = identity_info
        # 预留扩展结果
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
        if self.state is not None:
            result['state'] = self.state
        if self.identity_info is not None:
            result['identity_info'] = self.identity_info
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
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('identity_info') is not None:
            self.identity_info = m.get('identity_info')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class CheckAnticheatPersonalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        cert_name: str = None,
        cert_no: str = None,
        company_name: str = None,
        company_no: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部请求id
        self.outer_order_no = outer_order_no
        # 主体姓名
        self.cert_name = cert_name
        # 主体身份证号
        self.cert_no = cert_no
        # 受雇企业
        self.company_name = company_name
        # 组织机构代码
        self.company_no = company_no
        # 扩展字段，json格式
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.company_name, 'company_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.company_no is not None:
            result['company_no'] = self.company_no
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
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('company_no') is not None:
            self.company_no = m.get('company_no')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class CheckAnticheatPersonalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_level: str = None,
        risk_level_desc: str = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险等级
        self.risk_level = risk_level
        # 风险等级文字描述
        self.risk_level_desc = risk_level_desc
        # 扩展信息
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
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        if self.risk_level_desc is not None:
            result['risk_level_desc'] = self.risk_level_desc
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
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        if m.get('risk_level_desc') is not None:
            self.risk_level_desc = m.get('risk_level_desc')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class CheckTwometaHashRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_no_hash: str = None,
        cert_name_hash: str = None,
        outer_order_id: str = None,
        hash_type: str = None,
        extern_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # hash后的身份证号，不区分大小写，使用的hash算法参考hash_type字段
        self.cert_no_hash = cert_no_hash
        # hash后的姓名，不区分大小写，使用的hash类型参考hash_type
        self.cert_name_hash = cert_name_hash
        # 本次核验id
        self.outer_order_id = outer_order_id
        # 支持的hash类型
        self.hash_type = hash_type
        # json格式的扩展字段
        self.extern_info = extern_info

    def validate(self):
        self.validate_required(self.cert_no_hash, 'cert_no_hash')
        self.validate_required(self.cert_name_hash, 'cert_name_hash')
        self.validate_required(self.outer_order_id, 'outer_order_id')
        self.validate_required(self.hash_type, 'hash_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_no_hash is not None:
            result['cert_no_hash'] = self.cert_no_hash
        if self.cert_name_hash is not None:
            result['cert_name_hash'] = self.cert_name_hash
        if self.outer_order_id is not None:
            result['outer_order_id'] = self.outer_order_id
        if self.hash_type is not None:
            result['hash_type'] = self.hash_type
        if self.extern_info is not None:
            result['extern_info'] = self.extern_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_no_hash') is not None:
            self.cert_no_hash = m.get('cert_no_hash')
        if m.get('cert_name_hash') is not None:
            self.cert_name_hash = m.get('cert_name_hash')
        if m.get('outer_order_id') is not None:
            self.outer_order_id = m.get('outer_order_id')
        if m.get('hash_type') is not None:
            self.hash_type = m.get('hash_type')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class CheckTwometaHashResponse(TeaModel):
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


class QueryThreemetaOnlinetimeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        outer_order_no: str = None,
        cert_name: str = None,
        cert_no: str = None,
        phone_no: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部请求id
        self.outer_order_no = outer_order_no
        # 姓名
        self.cert_name = cert_name
        # 身份证号
        self.cert_no = cert_no
        # 手机号码
        self.phone_no = phone_no
        # 扩展参数
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.phone_no, 'phone_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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
        if self.phone_no is not None:
            result['phone_no'] = self.phone_no
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
        if m.get('phone_no') is not None:
            self.phone_no = m.get('phone_no')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class QueryThreemetaOnlinetimeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        length_code: str = None,
        extern_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 在网时长标准码，规则：
        # 1: [0,3)表示在⽹时⻓是 0~3 个⽉
        # 2: [3,6)表示在⽹时⻓是 3~6 个⽉
        # 3: [6,12)表示在⽹时⻓是 6~12 个⽉
        # 4: [12,24)表示在⽹时⻓是 12~24 ⽉
        # 5: [24,+)表示在⽹时⻓是 24个⽉及以上
        self.length_code = length_code
        # 扩展信息，json格式
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
        if self.length_code is not None:
            result['length_code'] = self.length_code
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
        if m.get('length_code') is not None:
            self.length_code = m.get('length_code')
        if m.get('extern_info') is not None:
            self.extern_info = m.get('extern_info')
        return self


class InitFacevrfZimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_data: str = None,
        channel: str = None,
        merchant: str = None,
        meta_info: str = None,
        produce_node: str = None,
        product_name: str = None,
        zim_id: str = None,
        zim_principal: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务参数
        self.biz_data = biz_data
        # 渠道
        self.channel = channel
        # 商户
        self.merchant = merchant
        # 环境参数
        self.meta_info = meta_info
        # 产品节点
        self.produce_node = produce_node
        # 产品名称
        self.product_name = product_name
        # 实人认证id
        # 
        self.zim_id = zim_id
        # 身份信息参数
        # 
        self.zim_principal = zim_principal

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
        if self.biz_data is not None:
            result['biz_data'] = self.biz_data
        if self.channel is not None:
            result['channel'] = self.channel
        if self.merchant is not None:
            result['merchant'] = self.merchant
        if self.meta_info is not None:
            result['meta_info'] = self.meta_info
        if self.produce_node is not None:
            result['produce_node'] = self.produce_node
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.zim_id is not None:
            result['zim_id'] = self.zim_id
        if self.zim_principal is not None:
            result['zim_principal'] = self.zim_principal
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_data') is not None:
            self.biz_data = m.get('biz_data')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('merchant') is not None:
            self.merchant = m.get('merchant')
        if m.get('meta_info') is not None:
            self.meta_info = m.get('meta_info')
        if m.get('produce_node') is not None:
            self.produce_node = m.get('produce_node')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        if m.get('zim_principal') is not None:
            self.zim_principal = m.get('zim_principal')
        return self


class InitFacevrfZimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ext_params: str = None,
        message: str = None,
        protocol: str = None,
        ret_code: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
        zim_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        # 
        self.ext_params = ext_params
        # 描述
        self.message = message
        # 协议
        self.protocol = protocol
        # 返回码
        self.ret_code = ret_code
        # 明细返回码
        self.ret_code_sub = ret_code_sub
        # 明细返回码对应的文案
        self.ret_message_sub = ret_message_sub
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
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        if self.message is not None:
            result['message'] = self.message
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.ret_code is not None:
            result['ret_code'] = self.ret_code
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
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
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('ret_code') is not None:
            self.ret_code = m.get('ret_code')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        if m.get('zim_id') is not None:
            self.zim_id = m.get('zim_id')
        return self


class VerifyFacevrfZimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extern_param: str = None,
        zim_data: str = None,
        zim_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展信息,Map的json格式
        self.extern_param = extern_param
        # 人脸业务参数
        self.zim_data = zim_data
        # 7501f6c2dd57e06fe0d4202d3aaab58e
        self.zim_id = zim_id

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
        return self


class VerifyFacevrfZimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ext_params: str = None,
        has_next: str = None,
        next_protocol: str = None,
        product_ret_code: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
        validation_ret_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预留扩展结果
        self.ext_params = ext_params
        # ""
        self.has_next = has_next
        # ""
        self.next_protocol = next_protocol
        # 产品返回明细码
        self.product_ret_code = product_ret_code
        # 明细返回码
        self.ret_code_sub = ret_code_sub
        # 明细返回码对应的文案
        self.ret_message_sub = ret_message_sub
        # 验证返回明细码
        self.validation_ret_code = validation_ret_code

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
        if self.has_next is not None:
            result['has_next'] = self.has_next
        if self.next_protocol is not None:
            result['next_protocol'] = self.next_protocol
        if self.product_ret_code is not None:
            result['product_ret_code'] = self.product_ret_code
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
        if self.validation_ret_code is not None:
            result['validation_ret_code'] = self.validation_ret_code
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
        if m.get('has_next') is not None:
            self.has_next = m.get('has_next')
        if m.get('next_protocol') is not None:
            self.next_protocol = m.get('next_protocol')
        if m.get('product_ret_code') is not None:
            self.product_ret_code = m.get('product_ret_code')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        if m.get('validation_ret_code') is not None:
            self.validation_ret_code = m.get('validation_ret_code')
        return self


class RecognizeDocIndividualcardRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_order_no: str = None,
        ocr_type: str = None,
        data_type: str = None,
        data_content: str = None,
        req_enc_type: str = None,
        resp_enc_type: str = None,
        enc_token: str = None,
        extern_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 长度不超过32位的0-9A-Za-z字符串。
        # 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
        self.out_order_no = out_order_no
        # 待识别的卡类型。取值约束：ID_CARD（身份证）;EEP_TO_ML_CARD（港澳来往大陆通行证）;BANK_CARD（银行卡）
        self.ocr_type = ocr_type
        # 传入的图片是base64编码的图片还是图片的URL。取值约束：BASE64（类型为base64）；URL（暂不支持）
        self.data_type = data_type
        # 传入的图片的具体内容，需要与data_type的选择保持一致。
        self.data_content = data_content
        # 入参data_content是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
        self.req_enc_type = req_enc_type
        # 出参ocr_info是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
        self.resp_enc_type = resp_enc_type
        # 经过公钥RSA加密的AES密钥，用于对出参ocr_info加密。当req_enc_type = 1或resp_enc_type = 1时必填。
        self.enc_token = enc_token
        # 扩展信息JSON串。
        self.extern_param = extern_param

    def validate(self):
        self.validate_required(self.out_order_no, 'out_order_no')
        self.validate_required(self.ocr_type, 'ocr_type')
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.data_content, 'data_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.out_order_no is not None:
            result['out_order_no'] = self.out_order_no
        if self.ocr_type is not None:
            result['ocr_type'] = self.ocr_type
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.data_content is not None:
            result['data_content'] = self.data_content
        if self.req_enc_type is not None:
            result['req_enc_type'] = self.req_enc_type
        if self.resp_enc_type is not None:
            result['resp_enc_type'] = self.resp_enc_type
        if self.enc_token is not None:
            result['enc_token'] = self.enc_token
        if self.extern_param is not None:
            result['extern_param'] = self.extern_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_order_no') is not None:
            self.out_order_no = m.get('out_order_no')
        if m.get('ocr_type') is not None:
            self.ocr_type = m.get('ocr_type')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('data_content') is not None:
            self.data_content = m.get('data_content')
        if m.get('req_enc_type') is not None:
            self.req_enc_type = m.get('req_enc_type')
        if m.get('resp_enc_type') is not None:
            self.resp_enc_type = m.get('resp_enc_type')
        if m.get('enc_token') is not None:
            self.enc_token = m.get('enc_token')
        if m.get('extern_param') is not None:
            self.extern_param = m.get('extern_param')
        return self


class RecognizeDocIndividualcardResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ret_code: str = None,
        ret_code_sub: str = None,
        ret_message_sub: str = None,
        ocr_info: str = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果码
        self.ret_code = ret_code
        # 错误码
        self.ret_code_sub = ret_code_sub
        # 错误信息
        self.ret_message_sub = ret_message_sub
        # 识别结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
        self.ocr_info = ocr_info
        # 扩展信息JSON串。
        self.ext_info = ext_info

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
        if self.ret_code is not None:
            result['ret_code'] = self.ret_code
        if self.ret_code_sub is not None:
            result['ret_code_sub'] = self.ret_code_sub
        if self.ret_message_sub is not None:
            result['ret_message_sub'] = self.ret_message_sub
        if self.ocr_info is not None:
            result['ocr_info'] = self.ocr_info
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ret_code') is not None:
            self.ret_code = m.get('ret_code')
        if m.get('ret_code_sub') is not None:
            self.ret_code_sub = m.get('ret_code_sub')
        if m.get('ret_message_sub') is not None:
            self.ret_message_sub = m.get('ret_message_sub')
        if m.get('ocr_info') is not None:
            self.ocr_info = m.get('ocr_info')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
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


