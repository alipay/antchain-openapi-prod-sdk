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


