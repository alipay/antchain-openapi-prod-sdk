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


class Map(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        return self


class AiMap(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # 键
        self.key = key
        # 值
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')

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


class CheckAicoguardrailsAskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        session_id: str = None,
        app_code: str = None,
        scene_code: str = None,
        question: str = None,
        question_format: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 数据唯一标识，能够根据该值定位到该条数据
        self.request_id = request_id
        # 会话ID，用于匹配多轮对话上下文
        self.session_id = session_id
        # 应用名，蚂蚁侧提供
        self.app_code = app_code
        # 场景code，走SOP流程申请
        self.scene_code = scene_code
        # 当前提问内容
        self.question = question
        # 当前提问格式，默认PLAINTEXT，详见3.2 questionFormat&answerFormat说明
        self.question_format = question_format
        # 加密的uid，仅用于唯一标示调用方
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.app_code, 'app_code')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.question, 'question')
        self.validate_required(self.question_format, 'question_format')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.question is not None:
            result['question'] = self.question
        if self.question_format is not None:
            result['question_format'] = self.question_format
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('question_format') is not None:
            self.question_format = m.get('question_format')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CheckAicoguardrailsAskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        session_id: str = None,
        request_id: str = None,
        safe: bool = None,
        action_code: str = None,
        security_answer: str = None,
        security_prompt: str = None,
        risk_label: str = None,
        session_action: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 会话ID，用于匹配多轮对话上下文
        self.session_id = session_id
        # 唯一定位一个问答对
        self.request_id = request_id
        # 是否安全无风险. true：安全无风险. false：有风险
        self.safe = safe
        # 安全动作
        # 提问场景
        # BLOCK：拦截
        # SECURITY_ANSWER：安全代答
        # SECURITY_PROMPT：安全提示增强
        self.action_code = action_code
        # 安全代答的回答
        self.security_answer = security_answer
        # 有安全风险时的提问改写
        self.security_prompt = security_prompt
        # 有风险时的风险标签
        self.risk_label = risk_label
        # 会话动作
        # END_SESSION：终止会话
        # RECALL_QUERY：撤回提问
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
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.safe is not None:
            result['safe'] = self.safe
        if self.action_code is not None:
            result['action_code'] = self.action_code
        if self.security_answer is not None:
            result['security_answer'] = self.security_answer
        if self.security_prompt is not None:
            result['security_prompt'] = self.security_prompt
        if self.risk_label is not None:
            result['risk_label'] = self.risk_label
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
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('safe') is not None:
            self.safe = m.get('safe')
        if m.get('action_code') is not None:
            self.action_code = m.get('action_code')
        if m.get('security_answer') is not None:
            self.security_answer = m.get('security_answer')
        if m.get('security_prompt') is not None:
            self.security_prompt = m.get('security_prompt')
        if m.get('risk_label') is not None:
            self.risk_label = m.get('risk_label')
        if m.get('session_action') is not None:
            self.session_action = m.get('session_action')
        return self


