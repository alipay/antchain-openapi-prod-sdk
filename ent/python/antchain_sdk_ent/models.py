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


class Revenue(TeaModel):
    def __init__(
        self,
        currency: str = None,
        value: int = None,
    ):
        # 收益币种，目前仅支持CNY
        self.currency = currency
        # 收益金额，单位为分
        self.value = value

    def validate(self):
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.value, 'value')

    def to_map(self):
        result = dict()
        if self.currency is not None:
            result['currency'] = self.currency
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class TradeOrder(TeaModel):
    def __init__(
        self,
        order_no: str = None,
        original_total_amount: int = None,
        actual_total_amount: int = None,
        item_count: int = None,
        currency: str = None,
    ):
        # 订单唯一编号
        self.order_no = order_no
        # 订单原始金额，单位分
        self.original_total_amount = original_total_amount
        # 订单实付金额，单位分
        self.actual_total_amount = actual_total_amount
        # 数量
        self.item_count = item_count
        # 币种，暂时只支持人民币 CNY
        self.currency = currency

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.original_total_amount, 'original_total_amount')
        self.validate_required(self.actual_total_amount, 'actual_total_amount')
        self.validate_required(self.item_count, 'item_count')

    def to_map(self):
        result = dict()
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.original_total_amount is not None:
            result['original_total_amount'] = self.original_total_amount
        if self.actual_total_amount is not None:
            result['actual_total_amount'] = self.actual_total_amount
        if self.item_count is not None:
            result['item_count'] = self.item_count
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('original_total_amount') is not None:
            self.original_total_amount = m.get('original_total_amount')
        if m.get('actual_total_amount') is not None:
            self.actual_total_amount = m.get('actual_total_amount')
        if m.get('item_count') is not None:
            self.item_count = m.get('item_count')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class Stage(TeaModel):
    def __init__(
        self,
        upper_limit: int = None,
        lower_limit: int = None,
        token_amount: int = None,
        token_price: int = None,
    ):
        # 票数区间上限
        self.upper_limit = upper_limit
        # 票数区间下限
        self.lower_limit = lower_limit
        # 当前区间粉丝粒数量，单位分个
        self.token_amount = token_amount
        # 当前区间粉丝粒价格，单位分
        self.token_price = token_price

    def validate(self):
        self.validate_required(self.upper_limit, 'upper_limit')
        self.validate_required(self.lower_limit, 'lower_limit')
        self.validate_required(self.token_amount, 'token_amount')
        self.validate_required(self.token_price, 'token_price')

    def to_map(self):
        result = dict()
        if self.upper_limit is not None:
            result['upper_limit'] = self.upper_limit
        if self.lower_limit is not None:
            result['lower_limit'] = self.lower_limit
        if self.token_amount is not None:
            result['token_amount'] = self.token_amount
        if self.token_price is not None:
            result['token_price'] = self.token_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('upper_limit') is not None:
            self.upper_limit = m.get('upper_limit')
        if m.get('lower_limit') is not None:
            self.lower_limit = m.get('lower_limit')
        if m.get('token_amount') is not None:
            self.token_amount = m.get('token_amount')
        if m.get('token_price') is not None:
            self.token_price = m.get('token_price')
        return self


class Project(TeaModel):
    def __init__(
        self,
        contract_id: str = None,
        project_end_time: str = None,
        project_id: str = None,
        project_name: str = None,
        project_start_time: str = None,
        project_type: str = None,
    ):
        # 项目对应的合约 ID
        self.contract_id = contract_id
        # 项目结束时间，精确到毫秒，FILM类型订单必填
        self.project_end_time = project_end_time
        # 项目ID
        self.project_id = project_id
        # 项目名称
        self.project_name = project_name
        # 项目开始时间，精确到毫秒，FILM类型订单必填
        self.project_start_time = project_start_time
        # 项目类型，目前支持FILM：电影，CAR：汽车
        self.project_type = project_type

    def validate(self):
        if self.project_end_time is not None:
            self.validate_pattern(self.project_end_time, 'project_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.project_id, 'project_id')
        if self.project_start_time is not None:
            self.validate_pattern(self.project_start_time, 'project_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.project_type, 'project_type')

    def to_map(self):
        result = dict()
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.project_end_time is not None:
            result['project_end_time'] = self.project_end_time
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.project_start_time is not None:
            result['project_start_time'] = self.project_start_time
        if self.project_type is not None:
            result['project_type'] = self.project_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('project_end_time') is not None:
            self.project_end_time = m.get('project_end_time')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('project_start_time') is not None:
            self.project_start_time = m.get('project_start_time')
        if m.get('project_type') is not None:
            self.project_type = m.get('project_type')
        return self


class TokenOperationDetail(TeaModel):
    def __init__(
        self,
        status: str = None,
        token_amount: int = None,
        time: str = None,
        info: str = None,
        biz_id: str = None,
        order_no: str = None,
    ):
        # 粉丝粒操作流水状态，pending：发放中，confirmed：已到账，canceled：已取消
        self.status = status
        # 粉丝粒数量，单位分个
        self.token_amount = token_amount
        # 明细发生时间
        self.time = time
        # 明细信息
        self.info = info
        # 唯一业务单号
        self.biz_id = biz_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.status, 'status')
        self.validate_required(self.token_amount, 'token_amount')
        self.validate_required(self.time, 'time')
        if self.time is not None:
            self.validate_pattern(self.time, 'time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.info, 'info')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        result = dict()
        if self.status is not None:
            result['status'] = self.status
        if self.token_amount is not None:
            result['token_amount'] = self.token_amount
        if self.time is not None:
            result['time'] = self.time
        if self.info is not None:
            result['info'] = self.info
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('token_amount') is not None:
            self.token_amount = m.get('token_amount')
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('info') is not None:
            self.info = m.get('info')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class UserRevenueDetail(TeaModel):
    def __init__(
        self,
        accumulative_revenue: Revenue = None,
        pending_token_amount: int = None,
        project_name: str = None,
        redeemable_token_amount: int = None,
        redeemed_token_amount: int = None,
        released_token_amount: int = None,
        token_price: int = None,
        withdraw_revenue: Revenue = None,
    ):
        # 累计收益
        self.accumulative_revenue = accumulative_revenue
        # 待发放粉丝粒数量，单位分个。
        self.pending_token_amount = pending_token_amount
        # 作品名称
        self.project_name = project_name
        # 可兑现粉丝粒数量，单位分个。
        self.redeemable_token_amount = redeemable_token_amount
        # 已兑现粉丝粒数量，单位分个
        self.redeemed_token_amount = redeemed_token_amount
        # 已发放粉丝粒数量，单位分个。
        self.released_token_amount = released_token_amount
        # 粉丝粒单价，单位分
        self.token_price = token_price
        # 可零收益
        self.withdraw_revenue = withdraw_revenue

    def validate(self):
        self.validate_required(self.accumulative_revenue, 'accumulative_revenue')
        if self.accumulative_revenue:
            self.accumulative_revenue.validate()
        self.validate_required(self.pending_token_amount, 'pending_token_amount')
        self.validate_required(self.project_name, 'project_name')
        self.validate_required(self.redeemable_token_amount, 'redeemable_token_amount')
        self.validate_required(self.redeemed_token_amount, 'redeemed_token_amount')
        self.validate_required(self.released_token_amount, 'released_token_amount')
        self.validate_required(self.token_price, 'token_price')
        self.validate_required(self.withdraw_revenue, 'withdraw_revenue')
        if self.withdraw_revenue:
            self.withdraw_revenue.validate()

    def to_map(self):
        result = dict()
        if self.accumulative_revenue is not None:
            result['accumulative_revenue'] = self.accumulative_revenue.to_map()
        if self.pending_token_amount is not None:
            result['pending_token_amount'] = self.pending_token_amount
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.redeemable_token_amount is not None:
            result['redeemable_token_amount'] = self.redeemable_token_amount
        if self.redeemed_token_amount is not None:
            result['redeemed_token_amount'] = self.redeemed_token_amount
        if self.released_token_amount is not None:
            result['released_token_amount'] = self.released_token_amount
        if self.token_price is not None:
            result['token_price'] = self.token_price
        if self.withdraw_revenue is not None:
            result['withdraw_revenue'] = self.withdraw_revenue.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('accumulative_revenue') is not None:
            temp_model = Revenue()
            self.accumulative_revenue = temp_model.from_map(m['accumulative_revenue'])
        if m.get('pending_token_amount') is not None:
            self.pending_token_amount = m.get('pending_token_amount')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('redeemable_token_amount') is not None:
            self.redeemable_token_amount = m.get('redeemable_token_amount')
        if m.get('redeemed_token_amount') is not None:
            self.redeemed_token_amount = m.get('redeemed_token_amount')
        if m.get('released_token_amount') is not None:
            self.released_token_amount = m.get('released_token_amount')
        if m.get('token_price') is not None:
            self.token_price = m.get('token_price')
        if m.get('withdraw_revenue') is not None:
            temp_model = Revenue()
            self.withdraw_revenue = temp_model.from_map(m['withdraw_revenue'])
        return self


class UserAssetDetail(TeaModel):
    def __init__(
        self,
        asset: int = None,
        asset_type: str = None,
        biz_no: str = None,
        event_time: str = None,
        memo: str = None,
        project_name: str = None,
        revenue: Revenue = None,
    ):
        # 粉丝粒变化数量，带符号整数，单位分个。
        self.asset = asset
        # 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
        self.asset_type = asset_type
        # 业务单号
        self.biz_no = biz_no
        # 事件时间，时区GMT+8，精确到毫秒。
        self.event_time = event_time
        # 备注信息
        self.memo = memo
        # 项目名称
        self.project_name = project_name
        # 收益变化额度，单位为分。
        self.revenue = revenue

    def validate(self):
        self.validate_required(self.asset, 'asset')
        self.validate_required(self.asset_type, 'asset_type')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.event_time, 'event_time')
        if self.event_time is not None:
            self.validate_pattern(self.event_time, 'event_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.memo, 'memo')
        self.validate_required(self.project_name, 'project_name')
        self.validate_required(self.revenue, 'revenue')
        if self.revenue:
            self.revenue.validate()

    def to_map(self):
        result = dict()
        if self.asset is not None:
            result['asset'] = self.asset
        if self.asset_type is not None:
            result['asset_type'] = self.asset_type
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.event_time is not None:
            result['event_time'] = self.event_time
        if self.memo is not None:
            result['memo'] = self.memo
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.revenue is not None:
            result['revenue'] = self.revenue.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset') is not None:
            self.asset = m.get('asset')
        if m.get('asset_type') is not None:
            self.asset_type = m.get('asset_type')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('event_time') is not None:
            self.event_time = m.get('event_time')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('revenue') is not None:
            temp_model = Revenue()
            self.revenue = temp_model.from_map(m['revenue'])
        return self


class AssetDetail(TeaModel):
    def __init__(
        self,
        gain_type: str = None,
        status: str = None,
        ticket_number: int = None,
        token: int = None,
        token_display: str = None,
        nickname: str = None,
    ):
        # Token获得类型
        self.gain_type = gain_type
        # Token发放状态
        self.status = status
        # 购票数
        self.ticket_number = ticket_number
        # Token数，单位为分个，1分个=0.01个
        self.token = token
        # Token展示数
        self.token_display = token_display
        # 用户昵称
        self.nickname = nickname

    def validate(self):
        self.validate_required(self.gain_type, 'gain_type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.ticket_number, 'ticket_number')
        self.validate_required(self.token, 'token')
        self.validate_required(self.token_display, 'token_display')
        self.validate_required(self.nickname, 'nickname')

    def to_map(self):
        result = dict()
        if self.gain_type is not None:
            result['gain_type'] = self.gain_type
        if self.status is not None:
            result['status'] = self.status
        if self.ticket_number is not None:
            result['ticket_number'] = self.ticket_number
        if self.token is not None:
            result['token'] = self.token
        if self.token_display is not None:
            result['token_display'] = self.token_display
        if self.nickname is not None:
            result['nickname'] = self.nickname
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('gain_type') is not None:
            self.gain_type = m.get('gain_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('ticket_number') is not None:
            self.ticket_number = m.get('ticket_number')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('token_display') is not None:
            self.token_display = m.get('token_display')
        if m.get('nickname') is not None:
            self.nickname = m.get('nickname')
        return self


class Order(TeaModel):
    def __init__(
        self,
        actual_total_amount: int = None,
        currency: str = None,
        item_count: int = None,
        order_no: str = None,
        order_status: str = None,
        original_total_amount: int = None,
        confirm_type: str = None,
    ):
        # 实付金额，单位分
        self.actual_total_amount = actual_total_amount
        # 币种，目前仅支持 CNY
        self.currency = currency
        # 数量
        self.item_count = item_count
        # 唯一订单号
        self.order_no = order_no
        # 订单状态，ORDER_CREATE：订单创建，ORDER_CANCEL：订单取消
        self.order_status = order_status
        # 原始金额，单位分
        self.original_total_amount = original_total_amount
        # 确认类型，DIRECT：直接发放，TWO_STEP：两部发放。该字段可为空，默认为 TWO_STEP
        self.confirm_type = confirm_type

    def validate(self):
        self.validate_required(self.actual_total_amount, 'actual_total_amount')
        self.validate_required(self.item_count, 'item_count')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.order_status, 'order_status')
        self.validate_required(self.original_total_amount, 'original_total_amount')

    def to_map(self):
        result = dict()
        if self.actual_total_amount is not None:
            result['actual_total_amount'] = self.actual_total_amount
        if self.currency is not None:
            result['currency'] = self.currency
        if self.item_count is not None:
            result['item_count'] = self.item_count
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.original_total_amount is not None:
            result['original_total_amount'] = self.original_total_amount
        if self.confirm_type is not None:
            result['confirm_type'] = self.confirm_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('actual_total_amount') is not None:
            self.actual_total_amount = m.get('actual_total_amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('item_count') is not None:
            self.item_count = m.get('item_count')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('original_total_amount') is not None:
            self.original_total_amount = m.get('original_total_amount')
        if m.get('confirm_type') is not None:
            self.confirm_type = m.get('confirm_type')
        return self


class Money(TeaModel):
    def __init__(
        self,
        value: int = None,
        currency: str = None,
    ):
        # 金额，单位分
        self.value = value
        # 币种，暂只支持人民币CNY
        self.currency = currency

    def validate(self):
        self.validate_required(self.value, 'value')
        self.validate_required(self.currency, 'currency')

    def to_map(self):
        result = dict()
        if self.value is not None:
            result['value'] = self.value
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class CurrentRevenue(TeaModel):
    def __init__(
        self,
        currency: str = None,
        value: int = None,
    ):
        # 币种，当前仅支持CNY
        self.currency = currency
        # 金额，单位为分
        self.value = value

    def validate(self):
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.value, 'value')

    def to_map(self):
        result = dict()
        if self.currency is not None:
            result['currency'] = self.currency
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class AccumulativeRevenue(TeaModel):
    def __init__(
        self,
        currency: str = None,
        value: int = None,
    ):
        # 币种，当前仅支持 CNY
        self.currency = currency
        # 金额，单位为分
        self.value = value

    def validate(self):
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.value, 'value')

    def to_map(self):
        result = dict()
        if self.currency is not None:
            result['currency'] = self.currency
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class User(TeaModel):
    def __init__(
        self,
        user_id_no: str = None,
        user_id_type: str = None,
    ):
        # 用户账户，手机号格式为： +区号-手机号，分享码：6位字母，支付宝登录账号：手机号/邮箱
        self.user_id_no = user_id_no
        # 用户账号类型，当前仅支持手机号和分享码，PHONE：手机号，SHARE_CODE：分享码，
        # ALIPAY_LOGON_ID：支付宝登录账号
        self.user_id_type = user_id_type

    def validate(self):
        self.validate_required(self.user_id_no, 'user_id_no')
        self.validate_required(self.user_id_type, 'user_id_type')

    def to_map(self):
        result = dict()
        if self.user_id_no is not None:
            result['user_id_no'] = self.user_id_no
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id_no') is not None:
            self.user_id_no = m.get('user_id_no')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        return self


class QueryCustomerProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        logon_id: str = None,
        logon_id_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 登录支付宝账号，手机号或者邮箱地址
        self.logon_id = logon_id
        # 登录账号类型，PHONE 为手机号，EMAIL 为邮箱地址。
        self.logon_id_type = logon_id_type

    def validate(self):
        self.validate_required(self.logon_id, 'logon_id')
        self.validate_required(self.logon_id_type, 'logon_id_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.logon_id is not None:
            result['logon_id'] = self.logon_id
        if self.logon_id_type is not None:
            result['logon_id_type'] = self.logon_id_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('logon_id') is not None:
            self.logon_id = m.get('logon_id')
        if m.get('logon_id_type') is not None:
            self.logon_id_type = m.get('logon_id_type')
        return self


class QueryCustomerProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        projects: List[Project] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目列表，元素为项目名称。
        self.projects = projects

    def validate(self):
        if self.projects:
            for k in self.projects:
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
        result['projects'] = []
        if self.projects is not None:
            for k in self.projects:
                result['projects'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.projects = []
        if m.get('projects') is not None:
            for k in m.get('projects'):
                temp_model = Project()
                self.projects.append(temp_model.from_map(k))
        return self


class QueryCustomerDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_type: str = None,
        contract_id: str = None,
        data_type: str = None,
        end_time: str = None,
        logon_id: str = None,
        logon_id_type: str = None,
        order_by: str = None,
        page_num: int = None,
        page_size: int = None,
        start_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
        self.asset_type = asset_type
        # 合约ID
        self.contract_id = contract_id
        # 数据类型，ASSET：资产信息， REVENUE：收益信息
        self.data_type = data_type
        # 截止时间，时区GMT+8，精确到毫秒
        self.end_time = end_time
        # 登录支付宝的账号，手机号或者邮箱
        self.logon_id = logon_id
        # 登录账号类型，PHONE：手机号， EMAIL：邮箱地址
        self.logon_id_type = logon_id_type
        # 排序方式，ASC：升序， DESC：降序，默认按照时间降序
        self.order_by = order_by
        # 页码
        self.page_num = page_num
        # 页面大小
        self.page_size = page_size
        # 起始时间，时区GMT+8，精确到毫秒
        self.start_time = start_time

    def validate(self):
        self.validate_required(self.data_type, 'data_type')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.logon_id, 'logon_id')
        self.validate_required(self.logon_id_type, 'logon_id_type')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_type is not None:
            result['asset_type'] = self.asset_type
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.logon_id is not None:
            result['logon_id'] = self.logon_id
        if self.logon_id_type is not None:
            result['logon_id_type'] = self.logon_id_type
        if self.order_by is not None:
            result['order_by'] = self.order_by
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_type') is not None:
            self.asset_type = m.get('asset_type')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('logon_id') is not None:
            self.logon_id = m.get('logon_id')
        if m.get('logon_id_type') is not None:
            self.logon_id_type = m.get('logon_id_type')
        if m.get('order_by') is not None:
            self.order_by = m.get('order_by')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class QueryCustomerDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_type: str = None,
        logon_id: str = None,
        logon_id_type: str = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
        user_asset_details: List[UserAssetDetail] = None,
        user_revenue_data: UserRevenueDetail = None,
        vid: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据类型，ASSET：资产信息， REVENUE：收益信息
        self.data_type = data_type
        # 登录支付宝的账号，手机号或者邮箱地址
        self.logon_id = logon_id
        # 登录账号类型，PHONE：手机号， EMAIL：电子邮箱
        self.logon_id_type = logon_id_type
        # 页码
        self.page_num = page_num
        # 页面大小
        self.page_size = page_size
        # 总数
        self.total_count = total_count
        # 用户资产信息列表
        self.user_asset_details = user_asset_details
        # 用户收益信息
        self.user_revenue_data = user_revenue_data
        # 用户虚拟唯一标识
        self.vid = vid

    def validate(self):
        if self.user_asset_details:
            for k in self.user_asset_details:
                if k:
                    k.validate()
        if self.user_revenue_data:
            self.user_revenue_data.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.logon_id is not None:
            result['logon_id'] = self.logon_id
        if self.logon_id_type is not None:
            result['logon_id_type'] = self.logon_id_type
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['user_asset_details'] = []
        if self.user_asset_details is not None:
            for k in self.user_asset_details:
                result['user_asset_details'].append(k.to_map() if k else None)
        if self.user_revenue_data is not None:
            result['user_revenue_data'] = self.user_revenue_data.to_map()
        if self.vid is not None:
            result['vid'] = self.vid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('logon_id') is not None:
            self.logon_id = m.get('logon_id')
        if m.get('logon_id_type') is not None:
            self.logon_id_type = m.get('logon_id_type')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.user_asset_details = []
        if m.get('user_asset_details') is not None:
            for k in m.get('user_asset_details'):
                temp_model = UserAssetDetail()
                self.user_asset_details.append(temp_model.from_map(k))
        if m.get('user_revenue_data') is not None:
            temp_model = UserRevenueDetail()
            self.user_revenue_data = temp_model.from_map(m['user_revenue_data'])
        if m.get('vid') is not None:
            self.vid = m.get('vid')
        return self


class GetUserSharecodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sharer_id: str = None,
        sharer_id_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分享者账号，如果账号类型为手机号则格式如 +86-11 位手机号，如果账号类型为支付宝账号，则填写邮箱地址或者 11 位手机号
        self.sharer_id = sharer_id
        # 分享者账号类型，PHONE：手机号，ALIPAY_LOGON_ID：支付宝账号
        self.sharer_id_type = sharer_id_type

    def validate(self):
        self.validate_required(self.sharer_id, 'sharer_id')
        self.validate_required(self.sharer_id_type, 'sharer_id_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sharer_id is not None:
            result['sharer_id'] = self.sharer_id
        if self.sharer_id_type is not None:
            result['sharer_id_type'] = self.sharer_id_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sharer_id') is not None:
            self.sharer_id = m.get('sharer_id')
        if m.get('sharer_id_type') is not None:
            self.sharer_id_type = m.get('sharer_id_type')
        return self


class GetUserSharecodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        share_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分享码
        self.share_code = share_code

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
        if self.share_code is not None:
            result['share_code'] = self.share_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('share_code') is not None:
            self.share_code = m.get('share_code')
        return self


class SendUserProjectordermsgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        buyer: User = None,
        chain_id: str = None,
        order: Order = None,
        project: Project = None,
        sharer: User = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 购买者
        self.buyer = buyer
        # 链ID
        self.chain_id = chain_id
        # 订单详情
        self.order = order
        # 项目信息
        self.project = project
        # 分享者
        self.sharer = sharer

    def validate(self):
        self.validate_required(self.buyer, 'buyer')
        if self.buyer:
            self.buyer.validate()
        self.validate_required(self.chain_id, 'chain_id')
        self.validate_required(self.order, 'order')
        if self.order:
            self.order.validate()
        self.validate_required(self.project, 'project')
        if self.project:
            self.project.validate()
        self.validate_required(self.sharer, 'sharer')
        if self.sharer:
            self.sharer.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.buyer is not None:
            result['buyer'] = self.buyer.to_map()
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.order is not None:
            result['order'] = self.order.to_map()
        if self.project is not None:
            result['project'] = self.project.to_map()
        if self.sharer is not None:
            result['sharer'] = self.sharer.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('buyer') is not None:
            temp_model = User()
            self.buyer = temp_model.from_map(m['buyer'])
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('order') is not None:
            temp_model = Order()
            self.order = temp_model.from_map(m['order'])
        if m.get('project') is not None:
            temp_model = Project()
            self.project = temp_model.from_map(m['project'])
        if m.get('sharer') is not None:
            temp_model = User()
            self.sharer = temp_model.from_map(m['sharer'])
        return self


class SendUserProjectordermsgResponse(TeaModel):
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


class QueryProjectInfoRequest(TeaModel):
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


class QueryProjectInfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_name: str = None,
        total_token_amount: int = None,
        remaining_token_amount: int = None,
        released_token_amount: int = None,
        redeemed_token_amount: int = None,
        total_prize_amount: Money = None,
        unused_prize_amount: Money = None,
        used_prize_amount: Money = None,
        allocation_start_time: str = None,
        allocation_end_time: str = None,
        redeem_start_time: str = None,
        redeem_end_time: str = None,
        ticket_number: int = None,
        current_token_price: Money = None,
        min_token_price: Money = None,
        current_stage: Stage = None,
        all_stages: List[Stage] = None,
        project_user_num: int = None,
        project_order_num: int = None,
        project_item_num: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目名称
        self.project_name = project_name
        # 总粉丝粒数，单位分个
        self.total_token_amount = total_token_amount
        # 未发放粉丝粒数，单位分个
        self.remaining_token_amount = remaining_token_amount
        # 已发放粉丝粒数，单位分个
        self.released_token_amount = released_token_amount
        # 已提现粉丝粒数，单位分个
        self.redeemed_token_amount = redeemed_token_amount
        # 总资金金额，单位分
        self.total_prize_amount = total_prize_amount
        # 未消耗资金金额，单位分
        self.unused_prize_amount = unused_prize_amount
        # 已消耗资金金额，单位分
        self.used_prize_amount = used_prize_amount
        # 开始发放时间
        self.allocation_start_time = allocation_start_time
        # 停止发放时间
        self.allocation_end_time = allocation_end_time
        # 开始兑现时间
        self.redeem_start_time = redeem_start_time
        # 停止兑现时间
        self.redeem_end_time = redeem_end_time
        # 发放该项目粉丝粒的订单内票数总和
        self.ticket_number = ticket_number
        # 当前粉丝粒单价，单位分
        self.current_token_price = current_token_price
        # 粉丝粒保底价格，单位分
        self.min_token_price = min_token_price
        # 发放区间信息
        self.current_stage = current_stage
        # 所有发放区间信息
        self.all_stages = all_stages
        # 项目参与用户数
        self.project_user_num = project_user_num
        # 项目订单总数
        self.project_order_num = project_order_num
        # 项目已售商品总数
        self.project_item_num = project_item_num

    def validate(self):
        if self.total_prize_amount:
            self.total_prize_amount.validate()
        if self.unused_prize_amount:
            self.unused_prize_amount.validate()
        if self.used_prize_amount:
            self.used_prize_amount.validate()
        if self.allocation_start_time is not None:
            self.validate_pattern(self.allocation_start_time, 'allocation_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.allocation_end_time is not None:
            self.validate_pattern(self.allocation_end_time, 'allocation_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.redeem_start_time is not None:
            self.validate_pattern(self.redeem_start_time, 'redeem_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.redeem_end_time is not None:
            self.validate_pattern(self.redeem_end_time, 'redeem_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.current_token_price:
            self.current_token_price.validate()
        if self.min_token_price:
            self.min_token_price.validate()
        if self.current_stage:
            self.current_stage.validate()
        if self.all_stages:
            for k in self.all_stages:
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
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.total_token_amount is not None:
            result['total_token_amount'] = self.total_token_amount
        if self.remaining_token_amount is not None:
            result['remaining_token_amount'] = self.remaining_token_amount
        if self.released_token_amount is not None:
            result['released_token_amount'] = self.released_token_amount
        if self.redeemed_token_amount is not None:
            result['redeemed_token_amount'] = self.redeemed_token_amount
        if self.total_prize_amount is not None:
            result['total_prize_amount'] = self.total_prize_amount.to_map()
        if self.unused_prize_amount is not None:
            result['unused_prize_amount'] = self.unused_prize_amount.to_map()
        if self.used_prize_amount is not None:
            result['used_prize_amount'] = self.used_prize_amount.to_map()
        if self.allocation_start_time is not None:
            result['allocation_start_time'] = self.allocation_start_time
        if self.allocation_end_time is not None:
            result['allocation_end_time'] = self.allocation_end_time
        if self.redeem_start_time is not None:
            result['redeem_start_time'] = self.redeem_start_time
        if self.redeem_end_time is not None:
            result['redeem_end_time'] = self.redeem_end_time
        if self.ticket_number is not None:
            result['ticket_number'] = self.ticket_number
        if self.current_token_price is not None:
            result['current_token_price'] = self.current_token_price.to_map()
        if self.min_token_price is not None:
            result['min_token_price'] = self.min_token_price.to_map()
        if self.current_stage is not None:
            result['current_stage'] = self.current_stage.to_map()
        result['all_stages'] = []
        if self.all_stages is not None:
            for k in self.all_stages:
                result['all_stages'].append(k.to_map() if k else None)
        if self.project_user_num is not None:
            result['project_user_num'] = self.project_user_num
        if self.project_order_num is not None:
            result['project_order_num'] = self.project_order_num
        if self.project_item_num is not None:
            result['project_item_num'] = self.project_item_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('total_token_amount') is not None:
            self.total_token_amount = m.get('total_token_amount')
        if m.get('remaining_token_amount') is not None:
            self.remaining_token_amount = m.get('remaining_token_amount')
        if m.get('released_token_amount') is not None:
            self.released_token_amount = m.get('released_token_amount')
        if m.get('redeemed_token_amount') is not None:
            self.redeemed_token_amount = m.get('redeemed_token_amount')
        if m.get('total_prize_amount') is not None:
            temp_model = Money()
            self.total_prize_amount = temp_model.from_map(m['total_prize_amount'])
        if m.get('unused_prize_amount') is not None:
            temp_model = Money()
            self.unused_prize_amount = temp_model.from_map(m['unused_prize_amount'])
        if m.get('used_prize_amount') is not None:
            temp_model = Money()
            self.used_prize_amount = temp_model.from_map(m['used_prize_amount'])
        if m.get('allocation_start_time') is not None:
            self.allocation_start_time = m.get('allocation_start_time')
        if m.get('allocation_end_time') is not None:
            self.allocation_end_time = m.get('allocation_end_time')
        if m.get('redeem_start_time') is not None:
            self.redeem_start_time = m.get('redeem_start_time')
        if m.get('redeem_end_time') is not None:
            self.redeem_end_time = m.get('redeem_end_time')
        if m.get('ticket_number') is not None:
            self.ticket_number = m.get('ticket_number')
        if m.get('current_token_price') is not None:
            temp_model = Money()
            self.current_token_price = temp_model.from_map(m['current_token_price'])
        if m.get('min_token_price') is not None:
            temp_model = Money()
            self.min_token_price = temp_model.from_map(m['min_token_price'])
        if m.get('current_stage') is not None:
            temp_model = Stage()
            self.current_stage = temp_model.from_map(m['current_stage'])
        self.all_stages = []
        if m.get('all_stages') is not None:
            for k in m.get('all_stages'):
                temp_model = Stage()
                self.all_stages.append(temp_model.from_map(k))
        if m.get('project_user_num') is not None:
            self.project_user_num = m.get('project_user_num')
        if m.get('project_order_num') is not None:
            self.project_order_num = m.get('project_order_num')
        if m.get('project_item_num') is not None:
            self.project_item_num = m.get('project_item_num')
        return self


class QueryUserInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        user: User = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目唯一编码
        self.project_id = project_id
        # 用户账号信息
        self.user = user

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.user, 'user')
        if self.user:
            self.user.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.user is not None:
            result['user'] = self.user.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('user') is not None:
            temp_model = User()
            self.user = temp_model.from_map(m['user'])
        return self


class QueryUserInfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_name: str = None,
        gained_token_amount: int = None,
        current_token_amount: int = None,
        redeemed_token_amount: int = None,
        accumulative_revenue: Revenue = None,
        current_revenue: Revenue = None,
        redeemed_revenue: Revenue = None,
        buy_amount_from_self: int = None,
        buy_amount_from_share: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目名称
        self.project_name = project_name
        # 已获得粉丝粒总数，单位分个
        self.gained_token_amount = gained_token_amount
        # 当前粉丝粒持有数量，单位分个
        self.current_token_amount = current_token_amount
        # 已兑现粉丝粒数量，单位分个
        self.redeemed_token_amount = redeemed_token_amount
        # 累计获得奖金
        self.accumulative_revenue = accumulative_revenue
        # 当前可兑奖金
        self.current_revenue = current_revenue
        # 已兑现奖金
        self.redeemed_revenue = redeemed_revenue
        # 自购商品数量
        self.buy_amount_from_self = buy_amount_from_self
        # 分享购买商品数量
        self.buy_amount_from_share = buy_amount_from_share

    def validate(self):
        if self.accumulative_revenue:
            self.accumulative_revenue.validate()
        if self.current_revenue:
            self.current_revenue.validate()
        if self.redeemed_revenue:
            self.redeemed_revenue.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.gained_token_amount is not None:
            result['gained_token_amount'] = self.gained_token_amount
        if self.current_token_amount is not None:
            result['current_token_amount'] = self.current_token_amount
        if self.redeemed_token_amount is not None:
            result['redeemed_token_amount'] = self.redeemed_token_amount
        if self.accumulative_revenue is not None:
            result['accumulative_revenue'] = self.accumulative_revenue.to_map()
        if self.current_revenue is not None:
            result['current_revenue'] = self.current_revenue.to_map()
        if self.redeemed_revenue is not None:
            result['redeemed_revenue'] = self.redeemed_revenue.to_map()
        if self.buy_amount_from_self is not None:
            result['buy_amount_from_self'] = self.buy_amount_from_self
        if self.buy_amount_from_share is not None:
            result['buy_amount_from_share'] = self.buy_amount_from_share
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('gained_token_amount') is not None:
            self.gained_token_amount = m.get('gained_token_amount')
        if m.get('current_token_amount') is not None:
            self.current_token_amount = m.get('current_token_amount')
        if m.get('redeemed_token_amount') is not None:
            self.redeemed_token_amount = m.get('redeemed_token_amount')
        if m.get('accumulative_revenue') is not None:
            temp_model = Revenue()
            self.accumulative_revenue = temp_model.from_map(m['accumulative_revenue'])
        if m.get('current_revenue') is not None:
            temp_model = Revenue()
            self.current_revenue = temp_model.from_map(m['current_revenue'])
        if m.get('redeemed_revenue') is not None:
            temp_model = Revenue()
            self.redeemed_revenue = temp_model.from_map(m['redeemed_revenue'])
        if m.get('buy_amount_from_self') is not None:
            self.buy_amount_from_self = m.get('buy_amount_from_self')
        if m.get('buy_amount_from_share') is not None:
            self.buy_amount_from_share = m.get('buy_amount_from_share')
        return self


class QueryUserTokenallocationdetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        user: User = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目唯一编码
        self.project_id = project_id
        # 用户账户信息
        self.user = user
        # 页码
        self.page_num = page_num
        # 页面大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.user, 'user')
        if self.user:
            self.user.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.user is not None:
            result['user'] = self.user.to_map()
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
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('user') is not None:
            temp_model = User()
            self.user = temp_model.from_map(m['user'])
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryUserTokenallocationdetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        allocation_detail: List[TokenOperationDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 粉丝粒操作流水
        self.allocation_detail = allocation_detail

    def validate(self):
        if self.allocation_detail:
            for k in self.allocation_detail:
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
        result['allocation_detail'] = []
        if self.allocation_detail is not None:
            for k in self.allocation_detail:
                result['allocation_detail'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.allocation_detail = []
        if m.get('allocation_detail') is not None:
            for k in m.get('allocation_detail'):
                temp_model = TokenOperationDetail()
                self.allocation_detail.append(temp_model.from_map(k))
        return self


class QueryUserTokenredeemdetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        user: User = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目唯一编码
        self.project_id = project_id
        # 用户账户信息
        self.user = user
        # 页码
        self.page_num = page_num
        # 页面大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.user, 'user')
        if self.user:
            self.user.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.user is not None:
            result['user'] = self.user.to_map()
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
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('user') is not None:
            temp_model = User()
            self.user = temp_model.from_map(m['user'])
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryUserTokenredeemdetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        redeem_detail: List[TokenOperationDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 兑现流水
        self.redeem_detail = redeem_detail

    def validate(self):
        if self.redeem_detail:
            for k in self.redeem_detail:
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
        result['redeem_detail'] = []
        if self.redeem_detail is not None:
            for k in self.redeem_detail:
                result['redeem_detail'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.redeem_detail = []
        if m.get('redeem_detail') is not None:
            for k in m.get('redeem_detail'):
                temp_model = TokenOperationDetail()
                self.redeem_detail.append(temp_model.from_map(k))
        return self


class ExecEventReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        event_type: str = None,
        event_instance_code: str = None,
        event_child: User = None,
        event_parent: User = None,
        request_id: str = None,
        project_id: str = None,
        confirm_type: str = None,
        confirm_time: str = None,
        trade_order: TradeOrder = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 事件类型，目前支持类型 VISIT：访问事件，TRADE：交易事件，SHARE：分享事件
        self.event_type = event_type
        # 事件实例编码，目前支持访问事件，VISIT类别包括MINI_HOME_PAGE：访问首页，CONTRACT_DETAIL_OAGE：访问项目详情页，SHARE_LANDING_PAGE：访问分享页，TRADE类别包括TRADE_SUCCESS：购买成功，REFUND_SUCCESS: 退货成功，SHARE类别包括SHARE_FROM_MERCHANT
        self.event_instance_code = event_instance_code
        # 购买人或者访问者
        self.event_child = event_child
        # 分享者
        self.event_parent = event_parent
        # 唯一业务单号
        self.request_id = request_id
        # 项目唯一编号，访问详情页和回流页、购买事件必填
        self.project_id = project_id
        # 到账类型，DIRECT：直接到账， TWO_STEP_MANUAL：手动到账，TWO_STEP：定时到账
        self.confirm_type = confirm_type
        # 到账时间。当到账类型为定时到账时，该字段必填。
        self.confirm_time = confirm_time
        # 交易订单数据
        self.trade_order = trade_order

    def validate(self):
        self.validate_required(self.event_type, 'event_type')
        self.validate_required(self.event_instance_code, 'event_instance_code')
        if self.event_child:
            self.event_child.validate()
        if self.event_parent:
            self.event_parent.validate()
        self.validate_required(self.request_id, 'request_id')
        if self.confirm_time is not None:
            self.validate_pattern(self.confirm_time, 'confirm_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.trade_order:
            self.trade_order.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.event_type is not None:
            result['event_type'] = self.event_type
        if self.event_instance_code is not None:
            result['event_instance_code'] = self.event_instance_code
        if self.event_child is not None:
            result['event_child'] = self.event_child.to_map()
        if self.event_parent is not None:
            result['event_parent'] = self.event_parent.to_map()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.confirm_type is not None:
            result['confirm_type'] = self.confirm_type
        if self.confirm_time is not None:
            result['confirm_time'] = self.confirm_time
        if self.trade_order is not None:
            result['trade_order'] = self.trade_order.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('event_type') is not None:
            self.event_type = m.get('event_type')
        if m.get('event_instance_code') is not None:
            self.event_instance_code = m.get('event_instance_code')
        if m.get('event_child') is not None:
            temp_model = User()
            self.event_child = temp_model.from_map(m['event_child'])
        if m.get('event_parent') is not None:
            temp_model = User()
            self.event_parent = temp_model.from_map(m['event_parent'])
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('confirm_type') is not None:
            self.confirm_type = m.get('confirm_type')
        if m.get('confirm_time') is not None:
            self.confirm_time = m.get('confirm_time')
        if m.get('trade_order') is not None:
            temp_model = TradeOrder()
            self.trade_order = temp_model.from_map(m['trade_order'])
        return self


class ExecEventReportResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        event_id: str = None,
        event_status: str = None,
        token_status: str = None,
        token_amount: int = None,
        message: str = None,
        parent_token_amount: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 事件唯一标识
        self.event_id = event_id
        # 事件状态，REPORTED：已上报，PROCESSING：处理中，PROCESSED： 处理完毕，NEED_RETRY：需要重试，EVENT_NOT_SUPPORTED：项目暂不支持该事件
        self.event_status = event_status
        # token状态，TOKEN_SUCCESS：token发放成功，TOKEN_PROCESSING：token发放中，TOKEN_FAILED：token发放失败，NO_NEED_ALLOCATION：无需发放
        self.token_status = token_status
        # 购买者/访问者获得token数量
        self.token_amount = token_amount
        # 提示信息
        self.message = message
        # 分享人获得token数
        self.parent_token_amount = parent_token_amount

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
        if self.event_id is not None:
            result['event_id'] = self.event_id
        if self.event_status is not None:
            result['event_status'] = self.event_status
        if self.token_status is not None:
            result['token_status'] = self.token_status
        if self.token_amount is not None:
            result['token_amount'] = self.token_amount
        if self.message is not None:
            result['message'] = self.message
        if self.parent_token_amount is not None:
            result['parent_token_amount'] = self.parent_token_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        if m.get('event_status') is not None:
            self.event_status = m.get('event_status')
        if m.get('token_status') is not None:
            self.token_status = m.get('token_status')
        if m.get('token_amount') is not None:
            self.token_amount = m.get('token_amount')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('parent_token_amount') is not None:
            self.parent_token_amount = m.get('parent_token_amount')
        return self


class QueryEventInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        event_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 事件唯一标识
        self.event_id = event_id

    def validate(self):
        self.validate_required(self.event_id, 'event_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.event_id is not None:
            result['event_id'] = self.event_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        return self


class QueryEventInfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        event_id: str = None,
        event_status: str = None,
        token_status: str = None,
        token_amount: int = None,
        event_time: str = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 事件唯一标识
        self.event_id = event_id
        # 事件状态
        self.event_status = event_status
        # token发放状态
        self.token_status = token_status
        # token数量
        self.token_amount = token_amount
        # 事件上报时间
        self.event_time = event_time
        # 事件处理结果提示信息
        self.message = message

    def validate(self):
        if self.event_time is not None:
            self.validate_pattern(self.event_time, 'event_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.event_id is not None:
            result['event_id'] = self.event_id
        if self.event_status is not None:
            result['event_status'] = self.event_status
        if self.token_status is not None:
            result['token_status'] = self.token_status
        if self.token_amount is not None:
            result['token_amount'] = self.token_amount
        if self.event_time is not None:
            result['event_time'] = self.event_time
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        if m.get('event_status') is not None:
            self.event_status = m.get('event_status')
        if m.get('token_status') is not None:
            self.token_status = m.get('token_status')
        if m.get('token_amount') is not None:
            self.token_amount = m.get('token_amount')
        if m.get('event_time') is not None:
            self.event_time = m.get('event_time')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class ImportNftMetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_id: str = None,
        title: str = None,
        mini_image_url: str = None,
        origin_image_url: str = None,
        author: str = None,
        description: str = None,
        item_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 在外部渠道的全局唯一id
        self.project_id = project_id
        # nft资产标题
        self.title = title
        # 缩略图OSS文件名
        self.mini_image_url = mini_image_url
        # 原图地址
        self.origin_image_url = origin_image_url
        # 创作者
        self.author = author
        # 作品简介信息文字描述
        self.description = description
        # 商品详情页url
        self.item_url = item_url

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.title, 'title')
        self.validate_required(self.mini_image_url, 'mini_image_url')
        self.validate_required(self.origin_image_url, 'origin_image_url')
        self.validate_required(self.author, 'author')
        self.validate_required(self.item_url, 'item_url')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.title is not None:
            result['title'] = self.title
        if self.mini_image_url is not None:
            result['mini_image_url'] = self.mini_image_url
        if self.origin_image_url is not None:
            result['origin_image_url'] = self.origin_image_url
        if self.author is not None:
            result['author'] = self.author
        if self.description is not None:
            result['description'] = self.description
        if self.item_url is not None:
            result['item_url'] = self.item_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('mini_image_url') is not None:
            self.mini_image_url = m.get('mini_image_url')
        if m.get('origin_image_url') is not None:
            self.origin_image_url = m.get('origin_image_url')
        if m.get('author') is not None:
            self.author = m.get('author')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('item_url') is not None:
            self.item_url = m.get('item_url')
        return self


class ImportNftMetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nft_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # nft_id资产id
        self.nft_id = nft_id

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
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        return self


class ExecNftTransferRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alipay_uid: str = None,
        project_id: str = None,
        order_no: str = None,
        price_cent: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支付用户uid
        self.alipay_uid = alipay_uid
        # 在外部渠道的全局唯一id
        self.project_id = project_id
        # 外部订单号（阿里拍卖成功的订单号）
        self.order_no = order_no
        # 拍品成交价（单位：分）
        self.price_cent = price_cent

    def validate(self):
        self.validate_required(self.alipay_uid, 'alipay_uid')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.price_cent, 'price_cent')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.price_cent is not None:
            result['price_cent'] = self.price_cent
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('price_cent') is not None:
            self.price_cent = m.get('price_cent')
        return self


class ExecNftTransferResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        transfer_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内部流水id
        self.transfer_id = transfer_id

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
        if self.transfer_id is not None:
            result['transfer_id'] = self.transfer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('transfer_id') is not None:
            self.transfer_id = m.get('transfer_id')
        return self


class GetIsvSharecodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        logon_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 电话号码/邮箱等登陆名
        self.logon_id = logon_id

    def validate(self):
        self.validate_required(self.logon_id, 'logon_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.logon_id is not None:
            result['logon_id'] = self.logon_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('logon_id') is not None:
            self.logon_id = m.get('logon_id')
        return self


class GetIsvSharecodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        share_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的ISV用户邀请码
        self.share_code = share_code

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
        if self.share_code is not None:
            result['share_code'] = self.share_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('share_code') is not None:
            self.share_code = m.get('share_code')
        return self


class AddProvisionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        chain_id: str = None,
        contract_id: str = None,
        source: str = None,
        value: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务单号
        self.biz_id = biz_id
        # 链 ID
        self.chain_id = chain_id
        # 合约 ID
        self.contract_id = contract_id
        # 调用方，例如租户 ID
        self.source = source
        # 金额，单位为分
        self.value = value

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.chain_id, 'chain_id')
        self.validate_required(self.contract_id, 'contract_id')
        self.validate_required(self.source, 'source')
        self.validate_required(self.value, 'value')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.source is not None:
            result['source'] = self.source
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class AddProvisionResponse(TeaModel):
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


class ReclaimProvisionExtraprovisionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        chain_id: str = None,
        contract_id: str = None,
        source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务单号
        self.biz_id = biz_id
        # 链 ID
        self.chain_id = chain_id
        # 合约 ID
        self.contract_id = contract_id
        # 调用方，例如租户 ID
        self.source = source

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.chain_id, 'chain_id')
        self.validate_required(self.contract_id, 'contract_id')
        self.validate_required(self.source, 'source')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.source is not None:
            result['source'] = self.source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        return self


class ReclaimProvisionExtraprovisionResponse(TeaModel):
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


class ExecTokenRedeemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        chain_id: str = None,
        contract_id: str = None,
        currency: str = None,
        source: str = None,
        target_user: str = None,
        token_amount: int = None,
        token_number: int = None,
        token_price: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务单号
        self.biz_id = biz_id
        # 链 ID
        self.chain_id = chain_id
        # 合约 ID
        self.contract_id = contract_id
        # 币种，目前仅支持 CNY
        self.currency = currency
        # 调用方
        self.source = source
        # 要兑现的用户VID
        self.target_user = target_user
        # Token总金额，token_price*token_number 的结果，单位为分
        self.token_amount = token_amount
        # 兑现的Token数目
        self.token_number = token_number
        # 兑现的Token单价，单位为分
        self.token_price = token_price

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.chain_id, 'chain_id')
        self.validate_required(self.contract_id, 'contract_id')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.source, 'source')
        self.validate_required(self.target_user, 'target_user')
        self.validate_required(self.token_amount, 'token_amount')
        self.validate_required(self.token_number, 'token_number')
        self.validate_required(self.token_price, 'token_price')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.currency is not None:
            result['currency'] = self.currency
        if self.source is not None:
            result['source'] = self.source
        if self.target_user is not None:
            result['target_user'] = self.target_user
        if self.token_amount is not None:
            result['token_amount'] = self.token_amount
        if self.token_number is not None:
            result['token_number'] = self.token_number
        if self.token_price is not None:
            result['token_price'] = self.token_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('target_user') is not None:
            self.target_user = m.get('target_user')
        if m.get('token_amount') is not None:
            self.token_amount = m.get('token_amount')
        if m.get('token_number') is not None:
            self.token_number = m.get('token_number')
        if m.get('token_price') is not None:
            self.token_price = m.get('token_price')
        return self


class ExecTokenRedeemResponse(TeaModel):
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


class GetTppSharecodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alipay_uid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分享人在淘票票端绑定的支付宝UID
        self.alipay_uid = alipay_uid

    def validate(self):
        self.validate_required(self.alipay_uid, 'alipay_uid')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        return self


class GetTppSharecodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        share_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 专属邀请码
        self.share_code = share_code

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
        if self.share_code is not None:
            result['share_code'] = self.share_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('share_code') is not None:
            self.share_code = m.get('share_code')
        return self


class QueryTppAllinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alipay_uid: str = None,
        order_by: str = None,
        page_id: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支付宝UID
        self.alipay_uid = alipay_uid
        # 排序方式，默认降序
        self.order_by = order_by
        # 页码
        self.page_id = page_id
        # 页面大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.alipay_uid, 'alipay_uid')
        self.validate_required(self.page_id, 'page_id')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        if self.order_by is not None:
            result['order_by'] = self.order_by
        if self.page_id is not None:
            result['page_id'] = self.page_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        if m.get('order_by') is not None:
            self.order_by = m.get('order_by')
        if m.get('page_id') is not None:
            self.page_id = m.get('page_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryTppAllinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accumulative_revenue: Revenue = None,
        accumulative_users: int = None,
        asset_detail_list: List[AssetDetail] = None,
        current_accumulative_revenue: Revenue = None,
        current_revenue: Revenue = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 累计全部参与收益
        self.accumulative_revenue = accumulative_revenue
        # 累计参与用书
        self.accumulative_users = accumulative_users
        # 用户资产详情列表
        self.asset_detail_list = asset_detail_list
        # 用户当前累计收益
        self.current_accumulative_revenue = current_accumulative_revenue
        # 当前用户收益
        self.current_revenue = current_revenue

    def validate(self):
        if self.accumulative_revenue:
            self.accumulative_revenue.validate()
        if self.asset_detail_list:
            for k in self.asset_detail_list:
                if k:
                    k.validate()
        if self.current_accumulative_revenue:
            self.current_accumulative_revenue.validate()
        if self.current_revenue:
            self.current_revenue.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.accumulative_revenue is not None:
            result['accumulative_revenue'] = self.accumulative_revenue.to_map()
        if self.accumulative_users is not None:
            result['accumulative_users'] = self.accumulative_users
        result['asset_detail_list'] = []
        if self.asset_detail_list is not None:
            for k in self.asset_detail_list:
                result['asset_detail_list'].append(k.to_map() if k else None)
        if self.current_accumulative_revenue is not None:
            result['current_accumulative_revenue'] = self.current_accumulative_revenue.to_map()
        if self.current_revenue is not None:
            result['current_revenue'] = self.current_revenue.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('accumulative_revenue') is not None:
            temp_model = Revenue()
            self.accumulative_revenue = temp_model.from_map(m['accumulative_revenue'])
        if m.get('accumulative_users') is not None:
            self.accumulative_users = m.get('accumulative_users')
        self.asset_detail_list = []
        if m.get('asset_detail_list') is not None:
            for k in m.get('asset_detail_list'):
                temp_model = AssetDetail()
                self.asset_detail_list.append(temp_model.from_map(k))
        if m.get('current_accumulative_revenue') is not None:
            temp_model = Revenue()
            self.current_accumulative_revenue = temp_model.from_map(m['current_accumulative_revenue'])
        if m.get('current_revenue') is not None:
            temp_model = Revenue()
            self.current_revenue = temp_model.from_map(m['current_revenue'])
        return self


class QueryTppParticipationinfoRequest(TeaModel):
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


class QueryTppParticipationinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        accumulative_users: int = None,
        accumulative_revenue: AccumulativeRevenue = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 累计参与用户数
        self.accumulative_users = accumulative_users
        # 累计全部参与收益
        self.accumulative_revenue = accumulative_revenue

    def validate(self):
        if self.accumulative_revenue:
            self.accumulative_revenue.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.accumulative_users is not None:
            result['accumulative_users'] = self.accumulative_users
        if self.accumulative_revenue is not None:
            result['accumulative_revenue'] = self.accumulative_revenue.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('accumulative_users') is not None:
            self.accumulative_users = m.get('accumulative_users')
        if m.get('accumulative_revenue') is not None:
            temp_model = AccumulativeRevenue()
            self.accumulative_revenue = temp_model.from_map(m['accumulative_revenue'])
        return self


