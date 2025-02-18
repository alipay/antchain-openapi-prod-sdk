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


class Sentence(TeaModel):
    def __init__(
        self,
        text: str = None,
        begin_time: int = None,
        end_time: int = None,
    ):
        # 字幕单句文本
        self.text = text
        # 字幕单句开始时间
        self.begin_time = begin_time
        # 字幕单句结束时间
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.text, 'text')
        self.validate_required(self.begin_time, 'begin_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.text is not None:
            result['text'] = self.text
        if self.begin_time is not None:
            result['begin_time'] = self.begin_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('begin_time') is not None:
            self.begin_time = m.get('begin_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class CaptionsStyle(TeaModel):
    def __init__(
        self,
        font_type: str = None,
        font_size: int = None,
        font_color: str = None,
        stroke_color: str = None,
        stroke_width: int = None,
        background_color: str = None,
    ):
        # 字体类型
        self.font_type = font_type
        # 字体大小，像素单位
        self.font_size = font_size
        # 字体颜色
        self.font_color = font_color
        # 描边颜色
        self.stroke_color = stroke_color
        # 描边宽度
        self.stroke_width = stroke_width
        # 字体背景颜色
        self.background_color = background_color

    def validate(self):
        self.validate_required(self.font_type, 'font_type')
        self.validate_required(self.font_size, 'font_size')
        self.validate_required(self.font_color, 'font_color')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.font_type is not None:
            result['font_type'] = self.font_type
        if self.font_size is not None:
            result['font_size'] = self.font_size
        if self.font_color is not None:
            result['font_color'] = self.font_color
        if self.stroke_color is not None:
            result['stroke_color'] = self.stroke_color
        if self.stroke_width is not None:
            result['stroke_width'] = self.stroke_width
        if self.background_color is not None:
            result['background_color'] = self.background_color
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('font_type') is not None:
            self.font_type = m.get('font_type')
        if m.get('font_size') is not None:
            self.font_size = m.get('font_size')
        if m.get('font_color') is not None:
            self.font_color = m.get('font_color')
        if m.get('stroke_color') is not None:
            self.stroke_color = m.get('stroke_color')
        if m.get('stroke_width') is not None:
            self.stroke_width = m.get('stroke_width')
        if m.get('background_color') is not None:
            self.background_color = m.get('background_color')
        return self


class CaptionsInfo(TeaModel):
    def __init__(
        self,
        x: int = None,
        y: int = None,
        w: int = None,
        h: int = None,
        id: str = None,
        sentences: List[Sentence] = None,
        custom_captions: bool = None,
        captions_style: CaptionsStyle = None,
        split_words: int = None,
    ):
        # 字幕画面位置x坐标，距左侧
        self.x = x
        # 字幕画面位置y坐标，距上侧
        self.y = y
        # 字幕框宽度
        self.w = w
        # 字幕框高度
        self.h = h
        # 字幕id
        self.id = id
        # 字幕句子时间节点信息
        self.sentences = sentences
        # 是否自定义字幕样式，默认为false
        self.custom_captions = custom_captions
        # 字幕自定义样式
        self.captions_style = captions_style
        # 字幕拆分字数，默认为单句在画面中不拆分。
        self.split_words = split_words

    def validate(self):
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')
        self.validate_required(self.w, 'w')
        self.validate_required(self.h, 'h')
        self.validate_required(self.sentences, 'sentences')
        if self.sentences:
            for k in self.sentences:
                if k:
                    k.validate()
        self.validate_required(self.captions_style, 'captions_style')
        if self.captions_style:
            self.captions_style.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.x is not None:
            result['x'] = self.x
        if self.y is not None:
            result['y'] = self.y
        if self.w is not None:
            result['w'] = self.w
        if self.h is not None:
            result['h'] = self.h
        if self.id is not None:
            result['id'] = self.id
        result['sentences'] = []
        if self.sentences is not None:
            for k in self.sentences:
                result['sentences'].append(k.to_map() if k else None)
        if self.custom_captions is not None:
            result['custom_captions'] = self.custom_captions
        if self.captions_style is not None:
            result['captions_style'] = self.captions_style.to_map()
        if self.split_words is not None:
            result['split_words'] = self.split_words
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('x') is not None:
            self.x = m.get('x')
        if m.get('y') is not None:
            self.y = m.get('y')
        if m.get('w') is not None:
            self.w = m.get('w')
        if m.get('h') is not None:
            self.h = m.get('h')
        if m.get('id') is not None:
            self.id = m.get('id')
        self.sentences = []
        if m.get('sentences') is not None:
            for k in m.get('sentences'):
                temp_model = Sentence()
                self.sentences.append(temp_model.from_map(k))
        if m.get('custom_captions') is not None:
            self.custom_captions = m.get('custom_captions')
        if m.get('captions_style') is not None:
            temp_model = CaptionsStyle()
            self.captions_style = temp_model.from_map(m['captions_style'])
        if m.get('split_words') is not None:
            self.split_words = m.get('split_words')
        return self


class AvatarProfile(TeaModel):
    def __init__(
        self,
        avatar_id: str = None,
        name: str = None,
        type: str = None,
        conf: str = None,
        pic_url: str = None,
        bg_url: str = None,
        thumb_url: str = None,
    ):
        # 190087
        self.avatar_id = avatar_id
        # 数字人形象名称
        self.name = name
        # CUSTOM---定制；
        # PRESET---预置
        self.type = type
        # 位置信息等配置信息
        self.conf = conf
        # 数字人形象图片
        self.pic_url = pic_url
        # 背景图片地址
        self.bg_url = bg_url
        # 形象thumb图Url
        self.thumb_url = thumb_url

    def validate(self):
        self.validate_required(self.avatar_id, 'avatar_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.pic_url, 'pic_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.avatar_id is not None:
            result['avatar_id'] = self.avatar_id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.conf is not None:
            result['conf'] = self.conf
        if self.pic_url is not None:
            result['pic_url'] = self.pic_url
        if self.bg_url is not None:
            result['bg_url'] = self.bg_url
        if self.thumb_url is not None:
            result['thumb_url'] = self.thumb_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('avatar_id') is not None:
            self.avatar_id = m.get('avatar_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('conf') is not None:
            self.conf = m.get('conf')
        if m.get('pic_url') is not None:
            self.pic_url = m.get('pic_url')
        if m.get('bg_url') is not None:
            self.bg_url = m.get('bg_url')
        if m.get('thumb_url') is not None:
            self.thumb_url = m.get('thumb_url')
        return self


class AvatarProfileResult(TeaModel):
    def __init__(
        self,
        total: int = None,
        page_index: int = None,
        item_list: List[AvatarProfile] = None,
    ):
        # 数字人形象数量
        self.total = total
        # 查询页面索引，不分页无
        self.page_index = page_index
        # 数字人形象列表
        self.item_list = item_list

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.item_list, 'item_list')
        if self.item_list:
            for k in self.item_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.page_index is not None:
            result['page_index'] = self.page_index
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = AvatarProfile()
                self.item_list.append(temp_model.from_map(k))
        return self


class NoiseResult(TeaModel):
    def __init__(
        self,
        state: str = None,
        speaker_db: str = None,
        noise_db: str = None,
    ):
        # success/failed/queuing/processing
        self.state = state
        # 声音大小
        self.speaker_db = speaker_db
        # 噪音值
        self.noise_db = noise_db

    def validate(self):
        self.validate_required(self.state, 'state')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.state is not None:
            result['state'] = self.state
        if self.speaker_db is not None:
            result['speaker_db'] = self.speaker_db
        if self.noise_db is not None:
            result['noise_db'] = self.noise_db
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('speaker_db') is not None:
            self.speaker_db = m.get('speaker_db')
        if m.get('noise_db') is not None:
            self.noise_db = m.get('noise_db')
        return self


class Paster(TeaModel):
    def __init__(
        self,
        x: int = None,
        y: int = None,
        src_url: str = None,
        scale: str = None,
    ):
        # 贴片元素离画面位置x坐标
        self.x = x
        # 贴片元素离画面位置y坐标
        self.y = y
        # 贴片元素 url,支持 gif png jpg等图片格式
        self.src_url = src_url
        # 贴片元素缩放比例
        self.scale = scale

    def validate(self):
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')
        self.validate_required(self.src_url, 'src_url')
        self.validate_required(self.scale, 'scale')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.x is not None:
            result['x'] = self.x
        if self.y is not None:
            result['y'] = self.y
        if self.src_url is not None:
            result['src_url'] = self.src_url
        if self.scale is not None:
            result['scale'] = self.scale
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('x') is not None:
            self.x = m.get('x')
        if m.get('y') is not None:
            self.y = m.get('y')
        if m.get('src_url') is not None:
            self.src_url = m.get('src_url')
        if m.get('scale') is not None:
            self.scale = m.get('scale')
        return self


class ScriptVoiceConfig(TeaModel):
    def __init__(
        self,
        voice_id: str = None,
        text: str = None,
        speed: str = None,
        audio_url: str = None,
        volume: str = None,
        pitch: str = None,
    ):
        # 音色id，合成驱动选择text时必填
        self.voice_id = voice_id
        # 话术脚本内容，合成驱动选择text时必填
        self.text = text
        # 0.5～2，语速，合成驱动选择text时必填
        self.speed = speed
        # 音频URL，合成驱动选择audio时必填
        self.audio_url = audio_url
        # 音量，[0.1, 3]，默认为1，通常保留一位小数即可
        self.volume = volume
        # 音调，[0.1, 3]，默认为1，通常保留一位小数即可
        self.pitch = pitch

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.voice_id is not None:
            result['voice_id'] = self.voice_id
        if self.text is not None:
            result['text'] = self.text
        if self.speed is not None:
            result['speed'] = self.speed
        if self.audio_url is not None:
            result['audio_url'] = self.audio_url
        if self.volume is not None:
            result['volume'] = self.volume
        if self.pitch is not None:
            result['pitch'] = self.pitch
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('voice_id') is not None:
            self.voice_id = m.get('voice_id')
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('speed') is not None:
            self.speed = m.get('speed')
        if m.get('audio_url') is not None:
            self.audio_url = m.get('audio_url')
        if m.get('volume') is not None:
            self.volume = m.get('volume')
        if m.get('pitch') is not None:
            self.pitch = m.get('pitch')
        return self


class AvatarVoice(TeaModel):
    def __init__(
        self,
        name: str = None,
        code: str = None,
        type: str = None,
        pic_url: str = None,
        demo_url: str = None,
    ):
        # 音色名称
        self.name = name
        # 音色代码
        self.code = code
        # CLONE--克隆音色；
        # PRESET--预置；
        # CUSTOM--自定义，暂时不采用。
        self.type = type
        # 音色形象url
        self.pic_url = pic_url
        # 试听音频片段
        self.demo_url = demo_url

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.code, 'code')
        self.validate_required(self.type, 'type')
        self.validate_required(self.pic_url, 'pic_url')
        self.validate_required(self.demo_url, 'demo_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.code is not None:
            result['code'] = self.code
        if self.type is not None:
            result['type'] = self.type
        if self.pic_url is not None:
            result['pic_url'] = self.pic_url
        if self.demo_url is not None:
            result['demo_url'] = self.demo_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('pic_url') is not None:
            self.pic_url = m.get('pic_url')
        if m.get('demo_url') is not None:
            self.demo_url = m.get('demo_url')
        return self


class ProfileInfo(TeaModel):
    def __init__(
        self,
        x: int = None,
        y: int = None,
        w: int = None,
        h: int = None,
        scale: str = None,
    ):
        # 数字人离画面位置坐标,可以为负数或者出画
        # 数字人在视频生成中的位置
        self.x = x
        # 数字人离画面位置坐标,可以为负数或者出画
        # 数字人在视频生成中的位置
        self.y = y
        # 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
        self.w = w
        # 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
        self.h = h
        # 数字人视频大小缩放,实际大小为  scale*w   scale*h
        self.scale = scale

    def validate(self):
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')
        self.validate_required(self.w, 'w')
        self.validate_required(self.h, 'h')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.x is not None:
            result['x'] = self.x
        if self.y is not None:
            result['y'] = self.y
        if self.w is not None:
            result['w'] = self.w
        if self.h is not None:
            result['h'] = self.h
        if self.scale is not None:
            result['scale'] = self.scale
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('x') is not None:
            self.x = m.get('x')
        if m.get('y') is not None:
            self.y = m.get('y')
        if m.get('w') is not None:
            self.w = m.get('w')
        if m.get('h') is not None:
            self.h = m.get('h')
        if m.get('scale') is not None:
            self.scale = m.get('scale')
        return self


class AvatarAction(TeaModel):
    def __init__(
        self,
        action_id: int = None,
        duration: int = None,
        video_path: str = None,
    ):
        # 动作序列id
        self.action_id = action_id
        # 动作时长，单位毫秒
        self.duration = duration
        # 动作预览链接
        self.video_path = video_path

    def validate(self):
        self.validate_required(self.action_id, 'action_id')
        self.validate_required(self.duration, 'duration')
        self.validate_required(self.video_path, 'video_path')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_id is not None:
            result['action_id'] = self.action_id
        if self.duration is not None:
            result['duration'] = self.duration
        if self.video_path is not None:
            result['video_path'] = self.video_path
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_id') is not None:
            self.action_id = m.get('action_id')
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        if m.get('video_path') is not None:
            self.video_path = m.get('video_path')
        return self


class TrainingResult(TeaModel):
    def __init__(
        self,
        model_id: str = None,
        voice_id: str = None,
    ):
        # 数字人id
        self.model_id = model_id
        # 音色id
        self.voice_id = voice_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.voice_id is not None:
            result['voice_id'] = self.voice_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('voice_id') is not None:
            self.voice_id = m.get('voice_id')
        return self


class CloneTask(TeaModel):
    def __init__(
        self,
        model_id: str = None,
        voice_id: str = None,
        avatar_status: str = None,
        fail_reason: str = None,
    ):
        # 数字人id
        self.model_id = model_id
        # 音色id
        self.voice_id = voice_id
        # 初始化/训练队列中/声音克隆中/声音克隆完成/形象克隆中/形象克隆完成
        self.avatar_status = avatar_status
        # 数字人训练失败会返回原因
        self.fail_reason = fail_reason

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.voice_id is not None:
            result['voice_id'] = self.voice_id
        if self.avatar_status is not None:
            result['avatar_status'] = self.avatar_status
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('voice_id') is not None:
            self.voice_id = m.get('voice_id')
        if m.get('avatar_status') is not None:
            self.avatar_status = m.get('avatar_status')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        return self


class VideoTask(TeaModel):
    def __init__(
        self,
        state: str = None,
        video_url: str = None,
        video_duration: int = None,
        captions_info: CaptionsInfo = None,
    ):
        # RUNNING, COMPLETE,FAIL
        self.state = state
        # 完成状态，会返回视频地址
        self.video_url = video_url
        # 视频时长
        self.video_duration = video_duration
        # 字幕时间戳信息
        self.captions_info = captions_info

    def validate(self):
        self.validate_required(self.state, 'state')
        if self.captions_info:
            self.captions_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.state is not None:
            result['state'] = self.state
        if self.video_url is not None:
            result['video_url'] = self.video_url
        if self.video_duration is not None:
            result['video_duration'] = self.video_duration
        if self.captions_info is not None:
            result['captions_info'] = self.captions_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('video_url') is not None:
            self.video_url = m.get('video_url')
        if m.get('video_duration') is not None:
            self.video_duration = m.get('video_duration')
        if m.get('captions_info') is not None:
            temp_model = CaptionsInfo()
            self.captions_info = temp_model.from_map(m['captions_info'])
        return self


class Background(TeaModel):
    def __init__(
        self,
        src_url: str = None,
        scale: str = None,
        x: int = None,
        y: int = None,
    ):
        # 背景元素，支持 gif png jpg mp4等格式
        self.src_url = src_url
        # 背景缩放比例
        self.scale = scale
        # 背景图片x坐标位置，距左侧
        self.x = x
        # 背景图片y坐标位置，距上侧
        self.y = y

    def validate(self):
        self.validate_required(self.src_url, 'src_url')
        self.validate_required(self.scale, 'scale')
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.src_url is not None:
            result['src_url'] = self.src_url
        if self.scale is not None:
            result['scale'] = self.scale
        if self.x is not None:
            result['x'] = self.x
        if self.y is not None:
            result['y'] = self.y
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('src_url') is not None:
            self.src_url = m.get('src_url')
        if m.get('scale') is not None:
            self.scale = m.get('scale')
        if m.get('x') is not None:
            self.x = m.get('x')
        if m.get('y') is not None:
            self.y = m.get('y')
        return self


class VoiceTask(TeaModel):
    def __init__(
        self,
        state: str = None,
        audio_url: str = None,
        audio_time: int = None,
        captions_info: CaptionsInfo = None,
    ):
        # RUNNING, COMPLETE,FAIL
        self.state = state
        # 音频地址
        self.audio_url = audio_url
        # 音频时长
        self.audio_time = audio_time
        # 字幕信息
        self.captions_info = captions_info

    def validate(self):
        self.validate_required(self.state, 'state')
        self.validate_required(self.audio_url, 'audio_url')
        self.validate_required(self.audio_time, 'audio_time')
        if self.captions_info:
            self.captions_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.state is not None:
            result['state'] = self.state
        if self.audio_url is not None:
            result['audio_url'] = self.audio_url
        if self.audio_time is not None:
            result['audio_time'] = self.audio_time
        if self.captions_info is not None:
            result['captions_info'] = self.captions_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('audio_url') is not None:
            self.audio_url = m.get('audio_url')
        if m.get('audio_time') is not None:
            self.audio_time = m.get('audio_time')
        if m.get('captions_info') is not None:
            temp_model = CaptionsInfo()
            self.captions_info = temp_model.from_map(m['captions_info'])
        return self


class ListUniversalsaasDigitalhumanVideoVoiceRequest(TeaModel):
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


class ListUniversalsaasDigitalhumanVideoVoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        data: List[AvatarVoice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果状态
        self.status = status
        # 音色列表
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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AvatarVoice()
                self.data.append(temp_model.from_map(k))
        return self


class ListUniversalsaasDigitalhumanVideoProfileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        type: str = None,
        page_index: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 2D_PRESET---2d预置；
        # 3D_PRESET---3d预置；
        # 2D_CUSTOM--2d定制；
        # 3D_CUSTOM--3d定制；
        # 
        self.type = type
        # 分页查询页面索引，传值为空不分页
        # 索引从0开始。
        self.page_index = page_index
        # 分页页面大小，默认10
        self.page_size = page_size

    def validate(self):
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
        if self.type is not None:
            result['type'] = self.type
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListUniversalsaasDigitalhumanVideoProfileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        data: AvatarProfileResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询结果状态
        self.status = status
        # 数字人形象集合
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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            temp_model = AvatarProfileResult()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateUniversalsaasDigitalhumanVideoTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        height: int = None,
        avatar_id: str = None,
        driver_type: str = None,
        profile_info: ProfileInfo = None,
        script_voice_config: ScriptVoiceConfig = None,
        open_captions: bool = None,
        captions_info: CaptionsInfo = None,
        replace_sensitive: bool = None,
        background: Background = None,
        pasters: List[Paster] = None,
        format: str = None,
        width: int = None,
        return_captions: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 画布大小
        self.height = height
        # 数字人id
        self.avatar_id = avatar_id
        # text/audio, 合成驱动--文本/音频
        self.driver_type = driver_type
        # 形象设置
        self.profile_info = profile_info
        # 话术脚本语音配置
        self.script_voice_config = script_voice_config
        # 是否开启字幕
        self.open_captions = open_captions
        # 字幕配置
        self.captions_info = captions_info
        # 是否替换字幕敏感词
        self.replace_sensitive = replace_sensitive
        # 背景信息
        self.background = background
        # 贴片元素信息
        self.pasters = pasters
        # 数字人视频生成格式，默认不填
        self.format = format
        # 画布大小
        self.width = width
        # 是否返回字幕时间戳，但不合成到视频画面里面
        self.return_captions = return_captions

    def validate(self):
        self.validate_required(self.avatar_id, 'avatar_id')
        self.validate_required(self.driver_type, 'driver_type')
        if self.profile_info:
            self.profile_info.validate()
        self.validate_required(self.script_voice_config, 'script_voice_config')
        if self.script_voice_config:
            self.script_voice_config.validate()
        self.validate_required(self.open_captions, 'open_captions')
        if self.captions_info:
            self.captions_info.validate()
        if self.background:
            self.background.validate()
        if self.pasters:
            for k in self.pasters:
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
        if self.height is not None:
            result['height'] = self.height
        if self.avatar_id is not None:
            result['avatar_id'] = self.avatar_id
        if self.driver_type is not None:
            result['driver_type'] = self.driver_type
        if self.profile_info is not None:
            result['profile_info'] = self.profile_info.to_map()
        if self.script_voice_config is not None:
            result['script_voice_config'] = self.script_voice_config.to_map()
        if self.open_captions is not None:
            result['open_captions'] = self.open_captions
        if self.captions_info is not None:
            result['captions_info'] = self.captions_info.to_map()
        if self.replace_sensitive is not None:
            result['replace_sensitive'] = self.replace_sensitive
        if self.background is not None:
            result['background'] = self.background.to_map()
        result['pasters'] = []
        if self.pasters is not None:
            for k in self.pasters:
                result['pasters'].append(k.to_map() if k else None)
        if self.format is not None:
            result['format'] = self.format
        if self.width is not None:
            result['width'] = self.width
        if self.return_captions is not None:
            result['return_captions'] = self.return_captions
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('avatar_id') is not None:
            self.avatar_id = m.get('avatar_id')
        if m.get('driver_type') is not None:
            self.driver_type = m.get('driver_type')
        if m.get('profile_info') is not None:
            temp_model = ProfileInfo()
            self.profile_info = temp_model.from_map(m['profile_info'])
        if m.get('script_voice_config') is not None:
            temp_model = ScriptVoiceConfig()
            self.script_voice_config = temp_model.from_map(m['script_voice_config'])
        if m.get('open_captions') is not None:
            self.open_captions = m.get('open_captions')
        if m.get('captions_info') is not None:
            temp_model = CaptionsInfo()
            self.captions_info = temp_model.from_map(m['captions_info'])
        if m.get('replace_sensitive') is not None:
            self.replace_sensitive = m.get('replace_sensitive')
        if m.get('background') is not None:
            temp_model = Background()
            self.background = temp_model.from_map(m['background'])
        self.pasters = []
        if m.get('pasters') is not None:
            for k in m.get('pasters'):
                temp_model = Paster()
                self.pasters.append(temp_model.from_map(k))
        if m.get('format') is not None:
            self.format = m.get('format')
        if m.get('width') is not None:
            self.width = m.get('width')
        if m.get('return_captions') is not None:
            self.return_captions = m.get('return_captions')
        return self


class CreateUniversalsaasDigitalhumanVideoTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果状态
        self.status = status
        # taskId
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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryUniversalsaasDigitalhumanVideoTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 视频合成任务ID
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


class QueryUniversalsaasDigitalhumanVideoTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        data: VideoTask = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果状态
        self.status = status
        # 合成结果
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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            temp_model = VideoTask()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateUniversalsaasDigitalhumanVoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        text: str = None,
        speed: str = None,
        pitch: str = None,
        volume: str = None,
        voice: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需要转语音的文字
        self.text = text
        # 语速，[0.5,2.0]，默认1.0
        self.speed = speed
        # 音调，[0.1,3.0]，默认1.0
        self.pitch = pitch
        # 音量，[0.1,3.0]，默认1.0
        self.volume = volume
        # 音色id
        self.voice = voice

    def validate(self):
        self.validate_required(self.text, 'text')
        self.validate_required(self.voice, 'voice')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.text is not None:
            result['text'] = self.text
        if self.speed is not None:
            result['speed'] = self.speed
        if self.pitch is not None:
            result['pitch'] = self.pitch
        if self.volume is not None:
            result['volume'] = self.volume
        if self.voice is not None:
            result['voice'] = self.voice
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('speed') is not None:
            self.speed = m.get('speed')
        if m.get('pitch') is not None:
            self.pitch = m.get('pitch')
        if m.get('volume') is not None:
            self.volume = m.get('volume')
        if m.get('voice') is not None:
            self.voice = m.get('voice')
        return self


class CreateUniversalsaasDigitalhumanVoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        status: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 音频url
        self.data = data
        # 结果状态
        self.status = status

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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class CloneUniversalsaasDigitalhumanAvatarRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_url: str = None,
        name: str = None,
        clone_voice: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数字人训练视频url
        self.file_url = file_url
        # 数字人名称
        self.name = name
        # 是否克隆声音，默认为false
        self.clone_voice = clone_voice

    def validate(self):
        self.validate_required(self.file_url, 'file_url')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.name is not None:
            result['name'] = self.name
        if self.clone_voice is not None:
            result['clone_voice'] = self.clone_voice
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('clone_voice') is not None:
            self.clone_voice = m.get('clone_voice')
        return self


class CloneUniversalsaasDigitalhumanAvatarResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        result: TrainingResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果状态
        self.status = status
        # 训练结果，包含数字人id与音色id
        self.result = result

    def validate(self):
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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('result') is not None:
            temp_model = TrainingResult()
            self.result = temp_model.from_map(m['result'])
        return self


class CloneUniversalsaasDigitalhumanAvatarVoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        voice_url: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 训练音频url
        self.voice_url = voice_url
        # 音频名称
        self.name = name

    def validate(self):
        self.validate_required(self.voice_url, 'voice_url')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.voice_url is not None:
            result['voice_url'] = self.voice_url
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('voice_url') is not None:
            self.voice_url = m.get('voice_url')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CloneUniversalsaasDigitalhumanAvatarVoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        voice_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果状态
        # 
        self.status = status
        # 音色id
        self.voice_id = voice_id

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
        if self.status is not None:
            result['status'] = self.status
        if self.voice_id is not None:
            result['voice_id'] = self.voice_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('voice_id') is not None:
            self.voice_id = m.get('voice_id')
        return self


class QueryUniversalsaasDigitalhumanCloneTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数字人id
        self.model_id = model_id

    def validate(self):
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
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class QueryUniversalsaasDigitalhumanCloneTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        data: CloneTask = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果状态
        self.status = status
        # 数字人克隆任务结果
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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            temp_model = CloneTask()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateUniversalsaasDigitalhumanVoiceTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        text: str = None,
        speed: str = None,
        pitch: str = None,
        volume: str = None,
        voice_id: str = None,
        open_caption: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 话术脚本
        self.text = text
        # 语速，支持 0.5-2 倍速
        self.speed = speed
        # 音调，[0.1, 3]，默认为1，通常保留一位小数即可
        self.pitch = pitch
        # [0.1, 3]，默认为1，通常保留一位小数即可
        self.volume = volume
        # 音色id
        self.voice_id = voice_id
        # 是否返回字幕信息，默认不返回
        self.open_caption = open_caption

    def validate(self):
        self.validate_required(self.text, 'text')
        self.validate_required(self.speed, 'speed')
        self.validate_required(self.voice_id, 'voice_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.text is not None:
            result['text'] = self.text
        if self.speed is not None:
            result['speed'] = self.speed
        if self.pitch is not None:
            result['pitch'] = self.pitch
        if self.volume is not None:
            result['volume'] = self.volume
        if self.voice_id is not None:
            result['voice_id'] = self.voice_id
        if self.open_caption is not None:
            result['open_caption'] = self.open_caption
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('speed') is not None:
            self.speed = m.get('speed')
        if m.get('pitch') is not None:
            self.pitch = m.get('pitch')
        if m.get('volume') is not None:
            self.volume = m.get('volume')
        if m.get('voice_id') is not None:
            self.voice_id = m.get('voice_id')
        if m.get('open_caption') is not None:
            self.open_caption = m.get('open_caption')
        return self


class CreateUniversalsaasDigitalhumanVoiceTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果状态
        self.status = status
        # taskId
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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryUniversalsaasDigitalhumanVoiceTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 音频合成任务ID
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


class QueryUniversalsaasDigitalhumanVoiceTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        data: VoiceTask = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果状态
        self.status = status
        # 音频生成返回结果
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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            temp_model = VoiceTask()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryUniversalsaasDigitalhumanAvatarActionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        avatar_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数字人id
        self.avatar_id = avatar_id

    def validate(self):
        self.validate_required(self.avatar_id, 'avatar_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.avatar_id is not None:
            result['avatar_id'] = self.avatar_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('avatar_id') is not None:
            self.avatar_id = m.get('avatar_id')
        return self


class QueryUniversalsaasDigitalhumanAvatarActionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AvatarAction] = None,
        status: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 动作序列列表
        self.data = data
        # 状态结果
        self.status = status

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
        if self.status is not None:
            result['status'] = self.status
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
                temp_model = AvatarAction()
                self.data.append(temp_model.from_map(k))
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class SubmitUniversalsaasDigitalhumanOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source: str = None,
        action_type: str = None,
        biz_type: str = None,
        biz_id: str = None,
        biz_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 渠道类型
        self.source = source
        # 操作类型
        self.action_type = action_type
        # 业务类型
        self.biz_type = biz_type
        # 业务id
        self.biz_id = biz_id
        # 业务自定义信息
        self.biz_data = biz_data

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.action_type, 'action_type')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.biz_data, 'biz_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source is not None:
            result['source'] = self.source
        if self.action_type is not None:
            result['action_type'] = self.action_type
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_data is not None:
            result['biz_data'] = self.biz_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_data') is not None:
            self.biz_data = m.get('biz_data')
        return self


class SubmitUniversalsaasDigitalhumanOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        status: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单记录code
        self.data = data
        # 结果状态
        self.status = status

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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class CountUniversalsaasDigitalhumanVoiceNoiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        media_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 音视频文件url
        self.media_url = media_url

    def validate(self):
        self.validate_required(self.media_url, 'media_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.media_url is not None:
            result['media_url'] = self.media_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('media_url') is not None:
            self.media_url = m.get('media_url')
        return self


class CountUniversalsaasDigitalhumanVoiceNoiseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果状态
        self.status = status
        # taskId
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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryUniversalsaasDigitalhumanVoiceNoiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 音频检测任务taskId
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


class QueryUniversalsaasDigitalhumanVoiceNoiseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: bool = None,
        data: NoiseResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果状态
        self.status = status
        # 音色检测结果
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
        if self.status is not None:
            result['status'] = self.status
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
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data') is not None:
            temp_model = NoiseResult()
            self.data = temp_model.from_map(m['data'])
        return self


