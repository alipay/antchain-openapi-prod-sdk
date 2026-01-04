# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List, BinaryIO


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


class ToolOptionParam(TeaModel):
    def __init__(
        self,
        name: str = None,
        code: str = None,
        desc: str = None,
        value: str = None,
    ):
        # 参数名称
        self.name = name
        # 参数code
        self.code = code
        # 参数描述
        self.desc = desc
        # 参数值
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.code, 'code')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.code is not None:
            result['code'] = self.code
        if self.desc is not None:
            result['desc'] = self.desc
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class ThoughtChainDisplay(TeaModel):
    def __init__(
        self,
        status: str = None,
        name: str = None,
        sub_type: str = None,
        icon: str = None,
        result_msg: str = None,
    ):
        # 思维链显示状态
        self.status = status
        # 思维链显示名称
        self.name = name
        # 思维链类型
        self.sub_type = sub_type
        # 思维链图标
        self.icon = icon
        # 思维链模块额外信息
        self.result_msg = result_msg

    def validate(self):
        self.validate_required(self.status, 'status')
        self.validate_required(self.name, 'name')
        self.validate_required(self.sub_type, 'sub_type')
        self.validate_required(self.icon, 'icon')
        self.validate_required(self.result_msg, 'result_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.status is not None:
            result['status'] = self.status
        if self.name is not None:
            result['name'] = self.name
        if self.sub_type is not None:
            result['sub_type'] = self.sub_type
        if self.icon is not None:
            result['icon'] = self.icon
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('sub_type') is not None:
            self.sub_type = m.get('sub_type')
        if m.get('icon') is not None:
            self.icon = m.get('icon')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class ThoughtChainContent(TeaModel):
    def __init__(
        self,
        id: str = None,
        source: str = None,
        children: str = None,
        time_consuming: str = None,
        time_consuming_epoch: int = None,
        latency: int = None,
        type: str = None,
    ):
        # id
        self.id = id
        # source
        self.source = source
        # children
        self.children = children
        # timeConsuming
        self.time_consuming = time_consuming
        # timeConsumingEpoch
        self.time_consuming_epoch = time_consuming_epoch
        # latency
        self.latency = latency
        # type
        self.type = type

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.source, 'source')
        self.validate_required(self.children, 'children')
        self.validate_required(self.time_consuming, 'time_consuming')
        if self.time_consuming is not None:
            self.validate_pattern(self.time_consuming, 'time_consuming', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.time_consuming_epoch, 'time_consuming_epoch')
        self.validate_required(self.latency, 'latency')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.source is not None:
            result['source'] = self.source
        if self.children is not None:
            result['children'] = self.children
        if self.time_consuming is not None:
            result['time_consuming'] = self.time_consuming
        if self.time_consuming_epoch is not None:
            result['time_consuming_epoch'] = self.time_consuming_epoch
        if self.latency is not None:
            result['latency'] = self.latency
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('children') is not None:
            self.children = m.get('children')
        if m.get('time_consuming') is not None:
            self.time_consuming = m.get('time_consuming')
        if m.get('time_consuming_epoch') is not None:
            self.time_consuming_epoch = m.get('time_consuming_epoch')
        if m.get('latency') is not None:
            self.latency = m.get('latency')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class AgentVariable(TeaModel):
    def __init__(
        self,
        id: int = None,
        name: str = None,
        code: str = None,
        desc: str = None,
        value: str = None,
        update_time: str = None,
        type: str = None,
        show_to_model: bool = None,
    ):
        # 变量对应的id
        self.id = id
        # 变量名称
        self.name = name
        # 变量code
        self.code = code
        # 变量描述
        self.desc = desc
        # 变量值
        self.value = value
        # 变量值更新时间
        self.update_time = update_time
        # "business", "业务参数"
        # "memory", "记忆参数"
        self.type = type
        # 是否模型可见
        self.show_to_model = show_to_model

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.code, 'code')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.value, 'value')
        self.validate_required(self.update_time, 'update_time')
        self.validate_required(self.type, 'type')
        self.validate_required(self.show_to_model, 'show_to_model')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.code is not None:
            result['code'] = self.code
        if self.desc is not None:
            result['desc'] = self.desc
        if self.value is not None:
            result['value'] = self.value
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.type is not None:
            result['type'] = self.type
        if self.show_to_model is not None:
            result['show_to_model'] = self.show_to_model
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('show_to_model') is not None:
            self.show_to_model = m.get('show_to_model')
        return self


class ToolOptionInfo(TeaModel):
    def __init__(
        self,
        type: str = None,
        name: str = None,
        code: str = None,
        params: List[ToolOptionParam] = None,
    ):
        # plugin = 工具；workflow = 工作流
        self.type = type
        # 对应的工具/工作流名称
        self.name = name
        # 对应的工具/工作流名称
        self.code = code
        # 对应的工具/工作流参数列表
        self.params = params

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.code, 'code')
        self.validate_required(self.params, 'params')
        if self.params:
            for k in self.params:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        if self.code is not None:
            result['code'] = self.code
        result['params'] = []
        if self.params is not None:
            for k in self.params:
                result['params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('code') is not None:
            self.code = m.get('code')
        self.params = []
        if m.get('params') is not None:
            for k in m.get('params'):
                temp_model = ToolOptionParam()
                self.params.append(temp_model.from_map(k))
        return self


class ThoughtChainDisplayUnit(TeaModel):
    def __init__(
        self,
        id: str = None,
        status: str = None,
        result_msg: str = None,
        latency: int = None,
        timestamp: int = None,
        start_timestamp: int = None,
        output_timestamp: int = None,
        end_timestamp: int = None,
        token_cost: int = None,
        input_token_cost: int = None,
        output_token_cost: int = None,
        display_name: str = None,
        is_running: bool = None,
        type: str = None,
        sub_type: str = None,
        ref_resource_id: int = None,
        ref_resource_code: str = None,
        ref_resource_icon: str = None,
        ref_workflow_build_version: str = None,
        ref_workflow_runtime_instance_id: str = None,
        input_json_string: str = None,
        output_json_string: str = None,
        extra_info_json_string: str = None,
    ):
        # 思维链模块id
        # 
        self.id = id
        # 思维链模块状态：success or fail
        # 
        self.status = status
        # 思维链模块额外信息
        # 
        self.result_msg = result_msg
        # 思维链模块耗时
        # 
        self.latency = latency
        # 思维链模块时间戳 (思维链本身的时间戳)
        # 
        self.timestamp = timestamp
        # 思维链对应操作开始执行时间戳 (optional)
        # 
        self.start_timestamp = start_timestamp
        # 思维链对应操作开始输出时间戳 (optional)
        # 
        self.output_timestamp = output_timestamp
        # 思维链对应操作结束执行时间戳 (optional)
        # 
        self.end_timestamp = end_timestamp
        # 思维链对应过程总模型token耗费 (optional)
        # 
        self.token_cost = token_cost
        # 思维链对应过程输入模型token耗费 (optional)
        # 
        self.input_token_cost = input_token_cost
        # 思维链对应过程输出模型token耗费 (optional)
        # 
        self.output_token_cost = output_token_cost
        # 思维链模块显示名称
        # 
        self.display_name = display_name
        # 思维链模块是否为进行中阶段的输出
        # 
        self.is_running = is_running
        # 思维链模块类型：DECISION or GENERATE
        # 
        self.type = type
        # 思维链模块子类型：content_search 知识查询 / llm 大模型 / tool 工具 / workflow 工作流 / end 结束 / parameter 参数处理
        # 
        self.sub_type = sub_type
        # 思维链模块子类型关联id。如果是工具，那就是 platform_api_plugin 表的 id；如果是工作流，那就是 platform_intent 表的 id
        # 
        self.ref_resource_id = ref_resource_id
        # 思维链模块子类型关联code，一般是工具或工作流类型对应的code
        # 
        self.ref_resource_code = ref_resource_code
        # 思维链模块子类型关联图标
        # 
        self.ref_resource_icon = ref_resource_icon
        # 思维链模块子类型为工作流时的版本，仅当子类型为工作流时赋值
        # 
        self.ref_workflow_build_version = ref_workflow_build_version
        # 思维链模块子类型为工作流时的运行实例id，仅当子类型为工作流且 refWorkflowBuildVersion 以 NEW 开头时赋值
        # 
        self.ref_workflow_runtime_instance_id = ref_workflow_runtime_instance_id
        # 思维链模块入参信息，JSON字符串格式
        # 
        self.input_json_string = input_json_string
        # 思维链模块出参信息，JSON字符串格式
        # 
        self.output_json_string = output_json_string
        # 思维链模块额外消息信息 (如内置工具过程展现内容)，JSON字符串格式
        # 
        self.extra_info_json_string = extra_info_json_string

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.result_msg, 'result_msg')
        self.validate_required(self.latency, 'latency')
        self.validate_required(self.timestamp, 'timestamp')
        self.validate_required(self.start_timestamp, 'start_timestamp')
        self.validate_required(self.output_timestamp, 'output_timestamp')
        self.validate_required(self.end_timestamp, 'end_timestamp')
        self.validate_required(self.token_cost, 'token_cost')
        self.validate_required(self.input_token_cost, 'input_token_cost')
        self.validate_required(self.output_token_cost, 'output_token_cost')
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.is_running, 'is_running')
        self.validate_required(self.type, 'type')
        self.validate_required(self.sub_type, 'sub_type')
        self.validate_required(self.ref_resource_id, 'ref_resource_id')
        self.validate_required(self.ref_resource_code, 'ref_resource_code')
        self.validate_required(self.ref_resource_icon, 'ref_resource_icon')
        self.validate_required(self.ref_workflow_build_version, 'ref_workflow_build_version')
        self.validate_required(self.ref_workflow_runtime_instance_id, 'ref_workflow_runtime_instance_id')
        self.validate_required(self.input_json_string, 'input_json_string')
        self.validate_required(self.output_json_string, 'output_json_string')
        self.validate_required(self.extra_info_json_string, 'extra_info_json_string')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.status is not None:
            result['status'] = self.status
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.latency is not None:
            result['latency'] = self.latency
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.start_timestamp is not None:
            result['start_timestamp'] = self.start_timestamp
        if self.output_timestamp is not None:
            result['output_timestamp'] = self.output_timestamp
        if self.end_timestamp is not None:
            result['end_timestamp'] = self.end_timestamp
        if self.token_cost is not None:
            result['token_cost'] = self.token_cost
        if self.input_token_cost is not None:
            result['input_token_cost'] = self.input_token_cost
        if self.output_token_cost is not None:
            result['output_token_cost'] = self.output_token_cost
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.is_running is not None:
            result['is_running'] = self.is_running
        if self.type is not None:
            result['type'] = self.type
        if self.sub_type is not None:
            result['sub_type'] = self.sub_type
        if self.ref_resource_id is not None:
            result['ref_resource_id'] = self.ref_resource_id
        if self.ref_resource_code is not None:
            result['ref_resource_code'] = self.ref_resource_code
        if self.ref_resource_icon is not None:
            result['ref_resource_icon'] = self.ref_resource_icon
        if self.ref_workflow_build_version is not None:
            result['ref_workflow_build_version'] = self.ref_workflow_build_version
        if self.ref_workflow_runtime_instance_id is not None:
            result['ref_workflow_runtime_instance_id'] = self.ref_workflow_runtime_instance_id
        if self.input_json_string is not None:
            result['input_json_string'] = self.input_json_string
        if self.output_json_string is not None:
            result['output_json_string'] = self.output_json_string
        if self.extra_info_json_string is not None:
            result['extra_info_json_string'] = self.extra_info_json_string
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('latency') is not None:
            self.latency = m.get('latency')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('start_timestamp') is not None:
            self.start_timestamp = m.get('start_timestamp')
        if m.get('output_timestamp') is not None:
            self.output_timestamp = m.get('output_timestamp')
        if m.get('end_timestamp') is not None:
            self.end_timestamp = m.get('end_timestamp')
        if m.get('token_cost') is not None:
            self.token_cost = m.get('token_cost')
        if m.get('input_token_cost') is not None:
            self.input_token_cost = m.get('input_token_cost')
        if m.get('output_token_cost') is not None:
            self.output_token_cost = m.get('output_token_cost')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('is_running') is not None:
            self.is_running = m.get('is_running')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('sub_type') is not None:
            self.sub_type = m.get('sub_type')
        if m.get('ref_resource_id') is not None:
            self.ref_resource_id = m.get('ref_resource_id')
        if m.get('ref_resource_code') is not None:
            self.ref_resource_code = m.get('ref_resource_code')
        if m.get('ref_resource_icon') is not None:
            self.ref_resource_icon = m.get('ref_resource_icon')
        if m.get('ref_workflow_build_version') is not None:
            self.ref_workflow_build_version = m.get('ref_workflow_build_version')
        if m.get('ref_workflow_runtime_instance_id') is not None:
            self.ref_workflow_runtime_instance_id = m.get('ref_workflow_runtime_instance_id')
        if m.get('input_json_string') is not None:
            self.input_json_string = m.get('input_json_string')
        if m.get('output_json_string') is not None:
            self.output_json_string = m.get('output_json_string')
        if m.get('extra_info_json_string') is not None:
            self.extra_info_json_string = m.get('extra_info_json_string')
        return self


class AttachFile(TeaModel):
    def __init__(
        self,
        file_id: str = None,
        file_name: str = None,
        file_type: str = None,
        file_source: str = None,
        file_url: str = None,
        file_summary: str = None,
        operate_time: str = None,
        ext_info: str = None,
        file_size: str = None,
        content_id: str = None,
    ):
        # 文件Id
        # 
        self.file_id = file_id
        # 文件名称
        # 
        self.file_name = file_name
        # 文件类型
        # 
        self.file_type = file_type
        # 文件来源
        # 
        self.file_source = file_source
        # 文件链接
        # 
        self.file_url = file_url
        # 文件总结
        # 
        self.file_summary = file_summary
        # 上传时间
        # 
        self.operate_time = operate_time
        # Map<String, String>	扩展信息
        # 
        self.ext_info = ext_info
        # 文件大小
        # 
        self.file_size = file_size
        # 内容库 dbId, 用于检索
        # 
        self.content_id = content_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.file_source, 'file_source')
        self.validate_required(self.file_url, 'file_url')
        self.validate_required(self.file_summary, 'file_summary')
        self.validate_required(self.operate_time, 'operate_time')
        if self.operate_time is not None:
            self.validate_pattern(self.operate_time, 'operate_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.ext_info, 'ext_info')
        self.validate_required(self.file_size, 'file_size')
        self.validate_required(self.content_id, 'content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.file_source is not None:
            result['file_source'] = self.file_source
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.file_summary is not None:
            result['file_summary'] = self.file_summary
        if self.operate_time is not None:
            result['operate_time'] = self.operate_time
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.content_id is not None:
            result['content_id'] = self.content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('file_source') is not None:
            self.file_source = m.get('file_source')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('file_summary') is not None:
            self.file_summary = m.get('file_summary')
        if m.get('operate_time') is not None:
            self.operate_time = m.get('operate_time')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        return self


class TemplateAction(TeaModel):
    def __init__(
        self,
        name: str = None,
    ):
        # name
        self.name = name

    def validate(self):
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class ThoughtChainInfo(TeaModel):
    def __init__(
        self,
        id: str = None,
        status: str = None,
        content: List[ThoughtChainContent] = None,
    ):
        # 思维链id
        self.id = id
        # "success" | "error" | "loading" | "abort" | "done"
        self.status = status
        # 内容
        self.content = content

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.content, 'content')
        if self.content:
            for k in self.content:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.status is not None:
            result['status'] = self.status
        result['content'] = []
        if self.content is not None:
            for k in self.content:
                result['content'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.content = []
        if m.get('content') is not None:
            for k in m.get('content'):
                temp_model = ThoughtChainContent()
                self.content.append(temp_model.from_map(k))
        return self


class AgentChatLogInfo(TeaModel):
    def __init__(
        self,
        context_variable_list: List[AgentVariable] = None,
        tool_option_list: List[ToolOptionInfo] = None,
        thought_chain_display: ThoughtChainDisplay = None,
        thought_chain_display_unit_list: List[ThoughtChainDisplayUnit] = None,
        has_response_type: bool = None,
    ):
        # 记忆参数列表
        # 
        self.context_variable_list = context_variable_list
        # 引用工具/工作流列表
        # 
        self.tool_option_list = tool_option_list
        # 对话界面思维链显示标题结构
        self.thought_chain_display = thought_chain_display
        # 思维链信息详情列表
        # 
        self.thought_chain_display_unit_list = thought_chain_display_unit_list
        # 该思维链有回答环节
        # 
        self.has_response_type = has_response_type

    def validate(self):
        self.validate_required(self.context_variable_list, 'context_variable_list')
        if self.context_variable_list:
            for k in self.context_variable_list:
                if k:
                    k.validate()
        self.validate_required(self.tool_option_list, 'tool_option_list')
        if self.tool_option_list:
            for k in self.tool_option_list:
                if k:
                    k.validate()
        self.validate_required(self.thought_chain_display, 'thought_chain_display')
        if self.thought_chain_display:
            self.thought_chain_display.validate()
        self.validate_required(self.thought_chain_display_unit_list, 'thought_chain_display_unit_list')
        if self.thought_chain_display_unit_list:
            for k in self.thought_chain_display_unit_list:
                if k:
                    k.validate()
        self.validate_required(self.has_response_type, 'has_response_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['context_variable_list'] = []
        if self.context_variable_list is not None:
            for k in self.context_variable_list:
                result['context_variable_list'].append(k.to_map() if k else None)
        result['tool_option_list'] = []
        if self.tool_option_list is not None:
            for k in self.tool_option_list:
                result['tool_option_list'].append(k.to_map() if k else None)
        if self.thought_chain_display is not None:
            result['thought_chain_display'] = self.thought_chain_display.to_map()
        result['thought_chain_display_unit_list'] = []
        if self.thought_chain_display_unit_list is not None:
            for k in self.thought_chain_display_unit_list:
                result['thought_chain_display_unit_list'].append(k.to_map() if k else None)
        if self.has_response_type is not None:
            result['has_response_type'] = self.has_response_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.context_variable_list = []
        if m.get('context_variable_list') is not None:
            for k in m.get('context_variable_list'):
                temp_model = AgentVariable()
                self.context_variable_list.append(temp_model.from_map(k))
        self.tool_option_list = []
        if m.get('tool_option_list') is not None:
            for k in m.get('tool_option_list'):
                temp_model = ToolOptionInfo()
                self.tool_option_list.append(temp_model.from_map(k))
        if m.get('thought_chain_display') is not None:
            temp_model = ThoughtChainDisplay()
            self.thought_chain_display = temp_model.from_map(m['thought_chain_display'])
        self.thought_chain_display_unit_list = []
        if m.get('thought_chain_display_unit_list') is not None:
            for k in m.get('thought_chain_display_unit_list'):
                temp_model = ThoughtChainDisplayUnit()
                self.thought_chain_display_unit_list.append(temp_model.from_map(k))
        if m.get('has_response_type') is not None:
            self.has_response_type = m.get('has_response_type')
        return self


class MultiAgentEdge(TeaModel):
    def __init__(
        self,
        next_instance_id: str = None,
        prompt: str = None,
    ):
        # edge 指向的下个agent instance id
        # 
        self.next_instance_id = next_instance_id
        # 跳到next agent的prompt
        # 
        self.prompt = prompt

    def validate(self):
        self.validate_required(self.next_instance_id, 'next_instance_id')
        self.validate_required(self.prompt, 'prompt')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.next_instance_id is not None:
            result['next_instance_id'] = self.next_instance_id
        if self.prompt is not None:
            result['prompt'] = self.prompt
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('next_instance_id') is not None:
            self.next_instance_id = m.get('next_instance_id')
        if m.get('prompt') is not None:
            self.prompt = m.get('prompt')
        return self


class DocumentReferenceInfo(TeaModel):
    def __init__(
        self,
        title: str = None,
        address: str = None,
        score: str = None,
        content: str = None,
        type: str = None,
    ):
        # title
        self.title = title
        # address
        self.address = address
        # score 浮点类型
        self.score = score
        # content
        self.content = content
        # type	SearchSceneEnum
        # LLM_CHUNK,
        # FAQ,
        # LLM_TABLE;
        self.type = type

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.address, 'address')
        self.validate_required(self.score, 'score')
        self.validate_required(self.content, 'content')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.address is not None:
            result['address'] = self.address
        if self.score is not None:
            result['score'] = self.score
        if self.content is not None:
            result['content'] = self.content
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class KnowledgeTitleInfo(TeaModel):
    def __init__(
        self,
        title: str = None,
        score: str = None,
    ):
        # title
        self.title = title
        # score 浮点类型
        self.score = score

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.score, 'score')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class DraftPosition(TeaModel):
    def __init__(
        self,
        x: str = None,
        y: str = None,
    ):
        # x 浮点类型
        self.x = x
        # y 浮点类型
        self.y = y

    def validate(self):
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.x is not None:
            result['x'] = self.x
        if self.y is not None:
            result['y'] = self.y
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('x') is not None:
            self.x = m.get('x')
        if m.get('y') is not None:
            self.y = m.get('y')
        return self


class JsonSchema(TeaModel):
    def __init__(
        self,
        properties_json: str = None,
        type: str = None,
        required: List[str] = None,
        additional_properties: bool = None,
    ):
        # 工具属性，Map<String, Object> 类型，适配网关透出，使用字符串方式存储
        self.properties_json = properties_json
        # 类型
        self.type = type
        # 必填项
        self.required = required
        # 是否允许额外属性
        self.additional_properties = additional_properties

    def validate(self):
        self.validate_required(self.properties_json, 'properties_json')
        self.validate_required(self.type, 'type')
        self.validate_required(self.required, 'required')
        self.validate_required(self.additional_properties, 'additional_properties')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.properties_json is not None:
            result['properties_json'] = self.properties_json
        if self.type is not None:
            result['type'] = self.type
        if self.required is not None:
            result['required'] = self.required
        if self.additional_properties is not None:
            result['additional_properties'] = self.additional_properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('properties_json') is not None:
            self.properties_json = m.get('properties_json')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('additional_properties') is not None:
            self.additional_properties = m.get('additional_properties')
        return self


class SingleAgentChatHistoryPreview(TeaModel):
    def __init__(
        self,
        id: int = None,
        session_id: str = None,
        ask_time: str = None,
        display_time: str = None,
        session_identifier: str = None,
        type: str = None,
        text_response: str = None,
        timestamp_display: str = None,
        display_response_type: str = None,
        files: List[AttachFile] = None,
    ):
        # 数据库id
        # 
        self.id = id
        # 会话id
        # 
        self.session_id = session_id
        # 会话开始时间
        # 
        self.ask_time = ask_time
        # 前端展示的时间
        # 
        self.display_time = display_time
        # 会话在列表中的显示内容
        # 
        self.session_identifier = session_identifier
        # 消息类型（chat/pushMessage）
        # 
        self.type = type
        # 推送的消息内容
        # 
        self.text_response = text_response
        # 推送时间
        # 
        self.timestamp_display = timestamp_display
        # 返回类型
        # 
        self.display_response_type = display_response_type
        # 附件文件
        # 
        self.files = files

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.ask_time, 'ask_time')
        if self.ask_time is not None:
            self.validate_pattern(self.ask_time, 'ask_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.display_time, 'display_time')
        self.validate_required(self.session_identifier, 'session_identifier')
        self.validate_required(self.type, 'type')
        self.validate_required(self.text_response, 'text_response')
        self.validate_required(self.timestamp_display, 'timestamp_display')
        if self.timestamp_display is not None:
            self.validate_pattern(self.timestamp_display, 'timestamp_display', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.display_response_type, 'display_response_type')
        self.validate_required(self.files, 'files')
        if self.files:
            for k in self.files:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.ask_time is not None:
            result['ask_time'] = self.ask_time
        if self.display_time is not None:
            result['display_time'] = self.display_time
        if self.session_identifier is not None:
            result['session_identifier'] = self.session_identifier
        if self.type is not None:
            result['type'] = self.type
        if self.text_response is not None:
            result['text_response'] = self.text_response
        if self.timestamp_display is not None:
            result['timestamp_display'] = self.timestamp_display
        if self.display_response_type is not None:
            result['display_response_type'] = self.display_response_type
        result['files'] = []
        if self.files is not None:
            for k in self.files:
                result['files'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('ask_time') is not None:
            self.ask_time = m.get('ask_time')
        if m.get('display_time') is not None:
            self.display_time = m.get('display_time')
        if m.get('session_identifier') is not None:
            self.session_identifier = m.get('session_identifier')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('text_response') is not None:
            self.text_response = m.get('text_response')
        if m.get('timestamp_display') is not None:
            self.timestamp_display = m.get('timestamp_display')
        if m.get('display_response_type') is not None:
            self.display_response_type = m.get('display_response_type')
        self.files = []
        if m.get('files') is not None:
            for k in m.get('files'):
                temp_model = AttachFile()
                self.files.append(temp_model.from_map(k))
        return self


class AgentModelParams(TeaModel):
    def __init__(
        self,
        type: str = None,
        model: str = None,
        preset_index: str = None,
        temperature: str = None,
        top_k: int = None,
        top_p: str = None,
        do_sample: bool = None,
        beam_width: int = None,
        max_out_token: int = None,
        function_call: bool = None,
        custom_url: str = None,
        bailing_official: bool = None,
    ):
        # 模型类型 AgentModelTypeEnum - DECISION: 决策模型 - GENERATE: 生成模型 - E2E: 端到端模型 - RAG: 检索生成模型
        # 
        self.type = type
        # 模型版本 {model}/{version}#{adapter}
        # 
        self.model = model
        # 生成策略预设配置 AgentModelPresetEnum - FLEXIBLE: 灵活 - NORMAL: 正常 - STRICT: 严格
        # 
        self.preset_index = preset_index
        # temperature 浮点类型
        # 
        self.temperature = temperature
        # top_k
        self.top_k = top_k
        # top_p 浮点类型
        self.top_p = top_p
        # doSample
        self.do_sample = do_sample
        # beam_width
        self.beam_width = beam_width
        # 最大输出长度
        # 
        self.max_out_token = max_out_token
        # 是否为支持 function call 的模型
        # 
        self.function_call = function_call
        # 自定义推理服务url
        # 
        self.custom_url = custom_url
        # 是否平台官方模型
        # 
        self.bailing_official = bailing_official

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.model, 'model')
        self.validate_required(self.preset_index, 'preset_index')
        self.validate_required(self.temperature, 'temperature')
        self.validate_required(self.top_k, 'top_k')
        self.validate_required(self.top_p, 'top_p')
        self.validate_required(self.do_sample, 'do_sample')
        self.validate_required(self.beam_width, 'beam_width')
        self.validate_required(self.max_out_token, 'max_out_token')
        self.validate_required(self.function_call, 'function_call')
        self.validate_required(self.custom_url, 'custom_url')
        self.validate_required(self.bailing_official, 'bailing_official')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.model is not None:
            result['model'] = self.model
        if self.preset_index is not None:
            result['preset_index'] = self.preset_index
        if self.temperature is not None:
            result['temperature'] = self.temperature
        if self.top_k is not None:
            result['top_k'] = self.top_k
        if self.top_p is not None:
            result['top_p'] = self.top_p
        if self.do_sample is not None:
            result['do_sample'] = self.do_sample
        if self.beam_width is not None:
            result['beam_width'] = self.beam_width
        if self.max_out_token is not None:
            result['max_out_token'] = self.max_out_token
        if self.function_call is not None:
            result['function_call'] = self.function_call
        if self.custom_url is not None:
            result['custom_url'] = self.custom_url
        if self.bailing_official is not None:
            result['bailing_official'] = self.bailing_official
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('preset_index') is not None:
            self.preset_index = m.get('preset_index')
        if m.get('temperature') is not None:
            self.temperature = m.get('temperature')
        if m.get('top_k') is not None:
            self.top_k = m.get('top_k')
        if m.get('top_p') is not None:
            self.top_p = m.get('top_p')
        if m.get('do_sample') is not None:
            self.do_sample = m.get('do_sample')
        if m.get('beam_width') is not None:
            self.beam_width = m.get('beam_width')
        if m.get('max_out_token') is not None:
            self.max_out_token = m.get('max_out_token')
        if m.get('function_call') is not None:
            self.function_call = m.get('function_call')
        if m.get('custom_url') is not None:
            self.custom_url = m.get('custom_url')
        if m.get('bailing_official') is not None:
            self.bailing_official = m.get('bailing_official')
        return self


class ToolInfoVO(TeaModel):
    def __init__(
        self,
        name: str = None,
        description: str = None,
        input_schema: JsonSchema = None,
    ):
        # 工具名称
        self.name = name
        # 工具描述
        self.description = description
        # 工具入参的json schema
        self.input_schema = input_schema

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.input_schema, 'input_schema')
        if self.input_schema:
            self.input_schema.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.input_schema is not None:
            result['input_schema'] = self.input_schema.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('input_schema') is not None:
            temp_model = JsonSchema()
            self.input_schema = temp_model.from_map(m['input_schema'])
        return self


class SubAgentInfo(TeaModel):
    def __init__(
        self,
        id: int = None,
        unique_code: str = None,
        scene: str = None,
        scripting: List[str] = None,
        is_default: bool = None,
        instance_id: str = None,
        edges: List[MultiAgentEdge] = None,
        position: DraftPosition = None,
        agent_source: str = None,
    ):
        # agent主键id
        # 
        self.id = id
        # agent code
        # 
        self.unique_code = unique_code
        # 场景描述
        # 
        self.scene = scene
        # 调用示例 话术
        # 
        self.scripting = scripting
        # 是否默认展示
        # 
        self.is_default = is_default
        # 实例id
        # 
        self.instance_id = instance_id
        # edges 信息
        # 
        self.edges = edges
        # 坐标信息
        # 
        self.position = position
        # agent 来源类型
        # 
        self.agent_source = agent_source

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.unique_code, 'unique_code')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.scripting, 'scripting')
        self.validate_required(self.is_default, 'is_default')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.edges, 'edges')
        if self.edges:
            for k in self.edges:
                if k:
                    k.validate()
        self.validate_required(self.position, 'position')
        if self.position:
            self.position.validate()
        self.validate_required(self.agent_source, 'agent_source')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.unique_code is not None:
            result['unique_code'] = self.unique_code
        if self.scene is not None:
            result['scene'] = self.scene
        if self.scripting is not None:
            result['scripting'] = self.scripting
        if self.is_default is not None:
            result['is_default'] = self.is_default
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        result['edges'] = []
        if self.edges is not None:
            for k in self.edges:
                result['edges'].append(k.to_map() if k else None)
        if self.position is not None:
            result['position'] = self.position.to_map()
        if self.agent_source is not None:
            result['agent_source'] = self.agent_source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('unique_code') is not None:
            self.unique_code = m.get('unique_code')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('scripting') is not None:
            self.scripting = m.get('scripting')
        if m.get('is_default') is not None:
            self.is_default = m.get('is_default')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        self.edges = []
        if m.get('edges') is not None:
            for k in m.get('edges'):
                temp_model = MultiAgentEdge()
                self.edges.append(temp_model.from_map(k))
        if m.get('position') is not None:
            temp_model = DraftPosition()
            self.position = temp_model.from_map(m['position'])
        if m.get('agent_source') is not None:
            self.agent_source = m.get('agent_source')
        return self


class AgentRefPluginInfo(TeaModel):
    def __init__(
        self,
        id: str = None,
        build_version: str = None,
        param_value_map: str = None,
        param_value_map_json: str = None,
        corpus: List[str] = None,
    ):
        # 工具id
        # 
        self.id = id
        # 构建版本号
        # 
        self.build_version = build_version
        # 入参预设值表 Map<String, String>
        self.param_value_map = param_value_map
        # 入参预设值表，原param_value_map字段，Map<String, String>格式
        # 
        self.param_value_map_json = param_value_map_json
        # 关联的语料
        self.corpus = corpus

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.build_version, 'build_version')
        self.validate_required(self.param_value_map, 'param_value_map')
        self.validate_required(self.param_value_map_json, 'param_value_map_json')
        self.validate_required(self.corpus, 'corpus')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.build_version is not None:
            result['build_version'] = self.build_version
        if self.param_value_map is not None:
            result['param_value_map'] = self.param_value_map
        if self.param_value_map_json is not None:
            result['param_value_map_json'] = self.param_value_map_json
        if self.corpus is not None:
            result['corpus'] = self.corpus
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('build_version') is not None:
            self.build_version = m.get('build_version')
        if m.get('param_value_map') is not None:
            self.param_value_map = m.get('param_value_map')
        if m.get('param_value_map_json') is not None:
            self.param_value_map_json = m.get('param_value_map_json')
        if m.get('corpus') is not None:
            self.corpus = m.get('corpus')
        return self


class AgentSecConfig(TeaModel):
    def __init__(
        self,
        enable_sec_check: bool = None,
        sec_provider: str = None,
    ):
        # 是否打开安全审核
        self.enable_sec_check = enable_sec_check
        # 安全提供方:平台配置 大安全、天鉴等
        self.sec_provider = sec_provider

    def validate(self):
        self.validate_required(self.enable_sec_check, 'enable_sec_check')
        self.validate_required(self.sec_provider, 'sec_provider')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.enable_sec_check is not None:
            result['enable_sec_check'] = self.enable_sec_check
        if self.sec_provider is not None:
            result['sec_provider'] = self.sec_provider
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('enable_sec_check') is not None:
            self.enable_sec_check = m.get('enable_sec_check')
        if m.get('sec_provider') is not None:
            self.sec_provider = m.get('sec_provider')
        return self


class DisplayResponseContent(TeaModel):
    def __init__(
        self,
        chat_history_display_type_enum: str = None,
        display_response_type: str = None,
        raw_content: str = None,
        kv_map: str = None,
        ref_node_id: str = None,
        spm_data: str = None,
        domain_intent: str = None,
        text_response: str = None,
        template_action_list: List[TemplateAction] = None,
        order: int = None,
        template_id: str = None,
        template_name: str = None,
        template_response_id: str = None,
        template_picture_url: str = None,
        card_response_id: str = None,
        card_id: str = None,
        card_version: str = None,
        msg_title: str = None,
        msg_content: str = None,
        knowledge_title_list: List[KnowledgeTitleInfo] = None,
        document_reference_list: List[DocumentReferenceInfo] = None,
        suggestions: List[str] = None,
        unit_id: str = None,
        index: int = None,
        loading: bool = None,
        timestamp: int = None,
        timestamp_display: str = None,
        reply_cmd: str = None,
        files: List[AttachFile] = None,
        thought_chain: ThoughtChainInfo = None,
        agent_chat_log_info: AgentChatLogInfo = None,
    ):
        # 【对话历史展示专用】对话历史展示类型，枚举值：QUERY("用户输入"), RESPONSE("回复")
        # 
        self.chat_history_display_type_enum = chat_history_display_type_enum
        # 展示类型，前端根据此类型读取相关字段进行展示，枚举值：TEXT("文本"), CARD("卡片"), TEMPLATE("模版"), MARKDOWN("Markdown模版"), KNOWLEDGE("知识点"), DOCUMENT("文档"), PLUGIN("插件"), DEFAULT("兜底"), ERROR("异常")
        # 
        self.display_response_type = display_response_type
        # content 日志原文
        self.raw_content = raw_content
        # Map<String, Object> 元数据kv对
        # 
        self.kv_map = kv_map
        # 关联节点id
        # 
        self.ref_node_id = ref_node_id
        # 关联节点信息
        # 
        self.spm_data = spm_data
        # 关联意图domain+intent
        # 
        self.domain_intent = domain_intent
        # 文本回复内容，非文本类型的机器人回复展现也使用该字段
        # 
        self.text_response = text_response
        # 卡片/模版类型：行动点列表
        # 
        self.template_action_list = template_action_list
        # 模版/卡片类型: 序号
        # 
        self.order = order
        # 模版类型：模版id
        # 
        self.template_id = template_id
        # 模版类型：模版名称
        # 
        self.template_name = template_name
        # 模版类型：模版 responseId
        # 
        self.template_response_id = template_response_id
        # 模版类型：模版预览图地址
        # 
        self.template_picture_url = template_picture_url
        # 卡片类型：卡片 responseId
        # 
        self.card_response_id = card_response_id
        # 卡片类型：卡片ID
        # 
        self.card_id = card_id
        # 卡片类型：卡片版本
        # 
        self.card_version = card_version
        # Markdown 类型：消息标题
        # 
        self.msg_title = msg_title
        # Markdown 类型：消息内容
        # 
        self.msg_content = msg_content
        # 知识类型：知识点列表
        # 
        self.knowledge_title_list = knowledge_title_list
        # 文档类型：文档参考片段列表
        # 
        self.document_reference_list = document_reference_list
        # 建议/关联问题列表
        # 
        self.suggestions = suggestions
        # 响应单元id
        # 
        self.unit_id = unit_id
        # 响应序号
        # 
        self.index = index
        # 是还在加载
        # 
        self.loading = loading
        # 运行时间戳，用于计算耗时
        # 
        self.timestamp = timestamp
        # 运行时间戳，展示格式（已废弃）
        # 
        self.timestamp_display = timestamp_display
        # 响应控制码，用于标识是否被安全拦截或者正常生成
        # 
        self.reply_cmd = reply_cmd
        # 附件列表
        # 
        self.files = files
        # Agent 运行思维链
        self.thought_chain = thought_chain
        # AgentChatLogInfo. Agent 运行相关信息
        # 
        self.agent_chat_log_info = agent_chat_log_info

    def validate(self):
        self.validate_required(self.chat_history_display_type_enum, 'chat_history_display_type_enum')
        self.validate_required(self.display_response_type, 'display_response_type')
        self.validate_required(self.raw_content, 'raw_content')
        self.validate_required(self.kv_map, 'kv_map')
        self.validate_required(self.ref_node_id, 'ref_node_id')
        self.validate_required(self.spm_data, 'spm_data')
        self.validate_required(self.domain_intent, 'domain_intent')
        self.validate_required(self.text_response, 'text_response')
        self.validate_required(self.template_action_list, 'template_action_list')
        if self.template_action_list:
            for k in self.template_action_list:
                if k:
                    k.validate()
        self.validate_required(self.order, 'order')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.template_name, 'template_name')
        self.validate_required(self.template_response_id, 'template_response_id')
        self.validate_required(self.template_picture_url, 'template_picture_url')
        self.validate_required(self.card_response_id, 'card_response_id')
        self.validate_required(self.card_id, 'card_id')
        self.validate_required(self.card_version, 'card_version')
        self.validate_required(self.msg_title, 'msg_title')
        self.validate_required(self.msg_content, 'msg_content')
        self.validate_required(self.knowledge_title_list, 'knowledge_title_list')
        if self.knowledge_title_list:
            for k in self.knowledge_title_list:
                if k:
                    k.validate()
        self.validate_required(self.document_reference_list, 'document_reference_list')
        if self.document_reference_list:
            for k in self.document_reference_list:
                if k:
                    k.validate()
        self.validate_required(self.suggestions, 'suggestions')
        self.validate_required(self.unit_id, 'unit_id')
        self.validate_required(self.index, 'index')
        self.validate_required(self.loading, 'loading')
        self.validate_required(self.timestamp, 'timestamp')
        self.validate_required(self.timestamp_display, 'timestamp_display')
        if self.timestamp_display is not None:
            self.validate_pattern(self.timestamp_display, 'timestamp_display', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.reply_cmd, 'reply_cmd')
        self.validate_required(self.files, 'files')
        if self.files:
            for k in self.files:
                if k:
                    k.validate()
        self.validate_required(self.thought_chain, 'thought_chain')
        if self.thought_chain:
            self.thought_chain.validate()
        self.validate_required(self.agent_chat_log_info, 'agent_chat_log_info')
        if self.agent_chat_log_info:
            self.agent_chat_log_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.chat_history_display_type_enum is not None:
            result['chat_history_display_type_enum'] = self.chat_history_display_type_enum
        if self.display_response_type is not None:
            result['display_response_type'] = self.display_response_type
        if self.raw_content is not None:
            result['raw_content'] = self.raw_content
        if self.kv_map is not None:
            result['kv_map'] = self.kv_map
        if self.ref_node_id is not None:
            result['ref_node_id'] = self.ref_node_id
        if self.spm_data is not None:
            result['spm_data'] = self.spm_data
        if self.domain_intent is not None:
            result['domain_intent'] = self.domain_intent
        if self.text_response is not None:
            result['text_response'] = self.text_response
        result['template_action_list'] = []
        if self.template_action_list is not None:
            for k in self.template_action_list:
                result['template_action_list'].append(k.to_map() if k else None)
        if self.order is not None:
            result['order'] = self.order
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.template_response_id is not None:
            result['template_response_id'] = self.template_response_id
        if self.template_picture_url is not None:
            result['template_picture_url'] = self.template_picture_url
        if self.card_response_id is not None:
            result['card_response_id'] = self.card_response_id
        if self.card_id is not None:
            result['card_id'] = self.card_id
        if self.card_version is not None:
            result['card_version'] = self.card_version
        if self.msg_title is not None:
            result['msg_title'] = self.msg_title
        if self.msg_content is not None:
            result['msg_content'] = self.msg_content
        result['knowledge_title_list'] = []
        if self.knowledge_title_list is not None:
            for k in self.knowledge_title_list:
                result['knowledge_title_list'].append(k.to_map() if k else None)
        result['document_reference_list'] = []
        if self.document_reference_list is not None:
            for k in self.document_reference_list:
                result['document_reference_list'].append(k.to_map() if k else None)
        if self.suggestions is not None:
            result['suggestions'] = self.suggestions
        if self.unit_id is not None:
            result['unit_id'] = self.unit_id
        if self.index is not None:
            result['index'] = self.index
        if self.loading is not None:
            result['loading'] = self.loading
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        if self.timestamp_display is not None:
            result['timestamp_display'] = self.timestamp_display
        if self.reply_cmd is not None:
            result['reply_cmd'] = self.reply_cmd
        result['files'] = []
        if self.files is not None:
            for k in self.files:
                result['files'].append(k.to_map() if k else None)
        if self.thought_chain is not None:
            result['thought_chain'] = self.thought_chain.to_map()
        if self.agent_chat_log_info is not None:
            result['agent_chat_log_info'] = self.agent_chat_log_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('chat_history_display_type_enum') is not None:
            self.chat_history_display_type_enum = m.get('chat_history_display_type_enum')
        if m.get('display_response_type') is not None:
            self.display_response_type = m.get('display_response_type')
        if m.get('raw_content') is not None:
            self.raw_content = m.get('raw_content')
        if m.get('kv_map') is not None:
            self.kv_map = m.get('kv_map')
        if m.get('ref_node_id') is not None:
            self.ref_node_id = m.get('ref_node_id')
        if m.get('spm_data') is not None:
            self.spm_data = m.get('spm_data')
        if m.get('domain_intent') is not None:
            self.domain_intent = m.get('domain_intent')
        if m.get('text_response') is not None:
            self.text_response = m.get('text_response')
        self.template_action_list = []
        if m.get('template_action_list') is not None:
            for k in m.get('template_action_list'):
                temp_model = TemplateAction()
                self.template_action_list.append(temp_model.from_map(k))
        if m.get('order') is not None:
            self.order = m.get('order')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('template_response_id') is not None:
            self.template_response_id = m.get('template_response_id')
        if m.get('template_picture_url') is not None:
            self.template_picture_url = m.get('template_picture_url')
        if m.get('card_response_id') is not None:
            self.card_response_id = m.get('card_response_id')
        if m.get('card_id') is not None:
            self.card_id = m.get('card_id')
        if m.get('card_version') is not None:
            self.card_version = m.get('card_version')
        if m.get('msg_title') is not None:
            self.msg_title = m.get('msg_title')
        if m.get('msg_content') is not None:
            self.msg_content = m.get('msg_content')
        self.knowledge_title_list = []
        if m.get('knowledge_title_list') is not None:
            for k in m.get('knowledge_title_list'):
                temp_model = KnowledgeTitleInfo()
                self.knowledge_title_list.append(temp_model.from_map(k))
        self.document_reference_list = []
        if m.get('document_reference_list') is not None:
            for k in m.get('document_reference_list'):
                temp_model = DocumentReferenceInfo()
                self.document_reference_list.append(temp_model.from_map(k))
        if m.get('suggestions') is not None:
            self.suggestions = m.get('suggestions')
        if m.get('unit_id') is not None:
            self.unit_id = m.get('unit_id')
        if m.get('index') is not None:
            self.index = m.get('index')
        if m.get('loading') is not None:
            self.loading = m.get('loading')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        if m.get('timestamp_display') is not None:
            self.timestamp_display = m.get('timestamp_display')
        if m.get('reply_cmd') is not None:
            self.reply_cmd = m.get('reply_cmd')
        self.files = []
        if m.get('files') is not None:
            for k in m.get('files'):
                temp_model = AttachFile()
                self.files.append(temp_model.from_map(k))
        if m.get('thought_chain') is not None:
            temp_model = ThoughtChainInfo()
            self.thought_chain = temp_model.from_map(m['thought_chain'])
        if m.get('agent_chat_log_info') is not None:
            temp_model = AgentChatLogInfo()
            self.agent_chat_log_info = temp_model.from_map(m['agent_chat_log_info'])
        return self


class AgentChatHistoryPreviewVO(TeaModel):
    def __init__(
        self,
        session_list: List[SingleAgentChatHistoryPreview] = None,
    ):
        # 对话历史列表
        self.session_list = session_list

    def validate(self):
        self.validate_required(self.session_list, 'session_list')
        if self.session_list:
            for k in self.session_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['session_list'] = []
        if self.session_list is not None:
            for k in self.session_list:
                result['session_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.session_list = []
        if m.get('session_list') is not None:
            for k in m.get('session_list'):
                temp_model = SingleAgentChatHistoryPreview()
                self.session_list.append(temp_model.from_map(k))
        return self


class UploadAttachmentFileVO(TeaModel):
    def __init__(
        self,
        upload_status: str = None,
        file_url: str = None,
        file_id: str = None,
        file_type: str = None,
        file_name: str = None,
        file_size: int = None,
        content_id: str = None,
        error_message: str = None,
    ):
        # 上传结果
        # 
        self.upload_status = upload_status
        # 文件URL
        self.file_url = file_url
        # file_id
        self.file_id = file_id
        # 文件类型
        self.file_type = file_type
        # 文件名
        self.file_name = file_name
        # 附件大小
        # 
        self.file_size = file_size
        # 内容库 ID（用于检索）
        # 
        self.content_id = content_id
        # 错误信息
        # 
        self.error_message = error_message

    def validate(self):
        self.validate_required(self.upload_status, 'upload_status')
        self.validate_required(self.file_url, 'file_url')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_size, 'file_size')
        self.validate_required(self.content_id, 'content_id')
        self.validate_required(self.error_message, 'error_message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.upload_status is not None:
            result['upload_status'] = self.upload_status
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('upload_status') is not None:
            self.upload_status = m.get('upload_status')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class AgentVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        unique_code: str = None,
        name: str = None,
        agent_version: str = None,
        type: str = None,
        description: str = None,
        creator: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        sec_config: AgentSecConfig = None,
        welcome: str = None,
        show_related_questions: bool = None,
        related_question_prompt: str = None,
        extra_info: str = None,
        extra_info_json: str = None,
        interaction_type: str = None,
        voice: str = None,
        model: str = None,
        model_list: List[AgentModelParams] = None,
        ref_library_ids: List[str] = None,
        ref_plugins: List[AgentRefPluginInfo] = None,
        ref_mcp_servers: List[AgentRefPluginInfo] = None,
        sub_agents: List[SubAgentInfo] = None,
        ref_workflows: List[AgentRefPluginInfo] = None,
        ref_card_ids: List[str] = None,
    ):
        # Agent的唯一标识符
        self.id = id
        # Agent唯一uid
        # 
        self.unique_code = unique_code
        # Agent名称
        # 
        self.name = name
        # Agent 版本
        # 
        self.agent_version = agent_version
        # Agent类型 "multi", "多智能体应用" "workflow", "工作流应用""lite", "轻量应用"  "external", "外部应用"
        self.type = type
        # Agent描述
        # 
        self.description = description
        # Agent创建人
        # 
        self.creator = creator
        # Agent创建时间
        # 
        self.gmt_create = gmt_create
        # Agent编辑时间
        # 
        self.gmt_modified = gmt_modified
        # Agent安全审核配置
        # 
        self.sec_config = sec_config
        # 欢迎语
        # 
        self.welcome = welcome
        # 是否展示关联问题
        # 
        self.show_related_questions = show_related_questions
        # 关联问题自定义prompt
        # 
        self.related_question_prompt = related_question_prompt
        # 额外信息 ，Map<String, Object>
        self.extra_info = extra_info
        # extra_info (额外信息) 字段的json形式，格式为：Map<String, Object>
        self.extra_info_json = extra_info_json
        # 交互类型 VOICE / AVATAR / VIDEO
        # 
        self.interaction_type = interaction_type
        # 音色
        # 
        self.voice = voice
        # agent模型版本 {model}/{version}#{adapter} (deprecated)
        # 
        self.model = model
        # Agent模型配置表
        # 
        self.model_list = model_list
        # Agent关联知识库ID列表
        # 
        self.ref_library_ids = ref_library_ids
        # Agent关联插件信息表, key为插件主键id, value为信息
        # 
        self.ref_plugins = ref_plugins
        # 关联的mcpServer
        # 
        self.ref_mcp_servers = ref_mcp_servers
        # 隶属multi-agent的sub agents
        # 
        self.sub_agents = sub_agents
        # Agent关联workflow信息表, key为intent wutong id, value为信息
        # 
        self.ref_workflows = ref_workflows
        # 关联卡片id列表
        # 
        self.ref_card_ids = ref_card_ids

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.unique_code, 'unique_code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.agent_version, 'agent_version')
        self.validate_required(self.type, 'type')
        self.validate_required(self.description, 'description')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.sec_config, 'sec_config')
        if self.sec_config:
            self.sec_config.validate()
        self.validate_required(self.welcome, 'welcome')
        self.validate_required(self.show_related_questions, 'show_related_questions')
        self.validate_required(self.related_question_prompt, 'related_question_prompt')
        self.validate_required(self.extra_info, 'extra_info')
        self.validate_required(self.extra_info_json, 'extra_info_json')
        self.validate_required(self.interaction_type, 'interaction_type')
        self.validate_required(self.voice, 'voice')
        self.validate_required(self.model, 'model')
        self.validate_required(self.model_list, 'model_list')
        if self.model_list:
            for k in self.model_list:
                if k:
                    k.validate()
        self.validate_required(self.ref_library_ids, 'ref_library_ids')
        self.validate_required(self.ref_plugins, 'ref_plugins')
        if self.ref_plugins:
            for k in self.ref_plugins:
                if k:
                    k.validate()
        self.validate_required(self.ref_mcp_servers, 'ref_mcp_servers')
        if self.ref_mcp_servers:
            for k in self.ref_mcp_servers:
                if k:
                    k.validate()
        self.validate_required(self.sub_agents, 'sub_agents')
        if self.sub_agents:
            for k in self.sub_agents:
                if k:
                    k.validate()
        self.validate_required(self.ref_workflows, 'ref_workflows')
        if self.ref_workflows:
            for k in self.ref_workflows:
                if k:
                    k.validate()
        self.validate_required(self.ref_card_ids, 'ref_card_ids')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.unique_code is not None:
            result['unique_code'] = self.unique_code
        if self.name is not None:
            result['name'] = self.name
        if self.agent_version is not None:
            result['agent_version'] = self.agent_version
        if self.type is not None:
            result['type'] = self.type
        if self.description is not None:
            result['description'] = self.description
        if self.creator is not None:
            result['creator'] = self.creator
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.sec_config is not None:
            result['sec_config'] = self.sec_config.to_map()
        if self.welcome is not None:
            result['welcome'] = self.welcome
        if self.show_related_questions is not None:
            result['show_related_questions'] = self.show_related_questions
        if self.related_question_prompt is not None:
            result['related_question_prompt'] = self.related_question_prompt
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.extra_info_json is not None:
            result['extra_info_json'] = self.extra_info_json
        if self.interaction_type is not None:
            result['interaction_type'] = self.interaction_type
        if self.voice is not None:
            result['voice'] = self.voice
        if self.model is not None:
            result['model'] = self.model
        result['model_list'] = []
        if self.model_list is not None:
            for k in self.model_list:
                result['model_list'].append(k.to_map() if k else None)
        if self.ref_library_ids is not None:
            result['ref_library_ids'] = self.ref_library_ids
        result['ref_plugins'] = []
        if self.ref_plugins is not None:
            for k in self.ref_plugins:
                result['ref_plugins'].append(k.to_map() if k else None)
        result['ref_mcp_servers'] = []
        if self.ref_mcp_servers is not None:
            for k in self.ref_mcp_servers:
                result['ref_mcp_servers'].append(k.to_map() if k else None)
        result['sub_agents'] = []
        if self.sub_agents is not None:
            for k in self.sub_agents:
                result['sub_agents'].append(k.to_map() if k else None)
        result['ref_workflows'] = []
        if self.ref_workflows is not None:
            for k in self.ref_workflows:
                result['ref_workflows'].append(k.to_map() if k else None)
        if self.ref_card_ids is not None:
            result['ref_card_ids'] = self.ref_card_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('unique_code') is not None:
            self.unique_code = m.get('unique_code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('agent_version') is not None:
            self.agent_version = m.get('agent_version')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('sec_config') is not None:
            temp_model = AgentSecConfig()
            self.sec_config = temp_model.from_map(m['sec_config'])
        if m.get('welcome') is not None:
            self.welcome = m.get('welcome')
        if m.get('show_related_questions') is not None:
            self.show_related_questions = m.get('show_related_questions')
        if m.get('related_question_prompt') is not None:
            self.related_question_prompt = m.get('related_question_prompt')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('extra_info_json') is not None:
            self.extra_info_json = m.get('extra_info_json')
        if m.get('interaction_type') is not None:
            self.interaction_type = m.get('interaction_type')
        if m.get('voice') is not None:
            self.voice = m.get('voice')
        if m.get('model') is not None:
            self.model = m.get('model')
        self.model_list = []
        if m.get('model_list') is not None:
            for k in m.get('model_list'):
                temp_model = AgentModelParams()
                self.model_list.append(temp_model.from_map(k))
        if m.get('ref_library_ids') is not None:
            self.ref_library_ids = m.get('ref_library_ids')
        self.ref_plugins = []
        if m.get('ref_plugins') is not None:
            for k in m.get('ref_plugins'):
                temp_model = AgentRefPluginInfo()
                self.ref_plugins.append(temp_model.from_map(k))
        self.ref_mcp_servers = []
        if m.get('ref_mcp_servers') is not None:
            for k in m.get('ref_mcp_servers'):
                temp_model = AgentRefPluginInfo()
                self.ref_mcp_servers.append(temp_model.from_map(k))
        self.sub_agents = []
        if m.get('sub_agents') is not None:
            for k in m.get('sub_agents'):
                temp_model = SubAgentInfo()
                self.sub_agents.append(temp_model.from_map(k))
        self.ref_workflows = []
        if m.get('ref_workflows') is not None:
            for k in m.get('ref_workflows'):
                temp_model = AgentRefPluginInfo()
                self.ref_workflows.append(temp_model.from_map(k))
        if m.get('ref_card_ids') is not None:
            self.ref_card_ids = m.get('ref_card_ids')
        return self


class DigitalGatewayMCPPageVO(TeaModel):
    def __init__(
        self,
        space_id: str = None,
        server_id: str = None,
        server_code: str = None,
        server_name: str = None,
        icon: str = None,
        description: str = None,
        categories: List[str] = None,
    ):
        # 空间id
        self.space_id = space_id
        # server_id
        self.server_id = server_id
        # server_code
        self.server_code = server_code
        # server_name
        self.server_name = server_name
        # icon
        self.icon = icon
        # description
        self.description = description
        # mcp分类
        self.categories = categories

    def validate(self):
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.server_id, 'server_id')
        self.validate_required(self.server_code, 'server_code')
        self.validate_required(self.server_name, 'server_name')
        self.validate_required(self.icon, 'icon')
        self.validate_required(self.description, 'description')
        self.validate_required(self.categories, 'categories')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.server_id is not None:
            result['server_id'] = self.server_id
        if self.server_code is not None:
            result['server_code'] = self.server_code
        if self.server_name is not None:
            result['server_name'] = self.server_name
        if self.icon is not None:
            result['icon'] = self.icon
        if self.description is not None:
            result['description'] = self.description
        if self.categories is not None:
            result['categories'] = self.categories
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('server_id') is not None:
            self.server_id = m.get('server_id')
        if m.get('server_code') is not None:
            self.server_code = m.get('server_code')
        if m.get('server_name') is not None:
            self.server_name = m.get('server_name')
        if m.get('icon') is not None:
            self.icon = m.get('icon')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('categories') is not None:
            self.categories = m.get('categories')
        return self


class DisplaySingleSessionHistoryVO(TeaModel):
    def __init__(
        self,
        content_list: List[DisplayResponseContent] = None,
    ):
        # 展示内容列表，入参和出参放在一起，方便前端展示
        self.content_list = content_list

    def validate(self):
        self.validate_required(self.content_list, 'content_list')
        if self.content_list:
            for k in self.content_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['content_list'] = []
        if self.content_list is not None:
            for k in self.content_list:
                result['content_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.content_list = []
        if m.get('content_list') is not None:
            for k in m.get('content_list'):
                temp_model = DisplayResponseContent()
                self.content_list.append(temp_model.from_map(k))
        return self


class ContentTask(TeaModel):
    def __init__(
        self,
        id: int = None,
        task_name: str = None,
        task_type: str = None,
        status: str = None,
    ):
        # 任务ID
        self.id = id
        # 任务名称
        self.task_name = task_name
        # 任务类型
        self.task_type = task_type
        # 任务状态:
        self.status = status

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.task_name, 'task_name')
        self.validate_required(self.task_type, 'task_type')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.task_type is not None:
            result['task_type'] = self.task_type
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('task_type') is not None:
            self.task_type = m.get('task_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class BizErrorInfo(TeaModel):
    def __init__(
        self,
        code: str = None,
        error_msg: str = None,
        params: str = None,
    ):
        # code
        self.code = code
        # 异常信息
        self.error_msg = error_msg
        # params
        self.params = params

    def validate(self):
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class DigitalGatewayMCPDetailVO(TeaModel):
    def __init__(
        self,
        server_host: str = None,
        transport_protocol: str = None,
        server_token: str = None,
        space_id: str = None,
        server_id: str = None,
        server_code: str = None,
        server_name: str = None,
        icon: str = None,
        description: str = None,
        docs: str = None,
        tool_list: List[ToolInfoVO] = None,
    ):
        # server_host
        self.server_host = server_host
        # server请求协议
        self.transport_protocol = transport_protocol
        # 网关请求令牌
        self.server_token = server_token
        # 空间id
        self.space_id = space_id
        # server_id
        self.server_id = server_id
        # server_code
        self.server_code = server_code
        # server名称
        self.server_name = server_name
        # icon
        self.icon = icon
        # server描述
        self.description = description
        # mcp上架信息（富文本）
        self.docs = docs
        # 工具列表
        self.tool_list = tool_list

    def validate(self):
        self.validate_required(self.server_host, 'server_host')
        self.validate_required(self.transport_protocol, 'transport_protocol')
        self.validate_required(self.server_token, 'server_token')
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.server_id, 'server_id')
        self.validate_required(self.server_code, 'server_code')
        self.validate_required(self.server_name, 'server_name')
        self.validate_required(self.icon, 'icon')
        self.validate_required(self.description, 'description')
        self.validate_required(self.docs, 'docs')
        self.validate_required(self.tool_list, 'tool_list')
        if self.tool_list:
            for k in self.tool_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.server_host is not None:
            result['server_host'] = self.server_host
        if self.transport_protocol is not None:
            result['transport_protocol'] = self.transport_protocol
        if self.server_token is not None:
            result['server_token'] = self.server_token
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.server_id is not None:
            result['server_id'] = self.server_id
        if self.server_code is not None:
            result['server_code'] = self.server_code
        if self.server_name is not None:
            result['server_name'] = self.server_name
        if self.icon is not None:
            result['icon'] = self.icon
        if self.description is not None:
            result['description'] = self.description
        if self.docs is not None:
            result['docs'] = self.docs
        result['tool_list'] = []
        if self.tool_list is not None:
            for k in self.tool_list:
                result['tool_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('server_host') is not None:
            self.server_host = m.get('server_host')
        if m.get('transport_protocol') is not None:
            self.transport_protocol = m.get('transport_protocol')
        if m.get('server_token') is not None:
            self.server_token = m.get('server_token')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('server_id') is not None:
            self.server_id = m.get('server_id')
        if m.get('server_code') is not None:
            self.server_code = m.get('server_code')
        if m.get('server_name') is not None:
            self.server_name = m.get('server_name')
        if m.get('icon') is not None:
            self.icon = m.get('icon')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('docs') is not None:
            self.docs = m.get('docs')
        self.tool_list = []
        if m.get('tool_list') is not None:
            for k in m.get('tool_list'):
                temp_model = ToolInfoVO()
                self.tool_list.append(temp_model.from_map(k))
        return self


class ContentFile(TeaModel):
    def __init__(
        self,
        library_id: int = None,
        id: int = None,
        name: str = None,
        typ: str = None,
        tag_list: List[str] = None,
        publish_status: str = None,
    ):
        # 文档所属知识库ID
        self.library_id = library_id
        # 文档ID
        self.id = id
        # 文档文件名
        self.name = name
        # 文档类型
        self.typ = typ
        # 文档标签列表
        self.tag_list = tag_list
        # 发布状态
        self.publish_status = publish_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.library_id is not None:
            result['library_id'] = self.library_id
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.typ is not None:
            result['typ'] = self.typ
        if self.tag_list is not None:
            result['tag_list'] = self.tag_list
        if self.publish_status is not None:
            result['publish_status'] = self.publish_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('typ') is not None:
            self.typ = m.get('typ')
        if m.get('tag_list') is not None:
            self.tag_list = m.get('tag_list')
        if m.get('publish_status') is not None:
            self.publish_status = m.get('publish_status')
        return self


class StringResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        msg: str = None,
        trace_id: str = None,
        req_id: str = None,
        result: str = None,
    ):
        # success
        self.success = success
        # code
        self.code = code
        # msg
        self.msg = msg
        # trace_id
        self.trace_id = trace_id
        # req_id
        self.req_id = req_id
        # 接口返回值
        self.result = result

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.req_id, 'req_id')
        self.validate_required(self.result, 'result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.req_id is not None:
            result['req_id'] = self.req_id
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('req_id') is not None:
            self.req_id = m.get('req_id')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class AgentChatHistoryForSessionIdResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        msg: str = None,
        trace_id: str = None,
        req_id: str = None,
        result: DisplaySingleSessionHistoryVO = None,
    ):
        # success
        self.success = success
        # code
        self.code = code
        # msg
        self.msg = msg
        # trace_id
        self.trace_id = trace_id
        # req_id
        self.req_id = req_id
        # 对话历史
        # 
        self.result = result

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.req_id, 'req_id')
        self.validate_required(self.result, 'result')
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.req_id is not None:
            result['req_id'] = self.req_id
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('req_id') is not None:
            self.req_id = m.get('req_id')
        if m.get('result') is not None:
            temp_model = DisplaySingleSessionHistoryVO()
            self.result = temp_model.from_map(m['result'])
        return self


class AgentChatHistoryPreviewListResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        msg: str = None,
        trace_id: str = None,
        req_id: str = None,
        result: AgentChatHistoryPreviewVO = None,
    ):
        # 请求处理结果
        # 
        self.success = success
        # 返回结果编码
        # 
        self.code = code
        # 返回结果信息
        # 
        self.msg = msg
        # trace_id
        self.trace_id = trace_id
        # req_id
        self.req_id = req_id
        # 对话历史
        self.result = result

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.req_id, 'req_id')
        self.validate_required(self.result, 'result')
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.req_id is not None:
            result['req_id'] = self.req_id
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('req_id') is not None:
            self.req_id = m.get('req_id')
        if m.get('result') is not None:
            temp_model = AgentChatHistoryPreviewVO()
            self.result = temp_model.from_map(m['result'])
        return self


class LibraryContentTaskPageResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        message: str = None,
        trace_id: str = None,
        total_count: int = None,
        current_page: int = None,
        page_size: int = None,
        result: List[ContentTask] = None,
    ):
        # 请求处理结果标识
        self.success = success
        # 业务状态码
        self.code = code
        # 返回消息
        self.message = message
        # 请求链路追踪ID
        self.trace_id = trace_id
        # 符合查询条件的总记录数
        self.total_count = total_count
        # 当前返回数据的页码
        self.current_page = current_page
        # 实际返回的每页记录数
        self.page_size = page_size
        # 任务数据列表
        self.result = result

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.total_count, 'total_count')
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.result, 'result')
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ContentTask()
                self.result.append(temp_model.from_map(k))
        return self


class LibraryUploadFileResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        message: str = None,
        trace_id: str = None,
        result: UploadAttachmentFileVO = None,
    ):
        # 请求处理结果标识
        self.success = success
        # 业务状态码
        self.code = code
        # 返回消息
        self.message = message
        # 请求链路追踪ID
        self.trace_id = trace_id
        # 文件上传响应对象
        self.result = result

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.result, 'result')
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('result') is not None:
            temp_model = UploadAttachmentFileVO()
            self.result = temp_model.from_map(m['result'])
        return self


class MyMcpPageRestult(TeaModel):
    def __init__(
        self,
        total_count: int = None,
        current_page: int = None,
        trace_id: str = None,
        success: bool = None,
        code: str = None,
        msg: str = None,
        req_id: str = None,
        result: List[DigitalGatewayMCPPageVO] = None,
    ):
        # total_count
        self.total_count = total_count
        # current_page
        self.current_page = current_page
        # trace_id
        self.trace_id = trace_id
        # success
        self.success = success
        # code
        self.code = code
        # msg
        self.msg = msg
        # req_id
        self.req_id = req_id
        # MCP分页内容
        self.result = result

    def validate(self):
        self.validate_required(self.total_count, 'total_count')
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.req_id, 'req_id')
        self.validate_required(self.result, 'result')
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.req_id is not None:
            result['req_id'] = self.req_id
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('req_id') is not None:
            self.req_id = m.get('req_id')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = DigitalGatewayMCPPageVO()
                self.result.append(temp_model.from_map(k))
        return self


class SimpleResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        msg: str = None,
        trace_id: str = None,
        req_id: str = None,
    ):
        # success
        self.success = success
        # 返回结果编码 “ok”
        self.code = code
        # 返回结果信息
        self.msg = msg
        # trace_id
        self.trace_id = trace_id
        # req_id
        self.req_id = req_id

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.req_id, 'req_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.req_id is not None:
            result['req_id'] = self.req_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('req_id') is not None:
            self.req_id = m.get('req_id')
        return self


class LibraryDocBatchSplitResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        message: str = None,
        trace_id: str = None,
        result: int = None,
    ):
        # 请求是否成功
        self.success = success
        # 业务状态码
        self.code = code
        # 返回消息
        self.message = message
        # 请求链路追踪ID
        self.trace_id = trace_id
        # 任务ID，可用于异步任务追踪
        self.result = result

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.result, 'result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class FileReq(TeaModel):
    def __init__(
        self,
        url: str = None,
        file_name: str = None,
        file_type: str = None,
        tag_list: List[str] = None,
    ):
        # 导入文件地址
        self.url = url
        # 文件名称
        self.file_name = file_name
        # 文件类型，不设置使用全局类型
        self.file_type = file_type
        # 文件标签列表（用于AI参考）
        self.tag_list = tag_list

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_type, 'file_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.tag_list is not None:
            result['tag_list'] = self.tag_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('tag_list') is not None:
            self.tag_list = m.get('tag_list')
        return self


class MCPDetailCommonResult(TeaModel):
    def __init__(
        self,
        result: DigitalGatewayMCPDetailVO = None,
        success: bool = None,
        code: str = None,
        msg: str = None,
        trace_id: str = None,
        req_id: str = None,
        biz_error: BizErrorInfo = None,
    ):
        # MCP详情信息
        self.result = result
        # success
        self.success = success
        # code
        self.code = code
        # msg
        self.msg = msg
        # trace_id
        self.trace_id = trace_id
        # req_id
        self.req_id = req_id
        # 异常对象
        self.biz_error = biz_error

    def validate(self):
        self.validate_required(self.result, 'result')
        if self.result:
            self.result.validate()
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.req_id, 'req_id')
        self.validate_required(self.biz_error, 'biz_error')
        if self.biz_error:
            self.biz_error.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.result is not None:
            result['result'] = self.result.to_map()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.req_id is not None:
            result['req_id'] = self.req_id
        if self.biz_error is not None:
            result['biz_error'] = self.biz_error.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('result') is not None:
            temp_model = DigitalGatewayMCPDetailVO()
            self.result = temp_model.from_map(m['result'])
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('req_id') is not None:
            self.req_id = m.get('req_id')
        if m.get('biz_error') is not None:
            temp_model = BizErrorInfo()
            self.biz_error = temp_model.from_map(m['biz_error'])
        return self


class DeleteSessionFromAgentChatHistoryResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        msg: str = None,
        trace_id: str = None,
        req_id: str = None,
    ):
        # success
        self.success = success
        # code
        self.code = code
        # 返回结果信息
        # 
        self.msg = msg
        # trace_id
        self.trace_id = trace_id
        # req_id
        self.req_id = req_id

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.req_id, 'req_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.req_id is not None:
            result['req_id'] = self.req_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('req_id') is not None:
            self.req_id = m.get('req_id')
        return self


class UploadAttachmentFileResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        msg: str = None,
        trace_id: str = None,
        req_id: str = None,
        result: UploadAttachmentFileVO = None,
    ):
        # success
        self.success = success
        # code
        self.code = code
        # msg
        self.msg = msg
        # trace_id
        self.trace_id = trace_id
        # req_id
        self.req_id = req_id
        # 上传解析结果
        # 
        self.result = result

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.req_id, 'req_id')
        self.validate_required(self.result, 'result')
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.req_id is not None:
            result['req_id'] = self.req_id
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('req_id') is not None:
            self.req_id = m.get('req_id')
        if m.get('result') is not None:
            temp_model = UploadAttachmentFileVO()
            self.result = temp_model.from_map(m['result'])
        return self


class MCPServerQueryPageGatewayRequest(TeaModel):
    def __init__(
        self,
        space_id: str = None,
        run_mode: str = None,
        source: str = None,
        query: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # 空间id
        self.space_id = space_id
        # 运行模式
        self.run_mode = run_mode
        # 来源
        self.source = source
        # 查询条件
        self.query = query
        # 页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.run_mode is not None:
            result['run_mode'] = self.run_mode
        if self.source is not None:
            result['source'] = self.source
        if self.query is not None:
            result['query'] = self.query
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('run_mode') is not None:
            self.run_mode = m.get('run_mode')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class AgentDtailResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        msg: str = None,
        trace_id: str = None,
        req_id: str = None,
        result: AgentVO = None,
    ):
        # success
        self.success = success
        # code
        self.code = code
        # msg
        self.msg = msg
        # trace_id
        self.trace_id = trace_id
        # req_id
        self.req_id = req_id
        # 返回结果
        # 
        self.result = result

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.msg, 'msg')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.req_id, 'req_id')
        self.validate_required(self.result, 'result')
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.req_id is not None:
            result['req_id'] = self.req_id
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('req_id') is not None:
            self.req_id = m.get('req_id')
        if m.get('result') is not None:
            temp_model = AgentVO()
            self.result = temp_model.from_map(m['result'])
        return self


class LibraryDocPageResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        code: str = None,
        message: str = None,
        trace_id: str = None,
        total_count: int = None,
        current_page: int = None,
        page_size: int = None,
        result: List[ContentFile] = None,
    ):
        # 请求处理结果标识
        self.success = success
        # 业务状态码
        self.code = code
        # 返回消息
        self.message = message
        # 请求链路追踪ID
        self.trace_id = trace_id
        # 符合查询条件的总记录数
        self.total_count = total_count
        # 当前返回数据的页码
        self.current_page = current_page
        # 分页大小
        self.page_size = page_size
        # 文档数据列表
        self.result = result

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.total_count, 'total_count')
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.result, 'result')
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ContentFile()
                self.result.append(temp_model.from_map(k))
        return self


class XNameValuePair(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 键名
        self.name = name
        # 键值
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class StartOpenaiChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chat_completion_request: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 参数内容为 ChatCompletionRequest 的 JSON 字符串
        self.chat_completion_request = chat_completion_request

    def validate(self):
        self.validate_required(self.chat_completion_request, 'chat_completion_request')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chat_completion_request is not None:
            result['chat_completion_request'] = self.chat_completion_request
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chat_completion_request') is not None:
            self.chat_completion_request = m.get('chat_completion_request')
        return self


class StartOpenaiChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chat_completion_object: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 会话结果
        self.chat_completion_object = chat_completion_object

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
        if self.chat_completion_object is not None:
            result['chat_completion_object'] = self.chat_completion_object
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chat_completion_object') is not None:
            self.chat_completion_object = m.get('chat_completion_object')
        return self


class StartAgentChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        agent_chat_request: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求内容，内容为 AgentChatReq 对象的json字符串
        self.agent_chat_request = agent_chat_request

    def validate(self):
        self.validate_required(self.agent_chat_request, 'agent_chat_request')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.agent_chat_request is not None:
            result['agent_chat_request'] = self.agent_chat_request
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('agent_chat_request') is not None:
            self.agent_chat_request = m.get('agent_chat_request')
        return self


class StartAgentChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chat_completion_object: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 会话结果
        self.chat_completion_object = chat_completion_object

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
        if self.chat_completion_object is not None:
            result['chat_completion_object'] = self.chat_completion_object
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chat_completion_object') is not None:
            self.chat_completion_object = m.get('chat_completion_object')
        return self


class StartAgentCchatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        agent_chat_request: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求内容，内容为 AgentChatReq 对象的json字符串
        self.agent_chat_request = agent_chat_request

    def validate(self):
        self.validate_required(self.agent_chat_request, 'agent_chat_request')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.agent_chat_request is not None:
            result['agent_chat_request'] = self.agent_chat_request
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('agent_chat_request') is not None:
            self.agent_chat_request = m.get('agent_chat_request')
        return self


class StartAgentCchatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chat_completion_object: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 会话结果
        self.chat_completion_object = chat_completion_object

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
        if self.chat_completion_object is not None:
            result['chat_completion_object'] = self.chat_completion_object
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chat_completion_object') is not None:
            self.chat_completion_object = m.get('chat_completion_object')
        return self


class UploadAlipayLibraryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadAlipayLibraryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LibraryUploadFileResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
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
            temp_model = LibraryUploadFileResult()
            self.data = temp_model.from_map(m['data'])
        return self


class UploadAlipayAgentchatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # fileId
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadAlipayAgentchatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: UploadAttachmentFileResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = UploadAttachmentFileResult()
            self.data = temp_model.from_map(m['data'])
        return self


class PagequeryMcpMymcpRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        space_id: str = None,
        query: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 空间ID
        self.space_id = space_id
        # 查询条件
        self.query = query
        # 页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.query is not None:
            result['query'] = self.query
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryMcpMymcpResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: MyMcpPageRestult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # MyMCP分页对象
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
            temp_model = MyMcpPageRestult()
            self.data = temp_model.from_map(m['data'])
        return self


class DetailMcpMymcpRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        space_id: str = None,
        server_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 空间id
        self.space_id = space_id
        # 平台serverId
        self.server_id = server_id

    def validate(self):
        self.validate_required(self.space_id, 'space_id')
        self.validate_required(self.server_id, 'server_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.space_id is not None:
            result['space_id'] = self.space_id
        if self.server_id is not None:
            result['server_id'] = self.server_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('space_id') is not None:
            self.space_id = m.get('space_id')
        if m.get('server_id') is not None:
            self.server_id = m.get('server_id')
        return self


class DetailMcpMymcpResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: MCPDetailCommonResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # MCP详情接口返回Result
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
            temp_model = MCPDetailCommonResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ListLibraryDocRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        library_id: int = None,
        title: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.library_id = library_id
        # 文档标题模糊匹配
        self.title = title
        # 当前页
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.library_id, 'library_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.library_id is not None:
            result['library_id'] = self.library_id
        if self.title is not None:
            result['title'] = self.title
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListLibraryDocResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LibraryDocPageResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应体
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
            temp_model = LibraryDocPageResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ListLibraryTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        library_id: int = None,
        task_type: List[str] = None,
        task_id: int = None,
        page_num: str = None,
        page_size: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.library_id = library_id
        # 任务类型列表
        self.task_type = task_type
        # 任务ID
        self.task_id = task_id
        # 页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.library_id, 'library_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.library_id is not None:
            result['library_id'] = self.library_id
        if self.task_type is not None:
            result['task_type'] = self.task_type
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        if m.get('task_type') is not None:
            self.task_type = m.get('task_type')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListLibraryTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LibraryContentTaskPageResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 知识库-任务列表result
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
            temp_model = LibraryContentTaskPageResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ExecLibraryDocsplitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        library_id: int = None,
        splitter: str = None,
        section_type: str = None,
        chunk_size: int = None,
        chunk_overlap: int = None,
        min_leve: int = None,
        regex: str = None,
        task_name: str = None,
        files: List[FileReq] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.library_id = library_id
        # 使用的切分器名称
        self.splitter = splitter
        # 切片类型
        self.section_type = section_type
        # 切分字数（智能分片/按规则分片）
        self.chunk_size = chunk_size
        # 块之间的最大重叠字符数（智能分片）
        self.chunk_overlap = chunk_overlap
        # 最小标题级别，0为全部拍平（智能分片）
        self.min_leve = min_leve
        # 自定义切分规则正则表达式（按规则分片）
        self.regex = regex
        # 任务名称
        self.task_name = task_name
        # 文件信息列表
        self.files = files

    def validate(self):
        self.validate_required(self.library_id, 'library_id')
        self.validate_required(self.splitter, 'splitter')
        self.validate_required(self.section_type, 'section_type')
        self.validate_required(self.chunk_size, 'chunk_size')
        self.validate_required(self.chunk_overlap, 'chunk_overlap')
        self.validate_required(self.regex, 'regex')
        self.validate_required(self.task_name, 'task_name')
        self.validate_required(self.files, 'files')
        if self.files:
            for k in self.files:
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
        if self.library_id is not None:
            result['library_id'] = self.library_id
        if self.splitter is not None:
            result['splitter'] = self.splitter
        if self.section_type is not None:
            result['section_type'] = self.section_type
        if self.chunk_size is not None:
            result['chunk_size'] = self.chunk_size
        if self.chunk_overlap is not None:
            result['chunk_overlap'] = self.chunk_overlap
        if self.min_leve is not None:
            result['min_leve'] = self.min_leve
        if self.regex is not None:
            result['regex'] = self.regex
        if self.task_name is not None:
            result['task_name'] = self.task_name
        result['files'] = []
        if self.files is not None:
            for k in self.files:
                result['files'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        if m.get('splitter') is not None:
            self.splitter = m.get('splitter')
        if m.get('section_type') is not None:
            self.section_type = m.get('section_type')
        if m.get('chunk_size') is not None:
            self.chunk_size = m.get('chunk_size')
        if m.get('chunk_overlap') is not None:
            self.chunk_overlap = m.get('chunk_overlap')
        if m.get('min_leve') is not None:
            self.min_leve = m.get('min_leve')
        if m.get('regex') is not None:
            self.regex = m.get('regex')
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        self.files = []
        if m.get('files') is not None:
            for k in m.get('files'):
                temp_model = FileReq()
                self.files.append(temp_model.from_map(k))
        return self


class ExecLibraryDocsplitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LibraryDocBatchSplitResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = LibraryDocBatchSplitResult()
            self.data = temp_model.from_map(m['data'])
        return self


class ListAgentChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        agent_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # agentCode
        self.agent_code = agent_code

    def validate(self):
        self.validate_required(self.agent_code, 'agent_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.agent_code is not None:
            result['agent_code'] = self.agent_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('agent_code') is not None:
            self.agent_code = m.get('agent_code')
        return self


class ListAgentChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AgentChatHistoryPreviewListResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AgentChatHistoryPreviewListResult()
            self.data = temp_model.from_map(m['data'])
        return self


class DetailAgentChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        agent_code: str = None,
        session_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # agent_code
        self.agent_code = agent_code
        # session_id
        self.session_id = session_id

    def validate(self):
        self.validate_required(self.agent_code, 'agent_code')
        self.validate_required(self.session_id, 'session_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.agent_code is not None:
            result['agent_code'] = self.agent_code
        if self.session_id is not None:
            result['session_id'] = self.session_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('agent_code') is not None:
            self.agent_code = m.get('agent_code')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        return self


class DetailAgentChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AgentChatHistoryForSessionIdResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AgentChatHistoryForSessionIdResult()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteAgentChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        agent_code: str = None,
        id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # agent_code
        self.agent_code = agent_code
        # session 主键ID
        self.id = id

    def validate(self):
        self.validate_required(self.agent_code, 'agent_code')
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.agent_code is not None:
            result['agent_code'] = self.agent_code
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('agent_code') is not None:
            self.agent_code = m.get('agent_code')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DeleteAgentChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: DeleteSessionFromAgentChatHistoryResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = DeleteSessionFromAgentChatHistoryResult()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateAgentChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chat_id: str = None,
        session_id: str = None,
        user_feedback: str = None,
        user_feed_remark: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # chat id
        # 
        self.chat_id = chat_id
        # session_id
        self.session_id = session_id
        # 用户反馈[up_vote, down_vote, cancel_up, cancel_down]
        # 
        self.user_feedback = user_feedback
        # 用户建议
        # 
        self.user_feed_remark = user_feed_remark

    def validate(self):
        self.validate_required(self.chat_id, 'chat_id')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.user_feedback, 'user_feedback')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chat_id is not None:
            result['chat_id'] = self.chat_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.user_feedback is not None:
            result['user_feedback'] = self.user_feedback
        if self.user_feed_remark is not None:
            result['user_feed_remark'] = self.user_feed_remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chat_id') is not None:
            self.chat_id = m.get('chat_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('user_feedback') is not None:
            self.user_feedback = m.get('user_feedback')
        if m.get('user_feed_remark') is not None:
            self.user_feed_remark = m.get('user_feed_remark')
        return self


class UpdateAgentChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SimpleResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = SimpleResult()
            self.data = temp_model.from_map(m['data'])
        return self


class DetailAgentInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # agent主键ID
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DetailAgentInfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AgentDtailResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = AgentDtailResult()
            self.data = temp_model.from_map(m['data'])
        return self


class StopAgentChatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        chat_id: str = None,
        agent_id: str = None,
        session_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # chat_id
        self.chat_id = chat_id
        # agent_id
        self.agent_id = agent_id
        # 会话ID，非必填，拓展用
        self.session_id = session_id

    def validate(self):
        self.validate_required(self.chat_id, 'chat_id')
        self.validate_required(self.agent_id, 'agent_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.chat_id is not None:
            result['chat_id'] = self.chat_id
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.session_id is not None:
            result['session_id'] = self.session_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('chat_id') is not None:
            self.chat_id = m.get('chat_id')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        return self


class StopAgentChatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SimpleResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = SimpleResult()
            self.data = temp_model.from_map(m['data'])
        return self


class UploadAgentPortalchatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # fileId
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadAgentPortalchatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: UploadAttachmentFileResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = UploadAttachmentFileResult()
            self.data = temp_model.from_map(m['data'])
        return self


class DownloadLibraryDocRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        library_id: int = None,
        doc_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 知识库ID
        self.library_id = library_id
        # 文档ID
        self.doc_id = doc_id

    def validate(self):
        self.validate_required(self.library_id, 'library_id')
        self.validate_required(self.doc_id, 'doc_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.library_id is not None:
            result['library_id'] = self.library_id
        if self.doc_id is not None:
            result['doc_id'] = self.doc_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('library_id') is not None:
            self.library_id = m.get('library_id')
        if m.get('doc_id') is not None:
            self.doc_id = m.get('doc_id')
        return self


class DownloadLibraryDocResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: StringResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = StringResult()
            self.data = temp_model.from_map(m['data'])
        return self


class UploadSaasLibraryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件ID
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadSaasLibraryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: LibraryUploadFileResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件上传响应
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
            temp_model = LibraryUploadFileResult()
            self.data = temp_model.from_map(m['data'])
        return self


class UploadSaasAgentchatRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # fileId
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadSaasAgentchatResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: UploadAttachmentFileResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
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
            temp_model = UploadAttachmentFileResult()
            self.data = temp_model.from_map(m['data'])
        return self


class StartAgentTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_chat_req: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求内容，内容为 TaskChatReq 对象的json字符串
        self.task_chat_req = task_chat_req

    def validate(self):
        self.validate_required(self.task_chat_req, 'task_chat_req')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_chat_req is not None:
            result['task_chat_req'] = self.task_chat_req
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_chat_req') is not None:
            self.task_chat_req = m.get('task_chat_req')
        return self


class StartAgentTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        chat_completion_object: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 会话结果
        self.chat_completion_object = chat_completion_object

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
        if self.chat_completion_object is not None:
            result['chat_completion_object'] = self.chat_completion_object
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('chat_completion_object') is not None:
            self.chat_completion_object = m.get('chat_completion_object')
        return self


class StopAgentTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_event_req: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求内容，内容为 task_event_req 对象的json字符串
        self.task_event_req = task_event_req

    def validate(self):
        self.validate_required(self.task_event_req, 'task_event_req')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_event_req is not None:
            result['task_event_req'] = self.task_event_req
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_event_req') is not None:
            self.task_event_req = m.get('task_event_req')
        return self


class StopAgentTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # success
        self.success = success

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
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class OperateAgentTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_event_req: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求内容，内容为 task_event_req 对象的json字符串
        self.task_event_req = task_event_req

    def validate(self):
        self.validate_required(self.task_event_req, 'task_event_req')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_event_req is not None:
            result['task_event_req'] = self.task_event_req
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_event_req') is not None:
            self.task_event_req = m.get('task_event_req')
        return self


class OperateAgentTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_messages: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 会话结果
        # 
        self.task_messages = task_messages

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
        if self.task_messages is not None:
            result['task_messages'] = self.task_messages
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_messages') is not None:
            self.task_messages = m.get('task_messages')
        return self


class CreateAntcloudGatewayxFileUploadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_code: str = None,
        file_label: str = None,
        file_metadata: str = None,
        file_name: str = None,
        mime_type: str = None,
        api_cluster: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 上传文件作用的openapi method
        self.api_code = api_code
        # 文件标签，多个标签;分割
        self.file_label = file_label
        # 自定义的文件元数据
        self.file_metadata = file_metadata
        # 文件名，不传则随机生成文件名
        self.file_name = file_name
        # 文件的多媒体类型
        self.mime_type = mime_type
        # 产品方的api归属集群，即productInstanceId
        self.api_cluster = api_cluster

    def validate(self):
        self.validate_required(self.api_code, 'api_code')
        if self.file_label is not None:
            self.validate_max_length(self.file_label, 'file_label', 100)
        if self.file_metadata is not None:
            self.validate_max_length(self.file_metadata, 'file_metadata', 1000)
        if self.file_name is not None:
            self.validate_max_length(self.file_name, 'file_name', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.api_code is not None:
            result['api_code'] = self.api_code
        if self.file_label is not None:
            result['file_label'] = self.file_label
        if self.file_metadata is not None:
            result['file_metadata'] = self.file_metadata
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.mime_type is not None:
            result['mime_type'] = self.mime_type
        if self.api_cluster is not None:
            result['api_cluster'] = self.api_cluster
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_code') is not None:
            self.api_code = m.get('api_code')
        if m.get('file_label') is not None:
            self.file_label = m.get('file_label')
        if m.get('file_metadata') is not None:
            self.file_metadata = m.get('file_metadata')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('mime_type') is not None:
            self.mime_type = m.get('mime_type')
        if m.get('api_cluster') is not None:
            self.api_cluster = m.get('api_cluster')
        return self


class CreateAntcloudGatewayxFileUploadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        expired_time: str = None,
        file_id: str = None,
        upload_headers: List[XNameValuePair] = None,
        upload_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上传有效期
        self.expired_time = expired_time
        # 32位文件唯一id
        self.file_id = file_id
        # 放入http请求头里
        self.upload_headers = upload_headers
        # 文件上传地址
        self.upload_url = upload_url

    def validate(self):
        if self.expired_time is not None:
            self.validate_pattern(self.expired_time, 'expired_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.upload_headers:
            for k in self.upload_headers:
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
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.file_id is not None:
            result['file_id'] = self.file_id
        result['upload_headers'] = []
        if self.upload_headers is not None:
            for k in self.upload_headers:
                result['upload_headers'].append(k.to_map() if k else None)
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        self.upload_headers = []
        if m.get('upload_headers') is not None:
            for k in m.get('upload_headers'):
                temp_model = XNameValuePair()
                self.upload_headers.append(temp_model.from_map(k))
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        return self


