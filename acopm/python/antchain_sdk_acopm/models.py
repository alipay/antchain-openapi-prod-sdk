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


class RateLimitEffectScopeValueDTO(TeaModel):
    def __init__(
        self,
        region: str = None,
        enabled: bool = None,
        limit: int = None,
        time_duration: str = None,
    ):
        # region
        self.region = region
        # enabled
        self.enabled = enabled
        # limit
        self.limit = limit
        # timeDuration
        self.time_duration = time_duration

    def validate(self):
        self.validate_required(self.region, 'region')
        self.validate_required(self.enabled, 'enabled')
        self.validate_required(self.limit, 'limit')
        self.validate_required(self.time_duration, 'time_duration')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.region is not None:
            result['region'] = self.region
        if self.enabled is not None:
            result['enabled'] = self.enabled
        if self.limit is not None:
            result['limit'] = self.limit
        if self.time_duration is not None:
            result['time_duration'] = self.time_duration
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('region') is not None:
            self.region = m.get('region')
        if m.get('enabled') is not None:
            self.enabled = m.get('enabled')
        if m.get('limit') is not None:
            self.limit = m.get('limit')
        if m.get('time_duration') is not None:
            self.time_duration = m.get('time_duration')
        return self


class RateLimitEffectScopeDTO(TeaModel):
    def __init__(
        self,
        values: List[RateLimitEffectScopeValueDTO] = None,
    ):
        # RateLimitEffectScopeValueDTO list
        self.values = values

    def validate(self):
        self.validate_required(self.values, 'values')
        if self.values:
            for k in self.values:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['values'] = []
        if self.values is not None:
            for k in self.values:
                result['values'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.values = []
        if m.get('values') is not None:
            for k in m.get('values'):
                temp_model = RateLimitEffectScopeValueDTO()
                self.values.append(temp_model.from_map(k))
        return self


class BusinessRuleItem(TeaModel):
    def __init__(
        self,
        condition: str = None,
        value: str = None,
    ):
        # 规则表达式
        self.condition = condition
        # 规则值
        self.value = value

    def validate(self):
        self.validate_required(self.condition, 'condition')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.condition is not None:
            result['condition'] = self.condition
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('condition') is not None:
            self.condition = m.get('condition')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class UpdateScopeValue(TeaModel):
    def __init__(
        self,
        region: str = None,
        limit: int = None,
        enabled: bool = None,
        time_duration: str = None,
    ):
        # CN-HANGZHOU-FINANCE
        self.region = region
        # 限流值
        self.limit = limit
        # 生效与否
        self.enabled = enabled
        # 时间单位
        self.time_duration = time_duration

    def validate(self):
        self.validate_required(self.region, 'region')
        self.validate_required(self.limit, 'limit')
        self.validate_required(self.enabled, 'enabled')
        self.validate_required(self.time_duration, 'time_duration')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.region is not None:
            result['region'] = self.region
        if self.limit is not None:
            result['limit'] = self.limit
        if self.enabled is not None:
            result['enabled'] = self.enabled
        if self.time_duration is not None:
            result['time_duration'] = self.time_duration
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('region') is not None:
            self.region = m.get('region')
        if m.get('limit') is not None:
            self.limit = m.get('limit')
        if m.get('enabled') is not None:
            self.enabled = m.get('enabled')
        if m.get('time_duration') is not None:
            self.time_duration = m.get('time_duration')
        return self


class BusinessRule(TeaModel):
    def __init__(
        self,
        rule_type: str = None,
        rule_items: List[BusinessRuleItem] = None,
    ):
        # 规则类型（BUSINESS/INSTANCE/TENANT_WHITELIST）
        self.rule_type = rule_type
        # 规则项列表
        self.rule_items = rule_items

    def validate(self):
        self.validate_required(self.rule_type, 'rule_type')
        self.validate_required(self.rule_items, 'rule_items')
        if self.rule_items:
            for k in self.rule_items:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.rule_type is not None:
            result['rule_type'] = self.rule_type
        result['rule_items'] = []
        if self.rule_items is not None:
            for k in self.rule_items:
                result['rule_items'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('rule_type') is not None:
            self.rule_type = m.get('rule_type')
        self.rule_items = []
        if m.get('rule_items') is not None:
            for k in m.get('rule_items'):
                temp_model = BusinessRuleItem()
                self.rule_items.append(temp_model.from_map(k))
        return self


class MultiSdkItem(TeaModel):
    def __init__(
        self,
        task_unique_id: str = None,
        prod_code: str = None,
        saassdk_version: str = None,
        lang: str = None,
        repo: str = None,
        address: str = None,
        start_tme: str = None,
        cost: int = None,
        end_time: str = None,
        status: str = None,
        preview_link: str = None,
        dependency: str = None,
    ):
        # 任务id
        self.task_unique_id = task_unique_id
        # 产品码
        self.prod_code = prod_code
        # sdk版本
        self.saassdk_version = saassdk_version
        # sdk语言
        self.lang = lang
        # 发布仓库
        self.repo = repo
        # 发布地址
        self.address = address
        # 开始时间
        self.start_tme = start_tme
        # 花费时间
        self.cost = cost
        # 结束时间
        self.end_time = end_time
        # 打包状态
        self.status = status
        # 查看链接
        self.preview_link = preview_link
        # 依赖
        self.dependency = dependency

    def validate(self):
        self.validate_required(self.task_unique_id, 'task_unique_id')
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.saassdk_version, 'saassdk_version')
        self.validate_required(self.lang, 'lang')
        self.validate_required(self.repo, 'repo')
        self.validate_required(self.address, 'address')
        self.validate_required(self.start_tme, 'start_tme')
        if self.start_tme is not None:
            self.validate_pattern(self.start_tme, 'start_tme', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.cost, 'cost')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_unique_id is not None:
            result['task_unique_id'] = self.task_unique_id
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.saassdk_version is not None:
            result['saassdk_version'] = self.saassdk_version
        if self.lang is not None:
            result['lang'] = self.lang
        if self.repo is not None:
            result['repo'] = self.repo
        if self.address is not None:
            result['address'] = self.address
        if self.start_tme is not None:
            result['start_tme'] = self.start_tme
        if self.cost is not None:
            result['cost'] = self.cost
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.status is not None:
            result['status'] = self.status
        if self.preview_link is not None:
            result['preview_link'] = self.preview_link
        if self.dependency is not None:
            result['dependency'] = self.dependency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_unique_id') is not None:
            self.task_unique_id = m.get('task_unique_id')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('saassdk_version') is not None:
            self.saassdk_version = m.get('saassdk_version')
        if m.get('lang') is not None:
            self.lang = m.get('lang')
        if m.get('repo') is not None:
            self.repo = m.get('repo')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('start_tme') is not None:
            self.start_tme = m.get('start_tme')
        if m.get('cost') is not None:
            self.cost = m.get('cost')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('preview_link') is not None:
            self.preview_link = m.get('preview_link')
        if m.get('dependency') is not None:
            self.dependency = m.get('dependency')
        return self


class UpdateRateLimit(TeaModel):
    def __init__(
        self,
        api_name: str = None,
        provider_id: str = None,
        update_scope_value: UpdateScopeValue = None,
    ):
        # api_name
        self.api_name = api_name
        # provider_id
        self.provider_id = provider_id
        # update_scope_value
        self.update_scope_value = update_scope_value

    def validate(self):
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.update_scope_value, 'update_scope_value')
        if self.update_scope_value:
            self.update_scope_value.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.update_scope_value is not None:
            result['update_scope_value'] = self.update_scope_value.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('update_scope_value') is not None:
            temp_model = UpdateScopeValue()
            self.update_scope_value = temp_model.from_map(m['update_scope_value'])
        return self


class RateLimitDetail(TeaModel):
    def __init__(
        self,
        api_name: str = None,
        provider_id: str = None,
        tenant_id: str = None,
        used: int = None,
        effect_scope: RateLimitEffectScopeDTO = None,
    ):
        # apiName
        self.api_name = api_name
        # provider_id
        self.provider_id = provider_id
        # 租户ID
        self.tenant_id = tenant_id
        # 已使用量
        self.used = used
        # effectScope
        self.effect_scope = effect_scope

    def validate(self):
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.provider_id, 'provider_id')
        if self.effect_scope:
            self.effect_scope.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.used is not None:
            result['used'] = self.used
        if self.effect_scope is not None:
            result['effect_scope'] = self.effect_scope.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('used') is not None:
            self.used = m.get('used')
        if m.get('effect_scope') is not None:
            temp_model = RateLimitEffectScopeDTO()
            self.effect_scope = temp_model.from_map(m['effect_scope'])
        return self


class BucUser(TeaModel):
    def __init__(
        self,
        emp_id: str = None,
        email_prefix: str = None,
        nick_name: str = None,
    ):
        # 工号
        self.emp_id = emp_id
        # 域账号
        self.email_prefix = email_prefix
        # 花名
        self.nick_name = nick_name

    def validate(self):
        self.validate_required(self.emp_id, 'emp_id')
        self.validate_required(self.email_prefix, 'email_prefix')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.emp_id is not None:
            result['emp_id'] = self.emp_id
        if self.email_prefix is not None:
            result['email_prefix'] = self.email_prefix
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('emp_id') is not None:
            self.emp_id = m.get('emp_id')
        if m.get('email_prefix') is not None:
            self.email_prefix = m.get('email_prefix')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
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
        # API名称
        self.api_name = api_name
        # 网关产品码
        self.prod_code = prod_code
        # 是否是内部接口 0对外 1对内
        self.internal = internal
        # API版本号
        self.api_version = api_version
        # API描述
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


class SdkMavenDependencyInfo(TeaModel):
    def __init__(
        self,
        reference_client: str = None,
        referenc_server: str = None,
        maven_link_client: str = None,
        maven_link_server: str = None,
    ):
        # client端依赖
        self.reference_client = reference_client
        # server端依赖
        self.referenc_server = referenc_server
        # client端maven仓库地址
        self.maven_link_client = maven_link_client
        # server端maven仓库地址
        self.maven_link_server = maven_link_server

    def validate(self):
        self.validate_required(self.reference_client, 'reference_client')
        self.validate_required(self.referenc_server, 'referenc_server')
        self.validate_required(self.maven_link_client, 'maven_link_client')
        self.validate_required(self.maven_link_server, 'maven_link_server')

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


class ProductInfo(TeaModel):
    def __init__(
        self,
        prod_code: str = None,
        sdk_version: str = None,
    ):
        # 产品码
        self.prod_code = prod_code
        # sdk版本号
        self.sdk_version = sdk_version

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.sdk_version, 'sdk_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.sdk_version is not None:
            result['sdk_version'] = self.sdk_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('sdk_version') is not None:
            self.sdk_version = m.get('sdk_version')
        return self


class ListProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        keyword: str = None,
        page_size: int = None,
        current_page: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户域账号
        self.user_id = user_id
        # 产品关键字
        self.keyword = keyword
        # 每页记录
        self.page_size = page_size
        # 当前页面
        self.current_page = current_page

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.keyword is not None:
            result['keyword'] = self.keyword
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current_page is not None:
            result['current_page'] = self.current_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        return self


class ListProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        products: List[ProductInfo] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 产品列表
        self.products = products
        # 记录总数
        self.total_count = total_count

    def validate(self):
        if self.products:
            for k in self.products:
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
        result['products'] = []
        if self.products is not None:
            for k in self.products:
                result['products'].append(k.to_map() if k else None)
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
        self.products = []
        if m.get('products') is not None:
            for k in m.get('products'):
                temp_model = ProductInfo()
                self.products.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class CallbackMultisdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 回调JSON报文
        self.body = body

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        return self


class CallbackMultisdkResponse(TeaModel):
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


class CreateProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        prod_code: str = None,
        name_en: str = None,
        name_cn: str = None,
        description: str = None,
        owner_id: str = None,
        member_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.prod_code = prod_code
        # 英文名
        self.name_en = name_en
        # 中文名
        self.name_cn = name_cn
        # 描述
        self.description = description
        # zoujili.zjl
        self.owner_id = owner_id
        # 成员域账号，用于同步权限
        self.member_list = member_list

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.name_en, 'name_en')
        self.validate_required(self.name_cn, 'name_cn')
        self.validate_required(self.description, 'description')
        self.validate_required(self.owner_id, 'owner_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.name_en is not None:
            result['name_en'] = self.name_en
        if self.name_cn is not None:
            result['name_cn'] = self.name_cn
        if self.description is not None:
            result['description'] = self.description
        if self.owner_id is not None:
            result['owner_id'] = self.owner_id
        if self.member_list is not None:
            result['member_list'] = self.member_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('name_en') is not None:
            self.name_en = m.get('name_en')
        if m.get('name_cn') is not None:
            self.name_cn = m.get('name_cn')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('owner_id') is not None:
            self.owner_id = m.get('owner_id')
        if m.get('member_list') is not None:
            self.member_list = m.get('member_list')
        return self


class CreateProductResponse(TeaModel):
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


class InitProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        prod_code: str = None,
        first_name: str = None,
        second_name: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.prod_code = prod_code
        # 品牌名
        self.first_name = first_name
        # 产品标识
        self.second_name = second_name
        # api类型，tr或http(不区分大小写)
        self.type = type

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.first_name, 'first_name')
        self.validate_required(self.second_name, 'second_name')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.first_name is not None:
            result['first_name'] = self.first_name
        if self.second_name is not None:
            result['second_name'] = self.second_name
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('first_name') is not None:
            self.first_name = m.get('first_name')
        if m.get('second_name') is not None:
            self.second_name = m.get('second_name')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class InitProductResponse(TeaModel):
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


class DeleteProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        prod_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # YUNYOU
        self.prod_code = prod_code

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

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


class DeleteProductResponse(TeaModel):
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


class PublishProductSdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        prod_code: str = None,
        publish_version: str = None,
        platform_origin: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.prod_code = prod_code
        # 版本号。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>
        self.publish_version = publish_version
        # sdk发布请求来源。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>。
        self.platform_origin = platform_origin

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.publish_version, 'publish_version')
        self.validate_required(self.platform_origin, 'platform_origin')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.publish_version is not None:
            result['publish_version'] = self.publish_version
        if self.platform_origin is not None:
            result['platform_origin'] = self.platform_origin
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('publish_version') is not None:
            self.publish_version = m.get('publish_version')
        if m.get('platform_origin') is not None:
            self.platform_origin = m.get('platform_origin')
        return self


class PublishProductSdkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sdk_maven_dependency_info: SdkMavenDependencyInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # maven sdk依赖信息
        self.sdk_maven_dependency_info = sdk_maven_dependency_info

    def validate(self):
        if self.sdk_maven_dependency_info:
            self.sdk_maven_dependency_info.validate()

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
        return self


class GetSdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        prod_code: str = None,
        api_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码
        self.prod_code = prod_code
        # 版本号
        self.api_version = api_version

    def validate(self):
        self.validate_required(self.prod_code, 'prod_code')
        self.validate_required(self.api_version, 'api_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.api_version is not None:
            result['api_version'] = self.api_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('api_version') is not None:
            self.api_version = m.get('api_version')
        return self


class GetSdkResponse(TeaModel):
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
        # xml内容
        self.content = content

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


class PublishProductSaassdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        saas_code: str = None,
        saassdk_version: str = None,
        publish: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要发布的共享能力名称
        self.saas_code = saas_code
        # 本次打包的版本
        self.saassdk_version = saassdk_version
        # 是否发布
        self.publish = publish

    def validate(self):
        self.validate_required(self.saas_code, 'saas_code')
        self.validate_required(self.saassdk_version, 'saassdk_version')
        self.validate_required(self.publish, 'publish')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.saas_code is not None:
            result['saas_code'] = self.saas_code
        if self.saassdk_version is not None:
            result['saassdk_version'] = self.saassdk_version
        if self.publish is not None:
            result['publish'] = self.publish
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('saas_code') is not None:
            self.saas_code = m.get('saas_code')
        if m.get('saassdk_version') is not None:
            self.saassdk_version = m.get('saassdk_version')
        if m.get('publish') is not None:
            self.publish = m.get('publish')
        return self


class PublishProductSaassdkResponse(TeaModel):
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
        # 是否成功
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


class GetProductSaassdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        saas_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 共享能力码
        self.saas_code = saas_code

    def validate(self):
        self.validate_required(self.saas_code, 'saas_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.saas_code is not None:
            result['saas_code'] = self.saas_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('saas_code') is not None:
            self.saas_code = m.get('saas_code')
        return self


class GetProductSaassdkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_version: str = None,
        publish_version: str = None,
        task_running: bool = None,
        published_sdks: List[MultiSdkItem] = None,
        task_status: str = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前的sdk版本
        self.current_version = current_version
        # 要发布的版本
        self.publish_version = publish_version
        # 打包是否正在进行
        self.task_running = task_running
        # 已经过发布的sdk
        self.published_sdks = published_sdks
        # 任务状态
        self.task_status = task_status
        # 任务码
        self.task_id = task_id

    def validate(self):
        if self.published_sdks:
            for k in self.published_sdks:
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
        if self.current_version is not None:
            result['current_version'] = self.current_version
        if self.publish_version is not None:
            result['publish_version'] = self.publish_version
        if self.task_running is not None:
            result['task_running'] = self.task_running
        result['published_sdks'] = []
        if self.published_sdks is not None:
            for k in self.published_sdks:
                result['published_sdks'].append(k.to_map() if k else None)
        if self.task_status is not None:
            result['task_status'] = self.task_status
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
        if m.get('current_version') is not None:
            self.current_version = m.get('current_version')
        if m.get('publish_version') is not None:
            self.publish_version = m.get('publish_version')
        if m.get('task_running') is not None:
            self.task_running = m.get('task_running')
        self.published_sdks = []
        if m.get('published_sdks') is not None:
            for k in m.get('published_sdks'):
                temp_model = MultiSdkItem()
                self.published_sdks.append(temp_model.from_map(k))
        if m.get('task_status') is not None:
            self.task_status = m.get('task_status')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class AddProductMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        member_list: List[str] = None,
        prod_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # user_id
        self.member_list = member_list
        # 产品码
        self.prod_code = prod_code

    def validate(self):
        self.validate_required(self.member_list, 'member_list')
        self.validate_required(self.prod_code, 'prod_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.member_list is not None:
            result['member_list'] = self.member_list
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('member_list') is not None:
            self.member_list = m.get('member_list')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        return self


class AddProductMemberResponse(TeaModel):
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


class QueryApiRatelimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_name_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # api名
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
        if self.api_name_list is not None:
            result['api_name_list'] = self.api_name_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_name_list') is not None:
            self.api_name_list = m.get('api_name_list')
        return self


class QueryApiRatelimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        rate_limit_detail_list: List[RateLimitDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 限流信息
        self.rate_limit_detail_list = rate_limit_detail_list

    def validate(self):
        if self.rate_limit_detail_list:
            for k in self.rate_limit_detail_list:
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
        result['rate_limit_detail_list'] = []
        if self.rate_limit_detail_list is not None:
            for k in self.rate_limit_detail_list:
                result['rate_limit_detail_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.rate_limit_detail_list = []
        if m.get('rate_limit_detail_list') is not None:
            for k in m.get('rate_limit_detail_list'):
                temp_model = RateLimitDetail()
                self.rate_limit_detail_list.append(temp_model.from_map(k))
        return self


class QueryTenantRatelimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id_list: List[str] = None,
        api_name_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户id
        self.tenant_id_list = tenant_id_list
        # api名
        self.api_name_list = api_name_list

    def validate(self):
        self.validate_required(self.tenant_id_list, 'tenant_id_list')
        self.validate_required(self.api_name_list, 'api_name_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id_list is not None:
            result['tenant_id_list'] = self.tenant_id_list
        if self.api_name_list is not None:
            result['api_name_list'] = self.api_name_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id_list') is not None:
            self.tenant_id_list = m.get('tenant_id_list')
        if m.get('api_name_list') is not None:
            self.api_name_list = m.get('api_name_list')
        return self


class QueryTenantRatelimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        rate_limit_detail_list: List[RateLimitDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 限流信息
        self.rate_limit_detail_list = rate_limit_detail_list

    def validate(self):
        if self.rate_limit_detail_list:
            for k in self.rate_limit_detail_list:
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
        result['rate_limit_detail_list'] = []
        if self.rate_limit_detail_list is not None:
            for k in self.rate_limit_detail_list:
                result['rate_limit_detail_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.rate_limit_detail_list = []
        if m.get('rate_limit_detail_list') is not None:
            for k in m.get('rate_limit_detail_list'):
                temp_model = RateLimitDetail()
                self.rate_limit_detail_list.append(temp_model.from_map(k))
        return self


class UpdateApiRatelimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        update_limit_list: List[UpdateRateLimit] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # update_limit_list
        self.update_limit_list = update_limit_list

    def validate(self):
        self.validate_required(self.update_limit_list, 'update_limit_list')
        if self.update_limit_list:
            for k in self.update_limit_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        result['update_limit_list'] = []
        if self.update_limit_list is not None:
            for k in self.update_limit_list:
                result['update_limit_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        self.update_limit_list = []
        if m.get('update_limit_list') is not None:
            for k in m.get('update_limit_list'):
                temp_model = UpdateRateLimit()
                self.update_limit_list.append(temp_model.from_map(k))
        return self


class UpdateApiRatelimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class UpdateTenantRatelimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        update_limit_list: List[UpdateRateLimit] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户id
        self.tenant_id = tenant_id
        # 更新列表
        self.update_limit_list = update_limit_list

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.update_limit_list, 'update_limit_list')
        if self.update_limit_list:
            for k in self.update_limit_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        result['update_limit_list'] = []
        if self.update_limit_list is not None:
            for k in self.update_limit_list:
                result['update_limit_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        self.update_limit_list = []
        if m.get('update_limit_list') is not None:
            for k in m.get('update_limit_list'):
                temp_model = UpdateRateLimit()
                self.update_limit_list.append(temp_model.from_map(k))
        return self


class UpdateTenantRatelimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # result
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class CallbackJiuzhouPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        exec_id: str = None,
        call_back_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求标识
        self.exec_id = exec_id
        # 回调数据
        self.call_back_data = call_back_data

    def validate(self):
        self.validate_required(self.exec_id, 'exec_id')
        self.validate_required(self.call_back_data, 'call_back_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.exec_id is not None:
            result['exec_id'] = self.exec_id
        if self.call_back_data is not None:
            result['call_back_data'] = self.call_back_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('exec_id') is not None:
            self.exec_id = m.get('exec_id')
        if m.get('call_back_data') is not None:
            self.call_back_data = m.get('call_back_data')
        return self


class CallbackJiuzhouPlanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        exec_id: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求标识
        self.exec_id = exec_id
        # 请求是否成功
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
        if self.exec_id is not None:
            result['exec_id'] = self.exec_id
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
        if m.get('exec_id') is not None:
            self.exec_id = m.get('exec_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ExecRobotIntelligentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        target_req_msg_id: str = None,
        sender_staff_id: str = None,
        call_url: str = None,
        robot_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求id
        self.target_req_msg_id = target_req_msg_id
        # 通知人
        self.sender_staff_id = sender_staff_id
        # 回调通知接口
        self.call_url = call_url
        # token
        self.robot_token = robot_token

    def validate(self):
        self.validate_required(self.target_req_msg_id, 'target_req_msg_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.target_req_msg_id is not None:
            result['target_req_msg_id'] = self.target_req_msg_id
        if self.sender_staff_id is not None:
            result['sender_staff_id'] = self.sender_staff_id
        if self.call_url is not None:
            result['call_url'] = self.call_url
        if self.robot_token is not None:
            result['robot_token'] = self.robot_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('target_req_msg_id') is not None:
            self.target_req_msg_id = m.get('target_req_msg_id')
        if m.get('sender_staff_id') is not None:
            self.sender_staff_id = m.get('sender_staff_id')
        if m.get('call_url') is not None:
            self.call_url = m.get('call_url')
        if m.get('robot_token') is not None:
            self.robot_token = m.get('robot_token')
        return self


class ExecRobotIntelligentResponse(TeaModel):
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


class UpdateApisStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        apis: List[str] = None,
        new_product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 待更新的api数组
        self.apis = apis
        # 产品码，原字段废弃
        self.new_product_code = new_product_code

    def validate(self):
        self.validate_required(self.apis, 'apis')
        self.validate_required(self.new_product_code, 'new_product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.apis is not None:
            result['apis'] = self.apis
        if self.new_product_code is not None:
            result['new_product_code'] = self.new_product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('apis') is not None:
            self.apis = m.get('apis')
        if m.get('new_product_code') is not None:
            self.new_product_code = m.get('new_product_code')
        return self


class UpdateApisStatusResponse(TeaModel):
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


class QuerySdkApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        ability_id: str = None,
        publish_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商业能力id
        self.ability_id = ability_id
        # 发布版本号
        self.publish_version = publish_version

    def validate(self):
        self.validate_required(self.ability_id, 'ability_id')
        self.validate_required(self.publish_version, 'publish_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.ability_id is not None:
            result['ability_id'] = self.ability_id
        if self.publish_version is not None:
            result['publish_version'] = self.publish_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('ability_id') is not None:
            self.ability_id = m.get('ability_id')
        if m.get('publish_version') is not None:
            self.publish_version = m.get('publish_version')
        return self


class QuerySdkApiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        api_info_models: List[ApiInfoModel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前版本sdk包含api信息列表
        self.api_info_models = api_info_models

    def validate(self):
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
        result['api_info_models'] = []
        if self.api_info_models is not None:
            for k in self.api_info_models:
                result['api_info_models'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.api_info_models = []
        if m.get('api_info_models') is not None:
            for k in m.get('api_info_models'):
                temp_model = ApiInfoModel()
                self.api_info_models.append(temp_model.from_map(k))
        return self


class ExecRobotBaasplusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        target_req_id: str = None,
        target_param: str = None,
        retry_flag: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 目标请求id
        self.target_req_id = target_req_id
        # 目标请求参数
        self.target_param = target_param
        # 是否重试
        self.retry_flag = retry_flag

    def validate(self):
        self.validate_required(self.retry_flag, 'retry_flag')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.target_req_id is not None:
            result['target_req_id'] = self.target_req_id
        if self.target_param is not None:
            result['target_param'] = self.target_param
        if self.retry_flag is not None:
            result['retry_flag'] = self.retry_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('target_req_id') is not None:
            self.target_req_id = m.get('target_req_id')
        if m.get('target_param') is not None:
            self.target_param = m.get('target_param')
        if m.get('retry_flag') is not None:
            self.retry_flag = m.get('retry_flag')
        return self


class ExecRobotBaasplusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        req_json_string: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求数据json字符串数组
        self.req_json_string = req_json_string

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
        if self.req_json_string is not None:
            result['req_json_string'] = self.req_json_string
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('req_json_string') is not None:
            self.req_json_string = m.get('req_json_string')
        return self


class QueryApiDetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        target_prod: str = None,
        target_api: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # demo
        self.target_prod = target_prod
        # demo
        self.target_api = target_api

    def validate(self):
        self.validate_required(self.target_prod, 'target_prod')
        self.validate_required(self.target_api, 'target_api')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.target_prod is not None:
            result['target_prod'] = self.target_prod
        if self.target_api is not None:
            result['target_api'] = self.target_api
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('target_prod') is not None:
            self.target_prod = m.get('target_prod')
        if m.get('target_api') is not None:
            self.target_api = m.get('target_api')
        return self


class QueryApiDetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        api_detail_json: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # json
        self.api_detail_json = api_detail_json

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
        if self.api_detail_json is not None:
            result['api_detail_json'] = self.api_detail_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('api_detail_json') is not None:
            self.api_detail_json = m.get('api_detail_json')
        return self


class QueryApiOwnerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
        api: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 网关产品码
        self.product_code = product_code
        # api方法信息
        self.api = api

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.api, 'api')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.api is not None:
            result['api'] = self.api
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('api') is not None:
            self.api = m.get('api')
        return self


class QueryApiOwnerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        buc_user: BucUser = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # buc用户信息
        self.buc_user = buc_user

    def validate(self):
        if self.buc_user:
            self.buc_user.validate()

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
        if self.buc_user is not None:
            result['buc_user'] = self.buc_user.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('buc_user') is not None:
            temp_model = BucUser()
            self.buc_user = temp_model.from_map(m['buc_user'])
        return self


class UpdateGwCacheRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cache_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 刷新缓存的key
        self.cache_key = cache_key

    def validate(self):
        self.validate_required(self.cache_key, 'cache_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cache_key is not None:
            result['cache_key'] = self.cache_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cache_key') is not None:
            self.cache_key = m.get('cache_key')
        return self


class UpdateGwCacheResponse(TeaModel):
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


class CreateBusinessruleOperateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_name: str = None,
        rules: List[BusinessRule] = None,
        rule_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # api名称
        self.api_name = api_name
        # 规则列表
        self.rules = rules
        # api版本（可选，传递则表示导入）
        self.rule_version = rule_version

    def validate(self):
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.rules, 'rules')
        if self.rules:
            for k in self.rules:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.api_name is not None:
            result['api_name'] = self.api_name
        result['rules'] = []
        if self.rules is not None:
            for k in self.rules:
                result['rules'].append(k.to_map() if k else None)
        if self.rule_version is not None:
            result['rule_version'] = self.rule_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        self.rules = []
        if m.get('rules') is not None:
            for k in m.get('rules'):
                temp_model = BusinessRule()
                self.rules.append(temp_model.from_map(k))
        if m.get('rule_version') is not None:
            self.rule_version = m.get('rule_version')
        return self


class CreateBusinessruleOperateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        version: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 版本号
        self.version = version

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
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class EnableBusinessruleOperateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_name: str = None,
        env: str = None,
        rule_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # api名称
        self.api_name = api_name
        # 环境
        self.env = env
        # 版本（不传为创建新版）
        self.rule_version = rule_version

    def validate(self):
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.rule_version, 'rule_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.env is not None:
            result['env'] = self.env
        if self.rule_version is not None:
            result['rule_version'] = self.rule_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('rule_version') is not None:
            self.rule_version = m.get('rule_version')
        return self


class EnableBusinessruleOperateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        version: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 版本号
        self.version = version

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
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class QueryBusinessruleMatchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_msg_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求的reqMsgId
        self.request_msg_id = request_msg_id

    def validate(self):
        self.validate_required(self.request_msg_id, 'request_msg_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_msg_id is not None:
            result['request_msg_id'] = self.request_msg_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_msg_id') is not None:
            self.request_msg_id = m.get('request_msg_id')
        return self


class QueryBusinessruleMatchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        match_result: str = None,
        http_content: str = None,
        prevent_result: str = None,
        match_business_code: str = None,
        match_instance_id: str = None,
        engine_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 最终匹配结果
        self.match_result = match_result
        # 出入参信息
        self.http_content = http_content
        # 防控结果
        self.prevent_result = prevent_result
        # 匹配到的L5
        self.match_business_code = match_business_code
        # 匹配到的实例id
        self.match_instance_id = match_instance_id
        # 规则引擎耗时
        self.engine_time = engine_time

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
        if self.match_result is not None:
            result['match_result'] = self.match_result
        if self.http_content is not None:
            result['http_content'] = self.http_content
        if self.prevent_result is not None:
            result['prevent_result'] = self.prevent_result
        if self.match_business_code is not None:
            result['match_business_code'] = self.match_business_code
        if self.match_instance_id is not None:
            result['match_instance_id'] = self.match_instance_id
        if self.engine_time is not None:
            result['engine_time'] = self.engine_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('match_result') is not None:
            self.match_result = m.get('match_result')
        if m.get('http_content') is not None:
            self.http_content = m.get('http_content')
        if m.get('prevent_result') is not None:
            self.prevent_result = m.get('prevent_result')
        if m.get('match_business_code') is not None:
            self.match_business_code = m.get('match_business_code')
        if m.get('match_instance_id') is not None:
            self.match_instance_id = m.get('match_instance_id')
        if m.get('engine_time') is not None:
            self.engine_time = m.get('engine_time')
        return self


class QueryBusinessruleServicesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        submitter_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 提交人域账号
        self.submitter_id = submitter_id

    def validate(self):
        self.validate_required(self.submitter_id, 'submitter_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.submitter_id is not None:
            result['submitter_id'] = self.submitter_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('submitter_id') is not None:
            self.submitter_id = m.get('submitter_id')
        return self


class QueryBusinessruleServicesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        service_list: List[ApiInfoModel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # api服务列表
        self.service_list = service_list

    def validate(self):
        if self.service_list:
            for k in self.service_list:
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
        result['service_list'] = []
        if self.service_list is not None:
            for k in self.service_list:
                result['service_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.service_list = []
        if m.get('service_list') is not None:
            for k in m.get('service_list'):
                temp_model = ApiInfoModel()
                self.service_list.append(temp_model.from_map(k))
        return self


class GetBusinessruleServicesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_name: str = None,
        api_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # api名称
        self.api_name = api_name
        # 版本号（可不填）
        self.api_version = api_version

    def validate(self):
        self.validate_required(self.api_name, 'api_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.api_version is not None:
            result['api_version'] = self.api_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('api_version') is not None:
            self.api_version = m.get('api_version')
        return self


class GetBusinessruleServicesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        api_meta: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # api元数据（参照facade包中的cn.com.antcloud.opm.service.model.apimng.response.ExportApiResponse结构）
        self.api_meta = api_meta

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
        if self.api_meta is not None:
            result['api_meta'] = self.api_meta
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('api_meta') is not None:
            self.api_meta = m.get('api_meta')
        return self


class UpdateInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        instance_id: str = None,
        instance_status: str = None,
        biz_no: str = None,
        business_code: str = None,
        specification: str = None,
        extension_info: str = None,
        version_timestamp: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 实例ID
        self.instance_id = instance_id
        # 需变更的实例状态
        self.instance_status = instance_status
        # 履约幂等号
        self.biz_no = biz_no
        # L5商品编号
        self.business_code = business_code
        # 规格属性
        self.specification = specification
        # 扩展信息
        self.extension_info = extension_info
        # 修改时间戳
        self.version_timestamp = version_timestamp

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.instance_status, 'instance_status')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.version_timestamp, 'version_timestamp')
        if self.version_timestamp is not None:
            self.validate_pattern(self.version_timestamp, 'version_timestamp', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.instance_status is not None:
            result['instance_status'] = self.instance_status
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.specification is not None:
            result['specification'] = self.specification
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.version_timestamp is not None:
            result['version_timestamp'] = self.version_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('instance_status') is not None:
            self.instance_status = m.get('instance_status')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('specification') is not None:
            self.specification = m.get('specification')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('version_timestamp') is not None:
            self.version_timestamp = m.get('version_timestamp')
        return self


class UpdateInstanceResponse(TeaModel):
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


class UpdateInstanceTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        instance_id: str = None,
        biz_no: str = None,
        tenant_id: str = None,
        tenant_operator_enum: str = None,
        extension_info: str = None,
        version_timestamp: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 实例ID
        self.instance_id = instance_id
        # 履约幂等号
        self.biz_no = biz_no
        # 租户ID
        self.tenant_id = tenant_id
        # 租户操作
        self.tenant_operator_enum = tenant_operator_enum
        # 扩展信息
        self.extension_info = extension_info
        # 修改时间戳
        self.version_timestamp = version_timestamp

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.tenant_operator_enum, 'tenant_operator_enum')
        self.validate_required(self.version_timestamp, 'version_timestamp')
        if self.version_timestamp is not None:
            self.validate_pattern(self.version_timestamp, 'version_timestamp', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_operator_enum is not None:
            result['tenant_operator_enum'] = self.tenant_operator_enum
        if self.extension_info is not None:
            result['extension_info'] = self.extension_info
        if self.version_timestamp is not None:
            result['version_timestamp'] = self.version_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_operator_enum') is not None:
            self.tenant_operator_enum = m.get('tenant_operator_enum')
        if m.get('extension_info') is not None:
            self.extension_info = m.get('extension_info')
        if m.get('version_timestamp') is not None:
            self.version_timestamp = m.get('version_timestamp')
        return self


class UpdateInstanceTenantResponse(TeaModel):
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


class CallbackMultiSdkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 
        # 回调JSON报文
        self.body = body

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        return self


class CallbackMultiSdkResponse(TeaModel):
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


class ResetProductRedisRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        products: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 要刷新的产品码类型
        self.products = products

    def validate(self):
        self.validate_required(self.products, 'products')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.products is not None:
            result['products'] = self.products
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('products') is not None:
            self.products = m.get('products')
        return self


class ResetProductRedisResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


