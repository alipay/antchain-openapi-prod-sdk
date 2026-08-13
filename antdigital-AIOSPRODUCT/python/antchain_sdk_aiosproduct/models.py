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


class QueryGwdefaultChatstreamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        tenant_id: str = None,
        agent_code: str = None,
        message: str = None,
        session_id: str = None,
        ext_info: str = None,
        tag_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户标识
        self.user_id = user_id
        # 租户标识
        self.tenant_id = tenant_id
        # 业务配置标识（必传），决定模型、策略、提示词
        self.agent_code = agent_code
        # 用户输入
        self.message = message
        # 会话标识（可选），新会话不传，继续会话传
        self.session_id = session_id
        # 扩展字段（可选），用于后端服务直接调用时指定技术参数
        self.ext_info = ext_info
        # 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools。
        self.tag_info = tag_info

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.agent_code, 'agent_code')
        self.validate_required(self.message, 'message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.agent_code is not None:
            result['agent_code'] = self.agent_code
        if self.message is not None:
            result['message'] = self.message
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.tag_info is not None:
            result['tag_info'] = self.tag_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('agent_code') is not None:
            self.agent_code = m.get('agent_code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('tag_info') is not None:
            self.tag_info = m.get('tag_info')
        return self


class QueryGwdefaultChatstreamResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        session_id: str = None,
        success: bool = None,
        type: str = None,
        query_id: str = None,
        has_stream: bool = None,
        chat_list: str = None,
        sug_list: str = None,
        ref_list: str = None,
        footer_list: str = None,
        call_back_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 会话id
        self.session_id = session_id
        # 整体成功标志，默认 true
        self.success = success
        # 固定chat_result
        self.type = type
        # 查询 ID；多为空串
        self.query_id = query_id
        # true=流式中间批次；false=收尾批次
        self.has_stream = has_stream
        # 正文流
        self.chat_list = chat_list
        # 推荐问题（SUG），仅收尾批次非空
        self.sug_list = sug_list
        # 全量引用（REF），仅收尾批次非空
        self.ref_list = ref_list
        # 页脚卡片（FOOTER_CARD 已改写为 CARD），仅收尾批次非空
        self.footer_list = footer_list
        # token/耗时信息；仅携带 callbackInfo 的批次才有
        self.call_back_info = call_back_info

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
        if self.success is not None:
            result['success'] = self.success
        if self.type is not None:
            result['type'] = self.type
        if self.query_id is not None:
            result['query_id'] = self.query_id
        if self.has_stream is not None:
            result['has_stream'] = self.has_stream
        if self.chat_list is not None:
            result['chat_list'] = self.chat_list
        if self.sug_list is not None:
            result['sug_list'] = self.sug_list
        if self.ref_list is not None:
            result['ref_list'] = self.ref_list
        if self.footer_list is not None:
            result['footer_list'] = self.footer_list
        if self.call_back_info is not None:
            result['call_back_info'] = self.call_back_info
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('query_id') is not None:
            self.query_id = m.get('query_id')
        if m.get('has_stream') is not None:
            self.has_stream = m.get('has_stream')
        if m.get('chat_list') is not None:
            self.chat_list = m.get('chat_list')
        if m.get('sug_list') is not None:
            self.sug_list = m.get('sug_list')
        if m.get('ref_list') is not None:
            self.ref_list = m.get('ref_list')
        if m.get('footer_list') is not None:
            self.footer_list = m.get('footer_list')
        if m.get('call_back_info') is not None:
            self.call_back_info = m.get('call_back_info')
        return self


class QueryGwdefaultChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        tenant_id: str = None,
        agent_code: str = None,
        message: str = None,
        session_id: str = None,
        ext_info: str = None,
        tag_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户标识
        self.user_id = user_id
        # 租户标识
        self.tenant_id = tenant_id
        # 业务配置标识（必传），决定模型、策略、提示词
        self.agent_code = agent_code
        # 用户输入
        self.message = message
        # 会话标识（可选），新会话不传，继续会话传
        self.session_id = session_id
        # 扩展字段（可选），用于后端服务直接调用时指定技术参数
        self.ext_info = ext_info
        # 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools
        self.tag_info = tag_info

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.agent_code, 'agent_code')
        self.validate_required(self.message, 'message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.agent_code is not None:
            result['agent_code'] = self.agent_code
        if self.message is not None:
            result['message'] = self.message
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.tag_info is not None:
            result['tag_info'] = self.tag_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('agent_code') is not None:
            self.agent_code = m.get('agent_code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('tag_info') is not None:
            self.tag_info = m.get('tag_info')
        return self


class QueryGwdefaultChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        session_id: str = None,
        agent_code: str = None,
        answer: str = None,
        trace_id: str = None,
        metadata: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 会话id
        self.session_id = session_id
        # 业务配置标识（必传），决定模型、策略、提示词
        self.agent_code = agent_code
        # 回答
        self.answer = answer
        # 链路id
        self.trace_id = trace_id
        # 附加信息
        self.metadata = metadata

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
        if self.agent_code is not None:
            result['agent_code'] = self.agent_code
        if self.answer is not None:
            result['answer'] = self.answer
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.metadata is not None:
            result['metadata'] = self.metadata
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
        if m.get('agent_code') is not None:
            self.agent_code = m.get('agent_code')
        if m.get('answer') is not None:
            self.answer = m.get('answer')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('metadata') is not None:
            self.metadata = m.get('metadata')
        return self


