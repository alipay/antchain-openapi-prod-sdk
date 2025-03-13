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


class AvatarHumanInfo(TeaModel):
    def __init__(
        self,
        id: int = None,
        human_name: str = None,
        model_id: int = None,
        voice_code: str = None,
        voice_name: str = None,
        voice_image: str = None,
        speech_rate: int = None,
        pitch_rate: str = None,
        volume: str = None,
    ):
        # 数字人角色id
        self.id = id
        # 数字人角色名
        self.human_name = human_name
        # 数字人形象id
        self.model_id = model_id
        # 数字人音色编码
        self.voice_code = voice_code
        # 数字人音色名
        self.voice_name = voice_name
        # 数字人音色预览图
        self.voice_image = voice_image
        # 语速
        self.speech_rate = speech_rate
        # 音调
        self.pitch_rate = pitch_rate
        # 音量
        self.volume = volume

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.human_name, 'human_name')
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.voice_code, 'voice_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.human_name is not None:
            result['human_name'] = self.human_name
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.voice_code is not None:
            result['voice_code'] = self.voice_code
        if self.voice_name is not None:
            result['voice_name'] = self.voice_name
        if self.voice_image is not None:
            result['voice_image'] = self.voice_image
        if self.speech_rate is not None:
            result['speech_rate'] = self.speech_rate
        if self.pitch_rate is not None:
            result['pitch_rate'] = self.pitch_rate
        if self.volume is not None:
            result['volume'] = self.volume
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('human_name') is not None:
            self.human_name = m.get('human_name')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('voice_code') is not None:
            self.voice_code = m.get('voice_code')
        if m.get('voice_name') is not None:
            self.voice_name = m.get('voice_name')
        if m.get('voice_image') is not None:
            self.voice_image = m.get('voice_image')
        if m.get('speech_rate') is not None:
            self.speech_rate = m.get('speech_rate')
        if m.get('pitch_rate') is not None:
            self.pitch_rate = m.get('pitch_rate')
        if m.get('volume') is not None:
            self.volume = m.get('volume')
        return self


class AvatarLibraryInfo(TeaModel):
    def __init__(
        self,
        question_count: int = None,
        id: int = None,
        title: str = None,
        human_info: AvatarHumanInfo = None,
    ):
        # 知识点数量
        self.question_count = question_count
        # 知识库id
        self.id = id
        # 知识库名称
        self.title = title
        # 数字人角色信息
        self.human_info = human_info

    def validate(self):
        self.validate_required(self.question_count, 'question_count')
        self.validate_required(self.id, 'id')
        self.validate_required(self.title, 'title')
        self.validate_required(self.human_info, 'human_info')
        if self.human_info:
            self.human_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.question_count is not None:
            result['question_count'] = self.question_count
        if self.id is not None:
            result['id'] = self.id
        if self.title is not None:
            result['title'] = self.title
        if self.human_info is not None:
            result['human_info'] = self.human_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('question_count') is not None:
            self.question_count = m.get('question_count')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('human_info') is not None:
            temp_model = AvatarHumanInfo()
            self.human_info = temp_model.from_map(m['human_info'])
        return self


class AvatarLlmChatInfo(TeaModel):
    def __init__(
        self,
        llm_chat_code: str = None,
        llm_chat_name: str = None,
        description: str = None,
        model_name: str = None,
        model_code: str = None,
        model_id: str = None,
        config: str = None,
    ):
        # 大模型对话配置编码
        self.llm_chat_code = llm_chat_code
        # 大模型对话配置名
        self.llm_chat_name = llm_chat_name
        # 描述
        self.description = description
        # 模型配置名
        self.model_name = model_name
        # 模型配置编码
        self.model_code = model_code
        # 模型配置id
        self.model_id = model_id
        # 大模型对话自定义配置信息
        self.config = config

    def validate(self):
        self.validate_required(self.llm_chat_code, 'llm_chat_code')
        self.validate_required(self.llm_chat_name, 'llm_chat_name')
        self.validate_required(self.model_name, 'model_name')
        self.validate_required(self.model_code, 'model_code')
        self.validate_required(self.model_id, 'model_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.llm_chat_code is not None:
            result['llm_chat_code'] = self.llm_chat_code
        if self.llm_chat_name is not None:
            result['llm_chat_name'] = self.llm_chat_name
        if self.description is not None:
            result['description'] = self.description
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.config is not None:
            result['config'] = self.config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('llm_chat_code') is not None:
            self.llm_chat_code = m.get('llm_chat_code')
        if m.get('llm_chat_name') is not None:
            self.llm_chat_name = m.get('llm_chat_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('config') is not None:
            self.config = m.get('config')
        return self


class AvatarComponentInfo(TeaModel):
    def __init__(
        self,
        title: str = None,
        code: str = None,
        value: str = None,
    ):
        # 组件标题
        self.title = title
        # 组件编码
        self.code = code
        # 组件值
        self.value = value

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.code, 'code')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.code is not None:
            result['code'] = self.code
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class AvatarBubbleInfo(TeaModel):
    def __init__(
        self,
        title: str = None,
        type: str = None,
        know_id: str = None,
        tel: str = None,
        link: str = None,
    ):
        # 气泡标题
        self.title = title
        # 气泡类型
        self.type = type
        # 知识点id
        self.know_id = know_id
        # 电话号码
        self.tel = tel
        # 外部链接
        self.link = link

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.know_id is not None:
            result['know_id'] = self.know_id
        if self.tel is not None:
            result['tel'] = self.tel
        if self.link is not None:
            result['link'] = self.link
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('know_id') is not None:
            self.know_id = m.get('know_id')
        if m.get('tel') is not None:
            self.tel = m.get('tel')
        if m.get('link') is not None:
            self.link = m.get('link')
        return self


class AvatarConfigInfo(TeaModel):
    def __init__(
        self,
        id: int = None,
        config_name: str = None,
        virtual_code: str = None,
        human_id: int = None,
    ):
        # 交互配置id
        self.id = id
        # 交互配置名
        self.config_name = config_name
        # 交互配置编码
        self.virtual_code = virtual_code
        # 数字人角色id
        self.human_id = human_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.config_name, 'config_name')
        self.validate_required(self.virtual_code, 'virtual_code')
        self.validate_required(self.human_id, 'human_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.config_name is not None:
            result['config_name'] = self.config_name
        if self.virtual_code is not None:
            result['virtual_code'] = self.virtual_code
        if self.human_id is not None:
            result['human_id'] = self.human_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('config_name') is not None:
            self.config_name = m.get('config_name')
        if m.get('virtual_code') is not None:
            self.virtual_code = m.get('virtual_code')
        if m.get('human_id') is not None:
            self.human_id = m.get('human_id')
        return self


class AvatarScriptConfigInfo(TeaModel):
    def __init__(
        self,
        wake_words: List[str] = None,
        welcome_phrases: List[str] = None,
        fallback_phrases: List[str] = None,
    ):
        # 唤醒词列表
        self.wake_words = wake_words
        # 欢迎语列表
        self.welcome_phrases = welcome_phrases
        # 兜底语列表
        self.fallback_phrases = fallback_phrases

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.wake_words is not None:
            result['wake_words'] = self.wake_words
        if self.welcome_phrases is not None:
            result['welcome_phrases'] = self.welcome_phrases
        if self.fallback_phrases is not None:
            result['fallback_phrases'] = self.fallback_phrases
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('wake_words') is not None:
            self.wake_words = m.get('wake_words')
        if m.get('welcome_phrases') is not None:
            self.welcome_phrases = m.get('welcome_phrases')
        if m.get('fallback_phrases') is not None:
            self.fallback_phrases = m.get('fallback_phrases')
        return self


class ListUniversalsaasDigitalhumanHumanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        classification: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 获取数字人角色的类型
        self.classification = classification

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.classification, 'classification')

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
        if self.classification is not None:
            result['classification'] = self.classification
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('classification') is not None:
            self.classification = m.get('classification')
        return self


class ListUniversalsaasDigitalhumanHumanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[AvatarHumanInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数字人角色列表
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = AvatarHumanInfo()
                self.item_list.append(temp_model.from_map(k))
        return self


class ListUniversalsaasDigitalhumanLibraryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        classification: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识库类型
        self.classification = classification

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.classification, 'classification')

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
        if self.classification is not None:
            result['classification'] = self.classification
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('classification') is not None:
            self.classification = m.get('classification')
        return self


class ListUniversalsaasDigitalhumanLibraryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[AvatarLibraryInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 知识库列表
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = AvatarLibraryInfo()
                self.item_list.append(temp_model.from_map(k))
        return self


class AddUniversalsaasDigitalhumanLibraryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        classification: str = None,
        human_id: int = None,
        title: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识库类型
        self.classification = classification
        # 角色id
        self.human_id = human_id
        # 知识库名称
        self.title = title

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.classification, 'classification')
        self.validate_required(self.human_id, 'human_id')
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
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.classification is not None:
            result['classification'] = self.classification
        if self.human_id is not None:
            result['human_id'] = self.human_id
        if self.title is not None:
            result['title'] = self.title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('classification') is not None:
            self.classification = m.get('classification')
        if m.get('human_id') is not None:
            self.human_id = m.get('human_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        return self


class AddUniversalsaasDigitalhumanLibraryResponse(TeaModel):
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
        # 知识库id
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


class UpdateUniversalsaasDigitalhumanLibraryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        id: int = None,
        title: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识库id
        self.id = id
        # 知识库名称
        self.title = title

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.id, 'id')
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
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.id is not None:
            result['id'] = self.id
        if self.title is not None:
            result['title'] = self.title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('title') is not None:
            self.title = m.get('title')
        return self


class UpdateUniversalsaasDigitalhumanLibraryResponse(TeaModel):
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


class DeleteUniversalsaasDigitalhumanLibraryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识库id
        self.id = id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
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
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DeleteUniversalsaasDigitalhumanLibraryResponse(TeaModel):
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


class AddUniversalsaasDigitalhumanKnowledgeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        library_id: int = None,
        question_title: str = None,
        sentence_list: List[str] = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识库id
        self.library_id = library_id
        # 标问标题
        self.question_title = question_title
        # 问法列表
        self.sentence_list = sentence_list
        # 答案文案
        self.content = content

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.library_id, 'library_id')
        self.validate_required(self.question_title, 'question_title')
        self.validate_required(self.sentence_list, 'sentence_list')
        self.validate_required(self.content, 'content')

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
        if self.library_id is not None:
            result['library_id'] = self.library_id
        if self.question_title is not None:
            result['question_title'] = self.question_title
        if self.sentence_list is not None:
            result['sentence_list'] = self.sentence_list
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        if m.get('question_title') is not None:
            self.question_title = m.get('question_title')
        if m.get('sentence_list') is not None:
            self.sentence_list = m.get('sentence_list')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class AddUniversalsaasDigitalhumanKnowledgeResponse(TeaModel):
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
        # 知识点id
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


class UpdateUniversalsaasDigitalhumanKnowledgeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        library_id: int = None,
        id: int = None,
        question_title: str = None,
        sentence_list: List[str] = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识库ID
        self.library_id = library_id
        # 知识点id
        self.id = id
        # 标问标题
        self.question_title = question_title
        # 问法列表
        self.sentence_list = sentence_list
        # 答案文案
        self.content = content

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.library_id, 'library_id')
        self.validate_required(self.id, 'id')
        self.validate_required(self.question_title, 'question_title')
        self.validate_required(self.sentence_list, 'sentence_list')
        self.validate_required(self.content, 'content')

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
        if self.library_id is not None:
            result['library_id'] = self.library_id
        if self.id is not None:
            result['id'] = self.id
        if self.question_title is not None:
            result['question_title'] = self.question_title
        if self.sentence_list is not None:
            result['sentence_list'] = self.sentence_list
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('question_title') is not None:
            self.question_title = m.get('question_title')
        if m.get('sentence_list') is not None:
            self.sentence_list = m.get('sentence_list')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class UpdateUniversalsaasDigitalhumanKnowledgeResponse(TeaModel):
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


class OnlineUniversalsaasDigitalhumanKnowledgeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        library_id: int = None,
        ids: List[int] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识库id
        self.library_id = library_id
        # 知识点id列表
        self.ids = ids

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.library_id, 'library_id')
        self.validate_required(self.ids, 'ids')

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
        if self.library_id is not None:
            result['library_id'] = self.library_id
        if self.ids is not None:
            result['ids'] = self.ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        if m.get('ids') is not None:
            self.ids = m.get('ids')
        return self


class OnlineUniversalsaasDigitalhumanKnowledgeResponse(TeaModel):
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


class OfflineUniversalsaasDigitalhumanKnowledgeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        library_id: int = None,
        ids: List[int] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识库ID
        self.library_id = library_id
        # 知识点id列表
        self.ids = ids

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.library_id, 'library_id')
        self.validate_required(self.ids, 'ids')

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
        if self.library_id is not None:
            result['library_id'] = self.library_id
        if self.ids is not None:
            result['ids'] = self.ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        if m.get('ids') is not None:
            self.ids = m.get('ids')
        return self


class OfflineUniversalsaasDigitalhumanKnowledgeResponse(TeaModel):
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


class ListUniversalsaasDigitalhumanLlmChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 页码
        self.page_num = page_num
        # 页面大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')

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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListUniversalsaasDigitalhumanLlmChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[AvatarLlmChatInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 大模型对话列表
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = AvatarLlmChatInfo()
                self.item_list.append(temp_model.from_map(k))
        return self


class AddUniversalsaasDigitalhumanChatSettingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        config_name: str = None,
        human_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 交互配置名称
        self.config_name = config_name
        # 角色id
        self.human_id = human_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.config_name, 'config_name')
        self.validate_required(self.human_id, 'human_id')

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
        if self.config_name is not None:
            result['config_name'] = self.config_name
        if self.human_id is not None:
            result['human_id'] = self.human_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('config_name') is not None:
            self.config_name = m.get('config_name')
        if m.get('human_id') is not None:
            self.human_id = m.get('human_id')
        return self


class AddUniversalsaasDigitalhumanChatSettingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AvatarConfigInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交互配置信息
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
            temp_model = AvatarConfigInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class SetUniversalsaasDigitalhumanChatSettingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        id: int = None,
        title: str = None,
        bg_img: str = None,
        logo_img: str = None,
        bubble_config: List[AvatarBubbleInfo] = None,
        component_config: List[AvatarComponentInfo] = None,
        llm_code: str = None,
        library_ids: List[int] = None,
        script_config: AvatarScriptConfigInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 交互配置ID
        self.id = id
        # 交互配置名
        self.title = title
        # 背景图片url
        self.bg_img = bg_img
        # logo图片url
        self.logo_img = logo_img
        # 气泡配置
        self.bubble_config = bubble_config
        # 自定义组件配置
        self.component_config = component_config
        # 关联大模型对话配置编码
        self.llm_code = llm_code
        # 关联知识库列表
        self.library_ids = library_ids
        # 话术配置
        self.script_config = script_config

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.id, 'id')
        if self.bubble_config:
            for k in self.bubble_config:
                if k:
                    k.validate()
        if self.component_config:
            for k in self.component_config:
                if k:
                    k.validate()
        if self.script_config:
            self.script_config.validate()

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
        if self.id is not None:
            result['id'] = self.id
        if self.title is not None:
            result['title'] = self.title
        if self.bg_img is not None:
            result['bg_img'] = self.bg_img
        if self.logo_img is not None:
            result['logo_img'] = self.logo_img
        result['bubble_config'] = []
        if self.bubble_config is not None:
            for k in self.bubble_config:
                result['bubble_config'].append(k.to_map() if k else None)
        result['component_config'] = []
        if self.component_config is not None:
            for k in self.component_config:
                result['component_config'].append(k.to_map() if k else None)
        if self.llm_code is not None:
            result['llm_code'] = self.llm_code
        if self.library_ids is not None:
            result['library_ids'] = self.library_ids
        if self.script_config is not None:
            result['script_config'] = self.script_config.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('bg_img') is not None:
            self.bg_img = m.get('bg_img')
        if m.get('logo_img') is not None:
            self.logo_img = m.get('logo_img')
        self.bubble_config = []
        if m.get('bubble_config') is not None:
            for k in m.get('bubble_config'):
                temp_model = AvatarBubbleInfo()
                self.bubble_config.append(temp_model.from_map(k))
        self.component_config = []
        if m.get('component_config') is not None:
            for k in m.get('component_config'):
                temp_model = AvatarComponentInfo()
                self.component_config.append(temp_model.from_map(k))
        if m.get('llm_code') is not None:
            self.llm_code = m.get('llm_code')
        if m.get('library_ids') is not None:
            self.library_ids = m.get('library_ids')
        if m.get('script_config') is not None:
            temp_model = AvatarScriptConfigInfo()
            self.script_config = temp_model.from_map(m['script_config'])
        return self


class SetUniversalsaasDigitalhumanChatSettingResponse(TeaModel):
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


class DeleteUniversalsaasDigitalhumanChatSettingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 交互配置id
        self.id = id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
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
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DeleteUniversalsaasDigitalhumanChatSettingResponse(TeaModel):
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


class OnlineUniversalsaasDigitalhumanChatSettingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 交互配置id
        self.id = id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
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
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class OnlineUniversalsaasDigitalhumanChatSettingResponse(TeaModel):
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


class OfflineUniversalsaasDigitalhumanChatSettingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 交互配置id
        self.id = id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
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
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class OfflineUniversalsaasDigitalhumanChatSettingResponse(TeaModel):
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


