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


class ReturnDetail(TeaModel):
    def __init__(
        self,
        biz_content: str = None,
        return_type: str = None,
        file_urls: List[str] = None,
        file_type: str = None,
        encrypt_model: str = None,
        secret_envelope: str = None,
    ):
        # 结果对象内容
        self.biz_content = biz_content
        # 返回形式
        self.return_type = return_type
        # 文件列表
        self.file_urls = file_urls
        # 文件类型
        self.file_type = file_type
        # 加密模式
        self.encrypt_model = encrypt_model
        # 密钥信封
        self.secret_envelope = secret_envelope

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.return_type, 'return_type')
        self.validate_required(self.file_urls, 'file_urls')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.encrypt_model, 'encrypt_model')
        self.validate_required(self.secret_envelope, 'secret_envelope')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.return_type is not None:
            result['return_type'] = self.return_type
        if self.file_urls is not None:
            result['file_urls'] = self.file_urls
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.encrypt_model is not None:
            result['encrypt_model'] = self.encrypt_model
        if self.secret_envelope is not None:
            result['secret_envelope'] = self.secret_envelope
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('return_type') is not None:
            self.return_type = m.get('return_type')
        if m.get('file_urls') is not None:
            self.file_urls = m.get('file_urls')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('encrypt_model') is not None:
            self.encrypt_model = m.get('encrypt_model')
        if m.get('secret_envelope') is not None:
            self.secret_envelope = m.get('secret_envelope')
        return self


class ExecBlockchainTaxIcmSyncgatheringRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        inst_code: str = None,
        biz_request_id: str = None,
        identity_id: str = None,
        auth_type: str = None,
        order_no: str = None,
        content: str = None,
        query_type: str = None,
        sub_tenant: str = None,
        use_priority: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 机构号码
        self.inst_code = inst_code
        # 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
        self.biz_request_id = biz_request_id
        # 纳税人识别号(必填)
        self.identity_id = identity_id
        # 授权类型(必填)
        self.auth_type = auth_type
        # 订单号
        self.order_no = order_no
        # 补充内容,如果不动产中字段为空的话查的就是授权中的cityCode
        self.content = content
        # 查询类型
        # NORMAL 正常调用
        # BATCH_HAND  批刷
        self.query_type = query_type
        # 子机构编码，字典由系统预设白名单
        self.sub_tenant = sub_tenant
        # 优先级，越大优先级越高
        self.use_priority = use_priority

    def validate(self):
        self.validate_required(self.inst_code, 'inst_code')
        self.validate_required(self.biz_request_id, 'biz_request_id')
        self.validate_required(self.identity_id, 'identity_id')
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.inst_code is not None:
            result['inst_code'] = self.inst_code
        if self.biz_request_id is not None:
            result['biz_request_id'] = self.biz_request_id
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.content is not None:
            result['content'] = self.content
        if self.query_type is not None:
            result['query_type'] = self.query_type
        if self.sub_tenant is not None:
            result['sub_tenant'] = self.sub_tenant
        if self.use_priority is not None:
            result['use_priority'] = self.use_priority
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('inst_code') is not None:
            self.inst_code = m.get('inst_code')
        if m.get('biz_request_id') is not None:
            self.biz_request_id = m.get('biz_request_id')
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('query_type') is not None:
            self.query_type = m.get('query_type')
        if m.get('sub_tenant') is not None:
            self.sub_tenant = m.get('sub_tenant')
        if m.get('use_priority') is not None:
            self.use_priority = m.get('use_priority')
        return self


class ExecBlockchainTaxIcmSyncgatheringResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_content: str = None,
        query_time: str = None,
        return_mode: str = None,
        return_result: List[ReturnDetail] = None,
        null_data_flag: bool = None,
        query_type: str = None,
        reauth: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回的请求对象jsonString
        self.biz_content = biz_content
        # unix秒时间戳,查询时间，用来对账使用
        self.query_time = query_time
        # 返回模式
        self.return_mode = return_mode
        # 返回结果
        self.return_result = return_result
        # 是否查得
        self.null_data_flag = null_data_flag
        # 参考区块链给出的标准字段定义
        self.query_type = query_type
        # 是否需要重新授权
        self.reauth = reauth

    def validate(self):
        if self.return_result:
            for k in self.return_result:
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
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.query_time is not None:
            result['query_time'] = self.query_time
        if self.return_mode is not None:
            result['return_mode'] = self.return_mode
        result['return_result'] = []
        if self.return_result is not None:
            for k in self.return_result:
                result['return_result'].append(k.to_map() if k else None)
        if self.null_data_flag is not None:
            result['null_data_flag'] = self.null_data_flag
        if self.query_type is not None:
            result['query_type'] = self.query_type
        if self.reauth is not None:
            result['reauth'] = self.reauth
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('query_time') is not None:
            self.query_time = m.get('query_time')
        if m.get('return_mode') is not None:
            self.return_mode = m.get('return_mode')
        self.return_result = []
        if m.get('return_result') is not None:
            for k in m.get('return_result'):
                temp_model = ReturnDetail()
                self.return_result.append(temp_model.from_map(k))
        if m.get('null_data_flag') is not None:
            self.null_data_flag = m.get('null_data_flag')
        if m.get('query_type') is not None:
            self.query_type = m.get('query_type')
        if m.get('reauth') is not None:
            self.reauth = m.get('reauth')
        return self


class RunBlockchainTaxApiDataprocessRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_param: str = None,
        product_code: str = None,
        method_code: str = None,
        inst_code: str = None,
        algorithm: str = None,
        encryption: bool = None,
        encryption_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求参数json
        self.biz_param = biz_param
        # 产品code
        self.product_code = product_code
        # 调用的方法
        self.method_code = method_code
        # 租户编码
        self.inst_code = inst_code
        # RSA-DESede
        # 代表数字信封：采用 rsa 非对称算法，DESede 对称算法
        self.algorithm = algorithm
        # 是否采用加密算法
        self.encryption = encryption
        # 对称秘钥加密后的数据
        self.encryption_key = encryption_key

    def validate(self):
        self.validate_required(self.biz_param, 'biz_param')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.method_code, 'method_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_param is not None:
            result['biz_param'] = self.biz_param
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.method_code is not None:
            result['method_code'] = self.method_code
        if self.inst_code is not None:
            result['inst_code'] = self.inst_code
        if self.algorithm is not None:
            result['algorithm'] = self.algorithm
        if self.encryption is not None:
            result['encryption'] = self.encryption
        if self.encryption_key is not None:
            result['encryption_key'] = self.encryption_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_param') is not None:
            self.biz_param = m.get('biz_param')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('method_code') is not None:
            self.method_code = m.get('method_code')
        if m.get('inst_code') is not None:
            self.inst_code = m.get('inst_code')
        if m.get('algorithm') is not None:
            self.algorithm = m.get('algorithm')
        if m.get('encryption') is not None:
            self.encryption = m.get('encryption')
        if m.get('encryption_key') is not None:
            self.encryption_key = m.get('encryption_key')
        return self


class RunBlockchainTaxApiDataprocessResponse(TeaModel):
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
        # 返回数据
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


