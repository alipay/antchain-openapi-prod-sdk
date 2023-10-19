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


class RiskModel(TeaModel):
    def __init__(
        self,
        model_name: str = None,
        model_value: str = None,
        model_comment: str = None,
    ):
        # 标签名称
        self.model_name = model_name
        # 风险值
        self.model_value = model_value
        # 风险标签描述
        self.model_comment = model_comment

    def validate(self):
        self.validate_required(self.model_name, 'model_name')
        self.validate_required(self.model_value, 'model_value')
        self.validate_required(self.model_comment, 'model_comment')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.model_value is not None:
            result['model_value'] = self.model_value
        if self.model_comment is not None:
            result['model_comment'] = self.model_comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('model_value') is not None:
            self.model_value = m.get('model_value')
        if m.get('model_comment') is not None:
            self.model_comment = m.get('model_comment')
        return self


class ResponseHead(TeaModel):
    def __init__(
        self,
        request_id: str = None,
    ):
        # 请求唯一标识
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class RiskAssessResult(TeaModel):
    def __init__(
        self,
        risk_value: str = None,
        risk_score: str = None,
        model_infos: RiskModel = None,
    ):
        # 风险评估结果
        self.risk_value = risk_value
        # 风险评估分数
        self.risk_score = risk_score
        # 风险评估标签
        self.model_infos = model_infos

    def validate(self):
        self.validate_required(self.risk_value, 'risk_value')
        self.validate_required(self.risk_score, 'risk_score')
        self.validate_required(self.model_infos, 'model_infos')
        if self.model_infos:
            self.model_infos.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_value is not None:
            result['risk_value'] = self.risk_value
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.model_infos is not None:
            result['model_infos'] = self.model_infos.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_value') is not None:
            self.risk_value = m.get('risk_value')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('model_infos') is not None:
            temp_model = RiskModel()
            self.model_infos = temp_model.from_map(m['model_infos'])
        return self


class RequestHead(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        secret_id: str = None,
        product_code: str = None,
    ):
        # 请求唯一标识
        self.request_id = request_id
        # 客户身份标识ID
        self.secret_id = secret_id
        # 客户签约产品code
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.secret_id, 'secret_id')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.secret_id is not None:
            result['secret_id'] = self.secret_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('secret_id') is not None:
            self.secret_id = m.get('secret_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class RiskAssessData(TeaModel):
    def __init__(
        self,
        head: ResponseHead = None,
        risk_result: RiskAssessResult = None,
    ):
        # 响应头
        self.head = head
        # 风险评估结果
        self.risk_result = risk_result

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.risk_result, 'risk_result')
        if self.risk_result:
            self.risk_result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.risk_result is not None:
            result['risk_result'] = self.risk_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('head') is not None:
            temp_model = ResponseHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('risk_result') is not None:
            temp_model = RiskAssessResult()
            self.risk_result = temp_model.from_map(m['risk_result'])
        return self


class QueryAntsecuritytechGatewayEkytDriverRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        head: RequestHead = None,
        request: str = None,
        signature: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 接口请求head
        self.head = head
        # 请求业务参数，加密之后的密文信息
        self.request = request
        # 请求数据签名值
        self.signature = signature

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.request, 'request')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.request is not None:
            result['request'] = self.request
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('head') is not None:
            temp_model = RequestHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('request') is not None:
            self.request = m.get('request')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class QueryAntsecuritytechGatewayEkytDriverResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: RiskAssessData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口响应结果
        self.success = success
        # 接口响应描述
        self.message = message
        # 接口响应数据
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data.to_map()
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
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            temp_model = RiskAssessData()
            self.data = temp_model.from_map(m['data'])
        return self


