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


class QueryVoiceserviceQuerycalldetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        instance_code: str = None,
        call_id: str = None,
        query_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 分配的租户id
        self.tenant_id = tenant_id
        # 分配的业务code
        self.instance_code = instance_code
        # 通话的唯一识别 ID。调用外呼接口发起通话后，返回参数中会携带 CallId。
        self.call_id = call_id
        # 通话发生的时间。格式为 Unix 时间戳，单位：毫秒。
        self.query_date = query_date

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.instance_code, 'instance_code')
        self.validate_required(self.call_id, 'call_id')
        self.validate_required(self.query_date, 'query_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_code is not None:
            result['instance_code'] = self.instance_code
        if self.call_id is not None:
            result['call_id'] = self.call_id
        if self.query_date is not None:
            result['query_date'] = self.query_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_code') is not None:
            self.instance_code = m.get('instance_code')
        if m.get('call_id') is not None:
            self.call_id = m.get('call_id')
        if m.get('query_date') is not None:
            self.query_date = m.get('query_date')
        return self


class QueryVoiceserviceQuerycalldetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        message: str = None,
        data: str = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求状态码。
        # ● 返回 OK 代表请求成功。
        self.code = code
        # 状态码的描述。
        self.message = message
        # 返回的呼叫详情。JSON 格式。以下字段仅供参考，以具体返回详情为准。
        # ● caller：主叫号码。
        # ● startDate：通话开始时间。
        # ● stateDesc：通话状态描述。
        # ● duration：通话时长。单位：秒。0：用户未接通。
        # ● callerShowNumber：被叫显号。
        # ● gmtCreate：通话请求的接收时间。
        # ● state：通话状态。通话状态是运营商实时返回的，更多状态信息，请参见通话结果状态码。
        # ● endDate：通话结束时间。
        # ● calleeShowNumber：被叫显号。
        # ● callee：被叫号码。
        # ● aRingTime：a 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
        # ● aEndTime：a 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
        # （待确认）
        # ● bRingTime：b 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
        # ● bEndTime：b 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
        self.data = data
        # 本次调用请求的 ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。
        self.request_id = request_id

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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class SendVoiceserviceSinglecallRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        instance_code: str = None,
        called_show_number: str = None,
        called_number: str = None,
        context: str = None,
        voice_code: str = None,
        tts_style: str = None,
        tts_volume: int = None,
        tts_speed: int = None,
        play_times: int = None,
        out_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 分配的租户id
        self.tenant_id = tenant_id
        # 分配的业务code
        self.instance_code = instance_code
        # 分配的主叫号码
        self.called_show_number = called_show_number
        # 被叫用户号码
        self.called_number = called_number
        # 播报文本内容
        self.context = context
        # 录音字段
        self.voice_code = voice_code
        # TTS 变量播放时的声音风格。
        self.tts_style = tts_style
        # TTS 变量播放的音量。取值范围：0~100，默认值为 50。
        self.tts_volume = tts_volume
        # TTS 变量播放时的声音速度。取值范围：0.5~2，默认值为 1。
        self.tts_speed = tts_speed
        # 播放次数。取值范围：1~3，默认取值 3。
        self.play_times = play_times
        # 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
        # 字符串类型，长度限制为 1~128 个字符。
        self.out_id = out_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.instance_code, 'instance_code')
        self.validate_required(self.called_show_number, 'called_show_number')
        self.validate_required(self.called_number, 'called_number')
        self.validate_required(self.context, 'context')
        self.validate_required(self.tts_style, 'tts_style')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_code is not None:
            result['instance_code'] = self.instance_code
        if self.called_show_number is not None:
            result['called_show_number'] = self.called_show_number
        if self.called_number is not None:
            result['called_number'] = self.called_number
        if self.context is not None:
            result['context'] = self.context
        if self.voice_code is not None:
            result['voice_code'] = self.voice_code
        if self.tts_style is not None:
            result['tts_style'] = self.tts_style
        if self.tts_volume is not None:
            result['tts_volume'] = self.tts_volume
        if self.tts_speed is not None:
            result['tts_speed'] = self.tts_speed
        if self.play_times is not None:
            result['play_times'] = self.play_times
        if self.out_id is not None:
            result['out_id'] = self.out_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_code') is not None:
            self.instance_code = m.get('instance_code')
        if m.get('called_show_number') is not None:
            self.called_show_number = m.get('called_show_number')
        if m.get('called_number') is not None:
            self.called_number = m.get('called_number')
        if m.get('context') is not None:
            self.context = m.get('context')
        if m.get('voice_code') is not None:
            self.voice_code = m.get('voice_code')
        if m.get('tts_style') is not None:
            self.tts_style = m.get('tts_style')
        if m.get('tts_volume') is not None:
            self.tts_volume = m.get('tts_volume')
        if m.get('tts_speed') is not None:
            self.tts_speed = m.get('tts_speed')
        if m.get('play_times') is not None:
            self.play_times = m.get('play_times')
        if m.get('out_id') is not None:
            self.out_id = m.get('out_id')
        return self


class SendVoiceserviceSinglecallResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        message: str = None,
        request_id: str = None,
        call_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求状态码。
        # 返回 OK 代表请求成功。
        # 其他错误码，请参考API错误码
        self.code = code
        # 状态码的描述。
        self.message = message
        # 请求 ID
        self.request_id = request_id
        # 此次通话的唯一回执 ID。
        # 可以使用此 CallId，调用查询通话详情接口查询呼叫详情。
        self.call_id = call_id

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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.call_id is not None:
            result['call_id'] = self.call_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('call_id') is not None:
            self.call_id = m.get('call_id')
        return self


class SendVoiceserviceSmartcallRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        instance_code: str = None,
        called_show_number: str = None,
        called_number: str = None,
        context: str = None,
        voice_code: str = None,
        pause_time: int = None,
        mute_time: int = None,
        action_code_break: bool = None,
        action_code_time_break: int = None,
        session_timeout: int = None,
        tts_style: str = None,
        tts_volume: int = None,
        tts_speed: int = None,
        background_file_code: str = None,
        out_id: str = None,
        dynamic_id: str = None,
        enable_itn: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 分配的租户id
        self.tenant_id = tenant_id
        # 分配的业务code
        self.instance_code = instance_code
        # 分配的主叫号码
        self.called_show_number = called_show_number
        # 被叫用户号码
        self.called_number = called_number
        # 播报文本内容
        self.context = context
        # code
        self.voice_code = voice_code
        # 停顿时长。用于设置用户停顿多久表示一句话结束。单位：毫秒，取值范围：300~1200。默认800。非特殊情况不建议调整
        self.pause_time = pause_time
        # 静音时长。用于设置用户多久不说话通话结束。单位：毫秒，取值范围：1000~20000。默认 10000
        self.mute_time = mute_time
        # 当前返回的媒体文件是否可以被打断。默认取值为 true，即可被打断。
        # 如果为 false，即使下一个动作 action_break 为 true，也无法打断当前放音。
        self.action_code_break = action_code_break
        # 基于用户持续说话时长打断。单位：毫秒。
        # 如果当前媒体文件 ActionCodeBreak 为 true，用户持续说话可以打断当前播放。不设置或者为 0，不生效。
        self.action_code_time_break = action_code_time_break
        # 最大通话时长，超时后自动挂断。单位：秒。
        self.session_timeout = session_timeout
        # TTS 变量播放时的声音风格。
        self.tts_style = tts_style
        # TTS 变量播放的音量。取值范围：0~100，默认值为 50。
        self.tts_volume = tts_volume
        # TTS 变量播放时的声音速度。取值范围：0.5~2，默认值为 1。
        self.tts_speed = tts_speed
        # 用户和机器人对话时播放的背景语音文件 ID。
        self.background_file_code = background_file_code
        # 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
        # 字符串类型，长度限制为 1~128 个字符。
        self.out_id = out_id
        # 预留给调用方使用的动态扩展 ID。在回调地址中带回，用于客户的开发标识。
        self.dynamic_id = dynamic_id
        # 是否在后处理中执行 ITN。默认为 false，即不执行。
        # 设置为 true 时，中文数字将转为阿拉伯数字输出。
        self.enable_itn = enable_itn

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.instance_code, 'instance_code')
        self.validate_required(self.called_show_number, 'called_show_number')
        self.validate_required(self.called_number, 'called_number')
        self.validate_required(self.context, 'context')
        self.validate_required(self.tts_style, 'tts_style')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_code is not None:
            result['instance_code'] = self.instance_code
        if self.called_show_number is not None:
            result['called_show_number'] = self.called_show_number
        if self.called_number is not None:
            result['called_number'] = self.called_number
        if self.context is not None:
            result['context'] = self.context
        if self.voice_code is not None:
            result['voice_code'] = self.voice_code
        if self.pause_time is not None:
            result['pause_time'] = self.pause_time
        if self.mute_time is not None:
            result['mute_time'] = self.mute_time
        if self.action_code_break is not None:
            result['action_code_break'] = self.action_code_break
        if self.action_code_time_break is not None:
            result['action_code_time_break'] = self.action_code_time_break
        if self.session_timeout is not None:
            result['session_timeout'] = self.session_timeout
        if self.tts_style is not None:
            result['tts_style'] = self.tts_style
        if self.tts_volume is not None:
            result['tts_volume'] = self.tts_volume
        if self.tts_speed is not None:
            result['tts_speed'] = self.tts_speed
        if self.background_file_code is not None:
            result['background_file_code'] = self.background_file_code
        if self.out_id is not None:
            result['out_id'] = self.out_id
        if self.dynamic_id is not None:
            result['dynamic_id'] = self.dynamic_id
        if self.enable_itn is not None:
            result['enable_i_t_n'] = self.enable_itn
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_code') is not None:
            self.instance_code = m.get('instance_code')
        if m.get('called_show_number') is not None:
            self.called_show_number = m.get('called_show_number')
        if m.get('called_number') is not None:
            self.called_number = m.get('called_number')
        if m.get('context') is not None:
            self.context = m.get('context')
        if m.get('voice_code') is not None:
            self.voice_code = m.get('voice_code')
        if m.get('pause_time') is not None:
            self.pause_time = m.get('pause_time')
        if m.get('mute_time') is not None:
            self.mute_time = m.get('mute_time')
        if m.get('action_code_break') is not None:
            self.action_code_break = m.get('action_code_break')
        if m.get('action_code_time_break') is not None:
            self.action_code_time_break = m.get('action_code_time_break')
        if m.get('session_timeout') is not None:
            self.session_timeout = m.get('session_timeout')
        if m.get('tts_style') is not None:
            self.tts_style = m.get('tts_style')
        if m.get('tts_volume') is not None:
            self.tts_volume = m.get('tts_volume')
        if m.get('tts_speed') is not None:
            self.tts_speed = m.get('tts_speed')
        if m.get('background_file_code') is not None:
            self.background_file_code = m.get('background_file_code')
        if m.get('out_id') is not None:
            self.out_id = m.get('out_id')
        if m.get('dynamic_id') is not None:
            self.dynamic_id = m.get('dynamic_id')
        if m.get('enable_i_t_n') is not None:
            self.enable_itn = m.get('enable_i_t_n')
        return self


class SendVoiceserviceSmartcallResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        message: str = None,
        request_id: str = None,
        call_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求状态码。
        # ● 返回 OK 代表请求成功。
        self.code = code
        # 状态码的描述。
        self.message = message
        # 请求 ID。
        self.request_id = request_id
        # 此次通话的唯一回执 ID。
        # 可以使用此 CallId，调用查询通话详情接口查询呼叫详情。
        self.call_id = call_id

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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.call_id is not None:
            result['call_id'] = self.call_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('call_id') is not None:
            self.call_id = m.get('call_id')
        return self


