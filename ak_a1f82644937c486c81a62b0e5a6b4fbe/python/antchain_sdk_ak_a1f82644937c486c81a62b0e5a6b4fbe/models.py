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


class QueryAntchainAbcAbcdaAbcddaaRequest(TeaModel):
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


class QueryAntchainAbcAbcdaAbcddaaResponse(TeaModel):
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


class BindDemoAaaBbbCccRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        date: str = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.date = date
        # 123
        self.data = data

    def validate(self):
        self.validate_required(self.date, 'date')
        if self.date is not None:
            self.validate_pattern(self.date, 'date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.date is not None:
            result['date'] = self.date
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class BindDemoAaaBbbCccResponse(TeaModel):
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


class BindAntchainSaasAbilityRequest(TeaModel):
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


class BindAntchainSaasAbilityResponse(TeaModel):
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


class QueryDemoAbcAbcAbcRequest(TeaModel):
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


class QueryDemoAbcAbcAbcResponse(TeaModel):
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


class CallbackAntchainSaasAbilityRequest(TeaModel):
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


class CallbackAntchainSaasAbilityResponse(TeaModel):
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


class BindAntchainSaasAbilityApiRequest(TeaModel):
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


class BindAntchainSaasAbilityApiResponse(TeaModel):
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


class QueryAntchainSaasAbilityBusinesscodeRequest(TeaModel):
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


class QueryAntchainSaasAbilityBusinesscodeResponse(TeaModel):
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


