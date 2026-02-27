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


class DataPart(TeaModel):
    def __init__(
        self,
        data: str = None,
    ):
        # A JSON object containing arbitrary data.
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class Part(TeaModel):
    def __init__(
        self,
        text: str = None,
        data: DataPart = None,
    ):
        # the string content of the text part.
        self.text = text
        # The structured data content.
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.text is not None:
            result['text'] = self.text
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('data') is not None:
            temp_model = DataPart()
            self.data = temp_model.from_map(m['data'])
        return self


class Message(TeaModel):
    def __init__(
        self,
        parts: List[Part] = None,
        role: str = None,
        context_id: str = None,
    ):
        # Parts is the container of the message content.
        self.parts = parts
        # Identifies the sender of the message.
        # USER role refers to communication from the client to the server.
        # AGENT role refers to communication from the server to the client.
        self.role = role
        # The context id of the message. This is optional and if set, the message will be associated with the given context(a specific conversation or session).
        self.context_id = context_id

    def validate(self):
        if self.parts:
            for k in self.parts:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['parts'] = []
        if self.parts is not None:
            for k in self.parts:
                result['parts'].append(k.to_map() if k else None)
        if self.role is not None:
            result['role'] = self.role
        if self.context_id is not None:
            result['context_id'] = self.context_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.parts = []
        if m.get('parts') is not None:
            for k in m.get('parts'):
                temp_model = Part()
                self.parts.append(temp_model.from_map(k))
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('context_id') is not None:
            self.context_id = m.get('context_id')
        return self


class Artifact(TeaModel):
    def __init__(
        self,
        parts: List[Part] = None,
    ):
        # The content of the artifact. Must contain at least one part.
        self.parts = parts

    def validate(self):
        if self.parts:
            for k in self.parts:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['parts'] = []
        if self.parts is not None:
            for k in self.parts:
                result['parts'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.parts = []
        if m.get('parts') is not None:
            for k in m.get('parts'):
                temp_model = Part()
                self.parts.append(temp_model.from_map(k))
        return self


class TaskStatus(TeaModel):
    def __init__(
        self,
        state: str = None,
        message: Message = None,
    ):
        # The current state of this task.
        self.state = state
        # A message associated with the status.
        self.message = message

    def validate(self):
        self.validate_required(self.state, 'state')
        self.validate_required(self.message, 'message')
        if self.message:
            self.message.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.state is not None:
            result['state'] = self.state
        if self.message is not None:
            result['message'] = self.message.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('message') is not None:
            temp_model = Message()
            self.message = temp_model.from_map(m['message'])
        return self


class Task(TeaModel):
    def __init__(
        self,
        id: str = None,
        context_id: str = None,
        status: TaskStatus = None,
        artifacts: List[Artifact] = None,
    ):
        # Unique identifier (e.g. UUID) for the task, generated by the server for a new task.
        self.id = id
        # Unique identifier (e.g. UUID) for the contextual collection of interactions (tasks and messages). Created by the A2A server.
        self.context_id = context_id
        # The current status of a Task, including state and a message.
        self.status = status
        # A set of output artifacts for a Task.
        self.artifacts = artifacts

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.status, 'status')
        if self.status:
            self.status.validate()
        self.validate_required(self.artifacts, 'artifacts')
        if self.artifacts:
            for k in self.artifacts:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.context_id is not None:
            result['context_id'] = self.context_id
        if self.status is not None:
            result['status'] = self.status.to_map()
        result['artifacts'] = []
        if self.artifacts is not None:
            for k in self.artifacts:
                result['artifacts'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('context_id') is not None:
            self.context_id = m.get('context_id')
        if m.get('status') is not None:
            temp_model = TaskStatus()
            self.status = temp_model.from_map(m['status'])
        self.artifacts = []
        if m.get('artifacts') is not None:
            for k in m.get('artifacts'):
                temp_model = Artifact()
                self.artifacts.append(temp_model.from_map(k))
        return self


class SendMessageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request: Message = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # The message to send to the agent.
        self.request = request
        # tenant
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.request, 'request')
        if self.request:
            self.request.validate()
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request is not None:
            result['request'] = self.request.to_map()
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request') is not None:
            temp_model = Message()
            self.request = temp_model.from_map(m['request'])
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class SendMessageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task: Task = None,
        msg: Message = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # Task is the core unit of action for A2A. It has a current status and when results are created for the task they are stored in the artifact.
        self.task = task
        # Message is one unit of communication between client and server.
        self.msg = msg

    def validate(self):
        if self.task:
            self.task.validate()
        if self.msg:
            self.msg.validate()

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
        if self.task is not None:
            result['task'] = self.task.to_map()
        if self.msg is not None:
            result['msg'] = self.msg.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task') is not None:
            temp_model = Task()
            self.task = temp_model.from_map(m['task'])
        if m.get('msg') is not None:
            temp_model = Message()
            self.msg = temp_model.from_map(m['msg'])
        return self


class GetTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # tenant
        self.tenant = tenant
        # Unique identifier (e.g. UUID) for the task, generated by the server for a new task.
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.tenant, 'tenant')
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class GetTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task: Task = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # Task is the core unit of action for A2A. It has a current status and when results are created for the task they are stored in the artifact.
        self.task = task

    def validate(self):
        if self.task:
            self.task.validate()

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
        if self.task is not None:
            result['task'] = self.task.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task') is not None:
            temp_model = Task()
            self.task = temp_model.from_map(m['task'])
        return self


class GetComsumeJdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        project_id: str = None,
        user_id: str = None,
        coupon_id: str = None,
        prize_status: str = None,
        consume_time: str = None,
        write_off_type: int = None,
        bank_flow_no: str = None,
        transaction_id: str = None,
        trade_amount: int = None,
        merchant_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 项目ID
        self.project_id = project_id
        # 用户ID
        self.user_id = user_id
        # 券ID
        self.coupon_id = coupon_id
        # 券状态
        # UNUSED_=未使用
        # _USED_ 已使用
        # _EXPIRED_ 过期
        self.prize_status = prize_status
        # 使用时间
        # 时间格式“yyyy-mm-dd
        # hh:mm:ss”
        self.consume_time = consume_time
        # 回传类型
        # _1_-实时 ‘_2_-批量
        self.write_off_type = write_off_type
        # 银行流水号
        self.bank_flow_no = bank_flow_no
        # 交易订单号
        self.transaction_id = transaction_id
        # 交易金额(分)
        self.trade_amount = trade_amount
        # 消耗商户号（本期不传）
        self.merchant_no = merchant_no

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.coupon_id, 'coupon_id')
        self.validate_required(self.prize_status, 'prize_status')
        self.validate_required(self.write_off_type, 'write_off_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        if self.prize_status is not None:
            result['prize_status'] = self.prize_status
        if self.consume_time is not None:
            result['consume_time'] = self.consume_time
        if self.write_off_type is not None:
            result['write_off_type'] = self.write_off_type
        if self.bank_flow_no is not None:
            result['bank_flow_no'] = self.bank_flow_no
        if self.transaction_id is not None:
            result['transaction_id'] = self.transaction_id
        if self.trade_amount is not None:
            result['trade_amount'] = self.trade_amount
        if self.merchant_no is not None:
            result['merchant_no'] = self.merchant_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        if m.get('prize_status') is not None:
            self.prize_status = m.get('prize_status')
        if m.get('consume_time') is not None:
            self.consume_time = m.get('consume_time')
        if m.get('write_off_type') is not None:
            self.write_off_type = m.get('write_off_type')
        if m.get('bank_flow_no') is not None:
            self.bank_flow_no = m.get('bank_flow_no')
        if m.get('transaction_id') is not None:
            self.transaction_id = m.get('transaction_id')
        if m.get('trade_amount') is not None:
            self.trade_amount = m.get('trade_amount')
        if m.get('merchant_no') is not None:
            self.merchant_no = m.get('merchant_no')
        return self


class GetComsumeJdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码：SUCCESS/FAIL
        self.code = code
        # 结果描述：成功或失败原因
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
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


