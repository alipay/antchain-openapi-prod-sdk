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


class QueryGeneralRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service: str = None,
        user_authorization: str = None,
        encrypted_random_no: str = None,
        service_mode: str = None,
        external_id: str = None,
        bank_card_no: str = None,
        user_id: str = None,
        mobile_no: str = None,
        cert_no: str = None,
        lbs: str = None,
        sales_amount: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # test
        self.service = service
        # 用于标记是否获得用户授权  1:获得授权（默认）
        # 0:未获得授权
        self.user_authorization = user_authorization
        # 经过RSA加密的用于AES加密的随机数密钥
        self.encrypted_random_no = encrypted_random_no
        # 服务模式
        self.service_mode = service_mode
        # 记录外部调用ISV
        self.external_id = external_id
        # 银行卡号（加密）
        self.bank_card_no = bank_card_no
        # 支付宝id	用于输入用户支付宝的 2088 账号
        self.user_id = user_id
        # 电话号码
        self.mobile_no = mobile_no
        # 身份证
        self.cert_no = cert_no
        # 用于输入用户产生交易时的地理位置信息
        self.lbs = lbs
        # 用户购买或使用服务时产生的具体金额
        self.sales_amount = sales_amount

    def validate(self):
        self.validate_required(self.service, 'service')
        self.validate_required(self.user_authorization, 'user_authorization')
        self.validate_required(self.encrypted_random_no, 'encrypted_random_no')
        self.validate_required(self.service_mode, 'service_mode')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service is not None:
            result['service'] = self.service
        if self.user_authorization is not None:
            result['user_authorization'] = self.user_authorization
        if self.encrypted_random_no is not None:
            result['encrypted_random_no'] = self.encrypted_random_no
        if self.service_mode is not None:
            result['service_mode'] = self.service_mode
        if self.external_id is not None:
            result['external_id'] = self.external_id
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.mobile_no is not None:
            result['mobile_no'] = self.mobile_no
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.lbs is not None:
            result['lbs'] = self.lbs
        if self.sales_amount is not None:
            result['sales_amount'] = self.sales_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service') is not None:
            self.service = m.get('service')
        if m.get('user_authorization') is not None:
            self.user_authorization = m.get('user_authorization')
        if m.get('encrypted_random_no') is not None:
            self.encrypted_random_no = m.get('encrypted_random_no')
        if m.get('service_mode') is not None:
            self.service_mode = m.get('service_mode')
        if m.get('external_id') is not None:
            self.external_id = m.get('external_id')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('mobile_no') is not None:
            self.mobile_no = m.get('mobile_no')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('lbs') is not None:
            self.lbs = m.get('lbs')
        if m.get('sales_amount') is not None:
            self.sales_amount = m.get('sales_amount')
        return self


class QueryGeneralResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_result: str = None,
        risk_result_desc: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 测试结果
        self.risk_result = risk_result
        # 风险咨询结果描述
        self.risk_result_desc = risk_result_desc

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
        if self.risk_result is not None:
            result['risk_result'] = self.risk_result
        if self.risk_result_desc is not None:
            result['risk_result_desc'] = self.risk_result_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('risk_result') is not None:
            self.risk_result = m.get('risk_result')
        if m.get('risk_result_desc') is not None:
            self.risk_result_desc = m.get('risk_result_desc')
        return self


