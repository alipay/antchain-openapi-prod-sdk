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


class PagequeryAgentMcplistRequest(TeaModel):
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


class PagequeryAgentMcplistResponse(TeaModel):
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


class DetailAgentMcpRequest(TeaModel):
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


class DetailAgentMcpResponse(TeaModel):
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


