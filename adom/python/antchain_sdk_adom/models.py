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


class UploadAppmarketOcrfileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        instance_id: str = None,
        file_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 所购商品实例id
        self.instance_id = instance_id
        # 文件名
        self.file_name = file_name

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.file_name, 'file_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        return self


class UploadAppmarketOcrfileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        upload_url: str = None,
        file_key: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件上传url
        self.upload_url = upload_url
        # 文件key
        self.file_key = file_key

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
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class ExecAppmarketBusinesslicenseocrRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        instance_id: str = None,
        file_key: str = None,
        file_url: str = None,
        ext: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品实例id
        self.instance_id = instance_id
        # 文件key
        self.file_key = file_key
        # 文件url
        self.file_url = file_url
        # 扩展信息
        self.ext = ext

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.file_key is not None:
            result['file_key'] = self.file_key
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.ext is not None:
            result['ext'] = self.ext
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('ext') is not None:
            self.ext = m.get('ext')
        return self


class ExecAppmarketBusinesslicenseocrResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        address: str = None,
        business: str = None,
        captial: str = None,
        establish_date: str = None,
        name: str = None,
        person: str = None,
        reg_num: str = None,
        stamp: str = None,
        type: str = None,
        valid_period: str = None,
        title: str = None,
        date: str = None,
        num: str = None,
        investors: str = None,
        formation: str = None,
        date_of_registration: str = None,
        operators: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 地址
        self.address = address
        # 经营范围
        self.business = business
        # 注册资本
        self.captial = captial
        # 企业成立日期
        self.establish_date = establish_date
        # 名称，控股股东名称
        self.name = name
        # 法定代表人
        self.person = person
        # 统一社会信用代码，控股股东证件号码
        self.reg_num = reg_num
        # 印章
        self.stamp = stamp
        # 类型，如：有限责任公司(自然人独资)
        self.type = type
        # 营业期限，营业执照有效期，控股股东证件有效期
        self.valid_period = valid_period
        # 标题，如"营业执照"
        self.title = title
        # 颁发日期
        self.date = date
        # 编号
        self.num = num
        # 投资人
        self.investors = investors
        # 组成形式
        self.formation = formation
        # 注册日期
        self.date_of_registration = date_of_registration
        # 经营者
        self.operators = operators

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
        if self.address is not None:
            result['address'] = self.address
        if self.business is not None:
            result['business'] = self.business
        if self.captial is not None:
            result['captial'] = self.captial
        if self.establish_date is not None:
            result['establish_date'] = self.establish_date
        if self.name is not None:
            result['name'] = self.name
        if self.person is not None:
            result['person'] = self.person
        if self.reg_num is not None:
            result['reg_num'] = self.reg_num
        if self.stamp is not None:
            result['stamp'] = self.stamp
        if self.type is not None:
            result['type'] = self.type
        if self.valid_period is not None:
            result['valid_period'] = self.valid_period
        if self.title is not None:
            result['title'] = self.title
        if self.date is not None:
            result['date'] = self.date
        if self.num is not None:
            result['num'] = self.num
        if self.investors is not None:
            result['investors'] = self.investors
        if self.formation is not None:
            result['formation'] = self.formation
        if self.date_of_registration is not None:
            result['date_of_registration'] = self.date_of_registration
        if self.operators is not None:
            result['operators'] = self.operators
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('business') is not None:
            self.business = m.get('business')
        if m.get('captial') is not None:
            self.captial = m.get('captial')
        if m.get('establish_date') is not None:
            self.establish_date = m.get('establish_date')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('person') is not None:
            self.person = m.get('person')
        if m.get('reg_num') is not None:
            self.reg_num = m.get('reg_num')
        if m.get('stamp') is not None:
            self.stamp = m.get('stamp')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('valid_period') is not None:
            self.valid_period = m.get('valid_period')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('num') is not None:
            self.num = m.get('num')
        if m.get('investors') is not None:
            self.investors = m.get('investors')
        if m.get('formation') is not None:
            self.formation = m.get('formation')
        if m.get('date_of_registration') is not None:
            self.date_of_registration = m.get('date_of_registration')
        if m.get('operators') is not None:
            self.operators = m.get('operators')
        return self


class QueryAppmarketPrivacyresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        instance_id: str = None,
        record_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品实例id
        self.instance_id = instance_id
        # 执行记录id
        self.record_id = record_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.record_id, 'record_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.record_id is not None:
            result['record_id'] = self.record_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('record_id') is not None:
            self.record_id = m.get('record_id')
        return self


class QueryAppmarketPrivacyresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        result_url: str = None,
        failed_reason: str = None,
        struct_output: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 隐私计算模型执行状态
        self.status = status
        # 结果文件路径
        self.result_url = result_url
        # 失败的原因
        self.failed_reason = failed_reason
        # 结构化出参
        self.struct_output = struct_output

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
        if self.result_url is not None:
            result['result_url'] = self.result_url
        if self.failed_reason is not None:
            result['failed_reason'] = self.failed_reason
        if self.struct_output is not None:
            result['struct_output'] = self.struct_output
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
        if m.get('result_url') is not None:
            self.result_url = m.get('result_url')
        if m.get('failed_reason') is not None:
            self.failed_reason = m.get('failed_reason')
        if m.get('struct_output') is not None:
            self.struct_output = m.get('struct_output')
        return self


class UploadAppmarketFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        instance_id: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 所购商品实例id
        self.instance_id = instance_id
        # 文件标识，用作文件名
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadAppmarketFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        upload_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件上传url
        self.upload_url = upload_url

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
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        return self


class ExecAppmarketPrivacymodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        instance_id: str = None,
        file_id: str = None,
        struct_input: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品实例id
        self.instance_id = instance_id
        # 文件标识，文件上传时的入参
        self.file_id = file_id
        # 结构化入参
        self.struct_input = struct_input

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.struct_input is not None:
            result['struct_input'] = self.struct_input
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('struct_input') is not None:
            self.struct_input = m.get('struct_input')
        return self


class ExecAppmarketPrivacymodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        result_url: str = None,
        failed_reason: str = None,
        struct_output: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 执行状态
        self.status = status
        # 结果文件url
        self.result_url = result_url
        # 执行失败原因
        self.failed_reason = failed_reason
        # 结构化出参
        self.struct_output = struct_output

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
        if self.result_url is not None:
            result['result_url'] = self.result_url
        if self.failed_reason is not None:
            result['failed_reason'] = self.failed_reason
        if self.struct_output is not None:
            result['struct_output'] = self.struct_output
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
        if m.get('result_url') is not None:
            self.result_url = m.get('result_url')
        if m.get('failed_reason') is not None:
            self.failed_reason = m.get('failed_reason')
        if m.get('struct_output') is not None:
            self.struct_output = m.get('struct_output')
        return self


class SubmitAppmarketPrivacymodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        instance_id: str = None,
        file_id: str = None,
        struct_input: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品实例id
        self.instance_id = instance_id
        # 文件名称
        self.file_id = file_id
        # 结构化入参
        self.struct_input = struct_input

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.struct_input is not None:
            result['struct_input'] = self.struct_input
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('struct_input') is not None:
            self.struct_input = m.get('struct_input')
        return self


class SubmitAppmarketPrivacymodelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        record_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 异步提交执行记录id
        self.record_id = record_id

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
        if self.record_id is not None:
            result['record_id'] = self.record_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('record_id') is not None:
            self.record_id = m.get('record_id')
        return self


