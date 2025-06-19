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


class SubMetricData(TeaModel):
    def __init__(
        self,
        date: str = None,
        type: str = None,
        value: str = None,
    ):
        # 日期
        self.date = date
        # 指标类型:OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT,OPERATING_COST, GROSS_PROFIT_MARGIN,VOUCHER_CONVERSION, USER_CONVERSION
        self.type = type
        # 指标值
        self.value = value

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.type, 'type')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.date is not None:
            result['date'] = self.date
        if self.type is not None:
            result['type'] = self.type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class TradeRangeData(TeaModel):
    def __init__(
        self,
        start: str = None,
        end: str = None,
        value: int = None,
        rate: str = None,
    ):
        # 区间开始
        self.start = start
        # 区间结束
        self.end = end
        # 区间内统计值
        self.value = value
        # 百分比
        self.rate = rate

    def validate(self):
        self.validate_required(self.start, 'start')
        self.validate_required(self.end, 'end')
        self.validate_required(self.value, 'value')
        self.validate_required(self.rate, 'rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.start is not None:
            result['start'] = self.start
        if self.end is not None:
            result['end'] = self.end
        if self.value is not None:
            result['value'] = self.value
        if self.rate is not None:
            result['rate'] = self.rate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('start') is not None:
            self.start = m.get('start')
        if m.get('end') is not None:
            self.end = m.get('end')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        return self


class OrgTrendData(TeaModel):
    def __init__(
        self,
        date: str = None,
        repayment_amt: str = None,
        budget_amt: str = None,
        trade_amt: str = None,
    ):
        # 日期
        self.date = date
        # 还款金额
        self.repayment_amt = repayment_amt
        # 预算金额
        self.budget_amt = budget_amt
        # 交易金额
        self.trade_amt = trade_amt

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.repayment_amt, 'repayment_amt')
        self.validate_required(self.budget_amt, 'budget_amt')
        self.validate_required(self.trade_amt, 'trade_amt')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.date is not None:
            result['date'] = self.date
        if self.repayment_amt is not None:
            result['repayment_amt'] = self.repayment_amt
        if self.budget_amt is not None:
            result['budget_amt'] = self.budget_amt
        if self.trade_amt is not None:
            result['trade_amt'] = self.trade_amt
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('repayment_amt') is not None:
            self.repayment_amt = m.get('repayment_amt')
        if m.get('budget_amt') is not None:
            self.budget_amt = m.get('budget_amt')
        if m.get('trade_amt') is not None:
            self.trade_amt = m.get('trade_amt')
        return self


class MetricData(TeaModel):
    def __init__(
        self,
        type: str = None,
        total: str = None,
        sub_list: List[SubMetricData] = None,
    ):
        # 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
        self.type = type
        # 指标值
        self.total = total
        # 子指标列表
        self.sub_list = sub_list

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.total, 'total')
        self.validate_required(self.sub_list, 'sub_list')
        if self.sub_list:
            for k in self.sub_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.total is not None:
            result['total'] = self.total
        result['sub_list'] = []
        if self.sub_list is not None:
            for k in self.sub_list:
                result['sub_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.sub_list = []
        if m.get('sub_list') is not None:
            for k in m.get('sub_list'):
                temp_model = SubMetricData()
                self.sub_list.append(temp_model.from_map(k))
        return self


class ConversionData(TeaModel):
    def __init__(
        self,
        channel: str = None,
        send_cnt: int = None,
        use_cnt: int = None,
        use_rate: str = None,
    ):
        # 渠道
        self.channel = channel
        # 投放人数
        self.send_cnt = send_cnt
        # 核销人数
        self.use_cnt = use_cnt
        # 核销率
        self.use_rate = use_rate

    def validate(self):
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.send_cnt, 'send_cnt')
        self.validate_required(self.use_cnt, 'use_cnt')
        self.validate_required(self.use_rate, 'use_rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.channel is not None:
            result['channel'] = self.channel
        if self.send_cnt is not None:
            result['send_cnt'] = self.send_cnt
        if self.use_cnt is not None:
            result['use_cnt'] = self.use_cnt
        if self.use_rate is not None:
            result['use_rate'] = self.use_rate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('send_cnt') is not None:
            self.send_cnt = m.get('send_cnt')
        if m.get('use_cnt') is not None:
            self.use_cnt = m.get('use_cnt')
        if m.get('use_rate') is not None:
            self.use_rate = m.get('use_rate')
        return self


class RepayCallBackResData(TeaModel):
    def __init__(
        self,
        status: str = None,
    ):
        # 状态
        self.status = status

    def validate(self):
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class PaymentRecord(TeaModel):
    def __init__(
        self,
        cloud_tenant_id: str = None,
        payment_amount: int = None,
        supplier_name: str = None,
        payment_date: str = None,
        request_unique_id: str = None,
    ):
        # 云上租户id
        self.cloud_tenant_id = cloud_tenant_id
        # 打款金额，单位分
        self.payment_amount = payment_amount
        # 服务商名称 - 即云租户名称，比如南京飞翰
        self.supplier_name = supplier_name
        # 打款日期
        self.payment_date = payment_date
        # 唯一请求id，即payment_record_id
        self.request_unique_id = request_unique_id

    def validate(self):
        self.validate_required(self.cloud_tenant_id, 'cloud_tenant_id')
        self.validate_required(self.payment_amount, 'payment_amount')
        self.validate_required(self.supplier_name, 'supplier_name')
        self.validate_required(self.payment_date, 'payment_date')
        if self.payment_date is not None:
            self.validate_pattern(self.payment_date, 'payment_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.request_unique_id, 'request_unique_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cloud_tenant_id is not None:
            result['cloud_tenant_id'] = self.cloud_tenant_id
        if self.payment_amount is not None:
            result['payment_amount'] = self.payment_amount
        if self.supplier_name is not None:
            result['supplier_name'] = self.supplier_name
        if self.payment_date is not None:
            result['payment_date'] = self.payment_date
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cloud_tenant_id') is not None:
            self.cloud_tenant_id = m.get('cloud_tenant_id')
        if m.get('payment_amount') is not None:
            self.payment_amount = m.get('payment_amount')
        if m.get('supplier_name') is not None:
            self.supplier_name = m.get('supplier_name')
        if m.get('payment_date') is not None:
            self.payment_date = m.get('payment_date')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        return self


class OrgOverviewData(TeaModel):
    def __init__(
        self,
        total_budget_amt: str = None,
        huabei_budget_amt: str = None,
        jiebei_budget_amt: str = None,
        xiaowei_budget_amt: str = None,
        service_budget_amt: str = None,
        total_repayment_amt: str = None,
        huabei_repayment_amt: str = None,
        jiebei_repayment_amt: str = None,
        xiaowei_repayment_amt: str = None,
        total_trade_amt: str = None,
        huabei_trade_amt: str = None,
        jiebei_trade_amt: str = None,
        xiaowei_trade_amt: str = None,
        internal_subsidy_amt: str = None,
        total_net_repayment_amt: str = None,
        activity_roi: str = None,
    ):
        # 预算总金额
        self.total_budget_amt = total_budget_amt
        # 花呗预算金额
        self.huabei_budget_amt = huabei_budget_amt
        # 借呗预算金额
        self.jiebei_budget_amt = jiebei_budget_amt
        # 小微预算金额
        self.xiaowei_budget_amt = xiaowei_budget_amt
        # 服务费预算金额
        self.service_budget_amt = service_budget_amt
        # 总回款金额
        self.total_repayment_amt = total_repayment_amt
        # 花呗回款金额
        self.huabei_repayment_amt = huabei_repayment_amt
        # 借呗回款金额
        self.jiebei_repayment_amt = jiebei_repayment_amt
        # 小微回款金额
        self.xiaowei_repayment_amt = xiaowei_repayment_amt
        # 总交易金额
        self.total_trade_amt = total_trade_amt
        # 花呗交易金额
        self.huabei_trade_amt = huabei_trade_amt
        # 借呗交易金额
        self.jiebei_trade_amt = jiebei_trade_amt
        # 小微交易金额
        self.xiaowei_trade_amt = xiaowei_trade_amt
        # 内部补贴金额
        self.internal_subsidy_amt = internal_subsidy_amt
        # 净回款额
        self.total_net_repayment_amt = total_net_repayment_amt
        # 活动roi
        self.activity_roi = activity_roi

    def validate(self):
        self.validate_required(self.total_budget_amt, 'total_budget_amt')
        self.validate_required(self.huabei_budget_amt, 'huabei_budget_amt')
        self.validate_required(self.jiebei_budget_amt, 'jiebei_budget_amt')
        self.validate_required(self.xiaowei_budget_amt, 'xiaowei_budget_amt')
        self.validate_required(self.service_budget_amt, 'service_budget_amt')
        self.validate_required(self.total_repayment_amt, 'total_repayment_amt')
        self.validate_required(self.huabei_repayment_amt, 'huabei_repayment_amt')
        self.validate_required(self.jiebei_repayment_amt, 'jiebei_repayment_amt')
        self.validate_required(self.xiaowei_repayment_amt, 'xiaowei_repayment_amt')
        self.validate_required(self.total_trade_amt, 'total_trade_amt')
        self.validate_required(self.huabei_trade_amt, 'huabei_trade_amt')
        self.validate_required(self.jiebei_trade_amt, 'jiebei_trade_amt')
        self.validate_required(self.xiaowei_trade_amt, 'xiaowei_trade_amt')
        self.validate_required(self.internal_subsidy_amt, 'internal_subsidy_amt')
        self.validate_required(self.total_net_repayment_amt, 'total_net_repayment_amt')
        self.validate_required(self.activity_roi, 'activity_roi')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total_budget_amt is not None:
            result['total_budget_amt'] = self.total_budget_amt
        if self.huabei_budget_amt is not None:
            result['huabei_budget_amt'] = self.huabei_budget_amt
        if self.jiebei_budget_amt is not None:
            result['jiebei_budget_amt'] = self.jiebei_budget_amt
        if self.xiaowei_budget_amt is not None:
            result['xiaowei_budget_amt'] = self.xiaowei_budget_amt
        if self.service_budget_amt is not None:
            result['service_budget_amt'] = self.service_budget_amt
        if self.total_repayment_amt is not None:
            result['total_repayment_amt'] = self.total_repayment_amt
        if self.huabei_repayment_amt is not None:
            result['huabei_repayment_amt'] = self.huabei_repayment_amt
        if self.jiebei_repayment_amt is not None:
            result['jiebei_repayment_amt'] = self.jiebei_repayment_amt
        if self.xiaowei_repayment_amt is not None:
            result['xiaowei_repayment_amt'] = self.xiaowei_repayment_amt
        if self.total_trade_amt is not None:
            result['total_trade_amt'] = self.total_trade_amt
        if self.huabei_trade_amt is not None:
            result['huabei_trade_amt'] = self.huabei_trade_amt
        if self.jiebei_trade_amt is not None:
            result['jiebei_trade_amt'] = self.jiebei_trade_amt
        if self.xiaowei_trade_amt is not None:
            result['xiaowei_trade_amt'] = self.xiaowei_trade_amt
        if self.internal_subsidy_amt is not None:
            result['internal_subsidy_amt'] = self.internal_subsidy_amt
        if self.total_net_repayment_amt is not None:
            result['total_net_repayment_amt'] = self.total_net_repayment_amt
        if self.activity_roi is not None:
            result['activity_roi'] = self.activity_roi
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total_budget_amt') is not None:
            self.total_budget_amt = m.get('total_budget_amt')
        if m.get('huabei_budget_amt') is not None:
            self.huabei_budget_amt = m.get('huabei_budget_amt')
        if m.get('jiebei_budget_amt') is not None:
            self.jiebei_budget_amt = m.get('jiebei_budget_amt')
        if m.get('xiaowei_budget_amt') is not None:
            self.xiaowei_budget_amt = m.get('xiaowei_budget_amt')
        if m.get('service_budget_amt') is not None:
            self.service_budget_amt = m.get('service_budget_amt')
        if m.get('total_repayment_amt') is not None:
            self.total_repayment_amt = m.get('total_repayment_amt')
        if m.get('huabei_repayment_amt') is not None:
            self.huabei_repayment_amt = m.get('huabei_repayment_amt')
        if m.get('jiebei_repayment_amt') is not None:
            self.jiebei_repayment_amt = m.get('jiebei_repayment_amt')
        if m.get('xiaowei_repayment_amt') is not None:
            self.xiaowei_repayment_amt = m.get('xiaowei_repayment_amt')
        if m.get('total_trade_amt') is not None:
            self.total_trade_amt = m.get('total_trade_amt')
        if m.get('huabei_trade_amt') is not None:
            self.huabei_trade_amt = m.get('huabei_trade_amt')
        if m.get('jiebei_trade_amt') is not None:
            self.jiebei_trade_amt = m.get('jiebei_trade_amt')
        if m.get('xiaowei_trade_amt') is not None:
            self.xiaowei_trade_amt = m.get('xiaowei_trade_amt')
        if m.get('internal_subsidy_amt') is not None:
            self.internal_subsidy_amt = m.get('internal_subsidy_amt')
        if m.get('total_net_repayment_amt') is not None:
            self.total_net_repayment_amt = m.get('total_net_repayment_amt')
        if m.get('activity_roi') is not None:
            self.activity_roi = m.get('activity_roi')
        return self


class ProcessConversionMetricData(TeaModel):
    def __init__(
        self,
        send: int = None,
        used: int = None,
        rate: str = None,
    ):
        # 发放数
        self.send = send
        # 核销数
        self.used = used
        # 核销转化率
        self.rate = rate

    def validate(self):
        self.validate_required(self.send, 'send')
        self.validate_required(self.used, 'used')
        self.validate_required(self.rate, 'rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.send is not None:
            result['send'] = self.send
        if self.used is not None:
            result['used'] = self.used
        if self.rate is not None:
            result['rate'] = self.rate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('send') is not None:
            self.send = m.get('send')
        if m.get('used') is not None:
            self.used = m.get('used')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        return self


class BenefitWriteOffMonthFileData(TeaModel):
    def __init__(
        self,
        billing_month: str = None,
        file_filed_id: str = None,
    ):
        # 所属月份
        self.billing_month = billing_month
        # AFTS 上传到文件 id
        self.file_filed_id = file_filed_id

    def validate(self):
        self.validate_required(self.billing_month, 'billing_month')
        self.validate_required(self.file_filed_id, 'file_filed_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.billing_month is not None:
            result['billing_month'] = self.billing_month
        if self.file_filed_id is not None:
            result['file_filed_id'] = self.file_filed_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('billing_month') is not None:
            self.billing_month = m.get('billing_month')
        if m.get('file_filed_id') is not None:
            self.file_filed_id = m.get('file_filed_id')
        return self


class QuerySupplierMonthwriteofffileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cloud_tenant_id: str = None,
        request_unique_id: str = None,
        billing_month: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 云站租户 id
        self.cloud_tenant_id = cloud_tenant_id
        # 请求唯一id
        # 
        self.request_unique_id = request_unique_id
        # 202408
        self.billing_month = billing_month

    def validate(self):
        self.validate_required(self.cloud_tenant_id, 'cloud_tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cloud_tenant_id is not None:
            result['cloud_tenant_id'] = self.cloud_tenant_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.billing_month is not None:
            result['billing_month'] = self.billing_month
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cloud_tenant_id') is not None:
            self.cloud_tenant_id = m.get('cloud_tenant_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('billing_month') is not None:
            self.billing_month = m.get('billing_month')
        return self


class QuerySupplierMonthwriteofffileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[BenefitWriteOffMonthFileData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 月度核销文件列表
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
                temp_model = BenefitWriteOffMonthFileData()
                self.data.append(temp_model.from_map(k))
        return self


class QuerySupplierFundamtRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_unique_id: str = None,
        cloud_tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求唯一id
        # 
        self.request_unique_id = request_unique_id
        # 云站供应商 租户 id
        self.cloud_tenant_id = cloud_tenant_id

    def validate(self):
        self.validate_required(self.cloud_tenant_id, 'cloud_tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.cloud_tenant_id is not None:
            result['cloud_tenant_id'] = self.cloud_tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('cloud_tenant_id') is not None:
            self.cloud_tenant_id = m.get('cloud_tenant_id')
        return self


class QuerySupplierFundamtResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        fund_account: str = None,
        write_off_amount: int = None,
        total_amount: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 出资账户
        self.fund_account = fund_account
        # 核销金额
        self.write_off_amount = write_off_amount
        # 供应商被占用总金额，单位分
        self.total_amount = total_amount

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
        if self.fund_account is not None:
            result['fund_account'] = self.fund_account
        if self.write_off_amount is not None:
            result['write_off_amount'] = self.write_off_amount
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('fund_account') is not None:
            self.fund_account = m.get('fund_account')
        if m.get('write_off_amount') is not None:
            self.write_off_amount = m.get('write_off_amount')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        return self


class AddSupplierPaymentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        payment_records: List[PaymentRecord] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 打款记录集
        self.payment_records = payment_records

    def validate(self):
        self.validate_required(self.payment_records, 'payment_records')
        if self.payment_records:
            for k in self.payment_records:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['payment_records'] = []
        if self.payment_records is not None:
            for k in self.payment_records:
                result['payment_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.payment_records = []
        if m.get('payment_records') is not None:
            for k in m.get('payment_records'):
                temp_model = PaymentRecord()
                self.payment_records.append(temp_model.from_map(k))
        return self


class AddSupplierPaymentResponse(TeaModel):
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
        # 添加打款记录成功
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


class CallbackOrgoperationRepayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        repay_record_no: str = None,
        status: str = None,
        ext_info: str = None,
        request_unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 还款编号
        self.repay_record_no = repay_record_no
        # 状态
        self.status = status
        # 扩展属性
        self.ext_info = ext_info
        # 请求唯一id，最长32字符
        self.request_unique_id = request_unique_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.repay_record_no, 'repay_record_no')
        self.validate_required(self.status, 'status')
        self.validate_required(self.request_unique_id, 'request_unique_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.repay_record_no is not None:
            result['repay_record_no'] = self.repay_record_no
        if self.status is not None:
            result['status'] = self.status
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('repay_record_no') is not None:
            self.repay_record_no = m.get('repay_record_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        return self


class CallbackOrgoperationRepayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RepayCallBackResData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款回调处理状态
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
            temp_model = RepayCallBackResData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryStatisticsBudgetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        request_unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        # 
        self.tenant_id = tenant_id
        # 请求唯一id
        self.request_unique_id = request_unique_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        return self


class QueryStatisticsBudgetResponse(TeaModel):
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
        # 当前租户总预算金额
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


class QueryStatisticsMetricsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        request_unique_id: str = None,
        type: str = None,
        start_date: str = None,
        end_date: str = None,
        date_unit: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 请求唯一id
        self.request_unique_id = request_unique_id
        # 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
        self.type = type
        # 查询开始时间: DAY:20240911; MONTH:202409
        self.start_date = start_date
        # 查询结束日期
        self.end_date = end_date
        # 日期单位: DAY,MONTH
        self.date_unit = date_unit

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.start_date, 'start_date')
        self.validate_required(self.end_date, 'end_date')
        self.validate_required(self.date_unit, 'date_unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.type is not None:
            result['type'] = self.type
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.date_unit is not None:
            result['date_unit'] = self.date_unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('date_unit') is not None:
            self.date_unit = m.get('date_unit')
        return self


class QueryStatisticsMetricsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: MetricData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 统计指标结果
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
            temp_model = MetricData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryStatisticsConversionmetricsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        request_unique_id: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        # 
        self.tenant_id = tenant_id
        # 请求唯一id
        # 
        self.request_unique_id = request_unique_id
        # VOUCHER_CONVERSION, USER_CONVERSION
        self.type = type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryStatisticsConversionmetricsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ProcessConversionMetricData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 统计过程转化指标结果
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
            temp_model = ProcessConversionMetricData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryStatisticsOrgoverviewRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        start_date: str = None,
        end_date: str = None,
        tenant_id: str = None,
        request_unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 开始时间
        self.start_date = start_date
        # 结束日期
        self.end_date = end_date
        # 租户
        self.tenant_id = tenant_id
        # 请求唯一id
        self.request_unique_id = request_unique_id

    def validate(self):
        self.validate_required(self.start_date, 'start_date')
        self.validate_required(self.end_date, 'end_date')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.request_unique_id, 'request_unique_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        return self


class QueryStatisticsOrgoverviewResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: OrgOverviewData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 机构总览数据
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
            temp_model = OrgOverviewData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryStatisticsOrgtrendRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        start_date: str = None,
        end_date: str = None,
        tenant_id: str = None,
        request_unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 开始日期
        self.start_date = start_date
        # 结束日期
        self.end_date = end_date
        # 租户id
        self.tenant_id = tenant_id
        # 请求唯一标识
        self.request_unique_id = request_unique_id

    def validate(self):
        self.validate_required(self.start_date, 'start_date')
        self.validate_required(self.end_date, 'end_date')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.request_unique_id, 'request_unique_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        return self


class QueryStatisticsOrgtrendResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[OrgTrendData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 机构趋势数据
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
                temp_model = OrgTrendData()
                self.data.append(temp_model.from_map(k))
        return self


class QueryStatisticsOrgconversionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        start_date: str = None,
        end_date: str = None,
        tenant_id: str = None,
        request_unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 开始日期
        self.start_date = start_date
        # 结束日期
        self.end_date = end_date
        # 租户id
        self.tenant_id = tenant_id
        # 请求唯一标识
        self.request_unique_id = request_unique_id

    def validate(self):
        self.validate_required(self.start_date, 'start_date')
        self.validate_required(self.end_date, 'end_date')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.request_unique_id, 'request_unique_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        return self


class QueryStatisticsOrgconversionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ConversionData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 转化数据
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
                temp_model = ConversionData()
                self.data.append(temp_model.from_map(k))
        return self


class QueryStatisticsOrgtraderangeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        start_date: str = None,
        end_date: str = None,
        tenant_id: str = None,
        request_unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 开始日期
        self.start_date = start_date
        # 结束日期
        self.end_date = end_date
        # 租户id
        self.tenant_id = tenant_id
        # 请求唯一标识
        self.request_unique_id = request_unique_id

    def validate(self):
        self.validate_required(self.start_date, 'start_date')
        self.validate_required(self.end_date, 'end_date')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.request_unique_id, 'request_unique_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        return self


class QueryStatisticsOrgtraderangeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[TradeRangeData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易区间统计
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
                temp_model = TradeRangeData()
                self.data.append(temp_model.from_map(k))
        return self


