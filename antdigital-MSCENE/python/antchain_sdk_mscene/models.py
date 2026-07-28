# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


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


class MpaasUserGamecenterPaymentVirtualdeliveryResponse(TeaModel):
    def __init__(
        self,
        success: bool = None,
    ):
        # 发货结果
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class MpaasSaveOrderRelationResponse(TeaModel):
    def __init__(
        self,
        success: bool = None,
    ):
        # 是否成功
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class MpaasUserGamecenterPaymentQuerystatusResponse(TeaModel):
    def __init__(
        self,
        order_status: str = None,
        cp_extra: str = None,
    ):
        # 订单状态。1-订单已创建。2-订单交易支付成功。3-订单交易支付失败
        self.order_status = order_status
        # 扩展参数。biz_order_id-平台侧订单号，payment-金额（单位：分），open_uid-开放平台用户ID
        self.cp_extra = cp_extra

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.cp_extra is not None:
            result['cp_extra'] = self.cp_extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('cp_extra') is not None:
            self.cp_extra = m.get('cp_extra')
        return self


class MpaasUserAuthCheckResponse(TeaModel):
    def __init__(
        self,
        matched: bool = None,
    ):
        # 用户身份是否匹配
        self.matched = matched

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.matched is not None:
            result['matched'] = self.matched
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('matched') is not None:
            self.matched = m.get('matched')
        return self


class QueryUserAuthcheckRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mini_program_id: str = None,
        platform_id: str = None,
        token: str = None,
        open_uid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小游戏ID
        self.mini_program_id = mini_program_id
        # 平台ID
        self.platform_id = platform_id
        # 用户身份认证令牌
        self.token = token
        # 开放用户ID
        self.open_uid = open_uid

    def validate(self):
        self.validate_required(self.mini_program_id, 'mini_program_id')
        self.validate_required(self.platform_id, 'platform_id')
        self.validate_required(self.token, 'token')
        self.validate_required(self.open_uid, 'open_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.mini_program_id is not None:
            result['mini_program_id'] = self.mini_program_id
        if self.platform_id is not None:
            result['platform_id'] = self.platform_id
        if self.token is not None:
            result['token'] = self.token
        if self.open_uid is not None:
            result['open_uid'] = self.open_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mini_program_id') is not None:
            self.mini_program_id = m.get('mini_program_id')
        if m.get('platform_id') is not None:
            self.platform_id = m.get('platform_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('open_uid') is not None:
            self.open_uid = m.get('open_uid')
        return self


class QueryUserAuthcheckResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        mpaas_user_auth_check_response: MpaasUserAuthCheckResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求是否成功
        self.success = success
        # 用户校验响应结果
        self.mpaas_user_auth_check_response = mpaas_user_auth_check_response

    def validate(self):
        if self.mpaas_user_auth_check_response:
            self.mpaas_user_auth_check_response.validate()

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
        if self.mpaas_user_auth_check_response is not None:
            result['mpaas_user_auth_check_response'] = self.mpaas_user_auth_check_response.to_map()
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
        if m.get('mpaas_user_auth_check_response') is not None:
            temp_model = MpaasUserAuthCheckResponse()
            self.mpaas_user_auth_check_response = temp_model.from_map(m['mpaas_user_auth_check_response'])
        return self


class SaveOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        workspace_id: str = None,
        tenant_id: str = None,
        mini_program_id: str = None,
        platform_id: str = None,
        custom_id: str = None,
        biz_order_id: str = None,
        amount: int = None,
        biz_order_status: int = None,
        open_uid: str = None,
        item_id: str = None,
        item_title: str = None,
        client_type: str = None,
        cp_extra: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用ID
        self.app_id = app_id
        # 工作空间ID
        self.workspace_id = workspace_id
        # 租户ID
        self.tenant_id = tenant_id
        # 小游戏ID
        self.mini_program_id = mini_program_id
        # 平台ID
        self.platform_id = platform_id
        # 客户订单号
        self.custom_id = custom_id
        # 平台业务订单号
        self.biz_order_id = biz_order_id
        # 金额，单位分
        self.amount = amount
        # 业务订单状态：
        # 1 - 订单已创建
        # 2 - 支付成功
        # 3 - 支付失败
        self.biz_order_status = biz_order_status
        # 开放用户ID
        self.open_uid = open_uid
        # 商品id
        self.item_id = item_id
        # 商品名称
        self.item_title = item_title
        # 客户端类型：IOS、ANDROID
        self.client_type = client_type
        # 小游戏客户端透传参数
        self.cp_extra = cp_extra

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.workspace_id, 'workspace_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.mini_program_id, 'mini_program_id')
        self.validate_required(self.platform_id, 'platform_id')
        self.validate_required(self.custom_id, 'custom_id')
        self.validate_required(self.biz_order_id, 'biz_order_id')
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.biz_order_status, 'biz_order_status')
        self.validate_required(self.open_uid, 'open_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.mini_program_id is not None:
            result['mini_program_id'] = self.mini_program_id
        if self.platform_id is not None:
            result['platform_id'] = self.platform_id
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        if self.biz_order_id is not None:
            result['biz_order_id'] = self.biz_order_id
        if self.amount is not None:
            result['amount'] = self.amount
        if self.biz_order_status is not None:
            result['biz_order_status'] = self.biz_order_status
        if self.open_uid is not None:
            result['open_uid'] = self.open_uid
        if self.item_id is not None:
            result['item_id'] = self.item_id
        if self.item_title is not None:
            result['item_title'] = self.item_title
        if self.client_type is not None:
            result['client_type'] = self.client_type
        if self.cp_extra is not None:
            result['cp_extra'] = self.cp_extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('mini_program_id') is not None:
            self.mini_program_id = m.get('mini_program_id')
        if m.get('platform_id') is not None:
            self.platform_id = m.get('platform_id')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        if m.get('biz_order_id') is not None:
            self.biz_order_id = m.get('biz_order_id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('biz_order_status') is not None:
            self.biz_order_status = m.get('biz_order_status')
        if m.get('open_uid') is not None:
            self.open_uid = m.get('open_uid')
        if m.get('item_id') is not None:
            self.item_id = m.get('item_id')
        if m.get('item_title') is not None:
            self.item_title = m.get('item_title')
        if m.get('client_type') is not None:
            self.client_type = m.get('client_type')
        if m.get('cp_extra') is not None:
            self.cp_extra = m.get('cp_extra')
        return self


class SaveOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        mpaas_save_order_relation_response: MpaasSaveOrderRelationResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求是否成功
        self.success = success
        # 订单同步结果
        self.mpaas_save_order_relation_response = mpaas_save_order_relation_response

    def validate(self):
        if self.mpaas_save_order_relation_response:
            self.mpaas_save_order_relation_response.validate()

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
        if self.mpaas_save_order_relation_response is not None:
            result['mpaas_save_order_relation_response'] = self.mpaas_save_order_relation_response.to_map()
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
        if m.get('mpaas_save_order_relation_response') is not None:
            temp_model = MpaasSaveOrderRelationResponse()
            self.mpaas_save_order_relation_response = temp_model.from_map(m['mpaas_save_order_relation_response'])
        return self


class QueryOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mini_program_id: str = None,
        platform_id: str = None,
        custom_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小游戏ID
        self.mini_program_id = mini_program_id
        # 平台ID
        self.platform_id = platform_id
        # 客户订单号
        self.custom_id = custom_id

    def validate(self):
        self.validate_required(self.mini_program_id, 'mini_program_id')
        self.validate_required(self.platform_id, 'platform_id')
        self.validate_required(self.custom_id, 'custom_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.mini_program_id is not None:
            result['mini_program_id'] = self.mini_program_id
        if self.platform_id is not None:
            result['platform_id'] = self.platform_id
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mini_program_id') is not None:
            self.mini_program_id = m.get('mini_program_id')
        if m.get('platform_id') is not None:
            self.platform_id = m.get('platform_id')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        return self


class QueryOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        mpaas_user_query_status_response: MpaasUserGamecenterPaymentQuerystatusResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求是否成功
        self.success = success
        # 查询订单响应参数
        self.mpaas_user_query_status_response = mpaas_user_query_status_response

    def validate(self):
        if self.mpaas_user_query_status_response:
            self.mpaas_user_query_status_response.validate()

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
        if self.mpaas_user_query_status_response is not None:
            result['mpaas_user_query_status_response'] = self.mpaas_user_query_status_response.to_map()
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
        if m.get('mpaas_user_query_status_response') is not None:
            temp_model = MpaasUserGamecenterPaymentQuerystatusResponse()
            self.mpaas_user_query_status_response = temp_model.from_map(m['mpaas_user_query_status_response'])
        return self


class PushOrderDeliveryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mini_program_id: str = None,
        platform_id: str = None,
        custom_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小游戏ID
        self.mini_program_id = mini_program_id
        # 平台ID
        self.platform_id = platform_id
        # 客户订单号
        self.custom_id = custom_id

    def validate(self):
        self.validate_required(self.mini_program_id, 'mini_program_id')
        self.validate_required(self.platform_id, 'platform_id')
        self.validate_required(self.custom_id, 'custom_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.mini_program_id is not None:
            result['mini_program_id'] = self.mini_program_id
        if self.platform_id is not None:
            result['platform_id'] = self.platform_id
        if self.custom_id is not None:
            result['custom_id'] = self.custom_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mini_program_id') is not None:
            self.mini_program_id = m.get('mini_program_id')
        if m.get('platform_id') is not None:
            self.platform_id = m.get('platform_id')
        if m.get('custom_id') is not None:
            self.custom_id = m.get('custom_id')
        return self


class PushOrderDeliveryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        mpaas_user_virtual_delivery_response: MpaasUserGamecenterPaymentVirtualdeliveryResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求是否成功
        self.success = success
        # 发货结果
        self.mpaas_user_virtual_delivery_response = mpaas_user_virtual_delivery_response

    def validate(self):
        if self.mpaas_user_virtual_delivery_response:
            self.mpaas_user_virtual_delivery_response.validate()

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
        if self.mpaas_user_virtual_delivery_response is not None:
            result['mpaas_user_virtual_delivery_response'] = self.mpaas_user_virtual_delivery_response.to_map()
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
        if m.get('mpaas_user_virtual_delivery_response') is not None:
            temp_model = MpaasUserGamecenterPaymentVirtualdeliveryResponse()
            self.mpaas_user_virtual_delivery_response = temp_model.from_map(m['mpaas_user_virtual_delivery_response'])
        return self


