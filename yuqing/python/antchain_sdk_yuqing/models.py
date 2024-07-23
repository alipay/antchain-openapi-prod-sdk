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


class Link(TeaModel):
    def __init__(
        self,
        text: str = None,
        title: str = None,
        pic_url: str = None,
        message_url: str = None,
    ):
        # 文字
        self.text = text
        # 标题
        self.title = title
        # 图片地址
        self.pic_url = pic_url
        # 链接
        self.message_url = message_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.text is not None:
            result['text'] = self.text
        if self.title is not None:
            result['title'] = self.title
        if self.pic_url is not None:
            result['pic_url'] = self.pic_url
        if self.message_url is not None:
            result['message_url'] = self.message_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('pic_url') is not None:
            self.pic_url = m.get('pic_url')
        if m.get('message_url') is not None:
            self.message_url = m.get('message_url')
        return self


class Btn(TeaModel):
    def __init__(
        self,
        title: str = None,
        action_url: str = None,
    ):
        # 标题
        self.title = title
        # 动作地址
        self.action_url = action_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.action_url is not None:
            result['action_url'] = self.action_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('action_url') is not None:
            self.action_url = m.get('action_url')
        return self


class YuqingMessageExtInfo(TeaModel):
    def __init__(
        self,
        media_area_country: str = None,
        media_area_province: str = None,
        media_area_city: str = None,
        general_model: str = None,
    ):
        # 媒体地域
        self.media_area_country = media_area_country
        # 媒体地域省份
        self.media_area_province = media_area_province
        # 媒体地域-市
        self.media_area_city = media_area_city
        # 内容风险
        self.general_model = general_model

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.media_area_country is not None:
            result['media_area_country'] = self.media_area_country
        if self.media_area_province is not None:
            result['media_area_province'] = self.media_area_province
        if self.media_area_city is not None:
            result['media_area_city'] = self.media_area_city
        if self.general_model is not None:
            result['general_model'] = self.general_model
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('media_area_country') is not None:
            self.media_area_country = m.get('media_area_country')
        if m.get('media_area_province') is not None:
            self.media_area_province = m.get('media_area_province')
        if m.get('media_area_city') is not None:
            self.media_area_city = m.get('media_area_city')
        if m.get('general_model') is not None:
            self.general_model = m.get('general_model')
        return self


class Pair(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class HotspotMessage(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        total_exist_timestamp: int = None,
        last_exist_date_format: str = None,
        crawler_time_fmt: str = None,
        first_exist_date_format: str = None,
        max_rank_total_timestamp: int = None,
        followers_count: int = None,
        max_rank: int = None,
        reads_count: int = None,
        comments_count: int = None,
        doc_title: str = None,
        first_rank: int = None,
        original_count: int = None,
        presenter_name: str = None,
        rank: int = None,
        media_type: str = None,
        doc_id: str = None,
        type: str = None,
        hot_value: int = None,
        doc_content: str = None,
        screen_name: str = None,
        media_sub_type: str = None,
        discusses_count: int = None,
        category: str = None,
        video_count: int = None,
        max_rank_total_time_format: str = None,
        province: str = None,
        total_exist_time_format: str = None,
        first_top_exist_timestamp: int = None,
        doc_url: str = None,
        max_hot_value: int = None,
        city: str = None,
        last_exist_timestamp: int = None,
        first_top_exist_date_format: str = None,
        last_rank: int = None,
        first_hot_value: int = None,
        hotspot_type: str = None,
        first_xxist_timestamp: int = None,
        first_exist_timestamp: int = None,
    ):
        # 热搜/热榜/话题 对应用户id (可能为空)
        self.user_id = user_id
        # 在榜总时间
        self.total_exist_timestamp = total_exist_timestamp
        # 下榜时间
        self.last_exist_date_format = last_exist_date_format
        # 爬虫爬取的时间
        self.crawler_time_fmt = crawler_time_fmt
        # 第一次上榜的格式化时间
        self.first_exist_date_format = first_exist_date_format
        # 最高排名的总时长
        self.max_rank_total_timestamp = max_rank_total_timestamp
        # 跟随量
        self.followers_count = followers_count
        # 在榜单中的最高排名
        self.max_rank = max_rank
        # 阅读量
        self.reads_count = reads_count
        # 评论数
        self.comments_count = comments_count
        # 标题，例如话题的标题就是话题本身
        self.doc_title = doc_title
        # 首次上榜排名
        self.first_rank = first_rank
        # 原创人数
        self.original_count = original_count
        # 主持人
        self.presenter_name = presenter_name
        # 热搜在热搜榜的位置
        self.rank = rank
        # 热点媒体类型
        self.media_type = media_type
        # 文档id
        self.doc_id = doc_id
        # 类型
        self.type = type
        # 热度值
        self.hot_value = hot_value
        # 内容，热榜数据中存在着文章，热文就是有内容的
        self.doc_content = doc_content
        # 热搜/热榜/话题 对应用户名称 (可能为空)
        self.screen_name = screen_name
        # 热点媒体子类型
        self.media_sub_type = media_sub_type
        # 讨论量
        self.discusses_count = discusses_count
        # 分类
        self.category = category
        # 视频量
        self.video_count = video_count
        # 最高排名的格式化总时长
        self.max_rank_total_time_format = max_rank_total_time_format
        # 省
        self.province = province
        # 在榜格式化的总时间
        self.total_exist_time_format = total_exist_time_format
        # 第一次上最高排名的时间
        self.first_top_exist_timestamp = first_top_exist_timestamp
        # 链接地址
        self.doc_url = doc_url
        # 最大的热度值
        self.max_hot_value = max_hot_value
        # 市
        self.city = city
        # 最后一次上榜的时间
        self.last_exist_timestamp = last_exist_timestamp
        # 第一次上最高排名的时间
        self.first_top_exist_date_format = first_top_exist_date_format
        # 下榜排名
        self.last_rank = last_rank
        # 首次上榜热度
        self.first_hot_value = first_hot_value
        # 热搜类型
        self.hotspot_type = hotspot_type
        # 第一次上榜的时间
        self.first_xxist_timestamp = first_xxist_timestamp
        # 第一次上榜时间
        self.first_exist_timestamp = first_exist_timestamp

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.total_exist_timestamp, 'total_exist_timestamp')
        self.validate_required(self.last_exist_date_format, 'last_exist_date_format')
        self.validate_required(self.crawler_time_fmt, 'crawler_time_fmt')
        self.validate_required(self.first_exist_date_format, 'first_exist_date_format')
        self.validate_required(self.max_rank_total_timestamp, 'max_rank_total_timestamp')
        self.validate_required(self.followers_count, 'followers_count')
        self.validate_required(self.max_rank, 'max_rank')
        self.validate_required(self.reads_count, 'reads_count')
        self.validate_required(self.comments_count, 'comments_count')
        self.validate_required(self.doc_title, 'doc_title')
        self.validate_required(self.first_rank, 'first_rank')
        self.validate_required(self.original_count, 'original_count')
        self.validate_required(self.presenter_name, 'presenter_name')
        self.validate_required(self.rank, 'rank')
        self.validate_required(self.media_type, 'media_type')
        self.validate_required(self.doc_id, 'doc_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.hot_value, 'hot_value')
        self.validate_required(self.doc_content, 'doc_content')
        self.validate_required(self.screen_name, 'screen_name')
        self.validate_required(self.media_sub_type, 'media_sub_type')
        self.validate_required(self.discusses_count, 'discusses_count')
        self.validate_required(self.category, 'category')
        self.validate_required(self.video_count, 'video_count')
        self.validate_required(self.max_rank_total_time_format, 'max_rank_total_time_format')
        self.validate_required(self.province, 'province')
        self.validate_required(self.total_exist_time_format, 'total_exist_time_format')
        self.validate_required(self.first_top_exist_timestamp, 'first_top_exist_timestamp')
        self.validate_required(self.max_hot_value, 'max_hot_value')
        self.validate_required(self.city, 'city')
        self.validate_required(self.last_exist_timestamp, 'last_exist_timestamp')
        self.validate_required(self.first_top_exist_date_format, 'first_top_exist_date_format')
        self.validate_required(self.last_rank, 'last_rank')
        self.validate_required(self.first_hot_value, 'first_hot_value')
        self.validate_required(self.hotspot_type, 'hotspot_type')
        self.validate_required(self.first_xxist_timestamp, 'first_xxist_timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.total_exist_timestamp is not None:
            result['total_exist_timestamp'] = self.total_exist_timestamp
        if self.last_exist_date_format is not None:
            result['last_exist_date_format'] = self.last_exist_date_format
        if self.crawler_time_fmt is not None:
            result['crawler_time_fmt'] = self.crawler_time_fmt
        if self.first_exist_date_format is not None:
            result['first_exist_date_format'] = self.first_exist_date_format
        if self.max_rank_total_timestamp is not None:
            result['max_rank_total_timestamp'] = self.max_rank_total_timestamp
        if self.followers_count is not None:
            result['followers_count'] = self.followers_count
        if self.max_rank is not None:
            result['max_rank'] = self.max_rank
        if self.reads_count is not None:
            result['reads_count'] = self.reads_count
        if self.comments_count is not None:
            result['comments_count'] = self.comments_count
        if self.doc_title is not None:
            result['doc_title'] = self.doc_title
        if self.first_rank is not None:
            result['first_rank'] = self.first_rank
        if self.original_count is not None:
            result['original_count'] = self.original_count
        if self.presenter_name is not None:
            result['presenter_name'] = self.presenter_name
        if self.rank is not None:
            result['rank'] = self.rank
        if self.media_type is not None:
            result['media_type'] = self.media_type
        if self.doc_id is not None:
            result['doc_id'] = self.doc_id
        if self.type is not None:
            result['type'] = self.type
        if self.hot_value is not None:
            result['hot_value'] = self.hot_value
        if self.doc_content is not None:
            result['doc_content'] = self.doc_content
        if self.screen_name is not None:
            result['screen_name'] = self.screen_name
        if self.media_sub_type is not None:
            result['media_sub_type'] = self.media_sub_type
        if self.discusses_count is not None:
            result['discusses_count'] = self.discusses_count
        if self.category is not None:
            result['category'] = self.category
        if self.video_count is not None:
            result['video_count'] = self.video_count
        if self.max_rank_total_time_format is not None:
            result['max_rank_total_time_format'] = self.max_rank_total_time_format
        if self.province is not None:
            result['province'] = self.province
        if self.total_exist_time_format is not None:
            result['total_exist_time_format'] = self.total_exist_time_format
        if self.first_top_exist_timestamp is not None:
            result['first_top_exist_timestamp'] = self.first_top_exist_timestamp
        if self.doc_url is not None:
            result['doc_url'] = self.doc_url
        if self.max_hot_value is not None:
            result['max_hot_value'] = self.max_hot_value
        if self.city is not None:
            result['city'] = self.city
        if self.last_exist_timestamp is not None:
            result['last_exist_timestamp'] = self.last_exist_timestamp
        if self.first_top_exist_date_format is not None:
            result['first_top_exist_date_format'] = self.first_top_exist_date_format
        if self.last_rank is not None:
            result['last_rank'] = self.last_rank
        if self.first_hot_value is not None:
            result['first_hot_value'] = self.first_hot_value
        if self.hotspot_type is not None:
            result['hotspot_type'] = self.hotspot_type
        if self.first_xxist_timestamp is not None:
            result['first_xxist_timestamp'] = self.first_xxist_timestamp
        if self.first_exist_timestamp is not None:
            result['first_exist_timestamp'] = self.first_exist_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('total_exist_timestamp') is not None:
            self.total_exist_timestamp = m.get('total_exist_timestamp')
        if m.get('last_exist_date_format') is not None:
            self.last_exist_date_format = m.get('last_exist_date_format')
        if m.get('crawler_time_fmt') is not None:
            self.crawler_time_fmt = m.get('crawler_time_fmt')
        if m.get('first_exist_date_format') is not None:
            self.first_exist_date_format = m.get('first_exist_date_format')
        if m.get('max_rank_total_timestamp') is not None:
            self.max_rank_total_timestamp = m.get('max_rank_total_timestamp')
        if m.get('followers_count') is not None:
            self.followers_count = m.get('followers_count')
        if m.get('max_rank') is not None:
            self.max_rank = m.get('max_rank')
        if m.get('reads_count') is not None:
            self.reads_count = m.get('reads_count')
        if m.get('comments_count') is not None:
            self.comments_count = m.get('comments_count')
        if m.get('doc_title') is not None:
            self.doc_title = m.get('doc_title')
        if m.get('first_rank') is not None:
            self.first_rank = m.get('first_rank')
        if m.get('original_count') is not None:
            self.original_count = m.get('original_count')
        if m.get('presenter_name') is not None:
            self.presenter_name = m.get('presenter_name')
        if m.get('rank') is not None:
            self.rank = m.get('rank')
        if m.get('media_type') is not None:
            self.media_type = m.get('media_type')
        if m.get('doc_id') is not None:
            self.doc_id = m.get('doc_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('hot_value') is not None:
            self.hot_value = m.get('hot_value')
        if m.get('doc_content') is not None:
            self.doc_content = m.get('doc_content')
        if m.get('screen_name') is not None:
            self.screen_name = m.get('screen_name')
        if m.get('media_sub_type') is not None:
            self.media_sub_type = m.get('media_sub_type')
        if m.get('discusses_count') is not None:
            self.discusses_count = m.get('discusses_count')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('video_count') is not None:
            self.video_count = m.get('video_count')
        if m.get('max_rank_total_time_format') is not None:
            self.max_rank_total_time_format = m.get('max_rank_total_time_format')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('total_exist_time_format') is not None:
            self.total_exist_time_format = m.get('total_exist_time_format')
        if m.get('first_top_exist_timestamp') is not None:
            self.first_top_exist_timestamp = m.get('first_top_exist_timestamp')
        if m.get('doc_url') is not None:
            self.doc_url = m.get('doc_url')
        if m.get('max_hot_value') is not None:
            self.max_hot_value = m.get('max_hot_value')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('last_exist_timestamp') is not None:
            self.last_exist_timestamp = m.get('last_exist_timestamp')
        if m.get('first_top_exist_date_format') is not None:
            self.first_top_exist_date_format = m.get('first_top_exist_date_format')
        if m.get('last_rank') is not None:
            self.last_rank = m.get('last_rank')
        if m.get('first_hot_value') is not None:
            self.first_hot_value = m.get('first_hot_value')
        if m.get('hotspot_type') is not None:
            self.hotspot_type = m.get('hotspot_type')
        if m.get('first_xxist_timestamp') is not None:
            self.first_xxist_timestamp = m.get('first_xxist_timestamp')
        if m.get('first_exist_timestamp') is not None:
            self.first_exist_timestamp = m.get('first_exist_timestamp')
        return self


class Markdown(TeaModel):
    def __init__(
        self,
        title: str = None,
        text: str = None,
    ):
        # 标题
        self.title = title
        # 内容
        self.text = text

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.text is not None:
            result['text'] = self.text
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('text') is not None:
            self.text = m.get('text')
        return self


class At(TeaModel):
    def __init__(
        self,
        at_mobiles: List[str] = None,
        at_user_ids: List[str] = None,
        is_at_all: bool = None,
    ):
        # @手机号
        self.at_mobiles = at_mobiles
        # @用户ID
        self.at_user_ids = at_user_ids
        # @所有人
        self.is_at_all = is_at_all

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.at_mobiles is not None:
            result['at_mobiles'] = self.at_mobiles
        if self.at_user_ids is not None:
            result['at_user_ids'] = self.at_user_ids
        if self.is_at_all is not None:
            result['is_at_all'] = self.is_at_all
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('at_mobiles') is not None:
            self.at_mobiles = m.get('at_mobiles')
        if m.get('at_user_ids') is not None:
            self.at_user_ids = m.get('at_user_ids')
        if m.get('is_at_all') is not None:
            self.is_at_all = m.get('is_at_all')
        return self


class YuqingMessage(TeaModel):
    def __init__(
        self,
        author_avatar_url: str = None,
        author_followers_count: int = None,
        author_friends_count: int = None,
        author_id: str = None,
        author_name: str = None,
        author_statuses_count: int = None,
        author_verify_type: str = None,
        create_time: int = None,
        doc_content: str = None,
        doc_content_brief: str = None,
        doc_content_sign: str = None,
        doc_id: str = None,
        doc_self_content_sign: str = None,
        doc_title: str = None,
        doc_url: str = None,
        emotion_type: int = None,
        highlight_keywords: List[str] = None,
        media_type: str = None,
        message_type: str = None,
        parent_doc_id: str = None,
        publish_time: int = None,
        relevance_score: str = None,
        similar_number: int = None,
        weibo_comment_id: str = None,
        weibo_mid: str = None,
        propagation_score: str = None,
        emotion_score: str = None,
        influence_score: str = None,
        doc_areas: List[str] = None,
        media_name: str = None,
        ext_info: YuqingMessageExtInfo = None,
        doc_reprint_name: str = None,
        content_video_urls: str = None,
        content_image_urls: str = None,
        content_image_text: str = None,
        content_audio_urls: str = None,
        content_audio_text: str = None,
        content_video_text: str = None,
        doc_reposts_count: int = None,
        doc_comments_count: int = None,
        doc_likes_count: int = None,
        doc_reads_count: int = None,
        doc_answers_count: int = None,
    ):
        # 作者头像地址
        self.author_avatar_url = author_avatar_url
        # 粉丝数
        self.author_followers_count = author_followers_count
        # 好友数
        self.author_friends_count = author_friends_count
        # 作者id
        self.author_id = author_id
        # 作者名称
        self.author_name = author_name
        # 发文数
        self.author_statuses_count = author_statuses_count
        # 作者认证类型
        self.author_verify_type = author_verify_type
        # 舆情文章被抓取的时间戳
        self.create_time = create_time
        # 文章正文内容
        self.doc_content = doc_content
        # 文章摘要
        self.doc_content_brief = doc_content_brief
        # 文章内容签名，如果是转发微博或者其他有父内容的doc，计算的是父文章的得分。一般用于去重，相同的doc_content_sign说明内容相同
        self.doc_content_sign = doc_content_sign
        # 文章唯一docId
        self.doc_id = doc_id
        # 文章自身的内容签名，转发微博计算的是转发内容的contentSign，与父微博无关
        self.doc_self_content_sign = doc_self_content_sign
        # 文章标题
        self.doc_title = doc_title
        # 原文地址
        self.doc_url = doc_url
        # 情感的正负面，-1代表负面，1代表非负面
        self.emotion_type = emotion_type
        # 命中的搜索词列表
        self.highlight_keywords = highlight_keywords
        # 媒体类型，枚举值
        self.media_type = media_type
        # 舆情消息类型:转发,评论/回复, 原文,群聊等
        self.message_type = message_type
        # 文章的父docId，如被转发的文章docId
        self.parent_doc_id = parent_doc_id
        # 舆情文章的发布时间戳
        self.publish_time = publish_time
        # 相关性得分
        self.relevance_score = relevance_score
        # 相似文章数
        self.similar_number = similar_number
        # 微博评论id
        self.weibo_comment_id = weibo_comment_id
        # 微博消息id
        self.weibo_mid = weibo_mid
        # 传播得分，0-10
        self.propagation_score = propagation_score
        # 情感得分
        self.emotion_score = emotion_score
        # 影响力得分
        self.influence_score = influence_score
        # 提级地域列表
        self.doc_areas = doc_areas
        # 媒体名称
        self.media_name = media_name
        # 扩展信息
        self.ext_info = ext_info
        # 文章转载自
        self.doc_reprint_name = doc_reprint_name
        # 视频列表地址
        self.content_video_urls = content_video_urls
        # 图片列表地址
        self.content_image_urls = content_image_urls
        # 图片识别出来的文本
        self.content_image_text = content_image_text
        # 音频列表地址
        self.content_audio_urls = content_audio_urls
        # 音频识别出来的文本
        self.content_audio_text = content_audio_text
        # 视频识别出来的文本
        self.content_video_text = content_video_text
        # 文章转发数
        self.doc_reposts_count = doc_reposts_count
        # 文章评论数
        self.doc_comments_count = doc_comments_count
        # 文章点赞数
        self.doc_likes_count = doc_likes_count
        # 文章阅读数
        self.doc_reads_count = doc_reads_count
        # 回答数
        self.doc_answers_count = doc_answers_count

    def validate(self):
        if self.ext_info:
            self.ext_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.author_avatar_url is not None:
            result['author_avatar_url'] = self.author_avatar_url
        if self.author_followers_count is not None:
            result['author_followers_count'] = self.author_followers_count
        if self.author_friends_count is not None:
            result['author_friends_count'] = self.author_friends_count
        if self.author_id is not None:
            result['author_id'] = self.author_id
        if self.author_name is not None:
            result['author_name'] = self.author_name
        if self.author_statuses_count is not None:
            result['author_statuses_count'] = self.author_statuses_count
        if self.author_verify_type is not None:
            result['author_verify_type'] = self.author_verify_type
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.doc_content is not None:
            result['doc_content'] = self.doc_content
        if self.doc_content_brief is not None:
            result['doc_content_brief'] = self.doc_content_brief
        if self.doc_content_sign is not None:
            result['doc_content_sign'] = self.doc_content_sign
        if self.doc_id is not None:
            result['doc_id'] = self.doc_id
        if self.doc_self_content_sign is not None:
            result['doc_self_content_sign'] = self.doc_self_content_sign
        if self.doc_title is not None:
            result['doc_title'] = self.doc_title
        if self.doc_url is not None:
            result['doc_url'] = self.doc_url
        if self.emotion_type is not None:
            result['emotion_type'] = self.emotion_type
        if self.highlight_keywords is not None:
            result['highlight_keywords'] = self.highlight_keywords
        if self.media_type is not None:
            result['media_type'] = self.media_type
        if self.message_type is not None:
            result['message_type'] = self.message_type
        if self.parent_doc_id is not None:
            result['parent_doc_id'] = self.parent_doc_id
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.relevance_score is not None:
            result['relevance_score'] = self.relevance_score
        if self.similar_number is not None:
            result['similar_number'] = self.similar_number
        if self.weibo_comment_id is not None:
            result['weibo_comment_id'] = self.weibo_comment_id
        if self.weibo_mid is not None:
            result['weibo_mid'] = self.weibo_mid
        if self.propagation_score is not None:
            result['propagation_score'] = self.propagation_score
        if self.emotion_score is not None:
            result['emotion_score'] = self.emotion_score
        if self.influence_score is not None:
            result['influence_score'] = self.influence_score
        if self.doc_areas is not None:
            result['doc_areas'] = self.doc_areas
        if self.media_name is not None:
            result['media_name'] = self.media_name
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info.to_map()
        if self.doc_reprint_name is not None:
            result['doc_reprint_name'] = self.doc_reprint_name
        if self.content_video_urls is not None:
            result['content_video_urls'] = self.content_video_urls
        if self.content_image_urls is not None:
            result['content_image_urls'] = self.content_image_urls
        if self.content_image_text is not None:
            result['content_image_text'] = self.content_image_text
        if self.content_audio_urls is not None:
            result['content_audio_urls'] = self.content_audio_urls
        if self.content_audio_text is not None:
            result['content_audio_text'] = self.content_audio_text
        if self.content_video_text is not None:
            result['content_video_text'] = self.content_video_text
        if self.doc_reposts_count is not None:
            result['doc_reposts_count'] = self.doc_reposts_count
        if self.doc_comments_count is not None:
            result['doc_comments_count'] = self.doc_comments_count
        if self.doc_likes_count is not None:
            result['doc_likes_count'] = self.doc_likes_count
        if self.doc_reads_count is not None:
            result['doc_reads_count'] = self.doc_reads_count
        if self.doc_answers_count is not None:
            result['doc_answers_count'] = self.doc_answers_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('author_avatar_url') is not None:
            self.author_avatar_url = m.get('author_avatar_url')
        if m.get('author_followers_count') is not None:
            self.author_followers_count = m.get('author_followers_count')
        if m.get('author_friends_count') is not None:
            self.author_friends_count = m.get('author_friends_count')
        if m.get('author_id') is not None:
            self.author_id = m.get('author_id')
        if m.get('author_name') is not None:
            self.author_name = m.get('author_name')
        if m.get('author_statuses_count') is not None:
            self.author_statuses_count = m.get('author_statuses_count')
        if m.get('author_verify_type') is not None:
            self.author_verify_type = m.get('author_verify_type')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('doc_content') is not None:
            self.doc_content = m.get('doc_content')
        if m.get('doc_content_brief') is not None:
            self.doc_content_brief = m.get('doc_content_brief')
        if m.get('doc_content_sign') is not None:
            self.doc_content_sign = m.get('doc_content_sign')
        if m.get('doc_id') is not None:
            self.doc_id = m.get('doc_id')
        if m.get('doc_self_content_sign') is not None:
            self.doc_self_content_sign = m.get('doc_self_content_sign')
        if m.get('doc_title') is not None:
            self.doc_title = m.get('doc_title')
        if m.get('doc_url') is not None:
            self.doc_url = m.get('doc_url')
        if m.get('emotion_type') is not None:
            self.emotion_type = m.get('emotion_type')
        if m.get('highlight_keywords') is not None:
            self.highlight_keywords = m.get('highlight_keywords')
        if m.get('media_type') is not None:
            self.media_type = m.get('media_type')
        if m.get('message_type') is not None:
            self.message_type = m.get('message_type')
        if m.get('parent_doc_id') is not None:
            self.parent_doc_id = m.get('parent_doc_id')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('relevance_score') is not None:
            self.relevance_score = m.get('relevance_score')
        if m.get('similar_number') is not None:
            self.similar_number = m.get('similar_number')
        if m.get('weibo_comment_id') is not None:
            self.weibo_comment_id = m.get('weibo_comment_id')
        if m.get('weibo_mid') is not None:
            self.weibo_mid = m.get('weibo_mid')
        if m.get('propagation_score') is not None:
            self.propagation_score = m.get('propagation_score')
        if m.get('emotion_score') is not None:
            self.emotion_score = m.get('emotion_score')
        if m.get('influence_score') is not None:
            self.influence_score = m.get('influence_score')
        if m.get('doc_areas') is not None:
            self.doc_areas = m.get('doc_areas')
        if m.get('media_name') is not None:
            self.media_name = m.get('media_name')
        if m.get('ext_info') is not None:
            temp_model = YuqingMessageExtInfo()
            self.ext_info = temp_model.from_map(m['ext_info'])
        if m.get('doc_reprint_name') is not None:
            self.doc_reprint_name = m.get('doc_reprint_name')
        if m.get('content_video_urls') is not None:
            self.content_video_urls = m.get('content_video_urls')
        if m.get('content_image_urls') is not None:
            self.content_image_urls = m.get('content_image_urls')
        if m.get('content_image_text') is not None:
            self.content_image_text = m.get('content_image_text')
        if m.get('content_audio_urls') is not None:
            self.content_audio_urls = m.get('content_audio_urls')
        if m.get('content_audio_text') is not None:
            self.content_audio_text = m.get('content_audio_text')
        if m.get('content_video_text') is not None:
            self.content_video_text = m.get('content_video_text')
        if m.get('doc_reposts_count') is not None:
            self.doc_reposts_count = m.get('doc_reposts_count')
        if m.get('doc_comments_count') is not None:
            self.doc_comments_count = m.get('doc_comments_count')
        if m.get('doc_likes_count') is not None:
            self.doc_likes_count = m.get('doc_likes_count')
        if m.get('doc_reads_count') is not None:
            self.doc_reads_count = m.get('doc_reads_count')
        if m.get('doc_answers_count') is not None:
            self.doc_answers_count = m.get('doc_answers_count')
        return self


class ActionCard(TeaModel):
    def __init__(
        self,
        title: str = None,
        text: str = None,
        btn_orientation: str = None,
        single_title: str = None,
        single_url: str = None,
        btns: List[Btn] = None,
    ):
        # 标题
        self.title = title
        # 内容
        self.text = text
        # btn_orientation
        self.btn_orientation = btn_orientation
        # 简单标题
        self.single_title = single_title
        # 简单地址
        self.single_url = single_url
        # 点击
        self.btns = btns

    def validate(self):
        if self.btns:
            for k in self.btns:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.text is not None:
            result['text'] = self.text
        if self.btn_orientation is not None:
            result['btn_orientation'] = self.btn_orientation
        if self.single_title is not None:
            result['single_title'] = self.single_title
        if self.single_url is not None:
            result['single_url'] = self.single_url
        result['btns'] = []
        if self.btns is not None:
            for k in self.btns:
                result['btns'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('btn_orientation') is not None:
            self.btn_orientation = m.get('btn_orientation')
        if m.get('single_title') is not None:
            self.single_title = m.get('single_title')
        if m.get('single_url') is not None:
            self.single_url = m.get('single_url')
        self.btns = []
        if m.get('btns') is not None:
            for k in m.get('btns'):
                temp_model = Btn()
                self.btns.append(temp_model.from_map(k))
        return self


class FeedCard(TeaModel):
    def __init__(
        self,
        links: List[Link] = None,
    ):
        # 卡片流
        self.links = links

    def validate(self):
        if self.links:
            for k in self.links:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['links'] = []
        if self.links is not None:
            for k in self.links:
                result['links'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.links = []
        if m.get('links') is not None:
            for k in m.get('links'):
                temp_model = Link()
                self.links.append(temp_model.from_map(k))
        return self


class Text(TeaModel):
    def __init__(
        self,
        content: str = None,
    ):
        # 内容
        self.content = content

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class FieldCondition(TeaModel):
    def __init__(
        self,
        field_name: str = None,
        nest_field_path: str = None,
        nest_field_value: List[int] = None,
        operate_type: str = None,
        value: str = None,
    ):
        # 字段名称
        self.field_name = field_name
        # 复杂查询下，嵌套子条件字段jsonPath
        self.nest_field_path = nest_field_path
        # 复杂查询下，嵌套子条件字段值
        self.nest_field_value = nest_field_value
        # 操作符
        self.operate_type = operate_type
        # 关键字
        self.value = value

    def validate(self):
        self.validate_required(self.field_name, 'field_name')
        self.validate_required(self.operate_type, 'operate_type')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.field_name is not None:
            result['field_name'] = self.field_name
        if self.nest_field_path is not None:
            result['nest_field_path'] = self.nest_field_path
        if self.nest_field_value is not None:
            result['nest_field_value'] = self.nest_field_value
        if self.operate_type is not None:
            result['operate_type'] = self.operate_type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('field_name') is not None:
            self.field_name = m.get('field_name')
        if m.get('nest_field_path') is not None:
            self.nest_field_path = m.get('nest_field_path')
        if m.get('nest_field_value') is not None:
            self.nest_field_value = m.get('nest_field_value')
        if m.get('operate_type') is not None:
            self.operate_type = m.get('operate_type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class DingTalkContent(TeaModel):
    def __init__(
        self,
        web_hook: str = None,
        msgtype: str = None,
        text: Text = None,
        link: Link = None,
        markdown: Markdown = None,
        action_card: ActionCard = None,
        feed_card: FeedCard = None,
        at: At = None,
    ):
        # webHook
        self.web_hook = web_hook
        # 消息类型
        self.msgtype = msgtype
        # 文字
        self.text = text
        # 链接
        self.link = link
        # markdown
        self.markdown = markdown
        # actionCard
        self.action_card = action_card
        # feedCard
        self.feed_card = feed_card
        # at
        self.at = at

    def validate(self):
        if self.text:
            self.text.validate()
        if self.link:
            self.link.validate()
        if self.markdown:
            self.markdown.validate()
        if self.action_card:
            self.action_card.validate()
        if self.feed_card:
            self.feed_card.validate()
        if self.at:
            self.at.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.web_hook is not None:
            result['web_hook'] = self.web_hook
        if self.msgtype is not None:
            result['msgtype'] = self.msgtype
        if self.text is not None:
            result['text'] = self.text.to_map()
        if self.link is not None:
            result['link'] = self.link.to_map()
        if self.markdown is not None:
            result['markdown'] = self.markdown.to_map()
        if self.action_card is not None:
            result['action_card'] = self.action_card.to_map()
        if self.feed_card is not None:
            result['feed_card'] = self.feed_card.to_map()
        if self.at is not None:
            result['at'] = self.at.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('web_hook') is not None:
            self.web_hook = m.get('web_hook')
        if m.get('msgtype') is not None:
            self.msgtype = m.get('msgtype')
        if m.get('text') is not None:
            temp_model = Text()
            self.text = temp_model.from_map(m['text'])
        if m.get('link') is not None:
            temp_model = Link()
            self.link = temp_model.from_map(m['link'])
        if m.get('markdown') is not None:
            temp_model = Markdown()
            self.markdown = temp_model.from_map(m['markdown'])
        if m.get('action_card') is not None:
            temp_model = ActionCard()
            self.action_card = temp_model.from_map(m['action_card'])
        if m.get('feed_card') is not None:
            temp_model = FeedCard()
            self.feed_card = temp_model.from_map(m['feed_card'])
        if m.get('at') is not None:
            temp_model = At()
            self.at = temp_model.from_map(m['at'])
        return self


class Alarm(TeaModel):
    def __init__(
        self,
        tags: List[str] = None,
        content: str = None,
        alarm_timestamp: int = None,
        project_id: int = None,
        modifier_name: str = None,
        title: str = None,
        id: int = None,
        author_name: str = None,
        alarm_rule_id: int = None,
        type: str = None,
        gmt_modified_timestamp: int = None,
        message: YuqingMessage = None,
        project_name: str = None,
        alarm_rule_name: str = None,
        alarm_level: str = None,
        doc_media_type: str = None,
        status: str = None,
    ):
        # 人工打的标签
        self.tags = tags
        # 预警内容摘要
        self.content = content
        # 预警时间戳
        self.alarm_timestamp = alarm_timestamp
        # 舆情项目id
        self.project_id = project_id
        # 修改人
        self.modifier_name = modifier_name
        # 消息标题
        self.title = title
        # 消息id
        self.id = id
        # 作者名称
        self.author_name = author_name
        # 预警规则id
        self.alarm_rule_id = alarm_rule_id
        # 预警规则类型
        self.type = type
        # 修改时间戳
        self.gmt_modified_timestamp = gmt_modified_timestamp
        # 完整消息
        self.message = message
        # project
        self.project_name = project_name
        # alarm_rule_name
        self.alarm_rule_name = alarm_rule_name
        # alarm_level
        self.alarm_level = alarm_level
        # doc_media_type
        self.doc_media_type = doc_media_type
        # status
        self.status = status

    def validate(self):
        if self.message:
            self.message.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tags is not None:
            result['tags'] = self.tags
        if self.content is not None:
            result['content'] = self.content
        if self.alarm_timestamp is not None:
            result['alarm_timestamp'] = self.alarm_timestamp
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.modifier_name is not None:
            result['modifier_name'] = self.modifier_name
        if self.title is not None:
            result['title'] = self.title
        if self.id is not None:
            result['id'] = self.id
        if self.author_name is not None:
            result['author_name'] = self.author_name
        if self.alarm_rule_id is not None:
            result['alarm_rule_id'] = self.alarm_rule_id
        if self.type is not None:
            result['type'] = self.type
        if self.gmt_modified_timestamp is not None:
            result['gmt_modified_timestamp'] = self.gmt_modified_timestamp
        if self.message is not None:
            result['message'] = self.message.to_map()
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.alarm_rule_name is not None:
            result['alarm_rule_name'] = self.alarm_rule_name
        if self.alarm_level is not None:
            result['alarm_level'] = self.alarm_level
        if self.doc_media_type is not None:
            result['doc_media_type'] = self.doc_media_type
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tags') is not None:
            self.tags = m.get('tags')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('alarm_timestamp') is not None:
            self.alarm_timestamp = m.get('alarm_timestamp')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('modifier_name') is not None:
            self.modifier_name = m.get('modifier_name')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('author_name') is not None:
            self.author_name = m.get('author_name')
        if m.get('alarm_rule_id') is not None:
            self.alarm_rule_id = m.get('alarm_rule_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('gmt_modified_timestamp') is not None:
            self.gmt_modified_timestamp = m.get('gmt_modified_timestamp')
        if m.get('message') is not None:
            temp_model = YuqingMessage()
            self.message = temp_model.from_map(m['message'])
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('alarm_rule_name') is not None:
            self.alarm_rule_name = m.get('alarm_rule_name')
        if m.get('alarm_level') is not None:
            self.alarm_level = m.get('alarm_level')
        if m.get('doc_media_type') is not None:
            self.doc_media_type = m.get('doc_media_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class AnalysisConfig(TeaModel):
    def __init__(
        self,
        doc_id: str = None,
        url: str = None,
        project_id: int = None,
        filter_id: int = None,
        pos_keyword_list: List[str] = None,
        publish_time_start: int = None,
        publish_time_end: int = None,
        url_list: List[str] = None,
    ):
        # 文章ID
        self.doc_id = doc_id
        # 文章URL
        self.url = url
        # 项目ID
        self.project_id = project_id
        # 模板ID
        self.filter_id = filter_id
        # 关键词列表
        self.pos_keyword_list = pos_keyword_list
        # 开始时间
        self.publish_time_start = publish_time_start
        # 结束时间
        self.publish_time_end = publish_time_end
        # URL列表
        self.url_list = url_list

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.doc_id is not None:
            result['doc_id'] = self.doc_id
        if self.url is not None:
            result['url'] = self.url
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.filter_id is not None:
            result['filter_id'] = self.filter_id
        if self.pos_keyword_list is not None:
            result['pos_keyword_list'] = self.pos_keyword_list
        if self.publish_time_start is not None:
            result['publish_time_start'] = self.publish_time_start
        if self.publish_time_end is not None:
            result['publish_time_end'] = self.publish_time_end
        if self.url_list is not None:
            result['url_list'] = self.url_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('doc_id') is not None:
            self.doc_id = m.get('doc_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('filter_id') is not None:
            self.filter_id = m.get('filter_id')
        if m.get('pos_keyword_list') is not None:
            self.pos_keyword_list = m.get('pos_keyword_list')
        if m.get('publish_time_start') is not None:
            self.publish_time_start = m.get('publish_time_start')
        if m.get('publish_time_end') is not None:
            self.publish_time_end = m.get('publish_time_end')
        if m.get('url_list') is not None:
            self.url_list = m.get('url_list')
        return self


class HotspotTask(TeaModel):
    def __init__(
        self,
        task_id: str = None,
        count: int = None,
        page_now: int = None,
        page_size: int = None,
        pages: List[HotspotMessage] = None,
    ):
        # 任务ID
        self.task_id = task_id
        # 数量
        self.count = count
        # 当前页
        self.page_now = page_now
        # 每页数量
        self.page_size = page_size
        # 数据
        self.pages = pages

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.count, 'count')
        self.validate_required(self.page_now, 'page_now')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.pages, 'pages')
        if self.pages:
            for k in self.pages:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.count is not None:
            result['count'] = self.count
        if self.page_now is not None:
            result['page_now'] = self.page_now
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['pages'] = []
        if self.pages is not None:
            for k in self.pages:
                result['pages'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('page_now') is not None:
            self.page_now = m.get('page_now')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.pages = []
        if m.get('pages') is not None:
            for k in m.get('pages'):
                temp_model = HotspotMessage()
                self.pages.append(temp_model.from_map(k))
        return self


class SearchCondition(TeaModel):
    def __init__(
        self,
        ass_keyword_list: List[str] = None,
        at_author_name_list: List[str] = None,
        author_name_list: List[str] = None,
        comments_level: int = None,
        content_len_level: str = None,
        create_time_end: int = None,
        create_time_start: int = None,
        doc_content_sign: str = None,
        doc_id_list: List[str] = None,
        duplicate_removal: bool = None,
        emotion_type: int = None,
        enable_keyword_highlight: bool = None,
        exclude_at_author_name_list: List[str] = None,
        exclude_author_name_list: List[str] = None,
        exclude_host_name_list: List[str] = None,
        exclude_keyword_tag_ids: List[int] = None,
        exclude_keyword_list: List[str] = None,
        exclude_keyword_list_in_title: List[str] = None,
        exclude_media_library_id_list: List[int] = None,
        exclude_media_name_list: List[str] = None,
        exclude_media_type_list: List[str] = None,
        exclude_message_type_list: List[str] = None,
        has_image: bool = None,
        has_video: bool = None,
        host_name_list: List[str] = None,
        keyword_tag_ids: List[int] = None,
        likes_level: int = None,
        media_library_id_list: List[int] = None,
        media_name_list: List[str] = None,
        media_type_list: List[str] = None,
        message_type_list: List[str] = None,
        page_now: int = None,
        page_size: int = None,
        parent_doc_id: str = None,
        pos_keyword_list: List[str] = None,
        pos_keyword_list_in_title: List[str] = None,
        publish_time_end: int = None,
        publish_time_start: int = None,
        reads_level: int = None,
        relevance_level: int = None,
        repost_level: int = None,
        sort_by: str = None,
        sort_by_direction: str = None,
        topic_list: List[str] = None,
        update_time_end: int = None,
        update_time_start: int = None,
        field_conditions: List[FieldCondition] = None,
        project_id: str = None,
    ):
        # 搭配词
        self.ass_keyword_list = ass_keyword_list
        # 被@的用户名称
        self.at_author_name_list = at_author_name_list
        # 作者名称
        self.author_name_list = author_name_list
        # 评论级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+\
        self.comments_level = comments_level
        # 内容长度级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+\
        self.content_len_level = content_len_level
        # 抓取截止时间
        self.create_time_end = create_time_end
        # 抓取起始时间
        self.create_time_start = create_time_start
        # 文章签名
        self.doc_content_sign = doc_content_sign
        # 舆情文章唯一docId
        self.doc_id_list = doc_id_list
        # 是否去重
        self.duplicate_removal = duplicate_removal
        # 情感类型，1非负，-1负面
        self.emotion_type = emotion_type
        # 是否高亮关键词
        self.enable_keyword_highlight = enable_keyword_highlight
        # 排除被@的用户名称
        self.exclude_at_author_name_list = exclude_at_author_name_list
        # 排除作者名称
        self.exclude_author_name_list = exclude_author_name_list
        # 排除网站域名
        self.exclude_host_name_list = exclude_host_name_list
        # 排除关键词标签Id列表
        self.exclude_keyword_tag_ids = exclude_keyword_tag_ids
        # 排除词
        self.exclude_keyword_list = exclude_keyword_list
        # 标题排除词
        self.exclude_keyword_list_in_title = exclude_keyword_list_in_title
        # 排除媒体库id列表
        self.exclude_media_library_id_list = exclude_media_library_id_list
        # 排除媒体名称
        self.exclude_media_name_list = exclude_media_name_list
        # 排除媒体类型，枚举值
        self.exclude_media_type_list = exclude_media_type_list
        # 排除消息类型，枚举值
        self.exclude_message_type_list = exclude_message_type_list
        # 文章是否含有图片
        self.has_image = has_image
        # 是否含有视频
        self.has_video = has_video
        # 网站域名
        self.host_name_list = host_name_list
        # 关键词标签Id列表
        self.keyword_tag_ids = keyword_tag_ids
        # 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+\
        self.likes_level = likes_level
        # 媒体库id列表
        self.media_library_id_list = media_library_id_list
        # 媒体名称
        self.media_name_list = media_name_list
        # 体类型，枚举值
        self.media_type_list = media_type_list
        # 消息类型，枚举值
        self.message_type_list = message_type_list
        # 当前页
        self.page_now = page_now
        # 页大小
        self.page_size = page_size
        # 舆情父文章的docId，一般用于查看某篇文章的评论
        self.parent_doc_id = parent_doc_id
        # 关键词
        self.pos_keyword_list = pos_keyword_list
        # 标题关键词
        self.pos_keyword_list_in_title = pos_keyword_list_in_title
        # 截止发布时间
        self.publish_time_end = publish_time_end
        # 起始发布时间
        self.publish_time_start = publish_time_start
        # 阅读级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+\
        self.reads_level = reads_level
        # 相关性等级，1：低，2：中，3：高，4：低级别以上
        self.relevance_level = relevance_level
        # 转发级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+\
        self.repost_level = repost_level
        # 排序字段
        self.sort_by = sort_by
        # 指定正反向排序
        self.sort_by_direction = sort_by_direction
        # #话题
        self.topic_list = topic_list
        # 舆情文章截止更新时间
        self.update_time_end = update_time_end
        # 舆情文章起始更新时间
        self.update_time_start = update_time_start
        # field_conditions
        self.field_conditions = field_conditions
        # 项目ID
        self.project_id = project_id

    def validate(self):
        if self.field_conditions:
            for k in self.field_conditions:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ass_keyword_list is not None:
            result['ass_keyword_list'] = self.ass_keyword_list
        if self.at_author_name_list is not None:
            result['at_author_name_list'] = self.at_author_name_list
        if self.author_name_list is not None:
            result['author_name_list'] = self.author_name_list
        if self.comments_level is not None:
            result['comments_level'] = self.comments_level
        if self.content_len_level is not None:
            result['content_len_level'] = self.content_len_level
        if self.create_time_end is not None:
            result['create_time_end'] = self.create_time_end
        if self.create_time_start is not None:
            result['create_time_start'] = self.create_time_start
        if self.doc_content_sign is not None:
            result['doc_content_sign'] = self.doc_content_sign
        if self.doc_id_list is not None:
            result['doc_id_list'] = self.doc_id_list
        if self.duplicate_removal is not None:
            result['duplicate_removal'] = self.duplicate_removal
        if self.emotion_type is not None:
            result['emotion_type'] = self.emotion_type
        if self.enable_keyword_highlight is not None:
            result['enable_keyword_highlight'] = self.enable_keyword_highlight
        if self.exclude_at_author_name_list is not None:
            result['exclude_at_author_name_list'] = self.exclude_at_author_name_list
        if self.exclude_author_name_list is not None:
            result['exclude_author_name_list'] = self.exclude_author_name_list
        if self.exclude_host_name_list is not None:
            result['exclude_host_name_list'] = self.exclude_host_name_list
        if self.exclude_keyword_tag_ids is not None:
            result['exclude_keyword_tag_ids'] = self.exclude_keyword_tag_ids
        if self.exclude_keyword_list is not None:
            result['exclude_keyword_list'] = self.exclude_keyword_list
        if self.exclude_keyword_list_in_title is not None:
            result['exclude_keyword_list_in_title'] = self.exclude_keyword_list_in_title
        if self.exclude_media_library_id_list is not None:
            result['exclude_media_library_id_list'] = self.exclude_media_library_id_list
        if self.exclude_media_name_list is not None:
            result['exclude_media_name_list'] = self.exclude_media_name_list
        if self.exclude_media_type_list is not None:
            result['exclude_media_type_list'] = self.exclude_media_type_list
        if self.exclude_message_type_list is not None:
            result['exclude_message_type_list'] = self.exclude_message_type_list
        if self.has_image is not None:
            result['has_image'] = self.has_image
        if self.has_video is not None:
            result['has_video'] = self.has_video
        if self.host_name_list is not None:
            result['host_name_list'] = self.host_name_list
        if self.keyword_tag_ids is not None:
            result['keyword_tag_ids'] = self.keyword_tag_ids
        if self.likes_level is not None:
            result['likes_level'] = self.likes_level
        if self.media_library_id_list is not None:
            result['media_library_id_list'] = self.media_library_id_list
        if self.media_name_list is not None:
            result['media_name_list'] = self.media_name_list
        if self.media_type_list is not None:
            result['media_type_list'] = self.media_type_list
        if self.message_type_list is not None:
            result['message_type_list'] = self.message_type_list
        if self.page_now is not None:
            result['page_now'] = self.page_now
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.parent_doc_id is not None:
            result['parent_doc_id'] = self.parent_doc_id
        if self.pos_keyword_list is not None:
            result['pos_keyword_list'] = self.pos_keyword_list
        if self.pos_keyword_list_in_title is not None:
            result['pos_keyword_list_in_title'] = self.pos_keyword_list_in_title
        if self.publish_time_end is not None:
            result['publish_time_end'] = self.publish_time_end
        if self.publish_time_start is not None:
            result['publish_time_start'] = self.publish_time_start
        if self.reads_level is not None:
            result['reads_level'] = self.reads_level
        if self.relevance_level is not None:
            result['relevance_level'] = self.relevance_level
        if self.repost_level is not None:
            result['repost_level'] = self.repost_level
        if self.sort_by is not None:
            result['sort_by'] = self.sort_by
        if self.sort_by_direction is not None:
            result['sort_by_direction'] = self.sort_by_direction
        if self.topic_list is not None:
            result['topic_list'] = self.topic_list
        if self.update_time_end is not None:
            result['update_time_end'] = self.update_time_end
        if self.update_time_start is not None:
            result['update_time_start'] = self.update_time_start
        result['field_conditions'] = []
        if self.field_conditions is not None:
            for k in self.field_conditions:
                result['field_conditions'].append(k.to_map() if k else None)
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ass_keyword_list') is not None:
            self.ass_keyword_list = m.get('ass_keyword_list')
        if m.get('at_author_name_list') is not None:
            self.at_author_name_list = m.get('at_author_name_list')
        if m.get('author_name_list') is not None:
            self.author_name_list = m.get('author_name_list')
        if m.get('comments_level') is not None:
            self.comments_level = m.get('comments_level')
        if m.get('content_len_level') is not None:
            self.content_len_level = m.get('content_len_level')
        if m.get('create_time_end') is not None:
            self.create_time_end = m.get('create_time_end')
        if m.get('create_time_start') is not None:
            self.create_time_start = m.get('create_time_start')
        if m.get('doc_content_sign') is not None:
            self.doc_content_sign = m.get('doc_content_sign')
        if m.get('doc_id_list') is not None:
            self.doc_id_list = m.get('doc_id_list')
        if m.get('duplicate_removal') is not None:
            self.duplicate_removal = m.get('duplicate_removal')
        if m.get('emotion_type') is not None:
            self.emotion_type = m.get('emotion_type')
        if m.get('enable_keyword_highlight') is not None:
            self.enable_keyword_highlight = m.get('enable_keyword_highlight')
        if m.get('exclude_at_author_name_list') is not None:
            self.exclude_at_author_name_list = m.get('exclude_at_author_name_list')
        if m.get('exclude_author_name_list') is not None:
            self.exclude_author_name_list = m.get('exclude_author_name_list')
        if m.get('exclude_host_name_list') is not None:
            self.exclude_host_name_list = m.get('exclude_host_name_list')
        if m.get('exclude_keyword_tag_ids') is not None:
            self.exclude_keyword_tag_ids = m.get('exclude_keyword_tag_ids')
        if m.get('exclude_keyword_list') is not None:
            self.exclude_keyword_list = m.get('exclude_keyword_list')
        if m.get('exclude_keyword_list_in_title') is not None:
            self.exclude_keyword_list_in_title = m.get('exclude_keyword_list_in_title')
        if m.get('exclude_media_library_id_list') is not None:
            self.exclude_media_library_id_list = m.get('exclude_media_library_id_list')
        if m.get('exclude_media_name_list') is not None:
            self.exclude_media_name_list = m.get('exclude_media_name_list')
        if m.get('exclude_media_type_list') is not None:
            self.exclude_media_type_list = m.get('exclude_media_type_list')
        if m.get('exclude_message_type_list') is not None:
            self.exclude_message_type_list = m.get('exclude_message_type_list')
        if m.get('has_image') is not None:
            self.has_image = m.get('has_image')
        if m.get('has_video') is not None:
            self.has_video = m.get('has_video')
        if m.get('host_name_list') is not None:
            self.host_name_list = m.get('host_name_list')
        if m.get('keyword_tag_ids') is not None:
            self.keyword_tag_ids = m.get('keyword_tag_ids')
        if m.get('likes_level') is not None:
            self.likes_level = m.get('likes_level')
        if m.get('media_library_id_list') is not None:
            self.media_library_id_list = m.get('media_library_id_list')
        if m.get('media_name_list') is not None:
            self.media_name_list = m.get('media_name_list')
        if m.get('media_type_list') is not None:
            self.media_type_list = m.get('media_type_list')
        if m.get('message_type_list') is not None:
            self.message_type_list = m.get('message_type_list')
        if m.get('page_now') is not None:
            self.page_now = m.get('page_now')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('parent_doc_id') is not None:
            self.parent_doc_id = m.get('parent_doc_id')
        if m.get('pos_keyword_list') is not None:
            self.pos_keyword_list = m.get('pos_keyword_list')
        if m.get('pos_keyword_list_in_title') is not None:
            self.pos_keyword_list_in_title = m.get('pos_keyword_list_in_title')
        if m.get('publish_time_end') is not None:
            self.publish_time_end = m.get('publish_time_end')
        if m.get('publish_time_start') is not None:
            self.publish_time_start = m.get('publish_time_start')
        if m.get('reads_level') is not None:
            self.reads_level = m.get('reads_level')
        if m.get('relevance_level') is not None:
            self.relevance_level = m.get('relevance_level')
        if m.get('repost_level') is not None:
            self.repost_level = m.get('repost_level')
        if m.get('sort_by') is not None:
            self.sort_by = m.get('sort_by')
        if m.get('sort_by_direction') is not None:
            self.sort_by_direction = m.get('sort_by_direction')
        if m.get('topic_list') is not None:
            self.topic_list = m.get('topic_list')
        if m.get('update_time_end') is not None:
            self.update_time_end = m.get('update_time_end')
        if m.get('update_time_start') is not None:
            self.update_time_start = m.get('update_time_start')
        self.field_conditions = []
        if m.get('field_conditions') is not None:
            for k in m.get('field_conditions'):
                temp_model = FieldCondition()
                self.field_conditions.append(temp_model.from_map(k))
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class Project(TeaModel):
    def __init__(
        self,
        name: str = None,
        author_name_list: List[str] = None,
        pos_keyword_list: List[str] = None,
        pos_keyword_list_in_title: List[str] = None,
        exclude_keyword_tag_ids: str = None,
        uid_modified: str = None,
        at_author_name_list: List[str] = None,
        exclude_keyword_list: List[str] = None,
        analyse_cp_id: int = None,
        keyword_tag_ids: List[str] = None,
        ass_keyword_list: List[str] = None,
        id: int = None,
        default_filter_id: int = None,
        uname_create: str = None,
        parent_id: int = None,
        gmt_create: int = None,
        uname_modified: str = None,
        gmt_modified: int = None,
        project_group_id: int = None,
        parent_doc_id: int = None,
        doc_id_list: List[str] = None,
        topic_list: List[str] = None,
        uid_create: str = None,
    ):
        # 项目名字
        self.name = name
        # 作者名称
        self.author_name_list = author_name_list
        # 关键词
        self.pos_keyword_list = pos_keyword_list
        # 标题包含词列表
        self.pos_keyword_list_in_title = pos_keyword_list_in_title
        # 排除关键词标签列表
        self.exclude_keyword_tag_ids = exclude_keyword_tag_ids
        # 修改人uid
        self.uid_modified = uid_modified
        # 提级用户名，如@xxx
        self.at_author_name_list = at_author_name_list
        # 排除词
        self.exclude_keyword_list = exclude_keyword_list
        # 项目的分析页面id，关联hbase中的自定义页面表
        self.analyse_cp_id = analyse_cp_id
        # 关键词标签列表
        self.keyword_tag_ids = keyword_tag_ids
        # 搭配词
        self.ass_keyword_list = ass_keyword_list
        # 项目ID
        self.id = id
        # 默认搜索模板id
        self.default_filter_id = default_filter_id
        # 创建人名称
        self.uname_create = uname_create
        # 父项目id
        self.parent_id = parent_id
        # 创建时间
        self.gmt_create = gmt_create
        # 修改人名称
        self.uname_modified = uname_modified
        # 修改时间
        self.gmt_modified = gmt_modified
        # 项目分组id
        self.project_group_id = project_group_id
        # 父文章id
        self.parent_doc_id = parent_doc_id
        # 文章id列表
        self.doc_id_list = doc_id_list
        # 话题词列表
        self.topic_list = topic_list
        # 创建人UID
        self.uid_create = uid_create

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.pos_keyword_list, 'pos_keyword_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.author_name_list is not None:
            result['author_name_list'] = self.author_name_list
        if self.pos_keyword_list is not None:
            result['pos_keyword_list'] = self.pos_keyword_list
        if self.pos_keyword_list_in_title is not None:
            result['pos_keyword_list_in_title'] = self.pos_keyword_list_in_title
        if self.exclude_keyword_tag_ids is not None:
            result['exclude_keyword_tag_ids'] = self.exclude_keyword_tag_ids
        if self.uid_modified is not None:
            result['uid_modified'] = self.uid_modified
        if self.at_author_name_list is not None:
            result['at_author_name_list'] = self.at_author_name_list
        if self.exclude_keyword_list is not None:
            result['exclude_keyword_list'] = self.exclude_keyword_list
        if self.analyse_cp_id is not None:
            result['analyse_cp_id'] = self.analyse_cp_id
        if self.keyword_tag_ids is not None:
            result['keyword_tag_ids'] = self.keyword_tag_ids
        if self.ass_keyword_list is not None:
            result['ass_keyword_list'] = self.ass_keyword_list
        if self.id is not None:
            result['id'] = self.id
        if self.default_filter_id is not None:
            result['default_filter_id'] = self.default_filter_id
        if self.uname_create is not None:
            result['uname_create'] = self.uname_create
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.uname_modified is not None:
            result['uname_modified'] = self.uname_modified
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.project_group_id is not None:
            result['project_group_id'] = self.project_group_id
        if self.parent_doc_id is not None:
            result['parent_doc_id'] = self.parent_doc_id
        if self.doc_id_list is not None:
            result['doc_id_list'] = self.doc_id_list
        if self.topic_list is not None:
            result['topic_list'] = self.topic_list
        if self.uid_create is not None:
            result['uid_create'] = self.uid_create
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('author_name_list') is not None:
            self.author_name_list = m.get('author_name_list')
        if m.get('pos_keyword_list') is not None:
            self.pos_keyword_list = m.get('pos_keyword_list')
        if m.get('pos_keyword_list_in_title') is not None:
            self.pos_keyword_list_in_title = m.get('pos_keyword_list_in_title')
        if m.get('exclude_keyword_tag_ids') is not None:
            self.exclude_keyword_tag_ids = m.get('exclude_keyword_tag_ids')
        if m.get('uid_modified') is not None:
            self.uid_modified = m.get('uid_modified')
        if m.get('at_author_name_list') is not None:
            self.at_author_name_list = m.get('at_author_name_list')
        if m.get('exclude_keyword_list') is not None:
            self.exclude_keyword_list = m.get('exclude_keyword_list')
        if m.get('analyse_cp_id') is not None:
            self.analyse_cp_id = m.get('analyse_cp_id')
        if m.get('keyword_tag_ids') is not None:
            self.keyword_tag_ids = m.get('keyword_tag_ids')
        if m.get('ass_keyword_list') is not None:
            self.ass_keyword_list = m.get('ass_keyword_list')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('default_filter_id') is not None:
            self.default_filter_id = m.get('default_filter_id')
        if m.get('uname_create') is not None:
            self.uname_create = m.get('uname_create')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('uname_modified') is not None:
            self.uname_modified = m.get('uname_modified')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('project_group_id') is not None:
            self.project_group_id = m.get('project_group_id')
        if m.get('parent_doc_id') is not None:
            self.parent_doc_id = m.get('parent_doc_id')
        if m.get('doc_id_list') is not None:
            self.doc_id_list = m.get('doc_id_list')
        if m.get('topic_list') is not None:
            self.topic_list = m.get('topic_list')
        if m.get('uid_create') is not None:
            self.uid_create = m.get('uid_create')
        return self


class SmsContent(TeaModel):
    def __init__(
        self,
        service_code: str = None,
        mobile: str = None,
        developer_id: str = None,
        arguments: List[Pair] = None,
    ):
        # 模板
        self.service_code = service_code
        # 手机号
        self.mobile = mobile
        # 开发者ID
        self.developer_id = developer_id
        # 填充内容
        self.arguments = arguments

    def validate(self):
        self.validate_required(self.mobile, 'mobile')
        if self.arguments:
            for k in self.arguments:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.developer_id is not None:
            result['developer_id'] = self.developer_id
        result['arguments'] = []
        if self.arguments is not None:
            for k in self.arguments:
                result['arguments'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('developer_id') is not None:
            self.developer_id = m.get('developer_id')
        self.arguments = []
        if m.get('arguments') is not None:
            for k in m.get('arguments'):
                temp_model = Pair()
                self.arguments.append(temp_model.from_map(k))
        return self


class EmailContent(TeaModel):
    def __init__(
        self,
        service_code: str = None,
        developer_id: str = None,
        email: str = None,
        arguments: List[Pair] = None,
    ):
        # code
        self.service_code = service_code
        # 开发者Id
        self.developer_id = developer_id
        # 邮箱
        self.email = email
        # 参数
        self.arguments = arguments

    def validate(self):
        self.validate_required(self.email, 'email')
        if self.arguments:
            for k in self.arguments:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.developer_id is not None:
            result['developer_id'] = self.developer_id
        if self.email is not None:
            result['email'] = self.email
        result['arguments'] = []
        if self.arguments is not None:
            for k in self.arguments:
                result['arguments'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('developer_id') is not None:
            self.developer_id = m.get('developer_id')
        if m.get('email') is not None:
            self.email = m.get('email')
        self.arguments = []
        if m.get('arguments') is not None:
            for k in m.get('arguments'):
                temp_model = Pair()
                self.arguments.append(temp_model.from_map(k))
        return self


class CommoditySpec(TeaModel):
    def __init__(
        self,
        spec_key: str = None,
        value: str = None,
    ):
        # 规格项枚举值
        self.spec_key = spec_key
        # 规格项默认值
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.spec_key is not None:
            result['spec_key'] = self.spec_key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_key') is not None:
            self.spec_key = m.get('spec_key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class QueryMessagesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        search_condition: SearchCondition = None,
        request_id: str = None,
        team_hash_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询条件
        self.search_condition = search_condition
        # 请求ID
        self.request_id = request_id
        # team_hash_id
        self.team_hash_id = team_hash_id

    def validate(self):
        self.validate_required(self.search_condition, 'search_condition')
        if self.search_condition:
            self.search_condition.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.search_condition is not None:
            result['search_condition'] = self.search_condition.to_map()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.team_hash_id is not None:
            result['team_hash_id'] = self.team_hash_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('search_condition') is not None:
            temp_model = SearchCondition()
            self.search_condition = temp_model.from_map(m['search_condition'])
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('team_hash_id') is not None:
            self.team_hash_id = m.get('team_hash_id')
        return self


class QueryMessagesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
        yuqing_messages: List[YuqingMessage] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数量
        self.total_count = total_count
        # 舆情列表
        self.yuqing_messages = yuqing_messages

    def validate(self):
        if self.yuqing_messages:
            for k in self.yuqing_messages:
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
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['yuqing_messages'] = []
        if self.yuqing_messages is not None:
            for k in self.yuqing_messages:
                result['yuqing_messages'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.yuqing_messages = []
        if m.get('yuqing_messages') is not None:
            for k in m.get('yuqing_messages'):
                temp_model = YuqingMessage()
                self.yuqing_messages.append(temp_model.from_map(k))
        return self


class SaveAnalysisSubmitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        analyse_type: str = None,
        search_condition: SearchCondition = None,
        team_hash_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分析类型
        self.analyse_type = analyse_type
        # 查询条件
        self.search_condition = search_condition
        # team_hash_id
        self.team_hash_id = team_hash_id

    def validate(self):
        self.validate_required(self.analyse_type, 'analyse_type')
        self.validate_required(self.search_condition, 'search_condition')
        if self.search_condition:
            self.search_condition.validate()
        self.validate_required(self.team_hash_id, 'team_hash_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.analyse_type is not None:
            result['analyse_type'] = self.analyse_type
        if self.search_condition is not None:
            result['search_condition'] = self.search_condition.to_map()
        if self.team_hash_id is not None:
            result['team_hash_id'] = self.team_hash_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('analyse_type') is not None:
            self.analyse_type = m.get('analyse_type')
        if m.get('search_condition') is not None:
            temp_model = SearchCondition()
            self.search_condition = temp_model.from_map(m['search_condition'])
        if m.get('team_hash_id') is not None:
            self.team_hash_id = m.get('team_hash_id')
        return self


class SaveAnalysisSubmitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        analysis_id: int = None,
        result_json: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分析任务ID
        self.analysis_id = analysis_id
        # 其他
        self.result_json = result_json

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
        if self.analysis_id is not None:
            result['analysis_id'] = self.analysis_id
        if self.result_json is not None:
            result['result_json'] = self.result_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('analysis_id') is not None:
            self.analysis_id = m.get('analysis_id')
        if m.get('result_json') is not None:
            self.result_json = m.get('result_json')
        return self


class QueryAnalysisQueryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        analysis_id: int = None,
        team_hash_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分析任务ID
        self.analysis_id = analysis_id
        # team_hash_id
        self.team_hash_id = team_hash_id

    def validate(self):
        self.validate_required(self.analysis_id, 'analysis_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.analysis_id is not None:
            result['analysis_id'] = self.analysis_id
        if self.team_hash_id is not None:
            result['team_hash_id'] = self.team_hash_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('analysis_id') is not None:
            self.analysis_id = m.get('analysis_id')
        if m.get('team_hash_id') is not None:
            self.team_hash_id = m.get('team_hash_id')
        return self


class QueryAnalysisQueryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        analysis_id: int = None,
        result_json: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分析任务ID
        self.analysis_id = analysis_id
        # 分析内容
        self.result_json = result_json

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
        if self.analysis_id is not None:
            result['analysis_id'] = self.analysis_id
        if self.result_json is not None:
            result['result_json'] = self.result_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('analysis_id') is not None:
            self.analysis_id = m.get('analysis_id')
        if m.get('result_json') is not None:
            self.result_json = m.get('result_json')
        return self


class SaveProductOpenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        tenant_id: str = None,
        instance_id: str = None,
        product_code: str = None,
        module_key: str = None,
        operate: str = None,
        channel: str = None,
        commodity_specs: List[CommoditySpec] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务号
        self.biz_no = biz_no
        # 租户 ID
        self.tenant_id = tenant_id
        # 实例 ID，兼容老模型的 tntInstId
        self.instance_id = instance_id
        # 产品编码
        self.product_code = product_code
        # 模块唯一标识
        self.module_key = module_key
        # 操作类型
        self.operate = operate
        # 操作来源渠道
        self.channel = channel
        # 规格
        self.commodity_specs = commodity_specs

    def validate(self):
        if self.commodity_specs:
            for k in self.commodity_specs:
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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.module_key is not None:
            result['module_key'] = self.module_key
        if self.operate is not None:
            result['operate'] = self.operate
        if self.channel is not None:
            result['channel'] = self.channel
        result['commodity_specs'] = []
        if self.commodity_specs is not None:
            for k in self.commodity_specs:
                result['commodity_specs'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('module_key') is not None:
            self.module_key = m.get('module_key')
        if m.get('operate') is not None:
            self.operate = m.get('operate')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        self.commodity_specs = []
        if m.get('commodity_specs') is not None:
            for k in m.get('commodity_specs'):
                temp_model = CommoditySpec()
                self.commodity_specs.append(temp_model.from_map(k))
        return self


class SaveProductOpenResponse(TeaModel):
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


class SaveProductTopRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        tenant_id: str = None,
        instance_id: str = None,
        product_code: str = None,
        module_key: str = None,
        operate: str = None,
        channel: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务号
        self.biz_no = biz_no
        # 租户 ID
        self.tenant_id = tenant_id
        # 实例 ID，兼容老模型的 tntInstId
        self.instance_id = instance_id
        # 产品编码
        self.product_code = product_code
        # 模块唯一标识
        self.module_key = module_key
        # 操作类型
        self.operate = operate
        # 操作来源渠道
        self.channel = channel

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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.module_key is not None:
            result['module_key'] = self.module_key
        if self.operate is not None:
            result['operate'] = self.operate
        if self.channel is not None:
            result['channel'] = self.channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('module_key') is not None:
            self.module_key = m.get('module_key')
        if m.get('operate') is not None:
            self.operate = m.get('operate')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        return self


class SaveProductTopResponse(TeaModel):
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


class SetProductOperateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        input_json: str = None,
        operate_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求入参
        self.input_json = input_json
        # 操作类型
        self.operate_type = operate_type

    def validate(self):
        self.validate_required(self.input_json, 'input_json')
        self.validate_required(self.operate_type, 'operate_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.input_json is not None:
            result['input_json'] = self.input_json
        if self.operate_type is not None:
            result['operate_type'] = self.operate_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('input_json') is not None:
            self.input_json = m.get('input_json')
        if m.get('operate_type') is not None:
            self.operate_type = m.get('operate_type')
        return self


class SetProductOperateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        output_json: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 输出返回
        self.output_json = output_json

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
        if self.output_json is not None:
            result['output_json'] = self.output_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('output_json') is not None:
            self.output_json = m.get('output_json')
        return self


class SendProductNoticeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        notice_type: str = None,
        tenant_uid: str = None,
        ding_talk_content: DingTalkContent = None,
        sms_content: SmsContent = None,
        email_content: EmailContent = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 提醒类型
        self.notice_type = notice_type
        # 租户ID
        self.tenant_uid = tenant_uid
        # 钉钉结构体
        self.ding_talk_content = ding_talk_content
        # 短信内容
        self.sms_content = sms_content
        # email结构体
        self.email_content = email_content

    def validate(self):
        self.validate_required(self.notice_type, 'notice_type')
        self.validate_required(self.tenant_uid, 'tenant_uid')
        if self.ding_talk_content:
            self.ding_talk_content.validate()
        if self.sms_content:
            self.sms_content.validate()
        if self.email_content:
            self.email_content.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.notice_type is not None:
            result['notice_type'] = self.notice_type
        if self.tenant_uid is not None:
            result['tenant_uid'] = self.tenant_uid
        if self.ding_talk_content is not None:
            result['ding_talk_content'] = self.ding_talk_content.to_map()
        if self.sms_content is not None:
            result['sms_content'] = self.sms_content.to_map()
        if self.email_content is not None:
            result['email_content'] = self.email_content.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('notice_type') is not None:
            self.notice_type = m.get('notice_type')
        if m.get('tenant_uid') is not None:
            self.tenant_uid = m.get('tenant_uid')
        if m.get('ding_talk_content') is not None:
            temp_model = DingTalkContent()
            self.ding_talk_content = temp_model.from_map(m['ding_talk_content'])
        if m.get('sms_content') is not None:
            temp_model = SmsContent()
            self.sms_content = temp_model.from_map(m['sms_content'])
        if m.get('email_content') is not None:
            temp_model = EmailContent()
            self.email_content = temp_model.from_map(m['email_content'])
        return self


class SendProductNoticeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        operate_result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 推送返回
        self.operate_result = operate_result

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
        if self.operate_result is not None:
            result['operate_result'] = self.operate_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('operate_result') is not None:
            self.operate_result = m.get('operate_result')
        return self


class SaveDeepanalysisSubmitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tool_type: str = None,
        name: str = None,
        config: AnalysisConfig = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 深度分析类型
        self.tool_type = tool_type
        # 任务名称
        self.name = name
        # 深度分析配置
        self.config = config

    def validate(self):
        self.validate_required(self.tool_type, 'tool_type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.config, 'config')
        if self.config:
            self.config.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tool_type is not None:
            result['tool_type'] = self.tool_type
        if self.name is not None:
            result['name'] = self.name
        if self.config is not None:
            result['config'] = self.config.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tool_type') is not None:
            self.tool_type = m.get('tool_type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('config') is not None:
            temp_model = AnalysisConfig()
            self.config = temp_model.from_map(m['config'])
        return self


class SaveDeepanalysisSubmitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        analysis_id: int = None,
        result_json: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 深度分析任务ID
        self.analysis_id = analysis_id
        # 其他返回
        self.result_json = result_json

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
        if self.analysis_id is not None:
            result['analysis_id'] = self.analysis_id
        if self.result_json is not None:
            result['result_json'] = self.result_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('analysis_id') is not None:
            self.analysis_id = m.get('analysis_id')
        if m.get('result_json') is not None:
            self.result_json = m.get('result_json')
        return self


class QueryDeepanalysisQueryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        analysis_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 深度分析任务ID
        self.analysis_id = analysis_id

    def validate(self):
        self.validate_required(self.analysis_id, 'analysis_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.analysis_id is not None:
            result['analysis_id'] = self.analysis_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('analysis_id') is not None:
            self.analysis_id = m.get('analysis_id')
        return self


class QueryDeepanalysisQueryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        analysis_id: int = None,
        result_json: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 深度分析任务ID
        self.analysis_id = analysis_id
        # 分析内容
        self.result_json = result_json

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
        if self.analysis_id is not None:
            result['analysis_id'] = self.analysis_id
        if self.result_json is not None:
            result['result_json'] = self.result_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('analysis_id') is not None:
            self.analysis_id = m.get('analysis_id')
        if m.get('result_json') is not None:
            self.result_json = m.get('result_json')
        return self


class GetMessageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        team_hash_id: str = None,
        doc_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID
        self.request_id = request_id
        # team_hash_id
        self.team_hash_id = team_hash_id
        # 文档唯一ID
        self.doc_id = doc_id

    def validate(self):
        self.validate_required(self.doc_id, 'doc_id')

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
        if self.team_hash_id is not None:
            result['team_hash_id'] = self.team_hash_id
        if self.doc_id is not None:
            result['doc_id'] = self.doc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('team_hash_id') is not None:
            self.team_hash_id = m.get('team_hash_id')
        if m.get('doc_id') is not None:
            self.doc_id = m.get('doc_id')
        return self


class GetMessageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        yuqing_message: YuqingMessage = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 與情内容
        self.yuqing_message = yuqing_message

    def validate(self):
        if self.yuqing_message:
            self.yuqing_message.validate()

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
        if self.yuqing_message is not None:
            result['yuqing_message'] = self.yuqing_message.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('yuqing_message') is not None:
            temp_model = YuqingMessage()
            self.yuqing_message = temp_model.from_map(m['yuqing_message'])
        return self


class QueryProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        parent_id: int = None,
        uid: str = None,
        order_by: str = None,
        request_id: str = None,
        name: str = None,
        ids: List[int] = None,
        current_page: int = None,
        project_group_id: int = None,
        page_size: int = None,
        sort_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 父亲项目的id: 负数表示不限
        self.parent_id = parent_id
        # uid
        self.uid = uid
        # 排序字段名称，如gmt_create
        self.order_by = order_by
        # 请求ID
        self.request_id = request_id
        # 名称
        self.name = name
        # 指定ID
        self.ids = ids
        # 当前页
        self.current_page = current_page
        # 所在项目组ID
        self.project_group_id = project_group_id
        # 页面大小
        self.page_size = page_size
        # 排序方式：DESC降序，ASC升序
        self.sort_type = sort_type

    def validate(self):
        self.validate_required(self.current_page, 'current_page')
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
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.uid is not None:
            result['uid'] = self.uid
        if self.order_by is not None:
            result['order_by'] = self.order_by
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.name is not None:
            result['name'] = self.name
        if self.ids is not None:
            result['ids'] = self.ids
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.project_group_id is not None:
            result['project_group_id'] = self.project_group_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.sort_type is not None:
            result['sort_type'] = self.sort_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('uid') is not None:
            self.uid = m.get('uid')
        if m.get('order_by') is not None:
            self.order_by = m.get('order_by')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('ids') is not None:
            self.ids = m.get('ids')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('project_group_id') is not None:
            self.project_group_id = m.get('project_group_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('sort_type') is not None:
            self.sort_type = m.get('sort_type')
        return self


class QueryProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pages: List[Project] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页面内容
        self.pages = pages
        # 总条数
        self.total_count = total_count

    def validate(self):
        if self.pages:
            for k in self.pages:
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
        result['pages'] = []
        if self.pages is not None:
            for k in self.pages:
                result['pages'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.pages = []
        if m.get('pages') is not None:
            for k in m.get('pages'):
                temp_model = Project()
                self.pages.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class CreateProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        create_param: Project = None,
        request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 创建内容
        self.create_param = create_param
        # requestId
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.create_param, 'create_param')
        if self.create_param:
            self.create_param.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.create_param is not None:
            result['create_param'] = self.create_param.to_map()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('create_param') is not None:
            temp_model = Project()
            self.create_param = temp_model.from_map(m['create_param'])
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class CreateProjectResponse(TeaModel):
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


class DeleteProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 项目ID
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DeleteProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 新增主键
        self.id = id

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
        if self.id is not None:
            result['id'] = self.id
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
        return self


class QueryAlarmRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alarm_rule_ids: List[int] = None,
        order_by: str = None,
        is_query_update_time: bool = None,
        current_page: int = None,
        page_size: int = None,
        project_ids: List[int] = None,
        end_time: int = None,
        levels: str = None,
        start_time: int = None,
        type: str = None,
        ids: List[int] = None,
        tag_ids: List[int] = None,
        doc_media_type: str = None,
        status: List[str] = None,
        doc_id_list: List[str] = None,
        sort_type: str = None,
        request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 规则id列表
        self.alarm_rule_ids = alarm_rule_ids
        # 排序字段名称，如gmt_create
        self.order_by = order_by
        # 是否用更新时间筛选
        self.is_query_update_time = is_query_update_time
        # 当前页
        self.current_page = current_page
        # 页大小
        self.page_size = page_size
        # 舆情项目id列表
        self.project_ids = project_ids
        # 预警时间下限
        self.end_time = end_time
        # 预警等级，如：P0
        self.levels = levels
        # 预警时间上限
        self.start_time = start_time
        # 预警规则类型
        self.type = type
        # 预警消息id
        self.ids = ids
        # 标签id
        self.tag_ids = tag_ids
        # 媒体类型
        self.doc_media_type = doc_media_type
        # 消息状态，如：FINISHED
        self.status = status
        # 文章docId列表
        self.doc_id_list = doc_id_list
        # 排序方向，DESC降序，ASC升序
        self.sort_type = sort_type
        # requestId
        self.request_id = request_id

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
        if self.alarm_rule_ids is not None:
            result['alarm_rule_ids'] = self.alarm_rule_ids
        if self.order_by is not None:
            result['order_by'] = self.order_by
        if self.is_query_update_time is not None:
            result['is_query_update_time'] = self.is_query_update_time
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.project_ids is not None:
            result['project_ids'] = self.project_ids
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.levels is not None:
            result['levels'] = self.levels
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.type is not None:
            result['type'] = self.type
        if self.ids is not None:
            result['ids'] = self.ids
        if self.tag_ids is not None:
            result['tag_ids'] = self.tag_ids
        if self.doc_media_type is not None:
            result['doc_media_type'] = self.doc_media_type
        if self.status is not None:
            result['status'] = self.status
        if self.doc_id_list is not None:
            result['doc_id_list'] = self.doc_id_list
        if self.sort_type is not None:
            result['sort_type'] = self.sort_type
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alarm_rule_ids') is not None:
            self.alarm_rule_ids = m.get('alarm_rule_ids')
        if m.get('order_by') is not None:
            self.order_by = m.get('order_by')
        if m.get('is_query_update_time') is not None:
            self.is_query_update_time = m.get('is_query_update_time')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('project_ids') is not None:
            self.project_ids = m.get('project_ids')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('levels') is not None:
            self.levels = m.get('levels')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('ids') is not None:
            self.ids = m.get('ids')
        if m.get('tag_ids') is not None:
            self.tag_ids = m.get('tag_ids')
        if m.get('doc_media_type') is not None:
            self.doc_media_type = m.get('doc_media_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('doc_id_list') is not None:
            self.doc_id_list = m.get('doc_id_list')
        if m.get('sort_type') is not None:
            self.sort_type = m.get('sort_type')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryAlarmResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pages: List[Alarm] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预警消息
        self.pages = pages
        # 总条数
        self.total_count = total_count

    def validate(self):
        if self.pages:
            for k in self.pages:
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
        result['pages'] = []
        if self.pages is not None:
            for k in self.pages:
                result['pages'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.pages = []
        if m.get('pages') is not None:
            for k in m.get('pages'):
                temp_model = Alarm()
                self.pages.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class QueryHotspotMessageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        title_including_words_idx: str = None,
        pos_keywords: str = None,
        whole_keywords: str = None,
        sort_by_direction: str = None,
        provinces: str = None,
        crawler_time_start_filter: int = None,
        page_size: int = None,
        media_sub_type: List[str] = None,
        query_without_keyword: bool = None,
        doc_ids: List[str] = None,
        cities: List[str] = None,
        crawler_time_end_filter: int = None,
        enable_keyword_highlight: bool = None,
        page_now: int = None,
        file_id: bool = None,
        sort_by: str = None,
        active: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 标题包含XX
        self.title_including_words_idx = title_including_words_idx
        # 正向关键词（短语匹配）
        self.pos_keywords = pos_keywords
        # 标题完全相等的检索条件，与attributes.display_title字段对应
        self.whole_keywords = whole_keywords
        # 排序方式： 正序(+)、倒序(-)
        self.sort_by_direction = sort_by_direction
        # 省份
        self.provinces = provinces
        # 爬取时间的最小值（含）
        self.crawler_time_start_filter = crawler_time_start_filter
        # 页大小
        self.page_size = page_size
        # [媒体子类型
        self.media_sub_type = media_sub_type
        # 是否不指定关键词进行查询：\n 默认false，表示需要指定关键词来查询
        self.query_without_keyword = query_without_keyword
        # 指定的id列表
        self.doc_ids = doc_ids
        # 城市
        self.cities = cities
        # 爬取时间的最大值（不含）
        self.crawler_time_end_filter = crawler_time_end_filter
        # 是否要进行关键词高亮显示
        self.enable_keyword_highlight = enable_keyword_highlight
        # d当前页
        self.page_now = page_now
        # 是否当前在榜 true表示在榜，false或null表示不限
        self.file_id = file_id
        # 排序字段
        self.sort_by = sort_by
        # 是否当前在榜
        self.active = active

    def validate(self):
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.page_now, 'page_now')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.title_including_words_idx is not None:
            result['title_including_words_idx'] = self.title_including_words_idx
        if self.pos_keywords is not None:
            result['pos_keywords'] = self.pos_keywords
        if self.whole_keywords is not None:
            result['whole_keywords'] = self.whole_keywords
        if self.sort_by_direction is not None:
            result['sort_by_direction'] = self.sort_by_direction
        if self.provinces is not None:
            result['provinces'] = self.provinces
        if self.crawler_time_start_filter is not None:
            result['crawler_time_start_filter'] = self.crawler_time_start_filter
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.media_sub_type is not None:
            result['media_sub_type'] = self.media_sub_type
        if self.query_without_keyword is not None:
            result['query_without_keyword'] = self.query_without_keyword
        if self.doc_ids is not None:
            result['doc_ids'] = self.doc_ids
        if self.cities is not None:
            result['cities'] = self.cities
        if self.crawler_time_end_filter is not None:
            result['crawler_time_end_filter'] = self.crawler_time_end_filter
        if self.enable_keyword_highlight is not None:
            result['enable_keyword_highlight'] = self.enable_keyword_highlight
        if self.page_now is not None:
            result['page_now'] = self.page_now
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.sort_by is not None:
            result['sort_by'] = self.sort_by
        if self.active is not None:
            result['active'] = self.active
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('title_including_words_idx') is not None:
            self.title_including_words_idx = m.get('title_including_words_idx')
        if m.get('pos_keywords') is not None:
            self.pos_keywords = m.get('pos_keywords')
        if m.get('whole_keywords') is not None:
            self.whole_keywords = m.get('whole_keywords')
        if m.get('sort_by_direction') is not None:
            self.sort_by_direction = m.get('sort_by_direction')
        if m.get('provinces') is not None:
            self.provinces = m.get('provinces')
        if m.get('crawler_time_start_filter') is not None:
            self.crawler_time_start_filter = m.get('crawler_time_start_filter')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('media_sub_type') is not None:
            self.media_sub_type = m.get('media_sub_type')
        if m.get('query_without_keyword') is not None:
            self.query_without_keyword = m.get('query_without_keyword')
        if m.get('doc_ids') is not None:
            self.doc_ids = m.get('doc_ids')
        if m.get('cities') is not None:
            self.cities = m.get('cities')
        if m.get('crawler_time_end_filter') is not None:
            self.crawler_time_end_filter = m.get('crawler_time_end_filter')
        if m.get('enable_keyword_highlight') is not None:
            self.enable_keyword_highlight = m.get('enable_keyword_highlight')
        if m.get('page_now') is not None:
            self.page_now = m.get('page_now')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('sort_by') is not None:
            self.sort_by = m.get('sort_by')
        if m.get('active') is not None:
            self.active = m.get('active')
        return self


class QueryHotspotMessageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pages: List[HotspotMessage] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 热搜数据
        self.pages = pages
        # 总条数
        self.total_count = total_count

    def validate(self):
        if self.pages:
            for k in self.pages:
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
        result['pages'] = []
        if self.pages is not None:
            for k in self.pages:
                result['pages'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.pages = []
        if m.get('pages') is not None:
            for k in m.get('pages'):
                temp_model = HotspotMessage()
                self.pages.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class SubmitMessagesHistoryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        search_condition: SearchCondition = None,
        request_id: str = None,
        team_hash_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询条件
        self.search_condition = search_condition
        # 请求ID
        self.request_id = request_id
        # team_hash_id
        self.team_hash_id = team_hash_id

    def validate(self):
        self.validate_required(self.search_condition, 'search_condition')
        if self.search_condition:
            self.search_condition.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.search_condition is not None:
            result['search_condition'] = self.search_condition.to_map()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.team_hash_id is not None:
            result['team_hash_id'] = self.team_hash_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('search_condition') is not None:
            temp_model = SearchCondition()
            self.search_condition = temp_model.from_map(m['search_condition'])
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('team_hash_id') is not None:
            self.team_hash_id = m.get('team_hash_id')
        return self


class SubmitMessagesHistoryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        submit_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询ID
        self.submit_id = submit_id

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
        if self.submit_id is not None:
            result['submit_id'] = self.submit_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('submit_id') is not None:
            self.submit_id = m.get('submit_id')
        return self


class GetMessagesHistoryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        submit_id: str = None,
        request_id: str = None,
        page_now: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 历史数据提交的产物
        self.submit_id = submit_id
        # request_id
        self.request_id = request_id
        # page_now
        self.page_now = page_now
        # page_size
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.submit_id, 'submit_id')
        self.validate_required(self.page_now, 'page_now')
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
        if self.submit_id is not None:
            result['submit_id'] = self.submit_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.page_now is not None:
            result['page_now'] = self.page_now
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('submit_id') is not None:
            self.submit_id = m.get('submit_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('page_now') is not None:
            self.page_now = m.get('page_now')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class GetMessagesHistoryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
        yuqing_messages: List[YuqingMessage] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总数
        self.total_count = total_count
        # yuqing_messages
        self.yuqing_messages = yuqing_messages

    def validate(self):
        if self.yuqing_messages:
            for k in self.yuqing_messages:
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
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['yuqing_messages'] = []
        if self.yuqing_messages is not None:
            for k in self.yuqing_messages:
                result['yuqing_messages'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.yuqing_messages = []
        if m.get('yuqing_messages') is not None:
            for k in m.get('yuqing_messages'):
                temp_model = YuqingMessage()
                self.yuqing_messages.append(temp_model.from_map(k))
        return self


class SubmitHotspotTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        media_sub_types: List[str] = None,
        expired_time: int = None,
        sort_by_direction: str = None,
        sort_by: str = None,
        crawler_time_start_filter: int = None,
        crawler_time_end_filter: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 媒体类型
        self.media_sub_types = media_sub_types
        # 任务过期时间,单位秒
        self.expired_time = expired_time
        # 排序方式： 正序(+)、倒序(-)
        self.sort_by_direction = sort_by_direction
        # 排序字段
        self.sort_by = sort_by
        # 爬取开始时间过滤
        self.crawler_time_start_filter = crawler_time_start_filter
        # 爬取结束时间过滤
        self.crawler_time_end_filter = crawler_time_end_filter

    def validate(self):
        self.validate_required(self.media_sub_types, 'media_sub_types')
        self.validate_required(self.expired_time, 'expired_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.media_sub_types is not None:
            result['media_sub_types'] = self.media_sub_types
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.sort_by_direction is not None:
            result['sort_by_direction'] = self.sort_by_direction
        if self.sort_by is not None:
            result['sort_by'] = self.sort_by
        if self.crawler_time_start_filter is not None:
            result['crawler_time_start_filter'] = self.crawler_time_start_filter
        if self.crawler_time_end_filter is not None:
            result['crawler_time_end_filter'] = self.crawler_time_end_filter
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('media_sub_types') is not None:
            self.media_sub_types = m.get('media_sub_types')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('sort_by_direction') is not None:
            self.sort_by_direction = m.get('sort_by_direction')
        if m.get('sort_by') is not None:
            self.sort_by = m.get('sort_by')
        if m.get('crawler_time_start_filter') is not None:
            self.crawler_time_start_filter = m.get('crawler_time_start_filter')
        if m.get('crawler_time_end_filter') is not None:
            self.crawler_time_end_filter = m.get('crawler_time_end_filter')
        return self


class SubmitHotspotTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_ids: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_ids = task_ids

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
        if self.task_ids is not None:
            result['task_ids'] = self.task_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_ids') is not None:
            self.task_ids = m.get('task_ids')
        return self


class GetHotspotTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_ids: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_ids = task_ids

    def validate(self):
        self.validate_required(self.task_ids, 'task_ids')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_ids is not None:
            result['task_ids'] = self.task_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_ids') is not None:
            self.task_ids = m.get('task_ids')
        return self


class GetHotspotTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        hotspot_tasks: List[HotspotTask] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务的结果
        self.hotspot_tasks = hotspot_tasks

    def validate(self):
        if self.hotspot_tasks:
            for k in self.hotspot_tasks:
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
        result['hotspot_tasks'] = []
        if self.hotspot_tasks is not None:
            for k in self.hotspot_tasks:
                result['hotspot_tasks'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.hotspot_tasks = []
        if m.get('hotspot_tasks') is not None:
            for k in m.get('hotspot_tasks'):
                temp_model = HotspotTask()
                self.hotspot_tasks.append(temp_model.from_map(k))
        return self


class GetStsTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务类型
        self.biz_type = biz_type

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        return self


class GetStsTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_key_id: str = None,
        access_key_secret: str = None,
        security_token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # AK
        self.access_key_id = access_key_id
        # SK
        self.access_key_secret = access_key_secret
        # stsToken
        self.security_token = security_token

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
        if self.access_key_id is not None:
            result['access_key_id'] = self.access_key_id
        if self.access_key_secret is not None:
            result['access_key_secret'] = self.access_key_secret
        if self.security_token is not None:
            result['security_token'] = self.security_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_key_id') is not None:
            self.access_key_id = m.get('access_key_id')
        if m.get('access_key_secret') is not None:
            self.access_key_secret = m.get('access_key_secret')
        if m.get('security_token') is not None:
            self.security_token = m.get('security_token')
        return self


class OperateCommonInterfaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        param_json: str = None,
        interface_name: str = None,
        request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 入参JSON
        self.param_json = param_json
        # 接口名称
        self.interface_name = interface_name
        # 请求ID
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.param_json, 'param_json')
        self.validate_required(self.interface_name, 'interface_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.param_json is not None:
            result['param_json'] = self.param_json
        if self.interface_name is not None:
            result['interface_name'] = self.interface_name
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('param_json') is not None:
            self.param_json = m.get('param_json')
        if m.get('interface_name') is not None:
            self.interface_name = m.get('interface_name')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class OperateCommonInterfaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_json: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回JSON
        self.result_json = result_json

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
        if self.result_json is not None:
            result['result_json'] = self.result_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_json') is not None:
            self.result_json = m.get('result_json')
        return self


