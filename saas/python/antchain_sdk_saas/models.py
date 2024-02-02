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


class ApiInfoModel(TeaModel):
    def __init__(
        self,
        api_name: str = None,
        prod_code: str = None,
        internal: int = None,
        api_version: str = None,
        api_desc: str = None,
        provider_id: str = None,
    ):
        # api名称
        self.api_name = api_name
        # API所属网关技术产品码
        self.prod_code = prod_code
        # 是否是内部接口 0对外 1对内
        self.internal = internal
        # api版本号
        self.api_version = api_version
        # api描述
        self.api_desc = api_desc
        # api所属网关产品id
        self.provider_id = provider_id

    def validate(self):
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.internal, 'internal')
        self.validate_required(self.api_version, 'api_version')
        self.validate_required(self.api_desc, 'api_desc')
        self.validate_required(self.provider_id, 'provider_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.internal is not None:
            result['internal'] = self.internal
        if self.api_version is not None:
            result['api_version'] = self.api_version
        if self.api_desc is not None:
            result['api_desc'] = self.api_desc
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('internal') is not None:
            self.internal = m.get('internal')
        if m.get('api_version') is not None:
            self.api_version = m.get('api_version')
        if m.get('api_desc') is not None:
            self.api_desc = m.get('api_desc')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        return self


class ItemMatchingRule(TeaModel):
    def __init__(
        self,
        metering_matching_rule: str = None,
        metering_value: str = None,
    ):
        # 计量项匹配规则
        self.metering_matching_rule = metering_matching_rule
        # 1
        self.metering_value = metering_value

    def validate(self):
        self.validate_required(self.metering_value, 'metering_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.metering_matching_rule is not None:
            result['metering_matching_rule'] = self.metering_matching_rule
        if self.metering_value is not None:
            result['metering_value'] = self.metering_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('metering_matching_rule') is not None:
            self.metering_matching_rule = m.get('metering_matching_rule')
        if m.get('metering_value') is not None:
            self.metering_value = m.get('metering_value')
        return self


class AbilityInfo(TeaModel):
    def __init__(
        self,
        ability_id: str = None,
        ability_name: str = None,
        dev_owner: str = None,
        gmt_create: str = None,
        description: str = None,
        dev_owner_prefix_email: str = None,
        product_owner: str = None,
        business_code: str = None,
        api_info_models: List[ApiInfoModel] = None,
        sla_url: str = None,
    ):
        # 能力编号
        self.ability_id = ability_id
        # 能力名称
        self.ability_name = ability_name
        # 研发负责人
        self.dev_owner = dev_owner
        # 创建时间
        self.gmt_create = gmt_create
        # 描述信息
        self.description = description
        # 研发负责人邮箱前缀
        self.dev_owner_prefix_email = dev_owner_prefix_email
        # 产品负责人
        self.product_owner = product_owner
        # 能力对应商业中台L5Code
        self.business_code = business_code
        # apiInfoModels列表
        self.api_info_models = api_info_models
        # 能力sla看板url
        self.sla_url = sla_url

    def validate(self):
        self.validate_required(self.ability_id, 'ability_id')
        self.validate_required(self.ability_name, 'ability_name')
        self.validate_required(self.dev_owner, 'dev_owner')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.description, 'description')
        self.validate_required(self.dev_owner_prefix_email, 'dev_owner_prefix_email')
        self.validate_required(self.product_owner, 'product_owner')
        self.validate_required(self.api_info_models, 'api_info_models')
        if self.api_info_models:
            for k in self.api_info_models:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ability_id is not None:
            result['ability_id'] = self.ability_id
        if self.ability_name is not None:
            result['ability_name'] = self.ability_name
        if self.dev_owner is not None:
            result['dev_owner'] = self.dev_owner
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.description is not None:
            result['description'] = self.description
        if self.dev_owner_prefix_email is not None:
            result['dev_owner_prefix_email'] = self.dev_owner_prefix_email
        if self.product_owner is not None:
            result['product_owner'] = self.product_owner
        if self.business_code is not None:
            result['business_code'] = self.business_code
        result['api_info_models'] = []
        if self.api_info_models is not None:
            for k in self.api_info_models:
                result['api_info_models'].append(k.to_map() if k else None)
        if self.sla_url is not None:
            result['sla_url'] = self.sla_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ability_id') is not None:
            self.ability_id = m.get('ability_id')
        if m.get('ability_name') is not None:
            self.ability_name = m.get('ability_name')
        if m.get('dev_owner') is not None:
            self.dev_owner = m.get('dev_owner')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('dev_owner_prefix_email') is not None:
            self.dev_owner_prefix_email = m.get('dev_owner_prefix_email')
        if m.get('product_owner') is not None:
            self.product_owner = m.get('product_owner')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        self.api_info_models = []
        if m.get('api_info_models') is not None:
            for k in m.get('api_info_models'):
                temp_model = ApiInfoModel()
                self.api_info_models.append(temp_model.from_map(k))
        if m.get('sla_url') is not None:
            self.sla_url = m.get('sla_url')
        return self


class AbilityApiRelation(TeaModel):
    def __init__(
        self,
        api_name: str = None,
        ability_info_list: List[AbilityInfo] = None,
    ):
        # api名称
        self.api_name = api_name
        # 能力列表
        self.ability_info_list = ability_info_list

    def validate(self):
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.ability_info_list, 'ability_info_list')
        if self.ability_info_list:
            for k in self.ability_info_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.api_name is not None:
            result['api_name'] = self.api_name
        result['ability_info_list'] = []
        if self.ability_info_list is not None:
            for k in self.ability_info_list:
                result['ability_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        self.ability_info_list = []
        if m.get('ability_info_list') is not None:
            for k in m.get('ability_info_list'):
                temp_model = AbilityInfo()
                self.ability_info_list.append(temp_model.from_map(k))
        return self


class ItemRule(TeaModel):
    def __init__(
        self,
        metering_item: str = None,
        item_matching_rules: List[ItemMatchingRule] = None,
    ):
        # 上报次数
        self.metering_item = metering_item
        # 计量项列表
        self.item_matching_rules = item_matching_rules

    def validate(self):
        self.validate_required(self.metering_item, 'metering_item')
        self.validate_required(self.item_matching_rules, 'item_matching_rules')
        if self.item_matching_rules:
            for k in self.item_matching_rules:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.metering_item is not None:
            result['metering_item'] = self.metering_item
        result['item_matching_rules'] = []
        if self.item_matching_rules is not None:
            for k in self.item_matching_rules:
                result['item_matching_rules'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('metering_item') is not None:
            self.metering_item = m.get('metering_item')
        self.item_matching_rules = []
        if m.get('item_matching_rules') is not None:
            for k in m.get('item_matching_rules'):
                temp_model = ItemMatchingRule()
                self.item_matching_rules.append(temp_model.from_map(k))
        return self


class ApiInfo(TeaModel):
    def __init__(
        self,
        api_code: str = None,
        api_protobuf_definition: str = None,
    ):
        # 查询不动产接口
        self.api_code = api_code
        # api pb文件定义
        self.api_protobuf_definition = api_protobuf_definition

    def validate(self):
        self.validate_required(self.api_code, 'api_code')
        self.validate_required(self.api_protobuf_definition, 'api_protobuf_definition')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.api_code is not None:
            result['api_code'] = self.api_code
        if self.api_protobuf_definition is not None:
            result['api_protobuf_definition'] = self.api_protobuf_definition
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_code') is not None:
            self.api_code = m.get('api_code')
        if m.get('api_protobuf_definition') is not None:
            self.api_protobuf_definition = m.get('api_protobuf_definition')
        return self


class RelUser(TeaModel):
    def __init__(
        self,
        emp_id: str = None,
        login_name: str = None,
        nick_name: str = None,
        role: str = None,
    ):
        # 工号
        self.emp_id = emp_id
        # 域账号
        self.login_name = login_name
        # 花名
        self.nick_name = nick_name
        # 角色，PD-产品经理，DEV-研发
        self.role = role

    def validate(self):
        self.validate_required(self.emp_id, 'emp_id')
        self.validate_required(self.login_name, 'login_name')
        self.validate_required(self.nick_name, 'nick_name')
        self.validate_required(self.role, 'role')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.emp_id is not None:
            result['emp_id'] = self.emp_id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        if self.role is not None:
            result['role'] = self.role
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('emp_id') is not None:
            self.emp_id = m.get('emp_id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
        if m.get('role') is not None:
            self.role = m.get('role')
        return self


class MethodMatchingRule(TeaModel):
    def __init__(
        self,
        method: str = None,
        matching_rule: str = None,
    ):
        # 网关api
        self.method = method
        # 匹配规则
        self.matching_rule = matching_rule

    def validate(self):
        self.validate_required(self.method, 'method')
        self.validate_required(self.matching_rule, 'matching_rule')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.method is not None:
            result['method'] = self.method
        if self.matching_rule is not None:
            result['matching_rule'] = self.matching_rule
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('method') is not None:
            self.method = m.get('method')
        if m.get('matching_rule') is not None:
            self.matching_rule = m.get('matching_rule')
        return self


class SdkMavenDependencyInfo(TeaModel):
    def __init__(
        self,
        reference_client: str = None,
        referenc_server: str = None,
        maven_link_client: str = None,
        maven_link_server: str = None,
    ):
        # client端maven依赖，包含蚂蚁链版本和金融云版本依赖信息
        self.reference_client = reference_client
        # 客户端server端依赖，产品api基于技术产品纬度使用技术客户端sdk构建，此处依赖基本使用不到
        self.referenc_server = referenc_server
        # client端maven仓库地址
        self.maven_link_client = maven_link_client
        # server端maven仓库地址
        self.maven_link_server = maven_link_server

    def validate(self):
        self.validate_required(self.reference_client, 'reference_client')
        self.validate_required(self.maven_link_client, 'maven_link_client')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.reference_client is not None:
            result['reference_client'] = self.reference_client
        if self.referenc_server is not None:
            result['referenc_server'] = self.referenc_server
        if self.maven_link_client is not None:
            result['maven_link_client'] = self.maven_link_client
        if self.maven_link_server is not None:
            result['maven_link_server'] = self.maven_link_server
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('reference_client') is not None:
            self.reference_client = m.get('reference_client')
        if m.get('referenc_server') is not None:
            self.referenc_server = m.get('referenc_server')
        if m.get('maven_link_client') is not None:
            self.maven_link_client = m.get('maven_link_client')
        if m.get('maven_link_server') is not None:
            self.maven_link_server = m.get('maven_link_server')
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
        _map = super().to_map()
        if _map is not None:
            return _map

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


class RunMarketServiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        product_code: str = None,
        service_code: str = None,
        sub_service_code: str = None,
        service_version: str = None,
        params: List[KeyValuePair] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务方传入，幂等用。
        self.biz_id = biz_id
        # saas产品code
        self.product_code = product_code
        # 服务code
        self.service_code = service_code
        # 子服务code
        self.sub_service_code = sub_service_code
        # 服务版本
        self.service_version = service_version
        # 业务参数，map格式
        self.params = params

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.service_code, 'service_code')
        self.validate_required(self.service_version, 'service_version')
        if self.params:
            for k in self.params:
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
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.sub_service_code is not None:
            result['sub_service_code'] = self.sub_service_code
        if self.service_version is not None:
            result['service_version'] = self.service_version
        result['params'] = []
        if self.params is not None:
            for k in self.params:
                result['params'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('sub_service_code') is not None:
            self.sub_service_code = m.get('sub_service_code')
        if m.get('service_version') is not None:
            self.service_version = m.get('service_version')
        self.params = []
        if m.get('params') is not None:
            for k in m.get('params'):
                temp_model = KeyValuePair()
                self.params.append(temp_model.from_map(k))
        return self


class RunMarketServiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_data: List[KeyValuePair] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 服务调用结果
        self.result_data = result_data

    def validate(self):
        if self.result_data:
            for k in self.result_data:
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
        result['result_data'] = []
        if self.result_data is not None:
            for k in self.result_data:
                result['result_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result_data = []
        if m.get('result_data') is not None:
            for k in m.get('result_data'):
                temp_model = KeyValuePair()
                self.result_data.append(temp_model.from_map(k))
        return self


class QueryMarketSolutionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        solution_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 解决方案code
        self.solution_code = solution_code

    def validate(self):
        self.validate_required(self.solution_code, 'solution_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.solution_code is not None:
            result['solution_code'] = self.solution_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('solution_code') is not None:
            self.solution_code = m.get('solution_code')
        return self


class QueryMarketSolutionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_data: List[KeyValuePair] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询结果
        self.result_data = result_data

    def validate(self):
        if self.result_data:
            for k in self.result_data:
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
        result['result_data'] = []
        if self.result_data is not None:
            for k in self.result_data:
                result['result_data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result_data = []
        if m.get('result_data') is not None:
            for k in m.get('result_data'):
                temp_model = KeyValuePair()
                self.result_data.append(temp_model.from_map(k))
        return self


class QueryAbilityWithproductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品编码，源自于开放平台OPM定义的技术产品编码
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class QueryAbilityWithproductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ability_info_list: List[AbilityInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 能力列表
        self.ability_info_list = ability_info_list

    def validate(self):
        if self.ability_info_list:
            for k in self.ability_info_list:
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
        result['ability_info_list'] = []
        if self.ability_info_list is not None:
            for k in self.ability_info_list:
                result['ability_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.ability_info_list = []
        if m.get('ability_info_list') is not None:
            for k in m.get('ability_info_list'):
                temp_model = AbilityInfo()
                self.ability_info_list.append(temp_model.from_map(k))
        return self


class PagequeryAbilityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        current: int = None,
        page_size: int = None,
        keyword: str = None,
        gw_prod_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页码
        self.current = current
        # 每页大小
        self.page_size = page_size
        # 用于能力的搜索标签
        self.keyword = keyword
        # 网关产品码
        self.gw_prod_code = gw_prod_code

    def validate(self):
        self.validate_required(self.current, 'current')
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.keyword is not None:
            result['keyword'] = self.keyword
        if self.gw_prod_code is not None:
            result['gw_prod_code'] = self.gw_prod_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        if m.get('gw_prod_code') is not None:
            self.gw_prod_code = m.get('gw_prod_code')
        return self


class PagequeryAbilityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        ability_info_list: List[AbilityInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页码
        self.current = current
        # 当前页大小
        self.page_size = page_size
        # 总数
        self.total = total
        # 能力信息列表
        self.ability_info_list = ability_info_list

    def validate(self):
        if self.ability_info_list:
            for k in self.ability_info_list:
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        result['ability_info_list'] = []
        if self.ability_info_list is not None:
            for k in self.ability_info_list:
                result['ability_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.ability_info_list = []
        if m.get('ability_info_list') is not None:
            for k in m.get('ability_info_list'):
                temp_model = AbilityInfo()
                self.ability_info_list.append(temp_model.from_map(k))
        return self


class BindAbilityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_name: str = None,
        ability_ids: List[str] = None,
        operator_id: str = None,
        api_info_model: ApiInfoModel = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api名称
        self.api_name = api_name
        # 能力id列表
        self.ability_ids = ability_ids
        # 操作人的域账号
        self.operator_id = operator_id
        # api信息
        self.api_info_model = api_info_model

    def validate(self):
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.ability_ids, 'ability_ids')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.api_info_model, 'api_info_model')
        if self.api_info_model:
            self.api_info_model.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.ability_ids is not None:
            result['ability_ids'] = self.ability_ids
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.api_info_model is not None:
            result['api_info_model'] = self.api_info_model.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('ability_ids') is not None:
            self.ability_ids = m.get('ability_ids')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('api_info_model') is not None:
            temp_model = ApiInfoModel()
            self.api_info_model = temp_model.from_map(m['api_info_model'])
        return self


class BindAbilityResponse(TeaModel):
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


class QueryAbilityWithapinameRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_name_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api名称列表
        self.api_name_list = api_name_list

    def validate(self):
        self.validate_required(self.api_name_list, 'api_name_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_name_list is not None:
            result['api_name_list'] = self.api_name_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_name_list') is not None:
            self.api_name_list = m.get('api_name_list')
        return self


class QueryAbilityWithapinameResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ability_api_relation_list: List[AbilityApiRelation] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # api与能力信息关联列表
        self.ability_api_relation_list = ability_api_relation_list

    def validate(self):
        if self.ability_api_relation_list:
            for k in self.ability_api_relation_list:
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
        result['ability_api_relation_list'] = []
        if self.ability_api_relation_list is not None:
            for k in self.ability_api_relation_list:
                result['ability_api_relation_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.ability_api_relation_list = []
        if m.get('ability_api_relation_list') is not None:
            for k in m.get('ability_api_relation_list'):
                temp_model = AbilityApiRelation()
                self.ability_api_relation_list.append(temp_model.from_map(k))
        return self


class CallbackAbilityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        api_names: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # api名称集合
        self.api_names = api_names

    def validate(self):
        self.validate_required(self.api_names, 'api_names')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.api_names is not None:
            result['api_names'] = self.api_names
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('api_names') is not None:
            self.api_names = m.get('api_names')
        return self


class CallbackAbilityResponse(TeaModel):
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


class QueryFoundationProtobufRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_code: str = None,
        api_code_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品码
        self.product_code = product_code
        # api code列表信息
        self.api_code_list = api_code_list

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.api_code_list, 'api_code_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.api_code_list is not None:
            result['api_code_list'] = self.api_code_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('api_code_list') is not None:
            self.api_code_list = m.get('api_code_list')
        return self


class QueryFoundationProtobufResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        api_info_list: List[ApiInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # api probuf信息
        self.api_info_list = api_info_list

    def validate(self):
        if self.api_info_list:
            for k in self.api_info_list:
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
        result['api_info_list'] = []
        if self.api_info_list is not None:
            for k in self.api_info_list:
                result['api_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.api_info_list = []
        if m.get('api_info_list') is not None:
            for k in m.get('api_info_list'):
                temp_model = ApiInfo()
                self.api_info_list.append(temp_model.from_map(k))
        return self


class QueryAbilityResultcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        index: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 1-INTERNAL_ERROR，2-TOO_MANY_REQUESTS，3-UNKNOW_ERROR，4-ACCESS_DENIED，5-OK，6-CUSTOM_RESULT_CODE_ONE，7-CUSTOM_RESULT_CODE_TWO
        self.index = index

    def validate(self):
        self.validate_required(self.index, 'index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.index is not None:
            result['index'] = self.index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('index') is not None:
            self.index = m.get('index')
        return self


class QueryAbilityResultcodeResponse(TeaModel):
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


class BindAbilityApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ability_id: str = None,
        operator_id: str = None,
        api_info_models: List[ApiInfoModel] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 共享能力id
        self.ability_id = ability_id
        # qiujianglong.qjl
        self.operator_id = operator_id
        # api模型集合
        self.api_info_models = api_info_models

    def validate(self):
        self.validate_required(self.ability_id, 'ability_id')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.api_info_models, 'api_info_models')
        if self.api_info_models:
            for k in self.api_info_models:
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
        if self.ability_id is not None:
            result['ability_id'] = self.ability_id
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        result['api_info_models'] = []
        if self.api_info_models is not None:
            for k in self.api_info_models:
                result['api_info_models'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ability_id') is not None:
            self.ability_id = m.get('ability_id')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        self.api_info_models = []
        if m.get('api_info_models') is not None:
            for k in m.get('api_info_models'):
                temp_model = ApiInfoModel()
                self.api_info_models.append(temp_model.from_map(k))
        return self


class BindAbilityApiResponse(TeaModel):
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


class QueryAbilityBusinesscodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ability_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 能力id
        self.ability_id = ability_id

    def validate(self):
        self.validate_required(self.ability_id, 'ability_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ability_id is not None:
            result['ability_id'] = self.ability_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ability_id') is not None:
            self.ability_id = m.get('ability_id')
        return self


class QueryAbilityBusinesscodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ability_info: AbilityInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 能力信息
        self.ability_info = ability_info

    def validate(self):
        if self.ability_info:
            self.ability_info.validate()

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
        if self.ability_info is not None:
            result['ability_info'] = self.ability_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ability_info') is not None:
            temp_model = AbilityInfo()
            self.ability_info = temp_model.from_map(m['ability_info'])
        return self


class QueryBusinessProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        business_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商业产品L5编码
        self.business_code = business_code

    def validate(self):
        self.validate_required(self.business_code, 'business_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.business_code is not None:
            result['business_code'] = self.business_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        return self


class QueryBusinessProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sdk_maven_dependency_info: SdkMavenDependencyInfo = None,
        api_info_models: List[ApiInfoModel] = None,
        publish_version: str = None,
        task_running: bool = None,
        task_status: str = None,
        sla_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商业产品sdk客户端的maven依赖信息
        self.sdk_maven_dependency_info = sdk_maven_dependency_info
        # 商业产品最新api信息列表，可能与当前版本jar包内api不一致，若发现不一致请在opm商业sdk管理中重新进行打包
        self.api_info_models = api_info_models
        # 已发布中央仓库的版本
        self.publish_version = publish_version
        # 是否存在运行中的任务，商业产品一次发布中央仓库打包任务，会执行三个子打包任务，上传线下仓库，上传蚂蚁链sdk包至中央仓库，上传金融云sdk包至中央仓库
        self.task_running = task_running
        # 最新一次打包任务运行状态RUNNING/SUCCESS/FAILED
        self.task_status = task_status
        # 能力sla看板url
        self.sla_url = sla_url

    def validate(self):
        if self.sdk_maven_dependency_info:
            self.sdk_maven_dependency_info.validate()
        if self.api_info_models:
            for k in self.api_info_models:
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
        if self.sdk_maven_dependency_info is not None:
            result['sdk_maven_dependency_info'] = self.sdk_maven_dependency_info.to_map()
        result['api_info_models'] = []
        if self.api_info_models is not None:
            for k in self.api_info_models:
                result['api_info_models'].append(k.to_map() if k else None)
        if self.publish_version is not None:
            result['publish_version'] = self.publish_version
        if self.task_running is not None:
            result['task_running'] = self.task_running
        if self.task_status is not None:
            result['task_status'] = self.task_status
        if self.sla_url is not None:
            result['sla_url'] = self.sla_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sdk_maven_dependency_info') is not None:
            temp_model = SdkMavenDependencyInfo()
            self.sdk_maven_dependency_info = temp_model.from_map(m['sdk_maven_dependency_info'])
        self.api_info_models = []
        if m.get('api_info_models') is not None:
            for k in m.get('api_info_models'):
                temp_model = ApiInfoModel()
                self.api_info_models.append(temp_model.from_map(k))
        if m.get('publish_version') is not None:
            self.publish_version = m.get('publish_version')
        if m.get('task_running') is not None:
            self.task_running = m.get('task_running')
        if m.get('task_status') is not None:
            self.task_status = m.get('task_status')
        if m.get('sla_url') is not None:
            self.sla_url = m.get('sla_url')
        return self


class QueryMeteringRuleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_code: str = None,
        business_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 技术产品码
        self.product_code = product_code
        # 商业产品码
        self.business_code = business_code

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.business_code, 'business_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.business_code is not None:
            result['business_code'] = self.business_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        return self


class QueryMeteringRuleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        product_code: str = None,
        business_code: str = None,
        metering_rules: List[MethodMatchingRule] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 技术产品码
        self.product_code = product_code
        # 商业产品码
        self.business_code = business_code
        # 计量规则
        self.metering_rules = metering_rules

    def validate(self):
        if self.metering_rules:
            for k in self.metering_rules:
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
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.business_code is not None:
            result['business_code'] = self.business_code
        result['metering_rules'] = []
        if self.metering_rules is not None:
            for k in self.metering_rules:
                result['metering_rules'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        self.metering_rules = []
        if m.get('metering_rules') is not None:
            for k in m.get('metering_rules'):
                temp_model = MethodMatchingRule()
                self.metering_rules.append(temp_model.from_map(k))
        return self


class CreateMeteringRuleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_code: str = None,
        business_code: str = None,
        method_matching_rules: List[MethodMatchingRule] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 技术产品码
        self.product_code = product_code
        # 商业产品码
        self.business_code = business_code
        # 方法匹配规则
        self.method_matching_rules = method_matching_rules

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.method_matching_rules, 'method_matching_rules')
        if self.method_matching_rules:
            for k in self.method_matching_rules:
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
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.business_code is not None:
            result['business_code'] = self.business_code
        result['method_matching_rules'] = []
        if self.method_matching_rules is not None:
            for k in self.method_matching_rules:
                result['method_matching_rules'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        self.method_matching_rules = []
        if m.get('method_matching_rules') is not None:
            for k in m.get('method_matching_rules'):
                temp_model = MethodMatchingRule()
                self.method_matching_rules.append(temp_model.from_map(k))
        return self


class CreateMeteringRuleResponse(TeaModel):
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


class UpdateMeteringRuleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_code: str = None,
        business_code: str = None,
        method_matching_rules: List[MethodMatchingRule] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 技术产品码
        self.product_code = product_code
        # 商业产品码
        self.business_code = business_code
        # 方法匹配规则
        self.method_matching_rules = method_matching_rules

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.method_matching_rules, 'method_matching_rules')
        if self.method_matching_rules:
            for k in self.method_matching_rules:
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
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.business_code is not None:
            result['business_code'] = self.business_code
        result['method_matching_rules'] = []
        if self.method_matching_rules is not None:
            for k in self.method_matching_rules:
                result['method_matching_rules'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        self.method_matching_rules = []
        if m.get('method_matching_rules') is not None:
            for k in m.get('method_matching_rules'):
                temp_model = MethodMatchingRule()
                self.method_matching_rules.append(temp_model.from_map(k))
        return self


class UpdateMeteringRuleResponse(TeaModel):
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


class QueryMeteringItemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        business_code: str = None,
        metering_domain_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商业产品码
        self.business_code = business_code
        # 计量域
        self.metering_domain_code = metering_domain_code

    def validate(self):
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.metering_domain_code, 'metering_domain_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.metering_domain_code is not None:
            result['metering_domain_code'] = self.metering_domain_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('metering_domain_code') is not None:
            self.metering_domain_code = m.get('metering_domain_code')
        return self


class QueryMeteringItemResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        business_code: str = None,
        metering_domain_code: str = None,
        item_rules: List[ItemRule] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商业产品码
        self.business_code = business_code
        # 计量域
        self.metering_domain_code = metering_domain_code
        # 计量项
        self.item_rules = item_rules

    def validate(self):
        if self.item_rules:
            for k in self.item_rules:
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
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.metering_domain_code is not None:
            result['metering_domain_code'] = self.metering_domain_code
        result['item_rules'] = []
        if self.item_rules is not None:
            for k in self.item_rules:
                result['item_rules'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('metering_domain_code') is not None:
            self.metering_domain_code = m.get('metering_domain_code')
        self.item_rules = []
        if m.get('item_rules') is not None:
            for k in m.get('item_rules'):
                temp_model = ItemRule()
                self.item_rules.append(temp_model.from_map(k))
        return self


class CreateMeteringItemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        business_code: str = None,
        metering_domain_code: str = None,
        item_rules: List[ItemRule] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商业产品码
        self.business_code = business_code
        # 计量域
        self.metering_domain_code = metering_domain_code
        # 计量规则
        self.item_rules = item_rules

    def validate(self):
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.metering_domain_code, 'metering_domain_code')
        self.validate_required(self.item_rules, 'item_rules')
        if self.item_rules:
            for k in self.item_rules:
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
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.metering_domain_code is not None:
            result['metering_domain_code'] = self.metering_domain_code
        result['item_rules'] = []
        if self.item_rules is not None:
            for k in self.item_rules:
                result['item_rules'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('metering_domain_code') is not None:
            self.metering_domain_code = m.get('metering_domain_code')
        self.item_rules = []
        if m.get('item_rules') is not None:
            for k in m.get('item_rules'):
                temp_model = ItemRule()
                self.item_rules.append(temp_model.from_map(k))
        return self


class CreateMeteringItemResponse(TeaModel):
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


class UpdateMeteringItemRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        business_code: str = None,
        metering_domain_code: str = None,
        item_rules: List[ItemRule] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商业产品码
        self.business_code = business_code
        # 计量域
        self.metering_domain_code = metering_domain_code
        # 计量项列表
        self.item_rules = item_rules

    def validate(self):
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.metering_domain_code, 'metering_domain_code')
        self.validate_required(self.item_rules, 'item_rules')
        if self.item_rules:
            for k in self.item_rules:
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
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.metering_domain_code is not None:
            result['metering_domain_code'] = self.metering_domain_code
        result['item_rules'] = []
        if self.item_rules is not None:
            for k in self.item_rules:
                result['item_rules'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('metering_domain_code') is not None:
            self.metering_domain_code = m.get('metering_domain_code')
        self.item_rules = []
        if m.get('item_rules') is not None:
            for k in m.get('item_rules'):
                temp_model = ItemRule()
                self.item_rules.append(temp_model.from_map(k))
        return self


class UpdateMeteringItemResponse(TeaModel):
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


