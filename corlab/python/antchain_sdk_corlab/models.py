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


class RecognizeModelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        domain_code: str = None,
        status: str = None,
        model_uuid: str = None,
        input_context: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部业务唯一标识id
        self.biz_id = biz_id
        # 业务域
        self.domain_code = domain_code
        # 模型状态
        self.status = status
        # 待计算的模型uuid
        self.model_uuid = model_uuid
        # map的映射的json字符串
        self.input_context = input_context

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.domain_code, 'domain_code')
        self.validate_required(self.status, 'status')
        self.validate_required(self.model_uuid, 'model_uuid')
        self.validate_required(self.input_context, 'input_context')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.domain_code is not None:
            result['domain_code'] = self.domain_code
        if self.status is not None:
            result['status'] = self.status
        if self.model_uuid is not None:
            result['model_uuid'] = self.model_uuid
        if self.input_context is not None:
            result['input_context'] = self.input_context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('domain_code') is not None:
            self.domain_code = m.get('domain_code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('model_uuid') is not None:
            self.model_uuid = m.get('model_uuid')
        if m.get('input_context') is not None:
            self.input_context = m.get('input_context')
        return self


class RecognizeModelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        response_code: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 操作成功结果
        self.success = success
        # 业务码
        self.response_code = response_code
        # 数据对象结构体字符串
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
        if self.success is not None:
            result['success'] = self.success
        if self.response_code is not None:
            result['response_code'] = self.response_code
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class AddModelTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        customer_id: str = None,
        receipt_no: str = None,
        model_name: str = None,
        model_file_oss_path: str = None,
        validate_file_oss_path: str = None,
        model_output_lable_name: str = None,
        csv_output_lable_name: str = None,
        sign_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户号
        self.customer_id = customer_id
        # 回执单号
        self.receipt_no = receipt_no
        # 模型名称
        self.model_name = model_name
        # 模型文件的路径
        self.model_file_oss_path = model_file_oss_path
        # 验证文件的oss路径
        self.validate_file_oss_path = validate_file_oss_path
        # 模型输出参数名称
        self.model_output_lable_name = model_output_lable_name
        # 验证文件的输出列名
        self.csv_output_lable_name = csv_output_lable_name
        # 验签字段
        self.sign_info = sign_info

    def validate(self):
        self.validate_required(self.customer_id, 'customer_id')
        self.validate_required(self.receipt_no, 'receipt_no')
        self.validate_required(self.model_name, 'model_name')
        self.validate_required(self.model_file_oss_path, 'model_file_oss_path')
        self.validate_required(self.validate_file_oss_path, 'validate_file_oss_path')
        self.validate_required(self.model_output_lable_name, 'model_output_lable_name')
        self.validate_required(self.csv_output_lable_name, 'csv_output_lable_name')
        self.validate_required(self.sign_info, 'sign_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.receipt_no is not None:
            result['receipt_no'] = self.receipt_no
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.model_file_oss_path is not None:
            result['model_file_oss_path'] = self.model_file_oss_path
        if self.validate_file_oss_path is not None:
            result['validate_file_oss_path'] = self.validate_file_oss_path
        if self.model_output_lable_name is not None:
            result['model_output_lable_name'] = self.model_output_lable_name
        if self.csv_output_lable_name is not None:
            result['csv_output_lable_name'] = self.csv_output_lable_name
        if self.sign_info is not None:
            result['sign_info'] = self.sign_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('receipt_no') is not None:
            self.receipt_no = m.get('receipt_no')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('model_file_oss_path') is not None:
            self.model_file_oss_path = m.get('model_file_oss_path')
        if m.get('validate_file_oss_path') is not None:
            self.validate_file_oss_path = m.get('validate_file_oss_path')
        if m.get('model_output_lable_name') is not None:
            self.model_output_lable_name = m.get('model_output_lable_name')
        if m.get('csv_output_lable_name') is not None:
            self.csv_output_lable_name = m.get('csv_output_lable_name')
        if m.get('sign_info') is not None:
            self.sign_info = m.get('sign_info')
        return self


class AddModelTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
        status: str = None,
        error_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的任务id
        self.task_id = task_id
        # 执行的状态
        self.status = status
        # 错误信息
        self.error_info = error_info

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.status is not None:
            result['status'] = self.status
        if self.error_info is not None:
            result['error_info'] = self.error_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('error_info') is not None:
            self.error_info = m.get('error_info')
        return self


