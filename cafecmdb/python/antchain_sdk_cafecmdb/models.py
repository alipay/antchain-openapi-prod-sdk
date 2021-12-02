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


class MapStringToStringEntry(TeaModel):
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


class Condition(TeaModel):
    def __init__(
        self,
        field: str = None,
        operator: str = None,
        values: str = None,
    ):
        # 用于查询条件的字段
        self.field = field
        # 查询操作符
        self.operator = operator
        # 由于OP限制，此字段无法直接使用数组。请务必使用能够解析的JSON数组
        self.values = values

    def validate(self):
        self.validate_required(self.field, 'field')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.values, 'values')

    def to_map(self):
        result = dict()
        if self.field is not None:
            result['field'] = self.field
        if self.operator is not None:
            result['operator'] = self.operator
        if self.values is not None:
            result['values'] = self.values
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('field') is not None:
            self.field = m.get('field')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('values') is not None:
            self.values = m.get('values')
        return self


class AttributeGroup(TeaModel):
    def __init__(
        self,
        unique_id: str = None,
        name: str = None,
        display_name: str = None,
        display_properties: str = None,
    ):
        # id
        self.unique_id = unique_id
        # name
        self.name = name
        # display_name
        self.display_name = display_name
        # display_properties
        self.display_properties = display_properties

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.name is not None:
            result['name'] = self.name
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.display_properties is not None:
            result['display_properties'] = self.display_properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('display_properties') is not None:
            self.display_properties = m.get('display_properties')
        return self


class Attribute(TeaModel):
    def __init__(
        self,
        model_id: str = None,
        unique_id: str = None,
        name: str = None,
        description: str = None,
        type: str = None,
        system: bool = None,
        readonly: bool = None,
        required: bool = None,
        priority: int = None,
        display_properties: List[MapStringToStringEntry] = None,
        created_time: str = None,
        modified_time: str = None,
        group_id: str = None,
    ):
        # 所属模型的唯一标识
        self.model_id = model_id
        # 唯一标识（所属模型内唯一）
        self.unique_id = unique_id
        # 名称（所属模型内唯一）
        self.name = name
        # 描述
        self.description = description
        # 类型【取值范围：INTEGER，LONG，DOUBLE，FLOAT，BOOLEAN，STRING，DATE，DATETIME，ENUM，ARRAY】
        self.type = type
        # 是否为系统内置
        self.system = system
        # 是否只读
        self.readonly = readonly
        # 是否必填
        self.required = required
        # 用于前端展示排序，数字越大优先级越高，默认为 0
        self.priority = priority
        # 用于前端展示的扩展属性
        self.display_properties = display_properties
        # 创建时间
        self.created_time = created_time
        # 修改时间
        self.modified_time = modified_time
        # 字段分组Id
        self.group_id = group_id

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.system, 'system')
        self.validate_required(self.readonly, 'readonly')
        self.validate_required(self.required, 'required')
        self.validate_required(self.priority, 'priority')
        if self.display_properties:
            for k in self.display_properties:
                if k:
                    k.validate()
        self.validate_required(self.created_time, 'created_time')
        if self.created_time is not None:
            self.validate_pattern(self.created_time, 'created_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.modified_time, 'modified_time')
        if self.modified_time is not None:
            self.validate_pattern(self.modified_time, 'modified_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.group_id, 'group_id')

    def to_map(self):
        result = dict()
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.type is not None:
            result['type'] = self.type
        if self.system is not None:
            result['system'] = self.system
        if self.readonly is not None:
            result['readonly'] = self.readonly
        if self.required is not None:
            result['required'] = self.required
        if self.priority is not None:
            result['priority'] = self.priority
        result['display_properties'] = []
        if self.display_properties is not None:
            for k in self.display_properties:
                result['display_properties'].append(k.to_map() if k else None)
        if self.created_time is not None:
            result['created_time'] = self.created_time
        if self.modified_time is not None:
            result['modified_time'] = self.modified_time
        if self.group_id is not None:
            result['group_id'] = self.group_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('system') is not None:
            self.system = m.get('system')
        if m.get('readonly') is not None:
            self.readonly = m.get('readonly')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        self.display_properties = []
        if m.get('display_properties') is not None:
            for k in m.get('display_properties'):
                temp_model = MapStringToStringEntry()
                self.display_properties.append(temp_model.from_map(k))
        if m.get('created_time') is not None:
            self.created_time = m.get('created_time')
        if m.get('modified_time') is not None:
            self.modified_time = m.get('modified_time')
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        return self


class ModelCategory(TeaModel):
    def __init__(
        self,
        unique_id: str = None,
        name: str = None,
        system: bool = None,
        created_time: str = None,
        modified_time: str = None,
        icon: str = None,
    ):
        # 唯一标识（全局唯一）
        self.unique_id = unique_id
        # 名称（全局唯一）
        self.name = name
        # 是否为系统内置
        self.system = system
        # 创建时间
        self.created_time = created_time
        # 修改时间
        self.modified_time = modified_time
        # icon
        self.icon = icon

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.system, 'system')
        self.validate_required(self.created_time, 'created_time')
        if self.created_time is not None:
            self.validate_pattern(self.created_time, 'created_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.modified_time, 'modified_time')
        if self.modified_time is not None:
            self.validate_pattern(self.modified_time, 'modified_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.name is not None:
            result['name'] = self.name
        if self.system is not None:
            result['system'] = self.system
        if self.created_time is not None:
            result['created_time'] = self.created_time
        if self.modified_time is not None:
            result['modified_time'] = self.modified_time
        if self.icon is not None:
            result['icon'] = self.icon
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('system') is not None:
            self.system = m.get('system')
        if m.get('created_time') is not None:
            self.created_time = m.get('created_time')
        if m.get('modified_time') is not None:
            self.modified_time = m.get('modified_time')
        if m.get('icon') is not None:
            self.icon = m.get('icon')
        return self


class ModelRelationship(TeaModel):
    def __init__(
        self,
        destination_model_id: str = None,
        source_model_id: str = None,
        unique_id: str = None,
        description: str = None,
        relation_type: str = None,
        system: bool = None,
        created_time: str = None,
        modified_time: str = None,
    ):
        # 目标模型的唯一标识
        self.destination_model_id = destination_model_id
        # 源模型的唯一标识（目标模型内唯一）
        self.source_model_id = source_model_id
        # 唯一标识（目标模型内唯一，等同于目标模型中与源模型建立关联的外键属性）
        self.unique_id = unique_id
        # 描述
        self.description = description
        # 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
        self.relation_type = relation_type
        # 是否为系统内置
        self.system = system
        # 创建时间
        self.created_time = created_time
        # 修改时间
        self.modified_time = modified_time

    def validate(self):
        self.validate_required(self.destination_model_id, 'destination_model_id')
        self.validate_required(self.source_model_id, 'source_model_id')
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.relation_type, 'relation_type')
        self.validate_required(self.system, 'system')
        self.validate_required(self.created_time, 'created_time')
        if self.created_time is not None:
            self.validate_pattern(self.created_time, 'created_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.modified_time, 'modified_time')
        if self.modified_time is not None:
            self.validate_pattern(self.modified_time, 'modified_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.destination_model_id is not None:
            result['destination_model_id'] = self.destination_model_id
        if self.source_model_id is not None:
            result['source_model_id'] = self.source_model_id
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.description is not None:
            result['description'] = self.description
        if self.relation_type is not None:
            result['relation_type'] = self.relation_type
        if self.system is not None:
            result['system'] = self.system
        if self.created_time is not None:
            result['created_time'] = self.created_time
        if self.modified_time is not None:
            result['modified_time'] = self.modified_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('destination_model_id') is not None:
            self.destination_model_id = m.get('destination_model_id')
        if m.get('source_model_id') is not None:
            self.source_model_id = m.get('source_model_id')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('relation_type') is not None:
            self.relation_type = m.get('relation_type')
        if m.get('system') is not None:
            self.system = m.get('system')
        if m.get('created_time') is not None:
            self.created_time = m.get('created_time')
        if m.get('modified_time') is not None:
            self.modified_time = m.get('modified_time')
        return self


class AuditLog(TeaModel):
    def __init__(
        self,
        id: str = None,
        operator: str = None,
        resource_type: str = None,
        action: str = None,
        targets: List[str] = None,
        operation_time: str = None,
    ):
        # id
        self.id = id
        # 操作者
        self.operator = operator
        # 操作的对象类别
        self.resource_type = resource_type
        # 动作
        self.action = action
        # 对象的ID
        self.targets = targets
        # operation_time
        self.operation_time = operation_time

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.resource_type, 'resource_type')
        self.validate_required(self.action, 'action')
        self.validate_required(self.targets, 'targets')
        self.validate_required(self.operation_time, 'operation_time')
        if self.operation_time is not None:
            self.validate_pattern(self.operation_time, 'operation_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.operator is not None:
            result['operator'] = self.operator
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        if self.action is not None:
            result['action'] = self.action
        if self.targets is not None:
            result['targets'] = self.targets
        if self.operation_time is not None:
            result['operation_time'] = self.operation_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('targets') is not None:
            self.targets = m.get('targets')
        if m.get('operation_time') is not None:
            self.operation_time = m.get('operation_time')
        return self


class Item(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        created_time: str = None,
        modified_time: str = None,
        data_json: str = None,
    ):
        # 实例ID
        self.id = id
        # 名称
        self.name = name
        # created_time
        self.created_time = created_time
        # modified_time
        self.modified_time = modified_time
        # data_json
        self.data_json = data_json

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        if self.created_time is not None:
            self.validate_pattern(self.created_time, 'created_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.modified_time is not None:
            self.validate_pattern(self.modified_time, 'modified_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.data_json, 'data_json')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.created_time is not None:
            result['created_time'] = self.created_time
        if self.modified_time is not None:
            result['modified_time'] = self.modified_time
        if self.data_json is not None:
            result['data_json'] = self.data_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('created_time') is not None:
            self.created_time = m.get('created_time')
        if m.get('modified_time') is not None:
            self.modified_time = m.get('modified_time')
        if m.get('data_json') is not None:
            self.data_json = m.get('data_json')
        return self


class Model(TeaModel):
    def __init__(
        self,
        unique_id: str = None,
        name: str = None,
        category_id: str = None,
        description: str = None,
        system: bool = None,
        priority: int = None,
        display_properties: List[MapStringToStringEntry] = None,
        created_time: str = None,
        modified_time: str = None,
    ):
        # 唯一标识（全局唯一）
        self.unique_id = unique_id
        # 名称（全局唯一）
        self.name = name
        # 所属模型分组的唯一标识
        self.category_id = category_id
        # 描述
        self.description = description
        # 是否为系统内置
        self.system = system
        # 用于前端展示排序，数字越大优先级越高，默认为 0
        self.priority = priority
        # 用于前端展示的扩展属性
        self.display_properties = display_properties
        # 创建时间
        self.created_time = created_time
        # 修改时间
        self.modified_time = modified_time

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.category_id, 'category_id')
        self.validate_required(self.system, 'system')
        self.validate_required(self.priority, 'priority')
        if self.display_properties:
            for k in self.display_properties:
                if k:
                    k.validate()
        self.validate_required(self.created_time, 'created_time')
        if self.created_time is not None:
            self.validate_pattern(self.created_time, 'created_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.modified_time, 'modified_time')
        if self.modified_time is not None:
            self.validate_pattern(self.modified_time, 'modified_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.name is not None:
            result['name'] = self.name
        if self.category_id is not None:
            result['category_id'] = self.category_id
        if self.description is not None:
            result['description'] = self.description
        if self.system is not None:
            result['system'] = self.system
        if self.priority is not None:
            result['priority'] = self.priority
        result['display_properties'] = []
        if self.display_properties is not None:
            for k in self.display_properties:
                result['display_properties'].append(k.to_map() if k else None)
        if self.created_time is not None:
            result['created_time'] = self.created_time
        if self.modified_time is not None:
            result['modified_time'] = self.modified_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('category_id') is not None:
            self.category_id = m.get('category_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('system') is not None:
            self.system = m.get('system')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        self.display_properties = []
        if m.get('display_properties') is not None:
            for k in m.get('display_properties'):
                temp_model = MapStringToStringEntry()
                self.display_properties.append(temp_model.from_map(k))
        if m.get('created_time') is not None:
            self.created_time = m.get('created_time')
        if m.get('modified_time') is not None:
            self.modified_time = m.get('modified_time')
        return self


class SystemParam(TeaModel):
    def __init__(
        self,
        description: str = None,
        key: str = None,
        value_type: str = None,
        value_json: str = None,
        group_name: str = None,
    ):
        # description
        self.description = description
        # key
        self.key = key
        # value_type
        self.value_type = value_type
        # value_json
        self.value_json = value_json
        # group_name
        self.group_name = group_name

    def validate(self):
        self.validate_required(self.description, 'description')
        self.validate_required(self.key, 'key')
        self.validate_required(self.value_type, 'value_type')
        self.validate_required(self.value_json, 'value_json')
        self.validate_required(self.group_name, 'group_name')

    def to_map(self):
        result = dict()
        if self.description is not None:
            result['description'] = self.description
        if self.key is not None:
            result['key'] = self.key
        if self.value_type is not None:
            result['value_type'] = self.value_type
        if self.value_json is not None:
            result['value_json'] = self.value_json
        if self.group_name is not None:
            result['group_name'] = self.group_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value_type') is not None:
            self.value_type = m.get('value_type')
        if m.get('value_json') is not None:
            self.value_json = m.get('value_json')
        if m.get('group_name') is not None:
            self.group_name = m.get('group_name')
        return self


class Filter(TeaModel):
    def __init__(
        self,
        join_model_id: str = None,
        conditions: List[Condition] = None,
    ):
        # join_model_id
        self.join_model_id = join_model_id
        # conditions
        self.conditions = conditions

    def validate(self):
        self.validate_required(self.join_model_id, 'join_model_id')
        self.validate_required(self.conditions, 'conditions')
        if self.conditions:
            for k in self.conditions:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.join_model_id is not None:
            result['join_model_id'] = self.join_model_id
        result['conditions'] = []
        if self.conditions is not None:
            for k in self.conditions:
                result['conditions'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('join_model_id') is not None:
            self.join_model_id = m.get('join_model_id')
        self.conditions = []
        if m.get('conditions') is not None:
            for k in m.get('conditions'):
                temp_model = Condition()
                self.conditions.append(temp_model.from_map(k))
        return self


class QueryItemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        display_fields: List[str] = None,
        page_size: int = None,
        page_number: int = None,
        sort_fields: List[str] = None,
        conditions: List[Condition] = None,
        filter: Filter = None,
        model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # display_fields
        self.display_fields = display_fields
        # page_size
        self.page_size = page_size
        # page_number
        self.page_number = page_number
        # sort_fields
        self.sort_fields = sort_fields
        # conditions
        self.conditions = conditions
        # filter
        self.filter = filter
        # model_id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.conditions, 'conditions')
        if self.conditions:
            for k in self.conditions:
                if k:
                    k.validate()
        if self.filter:
            self.filter.validate()
        self.validate_required(self.model_id, 'model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.display_fields is not None:
            result['display_fields'] = self.display_fields
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.sort_fields is not None:
            result['sort_fields'] = self.sort_fields
        result['conditions'] = []
        if self.conditions is not None:
            for k in self.conditions:
                result['conditions'].append(k.to_map() if k else None)
        if self.filter is not None:
            result['filter'] = self.filter.to_map()
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('display_fields') is not None:
            self.display_fields = m.get('display_fields')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('sort_fields') is not None:
            self.sort_fields = m.get('sort_fields')
        self.conditions = []
        if m.get('conditions') is not None:
            for k in m.get('conditions'):
                temp_model = Condition()
                self.conditions.append(temp_model.from_map(k))
        if m.get('filter') is not None:
            temp_model = Filter()
            self.filter = temp_model.from_map(m['filter'])
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class QueryItemResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
        data: List[Item] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # total_count
        self.total_count = total_count
        # data
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = Item()
                self.data.append(temp_model.from_map(k))
        return self


class CreateItemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
        name: str = None,
        id: str = None,
        data_json: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # model_id
        self.model_id = model_id
        # name
        self.name = name
        # id
        self.id = id
        # 注意，data_json是一个MAP<String,Object>，但OP不支持MAP，，用户需要用Json序列化成字符串。不正确的格式将会报错
        self.data_json = data_json

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.id, 'id')
        self.validate_required(self.data_json, 'data_json')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.name is not None:
            result['name'] = self.name
        if self.id is not None:
            result['id'] = self.id
        if self.data_json is not None:
            result['data_json'] = self.data_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('data_json') is not None:
            self.data_json = m.get('data_json')
        return self


class CreateItemResponse(TeaModel):
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


class UpdateItemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
        model_id: str = None,
        data_json: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # id
        self.id = id
        # model_id
        self.model_id = model_id
        # 同创建的data
        self.data_json = data_json

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.data_json, 'data_json')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.data_json is not None:
            result['data_json'] = self.data_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('data_json') is not None:
            self.data_json = m.get('data_json')
        return self


class UpdateItemResponse(TeaModel):
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


class DeleteItemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
        model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # id
        self.id = id
        # model_id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.model_id, 'model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class DeleteItemResponse(TeaModel):
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


class GetItemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
        model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # id
        self.id = id
        # model_id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.model_id, 'model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class GetItemResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Item = None,
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
            temp_model = Item()
            self.data = temp_model.from_map(m['data'])
        return self


class GetModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要获取的模型的唯一标识
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class GetModelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Model = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 获取到的模型
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = Model()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryModelRequest(TeaModel):
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


class QueryModelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[Model] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询到的模型列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = Model()
                self.data.append(temp_model.from_map(k))
        return self


class CreateModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        unique_id: str = None,
        name: str = None,
        category_id: str = None,
        description: str = None,
        priority: int = None,
        display_properties: List[MapStringToStringEntry] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 唯一标识（全局唯一）
        self.unique_id = unique_id
        # 名称（全局唯一）
        self.name = name
        # 所属模型分组的唯一标识
        self.category_id = category_id
        # 描述
        self.description = description
        # 用于前端展示排序，数字越大优先级越高，默认为 0
        self.priority = priority
        # 用于前端展示的扩展属性
        self.display_properties = display_properties

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.category_id, 'category_id')
        if self.display_properties:
            for k in self.display_properties:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.name is not None:
            result['name'] = self.name
        if self.category_id is not None:
            result['category_id'] = self.category_id
        if self.description is not None:
            result['description'] = self.description
        if self.priority is not None:
            result['priority'] = self.priority
        result['display_properties'] = []
        if self.display_properties is not None:
            for k in self.display_properties:
                result['display_properties'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('category_id') is not None:
            self.category_id = m.get('category_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        self.display_properties = []
        if m.get('display_properties') is not None:
            for k in m.get('display_properties'):
                temp_model = MapStringToStringEntry()
                self.display_properties.append(temp_model.from_map(k))
        return self


class CreateModelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Model = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建出的模型
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = Model()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        unique_id: str = None,
        name: str = None,
        description: str = None,
        priority: int = None,
        display_properties: List[MapStringToStringEntry] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要更新的模型的唯一标识
        self.unique_id = unique_id
        # 名称（全局唯一）
        self.name = name
        # 描述
        self.description = description
        # 用于前端展示排序，数字越大优先级越高，默认为 0
        self.priority = priority
        # 用于前端展示的扩展属性
        self.display_properties = display_properties

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.name, 'name')
        if self.display_properties:
            for k in self.display_properties:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.priority is not None:
            result['priority'] = self.priority
        result['display_properties'] = []
        if self.display_properties is not None:
            for k in self.display_properties:
                result['display_properties'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        self.display_properties = []
        if m.get('display_properties') is not None:
            for k in m.get('display_properties'):
                temp_model = MapStringToStringEntry()
                self.display_properties.append(temp_model.from_map(k))
        return self


class UpdateModelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Model = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 更新后的模型
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = Model()
            self.data = temp_model.from_map(m['data'])
        return self


class GetModelcategoryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要获取的模型分组的唯一标识
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class GetModelcategoryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ModelCategory = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 获取到的模型分组
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = ModelCategory()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要删除的模型的唯一标识
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class DeleteModelResponse(TeaModel):
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


class QueryModelcategoryRequest(TeaModel):
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


class QueryModelcategoryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ModelCategory] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询到的模型分组列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ModelCategory()
                self.data.append(temp_model.from_map(k))
        return self


class CreateModelcategoryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        unique_id: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 唯一标识（全局唯一）
        self.unique_id = unique_id
        # 名称（全局唯一）
        self.name = name

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CreateModelcategoryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ModelCategory = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建出的模型分组
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = ModelCategory()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateModelcategoryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        unique_id: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要更新的模型分组的唯一标识
        self.unique_id = unique_id
        # 名称（全局唯一）
        self.name = name

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class UpdateModelcategoryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ModelCategory = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 更新后的模型分组
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = ModelCategory()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteModelcategoryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要删除的模型分组的唯一标识
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.unique_id, 'unique_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class DeleteModelcategoryResponse(TeaModel):
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


class GetModelAttributeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
        unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 字段所属模型的唯一标识
        self.model_id = model_id
        # 要获取的字段的唯一标识
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.unique_id, 'unique_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class GetModelAttributeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Attribute = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 获取到的字段
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = Attribute()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryModelAttributeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 所属模型的唯一标识
        self.model_id = model_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class QueryModelAttributeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[Attribute] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询到的模型字段列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = Attribute()
                self.data.append(temp_model.from_map(k))
        return self


class CreateModelAttributeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
        unique_id: str = None,
        name: str = None,
        description: str = None,
        type: str = None,
        readonly: bool = None,
        required: bool = None,
        priority: int = None,
        display_properties: List[MapStringToStringEntry] = None,
        group_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 所属模型的唯一标识
        self.model_id = model_id
        # 唯一标识（所属模型内唯一）
        self.unique_id = unique_id
        # 名称（所属模型内唯一）
        self.name = name
        # 描述
        self.description = description
        # 类型【取值范围：INTEGER，LONG，DOUBLE，FLOAT，BOOLEAN，STRING，DATE，DATETIME，ENUM，ARRAY】
        self.type = type
        # 是否只读
        self.readonly = readonly
        # 是否必填
        self.required = required
        # 用于前端展示排序，数字越大优先级越高，默认为 0
        self.priority = priority
        # 用于前端展示的扩展属性
        self.display_properties = display_properties
        # group_id
        self.group_id = group_id

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.readonly, 'readonly')
        self.validate_required(self.required, 'required')
        if self.display_properties:
            for k in self.display_properties:
                if k:
                    k.validate()
        self.validate_required(self.group_id, 'group_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.type is not None:
            result['type'] = self.type
        if self.readonly is not None:
            result['readonly'] = self.readonly
        if self.required is not None:
            result['required'] = self.required
        if self.priority is not None:
            result['priority'] = self.priority
        result['display_properties'] = []
        if self.display_properties is not None:
            for k in self.display_properties:
                result['display_properties'].append(k.to_map() if k else None)
        if self.group_id is not None:
            result['group_id'] = self.group_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('readonly') is not None:
            self.readonly = m.get('readonly')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        self.display_properties = []
        if m.get('display_properties') is not None:
            for k in m.get('display_properties'):
                temp_model = MapStringToStringEntry()
                self.display_properties.append(temp_model.from_map(k))
        if m.get('group_id') is not None:
            self.group_id = m.get('group_id')
        return self


class CreateModelAttributeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Attribute = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建出的模型字段
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = Attribute()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateModelAttributeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
        unique_id: str = None,
        name: str = None,
        description: str = None,
        readonly: bool = None,
        required: bool = None,
        priority: int = None,
        display_properties: List[MapStringToStringEntry] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要更新的模型字段所属模型的唯一标识
        self.model_id = model_id
        # 要更新的模型字段的唯一标识
        self.unique_id = unique_id
        # 名称（所属模型内唯一）
        self.name = name
        # 描述
        self.description = description
        # 是否只读
        self.readonly = readonly
        # 是否必填
        self.required = required
        # 用于前端展示排序，数字越大优先级越高，默认为 0
        self.priority = priority
        # 用于前端展示的扩展属性
        self.display_properties = display_properties

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.readonly, 'readonly')
        self.validate_required(self.required, 'required')
        if self.display_properties:
            for k in self.display_properties:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.readonly is not None:
            result['readonly'] = self.readonly
        if self.required is not None:
            result['required'] = self.required
        if self.priority is not None:
            result['priority'] = self.priority
        result['display_properties'] = []
        if self.display_properties is not None:
            for k in self.display_properties:
                result['display_properties'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('readonly') is not None:
            self.readonly = m.get('readonly')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        self.display_properties = []
        if m.get('display_properties') is not None:
            for k in m.get('display_properties'):
                temp_model = MapStringToStringEntry()
                self.display_properties.append(temp_model.from_map(k))
        return self


class UpdateModelAttributeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Attribute = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 更新后的模型字段
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = Attribute()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteModelAttributeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
        unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要删除的模型字段所属模型的唯一标识
        self.model_id = model_id
        # 要删除的模型字段的唯一标识
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.unique_id, 'unique_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class DeleteModelAttributeResponse(TeaModel):
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


class ExistItemIdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # model_id
        self.model_id = model_id
        # id
        self.id = id

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.id, 'id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class ExistItemIdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        exsit: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # exsit
        self.exsit = exsit

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
        if self.exsit is not None:
            result['exsit'] = self.exsit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('exsit') is not None:
            self.exsit = m.get('exsit')
        return self


class QueryItemRelationsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        destination_model_id: str = None,
        item_id: str = None,
        page_size: int = None,
        page_number: int = None,
        display_fields: List[str] = None,
        drill_up: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 目标模型id
        self.destination_model_id = destination_model_id
        # item_id
        self.item_id = item_id
        # 1
        self.page_size = page_size
        # page_number
        self.page_number = page_number
        # display_fields
        self.display_fields = display_fields
        # 上钻表示查询拓扑目标为自己的上级资源，反之则是查询以自己为源目标的下级资源
        self.drill_up = drill_up

    def validate(self):
        self.validate_required(self.destination_model_id, 'destination_model_id')
        self.validate_required(self.item_id, 'item_id')
        self.validate_required(self.page_number, 'page_number')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.destination_model_id is not None:
            result['destination_model_id'] = self.destination_model_id
        if self.item_id is not None:
            result['item_id'] = self.item_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.display_fields is not None:
            result['display_fields'] = self.display_fields
        if self.drill_up is not None:
            result['drill_up'] = self.drill_up
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('destination_model_id') is not None:
            self.destination_model_id = m.get('destination_model_id')
        if m.get('item_id') is not None:
            self.item_id = m.get('item_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('display_fields') is not None:
            self.display_fields = m.get('display_fields')
        if m.get('drill_up') is not None:
            self.drill_up = m.get('drill_up')
        return self


class QueryItemRelationsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[Item] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
        self.data = data
        # total_count
        self.total_count = total_count

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = Item()
                self.data.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class ImportItemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # model_id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.model_id, 'model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class ImportItemResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        succeed_count: int = None,
        failed_count: int = None,
        failed_reasons: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # succeed_count
        self.succeed_count = succeed_count
        # failed_count
        self.failed_count = failed_count
        # failed_reasons
        self.failed_reasons = failed_reasons

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
        if self.succeed_count is not None:
            result['succeed_count'] = self.succeed_count
        if self.failed_count is not None:
            result['failed_count'] = self.failed_count
        if self.failed_reasons is not None:
            result['failed_reasons'] = self.failed_reasons
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('succeed_count') is not None:
            self.succeed_count = m.get('succeed_count')
        if m.get('failed_count') is not None:
            self.failed_count = m.get('failed_count')
        if m.get('failed_reasons') is not None:
            self.failed_reasons = m.get('failed_reasons')
        return self


class ExportItemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
        display_fields: List[str] = None,
        conditions: List[Condition] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # model_id
        self.model_id = model_id
        # display_fields
        self.display_fields = display_fields
        # conditions
        self.conditions = conditions

    def validate(self):
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.display_fields, 'display_fields')
        if self.conditions:
            for k in self.conditions:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.display_fields is not None:
            result['display_fields'] = self.display_fields
        result['conditions'] = []
        if self.conditions is not None:
            for k in self.conditions:
                result['conditions'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('display_fields') is not None:
            self.display_fields = m.get('display_fields')
        self.conditions = []
        if m.get('conditions') is not None:
            for k in m.get('conditions'):
                temp_model = Condition()
                self.conditions.append(temp_model.from_map(k))
        return self


class ExportItemResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_source: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # file_source
        self.file_source = file_source

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
        if self.file_source is not None:
            result['file_source'] = self.file_source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_source') is not None:
            self.file_source = m.get('file_source')
        return self


class GetModelrelationshipRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        destination_model_id: str = None,
        source_model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要获取的模型关联的目标模型的唯一标识
        self.destination_model_id = destination_model_id
        # 要获取的模型关联的源模型的唯一标识
        self.source_model_id = source_model_id

    def validate(self):
        self.validate_required(self.destination_model_id, 'destination_model_id')
        self.validate_required(self.source_model_id, 'source_model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.destination_model_id is not None:
            result['destination_model_id'] = self.destination_model_id
        if self.source_model_id is not None:
            result['source_model_id'] = self.source_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('destination_model_id') is not None:
            self.destination_model_id = m.get('destination_model_id')
        if m.get('source_model_id') is not None:
            self.source_model_id = m.get('source_model_id')
        return self


class GetModelrelationshipResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ModelRelationship = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 获取到的模型关联
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = ModelRelationship()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryModelrelationshipRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        destination_model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 目标模型的唯一标识
        self.destination_model_id = destination_model_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.destination_model_id is not None:
            result['destination_model_id'] = self.destination_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('destination_model_id') is not None:
            self.destination_model_id = m.get('destination_model_id')
        return self


class QueryModelrelationshipResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ModelRelationship] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询到的模型关联列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ModelRelationship()
                self.data.append(temp_model.from_map(k))
        return self


class CreateModelrelationshipRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        destination_model_id: str = None,
        source_model_id: str = None,
        description: str = None,
        relation_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 目标模型的唯一标识
        self.destination_model_id = destination_model_id
        # 源模型的唯一标识（目标模型内唯一）
        self.source_model_id = source_model_id
        # 描述
        self.description = description
        # 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
        self.relation_type = relation_type

    def validate(self):
        self.validate_required(self.destination_model_id, 'destination_model_id')
        self.validate_required(self.source_model_id, 'source_model_id')
        self.validate_required(self.relation_type, 'relation_type')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.destination_model_id is not None:
            result['destination_model_id'] = self.destination_model_id
        if self.source_model_id is not None:
            result['source_model_id'] = self.source_model_id
        if self.description is not None:
            result['description'] = self.description
        if self.relation_type is not None:
            result['relation_type'] = self.relation_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('destination_model_id') is not None:
            self.destination_model_id = m.get('destination_model_id')
        if m.get('source_model_id') is not None:
            self.source_model_id = m.get('source_model_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('relation_type') is not None:
            self.relation_type = m.get('relation_type')
        return self


class CreateModelrelationshipResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ModelRelationship = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建出的模型关联
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = ModelRelationship()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateModelrelationshipRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        destination_model_id: str = None,
        source_model_id: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要更新的模型关联的目标模型的唯一标识
        self.destination_model_id = destination_model_id
        # 要更新的模型关联的源模型的唯一标识
        self.source_model_id = source_model_id
        # 描述
        self.description = description

    def validate(self):
        self.validate_required(self.destination_model_id, 'destination_model_id')
        self.validate_required(self.source_model_id, 'source_model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.destination_model_id is not None:
            result['destination_model_id'] = self.destination_model_id
        if self.source_model_id is not None:
            result['source_model_id'] = self.source_model_id
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('destination_model_id') is not None:
            self.destination_model_id = m.get('destination_model_id')
        if m.get('source_model_id') is not None:
            self.source_model_id = m.get('source_model_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class UpdateModelrelationshipResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ModelRelationship = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 更新后的模型关联
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
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
            temp_model = ModelRelationship()
            self.data = temp_model.from_map(m['data'])
        return self


class DeleteModelrelationshipRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        destination_model_id: str = None,
        source_model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要删除的模型关联的目标模型的唯一标识
        self.destination_model_id = destination_model_id
        # 要删除的模型关联的源模型的唯一标识
        self.source_model_id = source_model_id

    def validate(self):
        self.validate_required(self.destination_model_id, 'destination_model_id')
        self.validate_required(self.source_model_id, 'source_model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.destination_model_id is not None:
            result['destination_model_id'] = self.destination_model_id
        if self.source_model_id is not None:
            result['source_model_id'] = self.source_model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('destination_model_id') is not None:
            self.destination_model_id = m.get('destination_model_id')
        if m.get('source_model_id') is not None:
            self.source_model_id = m.get('source_model_id')
        return self


class DeleteModelrelationshipResponse(TeaModel):
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


class PullParamRequest(TeaModel):
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


class PullParamResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[SystemParam] = None,
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
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = SystemParam()
                self.data.append(temp_model.from_map(k))
        return self


class PushParamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        key: str = None,
        value_json: str = None,
        description: str = None,
        value_type: str = None,
        group_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 更新的键值
        self.key = key
        # 由于OP不支持MAP，需要使用json字符串
        self.value_json = value_json
        # description
        self.description = description
        # value_type
        self.value_type = value_type
        # 参数分组
        self.group_name = group_name

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value_json, 'value_json')
        self.validate_required(self.description, 'description')
        self.validate_required(self.value_type, 'value_type')
        self.validate_required(self.group_name, 'group_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.key is not None:
            result['key'] = self.key
        if self.value_json is not None:
            result['value_json'] = self.value_json
        if self.description is not None:
            result['description'] = self.description
        if self.value_type is not None:
            result['value_type'] = self.value_type
        if self.group_name is not None:
            result['group_name'] = self.group_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value_json') is not None:
            self.value_json = m.get('value_json')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('value_type') is not None:
            self.value_type = m.get('value_type')
        if m.get('group_name') is not None:
            self.group_name = m.get('group_name')
        return self


class PushParamResponse(TeaModel):
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


class CreateAttributegroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        display_name: str = None,
        model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # display_name
        self.display_name = display_name
        # model_id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.model_id, 'model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class CreateAttributegroupResponse(TeaModel):
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


class QueryAttributegroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # model_id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.model_id, 'model_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class QueryAttributegroupResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AttributeGroup] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
        self.data = data
        # total_count
        self.total_count = total_count

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AttributeGroup()
                self.data.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class DeleteAttributegroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # id
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class DeleteAttributegroupResponse(TeaModel):
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


class UpdateAttributegroupRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: str = None,
        display_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # id
        self.id = id
        # display_name
        self.display_name = display_name

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.display_name, 'display_name')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        if self.display_name is not None:
            result['display_name'] = self.display_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        return self


class UpdateAttributegroupResponse(TeaModel):
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


class QueryAuditlogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_name: str = None,
        resource_type: str = None,
        resource_ids: List[str] = None,
        begin_time: str = None,
        end_time: str = None,
        page_size: int = None,
        page_number: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作者
        self.operator_name = operator_name
        # resource_type
        self.resource_type = resource_type
        # resource_ids
        self.resource_ids = resource_ids
        # begin_time
        self.begin_time = begin_time
        # end_time
        self.end_time = end_time
        # page_size
        self.page_size = page_size
        # page_number
        self.page_number = page_number

    def validate(self):
        if self.begin_time is not None:
            self.validate_pattern(self.begin_time, 'begin_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.page_number, 'page_number')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_name is not None:
            result['operator_name'] = self.operator_name
        if self.resource_type is not None:
            result['resource_type'] = self.resource_type
        if self.resource_ids is not None:
            result['resource_ids'] = self.resource_ids
        if self.begin_time is not None:
            result['begin_time'] = self.begin_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_number is not None:
            result['page_number'] = self.page_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_name') is not None:
            self.operator_name = m.get('operator_name')
        if m.get('resource_type') is not None:
            self.resource_type = m.get('resource_type')
        if m.get('resource_ids') is not None:
            self.resource_ids = m.get('resource_ids')
        if m.get('begin_time') is not None:
            self.begin_time = m.get('begin_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        return self


class QueryAuditlogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AuditLog] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # data
        self.data = data
        # total_count
        self.total_count = total_count

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AuditLog()
                self.data.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


