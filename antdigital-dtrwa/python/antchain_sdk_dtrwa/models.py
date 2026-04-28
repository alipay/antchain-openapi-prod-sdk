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


class InstitutionContactInfo(TeaModel):
    def __init__(
        self,
        contact_person: str = None,
        contact_email: str = None,
    ):
        # 联系人
        self.contact_person = contact_person
        # 联系人邮箱
        self.contact_email = contact_email

    def validate(self):
        self.validate_required(self.contact_person, 'contact_person')
        self.validate_required(self.contact_email, 'contact_email')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.contact_person is not None:
            result['contact_person'] = self.contact_person
        if self.contact_email is not None:
            result['contact_email'] = self.contact_email
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contact_person') is not None:
            self.contact_person = m.get('contact_person')
        if m.get('contact_email') is not None:
            self.contact_email = m.get('contact_email')
        return self


class KeyProjectInfo(TeaModel):
    def __init__(
        self,
        name: str = None,
        key_type: str = None,
        gmt_created: str = None,
    ):
        # 项目名称
        self.name = name
        # key使用类型
        # MINT：发行密钥
        # BURN：赎回密钥
        # TRANSFER：转账密钥
        # MANAGER：管理密钥
        self.key_type = key_type
        # 创建时间
        self.gmt_created = gmt_created

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.key_type, 'key_type')
        self.validate_required(self.gmt_created, 'gmt_created')
        if self.gmt_created is not None:
            self.validate_pattern(self.gmt_created, 'gmt_created', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.key_type is not None:
            result['key_type'] = self.key_type
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('key_type') is not None:
            self.key_type = m.get('key_type')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        return self


class InstitutionType(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
    ):
        # 机构类型编码
        # ISSUER/PLATFORM/DISTRIBUTOR
        self.code = code
        # 机构类型名称
        # ISSUER/PLATFORM/DISTRIBUTOR
        self.name = name

    def validate(self):
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CrossChainAccountsDetailVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        transaction_hash: str = None,
        pre_balance: str = None,
        transaction_amount: str = None,
        post_balance: str = None,
        transaction_type: str = None,
        counter_address: str = None,
        gmt_created: int = None,
        gmt_modified: int = None,
    ):
        # 明细ID
        self.id = id
        # 交易链上Hash
        self.transaction_hash = transaction_hash
        # 交易前余额
        self.pre_balance = pre_balance
        # 交易数量
        self.transaction_amount = transaction_amount
        # 交易后余额
        self.post_balance = post_balance
        # 交易类别(LOCK_MINT/BURN_RETRIEVE/INNER_TRANSFER/OTC_TRANSFER)
        self.transaction_type = transaction_type
        # 对手地址
        self.counter_address = counter_address
        # 创建时间
        self.gmt_created = gmt_created
        # 更新时间
        self.gmt_modified = gmt_modified

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.transaction_hash is not None:
            result['transaction_hash'] = self.transaction_hash
        if self.pre_balance is not None:
            result['pre_balance'] = self.pre_balance
        if self.transaction_amount is not None:
            result['transaction_amount'] = self.transaction_amount
        if self.post_balance is not None:
            result['post_balance'] = self.post_balance
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        if self.counter_address is not None:
            result['counter_address'] = self.counter_address
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('transaction_hash') is not None:
            self.transaction_hash = m.get('transaction_hash')
        if m.get('pre_balance') is not None:
            self.pre_balance = m.get('pre_balance')
        if m.get('transaction_amount') is not None:
            self.transaction_amount = m.get('transaction_amount')
        if m.get('post_balance') is not None:
            self.post_balance = m.get('post_balance')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        if m.get('counter_address') is not None:
            self.counter_address = m.get('counter_address')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class UserInfo(TeaModel):
    def __init__(
        self,
        address: str = None,
    ):
        # 钱包地址
        self.address = address

    def validate(self):
        self.validate_required(self.address, 'address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.address is not None:
            result['address'] = self.address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        return self


class LoginAccountTypeBO(TeaModel):
    def __init__(
        self,
        user_login_type: str = None,
        login_name: str = None,
    ):
        # 登录类型：EMAIL-邮箱
        self.user_login_type = user_login_type
        # 登录名称
        self.login_name = login_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_login_type is not None:
            result['user_login_type'] = self.user_login_type
        if self.login_name is not None:
            result['login_name'] = self.login_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_login_type') is not None:
            self.user_login_type = m.get('user_login_type')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class CrossChainBonusAccountsDetailVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        transaction_hash: str = None,
        pre_balance: str = None,
        transaction_amount: str = None,
        post_balance: str = None,
        transaction_type: str = None,
        counter_address: str = None,
        gmt_created: int = None,
        gmt_modified: int = None,
    ):
        # 明细ID
        self.id = id
        # 交易链上Hash
        self.transaction_hash = transaction_hash
        # 交易前余额
        self.pre_balance = pre_balance
        # 交易数量
        self.transaction_amount = transaction_amount
        # 交易后余额
        self.post_balance = post_balance
        # 交易类型(LOCK_MINT_BONUS/BURN_RETRIEVE_BONUS/INNER_TRANSFER_BONUS/OTC_TRANSFER_BONUS)
        self.transaction_type = transaction_type
        # 对手地址
        self.counter_address = counter_address
        # 创建时间
        self.gmt_created = gmt_created
        # 更新时间
        self.gmt_modified = gmt_modified

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.transaction_hash is not None:
            result['transaction_hash'] = self.transaction_hash
        if self.pre_balance is not None:
            result['pre_balance'] = self.pre_balance
        if self.transaction_amount is not None:
            result['transaction_amount'] = self.transaction_amount
        if self.post_balance is not None:
            result['post_balance'] = self.post_balance
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        if self.counter_address is not None:
            result['counter_address'] = self.counter_address
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('transaction_hash') is not None:
            self.transaction_hash = m.get('transaction_hash')
        if m.get('pre_balance') is not None:
            self.pre_balance = m.get('pre_balance')
        if m.get('transaction_amount') is not None:
            self.transaction_amount = m.get('transaction_amount')
        if m.get('post_balance') is not None:
            self.post_balance = m.get('post_balance')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        if m.get('counter_address') is not None:
            self.counter_address = m.get('counter_address')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class SubUserAccountDetailsVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        transaction_hash: str = None,
        pre_balance: str = None,
        transaction_amount: str = None,
        post_balance: str = None,
        transaction_type: str = None,
        counter_address: str = None,
        gmt_created: int = None,
        gmt_modified: int = None,
        transaction_status: str = None,
    ):
        # 明细ID
        self.id = id
        # 交易链上Hash
        self.transaction_hash = transaction_hash
        # 交易前余额
        self.pre_balance = pre_balance
        # 交易数量
        self.transaction_amount = transaction_amount
        # 交易后余额
        self.post_balance = post_balance
        # 交易类别
        self.transaction_type = transaction_type
        # 对手地址
        self.counter_address = counter_address
        # 创建时间
        self.gmt_created = gmt_created
        # 更新时间
        self.gmt_modified = gmt_modified
        # 交易状态
        self.transaction_status = transaction_status

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.transaction_hash, 'transaction_hash')
        self.validate_required(self.pre_balance, 'pre_balance')
        self.validate_required(self.transaction_amount, 'transaction_amount')
        self.validate_required(self.post_balance, 'post_balance')
        self.validate_required(self.transaction_type, 'transaction_type')
        self.validate_required(self.counter_address, 'counter_address')
        self.validate_required(self.gmt_created, 'gmt_created')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.transaction_status, 'transaction_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.transaction_hash is not None:
            result['transaction_hash'] = self.transaction_hash
        if self.pre_balance is not None:
            result['pre_balance'] = self.pre_balance
        if self.transaction_amount is not None:
            result['transaction_amount'] = self.transaction_amount
        if self.post_balance is not None:
            result['post_balance'] = self.post_balance
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        if self.counter_address is not None:
            result['counter_address'] = self.counter_address
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.transaction_status is not None:
            result['transaction_status'] = self.transaction_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('transaction_hash') is not None:
            self.transaction_hash = m.get('transaction_hash')
        if m.get('pre_balance') is not None:
            self.pre_balance = m.get('pre_balance')
        if m.get('transaction_amount') is not None:
            self.transaction_amount = m.get('transaction_amount')
        if m.get('post_balance') is not None:
            self.post_balance = m.get('post_balance')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        if m.get('counter_address') is not None:
            self.counter_address = m.get('counter_address')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('transaction_status') is not None:
            self.transaction_status = m.get('transaction_status')
        return self


class MultiCurrencyMoney(TeaModel):
    def __init__(
        self,
        cent: str = None,
        currency: str = None,
        amount: str = None,
    ):
        # 金额，以分为单位
        self.cent = cent
        # 币种编码
        self.currency = currency
        # 金额，以元为单位，保留6位小数
        self.amount = amount

    def validate(self):
        self.validate_required(self.cent, 'cent')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.amount, 'amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cent is not None:
            result['cent'] = self.cent
        if self.currency is not None:
            result['currency'] = self.currency
        if self.amount is not None:
            result['amount'] = self.amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cent') is not None:
            self.cent = m.get('cent')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        return self


class SubUserBonusAccountDetailVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        transaction_hash: str = None,
        pre_balance: str = None,
        transaction_amount: str = None,
        post_balance: str = None,
        transaction_type: str = None,
        counter_address: str = None,
        gmt_created: int = None,
        gmt_modified: int = None,
        transaction_status: str = None,
    ):
        # 明细ID
        self.id = id
        # 交易链上Hash
        self.transaction_hash = transaction_hash
        # 交易前余额
        self.pre_balance = pre_balance
        # 交易数量
        self.transaction_amount = transaction_amount
        # 交易后余额
        self.post_balance = post_balance
        # 交易类别（REPAY/TRANSFER/LOCK/UNLOCK/WITHDRAW/OTC_TRANSFER/TRANSFER_TO_VIRTUAL/WITHDRAW_FROM_VIRTUAL）
        self.transaction_type = transaction_type
        # 对手地址
        self.counter_address = counter_address
        # 创建时间
        self.gmt_created = gmt_created
        # 更新时间
        self.gmt_modified = gmt_modified
        # 交易状态（PENDING/CONFIRMED/INVALID）
        self.transaction_status = transaction_status

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.transaction_hash, 'transaction_hash')
        self.validate_required(self.pre_balance, 'pre_balance')
        self.validate_required(self.transaction_amount, 'transaction_amount')
        self.validate_required(self.post_balance, 'post_balance')
        self.validate_required(self.transaction_type, 'transaction_type')
        self.validate_required(self.counter_address, 'counter_address')
        self.validate_required(self.gmt_created, 'gmt_created')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.transaction_status, 'transaction_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.transaction_hash is not None:
            result['transaction_hash'] = self.transaction_hash
        if self.pre_balance is not None:
            result['pre_balance'] = self.pre_balance
        if self.transaction_amount is not None:
            result['transaction_amount'] = self.transaction_amount
        if self.post_balance is not None:
            result['post_balance'] = self.post_balance
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        if self.counter_address is not None:
            result['counter_address'] = self.counter_address
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.transaction_status is not None:
            result['transaction_status'] = self.transaction_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('transaction_hash') is not None:
            self.transaction_hash = m.get('transaction_hash')
        if m.get('pre_balance') is not None:
            self.pre_balance = m.get('pre_balance')
        if m.get('transaction_amount') is not None:
            self.transaction_amount = m.get('transaction_amount')
        if m.get('post_balance') is not None:
            self.post_balance = m.get('post_balance')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        if m.get('counter_address') is not None:
            self.counter_address = m.get('counter_address')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('transaction_status') is not None:
            self.transaction_status = m.get('transaction_status')
        return self


class NetValueInfo(TeaModel):
    def __init__(
        self,
        net_value: str = None,
        currency: str = None,
        update_time: int = None,
    ):
        # 净值
        self.net_value = net_value
        # 币种（目前支持USD、HKD）
        self.currency = currency
        # 更新时间戳
        self.update_time = update_time

    def validate(self):
        self.validate_required(self.net_value, 'net_value')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.update_time, 'update_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.net_value is not None:
            result['net_value'] = self.net_value
        if self.currency is not None:
            result['currency'] = self.currency
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('net_value') is not None:
            self.net_value = m.get('net_value')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class KeyVO(TeaModel):
    def __init__(
        self,
        key_id: str = None,
        name: str = None,
        type: str = None,
        address: str = None,
        quantity: str = None,
        gmt_created: str = None,
        delete_enable: bool = None,
        asset_project_info: KeyProjectInfo = None,
    ):
        # 密钥id
        self.key_id = key_id
        # 密钥名称
        self.name = name
        # 创建类型
        # KEY_FILE：上传密钥文件
        # CREATE_NEW_KEY：系统创建密钥
        self.type = type
        # 钱包地址
        self.address = address
        # 关联项目数量
        self.quantity = quantity
        # 创建时间
        self.gmt_created = gmt_created
        # 是否支持删除
        self.delete_enable = delete_enable
        # 资产项目信息
        self.asset_project_info = asset_project_info

    def validate(self):
        self.validate_required(self.key_id, 'key_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.address, 'address')
        self.validate_required(self.quantity, 'quantity')
        self.validate_required(self.gmt_created, 'gmt_created')
        if self.gmt_created is not None:
            self.validate_pattern(self.gmt_created, 'gmt_created', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.delete_enable, 'delete_enable')
        self.validate_required(self.asset_project_info, 'asset_project_info')
        if self.asset_project_info:
            self.asset_project_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key_id is not None:
            result['key_id'] = self.key_id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.address is not None:
            result['address'] = self.address
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.delete_enable is not None:
            result['delete_enable'] = self.delete_enable
        if self.asset_project_info is not None:
            result['asset_project_info'] = self.asset_project_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('delete_enable') is not None:
            self.delete_enable = m.get('delete_enable')
        if m.get('asset_project_info') is not None:
            temp_model = KeyProjectInfo()
            self.asset_project_info = temp_model.from_map(m['asset_project_info'])
        return self


class InstitutionVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        about: str = None,
        home_page: str = None,
        contacts: List[InstitutionContactInfo] = None,
        types: List[InstitutionType] = None,
        users: List[UserInfo] = None,
        delete_enable: bool = None,
    ):
        # 机构id
        self.id = id
        # 机构名称
        self.name = name
        # 简介
        self.about = about
        # 主页
        self.home_page = home_page
        # 联系人信息
        self.contacts = contacts
        # 机构类型
        self.types = types
        # 机构用户信息
        self.users = users
        # 是否支持删除
        self.delete_enable = delete_enable

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        if self.contacts:
            for k in self.contacts:
                if k:
                    k.validate()
        self.validate_required(self.types, 'types')
        if self.types:
            for k in self.types:
                if k:
                    k.validate()
        if self.users:
            for k in self.users:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.about is not None:
            result['about'] = self.about
        if self.home_page is not None:
            result['home_page'] = self.home_page
        result['contacts'] = []
        if self.contacts is not None:
            for k in self.contacts:
                result['contacts'].append(k.to_map() if k else None)
        result['types'] = []
        if self.types is not None:
            for k in self.types:
                result['types'].append(k.to_map() if k else None)
        result['users'] = []
        if self.users is not None:
            for k in self.users:
                result['users'].append(k.to_map() if k else None)
        if self.delete_enable is not None:
            result['delete_enable'] = self.delete_enable
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('about') is not None:
            self.about = m.get('about')
        if m.get('home_page') is not None:
            self.home_page = m.get('home_page')
        self.contacts = []
        if m.get('contacts') is not None:
            for k in m.get('contacts'):
                temp_model = InstitutionContactInfo()
                self.contacts.append(temp_model.from_map(k))
        self.types = []
        if m.get('types') is not None:
            for k in m.get('types'):
                temp_model = InstitutionType()
                self.types.append(temp_model.from_map(k))
        self.users = []
        if m.get('users') is not None:
            for k in m.get('users'):
                temp_model = UserInfo()
                self.users.append(temp_model.from_map(k))
        if m.get('delete_enable') is not None:
            self.delete_enable = m.get('delete_enable')
        return self


class AssetProjectKey(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        project_name: str = None,
        key_type: str = None,
        key_id: str = None,
        key_name: str = None,
        key_address: str = None,
        correlation_time: int = None,
    ):
        # 项目ID
        self.project_id = project_id
        # 项目名称
        self.project_name = project_name
        # 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
        self.key_type = key_type
        # 密钥ID
        self.key_id = key_id
        # 密钥名称
        self.key_name = key_name
        # 密钥地址
        self.key_address = key_address
        # 关联时间戳
        self.correlation_time = correlation_time

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_name, 'project_name')
        self.validate_required(self.key_type, 'key_type')
        self.validate_required(self.key_id, 'key_id')
        self.validate_required(self.key_name, 'key_name')
        self.validate_required(self.key_address, 'key_address')
        self.validate_required(self.correlation_time, 'correlation_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.key_type is not None:
            result['key_type'] = self.key_type
        if self.key_id is not None:
            result['key_id'] = self.key_id
        if self.key_name is not None:
            result['key_name'] = self.key_name
        if self.key_address is not None:
            result['key_address'] = self.key_address
        if self.correlation_time is not None:
            result['correlation_time'] = self.correlation_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('key_type') is not None:
            self.key_type = m.get('key_type')
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        if m.get('key_name') is not None:
            self.key_name = m.get('key_name')
        if m.get('key_address') is not None:
            self.key_address = m.get('key_address')
        if m.get('correlation_time') is not None:
            self.correlation_time = m.get('correlation_time')
        return self


class SubUserVirtualAccountDetailVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        pre_balance: str = None,
        transaction_amount: str = None,
        post_balance: str = None,
        transaction_type: str = None,
        gmt_created: int = None,
        gmt_modified: int = None,
        transaction_status: str = None,
    ):
        # 明细ID
        self.id = id
        # 交易前余额
        self.pre_balance = pre_balance
        # 交易数量
        self.transaction_amount = transaction_amount
        # 交易后余额
        self.post_balance = post_balance
        # 交易类型(TRANSFER_IN、TRANSFER_OUT)
        self.transaction_type = transaction_type
        # 创建时间
        self.gmt_created = gmt_created
        # 更新时间
        self.gmt_modified = gmt_modified
        # 交易状态（PENDING/CONFIRMED/INVALID）
        self.transaction_status = transaction_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.pre_balance is not None:
            result['pre_balance'] = self.pre_balance
        if self.transaction_amount is not None:
            result['transaction_amount'] = self.transaction_amount
        if self.post_balance is not None:
            result['post_balance'] = self.post_balance
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.transaction_status is not None:
            result['transaction_status'] = self.transaction_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('pre_balance') is not None:
            self.pre_balance = m.get('pre_balance')
        if m.get('transaction_amount') is not None:
            self.transaction_amount = m.get('transaction_amount')
        if m.get('post_balance') is not None:
            self.post_balance = m.get('post_balance')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('transaction_status') is not None:
            self.transaction_status = m.get('transaction_status')
        return self


class SubUserBonusVirtualAccountDetailVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        pre_balance: str = None,
        transaction_amount: str = None,
        post_balance: str = None,
        transaction_type: str = None,
        gmt_created: int = None,
        gmt_modified: int = None,
        transaction_status: str = None,
    ):
        # 明细ID
        self.id = id
        # 交易前余额
        self.pre_balance = pre_balance
        # 交易数量
        self.transaction_amount = transaction_amount
        # 交易后余额
        self.post_balance = post_balance
        # 交易类型(TRANSFER_IN、TRANSFER_OUT)
        self.transaction_type = transaction_type
        # 创建时间
        self.gmt_created = gmt_created
        # 更新时间
        self.gmt_modified = gmt_modified
        # 交易状态（PENDING/CONFIRMED/INVALID）
        self.transaction_status = transaction_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.pre_balance is not None:
            result['pre_balance'] = self.pre_balance
        if self.transaction_amount is not None:
            result['transaction_amount'] = self.transaction_amount
        if self.post_balance is not None:
            result['post_balance'] = self.post_balance
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.transaction_status is not None:
            result['transaction_status'] = self.transaction_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('pre_balance') is not None:
            self.pre_balance = m.get('pre_balance')
        if m.get('transaction_amount') is not None:
            self.transaction_amount = m.get('transaction_amount')
        if m.get('post_balance') is not None:
            self.post_balance = m.get('post_balance')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('transaction_status') is not None:
            self.transaction_status = m.get('transaction_status')
        return self


class SubUserAccountVO(TeaModel):
    def __init__(
        self,
        user_account_id: str = None,
        user_id: str = None,
        user_address: str = None,
        user_target: str = None,
        user_balance: str = None,
        asset_project_id: str = None,
        asset_project_name: str = None,
        institution_id: str = None,
        institution_name: str = None,
    ):
        # 用户账户id
        self.user_account_id = user_account_id
        # 用户id
        self.user_id = user_id
        # 用户地址
        self.user_address = user_address
        # 用户资产配额
        self.user_target = user_target
        # 用户资产
        self.user_balance = user_balance
        # 项目id
        self.asset_project_id = asset_project_id
        # 项目名称
        self.asset_project_name = asset_project_name
        # 用户所属机构id
        self.institution_id = institution_id
        # 用户所属机构名称
        self.institution_name = institution_name

    def validate(self):
        self.validate_required(self.user_account_id, 'user_account_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_address, 'user_address')
        self.validate_required(self.user_target, 'user_target')
        self.validate_required(self.user_balance, 'user_balance')
        self.validate_required(self.asset_project_id, 'asset_project_id')
        self.validate_required(self.asset_project_name, 'asset_project_name')
        self.validate_required(self.institution_id, 'institution_id')
        self.validate_required(self.institution_name, 'institution_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_account_id is not None:
            result['user_account_id'] = self.user_account_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.user_target is not None:
            result['user_target'] = self.user_target
        if self.user_balance is not None:
            result['user_balance'] = self.user_balance
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_name is not None:
            result['asset_project_name'] = self.asset_project_name
        if self.institution_id is not None:
            result['institution_id'] = self.institution_id
        if self.institution_name is not None:
            result['institution_name'] = self.institution_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_account_id') is not None:
            self.user_account_id = m.get('user_account_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('user_target') is not None:
            self.user_target = m.get('user_target')
        if m.get('user_balance') is not None:
            self.user_balance = m.get('user_balance')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_name') is not None:
            self.asset_project_name = m.get('asset_project_name')
        if m.get('institution_id') is not None:
            self.institution_id = m.get('institution_id')
        if m.get('institution_name') is not None:
            self.institution_name = m.get('institution_name')
        return self


class SubUserVirtualAccountInfoBO(TeaModel):
    def __init__(
        self,
        sub_user_virtual_account_id: str = None,
        virtual_account_user_id: str = None,
        email: str = None,
        alias: str = None,
    ):
        # 虚拟子账户ID
        self.sub_user_virtual_account_id = sub_user_virtual_account_id
        # 虚拟子账号对应用户ID
        self.virtual_account_user_id = virtual_account_user_id
        # 虚拟子账户邮箱
        self.email = email
        # 别名
        self.alias = alias

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_user_virtual_account_id is not None:
            result['sub_user_virtual_account_id'] = self.sub_user_virtual_account_id
        if self.virtual_account_user_id is not None:
            result['virtual_account_user_id'] = self.virtual_account_user_id
        if self.email is not None:
            result['email'] = self.email
        if self.alias is not None:
            result['alias'] = self.alias
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_user_virtual_account_id') is not None:
            self.sub_user_virtual_account_id = m.get('sub_user_virtual_account_id')
        if m.get('virtual_account_user_id') is not None:
            self.virtual_account_user_id = m.get('virtual_account_user_id')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        return self


class KeyInfo(TeaModel):
    def __init__(
        self,
        key_id: str = None,
        key_name: str = None,
        key_address: str = None,
        key_type: str = None,
    ):
        # 密钥ID
        self.key_id = key_id
        # 密钥名称
        self.key_name = key_name
        # 密钥地址
        self.key_address = key_address
        # 密钥类型(MINT：发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
        self.key_type = key_type

    def validate(self):
        self.validate_required(self.key_id, 'key_id')
        self.validate_required(self.key_name, 'key_name')
        self.validate_required(self.key_address, 'key_address')
        self.validate_required(self.key_type, 'key_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key_id is not None:
            result['key_id'] = self.key_id
        if self.key_name is not None:
            result['key_name'] = self.key_name
        if self.key_address is not None:
            result['key_address'] = self.key_address
        if self.key_type is not None:
            result['key_type'] = self.key_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        if m.get('key_name') is not None:
            self.key_name = m.get('key_name')
        if m.get('key_address') is not None:
            self.key_address = m.get('key_address')
        if m.get('key_type') is not None:
            self.key_type = m.get('key_type')
        return self


class ParticipantInfo(TeaModel):
    def __init__(
        self,
        id: str = None,
        type: str = None,
        name: str = None,
    ):
        # 机构id
        self.id = id
        # 二级机构类型
        self.type = type
        # 机构名称
        self.name = name

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CrossChainAccountsVO(TeaModel):
    def __init__(
        self,
        target_user_address: str = None,
        cross_chain_user_account_id: str = None,
        cross_chain_user_bonus_account_id: str = None,
        cross_chain_user_accounts_details: List[CrossChainAccountsDetailVO] = None,
        cross_chain_bonus_accounts_details: List[CrossChainBonusAccountsDetailVO] = None,
    ):
        # 对侧链用户地址
        self.target_user_address = target_user_address
        # 对侧链账户ID
        self.cross_chain_user_account_id = cross_chain_user_account_id
        # 对侧链红利账户ID
        self.cross_chain_user_bonus_account_id = cross_chain_user_bonus_account_id
        # 对侧链资产账户明细
        self.cross_chain_user_accounts_details = cross_chain_user_accounts_details
        # 对侧链账户信息
        self.cross_chain_bonus_accounts_details = cross_chain_bonus_accounts_details

    def validate(self):
        if self.cross_chain_user_accounts_details:
            for k in self.cross_chain_user_accounts_details:
                if k:
                    k.validate()
        if self.cross_chain_bonus_accounts_details:
            for k in self.cross_chain_bonus_accounts_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.target_user_address is not None:
            result['target_user_address'] = self.target_user_address
        if self.cross_chain_user_account_id is not None:
            result['cross_chain_user_account_id'] = self.cross_chain_user_account_id
        if self.cross_chain_user_bonus_account_id is not None:
            result['cross_chain_user_bonus_account_id'] = self.cross_chain_user_bonus_account_id
        result['cross_chain_user_accounts_details'] = []
        if self.cross_chain_user_accounts_details is not None:
            for k in self.cross_chain_user_accounts_details:
                result['cross_chain_user_accounts_details'].append(k.to_map() if k else None)
        result['cross_chain_bonus_accounts_details'] = []
        if self.cross_chain_bonus_accounts_details is not None:
            for k in self.cross_chain_bonus_accounts_details:
                result['cross_chain_bonus_accounts_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('target_user_address') is not None:
            self.target_user_address = m.get('target_user_address')
        if m.get('cross_chain_user_account_id') is not None:
            self.cross_chain_user_account_id = m.get('cross_chain_user_account_id')
        if m.get('cross_chain_user_bonus_account_id') is not None:
            self.cross_chain_user_bonus_account_id = m.get('cross_chain_user_bonus_account_id')
        self.cross_chain_user_accounts_details = []
        if m.get('cross_chain_user_accounts_details') is not None:
            for k in m.get('cross_chain_user_accounts_details'):
                temp_model = CrossChainAccountsDetailVO()
                self.cross_chain_user_accounts_details.append(temp_model.from_map(k))
        self.cross_chain_bonus_accounts_details = []
        if m.get('cross_chain_bonus_accounts_details') is not None:
            for k in m.get('cross_chain_bonus_accounts_details'):
                temp_model = CrossChainBonusAccountsDetailVO()
                self.cross_chain_bonus_accounts_details.append(temp_model.from_map(k))
        return self


class AssetProject(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        name: str = None,
        token_name: str = None,
        info: str = None,
        supply: str = None,
        capacity: str = None,
        radio: int = None,
        user_number: int = None,
        asset_token_address: str = None,
        rule_engine_address: str = None,
        member_list_rule_address: str = None,
        status: str = None,
        net_value: str = None,
        currency: str = None,
        gmt_created: int = None,
        gmt_modified: int = None,
    ):
        # 项目ID
        self.project_id = project_id
        # 项目名称
        self.name = name
        # 项目代币名称
        self.token_name = token_name
        # 项目介绍
        self.info = info
        # 当前供应量
        self.supply = supply
        # 最大供应量
        self.capacity = capacity
        # 供应量比例(supply/capacity * 100，保留2位小数)
        self.radio = radio
        # 持有人数量
        self.user_number = user_number
        # 资产token合约地址
        self.asset_token_address = asset_token_address
        # 资产规则引擎合约地址
        self.rule_engine_address = rule_engine_address
        # 资产白名单合约地址
        self.member_list_rule_address = member_list_rule_address
        # 项目状态(ACTIVE：激活；PAUSED：暂停)
        self.status = status
        # 项目净值
        self.net_value = net_value
        # 项目币种(目前支持USD、HKD)
        self.currency = currency
        # 项目创建时间戳
        self.gmt_created = gmt_created
        # 项目修改时间戳
        self.gmt_modified = gmt_modified

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.token_name, 'token_name')
        self.validate_required(self.info, 'info')
        self.validate_required(self.supply, 'supply')
        self.validate_required(self.capacity, 'capacity')
        self.validate_required(self.radio, 'radio')
        self.validate_required(self.user_number, 'user_number')
        self.validate_required(self.asset_token_address, 'asset_token_address')
        self.validate_required(self.rule_engine_address, 'rule_engine_address')
        self.validate_required(self.member_list_rule_address, 'member_list_rule_address')
        self.validate_required(self.status, 'status')
        self.validate_required(self.net_value, 'net_value')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.gmt_created, 'gmt_created')
        self.validate_required(self.gmt_modified, 'gmt_modified')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.name is not None:
            result['name'] = self.name
        if self.token_name is not None:
            result['token_name'] = self.token_name
        if self.info is not None:
            result['info'] = self.info
        if self.supply is not None:
            result['supply'] = self.supply
        if self.capacity is not None:
            result['capacity'] = self.capacity
        if self.radio is not None:
            result['radio'] = self.radio
        if self.user_number is not None:
            result['user_number'] = self.user_number
        if self.asset_token_address is not None:
            result['asset_token_address'] = self.asset_token_address
        if self.rule_engine_address is not None:
            result['rule_engine_address'] = self.rule_engine_address
        if self.member_list_rule_address is not None:
            result['member_list_rule_address'] = self.member_list_rule_address
        if self.status is not None:
            result['status'] = self.status
        if self.net_value is not None:
            result['net_value'] = self.net_value
        if self.currency is not None:
            result['currency'] = self.currency
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('token_name') is not None:
            self.token_name = m.get('token_name')
        if m.get('info') is not None:
            self.info = m.get('info')
        if m.get('supply') is not None:
            self.supply = m.get('supply')
        if m.get('capacity') is not None:
            self.capacity = m.get('capacity')
        if m.get('radio') is not None:
            self.radio = m.get('radio')
        if m.get('user_number') is not None:
            self.user_number = m.get('user_number')
        if m.get('asset_token_address') is not None:
            self.asset_token_address = m.get('asset_token_address')
        if m.get('rule_engine_address') is not None:
            self.rule_engine_address = m.get('rule_engine_address')
        if m.get('member_list_rule_address') is not None:
            self.member_list_rule_address = m.get('member_list_rule_address')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('net_value') is not None:
            self.net_value = m.get('net_value')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class CrossChainSubUserAccountInfoBO(TeaModel):
    def __init__(
        self,
        cross_chain_user_account_id: str = None,
        target_user_address: str = None,
        target_chain_name: str = None,
    ):
        # 跨链账号Id
        self.cross_chain_user_account_id = cross_chain_user_account_id
        # 跨链账号地址
        self.target_user_address = target_user_address
        # 目标链所在链
        self.target_chain_name = target_chain_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cross_chain_user_account_id is not None:
            result['cross_chain_user_account_id'] = self.cross_chain_user_account_id
        if self.target_user_address is not None:
            result['target_user_address'] = self.target_user_address
        if self.target_chain_name is not None:
            result['target_chain_name'] = self.target_chain_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cross_chain_user_account_id') is not None:
            self.cross_chain_user_account_id = m.get('cross_chain_user_account_id')
        if m.get('target_user_address') is not None:
            self.target_user_address = m.get('target_user_address')
        if m.get('target_chain_name') is not None:
            self.target_chain_name = m.get('target_chain_name')
        return self


class UserOperatorInfoBO(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        alias: str = None,
        address: str = None,
        user_login_account_list: List[LoginAccountTypeBO] = None,
        user_institution_type_list: List[str] = None,
    ):
        # userId
        self.user_id = user_id
        # 别名
        self.alias = alias
        # 钱包地址
        self.address = address
        # 登录账号类型列表
        self.user_login_account_list = user_login_account_list
        # 机构类型列表
        self.user_institution_type_list = user_institution_type_list

    def validate(self):
        if self.user_login_account_list:
            for k in self.user_login_account_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.alias is not None:
            result['alias'] = self.alias
        if self.address is not None:
            result['address'] = self.address
        result['user_login_account_list'] = []
        if self.user_login_account_list is not None:
            for k in self.user_login_account_list:
                result['user_login_account_list'].append(k.to_map() if k else None)
        if self.user_institution_type_list is not None:
            result['user_institution_type_list'] = self.user_institution_type_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('address') is not None:
            self.address = m.get('address')
        self.user_login_account_list = []
        if m.get('user_login_account_list') is not None:
            for k in m.get('user_login_account_list'):
                temp_model = LoginAccountTypeBO()
                self.user_login_account_list.append(temp_model.from_map(k))
        if m.get('user_institution_type_list') is not None:
            self.user_institution_type_list = m.get('user_institution_type_list')
        return self


class ReportInfo(TeaModel):
    def __init__(
        self,
        report_id: str = None,
        report_name: str = None,
        file_id: str = None,
        gmt_created: int = None,
    ):
        # 项目报告ID
        self.report_id = report_id
        # 项目报告名
        self.report_name = report_name
        # 报告文件ID
        self.file_id = file_id
        # 项目报告创建时间戳
        self.gmt_created = gmt_created

    def validate(self):
        self.validate_required(self.report_id, 'report_id')
        self.validate_required(self.report_name, 'report_name')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.gmt_created, 'gmt_created')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.report_id is not None:
            result['report_id'] = self.report_id
        if self.report_name is not None:
            result['report_name'] = self.report_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('report_id') is not None:
            self.report_id = m.get('report_id')
        if m.get('report_name') is not None:
            self.report_name = m.get('report_name')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        return self


class ErrorMessage(TeaModel):
    def __init__(
        self,
        displayed_code: str = None,
        displayed_message: str = None,
    ):
        # 错误码
        self.displayed_code = displayed_code
        # 错误描述
        self.displayed_message = displayed_message

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.displayed_code is not None:
            result['displayed_code'] = self.displayed_code
        if self.displayed_message is not None:
            result['displayed_message'] = self.displayed_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('displayed_code') is not None:
            self.displayed_code = m.get('displayed_code')
        if m.get('displayed_message') is not None:
            self.displayed_message = m.get('displayed_message')
        return self


class ProjectResource(TeaModel):
    def __init__(
        self,
        id: str = None,
        project_id: str = None,
        resource_type: str = None,
        resource_name: str = None,
        file_id: str = None,
        gmt_created: int = None,
    ):
        # 资源ID
        self.id = id
        # 项目ID
        self.project_id = project_id
        # 资源类型（目前只有PROJECT_REPORT）
        self.resource_type = resource_type
        # 资源名称
        self.resource_name = resource_name
        # 文件ID
        self.file_id = file_id
        # 创建时间戳
        self.gmt_created = gmt_created

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.resource_type, 'resource_type')
        self.validate_required(self.resource_name, 'resource_name')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.gmt_created, 'gmt_created')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        if self.resource_name is not None:
            result['resource_name'] = self.resource_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        if m.get('resource_name') is not None:
            self.resource_name = m.get('resource_name')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        return self


class OperationLogVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        gmt_created: int = None,
        gmt_modified: int = None,
        user_id: str = None,
        user_address: str = None,
        request_url: str = None,
        api_desc: str = None,
        ch_desc: str = None,
        device_info: str = None,
        device_hash: str = None,
        operation_type: str = None,
        request_input: str = None,
        request_output: str = None,
        success: bool = None,
        request_from: str = None,
        ip: str = None,
        ext_info: str = None,
        login_account_type: str = None,
        login_account: str = None,
    ):
        # ID主键
        self.id = id
        # 创建时间戳（毫秒）
        self.gmt_created = gmt_created
        # 更新时间戳（毫秒）
        self.gmt_modified = gmt_modified
        # 用户id
        self.user_id = user_id
        # 用户地址
        self.user_address = user_address
        # 发起操作的URL接口
        self.request_url = request_url
        # 发起操作的URL接口描述code值
        self.api_desc = api_desc
        # 发起操作的URL接口中文描述
        self.ch_desc = ch_desc
        # 设备信息
        self.device_info = device_info
        # 设备Hash
        self.device_hash = device_hash
        # 操作种类
        self.operation_type = operation_type
        # 请求输入
        self.request_input = request_input
        # 请求输出
        self.request_output = request_output
        # 操作状态：true/false
        self.success = success
        # 操作来源
        self.request_from = request_from
        # 发起IP地址
        self.ip = ip
        # 扩展字段
        self.ext_info = ext_info
        # 登录名类型(EMAIL)
        self.login_account_type = login_account_type
        # 登录名
        self.login_account = login_account

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.request_url is not None:
            result['request_url'] = self.request_url
        if self.api_desc is not None:
            result['api_desc'] = self.api_desc
        if self.ch_desc is not None:
            result['ch_desc'] = self.ch_desc
        if self.device_info is not None:
            result['device_info'] = self.device_info
        if self.device_hash is not None:
            result['device_hash'] = self.device_hash
        if self.operation_type is not None:
            result['operation_type'] = self.operation_type
        if self.request_input is not None:
            result['request_input'] = self.request_input
        if self.request_output is not None:
            result['request_output'] = self.request_output
        if self.success is not None:
            result['success'] = self.success
        if self.request_from is not None:
            result['request_from'] = self.request_from
        if self.ip is not None:
            result['ip'] = self.ip
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.login_account_type is not None:
            result['login_account_type'] = self.login_account_type
        if self.login_account is not None:
            result['login_account'] = self.login_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('request_url') is not None:
            self.request_url = m.get('request_url')
        if m.get('api_desc') is not None:
            self.api_desc = m.get('api_desc')
        if m.get('ch_desc') is not None:
            self.ch_desc = m.get('ch_desc')
        if m.get('device_info') is not None:
            self.device_info = m.get('device_info')
        if m.get('device_hash') is not None:
            self.device_hash = m.get('device_hash')
        if m.get('operation_type') is not None:
            self.operation_type = m.get('operation_type')
        if m.get('request_input') is not None:
            self.request_input = m.get('request_input')
        if m.get('request_output') is not None:
            self.request_output = m.get('request_output')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('request_from') is not None:
            self.request_from = m.get('request_from')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('login_account_type') is not None:
            self.login_account_type = m.get('login_account_type')
        if m.get('login_account') is not None:
            self.login_account = m.get('login_account')
        return self


class SubUserAccountBaseVO(TeaModel):
    def __init__(
        self,
        sub_user_account_id: str = None,
        user_address: str = None,
        contact: str = None,
        alias: str = None,
        asset_project_id: str = None,
        chain_name: str = None,
        sub_user_virtual_accounts_info: List[SubUserVirtualAccountInfoBO] = None,
        cross_chain_sub_user_accounts_info: List[CrossChainSubUserAccountInfoBO] = None,
    ):
        # 二级用户ID
        self.sub_user_account_id = sub_user_account_id
        # 用户地址
        self.user_address = user_address
        # 用户邮箱
        self.contact = contact
        # 用户昵称
        self.alias = alias
        # 项目ID
        self.asset_project_id = asset_project_id
        # 链名称
        self.chain_name = chain_name
        # 虚拟子账号信息
        self.sub_user_virtual_accounts_info = sub_user_virtual_accounts_info
        # 跨链账号信息
        self.cross_chain_sub_user_accounts_info = cross_chain_sub_user_accounts_info

    def validate(self):
        self.validate_required(self.sub_user_account_id, 'sub_user_account_id')
        self.validate_required(self.asset_project_id, 'asset_project_id')
        self.validate_required(self.chain_name, 'chain_name')
        if self.sub_user_virtual_accounts_info:
            for k in self.sub_user_virtual_accounts_info:
                if k:
                    k.validate()
        if self.cross_chain_sub_user_accounts_info:
            for k in self.cross_chain_sub_user_accounts_info:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_user_account_id is not None:
            result['sub_user_account_id'] = self.sub_user_account_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.contact is not None:
            result['contact'] = self.contact
        if self.alias is not None:
            result['alias'] = self.alias
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        result['sub_user_virtual_accounts_info'] = []
        if self.sub_user_virtual_accounts_info is not None:
            for k in self.sub_user_virtual_accounts_info:
                result['sub_user_virtual_accounts_info'].append(k.to_map() if k else None)
        result['cross_chain_sub_user_accounts_info'] = []
        if self.cross_chain_sub_user_accounts_info is not None:
            for k in self.cross_chain_sub_user_accounts_info:
                result['cross_chain_sub_user_accounts_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_user_account_id') is not None:
            self.sub_user_account_id = m.get('sub_user_account_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('contact') is not None:
            self.contact = m.get('contact')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        self.sub_user_virtual_accounts_info = []
        if m.get('sub_user_virtual_accounts_info') is not None:
            for k in m.get('sub_user_virtual_accounts_info'):
                temp_model = SubUserVirtualAccountInfoBO()
                self.sub_user_virtual_accounts_info.append(temp_model.from_map(k))
        self.cross_chain_sub_user_accounts_info = []
        if m.get('cross_chain_sub_user_accounts_info') is not None:
            for k in m.get('cross_chain_sub_user_accounts_info'):
                temp_model = CrossChainSubUserAccountInfoBO()
                self.cross_chain_sub_user_accounts_info.append(temp_model.from_map(k))
        return self


class InstitutionPageData(TeaModel):
    def __init__(
        self,
        total: int = None,
        page_count: int = None,
        page_num: int = None,
        page_size: int = None,
        records: List[InstitutionVO] = None,
    ):
        # 总记录
        self.total = total
        # 总页数
        self.page_count = page_count
        # 当前页码
        self.page_num = page_num
        # 每页数量
        self.page_size = page_size
        # 机构列表
        self.records = records

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.page_count, 'page_count')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.records, 'records')
        if self.records:
            for k in self.records:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.page_count is not None:
            result['page_count'] = self.page_count
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['records'] = []
        if self.records is not None:
            for k in self.records:
                result['records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_count') is not None:
            self.page_count = m.get('page_count')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.records = []
        if m.get('records') is not None:
            for k in m.get('records'):
                temp_model = InstitutionVO()
                self.records.append(temp_model.from_map(k))
        return self


class DataSummaryStatisticsItem(TeaModel):
    def __init__(
        self,
        date: str = None,
        total_value_list: List[MultiCurrencyMoney] = None,
    ):
        # 日期
        self.date = date
        # 原始币种资产价值
        self.total_value_list = total_value_list

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.total_value_list, 'total_value_list')
        if self.total_value_list:
            for k in self.total_value_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.date is not None:
            result['date'] = self.date
        result['total_value_list'] = []
        if self.total_value_list is not None:
            for k in self.total_value_list:
                result['total_value_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('date') is not None:
            self.date = m.get('date')
        self.total_value_list = []
        if m.get('total_value_list') is not None:
            for k in m.get('total_value_list'):
                temp_model = MultiCurrencyMoney()
                self.total_value_list.append(temp_model.from_map(k))
        return self


class SubUserAccountCeilingBaseVO(TeaModel):
    def __init__(
        self,
        asset_project_id: str = None,
        token_name: str = None,
        token_address: str = None,
        user_id: str = None,
        user_address: str = None,
        login_name: str = None,
        login_type: str = None,
        alias: str = None,
        real_shares: str = None,
        bonus_token_name: str = None,
        bonus_token_address: str = None,
        real_bonus: str = None,
        locked_amount: str = None,
        virtual_account_balance: str = None,
    ):
        # 项目ID
        self.asset_project_id = asset_project_id
        # 代币名称
        self.token_name = token_name
        # 代币合约地址
        self.token_address = token_address
        # 用户ID
        self.user_id = user_id
        # 用户地址
        self.user_address = user_address
        # 登录名
        self.login_name = login_name
        # 登录类型
        self.login_type = login_type
        # 别名
        self.alias = alias
        # 实际持有份额
        self.real_shares = real_shares
        # 代币名称
        self.bonus_token_name = bonus_token_name
        # 代币合约名称
        self.bonus_token_address = bonus_token_address
        # 红利份额
        self.real_bonus = real_bonus
        # 锁定金额
        self.locked_amount = locked_amount
        # 虚拟子账户余额
        self.virtual_account_balance = virtual_account_balance

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.token_name is not None:
            result['token_name'] = self.token_name
        if self.token_address is not None:
            result['token_address'] = self.token_address
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.login_type is not None:
            result['login_type'] = self.login_type
        if self.alias is not None:
            result['alias'] = self.alias
        if self.real_shares is not None:
            result['real_shares'] = self.real_shares
        if self.bonus_token_name is not None:
            result['bonus_token_name'] = self.bonus_token_name
        if self.bonus_token_address is not None:
            result['bonus_token_address'] = self.bonus_token_address
        if self.real_bonus is not None:
            result['real_bonus'] = self.real_bonus
        if self.locked_amount is not None:
            result['locked_amount'] = self.locked_amount
        if self.virtual_account_balance is not None:
            result['virtual_account_balance'] = self.virtual_account_balance
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('token_name') is not None:
            self.token_name = m.get('token_name')
        if m.get('token_address') is not None:
            self.token_address = m.get('token_address')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('login_type') is not None:
            self.login_type = m.get('login_type')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('real_shares') is not None:
            self.real_shares = m.get('real_shares')
        if m.get('bonus_token_name') is not None:
            self.bonus_token_name = m.get('bonus_token_name')
        if m.get('bonus_token_address') is not None:
            self.bonus_token_address = m.get('bonus_token_address')
        if m.get('real_bonus') is not None:
            self.real_bonus = m.get('real_bonus')
        if m.get('locked_amount') is not None:
            self.locked_amount = m.get('locked_amount')
        if m.get('virtual_account_balance') is not None:
            self.virtual_account_balance = m.get('virtual_account_balance')
        return self


class ProjectWithRole(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        projcet_name: str = None,
        description: str = None,
        token_name: str = None,
        capacity: str = None,
        net_value: str = None,
        price_type: str = None,
        project_net_value: str = None,
        max_subscription_amount: str = None,
        deployment_type: str = None,
        chain_type: str = None,
        user_operator_list: List[UserOperatorInfoBO] = None,
        participant_infos: List[ParticipantInfo] = None,
    ):
        # 项目id
        self.project_id = project_id
        # 项目名称
        self.projcet_name = projcet_name
        # 描述
        self.description = description
        # token名称
        self.token_name = token_name
        # 最大供应量
        self.capacity = capacity
        # 净值
        self.net_value = net_value
        # 价格类型：PROJECT_NAV 项目净值 TOKEN_PRICE token
        self.price_type = price_type
        # 项目净值
        self.project_net_value = project_net_value
        # 最大限额
        self.max_subscription_amount = max_subscription_amount
        # 部署类型 DIRECT_PUBLIC_CHAIN 直发公链，NORMAL 普通模式
        self.deployment_type = deployment_type
        # 项目所在链
        self.chain_type = chain_type
        # 操作角色列表
        self.user_operator_list = user_operator_list
        # 代销者机构集合
        self.participant_infos = participant_infos

    def validate(self):
        if self.user_operator_list:
            for k in self.user_operator_list:
                if k:
                    k.validate()
        if self.participant_infos:
            for k in self.participant_infos:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.projcet_name is not None:
            result['projcet_name'] = self.projcet_name
        if self.description is not None:
            result['description'] = self.description
        if self.token_name is not None:
            result['token_name'] = self.token_name
        if self.capacity is not None:
            result['capacity'] = self.capacity
        if self.net_value is not None:
            result['net_value'] = self.net_value
        if self.price_type is not None:
            result['price_type'] = self.price_type
        if self.project_net_value is not None:
            result['project_net_value'] = self.project_net_value
        if self.max_subscription_amount is not None:
            result['max_subscription_amount'] = self.max_subscription_amount
        if self.deployment_type is not None:
            result['deployment_type'] = self.deployment_type
        if self.chain_type is not None:
            result['chain_type'] = self.chain_type
        result['user_operator_list'] = []
        if self.user_operator_list is not None:
            for k in self.user_operator_list:
                result['user_operator_list'].append(k.to_map() if k else None)
        result['participant_infos'] = []
        if self.participant_infos is not None:
            for k in self.participant_infos:
                result['participant_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('projcet_name') is not None:
            self.projcet_name = m.get('projcet_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('token_name') is not None:
            self.token_name = m.get('token_name')
        if m.get('capacity') is not None:
            self.capacity = m.get('capacity')
        if m.get('net_value') is not None:
            self.net_value = m.get('net_value')
        if m.get('price_type') is not None:
            self.price_type = m.get('price_type')
        if m.get('project_net_value') is not None:
            self.project_net_value = m.get('project_net_value')
        if m.get('max_subscription_amount') is not None:
            self.max_subscription_amount = m.get('max_subscription_amount')
        if m.get('deployment_type') is not None:
            self.deployment_type = m.get('deployment_type')
        if m.get('chain_type') is not None:
            self.chain_type = m.get('chain_type')
        self.user_operator_list = []
        if m.get('user_operator_list') is not None:
            for k in m.get('user_operator_list'):
                temp_model = UserOperatorInfoBO()
                self.user_operator_list.append(temp_model.from_map(k))
        self.participant_infos = []
        if m.get('participant_infos') is not None:
            for k in m.get('participant_infos'):
                temp_model = ParticipantInfo()
                self.participant_infos.append(temp_model.from_map(k))
        return self


class CrossAccountListVO(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        asset_project_address: str = None,
        bonus_address: str = None,
        user_id: str = None,
        distributor_institution_id: str = None,
        token_name: str = None,
        token_symbol: str = None,
        chain_name: str = None,
        sub_user_account_id: str = None,
        sub_user_bonus_account_id: str = None,
        target_chain_name: str = None,
        target_chain_asset_token_address: str = None,
        target_chain_bonus_address: str = None,
        cross_chain_accounts_info: List[CrossChainAccountsVO] = None,
    ):
        # 项目ID
        self.project_id = project_id
        # 资产项目合约地址
        self.asset_project_address = asset_project_address
        # 红利合约地址
        self.bonus_address = bonus_address
        # 用户ID
        self.user_id = user_id
        # 代销机构ID
        self.distributor_institution_id = distributor_institution_id
        # 项目代币名称
        self.token_name = token_name
        # 项目代币符号
        self.token_symbol = token_symbol
        # 发行链名称
        self.chain_name = chain_name
        # 投资者用户账户ID
        self.sub_user_account_id = sub_user_account_id
        # 投资者用户红利账户ID
        self.sub_user_bonus_account_id = sub_user_bonus_account_id
        # 目标链名称
        self.target_chain_name = target_chain_name
        # 目标链资产合约地址
        self.target_chain_asset_token_address = target_chain_asset_token_address
        # 目标链红利合约地址
        self.target_chain_bonus_address = target_chain_bonus_address
        # 对侧链账户信息
        self.cross_chain_accounts_info = cross_chain_accounts_info

    def validate(self):
        if self.cross_chain_accounts_info:
            for k in self.cross_chain_accounts_info:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.bonus_address is not None:
            result['bonus_address'] = self.bonus_address
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.distributor_institution_id is not None:
            result['distributor_institution_id'] = self.distributor_institution_id
        if self.token_name is not None:
            result['token_name'] = self.token_name
        if self.token_symbol is not None:
            result['token_symbol'] = self.token_symbol
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        if self.sub_user_account_id is not None:
            result['sub_user_account_id'] = self.sub_user_account_id
        if self.sub_user_bonus_account_id is not None:
            result['sub_user_bonus_account_id'] = self.sub_user_bonus_account_id
        if self.target_chain_name is not None:
            result['target_chain_name'] = self.target_chain_name
        if self.target_chain_asset_token_address is not None:
            result['target_chain_asset_token_address'] = self.target_chain_asset_token_address
        if self.target_chain_bonus_address is not None:
            result['target_chain_bonus_address'] = self.target_chain_bonus_address
        result['cross_chain_accounts_info'] = []
        if self.cross_chain_accounts_info is not None:
            for k in self.cross_chain_accounts_info:
                result['cross_chain_accounts_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('bonus_address') is not None:
            self.bonus_address = m.get('bonus_address')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('distributor_institution_id') is not None:
            self.distributor_institution_id = m.get('distributor_institution_id')
        if m.get('token_name') is not None:
            self.token_name = m.get('token_name')
        if m.get('token_symbol') is not None:
            self.token_symbol = m.get('token_symbol')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        if m.get('sub_user_account_id') is not None:
            self.sub_user_account_id = m.get('sub_user_account_id')
        if m.get('sub_user_bonus_account_id') is not None:
            self.sub_user_bonus_account_id = m.get('sub_user_bonus_account_id')
        if m.get('target_chain_name') is not None:
            self.target_chain_name = m.get('target_chain_name')
        if m.get('target_chain_asset_token_address') is not None:
            self.target_chain_asset_token_address = m.get('target_chain_asset_token_address')
        if m.get('target_chain_bonus_address') is not None:
            self.target_chain_bonus_address = m.get('target_chain_bonus_address')
        self.cross_chain_accounts_info = []
        if m.get('cross_chain_accounts_info') is not None:
            for k in m.get('cross_chain_accounts_info'):
                temp_model = CrossChainAccountsVO()
                self.cross_chain_accounts_info.append(temp_model.from_map(k))
        return self


class KeyPageData(TeaModel):
    def __init__(
        self,
        total: int = None,
        page_count: int = None,
        page_num: int = None,
        page_size: int = None,
        records: List[KeyVO] = None,
    ):
        # 总记录
        self.total = total
        # 总页数
        self.page_count = page_count
        # 当前页码
        self.page_num = page_num
        # 每页数量
        self.page_size = page_size
        # 密钥列表
        self.records = records

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.page_count, 'page_count')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.records, 'records')
        if self.records:
            for k in self.records:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.page_count is not None:
            result['page_count'] = self.page_count
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['records'] = []
        if self.records is not None:
            for k in self.records:
                result['records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_count') is not None:
            self.page_count = m.get('page_count')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.records = []
        if m.get('records') is not None:
            for k in m.get('records'):
                temp_model = KeyVO()
                self.records.append(temp_model.from_map(k))
        return self


class LoginOperationLogVO(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        user_address: str = None,
        login_name: str = None,
        login_account_type: str = None,
        request_url: str = None,
        success: bool = None,
        gmt_created: int = None,
    ):
        # 用户ID
        self.user_id = user_id
        # 用户地址
        self.user_address = user_address
        # 登录名
        self.login_name = login_name
        # 登录类型
        self.login_account_type = login_account_type
        # 请求URL
        self.request_url = request_url
        # 是否成功
        self.success = success
        # 创建时间
        self.gmt_created = gmt_created

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.request_url, 'request_url')
        self.validate_required(self.success, 'success')
        self.validate_required(self.gmt_created, 'gmt_created')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.login_account_type is not None:
            result['login_account_type'] = self.login_account_type
        if self.request_url is not None:
            result['request_u_r_l'] = self.request_url
        if self.success is not None:
            result['success'] = self.success
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('login_account_type') is not None:
            self.login_account_type = m.get('login_account_type')
        if m.get('request_u_r_l') is not None:
            self.request_url = m.get('request_u_r_l')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        return self


class SubUserAccountDetailVO(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        asset_project_address: str = None,
        bonus_address: str = None,
        user_id: str = None,
        distributor_institution_id: str = None,
        token_name: str = None,
        token_symbol: str = None,
        chain_name: str = None,
        sub_user_account_id: str = None,
        sub_user_bonus_account_id: str = None,
        sub_user_account_details: List[SubUserAccountDetailsVO] = None,
        sub_user_bonus_account_details: List[SubUserBonusAccountDetailVO] = None,
    ):
        # 项目ID
        self.project_id = project_id
        # 资产项目合约地址
        self.asset_project_address = asset_project_address
        # 红利合约地址
        self.bonus_address = bonus_address
        # 用户ID
        self.user_id = user_id
        # 代销机构ID
        self.distributor_institution_id = distributor_institution_id
        # 项目代币名称
        self.token_name = token_name
        # 项目代币符号
        self.token_symbol = token_symbol
        # 发行链名称
        self.chain_name = chain_name
        # 投资者用户账户ID
        self.sub_user_account_id = sub_user_account_id
        # 投资者用户红利账户ID
        self.sub_user_bonus_account_id = sub_user_bonus_account_id
        # 资产账户明细
        self.sub_user_account_details = sub_user_account_details
        # 红利账户明细
        self.sub_user_bonus_account_details = sub_user_bonus_account_details

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        if self.sub_user_account_details:
            for k in self.sub_user_account_details:
                if k:
                    k.validate()
        if self.sub_user_bonus_account_details:
            for k in self.sub_user_bonus_account_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.bonus_address is not None:
            result['bonus_address'] = self.bonus_address
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.distributor_institution_id is not None:
            result['distributor_institution_id'] = self.distributor_institution_id
        if self.token_name is not None:
            result['token_name'] = self.token_name
        if self.token_symbol is not None:
            result['token_symbol'] = self.token_symbol
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        if self.sub_user_account_id is not None:
            result['sub_user_account_id'] = self.sub_user_account_id
        if self.sub_user_bonus_account_id is not None:
            result['sub_user_bonus_account_id'] = self.sub_user_bonus_account_id
        result['sub_user_account_details'] = []
        if self.sub_user_account_details is not None:
            for k in self.sub_user_account_details:
                result['sub_user_account_details'].append(k.to_map() if k else None)
        result['sub_user_bonus_account_details'] = []
        if self.sub_user_bonus_account_details is not None:
            for k in self.sub_user_bonus_account_details:
                result['sub_user_bonus_account_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('bonus_address') is not None:
            self.bonus_address = m.get('bonus_address')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('distributor_institution_id') is not None:
            self.distributor_institution_id = m.get('distributor_institution_id')
        if m.get('token_name') is not None:
            self.token_name = m.get('token_name')
        if m.get('token_symbol') is not None:
            self.token_symbol = m.get('token_symbol')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        if m.get('sub_user_account_id') is not None:
            self.sub_user_account_id = m.get('sub_user_account_id')
        if m.get('sub_user_bonus_account_id') is not None:
            self.sub_user_bonus_account_id = m.get('sub_user_bonus_account_id')
        self.sub_user_account_details = []
        if m.get('sub_user_account_details') is not None:
            for k in m.get('sub_user_account_details'):
                temp_model = SubUserAccountDetailsVO()
                self.sub_user_account_details.append(temp_model.from_map(k))
        self.sub_user_bonus_account_details = []
        if m.get('sub_user_bonus_account_details') is not None:
            for k in m.get('sub_user_bonus_account_details'):
                temp_model = SubUserBonusAccountDetailVO()
                self.sub_user_bonus_account_details.append(temp_model.from_map(k))
        return self


class SupportedSettlementMethodInfo(TeaModel):
    def __init__(
        self,
        settlement_method_enum: str = None,
        related_settlement_account_id: str = None,
    ):
        # 结算方式枚举：TD或TT
        self.settlement_method_enum = settlement_method_enum
        # 结算银行账户id
        self.related_settlement_account_id = related_settlement_account_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.settlement_method_enum is not None:
            result['settlement_method_enum'] = self.settlement_method_enum
        if self.related_settlement_account_id is not None:
            result['related_settlement_account_id'] = self.related_settlement_account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('settlement_method_enum') is not None:
            self.settlement_method_enum = m.get('settlement_method_enum')
        if m.get('related_settlement_account_id') is not None:
            self.related_settlement_account_id = m.get('related_settlement_account_id')
        return self


class DataSummaryTotal(TeaModel):
    def __init__(
        self,
        total_value_list: List[MultiCurrencyMoney] = None,
        total_projects: int = None,
        total_holders: int = None,
        last_updated_time: int = None,
    ):
        # 原始币种资产价值列表
        self.total_value_list = total_value_list
        # 总项目数
        self.total_projects = total_projects
        # 总用户数
        self.total_holders = total_holders
        # 最后更新时间戳
        self.last_updated_time = last_updated_time

    def validate(self):
        self.validate_required(self.total_value_list, 'total_value_list')
        if self.total_value_list:
            for k in self.total_value_list:
                if k:
                    k.validate()
        self.validate_required(self.total_projects, 'total_projects')
        self.validate_required(self.total_holders, 'total_holders')
        self.validate_required(self.last_updated_time, 'last_updated_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['total_value_list'] = []
        if self.total_value_list is not None:
            for k in self.total_value_list:
                result['total_value_list'].append(k.to_map() if k else None)
        if self.total_projects is not None:
            result['total_projects'] = self.total_projects
        if self.total_holders is not None:
            result['total_holders'] = self.total_holders
        if self.last_updated_time is not None:
            result['last_updated_time'] = self.last_updated_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.total_value_list = []
        if m.get('total_value_list') is not None:
            for k in m.get('total_value_list'):
                temp_model = MultiCurrencyMoney()
                self.total_value_list.append(temp_model.from_map(k))
        if m.get('total_projects') is not None:
            self.total_projects = m.get('total_projects')
        if m.get('total_holders') is not None:
            self.total_holders = m.get('total_holders')
        if m.get('last_updated_time') is not None:
            self.last_updated_time = m.get('last_updated_time')
        return self


class AssetProjectDetail(TeaModel):
    def __init__(
        self,
        participant_infos: List[ParticipantInfo] = None,
        mint_keys: List[KeyInfo] = None,
        burn_keys: List[KeyInfo] = None,
        transfer_keys: List[KeyInfo] = None,
        manager_keys: List[KeyInfo] = None,
        history_net_value_list: List[NetValueInfo] = None,
        report_list: List[ReportInfo] = None,
        project_id: str = None,
        name: str = None,
        token_name: str = None,
        info: str = None,
        description: str = None,
        supply: str = None,
        capacity: str = None,
        radio: int = None,
        user_number: int = None,
        asset_token_address: str = None,
        rule_engine_address: str = None,
        member_list_rule_address: str = None,
        status: str = None,
        net_value: str = None,
        currency: str = None,
        gmt_created: str = None,
        gmt_modified: str = None,
    ):
        # 项目参与的代销机构列表
        self.participant_infos = participant_infos
        # 发行密钥列表
        self.mint_keys = mint_keys
        # 赎回密钥列表
        self.burn_keys = burn_keys
        # 转账密钥列表
        self.transfer_keys = transfer_keys
        # 管理密钥列表
        self.manager_keys = manager_keys
        # 历史净值列表
        self.history_net_value_list = history_net_value_list
        # 项目报告列表
        self.report_list = report_list
        # 项目ID
        self.project_id = project_id
        # 项目名称
        self.name = name
        # 项目代币名称
        self.token_name = token_name
        # 项目介绍
        self.info = info
        # 项目描述(markdown格式)
        self.description = description
        # 当前供应量
        self.supply = supply
        # 最大供应量
        self.capacity = capacity
        # 供应量比例(supply/capacity * 100，保留2位小数）
        self.radio = radio
        # 持有人数量
        self.user_number = user_number
        # 资产token合约地址
        self.asset_token_address = asset_token_address
        # 资产规则引擎合约地址
        self.rule_engine_address = rule_engine_address
        # 资产白名单合约地址
        self.member_list_rule_address = member_list_rule_address
        # 项目状态(ACTIVE：激活；PAUSED：暂停)
        self.status = status
        # 项目净值
        self.net_value = net_value
        # 项目币种(目前支持USD、HKD)
        self.currency = currency
        # 项目创建时间戳
        self.gmt_created = gmt_created
        # 项目修改时间戳
        self.gmt_modified = gmt_modified

    def validate(self):
        self.validate_required(self.participant_infos, 'participant_infos')
        if self.participant_infos:
            for k in self.participant_infos:
                if k:
                    k.validate()
        self.validate_required(self.mint_keys, 'mint_keys')
        if self.mint_keys:
            for k in self.mint_keys:
                if k:
                    k.validate()
        self.validate_required(self.burn_keys, 'burn_keys')
        if self.burn_keys:
            for k in self.burn_keys:
                if k:
                    k.validate()
        self.validate_required(self.transfer_keys, 'transfer_keys')
        if self.transfer_keys:
            for k in self.transfer_keys:
                if k:
                    k.validate()
        self.validate_required(self.manager_keys, 'manager_keys')
        if self.manager_keys:
            for k in self.manager_keys:
                if k:
                    k.validate()
        self.validate_required(self.history_net_value_list, 'history_net_value_list')
        if self.history_net_value_list:
            for k in self.history_net_value_list:
                if k:
                    k.validate()
        self.validate_required(self.report_list, 'report_list')
        if self.report_list:
            for k in self.report_list:
                if k:
                    k.validate()
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.token_name, 'token_name')
        self.validate_required(self.info, 'info')
        self.validate_required(self.supply, 'supply')
        self.validate_required(self.capacity, 'capacity')
        self.validate_required(self.radio, 'radio')
        self.validate_required(self.user_number, 'user_number')
        self.validate_required(self.asset_token_address, 'asset_token_address')
        self.validate_required(self.rule_engine_address, 'rule_engine_address')
        self.validate_required(self.member_list_rule_address, 'member_list_rule_address')
        self.validate_required(self.status, 'status')
        self.validate_required(self.net_value, 'net_value')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.gmt_created, 'gmt_created')
        self.validate_required(self.gmt_modified, 'gmt_modified')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['participant_infos'] = []
        if self.participant_infos is not None:
            for k in self.participant_infos:
                result['participant_infos'].append(k.to_map() if k else None)
        result['mint_keys'] = []
        if self.mint_keys is not None:
            for k in self.mint_keys:
                result['mint_keys'].append(k.to_map() if k else None)
        result['burn_keys'] = []
        if self.burn_keys is not None:
            for k in self.burn_keys:
                result['burn_keys'].append(k.to_map() if k else None)
        result['transfer_keys'] = []
        if self.transfer_keys is not None:
            for k in self.transfer_keys:
                result['transfer_keys'].append(k.to_map() if k else None)
        result['manager_keys'] = []
        if self.manager_keys is not None:
            for k in self.manager_keys:
                result['manager_keys'].append(k.to_map() if k else None)
        result['history_net_value_list'] = []
        if self.history_net_value_list is not None:
            for k in self.history_net_value_list:
                result['history_net_value_list'].append(k.to_map() if k else None)
        result['report_list'] = []
        if self.report_list is not None:
            for k in self.report_list:
                result['report_list'].append(k.to_map() if k else None)
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.name is not None:
            result['name'] = self.name
        if self.token_name is not None:
            result['token_name'] = self.token_name
        if self.info is not None:
            result['info'] = self.info
        if self.description is not None:
            result['description'] = self.description
        if self.supply is not None:
            result['supply'] = self.supply
        if self.capacity is not None:
            result['capacity'] = self.capacity
        if self.radio is not None:
            result['radio'] = self.radio
        if self.user_number is not None:
            result['user_number'] = self.user_number
        if self.asset_token_address is not None:
            result['asset_token_address'] = self.asset_token_address
        if self.rule_engine_address is not None:
            result['rule_engine_address'] = self.rule_engine_address
        if self.member_list_rule_address is not None:
            result['member_list_rule_address'] = self.member_list_rule_address
        if self.status is not None:
            result['status'] = self.status
        if self.net_value is not None:
            result['net_value'] = self.net_value
        if self.currency is not None:
            result['currency'] = self.currency
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.participant_infos = []
        if m.get('participant_infos') is not None:
            for k in m.get('participant_infos'):
                temp_model = ParticipantInfo()
                self.participant_infos.append(temp_model.from_map(k))
        self.mint_keys = []
        if m.get('mint_keys') is not None:
            for k in m.get('mint_keys'):
                temp_model = KeyInfo()
                self.mint_keys.append(temp_model.from_map(k))
        self.burn_keys = []
        if m.get('burn_keys') is not None:
            for k in m.get('burn_keys'):
                temp_model = KeyInfo()
                self.burn_keys.append(temp_model.from_map(k))
        self.transfer_keys = []
        if m.get('transfer_keys') is not None:
            for k in m.get('transfer_keys'):
                temp_model = KeyInfo()
                self.transfer_keys.append(temp_model.from_map(k))
        self.manager_keys = []
        if m.get('manager_keys') is not None:
            for k in m.get('manager_keys'):
                temp_model = KeyInfo()
                self.manager_keys.append(temp_model.from_map(k))
        self.history_net_value_list = []
        if m.get('history_net_value_list') is not None:
            for k in m.get('history_net_value_list'):
                temp_model = NetValueInfo()
                self.history_net_value_list.append(temp_model.from_map(k))
        self.report_list = []
        if m.get('report_list') is not None:
            for k in m.get('report_list'):
                temp_model = ReportInfo()
                self.report_list.append(temp_model.from_map(k))
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('token_name') is not None:
            self.token_name = m.get('token_name')
        if m.get('info') is not None:
            self.info = m.get('info')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('supply') is not None:
            self.supply = m.get('supply')
        if m.get('capacity') is not None:
            self.capacity = m.get('capacity')
        if m.get('radio') is not None:
            self.radio = m.get('radio')
        if m.get('user_number') is not None:
            self.user_number = m.get('user_number')
        if m.get('asset_token_address') is not None:
            self.asset_token_address = m.get('asset_token_address')
        if m.get('rule_engine_address') is not None:
            self.rule_engine_address = m.get('rule_engine_address')
        if m.get('member_list_rule_address') is not None:
            self.member_list_rule_address = m.get('member_list_rule_address')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('net_value') is not None:
            self.net_value = m.get('net_value')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        return self


class ProjectPerformance(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        net_value: str = None,
        currency: str = None,
        update_time: int = None,
    ):
        # 项目ID
        self.project_id = project_id
        # 项目净值
        self.net_value = net_value
        # 币种(目前支持USD、HKD)
        self.currency = currency
        # 净值更新时间戳
        self.update_time = update_time

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.net_value, 'net_value')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.update_time, 'update_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.net_value is not None:
            result['net_value'] = self.net_value
        if self.currency is not None:
            result['currency'] = self.currency
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('net_value') is not None:
            self.net_value = m.get('net_value')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class SubUserVirtualAccountListVO(TeaModel):
    def __init__(
        self,
        asset_project_id: str = None,
        asset_project_address: str = None,
        bonus_address: str = None,
        user_id: str = None,
        distributor_institution_id: str = None,
        chain_name: str = None,
        sub_user_account_id: str = None,
        sub_user_virtual_account_id: str = None,
        sub_user_bonus_virtual_account_id: str = None,
        sub_user_virtual_account_details: List[SubUserVirtualAccountDetailVO] = None,
        sub_user_bonus_virtual_account_details: List[SubUserBonusVirtualAccountDetailVO] = None,
    ):
        # 项目ID
        self.asset_project_id = asset_project_id
        # 资产项目合约地址
        self.asset_project_address = asset_project_address
        # 红利合约地址
        self.bonus_address = bonus_address
        # 用户ID
        self.user_id = user_id
        # 代销机构ID
        self.distributor_institution_id = distributor_institution_id
        # 链名
        self.chain_name = chain_name
        # 投资者用户账户ID
        self.sub_user_account_id = sub_user_account_id
        # 虚拟子账户ID
        self.sub_user_virtual_account_id = sub_user_virtual_account_id
        # 虚拟子账户红利账户ID
        self.sub_user_bonus_virtual_account_id = sub_user_bonus_virtual_account_id
        # 虚拟子账户明细
        self.sub_user_virtual_account_details = sub_user_virtual_account_details
        # 虚拟子账户红利明细
        self.sub_user_bonus_virtual_account_details = sub_user_bonus_virtual_account_details

    def validate(self):
        if self.sub_user_virtual_account_details:
            for k in self.sub_user_virtual_account_details:
                if k:
                    k.validate()
        if self.sub_user_bonus_virtual_account_details:
            for k in self.sub_user_bonus_virtual_account_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.bonus_address is not None:
            result['bonus_address'] = self.bonus_address
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.distributor_institution_id is not None:
            result['distributor_institution_id'] = self.distributor_institution_id
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        if self.sub_user_account_id is not None:
            result['sub_user_account_id'] = self.sub_user_account_id
        if self.sub_user_virtual_account_id is not None:
            result['sub_user_virtual_account_id'] = self.sub_user_virtual_account_id
        if self.sub_user_bonus_virtual_account_id is not None:
            result['sub_user_bonus_virtual_account_id'] = self.sub_user_bonus_virtual_account_id
        result['sub_user_virtual_account_details'] = []
        if self.sub_user_virtual_account_details is not None:
            for k in self.sub_user_virtual_account_details:
                result['sub_user_virtual_account_details'].append(k.to_map() if k else None)
        result['sub_user_bonus_virtual_account_details'] = []
        if self.sub_user_bonus_virtual_account_details is not None:
            for k in self.sub_user_bonus_virtual_account_details:
                result['sub_user_bonus_virtual_account_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('bonus_address') is not None:
            self.bonus_address = m.get('bonus_address')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('distributor_institution_id') is not None:
            self.distributor_institution_id = m.get('distributor_institution_id')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        if m.get('sub_user_account_id') is not None:
            self.sub_user_account_id = m.get('sub_user_account_id')
        if m.get('sub_user_virtual_account_id') is not None:
            self.sub_user_virtual_account_id = m.get('sub_user_virtual_account_id')
        if m.get('sub_user_bonus_virtual_account_id') is not None:
            self.sub_user_bonus_virtual_account_id = m.get('sub_user_bonus_virtual_account_id')
        self.sub_user_virtual_account_details = []
        if m.get('sub_user_virtual_account_details') is not None:
            for k in m.get('sub_user_virtual_account_details'):
                temp_model = SubUserVirtualAccountDetailVO()
                self.sub_user_virtual_account_details.append(temp_model.from_map(k))
        self.sub_user_bonus_virtual_account_details = []
        if m.get('sub_user_bonus_virtual_account_details') is not None:
            for k in m.get('sub_user_bonus_virtual_account_details'):
                temp_model = SubUserBonusVirtualAccountDetailVO()
                self.sub_user_bonus_virtual_account_details.append(temp_model.from_map(k))
        return self


class ProjectPageData(TeaModel):
    def __init__(
        self,
        total: int = None,
        page_count: int = None,
        page_num: int = None,
        page_size: int = None,
        records: List[AssetProject] = None,
    ):
        # 总记录数
        self.total = total
        # 总页数
        self.page_count = page_count
        # 当前页码
        self.page_num = page_num
        # 每页数量
        self.page_size = page_size
        # 项目列表
        self.records = records

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.page_count, 'page_count')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.records, 'records')
        if self.records:
            for k in self.records:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.page_count is not None:
            result['page_count'] = self.page_count
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['records'] = []
        if self.records is not None:
            for k in self.records:
                result['records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_count') is not None:
            self.page_count = m.get('page_count')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.records = []
        if m.get('records') is not None:
            for k in m.get('records'):
                temp_model = AssetProject()
                self.records.append(temp_model.from_map(k))
        return self


class SubUserAccountPageData(TeaModel):
    def __init__(
        self,
        total: int = None,
        page_count: int = None,
        page_num: int = None,
        page_size: int = None,
        records: List[SubUserAccountVO] = None,
    ):
        # 总记录
        self.total = total
        # 总页数
        self.page_count = page_count
        # 当前页码
        self.page_num = page_num
        # 每页数量
        self.page_size = page_size
        # 二级用户列表
        self.records = records

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.page_count, 'page_count')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.records, 'records')
        if self.records:
            for k in self.records:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.page_count is not None:
            result['page_count'] = self.page_count
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['records'] = []
        if self.records is not None:
            for k in self.records:
                result['records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_count') is not None:
            self.page_count = m.get('page_count')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.records = []
        if m.get('records') is not None:
            for k in m.get('records'):
                temp_model = SubUserAccountVO()
                self.records.append(temp_model.from_map(k))
        return self


class CrossChainSubUserAccountCeilingBaseVO(TeaModel):
    def __init__(
        self,
        asset_project_id: str = None,
        token_name: str = None,
        token_address: str = None,
        alias: str = None,
        real_shares: str = None,
        bonus_token_name: str = None,
        bonus_token_address: str = None,
        real_bonus: str = None,
        taget_chain_type: str = None,
        target_user_address: str = None,
    ):
        # 项目ID
        self.asset_project_id = asset_project_id
        # 代币名称
        self.token_name = token_name
        # 代币合约地址
        self.token_address = token_address
        # 别名
        self.alias = alias
        # 实际持有份额
        self.real_shares = real_shares
        # 代币名称
        self.bonus_token_name = bonus_token_name
        # 代币合约名称
        self.bonus_token_address = bonus_token_address
        # 红利份额
        self.real_bonus = real_bonus
        # 目标链
        self.taget_chain_type = taget_chain_type
        # 目标链用户地址
        self.target_user_address = target_user_address

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.token_name is not None:
            result['token_name'] = self.token_name
        if self.token_address is not None:
            result['token_address'] = self.token_address
        if self.alias is not None:
            result['alias'] = self.alias
        if self.real_shares is not None:
            result['real_shares'] = self.real_shares
        if self.bonus_token_name is not None:
            result['bonus_token_name'] = self.bonus_token_name
        if self.bonus_token_address is not None:
            result['bonus_token_address'] = self.bonus_token_address
        if self.real_bonus is not None:
            result['real_bonus'] = self.real_bonus
        if self.taget_chain_type is not None:
            result['taget_chain_type'] = self.taget_chain_type
        if self.target_user_address is not None:
            result['target_user_address'] = self.target_user_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('token_name') is not None:
            self.token_name = m.get('token_name')
        if m.get('token_address') is not None:
            self.token_address = m.get('token_address')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('real_shares') is not None:
            self.real_shares = m.get('real_shares')
        if m.get('bonus_token_name') is not None:
            self.bonus_token_name = m.get('bonus_token_name')
        if m.get('bonus_token_address') is not None:
            self.bonus_token_address = m.get('bonus_token_address')
        if m.get('real_bonus') is not None:
            self.real_bonus = m.get('real_bonus')
        if m.get('taget_chain_type') is not None:
            self.taget_chain_type = m.get('taget_chain_type')
        if m.get('target_user_address') is not None:
            self.target_user_address = m.get('target_user_address')
        return self


class ApiKey(TeaModel):
    def __init__(
        self,
        id: str = None,
        token: str = None,
        secret: str = None,
        gmt_created: str = None,
    ):
        # 主键
        self.id = id
        # AK
        self.token = token
        # SK(或公钥)
        self.secret = secret
        # 创建日期
        self.gmt_created = gmt_created

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.token, 'token')
        self.validate_required(self.secret, 'secret')
        self.validate_required(self.gmt_created, 'gmt_created')
        if self.gmt_created is not None:
            self.validate_pattern(self.gmt_created, 'gmt_created', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.token is not None:
            result['token'] = self.token
        if self.secret is not None:
            result['secret'] = self.secret
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('secret') is not None:
            self.secret = m.get('secret')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        return self


class ProjectBaseInfoVO(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        asset_project_address: str = None,
        project_name: str = None,
        description: str = None,
        project_status: str = None,
        chain_type: str = None,
        token_name: str = None,
        token_symbol: str = None,
        capacity: str = None,
        max_subscription_amount: str = None,
        gmt_created: int = None,
    ):
        # 项目id
        self.project_id = project_id
        # 资产项目合约地址
        # （Launch Network/Shares token ）
        self.asset_project_address = asset_project_address
        # 项目名称
        self.project_name = project_name
        # 描述
        self.description = description
        # 项目状态
        self.project_status = project_status
        # 项目所在链（Launch Network）
        self.chain_type = chain_type
        # 代币名称
        self.token_name = token_name
        # 项目代币符号
        self.token_symbol = token_symbol
        # 总发行量
        self.capacity = capacity
        # 单钱包最大可持有份额
        self.max_subscription_amount = max_subscription_amount
        # 创建时间戳（毫秒）
        self.gmt_created = gmt_created

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.description is not None:
            result['description'] = self.description
        if self.project_status is not None:
            result['project_status'] = self.project_status
        if self.chain_type is not None:
            result['chain_type'] = self.chain_type
        if self.token_name is not None:
            result['token_name'] = self.token_name
        if self.token_symbol is not None:
            result['token_symbol'] = self.token_symbol
        if self.capacity is not None:
            result['capacity'] = self.capacity
        if self.max_subscription_amount is not None:
            result['max_subscription_amount'] = self.max_subscription_amount
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('project_status') is not None:
            self.project_status = m.get('project_status')
        if m.get('chain_type') is not None:
            self.chain_type = m.get('chain_type')
        if m.get('token_name') is not None:
            self.token_name = m.get('token_name')
        if m.get('token_symbol') is not None:
            self.token_symbol = m.get('token_symbol')
        if m.get('capacity') is not None:
            self.capacity = m.get('capacity')
        if m.get('max_subscription_amount') is not None:
            self.max_subscription_amount = m.get('max_subscription_amount')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        return self


class ProjectKeyPageData(TeaModel):
    def __init__(
        self,
        total: int = None,
        page_count: int = None,
        page_num: int = None,
        page_size: int = None,
        records: List[AssetProjectKey] = None,
    ):
        # 总记录数
        self.total = total
        # 总页数
        self.page_count = page_count
        # 当前页码
        self.page_num = page_num
        # 每页数量
        self.page_size = page_size
        # 项目密钥列表
        self.records = records

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.page_count, 'page_count')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.records, 'records')
        if self.records:
            for k in self.records:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.page_count is not None:
            result['page_count'] = self.page_count
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['records'] = []
        if self.records is not None:
            for k in self.records:
                result['records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_count') is not None:
            self.page_count = m.get('page_count')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.records = []
        if m.get('records') is not None:
            for k in m.get('records'):
                temp_model = AssetProjectKey()
                self.records.append(temp_model.from_map(k))
        return self


class HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        e_2e_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易
        self.e_2e_id = e_2e_id

    def validate(self):
        self.validate_required(self.e_2e_id, 'e_2e_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.e_2e_id is not None:
            result['e2e_id'] = self.e_2e_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('e2e_id') is not None:
            self.e_2e_id = m.get('e2e_id')
        return self


class HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse(TeaModel):
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
        # 成功
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


class PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        e_2e_id: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易
        self.e_2e_id = e_2e_id
        # 支付状态
        self.status = status

    def validate(self):
        self.validate_required(self.e_2e_id, 'e_2e_id')
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
        if self.e_2e_id is not None:
            result['e2e_id'] = self.e_2e_id
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('e2e_id') is not None:
            self.e_2e_id = m.get('e2e_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse(TeaModel):
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
        # 调用成功
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


class ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        e_2e_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易。
        self.e_2e_id = e_2e_id

    def validate(self):
        self.validate_required(self.e_2e_id, 'e_2e_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.e_2e_id is not None:
            result['e2e_id'] = self.e_2e_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('e2e_id') is not None:
            self.e_2e_id = m.get('e2e_id')
        return self


class ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse(TeaModel):
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
        # 成功
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


