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


class AuthAction(TeaModel):
    def __init__(
        self,
        action_code: str = None,
        action_name: str = None,
        product_code: str = None,
        action_level: int = None,
        is_show: bool = None,
        action_description: str = None,
        parent_action_code: str = None,
    ):
        # 权限点编码
        self.action_code = action_code
        # 权限点名称
        self.action_name = action_name
        # 归属产品码
        self.product_code = product_code
        # 权限点级别
        self.action_level = action_level
        # 是否展示
        self.is_show = is_show
        # 权限点描述信息
        self.action_description = action_description
        # 父权限点编码
        self.parent_action_code = parent_action_code

    def validate(self):
        self.validate_required(self.action_code, 'action_code')
        self.validate_required(self.action_name, 'action_name')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.action_level, 'action_level')
        self.validate_required(self.is_show, 'is_show')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_code is not None:
            result['action_code'] = self.action_code
        if self.action_name is not None:
            result['action_name'] = self.action_name
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.action_level is not None:
            result['action_level'] = self.action_level
        if self.is_show is not None:
            result['is_show'] = self.is_show
        if self.action_description is not None:
            result['action_description'] = self.action_description
        if self.parent_action_code is not None:
            result['parent_action_code'] = self.parent_action_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_code') is not None:
            self.action_code = m.get('action_code')
        if m.get('action_name') is not None:
            self.action_name = m.get('action_name')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('action_level') is not None:
            self.action_level = m.get('action_level')
        if m.get('is_show') is not None:
            self.is_show = m.get('is_show')
        if m.get('action_description') is not None:
            self.action_description = m.get('action_description')
        if m.get('parent_action_code') is not None:
            self.parent_action_code = m.get('parent_action_code')
        return self


class ACSUserRole(TeaModel):
    def __init__(
        self,
        product_code: str = None,
        product_role: str = None,
        role_type: str = None,
        role_name: str = None,
        role_description: str = None,
        auth_actions: List[AuthAction] = None,
        role_code: str = None,
        userid: str = None,
    ):
        # 角色归属产品
        self.product_code = product_code
        # 角色编码
        self.product_role = product_role
        # 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
        self.role_type = role_type
        # 角色名称
        self.role_name = role_name
        # 角色描述信息
        self.role_description = role_description
        # 权限点信息
        self.auth_actions = auth_actions
        # 角色code
        self.role_code = role_code
        # 登陆用户名
        self.userid = userid

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_role, 'product_role')
        self.validate_required(self.role_type, 'role_type')
        if self.auth_actions:
            for k in self.auth_actions:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_role is not None:
            result['product_role'] = self.product_role
        if self.role_type is not None:
            result['role_type'] = self.role_type
        if self.role_name is not None:
            result['role_name'] = self.role_name
        if self.role_description is not None:
            result['role_description'] = self.role_description
        result['auth_actions'] = []
        if self.auth_actions is not None:
            for k in self.auth_actions:
                result['auth_actions'].append(k.to_map() if k else None)
        if self.role_code is not None:
            result['role_code'] = self.role_code
        if self.userid is not None:
            result['userid'] = self.userid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_role') is not None:
            self.product_role = m.get('product_role')
        if m.get('role_type') is not None:
            self.role_type = m.get('role_type')
        if m.get('role_name') is not None:
            self.role_name = m.get('role_name')
        if m.get('role_description') is not None:
            self.role_description = m.get('role_description')
        self.auth_actions = []
        if m.get('auth_actions') is not None:
            for k in m.get('auth_actions'):
                temp_model = AuthAction()
                self.auth_actions.append(temp_model.from_map(k))
        if m.get('role_code') is not None:
            self.role_code = m.get('role_code')
        if m.get('userid') is not None:
            self.userid = m.get('userid')
        return self


class ACSUserInfo(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        user_name: str = None,
        user_type: str = None,
        expired: bool = None,
        disabled: bool = None,
        email: str = None,
        phone: str = None,
        expired_time: str = None,
        create_time: str = None,
        update_time: str = None,
        user_roles: List[ACSUserRole] = None,
        password: str = None,
    ):
        # 用户ID
        self.user_id = user_id
        # 用户名称
        self.user_name = user_name
        # 用户类型，OPERATOR：登录用户；SERVICE：服务用户
        self.user_type = user_type
        # 是否已失效
        self.expired = expired
        # 是否被禁用
        self.disabled = disabled
        # 邮箱
        self.email = email
        # 手机号码
        self.phone = phone
        # 失效时间
        self.expired_time = expired_time
        # 创建时间
        self.create_time = create_time
        # 更新时间
        self.update_time = update_time
        # 用户角色
        self.user_roles = user_roles
        # 账户密码
        self.password = password

    def validate(self):
        if self.expired_time is not None:
            self.validate_pattern(self.expired_time, 'expired_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.create_time is not None:
            self.validate_pattern(self.create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.update_time is not None:
            self.validate_pattern(self.update_time, 'update_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.user_roles:
            for k in self.user_roles:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.expired is not None:
            result['expired'] = self.expired
        if self.disabled is not None:
            result['disabled'] = self.disabled
        if self.email is not None:
            result['email'] = self.email
        if self.phone is not None:
            result['phone'] = self.phone
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.update_time is not None:
            result['update_time'] = self.update_time
        result['user_roles'] = []
        if self.user_roles is not None:
            for k in self.user_roles:
                result['user_roles'].append(k.to_map() if k else None)
        if self.password is not None:
            result['password'] = self.password
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('expired') is not None:
            self.expired = m.get('expired')
        if m.get('disabled') is not None:
            self.disabled = m.get('disabled')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        self.user_roles = []
        if m.get('user_roles') is not None:
            for k in m.get('user_roles'):
                temp_model = ACSUserRole()
                self.user_roles.append(temp_model.from_map(k))
        if m.get('password') is not None:
            self.password = m.get('password')
        return self


class ACSRole(TeaModel):
    def __init__(
        self,
        product_code: str = None,
        product_role: str = None,
        role_code: str = None,
        role_name: str = None,
        role_description: str = None,
        role_type: str = None,
    ):
        # 角色归属产品
        self.product_code = product_code
        # 角色编码
        self.product_role = product_role
        # 角色编码
        self.role_code = role_code
        # 角色名称
        self.role_name = role_name
        # 角色描述信息
        self.role_description = role_description
        # 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
        self.role_type = role_type

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_role, 'product_role')
        self.validate_required(self.role_code, 'role_code')
        self.validate_required(self.role_name, 'role_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_role is not None:
            result['product_role'] = self.product_role
        if self.role_code is not None:
            result['role_code'] = self.role_code
        if self.role_name is not None:
            result['role_name'] = self.role_name
        if self.role_description is not None:
            result['role_description'] = self.role_description
        if self.role_type is not None:
            result['role_type'] = self.role_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_role') is not None:
            self.product_role = m.get('product_role')
        if m.get('role_code') is not None:
            self.role_code = m.get('role_code')
        if m.get('role_name') is not None:
            self.role_name = m.get('role_name')
        if m.get('role_description') is not None:
            self.role_description = m.get('role_description')
        if m.get('role_type') is not None:
            self.role_type = m.get('role_type')
        return self


class QueryAccessorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_access_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 网关调用的服务access key
        self.user_access_key = user_access_key

    def validate(self):
        self.validate_required(self.user_access_key, 'user_access_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_access_key is not None:
            result['user_access_key'] = self.user_access_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_access_key') is not None:
            self.user_access_key = m.get('user_access_key')
        return self


class QueryAccessorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_id: str = None,
        user_name: str = None,
        user_type: str = None,
        access_key: str = None,
        access_secret: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户ID
        self.user_id = user_id
        # 用户名称
        self.user_name = user_name
        # SERVICE:服务账号
        # MASTER:登录账号
        self.user_type = user_type
        # 服务账号
        self.access_key = access_key
        # 服务账号对应的密钥
        self.access_secret = access_secret

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
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
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
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        return self


class ListUserwithroleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        prod_code: str = None,
        product_role: str = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品CODE
        self.prod_code = prod_code
        # 产品内的角色信息
        self.product_role = product_role
        # 分页开始序号，默认第一个开始
        self.current_page = current_page
        # 分页大小，未传默认是100
        self.page_size = page_size

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
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.product_role is not None:
            result['product_role'] = self.product_role
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('product_role') is not None:
            self.product_role = m.get('product_role')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListUserwithroleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        page_size: int = None,
        total_page: int = None,
        user_infos: List[ACSUserInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页码
        self.current_page = current_page
        # 页面大小
        self.page_size = page_size
        # 总页数
        self.total_page = total_page
        # 用户信息列表
        self.user_infos = user_infos

    def validate(self):
        if self.user_infos:
            for k in self.user_infos:
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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['user_infos'] = []
        if self.user_infos is not None:
            for k in self.user_infos:
                result['user_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.user_infos = []
        if m.get('user_infos') is not None:
            for k in m.get('user_infos'):
                temp_model = ACSUserInfo()
                self.user_infos.append(temp_model.from_map(k))
        return self


class VerifySessionTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户登录态信息
        self.token = token

    def validate(self):
        self.validate_required(self.token, 'token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class VerifySessionTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_id: str = None,
        user_name: str = None,
        tenant_id: int = None,
        user_type: str = None,
        expired: bool = None,
        disabled: bool = None,
        email: str = None,
        phone: str = None,
        expired_time: str = None,
        change_required: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户ID
        self.user_id = user_id
        # 用户名称
        self.user_name = user_name
        # 私有化中的租户ID（0表示适用所有租户）
        self.tenant_id = tenant_id
        # 用户类型，OPERATOR：登录账号；SERVICE：服务账号
        self.user_type = user_type
        # 是否已失效
        self.expired = expired
        # 是否已冻结
        self.disabled = disabled
        # 邮箱地址
        self.email = email
        # 电话号码
        self.phone = phone
        # 失效时间
        self.expired_time = expired_time
        # 是否需要修改密码
        self.change_required = change_required

    def validate(self):
        if self.expired_time is not None:
            self.validate_pattern(self.expired_time, 'expired_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.expired is not None:
            result['expired'] = self.expired
        if self.disabled is not None:
            result['disabled'] = self.disabled
        if self.email is not None:
            result['email'] = self.email
        if self.phone is not None:
            result['phone'] = self.phone
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.change_required is not None:
            result['change_required'] = self.change_required
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
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('expired') is not None:
            self.expired = m.get('expired')
        if m.get('disabled') is not None:
            self.disabled = m.get('disabled')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('change_required') is not None:
            self.change_required = m.get('change_required')
        return self


class JudgeAuthorityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        token: str = None,
        product_code: str = None,
        action_code: str = None,
        action_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id，和参数token二者必须有一个不能为空
        self.user_id = user_id
        # 用户登录token，和user_id二者必须有一个不能为空，当token不为空时，会先判断token 是否有效，然后进行权限判断
        self.token = token
        # 产品编码
        self.product_code = product_code
        # 对应的权限码或者是角色编码
        self.action_code = action_code
        # 鉴权类型，ROLE：角色鉴权；ACTION：权限点鉴权
        self.action_type = action_type

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.action_code, 'action_code')
        self.validate_required(self.action_type, 'action_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.token is not None:
            result['token'] = self.token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.action_code is not None:
            result['action_code'] = self.action_code
        if self.action_type is not None:
            result['action_type'] = self.action_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('action_code') is not None:
            self.action_code = m.get('action_code')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        return self


class JudgeAuthorityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        judge_result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # true：有权限；false：无权限
        self.judge_result = judge_result

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
        if self.judge_result is not None:
            result['judge_result'] = self.judge_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('judge_result') is not None:
            self.judge_result = m.get('judge_result')
        return self


class ListPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        token: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id，和token二者其中一个必须输入
        self.user_id = user_id
        # 用户登录token，和user_id二者其中一个必须，如果token不为空，则会先进行登录态的检查，没有查到，则返回失败，否则返回用户的权限信息
        self.token = token
        # 产品编码，不传入，返回用户拥有的所有权限，传入则返回用户当前产品的权限信息
        self.product_code = product_code

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
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.token is not None:
            result['token'] = self.token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class ListPolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_roles: List[ACSUserRole] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户的权限角色信息
        self.auth_roles = auth_roles

    def validate(self):
        if self.auth_roles:
            for k in self.auth_roles:
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
        result['auth_roles'] = []
        if self.auth_roles is not None:
            for k in self.auth_roles:
                result['auth_roles'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.auth_roles = []
        if m.get('auth_roles') is not None:
            for k in m.get('auth_roles'):
                temp_model = ACSUserRole()
                self.auth_roles.append(temp_model.from_map(k))
        return self


class QueryUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_name: str = None,
        product_code: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户名称，模糊查询
        self.user_name = user_name
        # 产品编码，表示查询拥有该产品权限的用户列表，为空查询所有有效用户
        self.product_code = product_code
        # 分页查询页数，默认第一页
        self.page_num = page_num
        # 分页大小，默认20
        self.page_size = page_size

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
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.product_code is not None:
            result['product_code'] = self.product_code
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
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_infos: List[ACSUserInfo] = None,
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
        # 用户列表
        self.user_infos = user_infos
        # 传入的页码，没有传入，则取默认值1
        self.page_num = page_num
        # 传入的页大小，如果没有传入，则取默认值20
        self.page_size = page_size
        # 查询结果的总条目数量
        self.total_count = total_count

    def validate(self):
        if self.user_infos:
            for k in self.user_infos:
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
        result['user_infos'] = []
        if self.user_infos is not None:
            for k in self.user_infos:
                result['user_infos'].append(k.to_map() if k else None)
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
        self.user_infos = []
        if m.get('user_infos') is not None:
            for k in m.get('user_infos'):
                temp_model = ACSUserInfo()
                self.user_infos.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class CreateTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        tenant_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 租户名称
        self.tenant_name = tenant_name

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        return self


class CreateTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: int = None,
        tenant_code: str = None,
        tenant_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户ID
        self.tenant_id = tenant_id
        # 租户编码
        self.tenant_code = tenant_code
        # 租户名称
        self.tenant_name = tenant_name

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
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
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
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        return self


class ListAuthActionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品CODE
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


class ListAuthActionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        action_list: List[AuthAction] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 权限点列表
        self.action_list = action_list

    def validate(self):
        if self.action_list:
            for k in self.action_list:
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
        result['action_list'] = []
        if self.action_list is not None:
            for k in self.action_list:
                result['action_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.action_list = []
        if m.get('action_list') is not None:
            for k in m.get('action_list'):
                temp_model = AuthAction()
                self.action_list.append(temp_model.from_map(k))
        return self


class ListRoleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分页查询页数，默认第一页
        self.page_num = page_num
        # 分页大小，默认500
        self.page_size = page_size

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
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListRoleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_page: int = None,
        page_size: int = None,
        total_page: int = None,
        roles: List[ACSRole] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页查询，当前页
        self.current_page = current_page
        # 每页包含条数
        self.page_size = page_size
        # 共10页
        self.total_page = total_page
        # 角色列表
        self.roles = roles

    def validate(self):
        if self.roles:
            for k in self.roles:
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
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['roles'] = []
        if self.roles is not None:
            for k in self.roles:
                result['roles'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.roles = []
        if m.get('roles') is not None:
            for k in m.get('roles'):
                temp_model = ACSRole()
                self.roles.append(temp_model.from_map(k))
        return self


class CreateUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user: ACSUserInfo = None,
        userid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户信息
        self.user = user
        # 用户登陆名
        self.userid = userid

    def validate(self):
        self.validate_required(self.user, 'user')
        if self.user:
            self.user.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user is not None:
            result['user'] = self.user.to_map()
        if self.userid is not None:
            result['userid'] = self.userid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user') is not None:
            temp_model = ACSUserInfo()
            self.user = temp_model.from_map(m['user'])
        if m.get('userid') is not None:
            self.userid = m.get('userid')
        return self


class CreateUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user: ACSUserInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户信息
        self.user = user

    def validate(self):
        if self.user:
            self.user.validate()

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
        if self.user is not None:
            result['user'] = self.user.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user') is not None:
            temp_model = ACSUserInfo()
            self.user = temp_model.from_map(m['user'])
        return self


class UpdateUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user: ACSUserInfo = None,
        userid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户信息
        self.user = user
        # 用户登陆名
        self.userid = userid

    def validate(self):
        self.validate_required(self.user, 'user')
        if self.user:
            self.user.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user is not None:
            result['user'] = self.user.to_map()
        if self.userid is not None:
            result['userid'] = self.userid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user') is not None:
            temp_model = ACSUserInfo()
            self.user = temp_model.from_map(m['user'])
        if m.get('userid') is not None:
            self.userid = m.get('userid')
        return self


class UpdateUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user: ACSUserInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户信息
        self.user = user

    def validate(self):
        if self.user:
            self.user.validate()

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
        if self.user is not None:
            result['user'] = self.user.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user') is not None:
            temp_model = ACSUserInfo()
            self.user = temp_model.from_map(m['user'])
        return self


class DeleteUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        userid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户登陆账号
        self.userid = userid

    def validate(self):
        self.validate_required(self.userid, 'userid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.userid is not None:
            result['userid'] = self.userid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('userid') is not None:
            self.userid = m.get('userid')
        return self


class DeleteUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 删除的结果
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


