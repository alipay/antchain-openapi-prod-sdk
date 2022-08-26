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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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


class CertificationInfo(TeaModel):
    def __init__(
        self,
        certification_flag: bool = None,
        certify_id: str = None,
    ):
        # 是否授权
        self.certification_flag = certification_flag
        # 实人认证唯一标识
        self.certify_id = certify_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.certification_flag is not None:
            result['certification_flag'] = self.certification_flag
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('certification_flag') is not None:
            self.certification_flag = m.get('certification_flag')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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


class CheckAntchainTdmCpfAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        data_owner_identity: str = None,
        authorized_identity: str = None,
        authorized_platform_identity: str = None,
        target_code: str = None,
        auth_agreement: AuthAgreement = None,
        content: AuthProperty = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 流水ID
        self.request_id = request_id
        # 用户ID
        self.data_owner_identity = data_owner_identity
        # 授权机构ID
        self.authorized_identity = authorized_identity
        # 授权端ID
        self.authorized_platform_identity = authorized_platform_identity
        # 授权业务码
        self.target_code = target_code
        # 授权协议
        self.auth_agreement = auth_agreement
        # 扩展字段
        self.content = content

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.authorized_identity, 'authorized_identity')
        self.validate_required(self.target_code, 'target_code')
        if self.auth_agreement:
            self.auth_agreement.validate()
        self.validate_required(self.content, 'content')
        if self.content:
            self.content.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.authorized_identity is not None:
            result['authorized_identity'] = self.authorized_identity
        if self.authorized_platform_identity is not None:
            result['authorized_platform_identity'] = self.authorized_platform_identity
        if self.target_code is not None:
            result['target_code'] = self.target_code
        if self.auth_agreement is not None:
            result['auth_agreement'] = self.auth_agreement.to_map()
        if self.content is not None:
            result['content'] = self.content.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('authorized_identity') is not None:
            self.authorized_identity = m.get('authorized_identity')
        if m.get('authorized_platform_identity') is not None:
            self.authorized_platform_identity = m.get('authorized_platform_identity')
        if m.get('target_code') is not None:
            self.target_code = m.get('target_code')
        if m.get('auth_agreement') is not None:
            temp_model = AuthAgreement()
            self.auth_agreement = temp_model.from_map(m['auth_agreement'])
        if m.get('content') is not None:
            temp_model = AuthProperty()
            self.content = temp_model.from_map(m['content'])
        return self


class CheckAntchainTdmCpfAuthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        if_auth: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否授权
        self.if_auth = if_auth

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
        if self.if_auth is not None:
            result['if_auth'] = self.if_auth
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('if_auth') is not None:
            self.if_auth = m.get('if_auth')
        return self


class ExecAntchainTdmCpfAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        data_owner_identity: str = None,
        data_owner_name: str = None,
        authorized_identity: str = None,
        authorized_name: str = None,
        authorized_platform_identity: str = None,
        target_code: str = None,
        auth_agreement: AuthAgreement = None,
        certification_info: CertificationInfo = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 流水号
        self.request_id = request_id
        # 用户身份证ID
        self.data_owner_identity = data_owner_identity
        # 用户姓名
        self.data_owner_name = data_owner_name
        # 被授权机构ID
        self.authorized_identity = authorized_identity
        # 被授权机构名称
        self.authorized_name = authorized_name
        # 端ID
        self.authorized_platform_identity = authorized_platform_identity
        # 授权标的
        self.target_code = target_code
        # 授权协议
        self.auth_agreement = auth_agreement
        # 核身信息
        self.certification_info = certification_info
        # 扩展字段
        self.content = content

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.authorized_identity, 'authorized_identity')
        self.validate_required(self.target_code, 'target_code')
        self.validate_required(self.auth_agreement, 'auth_agreement')
        if self.auth_agreement:
            self.auth_agreement.validate()
        if self.certification_info:
            self.certification_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.data_owner_identity is not None:
            result['data_owner_identity'] = self.data_owner_identity
        if self.data_owner_name is not None:
            result['data_owner_name'] = self.data_owner_name
        if self.authorized_identity is not None:
            result['authorized_identity'] = self.authorized_identity
        if self.authorized_name is not None:
            result['authorized_name'] = self.authorized_name
        if self.authorized_platform_identity is not None:
            result['authorized_platform_identity'] = self.authorized_platform_identity
        if self.target_code is not None:
            result['target_code'] = self.target_code
        if self.auth_agreement is not None:
            result['auth_agreement'] = self.auth_agreement.to_map()
        if self.certification_info is not None:
            result['certification_info'] = self.certification_info.to_map()
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('data_owner_identity') is not None:
            self.data_owner_identity = m.get('data_owner_identity')
        if m.get('data_owner_name') is not None:
            self.data_owner_name = m.get('data_owner_name')
        if m.get('authorized_identity') is not None:
            self.authorized_identity = m.get('authorized_identity')
        if m.get('authorized_name') is not None:
            self.authorized_name = m.get('authorized_name')
        if m.get('authorized_platform_identity') is not None:
            self.authorized_platform_identity = m.get('authorized_platform_identity')
        if m.get('target_code') is not None:
            self.target_code = m.get('target_code')
        if m.get('auth_agreement') is not None:
            temp_model = AuthAgreement()
            self.auth_agreement = temp_model.from_map(m['auth_agreement'])
        if m.get('certification_info') is not None:
            temp_model = CertificationInfo()
            self.certification_info = temp_model.from_map(m['certification_info'])
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class ExecAntchainTdmCpfAuthResponse(TeaModel):
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
        self.auth_code = auth_code

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


class QueryAntchainTdmCpfAuthRequest(TeaModel):
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
        # 身份证ID
        self.data_owner_identity = data_owner_identity
        # 被授权机构ID
        self.authorized_identity = authorized_identity
        # 端ID
        self.authorized_platform_identity = authorized_platform_identity
        # 标的产品码
        self.target_code = target_code
        # 扩展字段
        self.extend_params = extend_params
        # 授权状态
        self.auth_state = auth_state

    def validate(self):
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        self.validate_required(self.auth_state, 'auth_state')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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


class QueryAntchainTdmCpfAuthResponse(TeaModel):
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
        # 授权记录列表
        self.auth_records = auth_records

    def validate(self):
        if self.auth_records:
            for k in self.auth_records:
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


class CheckAntchainTdmCpfCertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        type: str = None,
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
        # 扫码验真类型
        self.type = type
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
        self.validate_required(self.type, 'type')
        self.validate_required(self.terminal_identity, 'terminal_identity')
        self.validate_required(self.issue_id, 'issue_id')
        self.validate_required(self.data_owner_identity, 'data_owner_identity')
        if self.use_time is not None:
            self.validate_pattern(self.use_time, 'use_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.type is not None:
            result['type'] = self.type
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
        if m.get('type') is not None:
            self.type = m.get('type')
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


class CheckAntchainTdmCpfCertResponse(TeaModel):
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


