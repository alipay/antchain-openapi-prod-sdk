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


