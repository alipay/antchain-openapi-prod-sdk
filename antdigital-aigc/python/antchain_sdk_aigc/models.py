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


class SubTasks(TeaModel):
    def __init__(
        self,
        sub_task_id: int = None,
        sub_task_name: str = None,
        target_language: str = None,
        status: str = None,
        source_language: str = None,
        output_video_url: str = None,
        original_subtitle_url: str = None,
        translated_subtitle_url: str = None,
        duration_seconds: int = None,
        error_message: str = None,
    ):
        # 子任务ID
        self.sub_task_id = sub_task_id
        # 子任务名称
        self.sub_task_name = sub_task_name
        # 目标翻译语言
        self.target_language = target_language
        # 子任务状态包括：PENDING（待执行）、EXECUTING（执行中）、FAILED（失败）、COMPLETED（已完成）
        self.status = status
        # 源语言
        self.source_language = source_language
        # 翻译后视频地址
        self.output_video_url = output_video_url
        # 翻译前字幕文件地址
        self.original_subtitle_url = original_subtitle_url
        # 翻译后字幕文件地址
        self.translated_subtitle_url = translated_subtitle_url
        # 视频时长（秒）
        self.duration_seconds = duration_seconds
        # 错误信息
        self.error_message = error_message

    def validate(self):
        self.validate_required(self.sub_task_id, 'sub_task_id')
        self.validate_required(self.sub_task_name, 'sub_task_name')
        self.validate_required(self.target_language, 'target_language')
        self.validate_required(self.status, 'status')
        self.validate_required(self.source_language, 'source_language')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sub_task_id is not None:
            result['sub_task_id'] = self.sub_task_id
        if self.sub_task_name is not None:
            result['sub_task_name'] = self.sub_task_name
        if self.target_language is not None:
            result['target_language'] = self.target_language
        if self.status is not None:
            result['status'] = self.status
        if self.source_language is not None:
            result['source_language'] = self.source_language
        if self.output_video_url is not None:
            result['output_video_url'] = self.output_video_url
        if self.original_subtitle_url is not None:
            result['original_subtitle_url'] = self.original_subtitle_url
        if self.translated_subtitle_url is not None:
            result['translated_subtitle_url'] = self.translated_subtitle_url
        if self.duration_seconds is not None:
            result['duration_seconds'] = self.duration_seconds
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sub_task_id') is not None:
            self.sub_task_id = m.get('sub_task_id')
        if m.get('sub_task_name') is not None:
            self.sub_task_name = m.get('sub_task_name')
        if m.get('target_language') is not None:
            self.target_language = m.get('target_language')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('source_language') is not None:
            self.source_language = m.get('source_language')
        if m.get('output_video_url') is not None:
            self.output_video_url = m.get('output_video_url')
        if m.get('original_subtitle_url') is not None:
            self.original_subtitle_url = m.get('original_subtitle_url')
        if m.get('translated_subtitle_url') is not None:
            self.translated_subtitle_url = m.get('translated_subtitle_url')
        if m.get('duration_seconds') is not None:
            self.duration_seconds = m.get('duration_seconds')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class PushVideoCreatetaskRequest(TeaModel):
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
        duration: str = None,
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


class PushVideoCreatetaskResponse(TeaModel):
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


class QueryVideoQuerytaskRequest(TeaModel):
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


class QueryVideoQuerytaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        status: str = None,
        model: str = None,
        video_url: str = None,
        error_code: str = None,
        error_message: str = None,
        ext: str = None,
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
        # 模型名称
        self.model = model
        # 视频输出URL
        self.video_url = video_url
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_message = error_message
        # 扩展信息
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
        if self.video_url is not None:
            result['video_url'] = self.video_url
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
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
        if m.get('video_url') is not None:
            self.video_url = m.get('video_url')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('ext') is not None:
            self.ext = m.get('ext')
        return self


class PushVideotranslateCreatetaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        video_url: str = None,
        video_name: str = None,
        translate_type: str = None,
        source_language: str = None,
        target_languages: str = None,
        subtitle_url: str = None,
        sub_task_id: int = None,
        erase_subtitle: bool = None,
        embed_subtitle: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 视频URL
        self.video_url = video_url
        # 视频名称
        self.video_name = video_name
        # 翻译类型：VOICE(语音级翻译)、SUBTITLE(字幕级翻译)、FACE(面容级翻译)，二次翻译仅支持VOICE
        self.translate_type = translate_type
        # 字幕级翻译支持的源语言：zh(中文), en(英文)
        # 
        # 语音级翻译支持的源语言：zh(中文), en(英语), ja(日语), ko(韩语), yue(粤语), de(德语), fr(法语), es(西班牙语), ar(阿拉伯语), it(意大利语), pt(葡萄牙语), ru(俄语), hi(印地语), id(印度尼西亚语), ms(马来语),
        # nl(荷兰语), pl(波兰语), no(挪威语), da(丹麦语),hu(匈牙利语), cs(捷克语), ro(罗马尼亚语), bg(保加利亚语), sk(斯洛伐克语), sl(斯洛文尼亚语), lt(立陶宛语), lv(拉脱维亚语), et(爱沙尼亚语),
        # is(冰岛语), sq(阿尔巴尼亚语), az(阿塞拜疆语), be(白俄罗斯语), bs(波斯尼亚语), bn(孟加拉语),cy(威尔士语), fa(波斯语), hbs(克罗地亚语), mn(蒙古语), mr(马拉地语), mt(马耳他语), mi(毛利语),ne(尼泊尔语)
        # 
        # 面容级翻译支持的源语言：与 VOICE 源语言完全一致（42种）
        self.source_language = source_language
        # 字幕级翻译支持的目标语言：zh(中文), zh-tw(中文-繁体), en(英语), ja(日语), ko(韩语), id(印度尼西亚语), es(西班牙语), pt(葡萄牙语), ar(阿拉伯语), fr(法语), tr(土耳其语), de(德语), ru(俄语), th(泰语), vi(越南语), ms(马来语), yue(粤语), sichuan(四川话),dongbei(东北话), henan(河南话), shanghai(上海话), tianjin(天津话), beijing(北京话), chongqing(重庆话), hunan(湖南话),taiwan(台湾话), shanxi(山西话), shaanxi(陕西话)
        # 
        # 语音级翻译支持的目标语言：zh(中文), zh-tw(中文-繁体), en(英语), ja(日语), ko(韩语), yue(粤语), de(德语), fr(法语), es(西班牙语), ar(阿拉伯语), tr(土耳其语), ru(俄语), pt(葡萄牙语), vi(越南语), ms(马来语), th(泰语), id(印度尼西亚语), sichuan(四川话),
        # tianjin(天津话)
        # 
        # 面容级翻译支持的目标语言：en(英语)
        self.target_languages = target_languages
        # 字幕文件格式如下：
        # 1
        # 00:00:07,000 --> 00:00:08,300
        # 流产手术需要监护人
        # An abortion requires a guardian
        # 
        # 2
        # 00:00:08,300 --> 00:00:09,100
        # 签字才能做
        # to sign before it_s done
        # 
        # 3
        # 00:00:11,700 --> 00:00:12,800
        # 你看看咱们家
        # Look at our family
        # 
        # 4
        # 00:00:12,900 --> 00:00:13,700
        # 那么困难
        # we_re barely getting by
        # 
        # 5
        # 00:00:13,700 --> 00:00:14,700
        # 你爸又生病
        # Your father is sick again
        # 
        # 6
        # 00:00:14,700 --> 00:00:16,100
        # 我一把屎一把尿
        # I raised you from infancy
        # 
        # 7
        # 00:00:16,100 --> 00:00:16,700
        # 把你养大
        # got you this far
        # 
        # 8
        # 00:00:16,900 --> 00:00:17,800
        # 让你上学
        # and put you through school
        self.subtitle_url = subtitle_url
        # 子任务ID，二次翻译时必填
        self.sub_task_id = sub_task_id
        # 是否擦除字幕
        self.erase_subtitle = erase_subtitle
        # 是否嵌入字幕
        self.embed_subtitle = embed_subtitle

    def validate(self):
        self.validate_required(self.video_url, 'video_url')
        self.validate_required(self.video_name, 'video_name')
        self.validate_required(self.translate_type, 'translate_type')
        self.validate_required(self.source_language, 'source_language')
        self.validate_required(self.target_languages, 'target_languages')
        self.validate_required(self.erase_subtitle, 'erase_subtitle')
        self.validate_required(self.embed_subtitle, 'embed_subtitle')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.video_url is not None:
            result['video_url'] = self.video_url
        if self.video_name is not None:
            result['video_name'] = self.video_name
        if self.translate_type is not None:
            result['translate_type'] = self.translate_type
        if self.source_language is not None:
            result['source_language'] = self.source_language
        if self.target_languages is not None:
            result['target_languages'] = self.target_languages
        if self.subtitle_url is not None:
            result['subtitle_url'] = self.subtitle_url
        if self.sub_task_id is not None:
            result['sub_task_id'] = self.sub_task_id
        if self.erase_subtitle is not None:
            result['erase_subtitle'] = self.erase_subtitle
        if self.embed_subtitle is not None:
            result['embed_subtitle'] = self.embed_subtitle
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('video_url') is not None:
            self.video_url = m.get('video_url')
        if m.get('video_name') is not None:
            self.video_name = m.get('video_name')
        if m.get('translate_type') is not None:
            self.translate_type = m.get('translate_type')
        if m.get('source_language') is not None:
            self.source_language = m.get('source_language')
        if m.get('target_languages') is not None:
            self.target_languages = m.get('target_languages')
        if m.get('subtitle_url') is not None:
            self.subtitle_url = m.get('subtitle_url')
        if m.get('sub_task_id') is not None:
            self.sub_task_id = m.get('sub_task_id')
        if m.get('erase_subtitle') is not None:
            self.erase_subtitle = m.get('erase_subtitle')
        if m.get('embed_subtitle') is not None:
            self.embed_subtitle = m.get('embed_subtitle')
        return self


class PushVideotranslateCreatetaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: int = None,
        task_name: str = None,
        sub_task_count: int = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 任务名称
        self.task_name = task_name
        # 子任务数量
        self.sub_task_count = sub_task_count
        # 任务状态：PENDING-待执行、EXECUTING-执行中、COMPLETED-已完成
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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.sub_task_count is not None:
            result['sub_task_count'] = self.sub_task_count
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
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('sub_task_count') is not None:
            self.sub_task_count = m.get('sub_task_count')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryVideotranslateQuerytaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: int = None,
        sub_task_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id
        # 子任务ID，不传则查询所有子任务
        self.sub_task_id = sub_task_id

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
        if self.sub_task_id is not None:
            result['sub_task_id'] = self.sub_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('sub_task_id') is not None:
            self.sub_task_id = m.get('sub_task_id')
        return self


class QueryVideotranslateQuerytaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: int = None,
        task_name: str = None,
        status: str = None,
        sub_tasks: List[SubTasks] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务ID
        self.task_id = task_id
        # 任务名称
        self.task_name = task_name
        # 任务状态包括：PENDING（待执行）、EXECUTING（执行中）、COMPLETED（已完成）
        self.status = status
        # 子任务列表
        self.sub_tasks = sub_tasks

    def validate(self):
        if self.sub_tasks:
            for k in self.sub_tasks:
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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.status is not None:
            result['status'] = self.status
        result['sub_tasks'] = []
        if self.sub_tasks is not None:
            for k in self.sub_tasks:
                result['sub_tasks'].append(k.to_map() if k else None)
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
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.sub_tasks = []
        if m.get('sub_tasks') is not None:
            for k in m.get('sub_tasks'):
                temp_model = SubTasks()
                self.sub_tasks.append(temp_model.from_map(k))
        return self


