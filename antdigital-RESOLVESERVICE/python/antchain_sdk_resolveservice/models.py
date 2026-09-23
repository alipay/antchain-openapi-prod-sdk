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


class CallTags(TeaModel):
    def __init__(
        self,
        primary_tag: str = None,
        secondary_tag: str = None,
    ):
        # 一级标签
        self.primary_tag = primary_tag
        # 二级标签
        self.secondary_tag = secondary_tag

    def validate(self):
        self.validate_required(self.primary_tag, 'primary_tag')
        self.validate_required(self.secondary_tag, 'secondary_tag')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.primary_tag is not None:
            result['primary_tag'] = self.primary_tag
        if self.secondary_tag is not None:
            result['secondary_tag'] = self.secondary_tag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('primary_tag') is not None:
            self.primary_tag = m.get('primary_tag')
        if m.get('secondary_tag') is not None:
            self.secondary_tag = m.get('secondary_tag')
        return self


class Transcript(TeaModel):
    def __init__(
        self,
        role: str = None,
        content: str = None,
        start_time: str = None,
        end_time: str = None,
    ):
        # 说话角色
        self.role = role
        # 说话内容
        self.content = content
        # 开始时间，ISO 8601 格式
        self.start_time = start_time
        # 结束时间，ISO 8601 格式
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.role, 'role')
        self.validate_required(self.content, 'content')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.role is not None:
            result['role'] = self.role
        if self.content is not None:
            result['content'] = self.content
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class QueryCustomerOverdueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        customer_account: str = None,
        product_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户号
        self.customer_account = customer_account
        # 产品类型
        self.product_type = product_type

    def validate(self):
        self.validate_required(self.customer_account, 'customer_account')
        self.validate_required(self.product_type, 'product_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.customer_account is not None:
            result['customer_account'] = self.customer_account
        if self.product_type is not None:
            result['product_type'] = self.product_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('customer_account') is not None:
            self.customer_account = m.get('customer_account')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        return self


class QueryCustomerOverdueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        flag: str = None,
        code: int = None,
        msg: str = None,
        data: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # S:成功,F:失败
        self.flag = flag
        # 0:成功,1:失败
        self.code = code
        # 成功or失败
        self.msg = msg
        # true : 逾期 false: 不逾期
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
        if self.flag is not None:
            result['flag'] = self.flag
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('flag') is not None:
            self.flag = m.get('flag')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryCustomerRepaylinkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cust_no: str = None,
        sms_template_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户号
        self.cust_no = cust_no
        # 模版编号
        self.sms_template_no = sms_template_no

    def validate(self):
        self.validate_required(self.cust_no, 'cust_no')
        self.validate_required(self.sms_template_no, 'sms_template_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cust_no is not None:
            result['cust_no'] = self.cust_no
        if self.sms_template_no is not None:
            result['sms_template_no'] = self.sms_template_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cust_no') is not None:
            self.cust_no = m.get('cust_no')
        if m.get('sms_template_no') is not None:
            self.sms_template_no = m.get('sms_template_no')
        return self


class QueryCustomerRepaylinkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        flag: str = None,
        code: int = None,
        msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # S:成功,F:失败
        self.flag = flag
        # 0:成功,1:失败
        self.code = code
        # 成功or失败
        self.msg = msg
        # 生成的链接码，如果生成失败返回null , shortLink-短信链接，checkCode-校验码
        # eg：
        # {"custNo":"CT001","shortLink":"https://lawyer.360-jr.com/common/index","checkCode":"awdwa232"}
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
        if self.flag is not None:
            result['flag'] = self.flag
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('flag') is not None:
            self.flag = m.get('flag')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryCustomerWxleadlinkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cust_no: str = None,
        case_code: str = None,
        phone: str = None,
        product_type: str = None,
        create_by: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户号
        self.cust_no = cust_no
        # 案件号
        self.case_code = case_code
        # AES加密手机号
        self.phone = phone
        # 产品类型
        self.product_type = product_type
        # 约定固定值-一般是对应平台的缩写
        self.create_by = create_by

    def validate(self):
        self.validate_required(self.cust_no, 'cust_no')
        self.validate_required(self.case_code, 'case_code')
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.product_type, 'product_type')
        self.validate_required(self.create_by, 'create_by')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cust_no is not None:
            result['cust_no'] = self.cust_no
        if self.case_code is not None:
            result['case_code'] = self.case_code
        if self.phone is not None:
            result['phone'] = self.phone
        if self.product_type is not None:
            result['product_type'] = self.product_type
        if self.create_by is not None:
            result['create_by'] = self.create_by
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cust_no') is not None:
            self.cust_no = m.get('cust_no')
        if m.get('case_code') is not None:
            self.case_code = m.get('case_code')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        if m.get('create_by') is not None:
            self.create_by = m.get('create_by')
        return self


class QueryCustomerWxleadlinkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        flag: str = None,
        code: int = None,
        msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # S:成功,F:失败
        self.flag = flag
        # 0:成功,1:失败
        self.code = code
        # 成功or失败
        self.msg = msg
        # 生成的链接码，如果生成失败返回null , qwshortLink-短信链接，checkCode-校验码
        # eg：
        # {"custNo":"CT001","qwshortLink":"https://lawyer.360-jr.com/common/index","checkCode":"awdwa232"}
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
        if self.flag is not None:
            result['flag'] = self.flag
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('flag') is not None:
            self.flag = m.get('flag')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryCustomerTransartificialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cust_no: str = None,
        case_code: str = None,
        product_type: str = None,
        create_by: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户号
        self.cust_no = cust_no
        # 案件号
        self.case_code = case_code
        # 产品类型
        self.product_type = product_type
        # 约定固定值-一般是对应平台的缩写
        self.create_by = create_by

    def validate(self):
        self.validate_required(self.cust_no, 'cust_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cust_no is not None:
            result['cust_no'] = self.cust_no
        if self.case_code is not None:
            result['case_code'] = self.case_code
        if self.product_type is not None:
            result['product_type'] = self.product_type
        if self.create_by is not None:
            result['create_by'] = self.create_by
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cust_no') is not None:
            self.cust_no = m.get('cust_no')
        if m.get('case_code') is not None:
            self.case_code = m.get('case_code')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        if m.get('create_by') is not None:
            self.create_by = m.get('create_by')
        return self


class QueryCustomerTransartificialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        flag: str = None,
        code: int = None,
        msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # S:成功,F:失败
        self.flag = flag
        # 0:成功,1:失败
        self.code = code
        # 成功or失败
        self.msg = msg
        # SON字符串，返回是否可提前转人工
        # transArtificial : 默认N-不转人工，Y-转人工
        # eg：
        # {"custNo":"CT001","transArtificial":"Y"}
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
        if self.flag is not None:
            result['flag'] = self.flag
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('flag') is not None:
            self.flag = m.get('flag')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackTaskCallresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        error_code: str = None,
        dial_result: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 错误编码(0: 正确)
        self.error_code = error_code
        # 通话结果
        self.dial_result = dial_result

    def validate(self):
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.dial_result, 'dial_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.dial_result is not None:
            result['dial_result'] = self.dial_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('dial_result') is not None:
            self.dial_result = m.get('dial_result')
        return self


class CallbackTaskCallresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        flag: str = None,
        code: int = None,
        msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # S:成功,F:失败
        self.flag = flag
        # 0:成功,1:失败
        self.code = code
        # 成功or失败
        self.msg = msg
        # 结果说明
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
        if self.flag is not None:
            result['flag'] = self.flag
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('flag') is not None:
            self.flag = m.get('flag')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackTaskSmsresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        a_case_id: str = None,
        batch_no: str = None,
        collected_name: str = None,
        contact_name: str = None,
        contact_phone: str = None,
        contact_status: str = None,
        content: str = None,
        overdue_date: str = None,
        remark: str = None,
        send_result: str = None,
        send_way: int = None,
        session_id: str = None,
        time: int = None,
        type: str = None,
        create_by: str = None,
        template_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户号
        self.a_case_id = a_case_id
        # 批次号
        self.batch_no = batch_no
        # 案件主联系人姓名 AES加密
        self.collected_name = collected_name
        # 联系人姓名 AES加密
        self.contact_name = contact_name
        # 联系人号码 AES加密
        self.contact_phone = contact_phone
        # 联系人状态（有意愿还款之类）
        self.contact_status = contact_status
        # 短信内容
        self.content = content
        # 还款日
        self.overdue_date = overdue_date
        # 备注
        self.remark = remark
        # 发送结果 21:客户回复接收成功 10:失败 11:成功
        self.send_result = send_result
        # 发送方式：如果是系统发送，那么为必填(1-短信，2-语音，3-智能语音)
        self.send_way = send_way
        # 唯一标识(可用来判重)
        self.session_id = session_id
        # 发送时间(毫秒)
        self.time = time
        # 1 发送 2 接收 -客户回复
        self.type = type
        # 约定固定值-一般是对应平台的缩写
        self.create_by = create_by
        # 短信模板
        self.template_no = template_no

    def validate(self):
        self.validate_required(self.a_case_id, 'a_case_id')
        self.validate_required(self.batch_no, 'batch_no')
        self.validate_required(self.collected_name, 'collected_name')
        self.validate_required(self.contact_name, 'contact_name')
        self.validate_required(self.contact_phone, 'contact_phone')
        self.validate_required(self.contact_status, 'contact_status')
        self.validate_required(self.content, 'content')
        self.validate_required(self.overdue_date, 'overdue_date')
        self.validate_required(self.send_result, 'send_result')
        self.validate_required(self.send_way, 'send_way')
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.time, 'time')
        self.validate_required(self.type, 'type')
        self.validate_required(self.create_by, 'create_by')
        self.validate_required(self.template_no, 'template_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.a_case_id is not None:
            result['a_case_id'] = self.a_case_id
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        if self.collected_name is not None:
            result['collected_name'] = self.collected_name
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_phone is not None:
            result['contact_phone'] = self.contact_phone
        if self.contact_status is not None:
            result['contact_status'] = self.contact_status
        if self.content is not None:
            result['content'] = self.content
        if self.overdue_date is not None:
            result['overdue_date'] = self.overdue_date
        if self.remark is not None:
            result['remark'] = self.remark
        if self.send_result is not None:
            result['send_result'] = self.send_result
        if self.send_way is not None:
            result['send_way'] = self.send_way
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.time is not None:
            result['time'] = self.time
        if self.type is not None:
            result['type'] = self.type
        if self.create_by is not None:
            result['create_by'] = self.create_by
        if self.template_no is not None:
            result['template_no'] = self.template_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('a_case_id') is not None:
            self.a_case_id = m.get('a_case_id')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('collected_name') is not None:
            self.collected_name = m.get('collected_name')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_phone') is not None:
            self.contact_phone = m.get('contact_phone')
        if m.get('contact_status') is not None:
            self.contact_status = m.get('contact_status')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('overdue_date') is not None:
            self.overdue_date = m.get('overdue_date')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        if m.get('send_result') is not None:
            self.send_result = m.get('send_result')
        if m.get('send_way') is not None:
            self.send_way = m.get('send_way')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('create_by') is not None:
            self.create_by = m.get('create_by')
        if m.get('template_no') is not None:
            self.template_no = m.get('template_no')
        return self


class CallbackTaskSmsresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        flag: str = None,
        code: int = None,
        msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # S:成功,F:失败
        self.flag = flag
        # 0:成功,1:失败
        self.code = code
        # 成功or失败
        self.msg = msg
        # 结果说明
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
        if self.flag is not None:
            result['flag'] = self.flag
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('flag') is not None:
            self.flag = m.get('flag')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class PushCustomerInternalmsgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cust_no: str = None,
        template_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户号
        self.cust_no = cust_no
        # 模版信息
        self.template_info = template_info

    def validate(self):
        self.validate_required(self.cust_no, 'cust_no')
        self.validate_required(self.template_info, 'template_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cust_no is not None:
            result['cust_no'] = self.cust_no
        if self.template_info is not None:
            result['template_info'] = self.template_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cust_no') is not None:
            self.cust_no = m.get('cust_no')
        if m.get('template_info') is not None:
            self.template_info = m.get('template_info')
        return self


class PushCustomerInternalmsgResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        flag: str = None,
        code: int = None,
        msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # S:成功,F:失败
        self.flag = flag
        # 0:成功,1:失败
        self.code = code
        # 成功or失败
        self.msg = msg
        # 结果说明
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
        if self.flag is not None:
            result['flag'] = self.flag
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('flag') is not None:
            self.flag = m.get('flag')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackProviderRobotcallRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: int = None,
        number: str = None,
        number_md_5: str = None,
        batch_id: str = None,
        call_type: int = None,
        tag: str = None,
        call_id: str = None,
        task_id: int = None,
        task_name: str = None,
        template_id: int = None,
        template_name: str = None,
        status_code: int = None,
        status_description: str = None,
        transfer_status_code: int = None,
        transfer_status: str = None,
        agent_id: int = None,
        agent_tag: str = None,
        agent_extension: str = None,
        import_time: str = None,
        call_begin_time: str = None,
        ring_time: int = None,
        answer_time: str = None,
        speaking_time: str = None,
        speaking_duration: int = None,
        hangup_time: str = None,
        speaking_turns: str = None,
        agent_speaking_time: str = None,
        agent_speaking_duration: int = None,
        intent_tag: str = None,
        intent_description: str = None,
        individual_tag: str = None,
        keywords: str = None,
        hangup_type: int = None,
        sms: str = None,
        wa: str = None,
        chat_record: str = None,
        chats: str = None,
        add_wx: int = None,
        add_wx_status: str = None,
        answer_recall: int = None,
        properties: str = None,
        intercept_reason: str = None,
        company_id: int = None,
        sip_code: int = None,
        transfer_time: str = None,
        seats_group_id: int = None,
        seats_group_name: str = None,
        bill: int = None,
        channel_tag: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # AI任务中的外呼编号
        self.id = id
        # 外呼号码
        self.number = number
        # 外呼号码MD5
        self.number_md_5 = number_md_5
        # 导入号码返回的批次号
        self.batch_id = batch_id
        # 1001：坐席-人工外呼，
        # 1002：坐席-AI外呼-不转人工，
        # 1003：坐席-AI外呼-接通转人工，
        # 1004：坐席-AI外呼-智能转人工；
        # 2001:批量-预测外呼，
        # 2002:批量-AI外呼-不转人工，
        # 2003:批量-AI外呼-接通转人工，
        # 2004: 批量-AI外呼-智能转人工,
        # 2005:批量-语音通知,
        # 3001:视频外呼
        self.call_type = call_type
        # 用户自定义标签
        self.tag = tag
        # 外呼id
        self.call_id = call_id
        # 系统中的任务编号，若外呼类型为坐席主动外呼，则此处返回坐席ID
        self.task_id = task_id
        # 任务的名称
        self.task_name = task_name
        # 外呼的话术模版ID
        self.template_id = template_id
        # 话术模版名称
        self.template_name = template_name
        # 外呼状态编码
        self.status_code = status_code
        # 外呼状态，如"已接听"
        self.status_description = status_description
        # 转人工状态编码
        self.transfer_status_code = transfer_status_code
        # 转人工状态，可以为空
        self.transfer_status = transfer_status
        # 分配坐席id
        self.agent_id = agent_id
        # 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
        self.agent_tag = agent_tag
        # 坐席分机号
        self.agent_extension = agent_extension
        # 导入时间，格式:2019-01-09 14:14:19
        self.import_time = import_time
        # 开始拨号时间，格式：2019-01-09 14:14:19
        self.call_begin_time = call_begin_time
        # 振铃时长，单位毫秒
        self.ring_time = ring_time
        # 通话接通时间，格式：2019-01-09 14:14:19
        self.answer_time = answer_time
        # AI通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
        self.speaking_time = speaking_time
        # AI通话时长，单位：秒
        self.speaking_duration = speaking_duration
        # 通话挂断时间，格式：2019-01-09 14:14:19
        self.hangup_time = hangup_time
        # 对话轮次
        self.speaking_turns = speaking_turns
        # 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
        self.agent_speaking_time = agent_speaking_time
        # 坐席通话时长，单位：秒
        self.agent_speaking_duration = agent_speaking_duration
        # 意向标签
        self.intent_tag = intent_tag
        # 意向说明
        self.intent_description = intent_description
        # 个性标签
        self.individual_tag = individual_tag
        # 回复关键字
        self.keywords = keywords
        # AI挂机1，坐席挂机2，客户挂机3
        self.hangup_type = hangup_type
        # 挂机短信,1:发送 2:不发送
        self.sms = sms
        # 挂机WhatsApp
        self.wa = wa
        # 对话录音，URL，可以为空。录音异步上传，业务高峰可能会出现请求404的情况，可以稍后再重试获取。
        self.chat_record = chat_record
        # 对话记录,[{"fromNumber":"0","content": "你好，请问您是王小帅吗？","createTime": "2019-01-09 14:14:19"},{"fromNumber":"7945bd83237335e5376ff44d62e4f0ae","content":"嗯","createTime": "2019-01-09 14:14:20"}]
        self.chats = chats
        # 加微信，0:不添加，1:添加
        self.add_wx = add_wx
        # 可选值：已申请、加微成功
        self.add_wx_status = add_wx_status
        # 是否接通重呼,0正常外呼，1接通重呼
        self.answer_recall = answer_recall
        # 导入号码时的参数值
        self.properties = properties
        # 当状态为已拦截时，可选值：
        # 黑名单拦截
        # 灰名单拦截
        # 异常号码拦截
        self.intercept_reason = intercept_reason
        # 企业id
        self.company_id = company_id
        # 线路返回的sip编码code
        self.sip_code = sip_code
        # 指的是触发转人工的时间点，格式如：2019-01-09 14:14:19
        self.transfer_time = transfer_time
        # 触发转人工时，坐席组的ID
        self.seats_group_id = seats_group_id
        # 触发转人工时，坐席组的名称
        self.seats_group_name = seats_group_name
        # 线路通话时长,单位为毫秒，实际计费需向上取整转换为秒
        self.bill = bill
        # 外呼回调时可透传的信息内容，可以为空
        self.channel_tag = channel_tag

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.call_type, 'call_type')
        self.validate_required(self.call_id, 'call_id')
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.task_name, 'task_name')
        self.validate_required(self.status_code, 'status_code')
        self.validate_required(self.status_description, 'status_description')
        self.validate_required(self.transfer_status_code, 'transfer_status_code')
        self.validate_required(self.import_time, 'import_time')
        self.validate_required(self.call_begin_time, 'call_begin_time')
        self.validate_required(self.ring_time, 'ring_time')
        self.validate_required(self.speaking_time, 'speaking_time')
        self.validate_required(self.speaking_duration, 'speaking_duration')
        self.validate_required(self.hangup_time, 'hangup_time')
        self.validate_required(self.speaking_turns, 'speaking_turns')
        self.validate_required(self.agent_speaking_time, 'agent_speaking_time')
        self.validate_required(self.agent_speaking_duration, 'agent_speaking_duration')
        self.validate_required(self.intent_tag, 'intent_tag')
        self.validate_required(self.intent_description, 'intent_description')
        self.validate_required(self.hangup_type, 'hangup_type')
        self.validate_required(self.sms, 'sms')
        self.validate_required(self.wa, 'wa')
        self.validate_required(self.answer_recall, 'answer_recall')
        self.validate_required(self.company_id, 'company_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        if self.number is not None:
            result['number'] = self.number
        if self.number_md_5 is not None:
            result['number_md5'] = self.number_md_5
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        if self.call_type is not None:
            result['call_type'] = self.call_type
        if self.tag is not None:
            result['tag'] = self.tag
        if self.call_id is not None:
            result['call_id'] = self.call_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.status_code is not None:
            result['status_code'] = self.status_code
        if self.status_description is not None:
            result['status_description'] = self.status_description
        if self.transfer_status_code is not None:
            result['transfer_status_code'] = self.transfer_status_code
        if self.transfer_status is not None:
            result['transfer_status'] = self.transfer_status
        if self.agent_id is not None:
            result['agent_id'] = self.agent_id
        if self.agent_tag is not None:
            result['agent_tag'] = self.agent_tag
        if self.agent_extension is not None:
            result['agent_extension'] = self.agent_extension
        if self.import_time is not None:
            result['import_time'] = self.import_time
        if self.call_begin_time is not None:
            result['call_begin_time'] = self.call_begin_time
        if self.ring_time is not None:
            result['ring_time'] = self.ring_time
        if self.answer_time is not None:
            result['answer_time'] = self.answer_time
        if self.speaking_time is not None:
            result['speaking_time'] = self.speaking_time
        if self.speaking_duration is not None:
            result['speaking_duration'] = self.speaking_duration
        if self.hangup_time is not None:
            result['hangup_time'] = self.hangup_time
        if self.speaking_turns is not None:
            result['speaking_turns'] = self.speaking_turns
        if self.agent_speaking_time is not None:
            result['agent_speaking_time'] = self.agent_speaking_time
        if self.agent_speaking_duration is not None:
            result['agent_speaking_duration'] = self.agent_speaking_duration
        if self.intent_tag is not None:
            result['intent_tag'] = self.intent_tag
        if self.intent_description is not None:
            result['intent_description'] = self.intent_description
        if self.individual_tag is not None:
            result['individual_tag'] = self.individual_tag
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.hangup_type is not None:
            result['hangup_type'] = self.hangup_type
        if self.sms is not None:
            result['sms'] = self.sms
        if self.wa is not None:
            result['wa'] = self.wa
        if self.chat_record is not None:
            result['chat_record'] = self.chat_record
        if self.chats is not None:
            result['chats'] = self.chats
        if self.add_wx is not None:
            result['add_wx'] = self.add_wx
        if self.add_wx_status is not None:
            result['add_wx_status'] = self.add_wx_status
        if self.answer_recall is not None:
            result['answer_recall'] = self.answer_recall
        if self.properties is not None:
            result['properties'] = self.properties
        if self.intercept_reason is not None:
            result['intercept_reason'] = self.intercept_reason
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.sip_code is not None:
            result['sip_code'] = self.sip_code
        if self.transfer_time is not None:
            result['transfer_time'] = self.transfer_time
        if self.seats_group_id is not None:
            result['seats_group_id'] = self.seats_group_id
        if self.seats_group_name is not None:
            result['seats_group_name'] = self.seats_group_name
        if self.bill is not None:
            result['bill'] = self.bill
        if self.channel_tag is not None:
            result['channel_tag'] = self.channel_tag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('number') is not None:
            self.number = m.get('number')
        if m.get('number_md5') is not None:
            self.number_md_5 = m.get('number_md5')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        if m.get('call_type') is not None:
            self.call_type = m.get('call_type')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        if m.get('call_id') is not None:
            self.call_id = m.get('call_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('status_code') is not None:
            self.status_code = m.get('status_code')
        if m.get('status_description') is not None:
            self.status_description = m.get('status_description')
        if m.get('transfer_status_code') is not None:
            self.transfer_status_code = m.get('transfer_status_code')
        if m.get('transfer_status') is not None:
            self.transfer_status = m.get('transfer_status')
        if m.get('agent_id') is not None:
            self.agent_id = m.get('agent_id')
        if m.get('agent_tag') is not None:
            self.agent_tag = m.get('agent_tag')
        if m.get('agent_extension') is not None:
            self.agent_extension = m.get('agent_extension')
        if m.get('import_time') is not None:
            self.import_time = m.get('import_time')
        if m.get('call_begin_time') is not None:
            self.call_begin_time = m.get('call_begin_time')
        if m.get('ring_time') is not None:
            self.ring_time = m.get('ring_time')
        if m.get('answer_time') is not None:
            self.answer_time = m.get('answer_time')
        if m.get('speaking_time') is not None:
            self.speaking_time = m.get('speaking_time')
        if m.get('speaking_duration') is not None:
            self.speaking_duration = m.get('speaking_duration')
        if m.get('hangup_time') is not None:
            self.hangup_time = m.get('hangup_time')
        if m.get('speaking_turns') is not None:
            self.speaking_turns = m.get('speaking_turns')
        if m.get('agent_speaking_time') is not None:
            self.agent_speaking_time = m.get('agent_speaking_time')
        if m.get('agent_speaking_duration') is not None:
            self.agent_speaking_duration = m.get('agent_speaking_duration')
        if m.get('intent_tag') is not None:
            self.intent_tag = m.get('intent_tag')
        if m.get('intent_description') is not None:
            self.intent_description = m.get('intent_description')
        if m.get('individual_tag') is not None:
            self.individual_tag = m.get('individual_tag')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('hangup_type') is not None:
            self.hangup_type = m.get('hangup_type')
        if m.get('sms') is not None:
            self.sms = m.get('sms')
        if m.get('wa') is not None:
            self.wa = m.get('wa')
        if m.get('chat_record') is not None:
            self.chat_record = m.get('chat_record')
        if m.get('chats') is not None:
            self.chats = m.get('chats')
        if m.get('add_wx') is not None:
            self.add_wx = m.get('add_wx')
        if m.get('add_wx_status') is not None:
            self.add_wx_status = m.get('add_wx_status')
        if m.get('answer_recall') is not None:
            self.answer_recall = m.get('answer_recall')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
        if m.get('intercept_reason') is not None:
            self.intercept_reason = m.get('intercept_reason')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('sip_code') is not None:
            self.sip_code = m.get('sip_code')
        if m.get('transfer_time') is not None:
            self.transfer_time = m.get('transfer_time')
        if m.get('seats_group_id') is not None:
            self.seats_group_id = m.get('seats_group_id')
        if m.get('seats_group_name') is not None:
            self.seats_group_name = m.get('seats_group_name')
        if m.get('bill') is not None:
            self.bill = m.get('bill')
        if m.get('channel_tag') is not None:
            self.channel_tag = m.get('channel_tag')
        return self


class CallbackProviderRobotcallResponse(TeaModel):
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


class CallbackLvRobotcallRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        case_id: str = None,
        call_status: str = None,
        call_start_time: str = None,
        call_duration: int = None,
        call_summary: str = None,
        call_tags: CallTags = None,
        recording_url: str = None,
        transcript: List[Transcript] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 关联发起呼叫时的请求ID（唯一关联键）
        self.request_id = request_id
        # 案件唯一标识
        self.case_id = case_id
        # 通话状态。示例： connected （已接通）、no_answer （无人接听）
        self.call_status = call_status
        # 外呼开始时间，ISO 8601格式
        self.call_start_time = call_start_time
        # 外呼时长，单位：秒
        self.call_duration = call_duration
        # 通话总结
        self.call_summary = call_summary
        # 通话标签。一通通话仅返回一组标签
        self.call_tags = call_tags
        # 通话录音下载地址
        self.recording_url = recording_url
        # 录音全文，按对话轮次组织
        self.transcript = transcript

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.case_id, 'case_id')
        self.validate_required(self.call_status, 'call_status')
        self.validate_required(self.call_start_time, 'call_start_time')
        self.validate_required(self.call_duration, 'call_duration')
        self.validate_required(self.call_summary, 'call_summary')
        self.validate_required(self.call_tags, 'call_tags')
        if self.call_tags:
            self.call_tags.validate()
        self.validate_required(self.recording_url, 'recording_url')
        self.validate_required(self.transcript, 'transcript')
        if self.transcript:
            for k in self.transcript:
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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.case_id is not None:
            result['case_id'] = self.case_id
        if self.call_status is not None:
            result['call_status'] = self.call_status
        if self.call_start_time is not None:
            result['call_start_time'] = self.call_start_time
        if self.call_duration is not None:
            result['call_duration'] = self.call_duration
        if self.call_summary is not None:
            result['call_summary'] = self.call_summary
        if self.call_tags is not None:
            result['call_tags'] = self.call_tags.to_map()
        if self.recording_url is not None:
            result['recording_url'] = self.recording_url
        result['transcript'] = []
        if self.transcript is not None:
            for k in self.transcript:
                result['transcript'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('case_id') is not None:
            self.case_id = m.get('case_id')
        if m.get('call_status') is not None:
            self.call_status = m.get('call_status')
        if m.get('call_start_time') is not None:
            self.call_start_time = m.get('call_start_time')
        if m.get('call_duration') is not None:
            self.call_duration = m.get('call_duration')
        if m.get('call_summary') is not None:
            self.call_summary = m.get('call_summary')
        if m.get('call_tags') is not None:
            temp_model = CallTags()
            self.call_tags = temp_model.from_map(m['call_tags'])
        if m.get('recording_url') is not None:
            self.recording_url = m.get('recording_url')
        self.transcript = []
        if m.get('transcript') is not None:
            for k in m.get('transcript'):
                temp_model = Transcript()
                self.transcript.append(temp_model.from_map(k))
        return self


class CallbackLvRobotcallResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应码，0表示成功接收
        self.code = code
        # 响应描述
        self.message = message

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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


