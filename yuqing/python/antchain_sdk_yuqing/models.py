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
        relevance_score: int = None,
        similar_number: int = None,
        weibo_comment_id: str = None,
        weibo_mid: str = None,
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

    def validate(self):
        pass

    def to_map(self):
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
        return self


class SearchCondition(TeaModel):
    def __init__(
        self,
        ass_keywords: str = None,
        at_author_name: str = None,
        author_name: str = None,
        comments_level: int = None,
        content_len_level: str = None,
        create_time_end: int = None,
        create_time_start: int = None,
        doc_content_sign: str = None,
        doc_id: str = None,
        duplicate_removal: bool = None,
        emotion_type: int = None,
        enable_keyword_highlight: bool = None,
        exclude_at_author_name: str = None,
        exclude_author_name: str = None,
        exclude_host_name: str = None,
        exclude_keyword_tag_ids: str = None,
        exclude_keywords: str = None,
        exclude_keywords_in_title: str = None,
        exclude_media_library_ids: str = None,
        exclude_media_name: str = None,
        exclude_media_type: str = None,
        exclude_message_type: str = None,
        field_conditions: str = None,
        has_image: bool = None,
        has_video: bool = None,
        host_name: str = None,
        keyword_tag_ids: str = None,
        likes_level: int = None,
        media_library_ids: str = None,
        media_name: str = None,
        media_type: str = None,
        message_type: str = None,
        page_now: int = None,
        page_size: int = None,
        parent_doc_id: str = None,
        pos_key_words: str = None,
        pos_keywords_in_title: str = None,
        publish_time_end: int = None,
        publish_time_start: str = None,
        reads_level: int = None,
        relevance_level: int = None,
        repost_level: int = None,
        sort_by: str = None,
        sort_by_direction: str = None,
        topics: str = None,
        update_time_end: int = None,
        update_time_start: int = None,
    ):
        # 搭配词
        self.ass_keywords = ass_keywords
        # 被@的用户名称
        self.at_author_name = at_author_name
        # 作者名称
        self.author_name = author_name
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
        self.doc_id = doc_id
        # 是否去重
        self.duplicate_removal = duplicate_removal
        # 情感类型，1非负，-1负面
        self.emotion_type = emotion_type
        # 是否高亮关键词
        self.enable_keyword_highlight = enable_keyword_highlight
        # 排除被@的用户名称
        self.exclude_at_author_name = exclude_at_author_name
        # 排除作者名称
        self.exclude_author_name = exclude_author_name
        # 排除网站域名
        self.exclude_host_name = exclude_host_name
        # 排除关键词标签Id列表
        self.exclude_keyword_tag_ids = exclude_keyword_tag_ids
        # 排除词
        self.exclude_keywords = exclude_keywords
        # 标题排除词
        self.exclude_keywords_in_title = exclude_keywords_in_title
        # 排除媒体库id列表
        self.exclude_media_library_ids = exclude_media_library_ids
        # 排除媒体名称
        self.exclude_media_name = exclude_media_name
        # 排除媒体类型，枚举值
        self.exclude_media_type = exclude_media_type
        # 排除消息类型，枚举值
        self.exclude_message_type = exclude_message_type
        # 其他过滤条件
        self.field_conditions = field_conditions
        # 文章是否含有图片
        self.has_image = has_image
        # 是否含有视频
        self.has_video = has_video
        # 网站域名
        self.host_name = host_name
        # 关键词标签Id列表
        self.keyword_tag_ids = keyword_tag_ids
        # 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+\
        self.likes_level = likes_level
        # 媒体库id列表
        self.media_library_ids = media_library_ids
        # 媒体名称
        self.media_name = media_name
        # 体类型，枚举值
        self.media_type = media_type
        # 消息类型，枚举值
        self.message_type = message_type
        # 当前页
        self.page_now = page_now
        # 页大小
        self.page_size = page_size
        # 舆情父文章的docId，一般用于查看某篇文章的评论
        self.parent_doc_id = parent_doc_id
        # 关键词
        self.pos_key_words = pos_key_words
        # 标题关键词
        self.pos_keywords_in_title = pos_keywords_in_title
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
        self.topics = topics
        # 舆情文章截止更新时间
        self.update_time_end = update_time_end
        # 舆情文章起始更新时间
        self.update_time_start = update_time_start

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.ass_keywords is not None:
            result['ass_keywords'] = self.ass_keywords
        if self.at_author_name is not None:
            result['at_author_name'] = self.at_author_name
        if self.author_name is not None:
            result['author_name'] = self.author_name
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
        if self.doc_id is not None:
            result['doc_id'] = self.doc_id
        if self.duplicate_removal is not None:
            result['duplicate_removal'] = self.duplicate_removal
        if self.emotion_type is not None:
            result['emotion_type'] = self.emotion_type
        if self.enable_keyword_highlight is not None:
            result['enable_keyword_highlight'] = self.enable_keyword_highlight
        if self.exclude_at_author_name is not None:
            result['exclude_at_author_name'] = self.exclude_at_author_name
        if self.exclude_author_name is not None:
            result['exclude_author_name'] = self.exclude_author_name
        if self.exclude_host_name is not None:
            result['exclude_host_name'] = self.exclude_host_name
        if self.exclude_keyword_tag_ids is not None:
            result['exclude_keyword_tag_ids'] = self.exclude_keyword_tag_ids
        if self.exclude_keywords is not None:
            result['exclude_keywords'] = self.exclude_keywords
        if self.exclude_keywords_in_title is not None:
            result['exclude_keywords_in_title'] = self.exclude_keywords_in_title
        if self.exclude_media_library_ids is not None:
            result['exclude_media_library_ids'] = self.exclude_media_library_ids
        if self.exclude_media_name is not None:
            result['exclude_media_name'] = self.exclude_media_name
        if self.exclude_media_type is not None:
            result['exclude_media_type'] = self.exclude_media_type
        if self.exclude_message_type is not None:
            result['exclude_message_type'] = self.exclude_message_type
        if self.field_conditions is not None:
            result['field_conditions'] = self.field_conditions
        if self.has_image is not None:
            result['has_image'] = self.has_image
        if self.has_video is not None:
            result['has_video'] = self.has_video
        if self.host_name is not None:
            result['host_name'] = self.host_name
        if self.keyword_tag_ids is not None:
            result['keyword_tag_ids'] = self.keyword_tag_ids
        if self.likes_level is not None:
            result['likes_level'] = self.likes_level
        if self.media_library_ids is not None:
            result['media_library_ids'] = self.media_library_ids
        if self.media_name is not None:
            result['media_name'] = self.media_name
        if self.media_type is not None:
            result['media_type'] = self.media_type
        if self.message_type is not None:
            result['message_type'] = self.message_type
        if self.page_now is not None:
            result['page_now'] = self.page_now
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.parent_doc_id is not None:
            result['parent_doc_id'] = self.parent_doc_id
        if self.pos_key_words is not None:
            result['pos_key_words'] = self.pos_key_words
        if self.pos_keywords_in_title is not None:
            result['pos_keywords_in_title'] = self.pos_keywords_in_title
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
        if self.topics is not None:
            result['topics'] = self.topics
        if self.update_time_end is not None:
            result['update_time_end'] = self.update_time_end
        if self.update_time_start is not None:
            result['update_time_start'] = self.update_time_start
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ass_keywords') is not None:
            self.ass_keywords = m.get('ass_keywords')
        if m.get('at_author_name') is not None:
            self.at_author_name = m.get('at_author_name')
        if m.get('author_name') is not None:
            self.author_name = m.get('author_name')
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
        if m.get('doc_id') is not None:
            self.doc_id = m.get('doc_id')
        if m.get('duplicate_removal') is not None:
            self.duplicate_removal = m.get('duplicate_removal')
        if m.get('emotion_type') is not None:
            self.emotion_type = m.get('emotion_type')
        if m.get('enable_keyword_highlight') is not None:
            self.enable_keyword_highlight = m.get('enable_keyword_highlight')
        if m.get('exclude_at_author_name') is not None:
            self.exclude_at_author_name = m.get('exclude_at_author_name')
        if m.get('exclude_author_name') is not None:
            self.exclude_author_name = m.get('exclude_author_name')
        if m.get('exclude_host_name') is not None:
            self.exclude_host_name = m.get('exclude_host_name')
        if m.get('exclude_keyword_tag_ids') is not None:
            self.exclude_keyword_tag_ids = m.get('exclude_keyword_tag_ids')
        if m.get('exclude_keywords') is not None:
            self.exclude_keywords = m.get('exclude_keywords')
        if m.get('exclude_keywords_in_title') is not None:
            self.exclude_keywords_in_title = m.get('exclude_keywords_in_title')
        if m.get('exclude_media_library_ids') is not None:
            self.exclude_media_library_ids = m.get('exclude_media_library_ids')
        if m.get('exclude_media_name') is not None:
            self.exclude_media_name = m.get('exclude_media_name')
        if m.get('exclude_media_type') is not None:
            self.exclude_media_type = m.get('exclude_media_type')
        if m.get('exclude_message_type') is not None:
            self.exclude_message_type = m.get('exclude_message_type')
        if m.get('field_conditions') is not None:
            self.field_conditions = m.get('field_conditions')
        if m.get('has_image') is not None:
            self.has_image = m.get('has_image')
        if m.get('has_video') is not None:
            self.has_video = m.get('has_video')
        if m.get('host_name') is not None:
            self.host_name = m.get('host_name')
        if m.get('keyword_tag_ids') is not None:
            self.keyword_tag_ids = m.get('keyword_tag_ids')
        if m.get('likes_level') is not None:
            self.likes_level = m.get('likes_level')
        if m.get('media_library_ids') is not None:
            self.media_library_ids = m.get('media_library_ids')
        if m.get('media_name') is not None:
            self.media_name = m.get('media_name')
        if m.get('media_type') is not None:
            self.media_type = m.get('media_type')
        if m.get('message_type') is not None:
            self.message_type = m.get('message_type')
        if m.get('page_now') is not None:
            self.page_now = m.get('page_now')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('parent_doc_id') is not None:
            self.parent_doc_id = m.get('parent_doc_id')
        if m.get('pos_key_words') is not None:
            self.pos_key_words = m.get('pos_key_words')
        if m.get('pos_keywords_in_title') is not None:
            self.pos_keywords_in_title = m.get('pos_keywords_in_title')
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
        if m.get('topics') is not None:
            self.topics = m.get('topics')
        if m.get('update_time_end') is not None:
            self.update_time_end = m.get('update_time_end')
        if m.get('update_time_start') is not None:
            self.update_time_start = m.get('update_time_start')
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
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询条件
        self.search_condition = search_condition
        # 请求ID
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.search_condition, 'search_condition')
        if self.search_condition:
            self.search_condition.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.search_condition is not None:
            result['search_condition'] = self.search_condition.to_map()
        if self.request_id is not None:
            result['request_id'] = self.request_id
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
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分析类型
        self.analyse_type = analyse_type
        # 查询条件
        self.search_condition = search_condition

    def validate(self):
        self.validate_required(self.analyse_type, 'analyse_type')
        self.validate_required(self.search_condition, 'search_condition')
        if self.search_condition:
            self.search_condition.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.analyse_type is not None:
            result['analyse_type'] = self.analyse_type
        if self.search_condition is not None:
            result['search_condition'] = self.search_condition.to_map()
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
        return self


class SaveAnalysisSubmitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        analysis_id: str = None,
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
        analysis_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分析任务ID
        self.analysis_id = analysis_id

    def validate(self):
        self.validate_required(self.analysis_id, 'analysis_id')

    def to_map(self):
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


class QueryAnalysisQueryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        analysis_id: str = None,
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
        success: bool = None,
        result_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 计量请求是否处理成功
        self.success = success
        # 结果描述信息
        self.result_message = result_message

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
        if self.success is not None:
            result['success'] = self.success
        if self.result_message is not None:
            result['result_message'] = self.result_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('result_message') is not None:
            self.result_message = m.get('result_message')
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
        success: bool = None,
        result_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 计量请求是否处理成功
        self.success = success
        # 结果描述信息
        self.result_message = result_message

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
        if self.success is not None:
            result['success'] = self.success
        if self.result_message is not None:
            result['result_message'] = self.result_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('result_message') is not None:
            self.result_message = m.get('result_message')
        return self


