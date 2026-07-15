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


class DocumentChunkDTO(TeaModel):
    def __init__(
        self,
        content: str = None,
    ):
        # 切片内容
        self.content = content

    def validate(self):
        self.validate_required(self.content, 'content')

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


class DocumentParagraphDTO(TeaModel):
    def __init__(
        self,
        title: str = None,
        content: str = None,
        chunks: List[DocumentChunkDTO] = None,
    ):
        # 段落标题
        self.title = title
        # 段落内容
        self.content = content
        # 切片列表
        self.chunks = chunks

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.content, 'content')
        self.validate_required(self.chunks, 'chunks')
        if self.chunks:
            for k in self.chunks:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.content is not None:
            result['content'] = self.content
        result['chunks'] = []
        if self.chunks is not None:
            for k in self.chunks:
                result['chunks'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('content') is not None:
            self.content = m.get('content')
        self.chunks = []
        if m.get('chunks') is not None:
            for k in m.get('chunks'):
                temp_model = DocumentChunkDTO()
                self.chunks.append(temp_model.from_map(k))
        return self


class SimilarFeatureData(TeaModel):
    def __init__(
        self,
        period: str = None,
        run_day_ahead_price: str = None,
        similar_day_ahead_price: str = None,
        similar_realtime_price: str = None,
        run_preclearing_data: str = None,
        similar_preclearing_data: str = None,
        similar_realtime_data: str = None,
        deviation_data: str = None,
    ):
        # 时间点位
        self.period = period
        # 运行日日前电价
        self.run_day_ahead_price = run_day_ahead_price
        # 相似日日前电价
        self.similar_day_ahead_price = similar_day_ahead_price
        # 相似日实际电价
        self.similar_realtime_price = similar_realtime_price
        # 运行日预出清数据值
        self.run_preclearing_data = run_preclearing_data
        # 相似日预出清数据值
        self.similar_preclearing_data = similar_preclearing_data
        # 相似日实际数据值
        self.similar_realtime_data = similar_realtime_data
        # 预出清数据偏差值, =运行日预出清数据值-相似日预出清数据值
        self.deviation_data = deviation_data

    def validate(self):
        self.validate_required(self.period, 'period')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period is not None:
            result['period'] = self.period
        if self.run_day_ahead_price is not None:
            result['run_day_ahead_price'] = self.run_day_ahead_price
        if self.similar_day_ahead_price is not None:
            result['similar_day_ahead_price'] = self.similar_day_ahead_price
        if self.similar_realtime_price is not None:
            result['similar_realtime_price'] = self.similar_realtime_price
        if self.run_preclearing_data is not None:
            result['run_preclearing_data'] = self.run_preclearing_data
        if self.similar_preclearing_data is not None:
            result['similar_preclearing_data'] = self.similar_preclearing_data
        if self.similar_realtime_data is not None:
            result['similar_realtime_data'] = self.similar_realtime_data
        if self.deviation_data is not None:
            result['deviation_data'] = self.deviation_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('run_day_ahead_price') is not None:
            self.run_day_ahead_price = m.get('run_day_ahead_price')
        if m.get('similar_day_ahead_price') is not None:
            self.similar_day_ahead_price = m.get('similar_day_ahead_price')
        if m.get('similar_realtime_price') is not None:
            self.similar_realtime_price = m.get('similar_realtime_price')
        if m.get('run_preclearing_data') is not None:
            self.run_preclearing_data = m.get('run_preclearing_data')
        if m.get('similar_preclearing_data') is not None:
            self.similar_preclearing_data = m.get('similar_preclearing_data')
        if m.get('similar_realtime_data') is not None:
            self.similar_realtime_data = m.get('similar_realtime_data')
        if m.get('deviation_data') is not None:
            self.deviation_data = m.get('deviation_data')
        return self


class PricePredictionItem(TeaModel):
    def __init__(
        self,
        period: str = None,
        predicted_price: str = None,
        actual_price: str = None,
    ):
        # 时间点位
        self.period = period
        # 预测电价，单位：元/mwh
        self.predicted_price = predicted_price
        # 实际电价，单位：元/mwh
        self.actual_price = actual_price

    def validate(self):
        self.validate_required(self.period, 'period')
        self.validate_required(self.predicted_price, 'predicted_price')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period is not None:
            result['period'] = self.period
        if self.predicted_price is not None:
            result['predicted_price'] = self.predicted_price
        if self.actual_price is not None:
            result['actual_price'] = self.actual_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('predicted_price') is not None:
            self.predicted_price = m.get('predicted_price')
        if m.get('actual_price') is not None:
            self.actual_price = m.get('actual_price')
        return self


class SimilarDayAnalysisData(TeaModel):
    def __init__(
        self,
        com_similar_value: str = None,
        feature_similar_value: str = None,
        similar_feature_data: List[SimilarFeatureData] = None,
    ):
        # 综合相似度，单位%\
        self.com_similar_value = com_similar_value
        # 特征相似度，单位%\
        self.feature_similar_value = feature_similar_value
        # 特征数据列表
        self.similar_feature_data = similar_feature_data

    def validate(self):
        self.validate_required(self.com_similar_value, 'com_similar_value')
        self.validate_required(self.feature_similar_value, 'feature_similar_value')
        self.validate_required(self.similar_feature_data, 'similar_feature_data')
        if self.similar_feature_data:
            for k in self.similar_feature_data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.com_similar_value is not None:
            result['com_similar_value'] = self.com_similar_value
        if self.feature_similar_value is not None:
            result['feature_similar_value'] = self.feature_similar_value
        result['similar_feature_data'] = []
        if self.similar_feature_data is not None:
            for k in self.similar_feature_data:
                result['similar_feature_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('com_similar_value') is not None:
            self.com_similar_value = m.get('com_similar_value')
        if m.get('feature_similar_value') is not None:
            self.feature_similar_value = m.get('feature_similar_value')
        self.similar_feature_data = []
        if m.get('similar_feature_data') is not None:
            for k in m.get('similar_feature_data'):
                temp_model = SimilarFeatureData()
                self.similar_feature_data.append(temp_model.from_map(k))
        return self


class WeatherWarningData(TeaModel):
    def __init__(
        self,
        district: str = None,
        level: str = None,
        severity_color: str = None,
        type: str = None,
        pub_time: str = None,
        warning_start_time: str = None,
        warning_end_time: str = None,
        title: str = None,
        content: str = None,
    ):
        # 区县名
        self.district = district
        # 预警级别
        self.level = level
        # 预警等级
        self.severity_color = severity_color
        # 预警类型
        self.type = type
        # 发布时间
        self.pub_time = pub_time
        # 预警开始时间
        self.warning_start_time = warning_start_time
        # 预警结束时间
        self.warning_end_time = warning_end_time
        # 标题
        self.title = title
        # 预警内容
        self.content = content

    def validate(self):
        self.validate_required(self.district, 'district')
        self.validate_required(self.pub_time, 'pub_time')
        if self.pub_time is not None:
            self.validate_pattern(self.pub_time, 'pub_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.warning_start_time is not None:
            self.validate_pattern(self.warning_start_time, 'warning_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.warning_end_time is not None:
            self.validate_pattern(self.warning_end_time, 'warning_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.title, 'title')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.district is not None:
            result['district'] = self.district
        if self.level is not None:
            result['level'] = self.level
        if self.severity_color is not None:
            result['severity_color'] = self.severity_color
        if self.type is not None:
            result['type'] = self.type
        if self.pub_time is not None:
            result['pub_time'] = self.pub_time
        if self.warning_start_time is not None:
            result['warning_start_time'] = self.warning_start_time
        if self.warning_end_time is not None:
            result['warning_end_time'] = self.warning_end_time
        if self.title is not None:
            result['title'] = self.title
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('district') is not None:
            self.district = m.get('district')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('severity_color') is not None:
            self.severity_color = m.get('severity_color')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('pub_time') is not None:
            self.pub_time = m.get('pub_time')
        if m.get('warning_start_time') is not None:
            self.warning_start_time = m.get('warning_start_time')
        if m.get('warning_end_time') is not None:
            self.warning_end_time = m.get('warning_end_time')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class MarketPrice(TeaModel):
    def __init__(
        self,
        market_code: str = None,
        target_date: str = None,
        query_type: str = None,
        price_type: str = None,
        period: str = None,
        price_value: str = None,
        source_updated_at: str = None,
    ):
        # 市场码
        self.market_code = market_code
        # 目标日期,格式 yyyy-MM-dd
        self.target_date = target_date
        # 查询类型:DAY_AHEAD/REALTIME
        self.query_type = query_type
        # 价格类型
        self.price_type = price_type
        # 时点编号,1~96 整数
        self.period = period
        # 价格值,单位 元/MWh
        self.price_value = price_value
        # 数据源更新时间,ISO8601 格式
        self.source_updated_at = source_updated_at

    def validate(self):
        self.validate_required(self.market_code, 'market_code')
        self.validate_required(self.target_date, 'target_date')
        self.validate_required(self.query_type, 'query_type')
        self.validate_required(self.price_type, 'price_type')
        self.validate_required(self.period, 'period')
        self.validate_required(self.price_value, 'price_value')
        self.validate_required(self.source_updated_at, 'source_updated_at')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.market_code is not None:
            result['market_code'] = self.market_code
        if self.target_date is not None:
            result['target_date'] = self.target_date
        if self.query_type is not None:
            result['query_type'] = self.query_type
        if self.price_type is not None:
            result['price_type'] = self.price_type
        if self.period is not None:
            result['period'] = self.period
        if self.price_value is not None:
            result['price_value'] = self.price_value
        if self.source_updated_at is not None:
            result['source_updated_at'] = self.source_updated_at
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('market_code') is not None:
            self.market_code = m.get('market_code')
        if m.get('target_date') is not None:
            self.target_date = m.get('target_date')
        if m.get('query_type') is not None:
            self.query_type = m.get('query_type')
        if m.get('price_type') is not None:
            self.price_type = m.get('price_type')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('price_value') is not None:
            self.price_value = m.get('price_value')
        if m.get('source_updated_at') is not None:
            self.source_updated_at = m.get('source_updated_at')
        return self


class DocumentInfoDTO(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        file_size: int = None,
        file_type: str = None,
        oss_url: str = None,
        md_5: str = None,
        source: str = None,
        source_ext: str = None,
    ):
        # 文档id
        self.id = id
        # 文档名称
        self.name = name
        # 文件大小
        self.file_size = file_size
        # 文件类型
        self.file_type = file_type
        # oss下载地址
        self.oss_url = oss_url
        # 文件md5
        self.md_5 = md_5
        # 文档来源
        self.source = source
        # 文档提供方的附加信息
        self.source_ext = source_ext

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.file_size, 'file_size')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.oss_url, 'oss_url')
        self.validate_required(self.md_5, 'md_5')
        self.validate_required(self.source, 'source')
        self.validate_required(self.source_ext, 'source_ext')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.oss_url is not None:
            result['oss_url'] = self.oss_url
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.source is not None:
            result['source'] = self.source
        if self.source_ext is not None:
            result['source_ext'] = self.source_ext
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('oss_url') is not None:
            self.oss_url = m.get('oss_url')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('source_ext') is not None:
            self.source_ext = m.get('source_ext')
        return self


class AheadRealtimePriceDiffPredictionData(TeaModel):
    def __init__(
        self,
        period: str = None,
        real_direction: str = None,
        pre_direction: str = None,
        real_day_ahead_diff: str = None,
        pre_day_ahead_diff: str = None,
    ):
        # 时间点位
        self.period = period
        # 实际价差方向
        self.real_direction = real_direction
        # 预测价差方向
        self.pre_direction = pre_direction
        # 实际日前实时价差
        self.real_day_ahead_diff = real_day_ahead_diff
        # 预测日前实时价差
        self.pre_day_ahead_diff = pre_day_ahead_diff

    def validate(self):
        self.validate_required(self.period, 'period')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period is not None:
            result['period'] = self.period
        if self.real_direction is not None:
            result['real_direction'] = self.real_direction
        if self.pre_direction is not None:
            result['pre_direction'] = self.pre_direction
        if self.real_day_ahead_diff is not None:
            result['real_day_ahead_diff'] = self.real_day_ahead_diff
        if self.pre_day_ahead_diff is not None:
            result['pre_day_ahead_diff'] = self.pre_day_ahead_diff
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('real_direction') is not None:
            self.real_direction = m.get('real_direction')
        if m.get('pre_direction') is not None:
            self.pre_direction = m.get('pre_direction')
        if m.get('real_day_ahead_diff') is not None:
            self.real_day_ahead_diff = m.get('real_day_ahead_diff')
        if m.get('pre_day_ahead_diff') is not None:
            self.pre_day_ahead_diff = m.get('pre_day_ahead_diff')
        return self


class EpiAdmEnergyPolicyAttachment(TeaModel):
    def __init__(
        self,
        filename: str = None,
        fileurl: str = None,
    ):
        # 文件名称
        self.filename = filename
        # 文件下载地址
        self.fileurl = fileurl

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.filename is not None:
            result['filename'] = self.filename
        if self.fileurl is not None:
            result['fileurl'] = self.fileurl
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('filename') is not None:
            self.filename = m.get('filename')
        if m.get('fileurl') is not None:
            self.fileurl = m.get('fileurl')
        return self


class BiddingAnalysisData(TeaModel):
    def __init__(
        self,
        period: str = None,
        realtime_data: str = None,
        day_ahead_data: str = None,
        preclearing_data: str = None,
        actual_data: str = None,
        realtime_prediction_data: str = None,
        day_ahead_prediction_data: str = None,
        deviation_data: str = None,
    ):
        # 时间点位
        self.period = period
        # 实时数据
        self.realtime_data = realtime_data
        # 日前数据
        self.day_ahead_data = day_ahead_data
        # 预出清数据
        self.preclearing_data = preclearing_data
        # 实际数据
        self.actual_data = actual_data
        # 实时预测数据
        self.realtime_prediction_data = realtime_prediction_data
        # 日前预测数据
        self.day_ahead_prediction_data = day_ahead_prediction_data
        # 偏差值
        self.deviation_data = deviation_data

    def validate(self):
        self.validate_required(self.period, 'period')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period is not None:
            result['period'] = self.period
        if self.realtime_data is not None:
            result['realtime_data'] = self.realtime_data
        if self.day_ahead_data is not None:
            result['day_ahead_data'] = self.day_ahead_data
        if self.preclearing_data is not None:
            result['preclearing_data'] = self.preclearing_data
        if self.actual_data is not None:
            result['actual_data'] = self.actual_data
        if self.realtime_prediction_data is not None:
            result['realtime_prediction_data'] = self.realtime_prediction_data
        if self.day_ahead_prediction_data is not None:
            result['day_ahead_prediction_data'] = self.day_ahead_prediction_data
        if self.deviation_data is not None:
            result['deviation_data'] = self.deviation_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('realtime_data') is not None:
            self.realtime_data = m.get('realtime_data')
        if m.get('day_ahead_data') is not None:
            self.day_ahead_data = m.get('day_ahead_data')
        if m.get('preclearing_data') is not None:
            self.preclearing_data = m.get('preclearing_data')
        if m.get('actual_data') is not None:
            self.actual_data = m.get('actual_data')
        if m.get('realtime_prediction_data') is not None:
            self.realtime_prediction_data = m.get('realtime_prediction_data')
        if m.get('day_ahead_prediction_data') is not None:
            self.day_ahead_prediction_data = m.get('day_ahead_prediction_data')
        if m.get('deviation_data') is not None:
            self.deviation_data = m.get('deviation_data')
        return self


class DocumentProcessingDataDTO(TeaModel):
    def __init__(
        self,
        paragraphs: List[DocumentParagraphDTO] = None,
        title: str = None,
        content: str = None,
    ):
        # 段落列表
        self.paragraphs = paragraphs
        # 文档标题
        self.title = title
        # 原文内容
        self.content = content

    def validate(self):
        self.validate_required(self.paragraphs, 'paragraphs')
        if self.paragraphs:
            for k in self.paragraphs:
                if k:
                    k.validate()
        self.validate_required(self.title, 'title')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['paragraphs'] = []
        if self.paragraphs is not None:
            for k in self.paragraphs:
                result['paragraphs'].append(k.to_map() if k else None)
        if self.title is not None:
            result['title'] = self.title
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.paragraphs = []
        if m.get('paragraphs') is not None:
            for k in m.get('paragraphs'):
                temp_model = DocumentParagraphDTO()
                self.paragraphs.append(temp_model.from_map(k))
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class AheadRealtimePriceCompareData(TeaModel):
    def __init__(
        self,
        period: str = None,
        realtime_rate: str = None,
        dayahead_rate: str = None,
        equal_rate: str = None,
        deviation_data: str = None,
        realtime_avg: str = None,
        day_ahead_avg: str = None,
        deviation_avg: str = None,
        price_diff: str = None,
        price_diff_avg: str = None,
    ):
        # 时间点位
        self.period = period
        # 日前大于实时占比
        self.realtime_rate = realtime_rate
        # 日前等于实时占比
        self.dayahead_rate = dayahead_rate
        # 日前小于实时占比
        self.equal_rate = equal_rate
        # 偏差值
        self.deviation_data = deviation_data
        # 实时电价均值
        self.realtime_avg = realtime_avg
        # 日前电价均值
        self.day_ahead_avg = day_ahead_avg
        # 偏差均值
        self.deviation_avg = deviation_avg
        # 差价数值
        self.price_diff = price_diff
        # 价差均值
        self.price_diff_avg = price_diff_avg

    def validate(self):
        self.validate_required(self.period, 'period')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period is not None:
            result['period'] = self.period
        if self.realtime_rate is not None:
            result['realtime_rate'] = self.realtime_rate
        if self.dayahead_rate is not None:
            result['dayahead_rate'] = self.dayahead_rate
        if self.equal_rate is not None:
            result['equal_rate'] = self.equal_rate
        if self.deviation_data is not None:
            result['deviation_data'] = self.deviation_data
        if self.realtime_avg is not None:
            result['realtime_avg'] = self.realtime_avg
        if self.day_ahead_avg is not None:
            result['day_ahead_avg'] = self.day_ahead_avg
        if self.deviation_avg is not None:
            result['deviation_avg'] = self.deviation_avg
        if self.price_diff is not None:
            result['price_diff'] = self.price_diff
        if self.price_diff_avg is not None:
            result['price_diff_avg'] = self.price_diff_avg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('realtime_rate') is not None:
            self.realtime_rate = m.get('realtime_rate')
        if m.get('dayahead_rate') is not None:
            self.dayahead_rate = m.get('dayahead_rate')
        if m.get('equal_rate') is not None:
            self.equal_rate = m.get('equal_rate')
        if m.get('deviation_data') is not None:
            self.deviation_data = m.get('deviation_data')
        if m.get('realtime_avg') is not None:
            self.realtime_avg = m.get('realtime_avg')
        if m.get('day_ahead_avg') is not None:
            self.day_ahead_avg = m.get('day_ahead_avg')
        if m.get('deviation_avg') is not None:
            self.deviation_avg = m.get('deviation_avg')
        if m.get('price_diff') is not None:
            self.price_diff = m.get('price_diff')
        if m.get('price_diff_avg') is not None:
            self.price_diff_avg = m.get('price_diff_avg')
        return self


class SnapshotDocumentItem(TeaModel):
    def __init__(
        self,
        node_id: str = None,
        document_id: str = None,
        document_name: str = None,
        file_type: str = None,
        oss_url: str = None,
        md_5: str = None,
        vector_store_map_id: str = None,
        source: str = None,
        source_ext: str = None,
        tags: List[str] = None,
    ):
        # 节点ID
        self.node_id = node_id
        # 文档ID
        self.document_id = document_id
        # 文档名称
        self.document_name = document_name
        # 文件类型
        self.file_type = file_type
        # 下载原文的链接
        self.oss_url = oss_url
        # 原文的md5
        self.md_5 = md_5
        # 向量文档ID
        self.vector_store_map_id = vector_store_map_id
        # 文档来源
        self.source = source
        # 文档来源附带的额外信息
        self.source_ext = source_ext
        # 标签
        self.tags = tags

    def validate(self):
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.document_id, 'document_id')
        self.validate_required(self.document_name, 'document_name')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.oss_url, 'oss_url')
        self.validate_required(self.vector_store_map_id, 'vector_store_map_id')
        self.validate_required(self.source, 'source')
        self.validate_required(self.source_ext, 'source_ext')
        self.validate_required(self.tags, 'tags')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.document_id is not None:
            result['document_id'] = self.document_id
        if self.document_name is not None:
            result['document_name'] = self.document_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.oss_url is not None:
            result['oss_url'] = self.oss_url
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.vector_store_map_id is not None:
            result['vector_store_map_id'] = self.vector_store_map_id
        if self.source is not None:
            result['source'] = self.source
        if self.source_ext is not None:
            result['source_ext'] = self.source_ext
        if self.tags is not None:
            result['tags'] = self.tags
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('document_id') is not None:
            self.document_id = m.get('document_id')
        if m.get('document_name') is not None:
            self.document_name = m.get('document_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('oss_url') is not None:
            self.oss_url = m.get('oss_url')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('vector_store_map_id') is not None:
            self.vector_store_map_id = m.get('vector_store_map_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('source_ext') is not None:
            self.source_ext = m.get('source_ext')
        if m.get('tags') is not None:
            self.tags = m.get('tags')
        return self


class QueryRealtimePriceforecastRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        run_date: str = None,
        busi_type: str = None,
        province: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 运行日期，yyyy-mm-dd
        self.run_date = run_date
        # 业务类型 枚举： REAL_TIME - 实时 DAY_AHEAD - 日前
        # 
        self.busi_type = busi_type
        # 省地区编码，目前仅支持江苏省
        # 
        self.province = province

    def validate(self):
        self.validate_required(self.run_date, 'run_date')
        self.validate_required(self.busi_type, 'busi_type')
        self.validate_required(self.province, 'province')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.run_date is not None:
            result['run_date'] = self.run_date
        if self.busi_type is not None:
            result['busi_type'] = self.busi_type
        if self.province is not None:
            result['province'] = self.province
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('run_date') is not None:
            self.run_date = m.get('run_date')
        if m.get('busi_type') is not None:
            self.busi_type = m.get('busi_type')
        if m.get('province') is not None:
            self.province = m.get('province')
        return self


class QueryRealtimePriceforecastResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[PricePredictionItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 电价预测结果
        # 
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
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
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
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
                temp_model = PricePredictionItem()
                self.result.append(temp_model.from_map(k))
        return self


class QueryBiddingspaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        query_date: str = None,
        busi_type: str = None,
        deviation_type: str = None,
        province: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 运行日期，yyyy-mm-dd
        self.query_date = query_date
        # 业务类型枚举，枚举范围如下
        # BIDDING_SPACE: 竞价空间
        # 
        self.busi_type = busi_type
        # 业务偏差类型枚举，枚举范围：
        # DAY_AHEAD_ACTUAL: 日前-实际
        # DAY_AHEAD_FORECAST: 日前-预测
        # PRE_CLEARING_ACTUAL: 预出清-实际
        # PRE_CLEARING_FORECAST: 预出清-预测
        # ACTUAL_FORECAST: 实际-预测
        # PRE_CLEARING: 预出清
        # DAY_AHEAD: 日前
        # REAL_TIME: 实时
        # ACTUAL: 实际
        self.deviation_type = deviation_type
        # 省地区编码，目前仅支持江苏省
        self.province = province

    def validate(self):
        self.validate_required(self.query_date, 'query_date')
        self.validate_required(self.busi_type, 'busi_type')
        self.validate_required(self.deviation_type, 'deviation_type')
        self.validate_required(self.province, 'province')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.query_date is not None:
            result['query_date'] = self.query_date
        if self.busi_type is not None:
            result['busi_type'] = self.busi_type
        if self.deviation_type is not None:
            result['deviation_type'] = self.deviation_type
        if self.province is not None:
            result['province'] = self.province
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('query_date') is not None:
            self.query_date = m.get('query_date')
        if m.get('busi_type') is not None:
            self.busi_type = m.get('busi_type')
        if m.get('deviation_type') is not None:
            self.deviation_type = m.get('deviation_type')
        if m.get('province') is not None:
            self.province = m.get('province')
        return self


class QueryBiddingspaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        bidding_analysis: List[BiddingAnalysisData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 竞价空间分析
        self.bidding_analysis = bidding_analysis

    def validate(self):
        if self.bidding_analysis:
            for k in self.bidding_analysis:
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
        result['bidding_analysis'] = []
        if self.bidding_analysis is not None:
            for k in self.bidding_analysis:
                result['bidding_analysis'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.bidding_analysis = []
        if m.get('bidding_analysis') is not None:
            for k in m.get('bidding_analysis'):
                temp_model = BiddingAnalysisData()
                self.bidding_analysis.append(temp_model.from_map(k))
        return self


class QuerySimilardayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        run_date: str = None,
        similar_start_date: str = None,
        similar_end_date: str = None,
        similar_feature_type: str = None,
        province: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 运行日，格式：yyyy-mm-dd
        self.run_date = run_date
        # 相似日范围开始日，格式：yyyy-mm-dd
        self.similar_start_date = similar_start_date
        # 相似日范围结束日，yyyy-MM-dd
        self.similar_end_date = similar_end_date
        # 相似特征类型枚举，枚举范围
        # BIDDING_SPACE: 竞价空间
        # PROVINCIAL_DISPATCH_LOAD: 省调负荷
        # NEW_ENERGY_OUTPUT: 新能源出力
        # INTERCONNECTION_PLAN: 联络线计划
        self.similar_feature_type = similar_feature_type
        # 省地区编码，目前仅支持江苏省
        self.province = province

    def validate(self):
        self.validate_required(self.run_date, 'run_date')
        self.validate_required(self.similar_start_date, 'similar_start_date')
        self.validate_required(self.similar_end_date, 'similar_end_date')
        self.validate_required(self.similar_feature_type, 'similar_feature_type')
        self.validate_required(self.province, 'province')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.run_date is not None:
            result['run_date'] = self.run_date
        if self.similar_start_date is not None:
            result['similar_start_date'] = self.similar_start_date
        if self.similar_end_date is not None:
            result['similar_end_date'] = self.similar_end_date
        if self.similar_feature_type is not None:
            result['similar_feature_type'] = self.similar_feature_type
        if self.province is not None:
            result['province'] = self.province
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('run_date') is not None:
            self.run_date = m.get('run_date')
        if m.get('similar_start_date') is not None:
            self.similar_start_date = m.get('similar_start_date')
        if m.get('similar_end_date') is not None:
            self.similar_end_date = m.get('similar_end_date')
        if m.get('similar_feature_type') is not None:
            self.similar_feature_type = m.get('similar_feature_type')
        if m.get('province') is not None:
            self.province = m.get('province')
        return self


class QuerySimilardayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        similar_day: str = None,
        analysis_result: List[SimilarDayAnalysisData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询范围内容的最接近相似日，格式：yyyy-MM-dd
        self.similar_day = similar_day
        # 相似日分析结果
        self.analysis_result = analysis_result

    def validate(self):
        if self.analysis_result:
            for k in self.analysis_result:
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
        if self.similar_day is not None:
            result['similar_day'] = self.similar_day
        result['analysis_result'] = []
        if self.analysis_result is not None:
            for k in self.analysis_result:
                result['analysis_result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('similar_day') is not None:
            self.similar_day = m.get('similar_day')
        self.analysis_result = []
        if m.get('analysis_result') is not None:
            for k in m.get('analysis_result'):
                temp_model = SimilarDayAnalysisData()
                self.analysis_result.append(temp_model.from_map(k))
        return self


class QueryAheadrealtimePricecompareRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        run_date: str = None,
        province: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 运行日，格式：yyyy-mm-dd
        self.run_date = run_date
        # 省地区编码，目前仅支持江苏省
        self.province = province

    def validate(self):
        self.validate_required(self.run_date, 'run_date')
        self.validate_required(self.province, 'province')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.run_date is not None:
            result['run_date'] = self.run_date
        if self.province is not None:
            result['province'] = self.province
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('run_date') is not None:
            self.run_date = m.get('run_date')
        if m.get('province') is not None:
            self.province = m.get('province')
        return self


class QueryAheadrealtimePricecompareResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        price_compare: List[AheadRealtimePriceCompareData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 电价对比点位
        self.price_compare = price_compare

    def validate(self):
        if self.price_compare:
            for k in self.price_compare:
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
        result['price_compare'] = []
        if self.price_compare is not None:
            for k in self.price_compare:
                result['price_compare'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.price_compare = []
        if m.get('price_compare') is not None:
            for k in m.get('price_compare'):
                temp_model = AheadRealtimePriceCompareData()
                self.price_compare.append(temp_model.from_map(k))
        return self


class QueryAheadrealtimePricediffpredictionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        run_date: str = None,
        province: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 运行日，格式：yyyy-mm-dd
        self.run_date = run_date
        # 省份行政编码，目前仅支持江苏省
        self.province = province

    def validate(self):
        self.validate_required(self.run_date, 'run_date')
        self.validate_required(self.province, 'province')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.run_date is not None:
            result['run_date'] = self.run_date
        if self.province is not None:
            result['province'] = self.province
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('run_date') is not None:
            self.run_date = m.get('run_date')
        if m.get('province') is not None:
            self.province = m.get('province')
        return self


class QueryAheadrealtimePricediffpredictionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pre_accuracy: str = None,
        pv_pre_accuracy: str = None,
        price_diff_prediction_list: List[AheadRealtimePriceDiffPredictionData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 全天价差方向预测准确率
        self.pre_accuracy = pre_accuracy
        # 光伏价差方向预测准确率
        self.pv_pre_accuracy = pv_pre_accuracy
        # 价差预测列表
        self.price_diff_prediction_list = price_diff_prediction_list

    def validate(self):
        if self.price_diff_prediction_list:
            for k in self.price_diff_prediction_list:
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
        if self.pre_accuracy is not None:
            result['pre_accuracy'] = self.pre_accuracy
        if self.pv_pre_accuracy is not None:
            result['pv_pre_accuracy'] = self.pv_pre_accuracy
        result['price_diff_prediction_list'] = []
        if self.price_diff_prediction_list is not None:
            for k in self.price_diff_prediction_list:
                result['price_diff_prediction_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pre_accuracy') is not None:
            self.pre_accuracy = m.get('pre_accuracy')
        if m.get('pv_pre_accuracy') is not None:
            self.pv_pre_accuracy = m.get('pv_pre_accuracy')
        self.price_diff_prediction_list = []
        if m.get('price_diff_prediction_list') is not None:
            for k in m.get('price_diff_prediction_list'):
                temp_model = AheadRealtimePriceDiffPredictionData()
                self.price_diff_prediction_list.append(temp_model.from_map(k))
        return self


class QueryWeatherWarningRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        province: str = None,
        query_date: str = None,
        city: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 省份行政编码
        self.province = province
        # 查询日期，格式：yyyy-MM-dd
        self.query_date = query_date
        # 城市行政编码
        self.city = city

    def validate(self):
        self.validate_required(self.province, 'province')
        self.validate_required(self.city, 'city')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.province is not None:
            result['province'] = self.province
        if self.query_date is not None:
            result['query_date'] = self.query_date
        if self.city is not None:
            result['city'] = self.city
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('query_date') is not None:
            self.query_date = m.get('query_date')
        if m.get('city') is not None:
            self.city = m.get('city')
        return self


class QueryWeatherWarningResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        warning_info: List[WeatherWarningData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 气象预警信息
        self.warning_info = warning_info

    def validate(self):
        if self.warning_info:
            for k in self.warning_info:
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
        result['warning_info'] = []
        if self.warning_info is not None:
            for k in self.warning_info:
                result['warning_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.warning_info = []
        if m.get('warning_info') is not None:
            for k in m.get('warning_info'):
                temp_model = WeatherWarningData()
                self.warning_info.append(temp_model.from_map(k))
        return self


class QueryKmVersionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tree_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 树ID
        self.tree_id = tree_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        return self


class QueryKmVersionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tree_id: str = None,
        version: str = None,
        description: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 树ID
        self.tree_id = tree_id
        # 版本
        self.version = version
        # 描述
        self.description = description

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
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.version is not None:
            result['version'] = self.version
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class SyncKmVersionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tree_id: str = None,
        tree_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 树ID
        self.tree_id = tree_id
        # 版本号
        self.tree_version = tree_version

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.tree_version, 'tree_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.tree_version is not None:
            result['tree_version'] = self.tree_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('tree_version') is not None:
            self.tree_version = m.get('tree_version')
        return self


class SyncKmVersionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tree_id: str = None,
        version: str = None,
        snapshot: str = None,
        documents: List[SnapshotDocumentItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 树ID
        self.tree_id = tree_id
        # 版本
        self.version = version
        # 快照原文
        self.snapshot = snapshot
        # 版本关联的文档详情列表
        self.documents = documents

    def validate(self):
        if self.documents:
            for k in self.documents:
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
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.version is not None:
            result['version'] = self.version
        if self.snapshot is not None:
            result['snapshot'] = self.snapshot
        result['documents'] = []
        if self.documents is not None:
            for k in self.documents:
                result['documents'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('snapshot') is not None:
            self.snapshot = m.get('snapshot')
        self.documents = []
        if m.get('documents') is not None:
            for k in m.get('documents'):
                temp_model = SnapshotDocumentItem()
                self.documents.append(temp_model.from_map(k))
        return self


class SyncKmDocumentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tree_id: str = None,
        node_id: str = None,
        doc_map_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 树ID
        self.tree_id = tree_id
        # 节点ID
        self.node_id = node_id
        # 向量文档ID
        self.doc_map_id = doc_map_id

    def validate(self):
        self.validate_required(self.tree_id, 'tree_id')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.doc_map_id, 'doc_map_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.doc_map_id is not None:
            result['doc_map_id'] = self.doc_map_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('doc_map_id') is not None:
            self.doc_map_id = m.get('doc_map_id')
        return self


class SyncKmDocumentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        document_info: DocumentInfoDTO = None,
        doc_map_id: str = None,
        processed_data: DocumentProcessingDataDTO = None,
        oss_preview_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文档基础信息
        self.document_info = document_info
        # 向量文档id
        self.doc_map_id = doc_map_id
        # 加工后的文档数据
        self.processed_data = processed_data
        # oss预览地址
        self.oss_preview_url = oss_preview_url

    def validate(self):
        if self.document_info:
            self.document_info.validate()
        if self.processed_data:
            self.processed_data.validate()

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
        if self.document_info is not None:
            result['document_info'] = self.document_info.to_map()
        if self.doc_map_id is not None:
            result['doc_map_id'] = self.doc_map_id
        if self.processed_data is not None:
            result['processed_data'] = self.processed_data.to_map()
        if self.oss_preview_url is not None:
            result['oss_preview_url'] = self.oss_preview_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('document_info') is not None:
            temp_model = DocumentInfoDTO()
            self.document_info = temp_model.from_map(m['document_info'])
        if m.get('doc_map_id') is not None:
            self.doc_map_id = m.get('doc_map_id')
        if m.get('processed_data') is not None:
            temp_model = DocumentProcessingDataDTO()
            self.processed_data = temp_model.from_map(m['processed_data'])
        if m.get('oss_preview_url') is not None:
            self.oss_preview_url = m.get('oss_preview_url')
        return self


class QueryKmRagRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        query: str = None,
        knowledge_base_ids: List[str] = None,
        topk: int = None,
        include_references: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户问题
        self.query = query
        # 子范围标识（目录树），用于缩小召回范围；不传则不限范围
        self.knowledge_base_ids = knowledge_base_ids
        # 召回条数
        self.topk = topk
        # 是否包含引用来源
        self.include_references = include_references

    def validate(self):
        self.validate_required(self.query, 'query')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.query is not None:
            result['query'] = self.query
        if self.knowledge_base_ids is not None:
            result['knowledge_base_ids'] = self.knowledge_base_ids
        if self.topk is not None:
            result['topk'] = self.topk
        if self.include_references is not None:
            result['include_references'] = self.include_references
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('knowledge_base_ids') is not None:
            self.knowledge_base_ids = m.get('knowledge_base_ids')
        if m.get('topk') is not None:
            self.topk = m.get('topk')
        if m.get('include_references') is not None:
            self.include_references = m.get('include_references')
        return self


class QueryKmRagResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        answer: str = None,
        confidence: int = None,
        references: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 答案
        self.answer = answer
        # 置信度
        self.confidence = confidence
        # 引用来源
        self.references = references

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
        if self.answer is not None:
            result['answer'] = self.answer
        if self.confidence is not None:
            result['confidence'] = self.confidence
        if self.references is not None:
            result['references'] = self.references
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('answer') is not None:
            self.answer = m.get('answer')
        if m.get('confidence') is not None:
            self.confidence = m.get('confidence')
        if m.get('references') is not None:
            self.references = m.get('references')
        return self


class QueryPanoraindexPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        title: str = None,
        titleorregionlike: str = None,
        pagesize: int = None,
        orderby: str = None,
        orderdirection: str = None,
        minid: int = None,
        pagenum: int = None,
        websitecode: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 根据标题模糊搜搜
        self.title = title
        # 根据标题或地区模糊搜索
        self.titleorregionlike = titleorregionlike
        # 一页数据量，最大100
        self.pagesize = pagesize
        # 排序字段
        self.orderby = orderby
        # 排序方向（ASC/DESC，默认为DESC）
        self.orderdirection = orderdirection
        # 最小id，用于游标翻页
        self.minid = minid
        # 页号
        self.pagenum = pagenum
        # 来源网站code码，可批量查询最多填15个
        self.websitecode = websitecode

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.title is not None:
            result['title'] = self.title
        if self.titleorregionlike is not None:
            result['titleorregionlike'] = self.titleorregionlike
        if self.pagesize is not None:
            result['pagesize'] = self.pagesize
        if self.orderby is not None:
            result['orderby'] = self.orderby
        if self.orderdirection is not None:
            result['orderdirection'] = self.orderdirection
        if self.minid is not None:
            result['minid'] = self.minid
        if self.pagenum is not None:
            result['pagenum'] = self.pagenum
        if self.websitecode is not None:
            result['websitecode'] = self.websitecode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('titleorregionlike') is not None:
            self.titleorregionlike = m.get('titleorregionlike')
        if m.get('pagesize') is not None:
            self.pagesize = m.get('pagesize')
        if m.get('orderby') is not None:
            self.orderby = m.get('orderby')
        if m.get('orderdirection') is not None:
            self.orderdirection = m.get('orderdirection')
        if m.get('minid') is not None:
            self.minid = m.get('minid')
        if m.get('pagenum') is not None:
            self.pagenum = m.get('pagenum')
        if m.get('websitecode') is not None:
            self.websitecode = m.get('websitecode')
        return self


class QueryPanoraindexPolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: int = None,
        title: str = None,
        content: str = None,
        attachmentdatalist: List[EpiAdmEnergyPolicyAttachment] = None,
        sourceurl: str = None,
        releasedate: str = None,
        issuingbody: str = None,
        region: str = None,
        category: str = None,
        policynumber: str = None,
        websitecode: str = None,
        websitename: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 唯一主键
        self.id = id
        # 标题
        self.title = title
        # 政策正文内容
        self.content = content
        # 附件list详情
        self.attachmentdatalist = attachmentdatalist
        # 原文链接
        self.sourceurl = sourceurl
        # 政策发布日期
        self.releasedate = releasedate
        # 披露主体
        self.issuingbody = issuingbody
        # 政策对应的区域
        self.region = region
        # 政策分类
        self.category = category
        # 政策文号
        self.policynumber = policynumber
        # 来源网站Code码
        self.websitecode = websitecode
        # 来源网站名称
        self.websitename = websitename

    def validate(self):
        if self.attachmentdatalist:
            for k in self.attachmentdatalist:
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
        if self.id is not None:
            result['id'] = self.id
        if self.title is not None:
            result['title'] = self.title
        if self.content is not None:
            result['content'] = self.content
        result['attachmentdatalist'] = []
        if self.attachmentdatalist is not None:
            for k in self.attachmentdatalist:
                result['attachmentdatalist'].append(k.to_map() if k else None)
        if self.sourceurl is not None:
            result['sourceurl'] = self.sourceurl
        if self.releasedate is not None:
            result['releasedate'] = self.releasedate
        if self.issuingbody is not None:
            result['issuingbody'] = self.issuingbody
        if self.region is not None:
            result['region'] = self.region
        if self.category is not None:
            result['category'] = self.category
        if self.policynumber is not None:
            result['policynumber'] = self.policynumber
        if self.websitecode is not None:
            result['websitecode'] = self.websitecode
        if self.websitename is not None:
            result['websitename'] = self.websitename
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
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('content') is not None:
            self.content = m.get('content')
        self.attachmentdatalist = []
        if m.get('attachmentdatalist') is not None:
            for k in m.get('attachmentdatalist'):
                temp_model = EpiAdmEnergyPolicyAttachment()
                self.attachmentdatalist.append(temp_model.from_map(k))
        if m.get('sourceurl') is not None:
            self.sourceurl = m.get('sourceurl')
        if m.get('releasedate') is not None:
            self.releasedate = m.get('releasedate')
        if m.get('issuingbody') is not None:
            self.issuingbody = m.get('issuingbody')
        if m.get('region') is not None:
            self.region = m.get('region')
        if m.get('category') is not None:
            self.category = m.get('category')
        if m.get('policynumber') is not None:
            self.policynumber = m.get('policynumber')
        if m.get('websitecode') is not None:
            self.websitecode = m.get('websitecode')
        if m.get('websitename') is not None:
            self.websitename = m.get('websitename')
        return self


class QueryTraderesultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class QueryTraderesultResponse(TeaModel):
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


class QueryElectricMarketpriceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        market_code: str = None,
        query_type_list: List[str] = None,
        query_date_start: str = None,
        query_date_end: str = None,
        query_date_list: List[str] = None,
        period_start: int = None,
        period_end: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 市场码
        self.market_code = market_code
        # 查询类型:DAY_AHEAD 日前预测 / REALTIME 实时,可单传或都传
        self.query_type_list = query_type_list
        # 查询日期起始,格式 yyyy-MM-dd,与 query_date_end 配套闭区间,最多7天,与 query_date_list 二选一
        self.query_date_start = query_date_start
        # 查询日期结束,格式 yyyy-MM-dd,与 query_date_start 配套闭区间,最多7天,与 query_date_list 二选一
        self.query_date_end = query_date_end
        # 查询日期列表,格式 yyyy-MM-dd,与 start/end 二选一,最多7个
        self.query_date_list = query_date_list
        # 时点起始,1~96 整数,不传默认1
        self.period_start = period_start
        # 时点结束,1~96 整数,不传默认96
        self.period_end = period_end

    def validate(self):
        self.validate_required(self.market_code, 'market_code')
        self.validate_required(self.query_type_list, 'query_type_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.market_code is not None:
            result['market_code'] = self.market_code
        if self.query_type_list is not None:
            result['query_type_list'] = self.query_type_list
        if self.query_date_start is not None:
            result['query_date_start'] = self.query_date_start
        if self.query_date_end is not None:
            result['query_date_end'] = self.query_date_end
        if self.query_date_list is not None:
            result['query_date_list'] = self.query_date_list
        if self.period_start is not None:
            result['period_start'] = self.period_start
        if self.period_end is not None:
            result['period_end'] = self.period_end
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('market_code') is not None:
            self.market_code = m.get('market_code')
        if m.get('query_type_list') is not None:
            self.query_type_list = m.get('query_type_list')
        if m.get('query_date_start') is not None:
            self.query_date_start = m.get('query_date_start')
        if m.get('query_date_end') is not None:
            self.query_date_end = m.get('query_date_end')
        if m.get('query_date_list') is not None:
            self.query_date_list = m.get('query_date_list')
        if m.get('period_start') is not None:
            self.period_start = m.get('period_start')
        if m.get('period_end') is not None:
            self.period_end = m.get('period_end')
        return self


class QueryElectricMarketpriceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
        data: List[MarketPrice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回记录总数
        self.total_count = total_count
        # 市场价格列表
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
        if self.total_count is not None:
            result['total_count'] = self.total_count
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
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = MarketPrice()
                self.data.append(temp_model.from_map(k))
        return self


