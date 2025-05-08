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


class ShortUrlResult(TeaModel):
    def __init__(
        self,
        cust_flag: str = None,
        dync_param: str = None,
        aim_url: str = None,
        aim_code: str = None,
        result_code: str = None,
        error_msg: str = None,
        factorys: List[str] = None,
    ):
        # 短链创建时的标记字符串，可以用该字段关联短链的发送目标
        self.cust_flag = cust_flag
        # 卡片模板的动参字符串
        self.dync_param = dync_param
        # 短链链接
        self.aim_url = aim_url
        # 短链码
        self.aim_code = aim_code
        # 0:短链申请成功，非 0:短链申请失败
        self.result_code = result_code
        # 短链申请失败原因
        self.error_msg = error_msg
        # 支持该短链的厂商
        self.factorys = factorys

    def validate(self):
        self.validate_required(self.cust_flag, 'cust_flag')
        self.validate_required(self.dync_param, 'dync_param')
        self.validate_required(self.aim_url, 'aim_url')
        self.validate_required(self.aim_code, 'aim_code')
        self.validate_required(self.result_code, 'result_code')
        self.validate_required(self.factorys, 'factorys')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cust_flag is not None:
            result['cust_flag'] = self.cust_flag
        if self.dync_param is not None:
            result['dync_param'] = self.dync_param
        if self.aim_url is not None:
            result['aim_url'] = self.aim_url
        if self.aim_code is not None:
            result['aim_code'] = self.aim_code
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.factorys is not None:
            result['factorys'] = self.factorys
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cust_flag') is not None:
            self.cust_flag = m.get('cust_flag')
        if m.get('dync_param') is not None:
            self.dync_param = m.get('dync_param')
        if m.get('aim_url') is not None:
            self.aim_url = m.get('aim_url')
        if m.get('aim_code') is not None:
            self.aim_code = m.get('aim_code')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('factorys') is not None:
            self.factorys = m.get('factorys')
        return self


class SmsSendStatus(TeaModel):
    def __init__(
        self,
        phone_no: str = None,
        status: str = None,
        detail_msg: str = None,
    ):
        # 手机号
        self.phone_no = phone_no
        # 发送状态
        self.status = status
        # 发送状态描述
        self.detail_msg = detail_msg

    def validate(self):
        self.validate_required(self.phone_no, 'phone_no')
        self.validate_required(self.status, 'status')
        self.validate_required(self.detail_msg, 'detail_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone_no is not None:
            result['phone_no'] = self.phone_no
        if self.status is not None:
            result['status'] = self.status
        if self.detail_msg is not None:
            result['detail_msg'] = self.detail_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone_no') is not None:
            self.phone_no = m.get('phone_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('detail_msg') is not None:
            self.detail_msg = m.get('detail_msg')
        return self


class SmsTempCreateData(TeaModel):
    def __init__(
        self,
        template_id: str = None,
    ):
        # 模版id
        self.template_id = template_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class SmsMaterial(TeaModel):
    def __init__(
        self,
        material_name: str = None,
        material_type: str = None,
        material_content: str = None,
    ):
        # 素材名称，当素材类型
        # 为"text/plain"时可不传，其他情况必传
        self.material_name = material_name
        # 素材类型
        # 本期最多只⽀持⼀张图⽚和⼀段⽂本信息；变量占位符只能是按顺序的数字{1}-{9},最多⽀持9个变量；链接中的变量只能放在尾部，如：http://aabbcc/{1}
        self.material_type = material_type
        # 素材内容
        self.material_content = material_content

    def validate(self):
        self.validate_required(self.material_type, 'material_type')
        self.validate_required(self.material_content, 'material_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.material_name is not None:
            result['material_name'] = self.material_name
        if self.material_type is not None:
            result['material_type'] = self.material_type
        if self.material_content is not None:
            result['material_content'] = self.material_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('material_name') is not None:
            self.material_name = m.get('material_name')
        if m.get('material_type') is not None:
            self.material_type = m.get('material_type')
        if m.get('material_content') is not None:
            self.material_content = m.get('material_content')
        return self


class ContentSend(TeaModel):
    def __init__(
        self,
        mobile: str = None,
        template_param_list: List[str] = None,
    ):
        # 单条手机号
        self.mobile = mobile
        # 变量⻓度限制：
        # “纯中⽂ 不超过 10 个字”；“数字 字⺟ 英⽂符号 不超过20 位”； “纯数字 不超过20 位” ；
        # 有序的变量值列表，按顺序替换报备的模板短信⽂本帧中的变量，列表⻓度和变量个数不⼀致会导致替换变量错误
        self.template_param_list = template_param_list

    def validate(self):
        self.validate_required(self.mobile, 'mobile')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.template_param_list is not None:
            result['template_param_list'] = self.template_param_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('template_param_list') is not None:
            self.template_param_list = m.get('template_param_list')
        return self


class ParseQueryParam(TeaModel):
    def __init__(
        self,
        mobile: str = None,
    ):
        # 手机号
        self.mobile = mobile

    def validate(self):
        self.validate_required(self.mobile, 'mobile')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.mobile is not None:
            result['mobile'] = self.mobile
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        return self


class ContentReply(TeaModel):
    def __init__(
        self,
        phone: str = None,
        reject: bool = None,
        content: str = None,
        reply_time: str = None,
        ext_info: str = None,
    ):
        # 手机号
        self.phone = phone
        # 用户是否已经退订过
        self.reject = reject
        # 用户最新回复内容
        self.content = content
        # 用户回复时间
        self.reply_time = reply_time
        # 拓展字段
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.reject, 'reject')
        self.validate_required(self.content, 'content')
        self.validate_required(self.reply_time, 'reply_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone is not None:
            result['phone'] = self.phone
        if self.reject is not None:
            result['reject'] = self.reject
        if self.content is not None:
            result['content'] = self.content
        if self.reply_time is not None:
            result['reply_time'] = self.reply_time
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('reject') is not None:
            self.reject = m.get('reject')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('reply_time') is not None:
            self.reply_time = m.get('reply_time')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class ShortUrlParseResult(TeaModel):
    def __init__(
        self,
        cust_flag: str = None,
        smart_template_id: str = None,
        aim_url: str = None,
        aim_code: str = None,
        aim_code_type: str = None,
        status: str = None,
        describe: str = None,
    ):
        # 创建短链时传入的客户号，可以用该字段关联短链的发送目标
        self.cust_flag = cust_flag
        # 卡片模板id
        self.smart_template_id = smart_template_id
        # 短链地址
        self.aim_url = aim_url
        # 短链地址尾码
        self.aim_code = aim_code
        # BULK 群发,PERSONAL个性化
        self.aim_code_type = aim_code_type
        # 解析状态
        self.status = status
        # 解析状态描述
        self.describe = describe

    def validate(self):
        self.validate_required(self.cust_flag, 'cust_flag')
        self.validate_required(self.smart_template_id, 'smart_template_id')
        self.validate_required(self.aim_url, 'aim_url')
        self.validate_required(self.aim_code, 'aim_code')
        self.validate_required(self.aim_code_type, 'aim_code_type')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cust_flag is not None:
            result['cust_flag'] = self.cust_flag
        if self.smart_template_id is not None:
            result['smart_template_id'] = self.smart_template_id
        if self.aim_url is not None:
            result['aim_url'] = self.aim_url
        if self.aim_code is not None:
            result['aim_code'] = self.aim_code
        if self.aim_code_type is not None:
            result['aim_code_type'] = self.aim_code_type
        if self.status is not None:
            result['status'] = self.status
        if self.describe is not None:
            result['describe'] = self.describe
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cust_flag') is not None:
            self.cust_flag = m.get('cust_flag')
        if m.get('smart_template_id') is not None:
            self.smart_template_id = m.get('smart_template_id')
        if m.get('aim_url') is not None:
            self.aim_url = m.get('aim_url')
        if m.get('aim_code') is not None:
            self.aim_code = m.get('aim_code')
        if m.get('aim_code_type') is not None:
            self.aim_code_type = m.get('aim_code_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('describe') is not None:
            self.describe = m.get('describe')
        return self


class ShortUrlCreateResult(TeaModel):
    def __init__(
        self,
        smart_template_id: str = None,
        param_list: List[ShortUrlResult] = None,
    ):
        # 卡片模板id
        self.smart_template_id = smart_template_id
        # 短链详细信息列表
        self.param_list = param_list

    def validate(self):
        self.validate_required(self.smart_template_id, 'smart_template_id')
        self.validate_required(self.param_list, 'param_list')
        if self.param_list:
            for k in self.param_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.smart_template_id is not None:
            result['smart_template_id'] = self.smart_template_id
        result['param_list'] = []
        if self.param_list is not None:
            for k in self.param_list:
                result['param_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('smart_template_id') is not None:
            self.smart_template_id = m.get('smart_template_id')
        self.param_list = []
        if m.get('param_list') is not None:
            for k in m.get('param_list'):
                temp_model = ShortUrlResult()
                self.param_list.append(temp_model.from_map(k))
        return self


class AccountSmsSendStatus(TeaModel):
    def __init__(
        self,
        phone_no: str = None,
        batch_task_id: str = None,
        status: str = None,
        detail_msg: str = None,
    ):
        # ⼿机号
        self.phone_no = phone_no
        # 批次号
        self.batch_task_id = batch_task_id
        # 发送状态
        # SUCCESS：发送成
        # 功；
        # FAILED：发送失败；
        self.status = status
        # 发送状态描述
        self.detail_msg = detail_msg

    def validate(self):
        self.validate_required(self.phone_no, 'phone_no')
        self.validate_required(self.batch_task_id, 'batch_task_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.detail_msg, 'detail_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone_no is not None:
            result['phone_no'] = self.phone_no
        if self.batch_task_id is not None:
            result['batch_task_id'] = self.batch_task_id
        if self.status is not None:
            result['status'] = self.status
        if self.detail_msg is not None:
            result['detail_msg'] = self.detail_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone_no') is not None:
            self.phone_no = m.get('phone_no')
        if m.get('batch_task_id') is not None:
            self.batch_task_id = m.get('batch_task_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('detail_msg') is not None:
            self.detail_msg = m.get('detail_msg')
        return self


class QueryTemplateStatusRes(TeaModel):
    def __init__(
        self,
        template_id: str = None,
        sms_title: str = None,
        template_status: str = None,
        censor_result: str = None,
    ):
        # 短信模板id
        self.template_id = template_id
        # 短信标题
        self.sms_title = sms_title
        # 模板状态
        self.template_status = template_status
        # 审核结果描述
        self.censor_result = censor_result

    def validate(self):
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.sms_title, 'sms_title')
        self.validate_required(self.template_status, 'template_status')
        self.validate_required(self.censor_result, 'censor_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.sms_title is not None:
            result['sms_title'] = self.sms_title
        if self.template_status is not None:
            result['template_status'] = self.template_status
        if self.censor_result is not None:
            result['censor_result'] = self.censor_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('sms_title') is not None:
            self.sms_title = m.get('sms_title')
        if m.get('template_status') is not None:
            self.template_status = m.get('template_status')
        if m.get('censor_result') is not None:
            self.censor_result = m.get('censor_result')
        return self


class ParseResultData(TeaModel):
    def __init__(
        self,
        mobile: str = None,
        receive_state: int = None,
    ):
        # 手机号
        self.mobile = mobile
        # 是否有解析能力
        # 0:否
        # 1: 是
        self.receive_state = receive_state

    def validate(self):
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.receive_state, 'receive_state')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.receive_state is not None:
            result['receive_state'] = self.receive_state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('receive_state') is not None:
            self.receive_state = m.get('receive_state')
        return self


class BatchSendTaskData(TeaModel):
    def __init__(
        self,
        batch_task_id: str = None,
    ):
        # 批量发送任务id
        self.batch_task_id = batch_task_id

    def validate(self):
        self.validate_required(self.batch_task_id, 'batch_task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.batch_task_id is not None:
            result['batch_task_id'] = self.batch_task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('batch_task_id') is not None:
            self.batch_task_id = m.get('batch_task_id')
        return self


class SmartTemplateDyncParam(TeaModel):
    def __init__(
        self,
        cust_flag: str = None,
        dync_params: str = None,
    ):
        # 可以用该字段关联短链的发送目标
        self.cust_flag = cust_flag
        # json字符串
        # {"param1":"123","param2":"100"}
        self.dync_params = dync_params

    def validate(self):
        self.validate_required(self.cust_flag, 'cust_flag')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cust_flag is not None:
            result['cust_flag'] = self.cust_flag
        if self.dync_params is not None:
            result['dync_params'] = self.dync_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cust_flag') is not None:
            self.cust_flag = m.get('cust_flag')
        if m.get('dync_params') is not None:
            self.dync_params = m.get('dync_params')
        return self


class ShortMsgTempCreateData(TeaModel):
    def __init__(
        self,
        template_id: str = None,
    ):
        # 普短模板id
        self.template_id = template_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class QueryShorturlParseabilityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        smart_template_id: str = None,
        mobiles: List[ParseQueryParam] = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 卡片模板id
        self.smart_template_id = smart_template_id
        # 待查询手机号列表
        self.mobiles = mobiles
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.smart_template_id, 'smart_template_id')
        self.validate_required(self.mobiles, 'mobiles')
        if self.mobiles:
            for k in self.mobiles:
                if k:
                    k.validate()
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.smart_template_id is not None:
            result['smart_template_id'] = self.smart_template_id
        result['mobiles'] = []
        if self.mobiles is not None:
            for k in self.mobiles:
                result['mobiles'].append(k.to_map() if k else None)
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('smart_template_id') is not None:
            self.smart_template_id = m.get('smart_template_id')
        self.mobiles = []
        if m.get('mobiles') is not None:
            for k in m.get('mobiles'):
                temp_model = ParseQueryParam()
                self.mobiles.append(temp_model.from_map(k))
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryShorturlParseabilityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ParseResultData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 解析结果列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ParseResultData()
                self.data.append(temp_model.from_map(k))
        return self


class CreateShorturlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        smart_template_id: str = None,
        sms_signs: List[str] = None,
        show_times: int = None,
        aim_code_type: str = None,
        expire_time: int = None,
        cust_batch_id: str = None,
        param_list: List[SmartTemplateDyncParam] = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 卡片模板id
        self.smart_template_id = smart_template_id
        # 申请好的签名，最多 10 个签名
        self.sms_signs = sms_signs
        # 个性化短链建议10次
        self.show_times = show_times
        # BULK 群发
        # PERSONAL个性化
        self.aim_code_type = aim_code_type
        # 个性化短链：时间最小 1天，最大 7 天，不填则默认 7 天；
        self.expire_time = expire_time
        # 短链所属生成批次，最长 50 位。
        # 也是请求唯一id，每次请求不能重复，重复将返回该批次id上一次请求结果
        self.cust_batch_id = cust_batch_id
        # 接收智能短信测试短信手机号及动态参数对象列表，最大为 100 个
        # 注：oppo 模板一次最多只能申请 10 个（模板审核厂商中包含oppo厂商就视为oppo模板）
        self.param_list = param_list
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.smart_template_id, 'smart_template_id')
        self.validate_required(self.sms_signs, 'sms_signs')
        self.validate_required(self.show_times, 'show_times')
        self.validate_required(self.aim_code_type, 'aim_code_type')
        self.validate_required(self.expire_time, 'expire_time')
        self.validate_required(self.cust_batch_id, 'cust_batch_id')
        self.validate_required(self.param_list, 'param_list')
        if self.param_list:
            for k in self.param_list:
                if k:
                    k.validate()
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.smart_template_id is not None:
            result['smart_template_id'] = self.smart_template_id
        if self.sms_signs is not None:
            result['sms_signs'] = self.sms_signs
        if self.show_times is not None:
            result['show_times'] = self.show_times
        if self.aim_code_type is not None:
            result['aim_code_type'] = self.aim_code_type
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.cust_batch_id is not None:
            result['cust_batch_id'] = self.cust_batch_id
        result['param_list'] = []
        if self.param_list is not None:
            for k in self.param_list:
                result['param_list'].append(k.to_map() if k else None)
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('smart_template_id') is not None:
            self.smart_template_id = m.get('smart_template_id')
        if m.get('sms_signs') is not None:
            self.sms_signs = m.get('sms_signs')
        if m.get('show_times') is not None:
            self.show_times = m.get('show_times')
        if m.get('aim_code_type') is not None:
            self.aim_code_type = m.get('aim_code_type')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('cust_batch_id') is not None:
            self.cust_batch_id = m.get('cust_batch_id')
        self.param_list = []
        if m.get('param_list') is not None:
            for k in m.get('param_list'):
                temp_model = SmartTemplateDyncParam()
                self.param_list.append(temp_model.from_map(k))
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class CreateShorturlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ShortUrlCreateResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 短链创建结果
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
        if m.get('data') is not None:
            temp_model = ShortUrlCreateResult()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryShorturlParseresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cust_batch_id: str = None,
        aim_url: str = None,
        tenant_id: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 短链批次号
        self.cust_batch_id = cust_batch_id
        # 短链地址
        self.aim_url = aim_url
        # 租户id
        self.tenant_id = tenant_id
        # 扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.cust_batch_id, 'cust_batch_id')
        self.validate_required(self.aim_url, 'aim_url')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cust_batch_id is not None:
            result['cust_batch_id'] = self.cust_batch_id
        if self.aim_url is not None:
            result['aim_url'] = self.aim_url
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cust_batch_id') is not None:
            self.cust_batch_id = m.get('cust_batch_id')
        if m.get('aim_url') is not None:
            self.aim_url = m.get('aim_url')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class QueryShorturlParseresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ShortUrlParseResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 短链解析记录
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ShortUrlParseResult()
                self.data.append(temp_model.from_map(k))
        return self


class CreateShortmsgTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        request_unique_id: str = None,
        sign_name: str = None,
        content: str = None,
        ext_info: str = None,
        variable_template: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 唯一请求id
        self.request_unique_id = request_unique_id
        # 短信签名名称，不需要带着【】
        self.sign_name = sign_name
        # 短信内容
        self.content = content
        # 扩展信息
        self.ext_info = ext_info
        # 校验传入的参数是否有变量
        self.variable_template = variable_template

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.request_unique_id, 'request_unique_id')
        self.validate_required(self.sign_name, 'sign_name')
        self.validate_required(self.content, 'content')
        self.validate_required(self.variable_template, 'variable_template')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.sign_name is not None:
            result['sign_name'] = self.sign_name
        if self.content is not None:
            result['content'] = self.content
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.variable_template is not None:
            result['variable_template'] = self.variable_template
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('sign_name') is not None:
            self.sign_name = m.get('sign_name')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('variable_template') is not None:
            self.variable_template = m.get('variable_template')
        return self


class CreateShortmsgTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ShortMsgTempCreateData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 普短模板创建响应体
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
        if m.get('data') is not None:
            temp_model = ShortMsgTempCreateData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryAccountShorturlparseresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 扩展字段
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class QueryAccountShorturlparseresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ShortUrlParseResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 解析记录列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ShortUrlParseResult()
                self.data.append(temp_model.from_map(k))
        return self


class QueryReplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        phone_no_list: List[str] = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 手机号列表
        self.phone_no_list = phone_no_list
        # 拓展字段
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.phone_no_list, 'phone_no_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.phone_no_list is not None:
            result['phone_no_list'] = self.phone_no_list
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('phone_no_list') is not None:
            self.phone_no_list = m.get('phone_no_list')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class QueryReplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ContentReply] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户回复结果
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ContentReply()
                self.data.append(temp_model.from_map(k))
        return self


class CreateTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        request_unique_id: str = None,
        variable_template: bool = None,
        sms_title: str = None,
        sign_name: str = None,
        ext_info: str = None,
        material: List[SmsMaterial] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 请求唯一id
        self.request_unique_id = request_unique_id
        # 是否为变量类型模版，默认true
        self.variable_template = variable_template
        # 短信标题，不超过50个长度，收件人可感知
        self.sms_title = sms_title
        # 签名名称
        self.sign_name = sign_name
        # 扩展字段
        self.ext_info = ext_info
        # 素材内容
        self.material = material

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.request_unique_id, 'request_unique_id')
        self.validate_required(self.sms_title, 'sms_title')
        self.validate_required(self.sign_name, 'sign_name')
        self.validate_required(self.material, 'material')
        if self.material:
            for k in self.material:
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        if self.variable_template is not None:
            result['variable_template'] = self.variable_template
        if self.sms_title is not None:
            result['sms_title'] = self.sms_title
        if self.sign_name is not None:
            result['sign_name'] = self.sign_name
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        result['material'] = []
        if self.material is not None:
            for k in self.material:
                result['material'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        if m.get('variable_template') is not None:
            self.variable_template = m.get('variable_template')
        if m.get('sms_title') is not None:
            self.sms_title = m.get('sms_title')
        if m.get('sign_name') is not None:
            self.sign_name = m.get('sign_name')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        self.material = []
        if m.get('material') is not None:
            for k in m.get('material'):
                temp_model = SmsMaterial()
                self.material.append(temp_model.from_map(k))
        return self


class CreateTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: SmsTempCreateData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模版创建响应体
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
        if m.get('data') is not None:
            temp_model = SmsTempCreateData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryTemplateStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 彩信模版id
        self.template_id = template_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class QueryTemplateStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: QueryTemplateStatusRes = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 彩信模版状态查询结果
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
        if m.get('data') is not None:
            temp_model = QueryTemplateStatusRes()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateBatchSendRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mass_task_id: str = None,
        template_id: str = None,
        content_list: List[ContentSend] = None,
        send_now: bool = None,
        send_time: str = None,
        tenant_id: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用方群发任务id，不超过70个长度，用于幂等
        self.mass_task_id = mass_task_id
        # 模板id
        self.template_id = template_id
        # 变量值需要按模板定义时的变量顺序传递且个数需要对应上
        # 最⼤1000个组包
        self.content_list = content_list
        # 是否立即发送
        self.send_now = send_now
        # 立即发送时，该字段不消费
        self.send_time = send_time
        # 租户id
        self.tenant_id = tenant_id
        # 拓展字段
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.mass_task_id, 'mass_task_id')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.content_list, 'content_list')
        if self.content_list:
            for k in self.content_list:
                if k:
                    k.validate()
        self.validate_required(self.send_now, 'send_now')
        self.validate_required(self.send_time, 'send_time')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.mass_task_id is not None:
            result['mass_task_id'] = self.mass_task_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        result['content_list'] = []
        if self.content_list is not None:
            for k in self.content_list:
                result['content_list'].append(k.to_map() if k else None)
        if self.send_now is not None:
            result['send_now'] = self.send_now
        if self.send_time is not None:
            result['send_time'] = self.send_time
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mass_task_id') is not None:
            self.mass_task_id = m.get('mass_task_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        self.content_list = []
        if m.get('content_list') is not None:
            for k in m.get('content_list'):
                temp_model = ContentSend()
                self.content_list.append(temp_model.from_map(k))
        if m.get('send_now') is not None:
            self.send_now = m.get('send_now')
        if m.get('send_time') is not None:
            self.send_time = m.get('send_time')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class CreateBatchSendResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: BatchSendTaskData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批量任务id
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
        if m.get('data') is not None:
            temp_model = BatchSendTaskData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryMsgStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_task_id: str = None,
        phone_no_list: List[str] = None,
        tenant_id: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 创建批量发送任务
        # 时返回的批量发送
        # 任务id
        self.batch_task_id = batch_task_id
        # 手机号列表
        self.phone_no_list = phone_no_list
        # 租户id
        self.tenant_id = tenant_id
        # 拓展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.batch_task_id, 'batch_task_id')
        self.validate_required(self.phone_no_list, 'phone_no_list')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_task_id is not None:
            result['batch_task_id'] = self.batch_task_id
        if self.phone_no_list is not None:
            result['phone_no_list'] = self.phone_no_list
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_task_id') is not None:
            self.batch_task_id = m.get('batch_task_id')
        if m.get('phone_no_list') is not None:
            self.phone_no_list = m.get('phone_no_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class QueryMsgStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[SmsSendStatus] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 信息发送状态
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = SmsSendStatus()
                self.data.append(temp_model.from_map(k))
        return self


class QueryAccountMsgstatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class QueryAccountMsgstatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AccountSmsSendStatus] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 信息发送状态
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AccountSmsSendStatus()
                self.data.append(temp_model.from_map(k))
        return self


