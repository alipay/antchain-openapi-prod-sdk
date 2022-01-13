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


class MultiCurrencyMoneyOpenApi(TeaModel):
    def __init__(
        self,
        cent: str = None,
        currency_value: str = None,
    ):
        # 最小币种单位
        self.cent = cent
        # 币种
        self.currency_value = currency_value

    def validate(self):
        self.validate_required(self.cent, 'cent')
        self.validate_required(self.currency_value, 'currency_value')

    def to_map(self):
        result = dict()
        if self.cent is not None:
            result['cent'] = self.cent
        if self.currency_value is not None:
            result['currency_value'] = self.currency_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cent') is not None:
            self.cent = m.get('cent')
        if m.get('currency_value') is not None:
            self.currency_value = m.get('currency_value')
        return self


class TestTv(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
    ):
        # 租户ID
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class ChargeRecordVO(TeaModel):
    def __init__(
        self,
        voucher_no: str = None,
        out_biz_no: str = None,
        recharge_time: str = None,
        recharge_status: str = None,
        multi_currency_money_open_api: MultiCurrencyMoneyOpenApi = None,
    ):
        # 充值凭证号
        self.voucher_no = voucher_no
        # 外部单据号
        self.out_biz_no = out_biz_no
        # 充值时间
        self.recharge_time = recharge_time
        # 支付状态（INIT-创建订单/SUCCESS-充值成功/FAIL-充值失败）
        self.recharge_status = recharge_status
        # 金额
        self.multi_currency_money_open_api = multi_currency_money_open_api

    def validate(self):
        self.validate_required(self.voucher_no, 'voucher_no')
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.recharge_time, 'recharge_time')
        self.validate_required(self.recharge_status, 'recharge_status')
        self.validate_required(self.multi_currency_money_open_api, 'multi_currency_money_open_api')
        if self.multi_currency_money_open_api:
            self.multi_currency_money_open_api.validate()

    def to_map(self):
        result = dict()
        if self.voucher_no is not None:
            result['voucher_no'] = self.voucher_no
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.recharge_time is not None:
            result['recharge_time'] = self.recharge_time
        if self.recharge_status is not None:
            result['recharge_status'] = self.recharge_status
        if self.multi_currency_money_open_api is not None:
            result['multi_currency_money_open_api'] = self.multi_currency_money_open_api.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('voucher_no') is not None:
            self.voucher_no = m.get('voucher_no')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('recharge_time') is not None:
            self.recharge_time = m.get('recharge_time')
        if m.get('recharge_status') is not None:
            self.recharge_status = m.get('recharge_status')
        if m.get('multi_currency_money_open_api') is not None:
            temp_model = MultiCurrencyMoneyOpenApi()
            self.multi_currency_money_open_api = temp_model.from_map(m['multi_currency_money_open_api'])
        return self


class QueryBalanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 调用系统来源
        self.source = source

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.source, 'source')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class QueryBalanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        balance: MultiCurrencyMoneyOpenApi = None,
        account_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 余额
        self.balance = balance
        # ALIPAY-客资账户 FINANCE-财资账户
        self.account_type = account_type

    def validate(self):
        if self.balance:
            self.balance.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.balance is not None:
            result['balance'] = self.balance.to_map()
        if self.account_type is not None:
            result['account_type'] = self.account_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('balance') is not None:
            temp_model = MultiCurrencyMoneyOpenApi()
            self.balance = temp_model.from_map(m['balance'])
        if m.get('account_type') is not None:
            self.account_type = m.get('account_type')
        return self


class ChargeCustomerBalanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        recharge_amt: str = None,
        currency_value: str = None,
        return_url: str = None,
        source: str = None,
        recharge_channel: str = None,
        out_biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 充值金额，单位分
        self.recharge_amt = recharge_amt
        # 币种
        self.currency_value = currency_value
        # 用户充值后跳转的地址链接，若不填，则默认跳到中台费用中心页面
        self.return_url = return_url
        # 调用系统appName
        self.source = source
        # 充值渠道，默认传"01"
        self.recharge_channel = recharge_channel
        # 外部单据号，用于幂等
        self.out_biz_no = out_biz_no

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.recharge_amt, 'recharge_amt')
        self.validate_required(self.currency_value, 'currency_value')
        self.validate_required(self.source, 'source')
        self.validate_required(self.recharge_channel, 'recharge_channel')
        self.validate_required(self.out_biz_no, 'out_biz_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.recharge_amt is not None:
            result['recharge_amt'] = self.recharge_amt
        if self.currency_value is not None:
            result['currency_value'] = self.currency_value
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.source is not None:
            result['source'] = self.source
        if self.recharge_channel is not None:
            result['recharge_channel'] = self.recharge_channel
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('recharge_amt') is not None:
            self.recharge_amt = m.get('recharge_amt')
        if m.get('currency_value') is not None:
            self.currency_value = m.get('currency_value')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('recharge_channel') is not None:
            self.recharge_channel = m.get('recharge_channel')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        return self


class ChargeCustomerBalanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cashier_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 收银台URI
        self.cashier_url = cashier_url

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
        if self.cashier_url is not None:
            result['cashier_url'] = self.cashier_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cashier_url') is not None:
            self.cashier_url = m.get('cashier_url')
        return self


class QueryInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        source: str = None,
        ou: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 调用系统名称
        self.source = source
        # 主体信息，不填默认ZL6
        self.ou = ou

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.source, 'source')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.source is not None:
            result['source'] = self.source
        if self.ou is not None:
            result['ou'] = self.ou
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        return self


class QueryInfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        card_id: str = None,
        account_name: str = None,
        bank_name: str = None,
        branch_bank_name: str = None,
        bank_line_number: str = None,
        bank_location: str = None,
        account_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户的银行打款卡号
        self.card_id = card_id
        # 银行户名
        self.account_name = account_name
        # 开户银行
        self.bank_name = bank_name
        # 网点/支行 （客资特有）
        self.branch_bank_name = branch_bank_name
        # 联行号（客资特有）
        self.bank_line_number = bank_line_number
        # 开户地（客资特有）
        self.bank_location = bank_location
        # ALIPAY-客资账户 FINANCE-财资账户
        self.account_type = account_type

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
        if self.card_id is not None:
            result['card_id'] = self.card_id
        if self.account_name is not None:
            result['account_name'] = self.account_name
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.branch_bank_name is not None:
            result['branch_bank_name'] = self.branch_bank_name
        if self.bank_line_number is not None:
            result['bank_line_number'] = self.bank_line_number
        if self.bank_location is not None:
            result['bank_location'] = self.bank_location
        if self.account_type is not None:
            result['account_type'] = self.account_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('card_id') is not None:
            self.card_id = m.get('card_id')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('branch_bank_name') is not None:
            self.branch_bank_name = m.get('branch_bank_name')
        if m.get('bank_line_number') is not None:
            self.bank_line_number = m.get('bank_line_number')
        if m.get('bank_location') is not None:
            self.bank_location = m.get('bank_location')
        if m.get('account_type') is not None:
            self.account_type = m.get('account_type')
        return self


class QueryCustomerChargeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        status: str = None,
        page_no: int = None,
        page_size: int = None,
        source: str = None,
        sort_type: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 若有，则返回相应的状态，INIT/SUCCESS/FAIL
        self.status = status
        # 访问的页码数
        self.page_no = page_no
        # 每页的数量
        self.page_size = page_size
        # 调用系统来源
        self.source = source
        # 1- 按时间升序
        # 2-按时间倒序
        # 不填默认2
        self.sort_type = sort_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.source, 'source')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.status is not None:
            result['status'] = self.status
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.source is not None:
            result['source'] = self.source
        if self.sort_type is not None:
            result['sort_type'] = self.sort_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('sort_type') is not None:
            self.sort_type = m.get('sort_type')
        return self


class QueryCustomerChargeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChargeRecordVO] = None,
        total_items: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 充值记录
        self.result = result
        # 总的数量
        self.total_items = total_items

    def validate(self):
        if self.result:
            for k in self.result:
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
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        if self.total_items is not None:
            result['total_items'] = self.total_items
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChargeRecordVO()
                self.result.append(temp_model.from_map(k))
        if m.get('total_items') is not None:
            self.total_items = m.get('total_items')
        return self


