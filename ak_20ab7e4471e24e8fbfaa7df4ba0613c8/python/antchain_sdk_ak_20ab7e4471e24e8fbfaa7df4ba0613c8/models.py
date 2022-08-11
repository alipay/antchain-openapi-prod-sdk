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


class DidDocServicesInfo(TeaModel):
    def __init__(
        self,
        extension: str = None,
        id: str = None,
        service_endpoint: str = None,
        type: str = None,
    ):
        # 服务的扩展字段
        self.extension = extension
        # 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务：
        # DidAuthService， 有且只能有一个，并且id必须为didauth-1；
        # VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
        self.id = id
        # 服务的可访问地址
        self.service_endpoint = service_endpoint
        # 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
        self.type = type

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.service_endpoint, 'service_endpoint')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.extension is not None:
            result['extension'] = self.extension
        if self.id is not None:
            result['id'] = self.id
        if self.service_endpoint is not None:
            result['service_endpoint'] = self.service_endpoint
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('service_endpoint') is not None:
            self.service_endpoint = m.get('service_endpoint')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class IdentityParam(TeaModel):
    def __init__(
        self,
        agent: str = None,
        agent_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        legal_person: str = None,
        legal_person_id: str = None,
        mobile_no: str = None,
        properties: str = None,
        user_type: str = None,
    ):
        # 经办人姓名
        self.agent = agent
        # 经办人身份证号
        self.agent_id = agent_id
        # 用户的姓名
        self.cert_name = cert_name
        # 用户的身份证号
        self.cert_no = cert_no
        # 用户证件类型，目前只支持IDENTITY_CARD
        self.cert_type = cert_type
        # 法人姓名，企业认证必选
        self.legal_person = legal_person
        # 法人身份证，企业认证必选
        self.legal_person_id = legal_person_id
        # 手机号码
        self.mobile_no = mobile_no
        # 扩展属性字段
        self.properties = properties
        # 用户类型，默认为PERSON
        self.user_type = user_type

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.agent is not None:
            result['agent'] = self.agent
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.legal_person is not None:
            result['legal_person'] = self.legal_person
        if self.legal_person_id is not None:
            result['legal_person_id'] = self.legal_person_id
        if self.mobile_no is not None:
            result['mobile_no'] = self.mobile_no
        if self.properties is not None:
            result['properties'] = self.properties
        if self.user_type is not None:
            result['user_type'] = self.user_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agent') is not None:
            self.agent = m.get('agent')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('legal_person') is not None:
            self.legal_person = m.get('legal_person')
        if m.get('legal_person_id') is not None:
            self.legal_person_id = m.get('legal_person_id')
        if m.get('mobile_no') is not None:
            self.mobile_no = m.get('mobile_no')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        return self


class BareClaim(TeaModel):
    def __init__(
        self,
        claim: str = None,
        type: str = None,
    ):
        # 下面的内容由调用者自己定义，建议只存放必要的声明信息，不要放置敏感数据
        self.claim = claim
        # 证书类型
        self.type = type

    def validate(self):
        self.validate_required(self.claim, 'claim')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.claim is not None:
            result['claim'] = self.claim
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('claim') is not None:
            self.claim = m.get('claim')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class StartBaasDidCorporateAgentcreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_code: str = None,
        extension_info: str = None,
        indexs: List[str] = None,
        owner_name: str = None,
        owner_uid: str = None,
        services: List[DidDocServicesInfo] = None,
        did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 扩展字段
        self.extension_info = extension_info
        # 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
        self.indexs = indexs
        # 企业名称
        self.owner_name = owner_name
        # 自定义企业唯一id，企业在自有模式下的唯一号bid的hash值，调用者需要保证其唯一性
        self.owner_uid = owner_uid
        # 携带自己定义的服务类型
        self.services = services
        # 生成的did字符串
        self.did = did

    def validate(self):
        self.validate_required(self.owner_uid, 'owner_uid')
        if self.owner_uid is not None:
            self.validate_max_length(self.owner_uid, 'owner_uid', 128)
        if self.services:
            for k in self.services:
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
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.indexs is not None:
            result['indexs'] = self.indexs
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        result['services'] = []
        if self.services is not None:
            for k in self.services:
                result['services'].append(k.to_map() if k else None)
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('indexs') is not None:
            self.indexs = m.get('indexs')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        self.services = []
        if m.get('services') is not None:
            for k in m.get('services'):
                temp_model = DidDocServicesInfo()
                self.services.append(temp_model.from_map(k))
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class StartBaasDidCorporateAgentcreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的did字符串
        self.did = did

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
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class StartBaasDidPersonAgentcreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extension_info: str = None,
        indexs: List[str] = None,
        owner_name: str = None,
        owner_uid: str = None,
        services: List[DidDocServicesInfo] = None,
        biz_code: str = None,
        did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业自定信息
        self.extension_info = extension_info
        # 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
        self.indexs = indexs
        # 名称
        self.owner_name = owner_name
        # 唯一号，比如可以是hash(证件类型+企业营业执照号) 计算出来的唯一值等
        self.owner_uid = owner_uid
        # 携带自己定义的服务类型
        self.services = services
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 生成的did字符串
        self.did = did

    def validate(self):
        self.validate_required(self.owner_uid, 'owner_uid')
        if self.services:
            for k in self.services:
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
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.indexs is not None:
            result['indexs'] = self.indexs
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        result['services'] = []
        if self.services is not None:
            for k in self.services:
                result['services'].append(k.to_map() if k else None)
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('indexs') is not None:
            self.indexs = m.get('indexs')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        self.services = []
        if m.get('services') is not None:
            for k in m.get('services'):
                temp_model = DidDocServicesInfo()
                self.services.append(temp_model.from_map(k))
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class StartBaasDidPersonAgentcreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的did字符串
        self.did = did

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
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class StartBaasDidCorporateSelfcreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extension: str = None,
        owner_name: str = None,
        services: List[DidDocServicesInfo] = None,
        biz_code: str = None,
        did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展信息
        self.extension = extension
        # 公司名称
        self.owner_name = owner_name
        # 携带自己定义的服务类型
        self.services = services
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 生成的did字符串
        self.did = did

    def validate(self):
        if self.services:
            for k in self.services:
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
        if self.extension is not None:
            result['extension'] = self.extension
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        result['services'] = []
        if self.services is not None:
            for k in self.services:
                result['services'].append(k.to_map() if k else None)
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        self.services = []
        if m.get('services') is not None:
            for k in m.get('services'):
                temp_model = DidDocServicesInfo()
                self.services.append(temp_model.from_map(k))
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class StartBaasDidCorporateSelfcreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的did字符串
        self.did = did

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
        if self.did is not None:
            result['did'] = self.did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        return self


class StartBaasDidVerifiableclaimIssureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bare_claim: BareClaim = None,
        expire: int = None,
        issuer: str = None,
        subject: str = None,
        type: List[str] = None,
        verify_status_type: str = None,
        biz_code: str = None,
        verifiable_claim_content: str = None,
        verifiable_claim_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 颁发证书声明
        self.bare_claim = bare_claim
        # 过期时间
        self.expire = expire
        # 由谁来颁发，该did必须为调用者自己或者自己代理的did
        self.issuer = issuer
        # 为哪个did颁发
        self.subject = subject
        # 验证声明类型，目前默认VerifiableCredential
        self.type = type
        # 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
        self.verify_status_type = verify_status_type
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
        self.verifiable_claim_content = verifiable_claim_content
        # 声明id
        self.verifiable_claim_id = verifiable_claim_id

    def validate(self):
        self.validate_required(self.bare_claim, 'bare_claim')
        if self.bare_claim:
            self.bare_claim.validate()
        self.validate_required(self.expire, 'expire')
        self.validate_required(self.issuer, 'issuer')
        self.validate_required(self.subject, 'subject')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bare_claim is not None:
            result['bare_claim'] = self.bare_claim.to_map()
        if self.expire is not None:
            result['expire'] = self.expire
        if self.issuer is not None:
            result['issuer'] = self.issuer
        if self.subject is not None:
            result['subject'] = self.subject
        if self.type is not None:
            result['type'] = self.type
        if self.verify_status_type is not None:
            result['verify_status_type'] = self.verify_status_type
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.verifiable_claim_content is not None:
            result['verifiable_claim_content'] = self.verifiable_claim_content
        if self.verifiable_claim_id is not None:
            result['verifiable_claim_id'] = self.verifiable_claim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bare_claim') is not None:
            temp_model = BareClaim()
            self.bare_claim = temp_model.from_map(m['bare_claim'])
        if m.get('expire') is not None:
            self.expire = m.get('expire')
        if m.get('issuer') is not None:
            self.issuer = m.get('issuer')
        if m.get('subject') is not None:
            self.subject = m.get('subject')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('verify_status_type') is not None:
            self.verify_status_type = m.get('verify_status_type')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('verifiable_claim_content') is not None:
            self.verifiable_claim_content = m.get('verifiable_claim_content')
        if m.get('verifiable_claim_id') is not None:
            self.verifiable_claim_id = m.get('verifiable_claim_id')
        return self


class StartBaasDidVerifiableclaimIssureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        verifiable_claim_content: str = None,
        verifiable_claim_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
        self.verifiable_claim_content = verifiable_claim_content
        # 声明id
        self.verifiable_claim_id = verifiable_claim_id

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
        if self.verifiable_claim_content is not None:
            result['verifiable_claim_content'] = self.verifiable_claim_content
        if self.verifiable_claim_id is not None:
            result['verifiable_claim_id'] = self.verifiable_claim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('verifiable_claim_content') is not None:
            self.verifiable_claim_content = m.get('verifiable_claim_content')
        if m.get('verifiable_claim_id') is not None:
            self.verifiable_claim_id = m.get('verifiable_claim_id')
        return self


class StartBaasDidVerifiableclaimVerifierRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        indexs: str = None,
        verifiable_claim: str = None,
        biz_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用于零知识证明类型的可验证声明的验证。index是对应于完整VC的一个json字符串，其中key值保持和原始VC一致，value如果是1表示verificate_claim对应key携带的是对应field的原始值，而如果Key的value是0表示verificate_claim对应key携带的是对应field的merkle root值。
        self.indexs = indexs
        # 可验证声明
        self.verifiable_claim = verifiable_claim
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code

    def validate(self):
        self.validate_required(self.verifiable_claim, 'verifiable_claim')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.indexs is not None:
            result['indexs'] = self.indexs
        if self.verifiable_claim is not None:
            result['verifiable_claim'] = self.verifiable_claim
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('indexs') is not None:
            self.indexs = m.get('indexs')
        if m.get('verifiable_claim') is not None:
            self.verifiable_claim = m.get('verifiable_claim')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        return self


class StartBaasDidVerifiableclaimVerifierResponse(TeaModel):
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


class QueryBaasDidVcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        vc_id: str = None,
        verifier_did: str = None,
        biz_code: str = None,
        vc_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # vc id，可通过该字符串来查询vc具体内容
        self.vc_id = vc_id
        # 验证者id
        self.verifier_did = verifier_did
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
        self.vc_content = vc_content

    def validate(self):
        self.validate_required(self.vc_id, 'vc_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        if self.verifier_did is not None:
            result['verifier_did'] = self.verifier_did
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.vc_content is not None:
            result['vc_content'] = self.vc_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        if m.get('verifier_did') is not None:
            self.verifier_did = m.get('verifier_did')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('vc_content') is not None:
            self.vc_content = m.get('vc_content')
        return self


class QueryBaasDidVcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        vc_content: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
        self.vc_content = vc_content

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
        if self.vc_content is not None:
            result['vc_content'] = self.vc_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('vc_content') is not None:
            self.vc_content = m.get('vc_content')
        return self


class StartBaasDidIdentificationFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_type: str = None,
        did: str = None,
        identity_param: IdentityParam = None,
        return_url: str = None,
        biz_code: str = None,
        certify_id: str = None,
        certify_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证类型,枚举值 PC_AUTH、APP_AUTH
        self.auth_type = auth_type
        # 颁发证书的subject did
        self.did = did
        # 用户身份信息
        self.identity_param = identity_param
        # 认证接口回调路径，POST接口 请求示例： { "certifyId":"0242de204e1a2c3ed6ee5e21d8a57a4c", "did":"xxxxx","vcId":"xxxxx" }
        self.return_url = return_url
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 认证ID
        self.certify_id = certify_id
        # 二维码URL，用户支付宝扫一扫实人认证
        self.certify_url = certify_url

    def validate(self):
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.did, 'did')
        self.validate_required(self.identity_param, 'identity_param')
        if self.identity_param:
            self.identity_param.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.did is not None:
            result['did'] = self.did
        if self.identity_param is not None:
            result['identity_param'] = self.identity_param.to_map()
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.certify_url is not None:
            result['certify_url'] = self.certify_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('identity_param') is not None:
            temp_model = IdentityParam()
            self.identity_param = temp_model.from_map(m['identity_param'])
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('certify_url') is not None:
            self.certify_url = m.get('certify_url')
        return self


class StartBaasDidIdentificationFaceauthResponse(TeaModel):
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
        # 认证ID
        self.certify_id = certify_id
        # 二维码URL，用户支付宝扫一扫实人认证
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


class QueryBaasDidIdentificationFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certify_id: str = None,
        biz_code: str = None,
        vc_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证ID，用于查询认证结果
        self.certify_id = certify_id
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # vc id，可通过该字符串来查询vc具体内容
        self.vc_id = vc_id

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
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class QueryBaasDidIdentificationFaceauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        vc_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # vc id，可通过该字符串来查询vc具体内容
        self.vc_id = vc_id

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
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidPersonWiththreemetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_no: str = None,
        extension_info: str = None,
        mobile: str = None,
        name: str = None,
        owner_name: str = None,
        owner_uid: str = None,
        biz_code: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 身份证号码
        self.cert_no = cert_no
        # 扩展字段
        self.extension_info = extension_info
        # 手机号码
        self.mobile = mobile
        # 姓名
        self.name = name
        # 名称
        self.owner_name = owner_name
        # 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
        self.owner_uid = owner_uid
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 生成的did字符串
        self.did = did
        # 颁发的vcId
        self.vc_id = vc_id

    def validate(self):
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.name, 'name')
        self.validate_required(self.owner_uid, 'owner_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.name is not None:
            result['name'] = self.name
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidPersonWiththreemetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的did字符串
        self.did = did
        # 颁发的vcId
        self.vc_id = vc_id

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
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidCorporateWiththreemetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        extension_info: str = None,
        legal_person_cert_name: str = None,
        owner_name: str = None,
        owner_uid: str = None,
        biz_code: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
        self.extension_info = extension_info
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 名称
        self.owner_name = owner_name
        # 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
        self.owner_uid = owner_uid
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 生成的did
        self.did = did
        # 颁发的vcId
        self.vc_id = vc_id

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.owner_uid, 'owner_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidCorporateWiththreemetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的did
        self.did = did
        # 颁发的vcId
        self.vc_id = vc_id

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
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class StartBaasDidVcrepositoryIssueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_did_list: List[str] = None,
        bare_claim: BareClaim = None,
        expire: int = None,
        issuer: str = None,
        specified_claim_id_type: int = None,
        subject: str = None,
        type: List[str] = None,
        verifiable_claim_id: str = None,
        verify_status_type: str = None,
        biz_code: str = None,
        verifiable_claim_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 配置此列表，则说明需要DIS对证书声明内容加密处理，并且控制访问权限，此列表为初始配置的did名单，拥有对此颁发证书的读取权限。
        # 如果不配置此列表，则DIS默认将明文存储此证书，任何did都可以访问此证书声明内容。
        # 
        self.auth_did_list = auth_did_list
        # 颁发证书声明的原始声明内容，其中claim字段为json格式
        self.bare_claim = bare_claim
        # 过期时间，如果用不过期可以设置为：-1。
        # 注意如果证书过期，则无法再通过VC Repository读取访问此证书内容。
        self.expire = expire
        # 颁发证书方，该did必须为调用者自己或者自己代理的did。
        # 
        self.issuer = issuer
        # 1 - 指定id将被按照verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id.substring(0,50)))+verifiable_claim_id.substring(50);此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
        self.specified_claim_id_type = specified_claim_id_type
        # 颁发证书的目标did，此目标did将拥有存储到VC Repository的数据管控权限，比如：授权给其它did读取此证书的权限。
        self.subject = subject
        # 通过层级定义的证书类型说明，在使用VC Repository的情况下默认为：["VerifiableCredential","DelegateVCRepository"]。
        # 如果用户希望通过type来过滤读取证书VC，那么可以在此列表后面追加层次定义说明，方便后续读取证书在VC Repository进行过滤。（如果读取方已知verifiable_claim_id可以直接过滤读取）
        self.type = type
        # 如果指定，最终会使用此id会参与生成的证书的verifiable_claim_id，但是调用方需要保证设置值的唯一性，重复的id会引起最终verifiable_claim_id重复，导致被拒绝颁发证书。
        # 如果不指定，则会随机生成一个规范的verifiable_claim_id。
        # verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id)); 此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
        self.verifiable_claim_id = verifiable_claim_id
        # 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
        self.verify_status_type = verify_status_type
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
        self.verifiable_claim_content = verifiable_claim_content

    def validate(self):
        self.validate_required(self.bare_claim, 'bare_claim')
        if self.bare_claim:
            self.bare_claim.validate()
        self.validate_required(self.expire, 'expire')
        self.validate_required(self.issuer, 'issuer')
        self.validate_required(self.subject, 'subject')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_did_list is not None:
            result['auth_did_list'] = self.auth_did_list
        if self.bare_claim is not None:
            result['bare_claim'] = self.bare_claim.to_map()
        if self.expire is not None:
            result['expire'] = self.expire
        if self.issuer is not None:
            result['issuer'] = self.issuer
        if self.specified_claim_id_type is not None:
            result['specified_claim_id_type'] = self.specified_claim_id_type
        if self.subject is not None:
            result['subject'] = self.subject
        if self.type is not None:
            result['type'] = self.type
        if self.verifiable_claim_id is not None:
            result['verifiable_claim_id'] = self.verifiable_claim_id
        if self.verify_status_type is not None:
            result['verify_status_type'] = self.verify_status_type
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.verifiable_claim_content is not None:
            result['verifiable_claim_content'] = self.verifiable_claim_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_did_list') is not None:
            self.auth_did_list = m.get('auth_did_list')
        if m.get('bare_claim') is not None:
            temp_model = BareClaim()
            self.bare_claim = temp_model.from_map(m['bare_claim'])
        if m.get('expire') is not None:
            self.expire = m.get('expire')
        if m.get('issuer') is not None:
            self.issuer = m.get('issuer')
        if m.get('specified_claim_id_type') is not None:
            self.specified_claim_id_type = m.get('specified_claim_id_type')
        if m.get('subject') is not None:
            self.subject = m.get('subject')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('verifiable_claim_id') is not None:
            self.verifiable_claim_id = m.get('verifiable_claim_id')
        if m.get('verify_status_type') is not None:
            self.verify_status_type = m.get('verify_status_type')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('verifiable_claim_content') is not None:
            self.verifiable_claim_content = m.get('verifiable_claim_content')
        return self


class StartBaasDidVcrepositoryIssueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        verifiable_claim_content: str = None,
        verifiable_claim_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
        self.verifiable_claim_content = verifiable_claim_content
        # 颁发的证书唯一id，颁发成功后返回。
        self.verifiable_claim_id = verifiable_claim_id

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
        if self.verifiable_claim_content is not None:
            result['verifiable_claim_content'] = self.verifiable_claim_content
        if self.verifiable_claim_id is not None:
            result['verifiable_claim_id'] = self.verifiable_claim_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('verifiable_claim_content') is not None:
            self.verifiable_claim_content = m.get('verifiable_claim_content')
        if m.get('verifiable_claim_id') is not None:
            self.verifiable_claim_id = m.get('verifiable_claim_id')
        return self


class StartBaasDidAgentServicetypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        access_mode: str = None,
        description: str = None,
        did: str = None,
        service_input: str = None,
        service_output: str = None,
        service_type: str = None,
        biz_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 枚举类型，描述访问服务的方式
        self.access_mode = access_mode
        # 对服务的文字描述，<1000个字符
        self.description = description
        # 服务类型创建者did
        self.did = did
        # {
        # "item1":"",
        # "item2":"",
        # ...
        # }
        self.service_input = service_input
        # {
        # "item1":""
        # "item2":""
        # ...
        # }
        self.service_output = service_output
        # 自定义服务类型，字符数16～32个
        self.service_type = service_type
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code

    def validate(self):
        self.validate_required(self.did, 'did')
        self.validate_required(self.service_type, 'service_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.access_mode is not None:
            result['access_mode'] = self.access_mode
        if self.description is not None:
            result['description'] = self.description
        if self.did is not None:
            result['did'] = self.did
        if self.service_input is not None:
            result['service_input'] = self.service_input
        if self.service_output is not None:
            result['service_output'] = self.service_output
        if self.service_type is not None:
            result['service_type'] = self.service_type
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('access_mode') is not None:
            self.access_mode = m.get('access_mode')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('service_input') is not None:
            self.service_input = m.get('service_input')
        if m.get('service_output') is not None:
            self.service_output = m.get('service_output')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        return self


class StartBaasDidAgentServicetypeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        service_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建成功之后，返回服务类型名
        self.service_type = service_type

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
        if self.service_type is not None:
            result['service_type'] = self.service_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        return self


class QueryBaasDidAgentServicetypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        did: str = None,
        service_type: str = None,
        biz_code: str = None,
        service_types: List[str] = None,
        total_number: int = None,
        total_page: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询者did
        self.did = did
        # 指定查询的服务类型名
        self.service_type = service_type
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 服务类型定义列表
        self.service_types = service_types
        # 总共有几项
        self.total_number = total_number
        # 总共有几页
        self.total_page = total_page

    def validate(self):
        self.validate_required(self.did, 'did')
        self.validate_required(self.service_type, 'service_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.did is not None:
            result['did'] = self.did
        if self.service_type is not None:
            result['service_type'] = self.service_type
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.service_types is not None:
            result['service_types'] = self.service_types
        if self.total_number is not None:
            result['total_number'] = self.total_number
        if self.total_page is not None:
            result['total_page'] = self.total_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('service_type') is not None:
            self.service_type = m.get('service_type')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('service_types') is not None:
            self.service_types = m.get('service_types')
        if m.get('total_number') is not None:
            self.total_number = m.get('total_number')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        return self


class QueryBaasDidAgentServicetypeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        service_types: List[str] = None,
        total_number: int = None,
        total_page: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 服务类型定义列表
        self.service_types = service_types
        # 总共有几项
        self.total_number = total_number
        # 总共有几页
        self.total_page = total_page

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
        if self.service_types is not None:
            result['service_types'] = self.service_types
        if self.total_number is not None:
            result['total_number'] = self.total_number
        if self.total_page is not None:
            result['total_page'] = self.total_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('service_types') is not None:
            self.service_types = m.get('service_types')
        if m.get('total_number') is not None:
            self.total_number = m.get('total_number')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        return self


class UpdateBaasDidServicesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        add_sevices: List[DidDocServicesInfo] = None,
        del_services: List[str] = None,
        did: str = None,
        did_type: str = None,
        biz_code: str = None,
        did_doc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 新增的服务信息
        self.add_sevices = add_sevices
        # 要删除的服务id列表
        self.del_services = del_services
        # 指定要更新的did
        self.did = did
        # did类型，个人|企业|设备(IOT)
        self.did_type = did_type
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 更新后的did doc
        self.did_doc = did_doc

    def validate(self):
        if self.add_sevices:
            for k in self.add_sevices:
                if k:
                    k.validate()
        self.validate_required(self.did, 'did')
        self.validate_required(self.did_type, 'did_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['add_sevices'] = []
        if self.add_sevices is not None:
            for k in self.add_sevices:
                result['add_sevices'].append(k.to_map() if k else None)
        if self.del_services is not None:
            result['del_services'] = self.del_services
        if self.did is not None:
            result['did'] = self.did
        if self.did_type is not None:
            result['did_type'] = self.did_type
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.did_doc is not None:
            result['did_doc'] = self.did_doc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.add_sevices = []
        if m.get('add_sevices') is not None:
            for k in m.get('add_sevices'):
                temp_model = DidDocServicesInfo()
                self.add_sevices.append(temp_model.from_map(k))
        if m.get('del_services') is not None:
            self.del_services = m.get('del_services')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('did_type') is not None:
            self.did_type = m.get('did_type')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('did_doc') is not None:
            self.did_doc = m.get('did_doc')
        return self


class UpdateBaasDidServicesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did_doc: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 更新后的did doc
        self.did_doc = did_doc

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
        if self.did_doc is not None:
            result['did_doc'] = self.did_doc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did_doc') is not None:
            self.did_doc = m.get('did_doc')
        return self


class CreateBaasDidPersonWithtwometaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_no: str = None,
        extension_info: str = None,
        name: str = None,
        owner_name: str = None,
        owner_uid: str = None,
        biz_code: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 身份证号码
        self.cert_no = cert_no
        # 扩展字段
        self.extension_info = extension_info
        # 姓名
        self.name = name
        # 名称
        self.owner_name = owner_name
        # 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
        self.owner_uid = owner_uid
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 生成的did字符串
        self.did = did
        # 颁发的vcId
        self.vc_id = vc_id

    def validate(self):
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.name, 'name')
        self.validate_required(self.owner_uid, 'owner_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.name is not None:
            result['name'] = self.name
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidPersonWithtwometaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的did字符串
        self.did = did
        # 颁发的vcId
        self.vc_id = vc_id

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
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidCorporateWithtwometaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        extension_info: str = None,
        owner_name: str = None,
        owner_uid: str = None,
        biz_code: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # {
        # "nation": "CN", //企业注册地址
        # "type": "LimitedCompany", //企业类型
        # "name": "演示用户名", //必选字段，企业名
        # "licenceNo": "1111", //营业执照
        # "address": "1111", //企业地址
        # "parentName": "", //<-必选字段 业务方名 需要提前协商
        # "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业
        # "certifyDate": "2019-1-1", //证书颁发时间
        # "licenceExpireDate": "2020-1-1", //证书到期时间
        # "businessScope": "1111", //企业经营范围
        # "businessAddress": "1111", //企业经营地址
        # "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户
        # "channelName": "" //<- 必选字段 业务渠道 需要提前沟通
        # }
        self.extension_info = extension_info
        # 名称
        # 
        self.owner_name = owner_name
        # 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
        self.owner_uid = owner_uid
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 生成的did
        # 
        self.did = did
        # 颁发的vcId
        self.vc_id = vc_id

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.owner_uid, 'owner_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidCorporateWithtwometaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的did
        # 
        self.did = did
        # 颁发的vcId
        self.vc_id = vc_id

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
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidCorporateWithfourmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        extension_info: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        owner_name: str = None,
        owner_uid: str = None,
        biz_code: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        # 
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        # 
        self.ep_cert_no = ep_cert_no
        # { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
        # 
        self.extension_info = extension_info
        # 法人姓名
        # 
        self.legal_person_cert_name = legal_person_cert_name
        # 法人身份证件号
        self.legal_person_cert_no = legal_person_cert_no
        # 名称
        # 
        self.owner_name = owner_name
        # 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
        self.owner_uid = owner_uid
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 生成的did
        # 
        self.did = did
        # 颁发的vcId
        # 
        self.vc_id = vc_id

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.legal_person_cert_no, 'legal_person_cert_no')
        self.validate_required(self.owner_uid, 'owner_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidCorporateWithfourmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的did
        # 
        self.did = did
        # 颁发的vcId
        # 
        self.vc_id = vc_id

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
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidPersonWithfourmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bank_card: str = None,
        cert_no: str = None,
        extension_info: str = None,
        mobile: str = None,
        name: str = None,
        owner_name: str = None,
        owner_uid: str = None,
        biz_code: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 银行卡号
        self.bank_card = bank_card
        # 身份证号码
        # 
        self.cert_no = cert_no
        # 扩展字段
        # 
        self.extension_info = extension_info
        # 手机号码
        # 
        self.mobile = mobile
        # 姓名
        # 
        self.name = name
        # 名称
        # 
        self.owner_name = owner_name
        # 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
        self.owner_uid = owner_uid
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 生成的did字符串
        # 
        self.did = did
        # 颁发的vcId
        # 
        self.vc_id = vc_id

    def validate(self):
        self.validate_required(self.bank_card, 'bank_card')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.name, 'name')
        self.validate_required(self.owner_uid, 'owner_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bank_card is not None:
            result['bank_card'] = self.bank_card
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.name is not None:
            result['name'] = self.name
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bank_card') is not None:
            self.bank_card = m.get('bank_card')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class CreateBaasDidPersonWithfourmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的did字符串
        # 
        self.did = did
        # 颁发的vcId
        # 
        self.vc_id = vc_id

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
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class StartBaasDidCorporateFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        call_back_url: str = None,
        ep_cert_name: str = None,
        ep_cert_no: str = None,
        ep_cert_type: str = None,
        extension_info: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        merchant_url: str = None,
        owner_name: str = None,
        owner_uid: str = None,
        biz_code: str = None,
        group: str = None,
        certify_id: str = None,
        certify_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 回调通知地址
        self.call_back_url = call_back_url
        # 企业名称
        self.ep_cert_name = ep_cert_name
        # 企业证件号
        self.ep_cert_no = ep_cert_no
        # 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
        self.ep_cert_type = ep_cert_type
        # { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
        self.extension_info = extension_info
        # 企业法人
        self.legal_person_cert_name = legal_person_cert_name
        # 法人身份证号
        self.legal_person_cert_no = legal_person_cert_no
        # 认证完成后回跳地址
        self.merchant_url = merchant_url
        # 名称
        self.owner_name = owner_name
        # 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
        self.owner_uid = owner_uid
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 产品渲染方式：H5、NATIVE 或 PC, 默认为H5
        self.group = group
        # 认证ID
        self.certify_id = certify_id
        # 二维码URL，用户支付宝扫一扫实人认证
        self.certify_url = certify_url

    def validate(self):
        self.validate_required(self.ep_cert_name, 'ep_cert_name')
        self.validate_required(self.ep_cert_no, 'ep_cert_no')
        self.validate_required(self.ep_cert_type, 'ep_cert_type')
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.legal_person_cert_no, 'legal_person_cert_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.call_back_url is not None:
            result['call_back_url'] = self.call_back_url
        if self.ep_cert_name is not None:
            result['ep_cert_name'] = self.ep_cert_name
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.ep_cert_type is not None:
            result['ep_cert_type'] = self.ep_cert_type
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.merchant_url is not None:
            result['merchant_url'] = self.merchant_url
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.owner_uid is not None:
            result['owner_uid'] = self.owner_uid
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.group is not None:
            result['group'] = self.group
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.certify_url is not None:
            result['certify_url'] = self.certify_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('call_back_url') is not None:
            self.call_back_url = m.get('call_back_url')
        if m.get('ep_cert_name') is not None:
            self.ep_cert_name = m.get('ep_cert_name')
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('ep_cert_type') is not None:
            self.ep_cert_type = m.get('ep_cert_type')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('merchant_url') is not None:
            self.merchant_url = m.get('merchant_url')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('owner_uid') is not None:
            self.owner_uid = m.get('owner_uid')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('group') is not None:
            self.group = m.get('group')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('certify_url') is not None:
            self.certify_url = m.get('certify_url')
        return self


class StartBaasDidCorporateFaceauthResponse(TeaModel):
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
        # 认证ID
        self.certify_id = certify_id
        # 二维码URL，用户支付宝扫一扫实人认证
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


class QueryBaasDidCorporateFaceauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certify_id: str = None,
        biz_code: str = None,
        group: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 认证ID，用于查询认证结果
        # 
        self.certify_id = certify_id
        # 场景码，找dis工作人员进行分配
        self.biz_code = biz_code
        # 产品渲染方式：H5、NATIVE 或 PC
        self.group = group
        # 生成的did
        self.did = did
        # vc id，可通过该字符串来查询vc具体内容
        self.vc_id = vc_id

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
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.group is not None:
            result['group'] = self.group
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('group') is not None:
            self.group = m.get('group')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


class QueryBaasDidCorporateFaceauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        did: str = None,
        vc_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的did
        self.did = did
        # vc id，可通过该字符串来查询vc具体内容
        self.vc_id = vc_id

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
        if self.did is not None:
            result['did'] = self.did
        if self.vc_id is not None:
            result['vc_id'] = self.vc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('did') is not None:
            self.did = m.get('did')
        if m.get('vc_id') is not None:
            self.vc_id = m.get('vc_id')
        return self


