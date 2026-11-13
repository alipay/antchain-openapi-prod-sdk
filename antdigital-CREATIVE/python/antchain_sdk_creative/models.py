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


class RequestItems(TeaModel):
    def __init__(
        self,
        price_rule_code: str = None,
        charge_item_code: str = None,
        metric_type: str = None,
        quantity: str = None,
        free_quota: str = None,
        billable_quantity: str = None,
        unit_size: str = None,
        unit_price: str = None,
        currency: str = None,
        amount: str = None,
    ):
        # 规则编码
        self.price_rule_code = price_rule_code
        # 收费项编码
        self.charge_item_code = charge_item_code
        # 计量指标类型
        self.metric_type = metric_type
        # 原始计量数量
        self.quantity = quantity
        # 免费额度
        self.free_quota = free_quota
        # 计费数量（扣除免费额度后的值）
        self.billable_quantity = billable_quantity
        # 计费单位大小
        self.unit_size = unit_size
        # 单价
        self.unit_price = unit_price
        # 币种
        self.currency = currency
        # 单项金额
        self.amount = amount

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.price_rule_code is not None:
            result['price_rule_code'] = self.price_rule_code
        if self.charge_item_code is not None:
            result['charge_item_code'] = self.charge_item_code
        if self.metric_type is not None:
            result['metric_type'] = self.metric_type
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.free_quota is not None:
            result['free_quota'] = self.free_quota
        if self.billable_quantity is not None:
            result['billable_quantity'] = self.billable_quantity
        if self.unit_size is not None:
            result['unit_size'] = self.unit_size
        if self.unit_price is not None:
            result['unit_price'] = self.unit_price
        if self.currency is not None:
            result['currency'] = self.currency
        if self.amount is not None:
            result['amount'] = self.amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('price_rule_code') is not None:
            self.price_rule_code = m.get('price_rule_code')
        if m.get('charge_item_code') is not None:
            self.charge_item_code = m.get('charge_item_code')
        if m.get('metric_type') is not None:
            self.metric_type = m.get('metric_type')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('free_quota') is not None:
            self.free_quota = m.get('free_quota')
        if m.get('billable_quantity') is not None:
            self.billable_quantity = m.get('billable_quantity')
        if m.get('unit_size') is not None:
            self.unit_size = m.get('unit_size')
        if m.get('unit_price') is not None:
            self.unit_price = m.get('unit_price')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        return self


class ContentUrl(TeaModel):
    def __init__(
        self,
        url: str = None,
    ):
        # url
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class ImageUrlsList(TeaModel):
    def __init__(
        self,
        image_urls: List[str] = None,
    ):
        # 图片 URL 列表
        self.image_urls = image_urls

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.image_urls is not None:
            result['image_urls'] = self.image_urls
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('image_urls') is not None:
            self.image_urls = m.get('image_urls')
        return self


class ChatUsage(TeaModel):
    def __init__(
        self,
        prompt_tokens: str = None,
        completion_tokens: str = None,
        total_tokens: str = None,
        original_price: str = None,
        currency: str = None,
    ):
        # 输入 token 数
        self.prompt_tokens = prompt_tokens
        # 输出 token 数
        self.completion_tokens = completion_tokens
        # 总 token 数
        self.total_tokens = total_tokens
        # 本次调用实际消耗金额
        self.original_price = original_price
        # 币种
        self.currency = currency

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.prompt_tokens is not None:
            result['prompt_tokens'] = self.prompt_tokens
        if self.completion_tokens is not None:
            result['completion_tokens'] = self.completion_tokens
        if self.total_tokens is not None:
            result['total_tokens'] = self.total_tokens
        if self.original_price is not None:
            result['original_price'] = self.original_price
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('prompt_tokens') is not None:
            self.prompt_tokens = m.get('prompt_tokens')
        if m.get('completion_tokens') is not None:
            self.completion_tokens = m.get('completion_tokens')
        if m.get('total_tokens') is not None:
            self.total_tokens = m.get('total_tokens')
        if m.get('original_price') is not None:
            self.original_price = m.get('original_price')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class UnitEstimates(TeaModel):
    def __init__(
        self,
        unit_index: int = None,
        matched: bool = None,
        fallback: bool = None,
        price_rule_code: str = None,
        matched_rule_version: int = None,
        rule_name: str = None,
        priority: int = None,
        items: List[RequestItems] = None,
        amount: str = None,
        message: str = None,
    ):
        # 从 0 开始，与请求的 units[] 顺序一致
        self.unit_index = unit_index
        # 当前单元是否命中
        self.matched = matched
        # 当前单元是否命中兜底规则
        self.fallback = fallback
        # 规则编码
        self.price_rule_code = price_rule_code
        # 规则版本
        self.matched_rule_version = matched_rule_version
        # 规则名称
        self.rule_name = rule_name
        # 规则优先级
        self.priority = priority
        # 费用明细
        self.items = items
        # 当前单元金额
        self.amount = amount
        # 未命中或部分命中时的提示
        self.message = message

    def validate(self):
        if self.items:
            for k in self.items:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.unit_index is not None:
            result['unit_index'] = self.unit_index
        if self.matched is not None:
            result['matched'] = self.matched
        if self.fallback is not None:
            result['fallback'] = self.fallback
        if self.price_rule_code is not None:
            result['price_rule_code'] = self.price_rule_code
        if self.matched_rule_version is not None:
            result['matched_rule_version'] = self.matched_rule_version
        if self.rule_name is not None:
            result['rule_name'] = self.rule_name
        if self.priority is not None:
            result['priority'] = self.priority
        result['items'] = []
        if self.items is not None:
            for k in self.items:
                result['items'].append(k.to_map() if k else None)
        if self.amount is not None:
            result['amount'] = self.amount
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('unit_index') is not None:
            self.unit_index = m.get('unit_index')
        if m.get('matched') is not None:
            self.matched = m.get('matched')
        if m.get('fallback') is not None:
            self.fallback = m.get('fallback')
        if m.get('price_rule_code') is not None:
            self.price_rule_code = m.get('price_rule_code')
        if m.get('matched_rule_version') is not None:
            self.matched_rule_version = m.get('matched_rule_version')
        if m.get('rule_name') is not None:
            self.rule_name = m.get('rule_name')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        self.items = []
        if m.get('items') is not None:
            for k in m.get('items'):
                temp_model = RequestItems()
                self.items.append(temp_model.from_map(k))
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class AudioUsage(TeaModel):
    def __init__(
        self,
        usage_type: str = None,
        unit: str = None,
        duration_seconds: str = None,
        count: int = None,
        original_price: str = None,
        currency: str = None,
    ):
        # 用量类型
        self.usage_type = usage_type
        # 计量单位
        self.unit = unit
        # 音频时长（秒）
        self.duration_seconds = duration_seconds
        # 音频数量
        self.count = count
        # 本次音频生成的实际消耗金额（必返）
        self.original_price = original_price
        # 币种
        self.currency = currency

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.usage_type is not None:
            result['usage_type'] = self.usage_type
        if self.unit is not None:
            result['unit'] = self.unit
        if self.duration_seconds is not None:
            result['duration_seconds'] = self.duration_seconds
        if self.count is not None:
            result['count'] = self.count
        if self.original_price is not None:
            result['original_price'] = self.original_price
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('usage_type') is not None:
            self.usage_type = m.get('usage_type')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('duration_seconds') is not None:
            self.duration_seconds = m.get('duration_seconds')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('original_price') is not None:
            self.original_price = m.get('original_price')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class ContentInfo(TeaModel):
    def __init__(
        self,
        type: str = None,
        text: str = None,
        image_url: ContentUrl = None,
        audio_url: ContentUrl = None,
        video_url: ContentUrl = None,
        role: str = None,
    ):
        # 类型
        self.type = type
        # type=text 时提供，文本
        self.text = text
        # type=image_url 时提供
        self.image_url = image_url
        # type=audio_url 时提供
        self.audio_url = audio_url
        # type=video_url 时提供
        self.video_url = video_url
        # 角色
        self.role = role

    def validate(self):
        self.validate_required(self.type, 'type')
        if self.image_url:
            self.image_url.validate()
        if self.audio_url:
            self.audio_url.validate()
        if self.video_url:
            self.video_url.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.text is not None:
            result['text'] = self.text
        if self.image_url is not None:
            result['image_url'] = self.image_url.to_map()
        if self.audio_url is not None:
            result['audio_url'] = self.audio_url.to_map()
        if self.video_url is not None:
            result['video_url'] = self.video_url.to_map()
        if self.role is not None:
            result['role'] = self.role
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('image_url') is not None:
            temp_model = ContentUrl()
            self.image_url = temp_model.from_map(m['image_url'])
        if m.get('audio_url') is not None:
            temp_model = ContentUrl()
            self.audio_url = temp_model.from_map(m['audio_url'])
        if m.get('video_url') is not None:
            temp_model = ContentUrl()
            self.video_url = temp_model.from_map(m['video_url'])
        if m.get('role') is not None:
            self.role = m.get('role')
        return self


class VideoUsage(TeaModel):
    def __init__(
        self,
        usage_type: str = None,
        unit: str = None,
        duration_seconds: str = None,
        original_price: str = None,
        currency: str = None,
    ):
        # 用量类型
        self.usage_type = usage_type
        # 计量单位
        self.unit = unit
        # 视频时长（秒）
        self.duration_seconds = duration_seconds
        # 本次视频生成的实际消耗金额
        self.original_price = original_price
        # 币种
        self.currency = currency

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.usage_type is not None:
            result['usage_type'] = self.usage_type
        if self.unit is not None:
            result['unit'] = self.unit
        if self.duration_seconds is not None:
            result['duration_seconds'] = self.duration_seconds
        if self.original_price is not None:
            result['original_price'] = self.original_price
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('usage_type') is not None:
            self.usage_type = m.get('usage_type')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('duration_seconds') is not None:
            self.duration_seconds = m.get('duration_seconds')
        if m.get('original_price') is not None:
            self.original_price = m.get('original_price')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class AudioList(TeaModel):
    def __init__(
        self,
        audio_url: str = None,
        audio_format: str = None,
        duration_seconds: str = None,
    ):
        # 音频 URL 列表
        self.audio_url = audio_url
        # 音频格式
        self.audio_format = audio_format
        # 处理后播放时长（秒）
        self.duration_seconds = duration_seconds

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.audio_url is not None:
            result['audio_url'] = self.audio_url
        if self.audio_format is not None:
            result['audio_format'] = self.audio_format
        if self.duration_seconds is not None:
            result['duration_seconds'] = self.duration_seconds
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('audio_url') is not None:
            self.audio_url = m.get('audio_url')
        if m.get('audio_format') is not None:
            self.audio_format = m.get('audio_format')
        if m.get('duration_seconds') is not None:
            self.duration_seconds = m.get('duration_seconds')
        return self


class VideoUrl(TeaModel):
    def __init__(
        self,
        video_url: str = None,
    ):
        # 视频 URL（成功时返回）
        self.video_url = video_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.video_url is not None:
            result['video_url'] = self.video_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('video_url') is not None:
            self.video_url = m.get('video_url')
        return self


class PriceUnits(TeaModel):
    def __init__(
        self,
        dimensions: str = None,
        metrics: str = None,
    ):
        # 当前输出单元定价维度
        self.dimensions = dimensions
        # 当前输出单元计量指标
        self.metrics = metrics

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.dimensions is not None:
            result['dimensions'] = self.dimensions
        if self.metrics is not None:
            result['metrics'] = self.metrics
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('dimensions') is not None:
            self.dimensions = m.get('dimensions')
        if m.get('metrics') is not None:
            self.metrics = m.get('metrics')
        return self


class ExtraInfo(TeaModel):
    def __init__(
        self,
        original_task_id: str = None,
        original_video_url: str = None,
        original_response_snapshot: str = None,
    ):
        # 原厂任务ID
        self.original_task_id = original_task_id
        # 原厂视频输出URL
        self.original_video_url = original_video_url
        # 原厂响应体快照
        self.original_response_snapshot = original_response_snapshot

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.original_task_id is not None:
            result['original_task_id'] = self.original_task_id
        if self.original_video_url is not None:
            result['original_video_url'] = self.original_video_url
        if self.original_response_snapshot is not None:
            result['original_response_snapshot'] = self.original_response_snapshot
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('original_task_id') is not None:
            self.original_task_id = m.get('original_task_id')
        if m.get('original_video_url') is not None:
            self.original_video_url = m.get('original_video_url')
        if m.get('original_response_snapshot') is not None:
            self.original_response_snapshot = m.get('original_response_snapshot')
        return self


class Error(TeaModel):
    def __init__(
        self,
        code: str = None,
        message: str = None,
    ):
        # 错误码
        self.code = code
        # 错误信息
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class ImageUrl(TeaModel):
    def __init__(
        self,
        image_url: ContentUrl = None,
    ):
        # test
        self.image_url = image_url

    def validate(self):
        if self.image_url:
            self.image_url.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.image_url is not None:
            result['image_url'] = self.image_url.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('image_url') is not None:
            temp_model = ContentUrl()
            self.image_url = temp_model.from_map(m['image_url'])
        return self


class ChatMessages(TeaModel):
    def __init__(
        self,
        role: str = None,
        content: str = None,
    ):
        # 角色
        self.role = role
        # 文本内容
        self.content = content

    def validate(self):
        self.validate_required(self.role, 'role')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.role is not None:
            result['role'] = self.role
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class ImageUsage(TeaModel):
    def __init__(
        self,
        usage_type: str = None,
        unit: str = None,
        image_count: int = None,
        original_price: str = None,
        currency: str = None,
    ):
        # 用量类型
        self.usage_type = usage_type
        # 计量单位
        self.unit = unit
        # 图片张数
        self.image_count = image_count
        # 本次图片生成的实际消耗金额
        self.original_price = original_price
        # 币种
        self.currency = currency

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.usage_type is not None:
            result['usage_type'] = self.usage_type
        if self.unit is not None:
            result['unit'] = self.unit
        if self.image_count is not None:
            result['image_count'] = self.image_count
        if self.original_price is not None:
            result['original_price'] = self.original_price
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('usage_type') is not None:
            self.usage_type = m.get('usage_type')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('image_count') is not None:
            self.image_count = m.get('image_count')
        if m.get('original_price') is not None:
            self.original_price = m.get('original_price')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class Usage(TeaModel):
    def __init__(
        self,
        resolution: str = None,
        duration: int = None,
        ratio: str = None,
        completion_tokens: int = None,
        completion_credits: int = None,
    ):
        # 分辨率
        self.resolution = resolution
        # 视频时长（单位：秒）
        self.duration = duration
        # 视频比例
        self.ratio = ratio
        # 消耗 token 数
        self.completion_tokens = completion_tokens
        # 消耗credit数
        self.completion_credits = completion_credits

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.resolution is not None:
            result['resolution'] = self.resolution
        if self.duration is not None:
            result['duration'] = self.duration
        if self.ratio is not None:
            result['ratio'] = self.ratio
        if self.completion_tokens is not None:
            result['completion_tokens'] = self.completion_tokens
        if self.completion_credits is not None:
            result['completion_credits'] = self.completion_credits
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('resolution') is not None:
            self.resolution = m.get('resolution')
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        if m.get('ratio') is not None:
            self.ratio = m.get('ratio')
        if m.get('completion_tokens') is not None:
            self.completion_tokens = m.get('completion_tokens')
        if m.get('completion_credits') is not None:
            self.completion_credits = m.get('completion_credits')
        return self


class PushVideogenerationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        model: str = None,
        prompt: str = None,
        image_url: List[str] = None,
        video_url: List[str] = None,
        audio_url: List[str] = None,
        ratio: str = None,
        duration: int = None,
        request_id: str = None,
        ext: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模型标识，如 ：doubao-seedance-2-0-260128
        self.model = model
        # 文本提示词
        self.prompt = prompt
        # 图生视频参考图片 URL
        self.image_url = image_url
        # 视频参考/续写时传入视频 URL
        self.video_url = video_url
        # 参考音频URL列表
        self.audio_url = audio_url
        # 比例
        self.ratio = ratio
        # 视频时长（秒）
        self.duration = duration
        # 请求追踪 ID，用于幂等去重
        self.request_id = request_id
        # 扩展JSON
        self.ext = ext

    def validate(self):
        self.validate_required(self.model, 'model')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.model is not None:
            result['model'] = self.model
        if self.prompt is not None:
            result['prompt'] = self.prompt
        if self.image_url is not None:
            result['image_url'] = self.image_url
        if self.video_url is not None:
            result['video_url'] = self.video_url
        if self.audio_url is not None:
            result['audio_url'] = self.audio_url
        if self.ratio is not None:
            result['ratio'] = self.ratio
        if self.duration is not None:
            result['duration'] = self.duration
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.ext is not None:
            result['ext'] = self.ext
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('prompt') is not None:
            self.prompt = m.get('prompt')
        if m.get('image_url') is not None:
            self.image_url = m.get('image_url')
        if m.get('video_url') is not None:
            self.video_url = m.get('video_url')
        if m.get('audio_url') is not None:
            self.audio_url = m.get('audio_url')
        if m.get('ratio') is not None:
            self.ratio = m.get('ratio')
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('ext') is not None:
            self.ext = m.get('ext')
        return self


class PushVideogenerationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        status: str = None,
        model: str = None,
        ext: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务 ID，后续查询结果通过此参数获取
        self.task_id = task_id
        # 任务状态：pending（等待中）、processing（处理中）、succeeded（已成功）、failed（已失败）
        self.status = status
        # 模型名称
        self.model = model
        # 扩展JSON
        self.ext = ext

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.model is not None:
            result['model'] = self.model
        if self.ext is not None:
            result['ext'] = self.ext
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('ext') is not None:
            self.ext = m.get('ext')
        return self


class QueryVideogenerationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询的任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryVideogenerationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        status: str = None,
        video_url: str = None,
        error_code: str = None,
        error_message: str = None,
        usage: Usage = None,
        extra_info: ExtraInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 任务状态
        self.status = status
        # 视频输出URL
        self.video_url = video_url
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_message = error_message
        # 用量信息
        self.usage = usage
        # 附加信息
        self.extra_info = extra_info

    def validate(self):
        if self.usage:
            self.usage.validate()
        if self.extra_info:
            self.extra_info.validate()

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.video_url is not None:
            result['video_url'] = self.video_url
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.usage is not None:
            result['usage'] = self.usage.to_map()
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('video_url') is not None:
            self.video_url = m.get('video_url')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('usage') is not None:
            temp_model = Usage()
            self.usage = temp_model.from_map(m['usage'])
        if m.get('extra_info') is not None:
            temp_model = ExtraInfo()
            self.extra_info = temp_model.from_map(m['extra_info'])
        return self


class UploadAssetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_type: str = None,
        file_url: str = None,
        asset_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产类型
        self.asset_type = asset_type
        # 公网可访问的文件URL
        self.file_url = file_url
        # 资产名称
        self.asset_name = asset_name

    def validate(self):
        self.validate_required(self.asset_type, 'asset_type')
        self.validate_required(self.file_url, 'file_url')
        self.validate_required(self.asset_name, 'asset_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_type is not None:
            result['asset_type'] = self.asset_type
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.asset_name is not None:
            result['asset_name'] = self.asset_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_type') is not None:
            self.asset_type = m.get('asset_type')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('asset_name') is not None:
            self.asset_name = m.get('asset_name')
        return self


class UploadAssetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        asset_id: str = None,
        status: str = None,
        asset_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产ID
        self.asset_id = asset_id
        # 资产状态
        self.status = status
        # 资产类型
        self.asset_type = asset_type

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
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.status is not None:
            result['status'] = self.status
        if self.asset_type is not None:
            result['asset_type'] = self.asset_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('asset_type') is not None:
            self.asset_type = m.get('asset_type')
        return self


class QueryAssetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产ID
        self.asset_id = asset_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        return self


class QueryAssetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        asset_id: str = None,
        status: str = None,
        asset_type: str = None,
        asset_url: str = None,
        error_message: str = None,
        error_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产ID
        self.asset_id = asset_id
        # 资产状态
        self.status = status
        # 资产类型
        self.asset_type = asset_type
        # 资产类型
        self.asset_url = asset_url
        # 错误信息
        self.error_message = error_message
        # 错误码
        self.error_code = error_code

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
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.status is not None:
            result['status'] = self.status
        if self.asset_type is not None:
            result['asset_type'] = self.asset_type
        if self.asset_url is not None:
            result['asset_url'] = self.asset_url
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.error_code is not None:
            result['error_code'] = self.error_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('asset_type') is not None:
            self.asset_type = m.get('asset_type')
        if m.get('asset_url') is not None:
            self.asset_url = m.get('asset_url')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        return self


class UploadMaasAssetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        file_url: str = None,
        asset_type: str = None,
        asset_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 幂等标识，由客户端生成
        self.request_id = request_id
        # 文件公网可访问 URL
        self.file_url = file_url
        # 资产类型
        self.asset_type = asset_type
        # 资产名称
        self.asset_name = asset_name

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.file_url, 'file_url')
        self.validate_required(self.asset_type, 'asset_type')
        self.validate_required(self.asset_name, 'asset_name')

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
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.asset_type is not None:
            result['asset_type'] = self.asset_type
        if self.asset_name is not None:
            result['asset_name'] = self.asset_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('asset_type') is not None:
            self.asset_type = m.get('asset_type')
        if m.get('asset_name') is not None:
            self.asset_name = m.get('asset_name')
        return self


class UploadMaasAssetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        asset_id: str = None,
        status: str = None,
        asset_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 平台素材 ID
        self.asset_id = asset_id
        # 状态
        self.status = status
        # 资产类型
        self.asset_type = asset_type

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
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.status is not None:
            result['status'] = self.status
        if self.asset_type is not None:
            result['asset_type'] = self.asset_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('asset_type') is not None:
            self.asset_type = m.get('asset_type')
        return self


class QueryMaasAssetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        asset_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资产 ID
        self.asset_id = asset_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        return self


class QueryMaasAssetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        asset_id: str = None,
        status: str = None,
        asset_type: str = None,
        url: str = None,
        name: str = None,
        created_at: str = None,
        updated_at: str = None,
        error: Error = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产 ID
        self.asset_id = asset_id
        # 状态
        self.status = status
        # 资产类型
        self.asset_type = asset_type
        # 资产访问 URL，仅在已取得可访问地址时返回
        self.url = url
        # 素材名称，可选
        self.name = name
        # 创建时间，Unix 秒级时间戳，可选
        self.created_at = created_at
        # 更新时间，Unix 秒级时间戳，可选
        self.updated_at = updated_at
        # 处理失败时返回，包含 code / message
        self.error = error

    def validate(self):
        if self.error:
            self.error.validate()

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
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.status is not None:
            result['status'] = self.status
        if self.asset_type is not None:
            result['asset_type'] = self.asset_type
        if self.url is not None:
            result['url'] = self.url
        if self.name is not None:
            result['name'] = self.name
        if self.created_at is not None:
            result['created_at'] = self.created_at
        if self.updated_at is not None:
            result['updated_at'] = self.updated_at
        if self.error is not None:
            result['error'] = self.error.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('asset_type') is not None:
            self.asset_type = m.get('asset_type')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('created_at') is not None:
            self.created_at = m.get('created_at')
        if m.get('updated_at') is not None:
            self.updated_at = m.get('updated_at')
        if m.get('error') is not None:
            temp_model = Error()
            self.error = temp_model.from_map(m['error'])
        return self


class PushMaasVideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        model: str = None,
        capability_type: str = None,
        content: List[ContentInfo] = None,
        duration: str = None,
        ratio: str = None,
        resolution: str = None,
        generate_audio: bool = None,
        watermark: bool = None,
        ext_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 幂等标识，由客户端生成
        self.request_id = request_id
        # 视频模型编码
        self.model = model
        # 类型
        self.capability_type = capability_type
        # 非空内容列表，至少含文本或素材
        self.content = content
        # 视频时长（秒）
        self.duration = duration
        # 宽高比，如 16:9、9:16
        self.ratio = ratio
        # 分辨率，如 720P、1080P
        self.resolution = resolution
        # 是否生成音轨，默认 false
        self.generate_audio = generate_audio
        # 是否添加水印
        self.watermark = watermark
        # 扩展参数 JSON 字符串
        self.ext_params = ext_params

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.model, 'model')
        self.validate_required(self.capability_type, 'capability_type')
        self.validate_required(self.content, 'content')
        if self.content:
            for k in self.content:
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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.model is not None:
            result['model'] = self.model
        if self.capability_type is not None:
            result['capability_type'] = self.capability_type
        result['content'] = []
        if self.content is not None:
            for k in self.content:
                result['content'].append(k.to_map() if k else None)
        if self.duration is not None:
            result['duration'] = self.duration
        if self.ratio is not None:
            result['ratio'] = self.ratio
        if self.resolution is not None:
            result['resolution'] = self.resolution
        if self.generate_audio is not None:
            result['generate_audio'] = self.generate_audio
        if self.watermark is not None:
            result['watermark'] = self.watermark
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('capability_type') is not None:
            self.capability_type = m.get('capability_type')
        self.content = []
        if m.get('content') is not None:
            for k in m.get('content'):
                temp_model = ContentInfo()
                self.content.append(temp_model.from_map(k))
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        if m.get('ratio') is not None:
            self.ratio = m.get('ratio')
        if m.get('resolution') is not None:
            self.resolution = m.get('resolution')
        if m.get('generate_audio') is not None:
            self.generate_audio = m.get('generate_audio')
        if m.get('watermark') is not None:
            self.watermark = m.get('watermark')
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        return self


class PushMaasVideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        status: str = None,
        model: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频任务 ID
        self.task_id = task_id
        # 任务状态
        self.status = status
        # 实际使用的模型
        self.model = model

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.model is not None:
            result['model'] = self.model
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('model') is not None:
            self.model = m.get('model')
        return self


class QueryMaasVideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 视频任务 ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryMaasVideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        status: str = None,
        model: str = None,
        created_at: str = None,
        updated_at: str = None,
        content: VideoUrl = None,
        duration: str = None,
        ratio: str = None,
        resolution: str = None,
        generate_audio: bool = None,
        usage: List[VideoUsage] = None,
        extra_info: str = None,
        error: Error = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频任务 ID
        self.task_id = task_id
        # 任务状态
        self.status = status
        # 实际使用的模型
        self.model = model
        # 创建时间，Unix 秒级时间戳
        self.created_at = created_at
        # 更新时间，Unix 秒级时间戳
        self.updated_at = updated_at
        # 视频 URL（成功时返回）
        self.content = content
        # 视频时长（秒
        self.duration = duration
        # 宽高比
        self.ratio = ratio
        # 分辨率
        self.resolution = resolution
        # 是否生成音轨
        self.generate_audio = generate_audio
        # 用量数组
        self.usage = usage
        # 非标准化补充信息，JSON 字符串
        self.extra_info = extra_info
        # 失败时返回
        self.error = error

    def validate(self):
        if self.content:
            self.content.validate()
        if self.usage:
            for k in self.usage:
                if k:
                    k.validate()
        if self.error:
            self.error.validate()

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.model is not None:
            result['model'] = self.model
        if self.created_at is not None:
            result['created_at'] = self.created_at
        if self.updated_at is not None:
            result['updated_at'] = self.updated_at
        if self.content is not None:
            result['content'] = self.content.to_map()
        if self.duration is not None:
            result['duration'] = self.duration
        if self.ratio is not None:
            result['ratio'] = self.ratio
        if self.resolution is not None:
            result['resolution'] = self.resolution
        if self.generate_audio is not None:
            result['generate_audio'] = self.generate_audio
        result['usage'] = []
        if self.usage is not None:
            for k in self.usage:
                result['usage'].append(k.to_map() if k else None)
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.error is not None:
            result['error'] = self.error.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('created_at') is not None:
            self.created_at = m.get('created_at')
        if m.get('updated_at') is not None:
            self.updated_at = m.get('updated_at')
        if m.get('content') is not None:
            temp_model = VideoUrl()
            self.content = temp_model.from_map(m['content'])
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        if m.get('ratio') is not None:
            self.ratio = m.get('ratio')
        if m.get('resolution') is not None:
            self.resolution = m.get('resolution')
        if m.get('generate_audio') is not None:
            self.generate_audio = m.get('generate_audio')
        self.usage = []
        if m.get('usage') is not None:
            for k in m.get('usage'):
                temp_model = VideoUsage()
                self.usage.append(temp_model.from_map(k))
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('error') is not None:
            temp_model = Error()
            self.error = temp_model.from_map(m['error'])
        return self


class PushMaasImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        model: str = None,
        capability_type: str = None,
        generate_mode: str = None,
        prompt: str = None,
        image_urls: List[str] = None,
        size: str = None,
        n: int = None,
        ext_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 幂等标识，由客户端生成
        self.request_id = request_id
        # 图片模型编码
        self.model = model
        # 类型
        self.capability_type = capability_type
        # 生成模式
        self.generate_mode = generate_mode
        # 图片生成或编辑提示词
        self.prompt = prompt
        # 图片地址
        self.image_urls = image_urls
        # 图片尺寸
        self.size = size
        # 图片张数
        self.n = n
        # 扩展参数 JSON 字符串
        self.ext_params = ext_params

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.model, 'model')
        self.validate_required(self.capability_type, 'capability_type')
        self.validate_required(self.prompt, 'prompt')

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
        if self.model is not None:
            result['model'] = self.model
        if self.capability_type is not None:
            result['capability_type'] = self.capability_type
        if self.generate_mode is not None:
            result['generate_mode'] = self.generate_mode
        if self.prompt is not None:
            result['prompt'] = self.prompt
        if self.image_urls is not None:
            result['image_urls'] = self.image_urls
        if self.size is not None:
            result['size'] = self.size
        if self.n is not None:
            result['n'] = self.n
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('capability_type') is not None:
            self.capability_type = m.get('capability_type')
        if m.get('generate_mode') is not None:
            self.generate_mode = m.get('generate_mode')
        if m.get('prompt') is not None:
            self.prompt = m.get('prompt')
        if m.get('image_urls') is not None:
            self.image_urls = m.get('image_urls')
        if m.get('size') is not None:
            self.size = m.get('size')
        if m.get('n') is not None:
            self.n = m.get('n')
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        return self


class PushMaasImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        status: str = None,
        model: str = None,
        content: ImageUrlsList = None,
        usage: List[ImageUsage] = None,
        error: Error = None,
        extra_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 图片任务 ID
        self.task_id = task_id
        # 任务状态
        self.status = status
        # 实际使用的模型
        self.model = model
        # 图片 URL 列表
        self.content = content
        # 用量数组
        self.usage = usage
        # 失败时返回
        self.error = error
        # 非标准化补充信息，JSON 字符串
        self.extra_info = extra_info

    def validate(self):
        if self.content:
            self.content.validate()
        if self.usage:
            for k in self.usage:
                if k:
                    k.validate()
        if self.error:
            self.error.validate()

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.model is not None:
            result['model'] = self.model
        if self.content is not None:
            result['content'] = self.content.to_map()
        result['usage'] = []
        if self.usage is not None:
            for k in self.usage:
                result['usage'].append(k.to_map() if k else None)
        if self.error is not None:
            result['error'] = self.error.to_map()
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('content') is not None:
            temp_model = ImageUrlsList()
            self.content = temp_model.from_map(m['content'])
        self.usage = []
        if m.get('usage') is not None:
            for k in m.get('usage'):
                temp_model = ImageUsage()
                self.usage.append(temp_model.from_map(k))
        if m.get('error') is not None:
            temp_model = Error()
            self.error = temp_model.from_map(m['error'])
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        return self


class QueryMaasImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 图片任务 ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryMaasImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        status: str = None,
        model: str = None,
        created_at: str = None,
        content: ImageUrlsList = None,
        usage: List[ImageUsage] = None,
        extra_info: str = None,
        error: Error = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 图片任务 ID
        self.task_id = task_id
        # 任务状态
        self.status = status
        # 实际使用的模型
        self.model = model
        # 创建时间，Unix 秒级时间戳
        self.created_at = created_at
        # 图片 URL 列表（成功时返回）
        self.content = content
        # 用量数组
        self.usage = usage
        # 非标准化补充信息，JSON 字符串
        self.extra_info = extra_info
        # 失败时返回
        self.error = error

    def validate(self):
        if self.content:
            self.content.validate()
        if self.usage:
            for k in self.usage:
                if k:
                    k.validate()
        if self.error:
            self.error.validate()

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.model is not None:
            result['model'] = self.model
        if self.created_at is not None:
            result['created_at'] = self.created_at
        if self.content is not None:
            result['content'] = self.content.to_map()
        result['usage'] = []
        if self.usage is not None:
            for k in self.usage:
                result['usage'].append(k.to_map() if k else None)
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.error is not None:
            result['error'] = self.error.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('created_at') is not None:
            self.created_at = m.get('created_at')
        if m.get('content') is not None:
            temp_model = ImageUrlsList()
            self.content = temp_model.from_map(m['content'])
        self.usage = []
        if m.get('usage') is not None:
            for k in m.get('usage'):
                temp_model = ImageUsage()
                self.usage.append(temp_model.from_map(k))
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('error') is not None:
            temp_model = Error()
            self.error = temp_model.from_map(m['error'])
        return self


class PushMaasAudioRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        model: str = None,
        capability_type: str = None,
        prompt: str = None,
        text: str = None,
        audio_urls: List[str] = None,
        image_urls: List[str] = None,
        ext_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 幂等标识，由客户端生成
        self.request_id = request_id
        # 音频模型编码
        self.model = model
        # 类型
        self.capability_type = capability_type
        # 音频生成提示词
        self.prompt = prompt
        # 需要朗读的文本，仅支持该参数的模型使用
        self.text = text
        # 音频链接，REFERENCE_TO_AUDIO 时非空
        self.audio_urls = audio_urls
        # 图片链接，IMAGE_TO_AUDIO 时非空
        self.image_urls = image_urls
        # 扩展参数 JSON 字符串，内容按模型扩展参数对象组织
        self.ext_params = ext_params

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.model, 'model')
        self.validate_required(self.capability_type, 'capability_type')
        self.validate_required(self.prompt, 'prompt')

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
        if self.model is not None:
            result['model'] = self.model
        if self.capability_type is not None:
            result['capability_type'] = self.capability_type
        if self.prompt is not None:
            result['prompt'] = self.prompt
        if self.text is not None:
            result['text'] = self.text
        if self.audio_urls is not None:
            result['audio_urls'] = self.audio_urls
        if self.image_urls is not None:
            result['image_urls'] = self.image_urls
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('capability_type') is not None:
            self.capability_type = m.get('capability_type')
        if m.get('prompt') is not None:
            self.prompt = m.get('prompt')
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('audio_urls') is not None:
            self.audio_urls = m.get('audio_urls')
        if m.get('image_urls') is not None:
            self.image_urls = m.get('image_urls')
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        return self


class PushMaasAudioResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        status: str = None,
        model: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 音频任务 ID
        self.task_id = task_id
        # 任务状态
        self.status = status
        # 实际使用的模型
        self.model = model

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.model is not None:
            result['model'] = self.model
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('model') is not None:
            self.model = m.get('model')
        return self


class QueryMaasAudioRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 音频任务 ID
        self.task_id = task_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryMaasAudioResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        status: str = None,
        model: str = None,
        created_at: str = None,
        content: List[AudioList] = None,
        usage: List[AudioUsage] = None,
        extra_info: str = None,
        error: Error = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 音频任务 ID
        self.task_id = task_id
        # 任务状态
        self.status = status
        # 实际使用的模型
        self.model = model
        # 创建时间，Unix 秒级时间戳
        self.created_at = created_at
        # 音频信息
        self.content = content
        # 用量
        self.usage = usage
        # 非标准化补充信息，JSON 字符串
        self.extra_info = extra_info
        # 失败时返回
        self.error = error

    def validate(self):
        if self.content:
            for k in self.content:
                if k:
                    k.validate()
        if self.usage:
            for k in self.usage:
                if k:
                    k.validate()
        if self.error:
            self.error.validate()

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.model is not None:
            result['model'] = self.model
        if self.created_at is not None:
            result['created_at'] = self.created_at
        result['content'] = []
        if self.content is not None:
            for k in self.content:
                result['content'].append(k.to_map() if k else None)
        result['usage'] = []
        if self.usage is not None:
            for k in self.usage:
                result['usage'].append(k.to_map() if k else None)
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.error is not None:
            result['error'] = self.error.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('created_at') is not None:
            self.created_at = m.get('created_at')
        self.content = []
        if m.get('content') is not None:
            for k in m.get('content'):
                temp_model = AudioList()
                self.content.append(temp_model.from_map(k))
        self.usage = []
        if m.get('usage') is not None:
            for k in m.get('usage'):
                temp_model = AudioUsage()
                self.usage.append(temp_model.from_map(k))
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('error') is not None:
            temp_model = Error()
            self.error = temp_model.from_map(m['error'])
        return self


class ExecMaasChatsyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        model: str = None,
        messages: List[ChatMessages] = None,
        ext_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 幂等标识，由客户端生成
        self.request_id = request_id
        # 文本模型编码
        self.model = model
        # 非空消息列表
        self.messages = messages
        # 模型参数 JSON 字符串
        self.ext_params = ext_params

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.model, 'model')
        self.validate_required(self.messages, 'messages')
        if self.messages:
            for k in self.messages:
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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.model is not None:
            result['model'] = self.model
        result['messages'] = []
        if self.messages is not None:
            for k in self.messages:
                result['messages'].append(k.to_map() if k else None)
        if self.ext_params is not None:
            result['ext_params'] = self.ext_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('model') is not None:
            self.model = m.get('model')
        self.messages = []
        if m.get('messages') is not None:
            for k in m.get('messages'):
                temp_model = ChatMessages()
                self.messages.append(temp_model.from_map(k))
        if m.get('ext_params') is not None:
            self.ext_params = m.get('ext_params')
        return self


class ExecMaasChatsyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: str = None,
        model: str = None,
        content: str = None,
        finish_reason: str = None,
        usage: ChatUsage = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 本次模型调用 ID
        self.id = id
        # 实际使用的模型
        self.model = model
        # 完整文本
        self.content = content
        # 结束原因
        self.finish_reason = finish_reason
        # 用量
        self.usage = usage

    def validate(self):
        if self.usage:
            self.usage.validate()

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
        if self.id is not None:
            result['id'] = self.id
        if self.model is not None:
            result['model'] = self.model
        if self.content is not None:
            result['content'] = self.content
        if self.finish_reason is not None:
            result['finish_reason'] = self.finish_reason
        if self.usage is not None:
            result['usage'] = self.usage.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('finish_reason') is not None:
            self.finish_reason = m.get('finish_reason')
        if m.get('usage') is not None:
            temp_model = ChatUsage()
            self.usage = temp_model.from_map(m['usage'])
        return self


class ExecMaasPriceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        model_name: str = None,
        request_dimensions: str = None,
        request_metrics: str = None,
        units: List[PriceUnits] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模型名称
        self.model_name = model_name
        # 请求级定价维度
        self.request_dimensions = request_dimensions
        # 请求级计量指标
        self.request_metrics = request_metrics
        # 输出单元列表
        self.units = units

    def validate(self):
        self.validate_required(self.model_name, 'model_name')
        if self.units:
            for k in self.units:
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
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.request_dimensions is not None:
            result['request_dimensions'] = self.request_dimensions
        if self.request_metrics is not None:
            result['request_metrics'] = self.request_metrics
        result['units'] = []
        if self.units is not None:
            for k in self.units:
                result['units'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('request_dimensions') is not None:
            self.request_dimensions = m.get('request_dimensions')
        if m.get('request_metrics') is not None:
            self.request_metrics = m.get('request_metrics')
        self.units = []
        if m.get('units') is not None:
            for k in m.get('units'):
                temp_model = PriceUnits()
                self.units.append(temp_model.from_map(k))
        return self


class ExecMaasPriceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        matched: bool = None,
        fallback: bool = None,
        price_rule_code: str = None,
        matched_rule_version: int = None,
        rule_name: str = None,
        priority: int = None,
        request_items: List[RequestItems] = None,
        unit_estimates: List[UnitEstimates] = None,
        total_amount: str = None,
        currency: str = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 至少一个输出单元命中
        self.matched = matched
        # 首个输出单元是否命中兜底规则
        self.fallback = fallback
        # 命中规则编码
        self.price_rule_code = price_rule_code
        # 规则版本
        self.matched_rule_version = matched_rule_version
        # 规则名称
        self.rule_name = rule_name
        # 规则优先级
        self.priority = priority
        # 只计一次的请求级费用明细
        self.request_items = request_items
        # 各输出单元的试算明细
        self.unit_estimates = unit_estimates
        # 试算总金额
        self.total_amount = total_amount
        # 币种
        self.currency = currency
        # 未命中或部分命中时的提示
        self.message = message

    def validate(self):
        if self.request_items:
            for k in self.request_items:
                if k:
                    k.validate()
        if self.unit_estimates:
            for k in self.unit_estimates:
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
        if self.matched is not None:
            result['matched'] = self.matched
        if self.fallback is not None:
            result['fallback'] = self.fallback
        if self.price_rule_code is not None:
            result['price_rule_code'] = self.price_rule_code
        if self.matched_rule_version is not None:
            result['matched_rule_version'] = self.matched_rule_version
        if self.rule_name is not None:
            result['rule_name'] = self.rule_name
        if self.priority is not None:
            result['priority'] = self.priority
        result['request_items'] = []
        if self.request_items is not None:
            for k in self.request_items:
                result['request_items'].append(k.to_map() if k else None)
        result['unit_estimates'] = []
        if self.unit_estimates is not None:
            for k in self.unit_estimates:
                result['unit_estimates'].append(k.to_map() if k else None)
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.currency is not None:
            result['currency'] = self.currency
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
        if m.get('matched') is not None:
            self.matched = m.get('matched')
        if m.get('fallback') is not None:
            self.fallback = m.get('fallback')
        if m.get('price_rule_code') is not None:
            self.price_rule_code = m.get('price_rule_code')
        if m.get('matched_rule_version') is not None:
            self.matched_rule_version = m.get('matched_rule_version')
        if m.get('rule_name') is not None:
            self.rule_name = m.get('rule_name')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        self.request_items = []
        if m.get('request_items') is not None:
            for k in m.get('request_items'):
                temp_model = RequestItems()
                self.request_items.append(temp_model.from_map(k))
        self.unit_estimates = []
        if m.get('unit_estimates') is not None:
            for k in m.get('unit_estimates'):
                temp_model = UnitEstimates()
                self.unit_estimates.append(temp_model.from_map(k))
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


