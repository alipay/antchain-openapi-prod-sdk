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


class SearchContext(TeaModel):
    def __init__(
        self,
        origin_query: str = None,
        search_type: str = None,
        mode: str = None,
    ):
        # 原始搜索内容
        self.origin_query = origin_query
        # 实际执行的搜索类型，当前为 web
        self.search_type = search_type
        # 实际执行的 AI 上下文档位；当前为 auto，后续可返回 fast 或 pro
        self.mode = mode

    def validate(self):
        self.validate_required(self.origin_query, 'origin_query')
        self.validate_required(self.search_type, 'search_type')
        self.validate_required(self.mode, 'mode')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.origin_query is not None:
            result['origin_query'] = self.origin_query
        if self.search_type is not None:
            result['search_type'] = self.search_type
        if self.mode is not None:
            result['mode'] = self.mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('origin_query') is not None:
            self.origin_query = m.get('origin_query')
        if m.get('search_type') is not None:
            self.search_type = m.get('search_type')
        if m.get('mode') is not None:
            self.mode = m.get('mode')
        return self


class WebItem(TeaModel):
    def __init__(
        self,
        id: str = None,
        content_id: str = None,
        sort_id: int = None,
        title: str = None,
        site_name: str = None,
        url: str = None,
        summary: str = None,
        content: str = None,
        publish_time: str = None,
        author: str = None,
        logo_url: str = None,
        content_formats: str = None,
    ):
        # 搜索结果唯一标识
        self.id = id
        # 内容唯一标识，用于内容去重与引用
        self.content_id = content_id
        # 结果排序位置，从 1 开始
        self.sort_id = sort_id
        # 结果标题
        self.title = title
        # 来源站点名称
        self.site_name = site_name
        # 网页原文链接；PDF 等无原文链接的结果可能不返回该字段。filter.need_url 为预留参数，当前不生效
        self.url = url
        # 与 Query 相关的网页摘要，适合模型上下文
        self.summary = summary
        # 清洗后的网页正文，按 mode 返回；auto 默认返回可用正文，fast 预设不返回，pro 预设按需返回
        self.content = content
        # 网页发布时间，ISO 8601 格式
        self.publish_time = publish_time
        # 作者或发布机构
        self.author = author
        # 来源站点图标链接
        self.logo_url = logo_url
        # 随 Content 返回正文实际格式，当前为 text；未返回 Content 时省略
        self.content_formats = content_formats

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.content_id, 'content_id')
        self.validate_required(self.sort_id, 'sort_id')
        self.validate_required(self.title, 'title')
        self.validate_required(self.summary, 'summary')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.sort_id is not None:
            result['sort_id'] = self.sort_id
        if self.title is not None:
            result['title'] = self.title
        if self.site_name is not None:
            result['site_name'] = self.site_name
        if self.url is not None:
            result['url'] = self.url
        if self.summary is not None:
            result['summary'] = self.summary
        if self.content is not None:
            result['content'] = self.content
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.author is not None:
            result['author'] = self.author
        if self.logo_url is not None:
            result['logo_url'] = self.logo_url
        if self.content_formats is not None:
            result['content_formats'] = self.content_formats
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('sort_id') is not None:
            self.sort_id = m.get('sort_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('site_name') is not None:
            self.site_name = m.get('site_name')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('summary') is not None:
            self.summary = m.get('summary')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('author') is not None:
            self.author = m.get('author')
        if m.get('logo_url') is not None:
            self.logo_url = m.get('logo_url')
        if m.get('content_formats') is not None:
            self.content_formats = m.get('content_formats')
        return self


class Result(TeaModel):
    def __init__(
        self,
        result_count: int = None,
        web_results: List[WebItem] = None,
        search_context: SearchContext = None,
    ):
        # WebResults 实际返回的网页结果数量
        self.result_count = result_count
        # 网页搜索结果列表，对应请求中的 search_type=web
        self.web_results = web_results
        # 本次搜索的上下文信息
        self.search_context = search_context

    def validate(self):
        self.validate_required(self.result_count, 'result_count')
        self.validate_required(self.web_results, 'web_results')
        if self.web_results:
            for k in self.web_results:
                if k:
                    k.validate()
        self.validate_required(self.search_context, 'search_context')
        if self.search_context:
            self.search_context.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result_count is not None:
            result['result_count'] = self.result_count
        result['web_results'] = []
        if self.web_results is not None:
            for k in self.web_results:
                result['web_results'].append(k.to_map() if k else None)
        if self.search_context is not None:
            result['search_context'] = self.search_context.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result_count') is not None:
            self.result_count = m.get('result_count')
        self.web_results = []
        if m.get('web_results') is not None:
            for k in m.get('web_results'):
                temp_model = WebItem()
                self.web_results.append(temp_model.from_map(k))
        if m.get('search_context') is not None:
            temp_model = SearchContext()
            self.search_context = temp_model.from_map(m['search_context'])
        return self


class ResponseMetadata(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        version: str = None,
        region: str = None,
        time_cost: int = None,
    ):
        # 请求关联标识；优先回显合法 X-Request-Id，缺失或非法时由服务端生成；不用于幂等或去重
        self.request_id = request_id
        # 接口版本
        self.version = version
        # 服务区域
        self.region = region
        # 请求处理耗时，单位为毫秒
        self.time_cost = time_cost

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.version, 'version')
        self.validate_required(self.region, 'region')
        self.validate_required(self.time_cost, 'time_cost')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.version is not None:
            result['version'] = self.version
        if self.region is not None:
            result['region'] = self.region
        if self.time_cost is not None:
            result['time_cost'] = self.time_cost
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('region') is not None:
            self.region = m.get('region')
        if m.get('time_cost') is not None:
            self.time_cost = m.get('time_cost')
        return self


class FilterModel(TeaModel):
    def __init__(
        self,
        include_domains: List[str] = None,
        exclude_domains: List[str] = None,
        time_range: str = None,
        need_url: bool = None,
        industry: str = None,
    ):
        # 仅搜索指定网站。例如 ["gov.cn"] 表示只返回该域名下的内容；填写域名，不包含协议和路径
        self.include_domains = include_domains
        # 排除指定网站；填写域名，不包含协议和路径
        self.exclude_domains = exclude_domains
        # 预留。计划用于按发布时间筛选，当前不生效
        self.time_range = time_range
        # 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
        self.need_url = need_url
        # 预留。计划支持 news 等网页搜索领域，当前不生效
        self.industry = industry

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.include_domains is not None:
            result['include_domains'] = self.include_domains
        if self.exclude_domains is not None:
            result['exclude_domains'] = self.exclude_domains
        if self.time_range is not None:
            result['time_range'] = self.time_range
        if self.need_url is not None:
            result['need_url'] = self.need_url
        if self.industry is not None:
            result['industry'] = self.industry
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('include_domains') is not None:
            self.include_domains = m.get('include_domains')
        if m.get('exclude_domains') is not None:
            self.exclude_domains = m.get('exclude_domains')
        if m.get('time_range') is not None:
            self.time_range = m.get('time_range')
        if m.get('need_url') is not None:
            self.need_url = m.get('need_url')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        return self


class FetchResult(TeaModel):
    def __init__(
        self,
        id: str = None,
        content_id: str = None,
        url: str = None,
        title: str = None,
        site_name: str = None,
        description: str = None,
        content: str = None,
        publish_time: str = None,
        author: str = None,
        logo_url: str = None,
        content_formats: str = None,
    ):
        # 本次 Fetch 结果唯一标识
        self.id = id
        # 内容唯一标识，用于内容去重与引用
        self.content_id = content_id
        # 原始网页链接
        self.url = url
        # 网页标题
        self.title = title
        # 来源站点名称
        self.site_name = site_name
        # 网页声明的内容描述；来源于页面公开元信息，不是模型生成摘要
        self.description = description
        # 清洗后的网页主要正文
        self.content = content
        # 内容发布时间，ISO 8601 格式
        self.publish_time = publish_time
        # 作者或发布机构
        self.author = author
        # 来源站点 Logo 链接
        self.logo_url = logo_url
        # 正文实际输出格式：text 或 markdown
        self.content_formats = content_formats

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.content_id, 'content_id')
        self.validate_required(self.url, 'url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.url is not None:
            result['url'] = self.url
        if self.title is not None:
            result['title'] = self.title
        if self.site_name is not None:
            result['site_name'] = self.site_name
        if self.description is not None:
            result['description'] = self.description
        if self.content is not None:
            result['content'] = self.content
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.author is not None:
            result['author'] = self.author
        if self.logo_url is not None:
            result['logo_url'] = self.logo_url
        if self.content_formats is not None:
            result['content_formats'] = self.content_formats
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('site_name') is not None:
            self.site_name = m.get('site_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('author') is not None:
            self.author = m.get('author')
        if m.get('logo_url') is not None:
            self.logo_url = m.get('logo_url')
        if m.get('content_formats') is not None:
            self.content_formats = m.get('content_formats')
        return self


class IndustryDataItem(TeaModel):
    def __init__(
        self,
        title: str = None,
        type: str = None,
        result: str = None,
    ):
        # 行业数据标题
        self.title = title
        # 行业数据类型及结构标识，用于确定 CardData 的字段结构
        self.type = type
        # 行业结构化数据，字段随 Type 定义
        self.result = result

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.type, 'type')
        self.validate_required(self.result, 'result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryMcpGetcurtimeRequest(TeaModel):
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
        _map = super().to_map()
        if _map is not None:
            return _map

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


class QueryMcpGetcurtimeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        datetime: str = None,
        week_day: str = None,
        if_trading_day: str = None,
        if_week_end: str = None,
        if_month_end: str = None,
        if_quarter_end: str = None,
        if_year_end: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前日期时间
        self.datetime = datetime
        # 周几
        self.week_day = week_day
        # 是否交易日
        self.if_trading_day = if_trading_day
        # 是否周最后交易日
        self.if_week_end = if_week_end
        # 是否月最后交易日
        self.if_month_end = if_month_end
        # 是否季最后交易日
        self.if_quarter_end = if_quarter_end
        # 是否年最后交易日
        self.if_year_end = if_year_end

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
        if self.datetime is not None:
            result['datetime'] = self.datetime
        if self.week_day is not None:
            result['week_day'] = self.week_day
        if self.if_trading_day is not None:
            result['if_trading_day'] = self.if_trading_day
        if self.if_week_end is not None:
            result['if_week_end'] = self.if_week_end
        if self.if_month_end is not None:
            result['if_month_end'] = self.if_month_end
        if self.if_quarter_end is not None:
            result['if_quarter_end'] = self.if_quarter_end
        if self.if_year_end is not None:
            result['if_year_end'] = self.if_year_end
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('datetime') is not None:
            self.datetime = m.get('datetime')
        if m.get('week_day') is not None:
            self.week_day = m.get('week_day')
        if m.get('if_trading_day') is not None:
            self.if_trading_day = m.get('if_trading_day')
        if m.get('if_week_end') is not None:
            self.if_week_end = m.get('if_week_end')
        if m.get('if_month_end') is not None:
            self.if_month_end = m.get('if_month_end')
        if m.get('if_quarter_end') is not None:
            self.if_quarter_end = m.get('if_quarter_end')
        if m.get('if_year_end') is not None:
            self.if_year_end = m.get('if_year_end')
        return self


class QueryMcpAssetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        plate_object: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 板块名称
        self.plate_object = plate_object

    def validate(self):
        self.validate_required(self.plate_object, 'plate_object')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.plate_object is not None:
            result['plate_object'] = self.plate_object
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('plate_object') is not None:
            self.plate_object = m.get('plate_object')
        return self


class QueryMcpAssetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        asset_type: str = None,
        asset_name: str = None,
        track_index_code: str = None,
        track_index_abbr: str = None,
        sort_order: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产类别
        self.asset_type = asset_type
        # 资产名称
        self.asset_name = asset_name
        # 跟踪指数代码
        self.track_index_code = track_index_code
        # 跟踪指数简称
        self.track_index_abbr = track_index_abbr
        # 排序
        self.sort_order = sort_order

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
        if self.asset_type is not None:
            result['asset_type'] = self.asset_type
        if self.asset_name is not None:
            result['asset_name'] = self.asset_name
        if self.track_index_code is not None:
            result['track_index_code'] = self.track_index_code
        if self.track_index_abbr is not None:
            result['track_index_abbr'] = self.track_index_abbr
        if self.sort_order is not None:
            result['sort_order'] = self.sort_order
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('asset_type') is not None:
            self.asset_type = m.get('asset_type')
        if m.get('asset_name') is not None:
            self.asset_name = m.get('asset_name')
        if m.get('track_index_code') is not None:
            self.track_index_code = m.get('track_index_code')
        if m.get('track_index_abbr') is not None:
            self.track_index_abbr = m.get('track_index_abbr')
        if m.get('sort_order') is not None:
            self.sort_order = m.get('sort_order')
        return self


class QueryAntsearchSearchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        query: str = None,
        mode: str = None,
        search_type: str = None,
        count: int = None,
        content_format: str = None,
        filter_include_domains: str = None,
        filter_exclude_domains: str = None,
        filter_time_range: str = None,
        filter_need_url: bool = None,
        filter_industry: str = None,
        filter_enable_industry_data_search: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 搜索内容，不能为空；建议不超过 200 个字符
        self.query = query
        # AI 上下文档位，协议预设 fast、auto、pro，用于控制检索深度、内容密度和 Token 规模；当前仅支持 auto，传入其他值将返回参数错误
        self.mode = mode
        # 搜索类型，当前仅支持 web；后续可扩展 image
        self.search_type = search_type
        # 网页结果最大返回数量，取值范围 1～30；不包含 IndustryData
        self.count = count
        # 正文格式。当前支持 text；markdown 为预留值，暂不支持
        self.content_format = content_format
        # 仅搜索指定网站。例如gov.cn表示只返回该域名下的内容；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
        self.filter_include_domains = filter_include_domains
        # 排除指定网站；填写域名，不包含协议和路径,如果有多个，使用英文逗号(,)隔开
        self.filter_exclude_domains = filter_exclude_domains
        # 预留。计划用于按发布时间筛选，当前不生效
        self.filter_time_range = filter_time_range
        # 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
        self.filter_need_url = filter_need_url
        # 预留。计划支持 news 等网页搜索领域，当前不生效
        self.filter_industry = filter_industry
        # 是否返回 IndustryData
        self.filter_enable_industry_data_search = filter_enable_industry_data_search

    def validate(self):
        self.validate_required(self.query, 'query')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.query is not None:
            result['query'] = self.query
        if self.mode is not None:
            result['mode'] = self.mode
        if self.search_type is not None:
            result['search_type'] = self.search_type
        if self.count is not None:
            result['count'] = self.count
        if self.content_format is not None:
            result['content_format'] = self.content_format
        if self.filter_include_domains is not None:
            result['filter_include_domains'] = self.filter_include_domains
        if self.filter_exclude_domains is not None:
            result['filter_exclude_domains'] = self.filter_exclude_domains
        if self.filter_time_range is not None:
            result['filter_time_range'] = self.filter_time_range
        if self.filter_need_url is not None:
            result['filter_need_url'] = self.filter_need_url
        if self.filter_industry is not None:
            result['filter_industry'] = self.filter_industry
        if self.filter_enable_industry_data_search is not None:
            result['filter_enable_industry_data_search'] = self.filter_enable_industry_data_search
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('mode') is not None:
            self.mode = m.get('mode')
        if m.get('search_type') is not None:
            self.search_type = m.get('search_type')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('content_format') is not None:
            self.content_format = m.get('content_format')
        if m.get('filter_include_domains') is not None:
            self.filter_include_domains = m.get('filter_include_domains')
        if m.get('filter_exclude_domains') is not None:
            self.filter_exclude_domains = m.get('filter_exclude_domains')
        if m.get('filter_time_range') is not None:
            self.filter_time_range = m.get('filter_time_range')
        if m.get('filter_need_url') is not None:
            self.filter_need_url = m.get('filter_need_url')
        if m.get('filter_industry') is not None:
            self.filter_industry = m.get('filter_industry')
        if m.get('filter_enable_industry_data_search') is not None:
            self.filter_enable_industry_data_search = m.get('filter_enable_industry_data_search')
        return self


class QueryAntsearchSearchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_metadata: ResponseMetadata = None,
        result: Result = None,
        industry_data: List[IndustryDataItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 统一响应元信息
        self.response_metadata = response_metadata
        # 本次的搜索结果
        self.result = result
        # 行业数据检索结果列表；命中时返回，支持多个结果，一般仅返回 1 个
        self.industry_data = industry_data

    def validate(self):
        if self.response_metadata:
            self.response_metadata.validate()
        if self.result:
            self.result.validate()
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
        if self.response_metadata is not None:
            result['response_metadata'] = self.response_metadata.to_map()
        if self.result is not None:
            result['result'] = self.result.to_map()
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
        if m.get('response_metadata') is not None:
            temp_model = ResponseMetadata()
            self.response_metadata = temp_model.from_map(m['response_metadata'])
        if m.get('result') is not None:
            temp_model = Result()
            self.result = temp_model.from_map(m['result'])
        self.industry_data = []
        if m.get('industry_data') is not None:
            for k in m.get('industry_data'):
                temp_model = IndustryDataItem()
                self.industry_data.append(temp_model.from_map(k))
        return self


class QueryAntsearchFetchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        url: str = None,
        content_format: str = None,
        timeout: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需要读取的公开网页 URL。每次请求仅支持一个 URL，协议须为 http 或 https
        self.url = url
        # 正文输出格式：text 或 markdown
        self.content_format = content_format
        # 网页读取最大等待时间，单位为秒，取值范围 1～60；超时后返回 IsSuccess=false 和 ErrorCode=FETCH_TIMEOUT
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.url, 'url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.url is not None:
            result['url'] = self.url
        if self.content_format is not None:
            result['content_format'] = self.content_format
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('content_format') is not None:
            self.content_format = m.get('content_format')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class QueryAntsearchFetchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        is_success: bool = None,
        error_code: str = None,
        error_message: str = None,
        response_metadata: ResponseMetadata = None,
        result: FetchResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 网页读取和正文解析是否成功
        self.is_success = is_success
        # 失败原因标识，仅失败时返回
        self.error_code = error_code
        # 可读的失败原因，仅失败时返回
        self.error_message = error_message
        # 请求元信息
        self.response_metadata = response_metadata
        # 网页读取与正文解析成功时返回
        self.result = result

    def validate(self):
        if self.response_metadata:
            self.response_metadata.validate()
        if self.result:
            self.result.validate()

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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.response_metadata is not None:
            result['response_metadata'] = self.response_metadata.to_map()
        if self.result is not None:
            result['result'] = self.result.to_map()
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
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('response_metadata') is not None:
            temp_model = ResponseMetadata()
            self.response_metadata = temp_model.from_map(m['response_metadata'])
        if m.get('result') is not None:
            temp_model = FetchResult()
            self.result = temp_model.from_map(m['result'])
        return self


