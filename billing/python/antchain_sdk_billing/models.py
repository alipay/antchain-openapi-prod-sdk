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


class GetAccountBalanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        from_channel: str = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 渠道来源： DEFAULT 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台
        self.from_channel = from_channel
        # 租户id,外部用户唯一id，如蚂蚁通行证id
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.from_channel, 'from_channel')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.from_channel is not None:
            result['from_channel'] = self.from_channel
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('from_channel') is not None:
            self.from_channel = m.get('from_channel')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class GetAccountBalanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        account_balance: str = None,
        available_balance: str = None,
        currency_value: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户余额
        self.account_balance = account_balance
        # 可用余额
        self.available_balance = available_balance
        # 币种
        self.currency_value = currency_value

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
        if self.account_balance is not None:
            result['account_balance'] = self.account_balance
        if self.available_balance is not None:
            result['available_balance'] = self.available_balance
        if self.currency_value is not None:
            result['currency_value'] = self.currency_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('account_balance') is not None:
            self.account_balance = m.get('account_balance')
        if m.get('available_balance') is not None:
            self.available_balance = m.get('available_balance')
        if m.get('currency_value') is not None:
            self.currency_value = m.get('currency_value')
        return self


class ChargeAccountBalanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        charge_amt: str = None,
        currency_value: str = None,
        from_channel: str = None,
        return_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # "10.11"代表10.11元,最小粒度到分，小数点后2位
        self.charge_amt = charge_amt
        # 币种,支付宝体系内一般存储币种值（156/840/...），156代表人民币
        self.currency_value = currency_value
        # 渠道来源： ANTCLOUD_OFFICIAL 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台
        self.from_channel = from_channel
        # 唤起收银台后，充值后回调url链接
        self.return_url = return_url

    def validate(self):
        self.validate_required(self.charge_amt, 'charge_amt')
        self.validate_required(self.currency_value, 'currency_value')
        self.validate_required(self.from_channel, 'from_channel')
        self.validate_required(self.return_url, 'return_url')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.charge_amt is not None:
            result['charge_amt'] = self.charge_amt
        if self.currency_value is not None:
            result['currency_value'] = self.currency_value
        if self.from_channel is not None:
            result['from_channel'] = self.from_channel
        if self.return_url is not None:
            result['return_url'] = self.return_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('charge_amt') is not None:
            self.charge_amt = m.get('charge_amt')
        if m.get('currency_value') is not None:
            self.currency_value = m.get('currency_value')
        if m.get('from_channel') is not None:
            self.from_channel = m.get('from_channel')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        return self


class ChargeAccountBalanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        alipay_gateway: str = None,
        input_charset: str = None,
        notify_url: str = None,
        out_trade_no: str = None,
        partner: str = None,
        payment_type: str = None,
        return_url: str = None,
        seller_id: str = None,
        service: str = None,
        sign: str = None,
        sign_type: str = None,
        subject: str = None,
        total_fee: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付宝网关
        self.alipay_gateway = alipay_gateway
        # 字符编码格式   _input_charset
        self.input_charset = input_charset
        # 服务器异步通知页面路径
        self.notify_url = notify_url
        # 商户网站唯一订单号
        self.out_trade_no = out_trade_no
        # 收款方PID
        self.partner = partner
        # 支付类型
        self.payment_type = payment_type
        # 收银台发起页面跳转同步通知页面路径
        self.return_url = return_url
        # 收款方ID
        self.seller_id = seller_id
        # 调用的接口名
        self.service = service
        # 签名
        self.sign = sign
        # 签名类型
        self.sign_type = sign_type
        # 商品名称
        self.subject = subject
        # 交易金额
        self.total_fee = total_fee

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
        if self.alipay_gateway is not None:
            result['alipay_gateway'] = self.alipay_gateway
        if self.input_charset is not None:
            result['input_charset'] = self.input_charset
        if self.notify_url is not None:
            result['notify_url'] = self.notify_url
        if self.out_trade_no is not None:
            result['out_trade_no'] = self.out_trade_no
        if self.partner is not None:
            result['partner'] = self.partner
        if self.payment_type is not None:
            result['payment_type'] = self.payment_type
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.seller_id is not None:
            result['seller_id'] = self.seller_id
        if self.service is not None:
            result['service'] = self.service
        if self.sign is not None:
            result['sign'] = self.sign
        if self.sign_type is not None:
            result['sign_type'] = self.sign_type
        if self.subject is not None:
            result['subject'] = self.subject
        if self.total_fee is not None:
            result['total_fee'] = self.total_fee
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('alipay_gateway') is not None:
            self.alipay_gateway = m.get('alipay_gateway')
        if m.get('input_charset') is not None:
            self.input_charset = m.get('input_charset')
        if m.get('notify_url') is not None:
            self.notify_url = m.get('notify_url')
        if m.get('out_trade_no') is not None:
            self.out_trade_no = m.get('out_trade_no')
        if m.get('partner') is not None:
            self.partner = m.get('partner')
        if m.get('payment_type') is not None:
            self.payment_type = m.get('payment_type')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('seller_id') is not None:
            self.seller_id = m.get('seller_id')
        if m.get('service') is not None:
            self.service = m.get('service')
        if m.get('sign') is not None:
            self.sign = m.get('sign')
        if m.get('sign_type') is not None:
            self.sign_type = m.get('sign_type')
        if m.get('subject') is not None:
            self.subject = m.get('subject')
        if m.get('total_fee') is not None:
            self.total_fee = m.get('total_fee')
        return self


class GetAccountUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        alipay_user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # alipay托管子户ID
        self.alipay_user_id = alipay_user_id

    def validate(self):
        self.validate_required(self.alipay_user_id, 'alipay_user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        return self


class GetAccountUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: str = None,
        login_name: str = None,
        real_name: str = None,
        mobile_num: str = None,
        firm_name: str = None,
        user_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 智能科技user_id
        self.tenant_id = tenant_id
        # 登录名
        self.login_name = login_name
        # 用户的真实姓名
        self.real_name = real_name
        # 手机号
        self.mobile_num = mobile_num
        # 公司名称
        self.firm_name = firm_name
        # 帐号类型，企业或者是个人
        # ENTERPRISE("1","企业类型账号"),
        # INDIVIDUAL("2","个人类型账号")
        self.user_type = user_type

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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.mobile_num is not None:
            result['mobile_num'] = self.mobile_num
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.user_type is not None:
            result['user_type'] = self.user_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('mobile_num') is not None:
            self.mobile_num = m.get('mobile_num')
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        return self


class CreateAcfeewebInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
        domain_code: str = None,
        domain_name: str = None,
        domain_version: str = None,
        product_code: str = None,
        product_name: str = None,
        service_code: str = None,
        service_name: str = None,
        offer_code: str = None,
        offer_name: str = None,
        oms_data: str = None,
        oms_biz_no: str = None,
        verification_cache: str = None,
        verification_url: str = None,
        bpms_id: str = None,
        config_data: str = None,
        status: str = None,
        creator: str = None,
        modifor: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 出账验证主键id
        self.id = id
        # 计量域code
        self.domain_code = domain_code
        # 计量域名称
        self.domain_name = domain_name
        # 计量域版本
        self.domain_version = domain_version
        # 业务产品code
        self.product_code = product_code
        # 业务产品名称
        self.product_name = product_name
        # 渠道产品code
        self.service_code = service_code
        # 渠道产品名称
        self.service_name = service_name
        # 商品code
        self.offer_code = offer_code
        # 商品名称
        self.offer_name = offer_name
        # 验证的计量数据
        self.oms_data = oms_data
        # 计量数据业务幂等号
        self.oms_biz_no = oms_biz_no
        # 缓存报文
        self.verification_cache = verification_cache
        # 缓存链接
        self.verification_url = verification_url
        # 审批流id
        self.bpms_id = bpms_id
        # 配置报文
        self.config_data = config_data
        # 状态
        self.status = status
        # 创建人
        self.creator = creator
        # 修改人
        self.modifor = modifor

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.domain_code, 'domain_code')
        self.validate_required(self.domain_name, 'domain_name')
        self.validate_required(self.domain_version, 'domain_version')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.service_code, 'service_code')
        self.validate_required(self.service_name, 'service_name')
        self.validate_required(self.offer_code, 'offer_code')
        self.validate_required(self.offer_name, 'offer_name')
        self.validate_required(self.oms_data, 'oms_data')
        self.validate_required(self.oms_biz_no, 'oms_biz_no')
        self.validate_required(self.verification_cache, 'verification_cache')
        self.validate_required(self.verification_url, 'verification_url')
        self.validate_required(self.bpms_id, 'bpms_id')
        self.validate_required(self.config_data, 'config_data')
        self.validate_required(self.status, 'status')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.modifor, 'modifor')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        if self.domain_code is not None:
            result['domain_code'] = self.domain_code
        if self.domain_name is not None:
            result['domain_name'] = self.domain_name
        if self.domain_version is not None:
            result['domain_version'] = self.domain_version
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.service_name is not None:
            result['service_name'] = self.service_name
        if self.offer_code is not None:
            result['offer_code'] = self.offer_code
        if self.offer_name is not None:
            result['offer_name'] = self.offer_name
        if self.oms_data is not None:
            result['oms_data'] = self.oms_data
        if self.oms_biz_no is not None:
            result['oms_biz_no'] = self.oms_biz_no
        if self.verification_cache is not None:
            result['verification_cache'] = self.verification_cache
        if self.verification_url is not None:
            result['verification_url'] = self.verification_url
        if self.bpms_id is not None:
            result['bpms_id'] = self.bpms_id
        if self.config_data is not None:
            result['config_data'] = self.config_data
        if self.status is not None:
            result['status'] = self.status
        if self.creator is not None:
            result['creator'] = self.creator
        if self.modifor is not None:
            result['modifor'] = self.modifor
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('domain_code') is not None:
            self.domain_code = m.get('domain_code')
        if m.get('domain_name') is not None:
            self.domain_name = m.get('domain_name')
        if m.get('domain_version') is not None:
            self.domain_version = m.get('domain_version')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        if m.get('offer_code') is not None:
            self.offer_code = m.get('offer_code')
        if m.get('offer_name') is not None:
            self.offer_name = m.get('offer_name')
        if m.get('oms_data') is not None:
            self.oms_data = m.get('oms_data')
        if m.get('oms_biz_no') is not None:
            self.oms_biz_no = m.get('oms_biz_no')
        if m.get('verification_cache') is not None:
            self.verification_cache = m.get('verification_cache')
        if m.get('verification_url') is not None:
            self.verification_url = m.get('verification_url')
        if m.get('bpms_id') is not None:
            self.bpms_id = m.get('bpms_id')
        if m.get('config_data') is not None:
            self.config_data = m.get('config_data')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('modifor') is not None:
            self.modifor = m.get('modifor')
        return self


class CreateAcfeewebInstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        process_instance_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 审批流实例id
        self.process_instance_id = process_instance_id

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
        if self.process_instance_id is not None:
            result['process_instance_id'] = self.process_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('process_instance_id') is not None:
            self.process_instance_id = m.get('process_instance_id')
        return self


class UpdateAcfeewebStateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
        domain_code: str = None,
        domain_name: str = None,
        domain_version: str = None,
        product_code: str = None,
        product_name: str = None,
        service_code: str = None,
        service_name: str = None,
        offer_code: str = None,
        offer_name: str = None,
        oms_data: str = None,
        oms_biz_no: str = None,
        verification_cache: str = None,
        verification_url: str = None,
        bpms_id: str = None,
        config_data: str = None,
        status: str = None,
        creator: str = None,
        modifor: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 出账验证主键id
        self.id = id
        # 计量域code
        self.domain_code = domain_code
        # 计量域名称
        self.domain_name = domain_name
        # 计量域版本
        self.domain_version = domain_version
        # 业务产品code
        self.product_code = product_code
        # 业务产品名称
        self.product_name = product_name
        # 渠道产品code
        self.service_code = service_code
        # 渠道产品名称
        self.service_name = service_name
        # 商品code
        self.offer_code = offer_code
        # 商品名称
        self.offer_name = offer_name
        # 验证的计量数据
        self.oms_data = oms_data
        # 计量数据业务幂等号
        self.oms_biz_no = oms_biz_no
        # 缓存报文
        self.verification_cache = verification_cache
        # 缓存链接
        self.verification_url = verification_url
        # 审批流id
        self.bpms_id = bpms_id
        # 配置报文
        self.config_data = config_data
        # 状态
        self.status = status
        # 创建人
        self.creator = creator
        # 修改人
        self.modifor = modifor

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.domain_code, 'domain_code')
        self.validate_required(self.domain_name, 'domain_name')
        self.validate_required(self.domain_version, 'domain_version')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.service_code, 'service_code')
        self.validate_required(self.service_name, 'service_name')
        self.validate_required(self.offer_code, 'offer_code')
        self.validate_required(self.offer_name, 'offer_name')
        self.validate_required(self.oms_data, 'oms_data')
        self.validate_required(self.oms_biz_no, 'oms_biz_no')
        self.validate_required(self.verification_cache, 'verification_cache')
        self.validate_required(self.verification_url, 'verification_url')
        self.validate_required(self.bpms_id, 'bpms_id')
        self.validate_required(self.config_data, 'config_data')
        self.validate_required(self.status, 'status')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.modifor, 'modifor')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        if self.domain_code is not None:
            result['domain_code'] = self.domain_code
        if self.domain_name is not None:
            result['domain_name'] = self.domain_name
        if self.domain_version is not None:
            result['domain_version'] = self.domain_version
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.service_name is not None:
            result['service_name'] = self.service_name
        if self.offer_code is not None:
            result['offer_code'] = self.offer_code
        if self.offer_name is not None:
            result['offer_name'] = self.offer_name
        if self.oms_data is not None:
            result['oms_data'] = self.oms_data
        if self.oms_biz_no is not None:
            result['oms_biz_no'] = self.oms_biz_no
        if self.verification_cache is not None:
            result['verification_cache'] = self.verification_cache
        if self.verification_url is not None:
            result['verification_url'] = self.verification_url
        if self.bpms_id is not None:
            result['bpms_id'] = self.bpms_id
        if self.config_data is not None:
            result['config_data'] = self.config_data
        if self.status is not None:
            result['status'] = self.status
        if self.creator is not None:
            result['creator'] = self.creator
        if self.modifor is not None:
            result['modifor'] = self.modifor
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('domain_code') is not None:
            self.domain_code = m.get('domain_code')
        if m.get('domain_name') is not None:
            self.domain_name = m.get('domain_name')
        if m.get('domain_version') is not None:
            self.domain_version = m.get('domain_version')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        if m.get('offer_code') is not None:
            self.offer_code = m.get('offer_code')
        if m.get('offer_name') is not None:
            self.offer_name = m.get('offer_name')
        if m.get('oms_data') is not None:
            self.oms_data = m.get('oms_data')
        if m.get('oms_biz_no') is not None:
            self.oms_biz_no = m.get('oms_biz_no')
        if m.get('verification_cache') is not None:
            self.verification_cache = m.get('verification_cache')
        if m.get('verification_url') is not None:
            self.verification_url = m.get('verification_url')
        if m.get('bpms_id') is not None:
            self.bpms_id = m.get('bpms_id')
        if m.get('config_data') is not None:
            self.config_data = m.get('config_data')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('modifor') is not None:
            self.modifor = m.get('modifor')
        return self


class UpdateAcfeewebStateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sync_result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成功、失败
        self.sync_result = sync_result

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
        if self.sync_result is not None:
            result['sync_result'] = self.sync_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sync_result') is not None:
            self.sync_result = m.get('sync_result')
        return self


