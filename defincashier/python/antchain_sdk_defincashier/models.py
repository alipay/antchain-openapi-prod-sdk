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


class AmountItem(TeaModel):
    def __init__(
        self,
        balance_amount: str = None,
        currency: str = None,
        frozen_balance_amount: str = None,
    ):
        # 余额，单位元
        self.balance_amount = balance_amount
        # 币种，CNY-人民币
        self.currency = currency
        # 冻结余额，单位元
        self.frozen_balance_amount = frozen_balance_amount

    def validate(self):
        self.validate_required(self.balance_amount, 'balance_amount')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.frozen_balance_amount, 'frozen_balance_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.balance_amount is not None:
            result['balance_amount'] = self.balance_amount
        if self.currency is not None:
            result['currency'] = self.currency
        if self.frozen_balance_amount is not None:
            result['frozen_balance_amount'] = self.frozen_balance_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('balance_amount') is not None:
            self.balance_amount = m.get('balance_amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('frozen_balance_amount') is not None:
            self.frozen_balance_amount = m.get('frozen_balance_amount')
        return self


class AccountDTO(TeaModel):
    def __init__(
        self,
        account_no: str = None,
        account_name: str = None,
        offical_name: str = None,
        offical_number: str = None,
    ):
        # 账号
        self.account_no = account_no
        # 户名
        self.account_name = account_name
        # 开户网点
        self.offical_name = offical_name
        # 联行号
        self.offical_number = offical_number

    def validate(self):
        self.validate_required(self.account_no, 'account_no')
        self.validate_required(self.account_name, 'account_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account_no is not None:
            result['account_no'] = self.account_no
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.offical_name is not None:
            result['offical_name'] = self.offical_name
        if self.offical_number is not None:
            result['offical_number'] = self.offical_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_no') is not None:
            self.account_no = m.get('account_no')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('offical_name') is not None:
            self.offical_name = m.get('offical_name')
        if m.get('offical_number') is not None:
            self.offical_number = m.get('offical_number')
        return self


class AccountVO(TeaModel):
    def __init__(
        self,
        account_no: str = None,
        account_name: str = None,
        offical_name: str = None,
        offical_number: str = None,
        status: str = None,
        category: List[str] = None,
        last_pay_fail: bool = None,
        pay_method: List[str] = None,
        type: str = None,
        principal: str = None,
        amount_item: AmountItem = None,
    ):
        # 账号
        self.account_no = account_no
        # 户名
        self.account_name = account_name
        # 开户网点
        self.offical_name = offical_name
        # 联行号
        self.offical_number = offical_number
        # 账号状态
        # 
        self.status = status
        # 分类 BUYER付款账户； SELLER收款账户
        self.category = category
        # 上次支付是否失败
        self.last_pay_fail = last_pay_fail
        # 支付方式 BALANCE余额账户；BILL票据账户
        self.pay_method = pay_method
        # 账户类型 MAIN 银行账户；ECOLLECTION e收宝；Q_PAYEE 通用静默户；
        self.type = type
        # 主体：I-个人；E-企业
        self.principal = principal
        # 金额明细
        self.amount_item = amount_item

    def validate(self):
        self.validate_required(self.account_no, 'account_no')
        self.validate_required(self.account_name, 'account_name')
        self.validate_required(self.offical_name, 'offical_name')
        self.validate_required(self.offical_number, 'offical_number')
        self.validate_required(self.status, 'status')
        if self.amount_item:
            self.amount_item.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account_no is not None:
            result['account_no'] = self.account_no
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.offical_name is not None:
            result['offical_name'] = self.offical_name
        if self.offical_number is not None:
            result['offical_number'] = self.offical_number
        if self.status is not None:
            result['status'] = self.status
        if self.category is not None:
            result['category'] = self.category
        if self.last_pay_fail is not None:
            result['last_pay_fail'] = self.last_pay_fail
        if self.pay_method is not None:
            result['pay_method'] = self.pay_method
        if self.type is not None:
            result['type'] = self.type
        if self.principal is not None:
            result['principal'] = self.principal
        if self.amount_item is not None:
            result['amount_item'] = self.amount_item.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_no') is not None:
            self.account_no = m.get('account_no')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('offical_name') is not None:
            self.offical_name = m.get('offical_name')
        if m.get('offical_number') is not None:
            self.offical_number = m.get('offical_number')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('last_pay_fail') is not None:
            self.last_pay_fail = m.get('last_pay_fail')
        if m.get('pay_method') is not None:
            self.pay_method = m.get('pay_method')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('principal') is not None:
            self.principal = m.get('principal')
        if m.get('amount_item') is not None:
            temp_model = AmountItem()
            self.amount_item = temp_model.from_map(m['amount_item'])
        return self


class AccountQueryResult(TeaModel):
    def __init__(
        self,
        out_member_id: str = None,
        accounts: List[AccountVO] = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 外部业务平台会员ID
        self.out_member_id = out_member_id
        # 账号列表
        self.accounts = accounts
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.out_member_id, 'out_member_id')
        if self.accounts:
            for k in self.accounts:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_member_id is not None:
            result['out_member_id'] = self.out_member_id
        result['accounts'] = []
        if self.accounts is not None:
            for k in self.accounts:
                result['accounts'].append(k.to_map() if k else None)
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_member_id') is not None:
            self.out_member_id = m.get('out_member_id')
        self.accounts = []
        if m.get('accounts') is not None:
            for k in m.get('accounts'):
                temp_model = AccountVO()
                self.accounts.append(temp_model.from_map(k))
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class PaymentCaptureResult(TeaModel):
    def __init__(
        self,
        out_order_id: str = None,
        fund_mode: str = None,
        order_state: str = None,
        available_amount: int = None,
        available_currency: str = None,
        state: str = None,
        out_request_id: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 外部业务平台原始交易号
        self.out_order_id = out_order_id
        # 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
        # 
        self.fund_mode = fund_mode
        # 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
        self.order_state = order_state
        # 可用金额，单位为元。可用金额=总金额-已请款金额-已撤销金额。精确到小数点后两位，取值范围[0.01,100000000]
        self.available_amount = available_amount
        # 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
        self.available_currency = available_currency
        # 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
        self.state = state
        # 外部请求ID，需要支持部分请款/退款的平台必填
        # 
        self.out_request_id = out_request_id
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.out_order_id, 'out_order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_order_id is not None:
            result['out_order_id'] = self.out_order_id
        if self.fund_mode is not None:
            result['fund_mode'] = self.fund_mode
        if self.order_state is not None:
            result['order_state'] = self.order_state
        if self.available_amount is not None:
            result['available_amount'] = self.available_amount
        if self.available_currency is not None:
            result['available_currency'] = self.available_currency
        if self.state is not None:
            result['state'] = self.state
        if self.out_request_id is not None:
            result['out_request_id'] = self.out_request_id
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_order_id') is not None:
            self.out_order_id = m.get('out_order_id')
        if m.get('fund_mode') is not None:
            self.fund_mode = m.get('fund_mode')
        if m.get('order_state') is not None:
            self.order_state = m.get('order_state')
        if m.get('available_amount') is not None:
            self.available_amount = m.get('available_amount')
        if m.get('available_currency') is not None:
            self.available_currency = m.get('available_currency')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('out_request_id') is not None:
            self.out_request_id = m.get('out_request_id')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class PaymentShareConfirmResult(TeaModel):
    def __init__(
        self,
        org_order_id: str = None,
        order_id: str = None,
        out_request_id: str = None,
        state: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 蚂蚁分账申请返回的交易号
        self.org_order_id = org_order_id
        # 蚂蚁分账确认订单ID
        self.order_id = order_id
        # 外部请求ID，幂等字段
        self.out_request_id = out_request_id
        # 分账单状态
        self.state = state
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.org_order_id, 'org_order_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.out_request_id, 'out_request_id')
        self.validate_required(self.state, 'state')
        self.validate_required(self.sub_code, 'sub_code')
        self.validate_required(self.sub_msg, 'sub_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.org_order_id is not None:
            result['org_order_id'] = self.org_order_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.out_request_id is not None:
            result['out_request_id'] = self.out_request_id
        if self.state is not None:
            result['state'] = self.state
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('org_order_id') is not None:
            self.org_order_id = m.get('org_order_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('out_request_id') is not None:
            self.out_request_id = m.get('out_request_id')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class FundItemQueryResult(TeaModel):
    def __init__(
        self,
        platform_member_id: str = None,
        out_order_id: str = None,
        out_request_id: str = None,
        fund_type: str = None,
        state: str = None,
        request_amount: int = None,
        request_currency: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 会员所属业务平台在智能科技的会员ID
        self.platform_member_id = platform_member_id
        # 外部业务平台原始交易号
        self.out_order_id = out_order_id
        # 外部请求ID
        # 
        self.out_request_id = out_request_id
        # 资金操作类型。CAPTURE(请款);CANCEL(撤销/退款);WITHDRAW(提现);
        self.fund_type = fund_type
        # 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
        self.state = state
        # 本次请求金额，单位为元。
        self.request_amount = request_amount
        # 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
        self.request_currency = request_currency
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.platform_member_id, 'platform_member_id')
        self.validate_required(self.out_order_id, 'out_order_id')
        self.validate_required(self.fund_type, 'fund_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.platform_member_id is not None:
            result['platform_member_id'] = self.platform_member_id
        if self.out_order_id is not None:
            result['out_order_id'] = self.out_order_id
        if self.out_request_id is not None:
            result['out_request_id'] = self.out_request_id
        if self.fund_type is not None:
            result['fund_type'] = self.fund_type
        if self.state is not None:
            result['state'] = self.state
        if self.request_amount is not None:
            result['request_amount'] = self.request_amount
        if self.request_currency is not None:
            result['request_currency'] = self.request_currency
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('platform_member_id') is not None:
            self.platform_member_id = m.get('platform_member_id')
        if m.get('out_order_id') is not None:
            self.out_order_id = m.get('out_order_id')
        if m.get('out_request_id') is not None:
            self.out_request_id = m.get('out_request_id')
        if m.get('fund_type') is not None:
            self.fund_type = m.get('fund_type')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('request_amount') is not None:
            self.request_amount = m.get('request_amount')
        if m.get('request_currency') is not None:
            self.request_currency = m.get('request_currency')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class PayOrderOpenApiResult(TeaModel):
    def __init__(
        self,
        platform_member_id: str = None,
        out_order_id: str = None,
        fund_mode: str = None,
        state: str = None,
        order_state: str = None,
        payee_account: AccountDTO = None,
        payment_error_message: str = None,
        sub_code: str = None,
        sub_msg: str = None,
        trade_id: str = None,
    ):
        # 会员所属业务平台在智能科技的会员ID
        self.platform_member_id = platform_member_id
        # 外部订单号
        self.out_order_id = out_order_id
        # 资金模式
        self.fund_mode = fund_mode
        # 支付提交状态
        self.state = state
        # 交易单状态
        self.order_state = order_state
        # 收款账户
        self.payee_account = payee_account
        # 银行或其他支付服务提供方支付结果描述
        self.payment_error_message = payment_error_message
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg
        # 蚂蚁交易单ID
        self.trade_id = trade_id

    def validate(self):
        self.validate_required(self.platform_member_id, 'platform_member_id')
        self.validate_required(self.out_order_id, 'out_order_id')
        self.validate_required(self.fund_mode, 'fund_mode')
        self.validate_required(self.state, 'state')
        self.validate_required(self.order_state, 'order_state')
        self.validate_required(self.payee_account, 'payee_account')
        if self.payee_account:
            self.payee_account.validate()
        self.validate_required(self.payment_error_message, 'payment_error_message')
        self.validate_required(self.sub_code, 'sub_code')
        self.validate_required(self.sub_msg, 'sub_msg')
        self.validate_required(self.trade_id, 'trade_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.platform_member_id is not None:
            result['platform_member_id'] = self.platform_member_id
        if self.out_order_id is not None:
            result['out_order_id'] = self.out_order_id
        if self.fund_mode is not None:
            result['fund_mode'] = self.fund_mode
        if self.state is not None:
            result['state'] = self.state
        if self.order_state is not None:
            result['order_state'] = self.order_state
        if self.payee_account is not None:
            result['payee_account'] = self.payee_account.to_map()
        if self.payment_error_message is not None:
            result['payment_error_message'] = self.payment_error_message
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        if self.trade_id is not None:
            result['trade_id'] = self.trade_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('platform_member_id') is not None:
            self.platform_member_id = m.get('platform_member_id')
        if m.get('out_order_id') is not None:
            self.out_order_id = m.get('out_order_id')
        if m.get('fund_mode') is not None:
            self.fund_mode = m.get('fund_mode')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('order_state') is not None:
            self.order_state = m.get('order_state')
        if m.get('payee_account') is not None:
            temp_model = AccountDTO()
            self.payee_account = temp_model.from_map(m['payee_account'])
        if m.get('payment_error_message') is not None:
            self.payment_error_message = m.get('payment_error_message')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        if m.get('trade_id') is not None:
            self.trade_id = m.get('trade_id')
        return self


class PaymentCreateCheckResult(TeaModel):
    def __init__(
        self,
        result: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 检查是否通过。PASS(检查通过);NOT_PASS(检查不通过)
        self.result = result
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.result, 'result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result is not None:
            result['result'] = self.result
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class InstCodeResult(TeaModel):
    def __init__(
        self,
        channel_member_code: str = None,
        channel_official_number: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 机构编码
        # 
        self.channel_member_code = channel_member_code
        # 机构网点联行号
        # 
        self.channel_official_number = channel_official_number
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.channel_member_code is not None:
            result['channel_member_code'] = self.channel_member_code
        if self.channel_official_number is not None:
            result['channel_official_number'] = self.channel_official_number
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('channel_member_code') is not None:
            self.channel_member_code = m.get('channel_member_code')
        if m.get('channel_official_number') is not None:
            self.channel_official_number = m.get('channel_official_number')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class PaymentCreateResult(TeaModel):
    def __init__(
        self,
        platform_member_id: str = None,
        out_payer_id: str = None,
        out_payee_id: str = None,
        out_order_id: str = None,
        order_state: str = None,
        fund_mode: str = None,
        payee_account: AccountDTO = None,
        sub_code: str = None,
        sub_msg: str = None,
        trade_id: str = None,
    ):
        # 
        # 会员所属业务平台在智能科技的会员ID
        self.platform_member_id = platform_member_id
        # 付款方在外部业务平台的用户ID
        self.out_payer_id = out_payer_id
        # 收款方外部业务平台会员ID，收单场景表示卖家，纯资金场景表示收款方
        self.out_payee_id = out_payee_id
        # 外部业务平台原始交易号
        self.out_order_id = out_order_id
        # 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
        self.order_state = order_state
        # 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
        self.fund_mode = fund_mode
        # 收款方账号
        self.payee_account = payee_account
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg
        # 蚂蚁交易单ID
        self.trade_id = trade_id

    def validate(self):
        self.validate_required(self.platform_member_id, 'platform_member_id')
        self.validate_required(self.out_payer_id, 'out_payer_id')
        self.validate_required(self.out_order_id, 'out_order_id')
        if self.payee_account:
            self.payee_account.validate()
        self.validate_required(self.trade_id, 'trade_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.platform_member_id is not None:
            result['platform_member_id'] = self.platform_member_id
        if self.out_payer_id is not None:
            result['out_payer_id'] = self.out_payer_id
        if self.out_payee_id is not None:
            result['out_payee_id'] = self.out_payee_id
        if self.out_order_id is not None:
            result['out_order_id'] = self.out_order_id
        if self.order_state is not None:
            result['order_state'] = self.order_state
        if self.fund_mode is not None:
            result['fund_mode'] = self.fund_mode
        if self.payee_account is not None:
            result['payee_account'] = self.payee_account.to_map()
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        if self.trade_id is not None:
            result['trade_id'] = self.trade_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('platform_member_id') is not None:
            self.platform_member_id = m.get('platform_member_id')
        if m.get('out_payer_id') is not None:
            self.out_payer_id = m.get('out_payer_id')
        if m.get('out_payee_id') is not None:
            self.out_payee_id = m.get('out_payee_id')
        if m.get('out_order_id') is not None:
            self.out_order_id = m.get('out_order_id')
        if m.get('order_state') is not None:
            self.order_state = m.get('order_state')
        if m.get('fund_mode') is not None:
            self.fund_mode = m.get('fund_mode')
        if m.get('payee_account') is not None:
            temp_model = AccountDTO()
            self.payee_account = temp_model.from_map(m['payee_account'])
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        if m.get('trade_id') is not None:
            self.trade_id = m.get('trade_id')
        return self


class PaymentQueryResult(TeaModel):
    def __init__(
        self,
        platform_member_id: str = None,
        out_payer_id: str = None,
        out_payee_id: str = None,
        out_order_id: str = None,
        fund_mode: str = None,
        order_state: str = None,
        payment_result_code: str = None,
        payment_result_message: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 会员所属业务平台在智能科技的会员ID
        self.platform_member_id = platform_member_id
        # 付款方在外部业务平台的用户ID
        self.out_payer_id = out_payer_id
        # 收款方在外部业务平台的用户ID；收单场景表示卖家，纯资金场景表示收款方
        self.out_payee_id = out_payee_id
        # 外部业务平台原始交易号
        self.out_order_id = out_order_id
        # 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
        self.fund_mode = fund_mode
        # 交易状态。INIT(初始创建);PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);PART_PROCESSING(部分处理中);PART_SUCCESS(部分请款部分退款)
        self.order_state = order_state
        # 银行或其他支付服务提供方结果码
        self.payment_result_code = payment_result_code
        # 银行或其他支付服务提供方支付结果描述
        self.payment_result_message = payment_result_message
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.platform_member_id, 'platform_member_id')
        self.validate_required(self.out_payer_id, 'out_payer_id')
        self.validate_required(self.out_order_id, 'out_order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.platform_member_id is not None:
            result['platform_member_id'] = self.platform_member_id
        if self.out_payer_id is not None:
            result['out_payer_id'] = self.out_payer_id
        if self.out_payee_id is not None:
            result['out_payee_id'] = self.out_payee_id
        if self.out_order_id is not None:
            result['out_order_id'] = self.out_order_id
        if self.fund_mode is not None:
            result['fund_mode'] = self.fund_mode
        if self.order_state is not None:
            result['order_state'] = self.order_state
        if self.payment_result_code is not None:
            result['payment_result_code'] = self.payment_result_code
        if self.payment_result_message is not None:
            result['payment_result_message'] = self.payment_result_message
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('platform_member_id') is not None:
            self.platform_member_id = m.get('platform_member_id')
        if m.get('out_payer_id') is not None:
            self.out_payer_id = m.get('out_payer_id')
        if m.get('out_payee_id') is not None:
            self.out_payee_id = m.get('out_payee_id')
        if m.get('out_order_id') is not None:
            self.out_order_id = m.get('out_order_id')
        if m.get('fund_mode') is not None:
            self.fund_mode = m.get('fund_mode')
        if m.get('order_state') is not None:
            self.order_state = m.get('order_state')
        if m.get('payment_result_code') is not None:
            self.payment_result_code = m.get('payment_result_code')
        if m.get('payment_result_message') is not None:
            self.payment_result_message = m.get('payment_result_message')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class PaymentShareAcceptanceResult(TeaModel):
    def __init__(
        self,
        out_order_id: str = None,
        out_request_id: str = None,
        state: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 外部业务平台原始交易号
        self.out_order_id = out_order_id
        # 外部请求ID，幂等字段
        # 
        self.out_request_id = out_request_id
        # 分账单状态
        self.state = state
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.out_order_id, 'out_order_id')
        self.validate_required(self.out_request_id, 'out_request_id')
        self.validate_required(self.state, 'state')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_order_id is not None:
            result['out_order_id'] = self.out_order_id
        if self.out_request_id is not None:
            result['out_request_id'] = self.out_request_id
        if self.state is not None:
            result['state'] = self.state
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_order_id') is not None:
            self.out_order_id = m.get('out_order_id')
        if m.get('out_request_id') is not None:
            self.out_request_id = m.get('out_request_id')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class AgreementQueryResult(TeaModel):
    def __init__(
        self,
        platform_member_id: str = None,
        out_member_id: str = None,
        product_code: str = None,
        product_name: str = None,
        product_type: str = None,
        signing_time: str = None,
        end_time: str = None,
        active_flag: bool = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 会员所属业务平台在智能科技的会员ID
        self.platform_member_id = platform_member_id
        # 外部业务平台的用户ID
        self.out_member_id = out_member_id
        # 签约产品的产品码
        self.product_code = product_code
        # 签约产品的产品名称
        self.product_name = product_name
        # 签约的产品类型
        # 
        self.product_type = product_type
        # 签约时间
        # 
        self.signing_time = signing_time
        # 到期时间
        self.end_time = end_time
        # 是否有效
        # 
        self.active_flag = active_flag
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.platform_member_id, 'platform_member_id')
        self.validate_required(self.out_member_id, 'out_member_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.platform_member_id is not None:
            result['platform_member_id'] = self.platform_member_id
        if self.out_member_id is not None:
            result['out_member_id'] = self.out_member_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_type is not None:
            result['product_type'] = self.product_type
        if self.signing_time is not None:
            result['signing_time'] = self.signing_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.active_flag is not None:
            result['active_flag'] = self.active_flag
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('platform_member_id') is not None:
            self.platform_member_id = m.get('platform_member_id')
        if m.get('out_member_id') is not None:
            self.out_member_id = m.get('out_member_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        if m.get('signing_time') is not None:
            self.signing_time = m.get('signing_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('active_flag') is not None:
            self.active_flag = m.get('active_flag')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class PaymentCancelResult(TeaModel):
    def __init__(
        self,
        out_order_id: str = None,
        fund_mode: str = None,
        order_state: str = None,
        available_amount: int = None,
        available_currency: str = None,
        state: str = None,
        out_request_id: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 外部业务平台原始交易号
        self.out_order_id = out_order_id
        # 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
        # 
        self.fund_mode = fund_mode
        # 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
        self.order_state = order_state
        # 可用金额，单位为元。可用金额=总金额-已请款金额-已撤销金额。精确到小数点后两位，取值范围[0.01,100000000]
        self.available_amount = available_amount
        # 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
        self.available_currency = available_currency
        # 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
        self.state = state
        # 外部请求ID，需要支持部分请款/退款的平台必填
        # 
        self.out_request_id = out_request_id
        # 业务错误码(为空表示成功，否则为业务错误码)
        self.sub_code = sub_code
        # 业务错误描述
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.out_order_id, 'out_order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_order_id is not None:
            result['out_order_id'] = self.out_order_id
        if self.fund_mode is not None:
            result['fund_mode'] = self.fund_mode
        if self.order_state is not None:
            result['order_state'] = self.order_state
        if self.available_amount is not None:
            result['available_amount'] = self.available_amount
        if self.available_currency is not None:
            result['available_currency'] = self.available_currency
        if self.state is not None:
            result['state'] = self.state
        if self.out_request_id is not None:
            result['out_request_id'] = self.out_request_id
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_order_id') is not None:
            self.out_order_id = m.get('out_order_id')
        if m.get('fund_mode') is not None:
            self.fund_mode = m.get('fund_mode')
        if m.get('order_state') is not None:
            self.order_state = m.get('order_state')
        if m.get('available_amount') is not None:
            self.available_amount = m.get('available_amount')
        if m.get('available_currency') is not None:
            self.available_currency = m.get('available_currency')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('out_request_id') is not None:
            self.out_request_id = m.get('out_request_id')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class QuerySaasPaymentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json请求参数
        self.biz_content = biz_content
        # 编排版本
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QuerySaasPaymentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PaymentQueryResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易查询结果
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
            temp_model = PaymentQueryResult()
            self.data = temp_model.from_map(m['data'])
        return self


class CheckSaasPaymentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json请求参数
        self.biz_content = biz_content
        # 版本号
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class CheckSaasPaymentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PaymentCreateCheckResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易前检查结果
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
            temp_model = PaymentCreateCheckResult()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateSaasPaymentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json请求参数
        self.biz_content = biz_content
        # 版本号
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class CreateSaasPaymentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PaymentCreateResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易创建结果
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
            temp_model = PaymentCreateResult()
            self.data = temp_model.from_map(m['data'])
        return self


class CancelSaasPaymentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json请求参数
        self.biz_content = biz_content
        # 版本号
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class CancelSaasPaymentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PaymentCancelResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易撤销结果
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
            temp_model = PaymentCancelResult()
            self.data = temp_model.from_map(m['data'])
        return self


class QuerySaasAccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json请求参数
        self.biz_content = biz_content
        # 版本号
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QuerySaasAccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AccountQueryResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户查询结果
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
            temp_model = AccountQueryResult()
            self.data = temp_model.from_map(m['data'])
        return self


class QuerySaasFunditemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json请求参数
        self.biz_content = biz_content
        # 版本号
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QuerySaasFunditemResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: FundItemQueryResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资金操作明细查询结果
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
            temp_model = FundItemQueryResult()
            self.data = temp_model.from_map(m['data'])
        return self


class QuerySaasAgreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json请求参数
        self.biz_content = biz_content
        # 版本号
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QuerySaasAgreementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AgreementQueryResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户产品签约结果
        # 
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
            temp_model = AgreementQueryResult()
            self.data = temp_model.from_map(m['data'])
        return self


class CaptureSaasPaymentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json请求参数
        self.biz_content = biz_content
        # 版本号
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class CaptureSaasPaymentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PaymentCaptureResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付请款结果
        # 
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
            temp_model = PaymentCaptureResult()
            self.data = temp_model.from_map(m['data'])
        return self


class QuerySaasInstRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json请求参数
        self.biz_content = biz_content
        # 版本号
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QuerySaasInstResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: InstCodeResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 机构代码查询结果
        # 
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
            temp_model = InstCodeResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ApplySaasShareRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # JSON请求参数
        self.biz_content = biz_content
        # 版本号
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class ApplySaasShareResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PaymentShareAcceptanceResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分账受理结果
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
            temp_model = PaymentShareAcceptanceResult()
            self.data = temp_model.from_map(m['data'])
        return self


class PaySaasPaymentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json请求参数,示例超出限制，完整字段见下文
        # {"out_order_id":"","out_payer_id":{"reference_id_type":"","reference_id":""},"out_payee_id":{"reference_id_type":"","reference_id":""},"order_pay_time":"","payer_detail":{"payer_amount":"","payer_currency":"","account":{"inst_id":"","account_no":"","account_name":"","offical_name":"","offical_number":""},"pay_mode":""},"platform_member_id":""}
        self.biz_content = biz_content
        # 版本号
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.service_version, 'service_version')

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
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class PaySaasPaymentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PaymentShareConfirmResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分账确认接口
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
            temp_model = PaymentShareConfirmResult()
            self.data = temp_model.from_map(m['data'])
        return self


