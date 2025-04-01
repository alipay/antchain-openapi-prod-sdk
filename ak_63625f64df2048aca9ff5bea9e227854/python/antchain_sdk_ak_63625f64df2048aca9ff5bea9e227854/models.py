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


class MayaRedGptResponseDTO(TeaModel):
    def __init__(
        self,
        message_id: str = None,
        request_id: str = None,
        session_id: str = None,
        answer: str = None,
        answer_format: str = None,
        answer_end: bool = None,
        safe: bool = None,
    ):
        # 消息的ID
        self.message_id = message_id
        # 请求ID
        self.request_id = request_id
        # 会话ID
        self.session_id = session_id
        # 应答内容
        self.answer = answer
        # 应答内容格式
        self.answer_format = answer_format
        # 是否回答结束
        self.answer_end = answer_end
        # 是否问题有风险
        self.safe = safe

    def validate(self):
        self.validate_required(self.message_id, 'message_id')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.answer, 'answer')
        self.validate_required(self.answer_format, 'answer_format')
        self.validate_required(self.answer_end, 'answer_end')
        self.validate_required(self.safe, 'safe')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.answer is not None:
            result['answer'] = self.answer
        if self.answer_format is not None:
            result['answer_format'] = self.answer_format
        if self.answer_end is not None:
            result['answer_end'] = self.answer_end
        if self.safe is not None:
            result['safe'] = self.safe
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('answer') is not None:
            self.answer = m.get('answer')
        if m.get('answer_format') is not None:
            self.answer_format = m.get('answer_format')
        if m.get('answer_end') is not None:
            self.answer_end = m.get('answer_end')
        if m.get('safe') is not None:
            self.safe = m.get('safe')
        return self


class MayaStreamResult(TeaModel):
    def __init__(
        self,
        data: MayaRedGptResponseDTO = None,
        success: bool = None,
        error_code: str = None,
        error_msg: str = None,
    ):
        # maya响应数据
        self.data = data
        # 是否成功
        self.success = success
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_msg = error_msg

    def validate(self):
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()
        self.validate_required(self.success, 'success')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.error_msg, 'error_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data is not None:
            result['data'] = self.data.to_map()
        if self.success is not None:
            result['success'] = self.success
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data') is not None:
            temp_model = MayaRedGptResponseDTO()
            self.data = temp_model.from_map(m['data'])
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class Map(TeaModel):
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


class PersonalLabelCustomization(TeaModel):
    def __init__(
        self,
        filter_type: int = None,
        custom_label_v1: List[str] = None,
        custom_label_v2: List[str] = None,
    ):
        # 标签需求类型。0,1-只需要这些标签，2-不需要这些标签，默认0
        self.filter_type = filter_type
        # 需要个性化处理的一级标签
        self.custom_label_v1 = custom_label_v1
        # 需要个性化处理的二级标签
        self.custom_label_v2 = custom_label_v2

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.filter_type is not None:
            result['filter_type'] = self.filter_type
        if self.custom_label_v1 is not None:
            result['custom_label_v1'] = self.custom_label_v1
        if self.custom_label_v2 is not None:
            result['custom_label_v2'] = self.custom_label_v2
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('filter_type') is not None:
            self.filter_type = m.get('filter_type')
        if m.get('custom_label_v1') is not None:
            self.custom_label_v1 = m.get('custom_label_v1')
        if m.get('custom_label_v2') is not None:
            self.custom_label_v2 = m.get('custom_label_v2')
        return self


class CheckDemoAicoguardcoreAicoguardrailsQuestionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        question: str = None,
        question_format: str = None,
        app_code: str = None,
        session_id: str = None,
        request_id: str = None,
        scene_code: str = None,
        service_code: str = None,
        agent_code: str = None,
        model_code: str = None,
        user_id: str = None,
        business_properties: Map = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前提问内容
        self.question = question
        # 当前提问格式
        self.question_format = question_format
        # 应用名
        self.app_code = app_code
        # 会话ID
        self.session_id = session_id
        # 唯一定位一个问答对
        self.request_id = request_id
        # 场景code，走SOP流程申请
        self.scene_code = scene_code
        # 当前固定填入：TJ_QUESTION_BASIC
        self.service_code = service_code
        # Agent标识
        self.agent_code = agent_code
        # 大模型Code，区分大模型类型和版本，比如bailing_10b_0229、bailing_65b_0315
        self.model_code = model_code
        # 用户ID，用于主体风险判断
        self.user_id = user_id
        # 扩展信息，会透传到业务属性中
        self.business_properties = business_properties

    def validate(self):
        self.validate_required(self.question, 'question')
        self.validate_required(self.app_code, 'app_code')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.service_code, 'service_code')
        self.validate_required(self.agent_code, 'agent_code')
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
        if self.question is not None:
            result['question'] = self.question
        if self.question_format is not None:
            result['question_format'] = self.question_format
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.agent_code is not None:
            result['agent_code'] = self.agent_code
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.business_properties is not None:
            result['business_properties'] = self.business_properties.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('question_format') is not None:
            self.question_format = m.get('question_format')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('agent_code') is not None:
            self.agent_code = m.get('agent_code')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('business_properties') is not None:
            temp_model = Map()
            self.business_properties = temp_model.from_map(m['business_properties'])
        return self


class CheckDemoAicoguardcoreAicoguardrailsQuestionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
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
        # 是否安全无风险 true：安全无风险 false：有风险
        self.safe = safe
        # 安全动作 BLOCK：拦截  SECURITY_ANSWER：安全代答  SECURITY_PROMPT：安全提示增强
        self.action_code = action_code
        # 安全动作相关文案，比如安全提示增强的文案、安全代答的回答、回答里补充的安全提示
        self.action_msg = action_msg
        # 会话动作. END_SESSION：终止会话.  RECALL_QUERY：撤回提问
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
        if m.get('safe') is not None:
            self.safe = m.get('safe')
        if m.get('action_code') is not None:
            self.action_code = m.get('action_code')
        if m.get('action_msg') is not None:
            self.action_msg = m.get('action_msg')
        if m.get('session_action') is not None:
            self.session_action = m.get('session_action')
        return self


class CheckAntcloudAitechguardAicoguardrailsAskRequest(TeaModel):
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
        last_answer: str = None,
        personal_label_customization: PersonalLabelCustomization = None,
        attack_defense: str = None,
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
        # 多轮对话最后一次回答
        self.last_answer = last_answer
        # 需要个性化处理的标签
        self.personal_label_customization = personal_label_customization
        # 是否需要开启针对大模型提问prompt攻击手法的防御功能，包括越狱攻击（劫持、诱导、其他）、注入攻击、内容泛化攻击（文本变形变种）等常见攻击手法。默认值：N：不开启
        # Y：开启
        # N：不开启
        self.attack_defense = attack_defense

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.app_code, 'app_code')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.question, 'question')
        self.validate_required(self.question_format, 'question_format')
        if self.personal_label_customization:
            self.personal_label_customization.validate()

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
        if self.last_answer is not None:
            result['last_answer'] = self.last_answer
        if self.personal_label_customization is not None:
            result['personal_label_customization'] = self.personal_label_customization.to_map()
        if self.attack_defense is not None:
            result['attack_defense'] = self.attack_defense
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
        if m.get('last_answer') is not None:
            self.last_answer = m.get('last_answer')
        if m.get('personal_label_customization') is not None:
            temp_model = PersonalLabelCustomization()
            self.personal_label_customization = temp_model.from_map(m['personal_label_customization'])
        if m.get('attack_defense') is not None:
            self.attack_defense = m.get('attack_defense')
        return self


class CheckAntcloudAitechguardAicoguardrailsAskResponse(TeaModel):
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
        risk_category: str = None,
        risk_label: str = None,
        risk_score: int = None,
        risk_words: List[str] = None,
        risk_words_index: List[str] = None,
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
        # 有风险时的风险类型，一级风险分类
        self.risk_category = risk_category
        # 有风险时的风险类型，二级风险明细分类
        self.risk_label = risk_label
        # 风险等级分数，0-100，分数越高风险等级越高
        self.risk_score = risk_score
        # 命中风险场景的风险词
        self.risk_words = risk_words
        # 风险词索引
        self.risk_words_index = risk_words_index
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
        if self.risk_category is not None:
            result['risk_category'] = self.risk_category
        if self.risk_label is not None:
            result['risk_label'] = self.risk_label
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_words is not None:
            result['risk_words'] = self.risk_words
        if self.risk_words_index is not None:
            result['risk_words_index'] = self.risk_words_index
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
        if m.get('risk_category') is not None:
            self.risk_category = m.get('risk_category')
        if m.get('risk_label') is not None:
            self.risk_label = m.get('risk_label')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_words') is not None:
            self.risk_words = m.get('risk_words')
        if m.get('risk_words_index') is not None:
            self.risk_words_index = m.get('risk_words_index')
        if m.get('session_action') is not None:
            self.session_action = m.get('session_action')
        return self


class CheckAntcloudAitechguardAicoguardrailsAnswerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        session_id: str = None,
        request_id: str = None,
        app_code: str = None,
        scene_code: str = None,
        question: str = None,
        content: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 会话ID，用于匹配多轮对话上下文
        self.session_id = session_id
        # 数据唯一标识，能够根据该值定位到该条数据
        self.request_id = request_id
        # 应用名，蚂蚁侧提供
        self.app_code = app_code
        # 场景code，走SOP流程申请
        self.scene_code = scene_code
        # 当前提问内容，最大长度800个字符。
        self.question = question
        # 当前回答内容，最大长度10000个字符。
        self.content = content
        # 用户ID，用于主体风险判断
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.app_code, 'app_code')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.question is not None:
            result['question'] = self.question
        if self.content is not None:
            result['content'] = self.content
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CheckAntcloudAitechguardAicoguardrailsAnswerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        session_id: str = None,
        request_id: str = None,
        safe: bool = None,
        risk_category: str = None,
        risk_label: str = None,
        risk_score: int = None,
        risk_words: List[str] = None,
        risk_words_index: List[str] = None,
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
        # 是否安全无风险
        self.safe = safe
        # 风险一级分类标签
        self.risk_category = risk_category
        # 风险二级分类标签
        self.risk_label = risk_label
        # 风险等级分数，百分之，分数越高风险等级越高
        self.risk_score = risk_score
        # 风险关键词列表
        self.risk_words = risk_words
        # 风险关键词位置，逗号分割左右下标，左闭右开区间
        self.risk_words_index = risk_words_index

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
        if self.risk_category is not None:
            result['risk_category'] = self.risk_category
        if self.risk_label is not None:
            result['risk_label'] = self.risk_label
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_words is not None:
            result['risk_words'] = self.risk_words
        if self.risk_words_index is not None:
            result['risk_words_index'] = self.risk_words_index
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
        if m.get('risk_category') is not None:
            self.risk_category = m.get('risk_category')
        if m.get('risk_label') is not None:
            self.risk_label = m.get('risk_label')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_words') is not None:
            self.risk_words = m.get('risk_words')
        if m.get('risk_words_index') is not None:
            self.risk_words_index = m.get('risk_words_index')
        return self


class QueryAitechCommGuardcoreRedgptRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        session_id: str = None,
        scene_code: str = None,
        app_code: str = None,
        question: str = None,
        question_format: str = None,
        user_id: str = None,
        stream: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 唯一请求ID
        self.request_id = request_id
        # 多轮对话会话ID
        self.session_id = session_id
        # 场景code
        self.scene_code = scene_code
        # 调用方AppCode
        self.app_code = app_code
        # 提问内容
        self.question = question
        # 提问内容格式,当前仅支持PLAINTEXT
        self.question_format = question_format
        # 加密的调用方业务UserId
        self.user_id = user_id
        # 是否流式输出
        self.stream = stream

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.app_code, 'app_code')
        self.validate_required(self.question, 'question')
        self.validate_required(self.question_format, 'question_format')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.stream, 'stream')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.app_code is not None:
            result['app_code'] = self.app_code
        if self.question is not None:
            result['question'] = self.question
        if self.question_format is not None:
            result['question_format'] = self.question_format
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.stream is not None:
            result['stream'] = self.stream
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('app_code') is not None:
            self.app_code = m.get('app_code')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('question_format') is not None:
            self.question_format = m.get('question_format')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('stream') is not None:
            self.stream = m.get('stream')
        return self


class QueryAitechCommGuardcoreRedgptResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: MayaStreamResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # maya流式调用结果集
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
            temp_model = MayaStreamResult()
            self.data = temp_model.from_map(m['data'])
        return self


