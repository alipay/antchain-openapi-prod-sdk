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


class SubDemoStruct(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # name
        self.name = name
        # value
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


class AbcDemoStruct(TeaModel):
    def __init__(
        self,
        some_string: str = None,
        some_number: int = None,
        some_boolean: bool = None,
        some_date: str = None,
        some_string_list: List[str] = None,
        some_struct: SubDemoStruct = None,
        some_struct_list: List[SubDemoStruct] = None,
    ):
        # 字符串属性
        self.some_string = some_string
        # Long型属性
        self.some_number = some_number
        # 布尔型
        self.some_boolean = some_boolean
        # ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
        self.some_date = some_date
        # 字符串数组
        self.some_string_list = some_string_list
        # 子结构体
        self.some_struct = some_struct
        # 结构体数组
        self.some_struct_list = some_struct_list

    def validate(self):
        if self.some_string is not None:
            self.validate_max_length(self.some_string, 'some_string', 100)
        self.validate_required(self.some_number, 'some_number')
        if self.some_number is not None:
            self.validate_maximum(self.some_number, 'some_number', 100)
            self.validate_minimum(self.some_number, 'some_number', 1)
        self.validate_required(self.some_boolean, 'some_boolean')
        if self.some_date is not None:
            self.validate_pattern(self.some_date, 'some_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.some_struct, 'some_struct')
        if self.some_struct:
            self.some_struct.validate()
        self.validate_required(self.some_struct_list, 'some_struct_list')
        if self.some_struct_list:
            for k in self.some_struct_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.some_string is not None:
            result['some_string'] = self.some_string
        if self.some_number is not None:
            result['some_number'] = self.some_number
        if self.some_boolean is not None:
            result['some_boolean'] = self.some_boolean
        if self.some_date is not None:
            result['some_date'] = self.some_date
        if self.some_string_list is not None:
            result['some_string_list'] = self.some_string_list
        if self.some_struct is not None:
            result['some_struct'] = self.some_struct.to_map()
        result['some_struct_list'] = []
        if self.some_struct_list is not None:
            for k in self.some_struct_list:
                result['some_struct_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('some_string') is not None:
            self.some_string = m.get('some_string')
        if m.get('some_number') is not None:
            self.some_number = m.get('some_number')
        if m.get('some_boolean') is not None:
            self.some_boolean = m.get('some_boolean')
        if m.get('some_date') is not None:
            self.some_date = m.get('some_date')
        if m.get('some_string_list') is not None:
            self.some_string_list = m.get('some_string_list')
        if m.get('some_struct') is not None:
            temp_model = SubDemoStruct()
            self.some_struct = temp_model.from_map(m['some_struct'])
        self.some_struct_list = []
        if m.get('some_struct_list') is not None:
            for k in m.get('some_struct_list'):
                temp_model = SubDemoStruct()
                self.some_struct_list.append(temp_model.from_map(k))
        return self


class TestDemo(TeaModel):
    def __init__(
        self,
        demo: str = None,
    ):
        # id
        self.demo = demo

    def validate(self):
        self.validate_required(self.demo, 'demo')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.demo is not None:
            result['demo'] = self.demo
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('demo') is not None:
            self.demo = m.get('demo')
        return self


class FaceImage(TeaModel):
    def __init__(
        self,
        content: str = None,
        rect: str = None,
    ):
        # 1123
        self.content = content
        # 123
        self.rect = rect

    def validate(self):
        self.validate_required(self.rect, 'rect')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content is not None:
            result['content'] = self.content
        if self.rect is not None:
            result['rect'] = self.rect
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('rect') is not None:
            self.rect = m.get('rect')
        return self


class ResultListDemo(TeaModel):
    def __init__(
        self,
        code: AbcDemoStruct = None,
        data: AbcDemoStruct = None,
        message: AbcDemoStruct = None,
    ):
        # 返回结果码
        self.code = code
        # 返回结果
        self.data = data
        # 返回信息
        self.message = message

    def validate(self):
        self.validate_required(self.code, 'code')
        if self.code:
            self.code.validate()
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()
        self.validate_required(self.message, 'message')
        if self.message:
            self.message.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code.to_map()
        if self.data is not None:
            result['data'] = self.data.to_map()
        if self.message is not None:
            result['message'] = self.message.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            temp_model = AbcDemoStruct()
            self.code = temp_model.from_map(m['code'])
        if m.get('data') is not None:
            temp_model = AbcDemoStruct()
            self.data = temp_model.from_map(m['data'])
        if m.get('message') is not None:
            temp_model = AbcDemoStruct()
            self.message = temp_model.from_map(m['message'])
        return self


class NameAndAge(TeaModel):
    def __init__(
        self,
        name: str = None,
        age: int = None,
    ):
        # 姓名
        self.name = name
        # 年龄
        self.age = age

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.age is not None:
            result['age'] = self.age
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('age') is not None:
            self.age = m.get('age')
        return self


class GongXiangnengli(TeaModel):
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


class InitParks(TeaModel):
    def __init__(
        self,
        time: str = None,
        operator: str = None,
        count: int = None,
    ):
        # 返回接收到请求的当前时间
        self.time = time
        # 操作人
        self.operator = operator
        # 请求编号
        self.count = count

    def validate(self):
        self.validate_required(self.time, 'time')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.count, 'count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.time is not None:
            result['time'] = self.time
        if self.operator is not None:
            result['operator'] = self.operator
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class InitPark(TeaModel):
    def __init__(
        self,
        demo: str = None,
    ):
        # 1
        self.demo = demo

    def validate(self):
        self.validate_required(self.demo, 'demo')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.demo is not None:
            result['demo'] = self.demo
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('demo') is not None:
            self.demo = m.get('demo')
        return self


class InitPack(TeaModel):
    def __init__(
        self,
        time: str = None,
        operate: str = None,
        count: int = None,
    ):
        # 请求时间
        self.time = time
        # 请求人
        self.operate = operate
        # 编号
        self.count = count

    def validate(self):
        self.validate_required(self.time, 'time')
        if self.time is not None:
            self.validate_pattern(self.time, 'time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.operate, 'operate')
        self.validate_required(self.count, 'count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.time is not None:
            result['time'] = self.time
        if self.operate is not None:
            result['operate'] = self.operate
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('operate') is not None:
            self.operate = m.get('operate')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class TestPark(TeaModel):
    def __init__(
        self,
        time: str = None,
        operator: str = None,
        count: int = None,
    ):
        # 请求时间
        self.time = time
        # 请求人
        self.operator = operator
        # 请求编号
        self.count = count

    def validate(self):
        self.validate_required(self.time, 'time')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.count, 'count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.time is not None:
            result['time'] = self.time
        if self.operator is not None:
            result['operator'] = self.operator
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('count') is not None:
            self.count = m.get('count')
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


class PreviewDemoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        input_string: str = None,
        input_number: int = None,
        input_boolean: bool = None,
        input_date: str = None,
        input_string_list: List[str] = None,
        input_struct: AbcDemoStruct = None,
        input_struct_list: List[AbcDemoStruct] = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 字符串入参
        self.input_string = input_string
        # Long型入参
        self.input_number = input_number
        # 布尔型入参
        self.input_boolean = input_boolean
        # ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
        self.input_date = input_date
        # 字符串列表入参
        self.input_string_list = input_string_list
        # 示例结构体入参
        self.input_struct = input_struct
        # 结构体数组入参
        self.input_struct_list = input_struct_list
        # 123
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.input_string, 'input_string')
        if self.input_string is not None:
            self.validate_max_length(self.input_string, 'input_string', 1000)
        self.validate_required(self.input_boolean, 'input_boolean')
        if self.input_date is not None:
            self.validate_pattern(self.input_date, 'input_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.input_struct, 'input_struct')
        if self.input_struct:
            self.input_struct.validate()
        self.validate_required(self.input_struct_list, 'input_struct_list')
        if self.input_struct_list:
            for k in self.input_struct_list:
                if k:
                    k.validate()
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
        if self.input_string is not None:
            result['input_string'] = self.input_string
        if self.input_number is not None:
            result['input_number'] = self.input_number
        if self.input_boolean is not None:
            result['input_boolean'] = self.input_boolean
        if self.input_date is not None:
            result['input_date'] = self.input_date
        if self.input_string_list is not None:
            result['input_string_list'] = self.input_string_list
        if self.input_struct is not None:
            result['input_struct'] = self.input_struct.to_map()
        result['input_struct_list'] = []
        if self.input_struct_list is not None:
            for k in self.input_struct_list:
                result['input_struct_list'].append(k.to_map() if k else None)
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
        if m.get('input_string') is not None:
            self.input_string = m.get('input_string')
        if m.get('input_number') is not None:
            self.input_number = m.get('input_number')
        if m.get('input_boolean') is not None:
            self.input_boolean = m.get('input_boolean')
        if m.get('input_date') is not None:
            self.input_date = m.get('input_date')
        if m.get('input_string_list') is not None:
            self.input_string_list = m.get('input_string_list')
        if m.get('input_struct') is not None:
            temp_model = AbcDemoStruct()
            self.input_struct = temp_model.from_map(m['input_struct'])
        self.input_struct_list = []
        if m.get('input_struct_list') is not None:
            for k in m.get('input_struct_list'):
                temp_model = AbcDemoStruct()
                self.input_struct_list.append(temp_model.from_map(k))
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class PreviewDemoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        output_string: str = None,
        output_number: int = None,
        output_boolean: bool = None,
        output_date: str = None,
        output_string_list: List[str] = None,
        output_struct: AbcDemoStruct = None,
        output_struct_list: List[AbcDemoStruct] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 字符串回参
        self.output_string = output_string
        # Long型回参
        self.output_number = output_number
        # 布尔型回参
        self.output_boolean = output_boolean
        # ISO8602格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
        self.output_date = output_date
        # 字符串数组
        self.output_string_list = output_string_list
        # 结构体回参
        self.output_struct = output_struct
        # 结构体列表回参
        self.output_struct_list = output_struct_list

    def validate(self):
        if self.output_date is not None:
            self.validate_pattern(self.output_date, 'output_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.output_struct:
            self.output_struct.validate()
        if self.output_struct_list:
            for k in self.output_struct_list:
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
        if self.output_string is not None:
            result['output_string'] = self.output_string
        if self.output_number is not None:
            result['output_number'] = self.output_number
        if self.output_boolean is not None:
            result['output_boolean'] = self.output_boolean
        if self.output_date is not None:
            result['output_date'] = self.output_date
        if self.output_string_list is not None:
            result['output_string_list'] = self.output_string_list
        if self.output_struct is not None:
            result['output_struct'] = self.output_struct.to_map()
        result['output_struct_list'] = []
        if self.output_struct_list is not None:
            for k in self.output_struct_list:
                result['output_struct_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('output_string') is not None:
            self.output_string = m.get('output_string')
        if m.get('output_number') is not None:
            self.output_number = m.get('output_number')
        if m.get('output_boolean') is not None:
            self.output_boolean = m.get('output_boolean')
        if m.get('output_date') is not None:
            self.output_date = m.get('output_date')
        if m.get('output_string_list') is not None:
            self.output_string_list = m.get('output_string_list')
        if m.get('output_struct') is not None:
            temp_model = AbcDemoStruct()
            self.output_struct = temp_model.from_map(m['output_struct'])
        self.output_struct_list = []
        if m.get('output_struct_list') is not None:
            for k in m.get('output_struct_list'):
                temp_model = AbcDemoStruct()
                self.output_struct_list.append(temp_model.from_map(k))
        return self


class QueryGatewayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data: str = None,
        param: AbcDemoStruct = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询输入
        # 
        self.data = data
        # 结构体参数
        self.param = param

    def validate(self):
        self.validate_required(self.data, 'data')
        self.validate_required(self.param, 'param')
        if self.param:
            self.param.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data is not None:
            result['data'] = self.data
        if self.param is not None:
            result['param'] = self.param.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('param') is not None:
            temp_model = AbcDemoStruct()
            self.param = temp_model.from_map(m['param'])
        return self


class QueryGatewayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        query_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回查询
        self.query_result = query_result

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
        if self.query_result is not None:
            result['query_result'] = self.query_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('query_result') is not None:
            self.query_result = m.get('query_result')
        return self


class QueryAbcdaAbcddaaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class QueryAbcdaAbcddaaResponse(TeaModel):
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


class MatchSecurityFaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        face_1: FaceImage = None,
        face_2: FaceImage = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.biz_id = biz_id
        # 123
        self.face_1 = face_1
        # 123
        self.face_2 = face_2

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        if self.face_1:
            self.face_1.validate()
        if self.face_2:
            self.face_2.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.face_1 is not None:
            result['face1'] = self.face_1.to_map()
        if self.face_2 is not None:
            result['face2'] = self.face_2.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('face1') is not None:
            temp_model = FaceImage()
            self.face_1 = temp_model.from_map(m['face1'])
        if m.get('face2') is not None:
            temp_model = FaceImage()
            self.face_2 = temp_model.from_map(m['face2'])
        return self


class MatchSecurityFaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        transaction_id: str = None,
        same_person: str = None,
        score: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 123
        self.transaction_id = transaction_id
        # 123
        self.same_person = same_person
        # 123
        self.score = score

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
        if self.transaction_id is not None:
            result['transaction_id'] = self.transaction_id
        if self.same_person is not None:
            result['same_person'] = self.same_person
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('transaction_id') is not None:
            self.transaction_id = m.get('transaction_id')
        if m.get('same_person') is not None:
            self.same_person = m.get('same_person')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class UploadTestFileRequest(TeaModel):
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
        # 123
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


class UploadTestFileResponse(TeaModel):
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


class QueryTimeOneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间
        self.timeout = timeout

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
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class QueryTimeOneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # OK
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class QueryTimeTwoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 下游超时时间
        self.timeout = timeout

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
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class QueryTimeTwoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # OK
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class QueryTimeThreeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 下游超时时间
        self.timeout = timeout

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
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class QueryTimeThreeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # OK
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class QueryTimeFourRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间
        self.timeout = timeout

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
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class QueryTimeFourResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # OK
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class QueryTimeFiveRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 下游超时时间
        self.timeout = timeout

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
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class QueryTimeFiveResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # OK
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class CreateapiExistingProductsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        exec_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 计算值输入
        self.exec_num = exec_num

    def validate(self):
        self.validate_required(self.exec_num, 'exec_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.exec_num is not None:
            result['exec_num'] = self.exec_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('exec_num') is not None:
            self.exec_num = m.get('exec_num')
        return self


class CreateapiExistingProductsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        exec_num_echo: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 计算值返回
        self.exec_num_echo = exec_num_echo

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
        if self.exec_num_echo is not None:
            result['exec_num_echo'] = self.exec_num_echo
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('exec_num_echo') is not None:
            self.exec_num_echo = m.get('exec_num_echo')
        return self


class APreCreateApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        time: str = None,
        operator: str = None,
        count: int = None,
        origin_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求时间
        self.time = time
        # 请求发起人
        self.operator = operator
        # 请求编号
        self.count = count
        # 原始信息
        self.origin_info = origin_info

    def validate(self):
        self.validate_required(self.time, 'time')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.count, 'count')
        self.validate_required(self.origin_info, 'origin_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.time is not None:
            result['time'] = self.time
        if self.operator is not None:
            result['operator'] = self.operator
        if self.count is not None:
            result['count'] = self.count
        if self.origin_info is not None:
            result['origin_info'] = self.origin_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('origin_info') is not None:
            self.origin_info = m.get('origin_info')
        return self


class APreCreateApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        upd_info: str = None,
        upd_park: InitParks = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 跟新后的info
        self.upd_info = upd_info
        # 组合返回请求结果
        self.upd_park = upd_park

    def validate(self):
        if self.upd_park:
            self.upd_park.validate()

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
        if self.upd_info is not None:
            result['upd_info'] = self.upd_info
        if self.upd_park is not None:
            result['upd_park'] = self.upd_park.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('upd_info') is not None:
            self.upd_info = m.get('upd_info')
        if m.get('upd_park') is not None:
            temp_model = InitParks()
            self.upd_park = temp_model.from_map(m['upd_park'])
        return self


class ApiTestCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 1
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class ApiTestCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求返回描述
        self.status = status
        # msg
        self.msg = msg

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
        if self.status is not None:
            result['status'] = self.status
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class QueryApprovalTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        input: str = None,
        delete: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 入参
        self.input = input
        # 新增字段
        self.delete = delete

    def validate(self):
        self.validate_required(self.input, 'input')
        self.validate_required(self.delete, 'delete')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.input is not None:
            result['input'] = self.input
        if self.delete is not None:
            result['delete'] = self.delete
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('input') is not None:
            self.input = m.get('input')
        if m.get('delete') is not None:
            self.delete = m.get('delete')
        return self


class QueryApprovalTestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        code: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 回参
        self.msg = msg
        # 新增字段
        self.code = code

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
        if self.msg is not None:
            result['msg'] = self.msg
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class QueryOneLimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class QueryOneLimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # 状态码描述
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class ImportOneLimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class ImportOneLimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # 状态描述
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class StabilizeOneLimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class StabilizeOneLimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # 状态描述
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class UnstabilizeOneLimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class UnstabilizeOneLimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        stauts: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码描述
        self.msg = msg
        # 状态码
        self.stauts = stauts

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
        if self.msg is not None:
            result['msg'] = self.msg
        if self.stauts is not None:
            result['stauts'] = self.stauts
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        return self


class QueryGongxiangTesttestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        character_1: str = None,
        character_2: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 验证
        self.character_1 = character_1
        # 用于验证
        self.character_2 = character_2

    def validate(self):
        self.validate_required(self.character_1, 'character_1')
        self.validate_required(self.character_2, 'character_2')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.character_1 is not None:
            result['character1'] = self.character_1
        if self.character_2 is not None:
            result['character2'] = self.character_2
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('character1') is not None:
            self.character_1 = m.get('character1')
        if m.get('character2') is not None:
            self.character_2 = m.get('character2')
        return self


class QueryGongxiangTesttestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        character_1: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 回参
        self.character_1 = character_1

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
        if self.character_1 is not None:
            result['character1'] = self.character_1
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('character1') is not None:
            self.character_1 = m.get('character1')
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


