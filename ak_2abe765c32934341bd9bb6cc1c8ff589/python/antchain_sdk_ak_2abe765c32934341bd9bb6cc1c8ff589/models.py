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


class OrderGoodsModel(TeaModel):
    def __init__(
        self,
        product_id: str = None,
        product_version: int = None,
        product_name: str = None,
        product_price: int = None,
        product_imei_id: str = None,
        supplier_id: str = None,
        product_number: int = None,
    ):
        # 商品 id
        self.product_id = product_id
        # 商品版本，每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
        self.product_version = product_version
        # 商品名称
        self.product_name = product_name
        # 商品价格,精确到分，即 1234 表示 12.34 元
        self.product_price = product_price
        # 商品(3C产品)的设备 id
        self.product_imei_id = product_imei_id
        # 链上采购供应商租户 id，提供商品方的金融科技租户 id，否则平台自己名称
        self.supplier_id = supplier_id
        # 商品数量，不能为空，且大于 0
        self.product_number = product_number

    def validate(self):
        self.validate_required(self.product_id, 'product_id')
        if self.product_id is not None:
            self.validate_max_length(self.product_id, 'product_id', 50)
        self.validate_required(self.product_version, 'product_version')
        self.validate_required(self.product_name, 'product_name')
        if self.product_name is not None:
            self.validate_max_length(self.product_name, 'product_name', 50)
        self.validate_required(self.product_price, 'product_price')
        self.validate_required(self.product_imei_id, 'product_imei_id')
        if self.product_imei_id is not None:
            self.validate_max_length(self.product_imei_id, 'product_imei_id', 200)
        self.validate_required(self.supplier_id, 'supplier_id')
        if self.supplier_id is not None:
            self.validate_max_length(self.supplier_id, 'supplier_id', 50)
        self.validate_required(self.product_number, 'product_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.product_version is not None:
            result['product_version'] = self.product_version
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_price is not None:
            result['product_price'] = self.product_price
        if self.product_imei_id is not None:
            result['product_imei_id'] = self.product_imei_id
        if self.supplier_id is not None:
            result['supplier_id'] = self.supplier_id
        if self.product_number is not None:
            result['product_number'] = self.product_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('product_version') is not None:
            self.product_version = m.get('product_version')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_price') is not None:
            self.product_price = m.get('product_price')
        if m.get('product_imei_id') is not None:
            self.product_imei_id = m.get('product_imei_id')
        if m.get('supplier_id') is not None:
            self.supplier_id = m.get('supplier_id')
        if m.get('product_number') is not None:
            self.product_number = m.get('product_number')
        return self


class PromiseInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        date_limit: int = None,
        pay_date_list: List[str] = None,
        pay_period: int = None,
        pay_money_list: List[int] = None,
        lease_alipay_uid: str = None,
    ):
        # 订单 id
        self.order_id = order_id
        # 宽限期，精确到 毫秒，产生罚息的延迟时间范围。
        self.date_limit = date_limit
        # 应付租金时间，格式为 2019-08-31 12:00:00
        # yyyy-MM-dd HH:mm:ss
        self.pay_date_list = pay_date_list
        # 租期
        self.pay_period = pay_period
        # 应付租金，精确到分，即 1234 表示 12.34 元
        self.pay_money_list = pay_money_list
        # 租赁公司支付宝 UID
        self.lease_alipay_uid = lease_alipay_uid

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.date_limit, 'date_limit')
        if self.date_limit is not None:
            self.validate_minimum(self.date_limit, 'date_limit', 0)
        self.validate_required(self.pay_date_list, 'pay_date_list')
        self.validate_required(self.pay_period, 'pay_period')
        if self.pay_period is not None:
            self.validate_minimum(self.pay_period, 'pay_period', 1)
        self.validate_required(self.pay_money_list, 'pay_money_list')
        self.validate_required(self.lease_alipay_uid, 'lease_alipay_uid')
        if self.lease_alipay_uid is not None:
            self.validate_max_length(self.lease_alipay_uid, 'lease_alipay_uid', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.date_limit is not None:
            result['date_limit'] = self.date_limit
        if self.pay_date_list is not None:
            result['pay_date_list'] = self.pay_date_list
        if self.pay_period is not None:
            result['pay_period'] = self.pay_period
        if self.pay_money_list is not None:
            result['pay_money_list'] = self.pay_money_list
        if self.lease_alipay_uid is not None:
            result['lease_alipay_uid'] = self.lease_alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('date_limit') is not None:
            self.date_limit = m.get('date_limit')
        if m.get('pay_date_list') is not None:
            self.pay_date_list = m.get('pay_date_list')
        if m.get('pay_period') is not None:
            self.pay_period = m.get('pay_period')
        if m.get('pay_money_list') is not None:
            self.pay_money_list = m.get('pay_money_list')
        if m.get('lease_alipay_uid') is not None:
            self.lease_alipay_uid = m.get('lease_alipay_uid')
        return self


class UserSyncInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        login_id: str = None,
        login_type: int = None,
        login_time: str = None,
        user_name: str = None,
        user_id: str = None,
        user_phone_number: str = None,
        user_type: str = None,
        alipay_uid: str = None,
        lease_corp_name: str = None,
        lease_corp_id: str = None,
        lease_corp_owner_name: str = None,
        lessee_type: int = None,
        leased_enterprise: str = None,
        user_image_url: str = None,
        user_back_image_url: str = None,
        registered_telephone_number: str = None,
        actual_controller_id: str = None,
        actual_controller_number: str = None,
        actual_controller_name: str = None,
        actual_controller_image_url: str = None,
        actual_controller_back_image_url: str = None,
        actual_controller_telephone_number: str = None,
        business_license_number: str = None,
        businesslicense_url: str = None,
        legal_representative: str = None,
        extra_info: str = None,
    ):
        # 外部同步的订单 id
        self.order_id = order_id
        # 用户登录名，租赁平台会员ID/若支付宝ID必传
        self.login_id = login_id
        # 户登录名类型 1.商户会员2.支付宝3.其他
        self.login_type = login_type
        # 用户登录时间 格式为2019-08-31 12:00:00
        self.login_time = login_time
        # 租赁人姓名，这里是用户通过公钥加密后的密文
        self.user_name = user_name
        # 租赁人身份证，这里是用户通过公钥加密后的密文
        self.user_id = user_id
        # 承租人手机号，这里是用户通过公钥加密后的密文
        self.user_phone_number = user_phone_number
        # 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
        self.user_type = user_type
        # 支付宝账号信息
        self.alipay_uid = alipay_uid
        # 出租企业名称
        self.lease_corp_name = lease_corp_name
        # 出租企业统一社会信用代码
        self.lease_corp_id = lease_corp_id
        # 出租法定代表人姓名
        self.lease_corp_owner_name = lease_corp_owner_name
        # 1.企业用户 2.个人用户
        self.lessee_type = lessee_type
        # 营业执照对应的名称
        self.leased_enterprise = leased_enterprise
        # 租赁⼈身份证照⽚正⾯地址
        self.user_image_url = user_image_url
        # 租赁⼈身份证照⽚反⾯地址
        self.user_back_image_url = user_back_image_url
        # 平台注册的电话，这里是用户通过公钥加密后的密文
        self.registered_telephone_number = registered_telephone_number
        # 承租企业实际控制人（股东/法人）身份证号
        self.actual_controller_id = actual_controller_id
        # 承租企业实际控制人（股东/法人）手机号。若为企业类型必填，字段长度：不超过 500
        self.actual_controller_number = actual_controller_number
        # 承租企业实际控制人（股东/法人）姓名，若为企业类型必填
        self.actual_controller_name = actual_controller_name
        # 承租企业实际控制人（股东/法人）身份证正面地址，若为企业类型必填
        self.actual_controller_image_url = actual_controller_image_url
        # 承租企业实际控制人（股东/法人）身份证反面地址
        self.actual_controller_back_image_url = actual_controller_back_image_url
        # 承租企业实际控制人（股东/法人）手机号
        self.actual_controller_telephone_number = actual_controller_telephone_number
        # 承租企业统⼀社会信⽤代码
        self.business_license_number = business_license_number
        # 承租企业统一社会信用代码
        self.businesslicense_url = businesslicense_url
        # 承租企业法定代表人姓名
        self.legal_representative = legal_representative
        # 资方定义的其他额外字段，以json形式传递
        self.extra_info = extra_info

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.login_id, 'login_id')
        if self.login_id is not None:
            self.validate_max_length(self.login_id, 'login_id', 50)
        self.validate_required(self.login_type, 'login_type')
        self.validate_required(self.login_time, 'login_time')
        if self.login_time is not None:
            self.validate_max_length(self.login_time, 'login_time', 32)
        self.validate_required(self.user_name, 'user_name')
        if self.user_name is not None:
            self.validate_max_length(self.user_name, 'user_name', 500)
        self.validate_required(self.user_id, 'user_id')
        if self.user_id is not None:
            self.validate_max_length(self.user_id, 'user_id', 500)
        self.validate_required(self.user_phone_number, 'user_phone_number')
        if self.user_phone_number is not None:
            self.validate_max_length(self.user_phone_number, 'user_phone_number', 500)
        self.validate_required(self.user_type, 'user_type')
        if self.user_type is not None:
            self.validate_max_length(self.user_type, 'user_type', 2)
        self.validate_required(self.alipay_uid, 'alipay_uid')
        if self.alipay_uid is not None:
            self.validate_max_length(self.alipay_uid, 'alipay_uid', 64)
        self.validate_required(self.lease_corp_name, 'lease_corp_name')
        if self.lease_corp_name is not None:
            self.validate_max_length(self.lease_corp_name, 'lease_corp_name', 50)
        self.validate_required(self.lease_corp_id, 'lease_corp_id')
        if self.lease_corp_id is not None:
            self.validate_max_length(self.lease_corp_id, 'lease_corp_id', 50)
        self.validate_required(self.lease_corp_owner_name, 'lease_corp_owner_name')
        if self.lease_corp_owner_name is not None:
            self.validate_max_length(self.lease_corp_owner_name, 'lease_corp_owner_name', 50)
        self.validate_required(self.lessee_type, 'lessee_type')
        if self.leased_enterprise is not None:
            self.validate_max_length(self.leased_enterprise, 'leased_enterprise', 50)
        if self.user_image_url is not None:
            self.validate_max_length(self.user_image_url, 'user_image_url', 1000)
        if self.user_back_image_url is not None:
            self.validate_max_length(self.user_back_image_url, 'user_back_image_url', 1000)
        if self.registered_telephone_number is not None:
            self.validate_max_length(self.registered_telephone_number, 'registered_telephone_number', 500)
        if self.actual_controller_id is not None:
            self.validate_max_length(self.actual_controller_id, 'actual_controller_id', 500)
        if self.actual_controller_name is not None:
            self.validate_max_length(self.actual_controller_name, 'actual_controller_name', 1000)
        if self.actual_controller_image_url is not None:
            self.validate_max_length(self.actual_controller_image_url, 'actual_controller_image_url', 50)
        if self.actual_controller_back_image_url is not None:
            self.validate_max_length(self.actual_controller_back_image_url, 'actual_controller_back_image_url', 1000)
        if self.actual_controller_telephone_number is not None:
            self.validate_max_length(self.actual_controller_telephone_number, 'actual_controller_telephone_number', 12)
        if self.business_license_number is not None:
            self.validate_max_length(self.business_license_number, 'business_license_number', 50)
        if self.legal_representative is not None:
            self.validate_max_length(self.legal_representative, 'legal_representative', 20)
        if self.extra_info is not None:
            self.validate_max_length(self.extra_info, 'extra_info', 2000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.login_id is not None:
            result['login_id'] = self.login_id
        if self.login_type is not None:
            result['login_type'] = self.login_type
        if self.login_time is not None:
            result['login_time'] = self.login_time
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_phone_number is not None:
            result['user_phone_number'] = self.user_phone_number
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        if self.lease_corp_name is not None:
            result['lease_corp_name'] = self.lease_corp_name
        if self.lease_corp_id is not None:
            result['lease_corp_id'] = self.lease_corp_id
        if self.lease_corp_owner_name is not None:
            result['lease_corp_owner_name'] = self.lease_corp_owner_name
        if self.lessee_type is not None:
            result['lessee_type'] = self.lessee_type
        if self.leased_enterprise is not None:
            result['leased_enterprise'] = self.leased_enterprise
        if self.user_image_url is not None:
            result['user_image_url'] = self.user_image_url
        if self.user_back_image_url is not None:
            result['user_back_image_url'] = self.user_back_image_url
        if self.registered_telephone_number is not None:
            result['registered_telephone_number'] = self.registered_telephone_number
        if self.actual_controller_id is not None:
            result['actual_controller_id'] = self.actual_controller_id
        if self.actual_controller_number is not None:
            result['actual_controller_number'] = self.actual_controller_number
        if self.actual_controller_name is not None:
            result['actual_controller_name'] = self.actual_controller_name
        if self.actual_controller_image_url is not None:
            result['actual_controller_image_url'] = self.actual_controller_image_url
        if self.actual_controller_back_image_url is not None:
            result['actual_controller_back_image_url'] = self.actual_controller_back_image_url
        if self.actual_controller_telephone_number is not None:
            result['actual_controller_telephone_number'] = self.actual_controller_telephone_number
        if self.business_license_number is not None:
            result['business_license_number'] = self.business_license_number
        if self.businesslicense_url is not None:
            result['businesslicense_url'] = self.businesslicense_url
        if self.legal_representative is not None:
            result['legal_representative'] = self.legal_representative
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('login_id') is not None:
            self.login_id = m.get('login_id')
        if m.get('login_type') is not None:
            self.login_type = m.get('login_type')
        if m.get('login_time') is not None:
            self.login_time = m.get('login_time')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_phone_number') is not None:
            self.user_phone_number = m.get('user_phone_number')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        if m.get('lease_corp_name') is not None:
            self.lease_corp_name = m.get('lease_corp_name')
        if m.get('lease_corp_id') is not None:
            self.lease_corp_id = m.get('lease_corp_id')
        if m.get('lease_corp_owner_name') is not None:
            self.lease_corp_owner_name = m.get('lease_corp_owner_name')
        if m.get('lessee_type') is not None:
            self.lessee_type = m.get('lessee_type')
        if m.get('leased_enterprise') is not None:
            self.leased_enterprise = m.get('leased_enterprise')
        if m.get('user_image_url') is not None:
            self.user_image_url = m.get('user_image_url')
        if m.get('user_back_image_url') is not None:
            self.user_back_image_url = m.get('user_back_image_url')
        if m.get('registered_telephone_number') is not None:
            self.registered_telephone_number = m.get('registered_telephone_number')
        if m.get('actual_controller_id') is not None:
            self.actual_controller_id = m.get('actual_controller_id')
        if m.get('actual_controller_number') is not None:
            self.actual_controller_number = m.get('actual_controller_number')
        if m.get('actual_controller_name') is not None:
            self.actual_controller_name = m.get('actual_controller_name')
        if m.get('actual_controller_image_url') is not None:
            self.actual_controller_image_url = m.get('actual_controller_image_url')
        if m.get('actual_controller_back_image_url') is not None:
            self.actual_controller_back_image_url = m.get('actual_controller_back_image_url')
        if m.get('actual_controller_telephone_number') is not None:
            self.actual_controller_telephone_number = m.get('actual_controller_telephone_number')
        if m.get('business_license_number') is not None:
            self.business_license_number = m.get('business_license_number')
        if m.get('businesslicense_url') is not None:
            self.businesslicense_url = m.get('businesslicense_url')
        if m.get('legal_representative') is not None:
            self.legal_representative = m.get('legal_representative')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        return self


class OrderInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        order_create_time: str = None,
        order_pay_time: str = None,
        order_pay_id: str = None,
        order_pay_type: int = None,
        order_pay_subject: str = None,
        rent_term: int = None,
        rent_price_per_month: int = None,
        buy_out_price: int = None,
        lease_contract_url: str = None,
        store_type: int = None,
        user_address: str = None,
        supplier_isv_account: str = None,
        province_code: str = None,
        city_code: str = None,
        district_code: str = None,
        due_mode: int = None,
        contract_id: str = None,
        total_rent_money: int = None,
        insurance_number: str = None,
        insurance_url: str = None,
        yidun_score: int = None,
        agreement_no: str = None,
        agreement_order_id: str = None,
        down_payment: int = None,
        order_pay_body: str = None,
        extra_info: str = None,
    ):
        # 订单 id
        self.order_id = order_id
        # 订单创建时间，格式为2019-08-31 12:00:00
        self.order_create_time = order_create_time
        # 订单支付时间，格式为 2019-08-31 12:00:00
        self.order_pay_time = order_pay_time
        # 订单支付 id
        self.order_pay_id = order_pay_id
        # 订单支付类型；1:预授权，2:信用套餐，3:支付宝代扣，4:其他，5:网商直付通代扣，6:网商委托代扣
        self.order_pay_type = order_pay_type
        # 订单支付主题
        self.order_pay_subject = order_pay_subject
        # 租期，单位：月
        self.rent_term = rent_term
        # 月租金 精确到分，即 1234 表示 12.34 元
        self.rent_price_per_month = rent_price_per_month
        # 到期买断价 精确到分，即 1234 表示 12.34 元
        self.buy_out_price = buy_out_price
        # 租赁合同,需要客户自己提供合并的 url
        self.lease_contract_url = lease_contract_url
        # 仓库类型；1: 实体仓 2: 虚拟仓
        self.store_type = store_type
        # 承租人收货地址
        self.user_address = user_address
        # 供应商在金融科技对应的租户 id，若填写此字段，则会走供应商模式
        self.supplier_isv_account = supplier_isv_account
        # 省份编码
        self.province_code = province_code
        # 城市编码
        self.city_code = city_code
        # 地区码
        self.district_code = district_code
        # 到期形式；1:到期买断 2:到期归还
        self.due_mode = due_mode
        # 租赁合同 id，可用作幂等
        self.contract_id = contract_id
        # 租金总额，精确到分，即 1234 表示 12.34 元
        self.total_rent_money = total_rent_money
        # 保险单号
        self.insurance_number = insurance_number
        # 保险地址
        self.insurance_url = insurance_url
        # 蚁盾分数
        self.yidun_score = yidun_score
        # 网商直付通模式的代扣协议号，订单类型为网商直付通模式为必填
        self.agreement_no = agreement_no
        # 直付通代扣受理订单号，订单类型为网商直付通模式为必填
        self.agreement_order_id = agreement_order_id
        # 首付款金额, 精确到分，即 1234 表示 12.34 元，订单类型为网商直付通模式为必填
        self.down_payment = down_payment
        # 订单付款内容描述
        self.order_pay_body = order_pay_body
        # 额外信息
        self.extra_info = extra_info

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.order_create_time, 'order_create_time')
        self.validate_required(self.order_pay_time, 'order_pay_time')
        self.validate_required(self.order_pay_id, 'order_pay_id')
        if self.order_pay_id is not None:
            self.validate_max_length(self.order_pay_id, 'order_pay_id', 50)
        self.validate_required(self.order_pay_type, 'order_pay_type')
        self.validate_required(self.order_pay_subject, 'order_pay_subject')
        if self.order_pay_subject is not None:
            self.validate_max_length(self.order_pay_subject, 'order_pay_subject', 500)
        self.validate_required(self.rent_term, 'rent_term')
        if self.rent_term is not None:
            self.validate_minimum(self.rent_term, 'rent_term', 1)
        self.validate_required(self.rent_price_per_month, 'rent_price_per_month')
        self.validate_required(self.buy_out_price, 'buy_out_price')
        self.validate_required(self.lease_contract_url, 'lease_contract_url')
        if self.lease_contract_url is not None:
            self.validate_max_length(self.lease_contract_url, 'lease_contract_url', 1000)
        self.validate_required(self.store_type, 'store_type')
        self.validate_required(self.user_address, 'user_address')
        if self.user_address is not None:
            self.validate_max_length(self.user_address, 'user_address', 100)
        self.validate_required(self.supplier_isv_account, 'supplier_isv_account')
        if self.supplier_isv_account is not None:
            self.validate_max_length(self.supplier_isv_account, 'supplier_isv_account', 100)
        self.validate_required(self.province_code, 'province_code')
        self.validate_required(self.city_code, 'city_code')
        self.validate_required(self.district_code, 'district_code')
        self.validate_required(self.due_mode, 'due_mode')
        if self.contract_id is not None:
            self.validate_max_length(self.contract_id, 'contract_id', 100)
        self.validate_required(self.total_rent_money, 'total_rent_money')
        if self.insurance_number is not None:
            self.validate_max_length(self.insurance_number, 'insurance_number', 100)
        if self.insurance_url is not None:
            self.validate_max_length(self.insurance_url, 'insurance_url', 1000)
        if self.agreement_no is not None:
            self.validate_max_length(self.agreement_no, 'agreement_no', 100)
        if self.agreement_order_id is not None:
            self.validate_max_length(self.agreement_order_id, 'agreement_order_id', 100)
        if self.order_pay_body is not None:
            self.validate_max_length(self.order_pay_body, 'order_pay_body', 500)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_create_time is not None:
            result['order_create_time'] = self.order_create_time
        if self.order_pay_time is not None:
            result['order_pay_time'] = self.order_pay_time
        if self.order_pay_id is not None:
            result['order_pay_id'] = self.order_pay_id
        if self.order_pay_type is not None:
            result['order_pay_type'] = self.order_pay_type
        if self.order_pay_subject is not None:
            result['order_pay_subject'] = self.order_pay_subject
        if self.rent_term is not None:
            result['rent_term'] = self.rent_term
        if self.rent_price_per_month is not None:
            result['rent_price_per_month'] = self.rent_price_per_month
        if self.buy_out_price is not None:
            result['buy_out_price'] = self.buy_out_price
        if self.lease_contract_url is not None:
            result['lease_contract_url'] = self.lease_contract_url
        if self.store_type is not None:
            result['store_type'] = self.store_type
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.supplier_isv_account is not None:
            result['supplier_isv_account'] = self.supplier_isv_account
        if self.province_code is not None:
            result['province_code'] = self.province_code
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.district_code is not None:
            result['district_code'] = self.district_code
        if self.due_mode is not None:
            result['due_mode'] = self.due_mode
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.total_rent_money is not None:
            result['total_rent_money'] = self.total_rent_money
        if self.insurance_number is not None:
            result['insurance_number'] = self.insurance_number
        if self.insurance_url is not None:
            result['insurance_url'] = self.insurance_url
        if self.yidun_score is not None:
            result['yidun_score'] = self.yidun_score
        if self.agreement_no is not None:
            result['agreement_no'] = self.agreement_no
        if self.agreement_order_id is not None:
            result['agreement_order_id'] = self.agreement_order_id
        if self.down_payment is not None:
            result['down_payment'] = self.down_payment
        if self.order_pay_body is not None:
            result['order_pay_body'] = self.order_pay_body
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_create_time') is not None:
            self.order_create_time = m.get('order_create_time')
        if m.get('order_pay_time') is not None:
            self.order_pay_time = m.get('order_pay_time')
        if m.get('order_pay_id') is not None:
            self.order_pay_id = m.get('order_pay_id')
        if m.get('order_pay_type') is not None:
            self.order_pay_type = m.get('order_pay_type')
        if m.get('order_pay_subject') is not None:
            self.order_pay_subject = m.get('order_pay_subject')
        if m.get('rent_term') is not None:
            self.rent_term = m.get('rent_term')
        if m.get('rent_price_per_month') is not None:
            self.rent_price_per_month = m.get('rent_price_per_month')
        if m.get('buy_out_price') is not None:
            self.buy_out_price = m.get('buy_out_price')
        if m.get('lease_contract_url') is not None:
            self.lease_contract_url = m.get('lease_contract_url')
        if m.get('store_type') is not None:
            self.store_type = m.get('store_type')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('supplier_isv_account') is not None:
            self.supplier_isv_account = m.get('supplier_isv_account')
        if m.get('province_code') is not None:
            self.province_code = m.get('province_code')
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('district_code') is not None:
            self.district_code = m.get('district_code')
        if m.get('due_mode') is not None:
            self.due_mode = m.get('due_mode')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('total_rent_money') is not None:
            self.total_rent_money = m.get('total_rent_money')
        if m.get('insurance_number') is not None:
            self.insurance_number = m.get('insurance_number')
        if m.get('insurance_url') is not None:
            self.insurance_url = m.get('insurance_url')
        if m.get('yidun_score') is not None:
            self.yidun_score = m.get('yidun_score')
        if m.get('agreement_no') is not None:
            self.agreement_no = m.get('agreement_no')
        if m.get('agreement_order_id') is not None:
            self.agreement_order_id = m.get('agreement_order_id')
        if m.get('down_payment') is not None:
            self.down_payment = m.get('down_payment')
        if m.get('order_pay_body') is not None:
            self.order_pay_body = m.get('order_pay_body')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        return self


class GoodsInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        lease_id: str = None,
        goods_list: List[OrderGoodsModel] = None,
    ):
        # 订单 id
        self.order_id = order_id
        # 租赁机构自己的金融科技租户 id，如果是代理模式此处需要为被代理机构的金融科技租户 id
        self.lease_id = lease_id
        # 订单包含的商品信息列表
        self.goods_list = goods_list

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        if self.lease_id is not None:
            self.validate_max_length(self.lease_id, 'lease_id', 50)
        self.validate_required(self.goods_list, 'goods_list')
        if self.goods_list:
            for k in self.goods_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.lease_id is not None:
            result['lease_id'] = self.lease_id
        result['goods_list'] = []
        if self.goods_list is not None:
            for k in self.goods_list:
                result['goods_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('lease_id') is not None:
            self.lease_id = m.get('lease_id')
        self.goods_list = []
        if m.get('goods_list') is not None:
            for k in m.get('goods_list'):
                temp_model = OrderGoodsModel()
                self.goods_list.append(temp_model.from_map(k))
        return self


class SyncAntchainAtoTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务字段，具体传入信息需参考文档
        # 传入格式需为json字符串
        self.biz_content = biz_content
        # 接口执行类型
        # 
        self.type = type

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class SyncAntchainAtoTradeResponse(TeaModel):
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
        # resp信息
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


class GetAntchainAtoTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询信息，必须遵循json字符串格式
        self.biz_content = biz_content
        # 接口类型
        self.type = type

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class GetAntchainAtoTradeResponse(TeaModel):
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
        # 返回的查询值
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


class CreateAntchainAtoRealpersonFacevrfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        identity_type: str = None,
        cert_type: str = None,
        outer_order_no: str = None,
        return_url: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 真实姓名
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 身份信息来源类型，当前仅支持证件（CERT_INFO）
        self.identity_type = identity_type
        # 证件类型，当前仅支持身份证（IDENTITY_CARD）
        self.cert_type = cert_type
        # 商户请求的唯一标识。
        # 
        # 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
        self.outer_order_no = outer_order_no
        # 认证结束回跳地址
        self.return_url = return_url
        # 订单id 长度不可超过50
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.identity_type, 'identity_type')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.return_url, 'return_url')
        self.validate_required(self.order_id, 'order_id')

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
        if self.identity_type is not None:
            result['identity_type'] = self.identity_type
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.order_id is not None:
            result['order_id'] = self.order_id
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
        if m.get('identity_type') is not None:
            self.identity_type = m.get('identity_type')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class CreateAntchainAtoRealpersonFacevrfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回字段，JSON格式
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryAntchainAtoRealpersonFacevrfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certify_id: str = None,
        outer_order_no: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 可信实人认证的唯一标识
        self.certify_id = certify_id
        # 商户请求的唯一标识。
        # 
        # 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
        self.outer_order_no = outer_order_no
        # 订单id 长度不可超过50
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.order_id, 'order_id')

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
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class QueryAntchainAtoRealpersonFacevrfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回字段，JSON格式
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class AllAntchainAtoSignTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class AllAntchainAtoSignTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # List<Object>格式，详细参考：
        # [
        # {
        # "templateCode": "TEST_001",
        # "tenantId": "BIPCCOQY",
        # "agreementType": "SERVICE_LEASE",
        # "fileName": "测试模板之协议签署证明",
        # "templateId": "f28038577d664015bfc1034c4a125121",
        # "fieldArgs": "{\"sceneName\":\"测试协议合同签署\",\"title\":\"这是一份证明协议\"}",
        # "userPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"162.44\",\"posY\":\"425\"}]",
        # "orgPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"449.99\",\"posY\":\"420.03\"}]"
        # }
        # ]
        self.template_list = template_list

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
        if self.template_list is not None:
            result['template_list'] = self.template_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_list') is not None:
            self.template_list = m.get('template_list')
        return self


class SubmitAntchainAtoSignFlowRequest(TeaModel):
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
        # 订单号
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
        self.user_name = user_name
        # 用户手机号，可不传；传的话需要采用RSA加密传输
        self.user_mobile = user_mobile
        # 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
        self.user_email = user_email
        # 签署有效期，时间戳，例如：new Date().getTime()
        self.sign_validity = sign_validity
        # 1-短信；2-邮件
        self.flow_notify_type = flow_notify_type
        # 业务场景，电子合同签署协议的时候的标题
        self.business_scene = business_scene
        # 签署完成跳转链接
        self.signed_redirect_url = signed_redirect_url
        # 签署的电子合同模板信息，List<Object>的JSON格式，Object如下：
        # {
        # templateId:__, // String格式
        # templateArgs: {
        # "模板参数key":"模板参数值", // 必须为String
        # }
        # }
        self.template_list = template_list
        # 用户的支付宝uid
        self.alipay_user_id = alipay_user_id
        # 公司名称
        self.merchant_name = merchant_name
        # 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        self.merchant_tag = merchant_tag
        # 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
        self.merchant_sign_order = merchant_sign_order
        # CRED_ORG_USCC：统一社会信用代码，CRED_ORG_REGCODE：工商注册号，只支持这两个值
        self.merchant_id_type = merchant_id_type
        # 商户证件号，需要采用RSA加密传输
        self.merchant_id_number = merchant_id_number
        # 法人姓名，需要RSA加密传输
        self.merchant_legal_name = merchant_legal_name
        # 法人证件号，需要采用RSA加密传输
        self.merchant_legal_id_number = merchant_legal_id_number
        # 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012"}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
        self.third_signer = third_signer

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.user_id_number, 'user_id_number')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.business_scene, 'business_scene')
        self.validate_required(self.template_list, 'template_list')
        self.validate_required(self.alipay_user_id, 'alipay_user_id')
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 20)
        self.validate_required(self.merchant_name, 'merchant_name')
        if self.merchant_name is not None:
            self.validate_max_length(self.merchant_name, 'merchant_name', 256)
        if self.merchant_tag is not None:
            self.validate_max_length(self.merchant_tag, 'merchant_tag', 32)
        if self.merchant_sign_order is not None:
            self.validate_maximum(self.merchant_sign_order, 'merchant_sign_order', 10000)
            self.validate_minimum(self.merchant_sign_order, 'merchant_sign_order', 1)
        self.validate_required(self.merchant_id_type, 'merchant_id_type')
        if self.merchant_id_type is not None:
            self.validate_max_length(self.merchant_id_type, 'merchant_id_type', 20)
        self.validate_required(self.merchant_id_number, 'merchant_id_number')
        if self.merchant_id_number is not None:
            self.validate_max_length(self.merchant_id_number, 'merchant_id_number', 1000)
        if self.third_signer is not None:
            self.validate_max_length(self.third_signer, 'third_signer', 2000)

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


class SubmitAntchainAtoSignFlowResponse(TeaModel):
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
        self.sign_no = sign_no
        # 电子签署流程ID
        self.flow_id = flow_id
        # 签署用户ID
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


class GetAntchainAtoSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sign_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署合同单号
        self.sign_no = sign_no

    def validate(self):
        self.validate_required(self.sign_no, 'sign_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        return self


class GetAntchainAtoSignFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_no: str = None,
        order_id: str = None,
        account_id: str = None,
        status: str = None,
        flow_id: str = None,
        doc_list: str = None,
        business_scene: str = None,
        alipay_user_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署合同单号
        self.sign_no = sign_no
        # 订单号
        self.order_id = order_id
        # 签署用户ID
        self.account_id = account_id
        # 状态：DRAFT - 草稿； SIGNING - 签署中； FINISH - 签署完成；UNDO - 撤销； TERMINATE - 终止； EXPIRE - 过期； REJECTED - 拒签； CANCELLED - 解约
        # 
        self.status = status
        # 签署流程ID
        self.flow_id = flow_id
        # 签署文件列表，参考：
        # _[{"fileItemNo":"10090801000001699892007791144960","agreementType":"COMMON","fileName":"xxx合同","fileSize":228530,"signAccountId":"fe2eb3814c4e49edba2bc012f790771f","fileId":"2c7684461a0f4d33bc02f6d77f7b3937","downloadUrl":"https://dev.oss-cn-shanghai.aliyuncs.com/ag/ord/xxx/16939683744483057_%E6%B5%8B%E8%AF%95%E6%A8%A1%E6%9D%BF%E4%B9%8B%E5%8D%8F%E8%AE%AE%E7%AD%BE%E7%BD%B2%E8%AF%81%E6%98%8E.pdf?Expires=1693971989&OSSAccessKeyId=LTAI5tR3hHiaXPAh8YsY9Dce&Signature=i%2FfAgDem33guI%2F0KjIFj24XZNCc%3D"}]_
        self.doc_list = doc_list
        # 业务场景，主要用于签署合同的标题描述
        self.business_scene = business_scene
        # 签署合同中的订单的uid。
        self.alipay_user_id = alipay_user_id

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.status is not None:
            result['status'] = self.status
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.doc_list is not None:
            result['doc_list'] = self.doc_list
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
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
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('doc_list') is not None:
            self.doc_list = m.get('doc_list')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        return self


class SyncAntchainAtoFundSplittingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        fund_no: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        term_num: int = None,
        deduction_time: str = None,
        deduction_amount: int = None,
        merchant_split_amount: int = None,
        fund_split_amount: int = None,
        other_split_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资方订单号
        self.fund_no = fund_no
        # 商户的订单号
        self.order_id = order_id
        # 商户的数科租户ID
        self.merchant_tenant_id = merchant_tenant_id
        # 第几期，例如：2表示第二期
        self.term_num = term_num
        # 扣款时间， yyyy-MM-dd HH:mm:ss 格式
        self.deduction_time = deduction_time
        # 扣款金额，单位精确到分， 例如：12462300为124623.00元
        self.deduction_amount = deduction_amount
        # 商户分账金额，单位精确到分，比如：666601 = 6666.01元
        self.merchant_split_amount = merchant_split_amount
        # 资方分账金额，单位精确到分。比如：666610 = 6666.10元
        self.fund_split_amount = fund_split_amount
        # 其他参与方分账信息，JSON格式的数组，样例：
        # [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
        self.other_split_info = other_split_info

    def validate(self):
        self.validate_required(self.fund_no, 'fund_no')
        if self.fund_no is not None:
            self.validate_max_length(self.fund_no, 'fund_no', 50)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 50)
        self.validate_required(self.term_num, 'term_num')
        self.validate_required(self.deduction_time, 'deduction_time')
        self.validate_required(self.deduction_amount, 'deduction_amount')
        self.validate_required(self.merchant_split_amount, 'merchant_split_amount')
        self.validate_required(self.fund_split_amount, 'fund_split_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.fund_no is not None:
            result['fund_no'] = self.fund_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.term_num is not None:
            result['term_num'] = self.term_num
        if self.deduction_time is not None:
            result['deduction_time'] = self.deduction_time
        if self.deduction_amount is not None:
            result['deduction_amount'] = self.deduction_amount
        if self.merchant_split_amount is not None:
            result['merchant_split_amount'] = self.merchant_split_amount
        if self.fund_split_amount is not None:
            result['fund_split_amount'] = self.fund_split_amount
        if self.other_split_info is not None:
            result['other_split_info'] = self.other_split_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fund_no') is not None:
            self.fund_no = m.get('fund_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('term_num') is not None:
            self.term_num = m.get('term_num')
        if m.get('deduction_time') is not None:
            self.deduction_time = m.get('deduction_time')
        if m.get('deduction_amount') is not None:
            self.deduction_amount = m.get('deduction_amount')
        if m.get('merchant_split_amount') is not None:
            self.merchant_split_amount = m.get('merchant_split_amount')
        if m.get('fund_split_amount') is not None:
            self.fund_split_amount = m.get('fund_split_amount')
        if m.get('other_split_info') is not None:
            self.other_split_info = m.get('other_split_info')
        return self


class SyncAntchainAtoFundSplittingResponse(TeaModel):
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
        # 流水同步描述信息
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


class SyncAntchainAtoFundOrderfinancialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        application_id: str = None,
        status: int = None,
        reason: str = None,
        extras: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # 商户在数科的租户ID
        self.merchant_tenant_id = merchant_tenant_id
        # 订单融资唯一标识
        self.application_id = application_id
        # 订单融资状态：1-成功；2-失败
        self.status = status
        # 融资结果描述，长度不超过64
        self.reason = reason
        # 额外信息
        self.extras = extras

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 50)
        self.validate_required(self.application_id, 'application_id')
        if self.application_id is not None:
            self.validate_max_length(self.application_id, 'application_id', 128)
        self.validate_required(self.status, 'status')
        if self.reason is not None:
            self.validate_max_length(self.reason, 'reason', 64)

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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.application_id is not None:
            result['application_id'] = self.application_id
        if self.status is not None:
            result['status'] = self.status
        if self.reason is not None:
            result['reason'] = self.reason
        if self.extras is not None:
            result['extras'] = self.extras
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('application_id') is not None:
            self.application_id = m.get('application_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        if m.get('extras') is not None:
            self.extras = m.get('extras')
        return self


class SyncAntchainAtoFundOrderfinancialResponse(TeaModel):
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
        # 结果描述信息
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


class GetAntchainAtoFundRepaymentplanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        alipay_uid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id，不可为空
        self.order_id = order_id
        # 商户在数科注册的tenantId，不可为空
        self.merchant_tenant_id = merchant_tenant_id
        # 用户的支付宝uid
        self.alipay_uid = alipay_uid

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 50)
        self.validate_required(self.alipay_uid, 'alipay_uid')
        if self.alipay_uid is not None:
            self.validate_max_length(self.alipay_uid, 'alipay_uid', 50)

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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        return self


class GetAntchainAtoFundRepaymentplanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        lease_alipay_uid: str = None,
        grace_period_days: int = None,
        repay_strategy_list: str = None,
        punishment_type: str = None,
        pay_period: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单id
        self.order_id = order_id
        # 租赁公司支付宝UID
        self.lease_alipay_uid = lease_alipay_uid
        # 宽限期，天
        self.grace_period_days = grace_period_days
        # 还款策略列表
        self.repay_strategy_list = repay_strategy_list
        # 处罚策略
        # NONE : 没有处罚
        # PENALTY_FEE： 罚息
        self.punishment_type = punishment_type
        # 租期
        self.pay_period = pay_period

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.lease_alipay_uid is not None:
            result['lease_alipay_uid'] = self.lease_alipay_uid
        if self.grace_period_days is not None:
            result['grace_period_days'] = self.grace_period_days
        if self.repay_strategy_list is not None:
            result['repay_strategy_list'] = self.repay_strategy_list
        if self.punishment_type is not None:
            result['punishment_type'] = self.punishment_type
        if self.pay_period is not None:
            result['pay_period'] = self.pay_period
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('lease_alipay_uid') is not None:
            self.lease_alipay_uid = m.get('lease_alipay_uid')
        if m.get('grace_period_days') is not None:
            self.grace_period_days = m.get('grace_period_days')
        if m.get('repay_strategy_list') is not None:
            self.repay_strategy_list = m.get('repay_strategy_list')
        if m.get('punishment_type') is not None:
            self.punishment_type = m.get('punishment_type')
        if m.get('pay_period') is not None:
            self.pay_period = m.get('pay_period')
        return self


class SyncAntchainAtoFundWithholdingcontractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        withholding_contract_id: str = None,
        extra_info: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # 商家在数科注册的租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 代扣协议号
        self.withholding_contract_id = withholding_contract_id
        # json的字符串，存储额外信息
        self.extra_info = extra_info
        # 签署状态：
        # - ACCEPT : 接受
        # - REFUSE : 拒绝
        # - TIMEOUT : 超时
        self.status = status

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 50)
        self.validate_required(self.withholding_contract_id, 'withholding_contract_id')
        if self.withholding_contract_id is not None:
            self.validate_max_length(self.withholding_contract_id, 'withholding_contract_id', 100)
        self.validate_required(self.status, 'status')

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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.withholding_contract_id is not None:
            result['withholding_contract_id'] = self.withholding_contract_id
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('withholding_contract_id') is not None:
            self.withholding_contract_id = m.get('withholding_contract_id')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class SyncAntchainAtoFundWithholdingcontractResponse(TeaModel):
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
        # 存储成功
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


class SyncAntchainAtoFundOrderfulfillmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        order_id: str = None,
        lease_term_index: int = None,
        remain_term: int = None,
        total_term: int = None,
        rental_return_state: str = None,
        rental_money: int = None,
        penalty_fee_money: int = None,
        total_money: int = None,
        return_time: str = None,
        return_way: str = None,
        return_voucher_serial: str = None,
        bank_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户id
        self.merchant_tenant_id = merchant_tenant_id
        # 订单id
        self.order_id = order_id
        # 租期编号
        self.lease_term_index = lease_term_index
        # 剩余归还期数
        self.remain_term = remain_term
        # 总期数
        self.total_term = total_term
        # 租金归还状态，
        # RETURN_FULL : 足额归还 【终态】
        # NOT_RETURN : 未归还
        # CANCEL : 取消 【终态】
        self.rental_return_state = rental_return_state
        # 租金归还金额,精确到分，即1234表示12.34元
        self.rental_money = rental_money
        # 罚息金额，分，1234表示12.34元
        self.penalty_fee_money = penalty_fee_money
        # 总金额，单位分
        self.total_money = total_money
        # 归还时间，格式为"2019-07-31 12:00:00"
        self.return_time = return_time
        # 归还方式，
        # ANTDIGITAL： 数科代扣
        # FUND : 资方代扣
        # BANK : 银行转账
        # WECHAT : 微信支付
        self.return_way = return_way
        # 还款凭证编号
        self.return_voucher_serial = return_voucher_serial
        # 银行名字
        self.bank_name = bank_name

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 49)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.lease_term_index, 'lease_term_index')
        self.validate_required(self.remain_term, 'remain_term')
        self.validate_required(self.total_term, 'total_term')
        self.validate_required(self.rental_return_state, 'rental_return_state')
        self.validate_required(self.rental_money, 'rental_money')
        self.validate_required(self.penalty_fee_money, 'penalty_fee_money')
        self.validate_required(self.total_money, 'total_money')
        if self.return_voucher_serial is not None:
            self.validate_max_length(self.return_voucher_serial, 'return_voucher_serial', 127)
        if self.bank_name is not None:
            self.validate_max_length(self.bank_name, 'bank_name', 127)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.lease_term_index is not None:
            result['lease_term_index'] = self.lease_term_index
        if self.remain_term is not None:
            result['remain_term'] = self.remain_term
        if self.total_term is not None:
            result['total_term'] = self.total_term
        if self.rental_return_state is not None:
            result['rental_return_state'] = self.rental_return_state
        if self.rental_money is not None:
            result['rental_money'] = self.rental_money
        if self.penalty_fee_money is not None:
            result['penalty_fee_money'] = self.penalty_fee_money
        if self.total_money is not None:
            result['total_money'] = self.total_money
        if self.return_time is not None:
            result['return_time'] = self.return_time
        if self.return_way is not None:
            result['return_way'] = self.return_way
        if self.return_voucher_serial is not None:
            result['return_voucher_serial'] = self.return_voucher_serial
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('lease_term_index') is not None:
            self.lease_term_index = m.get('lease_term_index')
        if m.get('remain_term') is not None:
            self.remain_term = m.get('remain_term')
        if m.get('total_term') is not None:
            self.total_term = m.get('total_term')
        if m.get('rental_return_state') is not None:
            self.rental_return_state = m.get('rental_return_state')
        if m.get('rental_money') is not None:
            self.rental_money = m.get('rental_money')
        if m.get('penalty_fee_money') is not None:
            self.penalty_fee_money = m.get('penalty_fee_money')
        if m.get('total_money') is not None:
            self.total_money = m.get('total_money')
        if m.get('return_time') is not None:
            self.return_time = m.get('return_time')
        if m.get('return_way') is not None:
            self.return_way = m.get('return_way')
        if m.get('return_voucher_serial') is not None:
            self.return_voucher_serial = m.get('return_voucher_serial')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        return self


class SyncAntchainAtoFundOrderfulfillmentResponse(TeaModel):
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
        # 添加成功
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


class GetAntchainAtoFundOrderfulfillmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        term_idx: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 租赁订单所属商家租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 期数
        # 如果填入，获取term_idx下的履约记录
        # 如果不填入，获取order_id下的所有履约记录
        self.term_idx = term_idx

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 49)

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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.term_idx is not None:
            result['term_idx'] = self.term_idx
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('term_idx') is not None:
            self.term_idx = m.get('term_idx')
        return self


class GetAntchainAtoFundOrderfulfillmentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_fulfillment_data_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单履约信息的列表数组
        # List<OrderFulfillment> 的jsonArray.toString
        self.order_fulfillment_data_list = order_fulfillment_data_list

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
        if self.order_fulfillment_data_list is not None:
            result['order_fulfillment_data_list'] = self.order_fulfillment_data_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_fulfillment_data_list') is not None:
            self.order_fulfillment_data_list = m.get('order_fulfillment_data_list')
        return self


class CreateAntchainAtoWithholdSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        alipay_merchant_id: str = None,
        alipay_merchant_name: str = None,
        alipay_merchant_service_name: str = None,
        alipay_merchant_service_description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 支付宝商户id，使用签约能力前时候进行向平台申请
        self.alipay_merchant_id = alipay_merchant_id
        # 支付宝商户名称，会展示在支付并签约界面
        self.alipay_merchant_name = alipay_merchant_name
        # 支付宝商户服务名称，会展示在支付并签约界面
        self.alipay_merchant_service_name = alipay_merchant_service_name
        # 支付宝商户服务描述，会展示在支付并签约界面
        self.alipay_merchant_service_description = alipay_merchant_service_description

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.alipay_merchant_id, 'alipay_merchant_id')
        if self.alipay_merchant_id is not None:
            self.validate_max_length(self.alipay_merchant_id, 'alipay_merchant_id', 20)
        self.validate_required(self.alipay_merchant_name, 'alipay_merchant_name')
        if self.alipay_merchant_name is not None:
            self.validate_max_length(self.alipay_merchant_name, 'alipay_merchant_name', 50)
        self.validate_required(self.alipay_merchant_service_name, 'alipay_merchant_service_name')
        if self.alipay_merchant_service_name is not None:
            self.validate_max_length(self.alipay_merchant_service_name, 'alipay_merchant_service_name', 50)
        self.validate_required(self.alipay_merchant_service_description, 'alipay_merchant_service_description')
        if self.alipay_merchant_service_description is not None:
            self.validate_max_length(self.alipay_merchant_service_description, 'alipay_merchant_service_description', 150)

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
        if self.alipay_merchant_id is not None:
            result['alipay_merchant_id'] = self.alipay_merchant_id
        if self.alipay_merchant_name is not None:
            result['alipay_merchant_name'] = self.alipay_merchant_name
        if self.alipay_merchant_service_name is not None:
            result['alipay_merchant_service_name'] = self.alipay_merchant_service_name
        if self.alipay_merchant_service_description is not None:
            result['alipay_merchant_service_description'] = self.alipay_merchant_service_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('alipay_merchant_id') is not None:
            self.alipay_merchant_id = m.get('alipay_merchant_id')
        if m.get('alipay_merchant_name') is not None:
            self.alipay_merchant_name = m.get('alipay_merchant_name')
        if m.get('alipay_merchant_service_name') is not None:
            self.alipay_merchant_service_name = m.get('alipay_merchant_service_name')
        if m.get('alipay_merchant_service_description') is not None:
            self.alipay_merchant_service_description = m.get('alipay_merchant_service_description')
        return self


class CreateAntchainAtoWithholdSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_str: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约字符串
        self.sign_str = sign_str

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
        if self.sign_str is not None:
            result['sign_str'] = self.sign_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_str') is not None:
            self.sign_str = m.get('sign_str')
        return self


class QueryAntchainAtoWithholdSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class QueryAntchainAtoWithholdSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        sign_time: str = None,
        valid_time: str = None,
        invalid_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 协议当前状态
        # 1. UNSIGNED：未签约
        # 2. SIGNED：已签约；
        # 3. TERMINATED：已解约
        self.status = status
        # 协议签署时间
        self.sign_time = sign_time
        # 协议生效时间
        self.valid_time = valid_time
        # 协议失效时间
        self.invalid_time = invalid_time

    def validate(self):
        if self.sign_time is not None:
            self.validate_pattern(self.sign_time, 'sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.valid_time is not None:
            self.validate_pattern(self.valid_time, 'valid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.invalid_time is not None:
            self.validate_pattern(self.invalid_time, 'invalid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.invalid_time is not None:
            result['invalid_time'] = self.invalid_time
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
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('invalid_time') is not None:
            self.invalid_time = m.get('invalid_time')
        return self


class SyncAntchainAtoTradeFullRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_info: UserSyncInfo = None,
        order_info: OrderInfo = None,
        goods_info: GoodsInfo = None,
        promise_info: PromiseInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 购买用户信息
        self.user_info = user_info
        # 主订单信息
        self.order_info = order_info
        # 订单包含的商品信息列表
        self.goods_info = goods_info
        # 订单还款计划
        self.promise_info = promise_info

    def validate(self):
        self.validate_required(self.user_info, 'user_info')
        if self.user_info:
            self.user_info.validate()
        self.validate_required(self.order_info, 'order_info')
        if self.order_info:
            self.order_info.validate()
        self.validate_required(self.goods_info, 'goods_info')
        if self.goods_info:
            self.goods_info.validate()
        self.validate_required(self.promise_info, 'promise_info')
        if self.promise_info:
            self.promise_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_info is not None:
            result['user_info'] = self.user_info.to_map()
        if self.order_info is not None:
            result['order_info'] = self.order_info.to_map()
        if self.goods_info is not None:
            result['goods_info'] = self.goods_info.to_map()
        if self.promise_info is not None:
            result['promise_info'] = self.promise_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_info') is not None:
            temp_model = UserSyncInfo()
            self.user_info = temp_model.from_map(m['user_info'])
        if m.get('order_info') is not None:
            temp_model = OrderInfo()
            self.order_info = temp_model.from_map(m['order_info'])
        if m.get('goods_info') is not None:
            temp_model = GoodsInfo()
            self.goods_info = temp_model.from_map(m['goods_info'])
        if m.get('promise_info') is not None:
            temp_model = PromiseInfo()
            self.promise_info = temp_model.from_map(m['promise_info'])
        return self


class SyncAntchainAtoTradeFullResponse(TeaModel):
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
        # 同步成功
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


class AuthAntchainAtoSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sign_no: str = None,
        tag: str = None,
        biz_flow_id: str = None,
        account_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署的电子合同ID
        self.sign_no = sign_no
        # 签署区域的tag，和发起签署流程的机构的tag对应。
        self.tag = tag
        # 电子合同签署服务返回的biz_flow_id
        self.biz_flow_id = biz_flow_id
        # 电子合同签署服务的返回的account_id
        self.account_id = account_id

    def validate(self):
        self.validate_required(self.sign_no, 'sign_no')
        if self.sign_no is not None:
            self.validate_max_length(self.sign_no, 'sign_no', 64)
        if self.tag is not None:
            self.validate_max_length(self.tag, 'tag', 32)
        if self.biz_flow_id is not None:
            self.validate_max_length(self.biz_flow_id, 'biz_flow_id', 64)
        if self.account_id is not None:
            self.validate_max_length(self.account_id, 'account_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.tag is not None:
            result['tag'] = self.tag
        if self.biz_flow_id is not None:
            result['biz_flow_id'] = self.biz_flow_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        if m.get('biz_flow_id') is not None:
            self.biz_flow_id = m.get('biz_flow_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        return self


class AuthAntchainAtoSignFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_field_ids: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署最后落签的签署区域id列表
        self.sign_field_ids = sign_field_ids

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
        if self.sign_field_ids is not None:
            result['sign_field_ids'] = self.sign_field_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_field_ids') is not None:
            self.sign_field_ids = m.get('sign_field_ids')
        return self


class UnbindAntchainAtoWithholdSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class UnbindAntchainAtoWithholdSignResponse(TeaModel):
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


class CancelAntchainAtoWithholdPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        cancel_reason: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当发现跨天继续提交
        self.order_id = order_id
        # 取消原因
        # RENTING_OUT:退租
        # RENTING_AND_RESALE:租转售
        # 
        # 
        self.cancel_reason = cancel_reason

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.cancel_reason, 'cancel_reason')
        if self.cancel_reason is not None:
            self.validate_max_length(self.cancel_reason, 'cancel_reason', 64)

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
        if self.cancel_reason is not None:
            result['cancel_reason'] = self.cancel_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('cancel_reason') is not None:
            self.cancel_reason = m.get('cancel_reason')
        return self


class CancelAntchainAtoWithholdPlanResponse(TeaModel):
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


class RepayAntchainAtoWithholdPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        gmt_pay: str = None,
        pay_off_amount: int = None,
        pay_off_type: str = None,
        pay_off_no: str = None,
        pay_off_bank_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期
        self.period_num = period_num
        # 扣款时间
        self.gmt_pay = gmt_pay
        # 清偿清欠金额，单位为分
        self.pay_off_amount = pay_off_amount
        # 清偿清欠方式
        # WECHAT:微信;
        # BANK:银行
        self.pay_off_type = pay_off_type
        # 清偿清欠单号,通过其他方式清偿的第三方单号;例如银行流水号或微信流水号
        self.pay_off_no = pay_off_no
        # 清偿清欠银行名称,方式为银行时必填
        self.pay_off_bank_name = pay_off_bank_name

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        self.validate_required(self.gmt_pay, 'gmt_pay')
        if self.gmt_pay is not None:
            self.validate_pattern(self.gmt_pay, 'gmt_pay', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.pay_off_amount, 'pay_off_amount')
        if self.pay_off_amount is not None:
            self.validate_minimum(self.pay_off_amount, 'pay_off_amount', 0)
        self.validate_required(self.pay_off_type, 'pay_off_type')
        if self.pay_off_type is not None:
            self.validate_max_length(self.pay_off_type, 'pay_off_type', 64)
        self.validate_required(self.pay_off_no, 'pay_off_no')
        if self.pay_off_no is not None:
            self.validate_max_length(self.pay_off_no, 'pay_off_no', 64)
        if self.pay_off_bank_name is not None:
            self.validate_max_length(self.pay_off_bank_name, 'pay_off_bank_name', 64)

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
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.gmt_pay is not None:
            result['gmt_pay'] = self.gmt_pay
        if self.pay_off_amount is not None:
            result['pay_off_amount'] = self.pay_off_amount
        if self.pay_off_type is not None:
            result['pay_off_type'] = self.pay_off_type
        if self.pay_off_no is not None:
            result['pay_off_no'] = self.pay_off_no
        if self.pay_off_bank_name is not None:
            result['pay_off_bank_name'] = self.pay_off_bank_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('gmt_pay') is not None:
            self.gmt_pay = m.get('gmt_pay')
        if m.get('pay_off_amount') is not None:
            self.pay_off_amount = m.get('pay_off_amount')
        if m.get('pay_off_type') is not None:
            self.pay_off_type = m.get('pay_off_type')
        if m.get('pay_off_no') is not None:
            self.pay_off_no = m.get('pay_off_no')
        if m.get('pay_off_bank_name') is not None:
            self.pay_off_bank_name = m.get('pay_off_bank_name')
        return self


class RepayAntchainAtoWithholdPlanResponse(TeaModel):
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


class RetryAntchainAtoWithholdPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期
        self.period_num = period_num

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)

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
        if self.period_num is not None:
            result['period_num'] = self.period_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        return self


class RetryAntchainAtoWithholdPlanResponse(TeaModel):
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


