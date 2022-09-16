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


class VerifyAntchainBbpMetaRequest(TeaModel):
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
        extension_info: NameValuePair = None,
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
        # 客户支付宝ID
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
            self.extension_info.validate()

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
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info.to_map()
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
        if m.get('extension_info') is not None:
            temp_model = NameValuePair()
            self.extension_info = temp_model.from_map(m['extension_info'])
        return self


class VerifyAntchainBbpMetaResponse(TeaModel):
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
        # 要素认证结果
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


