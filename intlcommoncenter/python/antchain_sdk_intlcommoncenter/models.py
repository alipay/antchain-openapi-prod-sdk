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


class ImportProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        business_status: str = None,
        product_put_ant_official: str = None,
        name: str = None,
        xs_code: str = None,
        start_time: str = None,
        pd: str = None,
        pd_leader: str = None,
        dev_leader: str = None,
        dev: str = None,
        description: str = None,
        operator: str = None,
        business_line: str = None,
        product_line: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商业化状态
        self.business_status = business_status
        # 是否已上架蚂蚁链官网
        self.product_put_ant_official = product_put_ant_official
        # 产品名称
        self.name = name
        # 橡实立项code
        self.xs_code = xs_code
        # 上线时间
        self.start_time = start_time
        # 产品经理
        self.pd = pd
        # 产品经理负责人
        self.pd_leader = pd_leader
        # 产品研发负责人
        self.dev_leader = dev_leader
        # 产品研发
        self.dev = dev
        # 产品描述
        self.description = description
        # 操作员
        self.operator = operator
        # 业务线id
        self.business_line = business_line
        # 产品线id
        self.product_line = product_line
        # 产品code
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.business_status, 'business_status')
        self.validate_required(self.product_put_ant_official, 'product_put_ant_official')
        self.validate_required(self.name, 'name')
        self.validate_required(self.xs_code, 'xs_code')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.pd, 'pd')
        self.validate_required(self.pd_leader, 'pd_leader')
        self.validate_required(self.description, 'description')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.business_line, 'business_line')
        self.validate_required(self.product_line, 'product_line')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.business_status is not None:
            result['business_status'] = self.business_status
        if self.product_put_ant_official is not None:
            result['product_put_ant_official'] = self.product_put_ant_official
        if self.name is not None:
            result['name'] = self.name
        if self.xs_code is not None:
            result['xs_code'] = self.xs_code
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.pd is not None:
            result['pd'] = self.pd
        if self.pd_leader is not None:
            result['pd_leader'] = self.pd_leader
        if self.dev_leader is not None:
            result['dev_leader'] = self.dev_leader
        if self.dev is not None:
            result['dev'] = self.dev
        if self.description is not None:
            result['description'] = self.description
        if self.operator is not None:
            result['operator'] = self.operator
        if self.business_line is not None:
            result['business_line'] = self.business_line
        if self.product_line is not None:
            result['product_line'] = self.product_line
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('business_status') is not None:
            self.business_status = m.get('business_status')
        if m.get('product_put_ant_official') is not None:
            self.product_put_ant_official = m.get('product_put_ant_official')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('xs_code') is not None:
            self.xs_code = m.get('xs_code')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('pd') is not None:
            self.pd = m.get('pd')
        if m.get('pd_leader') is not None:
            self.pd_leader = m.get('pd_leader')
        if m.get('dev_leader') is not None:
            self.dev_leader = m.get('dev_leader')
        if m.get('dev') is not None:
            self.dev = m.get('dev')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('business_line') is not None:
            self.business_line = m.get('business_line')
        if m.get('product_line') is not None:
            self.product_line = m.get('product_line')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class ImportProductResponse(TeaModel):
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


class OperateApprovalCallbackRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        process_id: str = None,
        audit_status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 审批流Id
        self.process_id = process_id
        # 审批状态(PASS\UNPASS\CANCEL)
        self.audit_status = audit_status

    def validate(self):
        self.validate_required(self.process_id, 'process_id')
        self.validate_required(self.audit_status, 'audit_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.process_id is not None:
            result['process_id'] = self.process_id
        if self.audit_status is not None:
            result['audit_status'] = self.audit_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('process_id') is not None:
            self.process_id = m.get('process_id')
        if m.get('audit_status') is not None:
            self.audit_status = m.get('audit_status')
        return self


class OperateApprovalCallbackResponse(TeaModel):
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


class UpdateProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_code: str = None,
        business_line: str = None,
        product_line: str = None,
        dev_leader: str = None,
        devs: str = None,
        pd_leader: str = None,
        pds: str = None,
        finance: str = None,
        legal_owner: str = None,
        product_assistant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 产品线code
        self.product_code = product_code
        # L1code
        self.business_line = business_line
        # L2code
        self.product_line = product_line
        # 研发负责人
        self.dev_leader = dev_leader
        # 研发参与人
        self.devs = devs
        # 产品负责人
        self.pd_leader = pd_leader
        # 产品参与人
        self.pds = pds
        # 财务负责人
        self.finance = finance
        # 法务负责人
        self.legal_owner = legal_owner
        # 产管
        self.product_assistant = product_assistant

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.business_line, 'business_line')
        self.validate_required(self.product_line, 'product_line')

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
        if self.business_line is not None:
            result['business_line'] = self.business_line
        if self.product_line is not None:
            result['product_line'] = self.product_line
        if self.dev_leader is not None:
            result['dev_leader'] = self.dev_leader
        if self.devs is not None:
            result['devs'] = self.devs
        if self.pd_leader is not None:
            result['pd_leader'] = self.pd_leader
        if self.pds is not None:
            result['pds'] = self.pds
        if self.finance is not None:
            result['finance'] = self.finance
        if self.legal_owner is not None:
            result['legal_owner'] = self.legal_owner
        if self.product_assistant is not None:
            result['product_assistant'] = self.product_assistant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('business_line') is not None:
            self.business_line = m.get('business_line')
        if m.get('product_line') is not None:
            self.product_line = m.get('product_line')
        if m.get('dev_leader') is not None:
            self.dev_leader = m.get('dev_leader')
        if m.get('devs') is not None:
            self.devs = m.get('devs')
        if m.get('pd_leader') is not None:
            self.pd_leader = m.get('pd_leader')
        if m.get('pds') is not None:
            self.pds = m.get('pds')
        if m.get('finance') is not None:
            self.finance = m.get('finance')
        if m.get('legal_owner') is not None:
            self.legal_owner = m.get('legal_owner')
        if m.get('product_assistant') is not None:
            self.product_assistant = m.get('product_assistant')
        return self


class UpdateProductResponse(TeaModel):
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


