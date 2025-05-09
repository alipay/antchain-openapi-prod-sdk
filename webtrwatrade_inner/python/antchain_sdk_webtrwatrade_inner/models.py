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
        # 金额，以元为单位，保留2位小数
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


class InvestmentReportByPackageInner(TeaModel):
    def __init__(
        self,
        estimated_annualized: MultiCurrencyMoney = None,
        actual_annualized_yield: str = None,
        estimated_annualized_yield: str = None,
        match_rate: str = None,
        investment_amount: MultiCurrencyMoney = None,
        actual_annualized: MultiCurrencyMoney = None,
        collateral_rate: str = None,
        dt: str = None,
        cash_flow_coverage_quarterly_repayment_amount_ratio: str = None,
        cash_flow: MultiCurrencyMoney = None,
        collateral_total_value: MultiCurrencyMoney = None,
    ):
        # 预期收益
        self.estimated_annualized = estimated_annualized
        # 实际收益率(Annual Yield)
        self.actual_annualized_yield = actual_annualized_yield
        # 预期收益率（Expect Yield）
        self.estimated_annualized_yield = estimated_annualized_yield
        # 毛利吻合率（Gross Profit Conformity）
        self.match_rate = match_rate
        # 投资金额（Investment Allocation）
        self.investment_amount = investment_amount
        # 实际收益
        self.actual_annualized = actual_annualized
        # 资产抵押率（Collateral Ratio）
        self.collateral_rate = collateral_rate
        # 数据日期
        self.dt = dt
        # 现金流覆盖季度还款金额比例
        self.cash_flow_coverage_quarterly_repayment_amount_ratio = cash_flow_coverage_quarterly_repayment_amount_ratio
        # 现金流
        self.cash_flow = cash_flow
        # 抵押物总值
        self.collateral_total_value = collateral_total_value

    def validate(self):
        self.validate_required(self.estimated_annualized, 'estimated_annualized')
        if self.estimated_annualized:
            self.estimated_annualized.validate()
        self.validate_required(self.actual_annualized_yield, 'actual_annualized_yield')
        self.validate_required(self.estimated_annualized_yield, 'estimated_annualized_yield')
        self.validate_required(self.match_rate, 'match_rate')
        self.validate_required(self.investment_amount, 'investment_amount')
        if self.investment_amount:
            self.investment_amount.validate()
        self.validate_required(self.actual_annualized, 'actual_annualized')
        if self.actual_annualized:
            self.actual_annualized.validate()
        self.validate_required(self.collateral_rate, 'collateral_rate')
        self.validate_required(self.dt, 'dt')
        self.validate_required(self.cash_flow_coverage_quarterly_repayment_amount_ratio, 'cash_flow_coverage_quarterly_repayment_amount_ratio')
        self.validate_required(self.cash_flow, 'cash_flow')
        if self.cash_flow:
            self.cash_flow.validate()
        self.validate_required(self.collateral_total_value, 'collateral_total_value')
        if self.collateral_total_value:
            self.collateral_total_value.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.estimated_annualized is not None:
            result['estimated_annualized'] = self.estimated_annualized.to_map()
        if self.actual_annualized_yield is not None:
            result['actual_annualized_yield'] = self.actual_annualized_yield
        if self.estimated_annualized_yield is not None:
            result['estimated_annualized_yield'] = self.estimated_annualized_yield
        if self.match_rate is not None:
            result['match_rate'] = self.match_rate
        if self.investment_amount is not None:
            result['investment_amount'] = self.investment_amount.to_map()
        if self.actual_annualized is not None:
            result['actual_annualized'] = self.actual_annualized.to_map()
        if self.collateral_rate is not None:
            result['collateral_rate'] = self.collateral_rate
        if self.dt is not None:
            result['dt'] = self.dt
        if self.cash_flow_coverage_quarterly_repayment_amount_ratio is not None:
            result['cash_flow_coverage_quarterly_repayment_amount_ratio'] = self.cash_flow_coverage_quarterly_repayment_amount_ratio
        if self.cash_flow is not None:
            result['cash_flow'] = self.cash_flow.to_map()
        if self.collateral_total_value is not None:
            result['collateral_total_value'] = self.collateral_total_value.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('estimated_annualized') is not None:
            temp_model = MultiCurrencyMoney()
            self.estimated_annualized = temp_model.from_map(m['estimated_annualized'])
        if m.get('actual_annualized_yield') is not None:
            self.actual_annualized_yield = m.get('actual_annualized_yield')
        if m.get('estimated_annualized_yield') is not None:
            self.estimated_annualized_yield = m.get('estimated_annualized_yield')
        if m.get('match_rate') is not None:
            self.match_rate = m.get('match_rate')
        if m.get('investment_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.investment_amount = temp_model.from_map(m['investment_amount'])
        if m.get('actual_annualized') is not None:
            temp_model = MultiCurrencyMoney()
            self.actual_annualized = temp_model.from_map(m['actual_annualized'])
        if m.get('collateral_rate') is not None:
            self.collateral_rate = m.get('collateral_rate')
        if m.get('dt') is not None:
            self.dt = m.get('dt')
        if m.get('cash_flow_coverage_quarterly_repayment_amount_ratio') is not None:
            self.cash_flow_coverage_quarterly_repayment_amount_ratio = m.get('cash_flow_coverage_quarterly_repayment_amount_ratio')
        if m.get('cash_flow') is not None:
            temp_model = MultiCurrencyMoney()
            self.cash_flow = temp_model.from_map(m['cash_flow'])
        if m.get('collateral_total_value') is not None:
            temp_model = MultiCurrencyMoney()
            self.collateral_total_value = temp_model.from_map(m['collateral_total_value'])
        return self


class InvestmentReportInner(TeaModel):
    def __init__(
        self,
        estimated_annualized: MultiCurrencyMoney = None,
        actual_annualized_yield: str = None,
        estimated_annualized_yield: str = None,
        match_rate: str = None,
        investment_amount: MultiCurrencyMoney = None,
        actual_annualized: MultiCurrencyMoney = None,
        collateral_rate: str = None,
        dt: str = None,
        cash_flow_coverage_quarterly_repayment_amount_ratio: str = None,
        cash_flow: MultiCurrencyMoney = None,
        initial_asset_total_value: MultiCurrencyMoney = None,
    ):
        # 预期收益
        # 
        self.estimated_annualized = estimated_annualized
        # 实际收益率（Annual Yield）
        # 
        self.actual_annualized_yield = actual_annualized_yield
        # 预期收益率（Expect Yield）
        self.estimated_annualized_yield = estimated_annualized_yield
        # 毛利吻合率（Gross Profit Conformity）
        self.match_rate = match_rate
        # 投资金额（Investment Allocation）
        self.investment_amount = investment_amount
        # 实际收益
        self.actual_annualized = actual_annualized
        # 资产抵押率（Collateral Ratio）
        self.collateral_rate = collateral_rate
        # 数据日期
        self.dt = dt
        # 现金流覆盖季度还款金额比例
        self.cash_flow_coverage_quarterly_repayment_amount_ratio = cash_flow_coverage_quarterly_repayment_amount_ratio
        # 现金流
        self.cash_flow = cash_flow
        # 初始资产总值
        self.initial_asset_total_value = initial_asset_total_value

    def validate(self):
        self.validate_required(self.estimated_annualized, 'estimated_annualized')
        if self.estimated_annualized:
            self.estimated_annualized.validate()
        self.validate_required(self.actual_annualized_yield, 'actual_annualized_yield')
        self.validate_required(self.estimated_annualized_yield, 'estimated_annualized_yield')
        self.validate_required(self.match_rate, 'match_rate')
        self.validate_required(self.investment_amount, 'investment_amount')
        if self.investment_amount:
            self.investment_amount.validate()
        self.validate_required(self.actual_annualized, 'actual_annualized')
        if self.actual_annualized:
            self.actual_annualized.validate()
        self.validate_required(self.collateral_rate, 'collateral_rate')
        self.validate_required(self.dt, 'dt')
        self.validate_required(self.cash_flow_coverage_quarterly_repayment_amount_ratio, 'cash_flow_coverage_quarterly_repayment_amount_ratio')
        self.validate_required(self.cash_flow, 'cash_flow')
        if self.cash_flow:
            self.cash_flow.validate()
        self.validate_required(self.initial_asset_total_value, 'initial_asset_total_value')
        if self.initial_asset_total_value:
            self.initial_asset_total_value.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.estimated_annualized is not None:
            result['estimated_annualized'] = self.estimated_annualized.to_map()
        if self.actual_annualized_yield is not None:
            result['actual_annualized_yield'] = self.actual_annualized_yield
        if self.estimated_annualized_yield is not None:
            result['estimated_annualized_yield'] = self.estimated_annualized_yield
        if self.match_rate is not None:
            result['match_rate'] = self.match_rate
        if self.investment_amount is not None:
            result['investment_amount'] = self.investment_amount.to_map()
        if self.actual_annualized is not None:
            result['actual_annualized'] = self.actual_annualized.to_map()
        if self.collateral_rate is not None:
            result['collateral_rate'] = self.collateral_rate
        if self.dt is not None:
            result['dt'] = self.dt
        if self.cash_flow_coverage_quarterly_repayment_amount_ratio is not None:
            result['cash_flow_coverage_quarterly_repayment_amount_ratio'] = self.cash_flow_coverage_quarterly_repayment_amount_ratio
        if self.cash_flow is not None:
            result['cash_flow'] = self.cash_flow.to_map()
        if self.initial_asset_total_value is not None:
            result['initial_asset_total_value'] = self.initial_asset_total_value.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('estimated_annualized') is not None:
            temp_model = MultiCurrencyMoney()
            self.estimated_annualized = temp_model.from_map(m['estimated_annualized'])
        if m.get('actual_annualized_yield') is not None:
            self.actual_annualized_yield = m.get('actual_annualized_yield')
        if m.get('estimated_annualized_yield') is not None:
            self.estimated_annualized_yield = m.get('estimated_annualized_yield')
        if m.get('match_rate') is not None:
            self.match_rate = m.get('match_rate')
        if m.get('investment_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.investment_amount = temp_model.from_map(m['investment_amount'])
        if m.get('actual_annualized') is not None:
            temp_model = MultiCurrencyMoney()
            self.actual_annualized = temp_model.from_map(m['actual_annualized'])
        if m.get('collateral_rate') is not None:
            self.collateral_rate = m.get('collateral_rate')
        if m.get('dt') is not None:
            self.dt = m.get('dt')
        if m.get('cash_flow_coverage_quarterly_repayment_amount_ratio') is not None:
            self.cash_flow_coverage_quarterly_repayment_amount_ratio = m.get('cash_flow_coverage_quarterly_repayment_amount_ratio')
        if m.get('cash_flow') is not None:
            temp_model = MultiCurrencyMoney()
            self.cash_flow = temp_model.from_map(m['cash_flow'])
        if m.get('initial_asset_total_value') is not None:
            temp_model = MultiCurrencyMoney()
            self.initial_asset_total_value = temp_model.from_map(m['initial_asset_total_value'])
        return self


class QueryPlatformInvestmentreportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_external_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 可信产业资产项目批次id
        self.project_external_id = project_external_id

    def validate(self):
        self.validate_required(self.project_external_id, 'project_external_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_external_id is not None:
            result['project_external_id'] = self.project_external_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_external_id') is not None:
            self.project_external_id = m.get('project_external_id')
        return self


class QueryPlatformInvestmentreportResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: InvestmentReportInner = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内部投资者报表数据
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
            temp_model = InvestmentReportInner()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryPlatformInvestmentreportbypackageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_external_id: str = None,
        asset_package_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 可信产业资产项目批次id
        self.project_external_id = project_external_id
        # 资产包id
        self.asset_package_id = asset_package_id

    def validate(self):
        self.validate_required(self.project_external_id, 'project_external_id')
        self.validate_required(self.asset_package_id, 'asset_package_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_external_id is not None:
            result['project_external_id'] = self.project_external_id
        if self.asset_package_id is not None:
            result['asset_package_id'] = self.asset_package_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_external_id') is not None:
            self.project_external_id = m.get('project_external_id')
        if m.get('asset_package_id') is not None:
            self.asset_package_id = m.get('asset_package_id')
        return self


class QueryPlatformInvestmentreportbypackageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: InvestmentReportByPackageInner = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内部投资者报表数据(资产包维度)
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
            temp_model = InvestmentReportByPackageInner()
            self.data = temp_model.from_map(m['data'])
        return self


