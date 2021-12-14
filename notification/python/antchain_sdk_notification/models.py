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


class TaskCount(TeaModel):
    def __init__(
        self,
        total_count: int = None,
        success_count: int = None,
        processing_count: int = None,
        failure_count: int = None,
    ):
        # 总数量
        self.total_count = total_count
        # 成功数量
        self.success_count = success_count
        # 处理中的数量
        self.processing_count = processing_count
        # 失败数量
        self.failure_count = failure_count

    def validate(self):
        self.validate_required(self.total_count, 'total_count')
        self.validate_required(self.success_count, 'success_count')
        self.validate_required(self.processing_count, 'processing_count')
        self.validate_required(self.failure_count, 'failure_count')

    def to_map(self):
        result = dict()
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.processing_count is not None:
            result['processing_count'] = self.processing_count
        if self.failure_count is not None:
            result['failure_count'] = self.failure_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('processing_count') is not None:
            self.processing_count = m.get('processing_count')
        if m.get('failure_count') is not None:
            self.failure_count = m.get('failure_count')
        return self


class EventTenant(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        tenant_name: str = None,
    ):
        # 智科租户2088 ID，tenant_id/tenant_name二选一
        self.tenant_id = tenant_id
        # 租户8位字母，tenant_id/tenant_name二选一
        self.tenant_name = tenant_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        return self


class EventResource(TeaModel):
    def __init__(
        self,
        type: str = None,
        value: str = None,
    ):
        # 资源类型
        self.type = type
        # 实例ID
        self.value = value

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.value, 'value')

    def to_map(self):
        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class KeyValuePair(TeaModel):
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
        self.validate_required(self.value, 'value')

    def to_map(self):
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


class EventReceiver(TeaModel):
    def __init__(
        self,
        receiver: str = None,
        receiver_type: str = None,
        msg_type: str = None,
    ):
        # 接收人的有效联系方式
        self.receiver = receiver
        # 接收人联系方式的类型
        self.receiver_type = receiver_type
        # 消息发送类型
        self.msg_type = msg_type

    def validate(self):
        self.validate_required(self.receiver, 'receiver')
        self.validate_required(self.receiver_type, 'receiver_type')
        self.validate_required(self.msg_type, 'msg_type')

    def to_map(self):
        result = dict()
        if self.receiver is not None:
            result['receiver'] = self.receiver
        if self.receiver_type is not None:
            result['receiver_type'] = self.receiver_type
        if self.msg_type is not None:
            result['msg_type'] = self.msg_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('receiver') is not None:
            self.receiver = m.get('receiver')
        if m.get('receiver_type') is not None:
            self.receiver_type = m.get('receiver_type')
        if m.get('msg_type') is not None:
            self.msg_type = m.get('msg_type')
        return self


class ImportEventMetadataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 元数据文本
        self.content = content

    def validate(self):
        self.validate_required(self.content, 'content')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class ImportEventMetadataResponse(TeaModel):
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


class ExportEventMetadataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        event_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 事件码
        self.event_code = event_code

    def validate(self):
        self.validate_required(self.event_code, 'event_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.event_code is not None:
            result['event_code'] = self.event_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('event_code') is not None:
            self.event_code = m.get('event_code')
        return self


class ExportEventMetadataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 事件码元数据
        self.content = content

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class SendEventAsyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        event_code: str = None,
        event_params: List[KeyValuePair] = None,
        event_receivers: List[EventReceiver] = None,
        event_tenant: EventTenant = None,
        event_resources: List[EventResource] = None,
        sender: str = None,
        sender_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 事件码
        self.event_code = event_code
        # 事件上下文，用于填充消息模板里的参数
        self.event_params = event_params
        # 消息接收人，对应自定义人群
        self.event_receivers = event_receivers
        # 租户信息，对应智科用户群组
        self.event_tenant = event_tenant
        # 事件资源，据此查询相关的内部小二群组
        self.event_resources = event_resources
        # 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
        self.sender = sender
        # 描述sender
        self.sender_name = sender_name

    def validate(self):
        self.validate_required(self.event_code, 'event_code')
        if self.event_params:
            for k in self.event_params:
                if k:
                    k.validate()
        if self.event_receivers:
            for k in self.event_receivers:
                if k:
                    k.validate()
        if self.event_tenant:
            self.event_tenant.validate()
        if self.event_resources:
            for k in self.event_resources:
                if k:
                    k.validate()
        self.validate_required(self.sender, 'sender')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.event_code is not None:
            result['event_code'] = self.event_code
        result['event_params'] = []
        if self.event_params is not None:
            for k in self.event_params:
                result['event_params'].append(k.to_map() if k else None)
        result['event_receivers'] = []
        if self.event_receivers is not None:
            for k in self.event_receivers:
                result['event_receivers'].append(k.to_map() if k else None)
        if self.event_tenant is not None:
            result['event_tenant'] = self.event_tenant.to_map()
        result['event_resources'] = []
        if self.event_resources is not None:
            for k in self.event_resources:
                result['event_resources'].append(k.to_map() if k else None)
        if self.sender is not None:
            result['sender'] = self.sender
        if self.sender_name is not None:
            result['sender_name'] = self.sender_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('event_code') is not None:
            self.event_code = m.get('event_code')
        self.event_params = []
        if m.get('event_params') is not None:
            for k in m.get('event_params'):
                temp_model = KeyValuePair()
                self.event_params.append(temp_model.from_map(k))
        self.event_receivers = []
        if m.get('event_receivers') is not None:
            for k in m.get('event_receivers'):
                temp_model = EventReceiver()
                self.event_receivers.append(temp_model.from_map(k))
        if m.get('event_tenant') is not None:
            temp_model = EventTenant()
            self.event_tenant = temp_model.from_map(m['event_tenant'])
        self.event_resources = []
        if m.get('event_resources') is not None:
            for k in m.get('event_resources'):
                temp_model = EventResource()
                self.event_resources.append(temp_model.from_map(k))
        if m.get('sender') is not None:
            self.sender = m.get('sender')
        if m.get('sender_name') is not None:
            self.sender_name = m.get('sender_name')
        return self


class SendEventAsyncResponse(TeaModel):
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
        # 事件ID
        self.task_id = task_id

    def validate(self):
        pass

    def to_map(self):
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


class SendEventDirectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        event_code: str = None,
        event_params: List[KeyValuePair] = None,
        event_receiver: EventReceiver = None,
        sender: str = None,
        sender_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 事件码
        self.event_code = event_code
        # 事件参数
        self.event_params = event_params
        # 接收者
        self.event_receiver = event_receiver
        # 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
        self.sender = sender
        # 用于描述sender
        self.sender_name = sender_name

    def validate(self):
        self.validate_required(self.event_code, 'event_code')
        if self.event_params:
            for k in self.event_params:
                if k:
                    k.validate()
        self.validate_required(self.event_receiver, 'event_receiver')
        if self.event_receiver:
            self.event_receiver.validate()
        self.validate_required(self.sender, 'sender')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.event_code is not None:
            result['event_code'] = self.event_code
        result['event_params'] = []
        if self.event_params is not None:
            for k in self.event_params:
                result['event_params'].append(k.to_map() if k else None)
        if self.event_receiver is not None:
            result['event_receiver'] = self.event_receiver.to_map()
        if self.sender is not None:
            result['sender'] = self.sender
        if self.sender_name is not None:
            result['sender_name'] = self.sender_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('event_code') is not None:
            self.event_code = m.get('event_code')
        self.event_params = []
        if m.get('event_params') is not None:
            for k in m.get('event_params'):
                temp_model = KeyValuePair()
                self.event_params.append(temp_model.from_map(k))
        if m.get('event_receiver') is not None:
            temp_model = EventReceiver()
            self.event_receiver = temp_model.from_map(m['event_receiver'])
        if m.get('sender') is not None:
            self.sender = m.get('sender')
        if m.get('sender_name') is not None:
            self.sender_name = m.get('sender_name')
        return self


class SendEventDirectResponse(TeaModel):
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
        # 事件ID
        self.task_id = task_id

    def validate(self):
        pass

    def to_map(self):
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


class CountTaskMessageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 24位任务id
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class CountTaskMessageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        event_code: str = None,
        task_state: str = None,
        message_count: TaskCount = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 事件码
        self.event_code = event_code
        # 任务状态
        self.task_state = task_state
        # 消息发送统计
        self.message_count = message_count

    def validate(self):
        if self.message_count:
            self.message_count.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.event_code is not None:
            result['event_code'] = self.event_code
        if self.task_state is not None:
            result['task_state'] = self.task_state
        if self.message_count is not None:
            result['message_count'] = self.message_count.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('event_code') is not None:
            self.event_code = m.get('event_code')
        if m.get('task_state') is not None:
            self.task_state = m.get('task_state')
        if m.get('message_count') is not None:
            temp_model = TaskCount()
            self.message_count = temp_model.from_map(m['message_count'])
        return self


