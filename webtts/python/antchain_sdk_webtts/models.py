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


class QueryBlockchainResponse(TeaModel):
    def __init__(
        self,
        blockchain: str = None,
        chain_type: str = None,
    ):
        # 链名称
        self.blockchain = blockchain
        # 链类型
        self.chain_type = chain_type

    def validate(self):
        self.validate_required(self.blockchain, 'blockchain')
        self.validate_required(self.chain_type, 'chain_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.blockchain is not None:
            result['blockchain'] = self.blockchain
        if self.chain_type is not None:
            result['chain_type'] = self.chain_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('blockchain') is not None:
            self.blockchain = m.get('blockchain')
        if m.get('chain_type') is not None:
            self.chain_type = m.get('chain_type')
        return self


class WithdrawalOrderDetail(TeaModel):
    def __init__(
        self,
        withdrawal_amount: str = None,
    ):
        # withdrawalAmount
        self.withdrawal_amount = withdrawal_amount

    def validate(self):
        self.validate_required(self.withdrawal_amount, 'withdrawal_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.withdrawal_amount is not None:
            result['withdrawal_amount'] = self.withdrawal_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('withdrawal_amount') is not None:
            self.withdrawal_amount = m.get('withdrawal_amount')
        return self


class QueryWhitelistAddressResponse(TeaModel):
    def __init__(
        self,
        whitelist_address: str = None,
        blockchain_list: List[QueryBlockchainResponse] = None,
    ):
        # 白名单地址
        self.whitelist_address = whitelist_address
        # 区块链列表信息
        self.blockchain_list = blockchain_list

    def validate(self):
        self.validate_required(self.whitelist_address, 'whitelist_address')
        self.validate_required(self.blockchain_list, 'blockchain_list')
        if self.blockchain_list:
            for k in self.blockchain_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.whitelist_address is not None:
            result['whitelist_address'] = self.whitelist_address
        result['blockchain_list'] = []
        if self.blockchain_list is not None:
            for k in self.blockchain_list:
                result['blockchain_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('whitelist_address') is not None:
            self.whitelist_address = m.get('whitelist_address')
        self.blockchain_list = []
        if m.get('blockchain_list') is not None:
            for k in m.get('blockchain_list'):
                temp_model = QueryBlockchainResponse()
                self.blockchain_list.append(temp_model.from_map(k))
        return self


class QueryTokenSymbolResponse(TeaModel):
    def __init__(
        self,
        blockchain: str = None,
        token_symbol: str = None,
    ):
        # 链名称
        self.blockchain = blockchain
        # 币种
        self.token_symbol = token_symbol

    def validate(self):
        self.validate_required(self.blockchain, 'blockchain')
        self.validate_required(self.token_symbol, 'token_symbol')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.blockchain is not None:
            result['blockchain'] = self.blockchain
        if self.token_symbol is not None:
            result['token_symbol'] = self.token_symbol
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('blockchain') is not None:
            self.blockchain = m.get('blockchain')
        if m.get('token_symbol') is not None:
            self.token_symbol = m.get('token_symbol')
        return self


class QueryDepositOrderInfoResponse(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        order_type: str = None,
        blockchain: str = None,
        token_symbol: str = None,
        amount: str = None,
        tx_hash: str = None,
        from_address: str = None,
        to_address: str = None,
        create_time: str = None,
        order_status: str = None,
        remark: str = None,
    ):
        # 订单id
        self.order_id = order_id
        # 订单类型
        self.order_type = order_type
        # 区块链名称
        self.blockchain = blockchain
        # 代币名称
        self.token_symbol = token_symbol
        # deposit数量
        self.amount = amount
        # deposit交易hash
        self.tx_hash = tx_hash
        # 交易发起地址，为白名单地址
        self.from_address = from_address
        # 交易接收地址，为托管钱包地址
        self.to_address = to_address
        # 订单创建时间
        self.create_time = create_time
        # 订单状态
        self.order_status = order_status
        # 订单备注
        self.remark = remark

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.order_type, 'order_type')
        self.validate_required(self.blockchain, 'blockchain')
        self.validate_required(self.token_symbol, 'token_symbol')
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.from_address, 'from_address')
        self.validate_required(self.to_address, 'to_address')
        self.validate_required(self.create_time, 'create_time')
        if self.create_time is not None:
            self.validate_pattern(self.create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.order_status, 'order_status')
        self.validate_required(self.remark, 'remark')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.blockchain is not None:
            result['blockchain'] = self.blockchain
        if self.token_symbol is not None:
            result['token_symbol'] = self.token_symbol
        if self.amount is not None:
            result['amount'] = self.amount
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.from_address is not None:
            result['from_address'] = self.from_address
        if self.to_address is not None:
            result['to_address'] = self.to_address
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('blockchain') is not None:
            self.blockchain = m.get('blockchain')
        if m.get('token_symbol') is not None:
            self.token_symbol = m.get('token_symbol')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('from_address') is not None:
            self.from_address = m.get('from_address')
        if m.get('to_address') is not None:
            self.to_address = m.get('to_address')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class WithdrawalOrderDTO(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        order_desc: str = None,
        order_type: str = None,
        order_status: str = None,
        withdrawal_amount: str = None,
    ):
        # orderId
        self.order_id = order_id
        # orderDesc
        self.order_desc = order_desc
        # orderType
        self.order_type = order_type
        # orderStatus:INIT PENDING_CONFIRMATION PENDING_DEPOSIT RUNNING SUCCESS FAILED EXPIRED_CLOSED REFUND REJECTED
        self.order_status = order_status
        # withdrawal Amount
        self.withdrawal_amount = withdrawal_amount

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.order_desc, 'order_desc')
        self.validate_required(self.order_type, 'order_type')
        self.validate_required(self.order_status, 'order_status')
        self.validate_required(self.withdrawal_amount, 'withdrawal_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_desc is not None:
            result['order_desc'] = self.order_desc
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.withdrawal_amount is not None:
            result['withdrawal_amount'] = self.withdrawal_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_desc') is not None:
            self.order_desc = m.get('order_desc')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('withdrawal_amount') is not None:
            self.withdrawal_amount = m.get('withdrawal_amount')
        return self


class WithdrawDacVaultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        external_customer_id: str = None,
        blockchain: str = None,
        token_symbol: str = None,
        withdrawal_amount: str = None,
        withdraw_token_desc: str = None,
        withdrawal_whitelist_address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # customerId of The DAC System
        self.external_customer_id = external_customer_id
        # blockchain:Ethereum Ploygen
        self.blockchain = blockchain
        # Token Token Token identification
        self.token_symbol = token_symbol
        # withdrawal token amount
        self.withdrawal_amount = withdrawal_amount
        # description of requisition and withdrawal application
        self.withdraw_token_desc = withdraw_token_desc
        # the address on the wallet chain of the user_s money withdrawal.
        self.withdrawal_whitelist_address = withdrawal_whitelist_address

    def validate(self):
        self.validate_required(self.external_customer_id, 'external_customer_id')
        self.validate_required(self.blockchain, 'blockchain')
        self.validate_required(self.token_symbol, 'token_symbol')
        self.validate_required(self.withdrawal_amount, 'withdrawal_amount')
        self.validate_required(self.withdrawal_whitelist_address, 'withdrawal_whitelist_address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.external_customer_id is not None:
            result['external_customer_id'] = self.external_customer_id
        if self.blockchain is not None:
            result['blockchain'] = self.blockchain
        if self.token_symbol is not None:
            result['token_symbol'] = self.token_symbol
        if self.withdrawal_amount is not None:
            result['withdrawal_amount'] = self.withdrawal_amount
        if self.withdraw_token_desc is not None:
            result['withdraw_token_desc'] = self.withdraw_token_desc
        if self.withdrawal_whitelist_address is not None:
            result['withdrawal_whitelist_address'] = self.withdrawal_whitelist_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('external_customer_id') is not None:
            self.external_customer_id = m.get('external_customer_id')
        if m.get('blockchain') is not None:
            self.blockchain = m.get('blockchain')
        if m.get('token_symbol') is not None:
            self.token_symbol = m.get('token_symbol')
        if m.get('withdrawal_amount') is not None:
            self.withdrawal_amount = m.get('withdrawal_amount')
        if m.get('withdraw_token_desc') is not None:
            self.withdraw_token_desc = m.get('withdraw_token_desc')
        if m.get('withdrawal_whitelist_address') is not None:
            self.withdrawal_whitelist_address = m.get('withdrawal_whitelist_address')
        return self


class WithdrawDacVaultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        withdrawal_order_detail: WithdrawalOrderDetail = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # withdrawal order detail
        self.withdrawal_order_detail = withdrawal_order_detail

    def validate(self):
        if self.withdrawal_order_detail:
            self.withdrawal_order_detail.validate()

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
        if self.withdrawal_order_detail is not None:
            result['withdrawal_order_detail'] = self.withdrawal_order_detail.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('withdrawal_order_detail') is not None:
            temp_model = WithdrawalOrderDetail()
            self.withdrawal_order_detail = temp_model.from_map(m['withdrawal_order_detail'])
        return self


class OpenActivateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        address: str = None,
        external_customer_id: str = None,
        sex: str = None,
        username: str = None,
        birth_date: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 地址
        self.address = address
        # 外部客户id
        self.external_customer_id = external_customer_id
        # 客户性别
        self.sex = sex
        # 用户名
        self.username = username
        # 出生日期
        self.birth_date = birth_date

    def validate(self):
        self.validate_required(self.address, 'address')
        self.validate_required(self.external_customer_id, 'external_customer_id')
        self.validate_required(self.sex, 'sex')
        self.validate_required(self.username, 'username')
        self.validate_required(self.birth_date, 'birth_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.address is not None:
            result['address'] = self.address
        if self.external_customer_id is not None:
            result['external_customer_id'] = self.external_customer_id
        if self.sex is not None:
            result['sex'] = self.sex
        if self.username is not None:
            result['username'] = self.username
        if self.birth_date is not None:
            result['birth_date'] = self.birth_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('external_customer_id') is not None:
            self.external_customer_id = m.get('external_customer_id')
        if m.get('sex') is not None:
            self.sex = m.get('sex')
        if m.get('username') is not None:
            self.username = m.get('username')
        if m.get('birth_date') is not None:
            self.birth_date = m.get('birth_date')
        return self


class OpenActivateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        apply_form_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 表单id
        self.apply_form_id = apply_form_id

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
        if self.apply_form_id is not None:
            result['apply_form_id'] = self.apply_form_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('apply_form_id') is not None:
            self.apply_form_id = m.get('apply_form_id')
        return self


class StopActivateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        external_customer_id: str = None,
        remark: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部客户id
        self.external_customer_id = external_customer_id
        # 备注
        self.remark = remark

    def validate(self):
        self.validate_required(self.external_customer_id, 'external_customer_id')
        self.validate_required(self.remark, 'remark')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.external_customer_id is not None:
            result['external_customer_id'] = self.external_customer_id
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('external_customer_id') is not None:
            self.external_customer_id = m.get('external_customer_id')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class StopActivateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        apply_form_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 表单id
        self.apply_form_id = apply_form_id

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
        if self.apply_form_id is not None:
            result['apply_form_id'] = self.apply_form_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('apply_form_id') is not None:
            self.apply_form_id = m.get('apply_form_id')
        return self


class PagequeryDacBlockchainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页
        self.current = current
        # 每页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.current, 'current')
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryDacBlockchainResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current: str = None,
        page_size: str = None,
        total: int = None,
        list: List[QueryBlockchainResponse] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页
        self.current = current
        # 每页大小
        self.page_size = page_size
        # 总数
        self.total = total
        # 链信息
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
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
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = QueryBlockchainResponse()
                self.list.append(temp_model.from_map(k))
        return self


class PagequeryDacTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current: int = None,
        page_size: int = None,
        blockchain: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页
        self.current = current
        # 每页大小
        self.page_size = page_size
        # 链名称
        self.blockchain = blockchain

    def validate(self):
        self.validate_required(self.current, 'current')
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.blockchain is not None:
            result['blockchain'] = self.blockchain
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('blockchain') is not None:
            self.blockchain = m.get('blockchain')
        return self


class PagequeryDacTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        list: List[QueryTokenSymbolResponse] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页
        self.current = current
        # 每页大小
        self.page_size = page_size
        # 总数
        self.total = total
        # 币种信息
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
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
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = QueryTokenSymbolResponse()
                self.list.append(temp_model.from_map(k))
        return self


class AddDacWhitelistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        external_cust_id: str = None,
        external_cust_name: str = None,
        address: str = None,
        blockchain_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部客户id
        self.external_cust_id = external_cust_id
        # 外部客户名称
        self.external_cust_name = external_cust_name
        # 白名单地址
        self.address = address
        # 区块链网络列表
        self.blockchain_list = blockchain_list

    def validate(self):
        self.validate_required(self.external_cust_id, 'external_cust_id')
        self.validate_required(self.external_cust_name, 'external_cust_name')
        self.validate_required(self.address, 'address')
        self.validate_required(self.blockchain_list, 'blockchain_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.external_cust_id is not None:
            result['external_cust_id'] = self.external_cust_id
        if self.external_cust_name is not None:
            result['external_cust_name'] = self.external_cust_name
        if self.address is not None:
            result['address'] = self.address
        if self.blockchain_list is not None:
            result['blockchain_list'] = self.blockchain_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('external_cust_id') is not None:
            self.external_cust_id = m.get('external_cust_id')
        if m.get('external_cust_name') is not None:
            self.external_cust_name = m.get('external_cust_name')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('blockchain_list') is not None:
            self.blockchain_list = m.get('blockchain_list')
        return self


class AddDacWhitelistResponse(TeaModel):
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


class CheckDacWhitelistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 公钥地址
        self.address = address

    def validate(self):
        self.validate_required(self.address, 'address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.address is not None:
            result['address'] = self.address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('address') is not None:
            self.address = m.get('address')
        return self


class CheckDacWhitelistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        address: str = None,
        blockchain_list: List[str] = None,
        check_result_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 公钥地址
        self.address = address
        # 支持的链列表
        self.blockchain_list = blockchain_list
        # 检查结果类型
        self.check_result_type = check_result_type

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
        if self.address is not None:
            result['address'] = self.address
        if self.blockchain_list is not None:
            result['blockchain_list'] = self.blockchain_list
        if self.check_result_type is not None:
            result['check_result_type'] = self.check_result_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('blockchain_list') is not None:
            self.blockchain_list = m.get('blockchain_list')
        if m.get('check_result_type') is not None:
            self.check_result_type = m.get('check_result_type')
        return self


class QueryDacQuotaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        external_customer_id: str = None,
        blockchain: str = None,
        token_symbol: str = None,
        quota_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # your company external customer id
        self.external_customer_id = external_customer_id
        # blockchain:Ethereum,Polygon,etc
        self.blockchain = blockchain
        # token symbol:USDC,USDT,etc
        self.token_symbol = token_symbol
        # quotaType:DEPOSIT/WITHDRAWAL
        self.quota_type = quota_type

    def validate(self):
        self.validate_required(self.external_customer_id, 'external_customer_id')
        self.validate_required(self.blockchain, 'blockchain')
        self.validate_required(self.token_symbol, 'token_symbol')
        self.validate_required(self.quota_type, 'quota_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.external_customer_id is not None:
            result['external_customer_id'] = self.external_customer_id
        if self.blockchain is not None:
            result['blockchain'] = self.blockchain
        if self.token_symbol is not None:
            result['token_symbol'] = self.token_symbol
        if self.quota_type is not None:
            result['quota_type'] = self.quota_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('external_customer_id') is not None:
            self.external_customer_id = m.get('external_customer_id')
        if m.get('blockchain') is not None:
            self.blockchain = m.get('blockchain')
        if m.get('token_symbol') is not None:
            self.token_symbol = m.get('token_symbol')
        if m.get('quota_type') is not None:
            self.quota_type = m.get('quota_type')
        return self


class QueryDacQuotaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        quota_type: str = None,
        quota_amount: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # quotaType:DEPOSIT/WITHDRAWAL
        self.quota_type = quota_type
        # quotaAmount
        self.quota_amount = quota_amount

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
        if self.quota_type is not None:
            result['quota_type'] = self.quota_type
        if self.quota_amount is not None:
            result['quota_amount'] = self.quota_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('quota_type') is not None:
            self.quota_type = m.get('quota_type')
        if m.get('quota_amount') is not None:
            self.quota_amount = m.get('quota_amount')
        return self


class QueryDacCustodyaddressRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        blockchain: str = None,
        external_customer_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 区块链名称
        self.blockchain = blockchain
        # 外部客户唯一id
        self.external_customer_id = external_customer_id

    def validate(self):
        self.validate_required(self.blockchain, 'blockchain')
        self.validate_required(self.external_customer_id, 'external_customer_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.blockchain is not None:
            result['blockchain'] = self.blockchain
        if self.external_customer_id is not None:
            result['external_customer_id'] = self.external_customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('blockchain') is not None:
            self.blockchain = m.get('blockchain')
        if m.get('external_customer_id') is not None:
            self.external_customer_id = m.get('external_customer_id')
        return self


class QueryDacCustodyaddressResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        custody_address: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户特定区块链的托管钱包地址，用于deposit转账使用
        self.custody_address = custody_address

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
        if self.custody_address is not None:
            result['custody_address'] = self.custody_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('custody_address') is not None:
            self.custody_address = m.get('custody_address')
        return self


class CreateDacDepositRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        whitelist_address: str = None,
        deposit_amount: str = None,
        blockchain: str = None,
        token_symbol: str = None,
        external_customer_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 白名单地址为交易from的地址，用于发起转账操作
        self.whitelist_address = whitelist_address
        # 存入的金额，可以为整数，或者携带小数位，除以精度之后的值
        self.deposit_amount = deposit_amount
        # 区块链名称
        self.blockchain = blockchain
        # token名称
        self.token_symbol = token_symbol
        # 外部客户唯一id
        self.external_customer_id = external_customer_id

    def validate(self):
        self.validate_required(self.whitelist_address, 'whitelist_address')
        self.validate_required(self.deposit_amount, 'deposit_amount')
        self.validate_required(self.blockchain, 'blockchain')
        self.validate_required(self.token_symbol, 'token_symbol')
        self.validate_required(self.external_customer_id, 'external_customer_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.whitelist_address is not None:
            result['whitelist_address'] = self.whitelist_address
        if self.deposit_amount is not None:
            result['deposit_amount'] = self.deposit_amount
        if self.blockchain is not None:
            result['blockchain'] = self.blockchain
        if self.token_symbol is not None:
            result['token_symbol'] = self.token_symbol
        if self.external_customer_id is not None:
            result['external_customer_id'] = self.external_customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('whitelist_address') is not None:
            self.whitelist_address = m.get('whitelist_address')
        if m.get('deposit_amount') is not None:
            self.deposit_amount = m.get('deposit_amount')
        if m.get('blockchain') is not None:
            self.blockchain = m.get('blockchain')
        if m.get('token_symbol') is not None:
            self.token_symbol = m.get('token_symbol')
        if m.get('external_customer_id') is not None:
            self.external_customer_id = m.get('external_customer_id')
        return self


class CreateDacDepositResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单id，订单创建失败时这个值为空
        self.order_id = order_id

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
        return self


class PagequeryDacDepositRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current: int = None,
        page_size: int = None,
        external_customer_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询第几页，从1开始
        self.current = current
        # 每页展示多少条，默认10
        self.page_size = page_size
        # 外部用户唯一id
        self.external_customer_id = external_customer_id

    def validate(self):
        self.validate_required(self.current, 'current')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.external_customer_id, 'external_customer_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.external_customer_id is not None:
            result['external_customer_id'] = self.external_customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('external_customer_id') is not None:
            self.external_customer_id = m.get('external_customer_id')
        return self


class PagequeryDacDepositResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        list: List[QueryDepositOrderInfoResponse] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前第几页，为请求的参数值
        self.current = current
        # 默认每页展示多少条，为请求的参数值
        self.page_size = page_size
        # 一共列表有多少条数据
        self.total = total
        # deposit订单信息列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
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
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = QueryDepositOrderInfoResponse()
                self.list.append(temp_model.from_map(k))
        return self


class QueryDacDepositlimitsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        external_customer_id: str = None,
        token_symbol: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部用户唯一id
        self.external_customer_id = external_customer_id
        # 代币名称
        self.token_symbol = token_symbol

    def validate(self):
        self.validate_required(self.external_customer_id, 'external_customer_id')
        self.validate_required(self.token_symbol, 'token_symbol')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.external_customer_id is not None:
            result['external_customer_id'] = self.external_customer_id
        if self.token_symbol is not None:
            result['token_symbol'] = self.token_symbol
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('external_customer_id') is not None:
            self.external_customer_id = m.get('external_customer_id')
        if m.get('token_symbol') is not None:
            self.token_symbol = m.get('token_symbol')
        return self


class QueryDacDepositlimitsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        deposit_max_amount: str = None,
        deposit_min_amount: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 可以deposit的最大金额
        self.deposit_max_amount = deposit_max_amount
        # 可以deposit的最小金额
        self.deposit_min_amount = deposit_min_amount

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
        if self.deposit_max_amount is not None:
            result['deposit_max_amount'] = self.deposit_max_amount
        if self.deposit_min_amount is not None:
            result['deposit_min_amount'] = self.deposit_min_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('deposit_max_amount') is not None:
            self.deposit_max_amount = m.get('deposit_max_amount')
        if m.get('deposit_min_amount') is not None:
            self.deposit_min_amount = m.get('deposit_min_amount')
        return self


class PagequeryDacWhitelistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current: int = None,
        page_size: int = None,
        external_customer_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前第几个分页，默认为1
        self.current = current
        # 每页展示条数，默认为10
        self.page_size = page_size
        # 外部用户唯一id
        self.external_customer_id = external_customer_id

    def validate(self):
        self.validate_required(self.current, 'current')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.external_customer_id, 'external_customer_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.external_customer_id is not None:
            result['external_customer_id'] = self.external_customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('external_customer_id') is not None:
            self.external_customer_id = m.get('external_customer_id')
        return self


class PagequeryDacWhitelistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        list: List[QueryWhitelistAddressResponse] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前第几页，为前端的请求值
        self.current = current
        # 每页展示多少条，为前端的请求值
        self.page_size = page_size
        # 总共有多少条数据
        self.total = total
        # 返回白名单列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
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
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = QueryWhitelistAddressResponse()
                self.list.append(temp_model.from_map(k))
        return self


