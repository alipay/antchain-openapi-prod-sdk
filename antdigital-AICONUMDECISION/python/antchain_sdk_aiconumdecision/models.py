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


class OutcallTask(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
    ):
        # 任务编码
        self.code = code
        # 任务名称
        self.name = name

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class Customer(TeaModel):
    def __init__(
        self,
        phone_number: str = None,
        biz_id: str = None,
        biz_properties: str = None,
    ):
        # 用户手机号
        self.phone_number = phone_number
        # 用户业务 ID，回执中透出，需保证唯一
        self.biz_id = biz_id
        # 扩展业务字段，可用于变量参数和回执透出 json格式字符串
        self.biz_properties = biz_properties

    def validate(self):
        self.validate_required(self.phone_number, 'phone_number')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_properties is not None:
            result['biz_properties'] = self.biz_properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_properties') is not None:
            self.biz_properties = m.get('biz_properties')
        return self


class CustomerItem(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        phone_number: str = None,
        biz_properties: str = None,
    ):
        # 客户业务键
        self.biz_id = biz_id
        # 手机号
        self.phone_number = phone_number
        # 业务属性
        self.biz_properties = biz_properties

    def validate(self):
        self.validate_required(self.phone_number, 'phone_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        if self.biz_properties is not None:
            result['biz_properties'] = self.biz_properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        if m.get('biz_properties') is not None:
            self.biz_properties = m.get('biz_properties')
        return self


class ExecuteAntcloudDtcallagentVoiceinspectionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        instance_code: str = None,
        qc_rule_set_id: str = None,
        voice_text: str = None,
        voice_url: str = None,
        batch_id: str = None,
        external_call_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户 ID
        self.tenant_id = tenant_id
        # 业务空间实例编码，如 demo
        self.instance_code = instance_code
        # 质检规则集 ID，如 qc-heiniu-v1
        self.qc_rule_set_id = qc_rule_set_id
        # 对话文本
        self.voice_text = voice_text
        # 录音地址
        self.voice_url = voice_url
        # 调用方批次 ID
        self.batch_id = batch_id
        # 调用方通话唯一标识
        self.external_call_id = external_call_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.instance_code, 'instance_code')
        self.validate_required(self.qc_rule_set_id, 'qc_rule_set_id')
        self.validate_required(self.voice_text, 'voice_text')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_code is not None:
            result['instance_code'] = self.instance_code
        if self.qc_rule_set_id is not None:
            result['qc_rule_set_id'] = self.qc_rule_set_id
        if self.voice_text is not None:
            result['voice_text'] = self.voice_text
        if self.voice_url is not None:
            result['voice_url'] = self.voice_url
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        if self.external_call_id is not None:
            result['external_call_id'] = self.external_call_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_code') is not None:
            self.instance_code = m.get('instance_code')
        if m.get('qc_rule_set_id') is not None:
            self.qc_rule_set_id = m.get('qc_rule_set_id')
        if m.get('voice_text') is not None:
            self.voice_text = m.get('voice_text')
        if m.get('voice_url') is not None:
            self.voice_url = m.get('voice_url')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        if m.get('external_call_id') is not None:
            self.external_call_id = m.get('external_call_id')
        return self


class ExecuteAntcloudDtcallagentVoiceinspectionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        qc_record_id: str = None,
        status: str = None,
        batch_id: str = None,
        external_call_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 质检记录 ID
        self.qc_record_id = qc_record_id
        # ACCEPTED 表示异步任务已受理
        self.status = status
        # 本次提交的批次 ID
        self.batch_id = batch_id
        # 外部通话唯一标识
        self.external_call_id = external_call_id

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
        if self.qc_record_id is not None:
            result['qc_record_id'] = self.qc_record_id
        if self.status is not None:
            result['status'] = self.status
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        if self.external_call_id is not None:
            result['external_call_id'] = self.external_call_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('qc_record_id') is not None:
            self.qc_record_id = m.get('qc_record_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        if m.get('external_call_id') is not None:
            self.external_call_id = m.get('external_call_id')
        return self


class QueryAntcloudDtcallagentVoiceinspectionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        instance_code: str = None,
        qc_record_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户 ID
        self.tenant_id = tenant_id
        # 业务空间实例编码
        self.instance_code = instance_code
        # execute 接口返回的质检记录 ID
        self.qc_record_id = qc_record_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.instance_code, 'instance_code')
        self.validate_required(self.qc_record_id, 'qc_record_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_code is not None:
            result['instance_code'] = self.instance_code
        if self.qc_record_id is not None:
            result['qc_record_id'] = self.qc_record_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_code') is not None:
            self.instance_code = m.get('instance_code')
        if m.get('qc_record_id') is not None:
            self.qc_record_id = m.get('qc_record_id')
        return self


class QueryAntcloudDtcallagentVoiceinspectionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        qc_record_id: str = None,
        status: str = None,
        total_score: int = None,
        result: str = None,
        checklist: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # qc_record_id
        self.qc_record_id = qc_record_id
        # 异步任务状态，如 PROCESSING、COMPLETED、FAILED
        self.status = status
        # 100 分制总分
        self.total_score = total_score
        # result
        self.result = result
        # 质检规则命中明细
        self.checklist = checklist

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
        if self.qc_record_id is not None:
            result['qc_record_id'] = self.qc_record_id
        if self.status is not None:
            result['status'] = self.status
        if self.total_score is not None:
            result['total_score'] = self.total_score
        if self.result is not None:
            result['result'] = self.result
        if self.checklist is not None:
            result['checklist'] = self.checklist
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('qc_record_id') is not None:
            self.qc_record_id = m.get('qc_record_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('total_score') is not None:
            self.total_score = m.get('total_score')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('checklist') is not None:
            self.checklist = m.get('checklist')
        return self


class ImportOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        strategy_task_id: int = None,
        request_no: str = None,
        customers: List[CustomerItem] = None,
        mobile_format: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 投放任务ID
        self.strategy_task_id = strategy_task_id
        # 客户请求流水号
        self.request_no = request_no
        # 客户号码列表
        self.customers = customers
        # 手机号传入格式:PLAIN明文 / MD5 / SHA256，不填即为默认PLAIN
        self.mobile_format = mobile_format

    def validate(self):
        self.validate_required(self.strategy_task_id, 'strategy_task_id')
        self.validate_required(self.request_no, 'request_no')
        self.validate_required(self.customers, 'customers')
        if self.customers:
            for k in self.customers:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.strategy_task_id is not None:
            result['strategy_task_id'] = self.strategy_task_id
        if self.request_no is not None:
            result['request_no'] = self.request_no
        result['customers'] = []
        if self.customers is not None:
            for k in self.customers:
                result['customers'].append(k.to_map() if k else None)
        if self.mobile_format is not None:
            result['mobile_format'] = self.mobile_format
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('strategy_task_id') is not None:
            self.strategy_task_id = m.get('strategy_task_id')
        if m.get('request_no') is not None:
            self.request_no = m.get('request_no')
        self.customers = []
        if m.get('customers') is not None:
            for k in m.get('customers'):
                temp_model = CustomerItem()
                self.customers.append(temp_model.from_map(k))
        if m.get('mobile_format') is not None:
            self.mobile_format = m.get('mobile_format')
        return self


class ImportOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: str = None,
        batch_no: str = None,
        status: str = None,
        fail_reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否受理成功
        self.success = success
        # 平台批次号
        self.batch_no = batch_no
        # 同步段状态
        self.status = status
        # 失败原因码
        self.fail_reason = fail_reason

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
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        if self.status is not None:
            result['status'] = self.status
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
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
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        return self


class CallbackRobotcallRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        customer_key: str = None,
        current_call_times: int = None,
        key_template: str = None,
        batch_id: str = None,
        call_type: int = None,
        tag: str = None,
        call_id: str = None,
        task_id: int = None,
        task_name: str = None,
        template_id: int = None,
        status_code: int = None,
        status_description: str = None,
        transfer_status_code: str = None,
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
        speaking_turns: int = None,
        agent_speaking_time: str = None,
        agent_speaking_duration: int = None,
        intent_tag: str = None,
        intent_description: str = None,
        individual_tag: str = None,
        keywords: str = None,
        hungup_type: int = None,
        sms: int = None,
        chat_record: str = None,
        chats: str = None,
        add_wx: int = None,
        add_wx_status: str = None,
        answer_recall: int = None,
        properties: str = None,
        biz_properties: str = None,
        intercept_reason: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 外呼号码，支持密文
        self.customer_key = customer_key
        # 当前呼叫次数 Integer
        self.current_call_times = current_call_times
        # 号码的模版类型
        self.key_template = key_template
        # 导入号码时返回的批次号
        self.batch_id = batch_id
        # 外呼类型 建议按照如下约定给到 2001:批量-预测外呼 2002:批量-AI外呼-不转人工 2003:批量-AI外呼-接通转人工 2004: 批量-AI外呼-智能转人工 2005:批量-语音通知
        self.call_type = call_type
        # 用户自定义标签
        self.tag = tag
        # 外呼呼叫实例id
        self.call_id = call_id
        # 外呼任务编号
        self.task_id = task_id
        # 外呼任务名称
        self.task_name = task_name
        # 外呼的话术模板ID，可以为空
        self.template_id = template_id
        # 外呼状态编码
        self.status_code = status_code
        # 外呼状态编码对应描述
        self.status_description = status_description
        # 转人工状态编码
        self.transfer_status_code = transfer_status_code
        # 转人工状态编码对应描述
        self.transfer_status = transfer_status
        # 分配坐席ID,可以为空
        self.agent_id = agent_id
        # 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
        self.agent_tag = agent_tag
        # 坐席分机号，可以为空
        self.agent_extension = agent_extension
        # 导入时间，格式:2019-01-09 14:14:19
        self.import_time = import_time
        # 开始通话时间，格式：2019-01-09 14:14:19
        self.call_begin_time = call_begin_time
        # 振铃时长,单位毫秒
        self.ring_time = ring_time
        # 接通时间
        self.answer_time = answer_time
        # 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
        self.speaking_time = speaking_time
        # 通话时长，单位：秒
        self.speaking_duration = speaking_duration
        # 通话挂断时间
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
        # 回复关键词
        self.keywords = keywords
        # 挂机方式
        self.hungup_type = hungup_type
        # 挂机短信，1:发送，2:不发送
        self.sms = sms
        # 对话录音,url
        self.chat_record = chat_record
        # 对话记录
        self.chats = chats
        # 0:不添加，1:添加
        self.add_wx = add_wx
        # 加微进度可选值：已申请、加微成功
        self.add_wx_status = add_wx_status
        # 是否接通重呼 0正常外呼，1接通重呼
        self.answer_recall = answer_recall
        # 导入号码时的参数值
        self.properties = properties
        # 导入号码时的业务参数值
        self.biz_properties = biz_properties
        # 拦截原因 可选值：黑名单拦截，灰名单拦截，异常号码拦截
        self.intercept_reason = intercept_reason
        # 回调冗余字段
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.customer_key, 'customer_key')
        self.validate_required(self.current_call_times, 'current_call_times')
        self.validate_required(self.key_template, 'key_template')
        self.validate_required(self.batch_id, 'batch_id')
        self.validate_required(self.call_type, 'call_type')
        self.validate_required(self.call_id, 'call_id')
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.task_name, 'task_name')
        self.validate_required(self.status_code, 'status_code')
        self.validate_required(self.status_description, 'status_description')
        self.validate_required(self.transfer_status_code, 'transfer_status_code')
        self.validate_required(self.transfer_status, 'transfer_status')
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
        self.validate_required(self.hungup_type, 'hungup_type')
        self.validate_required(self.sms, 'sms')
        self.validate_required(self.answer_recall, 'answer_recall')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.customer_key is not None:
            result['customer_key'] = self.customer_key
        if self.current_call_times is not None:
            result['current_call_times'] = self.current_call_times
        if self.key_template is not None:
            result['key_template'] = self.key_template
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
        if self.hungup_type is not None:
            result['hungup_type'] = self.hungup_type
        if self.sms is not None:
            result['sms'] = self.sms
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
        if self.biz_properties is not None:
            result['biz_properties'] = self.biz_properties
        if self.intercept_reason is not None:
            result['intercept_reason'] = self.intercept_reason
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('customer_key') is not None:
            self.customer_key = m.get('customer_key')
        if m.get('current_call_times') is not None:
            self.current_call_times = m.get('current_call_times')
        if m.get('key_template') is not None:
            self.key_template = m.get('key_template')
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
        if m.get('hungup_type') is not None:
            self.hungup_type = m.get('hungup_type')
        if m.get('sms') is not None:
            self.sms = m.get('sms')
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
        if m.get('biz_properties') is not None:
            self.biz_properties = m.get('biz_properties')
        if m.get('intercept_reason') is not None:
            self.intercept_reason = m.get('intercept_reason')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class CallbackRobotcallResponse(TeaModel):
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


