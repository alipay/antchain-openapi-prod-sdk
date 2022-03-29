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


class ListItem(TeaModel):
    def __init__(
        self,
        type: str = None,
        struct_name: str = None,
        example: str = None,
        maximum: int = None,
        exclusive_maximum: bool = None,
        minimum: int = None,
        exclusive_minimum: bool = None,
        max_length: int = None,
        min_length: int = None,
        pattern: str = None,
        max_items: int = None,
        min_items: int = None,
        enum_values: str = None,
    ):
        # 参数类型
        self.type = type
        # 结构体名称
        self.struct_name = struct_name
        # 参数示例
        self.example = example
        # 整数最大值
        self.maximum = maximum
        # 是否包括最大值
        self.exclusive_maximum = exclusive_maximum
        # 最小值
        self.minimum = minimum
        # 是否包括最小值
        self.exclusive_minimum = exclusive_minimum
        # 最大长度
        self.max_length = max_length
        # 最小长度
        self.min_length = min_length
        # 模式
        self.pattern = pattern
        # 最大元素个数
        self.max_items = max_items
        # 最小元素数目
        self.min_items = min_items
        # 枚举类型
        self.enum_values = enum_values

    def validate(self):
        self.validate_required(self.type, 'type')

    def to_map(self):
        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.struct_name is not None:
            result['struct_name'] = self.struct_name
        if self.example is not None:
            result['example'] = self.example
        if self.maximum is not None:
            result['maximum'] = self.maximum
        if self.exclusive_maximum is not None:
            result['exclusive_maximum'] = self.exclusive_maximum
        if self.minimum is not None:
            result['minimum'] = self.minimum
        if self.exclusive_minimum is not None:
            result['exclusive_minimum'] = self.exclusive_minimum
        if self.max_length is not None:
            result['max_length'] = self.max_length
        if self.min_length is not None:
            result['min_length'] = self.min_length
        if self.pattern is not None:
            result['pattern'] = self.pattern
        if self.max_items is not None:
            result['max_items'] = self.max_items
        if self.min_items is not None:
            result['min_items'] = self.min_items
        if self.enum_values is not None:
            result['enum_values'] = self.enum_values
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('struct_name') is not None:
            self.struct_name = m.get('struct_name')
        if m.get('example') is not None:
            self.example = m.get('example')
        if m.get('maximum') is not None:
            self.maximum = m.get('maximum')
        if m.get('exclusive_maximum') is not None:
            self.exclusive_maximum = m.get('exclusive_maximum')
        if m.get('minimum') is not None:
            self.minimum = m.get('minimum')
        if m.get('exclusive_minimum') is not None:
            self.exclusive_minimum = m.get('exclusive_minimum')
        if m.get('max_length') is not None:
            self.max_length = m.get('max_length')
        if m.get('min_length') is not None:
            self.min_length = m.get('min_length')
        if m.get('pattern') is not None:
            self.pattern = m.get('pattern')
        if m.get('max_items') is not None:
            self.max_items = m.get('max_items')
        if m.get('min_items') is not None:
            self.min_items = m.get('min_items')
        if m.get('enum_values') is not None:
            self.enum_values = m.get('enum_values')
        return self


class ParamModal(TeaModel):
    def __init__(
        self,
        api_meta_id: str = None,
        api_version_id: str = None,
        list_item: List[ListItem] = None,
        field_struct_id: str = None,
        field_struct_name: str = None,
        example: str = None,
        required: bool = None,
        maximum: int = None,
        exclusive_maximum: bool = None,
        minimum: int = None,
        exclusive_minimum: bool = None,
        max_length: int = None,
        min_length: int = None,
        pattern: str = None,
        max_items: int = None,
        min_items: int = None,
        enum_values: str = None,
        name: str = None,
        type: str = None,
        description: str = None,
        feature: str = None,
    ):
        # api meta数据id
        self.api_meta_id = api_meta_id
        # api版本id
        self.api_version_id = api_version_id
        # 数组参数
        self.list_item = list_item
        # 结构体id
        self.field_struct_id = field_struct_id
        # 结构体名称
        self.field_struct_name = field_struct_name
        # 参数示例
        self.example = example
        # 是否必填
        self.required = required
        # 最大整数长度
        self.maximum = maximum
        # 是否包括最大值
        self.exclusive_maximum = exclusive_maximum
        # 整数的最小值
        self.minimum = minimum
        # 是否排除最小值
        self.exclusive_minimum = exclusive_minimum
        # 字符串的最大长度
        self.max_length = max_length
        # 字符串的最小长度
        self.min_length = min_length
        # 模式
        self.pattern = pattern
        # 最大元素数目
        self.max_items = max_items
        # 最小元素数目
        self.min_items = min_items
        # 枚举值
        self.enum_values = enum_values
        # 参数名称
        self.name = name
        # 参数类型
        self.type = type
        # 参数描述
        self.description = description
        # 参数特性
        self.feature = feature

    def validate(self):
        self.validate_required(self.api_meta_id, 'api_meta_id')
        self.validate_required(self.api_version_id, 'api_version_id')
        if self.list_item:
            for k in self.list_item:
                if k:
                    k.validate()
        self.validate_required(self.required, 'required')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.description, 'description')
        self.validate_required(self.feature, 'feature')

    def to_map(self):
        result = dict()
        if self.api_meta_id is not None:
            result['api_meta_id'] = self.api_meta_id
        if self.api_version_id is not None:
            result['api_version_id'] = self.api_version_id
        result['list_item'] = []
        if self.list_item is not None:
            for k in self.list_item:
                result['list_item'].append(k.to_map() if k else None)
        if self.field_struct_id is not None:
            result['field_struct_id'] = self.field_struct_id
        if self.field_struct_name is not None:
            result['field_struct_name'] = self.field_struct_name
        if self.example is not None:
            result['example'] = self.example
        if self.required is not None:
            result['required'] = self.required
        if self.maximum is not None:
            result['maximum'] = self.maximum
        if self.exclusive_maximum is not None:
            result['exclusive_maximum'] = self.exclusive_maximum
        if self.minimum is not None:
            result['minimum'] = self.minimum
        if self.exclusive_minimum is not None:
            result['exclusive_minimum'] = self.exclusive_minimum
        if self.max_length is not None:
            result['max_length'] = self.max_length
        if self.min_length is not None:
            result['min_length'] = self.min_length
        if self.pattern is not None:
            result['pattern'] = self.pattern
        if self.max_items is not None:
            result['max_items'] = self.max_items
        if self.min_items is not None:
            result['min_items'] = self.min_items
        if self.enum_values is not None:
            result['enum_values'] = self.enum_values
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.description is not None:
            result['description'] = self.description
        if self.feature is not None:
            result['feature'] = self.feature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_meta_id') is not None:
            self.api_meta_id = m.get('api_meta_id')
        if m.get('api_version_id') is not None:
            self.api_version_id = m.get('api_version_id')
        self.list_item = []
        if m.get('list_item') is not None:
            for k in m.get('list_item'):
                temp_model = ListItem()
                self.list_item.append(temp_model.from_map(k))
        if m.get('field_struct_id') is not None:
            self.field_struct_id = m.get('field_struct_id')
        if m.get('field_struct_name') is not None:
            self.field_struct_name = m.get('field_struct_name')
        if m.get('example') is not None:
            self.example = m.get('example')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('maximum') is not None:
            self.maximum = m.get('maximum')
        if m.get('exclusive_maximum') is not None:
            self.exclusive_maximum = m.get('exclusive_maximum')
        if m.get('minimum') is not None:
            self.minimum = m.get('minimum')
        if m.get('exclusive_minimum') is not None:
            self.exclusive_minimum = m.get('exclusive_minimum')
        if m.get('max_length') is not None:
            self.max_length = m.get('max_length')
        if m.get('min_length') is not None:
            self.min_length = m.get('min_length')
        if m.get('pattern') is not None:
            self.pattern = m.get('pattern')
        if m.get('max_items') is not None:
            self.max_items = m.get('max_items')
        if m.get('min_items') is not None:
            self.min_items = m.get('min_items')
        if m.get('enum_values') is not None:
            self.enum_values = m.get('enum_values')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('feature') is not None:
            self.feature = m.get('feature')
        return self


class ResultCodeRequest(TeaModel):
    def __init__(
        self,
        api_version: str = None,
        api_name: str = None,
        code: str = None,
        internal_code: str = None,
        description: str = None,
        resolution: str = None,
    ):
        # api版本
        self.api_version = api_version
        # api名称
        self.api_name = api_name
        # 外部返回结果码
        self.code = code
        # 内部返回结果码
        self.internal_code = internal_code
        # 结果码描述
        self.description = description
        # 错误解决方法
        self.resolution = resolution

    def validate(self):
        self.validate_required(self.api_version, 'api_version')
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.code, 'code')
        self.validate_required(self.internal_code, 'internal_code')

    def to_map(self):
        result = dict()
        if self.api_version is not None:
            result['api_version'] = self.api_version
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.code is not None:
            result['code'] = self.code
        if self.internal_code is not None:
            result['internal_code'] = self.internal_code
        if self.description is not None:
            result['description'] = self.description
        if self.resolution is not None:
            result['resolution'] = self.resolution
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_version') is not None:
            self.api_version = m.get('api_version')
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('internal_code') is not None:
            self.internal_code = m.get('internal_code')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('resolution') is not None:
            self.resolution = m.get('resolution')
        return self


class ApiParamRequest(TeaModel):
    def __init__(
        self,
        api_name: str = None,
        api_version: str = None,
        name: str = None,
        target_name: str = None,
        type: str = None,
        list_item: List[ListItem] = None,
        example: str = None,
        description: str = None,
        struct_name: str = None,
        maximum: int = None,
        minimum: int = None,
        max_length: int = None,
        min_length: int = None,
        required: bool = None,
        feature: str = None,
    ):
        # api名称
        self.api_name = api_name
        # api版本
        self.api_version = api_version
        # 参数名称
        self.name = name
        # 目标名称
        self.target_name = target_name
        # 参数类型
        self.type = type
        # 链表信息
        self.list_item = list_item
        # 参数示例
        self.example = example
        # 参数描述
        self.description = description
        # 结构体名称
        self.struct_name = struct_name
        # 最大值
        self.maximum = maximum
        # 最小值
        self.minimum = minimum
        # 最大长度
        self.max_length = max_length
        # 最小长度
        self.min_length = min_length
        # 是否必填
        self.required = required
        # 特性
        self.feature = feature

    def validate(self):
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.api_version, 'api_version')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        if self.list_item:
            for k in self.list_item:
                if k:
                    k.validate()
        self.validate_required(self.required, 'required')
        self.validate_required(self.feature, 'feature')

    def to_map(self):
        result = dict()
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.api_version is not None:
            result['api_version'] = self.api_version
        if self.name is not None:
            result['name'] = self.name
        if self.target_name is not None:
            result['target_name'] = self.target_name
        if self.type is not None:
            result['type'] = self.type
        result['list_item'] = []
        if self.list_item is not None:
            for k in self.list_item:
                result['list_item'].append(k.to_map() if k else None)
        if self.example is not None:
            result['example'] = self.example
        if self.description is not None:
            result['description'] = self.description
        if self.struct_name is not None:
            result['struct_name'] = self.struct_name
        if self.maximum is not None:
            result['maximum'] = self.maximum
        if self.minimum is not None:
            result['minimum'] = self.minimum
        if self.max_length is not None:
            result['max_length'] = self.max_length
        if self.min_length is not None:
            result['min_length'] = self.min_length
        if self.required is not None:
            result['required'] = self.required
        if self.feature is not None:
            result['feature'] = self.feature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('api_version') is not None:
            self.api_version = m.get('api_version')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('target_name') is not None:
            self.target_name = m.get('target_name')
        if m.get('type') is not None:
            self.type = m.get('type')
        self.list_item = []
        if m.get('list_item') is not None:
            for k in m.get('list_item'):
                temp_model = ListItem()
                self.list_item.append(temp_model.from_map(k))
        if m.get('example') is not None:
            self.example = m.get('example')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('struct_name') is not None:
            self.struct_name = m.get('struct_name')
        if m.get('maximum') is not None:
            self.maximum = m.get('maximum')
        if m.get('minimum') is not None:
            self.minimum = m.get('minimum')
        if m.get('max_length') is not None:
            self.max_length = m.get('max_length')
        if m.get('min_length') is not None:
            self.min_length = m.get('min_length')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('feature') is not None:
            self.feature = m.get('feature')
        return self


class ApiParamInfo(TeaModel):
    def __init__(
        self,
        name: str = None,
        type: str = None,
        example: str = None,
        description: str = None,
        struct_name: str = None,
        maximum: int = None,
        minimum: int = None,
        max_length: int = None,
        min_length: bool = None,
        file_transfer: bool = None,
        required: bool = None,
    ):
        # api名字
        self.name = name
        # api类型
        self.type = type
        # 示例
        self.example = example
        # api描述
        self.description = description
        # 结构体名称
        self.struct_name = struct_name
        # 最大数字
        self.maximum = maximum
        # 最小数字
        self.minimum = minimum
        # 字符串最大长度
        self.max_length = max_length
        # 最小长度
        self.min_length = min_length
        # 是否支持传输文件
        self.file_transfer = file_transfer
        # 是否为必填字段
        self.required = required

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.example, 'example')
        self.validate_required(self.description, 'description')
        self.validate_required(self.struct_name, 'struct_name')
        self.validate_required(self.maximum, 'maximum')
        self.validate_required(self.minimum, 'minimum')
        self.validate_required(self.max_length, 'max_length')
        self.validate_required(self.min_length, 'min_length')
        self.validate_required(self.file_transfer, 'file_transfer')
        self.validate_required(self.required, 'required')

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.example is not None:
            result['example'] = self.example
        if self.description is not None:
            result['description'] = self.description
        if self.struct_name is not None:
            result['struct_name'] = self.struct_name
        if self.maximum is not None:
            result['maximum'] = self.maximum
        if self.minimum is not None:
            result['minimum'] = self.minimum
        if self.max_length is not None:
            result['max_length'] = self.max_length
        if self.min_length is not None:
            result['min_length'] = self.min_length
        if self.file_transfer is not None:
            result['file_transfer'] = self.file_transfer
        if self.required is not None:
            result['required'] = self.required
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('example') is not None:
            self.example = m.get('example')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('struct_name') is not None:
            self.struct_name = m.get('struct_name')
        if m.get('maximum') is not None:
            self.maximum = m.get('maximum')
        if m.get('minimum') is not None:
            self.minimum = m.get('minimum')
        if m.get('max_length') is not None:
            self.max_length = m.get('max_length')
        if m.get('min_length') is not None:
            self.min_length = m.get('min_length')
        if m.get('file_transfer') is not None:
            self.file_transfer = m.get('file_transfer')
        if m.get('required') is not None:
            self.required = m.get('required')
        return self


class ApiResultCodeInfo(TeaModel):
    def __init__(
        self,
        internal_code: str = None,
        code: str = None,
        description: str = None,
        resolution: str = None,
    ):
        # 返回结果码
        self.internal_code = internal_code
        # 外部结果码
        self.code = code
        # 返回结果描述
        self.description = description
        # 返回结果码解决方案
        self.resolution = resolution

    def validate(self):
        self.validate_required(self.internal_code, 'internal_code')
        self.validate_required(self.code, 'code')
        self.validate_required(self.description, 'description')
        self.validate_required(self.resolution, 'resolution')

    def to_map(self):
        result = dict()
        if self.internal_code is not None:
            result['internal_code'] = self.internal_code
        if self.code is not None:
            result['code'] = self.code
        if self.description is not None:
            result['description'] = self.description
        if self.resolution is not None:
            result['resolution'] = self.resolution
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('internal_code') is not None:
            self.internal_code = m.get('internal_code')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('resolution') is not None:
            self.resolution = m.get('resolution')
        return self


class KeyValuePair(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')

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


class ApiGroupTypeEnum(TeaModel):
    def __init__(
        self,
        code: str = None,
        ddescription: str = None,
    ):
        # API分组类型
        self.code = code
        # api分组描述
        self.ddescription = ddescription

    def validate(self):
        self.validate_required(self.code, 'code')

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.ddescription is not None:
            result['ddescription'] = self.ddescription
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('ddescription') is not None:
            self.ddescription = m.get('ddescription')
        return self


class StatusEnum(TeaModel):
    def __init__(
        self,
        code: str = None,
        description: str = None,
    ):
        # api状态码
        self.code = code
        # api状态码描述
        self.description = description

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.description, 'description')

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class ResultCode(TeaModel):
    def __init__(
        self,
        api_meta_id: str = None,
        api_version_id: str = None,
        internal_code: str = None,
        code: str = None,
        description: str = None,
        resolution: str = None,
    ):
        # meta数据id
        self.api_meta_id = api_meta_id
        # api版本id
        self.api_version_id = api_version_id
        # 结果码
        self.internal_code = internal_code
        # 外部结果码
        self.code = code
        # 返回结果描述
        self.description = description
        # 解决错误办法
        self.resolution = resolution

    def validate(self):
        self.validate_required(self.api_meta_id, 'api_meta_id')
        self.validate_required(self.api_version_id, 'api_version_id')
        self.validate_required(self.internal_code, 'internal_code')
        self.validate_required(self.code, 'code')
        self.validate_required(self.description, 'description')
        self.validate_required(self.resolution, 'resolution')

    def to_map(self):
        result = dict()
        if self.api_meta_id is not None:
            result['api_meta_id'] = self.api_meta_id
        if self.api_version_id is not None:
            result['api_version_id'] = self.api_version_id
        if self.internal_code is not None:
            result['internal_code'] = self.internal_code
        if self.code is not None:
            result['code'] = self.code
        if self.description is not None:
            result['description'] = self.description
        if self.resolution is not None:
            result['resolution'] = self.resolution
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_meta_id') is not None:
            self.api_meta_id = m.get('api_meta_id')
        if m.get('api_version_id') is not None:
            self.api_version_id = m.get('api_version_id')
        if m.get('internal_code') is not None:
            self.internal_code = m.get('internal_code')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('resolution') is not None:
            self.resolution = m.get('resolution')
        return self


class ApiGroup(TeaModel):
    def __init__(
        self,
        name: str = None,
        description: str = None,
        type: ApiGroupTypeEnum = None,
        provider_id: str = None,
        api_suite_id: str = None,
    ):
        # 分组名称
        self.name = name
        # 分组描述
        self.description = description
        # api类型
        self.type = type
        # 产品
        self.provider_id = provider_id
        # 套件id
        self.api_suite_id = api_suite_id

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.type, 'type')
        if self.type:
            self.type.validate()
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.api_suite_id, 'api_suite_id')

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.type is not None:
            result['type'] = self.type.to_map()
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.api_suite_id is not None:
            result['api_suite_id'] = self.api_suite_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('type') is not None:
            temp_model = ApiGroupTypeEnum()
            self.type = temp_model.from_map(m['type'])
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('api_suite_id') is not None:
            self.api_suite_id = m.get('api_suite_id')
        return self


class ApiMetaRequest(TeaModel):
    def __init__(
        self,
        provider_name: str = None,
        suite_version: str = None,
        group_name: str = None,
        name: str = None,
        new_name: str = None,
        owner: str = None,
        summary: str = None,
        internal: bool = None,
        api_version: str = None,
        description: str = None,
        third_part_auth: bool = None,
        status_enum: StatusEnum = None,
        ext_attribute: str = None,
    ):
        # 产品码
        self.provider_name = provider_name
        # 套件版本号
        self.suite_version = suite_version
        # api分组名称
        self.group_name = group_name
        # api名称
        self.name = name
        # 新名字
        self.new_name = new_name
        # api拥有者
        self.owner = owner
        # api简介
        self.summary = summary
        # 是否是内部api
        self.internal = internal
        # api版本
        self.api_version = api_version
        # api描述
        self.description = description
        # 是否是第三方代理
        self.third_part_auth = third_part_auth
        # api状态
        self.status_enum = status_enum
        # 扩展参数
        self.ext_attribute = ext_attribute

    def validate(self):
        self.validate_required(self.provider_name, 'provider_name')
        self.validate_required(self.suite_version, 'suite_version')
        self.validate_required(self.group_name, 'group_name')
        self.validate_required(self.name, 'name')
        self.validate_required(self.owner, 'owner')
        self.validate_required(self.summary, 'summary')
        self.validate_required(self.internal, 'internal')
        self.validate_required(self.api_version, 'api_version')
        self.validate_required(self.status_enum, 'status_enum')
        if self.status_enum:
            self.status_enum.validate()

    def to_map(self):
        result = dict()
        if self.provider_name is not None:
            result['provider_name'] = self.provider_name
        if self.suite_version is not None:
            result['suite_version'] = self.suite_version
        if self.group_name is not None:
            result['group_name'] = self.group_name
        if self.name is not None:
            result['name'] = self.name
        if self.new_name is not None:
            result['new_name'] = self.new_name
        if self.owner is not None:
            result['owner'] = self.owner
        if self.summary is not None:
            result['summary'] = self.summary
        if self.internal is not None:
            result['internal'] = self.internal
        if self.api_version is not None:
            result['api_version'] = self.api_version
        if self.description is not None:
            result['description'] = self.description
        if self.third_part_auth is not None:
            result['third_part_auth'] = self.third_part_auth
        if self.status_enum is not None:
            result['status_enum'] = self.status_enum.to_map()
        if self.ext_attribute is not None:
            result['ext_attribute'] = self.ext_attribute
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('provider_name') is not None:
            self.provider_name = m.get('provider_name')
        if m.get('suite_version') is not None:
            self.suite_version = m.get('suite_version')
        if m.get('group_name') is not None:
            self.group_name = m.get('group_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('new_name') is not None:
            self.new_name = m.get('new_name')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('summary') is not None:
            self.summary = m.get('summary')
        if m.get('internal') is not None:
            self.internal = m.get('internal')
        if m.get('api_version') is not None:
            self.api_version = m.get('api_version')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('third_part_auth') is not None:
            self.third_part_auth = m.get('third_part_auth')
        if m.get('status_enum') is not None:
            temp_model = StatusEnum()
            self.status_enum = temp_model.from_map(m['status_enum'])
        if m.get('ext_attribute') is not None:
            self.ext_attribute = m.get('ext_attribute')
        return self


class ImportApiParamsRequest(TeaModel):
    def __init__(
        self,
        request_params: List[ApiParamRequest] = None,
        response_params: List[ApiParamRequest] = None,
        result_codes: List[ResultCodeRequest] = None,
        api_name: str = None,
        api_version: str = None,
    ):
        # 请求参数
        self.request_params = request_params
        # 响应参数
        self.response_params = response_params
        # 返回结果码
        self.result_codes = result_codes
        # api名称
        self.api_name = api_name
        # api版本
        self.api_version = api_version

    def validate(self):
        if self.request_params:
            for k in self.request_params:
                if k:
                    k.validate()
        if self.response_params:
            for k in self.response_params:
                if k:
                    k.validate()
        if self.result_codes:
            for k in self.result_codes:
                if k:
                    k.validate()
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.api_version, 'api_version')

    def to_map(self):
        result = dict()
        result['request_params'] = []
        if self.request_params is not None:
            for k in self.request_params:
                result['request_params'].append(k.to_map() if k else None)
        result['response_params'] = []
        if self.response_params is not None:
            for k in self.response_params:
                result['response_params'].append(k.to_map() if k else None)
        result['result_codes'] = []
        if self.result_codes is not None:
            for k in self.result_codes:
                result['result_codes'].append(k.to_map() if k else None)
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.api_version is not None:
            result['api_version'] = self.api_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.request_params = []
        if m.get('request_params') is not None:
            for k in m.get('request_params'):
                temp_model = ApiParamRequest()
                self.request_params.append(temp_model.from_map(k))
        self.response_params = []
        if m.get('response_params') is not None:
            for k in m.get('response_params'):
                temp_model = ApiParamRequest()
                self.response_params.append(temp_model.from_map(k))
        self.result_codes = []
        if m.get('result_codes') is not None:
            for k in m.get('result_codes'):
                temp_model = ResultCodeRequest()
                self.result_codes.append(temp_model.from_map(k))
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('api_version') is not None:
            self.api_version = m.get('api_version')
        return self


class ApiFrontendInfo(TeaModel):
    def __init__(
        self,
        file_transfer: bool = None,
        request_path_params: List[str] = None,
        request_uri_with_path_params: str = None,
        request_params: ApiParamInfo = None,
    ):
        # 是否有数据传输
        self.file_transfer = file_transfer
        # api参数
        self.request_path_params = request_path_params
        # Rest请求的URI，并带有路径参数
        self.request_uri_with_path_params = request_uri_with_path_params
        # api参数
        self.request_params = request_params

    def validate(self):
        self.validate_required(self.file_transfer, 'file_transfer')
        self.validate_required(self.request_path_params, 'request_path_params')
        self.validate_required(self.request_uri_with_path_params, 'request_uri_with_path_params')
        self.validate_required(self.request_params, 'request_params')
        if self.request_params:
            self.request_params.validate()

    def to_map(self):
        result = dict()
        if self.file_transfer is not None:
            result['file_transfer'] = self.file_transfer
        if self.request_path_params is not None:
            result['request_path_params'] = self.request_path_params
        if self.request_uri_with_path_params is not None:
            result['request_uri_with_path_params'] = self.request_uri_with_path_params
        if self.request_params is not None:
            result['request_params'] = self.request_params.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_transfer') is not None:
            self.file_transfer = m.get('file_transfer')
        if m.get('request_path_params') is not None:
            self.request_path_params = m.get('request_path_params')
        if m.get('request_uri_with_path_params') is not None:
            self.request_uri_with_path_params = m.get('request_uri_with_path_params')
        if m.get('request_params') is not None:
            temp_model = ApiParamInfo()
            self.request_params = temp_model.from_map(m['request_params'])
        return self


class ApiSuite(TeaModel):
    def __init__(
        self,
        provider_id: str = None,
        version: str = None,
        released: bool = None,
        version_alias: str = None,
    ):
        # 产品码
        self.provider_id = provider_id
        # 套件版本
        self.version = version
        # 是否发布
        self.released = released
        # 版本号
        self.version_alias = version_alias

    def validate(self):
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.version, 'version')
        self.validate_required(self.released, 'released')
        self.validate_required(self.version_alias, 'version_alias')

    def to_map(self):
        result = dict()
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.version is not None:
            result['version'] = self.version
        if self.released is not None:
            result['released'] = self.released
        if self.version_alias is not None:
            result['version_alias'] = self.version_alias
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('released') is not None:
            self.released = m.get('released')
        if m.get('version_alias') is not None:
            self.version_alias = m.get('version_alias')
        return self


class ApiBackendInfo(TeaModel):
    def __init__(
        self,
        dispatch_type: str = None,
        unique_id: str = None,
        test_url: str = None,
        path: str = None,
        skip_auth: bool = None,
        timeout: int = None,
        response_params: List[ApiParamInfo] = None,
        result_codes: List[ApiResultCodeInfo] = None,
    ):
        # 调用方法
        self.dispatch_type = dispatch_type
        # TR转发的uniqueid
        self.unique_id = unique_id
        # TR转发的url
        self.test_url = test_url
        # TR转发的路径
        self.path = path
        # 是否跳过鉴权
        self.skip_auth = skip_auth
        # 后端转发超时时间
        self.timeout = timeout
        # 后端返回参数
        self.response_params = response_params
        # 返回结果码
        self.result_codes = result_codes

    def validate(self):
        self.validate_required(self.dispatch_type, 'dispatch_type')
        self.validate_required(self.timeout, 'timeout')
        self.validate_required(self.response_params, 'response_params')
        if self.response_params:
            for k in self.response_params:
                if k:
                    k.validate()
        self.validate_required(self.result_codes, 'result_codes')
        if self.result_codes:
            for k in self.result_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.dispatch_type is not None:
            result['dispatch_type'] = self.dispatch_type
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.test_url is not None:
            result['test_url'] = self.test_url
        if self.path is not None:
            result['path'] = self.path
        if self.skip_auth is not None:
            result['skip_auth'] = self.skip_auth
        if self.timeout is not None:
            result['timeout'] = self.timeout
        result['response_params'] = []
        if self.response_params is not None:
            for k in self.response_params:
                result['response_params'].append(k.to_map() if k else None)
        result['result_codes'] = []
        if self.result_codes is not None:
            for k in self.result_codes:
                result['result_codes'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('dispatch_type') is not None:
            self.dispatch_type = m.get('dispatch_type')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('test_url') is not None:
            self.test_url = m.get('test_url')
        if m.get('path') is not None:
            self.path = m.get('path')
        if m.get('skip_auth') is not None:
            self.skip_auth = m.get('skip_auth')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        self.response_params = []
        if m.get('response_params') is not None:
            for k in m.get('response_params'):
                temp_model = ApiParamInfo()
                self.response_params.append(temp_model.from_map(k))
        self.result_codes = []
        if m.get('result_codes') is not None:
            for k in m.get('result_codes'):
                temp_model = ApiResultCodeInfo()
                self.result_codes.append(temp_model.from_map(k))
        return self


class ApiVersionRequest(TeaModel):
    def __init__(
        self,
        provider_name: str = None,
        suite_version: str = None,
        api_name: str = None,
        name: str = None,
        description: str = None,
        dispatch_type: str = None,
        uniqu_id: str = None,
        test_url: str = None,
        path: str = None,
        status: StatusEnum = None,
        timeout: int = None,
        request_uri_pattern: str = None,
        request_path_params: str = None,
        request_method: str = None,
        feature: str = None,
    ):
        # 产品名称
        self.provider_name = provider_name
        # 套件版本
        self.suite_version = suite_version
        # API名称
        self.api_name = api_name
        # api版本名称
        self.name = name
        # api版本描述
        self.description = description
        # api转发方式
        self.dispatch_type = dispatch_type
        # unique id
        self.uniqu_id = uniqu_id
        # 测试url
        self.test_url = test_url
        # 转发路径
        self.path = path
        # api状态
        self.status = status
        # 1000
        self.timeout = timeout
        # 请求uri模式
        self.request_uri_pattern = request_uri_pattern
        # 请求路径参数
        self.request_path_params = request_path_params
        # 方法名称
        self.request_method = request_method
        # 支持特性
        self.feature = feature

    def validate(self):
        self.validate_required(self.provider_name, 'provider_name')
        self.validate_required(self.suite_version, 'suite_version')
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.dispatch_type, 'dispatch_type')
        self.validate_required(self.uniqu_id, 'uniqu_id')
        self.validate_required(self.status, 'status')
        if self.status:
            self.status.validate()
        self.validate_required(self.timeout, 'timeout')
        self.validate_required(self.request_method, 'request_method')

    def to_map(self):
        result = dict()
        if self.provider_name is not None:
            result['provider_name'] = self.provider_name
        if self.suite_version is not None:
            result['suite_version'] = self.suite_version
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.dispatch_type is not None:
            result['dispatch_type'] = self.dispatch_type
        if self.uniqu_id is not None:
            result['uniqu_id'] = self.uniqu_id
        if self.test_url is not None:
            result['test_url'] = self.test_url
        if self.path is not None:
            result['path'] = self.path
        if self.status is not None:
            result['status'] = self.status.to_map()
        if self.timeout is not None:
            result['timeout'] = self.timeout
        if self.request_uri_pattern is not None:
            result['request_uri_pattern'] = self.request_uri_pattern
        if self.request_path_params is not None:
            result['request_path_params'] = self.request_path_params
        if self.request_method is not None:
            result['request_method'] = self.request_method
        if self.feature is not None:
            result['feature'] = self.feature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('provider_name') is not None:
            self.provider_name = m.get('provider_name')
        if m.get('suite_version') is not None:
            self.suite_version = m.get('suite_version')
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('dispatch_type') is not None:
            self.dispatch_type = m.get('dispatch_type')
        if m.get('uniqu_id') is not None:
            self.uniqu_id = m.get('uniqu_id')
        if m.get('test_url') is not None:
            self.test_url = m.get('test_url')
        if m.get('path') is not None:
            self.path = m.get('path')
        if m.get('status') is not None:
            temp_model = StatusEnum()
            self.status = temp_model.from_map(m['status'])
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        if m.get('request_uri_pattern') is not None:
            self.request_uri_pattern = m.get('request_uri_pattern')
        if m.get('request_path_params') is not None:
            self.request_path_params = m.get('request_path_params')
        if m.get('request_method') is not None:
            self.request_method = m.get('request_method')
        if m.get('feature') is not None:
            self.feature = m.get('feature')
        return self


class ApiVersion(TeaModel):
    def __init__(
        self,
        name: str = None,
        description: str = None,
        api_meta_id: str = None,
        status: str = None,
        request_params: List[ParamModal] = None,
        response_params: List[ParamModal] = None,
        request_uri_pattern: str = None,
        request_path_params: str = None,
        request_method: str = None,
        request_path_values: List[KeyValuePair] = None,
        dispatch_type: str = None,
        dispatch_context: str = None,
        feature: str = None,
    ):
        # 版本名称
        self.name = name
        # api版本描述
        self.description = description
        # apimeta数据id
        self.api_meta_id = api_meta_id
        # api状态
        self.status = status
        # api请求参数
        self.request_params = request_params
        # api响应参数
        self.response_params = response_params
        # api uri模式
        self.request_uri_pattern = request_uri_pattern
        # 请求参数路径
        self.request_path_params = request_path_params
        # 请求方法
        self.request_method = request_method
        # 具体API请求时，解析出来的路径参数与其对应的值
        # eg. /sofa/mq/msgtype/{id}，如果实际请求为/sofa/mq/msgtype/1，那么返回的map就是 id => 1
        self.request_path_values = request_path_values
        # 请求分发方法
        self.dispatch_type = dispatch_type
        # 分发内容
        self.dispatch_context = dispatch_context
        # 接口特性
        self.feature = feature

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.api_meta_id, 'api_meta_id')
        self.validate_required(self.status, 'status')
        if self.request_params:
            for k in self.request_params:
                if k:
                    k.validate()
        self.validate_required(self.response_params, 'response_params')
        if self.response_params:
            for k in self.response_params:
                if k:
                    k.validate()
        self.validate_required(self.request_method, 'request_method')
        self.validate_required(self.request_path_values, 'request_path_values')
        if self.request_path_values:
            for k in self.request_path_values:
                if k:
                    k.validate()
        self.validate_required(self.dispatch_type, 'dispatch_type')

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.api_meta_id is not None:
            result['api_meta_id'] = self.api_meta_id
        if self.status is not None:
            result['status'] = self.status
        result['request_params'] = []
        if self.request_params is not None:
            for k in self.request_params:
                result['request_params'].append(k.to_map() if k else None)
        result['response_params'] = []
        if self.response_params is not None:
            for k in self.response_params:
                result['response_params'].append(k.to_map() if k else None)
        if self.request_uri_pattern is not None:
            result['request_uri_pattern'] = self.request_uri_pattern
        if self.request_path_params is not None:
            result['request_path_params'] = self.request_path_params
        if self.request_method is not None:
            result['request_method'] = self.request_method
        result['request_path_values'] = []
        if self.request_path_values is not None:
            for k in self.request_path_values:
                result['request_path_values'].append(k.to_map() if k else None)
        if self.dispatch_type is not None:
            result['dispatch_type'] = self.dispatch_type
        if self.dispatch_context is not None:
            result['dispatch_context'] = self.dispatch_context
        if self.feature is not None:
            result['feature'] = self.feature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('api_meta_id') is not None:
            self.api_meta_id = m.get('api_meta_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.request_params = []
        if m.get('request_params') is not None:
            for k in m.get('request_params'):
                temp_model = ParamModal()
                self.request_params.append(temp_model.from_map(k))
        self.response_params = []
        if m.get('response_params') is not None:
            for k in m.get('response_params'):
                temp_model = ParamModal()
                self.response_params.append(temp_model.from_map(k))
        if m.get('request_uri_pattern') is not None:
            self.request_uri_pattern = m.get('request_uri_pattern')
        if m.get('request_path_params') is not None:
            self.request_path_params = m.get('request_path_params')
        if m.get('request_method') is not None:
            self.request_method = m.get('request_method')
        self.request_path_values = []
        if m.get('request_path_values') is not None:
            for k in m.get('request_path_values'):
                temp_model = KeyValuePair()
                self.request_path_values.append(temp_model.from_map(k))
        if m.get('dispatch_type') is not None:
            self.dispatch_type = m.get('dispatch_type')
        if m.get('dispatch_context') is not None:
            self.dispatch_context = m.get('dispatch_context')
        if m.get('feature') is not None:
            self.feature = m.get('feature')
        return self


class ApiMeta(TeaModel):
    def __init__(
        self,
        name: str = None,
        summary: str = None,
        owner: str = None,
        activation_disabled: bool = None,
        internal: bool = None,
        default_unique_id: str = None,
        default_http_path: str = None,
        allowed_user_type: str = None,
        third_party_auth: bool = None,
        action_name: str = None,
        role_name: str = None,
        description: str = None,
        status: str = None,
        provider_id: str = None,
        group_id: str = None,
        api_suite_id: str = None,
        ext_attribute: str = None,
    ):
        # api名字
        self.name = name
        # api简介
        self.summary = summary
        # api负责人
        self.owner = owner
        # 为true时，不签约的情况下也可以调用
        self.activation_disabled = activation_disabled
        # 是否对外展示
        self.internal = internal
        # unique_id
        self.default_unique_id = default_unique_id
        # 调用路径
        self.default_http_path = default_http_path
        # 允许使用的用户类型
        self.allowed_user_type = allowed_user_type
        # 是否是第三方授权
        self.third_party_auth = third_party_auth
        # 动作名称
        self.action_name = action_name
        # 角色名称
        self.role_name = role_name
        # api描述
        self.description = description
        # api状态
        self.status = status
        # 产品码
        self.provider_id = provider_id
        # 分组id
        self.group_id = group_id
        # 套件id
        self.api_suite_id = api_suite_id
        # 扩展参数
        self.ext_attribute = ext_attribute

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.summary, 'summary')
        self.validate_required(self.owner, 'owner')
        self.validate_required(self.activation_disabled, 'activation_disabled')
        self.validate_required(self.internal, 'internal')
        self.validate_required(self.third_party_auth, 'third_party_auth')
        self.validate_required(self.action_name, 'action_name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.status, 'status')
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.group_id, 'group_id')
        self.validate_required(self.api_suite_id, 'api_suite_id')

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.summary is not None:
            result['summary'] = self.summary
        if self.owner is not None:
            result['owner'] = self.owner
        if self.activation_disabled is not None:
            result['activation_disabled'] = self.activation_disabled
        if self.internal is not None:
            result['internal'] = self.internal
        if self.default_unique_id is not None:
            result['default_unique_id'] = self.default_unique_id
        if self.default_http_path is not None:
            result['default_http_path'] = self.default_http_path
        if self.allowed_user_type is not None:
            result['allowed_user_type'] = self.allowed_user_type
        if self.third_party_auth is not None:
            result['third_party_auth'] = self.third_party_auth
        if self.action_name is not None:
            result['action_name'] = self.action_name
        if self.role_name is not None:
            result['role_name'] = self.role_name
        if self.description is not None:
            result['description'] = self.description
        if self.status is not None:
            result['status'] = self.status
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.group_id is not None:
            result['group_id'] = self.group_id
        if self.api_suite_id is not None:
            result['api_suite_id'] = self.api_suite_id
        if self.ext_attribute is not None:
            result['ext_attribute'] = self.ext_attribute
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('summary') is not None:
            self.summary = m.get('summary')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('activation_disabled') is not None:
            self.activation_disabled = m.get('activation_disabled')
        if m.get('internal') is not None:
            self.internal = m.get('internal')
        if m.get('default_unique_id') is not None:
            self.default_unique_id = m.get('default_unique_id')
        if m.get('default_http_path') is not None:
            self.default_http_path = m.get('default_http_path')
        if m.get('allowed_user_type') is not None:
            self.allowed_user_type = m.get('allowed_user_type')
        if m.get('third_party_auth') is not None:
            self.third_party_auth = m.get('third_party_auth')
        if m.get('action_name') is not None:
            self.action_name = m.get('action_name')
        if m.get('role_name') is not None:
            self.role_name = m.get('role_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        if m.get('api_suite_id') is not None:
            self.api_suite_id = m.get('api_suite_id')
        if m.get('ext_attribute') is not None:
            self.ext_attribute = m.get('ext_attribute')
        return self


class ChannelApi(TeaModel):
    def __init__(
        self,
        channel_name: str = None,
        product_code: str = None,
        service_code: str = None,
        api_name: str = None,
        api_version: str = None,
        auth_type: str = None,
        auth_expression: str = None,
        inner_provider_name: str = None,
        inner_api_name: str = None,
        inner_api_version: str = None,
    ):
        # 渠道名称
        self.channel_name = channel_name
        # 外部产品码
        self.product_code = product_code
        # 外部服务码
        self.service_code = service_code
        # 外部API名称
        self.api_name = api_name
        # 外部API版本
        self.api_version = api_version
        # 鉴权模式
        self.auth_type = auth_type
        # 鉴权资源表达式
        self.auth_expression = auth_expression
        # 内部产品码
        self.inner_provider_name = inner_provider_name
        # 内部API名称
        self.inner_api_name = inner_api_name
        # 内部API版本
        self.inner_api_version = inner_api_version

    def validate(self):
        self.validate_required(self.channel_name, 'channel_name')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.api_version, 'api_version')
        self.validate_required(self.inner_provider_name, 'inner_provider_name')

    def to_map(self):
        result = dict()
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.api_version is not None:
            result['api_version'] = self.api_version
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.auth_expression is not None:
            result['auth_expression'] = self.auth_expression
        if self.inner_provider_name is not None:
            result['inner_provider_name'] = self.inner_provider_name
        if self.inner_api_name is not None:
            result['inner_api_name'] = self.inner_api_name
        if self.inner_api_version is not None:
            result['inner_api_version'] = self.inner_api_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('api_version') is not None:
            self.api_version = m.get('api_version')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('auth_expression') is not None:
            self.auth_expression = m.get('auth_expression')
        if m.get('inner_provider_name') is not None:
            self.inner_provider_name = m.get('inner_provider_name')
        if m.get('inner_api_name') is not None:
            self.inner_api_name = m.get('inner_api_name')
        if m.get('inner_api_version') is not None:
            self.inner_api_version = m.get('inner_api_version')
        return self


class ApiPair(TeaModel):
    def __init__(
        self,
        name: str = None,
        version: str = None,
    ):
        # api名称
        self.name = name
        # api版本
        self.version = version

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.version, 'version')

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class QueryApiserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        provider: str = None,
        suite: str = None,
        api_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.provider = provider
        # 套件
        self.suite = suite
        # api名字
        self.api_name = api_name

    def validate(self):
        self.validate_required(self.provider, 'provider')
        self.validate_required(self.suite, 'suite')
        self.validate_required(self.api_name, 'api_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.provider is not None:
            result['provider'] = self.provider
        if self.suite is not None:
            result['suite'] = self.suite
        if self.api_name is not None:
            result['api_name'] = self.api_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('suite') is not None:
            self.suite = m.get('suite')
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        return self


class QueryApiserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        api_suite: ApiSuite = None,
        api_meta: ApiMeta = None,
        api_version: ApiVersion = None,
        api_group: ApiGroup = None,
        request_params: List[ParamModal] = None,
        response_params: List[ParamModal] = None,
        result_codes: List[ResultCode] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 套件信息
        self.api_suite = api_suite
        # api基本信息
        self.api_meta = api_meta
        # api版本数据
        self.api_version = api_version
        # api分组信息
        self.api_group = api_group
        # api请求参数
        self.request_params = request_params
        # api返回参数
        self.response_params = response_params
        # 结果码
        self.result_codes = result_codes

    def validate(self):
        if self.api_suite:
            self.api_suite.validate()
        if self.api_meta:
            self.api_meta.validate()
        if self.api_version:
            self.api_version.validate()
        if self.api_group:
            self.api_group.validate()
        if self.request_params:
            for k in self.request_params:
                if k:
                    k.validate()
        if self.response_params:
            for k in self.response_params:
                if k:
                    k.validate()
        if self.result_codes:
            for k in self.result_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.api_suite is not None:
            result['api_suite'] = self.api_suite.to_map()
        if self.api_meta is not None:
            result['api_meta'] = self.api_meta.to_map()
        if self.api_version is not None:
            result['api_version'] = self.api_version.to_map()
        if self.api_group is not None:
            result['api_group'] = self.api_group.to_map()
        result['request_params'] = []
        if self.request_params is not None:
            for k in self.request_params:
                result['request_params'].append(k.to_map() if k else None)
        result['response_params'] = []
        if self.response_params is not None:
            for k in self.response_params:
                result['response_params'].append(k.to_map() if k else None)
        result['result_codes'] = []
        if self.result_codes is not None:
            for k in self.result_codes:
                result['result_codes'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('api_suite') is not None:
            temp_model = ApiSuite()
            self.api_suite = temp_model.from_map(m['api_suite'])
        if m.get('api_meta') is not None:
            temp_model = ApiMeta()
            self.api_meta = temp_model.from_map(m['api_meta'])
        if m.get('api_version') is not None:
            temp_model = ApiVersion()
            self.api_version = temp_model.from_map(m['api_version'])
        if m.get('api_group') is not None:
            temp_model = ApiGroup()
            self.api_group = temp_model.from_map(m['api_group'])
        self.request_params = []
        if m.get('request_params') is not None:
            for k in m.get('request_params'):
                temp_model = ParamModal()
                self.request_params.append(temp_model.from_map(k))
        self.response_params = []
        if m.get('response_params') is not None:
            for k in m.get('response_params'):
                temp_model = ParamModal()
                self.response_params.append(temp_model.from_map(k))
        self.result_codes = []
        if m.get('result_codes') is not None:
            for k in m.get('result_codes'):
                temp_model = ResultCode()
                self.result_codes.append(temp_model.from_map(k))
        return self


class ImportApiserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_meta_request: ApiMetaRequest = None,
        api_version_request: ApiVersionRequest = None,
        import_api_params_request: ImportApiParamsRequest = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # api基本信息
        self.api_meta_request = api_meta_request
        # api版本
        self.api_version_request = api_version_request
        # api请求参数
        self.import_api_params_request = import_api_params_request

    def validate(self):
        self.validate_required(self.api_meta_request, 'api_meta_request')
        if self.api_meta_request:
            self.api_meta_request.validate()
        self.validate_required(self.api_version_request, 'api_version_request')
        if self.api_version_request:
            self.api_version_request.validate()
        if self.import_api_params_request:
            self.import_api_params_request.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.api_meta_request is not None:
            result['api_meta_request'] = self.api_meta_request.to_map()
        if self.api_version_request is not None:
            result['api_version_request'] = self.api_version_request.to_map()
        if self.import_api_params_request is not None:
            result['import_api_params_request'] = self.import_api_params_request.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_meta_request') is not None:
            temp_model = ApiMetaRequest()
            self.api_meta_request = temp_model.from_map(m['api_meta_request'])
        if m.get('api_version_request') is not None:
            temp_model = ApiVersionRequest()
            self.api_version_request = temp_model.from_map(m['api_version_request'])
        if m.get('import_api_params_request') is not None:
            temp_model = ImportApiParamsRequest()
            self.import_api_params_request = temp_model.from_map(m['import_api_params_request'])
        return self


class ImportApiserviceResponse(TeaModel):
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


class CreateApiserviceProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        prod_code: str = None,
        type: str = None,
        name: str = None,
        chinese_name: str = None,
        prod_version: str = None,
        primary_owner_id: str = None,
        description: str = None,
        provider_type: str = None,
        api_name_prefix: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.prod_code = prod_code
        # 产品类型
        self.type = type
        # 产品英文名
        self.name = name
        # 产品中文名
        self.chinese_name = chinese_name
        # 产品版本
        self.prod_version = prod_version
        # 产品所有者
        self.primary_owner_id = primary_owner_id
        # 产品描述
        self.description = description
        # api提供方类型
        self.provider_type = provider_type
        # 产品前缀
        self.api_name_prefix = api_name_prefix

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.chinese_name, 'chinese_name')
        self.validate_required(self.primary_owner_id, 'primary_owner_id')
        self.validate_required(self.description, 'description')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        if self.chinese_name is not None:
            result['chinese_name'] = self.chinese_name
        if self.prod_version is not None:
            result['prod_version'] = self.prod_version
        if self.primary_owner_id is not None:
            result['primary_owner_id'] = self.primary_owner_id
        if self.description is not None:
            result['description'] = self.description
        if self.provider_type is not None:
            result['provider_type'] = self.provider_type
        if self.api_name_prefix is not None:
            result['api_name_prefix'] = self.api_name_prefix
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('chinese_name') is not None:
            self.chinese_name = m.get('chinese_name')
        if m.get('prod_version') is not None:
            self.prod_version = m.get('prod_version')
        if m.get('primary_owner_id') is not None:
            self.primary_owner_id = m.get('primary_owner_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('provider_type') is not None:
            self.provider_type = m.get('provider_type')
        if m.get('api_name_prefix') is not None:
            self.api_name_prefix = m.get('api_name_prefix')
        return self


class CreateApiserviceProductResponse(TeaModel):
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


class CreateApiserviceGroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        provider_name: str = None,
        suite_version: str = None,
        description: str = None,
        group_name: str = None,
        api_group_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 所属产品
        self.provider_name = provider_name
        # 套件版本
        self.suite_version = suite_version
        # 分组描述
        self.description = description
        # 分组名称
        self.group_name = group_name
        # 分组类型
        self.api_group_type = api_group_type

    def validate(self):
        self.validate_required(self.provider_name, 'provider_name')
        self.validate_required(self.suite_version, 'suite_version')
        self.validate_required(self.description, 'description')
        self.validate_required(self.group_name, 'group_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.provider_name is not None:
            result['provider_name'] = self.provider_name
        if self.suite_version is not None:
            result['suite_version'] = self.suite_version
        if self.description is not None:
            result['description'] = self.description
        if self.group_name is not None:
            result['group_name'] = self.group_name
        if self.api_group_type is not None:
            result['api_group_type'] = self.api_group_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('provider_name') is not None:
            self.provider_name = m.get('provider_name')
        if m.get('suite_version') is not None:
            self.suite_version = m.get('suite_version')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('group_name') is not None:
            self.group_name = m.get('group_name')
        if m.get('api_group_type') is not None:
            self.api_group_type = m.get('api_group_type')
        return self


class CreateApiserviceGroupResponse(TeaModel):
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


class CreateApiserviceSuiteRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        suite_version: str = None,
        provider_name: str = None,
        released: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 默认为1.0.0
        self.suite_version = suite_version
        # 所属产品名
        self.provider_name = provider_name
        # 是否已经发布
        self.released = released

    def validate(self):
        self.validate_required(self.provider_name, 'provider_name')
        self.validate_required(self.released, 'released')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.suite_version is not None:
            result['suite_version'] = self.suite_version
        if self.provider_name is not None:
            result['provider_name'] = self.provider_name
        if self.released is not None:
            result['released'] = self.released
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('suite_version') is not None:
            self.suite_version = m.get('suite_version')
        if m.get('provider_name') is not None:
            self.provider_name = m.get('provider_name')
        if m.get('released') is not None:
            self.released = m.get('released')
        return self


class CreateApiserviceSuiteResponse(TeaModel):
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


class ImportSpecRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # API数据描述，XML文件内容
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


class ImportSpecResponse(TeaModel):
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


class ExportSpecRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        prod_code: str = None,
        apis: List[ApiPair] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.prod_code = prod_code
        # api列表
        self.apis = apis

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        if self.apis:
            for k in self.apis:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        result['apis'] = []
        if self.apis is not None:
            for k in self.apis:
                result['apis'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        self.apis = []
        if m.get('apis') is not None:
            for k in m.get('apis'):
                temp_model = ApiPair()
                self.apis.append(temp_model.from_map(k))
        return self


class ExportSpecResponse(TeaModel):
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
        # spec内容
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


class GetProviderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        prod_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.prod_code = prod_code

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        return self


class GetProviderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        api_name_prefix: str = None,
        description: str = None,
        developer_center_display: bool = None,
        name: str = None,
        name_alias: str = None,
        organization: str = None,
        provider_type: str = None,
        status: str = None,
        summary: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # API前缀
        self.api_name_prefix = api_name_prefix
        # 描述
        self.description = description
        # 是否在开发者中心展示
        self.developer_center_display = developer_center_display
        # Proivder名称，等同于产品码
        self.name = name
        # 产品别名
        self.name_alias = name_alias
        # 组织机构
        self.organization = organization
        # 产品类型
        self.provider_type = provider_type
        # 产品状态
        self.status = status
        # 产品简介
        self.summary = summary

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
        if self.api_name_prefix is not None:
            result['api_name_prefix'] = self.api_name_prefix
        if self.description is not None:
            result['description'] = self.description
        if self.developer_center_display is not None:
            result['developer_center_display'] = self.developer_center_display
        if self.name is not None:
            result['name'] = self.name
        if self.name_alias is not None:
            result['name_alias'] = self.name_alias
        if self.organization is not None:
            result['organization'] = self.organization
        if self.provider_type is not None:
            result['provider_type'] = self.provider_type
        if self.status is not None:
            result['status'] = self.status
        if self.summary is not None:
            result['summary'] = self.summary
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('api_name_prefix') is not None:
            self.api_name_prefix = m.get('api_name_prefix')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('developer_center_display') is not None:
            self.developer_center_display = m.get('developer_center_display')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('name_alias') is not None:
            self.name_alias = m.get('name_alias')
        if m.get('organization') is not None:
            self.organization = m.get('organization')
        if m.get('provider_type') is not None:
            self.provider_type = m.get('provider_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('summary') is not None:
            self.summary = m.get('summary')
        return self


class ImportChannelapiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_list: List[ChannelApi] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 渠道API列表
        self.api_list = api_list

    def validate(self):
        self.validate_required(self.api_list, 'api_list')
        if self.api_list:
            for k in self.api_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        result['api_list'] = []
        if self.api_list is not None:
            for k in self.api_list:
                result['api_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        self.api_list = []
        if m.get('api_list') is not None:
            for k in m.get('api_list'):
                temp_model = ChannelApi()
                self.api_list.append(temp_model.from_map(k))
        return self


class ImportChannelapiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        failure_list: List[ChannelApi] = None,
        failure_num: int = None,
        success_num: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 失败列表
        self.failure_list = failure_list
        # 失败数量
        self.failure_num = failure_num
        # 成功数量
        self.success_num = success_num

    def validate(self):
        if self.failure_list:
            for k in self.failure_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['failure_list'] = []
        if self.failure_list is not None:
            for k in self.failure_list:
                result['failure_list'].append(k.to_map() if k else None)
        if self.failure_num is not None:
            result['failure_num'] = self.failure_num
        if self.success_num is not None:
            result['success_num'] = self.success_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.failure_list = []
        if m.get('failure_list') is not None:
            for k in m.get('failure_list'):
                temp_model = ChannelApi()
                self.failure_list.append(temp_model.from_map(k))
        if m.get('failure_num') is not None:
            self.failure_num = m.get('failure_num')
        if m.get('success_num') is not None:
            self.success_num = m.get('success_num')
        return self


class ServiceGatewayCheckRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class ServiceGatewayCheckResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 如果正常，返回OK
        self.status = status

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
        if self.status is not None:
            result['status'] = self.status
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
        return self


class ImportGatewaySpecRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # API数据描述，XML文件内容
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


class ImportGatewaySpecResponse(TeaModel):
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


class UpdateGatewayClusterhostRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product: str = None,
        cluster: str = None,
        suit_version: str = None,
        group_name: str = None,
        host: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.product = product
        # 集群名称，对应productInstanceId
        self.cluster = cluster
        # api所属套件版本
        self.suit_version = suit_version
        # api分组名称
        self.group_name = group_name
        # 后端地址
        self.host = host

    def validate(self):
        self.validate_required(self.product, 'product')
        self.validate_required(self.cluster, 'cluster')
        self.validate_required(self.suit_version, 'suit_version')
        self.validate_required(self.group_name, 'group_name')
        self.validate_required(self.host, 'host')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product is not None:
            result['product'] = self.product
        if self.cluster is not None:
            result['cluster'] = self.cluster
        if self.suit_version is not None:
            result['suit_version'] = self.suit_version
        if self.group_name is not None:
            result['group_name'] = self.group_name
        if self.host is not None:
            result['host'] = self.host
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product') is not None:
            self.product = m.get('product')
        if m.get('cluster') is not None:
            self.cluster = m.get('cluster')
        if m.get('suit_version') is not None:
            self.suit_version = m.get('suit_version')
        if m.get('group_name') is not None:
            self.group_name = m.get('group_name')
        if m.get('host') is not None:
            self.host = m.get('host')
        return self


class UpdateGatewayClusterhostResponse(TeaModel):
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


class CreateGatewayStaticrouterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        provider: str = None,
        suit_version: str = None,
        group_name: str = None,
        accesskey: str = None,
        host: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.provider = provider
        # 套件版本
        self.suit_version = suit_version
        # 分组名称
        self.group_name = group_name
        # accessKey
        self.accesskey = accesskey
        # 后端地址
        self.host = host

    def validate(self):
        self.validate_required(self.provider, 'provider')
        self.validate_required(self.suit_version, 'suit_version')
        self.validate_required(self.group_name, 'group_name')
        self.validate_required(self.accesskey, 'accesskey')
        self.validate_required(self.host, 'host')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.provider is not None:
            result['provider'] = self.provider
        if self.suit_version is not None:
            result['suit_version'] = self.suit_version
        if self.group_name is not None:
            result['group_name'] = self.group_name
        if self.accesskey is not None:
            result['accesskey'] = self.accesskey
        if self.host is not None:
            result['host'] = self.host
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('suit_version') is not None:
            self.suit_version = m.get('suit_version')
        if m.get('group_name') is not None:
            self.group_name = m.get('group_name')
        if m.get('accesskey') is not None:
            self.accesskey = m.get('accesskey')
        if m.get('host') is not None:
            self.host = m.get('host')
        return self


class CreateGatewayStaticrouterResponse(TeaModel):
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


class QueryGatewayClusterhostRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product: str = None,
        cluster: str = None,
        suit_version: str = None,
        group_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.product = product
        # 集群名称，对应productInstanceId
        self.cluster = cluster
        # api所属套件版本
        self.suit_version = suit_version
        # api分组名称
        self.group_name = group_name

    def validate(self):
        self.validate_required(self.product, 'product')
        self.validate_required(self.cluster, 'cluster')
        self.validate_required(self.suit_version, 'suit_version')
        self.validate_required(self.group_name, 'group_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product is not None:
            result['product'] = self.product
        if self.cluster is not None:
            result['cluster'] = self.cluster
        if self.suit_version is not None:
            result['suit_version'] = self.suit_version
        if self.group_name is not None:
            result['group_name'] = self.group_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product') is not None:
            self.product = m.get('product')
        if m.get('cluster') is not None:
            self.cluster = m.get('cluster')
        if m.get('suit_version') is not None:
            self.suit_version = m.get('suit_version')
        if m.get('group_name') is not None:
            self.group_name = m.get('group_name')
        return self


class QueryGatewayClusterhostResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        host: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 后端地址
        self.host = host

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
        if self.host is not None:
            result['host'] = self.host
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('host') is not None:
            self.host = m.get('host')
        return self


class ImportSdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        prod_code: str = None,
        sdk_language: str = None,
        version_of_sdk: str = None,
        dependency_detail: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.prod_code = prod_code
        # SDK语言
        self.sdk_language = sdk_language
        # 版本
        self.version_of_sdk = version_of_sdk
        # 依赖详情
        self.dependency_detail = dependency_detail

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.sdk_language, 'sdk_language')
        self.validate_required(self.version_of_sdk, 'version_of_sdk')
        self.validate_required(self.dependency_detail, 'dependency_detail')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.sdk_language is not None:
            result['sdk_language'] = self.sdk_language
        if self.version_of_sdk is not None:
            result['version_of_sdk'] = self.version_of_sdk
        if self.dependency_detail is not None:
            result['dependency_detail'] = self.dependency_detail
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('sdk_language') is not None:
            self.sdk_language = m.get('sdk_language')
        if m.get('version_of_sdk') is not None:
            self.version_of_sdk = m.get('version_of_sdk')
        if m.get('dependency_detail') is not None:
            self.dependency_detail = m.get('dependency_detail')
        return self


class ImportSdkResponse(TeaModel):
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


