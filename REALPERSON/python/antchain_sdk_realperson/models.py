# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


class Config(TeaModel):
    """
    Model for initing client
    """
    def __init__(self, access_key_id=None, access_key_secret=None, security_token=None, protocol=None,
                 read_timeout=None, connect_timeout=None, http_proxy=None, https_proxy=None, endpoint=None, no_proxy=None,
                 max_idle_conns=None, user_agent=None, socks_5proxy=None, socks_5net_work=None):
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

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['accessKeyId'] = self.access_key_id
        result['accessKeySecret'] = self.access_key_secret
        result['securityToken'] = self.security_token
        result['protocol'] = self.protocol
        result['readTimeout'] = self.read_timeout
        result['connectTimeout'] = self.connect_timeout
        result['httpProxy'] = self.http_proxy
        result['httpsProxy'] = self.https_proxy
        result['endpoint'] = self.endpoint
        result['noProxy'] = self.no_proxy
        result['maxIdleConns'] = self.max_idle_conns
        result['userAgent'] = self.user_agent
        result['socks5Proxy'] = self.socks_5proxy
        result['socks5NetWork'] = self.socks_5net_work
        return result

    def from_map(self, map={}):
        self.access_key_id = map.get('accessKeyId')
        self.access_key_secret = map.get('accessKeySecret')
        self.security_token = map.get('securityToken')
        self.protocol = map.get('protocol')
        self.read_timeout = map.get('readTimeout')
        self.connect_timeout = map.get('connectTimeout')
        self.http_proxy = map.get('httpProxy')
        self.https_proxy = map.get('httpsProxy')
        self.endpoint = map.get('endpoint')
        self.no_proxy = map.get('noProxy')
        self.max_idle_conns = map.get('maxIdleConns')
        self.user_agent = map.get('userAgent')
        self.socks_5proxy = map.get('socks5Proxy')
        self.socks_5net_work = map.get('socks5NetWork')
        return self


class QueryDiRealpersonFacevrfServerRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, certify_id=None,
                 extern_param=None, material_hash=None, outer_order_no=None, scene_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
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
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['certify_id'] = self.certify_id
        result['extern_param'] = self.extern_param
        result['material_hash'] = self.material_hash
        result['outer_order_no'] = self.outer_order_no
        result['scene_id'] = self.scene_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.certify_id = map.get('certify_id')
        self.extern_param = map.get('extern_param')
        self.material_hash = map.get('material_hash')
        self.outer_order_no = map.get('outer_order_no')
        self.scene_id = map.get('scene_id')
        return self


class QueryDiRealpersonFacevrfServerResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, identity_info=None, material_info=None,
                 material_matched=None, passed=None, reason=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
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
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['identity_info'] = self.identity_info
        result['material_info'] = self.material_info
        result['material_matched'] = self.material_matched
        result['passed'] = self.passed
        result['reason'] = self.reason
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.identity_info = map.get('identity_info')
        self.material_info = map.get('material_info')
        self.material_matched = map.get('material_matched')
        self.passed = map.get('passed')
        self.reason = map.get('reason')
        return self


class CreateDiRealpersonFacevrfServerRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_code=None,
                 callback_url=None, cert_name=None, cert_no=None, cert_type=None, extern_param=None, facial_picture_ref=None,
                 identity_type=None, meta_info=None, outer_order_no=None, return_url=None, scene_id=None, user_id=None,
                 user_ip=None, user_mobile=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
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

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_code'] = self.biz_code
        result['callback_url'] = self.callback_url
        result['cert_name'] = self.cert_name
        result['cert_no'] = self.cert_no
        result['cert_type'] = self.cert_type
        result['extern_param'] = self.extern_param
        result['facial_picture_ref'] = self.facial_picture_ref
        result['identity_type'] = self.identity_type
        result['meta_info'] = self.meta_info
        result['outer_order_no'] = self.outer_order_no
        result['return_url'] = self.return_url
        result['scene_id'] = self.scene_id
        result['user_id'] = self.user_id
        result['user_ip'] = self.user_ip
        result['user_mobile'] = self.user_mobile
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_code = map.get('biz_code')
        self.callback_url = map.get('callback_url')
        self.cert_name = map.get('cert_name')
        self.cert_no = map.get('cert_no')
        self.cert_type = map.get('cert_type')
        self.extern_param = map.get('extern_param')
        self.facial_picture_ref = map.get('facial_picture_ref')
        self.identity_type = map.get('identity_type')
        self.meta_info = map.get('meta_info')
        self.outer_order_no = map.get('outer_order_no')
        self.return_url = map.get('return_url')
        self.scene_id = map.get('scene_id')
        self.user_id = map.get('user_id')
        self.user_ip = map.get('user_ip')
        self.user_mobile = map.get('user_mobile')
        return self


class CreateDiRealpersonFacevrfServerResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, certify_id=None, certify_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 实人认证唯一标识
        self.certify_id = certify_id
        # 认证地址。只在特定场景返回。
        self.certify_url = certify_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['certify_id'] = self.certify_id
        result['certify_url'] = self.certify_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.certify_id = map.get('certify_id')
        self.certify_url = map.get('certify_url')
        return self


class ExecDiRealpersonFacevrfServerRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_name=None, cert_no=None,
                 cert_type=None, extern_param=None, facial_picture_auth=None, facial_picture_ref=None, identity_type=None,
                 outer_order_no=None, scene_id=None, user_id=None, user_ip=None, user_mobile=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 真实姓名
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 证件类型，如身份证
        self.cert_type = cert_type
        # 预留扩展参数
        self.extern_param = extern_param
        # 待认证的人脸图像，base64编码格式
        self.facial_picture_auth = facial_picture_auth
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

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_name'] = self.cert_name
        result['cert_no'] = self.cert_no
        result['cert_type'] = self.cert_type
        result['extern_param'] = self.extern_param
        result['facial_picture_auth'] = self.facial_picture_auth
        result['facial_picture_ref'] = self.facial_picture_ref
        result['identity_type'] = self.identity_type
        result['outer_order_no'] = self.outer_order_no
        result['scene_id'] = self.scene_id
        result['user_id'] = self.user_id
        result['user_ip'] = self.user_ip
        result['user_mobile'] = self.user_mobile
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_name = map.get('cert_name')
        self.cert_no = map.get('cert_no')
        self.cert_type = map.get('cert_type')
        self.extern_param = map.get('extern_param')
        self.facial_picture_auth = map.get('facial_picture_auth')
        self.facial_picture_ref = map.get('facial_picture_ref')
        self.identity_type = map.get('identity_type')
        self.outer_order_no = map.get('outer_order_no')
        self.scene_id = map.get('scene_id')
        self.user_id = map.get('user_id')
        self.user_ip = map.get('user_ip')
        self.user_mobile = map.get('user_mobile')
        return self


class ExecDiRealpersonFacevrfServerResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, certify_id=None, passed=None, reason=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
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
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['certify_id'] = self.certify_id
        result['passed'] = self.passed
        result['reason'] = self.reason
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.certify_id = map.get('certify_id')
        self.passed = map.get('passed')
        self.reason = map.get('reason')
        return self


class GetDiRealpersonFacevrfEvidenceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, certify_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        # 某次刷脸的certifyId
        self.certify_id = certify_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['certify_id'] = self.certify_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.certify_id = map.get('certify_id')
        return self


class GetDiRealpersonFacevrfEvidenceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, certify_id=None, onchain_id=None,
                 onchain_status=None, pdf_content=None, pdf_expired=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 刷脸的certifyId，原样返回
        self.certify_id = certify_id
        # 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
        self.onchain_id = onchain_id
        # 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
        self.onchain_status = onchain_status
        # 存证pdf文件内容的base64
        self.pdf_content = pdf_content
        # pdf存证是否已经过期，不支持超过6个月的存证获取
        self.pdf_expired = pdf_expired

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['certify_id'] = self.certify_id
        result['onchain_id'] = self.onchain_id
        result['onchain_status'] = self.onchain_status
        result['pdf_content'] = self.pdf_content
        result['pdf_expired'] = self.pdf_expired
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.certify_id = map.get('certify_id')
        self.onchain_id = map.get('onchain_id')
        self.onchain_status = map.get('onchain_status')
        self.pdf_content = map.get('pdf_content')
        self.pdf_expired = map.get('pdf_expired')
        return self
