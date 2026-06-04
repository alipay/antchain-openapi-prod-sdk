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


class InfoSecHitDetectItem(TeaModel):
    def __init__(
        self,
        detect_type_code: str = None,
        hit_detect_resource: str = None,
        hit_content: str = None,
        detect_resource_level: str = None,
    ):
        # 123
        self.detect_type_code = detect_type_code
        # 123
        self.hit_detect_resource = hit_detect_resource
        # 123
        self.hit_content = hit_content
        # 123
        self.detect_resource_level = detect_resource_level

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.detect_type_code is not None:
            result['detect_type_code'] = self.detect_type_code
        if self.hit_detect_resource is not None:
            result['hit_detect_resource'] = self.hit_detect_resource
        if self.hit_content is not None:
            result['hit_content'] = self.hit_content
        if self.detect_resource_level is not None:
            result['detect_resource_level'] = self.detect_resource_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('detect_type_code') is not None:
            self.detect_type_code = m.get('detect_type_code')
        if m.get('hit_detect_resource') is not None:
            self.hit_detect_resource = m.get('hit_detect_resource')
        if m.get('hit_content') is not None:
            self.hit_content = m.get('hit_content')
        if m.get('detect_resource_level') is not None:
            self.detect_resource_level = m.get('detect_resource_level')
        return self


class ContentAddress(TeaModel):
    def __init__(
        self,
        is_django_url: bool = None,
        address: str = None,
        http_url: str = None,
        audio_type: str = None,
    ):
        # 123
        self.is_django_url = is_django_url
        # 213
        self.address = address
        # 123
        self.http_url = http_url
        # 123
        self.audio_type = audio_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.is_django_url is not None:
            result['is_django_url'] = self.is_django_url
        if self.address is not None:
            result['address'] = self.address
        if self.http_url is not None:
            result['http_url'] = self.http_url
        if self.audio_type is not None:
            result['audio_type'] = self.audio_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('is_django_url') is not None:
            self.is_django_url = m.get('is_django_url')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('http_url') is not None:
            self.http_url = m.get('http_url')
        if m.get('audio_type') is not None:
            self.audio_type = m.get('audio_type')
        return self


class SecurityRiskContentAnalyzeResponse(TeaModel):
    def __init__(
        self,
        app_scene_data_id: str = None,
        event_id: str = None,
        need_query: str = None,
        result_action: str = None,
        hit_detect_items: List[InfoSecHitDetectItem] = None,
        risk_labels: str = None,
    ):
        # 场景id
        self.app_scene_data_id = app_scene_data_id
        # 返回事件码，用于异步查询
        self.event_id = event_id
        # 是否需要异步查询
        self.need_query = need_query
        # 返回结果
        self.result_action = result_action
        # 命中场景
        self.hit_detect_items = hit_detect_items
        # 描述被命中的风险标签
        self.risk_labels = risk_labels

    def validate(self):
        if self.hit_detect_items:
            for k in self.hit_detect_items:
                if k:
                    k.validate()
        self.validate_required(self.risk_labels, 'risk_labels')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_scene_data_id is not None:
            result['app_scene_data_id'] = self.app_scene_data_id
        if self.event_id is not None:
            result['event_id'] = self.event_id
        if self.need_query is not None:
            result['need_query'] = self.need_query
        if self.result_action is not None:
            result['result_action'] = self.result_action
        result['hit_detect_items'] = []
        if self.hit_detect_items is not None:
            for k in self.hit_detect_items:
                result['hit_detect_items'].append(k.to_map() if k else None)
        if self.risk_labels is not None:
            result['risk_labels'] = self.risk_labels
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_scene_data_id') is not None:
            self.app_scene_data_id = m.get('app_scene_data_id')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        if m.get('need_query') is not None:
            self.need_query = m.get('need_query')
        if m.get('result_action') is not None:
            self.result_action = m.get('result_action')
        self.hit_detect_items = []
        if m.get('hit_detect_items') is not None:
            for k in m.get('hit_detect_items'):
                temp_model = InfoSecHitDetectItem()
                self.hit_detect_items.append(temp_model.from_map(k))
        if m.get('risk_labels') is not None:
            self.risk_labels = m.get('risk_labels')
        return self


class ContentProperty(TeaModel):
    def __init__(
        self,
        text: str = None,
        text_list: List[str] = None,
        urls: List[str] = None,
        pictures: List[ContentAddress] = None,
        videos: List[ContentAddress] = None,
        audios: List[ContentAddress] = None,
    ):
        # 123
        self.text = text
        # 213
        self.text_list = text_list
        # 123
        self.urls = urls
        # 123
        self.pictures = pictures
        # 123
        self.videos = videos
        # 123
        self.audios = audios

    def validate(self):
        if self.pictures:
            for k in self.pictures:
                if k:
                    k.validate()
        if self.videos:
            for k in self.videos:
                if k:
                    k.validate()
        if self.audios:
            for k in self.audios:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.text is not None:
            result['text'] = self.text
        if self.text_list is not None:
            result['text_list'] = self.text_list
        if self.urls is not None:
            result['urls'] = self.urls
        result['pictures'] = []
        if self.pictures is not None:
            for k in self.pictures:
                result['pictures'].append(k.to_map() if k else None)
        result['videos'] = []
        if self.videos is not None:
            for k in self.videos:
                result['videos'].append(k.to_map() if k else None)
        result['audios'] = []
        if self.audios is not None:
            for k in self.audios:
                result['audios'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('text_list') is not None:
            self.text_list = m.get('text_list')
        if m.get('urls') is not None:
            self.urls = m.get('urls')
        self.pictures = []
        if m.get('pictures') is not None:
            for k in m.get('pictures'):
                temp_model = ContentAddress()
                self.pictures.append(temp_model.from_map(k))
        self.videos = []
        if m.get('videos') is not None:
            for k in m.get('videos'):
                temp_model = ContentAddress()
                self.videos.append(temp_model.from_map(k))
        self.audios = []
        if m.get('audios') is not None:
            for k in m.get('audios'):
                temp_model = ContentAddress()
                self.audios.append(temp_model.from_map(k))
        return self


class SecurityRiskContentResultGetResponse(TeaModel):
    def __init__(
        self,
        hit_detect_items: List[InfoSecHitDetectItem] = None,
        result_action: str = None,
    ):
        # 命中次数
        self.hit_detect_items = hit_detect_items
        # 返回结果
        self.result_action = result_action

    def validate(self):
        if self.hit_detect_items:
            for k in self.hit_detect_items:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['hit_detect_items'] = []
        if self.hit_detect_items is not None:
            for k in self.hit_detect_items:
                result['hit_detect_items'].append(k.to_map() if k else None)
        if self.result_action is not None:
            result['result_action'] = self.result_action
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.hit_detect_items = []
        if m.get('hit_detect_items') is not None:
            for k in m.get('hit_detect_items'):
                temp_model = InfoSecHitDetectItem()
                self.hit_detect_items.append(temp_model.from_map(k))
        if m.get('result_action') is not None:
            self.result_action = m.get('result_action')
        return self


class KeyContentPropertyPair(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: ContentProperty = None,
    ):
        # 123
        self.key = key
        # 123
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')
        if self.value:
            self.value.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            temp_model = ContentProperty()
            self.value = temp_model.from_map(m['value'])
        return self


class InfoSecContentQueryResult(TeaModel):
    def __init__(
        self,
        detect_resource_level: str = None,
        detect_type_code: str = None,
        hit_content: str = None,
        hit_detect_resource: str = None,
    ):
        # 检测来源等级
        self.detect_resource_level = detect_resource_level
        # 检测结果类型
        self.detect_type_code = detect_type_code
        # 命中内容
        self.hit_content = hit_content
        # 检测命中来源
        self.hit_detect_resource = hit_detect_resource

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.detect_resource_level is not None:
            result['detect_resource_level'] = self.detect_resource_level
        if self.detect_type_code is not None:
            result['detect_type_code'] = self.detect_type_code
        if self.hit_content is not None:
            result['hit_content'] = self.hit_content
        if self.hit_detect_resource is not None:
            result['hit_detect_resource'] = self.hit_detect_resource
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('detect_resource_level') is not None:
            self.detect_resource_level = m.get('detect_resource_level')
        if m.get('detect_type_code') is not None:
            self.detect_type_code = m.get('detect_type_code')
        if m.get('hit_content') is not None:
            self.hit_content = m.get('hit_content')
        if m.get('hit_detect_resource') is not None:
            self.hit_detect_resource = m.get('hit_detect_resource')
        return self


class ContentQueryResultModel(TeaModel):
    def __init__(
        self,
        code: int = None,
        err_msg: str = None,
        model: SecurityRiskContentResultGetResponse = None,
    ):
        # 返回结果码
        self.code = code
        # 返回错误码
        self.err_msg = err_msg
        # 返回结果
        self.model = model

    def validate(self):
        if self.model:
            self.model.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.err_msg is not None:
            result['err_msg'] = self.err_msg
        if self.model is not None:
            result['model'] = self.model.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('err_msg') is not None:
            self.err_msg = m.get('err_msg')
        if m.get('model') is not None:
            temp_model = SecurityRiskContentResultGetResponse()
            self.model = temp_model.from_map(m['model'])
        return self


class HoloxCheckResult(TeaModel):
    def __init__(
        self,
        sucess: bool = None,
        id: str = None,
        scene_code: str = None,
        result_code: str = None,
        error_code: str = None,
        result_message: str = None,
        warn_action: str = None,
        content_property_output_result_map: str = None,
        hit_result_items: str = None,
    ):
        # 是否成功
        self.sucess = sucess
        # 本次调用id
        self.id = id
        # 场景码
        self.scene_code = scene_code
        # 结果码
        self.result_code = result_code
        # 错误码
        self.error_code = error_code
        # 结果信息
        self.result_message = result_message
        # 213
        self.warn_action = warn_action
        # 123
        self.content_property_output_result_map = content_property_output_result_map
        # 213
        self.hit_result_items = hit_result_items

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.content_property_output_result_map, 'content_property_output_result_map')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sucess is not None:
            result['sucess'] = self.sucess
        if self.id is not None:
            result['id'] = self.id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.result_message is not None:
            result['result_message'] = self.result_message
        if self.warn_action is not None:
            result['warn_action'] = self.warn_action
        if self.content_property_output_result_map is not None:
            result['content_property_output_result_map'] = self.content_property_output_result_map
        if self.hit_result_items is not None:
            result['hit_result_items'] = self.hit_result_items
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sucess') is not None:
            self.sucess = m.get('sucess')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('result_message') is not None:
            self.result_message = m.get('result_message')
        if m.get('warn_action') is not None:
            self.warn_action = m.get('warn_action')
        if m.get('content_property_output_result_map') is not None:
            self.content_property_output_result_map = m.get('content_property_output_result_map')
        if m.get('hit_result_items') is not None:
            self.hit_result_items = m.get('hit_result_items')
        return self


class RdsAnalyzeResponse(TeaModel):
    def __init__(
        self,
        success: bool = None,
        message: str = None,
        data: str = None,
    ):
        # 请求是否成功
        self.success = success
        # 返回信息
        self.message = message
        # 返回数据
        self.data = data

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.message, 'message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class InfoSecContentQuery(TeaModel):
    def __init__(
        self,
        app_scene: str = None,
        app_scene_data_id: str = None,
        event_id: str = None,
    ):
        # 123
        self.app_scene = app_scene
        # 123
        self.app_scene_data_id = app_scene_data_id
        # 123
        self.event_id = event_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.app_scene is not None:
            result['app_scene'] = self.app_scene
        if self.app_scene_data_id is not None:
            result['app_scene_data_id'] = self.app_scene_data_id
        if self.event_id is not None:
            result['event_id'] = self.event_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_scene') is not None:
            self.app_scene = m.get('app_scene')
        if m.get('app_scene_data_id') is not None:
            self.app_scene_data_id = m.get('app_scene_data_id')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        return self


class ResultModel(TeaModel):
    def __init__(
        self,
        code: int = None,
        err_msg: str = None,
        model: SecurityRiskContentAnalyzeResponse = None,
    ):
        # 返回结果
        self.code = code
        # 返回错误信息
        self.err_msg = err_msg
        # 返回具体结果
        self.model = model

    def validate(self):
        if self.model:
            self.model.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.err_msg is not None:
            result['err_msg'] = self.err_msg
        if self.model is not None:
            result['model'] = self.model.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('err_msg') is not None:
            self.err_msg = m.get('err_msg')
        if m.get('model') is not None:
            temp_model = SecurityRiskContentAnalyzeResponse()
            self.model = temp_model.from_map(m['model'])
        return self


class RdsAnalyzeRequest(TeaModel):
    def __init__(
        self,
        appid: str = None,
        biz_no: str = None,
        scene: str = None,
        token: str = None,
        data: str = None,
        extra: str = None,
    ):
        # 123
        self.appid = appid
        # 123
        self.biz_no = biz_no
        # 213
        self.scene = scene
        # 123
        self.token = token
        # 123
        self.data = data
        # 123
        self.extra = extra

    def validate(self):
        self.validate_required(self.appid, 'appid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.appid is not None:
            result['appid'] = self.appid
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.scene is not None:
            result['scene'] = self.scene
        if self.token is not None:
            result['token'] = self.token
        if self.data is not None:
            result['data'] = self.data
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('appid') is not None:
            self.appid = m.get('appid')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class SecurityUniformRequest(TeaModel):
    def __init__(
        self,
        token: str = None,
        biz_id: str = None,
        params: str = None,
    ):
        # 123
        self.token = token
        # 123
        self.biz_id = biz_id
        # 132
        self.params = params

    def validate(self):
        self.validate_required(self.token, 'token')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.params, 'params')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.token is not None:
            result['token'] = self.token
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class KeyValuePair(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # 23
        self.key = key
        # 123
        self.value = value

    def validate(self):
        pass

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


class RdslibAntcaptchaservice(TeaModel):
    def __init__(
        self,
        success: bool = None,
        message: str = None,
        data: str = None,
    ):
        # 是否请求成功
        self.success = success
        # 相应信息
        self.message = message
        # 返回数据
        self.data = data

    def validate(self):
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class SecurityUniformResponse(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        message: str = None,
        token: str = None,
        biz_id: str = None,
        data: str = None,
    ):
        # 是否成功
        self.success = success
        # 123
        self.code = code
        # 123
        self.message = message
        # 123
        self.token = token
        # 123
        self.biz_id = biz_id
        # 123
        self.data = data

    def validate(self):
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.token is not None:
            result['token'] = self.token
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class HoloxCheckEvent(TeaModel):
    def __init__(
        self,
        sucess: bool = None,
        id: str = None,
        app_code: str = None,
        scene_code: str = None,
        product_code: str = None,
        channel: str = None,
        app_scene_data_id: str = None,
        account_type: str = None,
        user_id: str = None,
        reciever_id: str = None,
        publish_date: str = None,
        is_test: bool = None,
        is_load_test: bool = None,
        is_fusing: bool = None,
        scene_type: str = None,
        content_data: str = None,
        event_data: str = None,
    ):
        # 是否成功
        self.sucess = sucess
        # 123
        self.id = id
        # 12
        self.app_code = app_code
        # 123
        self.scene_code = scene_code
        # 12
        self.product_code = product_code
        # 123
        self.channel = channel
        # 123
        self.app_scene_data_id = app_scene_data_id
        # 123
        self.account_type = account_type
        # 123
        self.user_id = user_id
        # 123
        self.reciever_id = reciever_id
        # 123
        self.publish_date = publish_date
        # 123
        self.is_test = is_test
        # 123
        self.is_load_test = is_load_test
        # 123
        self.is_fusing = is_fusing
        # 123
        self.scene_type = scene_type
        # 123
        self.content_data = content_data
        # 123
        self.event_data = event_data

    def validate(self):
        self.validate_required(self.sucess, 'sucess')
        self.validate_required(self.id, 'id')
        self.validate_required(self.app_code, 'app_code')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.reciever_id, 'reciever_id')
        self.validate_required(self.publish_date, 'publish_date')
        self.validate_required(self.is_test, 'is_test')
        self.validate_required(self.is_load_test, 'is_load_test')
        self.validate_required(self.is_fusing, 'is_fusing')
        self.validate_required(self.scene_type, 'scene_type')
        self.validate_required(self.content_data, 'content_data')
        self.validate_required(self.event_data, 'event_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sucess is not None:
            result['sucess'] = self.sucess
        if self.id is not None:
            result['id'] = self.id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.channel is not None:
            result['channel'] = self.channel
        if self.app_scene_data_id is not None:
            result['app_scene_data_id'] = self.app_scene_data_id
        if self.account_type is not None:
            result['account_type'] = self.account_type
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.reciever_id is not None:
            result['reciever_id'] = self.reciever_id
        if self.publish_date is not None:
            result['publish_date'] = self.publish_date
        if self.is_test is not None:
            result['is_test'] = self.is_test
        if self.is_load_test is not None:
            result['is_load_test'] = self.is_load_test
        if self.is_fusing is not None:
            result['is_fusing'] = self.is_fusing
        if self.scene_type is not None:
            result['scene_type'] = self.scene_type
        if self.content_data is not None:
            result['content_data'] = self.content_data
        if self.event_data is not None:
            result['event_data'] = self.event_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sucess') is not None:
            self.sucess = m.get('sucess')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('app_scene_data_id') is not None:
            self.app_scene_data_id = m.get('app_scene_data_id')
        if m.get('account_type') is not None:
            self.account_type = m.get('account_type')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('reciever_id') is not None:
            self.reciever_id = m.get('reciever_id')
        if m.get('publish_date') is not None:
            self.publish_date = m.get('publish_date')
        if m.get('is_test') is not None:
            self.is_test = m.get('is_test')
        if m.get('is_load_test') is not None:
            self.is_load_test = m.get('is_load_test')
        if m.get('is_fusing') is not None:
            self.is_fusing = m.get('is_fusing')
        if m.get('scene_type') is not None:
            self.scene_type = m.get('scene_type')
        if m.get('content_data') is not None:
            self.content_data = m.get('content_data')
        if m.get('event_data') is not None:
            self.event_data = m.get('event_data')
        return self


class CheckInfosecHoloxcontentcheckserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        holox_check_event: HoloxCheckEvent = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.holox_check_event = holox_check_event
        # 123
        self.service_version = service_version

    def validate(self):
        if self.holox_check_event:
            self.holox_check_event.validate()
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.holox_check_event is not None:
            result['holox_check_event'] = self.holox_check_event.to_map()
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('holox_check_event') is not None:
            temp_model = HoloxCheckEvent()
            self.holox_check_event = temp_model.from_map(m['holox_check_event'])
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class CheckInfosecHoloxcontentcheckserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: HoloxCheckResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 大安全风控接口返回结果
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
            temp_model = HoloxCheckResult()
            self.data = temp_model.from_map(m['data'])
        return self


class QuerySecuritycoreSecurityuniformserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        security_uniform_request: SecurityUniformRequest = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.security_uniform_request = security_uniform_request
        # 123
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.security_uniform_request, 'security_uniform_request')
        if self.security_uniform_request:
            self.security_uniform_request.validate()
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.security_uniform_request is not None:
            result['security_uniform_request'] = self.security_uniform_request.to_map()
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('security_uniform_request') is not None:
            temp_model = SecurityUniformRequest()
            self.security_uniform_request = temp_model.from_map(m['security_uniform_request'])
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QuerySecuritycoreSecurityuniformserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SecurityUniformResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
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
            temp_model = SecurityUniformResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class CheckRdsRdsserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        rds_service_check_request: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.rds_service_check_request = rds_service_check_request
        # 服务版本
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.rds_service_check_request, 'rds_service_check_request')
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.rds_service_check_request is not None:
            result['rds_service_check_request'] = self.rds_service_check_request
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('rds_service_check_request') is not None:
            self.rds_service_check_request = m.get('rds_service_check_request')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class CheckRdsRdsserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否是机器
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


class QueryInfosecHoloxcontentcheckqueryserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        infosec_content_query: InfoSecContentQuery = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.infosec_content_query = infosec_content_query
        # 123
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.infosec_content_query, 'infosec_content_query')
        if self.infosec_content_query:
            self.infosec_content_query.validate()
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.infosec_content_query is not None:
            result['infosec_content_query'] = self.infosec_content_query.to_map()
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('infosec_content_query') is not None:
            temp_model = InfoSecContentQuery()
            self.infosec_content_query = temp_model.from_map(m['infosec_content_query'])
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QueryInfosecHoloxcontentcheckqueryserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: InfoSecContentQueryResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回回调结果
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
            temp_model = InfoSecContentQueryResult()
            self.data = temp_model.from_map(m['data'])
        return self


class VerifyRdslibAntcaptchaserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        rds_analyze_request: RdsAnalyzeRequest = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.rds_analyze_request = rds_analyze_request
        # 服务版本
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.rds_analyze_request, 'rds_analyze_request')
        if self.rds_analyze_request:
            self.rds_analyze_request.validate()
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.rds_analyze_request is not None:
            result['rds_analyze_request'] = self.rds_analyze_request.to_map()
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('rds_analyze_request') is not None:
            temp_model = RdsAnalyzeRequest()
            self.rds_analyze_request = temp_model.from_map(m['rds_analyze_request'])
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class VerifyRdslibAntcaptchaserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RdslibAntcaptchaservice = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否是机器人
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
            temp_model = RdslibAntcaptchaservice()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryTscenterUmidqueryserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        token_id: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户token id
        self.token_id = token_id
        # 服务版本
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.token_id, 'token_id')
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.token_id is not None:
            result['token_id'] = self.token_id
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('token_id') is not None:
            self.token_id = m.get('token_id')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QueryTscenterUmidqueryserviceResponse(TeaModel):
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
        # 返回的umid
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


class CheckInfosecOpencheckservicecheckRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 以json格式输入想要检测的内容
        self.content = content
        # 服务版本
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class CheckInfosecOpencheckservicecheckResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ResultModel = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 大安全内容检测接口返回参数
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
            temp_model = ResultModel()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryInfosecOpencheckservicequeryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        event: str = None,
        service_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询参数
        self.event = event
        # 服务版本
        self.service_version = service_version

    def validate(self):
        self.validate_required(self.event, 'event')
        self.validate_required(self.service_version, 'service_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.event is not None:
            result['event'] = self.event
        if self.service_version is not None:
            result['service_version'] = self.service_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('event') is not None:
            self.event = m.get('event')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        return self


class QueryInfosecOpencheckservicequeryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ContentQueryResultModel = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 大安全内容检测接口返回结果
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
            temp_model = ContentQueryResultModel()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryDemoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 测试数据
        self.data = data

    def validate(self):
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryDemoResponse(TeaModel):
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


class QueryGuardAskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        session_id: str = None,
        request_id: str = None,
        service_name: str = None,
        question: str = None,
        user_id: str = None,
        question_format: str = None,
        model_code: str = None,
        business_properties: KeyValuePair = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 会话ID，用于匹配多轮对话上下文
        self.session_id = session_id
        # 数据唯一标识，能够根据该值定位到该条数据
        self.request_id = request_id
        # 大模型提问护栏服务, 用于区分提供的服务类别，当前支持：TJ_QUESTION_BASIC、TJ_ANSWER_BASIC 两种
        self.service_name = service_name
        # 当前提问内容，最大长度10000个字符。
        self.question = question
        # 用户ID，用于主体风险判断，如果是2088开头的阿里体系用户，请传入2088开头的用户ID
        self.user_id = user_id
        # 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
        self.question_format = question_format
        # 大模型ID，表示大模型版本
        self.model_code = model_code
        # 扩展属性Map，key限定为：aigcType、serviceScene、triggerSource、bizOwner，对应的value取值为： aigcType： ● 文生文：text_text ● 文生图：text_pic ● 图生文：pic_text ● 图生图：pic_pic serviceScene: 根据业务使用的不同情况支持自定义入参做策略个性化配置，私域或者公域，以及不同的业务应用 比如领域： serviceScene = insurance 表示保险 serviceScene = medical 表示医疗 serviceScene = government 表示政务 比如业务活动应用： serviceScene = xiacu 表示夏促 serviceScene = qixi 表示七夕 triggerSource: 不同的来源，比如移动端、web端、API
        self.business_properties = business_properties

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
        if self.session_id is not None:
            self.validate_max_length(self.session_id, 'session_id', 128)
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 64)
        self.validate_required(self.service_name, 'service_name')
        if self.service_name is not None:
            self.validate_max_length(self.service_name, 'service_name', 128)
        self.validate_required(self.question, 'question')
        if self.question is not None:
            self.validate_max_length(self.question, 'question', 10000)
        self.validate_required(self.user_id, 'user_id')
        if self.user_id is not None:
            self.validate_max_length(self.user_id, 'user_id', 32)
        if self.question_format is not None:
            self.validate_max_length(self.question_format, 'question_format', 32)
        if self.model_code is not None:
            self.validate_max_length(self.model_code, 'model_code', 128)
        if self.business_properties:
            self.business_properties.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.service_name is not None:
            result['service_name'] = self.service_name
        if self.question is not None:
            result['question'] = self.question
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.question_format is not None:
            result['question_format'] = self.question_format
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.business_properties is not None:
            result['business_properties'] = self.business_properties.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('question_format') is not None:
            self.question_format = m.get('question_format')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('business_properties') is not None:
            temp_model = KeyValuePair()
            self.business_properties = temp_model.from_map(m['business_properties'])
        return self


class QueryGuardAskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        safe: bool = None,
        action_code: str = None,
        action_msg: str = None,
        session_action: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 检测数据ID
        self.request_id = request_id
        # 是否安全无风险，true: 安全无风险，false: 有风险
        self.safe = safe
        # 安全动作，拦截: BLOCK，安全代答: SECURITY_ANSWER，红色GPT安全代答: REDGPT_ANSWER，安全提示增强: SECURITY_PROMPT
        self.action_code = action_code
        # 安全动作相关文案
        self.action_msg = action_msg
        # 会话动作，终止会话: END_SESSION，撤回提问: RECALL_QUERY
        self.session_action = session_action

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.safe is not None:
            result['safe'] = self.safe
        if self.action_code is not None:
            result['action_code'] = self.action_code
        if self.action_msg is not None:
            result['action_msg'] = self.action_msg
        if self.session_action is not None:
            result['session_action'] = self.session_action
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('safe') is not None:
            self.safe = m.get('safe')
        if m.get('action_code') is not None:
            self.action_code = m.get('action_code')
        if m.get('action_msg') is not None:
            self.action_msg = m.get('action_msg')
        if m.get('session_action') is not None:
            self.session_action = m.get('session_action')
        return self


