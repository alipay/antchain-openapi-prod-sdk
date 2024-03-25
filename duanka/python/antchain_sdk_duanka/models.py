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


class QueryResult(TeaModel):
    def __init__(
        self,
        work_no: str = None,
        nick_name: str = None,
        name: str = None,
        login_account: str = None,
        bu_mail: str = None,
        emp_type: str = None,
    ):
        # 工号
        self.work_no = work_no
        # 花名
        self.nick_name = nick_name
        # 姓名
        self.name = name
        # 域账号
        self.login_account = login_account
        # 企业邮箱
        self.bu_mail = bu_mail
        # 人员类型
        self.emp_type = emp_type

    def validate(self):
        self.validate_required(self.work_no, 'work_no')
        self.validate_required(self.name, 'name')
        self.validate_required(self.login_account, 'login_account')
        self.validate_required(self.bu_mail, 'bu_mail')
        self.validate_required(self.emp_type, 'emp_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.work_no is not None:
            result['work_no'] = self.work_no
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        if self.name is not None:
            result['name'] = self.name
        if self.login_account is not None:
            result['login_account'] = self.login_account
        if self.bu_mail is not None:
            result['bu_mail'] = self.bu_mail
        if self.emp_type is not None:
            result['emp_type'] = self.emp_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('work_no') is not None:
            self.work_no = m.get('work_no')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('login_account') is not None:
            self.login_account = m.get('login_account')
        if m.get('bu_mail') is not None:
            self.bu_mail = m.get('bu_mail')
        if m.get('emp_type') is not None:
            self.emp_type = m.get('emp_type')
        return self


class UserInfoResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        message: str = None,
        error_code: str = None,
        query_result_list: List[QueryResult] = None,
    ):
        # hr主数据接口调用结果
        self.success = success
        # 调用信息
        self.message = message
        # 错误码
        self.error_code = error_code
        # 查询结果
        self.query_result_list = query_result_list

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.query_result_list, 'query_result_list')
        if self.query_result_list:
            for k in self.query_result_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.message is not None:
            result['message'] = self.message
        if self.error_code is not None:
            result['error_code'] = self.error_code
        result['query_result_list'] = []
        if self.query_result_list is not None:
            for k in self.query_result_list:
                result['query_result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        self.query_result_list = []
        if m.get('query_result_list') is not None:
            for k in m.get('query_result_list'):
                temp_model = QueryResult()
                self.query_result_list.append(temp_model.from_map(k))
        return self


class ModelResult(TeaModel):
    def __init__(
        self,
        score: str = None,
        model_id: str = None,
    ):
        # 分数
        self.score = score
        # 模型id
        self.model_id = model_id

    def validate(self):
        self.validate_required(self.score, 'score')
        self.validate_required(self.model_id, 'model_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.score is not None:
            result['score'] = self.score
        if self.model_id is not None:
            result['model_id'] = self.model_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        return self


class QueryDuankaEvaluationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        order_id: str = None,
        model_list: str = None,
        user_id: str = None,
        user_id_type: str = None,
        encrypt_type: str = None,
        auth_template_no: str = None,
        auth_no: str = None,
        request_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求流水ID
        self.request_id = request_id
        # 用户关联订单号
        self.order_id = order_id
        # 请求模型ID列表（目前仅支持每次请求一个模型），逗号分割
        self.model_list = model_list
        # 用户id
        self.user_id = user_id
        # 用户id类型：
        # "ID_NO"： 身份证号,
        self.user_id_type = user_id_type
        # 加密类型(目前只支持SHA256):
        # "MD5"：MD5（32位小写）,
        # "SHA256" ： SHA256（密文小写），              "SM3"： SM3（密文小写）
        self.encrypt_type = encrypt_type
        # 用户授权模版编号
        self.auth_template_no = auth_template_no
        # 用户授权编码
        self.auth_no = auth_no
        # 客户发起请求时间, 格式："yyyy-MM-dd HH:mm:ss"
        self.request_time = request_time

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.model_list, 'model_list')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.encrypt_type, 'encrypt_type')
        self.validate_required(self.auth_template_no, 'auth_template_no')
        self.validate_required(self.auth_no, 'auth_no')
        self.validate_required(self.request_time, 'request_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.model_list is not None:
            result['model_list'] = self.model_list
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.auth_template_no is not None:
            result['auth_template_no'] = self.auth_template_no
        if self.auth_no is not None:
            result['auth_no'] = self.auth_no
        if self.request_time is not None:
            result['request_time'] = self.request_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('model_list') is not None:
            self.model_list = m.get('model_list')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('auth_template_no') is not None:
            self.auth_template_no = m.get('auth_template_no')
        if m.get('auth_no') is not None:
            self.auth_no = m.get('auth_no')
        if m.get('request_time') is not None:
            self.request_time = m.get('request_time')
        return self


class QueryDuankaEvaluationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ModelResult] = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型结果，数组返回
        self.result = result
        # 请求流水ID
        self.request_id = request_id

    def validate(self):
        if self.result:
            for k in self.result:
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
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ModelResult()
                self.result.append(temp_model.from_map(k))
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryHrUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        nick_name_list: List[str] = None,
        login_account_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 花名列表
        self.nick_name_list = nick_name_list
        # 域账户列表
        self.login_account_list = login_account_list

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.nick_name_list is not None:
            result['nick_name_list'] = self.nick_name_list
        if self.login_account_list is not None:
            result['login_account_list'] = self.login_account_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('nick_name_list') is not None:
            self.nick_name_list = m.get('nick_name_list')
        if m.get('login_account_list') is not None:
            self.login_account_list = m.get('login_account_list')
        return self


class QueryHrUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_info_result: UserInfoResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询用户信息结果
        self.user_info_result = user_info_result

    def validate(self):
        if self.user_info_result:
            self.user_info_result.validate()

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
        if self.user_info_result is not None:
            result['user_info_result'] = self.user_info_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user_info_result') is not None:
            temp_model = UserInfoResult()
            self.user_info_result = temp_model.from_map(m['user_info_result'])
        return self


class QuerySkyholdResRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_code: str = None,
        key_id: str = None,
        channel_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 业务biz_code
        self.biz_code = biz_code
        # 查询key
        self.key_id = key_id
        # 渠道code
        self.channel_code = channel_code

    def validate(self):
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.key_id, 'key_id')
        self.validate_required(self.channel_code, 'channel_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.key_id is not None:
            result['key_id'] = self.key_id
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('key_id') is not None:
            self.key_id = m.get('key_id')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        return self


class QuerySkyholdResResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        json_res: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询结果
        self.json_res = json_res

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
        if self.json_res is not None:
            result['json_res'] = self.json_res
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('json_res') is not None:
            self.json_res = m.get('json_res')
        return self


class QueryCommonScoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        auth_no: str = None,
        model_id: str = None,
        user_id: str = None,
        user_id_type: str = None,
        encrypt_type: str = None,
        customer_code: str = None,
        trans_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户授权编码
        self.auth_no = auth_no
        # 模型id
        self.model_id = model_id
        # 用户id（客户身份证号/手机号的md5/sha256散列值）
        self.user_id = user_id
        # 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        self.user_id_type = user_id_type
        # 加密类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        self.encrypt_type = encrypt_type
        # 客户编码
        self.customer_code = customer_code
        # 流水号，串联链路用，非必填
        self.trans_no = trans_no

    def validate(self):
        self.validate_required(self.auth_no, 'auth_no')
        self.validate_required(self.model_id, 'model_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.encrypt_type, 'encrypt_type')
        self.validate_required(self.customer_code, 'customer_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.auth_no is not None:
            result['auth_no'] = self.auth_no
        if self.model_id is not None:
            result['model_id'] = self.model_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.customer_code is not None:
            result['customer_code'] = self.customer_code
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('auth_no') is not None:
            self.auth_no = m.get('auth_no')
        if m.get('model_id') is not None:
            self.model_id = m.get('model_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('customer_code') is not None:
            self.customer_code = m.get('customer_code')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


class QueryCommonScoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        score: str = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型分数
        self.score = score
        # 流水号
        self.trans_no = trans_no

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
        if self.score is not None:
            result['score'] = self.score
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


