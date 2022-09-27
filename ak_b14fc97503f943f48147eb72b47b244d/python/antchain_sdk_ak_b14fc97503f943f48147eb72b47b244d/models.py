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


class NameValuePair(TeaModel):
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


class GwValidateProduct(TeaModel):
    def __init__(
        self,
        product_code: str = None,
        group: str = None,
        product_params: List[NameValuePair] = None,
    ):
        # 核审产品码，支持多种核身产品。
        # ZK_FACE_VERIFY：人脸识别
        self.product_code = product_code
        # 产品渲染方式：H5、NATIVE 或 PC
        self.group = group
        # 核身产品参数，因网关限制，暂只支持Map<String,String>
        self.product_params = product_params

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.group, 'group')
        if self.product_params:
            for k in self.product_params:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.group is not None:
            result['group'] = self.group
        result['product_params'] = []
        if self.product_params is not None:
            for k in self.product_params:
                result['product_params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('group') is not None:
            self.group = m.get('group')
        self.product_params = []
        if m.get('product_params') is not None:
            for k in m.get('product_params'):
                temp_model = NameValuePair()
                self.product_params.append(temp_model.from_map(k))
        return self


class AuthorizeRecordsPairs(TeaModel):
    def __init__(
        self,
        auth_business_code: str = None,
        auth_business_secret: str = None,
    ):
        # 授权业务
        self.auth_business_code = auth_business_code
        # 授权密钥
        self.auth_business_secret = auth_business_secret

    def validate(self):
        self.validate_required(self.auth_business_code, 'auth_business_code')
        self.validate_required(self.auth_business_secret, 'auth_business_secret')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_business_code is not None:
            result['auth_business_code'] = self.auth_business_code
        if self.auth_business_secret is not None:
            result['auth_business_secret'] = self.auth_business_secret
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_business_code') is not None:
            self.auth_business_code = m.get('auth_business_code')
        if m.get('auth_business_secret') is not None:
            self.auth_business_secret = m.get('auth_business_secret')
        return self


class CustomerAuthResult(TeaModel):
    def __init__(
        self,
        acc_id: str = None,
        code: str = None,
        customer_id: str = None,
        did: str = None,
        enterprise_status: str = None,
        open_time: str = None,
        pass_: bool = None,
        dis_req_msg_id: str = None,
    ):
        # 账户ID
        self.acc_id = acc_id
        # 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
        self.code = code
        # 客户ID
        self.customer_id = customer_id
        # 客户did
        self.did = did
        # 验证状态
        self.enterprise_status = enterprise_status
        # 开业时间
        self.open_time = open_time
        # 认证结果，是否通过
        self.pass_ = pass_
        # 业务ID
        self.dis_req_msg_id = dis_req_msg_id

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.open_time, 'open_time')
        self.validate_required(self.pass_, 'pass_')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.acc_id is not None:
            result['acc_id'] = self.acc_id
        if self.code is not None:
            result['code'] = self.code
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.did is not None:
            result['did'] = self.did
        if self.enterprise_status is not None:
            result['enterprise_status'] = self.enterprise_status
        if self.open_time is not None:
            result['open_time'] = self.open_time
        if self.pass_ is not None:
            result['pass'] = self.pass_
        if self.dis_req_msg_id is not None:
            result['dis_req_msg_id'] = self.dis_req_msg_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('acc_id') is not None:
            self.acc_id = m.get('acc_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('enterprise_status') is not None:
            self.enterprise_status = m.get('enterprise_status')
        if m.get('open_time') is not None:
            self.open_time = m.get('open_time')
        if m.get('pass') is not None:
            self.pass_ = m.get('pass')
        if m.get('dis_req_msg_id') is not None:
            self.dis_req_msg_id = m.get('dis_req_msg_id')
        return self


class QueryMap(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: List[NameValuePair] = None,
    ):
        # 查询枚举：QueryTypeEnum
        self.name = name
        # 查询参数
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.value:
            for k in self.value:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        result['value'] = []
        if self.value is not None:
            for k in self.value:
                result['value'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        self.value = []
        if m.get('value') is not None:
            for k in m.get('value'):
                temp_model = NameValuePair()
                self.value.append(temp_model.from_map(k))
        return self


class GwVerifyViewResult(TeaModel):
    def __init__(
        self,
        verify_id: str = None,
        product_code: str = None,
        group: str = None,
        response_params: List[NameValuePair] = None,
        success: bool = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 核身上下文id
        self.verify_id = verify_id
        # 核审产品码，支持多种核身产品。 ZK_FACE_VERIFY：人脸识别
        self.product_code = product_code
        # 核身分组
        self.group = group
        # 返回结果
        self.response_params = response_params
        # 核身渲染是否调用成功
        self.success = success
        # 返回码
        self.result_code = result_code
        # 返回信息
        self.result_msg = result_msg

    def validate(self):
        self.validate_required(self.verify_id, 'verify_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.group, 'group')
        self.validate_required(self.response_params, 'response_params')
        if self.response_params:
            for k in self.response_params:
                if k:
                    k.validate()
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.group is not None:
            result['group'] = self.group
        result['response_params'] = []
        if self.response_params is not None:
            for k in self.response_params:
                result['response_params'].append(k.to_map() if k else None)
        if self.success is not None:
            result['success'] = self.success
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('group') is not None:
            self.group = m.get('group')
        self.response_params = []
        if m.get('response_params') is not None:
            for k in m.get('response_params'):
                temp_model = NameValuePair()
                self.response_params.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class GwVerifyScene(TeaModel):
    def __init__(
        self,
        system_name: str = None,
        biz_product: str = None,
        biz_prod_node: str = None,
        access_channel: str = None,
        language: str = None,
    ):
        # 调用方系统名
        self.system_name = system_name
        # 业务方产品
        self.biz_product = biz_product
        # 业务产品节点
        self.biz_prod_node = biz_prod_node
        # 业务接入渠道
        self.access_channel = access_channel
        # 业务调用场景的语言版本、CHINESE("中文", "chi")、ENG("英文", "en")
        self.language = language

    def validate(self):
        self.validate_required(self.system_name, 'system_name')
        self.validate_required(self.biz_product, 'biz_product')
        self.validate_required(self.biz_prod_node, 'biz_prod_node')
        self.validate_required(self.access_channel, 'access_channel')
        self.validate_required(self.language, 'language')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.system_name is not None:
            result['system_name'] = self.system_name
        if self.biz_product is not None:
            result['biz_product'] = self.biz_product
        if self.biz_prod_node is not None:
            result['biz_prod_node'] = self.biz_prod_node
        if self.access_channel is not None:
            result['access_channel'] = self.access_channel
        if self.language is not None:
            result['language'] = self.language
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('system_name') is not None:
            self.system_name = m.get('system_name')
        if m.get('biz_product') is not None:
            self.biz_product = m.get('biz_product')
        if m.get('biz_prod_node') is not None:
            self.biz_prod_node = m.get('biz_prod_node')
        if m.get('access_channel') is not None:
            self.access_channel = m.get('access_channel')
        if m.get('language') is not None:
            self.language = m.get('language')
        return self


class AuthAntchainBbpCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        ep_cert_no_type: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        legal_person_cert_no_type: str = None,
        owner_name: str = None,
        owner_uid: str = None,
        biz_id: str = None,
        channel: str = None,
        certify_enum: str = None,
        alipay_uid: str = None,
        person_name: str = None,
        person_cert_no: str = None,
        person_cert_type: str = None,
        extension_info: List[NameValuePair] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 预留业务code
        self.biz_code = biz_code
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号码
        self.ep_cert_no = ep_cert_no
        # 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        self.ep_cert_no_type = ep_cert_no_type
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 法人证件号码
        self.legal_person_cert_no = legal_person_cert_no
        # 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        # 
        self.legal_person_cert_no_type = legal_person_cert_no_type
        # 系统名称
        self.owner_name = owner_name
        # 系统租户ID
        self.owner_uid = owner_uid
        # 业务唯一ID
        self.biz_id = biz_id
        # 业务渠道，需提前申请产品码
        self.channel = channel
        # 认证类型：ENTERPRISE-企业, PERSON-个人
        self.certify_enum = certify_enum
        # 客户支付宝ID，如有则填。
        self.alipay_uid = alipay_uid
        # 个人姓名，用于个人认证
        self.person_name = person_name
        # 个人证件号码
        self.person_cert_no = person_cert_no
        # 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        self.person_cert_type = person_cert_type
        # 扩展信息
        self.extension_info = extension_info

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.ep_cert_no_type, 'ep_cert_no_type')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.certify_enum, 'certify_enum')
        if self.extension_info:
            for k in self.extension_info:
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
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.ep_cert_no_type is not None:
            result['ep_cert_no_type'] = self.ep_cert_no_type
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.legal_person_cert_no_type is not None:
            result['legal_person_cert_no_type'] = self.legal_person_cert_no_type
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.channel is not None:
            result['channel'] = self.channel
        if self.certify_enum is not None:
            result['certify_enum'] = self.certify_enum
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        if self.person_name is not None:
            result['person_name'] = self.person_name
        if self.person_cert_no is not None:
            result['person_cert_no'] = self.person_cert_no
        if self.person_cert_type is not None:
            result['person_cert_type'] = self.person_cert_type
        result['extension_info'] = []
        if self.extension_info is not None:
            for k in self.extension_info:
                result['extension_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('ep_cert_no_type') is not None:
            self.ep_cert_no_type = m.get('ep_cert_no_type')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('legal_person_cert_no_type') is not None:
            self.legal_person_cert_no_type = m.get('legal_person_cert_no_type')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('certify_enum') is not None:
            self.certify_enum = m.get('certify_enum')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        if m.get('person_name') is not None:
            self.person_name = m.get('person_name')
        if m.get('person_cert_no') is not None:
            self.person_cert_no = m.get('person_cert_no')
        if m.get('person_cert_type') is not None:
            self.person_cert_type = m.get('person_cert_type')
        self.extension_info = []
        if m.get('extension_info') is not None:
            for k in m.get('extension_info'):
                temp_model = NameValuePair()
                self.extension_info.append(temp_model.from_map(k))
        return self


class AuthAntchainBbpCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: CustomerAuthResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户认证结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

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
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = CustomerAuthResult()
            self.result = temp_model.from_map(m['result'])
        return self


class CreateAntchainBbpCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        customer_type: str = None,
        name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        legal_person_cert_no_type: str = None,
        is_auth: bool = None,
        business_role: str = None,
        alipay_uid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务渠道，需提前申请产品码
        self.biz_code = biz_code
        # 客户类型：ENTERPRISE-企业, PERSON-个人
        # 
        self.customer_type = customer_type
        # 客户名称
        self.name = name
        # 客户证件号码，企业/个人均可
        self.cert_no = cert_no
        # 客户证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        self.cert_type = cert_type
        # 法人姓名
        # 
        self.legal_person_cert_name = legal_person_cert_name
        # 法人证件号码
        # 
        self.legal_person_cert_no = legal_person_cert_no
        # 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
        self.legal_person_cert_no_type = legal_person_cert_no_type
        # 是否需要先认证再注册，默认不认证。
        self.is_auth = is_auth
        # 业务角色： 买方，卖方，机构，合作伙伴
        self.business_role = business_role
        # 客户支付宝ID，如有则填。
        self.alipay_uid = alipay_uid

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.customer_type, 'customer_type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.legal_person_cert_no_type, 'legal_person_cert_no_type')
        self.validate_required(self.is_auth, 'is_auth')

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
        if self.customer_type is not None:
            result['customer_type'] = self.customer_type
        if self.name is not None:
            result['name'] = self.name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.legal_person_cert_no_type is not None:
            result['legal_person_cert_no_type'] = self.legal_person_cert_no_type
        if self.is_auth is not None:
            result['is_auth'] = self.is_auth
        if self.business_role is not None:
            result['business_role'] = self.business_role
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('customer_type') is not None:
            self.customer_type = m.get('customer_type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('legal_person_cert_no_type') is not None:
            self.legal_person_cert_no_type = m.get('legal_person_cert_no_type')
        if m.get('is_auth') is not None:
            self.is_auth = m.get('is_auth')
        if m.get('business_role') is not None:
            self.business_role = m.get('business_role')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        return self


class CreateAntchainBbpCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        customer_id: str = None,
        acc_id: str = None,
        auth_four_elements_response: CustomerAuthResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 统一客户ID
        self.customer_id = customer_id
        # 统一账户ID
        self.acc_id = acc_id
        # 客户认证结果
        self.auth_four_elements_response = auth_four_elements_response

    def validate(self):
        if self.auth_four_elements_response:
            self.auth_four_elements_response.validate()

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
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.acc_id is not None:
            result['acc_id'] = self.acc_id
        if self.auth_four_elements_response is not None:
            result['auth_four_elements_response'] = self.auth_four_elements_response.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('acc_id') is not None:
            self.acc_id = m.get('acc_id')
        if m.get('auth_four_elements_response') is not None:
            temp_model = CustomerAuthResult()
            self.auth_four_elements_response = temp_model.from_map(m['auth_four_elements_response'])
        return self


class QueryAntchainBbpCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        condition_map: List[QueryMap] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询内容
        self.condition_map = condition_map

    def validate(self):
        self.validate_required(self.condition_map, 'condition_map')
        if self.condition_map:
            for k in self.condition_map:
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
        result['condition_map'] = []
        if self.condition_map is not None:
            for k in self.condition_map:
                result['condition_map'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.condition_map = []
        if m.get('condition_map') is not None:
            for k in m.get('condition_map'):
                temp_model = QueryMap()
                self.condition_map.append(temp_model.from_map(k))
        return self


class QueryAntchainBbpCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[NameValuePair] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
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
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = NameValuePair()
                self.result.append(temp_model.from_map(k))
        return self


class MatchAntchainBbpDidAccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        uid: str = None,
        did: str = None,
        chain_id: str = None,
        chain_account: str = None,
        kms_key_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码(YYX)
        self.biz_code = biz_code
        # 支付宝uid
        self.uid = uid
        # 分布式id ，双向check
        self.did = did
        # 链id
        self.chain_id = chain_id
        # 链账户
        self.chain_account = chain_account
        # 托管情况下包含
        self.kms_key_id = kms_key_id

    def validate(self):
        self.validate_required(self.uid, 'uid')
        self.validate_required(self.did, 'did')
        self.validate_required(self.chain_id, 'chain_id')
        self.validate_required(self.chain_account, 'chain_account')

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
        if self.uid is not None:
            result['uid'] = self.uid
        if self.did is not None:
            result['did'] = self.did
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.chain_account is not None:
            result['chain_account'] = self.chain_account
        if self.kms_key_id is not None:
            result['kms_key_id'] = self.kms_key_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('chain_account') is not None:
            self.chain_account = m.get('chain_account')
        if m.get('kms_key_id') is not None:
            self.kms_key_id = m.get('kms_key_id')
        return self


class MatchAntchainBbpDidAccountResponse(TeaModel):
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


class OperateAntchainBbpInsuranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mechanism_code: str = None,
        policy_encryption_context: str = None,
        policy_no: str = None,
        thirdpart_sku: str = None,
        mechanism_name: str = None,
        insurance_type: str = None,
        source_uid: str = None,
        source: str = None,
        user_name: str = None,
        user_type: str = None,
        user_phonenumber: str = None,
        user_cert_no: str = None,
        extend: str = None,
        policy_effect_time: int = None,
        policy_invalid_time: int = None,
        policy_total_amount: int = None,
        policy_total_stage: int = None,
        policy_pay_date: int = None,
        policy_paid_stage: int = None,
        policy_stage_aver_amount: int = None,
        order_time: int = None,
        operation: str = None,
        claim_order_no: str = None,
        claim_apply_time: int = None,
        claim_pay_time: int = None,
        claim_apply_amount: int = None,
        claim_amount: int = None,
        authorize_records: List[AuthorizeRecordsPairs] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保司编码
        self.mechanism_code = mechanism_code
        # 保单加密信息
        self.policy_encryption_context = policy_encryption_context
        # 保单号
        self.policy_no = policy_no
        # 保险产品SKU
        self.thirdpart_sku = thirdpart_sku
        # 保险公司名称
        self.mechanism_name = mechanism_name
        # 保单种类，险种
        self.insurance_type = insurance_type
        # 来源uid，此处指天猫id
        self.source_uid = source_uid
        # 订单来源
        self.source = source
        # 投保人
        self.user_name = user_name
        # 投保人类型  自然人/公司
        self.user_type = user_type
        # 投保人电话号码
        self.user_phonenumber = user_phonenumber
        # 投保人证件号
        self.user_cert_no = user_cert_no
        # 拓展信息
        self.extend = extend
        # 保单生效时间（毫秒值）
        self.policy_effect_time = policy_effect_time
        # 保单失效时间（毫秒值）
        self.policy_invalid_time = policy_invalid_time
        # 订单总金额 BigDecimal
        self.policy_total_amount = policy_total_amount
        # 订单总期数（一次性付款用1）
        self.policy_total_stage = policy_total_stage
        # 保费支付日期（毫秒值）
        self.policy_pay_date = policy_pay_date
        # 已支付保费期数（1代表1期）
        self.policy_paid_stage = policy_paid_stage
        # 每一期保费金额BigDecimal
        self.policy_stage_aver_amount = policy_stage_aver_amount
        # 订单时间（毫秒值）
        self.order_time = order_time
        # 操作类型
        # 下单 支付 理赔 退单
        self.operation = operation
        # 赔付单号(对于赔付操作来说是必填项)
        self.claim_order_no = claim_order_no
        # 理赔申请时间 理赔操作必填
        self.claim_apply_time = claim_apply_time
        # 理赔赔付时间 理赔操作必填
        self.claim_pay_time = claim_pay_time
        # 理赔申请金额BigDecimal，单位元，保留小数点两位  理赔操作必填
        self.claim_apply_amount = claim_apply_amount
        # 理赔金额BigDecimal，理赔操作必填
        self.claim_amount = claim_amount
        # 授权列表
        self.authorize_records = authorize_records

    def validate(self):
        self.validate_required(self.mechanism_code, 'mechanism_code')
        self.validate_required(self.policy_encryption_context, 'policy_encryption_context')
        self.validate_required(self.policy_no, 'policy_no')
        self.validate_required(self.thirdpart_sku, 'thirdpart_sku')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.policy_effect_time, 'policy_effect_time')
        self.validate_required(self.policy_invalid_time, 'policy_invalid_time')
        self.validate_required(self.policy_total_amount, 'policy_total_amount')
        self.validate_required(self.policy_total_stage, 'policy_total_stage')
        self.validate_required(self.policy_pay_date, 'policy_pay_date')
        if self.authorize_records:
            for k in self.authorize_records:
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
        if self.mechanism_code is not None:
            result['mechanism_code'] = self.mechanism_code
        if self.policy_encryption_context is not None:
            result['policy_encryption_context'] = self.policy_encryption_context
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.thirdpart_sku is not None:
            result['thirdpart_sku'] = self.thirdpart_sku
        if self.mechanism_name is not None:
            result['mechanism_name'] = self.mechanism_name
        if self.insurance_type is not None:
            result['insurance_type'] = self.insurance_type
        if self.source_uid is not None:
            result['source_uid'] = self.source_uid
        if self.source is not None:
            result['source'] = self.source
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_phonenumber is not None:
            result['user_phonenumber'] = self.user_phonenumber
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        if self.extend is not None:
            result['extend'] = self.extend
        if self.policy_effect_time is not None:
            result['policy_effect_time'] = self.policy_effect_time
        if self.policy_invalid_time is not None:
            result['policy_invalid_time'] = self.policy_invalid_time
        if self.policy_total_amount is not None:
            result['policy_total_amount'] = self.policy_total_amount
        if self.policy_total_stage is not None:
            result['policy_total_stage'] = self.policy_total_stage
        if self.policy_pay_date is not None:
            result['policy_pay_date'] = self.policy_pay_date
        if self.policy_paid_stage is not None:
            result['policy_paid_stage'] = self.policy_paid_stage
        if self.policy_stage_aver_amount is not None:
            result['policy_stage_aver_amount'] = self.policy_stage_aver_amount
        if self.order_time is not None:
            result['order_time'] = self.order_time
        if self.operation is not None:
            result['operation'] = self.operation
        if self.claim_order_no is not None:
            result['claim_order_no'] = self.claim_order_no
        if self.claim_apply_time is not None:
            result['claim_apply_time'] = self.claim_apply_time
        if self.claim_pay_time is not None:
            result['claim_pay_time'] = self.claim_pay_time
        if self.claim_apply_amount is not None:
            result['claim_apply_amount'] = self.claim_apply_amount
        if self.claim_amount is not None:
            result['claim_amount'] = self.claim_amount
        result['authorize_records'] = []
        if self.authorize_records is not None:
            for k in self.authorize_records:
                result['authorize_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mechanism_code') is not None:
            self.mechanism_code = m.get('mechanism_code')
        if m.get('policy_encryption_context') is not None:
            self.policy_encryption_context = m.get('policy_encryption_context')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('thirdpart_sku') is not None:
            self.thirdpart_sku = m.get('thirdpart_sku')
        if m.get('mechanism_name') is not None:
            self.mechanism_name = m.get('mechanism_name')
        if m.get('insurance_type') is not None:
            self.insurance_type = m.get('insurance_type')
        if m.get('source_uid') is not None:
            self.source_uid = m.get('source_uid')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_phonenumber') is not None:
            self.user_phonenumber = m.get('user_phonenumber')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        if m.get('extend') is not None:
            self.extend = m.get('extend')
        if m.get('policy_effect_time') is not None:
            self.policy_effect_time = m.get('policy_effect_time')
        if m.get('policy_invalid_time') is not None:
            self.policy_invalid_time = m.get('policy_invalid_time')
        if m.get('policy_total_amount') is not None:
            self.policy_total_amount = m.get('policy_total_amount')
        if m.get('policy_total_stage') is not None:
            self.policy_total_stage = m.get('policy_total_stage')
        if m.get('policy_pay_date') is not None:
            self.policy_pay_date = m.get('policy_pay_date')
        if m.get('policy_paid_stage') is not None:
            self.policy_paid_stage = m.get('policy_paid_stage')
        if m.get('policy_stage_aver_amount') is not None:
            self.policy_stage_aver_amount = m.get('policy_stage_aver_amount')
        if m.get('order_time') is not None:
            self.order_time = m.get('order_time')
        if m.get('operation') is not None:
            self.operation = m.get('operation')
        if m.get('claim_order_no') is not None:
            self.claim_order_no = m.get('claim_order_no')
        if m.get('claim_apply_time') is not None:
            self.claim_apply_time = m.get('claim_apply_time')
        if m.get('claim_pay_time') is not None:
            self.claim_pay_time = m.get('claim_pay_time')
        if m.get('claim_apply_amount') is not None:
            self.claim_apply_amount = m.get('claim_apply_amount')
        if m.get('claim_amount') is not None:
            self.claim_amount = m.get('claim_amount')
        self.authorize_records = []
        if m.get('authorize_records') is not None:
            for k in m.get('authorize_records'):
                temp_model = AuthorizeRecordsPairs()
                self.authorize_records.append(temp_model.from_map(k))
        return self


class OperateAntchainBbpInsuranceResponse(TeaModel):
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


class SyncAntchainBbpInsuranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mechanism_code: str = None,
        policy_encryption_context: str = None,
        policy_no: str = None,
        thirdpart_sku: str = None,
        mechanism_name: str = None,
        insurance_type: str = None,
        operation: str = None,
        claim_order_no: str = None,
        claim_apply_time: int = None,
        claim_pay_time: str = None,
        claim_apply_amount: int = None,
        claim_amount: int = None,
        authorize_records: List[AuthorizeRecordsPairs] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保司编码
        self.mechanism_code = mechanism_code
        # 理赔加密信息
        self.policy_encryption_context = policy_encryption_context
        # 保单号
        self.policy_no = policy_no
        # 保险产品SKU
        self.thirdpart_sku = thirdpart_sku
        # 保司名称
        self.mechanism_name = mechanism_name
        # 保单种类，险种
        self.insurance_type = insurance_type
        # 操作类型
        # 下单 支付 理赔 退单
        self.operation = operation
        # 赔付单号
        self.claim_order_no = claim_order_no
        # 理赔申请时间（毫秒值）
        self.claim_apply_time = claim_apply_time
        # 理赔赔付时间（毫秒值）
        self.claim_pay_time = claim_pay_time
        # 理赔申请金额，单位元，保留小数点两位BigDecimal
        self.claim_apply_amount = claim_apply_amount
        # 理赔金额
        self.claim_amount = claim_amount
        # 授权列表
        self.authorize_records = authorize_records

    def validate(self):
        self.validate_required(self.mechanism_code, 'mechanism_code')
        self.validate_required(self.policy_encryption_context, 'policy_encryption_context')
        self.validate_required(self.policy_no, 'policy_no')
        self.validate_required(self.thirdpart_sku, 'thirdpart_sku')
        self.validate_required(self.claim_order_no, 'claim_order_no')
        self.validate_required(self.claim_apply_time, 'claim_apply_time')
        self.validate_required(self.claim_pay_time, 'claim_pay_time')
        self.validate_required(self.claim_apply_amount, 'claim_apply_amount')
        self.validate_required(self.claim_amount, 'claim_amount')
        if self.authorize_records:
            for k in self.authorize_records:
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
        if self.mechanism_code is not None:
            result['mechanism_code'] = self.mechanism_code
        if self.policy_encryption_context is not None:
            result['policy_encryption_context'] = self.policy_encryption_context
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.thirdpart_sku is not None:
            result['thirdpart_sku'] = self.thirdpart_sku
        if self.mechanism_name is not None:
            result['mechanism_name'] = self.mechanism_name
        if self.insurance_type is not None:
            result['insurance_type'] = self.insurance_type
        if self.operation is not None:
            result['operation'] = self.operation
        if self.claim_order_no is not None:
            result['claim_order_no'] = self.claim_order_no
        if self.claim_apply_time is not None:
            result['claim_apply_time'] = self.claim_apply_time
        if self.claim_pay_time is not None:
            result['claim_pay_time'] = self.claim_pay_time
        if self.claim_apply_amount is not None:
            result['claim_apply_amount'] = self.claim_apply_amount
        if self.claim_amount is not None:
            result['claim_amount'] = self.claim_amount
        result['authorize_records'] = []
        if self.authorize_records is not None:
            for k in self.authorize_records:
                result['authorize_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mechanism_code') is not None:
            self.mechanism_code = m.get('mechanism_code')
        if m.get('policy_encryption_context') is not None:
            self.policy_encryption_context = m.get('policy_encryption_context')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('thirdpart_sku') is not None:
            self.thirdpart_sku = m.get('thirdpart_sku')
        if m.get('mechanism_name') is not None:
            self.mechanism_name = m.get('mechanism_name')
        if m.get('insurance_type') is not None:
            self.insurance_type = m.get('insurance_type')
        if m.get('operation') is not None:
            self.operation = m.get('operation')
        if m.get('claim_order_no') is not None:
            self.claim_order_no = m.get('claim_order_no')
        if m.get('claim_apply_time') is not None:
            self.claim_apply_time = m.get('claim_apply_time')
        if m.get('claim_pay_time') is not None:
            self.claim_pay_time = m.get('claim_pay_time')
        if m.get('claim_apply_amount') is not None:
            self.claim_apply_amount = m.get('claim_apply_amount')
        if m.get('claim_amount') is not None:
            self.claim_amount = m.get('claim_amount')
        self.authorize_records = []
        if m.get('authorize_records') is not None:
            for k in m.get('authorize_records'):
                temp_model = AuthorizeRecordsPairs()
                self.authorize_records.append(temp_model.from_map(k))
        return self


class SyncAntchainBbpInsuranceResponse(TeaModel):
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


class UploadAntchainBbpInsuranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mechanism_code: str = None,
        policy_encryption_context: str = None,
        policy_no: str = None,
        thirdpart_sku: str = None,
        mechanism_name: str = None,
        insurance_type: str = None,
        source_uid: str = None,
        source: str = None,
        user_name: str = None,
        user_type: str = None,
        user_phonenumber: str = None,
        user_cert_no: str = None,
        extend: str = None,
        policy_effect_time: int = None,
        policy_invalid_time: int = None,
        policy_total_amount: int = None,
        policy_total_stage: int = None,
        policy_pay_date: int = None,
        policy_paid_stage: int = None,
        policy_stage_aver_amount: int = None,
        order_time: int = None,
        operation: str = None,
        claim_order_no: str = None,
        claim_apply_time: int = None,
        claim_pay_time: int = None,
        claim_apply_amount: str = None,
        claim_amount: str = None,
        authorize_records: List[AuthorizeRecordsPairs] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保司编码
        self.mechanism_code = mechanism_code
        # 保单加密信息
        self.policy_encryption_context = policy_encryption_context
        # 保单号
        self.policy_no = policy_no
        # 保险产品SKU
        self.thirdpart_sku = thirdpart_sku
        # 保司名称
        self.mechanism_name = mechanism_name
        # 保单种类，险种
        self.insurance_type = insurance_type
        # 来源uid，此处指天猫id
        self.source_uid = source_uid
        # 订单来源
        self.source = source
        # 投保人
        self.user_name = user_name
        # 投保人类型  自然人/公司
        self.user_type = user_type
        # 投保人电话号码
        self.user_phonenumber = user_phonenumber
        # 投保人证件号
        self.user_cert_no = user_cert_no
        # 拓展信息
        self.extend = extend
        # 保单生效时间（毫秒值）
        self.policy_effect_time = policy_effect_time
        # 保单失效时间
        self.policy_invalid_time = policy_invalid_time
        # 订单总金额BigDecimal
        self.policy_total_amount = policy_total_amount
        # 订单总期数（一次性付款用1）
        self.policy_total_stage = policy_total_stage
        # 保费支付日期（毫秒值）
        self.policy_pay_date = policy_pay_date
        # 已支付保费期数
        self.policy_paid_stage = policy_paid_stage
        # 每一期保费金额BigDecimal
        self.policy_stage_aver_amount = policy_stage_aver_amount
        # 订单时间（毫秒值）
        self.order_time = order_time
        # 操作类型
        # 下单 支付 理赔 退单
        self.operation = operation
        # 赔付单号 理赔操作必填
        self.claim_order_no = claim_order_no
        # 理赔申请时间（毫秒值） 理赔操作必填
        self.claim_apply_time = claim_apply_time
        # 理赔赔付时间（毫秒值） 理赔操作必填
        self.claim_pay_time = claim_pay_time
        # 理赔申请金额，单位元，保留小数点两位 BigDecimal	理赔操作必填
        self.claim_apply_amount = claim_apply_amount
        # 理赔金额 BigDecimal	理赔操作必填
        self.claim_amount = claim_amount
        # 授权列表
        self.authorize_records = authorize_records

    def validate(self):
        self.validate_required(self.mechanism_code, 'mechanism_code')
        self.validate_required(self.policy_encryption_context, 'policy_encryption_context')
        self.validate_required(self.policy_no, 'policy_no')
        self.validate_required(self.thirdpart_sku, 'thirdpart_sku')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.policy_effect_time, 'policy_effect_time')
        self.validate_required(self.policy_invalid_time, 'policy_invalid_time')
        self.validate_required(self.policy_total_amount, 'policy_total_amount')
        self.validate_required(self.policy_total_stage, 'policy_total_stage')
        self.validate_required(self.policy_pay_date, 'policy_pay_date')
        if self.authorize_records:
            for k in self.authorize_records:
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
        if self.mechanism_code is not None:
            result['mechanism_code'] = self.mechanism_code
        if self.policy_encryption_context is not None:
            result['policy_encryption_context'] = self.policy_encryption_context
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.thirdpart_sku is not None:
            result['thirdpart_sku'] = self.thirdpart_sku
        if self.mechanism_name is not None:
            result['mechanism_name'] = self.mechanism_name
        if self.insurance_type is not None:
            result['insurance_type'] = self.insurance_type
        if self.source_uid is not None:
            result['source_uid'] = self.source_uid
        if self.source is not None:
            result['source'] = self.source
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_phonenumber is not None:
            result['user_phonenumber'] = self.user_phonenumber
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        if self.extend is not None:
            result['extend'] = self.extend
        if self.policy_effect_time is not None:
            result['policy_effect_time'] = self.policy_effect_time
        if self.policy_invalid_time is not None:
            result['policy_invalid_time'] = self.policy_invalid_time
        if self.policy_total_amount is not None:
            result['policy_total_amount'] = self.policy_total_amount
        if self.policy_total_stage is not None:
            result['policy_total_stage'] = self.policy_total_stage
        if self.policy_pay_date is not None:
            result['policy_pay_date'] = self.policy_pay_date
        if self.policy_paid_stage is not None:
            result['policy_paid_stage'] = self.policy_paid_stage
        if self.policy_stage_aver_amount is not None:
            result['policy_stage_aver_amount'] = self.policy_stage_aver_amount
        if self.order_time is not None:
            result['order_time'] = self.order_time
        if self.operation is not None:
            result['operation'] = self.operation
        if self.claim_order_no is not None:
            result['claim_order_no'] = self.claim_order_no
        if self.claim_apply_time is not None:
            result['claim_apply_time'] = self.claim_apply_time
        if self.claim_pay_time is not None:
            result['claim_pay_time'] = self.claim_pay_time
        if self.claim_apply_amount is not None:
            result['claim_apply_amount'] = self.claim_apply_amount
        if self.claim_amount is not None:
            result['claim_amount'] = self.claim_amount
        result['authorize_records'] = []
        if self.authorize_records is not None:
            for k in self.authorize_records:
                result['authorize_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mechanism_code') is not None:
            self.mechanism_code = m.get('mechanism_code')
        if m.get('policy_encryption_context') is not None:
            self.policy_encryption_context = m.get('policy_encryption_context')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('thirdpart_sku') is not None:
            self.thirdpart_sku = m.get('thirdpart_sku')
        if m.get('mechanism_name') is not None:
            self.mechanism_name = m.get('mechanism_name')
        if m.get('insurance_type') is not None:
            self.insurance_type = m.get('insurance_type')
        if m.get('source_uid') is not None:
            self.source_uid = m.get('source_uid')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_phonenumber') is not None:
            self.user_phonenumber = m.get('user_phonenumber')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        if m.get('extend') is not None:
            self.extend = m.get('extend')
        if m.get('policy_effect_time') is not None:
            self.policy_effect_time = m.get('policy_effect_time')
        if m.get('policy_invalid_time') is not None:
            self.policy_invalid_time = m.get('policy_invalid_time')
        if m.get('policy_total_amount') is not None:
            self.policy_total_amount = m.get('policy_total_amount')
        if m.get('policy_total_stage') is not None:
            self.policy_total_stage = m.get('policy_total_stage')
        if m.get('policy_pay_date') is not None:
            self.policy_pay_date = m.get('policy_pay_date')
        if m.get('policy_paid_stage') is not None:
            self.policy_paid_stage = m.get('policy_paid_stage')
        if m.get('policy_stage_aver_amount') is not None:
            self.policy_stage_aver_amount = m.get('policy_stage_aver_amount')
        if m.get('order_time') is not None:
            self.order_time = m.get('order_time')
        if m.get('operation') is not None:
            self.operation = m.get('operation')
        if m.get('claim_order_no') is not None:
            self.claim_order_no = m.get('claim_order_no')
        if m.get('claim_apply_time') is not None:
            self.claim_apply_time = m.get('claim_apply_time')
        if m.get('claim_pay_time') is not None:
            self.claim_pay_time = m.get('claim_pay_time')
        if m.get('claim_apply_amount') is not None:
            self.claim_apply_amount = m.get('claim_apply_amount')
        if m.get('claim_amount') is not None:
            self.claim_amount = m.get('claim_amount')
        self.authorize_records = []
        if m.get('authorize_records') is not None:
            for k in m.get('authorize_records'):
                temp_model = AuthorizeRecordsPairs()
                self.authorize_records.append(temp_model.from_map(k))
        return self


class UploadAntchainBbpInsuranceResponse(TeaModel):
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


class InitAntchainBbpInsuranceUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        business_code: str = None,
        third_part_id: str = None,
        channel: str = None,
        burieds: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保司编码
        self.business_code = business_code
        # 三方Id，此处为天猫id
        self.third_part_id = third_part_id
        # 来源渠道，TIANMAO（天猫）
        self.channel = channel
        # 埋点信息，JSON格式字符串
        self.burieds = burieds

    def validate(self):
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.third_part_id, 'third_part_id')
        self.validate_required(self.channel, 'channel')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.third_part_id is not None:
            result['third_part_id'] = self.third_part_id
        if self.channel is not None:
            result['channel'] = self.channel
        if self.burieds is not None:
            result['burieds'] = self.burieds
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('third_part_id') is not None:
            self.third_part_id = m.get('third_part_id')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('burieds') is not None:
            self.burieds = m.get('burieds')
        return self


class InitAntchainBbpInsuranceUserResponse(TeaModel):
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


class CheckAntchainBbpVerifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        verify_id: str = None,
        group: str = None,
        product_action: str = None,
        biz_id: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 核身上下文id
        self.verify_id = verify_id
        # 核身模块分组
        self.group = group
        # 核身动作：view-渲染，verify-校验，repeat-重新发送
        self.product_action = product_action
        # 业务id
        self.biz_id = biz_id
        # 核身产品码
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.verify_id, 'verify_id')
        self.validate_required(self.group, 'group')
        self.validate_required(self.product_action, 'product_action')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        if self.group is not None:
            result['group'] = self.group
        if self.product_action is not None:
            result['product_action'] = self.product_action
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('group') is not None:
            self.group = m.get('group')
        if m.get('product_action') is not None:
            self.product_action = m.get('product_action')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class CheckAntchainBbpVerifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核身结果枚举：PASS-核身成功，INITIAL-初始化，PROCESS-处理中，FAIL-失败
        self.status = status

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
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class InitAntchainBbpVerifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        verify_scene: GwVerifyScene = None,
        biz_id: str = None,
        extern_params: List[NameValuePair] = None,
        callback_enum: str = None,
        validate_flows: List[GwValidateProduct] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 接入场景（主要由接入系统、接入产品、产品节点三部分组成）
        self.verify_scene = verify_scene
        # 调用方传入，唯一标识一笔业务，核身平台将bizId与核身token进行绑定，用作防串改校验
        self.biz_id = biz_id
        # 调用方传入，存放业务扩展参数（callback参数也写入此）
        self.extern_params = extern_params
        # 调用方传入，指定核身完成后的回调类型
        self.callback_enum = callback_enum
        # 核身产品列表
        self.validate_flows = validate_flows

    def validate(self):
        self.validate_required(self.verify_scene, 'verify_scene')
        if self.verify_scene:
            self.verify_scene.validate()
        self.validate_required(self.biz_id, 'biz_id')
        if self.extern_params:
            for k in self.extern_params:
                if k:
                    k.validate()
        self.validate_required(self.validate_flows, 'validate_flows')
        if self.validate_flows:
            for k in self.validate_flows:
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
        if self.verify_scene is not None:
            result['verify_scene'] = self.verify_scene.to_map()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        result['extern_params'] = []
        if self.extern_params is not None:
            for k in self.extern_params:
                result['extern_params'].append(k.to_map() if k else None)
        if self.callback_enum is not None:
            result['callback_enum'] = self.callback_enum
        result['validate_flows'] = []
        if self.validate_flows is not None:
            for k in self.validate_flows:
                result['validate_flows'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('verify_scene') is not None:
            temp_model = GwVerifyScene()
            self.verify_scene = temp_model.from_map(m['verify_scene'])
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        self.extern_params = []
        if m.get('extern_params') is not None:
            for k in m.get('extern_params'):
                temp_model = NameValuePair()
                self.extern_params.append(temp_model.from_map(k))
        if m.get('callback_enum') is not None:
            self.callback_enum = m.get('callback_enum')
        self.validate_flows = []
        if m.get('validate_flows') is not None:
            for k in m.get('validate_flows'):
                temp_model = GwValidateProduct()
                self.validate_flows.append(temp_model.from_map(k))
        return self


class InitAntchainBbpVerifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        verify_id: str = None,
        verify_url: str = None,
        verify_status: str = None,
        valid_prod: List[GwValidateProduct] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核身id
        self.verify_id = verify_id
        # 核身请求地址url
        self.verify_url = verify_url
        # 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
        self.verify_status = verify_status
        # 可用产品集合
        self.valid_prod = valid_prod

    def validate(self):
        if self.valid_prod:
            for k in self.valid_prod:
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
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
        if self.verify_status is not None:
            result['verify_status'] = self.verify_status
        result['valid_prod'] = []
        if self.valid_prod is not None:
            for k in self.valid_prod:
                result['valid_prod'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        if m.get('verify_status') is not None:
            self.verify_status = m.get('verify_status')
        self.valid_prod = []
        if m.get('valid_prod') is not None:
            for k in m.get('valid_prod'):
                temp_model = GwValidateProduct()
                self.valid_prod.append(temp_model.from_map(k))
        return self


class StartAntchainBbpVerifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        verify_id: str = None,
        group: str = None,
        product_action: str = None,
        biz_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 核身上下文id
        self.verify_id = verify_id
        # 核身模块分组
        self.group = group
        # 核身动作：view-渲染，verify-校验，repeat-重新发送
        self.product_action = product_action
        # 业务id
        self.biz_id = biz_id

    def validate(self):
        self.validate_required(self.verify_id, 'verify_id')
        self.validate_required(self.group, 'group')
        self.validate_required(self.product_action, 'product_action')
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
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        if self.group is not None:
            result['group'] = self.group
        if self.product_action is not None:
            result['product_action'] = self.product_action
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('group') is not None:
            self.group = m.get('group')
        if m.get('product_action') is not None:
            self.product_action = m.get('product_action')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        return self


class StartAntchainBbpVerifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[GwVerifyViewResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核身渲染结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
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
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = GwVerifyViewResult()
                self.result.append(temp_model.from_map(k))
        return self


