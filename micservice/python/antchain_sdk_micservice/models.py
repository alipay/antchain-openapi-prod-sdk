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


class SearchedItem(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        biz_id: str = None,
        scene_id: str = None,
        similarity: str = None,
        ext_info: str = None,
    ):
        # 用户id
        self.user_id = user_id
        # 业务流程唯一id
        self.biz_id = biz_id
        # 场景id
        self.scene_id = scene_id
        # 如余弦相似度(-1,1)
        self.similarity = similarity
        # 扩展字段，string类型，json格式
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.similarity, 'similarity')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
        if self.similarity is not None:
            result['similarity'] = self.similarity
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        if m.get('similarity') is not None:
            self.similarity = m.get('similarity')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class FeaturesearchFaceverifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        biz_id: str = None,
        scene_id: str = None,
        feature_type: str = None,
        feature_vector: List[str] = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户id
        self.user_id = user_id
        # 业务流程的唯一id
        self.biz_id = biz_id
        # 场景id
        self.scene_id = scene_id
        # 特征类型
        self.feature_type = feature_type
        # 特征向量，维度要求128/256/512
        self.feature_vector = feature_vector
        # 扩展字段，string类型，json格式
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.scene_id, 'scene_id')
        self.validate_required(self.feature_type, 'feature_type')
        self.validate_required(self.feature_vector, 'feature_vector')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
        if self.feature_type is not None:
            result['feature_type'] = self.feature_type
        if self.feature_vector is not None:
            result['feature_vector'] = self.feature_vector
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        if m.get('feature_type') is not None:
            self.feature_type = m.get('feature_type')
        if m.get('feature_vector') is not None:
            self.feature_vector = m.get('feature_vector')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class FeaturesearchFaceverifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        has_risk: bool = None,
        search_detail: List[SearchedItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否处理成功
        self.success = success
        # 是否有风险，默认false
        self.has_risk = has_risk
        # 搜索结果明细，即搜索到的最相似的N个样本信息
        self.search_detail = search_detail

    def validate(self):
        if self.search_detail:
            for k in self.search_detail:
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
        if self.success is not None:
            result['success'] = self.success
        if self.has_risk is not None:
            result['has_risk'] = self.has_risk
        result['search_detail'] = []
        if self.search_detail is not None:
            for k in self.search_detail:
                result['search_detail'].append(k.to_map() if k else None)
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
        if m.get('has_risk') is not None:
            self.has_risk = m.get('has_risk')
        self.search_detail = []
        if m.get('search_detail') is not None:
            for k in m.get('search_detail'):
                temp_model = SearchedItem()
                self.search_detail.append(temp_model.from_map(k))
        return self


