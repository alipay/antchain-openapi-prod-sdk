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


class ChatMessageInfo(TeaModel):
    def __init__(
        self,
        session_id: str = None,
        query: str = None,
        answer: str = None,
        create_date: str = None,
    ):
        # 会话ID
        self.session_id = session_id
        # 提问内容
        self.query = query
        # 恢复内容
        self.answer = answer
        # 创建时间
        self.create_date = create_date

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.create_date, 'create_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.query is not None:
            result['query'] = self.query
        if self.answer is not None:
            result['answer'] = self.answer
        if self.create_date is not None:
            result['create_date'] = self.create_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('answer') is not None:
            self.answer = m.get('answer')
        if m.get('create_date') is not None:
            self.create_date = m.get('create_date')
        return self


class IndustryData(TeaModel):
    def __init__(
        self,
        industry: str = None,
        province: str = None,
        trade_date: str = None,
        ofp_type: str = None,
        trade_scale: str = None,
        trade_activity: str = None,
        trade_value: str = None,
        trade_coverage: str = None,
    ):
        # 行业
        self.industry = industry
        # 区域
        self.province = province
        # 日期
        self.trade_date = trade_date
        # 线上线下 1:线下，0:线上，-1:全部
        self.ofp_type = ofp_type
        # 消费规模指数(销售金额)
        self.trade_scale = trade_scale
        # 交易活跃指数(次数)
        self.trade_activity = trade_activity
        # 消费价值指数(金额/次数)
        self.trade_value = trade_value
        # 交易覆盖指数(去重人数)
        self.trade_coverage = trade_coverage

    def validate(self):
        self.validate_required(self.industry, 'industry')
        self.validate_required(self.province, 'province')
        self.validate_required(self.trade_date, 'trade_date')
        self.validate_required(self.ofp_type, 'ofp_type')
        self.validate_required(self.trade_scale, 'trade_scale')
        self.validate_required(self.trade_activity, 'trade_activity')
        self.validate_required(self.trade_value, 'trade_value')
        self.validate_required(self.trade_coverage, 'trade_coverage')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.industry is not None:
            result['industry'] = self.industry
        if self.province is not None:
            result['province'] = self.province
        if self.trade_date is not None:
            result['trade_date'] = self.trade_date
        if self.ofp_type is not None:
            result['ofp_type'] = self.ofp_type
        if self.trade_scale is not None:
            result['trade_scale'] = self.trade_scale
        if self.trade_activity is not None:
            result['trade_activity'] = self.trade_activity
        if self.trade_value is not None:
            result['trade_value'] = self.trade_value
        if self.trade_coverage is not None:
            result['trade_coverage'] = self.trade_coverage
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('trade_date') is not None:
            self.trade_date = m.get('trade_date')
        if m.get('ofp_type') is not None:
            self.ofp_type = m.get('ofp_type')
        if m.get('trade_scale') is not None:
            self.trade_scale = m.get('trade_scale')
        if m.get('trade_activity') is not None:
            self.trade_activity = m.get('trade_activity')
        if m.get('trade_value') is not None:
            self.trade_value = m.get('trade_value')
        if m.get('trade_coverage') is not None:
            self.trade_coverage = m.get('trade_coverage')
        return self


class ChatConversationInfo(TeaModel):
    def __init__(
        self,
        session_id: str = None,
        user_id: str = None,
        agent_id: str = None,
        title: str = None,
        create_date: str = None,
    ):
        # 会话ID
        self.session_id = session_id
        # 用户ID
        self.user_id = user_id
        # agent ID
        self.agent_id = agent_id
        # 会话名称
        self.title = title
        # 创建时间
        self.create_date = create_date

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.agent_id, 'agent_id')
        self.validate_required(self.create_date, 'create_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.title is not None:
            result['title'] = self.title
        if self.create_date is not None:
            result['create_date'] = self.create_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('create_date') is not None:
            self.create_date = m.get('create_date')
        return self


class FeatureSetInfo(TeaModel):
    def __init__(
        self,
        featureset_code: str = None,
        featureset_name: str = None,
        nums: str = None,
        desc: str = None,
    ):
        # 特征集编码
        self.featureset_code = featureset_code
        # 名称
        self.featureset_name = featureset_name
        # 数量
        self.nums = nums
        # 描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.featureset_code, 'featureset_code')
        self.validate_required(self.featureset_name, 'featureset_name')
        self.validate_required(self.nums, 'nums')
        self.validate_required(self.desc, 'desc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.featureset_code is not None:
            result['featureset_code'] = self.featureset_code
        if self.featureset_name is not None:
            result['featureset_name'] = self.featureset_name
        if self.nums is not None:
            result['nums'] = self.nums
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('featureset_code') is not None:
            self.featureset_code = m.get('featureset_code')
        if m.get('featureset_name') is not None:
            self.featureset_name = m.get('featureset_name')
        if m.get('nums') is not None:
            self.nums = m.get('nums')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class CarUserMatch(TeaModel):
    def __init__(
        self,
        match_id: str = None,
        id_type: str = None,
    ):
        # 设备号或者手机号md5
        self.match_id = match_id
        # 需要匹配的id类型：手机号md5、安卓设备号md5、ios设备号md5
        self.id_type = id_type

    def validate(self):
        self.validate_required(self.match_id, 'match_id')
        self.validate_required(self.id_type, 'id_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.match_id is not None:
            result['match_id'] = self.match_id
        if self.id_type is not None:
            result['id_type'] = self.id_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('match_id') is not None:
            self.match_id = m.get('match_id')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        return self


class IndexData(TeaModel):
    def __init__(
        self,
        month: str = None,
        city_tier: str = None,
        province_code: str = None,
        total_cnt: str = None,
        total_amt: str = None,
        total_shop: str = None,
        total_csm: str = None,
        existing_cnt: str = None,
        existing_amt: str = None,
        existing_shop: str = None,
        new_shop: str = None,
        amt_range: str = None,
        shop_tag: str = None,
        brand_code: str = None,
        existing_amt_last_year: str = None,
        date: str = None,
    ):
        # 月份
        # 
        self.month = month
        # 高低线
        self.city_tier = city_tier
        # 省份编码
        self.province_code = province_code
        # 总交易笔数指数
        self.total_cnt = total_cnt
        # 总交易金额指数
        self.total_amt = total_amt
        # 总店铺数指数
        self.total_shop = total_shop
        # 去重用户数指数
        self.total_csm = total_csm
        # 其中老店店铺总交易笔数指数
        self.existing_cnt = existing_cnt
        # 其中老店店铺总交易金额
        self.existing_amt = existing_amt
        # 其中老店店铺数量指数
        self.existing_shop = existing_shop
        # 当月新增店铺数指数
        self.new_shop = new_shop
        # 分金额段指数
        self.amt_range = amt_range
        # 店铺标签指数
        self.shop_tag = shop_tag
        # 品牌码
        self.brand_code = brand_code
        # 同店上年同期评分
        self.existing_amt_last_year = existing_amt_last_year
        # 年月日
        self.date = date

    def validate(self):
        self.validate_required(self.month, 'month')
        self.validate_required(self.city_tier, 'city_tier')
        self.validate_required(self.province_code, 'province_code')
        self.validate_required(self.total_cnt, 'total_cnt')
        self.validate_required(self.total_amt, 'total_amt')
        self.validate_required(self.total_shop, 'total_shop')
        self.validate_required(self.total_csm, 'total_csm')
        self.validate_required(self.existing_cnt, 'existing_cnt')
        self.validate_required(self.existing_amt, 'existing_amt')
        self.validate_required(self.existing_shop, 'existing_shop')
        self.validate_required(self.new_shop, 'new_shop')
        self.validate_required(self.amt_range, 'amt_range')
        self.validate_required(self.shop_tag, 'shop_tag')
        self.validate_required(self.brand_code, 'brand_code')
        self.validate_required(self.existing_amt_last_year, 'existing_amt_last_year')
        self.validate_required(self.date, 'date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.month is not None:
            result['month'] = self.month
        if self.city_tier is not None:
            result['city_tier'] = self.city_tier
        if self.province_code is not None:
            result['province_code'] = self.province_code
        if self.total_cnt is not None:
            result['total_cnt'] = self.total_cnt
        if self.total_amt is not None:
            result['total_amt'] = self.total_amt
        if self.total_shop is not None:
            result['total_shop'] = self.total_shop
        if self.total_csm is not None:
            result['total_csm'] = self.total_csm
        if self.existing_cnt is not None:
            result['existing_cnt'] = self.existing_cnt
        if self.existing_amt is not None:
            result['existing_amt'] = self.existing_amt
        if self.existing_shop is not None:
            result['existing_shop'] = self.existing_shop
        if self.new_shop is not None:
            result['new_shop'] = self.new_shop
        if self.amt_range is not None:
            result['amt_range'] = self.amt_range
        if self.shop_tag is not None:
            result['shop_tag'] = self.shop_tag
        if self.brand_code is not None:
            result['brand_code'] = self.brand_code
        if self.existing_amt_last_year is not None:
            result['existing_amt_last_year'] = self.existing_amt_last_year
        if self.date is not None:
            result['date'] = self.date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('month') is not None:
            self.month = m.get('month')
        if m.get('city_tier') is not None:
            self.city_tier = m.get('city_tier')
        if m.get('province_code') is not None:
            self.province_code = m.get('province_code')
        if m.get('total_cnt') is not None:
            self.total_cnt = m.get('total_cnt')
        if m.get('total_amt') is not None:
            self.total_amt = m.get('total_amt')
        if m.get('total_shop') is not None:
            self.total_shop = m.get('total_shop')
        if m.get('total_csm') is not None:
            self.total_csm = m.get('total_csm')
        if m.get('existing_cnt') is not None:
            self.existing_cnt = m.get('existing_cnt')
        if m.get('existing_amt') is not None:
            self.existing_amt = m.get('existing_amt')
        if m.get('existing_shop') is not None:
            self.existing_shop = m.get('existing_shop')
        if m.get('new_shop') is not None:
            self.new_shop = m.get('new_shop')
        if m.get('amt_range') is not None:
            self.amt_range = m.get('amt_range')
        if m.get('shop_tag') is not None:
            self.shop_tag = m.get('shop_tag')
        if m.get('brand_code') is not None:
            self.brand_code = m.get('brand_code')
        if m.get('existing_amt_last_year') is not None:
            self.existing_amt_last_year = m.get('existing_amt_last_year')
        if m.get('date') is not None:
            self.date = m.get('date')
        return self


class GwCallDataStats(TeaModel):
    def __init__(
        self,
        invoke_tenant: str = None,
        invoke_tenant_id: str = None,
        access_key: str = None,
        invoke_count: str = None,
        success_count: str = None,
        id: str = None,
    ):
        # 租户
        self.invoke_tenant = invoke_tenant
        # 租户ID
        self.invoke_tenant_id = invoke_tenant_id
        # 公key
        self.access_key = access_key
        # 调用数量
        self.invoke_count = invoke_count
        # 调用查得统计
        self.success_count = success_count
        # id
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoke_tenant is not None:
            result['invoke_tenant'] = self.invoke_tenant
        if self.invoke_tenant_id is not None:
            result['invoke_tenant_id'] = self.invoke_tenant_id
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.invoke_count is not None:
            result['invoke_count'] = self.invoke_count
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoke_tenant') is not None:
            self.invoke_tenant = m.get('invoke_tenant')
        if m.get('invoke_tenant_id') is not None:
            self.invoke_tenant_id = m.get('invoke_tenant_id')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('invoke_count') is not None:
            self.invoke_count = m.get('invoke_count')
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class PageInfo(TeaModel):
    def __init__(
        self,
        total: int = None,
        page_index: int = None,
        page_size: int = None,
    ):
        # 总数量
        self.total = total
        # 当前页
        self.page_index = page_index
        # 页容量
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class XNameValuePair(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 键名
        self.name = name
        # 键值
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class QueryAgentSseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        session_id: str = None,
        query: str = None,
        alive_time: int = None,
        agent_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_id = user_id
        # 会话id
        self.session_id = session_id
        # 查询词条
        self.query = query
        # 会话存活时长，单位毫秒，默认5分钟，最大不超过10分钟
        self.alive_time = alive_time
        # agent_id
        self.agent_id = agent_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.query, 'query')
        self.validate_required(self.alive_time, 'alive_time')
        self.validate_required(self.agent_id, 'agent_id')

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
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.query is not None:
            result['query'] = self.query
        if self.alive_time is not None:
            result['alive_time'] = self.alive_time
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('alive_time') is not None:
            self.alive_time = m.get('alive_time')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        return self


class QueryAgentSseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 消息
        self.message = message

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
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class ListAgentConversationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        agent_id: str = None,
        page_info: PageInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_id = user_id
        # agent id
        self.agent_id = agent_id
        # page_info
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.agent_id, 'agent_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class ListAgentConversationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_info: PageInfo = None,
        conversation_data: List[ChatConversationInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # page_info
        self.page_info = page_info
        # 会话列表信息
        self.conversation_data = conversation_data

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.conversation_data:
            for k in self.conversation_data:
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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        result['conversation_data'] = []
        if self.conversation_data is not None:
            for k in self.conversation_data:
                result['conversation_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        self.conversation_data = []
        if m.get('conversation_data') is not None:
            for k in m.get('conversation_data'):
                temp_model = ChatConversationInfo()
                self.conversation_data.append(temp_model.from_map(k))
        return self


class DeleteAgentConversationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        session_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_id = user_id
        # 会话ID
        self.session_id = session_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.session_id, 'session_id')

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
        if self.session_id is not None:
            result['session_id'] = self.session_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        return self


class DeleteAgentConversationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class BatchdeleteAgentConversationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class BatchdeleteAgentConversationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class ListAgentMessageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        session_id: str = None,
        page_info: PageInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 会话ID
        self.session_id = session_id
        # page_info
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class ListAgentMessageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_info: PageInfo = None,
        message_data: List[ChatMessageInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # page_info
        self.page_info = page_info
        # 消息列表
        self.message_data = message_data

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.message_data:
            for k in self.message_data:
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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        result['message_data'] = []
        if self.message_data is not None:
            for k in self.message_data:
                result['message_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        self.message_data = []
        if m.get('message_data') is not None:
            for k in m.get('message_data'):
                temp_model = ChatMessageInfo()
                self.message_data.append(temp_model.from_map(k))
        return self


class UpdateAgentConversationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        session_id: str = None,
        title: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_id = user_id
        # 会话ID
        self.session_id = session_id
        # 会话名称
        self.title = title

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.title, 'title')

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
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.title is not None:
            result['title'] = self.title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        return self


class UpdateAgentConversationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryAgentCompletionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        session_id: str = None,
        query: str = None,
        alive_time: int = None,
        agent_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_id = user_id
        # 会话id
        self.session_id = session_id
        # 查询词条
        self.query = query
        # 会话存活时长，单位毫秒，默认5分钟，最大不超过10分钟
        self.alive_time = alive_time
        # agent_id
        self.agent_id = agent_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.query, 'query')
        self.validate_required(self.agent_id, 'agent_id')

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
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.query is not None:
            result['query'] = self.query
        if self.alive_time is not None:
            result['alive_time'] = self.alive_time
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('alive_time') is not None:
            self.alive_time = m.get('alive_time')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        return self


class QueryAgentCompletionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 消息
        self.message = message

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
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class MatchCarloanUsersRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        match_id: str = None,
        id_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需要匹配的值
        self.match_id = match_id
        # 需要匹配的id类型：手机号md5、安卓设备号md5、ios设备号md5
        self.id_type = id_type

    def validate(self):
        self.validate_required(self.match_id, 'match_id')
        self.validate_required(self.id_type, 'id_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.match_id is not None:
            result['match_id'] = self.match_id
        if self.id_type is not None:
            result['id_type'] = self.id_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('match_id') is not None:
            self.match_id = m.get('match_id')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        return self


class MatchCarloanUsersResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        is_success: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成功或者失败
        self.is_success = is_success

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
        if self.is_success is not None:
            result['is_success'] = self.is_success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('is_success') is not None:
            self.is_success = m.get('is_success')
        return self


class BatchqueryCarloanUsersRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_match: List[CarUserMatch] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户匹配数据
        self.user_match = user_match

    def validate(self):
        self.validate_required(self.user_match, 'user_match')
        if self.user_match:
            for k in self.user_match:
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
        result['user_match'] = []
        if self.user_match is not None:
            for k in self.user_match:
                result['user_match'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.user_match = []
        if m.get('user_match') is not None:
            for k in m.get('user_match'):
                temp_model = CarUserMatch()
                self.user_match.append(temp_model.from_map(k))
        return self


class BatchqueryCarloanUsersResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        match_result: List[int] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 匹配成功的index
        self.match_result = match_result

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
        if self.match_result is not None:
            result['match_result'] = self.match_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('match_result') is not None:
            self.match_result = m.get('match_result')
        return self


class ImportCarloanUsersRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class ImportCarloanUsersResponse(TeaModel):
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


class AddCaruserUsersRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        business_id: List[str] = None,
        data_uniqlo_code: str = None,
        data_phase_code: str = None,
        phase_data_num: int = None,
        uniqlo_data_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务的id
        self.business_id = business_id
        # 数据的唯一code
        self.data_uniqlo_code = data_uniqlo_code
        # 批次数据编号
        self.data_phase_code = data_phase_code
        # 批次的数据量
        self.phase_data_num = phase_data_num
        # 整体数据量
        self.uniqlo_data_num = uniqlo_data_num

    def validate(self):
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.data_uniqlo_code, 'data_uniqlo_code')
        self.validate_required(self.data_phase_code, 'data_phase_code')
        self.validate_required(self.phase_data_num, 'phase_data_num')
        self.validate_required(self.uniqlo_data_num, 'uniqlo_data_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.data_uniqlo_code is not None:
            result['data_uniqlo_code'] = self.data_uniqlo_code
        if self.data_phase_code is not None:
            result['data_phase_code'] = self.data_phase_code
        if self.phase_data_num is not None:
            result['phase_data_num'] = self.phase_data_num
        if self.uniqlo_data_num is not None:
            result['uniqlo_data_num'] = self.uniqlo_data_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('data_uniqlo_code') is not None:
            self.data_uniqlo_code = m.get('data_uniqlo_code')
        if m.get('data_phase_code') is not None:
            self.data_phase_code = m.get('data_phase_code')
        if m.get('phase_data_num') is not None:
            self.phase_data_num = m.get('phase_data_num')
        if m.get('uniqlo_data_num') is not None:
            self.uniqlo_data_num = m.get('uniqlo_data_num')
        return self


class AddCaruserUsersResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        process_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 处理结果
        self.process_result = process_result

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
        if self.process_result is not None:
            result['process_result'] = self.process_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('process_result') is not None:
            self.process_result = m.get('process_result')
        return self


class QueryCarloanUsersRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        date: str = None,
        page_info: PageInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 日期
        self.date = date
        # 分页
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.date is not None:
            result['date'] = self.date
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class QueryCarloanUsersResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
        page_info: PageInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务id
        self.data = data
        # 分页
        self.page_info = page_info

    def validate(self):
        if self.page_info:
            self.page_info.validate()

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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
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
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class AddCaruserTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        business_id: List[str] = None,
        data_uniqlo_code: str = None,
        data_phase_code: str = None,
        phase_data_num: int = None,
        uniqlo_data_num: int = None,
        business_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务的id
        self.business_id = business_id
        # 数据的唯一code
        self.data_uniqlo_code = data_uniqlo_code
        # 批次数据编号
        self.data_phase_code = data_phase_code
        # 批次的数据量
        self.phase_data_num = phase_data_num
        # 整体数据量
        self.uniqlo_data_num = uniqlo_data_num
        # 业务类型
        self.business_type = business_type

    def validate(self):
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.data_uniqlo_code, 'data_uniqlo_code')
        self.validate_required(self.data_phase_code, 'data_phase_code')
        self.validate_required(self.phase_data_num, 'phase_data_num')
        self.validate_required(self.uniqlo_data_num, 'uniqlo_data_num')
        self.validate_required(self.business_type, 'business_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.data_uniqlo_code is not None:
            result['data_uniqlo_code'] = self.data_uniqlo_code
        if self.data_phase_code is not None:
            result['data_phase_code'] = self.data_phase_code
        if self.phase_data_num is not None:
            result['phase_data_num'] = self.phase_data_num
        if self.uniqlo_data_num is not None:
            result['uniqlo_data_num'] = self.uniqlo_data_num
        if self.business_type is not None:
            result['business_type'] = self.business_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('data_uniqlo_code') is not None:
            self.data_uniqlo_code = m.get('data_uniqlo_code')
        if m.get('data_phase_code') is not None:
            self.data_phase_code = m.get('data_phase_code')
        if m.get('phase_data_num') is not None:
            self.phase_data_num = m.get('phase_data_num')
        if m.get('uniqlo_data_num') is not None:
            self.uniqlo_data_num = m.get('uniqlo_data_num')
        if m.get('business_type') is not None:
            self.business_type = m.get('business_type')
        return self


class AddCaruserTestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        process_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 处理结果
        self.process_result = process_result

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
        if self.process_result is not None:
            result['process_result'] = self.process_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('process_result') is not None:
            self.process_result = m.get('process_result')
        return self


class AddCaruserPrdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        business_id: List[str] = None,
        data_uniqlo_code: str = None,
        data_phase_code: str = None,
        phase_data_num: int = None,
        uniqlo_data_num: int = None,
        business_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务的id
        self.business_id = business_id
        # 数据的唯一code
        self.data_uniqlo_code = data_uniqlo_code
        # 批次数据编号
        self.data_phase_code = data_phase_code
        # 批次的数据量
        self.phase_data_num = phase_data_num
        # 整体数据量
        self.uniqlo_data_num = uniqlo_data_num
        # 业务类型
        self.business_type = business_type

    def validate(self):
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.data_uniqlo_code, 'data_uniqlo_code')
        self.validate_required(self.data_phase_code, 'data_phase_code')
        self.validate_required(self.phase_data_num, 'phase_data_num')
        self.validate_required(self.uniqlo_data_num, 'uniqlo_data_num')
        self.validate_required(self.business_type, 'business_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.data_uniqlo_code is not None:
            result['data_uniqlo_code'] = self.data_uniqlo_code
        if self.data_phase_code is not None:
            result['data_phase_code'] = self.data_phase_code
        if self.phase_data_num is not None:
            result['phase_data_num'] = self.phase_data_num
        if self.uniqlo_data_num is not None:
            result['uniqlo_data_num'] = self.uniqlo_data_num
        if self.business_type is not None:
            result['business_type'] = self.business_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('data_uniqlo_code') is not None:
            self.data_uniqlo_code = m.get('data_uniqlo_code')
        if m.get('data_phase_code') is not None:
            self.data_phase_code = m.get('data_phase_code')
        if m.get('phase_data_num') is not None:
            self.phase_data_num = m.get('phase_data_num')
        if m.get('uniqlo_data_num') is not None:
            self.uniqlo_data_num = m.get('uniqlo_data_num')
        if m.get('business_type') is not None:
            self.business_type = m.get('business_type')
        return self


class AddCaruserPrdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        process_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 处理结果
        self.process_result = process_result

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
        if self.process_result is not None:
            result['process_result'] = self.process_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('process_result') is not None:
            self.process_result = m.get('process_result')
        return self


class BatchqueryCarloanTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        date: str = None,
        data_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 日期
        self.date = date
        # 查询条数
        self.data_num = data_num

    def validate(self):
        self.validate_required(self.date, 'date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.date is not None:
            result['date'] = self.date
        if self.data_num is not None:
            result['data_num'] = self.data_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('data_num') is not None:
            self.data_num = m.get('data_num')
        return self


class BatchqueryCarloanTestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        business_ids: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务id
        self.business_ids = business_ids

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
        if self.business_ids is not None:
            result['business_ids'] = self.business_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('business_ids') is not None:
            self.business_ids = m.get('business_ids')
        return self


class BatchqueryCarloanPrdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        date: str = None,
        data_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 日期
        self.date = date
        # 查询条数
        self.data_num = data_num

    def validate(self):
        self.validate_required(self.date, 'date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.date is not None:
            result['date'] = self.date
        if self.data_num is not None:
            result['data_num'] = self.data_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('data_num') is not None:
            self.data_num = m.get('data_num')
        return self


class BatchqueryCarloanPrdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        business_ids: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务id
        self.business_ids = business_ids

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
        if self.business_ids is not None:
            result['business_ids'] = self.business_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('business_ids') is not None:
            self.business_ids = m.get('business_ids')
        return self


class QueryCarloanYztRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        plate_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 车牌号
        self.plate_no = plate_no

    def validate(self):
        self.validate_required(self.plate_no, 'plate_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.plate_no is not None:
            result['plate_no'] = self.plate_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('plate_no') is not None:
            self.plate_no = m.get('plate_no')
        return self


class QueryCarloanYztResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class ImportCarloanYztRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        phone_num: str = None,
        license_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 手机号
        self.phone_num = phone_num
        # 车牌号
        self.license_no = license_no

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.phone_num, 'phone_num')
        self.validate_required(self.license_no, 'license_no')

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
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.license_no is not None:
            result['license_no'] = self.license_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('license_no') is not None:
            self.license_no = m.get('license_no')
        return self


class ImportCarloanYztResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 保存结果
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class ImportIdmapSamplefileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_name: str = None,
        project_info_id: str = None,
        param_type: str = None,
        result_type: str = None,
        sample_code: str = None,
        sample_task_code: str = None,
        file_path: str = None,
        data_source: str = None,
        encryption_method: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # oss文件名称
        self.file_name = file_name
        # 项目ID
        self.project_info_id = project_info_id
        # 查询列
        self.param_type = param_type
        # 结果列
        self.result_type = result_type
        # 样本Code
        self.sample_code = sample_code
        # 样本任务Code
        self.sample_task_code = sample_task_code
        # oss文件路径
        self.file_path = file_path
        # 数据源code
        self.data_source = data_source
        # 结果加密方式
        self.encryption_method = encryption_method

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.project_info_id, 'project_info_id')
        self.validate_required(self.param_type, 'param_type')
        self.validate_required(self.result_type, 'result_type')
        self.validate_required(self.sample_code, 'sample_code')
        self.validate_required(self.sample_task_code, 'sample_task_code')
        self.validate_required(self.file_path, 'file_path')
        self.validate_required(self.data_source, 'data_source')
        self.validate_required(self.encryption_method, 'encryption_method')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.project_info_id is not None:
            result['project_info_id'] = self.project_info_id
        if self.param_type is not None:
            result['param_type'] = self.param_type
        if self.result_type is not None:
            result['result_type'] = self.result_type
        if self.sample_code is not None:
            result['sample_code'] = self.sample_code
        if self.sample_task_code is not None:
            result['sample_task_code'] = self.sample_task_code
        if self.file_path is not None:
            result['file_path'] = self.file_path
        if self.data_source is not None:
            result['data_source'] = self.data_source
        if self.encryption_method is not None:
            result['encryption_method'] = self.encryption_method
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('project_info_id') is not None:
            self.project_info_id = m.get('project_info_id')
        if m.get('param_type') is not None:
            self.param_type = m.get('param_type')
        if m.get('result_type') is not None:
            self.result_type = m.get('result_type')
        if m.get('sample_code') is not None:
            self.sample_code = m.get('sample_code')
        if m.get('sample_task_code') is not None:
            self.sample_task_code = m.get('sample_task_code')
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        if m.get('data_source') is not None:
            self.data_source = m.get('data_source')
        if m.get('encryption_method') is not None:
            self.encryption_method = m.get('encryption_method')
        return self


class ImportIdmapSamplefileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_file_path: str = None,
        result_file_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上传结果地址路径
        self.result_file_path = result_file_path
        # oss结果文件名称
        self.result_file_name = result_file_name

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
        if self.result_file_path is not None:
            result['result_file_path'] = self.result_file_path
        if self.result_file_name is not None:
            result['result_file_name'] = self.result_file_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_file_path') is not None:
            self.result_file_path = m.get('result_file_path')
        if m.get('result_file_name') is not None:
            self.result_file_name = m.get('result_file_name')
        return self


class ImportIdmapPsiresultfileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_path: str = None,
        file_name: str = None,
        project_info_id: str = None,
        sample_code: str = None,
        sample_task_code: str = None,
        data_source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件路径
        self.file_path = file_path
        # 文件名称
        self.file_name = file_name
        # 项目唯一标识
        self.project_info_id = project_info_id
        # 样本编码
        self.sample_code = sample_code
        # 样本任务编码
        self.sample_task_code = sample_task_code
        # 数据源编码
        self.data_source = data_source

    def validate(self):
        self.validate_required(self.file_path, 'file_path')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.project_info_id, 'project_info_id')
        self.validate_required(self.sample_code, 'sample_code')
        self.validate_required(self.sample_task_code, 'sample_task_code')
        self.validate_required(self.data_source, 'data_source')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_path is not None:
            result['file_path'] = self.file_path
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.project_info_id is not None:
            result['project_info_id'] = self.project_info_id
        if self.sample_code is not None:
            result['sample_code'] = self.sample_code
        if self.sample_task_code is not None:
            result['sample_task_code'] = self.sample_task_code
        if self.data_source is not None:
            result['data_source'] = self.data_source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('project_info_id') is not None:
            self.project_info_id = m.get('project_info_id')
        if m.get('sample_code') is not None:
            self.sample_code = m.get('sample_code')
        if m.get('sample_task_code') is not None:
            self.sample_task_code = m.get('sample_task_code')
        if m.get('data_source') is not None:
            self.data_source = m.get('data_source')
        return self


class ImportIdmapPsiresultfileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_file_path: str = None,
        result_file_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果文件路径
        self.result_file_path = result_file_path
        # 结果文件名称
        self.result_file_name = result_file_name

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
        if self.result_file_path is not None:
            result['result_file_path'] = self.result_file_path
        if self.result_file_name is not None:
            result['result_file_name'] = self.result_file_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_file_path') is not None:
            self.result_file_path = m.get('result_file_path')
        if m.get('result_file_name') is not None:
            self.result_file_name = m.get('result_file_name')
        return self


class QueryIndexresearchBrandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        brand_code: str = None,
        month: str = None,
        data_type: str = None,
        time_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 品牌编码
        self.brand_code = brand_code
        # 时间月份yyyyMM
        self.month = month
        # test-测试数据。prod-正式数据
        self.data_type = data_type
        # 时间频次 m-月/d-天
        self.time_type = time_type

    def validate(self):
        self.validate_required(self.brand_code, 'brand_code')
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.time_type, 'time_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.brand_code is not None:
            result['brand_code'] = self.brand_code
        if self.month is not None:
            result['month'] = self.month
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.time_type is not None:
            result['time_type'] = self.time_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('brand_code') is not None:
            self.brand_code = m.get('brand_code')
        if m.get('month') is not None:
            self.month = m.get('month')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('time_type') is not None:
            self.time_type = m.get('time_type')
        return self


class QueryIndexresearchBrandResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        index_data: List[IndexData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 指标数据
        self.index_data = index_data

    def validate(self):
        if self.index_data:
            for k in self.index_data:
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
        result['index_data'] = []
        if self.index_data is not None:
            for k in self.index_data:
                result['index_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.index_data = []
        if m.get('index_data') is not None:
            for k in m.get('index_data'):
                temp_model = IndexData()
                self.index_data.append(temp_model.from_map(k))
        return self


class QueryIndexresearchBrandindexRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        brand_code: str = None,
        shop_tag: str = None,
        month: List[str] = None,
        sort: List[str] = None,
        page_info: PageInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 品牌码
        self.brand_code = brand_code
        # 店铺标签
        self.shop_tag = shop_tag
        # 月份
        self.month = month
        # 字段排序方式
        self.sort = sort
        # page_info
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.brand_code is not None:
            result['brand_code'] = self.brand_code
        if self.shop_tag is not None:
            result['shop_tag'] = self.shop_tag
        if self.month is not None:
            result['month'] = self.month
        if self.sort is not None:
            result['sort'] = self.sort
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('brand_code') is not None:
            self.brand_code = m.get('brand_code')
        if m.get('shop_tag') is not None:
            self.shop_tag = m.get('shop_tag')
        if m.get('month') is not None:
            self.month = m.get('month')
        if m.get('sort') is not None:
            self.sort = m.get('sort')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class QueryIndexresearchBrandindexResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_info: PageInfo = None,
        index_data: List[IndexData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # page_info
        self.page_info = page_info
        # index_data
        self.index_data = index_data

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.index_data:
            for k in self.index_data:
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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        result['index_data'] = []
        if self.index_data is not None:
            for k in self.index_data:
                result['index_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        self.index_data = []
        if m.get('index_data') is not None:
            for k in m.get('index_data'):
                temp_model = IndexData()
                self.index_data.append(temp_model.from_map(k))
        return self


class QueryIndexresearchConsumeindustryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        industry: str = None,
        ofp_type: str = None,
        start_time: str = None,
        end_time: str = None,
        page_info: PageInfo = None,
        sort: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 行业
        self.industry = industry
        # 是否线上线下 1:线下，0:线上，-1:全部
        self.ofp_type = ofp_type
        # 开始时间
        self.start_time = start_time
        # 结束时间
        self.end_time = end_time
        # 分页信息
        self.page_info = page_info
        # 字段排序方式
        self.sort = sort

    def validate(self):
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.industry is not None:
            result['industry'] = self.industry
        if self.ofp_type is not None:
            result['ofp_type'] = self.ofp_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.sort is not None:
            result['sort'] = self.sort
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('ofp_type') is not None:
            self.ofp_type = m.get('ofp_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('sort') is not None:
            self.sort = m.get('sort')
        return self


class QueryIndexresearchConsumeindustryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_info: PageInfo = None,
        industry_data: List[IndustryData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页信息
        self.page_info = page_info
        # 消费行业数据
        self.industry_data = industry_data

    def validate(self):
        if self.page_info:
            self.page_info.validate()
        if self.industry_data:
            for k in self.industry_data:
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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        result['industry_data'] = []
        if self.industry_data is not None:
            for k in self.industry_data:
                result['industry_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        self.industry_data = []
        if m.get('industry_data') is not None:
            for k in m.get('industry_data'):
                temp_model = IndustryData()
                self.industry_data.append(temp_model.from_map(k))
        return self


class QueryIndexresearchIndustryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        industry: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 行业
        self.industry = industry

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
        if self.industry is not None:
            result['industry'] = self.industry
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        return self


class QueryIndexresearchIndustryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        industry_data: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 行业列表数据
        self.industry_data = industry_data

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
        if self.industry_data is not None:
            result['industry_data'] = self.industry_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('industry_data') is not None:
            self.industry_data = m.get('industry_data')
        return self


class QueryLocationInternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_number: str = None,
        phone_no: str = None,
        start_time: str = None,
        end_time: str = None,
        center_position: str = None,
        distinct_county: str = None,
        inv_type: int = None,
        api_service_level: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # md5加密的身份证号
        self.id_number = id_number
        # md5加密的手机号
        self.phone_no = phone_no
        # 定位时间范围开始时间
        self.start_time = start_time
        # 定位时间范围结束时间
        self.end_time = end_time
        # 核查中心位置（经度,纬度）
        self.center_position = center_position
        # 核查省市区县范围
        self.distinct_county = distinct_county
        # 协查类型：
        # 0: 为经纬度精准定位协查 (默认)
        # 1:  为区县定位 (省-市-区/县) 协查
        self.inv_type = inv_type
        # 服务级别与结果值定义
        self.api_service_level = api_service_level

    def validate(self):
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')
        self.validate_required(self.api_service_level, 'api_service_level')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.phone_no is not None:
            result['phone_no'] = self.phone_no
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.center_position is not None:
            result['center_position'] = self.center_position
        if self.distinct_county is not None:
            result['distinct_county'] = self.distinct_county
        if self.inv_type is not None:
            result['inv_type'] = self.inv_type
        if self.api_service_level is not None:
            result['api_service_level'] = self.api_service_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('phone_no') is not None:
            self.phone_no = m.get('phone_no')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('center_position') is not None:
            self.center_position = m.get('center_position')
        if m.get('distinct_county') is not None:
            self.distinct_county = m.get('distinct_county')
        if m.get('inv_type') is not None:
            self.inv_type = m.get('inv_type')
        if m.get('api_service_level') is not None:
            self.api_service_level = m.get('api_service_level')
        return self


class QueryLocationInternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        confidence_value: str = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 置信度取值：A/B/C
        self.confidence_value = confidence_value
        # 扩展字段，其他信息
        self.ext_info = ext_info

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
        if self.confidence_value is not None:
            result['confidence_value'] = self.confidence_value
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('confidence_value') is not None:
            self.confidence_value = m.get('confidence_value')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class QueryLocationTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_number: str = None,
        phone_no: str = None,
        caller_id: str = None,
        start_time: str = None,
        end_time: str = None,
        center_position: str = None,
        distinct_county: str = None,
        inv_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # md5加密的身份证号
        self.id_number = id_number
        # md5加密的手机号
        self.phone_no = phone_no
        # 调用者用户ID（或外部系统业务ID）
        self.caller_id = caller_id
        # 定位时间范围开始时间
        self.start_time = start_time
        # 定位时间范围结束时间
        self.end_time = end_time
        # 核查中心位置（经度,纬度）
        self.center_position = center_position
        # 核查省市区县范围
        self.distinct_county = distinct_county
        # 协查类型：
        # 0: 为经纬度精准定位协查 (默认)
        # 1:  为区县定位 (省-市-区/县) 协查
        self.inv_type = inv_type

    def validate(self):
        if self.id_number is not None:
            self.validate_max_length(self.id_number, 'id_number', 32)
        if self.phone_no is not None:
            self.validate_max_length(self.phone_no, 'phone_no', 32)
        self.validate_required(self.caller_id, 'caller_id')
        if self.caller_id is not None:
            self.validate_max_length(self.caller_id, 'caller_id', 128)
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_max_length(self.start_time, 'start_time', 19)
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_max_length(self.end_time, 'end_time', 19)
        if self.center_position is not None:
            self.validate_max_length(self.center_position, 'center_position', 64)
        if self.distinct_county is not None:
            self.validate_max_length(self.distinct_county, 'distinct_county', 128)
        if self.inv_type is not None:
            self.validate_max_length(self.inv_type, 'inv_type', 2)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.phone_no is not None:
            result['phone_no'] = self.phone_no
        if self.caller_id is not None:
            result['caller_id'] = self.caller_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.center_position is not None:
            result['center_position'] = self.center_position
        if self.distinct_county is not None:
            result['distinct_county'] = self.distinct_county
        if self.inv_type is not None:
            result['inv_type'] = self.inv_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('phone_no') is not None:
            self.phone_no = m.get('phone_no')
        if m.get('caller_id') is not None:
            self.caller_id = m.get('caller_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('center_position') is not None:
            self.center_position = m.get('center_position')
        if m.get('distinct_county') is not None:
            self.distinct_county = m.get('distinct_county')
        if m.get('inv_type') is not None:
            self.inv_type = m.get('inv_type')
        return self


class QueryLocationTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        confidence_value: str = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 置信度取值：A/B/C
        self.confidence_value = confidence_value
        # 扩展字段，其他信息
        self.ext_info = ext_info

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
        if self.confidence_value is not None:
            result['confidence_value'] = self.confidence_value
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('confidence_value') is not None:
            self.confidence_value = m.get('confidence_value')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class PushModelSamplefileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        begin_date: str = None,
        end_date: str = None,
        org_nums: int = None,
        sample_code: str = None,
        file_path: str = None,
        file_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 开始日期：示例 YYYYMMDD
        self.begin_date = begin_date
        # 样本内采样日期截止日：YYYYMMDD
        self.end_date = end_date
        # 样本数据量
        self.org_nums = org_nums
        # 样本批次号，唯一，建议：租户code+时间戳
        self.sample_code = sample_code
        # 文件路径，bucket 下路径
        self.file_path = file_path
        # 文件名,以.csv结尾，分隔符为  ","号
        self.file_name = file_name

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.begin_date, 'begin_date')
        self.validate_required(self.end_date, 'end_date')
        self.validate_required(self.org_nums, 'org_nums')
        self.validate_required(self.sample_code, 'sample_code')
        self.validate_required(self.file_path, 'file_path')
        self.validate_required(self.file_name, 'file_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.begin_date is not None:
            result['begin_date'] = self.begin_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.org_nums is not None:
            result['org_nums'] = self.org_nums
        if self.sample_code is not None:
            result['sample_code'] = self.sample_code
        if self.file_path is not None:
            result['file_path'] = self.file_path
        if self.file_name is not None:
            result['file_name'] = self.file_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('begin_date') is not None:
            self.begin_date = m.get('begin_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('org_nums') is not None:
            self.org_nums = m.get('org_nums')
        if m.get('sample_code') is not None:
            self.sample_code = m.get('sample_code')
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        return self


class PushModelSamplefileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        loop_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 轮训编码
        self.loop_code = loop_code

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
        if self.loop_code is not None:
            result['loop_code'] = self.loop_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('loop_code') is not None:
            self.loop_code = m.get('loop_code')
        return self


class ExecModelSampletaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        sample_code: str = None,
        task_code: str = None,
        task_type: str = None,
        sample_task_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 样本批次号，唯一，建议：租户code+时间戳
        self.sample_code = sample_code
        # 特征集编码或模型编码，依据类型使用
        self.task_code = task_code
        # 任务类型：特征集 FEATURESET、模型分 MODEL
        self.task_type = task_type
        # 本次事件序号编码
        self.sample_task_code = sample_task_code

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.sample_code, 'sample_code')
        self.validate_required(self.task_code, 'task_code')
        self.validate_required(self.task_type, 'task_type')
        self.validate_required(self.sample_task_code, 'sample_task_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.sample_code is not None:
            result['sample_code'] = self.sample_code
        if self.task_code is not None:
            result['task_code'] = self.task_code
        if self.task_type is not None:
            result['task_type'] = self.task_type
        if self.sample_task_code is not None:
            result['sample_task_code'] = self.sample_task_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('sample_code') is not None:
            self.sample_code = m.get('sample_code')
        if m.get('task_code') is not None:
            self.task_code = m.get('task_code')
        if m.get('task_type') is not None:
            self.task_type = m.get('task_type')
        if m.get('sample_task_code') is not None:
            self.sample_task_code = m.get('sample_task_code')
        return self


class ExecModelSampletaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        loop_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 轮训编码
        self.loop_code = loop_code

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
        if self.loop_code is not None:
            result['loop_code'] = self.loop_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('loop_code') is not None:
            self.loop_code = m.get('loop_code')
        return self


class QueryModelSampletaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        loop_code: str = None,
        phase: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 事件查询序号编码，在有loop_code接口返回值的异步接口的值
        # 如：antchain.zkcollabinv.model.samplefile.push、antchain.zkcollabinv.model.sampletask.exec
        self.loop_code = loop_code
        # 阶段：poc_050 样本提交阶段，poc_500 任务跑批阶段
        self.phase = phase

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.loop_code, 'loop_code')
        self.validate_required(self.phase, 'phase')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.loop_code is not None:
            result['loop_code'] = self.loop_code
        if self.phase is not None:
            result['phase'] = self.phase
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('loop_code') is not None:
            self.loop_code = m.get('loop_code')
        if m.get('phase') is not None:
            self.phase = m.get('phase')
        return self


class QueryModelSampletaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        progress: str = None,
        files: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务进度
        self.progress = progress
        # 有输出的时候会有值
        self.files = files

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
        if self.progress is not None:
            result['progress'] = self.progress
        if self.files is not None:
            result['files'] = self.files
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('progress') is not None:
            self.progress = m.get('progress')
        if m.get('files') is not None:
            self.files = m.get('files')
        return self


class QueryModelFeaturesetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        page_info: PageInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 分页信息
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class QueryModelFeaturesetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        featuresets: List[FeatureSetInfo] = None,
        page_info: PageInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 特征列表
        self.featuresets = featuresets
        # 分页信息
        self.page_info = page_info

    def validate(self):
        if self.featuresets:
            for k in self.featuresets:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

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
        result['featuresets'] = []
        if self.featuresets is not None:
            for k in self.featuresets:
                result['featuresets'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.featuresets = []
        if m.get('featuresets') is not None:
            for k in m.get('featuresets'):
                temp_model = FeatureSetInfo()
                self.featuresets.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class SubmitModelInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        model_file_path: str = None,
        features_file_path: str = None,
        demo_file_path: str = None,
        model_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 模型文件路径
        self.model_file_path = model_file_path
        # 特征集路径
        self.features_file_path = features_file_path
        # 示例文件路径
        self.demo_file_path = demo_file_path
        # 模型编码，同一租户下唯一，后续回溯生产调用标记
        self.model_code = model_code

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.model_file_path, 'model_file_path')
        self.validate_required(self.features_file_path, 'features_file_path')
        self.validate_required(self.model_code, 'model_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.model_file_path is not None:
            result['model_file_path'] = self.model_file_path
        if self.features_file_path is not None:
            result['features_file_path'] = self.features_file_path
        if self.demo_file_path is not None:
            result['demo_file_path'] = self.demo_file_path
        if self.model_code is not None:
            result['model_code'] = self.model_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('model_file_path') is not None:
            self.model_file_path = m.get('model_file_path')
        if m.get('features_file_path') is not None:
            self.features_file_path = m.get('features_file_path')
        if m.get('demo_file_path') is not None:
            self.demo_file_path = m.get('demo_file_path')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        return self


class SubmitModelInstanceResponse(TeaModel):
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


class QueryModelStatsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        invoke_day: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # yyyyMMdd
        self.invoke_day = invoke_day
        # 类型：TENANT  租户；AK key维度
        self.type = type

    def validate(self):
        self.validate_required(self.invoke_day, 'invoke_day')
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
        if self.invoke_day is not None:
            result['invoke_day'] = self.invoke_day
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('invoke_day') is not None:
            self.invoke_day = m.get('invoke_day')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryModelStatsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        datas: List[GwCallDataStats] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据
        self.datas = datas

    def validate(self):
        if self.datas:
            for k in self.datas:
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
        result['datas'] = []
        if self.datas is not None:
            for k in self.datas:
                result['datas'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.datas = []
        if m.get('datas') is not None:
            for k in m.get('datas'):
                temp_model = GwCallDataStats()
                self.datas.append(temp_model.from_map(k))
        return self


class QueryModelCommonscoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_no: str = None,
        model_code: str = None,
        user_id: str = None,
        user_id_type: str = None,
        hash_type: str = None,
        customer_code: str = None,
        trans_no: str = None,
        user_id_encrypt_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户授权编码
        self.auth_no = auth_no
        # 模型编码
        self.model_code = model_code
        # 用户id（客户身份证号/手机号的md5/sha256散列值）
        self.user_id = user_id
        # 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        self.user_id_type = user_id_type
        # user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        self.hash_type = hash_type
        # 客户编码
        self.customer_code = customer_code
        # 流水号，串联链路用，非必填
        self.trans_no = trans_no
        # hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
        self.user_id_encrypt_type = user_id_encrypt_type

    def validate(self):
        self.validate_required(self.auth_no, 'auth_no')
        self.validate_required(self.model_code, 'model_code')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.hash_type, 'hash_type')
        self.validate_required(self.customer_code, 'customer_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_no is not None:
            result['auth_no'] = self.auth_no
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.hash_type is not None:
            result['hash_type'] = self.hash_type
        if self.customer_code is not None:
            result['customer_code'] = self.customer_code
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        if self.user_id_encrypt_type is not None:
            result['user_id_encrypt_type'] = self.user_id_encrypt_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_no') is not None:
            self.auth_no = m.get('auth_no')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('hash_type') is not None:
            self.hash_type = m.get('hash_type')
        if m.get('customer_code') is not None:
            self.customer_code = m.get('customer_code')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        if m.get('user_id_encrypt_type') is not None:
            self.user_id_encrypt_type = m.get('user_id_encrypt_type')
        return self


class QueryModelCommonscoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        score: str = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型分
        self.score = score
        # 流水号
        self.trans_no = trans_no

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
        if self.score is not None:
            result['score'] = self.score
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


class BatchqueryModelCommonscoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_ids: List[str] = None,
        auth_nos: List[str] = None,
        model_code: str = None,
        user_id_type: str = None,
        hash_type: str = None,
        customer_code: str = None,
        trans_no: str = None,
        user_id_encrypt_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_ids = user_ids
        # 用户授权编码
        self.auth_nos = auth_nos
        # 模型编码
        self.model_code = model_code
        # 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        self.user_id_type = user_id_type
        # user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        self.hash_type = hash_type
        # 客户编码
        self.customer_code = customer_code
        # 流水号，串联链路用，非必填
        self.trans_no = trans_no
        # hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
        self.user_id_encrypt_type = user_id_encrypt_type

    def validate(self):
        self.validate_required(self.user_ids, 'user_ids')
        self.validate_required(self.model_code, 'model_code')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.hash_type, 'hash_type')
        self.validate_required(self.customer_code, 'customer_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_ids is not None:
            result['user_ids'] = self.user_ids
        if self.auth_nos is not None:
            result['auth_nos'] = self.auth_nos
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.hash_type is not None:
            result['hash_type'] = self.hash_type
        if self.customer_code is not None:
            result['customer_code'] = self.customer_code
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        if self.user_id_encrypt_type is not None:
            result['user_id_encrypt_type'] = self.user_id_encrypt_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_ids') is not None:
            self.user_ids = m.get('user_ids')
        if m.get('auth_nos') is not None:
            self.auth_nos = m.get('auth_nos')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('hash_type') is not None:
            self.hash_type = m.get('hash_type')
        if m.get('customer_code') is not None:
            self.customer_code = m.get('customer_code')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        if m.get('user_id_encrypt_type') is not None:
            self.user_id_encrypt_type = m.get('user_id_encrypt_type')
        return self


class BatchqueryModelCommonscoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        scores: List[str] = None,
        ratings: List[str] = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分数
        self.scores = scores
        # 意向
        self.ratings = ratings
        # 流水号
        self.trans_no = trans_no

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
        if self.scores is not None:
            result['scores'] = self.scores
        if self.ratings is not None:
            result['ratings'] = self.ratings
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('scores') is not None:
            self.scores = m.get('scores')
        if m.get('ratings') is not None:
            self.ratings = m.get('ratings')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


class QueryModelMultiscoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_no: str = None,
        spec_code: str = None,
        user_id: str = None,
        user_id_type: str = None,
        hash_type: str = None,
        customer_code: str = None,
        trans_no: str = None,
        user_id_encrypt_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户授权编码（授权渠道）
        # 
        self.auth_no = auth_no
        # 规格编码(相应对接人负责)
        self.spec_code = spec_code
        # 用户id（客户身份证号/手机号的md5/sha256散列值）
        self.user_id = user_id
        # 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        self.user_id_type = user_id_type
        # user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        self.hash_type = hash_type
        # 客户编码
        # 
        self.customer_code = customer_code
        # 流水号，串联链路用，非必填
        self.trans_no = trans_no
        # hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
        self.user_id_encrypt_type = user_id_encrypt_type

    def validate(self):
        self.validate_required(self.auth_no, 'auth_no')
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.hash_type, 'hash_type')
        self.validate_required(self.customer_code, 'customer_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_no is not None:
            result['auth_no'] = self.auth_no
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.hash_type is not None:
            result['hash_type'] = self.hash_type
        if self.customer_code is not None:
            result['customer_code'] = self.customer_code
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        if self.user_id_encrypt_type is not None:
            result['user_id_encrypt_type'] = self.user_id_encrypt_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_no') is not None:
            self.auth_no = m.get('auth_no')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('hash_type') is not None:
            self.hash_type = m.get('hash_type')
        if m.get('customer_code') is not None:
            self.customer_code = m.get('customer_code')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        if m.get('user_id_encrypt_type') is not None:
            self.user_id_encrypt_type = m.get('user_id_encrypt_type')
        return self


class QueryModelMultiscoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        score: str = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型分
        self.score = score
        # 流水号
        self.trans_no = trans_no

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
        if self.score is not None:
            result['score'] = self.score
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


class QueryModelFusionmodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        fusion_model_code: str = None,
        identity: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 融合模型编码
        self.fusion_model_code = fusion_model_code
        # 模型调用的id，一般是用户id 可能是用户手机号或者身份照号码的md5
        self.identity = identity

    def validate(self):
        self.validate_required(self.fusion_model_code, 'fusion_model_code')
        self.validate_required(self.identity, 'identity')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.fusion_model_code is not None:
            result['fusion_model_code'] = self.fusion_model_code
        if self.identity is not None:
            result['identity'] = self.identity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fusion_model_code') is not None:
            self.fusion_model_code = m.get('fusion_model_code')
        if m.get('identity') is not None:
            self.identity = m.get('identity')
        return self


class QueryModelFusionmodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 融合模型调用结果
        self.result = result
        # 流水号
        self.trans_no = trans_no

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
        if self.result is not None:
            result['result'] = self.result
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


class QueryModelWorkscoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        card_no: str = None,
        phone: str = None,
        enterprise_name: str = None,
        organization_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户名
        self.name = name
        # 身份证号码
        self.card_no = card_no
        # 手机号
        self.phone = phone
        # 单位名称，以个体工商户、人才市场等方式缴纳的属于灵活就业人员，单位名称请填：GR
        self.enterprise_name = enterprise_name
        # 单位统一社会信用代码，
        # 单位名称为GR传空。
        self.organization_code = organization_code

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.card_no, 'card_no')
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.enterprise_name, 'enterprise_name')

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
        if self.card_no is not None:
            result['card_no'] = self.card_no
        if self.phone is not None:
            result['phone'] = self.phone
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.organization_code is not None:
            result['organization_code'] = self.organization_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('card_no') is not None:
            self.card_no = m.get('card_no')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('organization_code') is not None:
            self.organization_code = m.get('organization_code')
        return self


class QueryModelWorkscoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trans_no: str = None,
        score: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易流水号
        self.trans_no = trans_no
        # 用工评分
        self.score = score

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
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class CreateAntcloudGatewayxFileUploadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_code: str = None,
        file_label: str = None,
        file_metadata: str = None,
        file_name: str = None,
        mime_type: str = None,
        api_cluster: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 上传文件作用的openapi method
        self.api_code = api_code
        # 文件标签，多个标签;分割
        self.file_label = file_label
        # 自定义的文件元数据
        self.file_metadata = file_metadata
        # 文件名，不传则随机生成文件名
        self.file_name = file_name
        # 文件的多媒体类型
        self.mime_type = mime_type
        # 产品方的api归属集群，即productInstanceId
        self.api_cluster = api_cluster

    def validate(self):
        self.validate_required(self.api_code, 'api_code')
        if self.file_label is not None:
            self.validate_max_length(self.file_label, 'file_label', 100)
        if self.file_metadata is not None:
            self.validate_max_length(self.file_metadata, 'file_metadata', 1000)
        if self.file_name is not None:
            self.validate_max_length(self.file_name, 'file_name', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.api_code is not None:
            result['api_code'] = self.api_code
        if self.file_label is not None:
            result['file_label'] = self.file_label
        if self.file_metadata is not None:
            result['file_metadata'] = self.file_metadata
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.mime_type is not None:
            result['mime_type'] = self.mime_type
        if self.api_cluster is not None:
            result['api_cluster'] = self.api_cluster
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_code') is not None:
            self.api_code = m.get('api_code')
        if m.get('file_label') is not None:
            self.file_label = m.get('file_label')
        if m.get('file_metadata') is not None:
            self.file_metadata = m.get('file_metadata')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('mime_type') is not None:
            self.mime_type = m.get('mime_type')
        if m.get('api_cluster') is not None:
            self.api_cluster = m.get('api_cluster')
        return self


class CreateAntcloudGatewayxFileUploadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        expired_time: str = None,
        file_id: str = None,
        upload_headers: List[XNameValuePair] = None,
        upload_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上传有效期
        self.expired_time = expired_time
        # 32位文件唯一id
        self.file_id = file_id
        # 放入http请求头里
        self.upload_headers = upload_headers
        # 文件上传地址
        self.upload_url = upload_url

    def validate(self):
        if self.expired_time is not None:
            self.validate_pattern(self.expired_time, 'expired_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.upload_headers:
            for k in self.upload_headers:
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
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.file_id is not None:
            result['file_id'] = self.file_id
        result['upload_headers'] = []
        if self.upload_headers is not None:
            for k in self.upload_headers:
                result['upload_headers'].append(k.to_map() if k else None)
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        self.upload_headers = []
        if m.get('upload_headers') is not None:
            for k in m.get('upload_headers'):
                temp_model = XNameValuePair()
                self.upload_headers.append(temp_model.from_map(k))
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        return self


