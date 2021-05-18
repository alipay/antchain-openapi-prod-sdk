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


class ChainInfo(TeaModel):
    def __init__(
        self,
        block_height: str = None,
        translate_date: str = None,
        tx_hash: str = None,
    ):
        # 块高
        self.block_height = block_height
        # 交易时间
        self.translate_date = translate_date
        # hash(64位)
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.block_height is not None:
            result['block_height'] = self.block_height
        if self.translate_date is not None:
            result['translate_date'] = self.translate_date
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('block_height') is not None:
            self.block_height = m.get('block_height')
        if m.get('translate_date') is not None:
            self.translate_date = m.get('translate_date')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        return self


class AuthAgreement(TeaModel):
    def __init__(
        self,
        auth_agreement_code: str = None,
        auth_agreement_type: str = None,
        auth_begin_time: str = None,
        auth_end_time: str = None,
        auth_count: int = None,
        auth_balance_count: int = None,
    ):
        # 授权协议code
        self.auth_agreement_code = auth_agreement_code
        # 授权协议类型：
        # TIME、时间授权
        # COUNT、次数授权
        # TIME_COUNT、时间范围内次数授权
        self.auth_agreement_type = auth_agreement_type
        # 授权开始ishi见
        self.auth_begin_time = auth_begin_time
        # 授权截止日期
        # 
        # 
        self.auth_end_time = auth_end_time
        # 授权次数
        # 
        # 
        self.auth_count = auth_count
        # 剩余授权次数
        self.auth_balance_count = auth_balance_count

    def validate(self):
        self.validate_required(self.auth_agreement_code, 'auth_agreement_code')
        self.validate_required(self.auth_agreement_type, 'auth_agreement_type')

    def to_map(self):
        result = dict()
        if self.auth_agreement_code is not None:
            result['auth_agreement_code'] = self.auth_agreement_code
        if self.auth_agreement_type is not None:
            result['auth_agreement_type'] = self.auth_agreement_type
        if self.auth_begin_time is not None:
            result['auth_begin_time'] = self.auth_begin_time
        if self.auth_end_time is not None:
            result['auth_end_time'] = self.auth_end_time
        if self.auth_count is not None:
            result['auth_count'] = self.auth_count
        if self.auth_balance_count is not None:
            result['auth_balance_count'] = self.auth_balance_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_agreement_code') is not None:
            self.auth_agreement_code = m.get('auth_agreement_code')
        if m.get('auth_agreement_type') is not None:
            self.auth_agreement_type = m.get('auth_agreement_type')
        if m.get('auth_begin_time') is not None:
            self.auth_begin_time = m.get('auth_begin_time')
        if m.get('auth_end_time') is not None:
            self.auth_end_time = m.get('auth_end_time')
        if m.get('auth_count') is not None:
            self.auth_count = m.get('auth_count')
        if m.get('auth_balance_count') is not None:
            self.auth_balance_count = m.get('auth_balance_count')
        return self


class CertUseParams(TeaModel):
    def __init__(
        self,
        issue_id: str = None,
    ):
        # 证明文件ID
        self.issue_id = issue_id

    def validate(self):
        self.validate_required(self.issue_id, 'issue_id')

    def to_map(self):
        result = dict()
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        return self


class AuthUsedRecord(TeaModel):
    def __init__(
        self,
        authorized_name: str = None,
        auth_code: str = None,
        chain_info: ChainInfo = None,
        extend_params: str = None,
        target_name: str = None,
        tee_data: str = None,
        use_date: str = None,
    ):
        # 被授权租户名称：
        # 
        # 身份证号/统一社会组织机构信用码
        # 
        # 
        self.authorized_name = authorized_name
        # 授权码
        # 
        # 
        self.auth_code = auth_code
        # 链的信息
        self.chain_info = chain_info
        # 扩展字段
        self.extend_params = extend_params
        # 标的物,产品码名称
        # 
        # 
        self.target_name = target_name
        # 授权可信内容
        self.tee_data = tee_data
        # 数据使用时间
        # 
        # 
        self.use_date = use_date

    def validate(self):
        self.validate_required(self.authorized_name, 'authorized_name')
        self.validate_required(self.auth_code, 'auth_code')
        self.validate_required(self.chain_info, 'chain_info')
        if self.chain_info:
            self.chain_info.validate()
        self.validate_required(self.extend_params, 'extend_params')
        self.validate_required(self.target_name, 'target_name')
        self.validate_required(self.use_date, 'use_date')

    def to_map(self):
        result = dict()
        if self.authorized_name is not None:
            result['authorized_name'] = self.authorized_name
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        if self.chain_info is not None:
            result['chain_info'] = self.chain_info.to_map()
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        if self.target_name is not None:
            result['target_name'] = self.target_name
        if self.tee_data is not None:
            result['tee_data'] = self.tee_data
        if self.use_date is not None:
            result['use_date'] = self.use_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('authorized_name') is not None:
            self.authorized_name = m.get('authorized_name')
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        if m.get('chain_info') is not None:
            temp_model = ChainInfo()
            self.chain_info = temp_model.from_map(m['chain_info'])
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        if m.get('target_name') is not None:
            self.target_name = m.get('target_name')
        if m.get('tee_data') is not None:
            self.tee_data = m.get('tee_data')
        if m.get('use_date') is not None:
            self.use_date = m.get('use_date')
        return self


class CertSummary(TeaModel):
    def __init__(
        self,
        issue_id: str = None,
        issue_cert_type: str = None,
        issue_cert_type_desc: str = None,
        issue_time: str = None,
        issue_icon: str = None,
    ):
        # 证明文件ID
        self.issue_id = issue_id
        # 证明文件类型
        self.issue_cert_type = issue_cert_type
        # 证明文件描述
        self.issue_cert_type_desc = issue_cert_type_desc
        # 证明开具时间
        self.issue_time = issue_time
        # 证明图标（未使用）
        self.issue_icon = issue_icon

    def validate(self):
        self.validate_required(self.issue_id, 'issue_id')
        self.validate_required(self.issue_cert_type, 'issue_cert_type')
        self.validate_required(self.issue_cert_type_desc, 'issue_cert_type_desc')
        self.validate_required(self.issue_time, 'issue_time')

    def to_map(self):
        result = dict()
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.issue_cert_type is not None:
            result['issue_cert_type'] = self.issue_cert_type
        if self.issue_cert_type_desc is not None:
            result['issue_cert_type_desc'] = self.issue_cert_type_desc
        if self.issue_time is not None:
            result['issue_time'] = self.issue_time
        if self.issue_icon is not None:
            result['issue_icon'] = self.issue_icon
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('issue_cert_type') is not None:
            self.issue_cert_type = m.get('issue_cert_type')
        if m.get('issue_cert_type_desc') is not None:
            self.issue_cert_type_desc = m.get('issue_cert_type_desc')
        if m.get('issue_time') is not None:
            self.issue_time = m.get('issue_time')
        if m.get('issue_icon') is not None:
            self.issue_icon = m.get('issue_icon')
        return self


class AuthRecord(TeaModel):
    def __init__(
        self,
        authorized_name: str = None,
        auth_agreement: AuthAgreement = None,
        auth_code: str = None,
        auth_date: str = None,
        auth_status: str = None,
        chain_info: ChainInfo = None,
        data_owner_identity: str = None,
        data_owner_name: str = None,
        extend_params: str = None,
        target_name: str = None,
        tee_data: str = None,
    ):
        # 被授权租户名称：
        # 身份证号/统一社会组织机构信用码
        self.authorized_name = authorized_name
        # 授权协议规则
        self.auth_agreement = auth_agreement
        # 授权码
        # 
        # 
        self.auth_code = auth_code
        # 授权时间
        # 
        self.auth_date = auth_date
        # 授权有效状态：
        # 1、生效中、
        # 0、失效
        # 
        # 
        self.auth_status = auth_status
        # 链的信息
        self.chain_info = chain_info
        # 授权租户身份ID：
        # 身份证号/统一社会组织机构信用码
        self.data_owner_identity = data_owner_identity
        # 授权用户名称
        self.data_owner_name = data_owner_name
        # 扩展字段，与target_name拼成可见的授权详情name
        # 
        # 
        self.extend_params = extend_params
        # 标的物名称
        # 
        # 
        self.target_name = target_name
        # 授权可信数据
        self.tee_data = tee_data

    def validate(self):
        self.validate_required(self.authorized_name, 'authorized_name')
        self.validate_required(self.auth_agreement, 'auth_agreement')
        if self.auth_agreement:
            self.auth_agreement.validate()
        self.validate_required(self.auth_code, 'auth_code')
        self.validate_required(self.auth_date, 'auth_date')
        self.validate_required(self.auth_status, 'auth_status')
        self.validate_required(self.chain_info, 'chain_info')
        if self.chain_info:
            self.chain_info.validate()
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.data_owner_name, 'data_owner_name')
        self.validate_required(self.extend_params, 'extend_params')
        self.validate_required(self.target_name, 'target_name')

    def to_map(self):
        result = dict()
        if self.authorized_name is not None:
            result['authorized_name'] = self.authorized_name
        if self.auth_agreement is not None:
            result['auth_agreement'] = self.auth_agreement.to_map()
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        if self.auth_date is not None:
            result['auth_date'] = self.auth_date
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        if self.chain_info is not None:
            result['chain_info'] = self.chain_info.to_map()
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.data_owner_name is not None:
            result['data_owner_name'] = self.data_owner_name
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        if self.target_name is not None:
            result['target_name'] = self.target_name
        if self.tee_data is not None:
            result['tee_data'] = self.tee_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('authorized_name') is not None:
            self.authorized_name = m.get('authorized_name')
        if m.get('auth_agreement') is not None:
            temp_model = AuthAgreement()
            self.auth_agreement = temp_model.from_map(m['auth_agreement'])
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        if m.get('auth_date') is not None:
            self.auth_date = m.get('auth_date')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        if m.get('chain_info') is not None:
            temp_model = ChainInfo()
            self.chain_info = temp_model.from_map(m['chain_info'])
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('data_owner_name') is not None:
            self.data_owner_name = m.get('data_owner_name')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        if m.get('target_name') is not None:
            self.target_name = m.get('target_name')
        if m.get('tee_data') is not None:
            self.tee_data = m.get('tee_data')
        return self


class CpfUserAccountInfo(TeaModel):
    def __init__(
        self,
        account_status: str = None,
        balance: str = None,
        inst_name: str = None,
        account_id: str = None,
    ):
        # 账户状态
        self.account_status = account_status
        # 账户余额
        self.balance = balance
        # 缴纳单位名称
        self.inst_name = inst_name
        # 个人账户
        self.account_id = account_id

    def validate(self):
        self.validate_required(self.account_status, 'account_status')
        self.validate_required(self.balance, 'balance')
        self.validate_required(self.inst_name, 'inst_name')
        self.validate_required(self.account_id, 'account_id')

    def to_map(self):
        result = dict()
        if self.account_status is not None:
            result['account_status'] = self.account_status
        if self.balance is not None:
            result['balance'] = self.balance
        if self.inst_name is not None:
            result['inst_name'] = self.inst_name
        if self.account_id is not None:
            result['account_id'] = self.account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_status') is not None:
            self.account_status = m.get('account_status')
        if m.get('balance') is not None:
            self.balance = m.get('balance')
        if m.get('inst_name') is not None:
            self.inst_name = m.get('inst_name')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        return self


class CertUsageLogVO(TeaModel):
    def __init__(
        self,
        user_name: str = None,
        usage_time: str = None,
        issue_cert_type: str = None,
        issue_cert_type_desc: str = None,
        issue_time: str = None,
        purpose: str = None,
        biz_id: str = None,
    ):
        # 使用方名称
        self.user_name = user_name
        # 使用时间
        self.usage_time = usage_time
        # 证明类型
        self.issue_cert_type = issue_cert_type
        # 证明类型描述
        self.issue_cert_type_desc = issue_cert_type_desc
        # 证明开具时间
        self.issue_time = issue_time
        # 用途
        self.purpose = purpose
        # 业务流水号
        self.biz_id = biz_id

    def validate(self):
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.usage_time, 'usage_time')
        self.validate_required(self.issue_cert_type, 'issue_cert_type')
        self.validate_required(self.issue_cert_type_desc, 'issue_cert_type_desc')
        self.validate_required(self.issue_time, 'issue_time')
        self.validate_required(self.purpose, 'purpose')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.usage_time is not None:
            result['usage_time'] = self.usage_time
        if self.issue_cert_type is not None:
            result['issue_cert_type'] = self.issue_cert_type
        if self.issue_cert_type_desc is not None:
            result['issue_cert_type_desc'] = self.issue_cert_type_desc
        if self.issue_time is not None:
            result['issue_time'] = self.issue_time
        if self.purpose is not None:
            result['purpose'] = self.purpose
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('usage_time') is not None:
            self.usage_time = m.get('usage_time')
        if m.get('issue_cert_type') is not None:
            self.issue_cert_type = m.get('issue_cert_type')
        if m.get('issue_cert_type_desc') is not None:
            self.issue_cert_type_desc = m.get('issue_cert_type_desc')
        if m.get('issue_time') is not None:
            self.issue_time = m.get('issue_time')
        if m.get('purpose') is not None:
            self.purpose = m.get('purpose')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        return self


class IssueCertInfo(TeaModel):
    def __init__(
        self,
        issue_id: str = None,
        issue_time: str = None,
        provider_name: str = None,
        issue_cert_type: str = None,
        deposit_cert_tag: str = None,
        deposit_cert: str = None,
        deposit_cert_pdf: str = None,
        deposit_cert_pdf_qr: str = None,
    ):
        # 证明文件ID
        self.issue_id = issue_id
        # 证明开具时间
        self.issue_time = issue_time
        # 证明开具单位
        self.provider_name = provider_name
        # 证明类型
        self.issue_cert_type = issue_cert_type
        # 证明抬头
        self.deposit_cert_tag = deposit_cert_tag
        # 证明文件png图片存储地址
        self.deposit_cert = deposit_cert
        # 证明文件pdf获取地址(不带二维码)
        self.deposit_cert_pdf = deposit_cert_pdf
        # 证明文件pdf获取地址(带验真码)
        self.deposit_cert_pdf_qr = deposit_cert_pdf_qr

    def validate(self):
        self.validate_required(self.issue_id, 'issue_id')
        self.validate_required(self.issue_time, 'issue_time')
        self.validate_required(self.issue_cert_type, 'issue_cert_type')

    def to_map(self):
        result = dict()
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.issue_time is not None:
            result['issue_time'] = self.issue_time
        if self.provider_name is not None:
            result['provider_name'] = self.provider_name
        if self.issue_cert_type is not None:
            result['issue_cert_type'] = self.issue_cert_type
        if self.deposit_cert_tag is not None:
            result['deposit_cert_tag'] = self.deposit_cert_tag
        if self.deposit_cert is not None:
            result['deposit_cert'] = self.deposit_cert
        if self.deposit_cert_pdf is not None:
            result['deposit_cert_pdf'] = self.deposit_cert_pdf
        if self.deposit_cert_pdf_qr is not None:
            result['deposit_cert_pdf_qr'] = self.deposit_cert_pdf_qr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('issue_time') is not None:
            self.issue_time = m.get('issue_time')
        if m.get('provider_name') is not None:
            self.provider_name = m.get('provider_name')
        if m.get('issue_cert_type') is not None:
            self.issue_cert_type = m.get('issue_cert_type')
        if m.get('deposit_cert_tag') is not None:
            self.deposit_cert_tag = m.get('deposit_cert_tag')
        if m.get('deposit_cert') is not None:
            self.deposit_cert = m.get('deposit_cert')
        if m.get('deposit_cert_pdf') is not None:
            self.deposit_cert_pdf = m.get('deposit_cert_pdf')
        if m.get('deposit_cert_pdf_qr') is not None:
            self.deposit_cert_pdf_qr = m.get('deposit_cert_pdf_qr')
        return self


class AuthProperty(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: List[str] = None,
    ):
        # 地区
        self.key = key
        # {"山西","广东"}
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class CpfUserLoanInfo(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        user_name: str = None,
        po_id: str = None,
        po_name: str = None,
        loan_id: str = None,
        loan_balance: str = None,
        loan_status: str = None,
    ):
        # 用户证件号码
        self.user_id = user_id
        # 证件类型
        self.user_name = user_name
        # 配偶证件号码
        self.po_id = po_id
        # 配偶姓名
        self.po_name = po_name
        # 贷款合同编号
        self.loan_id = loan_id
        # 贷款余额
        self.loan_balance = loan_balance
        # 贷款合同状态
        self.loan_status = loan_status

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.po_id, 'po_id')
        self.validate_required(self.po_name, 'po_name')
        self.validate_required(self.loan_id, 'loan_id')
        self.validate_required(self.loan_balance, 'loan_balance')
        self.validate_required(self.loan_status, 'loan_status')

    def to_map(self):
        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.po_id is not None:
            result['po_id'] = self.po_id
        if self.po_name is not None:
            result['po_name'] = self.po_name
        if self.loan_id is not None:
            result['loan_id'] = self.loan_id
        if self.loan_balance is not None:
            result['loan_balance'] = self.loan_balance
        if self.loan_status is not None:
            result['loan_status'] = self.loan_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('po_id') is not None:
            self.po_id = m.get('po_id')
        if m.get('po_name') is not None:
            self.po_name = m.get('po_name')
        if m.get('loan_id') is not None:
            self.loan_id = m.get('loan_id')
        if m.get('loan_balance') is not None:
            self.loan_balance = m.get('loan_balance')
        if m.get('loan_status') is not None:
            self.loan_status = m.get('loan_status')
        return self


class IssueCertParams(TeaModel):
    def __init__(
        self,
        dkhtbh: str = None,
    ):
        # 贷款合同编号
        self.dkhtbh = dkhtbh

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.dkhtbh is not None:
            result['dkhtbh'] = self.dkhtbh
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('dkhtbh') is not None:
            self.dkhtbh = m.get('dkhtbh')
        return self


class CertificationRequest(TeaModel):
    def __init__(
        self,
        biz_code: str = None,
    ):
        # 认证模式
        self.biz_code = biz_code

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')

    def to_map(self):
        result = dict()
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        return self


class CpfDataUsageLogVO(TeaModel):
    def __init__(
        self,
        user_name: str = None,
        usage_time: str = None,
        data_desc: str = None,
        purpose: str = None,
        biz_id: str = None,
    ):
        # 使用方名称
        self.user_name = user_name
        # 使用时间
        self.usage_time = usage_time
        # 数据项描述
        self.data_desc = data_desc
        # 用途
        self.purpose = purpose
        # 业务流水号
        self.biz_id = biz_id

    def validate(self):
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.usage_time, 'usage_time')
        self.validate_required(self.data_desc, 'data_desc')
        self.validate_required(self.purpose, 'purpose')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        result = dict()
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.usage_time is not None:
            result['usage_time'] = self.usage_time
        if self.data_desc is not None:
            result['data_desc'] = self.data_desc
        if self.purpose is not None:
            result['purpose'] = self.purpose
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('usage_time') is not None:
            self.usage_time = m.get('usage_time')
        if m.get('data_desc') is not None:
            self.data_desc = m.get('data_desc')
        if m.get('purpose') is not None:
            self.purpose = m.get('purpose')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        return self


class CertificationInitResponse(TeaModel):
    def __init__(
        self,
        certify_id: str = None,
        outer_order_no: str = None,
        scene_id: str = None,
    ):
        # 核身认证唯一标识
        self.certify_id = certify_id
        # 商户请求唯一标识
        self.outer_order_no = outer_order_no
        # 场景ID
        self.scene_id = scene_id

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.scene_id, 'scene_id')

    def to_map(self):
        result = dict()
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        return self


class OpenCpfCertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        terminal_identity: str = None,
        issue_cert_type: str = None,
        provider_id: str = None,
        data_owner_identity: str = None,
        data_owner_name: str = None,
        extend_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 端ID
        self.terminal_identity = terminal_identity
        # 证明类型
        self.issue_cert_type = issue_cert_type
        # 公积金中心ID
        self.provider_id = provider_id
        # 数据拥有者ID（身份证ID）
        self.data_owner_identity = data_owner_identity
        # 数据拥有者姓名（真实姓名）
        self.data_owner_name = data_owner_name
        # 请求结构体序列化
        self.extend_params = extend_params

    def validate(self):
        self.validate_required(self.terminal_identity, 'terminal_identity')
        self.validate_required(self.issue_cert_type, 'issue_cert_type')
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.data_owner_name, 'data_owner_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.terminal_identity is not None:
            result['terminal_identity'] = self.terminal_identity
        if self.issue_cert_type is not None:
            result['issue_cert_type'] = self.issue_cert_type
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.data_owner_name is not None:
            result['data_owner_name'] = self.data_owner_name
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('terminal_identity') is not None:
            self.terminal_identity = m.get('terminal_identity')
        if m.get('issue_cert_type') is not None:
            self.issue_cert_type = m.get('issue_cert_type')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('data_owner_name') is not None:
            self.data_owner_name = m.get('data_owner_name')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        return self


class OpenCpfCertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        issue_id: str = None,
        deposit_cert: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证明文件ID
        self.issue_id = issue_id
        # 证明文件获取地址
        self.deposit_cert = deposit_cert

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
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.deposit_cert is not None:
            result['deposit_cert'] = self.deposit_cert
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('deposit_cert') is not None:
            self.deposit_cert = m.get('deposit_cert')
        return self


class ListCpfCertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        terminal_identity: str = None,
        data_owner_identity: str = None,
        issue_cert_type: str = None,
        current_page: int = None,
        page_size: int = None,
        option_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 端ID
        self.terminal_identity = terminal_identity
        # 身份证ID
        self.data_owner_identity = data_owner_identity
        # 证明类型
        self.issue_cert_type = issue_cert_type
        # 当前页码，默认1
        self.current_page = current_page
        # 每页展示数量，默认10
        self.page_size = page_size
        # 时间筛选枚举类型，默认全部
        self.option_time = option_time

    def validate(self):
        self.validate_required(self.terminal_identity, 'terminal_identity')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.issue_cert_type, 'issue_cert_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.terminal_identity is not None:
            result['terminal_identity'] = self.terminal_identity
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.issue_cert_type is not None:
            result['issue_cert_type'] = self.issue_cert_type
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.option_time is not None:
            result['option_time'] = self.option_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('terminal_identity') is not None:
            self.terminal_identity = m.get('terminal_identity')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('issue_cert_type') is not None:
            self.issue_cert_type = m.get('issue_cert_type')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('option_time') is not None:
            self.option_time = m.get('option_time')
        return self


class ListCpfCertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        cert_list: List[CertSummary] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页码
        self.current = current
        # 每页数量
        self.page_size = page_size
        # 记录总数
        self.total = total
        # 证明开具信息列表
        self.cert_list = cert_list

    def validate(self):
        if self.cert_list:
            for k in self.cert_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        result['cert_list'] = []
        if self.cert_list is not None:
            for k in self.cert_list:
                result['cert_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.cert_list = []
        if m.get('cert_list') is not None:
            for k in m.get('cert_list'):
                temp_model = CertSummary()
                self.cert_list.append(temp_model.from_map(k))
        return self


class CheckCpfCertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        terminal_identity: str = None,
        issue_id: str = None,
        data_owner_identity: str = None,
        data_user_identity: str = None,
        data_user_name: str = None,
        purpose: str = None,
        use_time: str = None,
        extend_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部业务流水
        self.biz_id = biz_id
        # 端ID
        self.terminal_identity = terminal_identity
        # 证明ID
        self.issue_id = issue_id
        # 身份证ID
        self.data_owner_identity = data_owner_identity
        # 使用方ID
        self.data_user_identity = data_user_identity
        # 使用方名称
        self.data_user_name = data_user_name
        # 用途
        self.purpose = purpose
        # 使用时间
        self.use_time = use_time
        # 扩展字段
        self.extend_params = extend_params

    def validate(self):
        self.validate_required(self.terminal_identity, 'terminal_identity')
        self.validate_required(self.issue_id, 'issue_id')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.use_time, 'use_time')
        if self.use_time is not None:
            self.validate_pattern(self.use_time, 'use_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.extend_params, 'extend_params')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.terminal_identity is not None:
            result['terminal_identity'] = self.terminal_identity
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.data_user_identity is not None:
            result['data_user_identity'] = self.data_user_identity
        if self.data_user_name is not None:
            result['data_user_name'] = self.data_user_name
        if self.purpose is not None:
            result['purpose'] = self.purpose
        if self.use_time is not None:
            result['use_time'] = self.use_time
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('terminal_identity') is not None:
            self.terminal_identity = m.get('terminal_identity')
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('data_user_identity') is not None:
            self.data_user_identity = m.get('data_user_identity')
        if m.get('data_user_name') is not None:
            self.data_user_name = m.get('data_user_name')
        if m.get('purpose') is not None:
            self.purpose = m.get('purpose')
        if m.get('use_time') is not None:
            self.use_time = m.get('use_time')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        return self


class CheckCpfCertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        issue_id: str = None,
        deposit_cert: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证明ID
        self.issue_id = issue_id
        # 证明文件获取地址
        self.deposit_cert = deposit_cert

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
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.deposit_cert is not None:
            result['deposit_cert'] = self.deposit_cert
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('deposit_cert') is not None:
            self.deposit_cert = m.get('deposit_cert')
        return self


class SaveCpfCertuseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        data_owner_identity: str = None,
        data_owner_name: str = None,
        data_user_identity: str = None,
        data_user_name: str = None,
        terminal_identity: str = None,
        purpose: str = None,
        operate_time: str = None,
        extend_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务流水号
        self.biz_id = biz_id
        # 身份证ID
        self.data_owner_identity = data_owner_identity
        # 姓名
        self.data_owner_name = data_owner_name
        # 用数机构ID
        self.data_user_identity = data_user_identity
        # 用数机构名称
        self.data_user_name = data_user_name
        # 用数端ID
        self.terminal_identity = terminal_identity
        # 用数目的
        self.purpose = purpose
        # 用数时间
        self.operate_time = operate_time
        # 扩展字段
        self.extend_params = extend_params

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.data_owner_name, 'data_owner_name')
        self.validate_required(self.data_user_identity, 'data_user_identity')
        self.validate_required(self.data_user_name, 'data_user_name')
        self.validate_required(self.terminal_identity, 'terminal_identity')
        self.validate_required(self.purpose, 'purpose')
        self.validate_required(self.operate_time, 'operate_time')
        if self.operate_time is not None:
            self.validate_pattern(self.operate_time, 'operate_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.data_owner_name is not None:
            result['data_owner_name'] = self.data_owner_name
        if self.data_user_identity is not None:
            result['data_user_identity'] = self.data_user_identity
        if self.data_user_name is not None:
            result['data_user_name'] = self.data_user_name
        if self.terminal_identity is not None:
            result['terminal_identity'] = self.terminal_identity
        if self.purpose is not None:
            result['purpose'] = self.purpose
        if self.operate_time is not None:
            result['operate_time'] = self.operate_time
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('data_owner_name') is not None:
            self.data_owner_name = m.get('data_owner_name')
        if m.get('data_user_identity') is not None:
            self.data_user_identity = m.get('data_user_identity')
        if m.get('data_user_name') is not None:
            self.data_user_name = m.get('data_user_name')
        if m.get('terminal_identity') is not None:
            self.terminal_identity = m.get('terminal_identity')
        if m.get('purpose') is not None:
            self.purpose = m.get('purpose')
        if m.get('operate_time') is not None:
            self.operate_time = m.get('operate_time')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        return self


class SaveCpfCertuseResponse(TeaModel):
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


class GetCpfCertuseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        terminal_identity: str = None,
        data_user_identity: str = None,
        data_user_name: str = None,
        issue_id: str = None,
        purpose: str = None,
        use_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务流水号
        self.biz_id = biz_id
        # 端ID
        self.terminal_identity = terminal_identity
        # 用数机构ID
        self.data_user_identity = data_user_identity
        # 用数机构
        self.data_user_name = data_user_name
        # 证明文件ID
        self.issue_id = issue_id
        # 使用目的
        self.purpose = purpose
        # 使用时间
        self.use_time = use_time

    def validate(self):
        self.validate_required(self.terminal_identity, 'terminal_identity')
        self.validate_required(self.data_user_identity, 'data_user_identity')
        self.validate_required(self.data_user_name, 'data_user_name')
        self.validate_required(self.issue_id, 'issue_id')
        if self.use_time is not None:
            self.validate_pattern(self.use_time, 'use_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.terminal_identity is not None:
            result['terminal_identity'] = self.terminal_identity
        if self.data_user_identity is not None:
            result['data_user_identity'] = self.data_user_identity
        if self.data_user_name is not None:
            result['data_user_name'] = self.data_user_name
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.purpose is not None:
            result['purpose'] = self.purpose
        if self.use_time is not None:
            result['use_time'] = self.use_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('terminal_identity') is not None:
            self.terminal_identity = m.get('terminal_identity')
        if m.get('data_user_identity') is not None:
            self.data_user_identity = m.get('data_user_identity')
        if m.get('data_user_name') is not None:
            self.data_user_name = m.get('data_user_name')
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('purpose') is not None:
            self.purpose = m.get('purpose')
        if m.get('use_time') is not None:
            self.use_time = m.get('use_time')
        return self


class GetCpfCertuseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        deposit_cert: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 原始文件pdf
        self.deposit_cert = deposit_cert

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
        if self.deposit_cert is not None:
            result['deposit_cert'] = self.deposit_cert
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('deposit_cert') is not None:
            self.deposit_cert = m.get('deposit_cert')
        return self


class GetCpfCertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        issue_id: str = None,
        file_type: str = None,
        terminal_identity: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 证明文件ID
        self.issue_id = issue_id
        # 证明文件存储类型
        self.file_type = file_type
        # 端ID
        self.terminal_identity = terminal_identity

    def validate(self):
        self.validate_required(self.issue_id, 'issue_id')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.terminal_identity, 'terminal_identity')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.terminal_identity is not None:
            result['terminal_identity'] = self.terminal_identity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('terminal_identity') is not None:
            self.terminal_identity = m.get('terminal_identity')
        return self


class GetCpfCertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        issue_id: str = None,
        deposit_cert: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证明文件ID
        self.issue_id = issue_id
        # 证明文件获取地址
        self.deposit_cert = deposit_cert

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
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.deposit_cert is not None:
            result['deposit_cert'] = self.deposit_cert
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('deposit_cert') is not None:
            self.deposit_cert = m.get('deposit_cert')
        return self


class ListCpfCertuseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        terminal_identity: str = None,
        issue_id: str = None,
        option_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 端ID
        self.terminal_identity = terminal_identity
        # 证明ID
        self.issue_id = issue_id
        # 筛选时间 按月份筛选
        self.option_time = option_time

    def validate(self):
        self.validate_required(self.terminal_identity, 'terminal_identity')
        self.validate_required(self.issue_id, 'issue_id')
        if self.option_time is not None:
            self.validate_pattern(self.option_time, 'option_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.terminal_identity is not None:
            result['terminal_identity'] = self.terminal_identity
        if self.issue_id is not None:
            result['issue_id'] = self.issue_id
        if self.option_time is not None:
            result['option_time'] = self.option_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('terminal_identity') is not None:
            self.terminal_identity = m.get('terminal_identity')
        if m.get('issue_id') is not None:
            self.issue_id = m.get('issue_id')
        if m.get('option_time') is not None:
            self.option_time = m.get('option_time')
        return self


class ListCpfCertuseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        use_records: List[CertUsageLogVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用证记录列表
        self.use_records = use_records

    def validate(self):
        if self.use_records:
            for k in self.use_records:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['use_records'] = []
        if self.use_records is not None:
            for k in self.use_records:
                result['use_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.use_records = []
        if m.get('use_records') is not None:
            for k in m.get('use_records'):
                temp_model = CertUsageLogVO()
                self.use_records.append(temp_model.from_map(k))
        return self


class GetCpfDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        data_user_identity: str = None,
        data_user_name: str = None,
        data_owner_identity: str = None,
        data_owner_name: str = None,
        provider_id: str = None,
        data_code: str = None,
        extend_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务流水号
        self.biz_id = biz_id
        # 使用方ID
        self.data_user_identity = data_user_identity
        # 使用方名称
        self.data_user_name = data_user_name
        # 用户ID
        self.data_owner_identity = data_owner_identity
        # 用户姓名
        self.data_owner_name = data_owner_name
        # 数据源ID
        self.provider_id = provider_id
        # 数据项code
        self.data_code = data_code
        # 扩展字段。
        self.extend_params = extend_params

    def validate(self):
        self.validate_required(self.data_user_identity, 'data_user_identity')
        self.validate_required(self.data_user_name, 'data_user_name')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.data_owner_name, 'data_owner_name')
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.data_code, 'data_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.data_user_identity is not None:
            result['data_user_identity'] = self.data_user_identity
        if self.data_user_name is not None:
            result['data_user_name'] = self.data_user_name
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.data_owner_name is not None:
            result['data_owner_name'] = self.data_owner_name
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.data_code is not None:
            result['data_code'] = self.data_code
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('data_user_identity') is not None:
            self.data_user_identity = m.get('data_user_identity')
        if m.get('data_user_name') is not None:
            self.data_user_name = m.get('data_user_name')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('data_owner_name') is not None:
            self.data_owner_name = m.get('data_owner_name')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('data_code') is not None:
            self.data_code = m.get('data_code')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        return self


class GetCpfDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trust_data: str = None,
        data_hash: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # PDF、或结构化信息、或加密数据
        self.trust_data = trust_data
        # 数据hash，数据验真时用
        self.data_hash = data_hash

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
        if self.trust_data is not None:
            result['trust_data'] = self.trust_data
        if self.data_hash is not None:
            result['data_hash'] = self.data_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trust_data') is not None:
            self.trust_data = m.get('trust_data')
        if m.get('data_hash') is not None:
            self.data_hash = m.get('data_hash')
        return self


class ListCpfDatauseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        terminal_identity: str = None,
        data_user_identity: str = None,
        option_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 端ID
        self.terminal_identity = terminal_identity
        # 使用方ID
        self.data_user_identity = data_user_identity
        # 筛选时间，按月份筛选，默认当前月份
        self.option_time = option_time

    def validate(self):
        self.validate_required(self.terminal_identity, 'terminal_identity')
        self.validate_required(self.data_user_identity, 'data_user_identity')
        if self.option_time is not None:
            self.validate_pattern(self.option_time, 'option_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.terminal_identity is not None:
            result['terminal_identity'] = self.terminal_identity
        if self.data_user_identity is not None:
            result['data_user_identity'] = self.data_user_identity
        if self.option_time is not None:
            result['option_time'] = self.option_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('terminal_identity') is not None:
            self.terminal_identity = m.get('terminal_identity')
        if m.get('data_user_identity') is not None:
            self.data_user_identity = m.get('data_user_identity')
        if m.get('option_time') is not None:
            self.option_time = m.get('option_time')
        return self


class ListCpfDatauseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        use_records: List[CpfDataUsageLogVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 机构用数记录
        self.use_records = use_records

    def validate(self):
        if self.use_records:
            for k in self.use_records:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['use_records'] = []
        if self.use_records is not None:
            for k in self.use_records:
                result['use_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.use_records = []
        if m.get('use_records') is not None:
            for k in m.get('use_records'):
                temp_model = CpfDataUsageLogVO()
                self.use_records.append(temp_model.from_map(k))
        return self


class QueryCpfUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        terminal_identity: str = None,
        provider_id: str = None,
        data_owner_identity: str = None,
        data_owner_name: str = None,
        data_owner_identity_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 端ID
        self.terminal_identity = terminal_identity
        # 数据源ID
        self.provider_id = provider_id
        # 用户身份证ID
        self.data_owner_identity = data_owner_identity
        # 用户姓名
        self.data_owner_name = data_owner_name
        # 证件类型
        self.data_owner_identity_type = data_owner_identity_type

    def validate(self):
        self.validate_required(self.terminal_identity, 'terminal_identity')
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.data_owner_name, 'data_owner_name')
        self.validate_required(self.data_owner_identity_type, 'data_owner_identity_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.terminal_identity is not None:
            result['terminal_identity'] = self.terminal_identity
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.data_owner_name is not None:
            result['data_owner_name'] = self.data_owner_name
        if self.data_owner_identity_type is not None:
            result['data_owner_identity_type'] = self.data_owner_identity_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('terminal_identity') is not None:
            self.terminal_identity = m.get('terminal_identity')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('data_owner_name') is not None:
            self.data_owner_name = m.get('data_owner_name')
        if m.get('data_owner_identity_type') is not None:
            self.data_owner_identity_type = m.get('data_owner_identity_type')
        return self


class QueryCpfUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_account_info: List[CpfUserAccountInfo] = None,
        user_loan_info: List[CpfUserLoanInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 个人账户信息
        self.user_account_info = user_account_info
        # 贷款信息
        self.user_loan_info = user_loan_info

    def validate(self):
        if self.user_account_info:
            for k in self.user_account_info:
                if k:
                    k.validate()
        if self.user_loan_info:
            for k in self.user_loan_info:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['user_account_info'] = []
        if self.user_account_info is not None:
            for k in self.user_account_info:
                result['user_account_info'].append(k.to_map() if k else None)
        result['user_loan_info'] = []
        if self.user_loan_info is not None:
            for k in self.user_loan_info:
                result['user_loan_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.user_account_info = []
        if m.get('user_account_info') is not None:
            for k in m.get('user_account_info'):
                temp_model = CpfUserAccountInfo()
                self.user_account_info.append(temp_model.from_map(k))
        self.user_loan_info = []
        if m.get('user_loan_info') is not None:
            for k in m.get('user_loan_info'):
                temp_model = CpfUserLoanInfo()
                self.user_loan_info.append(temp_model.from_map(k))
        return self


class ExecAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        authorized_identity: str = None,
        authorized_platform_identity: str = None,
        auth_agreement: AuthAgreement = None,
        content: str = None,
        data_owner_identity: str = None,
        request_id: str = None,
        target_code: str = None,
        certification_type: str = None,
        certification_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被授权租户身份ID：
        # 
        # 身份证号/统一社会组织机构信用码
        self.authorized_identity = authorized_identity
        # 分配code
        # 
        # 
        self.authorized_platform_identity = authorized_platform_identity
        # 授权协议
        self.auth_agreement = auth_agreement
        # 扩展字段,目前是一个json串，传入相关附加信息，如果对应的附加信息key不需要，可以不传，
        # 
        # key对应的value数据字典由平台提供
        self.content = content
        # 授权租户身份ID：
        # 身份证号/统一社会组织机构信用码
        # 
        # 
        self.data_owner_identity = data_owner_identity
        # 请求流水号(64位 由平台方定义)_
        # 幂等标示
        self.request_id = request_id
        # 标的物
        # 
        # 
        self.target_code = target_code
        # 核身产品类型
        self.certification_type = certification_type
        # 核身信息
        # 
        # 
        self.certification_info = certification_info

    def validate(self):
        self.validate_required(self.authorized_identity, 'authorized_identity')
        self.validate_required(self.authorized_platform_identity, 'authorized_platform_identity')
        self.validate_required(self.auth_agreement, 'auth_agreement')
        if self.auth_agreement:
            self.auth_agreement.validate()
        self.validate_required(self.content, 'content')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.target_code, 'target_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.authorized_identity is not None:
            result['authorized_identity'] = self.authorized_identity
        if self.authorized_platform_identity is not None:
            result['authorized_platform_identity'] = self.authorized_platform_identity
        if self.auth_agreement is not None:
            result['auth_agreement'] = self.auth_agreement.to_map()
        if self.content is not None:
            result['content'] = self.content
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.target_code is not None:
            result['target_code'] = self.target_code
        if self.certification_type is not None:
            result['certification_type'] = self.certification_type
        if self.certification_info is not None:
            result['certification_info'] = self.certification_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('authorized_identity') is not None:
            self.authorized_identity = m.get('authorized_identity')
        if m.get('authorized_platform_identity') is not None:
            self.authorized_platform_identity = m.get('authorized_platform_identity')
        if m.get('auth_agreement') is not None:
            temp_model = AuthAgreement()
            self.auth_agreement = temp_model.from_map(m['auth_agreement'])
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('target_code') is not None:
            self.target_code = m.get('target_code')
        if m.get('certification_type') is not None:
            self.certification_type = m.get('certification_type')
        if m.get('certification_info') is not None:
            self.certification_info = m.get('certification_info')
        return self


class ExecAuthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权码
        # 
        # 
        self.auth_code = auth_code

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
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        return self


class CancelAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_owner_identity: str = None,
        authorized_platform_identity: str = None,
        auth_code: str = None,
        certification_info: str = None,
        request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权租户身份ID：
        # 身份证号/统一社会组织机构信用码
        self.data_owner_identity = data_owner_identity
        # 分配code
        self.authorized_platform_identity = authorized_platform_identity
        # 标的物，查询授权接口返回
        # 
        # 
        self.auth_code = auth_code
        # 核身信息
        # 
        self.certification_info = certification_info
        # 请求流水号
        # 
        # 幂等标示
        # 
        # 
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.authorized_platform_identity, 'authorized_platform_identity')
        self.validate_required(self.auth_code, 'auth_code')
        self.validate_required(self.certification_info, 'certification_info')
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.authorized_platform_identity is not None:
            result['authorized_platform_identity'] = self.authorized_platform_identity
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        if self.certification_info is not None:
            result['certification_info'] = self.certification_info
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('authorized_platform_identity') is not None:
            self.authorized_platform_identity = m.get('authorized_platform_identity')
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        if m.get('certification_info') is not None:
            self.certification_info = m.get('certification_info')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class CancelAuthResponse(TeaModel):
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


class QueryAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        authorized_identity: str = None,
        authorized_platform_identity: str = None,
        data_owner_identity: str = None,
        extend_params: str = None,
        target_code: str = None,
        request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被授权租户身份ID：
        # 身份证号/统一社会组织机构信用码
        self.authorized_identity = authorized_identity
        # 分配code
        # 
        # 
        self.authorized_platform_identity = authorized_platform_identity
        # 授权租户身份ID：
        # 身份证号/统一社会组织机构信用码
        self.data_owner_identity = data_owner_identity
        # 扩展信息
        self.extend_params = extend_params
        # 标的物
        # 
        # 
        self.target_code = target_code
        # 请求流水号幂等标示
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.authorized_identity, 'authorized_identity')
        self.validate_required(self.authorized_platform_identity, 'authorized_platform_identity')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.extend_params, 'extend_params')
        self.validate_required(self.target_code, 'target_code')
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.authorized_identity is not None:
            result['authorized_identity'] = self.authorized_identity
        if self.authorized_platform_identity is not None:
            result['authorized_platform_identity'] = self.authorized_platform_identity
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        if self.target_code is not None:
            result['target_code'] = self.target_code
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('authorized_identity') is not None:
            self.authorized_identity = m.get('authorized_identity')
        if m.get('authorized_platform_identity') is not None:
            self.authorized_platform_identity = m.get('authorized_platform_identity')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        if m.get('target_code') is not None:
            self.target_code = m.get('target_code')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryAuthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trust_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 缴存证明数据(json格式数据)
        self.trust_data = trust_data

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
        if self.trust_data is not None:
            result['trust_data'] = self.trust_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trust_data') is not None:
            self.trust_data = m.get('trust_data')
        return self


class QueryAuthOwnerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_owner_identity: str = None,
        authorized_identity: str = None,
        authorized_platform_identity: str = None,
        target_code: str = None,
        extend_params: str = None,
        auth_state: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 授权租户身份ID：
        # 身份证号/统一社会组织机构信用码
        self.data_owner_identity = data_owner_identity
        # 被授权租户身份ID：
        # 身份证号/统一社会组织机构信用码
        self.authorized_identity = authorized_identity
        # 分配code
        # 
        # 
        self.authorized_platform_identity = authorized_platform_identity
        # 标的物
        # 
        # 
        self.target_code = target_code
        # 扩展字段
        # 
        # 
        self.extend_params = extend_params
        # "1", "授权激活状态"
        # "2", "授权取消"
        # "3", "授权过期"
        self.auth_state = auth_state

    def validate(self):
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.authorized_platform_identity, 'authorized_platform_identity')
        self.validate_required(self.auth_state, 'auth_state')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.authorized_identity is not None:
            result['authorized_identity'] = self.authorized_identity
        if self.authorized_platform_identity is not None:
            result['authorized_platform_identity'] = self.authorized_platform_identity
        if self.target_code is not None:
            result['target_code'] = self.target_code
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        if self.auth_state is not None:
            result['auth_state'] = self.auth_state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('authorized_identity') is not None:
            self.authorized_identity = m.get('authorized_identity')
        if m.get('authorized_platform_identity') is not None:
            self.authorized_platform_identity = m.get('authorized_platform_identity')
        if m.get('target_code') is not None:
            self.target_code = m.get('target_code')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        if m.get('auth_state') is not None:
            self.auth_state = m.get('auth_state')
        return self


class QueryAuthOwnerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_records: List[AuthRecord] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权记录集合
        self.auth_records = auth_records

    def validate(self):
        if self.auth_records:
            for k in self.auth_records:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['auth_records'] = []
        if self.auth_records is not None:
            for k in self.auth_records:
                result['auth_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.auth_records = []
        if m.get('auth_records') is not None:
            for k in m.get('auth_records'):
                temp_model = AuthRecord()
                self.auth_records.append(temp_model.from_map(k))
        return self


class QueryAuthuseOwnerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        authorized_platform_identity: str = None,
        auth_code: str = None,
        data_owner_identity: str = None,
        extend_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分配code
        # 
        # 
        self.authorized_platform_identity = authorized_platform_identity
        # 授权码
        # 
        # 
        self.auth_code = auth_code
        # 授权租户身份ID：
        # 
        # 身份证号/统一社会组织机构信用码
        self.data_owner_identity = data_owner_identity
        # 扩展字段
        self.extend_params = extend_params

    def validate(self):
        self.validate_required(self.authorized_platform_identity, 'authorized_platform_identity')
        self.validate_required(self.auth_code, 'auth_code')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.authorized_platform_identity is not None:
            result['authorized_platform_identity'] = self.authorized_platform_identity
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('authorized_platform_identity') is not None:
            self.authorized_platform_identity = m.get('authorized_platform_identity')
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        return self


class QueryAuthuseOwnerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        use_records: List[AuthUsedRecord] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权使用记录
        # 
        # 
        self.use_records = use_records

    def validate(self):
        if self.use_records:
            for k in self.use_records:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['use_records'] = []
        if self.use_records is not None:
            for k in self.use_records:
                result['use_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.use_records = []
        if m.get('use_records') is not None:
            for k in m.get('use_records'):
                temp_model = AuthUsedRecord()
                self.use_records.append(temp_model.from_map(k))
        return self


class ExecAuthuseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        authorized_identity: str = None,
        authorized_platform_identity: str = None,
        data_owner_identity: str = None,
        extend_params: str = None,
        request_id: str = None,
        target_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被授权租户身份ID：
        # 
        # 身份证号/统一社会组织机构信用码
        # 
        # 
        self.authorized_identity = authorized_identity
        # 分配code
        # 
        # 
        self.authorized_platform_identity = authorized_platform_identity
        # 授权租户身份ID：
        # 身份证号/统一社会组织机构信用码
        self.data_owner_identity = data_owner_identity
        # 扩展字段
        # 
        # 
        self.extend_params = extend_params
        # 请求流水号
        # 
        # 幂等标示
        # 
        # 
        self.request_id = request_id
        # 标的物
        # 
        # 
        self.target_code = target_code

    def validate(self):
        self.validate_required(self.authorized_identity, 'authorized_identity')
        self.validate_required(self.authorized_platform_identity, 'authorized_platform_identity')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.extend_params, 'extend_params')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.target_code, 'target_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.authorized_identity is not None:
            result['authorized_identity'] = self.authorized_identity
        if self.authorized_platform_identity is not None:
            result['authorized_platform_identity'] = self.authorized_platform_identity
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.target_code is not None:
            result['target_code'] = self.target_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('authorized_identity') is not None:
            self.authorized_identity = m.get('authorized_identity')
        if m.get('authorized_platform_identity') is not None:
            self.authorized_platform_identity = m.get('authorized_platform_identity')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('target_code') is not None:
            self.target_code = m.get('target_code')
        return self


class ExecAuthuseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trust_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 缴存证明数据
        # 
        # 
        self.trust_data = trust_data

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
        if self.trust_data is not None:
            result['trust_data'] = self.trust_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trust_data') is not None:
            self.trust_data = m.get('trust_data')
        return self


class InitVerifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        authorized_identity: str = None,
        authorized_platform_identity: str = None,
        certification_type: str = None,
        certification_request: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被授权机构ID（统一社会信用代码）
        self.authorized_identity = authorized_identity
        # 核身发起端
        self.authorized_platform_identity = authorized_platform_identity
        # 刷脸产品类型
        self.certification_type = certification_type
        # 核身初始化请求信息
        self.certification_request = certification_request

    def validate(self):
        self.validate_required(self.authorized_identity, 'authorized_identity')
        self.validate_required(self.authorized_platform_identity, 'authorized_platform_identity')
        self.validate_required(self.certification_type, 'certification_type')
        self.validate_required(self.certification_request, 'certification_request')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.authorized_identity is not None:
            result['authorized_identity'] = self.authorized_identity
        if self.authorized_platform_identity is not None:
            result['authorized_platform_identity'] = self.authorized_platform_identity
        if self.certification_type is not None:
            result['certification_type'] = self.certification_type
        if self.certification_request is not None:
            result['certification_request'] = self.certification_request
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('authorized_identity') is not None:
            self.authorized_identity = m.get('authorized_identity')
        if m.get('authorized_platform_identity') is not None:
            self.authorized_platform_identity = m.get('authorized_platform_identity')
        if m.get('certification_type') is not None:
            self.certification_type = m.get('certification_type')
        if m.get('certification_request') is not None:
            self.certification_request = m.get('certification_request')
        return self


class InitVerifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_obj: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核身初始化返回信息
        self.result_obj = result_obj

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
        if self.result_obj is not None:
            result['result_obj'] = self.result_obj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_obj') is not None:
            self.result_obj = m.get('result_obj')
        return self


