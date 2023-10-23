# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


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


class PositionSizeInfo(TeaModel):
    def __init__(
        self,
        x: int = None,
        y: int = None,
        width: int = None,
        height: int = None,
    ):
        # 数字人x轴（竖轴）坐标
        self.x = x
        # 数字人y轴（横轴）坐标
        self.y = y
        # 数字人宽度
        # 
        self.width = width
        # 数字人高度
        self.height = height

    def validate(self):
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')
        self.validate_required(self.width, 'width')
        self.validate_required(self.height, 'height')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.x is not None:
            result['x'] = self.x
        if self.y is not None:
            result['y'] = self.y
        if self.width is not None:
            result['width'] = self.width
        if self.height is not None:
            result['height'] = self.height
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('x') is not None:
            self.x = m.get('x')
        if m.get('y') is not None:
            self.y = m.get('y')
        if m.get('width') is not None:
            self.width = m.get('width')
        if m.get('height') is not None:
            self.height = m.get('height')
        return self


class GetInteractvideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        question: str = None,
        avatar_id: str = None,
        interact_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 问题
        self.question = question
        # 数字人形象ID(不填写时,返回默认形象视频)
        self.avatar_id = avatar_id
        # 交互类型（默认为QA, 问答：QA）
        self.interact_type = interact_type

    def validate(self):
        self.validate_required(self.question, 'question')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.question is not None:
            result['question'] = self.question
        if self.avatar_id is not None:
            result['avatar_id'] = self.avatar_id
        if self.interact_type is not None:
            result['interact_type'] = self.interact_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('avatar_id') is not None:
            self.avatar_id = m.get('avatar_id')
        if m.get('interact_type') is not None:
            self.interact_type = m.get('interact_type')
        return self


class GetInteractvideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        answer_video_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频答案URL(视频资源存储在OSS服务上,访问接口时,返回一个视频下载链接)
        self.answer_video_url = answer_video_url

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
        if self.answer_video_url is not None:
            result['answer_video_url'] = self.answer_video_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('answer_video_url') is not None:
            self.answer_video_url = m.get('answer_video_url')
        return self


class SubmitAvatarVideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        avatar_id: str = None,
        speaker_code: str = None,
        text: str = None,
        volume: int = None,
        speed: int = None,
        tone: int = None,
        background_url: str = None,
        resolution: str = None,
        radio: str = None,
        human_config: PositionSizeInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 视频名称
        self.name = name
        # 数字人id
        self.avatar_id = avatar_id
        # 说话人code
        self.speaker_code = speaker_code
        # 播报文本（一千字以内），支持SSML
        self.text = text
        # 音量（0~100，默认50）
        self.volume = volume
        # 语速（-50~50，默认 0）
        self.speed = speed
        # 音调（-50~50，默认 0）
        self.tone = tone
        # 背景图片Url，需要公网可访问
        self.background_url = background_url
        # 分辨率，暂只支持1080
        self.resolution = resolution
        # 画布比例，16:9/9:16
        self.radio = radio
        # 数字人位置大小信息，以左上角为起始坐标，向右向下为正值
        self.human_config = human_config

    def validate(self):
        self.validate_required(self.avatar_id, 'avatar_id')
        self.validate_required(self.speaker_code, 'speaker_code')
        self.validate_required(self.text, 'text')
        self.validate_required(self.background_url, 'background_url')
        self.validate_required(self.resolution, 'resolution')
        self.validate_required(self.radio, 'radio')
        self.validate_required(self.human_config, 'human_config')
        if self.human_config:
            self.human_config.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.avatar_id is not None:
            result['avatar_id'] = self.avatar_id
        if self.speaker_code is not None:
            result['speaker_code'] = self.speaker_code
        if self.text is not None:
            result['text'] = self.text
        if self.volume is not None:
            result['volume'] = self.volume
        if self.speed is not None:
            result['speed'] = self.speed
        if self.tone is not None:
            result['tone'] = self.tone
        if self.background_url is not None:
            result['background_url'] = self.background_url
        if self.resolution is not None:
            result['resolution'] = self.resolution
        if self.radio is not None:
            result['radio'] = self.radio
        if self.human_config is not None:
            result['human_config'] = self.human_config.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('avatar_id') is not None:
            self.avatar_id = m.get('avatar_id')
        if m.get('speaker_code') is not None:
            self.speaker_code = m.get('speaker_code')
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('volume') is not None:
            self.volume = m.get('volume')
        if m.get('speed') is not None:
            self.speed = m.get('speed')
        if m.get('tone') is not None:
            self.tone = m.get('tone')
        if m.get('background_url') is not None:
            self.background_url = m.get('background_url')
        if m.get('resolution') is not None:
            self.resolution = m.get('resolution')
        if m.get('radio') is not None:
            self.radio = m.get('radio')
        if m.get('human_config') is not None:
            temp_model = PositionSizeInfo()
            self.human_config = temp_model.from_map(m['human_config'])
        return self


class SubmitAvatarVideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频任务id
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


class QueryAvatarVideoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 视频任务id
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


class QueryAvatarVideoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        video_status: str = None,
        video_url: str = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 视频任务id
        self.task_id = task_id
        # 视频合成任务状态（EXPORTING：导出中，NORMAL：成功，FAILED：失败）
        self.video_status = video_status
        # 视频url
        self.video_url = video_url
        # 提示消息
        self.message = message

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
        if self.video_status is not None:
            result['video_status'] = self.video_status
        if self.video_url is not None:
            result['video_url'] = self.video_url
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
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('video_status') is not None:
            self.video_status = m.get('video_status')
        if m.get('video_url') is not None:
            self.video_url = m.get('video_url')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


