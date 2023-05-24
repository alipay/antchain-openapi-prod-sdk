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


class FaceShieldResult(TeaModel):
    def __init__(
        self,
        apdid_token: str = None,
        risk_level: int = None,
        risk_desc: str = None,
        sug_action: str = None,
    ):
        # 设备token
        self.apdid_token = apdid_token
        # 风险等级，-1参数异常，0无风险，1-3表示低、中、高
        self.risk_level = risk_level
        # 风险描述，对风险等级的补充
        self.risk_desc = risk_desc
        # 处理的建议，如PAAS
        self.sug_action = sug_action

    def validate(self):
        self.validate_required(self.apdid_token, 'apdid_token')
        self.validate_required(self.risk_level, 'risk_level')
        self.validate_required(self.risk_desc, 'risk_desc')
        self.validate_required(self.sug_action, 'sug_action')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        if self.risk_desc is not None:
            result['risk_desc'] = self.risk_desc
        if self.sug_action is not None:
            result['sug_action'] = self.sug_action
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        if m.get('risk_desc') is not None:
            self.risk_desc = m.get('risk_desc')
        if m.get('sug_action') is not None:
            self.sug_action = m.get('sug_action')
        return self


class InsureInfo(TeaModel):
    def __init__(
        self,
        modify_time: str = None,
        product_code: str = None,
        insure_product: str = None,
        insure_price: str = None,
        insure_type: str = None,
        pay_type: str = None,
        insure_period: str = None,
        policy_status: str = None,
        operate_type: str = None,
        insure_comp_credit_no: str = None,
    ):
        # 保单时间
        self.modify_time = modify_time
        # 蚂蚁L5产品code
        self.product_code = product_code
        # 保险产品code
        self.insure_product = insure_product
        # 保险产品价格
        self.insure_price = insure_price
        # 保险品种
        self.insure_type = insure_type
        # 付款方式
        self.pay_type = pay_type
        # 保险期数
        self.insure_period = insure_period
        # 保单状态
        self.policy_status = policy_status
        # 操作类型
        self.operate_type = operate_type
        # 保司信用代码
        self.insure_comp_credit_no = insure_comp_credit_no

    def validate(self):
        self.validate_required(self.modify_time, 'modify_time')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.insure_product, 'insure_product')
        self.validate_required(self.insure_price, 'insure_price')
        self.validate_required(self.insure_type, 'insure_type')
        self.validate_required(self.pay_type, 'pay_type')
        self.validate_required(self.insure_period, 'insure_period')
        self.validate_required(self.policy_status, 'policy_status')
        self.validate_required(self.operate_type, 'operate_type')
        self.validate_required(self.insure_comp_credit_no, 'insure_comp_credit_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.insure_product is not None:
            result['insure_product'] = self.insure_product
        if self.insure_price is not None:
            result['insure_price'] = self.insure_price
        if self.insure_type is not None:
            result['insure_type'] = self.insure_type
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        if self.insure_period is not None:
            result['insure_period'] = self.insure_period
        if self.policy_status is not None:
            result['policy_status'] = self.policy_status
        if self.operate_type is not None:
            result['operate_type'] = self.operate_type
        if self.insure_comp_credit_no is not None:
            result['insure_comp_credit_no'] = self.insure_comp_credit_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('insure_product') is not None:
            self.insure_product = m.get('insure_product')
        if m.get('insure_price') is not None:
            self.insure_price = m.get('insure_price')
        if m.get('insure_type') is not None:
            self.insure_type = m.get('insure_type')
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        if m.get('insure_period') is not None:
            self.insure_period = m.get('insure_period')
        if m.get('policy_status') is not None:
            self.policy_status = m.get('policy_status')
        if m.get('operate_type') is not None:
            self.operate_type = m.get('operate_type')
        if m.get('insure_comp_credit_no') is not None:
            self.insure_comp_credit_no = m.get('insure_comp_credit_no')
        return self


class RunGeneralRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request: str = None,
        service_name: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务请求数据，json格式
        self.request = request
        # 要调用的具体的服务名称
        self.service_name = service_name
        # 扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.request, 'request')
        self.validate_required(self.service_name, 'service_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request is not None:
            result['request'] = self.request
        if self.service_name is not None:
            result['service_name'] = self.service_name
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request') is not None:
            self.request = m.get('request')
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class RunGeneralResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务响应数据，json格式
        self.response = response

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
        if self.response is not None:
            result['response'] = self.response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response') is not None:
            self.response = m.get('response')
        return self


class ExecEkytInsureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        insure_info: str = None,
        applicant_info: str = None,
        assured_info: str = None,
        signature: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 保险信息，包含保单的所有信息
        self.insure_info = insure_info
        # 投保人信息
        self.applicant_info = applicant_info
        # 被保人信息
        self.assured_info = assured_info
        # 数据签名
        self.signature = signature

    def validate(self):
        self.validate_required(self.insure_info, 'insure_info')
        self.validate_required(self.applicant_info, 'applicant_info')
        self.validate_required(self.assured_info, 'assured_info')
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
        if self.insure_info is not None:
            result['insure_info'] = self.insure_info
        if self.applicant_info is not None:
            result['applicant_info'] = self.applicant_info
        if self.assured_info is not None:
            result['assured_info'] = self.assured_info
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('insure_info') is not None:
            self.insure_info = m.get('insure_info')
        if m.get('applicant_info') is not None:
            self.applicant_info = m.get('applicant_info')
        if m.get('assured_info') is not None:
            self.assured_info = m.get('assured_info')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class ExecEkytInsureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: str = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 返回结果描述
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
        if self.success is not None:
            result['success'] = self.success
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class CreateBssecpicRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        client_name: str = None,
        os_type: str = None,
        package_name: str = None,
        cert_sign: str = None,
        app_key_data: str = None,
        security_data: str = None,
        extra_data: str = None,
        white_box_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 客户名
        self.client_name = client_name
        # 操作系统
        self.os_type = os_type
        # 包名
        self.package_name = package_name
        # 签名信息
        self.cert_sign = cert_sign
        # 签名秘钥内容
        self.app_key_data = app_key_data
        # 加密秘钥内容
        self.security_data = security_data
        # 自定义秘钥内容
        self.extra_data = extra_data
        # 白盒秘钥内容
        self.white_box_data = white_box_data

    def validate(self):
        self.validate_required(self.client_name, 'client_name')
        self.validate_required(self.os_type, 'os_type')
        self.validate_required(self.package_name, 'package_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.client_name is not None:
            result['client_name'] = self.client_name
        if self.os_type is not None:
            result['os_type'] = self.os_type
        if self.package_name is not None:
            result['package_name'] = self.package_name
        if self.cert_sign is not None:
            result['cert_sign'] = self.cert_sign
        if self.app_key_data is not None:
            result['app_key_data'] = self.app_key_data
        if self.security_data is not None:
            result['security_data'] = self.security_data
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        if self.white_box_data is not None:
            result['white_box_data'] = self.white_box_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('client_name') is not None:
            self.client_name = m.get('client_name')
        if m.get('os_type') is not None:
            self.os_type = m.get('os_type')
        if m.get('package_name') is not None:
            self.package_name = m.get('package_name')
        if m.get('cert_sign') is not None:
            self.cert_sign = m.get('cert_sign')
        if m.get('app_key_data') is not None:
            self.app_key_data = m.get('app_key_data')
        if m.get('security_data') is not None:
            self.security_data = m.get('security_data')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        if m.get('white_box_data') is not None:
            self.white_box_data = m.get('white_box_data')
        return self


class CreateBssecpicResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        file_name: str = None,
        body_base_64: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 返回文件名
        self.file_name = file_name
        # 返回文件的内容base64
        self.body_base_64 = body_base_64

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
        if self.success is not None:
            result['success'] = self.success
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.body_base_64 is not None:
            result['body_base64'] = self.body_base_64
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
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('body_base64') is not None:
            self.body_base_64 = m.get('body_base64')
        return self


class CreateBlueshieldSecuritypictureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_name: str = None,
        client_name: str = None,
        os_type: str = None,
        package_name: str = None,
        cert_sign: str = None,
        app_key_data: str = None,
        security_data: str = None,
        extra_data: str = None,
        white_box_data: str = None,
        raas_products: str = None,
        raas_second_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 应用名
        self.app_name = app_name
        # 客户名
        self.client_name = client_name
        # 操作系统
        self.os_type = os_type
        # 包名
        self.package_name = package_name
        # 签名信息
        self.cert_sign = cert_sign
        # 签名秘钥内容
        self.app_key_data = app_key_data
        # 加密秘钥内容
        self.security_data = security_data
        # 自定义秘钥内容
        self.extra_data = extra_data
        # 白盒秘钥内容
        self.white_box_data = white_box_data
        # raas产品码列表
        self.raas_products = raas_products
        # 直接透传的二级租户，可选
        self.raas_second_tenant = raas_second_tenant

    def validate(self):
        self.validate_required(self.client_name, 'client_name')
        self.validate_required(self.os_type, 'os_type')
        self.validate_required(self.package_name, 'package_name')
        self.validate_required(self.raas_products, 'raas_products')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.client_name is not None:
            result['client_name'] = self.client_name
        if self.os_type is not None:
            result['os_type'] = self.os_type
        if self.package_name is not None:
            result['package_name'] = self.package_name
        if self.cert_sign is not None:
            result['cert_sign'] = self.cert_sign
        if self.app_key_data is not None:
            result['app_key_data'] = self.app_key_data
        if self.security_data is not None:
            result['security_data'] = self.security_data
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        if self.white_box_data is not None:
            result['white_box_data'] = self.white_box_data
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        if self.raas_second_tenant is not None:
            result['raas_second_tenant'] = self.raas_second_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('client_name') is not None:
            self.client_name = m.get('client_name')
        if m.get('os_type') is not None:
            self.os_type = m.get('os_type')
        if m.get('package_name') is not None:
            self.package_name = m.get('package_name')
        if m.get('cert_sign') is not None:
            self.cert_sign = m.get('cert_sign')
        if m.get('app_key_data') is not None:
            self.app_key_data = m.get('app_key_data')
        if m.get('security_data') is not None:
            self.security_data = m.get('security_data')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        if m.get('white_box_data') is not None:
            self.white_box_data = m.get('white_box_data')
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        if m.get('raas_second_tenant') is not None:
            self.raas_second_tenant = m.get('raas_second_tenant')
        return self


class CreateBlueshieldSecuritypictureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        file_name: str = None,
        body_base_64: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 执行是否成功
        self.success = success
        # 生成的图片文件名
        self.file_name = file_name
        # body base 64
        self.body_base_64 = body_base_64

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
        if self.success is not None:
            result['success'] = self.success
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.body_base_64 is not None:
            result['body_base64'] = self.body_base_64
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
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('body_base64') is not None:
            self.body_base_64 = m.get('body_base64')
        return self


class QueryFaceshieldNativeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        client_id: str = None,
        apdid_token: str = None,
        aop_data: str = None,
        signature: str = None,
        sign_factor: str = None,
        raas_products: str = None,
        raas_second_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户id，标识客户来源
        self.client_id = client_id
        # 设备token
        self.apdid_token = apdid_token
        # 切面数据（JSON，详见下方）
        # {
        # "sessionId": "zimId"	//人脸的bizID
        # "rId": "rId"	//在获取活体方法人脸下发的bisToken
        # "keyInfoHash": "keyInfoHash"	//关键信息hash
        # "pictureHash": "人脸图片的hash"	//解密出来的人脸图片做hash
        # "rData": "xxx"	//客户端在zimInit和zimValidate带上去的业务风险数据
        # }
        self.aop_data = aop_data
        # 否（和切面二选一即可）
        self.signature = signature
        # 签名因子（和切面二选一即可）
        self.sign_factor = sign_factor
        # RaaS租户
        self.raas_products = raas_products
        # raas二级租户
        self.raas_second_tenant = raas_second_tenant

    def validate(self):
        self.validate_required(self.client_id, 'client_id')
        self.validate_required(self.raas_products, 'raas_products')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.aop_data is not None:
            result['aop_data'] = self.aop_data
        if self.signature is not None:
            result['signature'] = self.signature
        if self.sign_factor is not None:
            result['sign_factor'] = self.sign_factor
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        if self.raas_second_tenant is not None:
            result['raas_second_tenant'] = self.raas_second_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('aop_data') is not None:
            self.aop_data = m.get('aop_data')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('sign_factor') is not None:
            self.sign_factor = m.get('sign_factor')
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        if m.get('raas_second_tenant') is not None:
            self.raas_second_tenant = m.get('raas_second_tenant')
        return self


class QueryFaceshieldNativeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        data: FaceShieldResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # true成功，false失败
        self.success = success
        # 请求码，200成功，其他失败，具体见错误码
        self.code = code
        # 错误时的返回信息
        self.message = message
        # 请求时传入的，若没有传，则系统自动生成
        self.request_id = request_id
        # apdidToken	String	设备token
        # riskLevel	String	风险等级，-1参数异常，0无风险，1-3表示低、中、高
        # riskDesc	String	风险描述，对风险等级的补充
        # sugAction	String	处理的建议，如PAAS
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('data') is not None:
            temp_model = FaceShieldResult()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryFaceshieldWebRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        client_id: str = None,
        apdid_token: str = None,
        aop_data: str = None,
        raas_products: str = None,
        raas_second_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户id，标识客户来源
        self.client_id = client_id
        # 设备token
        self.apdid_token = apdid_token
        # 切面数据（JSON，详见下方）
        self.aop_data = aop_data
        # RaaS租户
        # 
        self.raas_products = raas_products
        # raas二级租户
        # 
        self.raas_second_tenant = raas_second_tenant

    def validate(self):
        self.validate_required(self.client_id, 'client_id')
        self.validate_required(self.raas_products, 'raas_products')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.aop_data is not None:
            result['aop_data'] = self.aop_data
        if self.raas_products is not None:
            result['raas_products'] = self.raas_products
        if self.raas_second_tenant is not None:
            result['raas_second_tenant'] = self.raas_second_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('aop_data') is not None:
            self.aop_data = m.get('aop_data')
        if m.get('raas_products') is not None:
            self.raas_products = m.get('raas_products')
        if m.get('raas_second_tenant') is not None:
            self.raas_second_tenant = m.get('raas_second_tenant')
        return self


class QueryFaceshieldWebResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        data: FaceShieldResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # true成功，false失败
        # 
        self.success = success
        # 请求码，200成功，其他失败，具体见错误码
        # 
        self.code = code
        # 错误时的返回信息
        # 
        self.message = message
        # 请求时传入的，若没有传，则系统自动生成
        # 
        self.request_id = request_id
        # apdidToken String 设备token riskLevel String 风险等级，-1参数异常，0无风险，1-3表示低、中、高 riskDesc String 风险描述，对风险等级的补充 sugAction String 处理的建议，如PAAS
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
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('data') is not None:
            temp_model = FaceShieldResult()
            self.data = temp_model.from_map(m['data'])
        return self


