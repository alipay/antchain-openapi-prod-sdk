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


class PromptTokensDetail(TeaModel):
    def __init__(
        self,
        cached_tokens: int = None,
    ):
        # 缓存token
        self.cached_tokens = cached_tokens

    def validate(self):
        self.validate_required(self.cached_tokens, 'cached_tokens')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cached_tokens is not None:
            result['cached_tokens'] = self.cached_tokens
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cached_tokens') is not None:
            self.cached_tokens = m.get('cached_tokens')
        return self


class ChatMessage(TeaModel):
    def __init__(
        self,
        role: str = None,
        content: str = None,
    ):
        # 橘色
        self.role = role
        # 请求内容
        self.content = content

    def validate(self):
        self.validate_required(self.role, 'role')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.role is not None:
            result['role'] = self.role
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class ChoiceData(TeaModel):
    def __init__(
        self,
        finish_reason: str = None,
        index: int = None,
        message: ChatMessage = None,
    ):
        # 结束原因
        self.finish_reason = finish_reason
        # 序号
        self.index = index
        # 消息内容
        self.message = message

    def validate(self):
        self.validate_required(self.finish_reason, 'finish_reason')
        self.validate_required(self.index, 'index')
        self.validate_required(self.message, 'message')
        if self.message:
            self.message.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.finish_reason is not None:
            result['finish_reason'] = self.finish_reason
        if self.index is not None:
            result['index'] = self.index
        if self.message is not None:
            result['message'] = self.message.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('finish_reason') is not None:
            self.finish_reason = m.get('finish_reason')
        if m.get('index') is not None:
            self.index = m.get('index')
        if m.get('message') is not None:
            temp_model = ChatMessage()
            self.message = temp_model.from_map(m['message'])
        return self


class UsageData(TeaModel):
    def __init__(
        self,
        completion_tokens: int = None,
        prompt_tokens: int = None,
        total_tokens: int = None,
        prompt_tokens_details: PromptTokensDetail = None,
    ):
        # 输出消耗
        self.completion_tokens = completion_tokens
        # 输入消耗
        self.prompt_tokens = prompt_tokens
        # 总计消耗
        self.total_tokens = total_tokens
        # 请求token详情
        self.prompt_tokens_details = prompt_tokens_details

    def validate(self):
        self.validate_required(self.completion_tokens, 'completion_tokens')
        self.validate_required(self.prompt_tokens, 'prompt_tokens')
        self.validate_required(self.total_tokens, 'total_tokens')
        self.validate_required(self.prompt_tokens_details, 'prompt_tokens_details')
        if self.prompt_tokens_details:
            self.prompt_tokens_details.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.completion_tokens is not None:
            result['completion_tokens'] = self.completion_tokens
        if self.prompt_tokens is not None:
            result['prompt_tokens'] = self.prompt_tokens
        if self.total_tokens is not None:
            result['total_tokens'] = self.total_tokens
        if self.prompt_tokens_details is not None:
            result['prompt_tokens_details'] = self.prompt_tokens_details.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('completion_tokens') is not None:
            self.completion_tokens = m.get('completion_tokens')
        if m.get('prompt_tokens') is not None:
            self.prompt_tokens = m.get('prompt_tokens')
        if m.get('total_tokens') is not None:
            self.total_tokens = m.get('total_tokens')
        if m.get('prompt_tokens_details') is not None:
            temp_model = PromptTokensDetail()
            self.prompt_tokens_details = temp_model.from_map(m['prompt_tokens_details'])
        return self


class ExecOperationagentChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        model: str = None,
        scene: str = None,
        messages: List[ChatMessage] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用大模型
        self.model = model
        # 调用场景
        self.scene = scene
        # 请求内容
        self.messages = messages

    def validate(self):
        self.validate_required(self.model, 'model')
        self.validate_required(self.messages, 'messages')
        if self.messages:
            for k in self.messages:
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
        if self.model is not None:
            result['model'] = self.model
        if self.scene is not None:
            result['scene'] = self.scene
        result['messages'] = []
        if self.messages is not None:
            for k in self.messages:
                result['messages'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        self.messages = []
        if m.get('messages') is not None:
            for k in m.get('messages'):
                temp_model = ChatMessage()
                self.messages.append(temp_model.from_map(k))
        return self


class ExecOperationagentChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: str = None,
        created: int = None,
        model: str = None,
        object: str = None,
        choices: List[ChoiceData] = None,
        usage: UsageData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求唯一id
        self.id = id
        # 请求时间
        self.created = created
        # 请求大模型
        self.model = model
        # 请求类型
        self.object = object
        # 响应内容
        self.choices = choices
        # token使用情况
        self.usage = usage

    def validate(self):
        if self.choices:
            for k in self.choices:
                if k:
                    k.validate()
        if self.usage:
            self.usage.validate()

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
        if self.id is not None:
            result['id'] = self.id
        if self.created is not None:
            result['created'] = self.created
        if self.model is not None:
            result['model'] = self.model
        if self.object is not None:
            result['object'] = self.object
        result['choices'] = []
        if self.choices is not None:
            for k in self.choices:
                result['choices'].append(k.to_map() if k else None)
        if self.usage is not None:
            result['usage'] = self.usage.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('created') is not None:
            self.created = m.get('created')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('object') is not None:
            self.object = m.get('object')
        self.choices = []
        if m.get('choices') is not None:
            for k in m.get('choices'):
                temp_model = ChoiceData()
                self.choices.append(temp_model.from_map(k))
        if m.get('usage') is not None:
            temp_model = UsageData()
            self.usage = temp_model.from_map(m['usage'])
        return self


class ExecOperationagentSsechatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        model: str = None,
        scene: str = None,
        messages: List[ChatMessage] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模型类型
        self.model = model
        # 场景
        self.scene = scene
        # 请求内容
        self.messages = messages

    def validate(self):
        self.validate_required(self.model, 'model')
        self.validate_required(self.messages, 'messages')
        if self.messages:
            for k in self.messages:
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
        if self.model is not None:
            result['model'] = self.model
        if self.scene is not None:
            result['scene'] = self.scene
        result['messages'] = []
        if self.messages is not None:
            for k in self.messages:
                result['messages'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        self.messages = []
        if m.get('messages') is not None:
            for k in m.get('messages'):
                temp_model = ChatMessage()
                self.messages.append(temp_model.from_map(k))
        return self


class ExecOperationagentSsechatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        choices: ChoiceData = None,
        created: bool = None,
        id: str = None,
        model: str = None,
        object: str = None,
        usage: UsageData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果响应
        self.choices = choices
        # 请求时间
        self.created = created
        # 请求信息
        self.id = id
        # 模型类型
        self.model = model
        # 请求方式
        self.object = object
        # token消耗情况
        self.usage = usage

    def validate(self):
        if self.choices:
            self.choices.validate()
        if self.usage:
            self.usage.validate()

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
        if self.choices is not None:
            result['choices'] = self.choices.to_map()
        if self.created is not None:
            result['created'] = self.created
        if self.id is not None:
            result['id'] = self.id
        if self.model is not None:
            result['model'] = self.model
        if self.object is not None:
            result['object'] = self.object
        if self.usage is not None:
            result['usage'] = self.usage.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('choices') is not None:
            temp_model = ChoiceData()
            self.choices = temp_model.from_map(m['choices'])
        if m.get('created') is not None:
            self.created = m.get('created')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('object') is not None:
            self.object = m.get('object')
        if m.get('usage') is not None:
            temp_model = UsageData()
            self.usage = temp_model.from_map(m['usage'])
        return self


