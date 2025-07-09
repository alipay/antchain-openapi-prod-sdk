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


class AvatarLlmModelInfo(TeaModel):
    def __init__(
        self,
        model_id: str = None,
        model_name: str = None,
        model_code: str = None,
        description: str = None,
        image_url: str = None,
    ):
        # 模型id
        self.model_id = model_id
        # 模型名称
        self.model_name = model_name
        # 模型编码
        self.model_code = model_code
        # 模型描述
        self.description = description
        # 模型图片url
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.model_name, 'model_name')
        self.validate_required(self.model_code, 'model_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.description is not None:
            result['description'] = self.description
        if self.image_url is not None:
            result['image_url'] = self.image_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('image_url') is not None:
            self.image_url = m.get('image_url')
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


class AvatarModelInfo(TeaModel):
    def __init__(
        self,
        model_id: int = None,
        model_name: str = None,
        voice_list: List[str] = None,
        image: str = None,
    ):
        # 数字人形象id
        self.model_id = model_id
        # 数字人形象名
        self.model_name = model_name
        # 数字人形象默认音色列表
        self.voice_list = voice_list
        # 数字人形象预览图
        self.image = image

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.model_name, 'model_name')
        self.validate_required(self.voice_list, 'voice_list')
        self.validate_required(self.image, 'image')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.voice_list is not None:
            result['voice_list'] = self.voice_list
        if self.image is not None:
            result['image'] = self.image
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('voice_list') is not None:
            self.voice_list = m.get('voice_list')
        if m.get('image') is not None:
            self.image = m.get('image')
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


class AvatarStreamInfo(TeaModel):
    def __init__(
        self,
        model_id: str = None,
        voice_code: str = None,
        background: str = None,
        stream_id: str = None,
        serial_number: str = None,
        start_time: str = None,
    ):
        # 形象id
        self.model_id = model_id
        # 音色编码
        self.voice_code = voice_code
        # 背景信息
        self.background = background
        # 流id
        self.stream_id = stream_id
        # 设备sn号
        self.serial_number = serial_number
        # 开播时间
        self.start_time = start_time

    def validate(self):
        self.validate_required(self.stream_id, 'stream_id')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.voice_code is not None:
            result['voice_code'] = self.voice_code
        if self.background is not None:
            result['background'] = self.background
        if self.stream_id is not None:
            result['stream_id'] = self.stream_id
        if self.serial_number is not None:
            result['serial_number'] = self.serial_number
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('voice_code') is not None:
            self.voice_code = m.get('voice_code')
        if m.get('background') is not None:
            self.background = m.get('background')
        if m.get('stream_id') is not None:
            self.stream_id = m.get('stream_id')
        if m.get('serial_number') is not None:
            self.serial_number = m.get('serial_number')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class ImportTaskResult(TeaModel):
    def __init__(
        self,
        status: str = None,
        progress: int = None,
        error_message: str = None,
        file_url: str = None,
    ):
        # 任务状态
        self.status = status
        # 进度值
        self.progress = progress
        # 错误日志
        self.error_message = error_message
        # 导入日志文件url
        self.file_url = file_url

    def validate(self):
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.status is not None:
            result['status'] = self.status
        if self.progress is not None:
            result['progress'] = self.progress
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.file_url is not None:
            result['file_url'] = self.file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('progress') is not None:
            self.progress = m.get('progress')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
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


class AvatarVoiceInfo(TeaModel):
    def __init__(
        self,
        voice_id: str = None,
        voice_code: str = None,
        voice_name: str = None,
        image: str = None,
        gender: str = None,
        voice_type: str = None,
        audition_list: List[str] = None,
    ):
        # 音色id
        self.voice_id = voice_id
        # 音色编码
        self.voice_code = voice_code
        # 音色名
        self.voice_name = voice_name
        # 预览图
        self.image = image
        # 音色性别
        self.gender = gender
        # 音色类型
        self.voice_type = voice_type
        # 音色试听链接列表
        self.audition_list = audition_list

    def validate(self):
        self.validate_required(self.voice_id, 'voice_id')
        self.validate_required(self.voice_code, 'voice_code')
        self.validate_required(self.voice_name, 'voice_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.voice_id is not None:
            result['voice_id'] = self.voice_id
        if self.voice_code is not None:
            result['voice_code'] = self.voice_code
        if self.voice_name is not None:
            result['voice_name'] = self.voice_name
        if self.image is not None:
            result['image'] = self.image
        if self.gender is not None:
            result['gender'] = self.gender
        if self.voice_type is not None:
            result['voice_type'] = self.voice_type
        if self.audition_list is not None:
            result['audition_list'] = self.audition_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('voice_id') is not None:
            self.voice_id = m.get('voice_id')
        if m.get('voice_code') is not None:
            self.voice_code = m.get('voice_code')
        if m.get('voice_name') is not None:
            self.voice_name = m.get('voice_name')
        if m.get('image') is not None:
            self.image = m.get('image')
        if m.get('gender') is not None:
            self.gender = m.get('gender')
        if m.get('voice_type') is not None:
            self.voice_type = m.get('voice_type')
        if m.get('audition_list') is not None:
            self.audition_list = m.get('audition_list')
        return self


class BubbleButton(TeaModel):
    def __init__(
        self,
        title: str = None,
        value: str = None,
        type: str = None,
    ):
        # 按钮文案
        self.title = title
        # 行动点执行动作值
        self.value = value
        # 行动点执行动作类型
        self.type = type

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.value, 'value')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.value is not None:
            result['value'] = self.value
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('type') is not None:
            self.type = m.get('type')
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
        broadcast_content: str = None,
        bubble_button_config: List[BubbleButton] = None,
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
        # 动画播报文案
        self.broadcast_content = broadcast_content
        # 行动点配置
        self.bubble_button_config = bubble_button_config

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.library_id, 'library_id')
        self.validate_required(self.question_title, 'question_title')
        self.validate_required(self.sentence_list, 'sentence_list')
        self.validate_required(self.content, 'content')
        if self.bubble_button_config:
            for k in self.bubble_button_config:
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
        if self.broadcast_content is not None:
            result['broadcast_content'] = self.broadcast_content
        result['bubble_button_config'] = []
        if self.bubble_button_config is not None:
            for k in self.bubble_button_config:
                result['bubble_button_config'].append(k.to_map() if k else None)
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
        if m.get('broadcast_content') is not None:
            self.broadcast_content = m.get('broadcast_content')
        self.bubble_button_config = []
        if m.get('bubble_button_config') is not None:
            for k in m.get('bubble_button_config'):
                temp_model = BubbleButton()
                self.bubble_button_config.append(temp_model.from_map(k))
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
        broadcast_content: str = None,
        bubble_button_config: List[BubbleButton] = None,
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
        # 动画播报内容
        self.broadcast_content = broadcast_content
        # 行动点配置
        self.bubble_button_config = bubble_button_config

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.library_id, 'library_id')
        self.validate_required(self.id, 'id')
        self.validate_required(self.question_title, 'question_title')
        self.validate_required(self.sentence_list, 'sentence_list')
        self.validate_required(self.content, 'content')
        if self.bubble_button_config:
            for k in self.bubble_button_config:
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
        if self.broadcast_content is not None:
            result['broadcast_content'] = self.broadcast_content
        result['bubble_button_config'] = []
        if self.bubble_button_config is not None:
            for k in self.bubble_button_config:
                result['bubble_button_config'].append(k.to_map() if k else None)
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
        if m.get('broadcast_content') is not None:
            self.broadcast_content = m.get('broadcast_content')
        self.bubble_button_config = []
        if m.get('bubble_button_config') is not None:
            for k in m.get('bubble_button_config'):
                temp_model = BubbleButton()
                self.bubble_button_config.append(temp_model.from_map(k))
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


class ListUniversalsaasDigitalhumanModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        type: str = None,
        classification: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # common---内置形象
        # custom--我的形象
        self.type = type
        # 2d---2d形象
        # 3d---3d形象
        self.classification = classification

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.type, 'type')
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
        if self.type is not None:
            result['type'] = self.type
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
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('classification') is not None:
            self.classification = m.get('classification')
        return self


class ListUniversalsaasDigitalhumanModelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[AvatarModelInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数字人形象信息列表
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
                temp_model = AvatarModelInfo()
                self.item_list.append(temp_model.from_map(k))
        return self


class ListUniversalsaasDigitalhumanVoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        type: str = None,
        classification: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # common---内置音色
        # custom--我的音色
        self.type = type
        # 2d---2d音色
        # 3d---3d音色
        self.classification = classification

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.type, 'type')
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
        if self.type is not None:
            result['type'] = self.type
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
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('classification') is not None:
            self.classification = m.get('classification')
        return self


class ListUniversalsaasDigitalhumanVoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[AvatarVoiceInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数字人平台音色信息列表
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
                temp_model = AvatarVoiceInfo()
                self.item_list.append(temp_model.from_map(k))
        return self


class PreviewUniversalsaasDigitalhumanVoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        classification: str = None,
        voice_code: str = None,
        text: str = None,
        speed: int = None,
        pitch: int = None,
        volume: int = None,
        human_id: int = None,
        model_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 2d---2d音色
        # 3d---3d音色
        self.classification = classification
        # 音色编码
        self.voice_code = voice_code
        # 试听文案
        self.text = text
        # 语速
        self.speed = speed
        # 音调
        self.pitch = pitch
        # 音量
        self.volume = volume
        # 数字人角色id
        self.human_id = human_id
        # 数字人形象id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.classification, 'classification')
        self.validate_required(self.voice_code, 'voice_code')
        self.validate_required(self.text, 'text')

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
        if self.voice_code is not None:
            result['voice_code'] = self.voice_code
        if self.text is not None:
            result['text'] = self.text
        if self.speed is not None:
            result['speed'] = self.speed
        if self.pitch is not None:
            result['pitch'] = self.pitch
        if self.volume is not None:
            result['volume'] = self.volume
        if self.human_id is not None:
            result['human_id'] = self.human_id
        if self.model_id is not None:
            result['model_id'] = self.model_id
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
        if m.get('voice_code') is not None:
            self.voice_code = m.get('voice_code')
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('speed') is not None:
            self.speed = m.get('speed')
        if m.get('pitch') is not None:
            self.pitch = m.get('pitch')
        if m.get('volume') is not None:
            self.volume = m.get('volume')
        if m.get('human_id') is not None:
            self.human_id = m.get('human_id')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class PreviewUniversalsaasDigitalhumanVoiceResponse(TeaModel):
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
        # 试听音频链接
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


class UpdateUniversalsaasDigitalhumanHumanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        model_id: int = None,
        voice_code: str = None,
        human_name: str = None,
        speed: int = None,
        pitch: int = None,
        volume: int = None,
        human_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 数字人形象id
        self.model_id = model_id
        # 音色编码
        self.voice_code = voice_code
        # 数字人角色名
        self.human_name = human_name
        # 语速
        self.speed = speed
        # 音调
        self.pitch = pitch
        # 音量
        self.volume = volume
        # 数字人角色id
        self.human_id = human_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.voice_code, 'voice_code')

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
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.voice_code is not None:
            result['voice_code'] = self.voice_code
        if self.human_name is not None:
            result['human_name'] = self.human_name
        if self.speed is not None:
            result['speed'] = self.speed
        if self.pitch is not None:
            result['pitch'] = self.pitch
        if self.volume is not None:
            result['volume'] = self.volume
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
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('voice_code') is not None:
            self.voice_code = m.get('voice_code')
        if m.get('human_name') is not None:
            self.human_name = m.get('human_name')
        if m.get('speed') is not None:
            self.speed = m.get('speed')
        if m.get('pitch') is not None:
            self.pitch = m.get('pitch')
        if m.get('volume') is not None:
            self.volume = m.get('volume')
        if m.get('human_id') is not None:
            self.human_id = m.get('human_id')
        return self


class UpdateUniversalsaasDigitalhumanHumanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AvatarHumanInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数字人角色信息
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
            temp_model = AvatarHumanInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteUniversalsaasDigitalhumanHumanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        human_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 数字人角色id
        self.human_id = human_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
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
        if m.get('human_id') is not None:
            self.human_id = m.get('human_id')
        return self


class DeleteUniversalsaasDigitalhumanHumanResponse(TeaModel):
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


class DeleteUniversalsaasDigitalhumanKnowledgeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        ids: List[int] = None,
        library_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识点id列表
        self.ids = ids
        # 知识库id
        self.library_id = library_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.ids, 'ids')
        self.validate_required(self.library_id, 'library_id')

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
        if self.ids is not None:
            result['ids'] = self.ids
        if self.library_id is not None:
            result['library_id'] = self.library_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('ids') is not None:
            self.ids = m.get('ids')
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        return self


class DeleteUniversalsaasDigitalhumanKnowledgeResponse(TeaModel):
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


class CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        tenant_code: str = None,
        library_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识点excel文件
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识库id
        self.library_id = library_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.library_id, 'library_id')

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
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.library_id is not None:
            result['library_id'] = self.library_id
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
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        return self


class CreateUniversalsaasDigitalhumanKnowledgeImporttaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务id
        self.task_id = task_id

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
        return self


class QueryUniversalsaasDigitalhumanKnowledgeImporttaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        task_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 导入任务id
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
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
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryUniversalsaasDigitalhumanKnowledgeImporttaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ImportTaskResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批量导入任务结果
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
            temp_model = ImportTaskResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ExportUniversalsaasDigitalhumanKnowledgeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        library_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 知识库id
        self.library_id = library_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.library_id, 'library_id')

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
        return self


class ExportUniversalsaasDigitalhumanKnowledgeResponse(TeaModel):
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
        # excel文件url
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


class ListUniversalsaasDigitalhumanStreamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        app_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # appId
        self.app_id = app_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.app_id, 'app_id')

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
        if self.app_id is not None:
            result['app_id'] = self.app_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        return self


class ListUniversalsaasDigitalhumanStreamResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AvatarStreamInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实时流信息列表
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AvatarStreamInfo()
                self.data.append(temp_model.from_map(k))
        return self


class StopUniversalsaasDigitalhumanStreamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        app_id: str = None,
        stream_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # app_id
        self.app_id = app_id
        # 流Id
        self.stream_id = stream_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.stream_id, 'stream_id')

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
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.stream_id is not None:
            result['stream_id'] = self.stream_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('stream_id') is not None:
            self.stream_id = m.get('stream_id')
        return self


class StopUniversalsaasDigitalhumanStreamResponse(TeaModel):
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


class DetailUniversalsaasDigitalhumanLlmChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        llm_chat_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 大模型对话配置编码
        self.llm_chat_code = llm_chat_code

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.llm_chat_code, 'llm_chat_code')

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
        if self.llm_chat_code is not None:
            result['llm_chat_code'] = self.llm_chat_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('llm_chat_code') is not None:
            self.llm_chat_code = m.get('llm_chat_code')
        return self


class DetailUniversalsaasDigitalhumanLlmChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AvatarLlmChatInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 大模型对话配置信息
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
            temp_model = AvatarLlmChatInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class AddUniversalsaasDigitalhumanLlmChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        llm_chat_name: str = None,
        model_id: str = None,
        description: str = None,
        config: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 大模型对话配置名称
        self.llm_chat_name = llm_chat_name
        # 模型配置id
        self.model_id = model_id
        # 大模型对话配置描述
        self.description = description
        # 大模型对话自定义配置明细
        self.config = config

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.llm_chat_name, 'llm_chat_name')
        self.validate_required(self.model_id, 'model_id')

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
        if self.llm_chat_name is not None:
            result['llm_chat_name'] = self.llm_chat_name
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.description is not None:
            result['description'] = self.description
        if self.config is not None:
            result['config'] = self.config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('llm_chat_name') is not None:
            self.llm_chat_name = m.get('llm_chat_name')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('config') is not None:
            self.config = m.get('config')
        return self


class AddUniversalsaasDigitalhumanLlmChatResponse(TeaModel):
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


class UpdateUniversalsaasDigitalhumanLlmChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        llm_chat_code: str = None,
        llm_chat_name: str = None,
        model_id: str = None,
        description: str = None,
        config: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 大模型对话配置编码
        self.llm_chat_code = llm_chat_code
        # 大模型对话配置名称
        self.llm_chat_name = llm_chat_name
        # 模型配置id
        self.model_id = model_id
        # 大模型对话配置名称
        self.description = description
        # 大模型对话自定义配置明细
        self.config = config

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.llm_chat_code, 'llm_chat_code')

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
        if self.llm_chat_code is not None:
            result['llm_chat_code'] = self.llm_chat_code
        if self.llm_chat_name is not None:
            result['llm_chat_name'] = self.llm_chat_name
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.description is not None:
            result['description'] = self.description
        if self.config is not None:
            result['config'] = self.config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('llm_chat_code') is not None:
            self.llm_chat_code = m.get('llm_chat_code')
        if m.get('llm_chat_name') is not None:
            self.llm_chat_name = m.get('llm_chat_name')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('config') is not None:
            self.config = m.get('config')
        return self


class UpdateUniversalsaasDigitalhumanLlmChatResponse(TeaModel):
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


class DeleteUniversalsaasDigitalhumanLlmChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        llm_chat_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 大模型对话配置编码
        self.llm_chat_code = llm_chat_code

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.llm_chat_code, 'llm_chat_code')

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
        if self.llm_chat_code is not None:
            result['llm_chat_code'] = self.llm_chat_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('llm_chat_code') is not None:
            self.llm_chat_code = m.get('llm_chat_code')
        return self


class DeleteUniversalsaasDigitalhumanLlmChatResponse(TeaModel):
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


class AddUniversalsaasDigitalhumanLlmModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        model_name: str = None,
        model_code: str = None,
        image_url: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 模型名称
        self.model_name = model_name
        # 模型编码
        self.model_code = model_code
        # 模型图片url
        self.image_url = image_url
        # 模型描述
        self.description = description

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.model_name, 'model_name')
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
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.image_url is not None:
            result['image_url'] = self.image_url
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('image_url') is not None:
            self.image_url = m.get('image_url')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class AddUniversalsaasDigitalhumanLlmModelResponse(TeaModel):
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


class DeleteUniversalsaasDigitalhumanLlmModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模型编码
        self.tenant_code = tenant_code
        # 模型id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.model_id, 'model_id')

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
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class DeleteUniversalsaasDigitalhumanLlmModelResponse(TeaModel):
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


class UpdateUniversalsaasDigitalhumanLlmModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        model_id: str = None,
        model_code: str = None,
        model_name: str = None,
        description: str = None,
        image_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 模型id
        self.model_id = model_id
        # 模型编码
        self.model_code = model_code
        # 模型名称
        self.model_name = model_name
        # 模型描述
        self.description = description
        # 模型图片url
        self.image_url = image_url

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.model_id, 'model_id')

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
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.description is not None:
            result['description'] = self.description
        if self.image_url is not None:
            result['image_url'] = self.image_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('image_url') is not None:
            self.image_url = m.get('image_url')
        return self


class UpdateUniversalsaasDigitalhumanLlmModelResponse(TeaModel):
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


class ListUniversalsaasDigitalhumanLlmModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        return self


class ListUniversalsaasDigitalhumanLlmModelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[AvatarLlmModelInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型配置列表
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
                temp_model = AvatarLlmModelInfo()
                self.item_list.append(temp_model.from_map(k))
        return self


class DetailUniversalsaasDigitalhumanLlmModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 模型id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.model_id, 'model_id')

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
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class DetailUniversalsaasDigitalhumanLlmModelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AvatarLlmModelInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型配置信明细
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
            temp_model = AvatarLlmModelInfo()
            self.data = temp_model.from_map(m['data'])
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


