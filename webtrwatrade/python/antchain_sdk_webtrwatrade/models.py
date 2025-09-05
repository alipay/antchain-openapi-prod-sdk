# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List, BinaryIO


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
        # 交易类别
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
        # 登录类型
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
        # 交易类型
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
        gmt_modified: str = None,
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
        cross_chain_user_address: str = None,
        cross_chain_user_account_id: str = None,
        cross_chain_user_bonus_account_id: str = None,
        cross_chain_user_accounts_details: List[CrossChainAccountsDetailVO] = None,
        cross_chain_bonus_accounts_details: List[CrossChainBonusAccountsDetailVO] = None,
    ):
        # 对侧链用户地址
        self.cross_chain_user_address = cross_chain_user_address
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
        if self.cross_chain_user_address is not None:
            result['cross_chain_user_address'] = self.cross_chain_user_address
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
        if m.get('cross_chain_user_address') is not None:
            self.cross_chain_user_address = m.get('cross_chain_user_address')
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
        # 价格类型
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


class CreateIssuerProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        info: str = None,
        description: str = None,
        token_name: str = None,
        capacity: str = None,
        net_value: str = None,
        currency: str = None,
        participants: List[ParticipantInfo] = None,
        mint_keys: List[str] = None,
        burn_keys: List[str] = None,
        transfer_keys: List[str] = None,
        manager_keys: List[str] = None,
        project_cover_file_id: str = None,
        max_subscription_limited: bool = None,
        max_subscription_amount: str = None,
        settlement_methods: List[SupportedSettlementMethodInfo] = None,
        cross_chain: bool = None,
        target_chain_name_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目名称
        self.name = name
        # 项目名称
        self.info = info
        # 项目描述(markdown格式)
        self.description = description
        # 代币名称
        self.token_name = token_name
        # 最大供应量
        self.capacity = capacity
        # 净值
        self.net_value = net_value
        # 币种(目前支持USD、HKD、CNY)
        self.currency = currency
        # 项目参与者列表(代销机构，最多3个)
        self.participants = participants
        # 发行密钥ID列表(最多3个)
        self.mint_keys = mint_keys
        # 赎回密钥ID列表(最多3个)
        self.burn_keys = burn_keys
        # 转账密钥ID列表(最多3个)
        self.transfer_keys = transfer_keys
        # 管理密钥ID列表(最多3个)
        self.manager_keys = manager_keys
        # 项目封面文件id
        self.project_cover_file_id = project_cover_file_id
        # 是否限购
        self.max_subscription_limited = max_subscription_limited
        # 最大可认购份额
        self.max_subscription_amount = max_subscription_amount
        # 项目支持的结算方式
        self.settlement_methods = settlement_methods
        # crossChain
        self.cross_chain = cross_chain
        # 目标链名称列表（跨链项目必填）
        self.target_chain_name_list = target_chain_name_list

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.info, 'info')
        self.validate_required(self.token_name, 'token_name')
        self.validate_required(self.capacity, 'capacity')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.participants, 'participants')
        if self.participants:
            for k in self.participants:
                if k:
                    k.validate()
        self.validate_required(self.mint_keys, 'mint_keys')
        self.validate_required(self.burn_keys, 'burn_keys')
        self.validate_required(self.transfer_keys, 'transfer_keys')
        self.validate_required(self.manager_keys, 'manager_keys')
        self.validate_required(self.project_cover_file_id, 'project_cover_file_id')
        self.validate_required(self.max_subscription_limited, 'max_subscription_limited')
        self.validate_required(self.max_subscription_amount, 'max_subscription_amount')
        self.validate_required(self.settlement_methods, 'settlement_methods')
        if self.settlement_methods:
            for k in self.settlement_methods:
                if k:
                    k.validate()
        self.validate_required(self.cross_chain, 'cross_chain')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.info is not None:
            result['info'] = self.info
        if self.description is not None:
            result['description'] = self.description
        if self.token_name is not None:
            result['token_name'] = self.token_name
        if self.capacity is not None:
            result['capacity'] = self.capacity
        if self.net_value is not None:
            result['net_value'] = self.net_value
        if self.currency is not None:
            result['currency'] = self.currency
        result['participants'] = []
        if self.participants is not None:
            for k in self.participants:
                result['participants'].append(k.to_map() if k else None)
        if self.mint_keys is not None:
            result['mint_keys'] = self.mint_keys
        if self.burn_keys is not None:
            result['burn_keys'] = self.burn_keys
        if self.transfer_keys is not None:
            result['transfer_keys'] = self.transfer_keys
        if self.manager_keys is not None:
            result['manager_keys'] = self.manager_keys
        if self.project_cover_file_id is not None:
            result['project_cover_file_id'] = self.project_cover_file_id
        if self.max_subscription_limited is not None:
            result['max_subscription_limited'] = self.max_subscription_limited
        if self.max_subscription_amount is not None:
            result['max_subscription_amount'] = self.max_subscription_amount
        result['settlement_methods'] = []
        if self.settlement_methods is not None:
            for k in self.settlement_methods:
                result['settlement_methods'].append(k.to_map() if k else None)
        if self.cross_chain is not None:
            result['cross_chain'] = self.cross_chain
        if self.target_chain_name_list is not None:
            result['target_chain_name_list'] = self.target_chain_name_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('info') is not None:
            self.info = m.get('info')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('token_name') is not None:
            self.token_name = m.get('token_name')
        if m.get('capacity') is not None:
            self.capacity = m.get('capacity')
        if m.get('net_value') is not None:
            self.net_value = m.get('net_value')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        self.participants = []
        if m.get('participants') is not None:
            for k in m.get('participants'):
                temp_model = ParticipantInfo()
                self.participants.append(temp_model.from_map(k))
        if m.get('mint_keys') is not None:
            self.mint_keys = m.get('mint_keys')
        if m.get('burn_keys') is not None:
            self.burn_keys = m.get('burn_keys')
        if m.get('transfer_keys') is not None:
            self.transfer_keys = m.get('transfer_keys')
        if m.get('manager_keys') is not None:
            self.manager_keys = m.get('manager_keys')
        if m.get('project_cover_file_id') is not None:
            self.project_cover_file_id = m.get('project_cover_file_id')
        if m.get('max_subscription_limited') is not None:
            self.max_subscription_limited = m.get('max_subscription_limited')
        if m.get('max_subscription_amount') is not None:
            self.max_subscription_amount = m.get('max_subscription_amount')
        self.settlement_methods = []
        if m.get('settlement_methods') is not None:
            for k in m.get('settlement_methods'):
                temp_model = SupportedSettlementMethodInfo()
                self.settlement_methods.append(temp_model.from_map(k))
        if m.get('cross_chain') is not None:
            self.cross_chain = m.get('cross_chain')
        if m.get('target_chain_name_list') is not None:
            self.target_chain_name_list = m.get('target_chain_name_list')
        return self


class CreateIssuerProjectResponse(TeaModel):
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
        # 项目ID
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


class PagequeryIssuerProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        status: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目名称模糊查询条件
        self.name = name
        # 项目状态(ACTIVE：激活；PAUSED：暂停)
        self.status = status
        # 当前页码(默认为第一页)
        self.page_num = page_num
        # 页面显示条数(默认10，最小为5)
        self.page_size = page_size

    def validate(self):
        if self.page_num is not None:
            self.validate_minimum(self.page_num, 'page_num', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 5)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.status is not None:
            result['status'] = self.status
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryIssuerProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ProjectPageData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目分页信息
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = ProjectPageData()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequeryDistributorProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        status: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目名称
        self.name = name
        # 项目状态（ACTIVE：激活；PAUSED：暂停）
        self.status = status
        # 当前页码(默认为第一页)
        self.page_num = page_num
        # 页面显示条数(默认10，最小为5)
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        if self.page_num is not None:
            self.validate_minimum(self.page_num, 'page_num', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 5)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.status is not None:
            result['status'] = self.status
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryDistributorProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ProjectPageData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目分页信息
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = ProjectPageData()
            self.data = temp_model.from_map(m['data'])
        return self


class PauseIssuerProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class PauseIssuerProjectResponse(TeaModel):
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


class EnableIssuerProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class EnableIssuerProjectResponse(TeaModel):
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


class DetailIssuerProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class DetailIssuerProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AssetProjectDetail = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产项目详情
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = AssetProjectDetail()
            self.data = temp_model.from_map(m['data'])
        return self


class DetailDistributorProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class DetailDistributorProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AssetProject = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产项目详情
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = AssetProject()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequeryPlatformProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        status: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目名称
        self.name = name
        # 项目状态（ACTIVE：激活；PAUSED：暂停）
        self.status = status
        # 当前页码(默认为第一页)
        self.page_num = page_num
        # 页面显示条数(默认10，最小为5)
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.status is not None:
            result['status'] = self.status
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryPlatformProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ProjectPageData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目分页信息
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = ProjectPageData()
            self.data = temp_model.from_map(m['data'])
        return self


class DetailIssuerProjectwithroleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
        chain_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目id，项目资产ID和
        # 项目合约地址+所在链组合 二选一
        self.asset_project_id = asset_project_id
        # 资产项目合约地址，项目资产ID和
        # 项目合约地址+所在链组合 二选一
        self.asset_project_address = asset_project_address
        # 所在链，项目资产ID和
        # 项目合约地址+所在链组合 二选一
        self.chain_name = chain_name

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
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        return self


class DetailIssuerProjectwithroleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ProjectWithRole = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目角色信息
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = ProjectWithRole()
            self.data = temp_model.from_map(m['data'])
        return self


class ListIssuerCrossaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
        chain_name: str = None,
        user_id: str = None,
        user_address: str = None,
        login_name: str = None,
        login_account_type: str = None,
        cross_chain_user_address: str = None,
        start_time_mills: int = None,
        end_time_mills: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产项目ID
        self.asset_project_id = asset_project_id
        # 资产项目合约地址
        self.asset_project_address = asset_project_address
        # 项目所在链
        self.chain_name = chain_name
        # 用户ID
        self.user_id = user_id
        # 本侧链用户地址
        self.user_address = user_address
        # 登录名
        self.login_name = login_name
        # 登录名类型(EMAIL)
        self.login_account_type = login_account_type
        # 对侧链用户地址
        self.cross_chain_user_address = cross_chain_user_address
        # 开始时间 (时间戳)
        self.start_time_mills = start_time_mills
        # 结束时间 (时间戳)
        self.end_time_mills = end_time_mills

    def validate(self):
        self.validate_required(self.start_time_mills, 'start_time_mills')
        self.validate_required(self.end_time_mills, 'end_time_mills')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.login_account_type is not None:
            result['login_account_type'] = self.login_account_type
        if self.cross_chain_user_address is not None:
            result['cross_chain_user_address'] = self.cross_chain_user_address
        if self.start_time_mills is not None:
            result['start_time_mills'] = self.start_time_mills
        if self.end_time_mills is not None:
            result['end_time_mills'] = self.end_time_mills
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('login_account_type') is not None:
            self.login_account_type = m.get('login_account_type')
        if m.get('cross_chain_user_address') is not None:
            self.cross_chain_user_address = m.get('cross_chain_user_address')
        if m.get('start_time_mills') is not None:
            self.start_time_mills = m.get('start_time_mills')
        if m.get('end_time_mills') is not None:
            self.end_time_mills = m.get('end_time_mills')
        return self


class ListIssuerCrossaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[CrossAccountListVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跨链账号明细
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = CrossAccountListVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListDistributorCrossaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
        chain_name: str = None,
        user_id: str = None,
        user_address: str = None,
        login_name: str = None,
        login_account_type: str = None,
        cross_chain_user_address: str = None,
        start_time_mills: int = None,
        end_time_mills: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产项目ID
        self.asset_project_id = asset_project_id
        # 资产项目合约地址
        self.asset_project_address = asset_project_address
        # 项目所在链
        self.chain_name = chain_name
        # 用户ID
        self.user_id = user_id
        # 本侧链用户地址
        self.user_address = user_address
        # 登录名
        self.login_name = login_name
        # 登录名类型(EMAIL)
        self.login_account_type = login_account_type
        # 对侧链用户地址
        self.cross_chain_user_address = cross_chain_user_address
        # 开始时间 (时间戳)
        self.start_time_mills = start_time_mills
        # 结束时间 (时间戳)
        self.end_time_mills = end_time_mills

    def validate(self):
        self.validate_required(self.start_time_mills, 'start_time_mills')
        self.validate_required(self.end_time_mills, 'end_time_mills')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.login_account_type is not None:
            result['login_account_type'] = self.login_account_type
        if self.cross_chain_user_address is not None:
            result['cross_chain_user_address'] = self.cross_chain_user_address
        if self.start_time_mills is not None:
            result['start_time_mills'] = self.start_time_mills
        if self.end_time_mills is not None:
            result['end_time_mills'] = self.end_time_mills
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('login_account_type') is not None:
            self.login_account_type = m.get('login_account_type')
        if m.get('cross_chain_user_address') is not None:
            self.cross_chain_user_address = m.get('cross_chain_user_address')
        if m.get('start_time_mills') is not None:
            self.start_time_mills = m.get('start_time_mills')
        if m.get('end_time_mills') is not None:
            self.end_time_mills = m.get('end_time_mills')
        return self


class ListDistributorCrossaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[CrossAccountListVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跨链账号明细
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = CrossAccountListVO()
                self.data.append(temp_model.from_map(k))
        return self


class CountIssuerDatasummaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        currency: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 币种（目前支持USD、HKD）
        self.currency = currency

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
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class CountIssuerDatasummaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: DataSummaryTotal = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总览统计数据项
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = DataSummaryTotal()
            self.data = temp_model.from_map(m['data'])
        return self


class CountDistributorDatasummaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        currency: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 币种（目前支持USD、HKD）
        self.currency = currency

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
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class CountDistributorDatasummaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: DataSummaryTotal = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总览统计数据项
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = DataSummaryTotal()
            self.data = temp_model.from_map(m['data'])
        return self


class ListIssuerDatasummaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        currency: str = None,
        begin_date: str = None,
        end_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 币种（目前支持USD、HKD）
        self.currency = currency
        # 开始时间(格式：YYYY-MM-DD)
        self.begin_date = begin_date
        # 截止时间(格式：YYYY-MM-DD)
        self.end_date = end_date

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
        if self.currency is not None:
            result['currency'] = self.currency
        if self.begin_date is not None:
            result['begin_date'] = self.begin_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('begin_date') is not None:
            self.begin_date = m.get('begin_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        return self


class ListIssuerDatasummaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[DataSummaryStatisticsItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 历史资产统计列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = DataSummaryStatisticsItem()
                self.data.append(temp_model.from_map(k))
        return self


class ListDistributorDatasummaryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        currency: str = None,
        begin_date: str = None,
        end_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 币种（目前支持USD、HKD）
        self.currency = currency
        # 开始时间
        self.begin_date = begin_date
        # 截止时间
        self.end_date = end_date

    def validate(self):
        if self.begin_date is not None:
            self.validate_pattern(self.begin_date, 'begin_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.end_date is not None:
            self.validate_pattern(self.end_date, 'end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.currency is not None:
            result['currency'] = self.currency
        if self.begin_date is not None:
            result['begin_date'] = self.begin_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('begin_date') is not None:
            self.begin_date = m.get('begin_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        return self


class ListDistributorDatasummaryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[DataSummaryStatisticsItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 历史资产统计列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = DataSummaryStatisticsItem()
                self.data.append(temp_model.from_map(k))
        return self


class ListIssuerInstitutionRequest(TeaModel):
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


class ListIssuerInstitutionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[InstitutionVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 机构列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = InstitutionVO()
                self.data.append(temp_model.from_map(k))
        return self


class PagequeryIssuerKeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_num: int = None,
        page_size: int = None,
        sort_field: str = None,
        key_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页码(默认为第一页)
        self.page_num = page_num
        # 页面显示条数(默认10，最小为5)
        self.page_size = page_size
        # 排序字段
        self.sort_field = sort_field
        # 密钥名称
        self.key_name = key_name

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        if self.page_num is not None:
            self.validate_minimum(self.page_num, 'page_num', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_minimum(self.page_size, 'page_size', 5)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.sort_field is not None:
            result['sort_field'] = self.sort_field
        if self.key_name is not None:
            result['key_name'] = self.key_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('sort_field') is not None:
            self.sort_field = m.get('sort_field')
        if m.get('key_name') is not None:
            self.key_name = m.get('key_name')
        return self


class PagequeryIssuerKeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: KeyPageData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 密钥分页列表
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = KeyPageData()
            self.data = temp_model.from_map(m['data'])
        return self


class DetailIssuerKeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        key_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 密钥id
        self.key_id = key_id

    def validate(self):
        self.validate_required(self.key_id, 'key_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.key_id is not None:
            result['key_id'] = self.key_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        return self


class DetailIssuerKeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: KeyVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 密钥详情
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = KeyVO()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateIssuerKeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        type: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        password: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 密钥名称
        self.name = name
        # 创建类型
        # KEY_FILE：上传密钥文件"
        # CREATE_NEW_KEY：系统创建密钥"
        self.type = type
        # 文件流
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 文件解密密码
        self.password = password

    def validate(self):
        self.validate_required(self.name, 'name')
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
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.password is not None:
            result['password'] = self.password
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('password') is not None:
            self.password = m.get('password')
        return self


class CreateIssuerKeyResponse(TeaModel):
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


class DeleteIssuerKeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        key_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 密钥id
        self.key_id = key_id

    def validate(self):
        self.validate_required(self.key_id, 'key_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.key_id is not None:
            result['key_id'] = self.key_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        return self


class DeleteIssuerKeyResponse(TeaModel):
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


class ListIssuerOperationlogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        start_time_mills: int = None,
        end_time_mills: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 开始时间 (时间戳)
        self.start_time_mills = start_time_mills
        # 结束时间 (时间戳)
        self.end_time_mills = end_time_mills

    def validate(self):
        self.validate_required(self.start_time_mills, 'start_time_mills')
        self.validate_required(self.end_time_mills, 'end_time_mills')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.start_time_mills is not None:
            result['start_time_mills'] = self.start_time_mills
        if self.end_time_mills is not None:
            result['end_time_mills'] = self.end_time_mills
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('start_time_mills') is not None:
            self.start_time_mills = m.get('start_time_mills')
        if m.get('end_time_mills') is not None:
            self.end_time_mills = m.get('end_time_mills')
        return self


class ListIssuerOperationlogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[LoginOperationLogVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 回参
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = LoginOperationLogVO()
                self.data.append(temp_model.from_map(k))
        return self


class ListDistributorOperationlogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        start_time_mills: int = None,
        end_time_mills: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 开始时间 (时间戳)
        self.start_time_mills = start_time_mills
        # 结束时间 (时间戳)
        self.end_time_mills = end_time_mills

    def validate(self):
        self.validate_required(self.start_time_mills, 'start_time_mills')
        self.validate_required(self.end_time_mills, 'end_time_mills')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.start_time_mills is not None:
            result['start_time_mills'] = self.start_time_mills
        if self.end_time_mills is not None:
            result['end_time_mills'] = self.end_time_mills
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('start_time_mills') is not None:
            self.start_time_mills = m.get('start_time_mills')
        if m.get('end_time_mills') is not None:
            self.end_time_mills = m.get('end_time_mills')
        return self


class ListDistributorOperationlogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[LoginOperationLogVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 回参
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = LoginOperationLogVO()
                self.data.append(temp_model.from_map(k))
        return self


class AddIssuerProjectkeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        key_id: str = None,
        key_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id
        # 密钥ID
        self.key_id = key_id
        # 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
        self.key_type = key_type

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.key_id, 'key_id')
        self.validate_required(self.key_type, 'key_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.key_id is not None:
            result['key_id'] = self.key_id
        if self.key_type is not None:
            result['key_type'] = self.key_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        if m.get('key_type') is not None:
            self.key_type = m.get('key_type')
        return self


class AddIssuerProjectkeyResponse(TeaModel):
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


class DeleteIssuerProjectkeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目密钥ID
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DeleteIssuerProjectkeyResponse(TeaModel):
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


class ListIssuerProjectkeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        key_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id
        # 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
        self.key_type = key_type

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.key_type is not None:
            result['key_type'] = self.key_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('key_type') is not None:
            self.key_type = m.get('key_type')
        return self


class ListIssuerProjectkeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AssetProjectKey] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目密钥列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AssetProjectKey()
                self.data.append(temp_model.from_map(k))
        return self


class PagequeryIssuerProjectkeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        key_id: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 密钥ID
        self.key_id = key_id
        # 当前页码(默认为第一页)
        self.page_num = page_num
        # 页面显示条数(默认10，最小为5)
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.key_id, 'key_id')
        self.validate_required(self.page_num, 'page_num')
        if self.page_num is not None:
            self.validate_minimum(self.page_num, 'page_num', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 5)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.key_id is not None:
            result['key_id'] = self.key_id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryIssuerProjectkeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ProjectKeyPageData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目密钥分页信息
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = ProjectKeyPageData()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateIssuerNetvalueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        net_value: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id
        # 项目净值
        self.net_value = net_value

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.net_value, 'net_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.net_value is not None:
            result['net_value'] = self.net_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('net_value') is not None:
            self.net_value = m.get('net_value')
        return self


class UpdateIssuerNetvalueResponse(TeaModel):
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


class ListIssuerNetvalueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class ListIssuerNetvalueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ProjectPerformance] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产历史净值列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ProjectPerformance()
                self.data.append(temp_model.from_map(k))
        return self


class UploadIssuerReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        file_name: str = None,
        file_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id
        # 文件名
        self.file_name = file_name
        # 文件内容(base64)
        self.file_content = file_content

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_content, 'file_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_content is not None:
            result['file_content'] = self.file_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_content') is not None:
            self.file_content = m.get('file_content')
        return self


class UploadIssuerReportResponse(TeaModel):
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


class ListIssuerReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class ListIssuerReportResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ProjectResource] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目报告资源列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ProjectResource()
                self.data.append(temp_model.from_map(k))
        return self


class ListDistributorReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class ListDistributorReportResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ProjectResource] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目报告资源列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ProjectResource()
                self.data.append(temp_model.from_map(k))
        return self


class DownloadIssuerReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        resource_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资源ID
        self.resource_id = resource_id

    def validate(self):
        self.validate_required(self.resource_id, 'resource_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        return self


class DownloadIssuerReportResponse(TeaModel):
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
        # 报告文件下载地址
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


class PreviewIssuerReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        resource_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资源ID
        self.resource_id = resource_id

    def validate(self):
        self.validate_required(self.resource_id, 'resource_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        return self


class PreviewIssuerReportResponse(TeaModel):
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
        # 报告文件预览地址
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


class DownloadDistributorReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        resource_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资源ID
        self.resource_id = resource_id

    def validate(self):
        self.validate_required(self.resource_id, 'resource_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        return self


class DownloadDistributorReportResponse(TeaModel):
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
        # 报告文件下载地址
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


class PreviewDistributorReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        resource_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资源ID
        self.resource_id = resource_id

    def validate(self):
        self.validate_required(self.resource_id, 'resource_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        return self


class PreviewDistributorReportResponse(TeaModel):
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
        # 报告文件预览地址
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


class PagequeryIssuerSubuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_num: int = None,
        page_size: int = None,
        wallet_address: str = None,
        asset_project_address: str = None,
        project_name: str = None,
        project_id: str = None,
        transaction_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页码(默认为第一页)
        self.page_num = page_num
        # 页面显示条数(默认10，最小为5)
        self.page_size = page_size
        # 钱包地址
        self.wallet_address = wallet_address
        # 项目合约地址
        self.asset_project_address = asset_project_address
        # 项目名称
        self.project_name = project_name
        # 项目id
        self.project_id = project_id
        # 数据类型
        # REDEEM
        # ISSUE
        # 不传为全部
        self.transaction_type = transaction_type

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.wallet_address is not None:
            result['wallet_address'] = self.wallet_address
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('wallet_address') is not None:
            self.wallet_address = m.get('wallet_address')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        return self


class PagequeryIssuerSubuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SubUserAccountPageData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 二级用户列表
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = SubUserAccountPageData()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequeryDistributorSubuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_num: int = None,
        page_size: int = None,
        wallet_address: str = None,
        asset_project_address: str = None,
        project_name: str = None,
        project_id: str = None,
        transaction_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页码(默认为第一页)
        self.page_num = page_num
        # 页面显示条数(默认10，最小为5)
        self.page_size = page_size
        # 钱包地址
        self.wallet_address = wallet_address
        # 项目合约地址
        self.asset_project_address = asset_project_address
        # 项目名称
        self.project_name = project_name
        # 项目id
        self.project_id = project_id
        # 数据类型
        # REDEEM
        # ISSUE
        # 不传为全部
        self.transaction_type = transaction_type

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.wallet_address is not None:
            result['wallet_address'] = self.wallet_address
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.transaction_type is not None:
            result['transaction_type'] = self.transaction_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('wallet_address') is not None:
            self.wallet_address = m.get('wallet_address')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('transaction_type') is not None:
            self.transaction_type = m.get('transaction_type')
        return self


class PagequeryDistributorSubuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SubUserAccountPageData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 二级用户列表
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = SubUserAccountPageData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryIssuerSubuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        project_id: str = None,
        institution_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 项目id
        self.project_id = project_id
        # 机构id
        self.institution_id = institution_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.institution_id, 'institution_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.institution_id is not None:
            result['institution_id'] = self.institution_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('institution_id') is not None:
            self.institution_id = m.get('institution_id')
        return self


class QueryIssuerSubuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SubUserAccountVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 二级用户信息
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = SubUserAccountVO()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryDistributorSubuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        institution_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 机构id
        self.institution_id = institution_id
        # 项目id
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.institution_id, 'institution_id')
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.institution_id is not None:
            result['institution_id'] = self.institution_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('institution_id') is not None:
            self.institution_id = m.get('institution_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class QueryDistributorSubuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SubUserAccountVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 二级用户信息
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
            result['data'] = self.data.to_map()
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
            temp_model = SubUserAccountVO()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateDistributorSubuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sub_user_account_id: str = None,
        sub_user_id: str = None,
        sub_user_address: str = None,
        asset_project_id: str = None,
        user_target: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 二级用户账号
        self.sub_user_account_id = sub_user_account_id
        # 用户id
        self.sub_user_id = sub_user_id
        # 二级用户钱包地址
        self.sub_user_address = sub_user_address
        # assetProjectId
        self.asset_project_id = asset_project_id
        # userTarget
        self.user_target = user_target

    def validate(self):
        self.validate_required(self.sub_user_account_id, 'sub_user_account_id')
        self.validate_required(self.asset_project_id, 'asset_project_id')
        self.validate_required(self.user_target, 'user_target')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sub_user_account_id is not None:
            result['sub_user_account_id'] = self.sub_user_account_id
        if self.sub_user_id is not None:
            result['sub_user_id'] = self.sub_user_id
        if self.sub_user_address is not None:
            result['sub_user_address'] = self.sub_user_address
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.user_target is not None:
            result['user_target'] = self.user_target
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sub_user_account_id') is not None:
            self.sub_user_account_id = m.get('sub_user_account_id')
        if m.get('sub_user_id') is not None:
            self.sub_user_id = m.get('sub_user_id')
        if m.get('sub_user_address') is not None:
            self.sub_user_address = m.get('sub_user_address')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('user_target') is not None:
            self.user_target = m.get('user_target')
        return self


class UpdateDistributorSubuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
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


class CreateDistributorSubuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        wallet_address: str = None,
        project_name: str = None,
        project_id: str = None,
        user_target: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 钱包地址
        self.wallet_address = wallet_address
        # 项目名称
        self.project_name = project_name
        # 项目id
        self.project_id = project_id
        # 用户资产配额
        self.user_target = user_target

    def validate(self):
        self.validate_required(self.wallet_address, 'wallet_address')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.user_target, 'user_target')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.wallet_address is not None:
            result['wallet_address'] = self.wallet_address
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.user_target is not None:
            result['user_target'] = self.user_target
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('wallet_address') is not None:
            self.wallet_address = m.get('wallet_address')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('user_target') is not None:
            self.user_target = m.get('user_target')
        return self


class CreateDistributorSubuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
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


class DeleteDistributorSubuserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sub_user_account_id: str = None,
        sub_user_id: str = None,
        sub_user_address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 二级用户账号
        self.sub_user_account_id = sub_user_account_id
        # 用户id
        self.sub_user_id = sub_user_id
        # 二级用户钱包地址
        self.sub_user_address = sub_user_address

    def validate(self):
        self.validate_required(self.sub_user_account_id, 'sub_user_account_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sub_user_account_id is not None:
            result['sub_user_account_id'] = self.sub_user_account_id
        if self.sub_user_id is not None:
            result['sub_user_id'] = self.sub_user_id
        if self.sub_user_address is not None:
            result['sub_user_address'] = self.sub_user_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sub_user_account_id') is not None:
            self.sub_user_account_id = m.get('sub_user_account_id')
        if m.get('sub_user_id') is not None:
            self.sub_user_id = m.get('sub_user_id')
        if m.get('sub_user_address') is not None:
            self.sub_user_address = m.get('sub_user_address')
        return self


class DeleteDistributorSubuserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否删除成功
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


class CountDistributorSubusertargetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目id
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class CountDistributorSubusertargetResponse(TeaModel):
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
        # 用户配额
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


class QueryIssuerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
        user_id: str = None,
        user_address: str = None,
        login_name: str = None,
        login_accout_type: str = None,
        start_time_mills: int = None,
        end_time_mills: int = None,
        chain_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产项目ID
        self.asset_project_id = asset_project_id
        # 资产项目合约地址
        self.asset_project_address = asset_project_address
        # 用户ID
        self.user_id = user_id
        # 用户地址
        self.user_address = user_address
        # 登录名
        self.login_name = login_name
        # 登录名类型(EMAIL)
        self.login_accout_type = login_accout_type
        # 开始时间 (时间戳)
        self.start_time_mills = start_time_mills
        # 结束时间 (时间戳)
        self.end_time_mills = end_time_mills
        # 项目所在链
        self.chain_name = chain_name

    def validate(self):
        self.validate_required(self.start_time_mills, 'start_time_mills')
        self.validate_required(self.end_time_mills, 'end_time_mills')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.login_accout_type is not None:
            result['login_accout_type'] = self.login_accout_type
        if self.start_time_mills is not None:
            result['start_time_mills'] = self.start_time_mills
        if self.end_time_mills is not None:
            result['end_time_mills'] = self.end_time_mills
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('login_accout_type') is not None:
            self.login_accout_type = m.get('login_accout_type')
        if m.get('start_time_mills') is not None:
            self.start_time_mills = m.get('start_time_mills')
        if m.get('end_time_mills') is not None:
            self.end_time_mills = m.get('end_time_mills')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        return self


class QueryIssuerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[SubUserAccountDetailVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户明细列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = SubUserAccountDetailVO()
                self.data.append(temp_model.from_map(k))
        return self


class QueryDistributorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
        chain_name: str = None,
        user_id: str = None,
        user_address: str = None,
        login_name: str = None,
        login_accout_type: str = None,
        start_time_mills: int = None,
        end_time_mills: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产项目ID
        self.asset_project_id = asset_project_id
        # 资产项目合约地址
        self.asset_project_address = asset_project_address
        # 项目所在链
        self.chain_name = chain_name
        # 用户ID
        self.user_id = user_id
        # 用户地址
        self.user_address = user_address
        # 登录名
        self.login_name = login_name
        # 登录名类型(EMAIL)
        self.login_accout_type = login_accout_type
        # 开始时间 (时间戳)
        self.start_time_mills = start_time_mills
        # 结束时间 (时间戳)
        self.end_time_mills = end_time_mills

    def validate(self):
        self.validate_required(self.start_time_mills, 'start_time_mills')
        self.validate_required(self.end_time_mills, 'end_time_mills')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        if self.chain_name is not None:
            result['chain_name'] = self.chain_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.login_accout_type is not None:
            result['login_accout_type'] = self.login_accout_type
        if self.start_time_mills is not None:
            result['start_time_mills'] = self.start_time_mills
        if self.end_time_mills is not None:
            result['end_time_mills'] = self.end_time_mills
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        if m.get('chain_name') is not None:
            self.chain_name = m.get('chain_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('login_accout_type') is not None:
            self.login_accout_type = m.get('login_accout_type')
        if m.get('start_time_mills') is not None:
            self.start_time_mills = m.get('start_time_mills')
        if m.get('end_time_mills') is not None:
            self.end_time_mills = m.get('end_time_mills')
        return self


class QueryDistributorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[SubUserAccountDetailVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户明细列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = SubUserAccountDetailVO()
                self.data.append(temp_model.from_map(k))
        return self


class IssueIssuerSubusertradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sub_user_address: str = None,
        sub_user_account_id: str = None,
        issue_amount: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 二级用户地址
        self.sub_user_address = sub_user_address
        # 二级用户账户ID
        self.sub_user_account_id = sub_user_account_id
        # 发行数量
        self.issue_amount = issue_amount
        # 资产项目ID
        self.asset_project_id = asset_project_id
        # 资产项目链上合约地址
        self.asset_project_address = asset_project_address

    def validate(self):
        self.validate_required(self.sub_user_address, 'sub_user_address')
        self.validate_required(self.sub_user_account_id, 'sub_user_account_id')
        self.validate_required(self.issue_amount, 'issue_amount')
        self.validate_required(self.asset_project_id, 'asset_project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sub_user_address is not None:
            result['sub_user_address'] = self.sub_user_address
        if self.sub_user_account_id is not None:
            result['sub_user_account_id'] = self.sub_user_account_id
        if self.issue_amount is not None:
            result['issue_amount'] = self.issue_amount
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sub_user_address') is not None:
            self.sub_user_address = m.get('sub_user_address')
        if m.get('sub_user_account_id') is not None:
            self.sub_user_account_id = m.get('sub_user_account_id')
        if m.get('issue_amount') is not None:
            self.issue_amount = m.get('issue_amount')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        return self


class IssueIssuerSubusertradeResponse(TeaModel):
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


class RedeemIssuerSubusertradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sub_user_address: str = None,
        sub_user_account_id: str = None,
        redeem_amount: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 二级用户地址
        self.sub_user_address = sub_user_address
        # 二级用户账户ID
        self.sub_user_account_id = sub_user_account_id
        # 赎回数量
        self.redeem_amount = redeem_amount
        # 资产项目ID
        self.asset_project_id = asset_project_id
        # 资产项目链上合约地址
        self.asset_project_address = asset_project_address

    def validate(self):
        self.validate_required(self.sub_user_address, 'sub_user_address')
        self.validate_required(self.sub_user_account_id, 'sub_user_account_id')
        self.validate_required(self.redeem_amount, 'redeem_amount')
        self.validate_required(self.asset_project_id, 'asset_project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sub_user_address is not None:
            result['sub_user_address'] = self.sub_user_address
        if self.sub_user_account_id is not None:
            result['sub_user_account_id'] = self.sub_user_account_id
        if self.redeem_amount is not None:
            result['redeem_amount'] = self.redeem_amount
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sub_user_address') is not None:
            self.sub_user_address = m.get('sub_user_address')
        if m.get('sub_user_account_id') is not None:
            self.sub_user_account_id = m.get('sub_user_account_id')
        if m.get('redeem_amount') is not None:
            self.redeem_amount = m.get('redeem_amount')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        return self


class RedeemIssuerSubusertradeResponse(TeaModel):
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


class TransferIssuerSubusertradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        from_sub_user_address: str = None,
        from_sub_user_account_id: str = None,
        to_sub_user_address: str = None,
        to_sub_user_account_id: str = None,
        transfer_amount: str = None,
        asset_project_id: str = None,
        asset_project_address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # from二级用户地址
        self.from_sub_user_address = from_sub_user_address
        # from二级用户账户ID
        self.from_sub_user_account_id = from_sub_user_account_id
        # to二级用户地址
        self.to_sub_user_address = to_sub_user_address
        # to二级用户账户ID
        self.to_sub_user_account_id = to_sub_user_account_id
        # 转移数量
        self.transfer_amount = transfer_amount
        # 资产项目ID
        self.asset_project_id = asset_project_id
        # 资产项目链上合约地址
        self.asset_project_address = asset_project_address

    def validate(self):
        self.validate_required(self.from_sub_user_address, 'from_sub_user_address')
        self.validate_required(self.from_sub_user_account_id, 'from_sub_user_account_id')
        self.validate_required(self.to_sub_user_address, 'to_sub_user_address')
        self.validate_required(self.transfer_amount, 'transfer_amount')
        self.validate_required(self.asset_project_id, 'asset_project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.from_sub_user_address is not None:
            result['from_sub_user_address'] = self.from_sub_user_address
        if self.from_sub_user_account_id is not None:
            result['from_sub_user_account_id'] = self.from_sub_user_account_id
        if self.to_sub_user_address is not None:
            result['to_sub_user_address'] = self.to_sub_user_address
        if self.to_sub_user_account_id is not None:
            result['to_sub_user_account_id'] = self.to_sub_user_account_id
        if self.transfer_amount is not None:
            result['transfer_amount'] = self.transfer_amount
        if self.asset_project_id is not None:
            result['asset_project_id'] = self.asset_project_id
        if self.asset_project_address is not None:
            result['asset_project_address'] = self.asset_project_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('from_sub_user_address') is not None:
            self.from_sub_user_address = m.get('from_sub_user_address')
        if m.get('from_sub_user_account_id') is not None:
            self.from_sub_user_account_id = m.get('from_sub_user_account_id')
        if m.get('to_sub_user_address') is not None:
            self.to_sub_user_address = m.get('to_sub_user_address')
        if m.get('to_sub_user_account_id') is not None:
            self.to_sub_user_account_id = m.get('to_sub_user_account_id')
        if m.get('transfer_amount') is not None:
            self.transfer_amount = m.get('transfer_amount')
        if m.get('asset_project_id') is not None:
            self.asset_project_id = m.get('asset_project_id')
        if m.get('asset_project_address') is not None:
            self.asset_project_address = m.get('asset_project_address')
        return self


class TransferIssuerSubusertradeResponse(TeaModel):
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


