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


class Accessor(TeaModel):
    def __init__(
        self,
        access_key: str = None,
        access_secret: str = None,
        account: str = None,
        create_time: str = None,
        id: str = None,
        type: str = None,
    ):
        # Accessor关联的AccessKey
        self.access_key = access_key
        # Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
        self.access_secret = access_secret
        # AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
        self.account = account
        # AccessKey创建时间，ISO8601格式
        self.create_time = create_time
        # Accessor唯一标识
        self.id = id
        # Accessor类型(RAM/ACCOUNT)
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        if self.account is not None:
            result['account'] = self.account
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class Tag(TeaModel):
    def __init__(
        self,
        tag_type: str = None,
        tag_value: str = None,
    ):
        # 标签类型
        self.tag_type = tag_type
        # 标签值
        self.tag_value = tag_value

    def validate(self):
        self.validate_required(self.tag_type, 'tag_type')
        self.validate_required(self.tag_value, 'tag_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tag_type is not None:
            result['tag_type'] = self.tag_type
        if self.tag_value is not None:
            result['tag_value'] = self.tag_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tag_type') is not None:
            self.tag_type = m.get('tag_type')
        if m.get('tag_value') is not None:
            self.tag_value = m.get('tag_value')
        return self


class AccessKey(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        id: str = None,
        secret: str = None,
        status: str = None,
        update_time: str = None,
    ):
        # AccessKey创建时间，ISO8601格式
        self.create_time = create_time
        # AccessKey唯一标识
        self.id = id
        # AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
        self.secret = secret
        # 状态
        self.status = status
        # AccessKey最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.secret is not None:
            result['secret'] = self.secret
        if self.status is not None:
            result['status'] = self.status
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('secret') is not None:
            self.secret = m.get('secret')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class Customer(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        id: str = None,
        name: str = None,
        update_time: str = None,
    ):
        # 企业创建时间，ISO8601格式
        self.create_time = create_time
        # 企业ID
        self.id = id
        # 企业名称
        self.name = name
        # 企业最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class Tenant(TeaModel):
    def __init__(
        self,
        ant_account: str = None,
        ant_uid: str = None,
        business_owner_id: str = None,
        create_time: str = None,
        customer: str = None,
        description: str = None,
        id: str = None,
        internal_id: str = None,
        name: str = None,
        update_time: str = None,
    ):
        # 蚂蚁通行证签约账户
        self.ant_account = ant_account
        # 蚂蚁通行证uid
        self.ant_uid = ant_uid
        # 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
        self.business_owner_id = business_owner_id
        # 租户创建时间，ISO8601格式
        self.create_time = create_time
        # 租户所在的企业的唯一标识
        self.customer = customer
        # 租户描述信息
        self.description = description
        # 租户唯一标识
        self.id = id
        # 租户内部id
        self.internal_id = internal_id
        # 租户显示名称
        self.name = name
        # 租户最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_account is not None:
            result['ant_account'] = self.ant_account
        if self.ant_uid is not None:
            result['ant_uid'] = self.ant_uid
        if self.business_owner_id is not None:
            result['business_owner_id'] = self.business_owner_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.internal_id is not None:
            result['internal_id'] = self.internal_id
        if self.name is not None:
            result['name'] = self.name
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_account') is not None:
            self.ant_account = m.get('ant_account')
        if m.get('ant_uid') is not None:
            self.ant_uid = m.get('ant_uid')
        if m.get('business_owner_id') is not None:
            self.business_owner_id = m.get('business_owner_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('internal_id') is not None:
            self.internal_id = m.get('internal_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class Operator(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        customer: str = None,
        email: str = None,
        external_id: str = None,
        external_system: str = None,
        id: str = None,
        login_name: str = None,
        mobile: str = None,
        nickname: str = None,
        real_name: str = None,
        department_code: str = None,
        status: str = None,
        tenants: List[str] = None,
        update_time: str = None,
    ):
        # 操作员创建时间，ISO8601格式
        self.create_time = create_time
        # 操作员所在的企业
        self.customer = customer
        # 邮箱
        self.email = email
        # 外部对接系统操作员id
        self.external_id = external_id
        # 外部对接系统类型
        self.external_system = external_system
        # 操作员ID
        self.id = id
        # 登录名
        self.login_name = login_name
        # 手机号
        self.mobile = mobile
        # 昵称
        self.nickname = nickname
        # 真实姓名
        self.real_name = real_name
        # 部门唯一码
        self.department_code = department_code
        # 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
        self.status = status
        # 操作员加入的租户列表
        self.tenants = tenants
        # 操作员最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.email is not None:
            result['email'] = self.email
        if self.external_id is not None:
            result['external_id'] = self.external_id
        if self.external_system is not None:
            result['external_system'] = self.external_system
        if self.id is not None:
            result['id'] = self.id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.nickname is not None:
            result['nickname'] = self.nickname
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.department_code is not None:
            result['department_code'] = self.department_code
        if self.status is not None:
            result['status'] = self.status
        if self.tenants is not None:
            result['tenants'] = self.tenants
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('external_id') is not None:
            self.external_id = m.get('external_id')
        if m.get('external_system') is not None:
            self.external_system = m.get('external_system')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('nickname') is not None:
            self.nickname = m.get('nickname')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('department_code') is not None:
            self.department_code = m.get('department_code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tenants') is not None:
            self.tenants = m.get('tenants')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class GetCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        customer: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 企业ID
        self.customer = customer

    def validate(self):
        self.validate_required(self.customer, 'customer')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.customer is not None:
            result['customer'] = self.customer
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        return self


class GetCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        create_time: str = None,
        id: str = None,
        name: str = None,
        update_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建时间，ISO8601格式
        self.create_time = create_time
        # 企业ID
        self.id = id
        # 企业名称
        self.name = name
        # 最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')

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
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class GetOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        login_name: str = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作员登录名
        self.login_name = login_name
        # 金融云操作员id
        self.operator_id = operator_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class GetOperatorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        create_time: str = None,
        customer: str = None,
        email: str = None,
        external_id: str = None,
        external_system: str = None,
        id: str = None,
        login_name: str = None,
        mobile: str = None,
        nickname: str = None,
        real_name: str = None,
        status: str = None,
        tenants: List[str] = None,
        update_time: str = None,
        work_no: str = None,
        is_master: bool = None,
        dd_robot: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作员创建时间，ISO8601格式
        self.create_time = create_time
        # 操作员所在的企业
        self.customer = customer
        # 邮箱
        self.email = email
        # 外部对接系统操作员ID
        self.external_id = external_id
        # 外部对接系统类型
        self.external_system = external_system
        # 操作员ID
        self.id = id
        # 登录名
        self.login_name = login_name
        # 手机号
        self.mobile = mobile
        # 昵称
        self.nickname = nickname
        # 真实姓名
        self.real_name = real_name
        # 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
        self.status = status
        # 操作员归属的用户CODE，现在列表只会有一个元素。
        self.tenants = tenants
        # 操作员最近一次修改时间，ISO8601格式
        self.update_time = update_time
        # 工号
        self.work_no = work_no
        # 是否是主账号
        self.is_master = is_master
        # 钉钉机器人 token
        self.dd_robot = dd_robot

    def validate(self):
        self.validate_required(self.customer, 'customer')
        self.validate_required(self.email, 'email')
        self.validate_required(self.external_id, 'external_id')
        self.validate_required(self.external_system, 'external_system')
        self.validate_required(self.id, 'id')
        self.validate_required(self.login_name, 'login_name')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.nickname, 'nickname')
        self.validate_required(self.real_name, 'real_name')
        self.validate_required(self.status, 'status')

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
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.email is not None:
            result['email'] = self.email
        if self.external_id is not None:
            result['external_id'] = self.external_id
        if self.external_system is not None:
            result['external_system'] = self.external_system
        if self.id is not None:
            result['id'] = self.id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.nickname is not None:
            result['nickname'] = self.nickname
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.status is not None:
            result['status'] = self.status
        if self.tenants is not None:
            result['tenants'] = self.tenants
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.work_no is not None:
            result['work_no'] = self.work_no
        if self.is_master is not None:
            result['is_master'] = self.is_master
        if self.dd_robot is not None:
            result['dd_robot'] = self.dd_robot
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('external_id') is not None:
            self.external_id = m.get('external_id')
        if m.get('external_system') is not None:
            self.external_system = m.get('external_system')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('nickname') is not None:
            self.nickname = m.get('nickname')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tenants') is not None:
            self.tenants = m.get('tenants')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('work_no') is not None:
            self.work_no = m.get('work_no')
        if m.get('is_master') is not None:
            self.is_master = m.get('is_master')
        if m.get('dd_robot') is not None:
            self.dd_robot = m.get('dd_robot')
        return self


class QueryOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        customer: str = None,
        page_num: int = None,
        page_size: int = None,
        real_name: str = None,
        tenant: str = None,
        department_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 企业ID
        self.customer = customer
        # 当前页，默认值为1
        self.page_num = page_num
        # 分页大小，默认值为10
        self.page_size = page_size
        # 真实姓名
        self.real_name = real_name
        # 租户唯一标识
        self.tenant = tenant
        # 部门唯一码
        self.department_code = department_code

    def validate(self):
        self.validate_required(self.customer, 'customer')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.customer is not None:
            result['customer'] = self.customer
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.department_code is not None:
            result['department_code'] = self.department_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('department_code') is not None:
            self.department_code = m.get('department_code')
        return self


class QueryOperatorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        operators: List[Operator] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作员列表
        self.operators = operators
        # 传入的页码, 如果没有传入, 则取默认值1
        self.page_num = page_num
        # 传入的页大小, 如果没有传入, 则取默认值10
        self.page_size = page_size
        # 查询结果的总条目数量
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.operators, 'operators')
        if self.operators:
            for k in self.operators:
                if k:
                    k.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_count, 'total_count')

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
        result['operators'] = []
        if self.operators is not None:
            for k in self.operators:
                result['operators'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        self.operators = []
        if m.get('operators') is not None:
            for k in m.get('operators'):
                temp_model = Operator()
                self.operators.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class SearchOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        customer: str = None,
        login_name: str = None,
        nickname: str = None,
        page_num: int = None,
        page_size: int = None,
        real_name: str = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 企业ID
        self.customer = customer
        # 登录名
        self.login_name = login_name
        # 昵称
        self.nickname = nickname
        # 当前页，默认值为1
        self.page_num = page_num
        # 分页大小，默认值为10
        self.page_size = page_size
        # 真实姓名
        self.real_name = real_name
        # 租户唯一标识
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.customer, 'customer')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.customer is not None:
            result['customer'] = self.customer
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.nickname is not None:
            result['nickname'] = self.nickname
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('nickname') is not None:
            self.nickname = m.get('nickname')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class SearchOperatorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        operators: List[Operator] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作员列表
        self.operators = operators
        # 传入的页码, 如果没有传入, 则取默认值1
        self.page_num = page_num
        # 传入的页大小, 如果没有传入, 则取默认值10
        self.page_size = page_size
        # 查询结果的总条目数量
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.operators, 'operators')
        if self.operators:
            for k in self.operators:
                if k:
                    k.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_count, 'total_count')

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
        result['operators'] = []
        if self.operators is not None:
            for k in self.operators:
                result['operators'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
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
        self.operators = []
        if m.get('operators') is not None:
            for k in m.get('operators'):
                temp_model = Operator()
                self.operators.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class CreateOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        customer: str = None,
        external_id: str = None,
        external_system: str = None,
        login_name: str = None,
        mobile: str = None,
        nickname: str = None,
        real_name: str = None,
        tenant: str = None,
        work_no: str = None,
        bussiness_code: str = None,
        encrypted_password: str = None,
        reset_password_when_first_login: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 企业唯一标识
        self.customer = customer
        # 外部对接系统操作员ID
        self.external_id = external_id
        # 外部对接系统类型
        self.external_system = external_system
        # 操作员唯一登录名
        self.login_name = login_name
        # 手机号
        self.mobile = mobile
        # 操作员昵称
        self.nickname = nickname
        # 操作员真实姓名
        self.real_name = real_name
        # 租户唯一标识
        self.tenant = tenant
        # 工号
        self.work_no = work_no
        # 业务场景码
        self.bussiness_code = bussiness_code
        # 加密密码
        self.encrypted_password = encrypted_password
        # 首次登录是否需要重置密码，取值范围：true, false，默认为 false
        self.reset_password_when_first_login = reset_password_when_first_login

    def validate(self):
        self.validate_required(self.login_name, 'login_name')
        self.validate_required(self.real_name, 'real_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.customer is not None:
            result['customer'] = self.customer
        if self.external_id is not None:
            result['external_id'] = self.external_id
        if self.external_system is not None:
            result['external_system'] = self.external_system
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.nickname is not None:
            result['nickname'] = self.nickname
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.work_no is not None:
            result['work_no'] = self.work_no
        if self.bussiness_code is not None:
            result['bussiness_code'] = self.bussiness_code
        if self.encrypted_password is not None:
            result['encrypted_password'] = self.encrypted_password
        if self.reset_password_when_first_login is not None:
            result['reset_password_when_first_login'] = self.reset_password_when_first_login
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('external_id') is not None:
            self.external_id = m.get('external_id')
        if m.get('external_system') is not None:
            self.external_system = m.get('external_system')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('nickname') is not None:
            self.nickname = m.get('nickname')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('work_no') is not None:
            self.work_no = m.get('work_no')
        if m.get('bussiness_code') is not None:
            self.bussiness_code = m.get('bussiness_code')
        if m.get('encrypted_password') is not None:
            self.encrypted_password = m.get('encrypted_password')
        if m.get('reset_password_when_first_login') is not None:
            self.reset_password_when_first_login = m.get('reset_password_when_first_login')
        return self


class CreateOperatorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        operator_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作员唯一ID
        self.operator_id = operator_id

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
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class UpdateOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        email: str = None,
        mobile: str = None,
        nickname: str = None,
        operator_id: str = None,
        real_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 邮箱
        self.email = email
        # 手机号
        self.mobile = mobile
        # 操作员昵称
        self.nickname = nickname
        # 操作员唯一ID
        self.operator_id = operator_id
        # 操作员真实姓名
        self.real_name = real_name

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.email is not None:
            result['email'] = self.email
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.nickname is not None:
            result['nickname'] = self.nickname
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.real_name is not None:
            result['real_name'] = self.real_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('nickname') is not None:
            self.nickname = m.get('nickname')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        return self


class UpdateOperatorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        create_time: str = None,
        customer: str = None,
        email: str = None,
        id: str = None,
        login_name: str = None,
        mobile: str = None,
        nickname: str = None,
        real_name: str = None,
        status: str = None,
        tenants: List[str] = None,
        update_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作员创建时间，ISO8601格式
        self.create_time = create_time
        # 操作员所在的企业
        self.customer = customer
        # 邮箱
        self.email = email
        # 操作员ID
        self.id = id
        # 登录名
        self.login_name = login_name
        # 手机号
        self.mobile = mobile
        # 昵称
        self.nickname = nickname
        # 真实姓名
        self.real_name = real_name
        # 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
        self.status = status
        # 用户加入的租户列表
        self.tenants = tenants
        # 操作员最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        self.validate_required(self.customer, 'customer')
        self.validate_required(self.email, 'email')
        self.validate_required(self.id, 'id')
        self.validate_required(self.login_name, 'login_name')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.nickname, 'nickname')
        self.validate_required(self.real_name, 'real_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.tenants, 'tenants')

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
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.email is not None:
            result['email'] = self.email
        if self.id is not None:
            result['id'] = self.id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.nickname is not None:
            result['nickname'] = self.nickname
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.status is not None:
            result['status'] = self.status
        if self.tenants is not None:
            result['tenants'] = self.tenants
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('nickname') is not None:
            self.nickname = m.get('nickname')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tenants') is not None:
            self.tenants = m.get('tenants')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class DeleteOperatorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作员唯一id
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class DeleteOperatorResponse(TeaModel):
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


class AddTenantMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_id: str = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作员唯一id
        self.operator_id = operator_id
        # 操作员唯一id
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class AddTenantMemberResponse(TeaModel):
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


class CreateTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        ant_uid: str = None,
        business_owner_id: str = None,
        name: str = None,
        display_name: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 蚂蚁通行证uid
        self.ant_uid = ant_uid
        # 金融云官网:ANTCLOUD, 蚂蚁开放平台：ANTOPEN, 口碑：KOUBEI
        self.business_owner_id = business_owner_id
        # 租户名称，如果为空则随机生成
        self.name = name
        # 显示名称
        self.display_name = display_name
        # 描述信息
        self.description = description

    def validate(self):
        self.validate_required(self.ant_uid, 'ant_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.ant_uid is not None:
            result['ant_uid'] = self.ant_uid
        if self.business_owner_id is not None:
            result['business_owner_id'] = self.business_owner_id
        if self.name is not None:
            result['name'] = self.name
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('ant_uid') is not None:
            self.ant_uid = m.get('ant_uid')
        if m.get('business_owner_id') is not None:
            self.business_owner_id = m.get('business_owner_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class CreateTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户唯一标识
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.tenant, 'tenant')

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
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class GetTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户唯一标识
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class GetTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        ant_account: str = None,
        ant_uid: str = None,
        business_owner_id: str = None,
        create_time: str = None,
        customer: str = None,
        description: str = None,
        id: str = None,
        internal_id: str = None,
        name: str = None,
        update_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 蚂蚁通行证签约账户
        self.ant_account = ant_account
        # 用户ID
        self.ant_uid = ant_uid
        # 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
        self.business_owner_id = business_owner_id
        # 租户创建时间，ISO8601格式
        self.create_time = create_time
        # 租户所在的企业的唯一标识
        self.customer = customer
        # 租户描述信息
        self.description = description
        # 租户唯一标识
        self.id = id
        # 租户内部id
        self.internal_id = internal_id
        # 用户CODE
        self.name = name
        # 租户最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        self.validate_required(self.ant_account, 'ant_account')
        self.validate_required(self.business_owner_id, 'business_owner_id')

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
        if self.ant_account is not None:
            result['ant_account'] = self.ant_account
        if self.ant_uid is not None:
            result['ant_uid'] = self.ant_uid
        if self.business_owner_id is not None:
            result['business_owner_id'] = self.business_owner_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.internal_id is not None:
            result['internal_id'] = self.internal_id
        if self.name is not None:
            result['name'] = self.name
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('ant_account') is not None:
            self.ant_account = m.get('ant_account')
        if m.get('ant_uid') is not None:
            self.ant_uid = m.get('ant_uid')
        if m.get('business_owner_id') is not None:
            self.business_owner_id = m.get('business_owner_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('internal_id') is not None:
            self.internal_id = m.get('internal_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class QueryTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        customer: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 企业唯一标识
        self.customer = customer
        # 当前页，默认值为1
        self.page_num = page_num
        # 分页大小，默认值为10
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.customer, 'customer')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.customer is not None:
            result['customer'] = self.customer
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_num: int = None,
        page_size: int = None,
        tenants: List[Tenant] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 传入的页码, 如果没有传入, 则取默认值1
        self.page_num = page_num
        # 传入的页大小, 如果没有传入, 则取默认值10
        self.page_size = page_size
        # 租户列表
        self.tenants = tenants
        # 查询结果的总条目数量
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.tenants, 'tenants')
        if self.tenants:
            for k in self.tenants:
                if k:
                    k.validate()
        self.validate_required(self.total_count, 'total_count')

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
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['tenants'] = []
        if self.tenants is not None:
            for k in self.tenants:
                result['tenants'].append(k.to_map() if k else None)
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
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.tenants = []
        if m.get('tenants') is not None:
            for k in m.get('tenants'):
                temp_model = Tenant()
                self.tenants.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class GetAntpassportTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        ant_uid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 蚂蚁通行证uid
        self.ant_uid = ant_uid

    def validate(self):
        self.validate_required(self.ant_uid, 'ant_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.ant_uid is not None:
            result['ant_uid'] = self.ant_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('ant_uid') is not None:
            self.ant_uid = m.get('ant_uid')
        return self


class GetAntpassportTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.tenant, 'tenant')

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
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class GetCurrentidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class GetCurrentidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        create_time: str = None,
        customer: str = None,
        id: str = None,
        type: str = None,
        update_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建时间，ISO8601格式
        self.create_time = create_time
        # 身份实体所属企业
        self.customer = customer
        # 身份实体ID
        self.id = id
        # 身份实体类型，OPERATOR(操作员)或SERVICE(服务账号)
        self.type = type
        # 最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.customer, 'customer')
        self.validate_required(self.id, 'id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.update_time, 'update_time')

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
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class GetTenantDingtokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product: str = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 入驻金融云的产品码
        self.product = product
        # 租户唯一标识
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.product, 'product')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product is not None:
            result['product'] = self.product
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product') is not None:
            self.product = m.get('product')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class GetTenantDingtokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_token: str = None,
        agent_id: str = None,
        corp_id: str = None,
        create_time: str = None,
        js_ticket: str = None,
        update_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 钉钉企业授权token
        self.access_token = access_token
        # 钉钉企业授权应用ID
        self.agent_id = agent_id
        # 钉钉企业ID
        self.corp_id = corp_id
        # 创建时间，ISO8601格式
        self.create_time = create_time
        # 前端授权ticket
        self.js_ticket = js_ticket
        # 最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.agent_id, 'agent_id')
        self.validate_required(self.corp_id, 'corp_id')
        self.validate_required(self.js_ticket, 'js_ticket')

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
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.corp_id is not None:
            result['corp_id'] = self.corp_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.js_ticket is not None:
            result['js_ticket'] = self.js_ticket
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('corp_id') is not None:
            self.corp_id = m.get('corp_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('js_ticket') is not None:
            self.js_ticket = m.get('js_ticket')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class QueryAdminRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户唯一标识
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class QueryAdminResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        operators: List[Operator] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作员列表
        self.operators = operators

    def validate(self):
        self.validate_required(self.operators, 'operators')
        if self.operators:
            for k in self.operators:
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
        result['operators'] = []
        if self.operators is not None:
            for k in self.operators:
                result['operators'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.operators = []
        if m.get('operators') is not None:
            for k in m.get('operators'):
                temp_model = Operator()
                self.operators.append(temp_model.from_map(k))
        return self


class GetTenantIaasaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant: str = None,
        source_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户唯一标识
        self.tenant = tenant
        # 一方化调用参数，阿里云服务名
        self.source_id = source_id

    def validate(self):
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.source_id is not None:
            result['source_id'] = self.source_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('source_id') is not None:
            self.source_id = m.get('source_id')
        return self


class GetTenantIaasaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_key: str = None,
        access_secret: str = None,
        account: str = None,
        create_time: str = None,
        id: str = None,
        access_token: str = None,
        sts_mode: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户关联的AccessKey
        self.access_key = access_key
        # 账户关联的AccessSecret
        self.access_secret = access_secret
        # IaaS账户名
        self.account = account
        # 创建时间，ISO8601格式
        self.create_time = create_time
        # IaaS账户id
        self.id = id
        # sts token
        self.access_token = access_token
        # 是否是sts模式
        self.sts_mode = sts_mode

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
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        if self.account is not None:
            result['account'] = self.account
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.sts_mode is not None:
            result['sts_mode'] = self.sts_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('sts_mode') is not None:
            self.sts_mode = m.get('sts_mode')
        return self


class ListCustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class ListCustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        customers: List[Customer] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业列表
        self.customers = customers

    def validate(self):
        self.validate_required(self.customers, 'customers')
        if self.customers:
            for k in self.customers:
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
        result['customers'] = []
        if self.customers is not None:
            for k in self.customers:
                result['customers'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.customers = []
        if m.get('customers') is not None:
            for k in m.get('customers'):
                temp_model = Customer()
                self.customers.append(temp_model.from_map(k))
        return self


class CheckAlipayTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cert_no: str = None,
        channel_code: str = None,
        firm_name: str = None,
        real_name: str = None,
        scene_code: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 支付宝账号关联的证件号
        self.cert_no = cert_no
        # 渠道编码 ，新接入时需要申请
        self.channel_code = channel_code
        # 企业名称
        self.firm_name = firm_name
        # 法人姓名
        self.real_name = real_name
        # 业务场景编码
        self.scene_code = scene_code
        # 智科租户id(支付宝账号会员id）
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.channel_code, 'channel_code')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class CheckAlipayTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 智科租户id(支付宝会员id)
        self.tenant_id = tenant_id

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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryTenantStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        channel_code: str = None,
        scene_code: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 渠道码，接入时需要申请
        self.channel_code = channel_code
        # 业务场景码，接入时需要申请
        self.scene_code = scene_code
        # 智科租户id（支付宝会员id)
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.channel_code, 'channel_code')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryTenantStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        tenant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户入住状态
        self.status = status
        # 智科租户id（支付宝会员id）
        self.tenant_id = tenant_id

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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
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
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class CreateAntchainTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        user_type: str = None,
        cert_no: str = None,
        cert_type: str = None,
        real_name: str = None,
        artificial_person_cert_no: str = None,
        artificial_person_cert_type: str = None,
        login_name: str = None,
        tenant_id: str = None,
        bussiness_code: str = None,
        bussiness_role: str = None,
        is_alipay_tenant: bool = None,
        antchain_certified: bool = None,
        source_user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 企业名称或个人名称
        self.name = name
        # 客户类型
        # PERSON("个人","1"),
        # ENTERPRISE("企业","2")
        self.user_type = user_type
        # 证件号
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 法人姓名
        self.real_name = real_name
        # 法人证件号
        self.artificial_person_cert_no = artificial_person_cert_no
        # 法人证件类型
        self.artificial_person_cert_type = artificial_person_cert_type
        # 支付宝登录号
        self.login_name = login_name
        # 支付宝uid(租户id)
        self.tenant_id = tenant_id
        # 业务场景码
        self.bussiness_code = bussiness_code
        # 在平台上的角色，比如服务提供方，服务消费方，合作机构，资金提供方
        self.bussiness_role = bussiness_role
        # 是否支付宝账户入驻
        self.is_alipay_tenant = is_alipay_tenant
        # 是否认证过，不填默认未认证
        self.antchain_certified = antchain_certified
        # 外部系统的会员ID，用于幂等
        self.source_user_id = source_user_id

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.bussiness_code, 'bussiness_code')
        self.validate_required(self.is_alipay_tenant, 'is_alipay_tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.artificial_person_cert_no is not None:
            result['artificial_person_cert_no'] = self.artificial_person_cert_no
        if self.artificial_person_cert_type is not None:
            result['artificial_person_cert_type'] = self.artificial_person_cert_type
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.bussiness_code is not None:
            result['bussiness_code'] = self.bussiness_code
        if self.bussiness_role is not None:
            result['bussiness_role'] = self.bussiness_role
        if self.is_alipay_tenant is not None:
            result['is_alipay_tenant'] = self.is_alipay_tenant
        if self.antchain_certified is not None:
            result['antchain_certified'] = self.antchain_certified
        if self.source_user_id is not None:
            result['source_user_id'] = self.source_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('artificial_person_cert_no') is not None:
            self.artificial_person_cert_no = m.get('artificial_person_cert_no')
        if m.get('artificial_person_cert_type') is not None:
            self.artificial_person_cert_type = m.get('artificial_person_cert_type')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('bussiness_code') is not None:
            self.bussiness_code = m.get('bussiness_code')
        if m.get('bussiness_role') is not None:
            self.bussiness_role = m.get('bussiness_role')
        if m.get('is_alipay_tenant') is not None:
            self.is_alipay_tenant = m.get('is_alipay_tenant')
        if m.get('antchain_certified') is not None:
            self.antchain_certified = m.get('antchain_certified')
        if m.get('source_user_id') is not None:
            self.source_user_id = m.get('source_user_id')
        return self


class CreateAntchainTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: str = None,
        customer_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户id
        self.tenant_id = tenant_id
        # 客户id
        self.customer_id = customer_id

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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        return self


class UpdateCustomerIdentityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        customer_id: str = None,
        name: str = None,
        tenant_id: str = None,
        cert_no: str = None,
        cert_type: str = None,
        real_name: str = None,
        artificial_person_cert_no: str = None,
        artificial_person_cert_type: str = None,
        business_code: str = None,
        bussiness_role: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 客户id
        self.customer_id = customer_id
        # 企业名称或个人名称
        self.name = name
        # 租户id
        self.tenant_id = tenant_id
        # 证件号
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 法人姓名
        self.real_name = real_name
        # 法人证件号码
        self.artificial_person_cert_no = artificial_person_cert_no
        # 法人证件类型
        self.artificial_person_cert_type = artificial_person_cert_type
        # 业务场景码
        self.business_code = business_code
        # 业务角色
        self.bussiness_role = bussiness_role

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.business_code, 'business_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.name is not None:
            result['name'] = self.name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.artificial_person_cert_no is not None:
            result['artificial_person_cert_no'] = self.artificial_person_cert_no
        if self.artificial_person_cert_type is not None:
            result['artificial_person_cert_type'] = self.artificial_person_cert_type
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.bussiness_role is not None:
            result['bussiness_role'] = self.bussiness_role
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('artificial_person_cert_no') is not None:
            self.artificial_person_cert_no = m.get('artificial_person_cert_no')
        if m.get('artificial_person_cert_type') is not None:
            self.artificial_person_cert_type = m.get('artificial_person_cert_type')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('bussiness_role') is not None:
            self.bussiness_role = m.get('bussiness_role')
        return self


class UpdateCustomerIdentityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        customer_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回客户id
        self.customer_id = customer_id

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
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        return self


class GetMasterTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 主账号id
        self.tenant_id = tenant_id
        # 用户CODE
        self.name = name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class GetMasterTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        login_name: str = None,
        tenant_id: str = None,
        create_time: str = None,
        customer_id: str = None,
        description: str = None,
        name: str = None,
        update_time: str = None,
        user_type: str = None,
        tenant_level: str = None,
        cert_type: str = None,
        cert_no: str = None,
        real_name: str = None,
        firm_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 蚂蚁通行证签约账户
        self.login_name = login_name
        # 租户id
        self.tenant_id = tenant_id
        # 租户创建时间，ISO8601格式
        self.create_time = create_time
        # 客户id
        self.customer_id = customer_id
        # 租户描述信息
        self.description = description
        # 租户名称
        self.name = name
        # 租户最近一次修改时间，ISO8601格式
        self.update_time = update_time
        # 用户类型
        self.user_type = user_type
        # 租户的类型 N 支付宝 Q支付宝开放平台 V 蚂蚁链账号
        self.tenant_level = tenant_level
        # 证件类型
        self.cert_type = cert_type
        # 证件号码
        self.cert_no = cert_no
        # 法人姓名，个人账号时是个人姓名
        self.real_name = real_name
        # 企业姓名
        self.firm_name = firm_name

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
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.description is not None:
            result['description'] = self.description
        if self.name is not None:
            result['name'] = self.name
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.tenant_level is not None:
            result['tenant_level'] = self.tenant_level
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.firm_name is not None:
            result['firm_name'] = self.firm_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('tenant_level') is not None:
            self.tenant_level = m.get('tenant_level')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('firm_name') is not None:
            self.firm_name = m.get('firm_name')
        return self


class CheckLoginnameRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        login_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 邮箱名称
        self.login_name = login_name

    def validate(self):
        self.validate_required(self.login_name, 'login_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.login_name is not None:
            result['login_name'] = self.login_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class CheckLoginnameResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        exist: bool = None,
        tenant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否存在
        self.exist = exist
        # 所属租户ID
        self.tenant_id = tenant_id

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
        if self.exist is not None:
            result['exist'] = self.exist
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('exist') is not None:
            self.exist = m.get('exist')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryTenantTagRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryTenantTagResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tags: List[Tag] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 标签列表
        self.tags = tags

    def validate(self):
        if self.tags:
            for k in self.tags:
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
        result['tags'] = []
        if self.tags is not None:
            for k in self.tags:
                result['tags'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.tags = []
        if m.get('tags') is not None:
            for k in m.get('tags'):
                temp_model = Tag()
                self.tags.append(temp_model.from_map(k))
        return self


class AddTenantBusinesstagRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        business_code: str = None,
        auth_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 业务场景码
        self.business_code = business_code
        # 业务场景的权限码，区分大小写
        self.auth_code = auth_code

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.auth_code, 'auth_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        return self


class AddTenantBusinesstagResponse(TeaModel):
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


class RemoveTenantBusinesstagRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        business_code: str = None,
        auth_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 业务场景码
        self.business_code = business_code
        # 业务场景的权限吗
        self.auth_code = auth_code

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.business_code, 'business_code')
        self.validate_required(self.auth_code, 'auth_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.auth_code is not None:
            result['auth_code'] = self.auth_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('auth_code') is not None:
            self.auth_code = m.get('auth_code')
        return self


class RemoveTenantBusinesstagResponse(TeaModel):
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


class SendOperatorActiveemailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作员ID
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class SendOperatorActiveemailResponse(TeaModel):
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


class SyncTenantInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 账号ID
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class SyncTenantInfoResponse(TeaModel):
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


class CreateOauthServiceaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        access_token: str = None,
        description: str = None,
        alias: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 三方授权凭证
        self.access_token = access_token
        # 服务账号描述
        self.description = description
        # 服务账号别名
        self.alias = alias

    def validate(self):
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.description, 'description')
        self.validate_required(self.alias, 'alias')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.description is not None:
            result['description'] = self.description
        if self.alias is not None:
            result['alias'] = self.alias
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        return self


class CreateOauthServiceaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: str = None,
        description: str = None,
        alias: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 服务账号ID
        self.id = id
        # 服务账号描述
        self.description = description
        # 服务账号别名
        self.alias = alias

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
        if self.id is not None:
            result['id'] = self.id
        if self.description is not None:
            result['description'] = self.description
        if self.alias is not None:
            result['alias'] = self.alias
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        return self


class GetOauthServiceaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        access_token: str = None,
        service_account_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 三方授权凭证
        self.access_token = access_token
        # 服务账号ID
        self.service_account_id = service_account_id

    def validate(self):
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.service_account_id, 'service_account_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.service_account_id is not None:
            result['service_account_id'] = self.service_account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('service_account_id') is not None:
            self.service_account_id = m.get('service_account_id')
        return self


class GetOauthServiceaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_key: str = None,
        access_secret: str = None,
        alias: str = None,
        description: str = None,
        id: str = None,
        name: str = None,
        tenant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 服务账号AK
        self.access_key = access_key
        # 服务账号SK
        self.access_secret = access_secret
        # 服务账号别名
        self.alias = alias
        # 服务账号描述
        self.description = description
        # 服务账号ID
        self.id = id
        # 服务名称
        self.name = name
        # 服务账号归属的账号ID
        self.tenant_id = tenant_id

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
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        if self.alias is not None:
            result['alias'] = self.alias
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('alias') is not None:
            self.alias = m.get('alias')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class EnableOauthMobileloginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        access_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 三方授权凭证
        self.access_token = access_token

    def validate(self):
        self.validate_required(self.access_token, 'access_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class EnableOauthMobileloginResponse(TeaModel):
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


class DisableOauthMobileloginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        access_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 三方授权凭证
        self.access_token = access_token

    def validate(self):
        self.validate_required(self.access_token, 'access_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class DisableOauthMobileloginResponse(TeaModel):
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


class CreateServiceaccountOnepartyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        source_system: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 系统来源
        self.source_system = source_system

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.source_system, 'source_system')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.source_system is not None:
            result['source_system'] = self.source_system
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('source_system') is not None:
            self.source_system = m.get('source_system')
        return self


class CreateServiceaccountOnepartyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_key: str = None,
        access_secret: str = None,
        user_id: str = None,
        user_type: str = None,
        status: str = None,
        tenant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # accessKey
        self.access_key = access_key
        # accessSecret
        self.access_secret = access_secret
        # 用户ID
        self.user_id = user_id
        # 用户类型
        self.user_type = user_type
        # ak状态
        self.status = status
        # 租户ID
        self.tenant_id = tenant_id

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
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.status is not None:
            result['status'] = self.status
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class GetServiceaccountOnepartyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        source_system: str = None,
        iam_access_key: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 系统来源
        self.source_system = source_system
        # accessKey
        self.iam_access_key = iam_access_key
        # 用户id（服务账号）。和iam_access_key参数二选一
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.source_system, 'source_system')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.source_system is not None:
            result['source_system'] = self.source_system
        if self.iam_access_key is not None:
            result['iam_access_key'] = self.iam_access_key
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('source_system') is not None:
            self.source_system = m.get('source_system')
        if m.get('iam_access_key') is not None:
            self.iam_access_key = m.get('iam_access_key')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class GetServiceaccountOnepartyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: str = None,
        user_id: str = None,
        user_type: str = None,
        access_key: str = None,
        access_secret: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户ID
        self.tenant_id = tenant_id
        # 用户ID
        self.user_id = user_id
        # 用户类型
        self.user_type = user_type
        # accessKey
        self.access_key = access_key
        # accessSecret
        self.access_secret = access_secret
        # status
        self.status = status

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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
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
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ApplyTrustloginTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        source_system: str = None,
        login_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户ID
        # 
        self.user_id = user_id
        # 系统来源
        self.source_system = source_system
        # 登录账号
        # 
        self.login_name = login_name

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.source_system, 'source_system')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.source_system is not None:
            result['source_system'] = self.source_system
        if self.login_name is not None:
            result['login_name'] = self.login_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('source_system') is not None:
            self.source_system = m.get('source_system')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class ApplyTrustloginTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_id: str = None,
        access_token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户ID
        # 
        self.user_id = user_id
        # 用于登录的token
        # 
        self.access_token = access_token

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
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class VerifyTrustloginTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source_system: str = None,
        access_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 系统来源
        # 
        self.source_system = source_system
        # 申请免密登录时获取的token
        # 
        self.access_token = access_token

    def validate(self):
        self.validate_required(self.source_system, 'source_system')
        self.validate_required(self.access_token, 'access_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source_system is not None:
            result['source_system'] = self.source_system
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source_system') is not None:
            self.source_system = m.get('source_system')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class VerifyTrustloginTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_id: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户ID
        # 
        self.user_id = user_id
        # 验证结果，VALID有效，INVALID无效
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
        if self.user_id is not None:
            result['user_id'] = self.user_id
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
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


