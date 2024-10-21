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


class ExpenditureQuotationItemResult(TeaModel):
    def __init__(
        self,
        out_unique_id: str = None,
        arrangement_no: str = None,
    ):
        # 支出配置单商品维度的外部唯一id
        self.out_unique_id = out_unique_id
        # 支出配置单商品合约号
        self.arrangement_no = arrangement_no

    def validate(self):
        self.validate_required(self.out_unique_id, 'out_unique_id')
        self.validate_required(self.arrangement_no, 'arrangement_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_unique_id is not None:
            result['out_unique_id'] = self.out_unique_id
        if self.arrangement_no is not None:
            result['arrangement_no'] = self.arrangement_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_unique_id') is not None:
            self.out_unique_id = m.get('out_unique_id')
        if m.get('arrangement_no') is not None:
            self.arrangement_no = m.get('arrangement_no')
        return self


class TradeFulfillResult(TeaModel):
    def __init__(
        self,
        fulfill_order_no: str = None,
        fulfill_type: str = None,
        tenant_id: str = None,
        commodity_code: str = None,
        instance_id: str = None,
    ):
        # 履约单据号，可用于作为幂等依据
        self.fulfill_order_no = fulfill_order_no
        # 履约枚举，生产-PROVISION，停服-STOP，释放-RELEASE，恢复/RESUME
        # 
        self.fulfill_type = fulfill_type
        # 租户ID
        self.tenant_id = tenant_id
        # 主商品编码
        self.commodity_code = commodity_code
        # 履约实例ID
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.fulfill_order_no, 'fulfill_order_no')
        self.validate_required(self.fulfill_type, 'fulfill_type')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.fulfill_order_no is not None:
            result['fulfill_order_no'] = self.fulfill_order_no
        if self.fulfill_type is not None:
            result['fulfill_type'] = self.fulfill_type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fulfill_order_no') is not None:
            self.fulfill_order_no = m.get('fulfill_order_no')
        if m.get('fulfill_type') is not None:
            self.fulfill_type = m.get('fulfill_type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class DiscreteValue(TeaModel):
    def __init__(
        self,
        text: str = None,
        value: str = None,
        unit: str = None,
        tips: str = None,
        sort_id: int = None,
    ):
        # 组件展示的内容
        self.text = text
        # 组件的具体值
        self.value = value
        # 组件值的单位
        self.unit = unit
        # 组件选中值的说明/提示
        self.tips = tips
        # 多个组件展示的顺序
        self.sort_id = sort_id

    def validate(self):
        self.validate_required(self.text, 'text')
        self.validate_required(self.value, 'value')
        self.validate_required(self.sort_id, 'sort_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.text is not None:
            result['text'] = self.text
        if self.value is not None:
            result['value'] = self.value
        if self.unit is not None:
            result['unit'] = self.unit
        if self.tips is not None:
            result['tips'] = self.tips
        if self.sort_id is not None:
            result['sort_id'] = self.sort_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('text') is not None:
            self.text = m.get('text')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('tips') is not None:
            self.tips = m.get('tips')
        if m.get('sort_id') is not None:
            self.sort_id = m.get('sort_id')
        return self


class OrderResult(TeaModel):
    def __init__(
        self,
        instance_id: str = None,
        success: bool = None,
    ):
        # 实例Id
        self.instance_id = instance_id
        # 是否生成成功
        self.success = success

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        if self.instance_id is not None:
            self.validate_max_length(self.instance_id, 'instance_id', 10)
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('success') is not None:
            self.success = m.get('success')
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


class ApiChange(TeaModel):
    def __init__(
        self,
        change_type: str = None,
        api_names: List[str] = None,
    ):
        # 变更类型，ADD-新增，DELETE-删除
        self.change_type = change_type
        # API名称列表
        self.api_names = api_names

    def validate(self):
        self.validate_required(self.change_type, 'change_type')
        self.validate_required(self.api_names, 'api_names')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.change_type is not None:
            result['change_type'] = self.change_type
        if self.api_names is not None:
            result['api_names'] = self.api_names
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('change_type') is not None:
            self.change_type = m.get('change_type')
        if m.get('api_names') is not None:
            self.api_names = m.get('api_names')
        return self


class UpdateAbilityChainAccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        biz_id: str = None,
        chain_id: str = None,
        tenant_id: str = None,
        chain_user_id: str = None,
        type: str = None,
        value: int = None,
        extend_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 业务流水，请求幂等号
        self.biz_id = biz_id
        # 链id，每个合约独立的标识
        self.chain_id = chain_id
        # 租户名。目前理解 chain_id + tenant_id + chain_user_id 能唯一标识某个合约上的某个账号
        self.tenant_id = tenant_id
        # 链上账号。链上唯一账号。某些特定场景（比如某个租户可以在一个合约上不同平台方参与分润），会需要合约账户id
        self.chain_user_id = chain_user_id
        # decrease 减少 increase 增加
        self.type = type
        # 金额，单位：分。
        self.value = value
        # 扩展字段，json格式
        self.extend_params = extend_params

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.chain_id, 'chain_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.chain_user_id is not None:
            result['chain_user_id'] = self.chain_user_id
        if self.type is not None:
            result['type'] = self.type
        if self.value is not None:
            result['value'] = self.value
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('chain_user_id') is not None:
            self.chain_user_id = m.get('chain_user_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        return self


class UpdateAbilityChainAccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值对象,json格式。
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
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
            self.data = m.get('data')
        return self


class UpdateAbilityChainAssetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        biz_id: str = None,
        chain_id: str = None,
        tenant_id: str = None,
        chain_user_id: str = None,
        token_amount: int = None,
        token_number: str = None,
        extend_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 流水号
        self.biz_id = biz_id
        # 链id，链上合约id
        self.chain_id = chain_id
        # 租户id
        self.tenant_id = tenant_id
        # 链上用户id
        self.chain_user_id = chain_user_id
        # 链上token金额，价值现金。单元：分
        self.token_amount = token_amount
        # token链上数量。与现金有一定的兑换率。
        self.token_number = token_number
        # 扩展字段，json格式
        self.extend_params = extend_params

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.chain_id, 'chain_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.token_amount, 'token_amount')
        self.validate_required(self.token_number, 'token_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.chain_id is not None:
            result['chain_id'] = self.chain_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.chain_user_id is not None:
            result['chain_user_id'] = self.chain_user_id
        if self.token_amount is not None:
            result['token_amount'] = self.token_amount
        if self.token_number is not None:
            result['token_number'] = self.token_number
        if self.extend_params is not None:
            result['extend_params'] = self.extend_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('chain_id') is not None:
            self.chain_id = m.get('chain_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('chain_user_id') is not None:
            self.chain_user_id = m.get('chain_user_id')
        if m.get('token_amount') is not None:
            self.token_amount = m.get('token_amount')
        if m.get('token_number') is not None:
            self.token_number = m.get('token_number')
        if m.get('extend_params') is not None:
            self.extend_params = m.get('extend_params')
        return self


class UpdateAbilityChainAssetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回json对象
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
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
            self.data = m.get('data')
        return self


class StopSpProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        order_no: str = None,
        product_code: str = None,
        instance_id: str = None,
        access_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        self.order_no = order_no
        # 产品码 全局唯一
        self.product_code = product_code
        # 产品实例Id
        self.instance_id = instance_id
        # 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
        self.access_code = access_code

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 64)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 20)
        self.validate_required(self.instance_id, 'instance_id')
        if self.instance_id is not None:
            self.validate_max_length(self.instance_id, 'instance_id', 50)
        self.validate_required(self.access_code, 'access_code')
        if self.access_code is not None:
            self.validate_max_length(self.access_code, 'access_code', 24)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.access_code is not None:
            result['access_code'] = self.access_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        return self


class StopSpProductResponse(TeaModel):
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


class ResumeSpProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        order_no: str = None,
        product_code: str = None,
        instance_id: str = None,
        access_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        self.order_no = order_no
        # 产品码 全局唯一
        self.product_code = product_code
        # 产品实例ID
        self.instance_id = instance_id
        # 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
        self.access_code = access_code

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 64)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 20)
        self.validate_required(self.instance_id, 'instance_id')
        if self.instance_id is not None:
            self.validate_max_length(self.instance_id, 'instance_id', 50)
        self.validate_required(self.access_code, 'access_code')
        if self.access_code is not None:
            self.validate_max_length(self.access_code, 'access_code', 24)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.access_code is not None:
            result['access_code'] = self.access_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        return self


class ResumeSpProductResponse(TeaModel):
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


class ProvisionSpProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        order_no: str = None,
        product_code: str = None,
        tenant: str = None,
        instance_ids: List[str] = None,
        specification: str = None,
        custom_data: str = None,
        workspace: str = None,
        region: str = None,
        zones: List[str] = None,
        tenant_id: str = None,
        access_code: str = None,
        business_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        self.order_no = order_no
        # 产品码 全局唯一
        self.product_code = product_code
        # 购买产品的租户
        self.tenant = tenant
        # 产品实例Id
        self.instance_ids = instance_ids
        # 具体规格配置信息（JSON格式）会按照key进行排序
        self.specification = specification
        # 部分产品创建时需要非生产规格的数据（JSON格式） 比如：ECS生产需要账号、密码等 会按照key进行排序
        self.custom_data = custom_data
        # 实例需要创建到租户的环境信息
        self.workspace = workspace
        # 实例需要创建到租户的地域
        self.region = region
        # 实例需要创建到租户的机房，可以有多个（冗灾场景）
        self.zones = zones
        # 购买产品的租户ID，格式为2088XXXXXXXXXXXX
        self.tenant_id = tenant_id
        # 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
        self.access_code = access_code
        # 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等信息
        self.business_data = business_data

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 64)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 20)
        self.validate_required(self.tenant, 'tenant')
        if self.tenant is not None:
            self.validate_max_length(self.tenant, 'tenant', 8)
        self.validate_required(self.instance_ids, 'instance_ids')
        self.validate_required(self.specification, 'specification')
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.tenant_id is not None:
            self.validate_max_length(self.tenant_id, 'tenant_id', 16)
        self.validate_required(self.access_code, 'access_code')
        if self.access_code is not None:
            self.validate_max_length(self.access_code, 'access_code', 24)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.instance_ids is not None:
            result['instance_ids'] = self.instance_ids
        if self.specification is not None:
            result['specification'] = self.specification
        if self.custom_data is not None:
            result['custom_data'] = self.custom_data
        if self.workspace is not None:
            result['workspace'] = self.workspace
        if self.region is not None:
            result['region'] = self.region
        if self.zones is not None:
            result['zones'] = self.zones
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.access_code is not None:
            result['access_code'] = self.access_code
        if self.business_data is not None:
            result['business_data'] = self.business_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('instance_ids') is not None:
            self.instance_ids = m.get('instance_ids')
        if m.get('specification') is not None:
            self.specification = m.get('specification')
        if m.get('custom_data') is not None:
            self.custom_data = m.get('custom_data')
        if m.get('workspace') is not None:
            self.workspace = m.get('workspace')
        if m.get('region') is not None:
            self.region = m.get('region')
        if m.get('zones') is not None:
            self.zones = m.get('zones')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        if m.get('business_data') is not None:
            self.business_data = m.get('business_data')
        return self


class ProvisionSpProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sync: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 标识是否同步返回生产结果
        self.sync = sync

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
        if self.sync is not None:
            result['sync'] = self.sync
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sync') is not None:
            self.sync = m.get('sync')
        return self


class ModifySpProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        order_no: str = None,
        product_code: str = None,
        instance_id: str = None,
        specification: str = None,
        access_code: str = None,
        modify_type: str = None,
        new_start_time: str = None,
        new_end_time: str = None,
        business_data: str = None,
        old_specification: str = None,
        new_specification: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        self.order_no = order_no
        # 产品码 全局唯一
        self.product_code = product_code
        # 产品实例Id
        self.instance_id = instance_id
        # 具体规格配置信息（JSON格式）会按照key进行排序
        self.specification = specification
        # 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
        self.access_code = access_code
        # 变配类型：
        # ONLY_SPECIFICATION只规格变配,
        # SPECIFICATION_AND_TIME 规格和时间同时变配
        self.modify_type = modify_type
        # 变配新的开始时间。格式为UTC时间。
        # modify_type是SPECIFICATION_AND_TIME时，必填
        self.new_start_time = new_start_time
        # 变配新的结束时间。格式为UTC时间.
        # modify_type是SPECIFICATION_AND_TIME时，必填
        self.new_end_time = new_end_time
        # 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等
        self.business_data = business_data
        # 具体规格配置信息（JSON格式）会按照key进行排序。
        # 此字段传入的是变配前的老规格信息。
        self.old_specification = old_specification
        # 具体规格配置信息（JSON格式）会按照key进行排序.
        # 传入新的规格信息，包括在新的规格中不存在，但是老的规格中有的kv。
        self.new_specification = new_specification

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 64)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 20)
        self.validate_required(self.instance_id, 'instance_id')
        if self.instance_id is not None:
            self.validate_max_length(self.instance_id, 'instance_id', 50)
        self.validate_required(self.specification, 'specification')
        self.validate_required(self.access_code, 'access_code')
        if self.access_code is not None:
            self.validate_max_length(self.access_code, 'access_code', 24)
        self.validate_required(self.modify_type, 'modify_type')
        if self.modify_type is not None:
            self.validate_max_length(self.modify_type, 'modify_type', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.specification is not None:
            result['specification'] = self.specification
        if self.access_code is not None:
            result['access_code'] = self.access_code
        if self.modify_type is not None:
            result['modify_type'] = self.modify_type
        if self.new_start_time is not None:
            result['new_start_time'] = self.new_start_time
        if self.new_end_time is not None:
            result['new_end_time'] = self.new_end_time
        if self.business_data is not None:
            result['business_data'] = self.business_data
        if self.old_specification is not None:
            result['old_specification'] = self.old_specification
        if self.new_specification is not None:
            result['new_specification'] = self.new_specification
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('specification') is not None:
            self.specification = m.get('specification')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        if m.get('modify_type') is not None:
            self.modify_type = m.get('modify_type')
        if m.get('new_start_time') is not None:
            self.new_start_time = m.get('new_start_time')
        if m.get('new_end_time') is not None:
            self.new_end_time = m.get('new_end_time')
        if m.get('business_data') is not None:
            self.business_data = m.get('business_data')
        if m.get('old_specification') is not None:
            self.old_specification = m.get('old_specification')
        if m.get('new_specification') is not None:
            self.new_specification = m.get('new_specification')
        return self


class ModifySpProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sync: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 标识是否同步返回变更结果
        self.sync = sync

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
        if self.sync is not None:
            result['sync'] = self.sync
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sync') is not None:
            self.sync = m.get('sync')
        return self


class ReleaseSpProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        order_no: str = None,
        product_code: str = None,
        instance_id: str = None,
        access_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        self.order_no = order_no
        # 产品码 全局唯一
        self.product_code = product_code
        # 产品实例ID
        self.instance_id = instance_id
        # 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址
        self.access_code = access_code

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 64)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 20)
        self.validate_required(self.instance_id, 'instance_id')
        if self.instance_id is not None:
            self.validate_max_length(self.instance_id, 'instance_id', 50)
        self.validate_required(self.access_code, 'access_code')
        if self.access_code is not None:
            self.validate_max_length(self.access_code, 'access_code', 24)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.access_code is not None:
            result['access_code'] = self.access_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        return self


class ReleaseSpProductResponse(TeaModel):
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


class GetSpProductOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        order_no: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        self.order_no = order_no
        # 产品码 全局唯一
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 64)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 20)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class GetSpProductOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_results: List[OrderResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果
        self.order_results = order_results

    def validate(self):
        self.validate_required(self.order_results, 'order_results')
        if self.order_results:
            for k in self.order_results:
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
        result['order_results'] = []
        if self.order_results is not None:
            for k in self.order_results:
                result['order_results'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.order_results = []
        if m.get('order_results') is not None:
            for k in m.get('order_results'):
                temp_model = OrderResult()
                self.order_results.append(temp_model.from_map(k))
        return self


class LoadSpProductOrderparameterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        business_action: str = None,
        business_context: str = None,
        order_no: str = None,
        product_code: str = None,
        region: str = None,
        tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 加载业务的场景。具体内容同产品方定义，但产品下需保证唯一。
        self.business_action = business_action
        # 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
        self.business_context = business_context
        # 业务流水号。
        self.order_no = order_no
        # 产品code
        self.product_code = product_code
        # 地域。支持不同地域显示不同内容。
        self.region = region
        # 租户id
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.business_action, 'business_action')
        self.validate_required(self.business_context, 'business_context')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.business_action is not None:
            result['business_action'] = self.business_action
        if self.business_context is not None:
            result['business_context'] = self.business_context
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.region is not None:
            result['region'] = self.region
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('business_action') is not None:
            self.business_action = m.get('business_action')
        if m.get('business_context') is not None:
            self.business_context = m.get('business_context')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('region') is not None:
            self.region = m.get('region')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class LoadSpProductOrderparameterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        discrete_values: List[DiscreteValue] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 首页页面产品自定义展示内容加载结果
        self.discrete_values = discrete_values

    def validate(self):
        if self.discrete_values:
            for k in self.discrete_values:
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
        result['discrete_values'] = []
        if self.discrete_values is not None:
            for k in self.discrete_values:
                result['discrete_values'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.discrete_values = []
        if m.get('discrete_values') is not None:
            for k in m.get('discrete_values'):
                temp_model = DiscreteValue()
                self.discrete_values.append(temp_model.from_map(k))
        return self


class SyncIndustryTradeResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        merchant_order_no: str = None,
        out_trade_no: str = None,
        trade_no: str = None,
        trade_status: str = None,
        error_code: str = None,
        error_msg: str = None,
        channel: str = None,
        total_amount: str = None,
        currency_value: str = None,
        gmt_trade: str = None,
        source: str = None,
        properties: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 外部商户订单号，不超过32位
        self.merchant_order_no = merchant_order_no
        # 原支付请求的商户订单号
        self.out_trade_no = out_trade_no
        # 支付宝交易号
        self.trade_no = trade_no
        # 交易状态。
        # WAIT_BUYER_PAY	交易创建，等待买家付款。
        # TRADE_CLOSED	未付款交易超时关闭，或支付完成后全额退款。
        # TRADE_SUCCESS	交易支付成功。
        self.trade_status = trade_status
        # 错误码。
        self.error_code = error_code
        # 错误原因
        self.error_msg = error_msg
        # 渠道 自营平台、第三方平台等
        self.channel = channel
        # 交易金额，单位元，支持到分
        self.total_amount = total_amount
        # 币种
        self.currency_value = currency_value
        # 交易付款成功时间
        self.gmt_trade = gmt_trade
        # 来源编码
        self.source = source
        # 扩展属性
        self.properties = properties

    def validate(self):
        self.validate_required(self.merchant_order_no, 'merchant_order_no')
        self.validate_required(self.out_trade_no, 'out_trade_no')
        self.validate_required(self.trade_no, 'trade_no')
        self.validate_required(self.trade_status, 'trade_status')
        self.validate_required(self.channel, 'channel')
        if self.gmt_trade is not None:
            self.validate_pattern(self.gmt_trade, 'gmt_trade', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.merchant_order_no is not None:
            result['merchant_order_no'] = self.merchant_order_no
        if self.out_trade_no is not None:
            result['out_trade_no'] = self.out_trade_no
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.trade_status is not None:
            result['trade_status'] = self.trade_status
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.channel is not None:
            result['channel'] = self.channel
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.currency_value is not None:
            result['currency_value'] = self.currency_value
        if self.gmt_trade is not None:
            result['gmt_trade'] = self.gmt_trade
        if self.source is not None:
            result['source'] = self.source
        if self.properties is not None:
            result['properties'] = self.properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('merchant_order_no') is not None:
            self.merchant_order_no = m.get('merchant_order_no')
        if m.get('out_trade_no') is not None:
            self.out_trade_no = m.get('out_trade_no')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('trade_status') is not None:
            self.trade_status = m.get('trade_status')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('currency_value') is not None:
            self.currency_value = m.get('currency_value')
        if m.get('gmt_trade') is not None:
            self.gmt_trade = m.get('gmt_trade')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
        return self


class SyncIndustryTradeResultResponse(TeaModel):
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


class SyncMerchantSignResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        error_msg: str = None,
        order_id: str = None,
        status: str = None,
        smid: str = None,
        merchant_user_id: str = None,
        merchant_name: str = None,
        merchant_user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 本次关联注册失败错误原因。
        self.error_msg = error_msg
        # 商家注册(进件)受理单号
        self.order_id = order_id
        # 商家注册（包括进件）结果。99:已完结;-1:失败;
        self.status = status
        # 二级商户id
        self.smid = smid
        # 商户租户id
        self.merchant_user_id = merchant_user_id
        # 商户名称
        self.merchant_name = merchant_name
        # 八位数的商户租户名称
        self.merchant_user_name = merchant_user_name

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.smid, 'smid')
        self.validate_required(self.merchant_user_id, 'merchant_user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.status is not None:
            result['status'] = self.status
        if self.smid is not None:
            result['smid'] = self.smid
        if self.merchant_user_id is not None:
            result['merchant_user_id'] = self.merchant_user_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.merchant_user_name is not None:
            result['merchant_user_name'] = self.merchant_user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('smid') is not None:
            self.smid = m.get('smid')
        if m.get('merchant_user_id') is not None:
            self.merchant_user_id = m.get('merchant_user_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('merchant_user_name') is not None:
            self.merchant_user_name = m.get('merchant_user_name')
        return self


class SyncMerchantSignResultResponse(TeaModel):
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


class SyncMerchantAgreementResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        request_id: str = None,
        personal_product_code: str = None,
        merchant_user_id: str = None,
        customer_alipay_user_id: str = None,
        valid_time: str = None,
        invalid_time: str = None,
        sign_time: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 签约请求单据号
        self.request_id = request_id
        # 代扣产品码
        # 代扣：GENERAL_WITHHOLDING_P
        self.personal_product_code = personal_product_code
        # 代扣签约主体2088号(即代扣收款方)
        self.merchant_user_id = merchant_user_id
        # 签约客户支付宝uid
        self.customer_alipay_user_id = customer_alipay_user_id
        # 实际生效时间
        self.valid_time = valid_time
        # 失效时间
        self.invalid_time = invalid_time
        # 签约时间
        self.sign_time = sign_time
        # 签约状态
        # TEMP-暂存
        # NORMAL-正常
        # STOP-暂停
        self.status = status

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.personal_product_code, 'personal_product_code')
        self.validate_required(self.merchant_user_id, 'merchant_user_id')
        self.validate_required(self.customer_alipay_user_id, 'customer_alipay_user_id')
        if self.valid_time is not None:
            self.validate_pattern(self.valid_time, 'valid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.invalid_time is not None:
            self.validate_pattern(self.invalid_time, 'invalid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.sign_time is not None:
            self.validate_pattern(self.sign_time, 'sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.personal_product_code is not None:
            result['personal_product_code'] = self.personal_product_code
        if self.merchant_user_id is not None:
            result['merchant_user_id'] = self.merchant_user_id
        if self.customer_alipay_user_id is not None:
            result['customer_alipay_user_id'] = self.customer_alipay_user_id
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.invalid_time is not None:
            result['invalid_time'] = self.invalid_time
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('personal_product_code') is not None:
            self.personal_product_code = m.get('personal_product_code')
        if m.get('merchant_user_id') is not None:
            self.merchant_user_id = m.get('merchant_user_id')
        if m.get('customer_alipay_user_id') is not None:
            self.customer_alipay_user_id = m.get('customer_alipay_user_id')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('invalid_time') is not None:
            self.invalid_time = m.get('invalid_time')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class SyncMerchantAgreementResultResponse(TeaModel):
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


class QueryDemoCccCccRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code

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
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        return self


class QueryDemoCccCccResponse(TeaModel):
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


class SyncAcpartnerProjectResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        source: str = None,
        project_id: int = None,
        out_business_no: str = None,
        expenditure_quotation_items: List[ExpenditureQuotationItemResult] = None,
        code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 租户code：用于数据和功能隔离
        self.source = source
        # 项目id
        self.project_id = project_id
        # 外部业务单据号
        self.out_business_no = out_business_no
        # 支出配置单结果列表
        self.expenditure_quotation_items = expenditure_quotation_items
        # 结果码
        self.code = code

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.out_business_no, 'out_business_no')
        self.validate_required(self.expenditure_quotation_items, 'expenditure_quotation_items')
        if self.expenditure_quotation_items:
            for k in self.expenditure_quotation_items:
                if k:
                    k.validate()
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.source is not None:
            result['source'] = self.source
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.out_business_no is not None:
            result['out_business_no'] = self.out_business_no
        result['expenditure_quotation_items'] = []
        if self.expenditure_quotation_items is not None:
            for k in self.expenditure_quotation_items:
                result['expenditure_quotation_items'].append(k.to_map() if k else None)
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('out_business_no') is not None:
            self.out_business_no = m.get('out_business_no')
        self.expenditure_quotation_items = []
        if m.get('expenditure_quotation_items') is not None:
            for k in m.get('expenditure_quotation_items'):
                temp_model = ExpenditureQuotationItemResult()
                self.expenditure_quotation_items.append(temp_model.from_map(k))
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class SyncAcpartnerProjectResultResponse(TeaModel):
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


class SyncAcpartnerSettleinResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        source: str = None,
        apply_id: int = None,
        out_business_no: str = None,
        code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 租户code
        self.source = source
        # 入驻申请id
        self.apply_id = apply_id
        # 外部的业务单据号
        self.out_business_no = out_business_no
        # 结果码
        self.code = code

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.apply_id, 'apply_id')
        self.validate_required(self.out_business_no, 'out_business_no')
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.source is not None:
            result['source'] = self.source
        if self.apply_id is not None:
            result['apply_id'] = self.apply_id
        if self.out_business_no is not None:
            result['out_business_no'] = self.out_business_no
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('apply_id') is not None:
            self.apply_id = m.get('apply_id')
        if m.get('out_business_no') is not None:
            self.out_business_no = m.get('out_business_no')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class SyncAcpartnerSettleinResultResponse(TeaModel):
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


class SyncTradeFulfillResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        fulfill_order_no: str = None,
        fulfill_type: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        commodity_code: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 履约单据号，可用于作为幂等依据
        self.fulfill_order_no = fulfill_order_no
        # 履约枚举，新购-NEW
        self.fulfill_type = fulfill_type
        # 租户ID
        self.tenant_id = tenant_id
        # 租户8位英文名
        self.tenant_name = tenant_name
        # 主商品编码
        self.commodity_code = commodity_code
        # 履约实例ID
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.fulfill_order_no, 'fulfill_order_no')
        self.validate_required(self.fulfill_type, 'fulfill_type')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.fulfill_order_no is not None:
            result['fulfill_order_no'] = self.fulfill_order_no
        if self.fulfill_type is not None:
            result['fulfill_type'] = self.fulfill_type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('fulfill_order_no') is not None:
            self.fulfill_order_no = m.get('fulfill_order_no')
        if m.get('fulfill_type') is not None:
            self.fulfill_type = m.get('fulfill_type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class SyncTradeFulfillResultResponse(TeaModel):
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


class SyncPccCommodityStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        commodity_code: str = None,
        commodity_name: str = None,
        commodity_service_mode: str = None,
        commodity_charge_type: str = None,
        commodity_status: str = None,
        product_rel_uses: List[RelUser] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 主商品编码
        self.commodity_code = commodity_code
        # 商品名称
        self.commodity_name = commodity_name
        # 商品服务模式，PLATFORM-平台型
        self.commodity_service_mode = commodity_service_mode
        # 商品计费模式，PREPAY_BY_MONTH-包年包月 AFTER_PAY_BY_HOUR-按量付费
        self.commodity_charge_type = commodity_charge_type
        # 商品状态，ONLINE-上架，OFFLINE-下架
        self.commodity_status = commodity_status
        # 产品干系人
        self.product_rel_uses = product_rel_uses

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.commodity_name, 'commodity_name')
        self.validate_required(self.commodity_service_mode, 'commodity_service_mode')
        self.validate_required(self.commodity_charge_type, 'commodity_charge_type')
        self.validate_required(self.commodity_status, 'commodity_status')
        self.validate_required(self.product_rel_uses, 'product_rel_uses')
        if self.product_rel_uses:
            for k in self.product_rel_uses:
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
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        if self.commodity_service_mode is not None:
            result['commodity_service_mode'] = self.commodity_service_mode
        if self.commodity_charge_type is not None:
            result['commodity_charge_type'] = self.commodity_charge_type
        if self.commodity_status is not None:
            result['commodity_status'] = self.commodity_status
        result['product_rel_uses'] = []
        if self.product_rel_uses is not None:
            for k in self.product_rel_uses:
                result['product_rel_uses'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        if m.get('commodity_service_mode') is not None:
            self.commodity_service_mode = m.get('commodity_service_mode')
        if m.get('commodity_charge_type') is not None:
            self.commodity_charge_type = m.get('commodity_charge_type')
        if m.get('commodity_status') is not None:
            self.commodity_status = m.get('commodity_status')
        self.product_rel_uses = []
        if m.get('product_rel_uses') is not None:
            for k in m.get('product_rel_uses'):
                temp_model = RelUser()
                self.product_rel_uses.append(temp_model.from_map(k))
        return self


class SyncPccCommodityStatusResponse(TeaModel):
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


class QueryDemoEchoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 123
        self.data = data

    def validate(self):
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
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryDemoEchoResponse(TeaModel):
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


class CreateSpProductLogicinstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        product_instance_unique_id: str = None,
        unique_id: str = None,
        out_biz_no: str = None,
        provider_id: str = None,
        status: str = None,
        description: str = None,
        properties: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 主产品实例唯一id
        self.product_instance_unique_id = product_instance_unique_id
        # 逻辑实例唯一id
        self.unique_id = unique_id
        # 幂等号
        self.out_biz_no = out_biz_no
        # 账号Id
        self.provider_id = provider_id
        # ACTIVE
        self.status = status
        # 逻辑实例描述
        self.description = description
        # 扩展属性
        self.properties = properties

    def validate(self):
        self.validate_required(self.product_instance_unique_id, 'product_instance_unique_id')
        self.validate_required(self.unique_id, 'unique_id')
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.description, 'description')
        self.validate_required(self.properties, 'properties')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.product_instance_unique_id is not None:
            result['product_instance_unique_id'] = self.product_instance_unique_id
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.status is not None:
            result['status'] = self.status
        if self.description is not None:
            result['description'] = self.description
        if self.properties is not None:
            result['properties'] = self.properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('product_instance_unique_id') is not None:
            self.product_instance_unique_id = m.get('product_instance_unique_id')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
        return self


class CreateSpProductLogicinstanceResponse(TeaModel):
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


class RenewSpProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        order_no: str = None,
        product_code: str = None,
        instance_id: str = None,
        access_code: str = None,
        renew_start_time: str = None,
        renew_end_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        self.order_no = order_no
        # 产品码 全局唯一
        self.product_code = product_code
        # 产品实例ID
        self.instance_id = instance_id
        # 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
        self.access_code = access_code
        # 续签后，新的实例开始时间。时间使用UTC时间
        self.renew_start_time = renew_start_time
        # 续签后，新的实例结束时间。时间使用UTC时间
        self.renew_end_time = renew_end_time

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 64)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 20)
        self.validate_required(self.instance_id, 'instance_id')
        if self.instance_id is not None:
            self.validate_max_length(self.instance_id, 'instance_id', 50)
        self.validate_required(self.access_code, 'access_code')
        if self.access_code is not None:
            self.validate_max_length(self.access_code, 'access_code', 24)
        self.validate_required(self.renew_end_time, 'renew_end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.access_code is not None:
            result['access_code'] = self.access_code
        if self.renew_start_time is not None:
            result['renew_start_time'] = self.renew_start_time
        if self.renew_end_time is not None:
            result['renew_end_time'] = self.renew_end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        if m.get('renew_start_time') is not None:
            self.renew_start_time = m.get('renew_start_time')
        if m.get('renew_end_time') is not None:
            self.renew_end_time = m.get('renew_end_time')
        return self


class RenewSpProductResponse(TeaModel):
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


class CheckSpProductOrderparameterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        business_action: str = None,
        business_context: str = None,
        order_no: str = None,
        product_code: str = None,
        region: str = None,
        tenant_id: str = None,
        input: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 加载业务的场景。具体内容同产品方定义，但产品下需保证唯一。
        self.business_action = business_action
        # 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
        self.business_context = business_context
        # 业务流水号。
        self.order_no = order_no
        # 商品的渠道产品码
        self.product_code = product_code
        # 地域。支持不同地域显示不同内容。
        self.region = region
        # 租户id
        self.tenant_id = tenant_id
        # 需要校验的数据
        self.input = input

    def validate(self):
        self.validate_required(self.business_action, 'business_action')
        self.validate_required(self.business_context, 'business_context')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.input, 'input')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.business_action is not None:
            result['business_action'] = self.business_action
        if self.business_context is not None:
            result['business_context'] = self.business_context
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.region is not None:
            result['region'] = self.region
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.input is not None:
            result['input'] = self.input
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('business_action') is not None:
            self.business_action = m.get('business_action')
        if m.get('business_context') is not None:
            self.business_context = m.get('business_context')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('region') is not None:
            self.region = m.get('region')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('input') is not None:
            self.input = m.get('input')
        return self


class CheckSpProductOrderparameterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        check_status: str = None,
        check_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 参数校验结果，PASS 通过，UNPASS 不通过
        self.check_status = check_status
        # 参数校验不通过的提示信息
        self.check_msg = check_msg

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
        if self.check_status is not None:
            result['check_status'] = self.check_status
        if self.check_msg is not None:
            result['check_msg'] = self.check_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('check_status') is not None:
            self.check_status = m.get('check_status')
        if m.get('check_msg') is not None:
            self.check_msg = m.get('check_msg')
        return self


class PreopenSpProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        order_no: str = None,
        product_code: str = None,
        instance_ids: List[str] = None,
        specification: str = None,
        custom_data: str = None,
        workspace: str = None,
        region: str = None,
        zones: List[str] = None,
        tenant_id: str = None,
        access_code: str = None,
        business_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        self.order_no = order_no
        # 产品码 全局唯一
        self.product_code = product_code
        # 
        # 产品实例Id
        self.instance_ids = instance_ids
        # 
        # 具体规格配置信息（JSON格式）会按照key进行排序
        self.specification = specification
        # 部分产品创建时需要非生产规格的数据（JSON格式） 比如：ECS生产需要账号、密码等 会按照key进行排序
        self.custom_data = custom_data
        # 实例需要创建到租户的环境信息
        self.workspace = workspace
        # 
        # 实例需要创建到租户的地域
        self.region = region
        # 
        # 实例需要创建到租户的机房，可以有多个（冗灾场景）
        self.zones = zones
        # 
        # 购买产品的租户ID，格式为2088XXXXXXXXXXXX
        self.tenant_id = tenant_id
        # 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址
        self.access_code = access_code
        # 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等信息
        self.business_data = business_data

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.instance_ids, 'instance_ids')
        self.validate_required(self.specification, 'specification')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.access_code, 'access_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.instance_ids is not None:
            result['instance_ids'] = self.instance_ids
        if self.specification is not None:
            result['specification'] = self.specification
        if self.custom_data is not None:
            result['custom_data'] = self.custom_data
        if self.workspace is not None:
            result['workspace'] = self.workspace
        if self.region is not None:
            result['region'] = self.region
        if self.zones is not None:
            result['zones'] = self.zones
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.access_code is not None:
            result['access_code'] = self.access_code
        if self.business_data is not None:
            result['business_data'] = self.business_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('instance_ids') is not None:
            self.instance_ids = m.get('instance_ids')
        if m.get('specification') is not None:
            self.specification = m.get('specification')
        if m.get('custom_data') is not None:
            self.custom_data = m.get('custom_data')
        if m.get('workspace') is not None:
            self.workspace = m.get('workspace')
        if m.get('region') is not None:
            self.region = m.get('region')
        if m.get('zones') is not None:
            self.zones = m.get('zones')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        if m.get('business_data') is not None:
            self.business_data = m.get('business_data')
        return self


class PreopenSpProductResponse(TeaModel):
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


class OpenSpProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_access_code: str = None,
        order_no: str = None,
        product_code: str = None,
        tenant: str = None,
        instance_id: str = None,
        custom_data: str = None,
        tenant_id: str = None,
        access_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.product_access_code = product_access_code
        # 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        self.order_no = order_no
        # 产品码 全局唯一
        self.product_code = product_code
        # 开通产品的租户
        self.tenant = tenant
        # 产品实例ID
        self.instance_id = instance_id
        # 支持透传给产品非生产规格的自定义数据（JSON格式并按key排序）
        self.custom_data = custom_data
        # 开通产品的租户ID，格式为2088XXXXXXXXXXXX
        self.tenant_id = tenant_id
        # 服务接入码，产品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
        self.access_code = access_code

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 64)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 20)
        self.validate_required(self.tenant, 'tenant')
        if self.tenant is not None:
            self.validate_max_length(self.tenant, 'tenant', 8)
        self.validate_required(self.instance_id, 'instance_id')
        if self.instance_id is not None:
            self.validate_max_length(self.instance_id, 'instance_id', 50)
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.tenant_id is not None:
            self.validate_max_length(self.tenant_id, 'tenant_id', 16)
        self.validate_required(self.access_code, 'access_code')
        if self.access_code is not None:
            self.validate_max_length(self.access_code, 'access_code', 24)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_access_code is not None:
            result['product_access_code'] = self.product_access_code
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.custom_data is not None:
            result['custom_data'] = self.custom_data
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.access_code is not None:
            result['access_code'] = self.access_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_access_code') is not None:
            self.product_access_code = m.get('product_access_code')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('custom_data') is not None:
            self.custom_data = m.get('custom_data')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        return self


class OpenSpProductResponse(TeaModel):
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


