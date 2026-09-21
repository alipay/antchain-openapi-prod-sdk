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


class AssistantExtra(TeaModel):
    def __init__(
        self,
        task_id: str = None,
        render_status: str = None,
        result_url: List[str] = None,
    ):
        # 任务id
        self.task_id = task_id
        # 生图状态
        self.render_status = render_status
        # 生图结果
        self.result_url = result_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.render_status is not None:
            result['render_status'] = self.render_status
        if self.result_url is not None:
            result['result_url'] = self.result_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('render_status') is not None:
            self.render_status = m.get('render_status')
        if m.get('result_url') is not None:
            self.result_url = m.get('result_url')
        return self


class CreativeMaterial(TeaModel):
    def __init__(
        self,
        product_code: str = None,
        material_id: str = None,
        material_type: str = None,
        material_form: str = None,
        parent_material_id: str = None,
        cover: bool = None,
        name: str = None,
        file_url: str = None,
        width: int = None,
        height: int = None,
        font_family: str = None,
        scene: str = None,
        material_usage: str = None,
        industry: str = None,
        publish_platforms: str = None,
        material_size_type: str = None,
        space_type: str = None,
        owner_name: str = None,
        gmt_create: str = None,
    ):
        # Creative 行业产品代码：FUND / RETAIL，查询时缺省为 RETAIL
        self.product_code = product_code
        # 素材ID
        self.material_id = material_id
        # 素材类型，如 IMAGE / ANIMATION / FONT
        self.material_type = material_type
        # 素材形式（SINGLE/PACKAGE）
        self.material_form = material_form
        # 父素材ID
        self.parent_material_id = parent_material_id
        # 是否为封面
        self.cover = cover
        # 素材名称
        self.name = name
        # 素材文件URL
        self.file_url = file_url
        # 宽度（像素）
        self.width = width
        # 高度（像素）
        self.height = height
        # 字体族名（仅 FONT 类型）
        self.font_family = font_family
        # 使用场景
        self.scene = scene
        # 素材用途：REFERENCE_STYLE=参考样式，INPUT_ELEMENT=输入元素
        self.material_usage = material_usage
        # RETAIL
        self.industry = industry
        # 投放平台，多个值使用英文逗号分隔
        self.publish_platforms = publish_platforms
        # 尺寸类型（16:9、9:16、1:1、4:3、3:4、OTHER）
        self.material_size_type = material_size_type
        # 空间类型：PERSONAL / ENTERPRISE
        self.space_type = space_type
        # 所有者名称
        self.owner_name = owner_name
        # 创建时间，格式 yyyy-MM-dd HH:mm:ss
        self.gmt_create = gmt_create

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.material_id is not None:
            result['material_id'] = self.material_id
        if self.material_type is not None:
            result['material_type'] = self.material_type
        if self.material_form is not None:
            result['material_form'] = self.material_form
        if self.parent_material_id is not None:
            result['parent_material_id'] = self.parent_material_id
        if self.cover is not None:
            result['cover'] = self.cover
        if self.name is not None:
            result['name'] = self.name
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.width is not None:
            result['width'] = self.width
        if self.height is not None:
            result['height'] = self.height
        if self.font_family is not None:
            result['font_family'] = self.font_family
        if self.scene is not None:
            result['scene'] = self.scene
        if self.material_usage is not None:
            result['material_usage'] = self.material_usage
        if self.industry is not None:
            result['industry'] = self.industry
        if self.publish_platforms is not None:
            result['publish_platforms'] = self.publish_platforms
        if self.material_size_type is not None:
            result['material_size_type'] = self.material_size_type
        if self.space_type is not None:
            result['space_type'] = self.space_type
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('material_id') is not None:
            self.material_id = m.get('material_id')
        if m.get('material_type') is not None:
            self.material_type = m.get('material_type')
        if m.get('material_form') is not None:
            self.material_form = m.get('material_form')
        if m.get('parent_material_id') is not None:
            self.parent_material_id = m.get('parent_material_id')
        if m.get('cover') is not None:
            self.cover = m.get('cover')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('width') is not None:
            self.width = m.get('width')
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('font_family') is not None:
            self.font_family = m.get('font_family')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('material_usage') is not None:
            self.material_usage = m.get('material_usage')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('publish_platforms') is not None:
            self.publish_platforms = m.get('publish_platforms')
        if m.get('material_size_type') is not None:
            self.material_size_type = m.get('material_size_type')
        if m.get('space_type') is not None:
            self.space_type = m.get('space_type')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        return self


class CreativeAssetRef(TeaModel):
    def __init__(
        self,
        source_type: str = None,
        material_id: str = None,
        url: str = None,
        usage_hint: str = None,
    ):
        # 素材来源
        self.source_type = source_type
        # 素材ID，只有素材来源于creative的素材库中才需要填入
        self.material_id = material_id
        # 可公网访问的素材url地址
        self.url = url
        # 使用提示
        self.usage_hint = usage_hint

    def validate(self):
        self.validate_required(self.source_type, 'source_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.material_id is not None:
            result['material_id'] = self.material_id
        if self.url is not None:
            result['url'] = self.url
        if self.usage_hint is not None:
            result['usage_hint'] = self.usage_hint
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('material_id') is not None:
            self.material_id = m.get('material_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('usage_hint') is not None:
            self.usage_hint = m.get('usage_hint')
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


class ExecAntcloudMarketingagentChatCreativeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        session_id: str = None,
        entry_type: str = None,
        prompt: str = None,
        reference_style: CreativeAssetRef = None,
        input_elements: List[CreativeAssetRef] = None,
        scene: str = None,
        width: int = None,
        height: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 会话ID，如需支持多轮对话，需要传入之前的会话ID
        self.session_id = session_id
        # 服务类型（默认IMAGE_RENDER）
        self.entry_type = entry_type
        # 表达用户意图
        self.prompt = prompt
        # 参考样式
        self.reference_style = reference_style
        # 输入元素
        self.input_elements = input_elements
        # 使用场景
        self.scene = scene
        # 生图宽度
        self.width = width
        # 生图高度
        self.height = height

    def validate(self):
        self.validate_required(self.prompt, 'prompt')
        if self.reference_style:
            self.reference_style.validate()
        if self.input_elements:
            for k in self.input_elements:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.entry_type is not None:
            result['entry_type'] = self.entry_type
        if self.prompt is not None:
            result['prompt'] = self.prompt
        if self.reference_style is not None:
            result['reference_style'] = self.reference_style.to_map()
        result['input_elements'] = []
        if self.input_elements is not None:
            for k in self.input_elements:
                result['input_elements'].append(k.to_map() if k else None)
        if self.scene is not None:
            result['scene'] = self.scene
        if self.width is not None:
            result['width'] = self.width
        if self.height is not None:
            result['height'] = self.height
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('entry_type') is not None:
            self.entry_type = m.get('entry_type')
        if m.get('prompt') is not None:
            self.prompt = m.get('prompt')
        if m.get('reference_style') is not None:
            temp_model = CreativeAssetRef()
            self.reference_style = temp_model.from_map(m['reference_style'])
        self.input_elements = []
        if m.get('input_elements') is not None:
            for k in m.get('input_elements'):
                temp_model = CreativeAssetRef()
                self.input_elements.append(temp_model.from_map(k))
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('width') is not None:
            self.width = m.get('width')
        if m.get('height') is not None:
            self.height = m.get('height')
        return self


class ExecAntcloudMarketingagentChatCreativeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        message_id: str = None,
        session_id: str = None,
        role: str = None,
        status: str = None,
        content: str = None,
        assistant_extra: AssistantExtra = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 消息ID
        self.message_id = message_id
        # 所属会话ID
        self.session_id = session_id
        # 消息角色
        self.role = role
        # 消息状态
        self.status = status
        # 消息内容
        self.content = content
        # ASSISTANT消息的额外信息
        self.assistant_extra = assistant_extra

    def validate(self):
        if self.assistant_extra:
            self.assistant_extra.validate()

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
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.role is not None:
            result['role'] = self.role
        if self.status is not None:
            result['status'] = self.status
        if self.content is not None:
            result['content'] = self.content
        if self.assistant_extra is not None:
            result['assistant_extra'] = self.assistant_extra.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('assistant_extra') is not None:
            temp_model = AssistantExtra()
            self.assistant_extra = temp_model.from_map(m['assistant_extra'])
        return self


class ExecAntcloudMarketingagentCreativeChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        session_id: str = None,
        entry_type: str = None,
        prompt: str = None,
        reference_style: CreativeAssetRef = None,
        input_elements: List[AssistantExtra] = None,
        scene: str = None,
        width: int = None,
        height: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 会话ID，如需支持多轮对话，需要传入之前的会话ID
        self.session_id = session_id
        # 服务类型（默认IMAGE_RENDER）
        self.entry_type = entry_type
        # 表达用户意图
        self.prompt = prompt
        # 参考样式
        self.reference_style = reference_style
        # 输入元素
        self.input_elements = input_elements
        # 使用场景
        self.scene = scene
        # 生图宽度
        self.width = width
        # 生图高度
        self.height = height

    def validate(self):
        self.validate_required(self.prompt, 'prompt')
        if self.reference_style:
            self.reference_style.validate()
        if self.input_elements:
            for k in self.input_elements:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.entry_type is not None:
            result['entry_type'] = self.entry_type
        if self.prompt is not None:
            result['prompt'] = self.prompt
        if self.reference_style is not None:
            result['reference_style'] = self.reference_style.to_map()
        result['input_elements'] = []
        if self.input_elements is not None:
            for k in self.input_elements:
                result['input_elements'].append(k.to_map() if k else None)
        if self.scene is not None:
            result['scene'] = self.scene
        if self.width is not None:
            result['width'] = self.width
        if self.height is not None:
            result['height'] = self.height
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('entry_type') is not None:
            self.entry_type = m.get('entry_type')
        if m.get('prompt') is not None:
            self.prompt = m.get('prompt')
        if m.get('reference_style') is not None:
            temp_model = CreativeAssetRef()
            self.reference_style = temp_model.from_map(m['reference_style'])
        self.input_elements = []
        if m.get('input_elements') is not None:
            for k in m.get('input_elements'):
                temp_model = AssistantExtra()
                self.input_elements.append(temp_model.from_map(k))
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('width') is not None:
            self.width = m.get('width')
        if m.get('height') is not None:
            self.height = m.get('height')
        return self


class ExecAntcloudMarketingagentCreativeChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        message_id: str = None,
        session_id: str = None,
        role: str = None,
        status: str = None,
        content: str = None,
        assistant_extra: AssistantExtra = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 消息ID
        self.message_id = message_id
        # 所属会话ID
        self.session_id = session_id
        # 消息角色
        self.role = role
        # 消息状态
        self.status = status
        # 消息内容
        self.content = content
        # ASSISTANT消息的额外信息
        self.assistant_extra = assistant_extra

    def validate(self):
        if self.assistant_extra:
            self.assistant_extra.validate()

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
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.role is not None:
            result['role'] = self.role
        if self.status is not None:
            result['status'] = self.status
        if self.content is not None:
            result['content'] = self.content
        if self.assistant_extra is not None:
            result['assistant_extra'] = self.assistant_extra.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('assistant_extra') is not None:
            temp_model = AssistantExtra()
            self.assistant_extra = temp_model.from_map(m['assistant_extra'])
        return self


class QueryAntcloudMarketingagentCreativeResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        message_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 消息ID
        self.message_id = message_id

    def validate(self):
        self.validate_required(self.message_id, 'message_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.message_id is not None:
            result['message_id'] = self.message_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        return self


class QueryAntcloudMarketingagentCreativeResultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        session_id: str = None,
        message_id: str = None,
        status: str = None,
        content: str = None,
        assistant_extra: AssistantExtra = None,
        total_credit: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 会话ID
        self.session_id = session_id
        # 消息ID
        self.message_id = message_id
        # 消息状态
        self.status = status
        # 消息内容
        self.content = content
        # agent消息扩展信息
        self.assistant_extra = assistant_extra
        # 当前会话的 Credit 计费总数
        self.total_credit = total_credit

    def validate(self):
        if self.assistant_extra:
            self.assistant_extra.validate()

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
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.status is not None:
            result['status'] = self.status
        if self.content is not None:
            result['content'] = self.content
        if self.assistant_extra is not None:
            result['assistant_extra'] = self.assistant_extra.to_map()
        if self.total_credit is not None:
            result['total_credit'] = self.total_credit
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
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('assistant_extra') is not None:
            temp_model = AssistantExtra()
            self.assistant_extra = temp_model.from_map(m['assistant_extra'])
        if m.get('total_credit') is not None:
            self.total_credit = m.get('total_credit')
        return self


class QueryAntcloudMarketingagentTaskCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        trace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 从问数接口返回trace_id值
        self.trace_id = trace_id

    def validate(self):
        self.validate_required(self.trace_id, 'trace_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        return self


class QueryAntcloudMarketingagentTaskCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        credits: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # credit消耗
        self.credits = credits

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
        if self.credits is not None:
            result['credits'] = self.credits
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('credits') is not None:
            self.credits = m.get('credits')
        return self


class QueryAntcloudMarketingagentCreativeMaterialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        page_num: int = None,
        page_size: int = None,
        product_code: str = None,
        space_type: str = None,
        material_type: str = None,
        scene: str = None,
        material_usage: str = None,
        industry: str = None,
        publish_platforms: str = None,
        material_size_type: str = None,
        keyword: str = None,
        flatten: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 页码，从1开始
        self.page_num = page_num
        # 每页条数
        self.page_size = page_size
        # Creative 行业产品代码：FUND / RETAIL，查询时缺省为 RETAIL
        self.product_code = product_code
        # 空间类型：PERSONAL / ENTERPRISE
        self.space_type = space_type
        # 素材类型，如 IMAGE / ANIMATION / FONT
        self.material_type = material_type
        # 使用场景
        self.scene = scene
        # 素材用途：REFERENCE_STYLE=参考样式，INPUT_ELEMENT=输入元素
        self.material_usage = material_usage
        # 行业
        self.industry = industry
        # 投放平台，支持多选，多个值使用英文逗号分隔
        self.publish_platforms = publish_platforms
        # 尺寸类型（16:9、9:16、1:1、4:3、3:4、OTHER）
        self.material_size_type = material_size_type
        # 搜索关键词
        self.keyword = keyword
        # 是否平铺展示（true 时展开素材包子素材，不返回素材包父记录）
        self.flatten = flatten

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.space_type is not None:
            result['space_type'] = self.space_type
        if self.material_type is not None:
            result['material_type'] = self.material_type
        if self.scene is not None:
            result['scene'] = self.scene
        if self.material_usage is not None:
            result['material_usage'] = self.material_usage
        if self.industry is not None:
            result['industry'] = self.industry
        if self.publish_platforms is not None:
            result['publish_platforms'] = self.publish_platforms
        if self.material_size_type is not None:
            result['material_size_type'] = self.material_size_type
        if self.keyword is not None:
            result['keyword'] = self.keyword
        if self.flatten is not None:
            result['flatten'] = self.flatten
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('space_type') is not None:
            self.space_type = m.get('space_type')
        if m.get('material_type') is not None:
            self.material_type = m.get('material_type')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('material_usage') is not None:
            self.material_usage = m.get('material_usage')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('publish_platforms') is not None:
            self.publish_platforms = m.get('publish_platforms')
        if m.get('material_size_type') is not None:
            self.material_size_type = m.get('material_size_type')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        if m.get('flatten') is not None:
            self.flatten = m.get('flatten')
        return self


class QueryAntcloudMarketingagentCreativeMaterialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
        page_num: int = None,
        page_size: int = None,
        page_count: int = None,
        materials: List[CreativeMaterial] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总记录数
        self.total_count = total_count
        # 当前页码
        self.page_num = page_num
        # 每页条数
        self.page_size = page_size
        # 总页数
        self.page_count = page_count
        # 当前页素材列表
        self.materials = materials

    def validate(self):
        if self.materials:
            for k in self.materials:
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
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_count is not None:
            result['page_count'] = self.page_count
        result['materials'] = []
        if self.materials is not None:
            for k in self.materials:
                result['materials'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_count') is not None:
            self.page_count = m.get('page_count')
        self.materials = []
        if m.get('materials') is not None:
            for k in m.get('materials'):
                temp_model = CreativeMaterial()
                self.materials.append(temp_model.from_map(k))
        return self


