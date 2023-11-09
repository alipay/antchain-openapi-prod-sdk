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


class SubmitAntchainAtoFrontSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        user_id_type: str = None,
        user_id_number: str = None,
        user_name: str = None,
        user_mobile: str = None,
        user_email: str = None,
        sign_validity: str = None,
        flow_notify_type: str = None,
        business_scene: str = None,
        signed_redirect_url: str = None,
        template_list: str = None,
        alipay_user_id: str = None,
        merchant_name: str = None,
        merchant_tag: str = None,
        merchant_sign_order: int = None,
        merchant_id_type: str = None,
        merchant_id_number: str = None,
        merchant_legal_name: str = None,
        merchant_legal_id_number: str = None,
        third_signer: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户的订单号
        self.order_id = order_id
        # CRED_PSN_CH_IDCARD： 大陆身份证
        # CRED_PSN_CH_TWCARD：台湾来往大陆通行证
        # CRED_PSN_CH_MACAO"：澳门来往大陆通行证
        # CRED_PSN_CH_HONGKONG：香港来往大陆通行证
        # CRED_PSN_PASSPORT：护照
        self.user_id_type = user_id_type
        # 用户证件号，需要采用RSA加密传输
        self.user_id_number = user_id_number
        # 姓名，需要采用RSA加密传输
        # 
        self.user_name = user_name
        # 用户手机号，可不传；传的话需要采用RSA加密传输
        # 
        self.user_mobile = user_mobile
        # 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
        # 
        self.user_email = user_email
        # 签署有效期，时间戳，例如：new Date().getTime()
        self.sign_validity = sign_validity
        # 1-短信；2-邮件
        self.flow_notify_type = flow_notify_type
        # 业务场景，电子合同签署协议的时候的标题
        # 
        self.business_scene = business_scene
        # 签署完成跳转链接
        # 
        self.signed_redirect_url = signed_redirect_url
        # 签署的电子合同模板信息，List<Object>的JSON格式，Object如下： { templateId:__, // String格式 templateArgs: { "模板参数key":"模板参数值", // 必须为String } }
        self.template_list = template_list
        # 用户的支付宝uid
        self.alipay_user_id = alipay_user_id
        # 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        self.merchant_name = merchant_name
        # 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        self.merchant_tag = merchant_tag
        # 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
        self.merchant_sign_order = merchant_sign_order
        # CRED_ORG_USCC：统一社会信用代码，
        # CRED_ORG_REGCODE：工商注册号，
        # 只支持这两个值
        self.merchant_id_type = merchant_id_type
        # 商户证件号，需要采用RSA加密传输
        self.merchant_id_number = merchant_id_number
        # 法人姓名，需要RSA加密传输
        # 
        self.merchant_legal_name = merchant_legal_name
        # 法人证件号，需要采用RSA加密传输
        # 
        self.merchant_legal_id_number = merchant_legal_id_number
        # 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012"}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
        self.third_signer = third_signer

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 64)
        self.validate_required(self.user_id_type, 'user_id_type')
        if self.user_id_type is not None:
            self.validate_max_length(self.user_id_type, 'user_id_type', 40)
        self.validate_required(self.user_id_number, 'user_id_number')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.business_scene, 'business_scene')
        if self.business_scene is not None:
            self.validate_max_length(self.business_scene, 'business_scene', 200)
        self.validate_required(self.template_list, 'template_list')
        self.validate_required(self.alipay_user_id, 'alipay_user_id')
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 24)
        self.validate_required(self.merchant_name, 'merchant_name')
        if self.merchant_tag is not None:
            self.validate_max_length(self.merchant_tag, 'merchant_tag', 32)
        self.validate_required(self.merchant_id_type, 'merchant_id_type')
        if self.merchant_id_type is not None:
            self.validate_max_length(self.merchant_id_type, 'merchant_id_type', 32)
        self.validate_required(self.merchant_id_number, 'merchant_id_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.user_id_number is not None:
            result['user_id_number'] = self.user_id_number
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_mobile is not None:
            result['user_mobile'] = self.user_mobile
        if self.user_email is not None:
            result['user_email'] = self.user_email
        if self.sign_validity is not None:
            result['sign_validity'] = self.sign_validity
        if self.flow_notify_type is not None:
            result['flow_notify_type'] = self.flow_notify_type
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.signed_redirect_url is not None:
            result['signed_redirect_url'] = self.signed_redirect_url
        if self.template_list is not None:
            result['template_list'] = self.template_list
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.merchant_tag is not None:
            result['merchant_tag'] = self.merchant_tag
        if self.merchant_sign_order is not None:
            result['merchant_sign_order'] = self.merchant_sign_order
        if self.merchant_id_type is not None:
            result['merchant_id_type'] = self.merchant_id_type
        if self.merchant_id_number is not None:
            result['merchant_id_number'] = self.merchant_id_number
        if self.merchant_legal_name is not None:
            result['merchant_legal_name'] = self.merchant_legal_name
        if self.merchant_legal_id_number is not None:
            result['merchant_legal_id_number'] = self.merchant_legal_id_number
        if self.third_signer is not None:
            result['third_signer'] = self.third_signer
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('user_id_number') is not None:
            self.user_id_number = m.get('user_id_number')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_mobile') is not None:
            self.user_mobile = m.get('user_mobile')
        if m.get('user_email') is not None:
            self.user_email = m.get('user_email')
        if m.get('sign_validity') is not None:
            self.sign_validity = m.get('sign_validity')
        if m.get('flow_notify_type') is not None:
            self.flow_notify_type = m.get('flow_notify_type')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('signed_redirect_url') is not None:
            self.signed_redirect_url = m.get('signed_redirect_url')
        if m.get('template_list') is not None:
            self.template_list = m.get('template_list')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('merchant_tag') is not None:
            self.merchant_tag = m.get('merchant_tag')
        if m.get('merchant_sign_order') is not None:
            self.merchant_sign_order = m.get('merchant_sign_order')
        if m.get('merchant_id_type') is not None:
            self.merchant_id_type = m.get('merchant_id_type')
        if m.get('merchant_id_number') is not None:
            self.merchant_id_number = m.get('merchant_id_number')
        if m.get('merchant_legal_name') is not None:
            self.merchant_legal_name = m.get('merchant_legal_name')
        if m.get('merchant_legal_id_number') is not None:
            self.merchant_legal_id_number = m.get('merchant_legal_id_number')
        if m.get('third_signer') is not None:
            self.third_signer = m.get('third_signer')
        return self


class SubmitAntchainAtoFrontSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_no: str = None,
        flow_id: str = None,
        account_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署合同单号
        # 
        self.sign_no = sign_no
        # 电子签署流程ID
        # 
        self.flow_id = flow_id
        # 签署用户ID
        # 
        self.account_id = account_id

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
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        return self


class SyncAntchainAtoFrontTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        type: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 类型
        # 1. orderFullInfo ， 订单所有信息同步
        self.type = type
        # json.toString
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.type is not None:
            result['type'] = self.type
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class SyncAntchainAtoFrontTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回信息
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


