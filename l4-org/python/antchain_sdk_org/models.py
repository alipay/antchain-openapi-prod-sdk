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


class AgentTaskStepData(TeaModel):
    def __init__(
        self,
        step_id: str = None,
        step_name: str = None,
        status: str = None,
        update_time: str = None,
        message_id: str = None,
        job_id: str = None,
        result: str = None,
        message_flag: bool = None,
    ):
        # 步骤id
        self.step_id = step_id
        # 步骤名称
        self.step_name = step_name
        # PENDING,  RUNNING,COMPLETED,TERMINATED,FAILED
        self.status = status
        # 更新时间
        self.update_time = update_time
        # 关联的消息id
        self.message_id = message_id
        # 关联的异步任务id
        self.job_id = job_id
        # 异步任务结果
        self.result = result
        # 异步任务已读标识
        self.message_flag = message_flag

    def validate(self):
        self.validate_required(self.step_id, 'step_id')
        self.validate_required(self.step_name, 'step_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.update_time, 'update_time')
        self.validate_required(self.message_id, 'message_id')
        self.validate_required(self.job_id, 'job_id')
        self.validate_required(self.result, 'result')
        self.validate_required(self.message_flag, 'message_flag')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.step_id is not None:
            result['step_id'] = self.step_id
        if self.step_name is not None:
            result['step_name'] = self.step_name
        if self.status is not None:
            result['status'] = self.status
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.job_id is not None:
            result['job_id'] = self.job_id
        if self.result is not None:
            result['result'] = self.result
        if self.message_flag is not None:
            result['message_flag'] = self.message_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('step_id') is not None:
            self.step_id = m.get('step_id')
        if m.get('step_name') is not None:
            self.step_name = m.get('step_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('job_id') is not None:
            self.job_id = m.get('job_id')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('message_flag') is not None:
            self.message_flag = m.get('message_flag')
        return self


class AgentTaskData(TeaModel):
    def __init__(
        self,
        task_name: str = None,
        task_type: str = None,
        task_status: str = None,
        message_flag: bool = None,
        update_time: str = None,
        message_id: str = None,
        ext_info: str = None,
        step_list: List[AgentTaskStepData] = None,
    ):
        # 任务名称
        self.task_name = task_name
        # 任务类型
        self.task_type = task_type
        # 任务状态
        self.task_status = task_status
        # 是否有未读的消息
        self.message_flag = message_flag
        # 最后更新时间
        self.update_time = update_time
        # 单步骤任务直接关联消息id
        self.message_id = message_id
        # 附加信息
        self.ext_info = ext_info
        # 任务步骤列表
        self.step_list = step_list

    def validate(self):
        self.validate_required(self.task_name, 'task_name')
        self.validate_required(self.task_type, 'task_type')
        self.validate_required(self.task_status, 'task_status')
        self.validate_required(self.message_flag, 'message_flag')
        self.validate_required(self.update_time, 'update_time')
        self.validate_required(self.message_id, 'message_id')
        self.validate_required(self.ext_info, 'ext_info')
        self.validate_required(self.step_list, 'step_list')
        if self.step_list:
            for k in self.step_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_name is not None:
            result['task_name'] = self.task_name
        if self.task_type is not None:
            result['task_type'] = self.task_type
        if self.task_status is not None:
            result['task_status'] = self.task_status
        if self.message_flag is not None:
            result['message_flag'] = self.message_flag
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        result['step_list'] = []
        if self.step_list is not None:
            for k in self.step_list:
                result['step_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_name') is not None:
            self.task_name = m.get('task_name')
        if m.get('task_type') is not None:
            self.task_type = m.get('task_type')
        if m.get('task_status') is not None:
            self.task_status = m.get('task_status')
        if m.get('message_flag') is not None:
            self.message_flag = m.get('message_flag')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        self.step_list = []
        if m.get('step_list') is not None:
            for k in m.get('step_list'):
                temp_model = AgentTaskStepData()
                self.step_list.append(temp_model.from_map(k))
        return self


class AgentChatData(TeaModel):
    def __init__(
        self,
        session_id: str = None,
        message_id: str = None,
        finished: bool = None,
        content_type: str = None,
        content: str = None,
    ):
        # 会话id
        # 
        self.session_id = session_id
        # 消息id
        # 
        self.message_id = message_id
        # 是否已完成
        self.finished = finished
        # text: 文本 mage: 图片 stream：流式文本
        self.content_type = content_type
        # 内容
        self.content = content

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.message_id, 'message_id')
        self.validate_required(self.finished, 'finished')
        self.validate_required(self.content_type, 'content_type')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.finished is not None:
            result['finished'] = self.finished
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('finished') is not None:
            self.finished = m.get('finished')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class SubMetricData(TeaModel):
    def __init__(
        self,
        date: str = None,
        type: str = None,
        value: str = None,
    ):
        # 日期
        self.date = date
        # 指标类型:OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT,OPERATING_COST, GROSS_PROFIT_MARGIN,VOUCHER_CONVERSION, USER_CONVERSION
        self.type = type
        # 指标值
        self.value = value

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.type, 'type')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.date is not None:
            result['date'] = self.date
        if self.type is not None:
            result['type'] = self.type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class TradeRangeData(TeaModel):
    def __init__(
        self,
        start: str = None,
        end: str = None,
        value: int = None,
        rate: str = None,
    ):
        # 区间开始
        self.start = start
        # 区间结束
        self.end = end
        # 区间内统计值
        self.value = value
        # 百分比
        self.rate = rate

    def validate(self):
        self.validate_required(self.start, 'start')
        self.validate_required(self.end, 'end')
        self.validate_required(self.value, 'value')
        self.validate_required(self.rate, 'rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.start is not None:
            result['start'] = self.start
        if self.end is not None:
            result['end'] = self.end
        if self.value is not None:
            result['value'] = self.value
        if self.rate is not None:
            result['rate'] = self.rate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('start') is not None:
            self.start = m.get('start')
        if m.get('end') is not None:
            self.end = m.get('end')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        return self


class OrgTrendData(TeaModel):
    def __init__(
        self,
        date: str = None,
        repayment_amt: str = None,
        budget_amt: str = None,
        trade_amt: str = None,
    ):
        # 日期
        self.date = date
        # 还款金额
        self.repayment_amt = repayment_amt
        # 预算金额
        self.budget_amt = budget_amt
        # 交易金额
        self.trade_amt = trade_amt

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.repayment_amt, 'repayment_amt')
        self.validate_required(self.budget_amt, 'budget_amt')
        self.validate_required(self.trade_amt, 'trade_amt')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.date is not None:
            result['date'] = self.date
        if self.repayment_amt is not None:
            result['repayment_amt'] = self.repayment_amt
        if self.budget_amt is not None:
            result['budget_amt'] = self.budget_amt
        if self.trade_amt is not None:
            result['trade_amt'] = self.trade_amt
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('repayment_amt') is not None:
            self.repayment_amt = m.get('repayment_amt')
        if m.get('budget_amt') is not None:
            self.budget_amt = m.get('budget_amt')
        if m.get('trade_amt') is not None:
            self.trade_amt = m.get('trade_amt')
        return self


class MetricData(TeaModel):
    def __init__(
        self,
        type: str = None,
        total: str = None,
        sub_list: List[SubMetricData] = None,
    ):
        # 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
        self.type = type
        # 指标值
        self.total = total
        # 子指标列表
        self.sub_list = sub_list

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.total, 'total')
        self.validate_required(self.sub_list, 'sub_list')
        if self.sub_list:
            for k in self.sub_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.total is not None:
            result['total'] = self.total
        result['sub_list'] = []
        if self.sub_list is not None:
            for k in self.sub_list:
                result['sub_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.sub_list = []
        if m.get('sub_list') is not None:
            for k in m.get('sub_list'):
                temp_model = SubMetricData()
                self.sub_list.append(temp_model.from_map(k))
        return self


class ConversionData(TeaModel):
    def __init__(
        self,
        channel: str = None,
        send_cnt: int = None,
        use_cnt: int = None,
        use_rate: str = None,
    ):
        # 渠道
        self.channel = channel
        # 投放人数
        self.send_cnt = send_cnt
        # 核销人数
        self.use_cnt = use_cnt
        # 核销率
        self.use_rate = use_rate

    def validate(self):
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.send_cnt, 'send_cnt')
        self.validate_required(self.use_cnt, 'use_cnt')
        self.validate_required(self.use_rate, 'use_rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.channel is not None:
            result['channel'] = self.channel
        if self.send_cnt is not None:
            result['send_cnt'] = self.send_cnt
        if self.use_cnt is not None:
            result['use_cnt'] = self.use_cnt
        if self.use_rate is not None:
            result['use_rate'] = self.use_rate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('send_cnt') is not None:
            self.send_cnt = m.get('send_cnt')
        if m.get('use_cnt') is not None:
            self.use_cnt = m.get('use_cnt')
        if m.get('use_rate') is not None:
            self.use_rate = m.get('use_rate')
        return self


class RepayCallBackResData(TeaModel):
    def __init__(
        self,
        status: bool = None,
    ):
        # 状态
        self.status = status

    def validate(self):
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class AgentSessionMessageData(TeaModel):
    def __init__(
        self,
        session_id: str = None,
        message_id: str = None,
        gmt_create: str = None,
        request: str = None,
        response: str = None,
        status: str = None,
        result_msg: str = None,
        custom_data: str = None,
        custom_response: str = None,
        editable: bool = None,
    ):
        # 会话id
        self.session_id = session_id
        # 消息编号
        self.message_id = message_id
        # 创建时间
        self.gmt_create = gmt_create
        # 对话请求内容
        self.request = request
        # 对话响应内容
        self.response = response
        # 对话状态
        self.status = status
        # 会话结果(错误)信息
        self.result_msg = result_msg
        # 卡片编辑的业务数据
        self.custom_data = custom_data
        # 卡片编辑后的内容
        self.custom_response = custom_response
        # 是否可编辑
        self.editable = editable

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.message_id, 'message_id')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.request, 'request')
        self.validate_required(self.response, 'response')
        self.validate_required(self.status, 'status')
        self.validate_required(self.result_msg, 'result_msg')
        self.validate_required(self.custom_data, 'custom_data')
        self.validate_required(self.custom_response, 'custom_response')
        self.validate_required(self.editable, 'editable')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.request is not None:
            result['request'] = self.request
        if self.response is not None:
            result['response'] = self.response
        if self.status is not None:
            result['status'] = self.status
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.custom_data is not None:
            result['custom_data'] = self.custom_data
        if self.custom_response is not None:
            result['custom_response'] = self.custom_response
        if self.editable is not None:
            result['editable'] = self.editable
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('request') is not None:
            self.request = m.get('request')
        if m.get('response') is not None:
            self.response = m.get('response')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('custom_data') is not None:
            self.custom_data = m.get('custom_data')
        if m.get('custom_response') is not None:
            self.custom_response = m.get('custom_response')
        if m.get('editable') is not None:
            self.editable = m.get('editable')
        return self


class ProcessConversionMetricData(TeaModel):
    def __init__(
        self,
        send: int = None,
        used: int = None,
        rate: str = None,
    ):
        # 发放数
        self.send = send
        # 核销数
        self.used = used
        # 核销转化率
        self.rate = rate

    def validate(self):
        self.validate_required(self.send, 'send')
        self.validate_required(self.used, 'used')
        self.validate_required(self.rate, 'rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.send is not None:
            result['send'] = self.send
        if self.used is not None:
            result['used'] = self.used
        if self.rate is not None:
            result['rate'] = self.rate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('send') is not None:
            self.send = m.get('send')
        if m.get('used') is not None:
            self.used = m.get('used')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        return self


class AgentSessionData(TeaModel):
    def __init__(
        self,
        session_id: str = None,
        title: str = None,
        gmt_created: str = None,
        status: str = None,
        task_list: List[AgentTaskData] = None,
    ):
        # 会话id
        self.session_id = session_id
        # 会话标题
        self.title = title
        # 创建时间
        self.gmt_created = gmt_created
        # VALID("生效"),INVALID("失效"),RUNNING("进行中"),FAILED("失败"),TERMINATED("已终止"), COMPLETED("已完成");
        self.status = status
        # 任务列表
        self.task_list = task_list

    def validate(self):
        self.validate_required(self.session_id, 'session_id')
        self.validate_required(self.title, 'title')
        self.validate_required(self.gmt_created, 'gmt_created')
        self.validate_required(self.status, 'status')
        if self.task_list:
            for k in self.task_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.title is not None:
            result['title'] = self.title
        if self.gmt_created is not None:
            result['gmt_created'] = self.gmt_created
        if self.status is not None:
            result['status'] = self.status
        result['task_list'] = []
        if self.task_list is not None:
            for k in self.task_list:
                result['task_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('gmt_created') is not None:
            self.gmt_created = m.get('gmt_created')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.task_list = []
        if m.get('task_list') is not None:
            for k in m.get('task_list'):
                temp_model = AgentTaskData()
                self.task_list.append(temp_model.from_map(k))
        return self


class CrowdStrategyData(TeaModel):
    def __init__(
        self,
        strategy_code: str = None,
        strategy_name: str = None,
        status: str = None,
        strategy_count: int = None,
        user_count: int = None,
        inst_name: str = None,
        gmt_create: str = None,
    ):
        # 人群编码
        self.strategy_code = strategy_code
        # 人群名称
        self.strategy_name = strategy_name
        # 状态
        self.status = status
        # 人群数量
        self.strategy_count = strategy_count
        # 用户数量
        self.user_count = user_count
        # 机构名称
        self.inst_name = inst_name
        # 日期
        self.gmt_create = gmt_create

    def validate(self):
        self.validate_required(self.strategy_code, 'strategy_code')
        self.validate_required(self.strategy_name, 'strategy_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.strategy_count, 'strategy_count')
        self.validate_required(self.user_count, 'user_count')
        self.validate_required(self.gmt_create, 'gmt_create')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.strategy_code is not None:
            result['strategy_code'] = self.strategy_code
        if self.strategy_name is not None:
            result['strategy_name'] = self.strategy_name
        if self.status is not None:
            result['status'] = self.status
        if self.strategy_count is not None:
            result['strategy_count'] = self.strategy_count
        if self.user_count is not None:
            result['user_count'] = self.user_count
        if self.inst_name is not None:
            result['inst_name'] = self.inst_name
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('strategy_code') is not None:
            self.strategy_code = m.get('strategy_code')
        if m.get('strategy_name') is not None:
            self.strategy_name = m.get('strategy_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('strategy_count') is not None:
            self.strategy_count = m.get('strategy_count')
        if m.get('user_count') is not None:
            self.user_count = m.get('user_count')
        if m.get('inst_name') is not None:
            self.inst_name = m.get('inst_name')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        return self


class VoucherInfo(TeaModel):
    def __init__(
        self,
        voucher_id: str = None,
        user_id: str = None,
        product_code: str = None,
        assets_code: str = None,
        name: str = None,
        template_id: str = None,
        publisher_user_id: str = None,
        status: str = None,
        gmt_active: str = None,
        gmt_expired: str = None,
        gmt_extend: str = None,
        total_amount: str = None,
        floor_amount: str = None,
        total_count: int = None,
        available_count: int = None,
        used_count: int = None,
        voucher_description: str = None,
        extend_template_info: str = None,
        extend_info: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        biz_code: str = None,
        group_code: str = None,
        group_code_name: str = None,
    ):
        # 券id
        self.voucher_id = voucher_id
        # 2088id
        self.user_id = user_id
        # 产品编码
        self.product_code = product_code
        # 资产编码
        self.assets_code = assets_code
        # 券名称
        self.name = name
        # 券模板ID
        self.template_id = template_id
        # 发行人id
        self.publisher_user_id = publisher_user_id
        # 状态
        self.status = status
        # 券生效时间
        self.gmt_active = gmt_active
        # 券失效时间
        self.gmt_expired = gmt_expired
        # 展期
        self.gmt_extend = gmt_extend
        # 面额
        self.total_amount = total_amount
        # 门槛金额
        self.floor_amount = floor_amount
        # 总次数
        self.total_count = total_count
        # 可用次数
        self.available_count = available_count
        # 已使用次数
        self.used_count = used_count
        # 券描述
        self.voucher_description = voucher_description
        # 券模板扩展信息
        self.extend_template_info = extend_template_info
        # 扩展信息
        self.extend_info = extend_info
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 业务类型
        self.biz_code = biz_code
        # 收银台展示分组
        self.group_code = group_code
        # 收银台展示分组名称
        self.group_code_name = group_code_name

    def validate(self):
        self.validate_required(self.voucher_id, 'voucher_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.assets_code, 'assets_code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.publisher_user_id, 'publisher_user_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.gmt_active, 'gmt_active')
        self.validate_required(self.gmt_expired, 'gmt_expired')
        self.validate_required(self.gmt_extend, 'gmt_extend')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.floor_amount, 'floor_amount')
        self.validate_required(self.total_count, 'total_count')
        self.validate_required(self.available_count, 'available_count')
        self.validate_required(self.used_count, 'used_count')
        self.validate_required(self.voucher_description, 'voucher_description')
        self.validate_required(self.extend_template_info, 'extend_template_info')
        self.validate_required(self.extend_info, 'extend_info')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        self.validate_required(self.biz_code, 'biz_code')
        self.validate_required(self.group_code, 'group_code')
        self.validate_required(self.group_code_name, 'group_code_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.voucher_id is not None:
            result['voucher_id'] = self.voucher_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.assets_code is not None:
            result['assets_code'] = self.assets_code
        if self.name is not None:
            result['name'] = self.name
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.publisher_user_id is not None:
            result['publisher_user_id'] = self.publisher_user_id
        if self.status is not None:
            result['status'] = self.status
        if self.gmt_active is not None:
            result['gmt_active'] = self.gmt_active
        if self.gmt_expired is not None:
            result['gmt_expired'] = self.gmt_expired
        if self.gmt_extend is not None:
            result['gmt_extend'] = self.gmt_extend
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.floor_amount is not None:
            result['floor_amount'] = self.floor_amount
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.available_count is not None:
            result['available_count'] = self.available_count
        if self.used_count is not None:
            result['used_count'] = self.used_count
        if self.voucher_description is not None:
            result['voucher_description'] = self.voucher_description
        if self.extend_template_info is not None:
            result['extend_template_info'] = self.extend_template_info
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.group_code is not None:
            result['group_code'] = self.group_code
        if self.group_code_name is not None:
            result['group_code_name'] = self.group_code_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('voucher_id') is not None:
            self.voucher_id = m.get('voucher_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('assets_code') is not None:
            self.assets_code = m.get('assets_code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('publisher_user_id') is not None:
            self.publisher_user_id = m.get('publisher_user_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('gmt_active') is not None:
            self.gmt_active = m.get('gmt_active')
        if m.get('gmt_expired') is not None:
            self.gmt_expired = m.get('gmt_expired')
        if m.get('gmt_extend') is not None:
            self.gmt_extend = m.get('gmt_extend')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('floor_amount') is not None:
            self.floor_amount = m.get('floor_amount')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('available_count') is not None:
            self.available_count = m.get('available_count')
        if m.get('used_count') is not None:
            self.used_count = m.get('used_count')
        if m.get('voucher_description') is not None:
            self.voucher_description = m.get('voucher_description')
        if m.get('extend_template_info') is not None:
            self.extend_template_info = m.get('extend_template_info')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('group_code') is not None:
            self.group_code = m.get('group_code')
        if m.get('group_code_name') is not None:
            self.group_code_name = m.get('group_code_name')
        return self


class OrgTradeData(TeaModel):
    def __init__(
        self,
        discount_amount: str = None,
        buyer_pay_amount: str = None,
        buyer_user_id: str = None,
        out_trade_no: str = None,
        trade_no: str = None,
        send_pay_date: str = None,
        trade_status: str = None,
        receipt_amount: str = None,
        total_amount: str = None,
    ):
        # 平台优惠金额。单位：元。
        self.discount_amount = discount_amount
        # 买家实付金额，单位为元，两位小数。
        self.buyer_pay_amount = buyer_pay_amount
        # 买家在支付宝的用户id
        self.buyer_user_id = buyer_user_id
        # 支付宝交易号，交易单主键id
        self.out_trade_no = out_trade_no
        # 支付宝订单号
        self.trade_no = trade_no
        # 本次交易打款给卖家的时间
        self.send_pay_date = send_pay_date
        # 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
        self.trade_status = trade_status
        # 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
        self.receipt_amount = receipt_amount
        # 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
        self.total_amount = total_amount

    def validate(self):
        self.validate_required(self.discount_amount, 'discount_amount')
        self.validate_required(self.buyer_pay_amount, 'buyer_pay_amount')
        self.validate_required(self.buyer_user_id, 'buyer_user_id')
        self.validate_required(self.out_trade_no, 'out_trade_no')
        self.validate_required(self.trade_no, 'trade_no')
        self.validate_required(self.send_pay_date, 'send_pay_date')
        if self.send_pay_date is not None:
            self.validate_pattern(self.send_pay_date, 'send_pay_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.trade_status, 'trade_status')
        self.validate_required(self.receipt_amount, 'receipt_amount')
        self.validate_required(self.total_amount, 'total_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.discount_amount is not None:
            result['discount_amount'] = self.discount_amount
        if self.buyer_pay_amount is not None:
            result['buyer_pay_amount'] = self.buyer_pay_amount
        if self.buyer_user_id is not None:
            result['buyer_user_id'] = self.buyer_user_id
        if self.out_trade_no is not None:
            result['out_trade_no'] = self.out_trade_no
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.send_pay_date is not None:
            result['send_pay_date'] = self.send_pay_date
        if self.trade_status is not None:
            result['trade_status'] = self.trade_status
        if self.receipt_amount is not None:
            result['receipt_amount'] = self.receipt_amount
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('discount_amount') is not None:
            self.discount_amount = m.get('discount_amount')
        if m.get('buyer_pay_amount') is not None:
            self.buyer_pay_amount = m.get('buyer_pay_amount')
        if m.get('buyer_user_id') is not None:
            self.buyer_user_id = m.get('buyer_user_id')
        if m.get('out_trade_no') is not None:
            self.out_trade_no = m.get('out_trade_no')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('send_pay_date') is not None:
            self.send_pay_date = m.get('send_pay_date')
        if m.get('trade_status') is not None:
            self.trade_status = m.get('trade_status')
        if m.get('receipt_amount') is not None:
            self.receipt_amount = m.get('receipt_amount')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        return self


class PaymentRecord(TeaModel):
    def __init__(
        self,
        cloud_tenant_id: str = None,
        payment_amount: int = None,
        supplier_name: str = None,
        payment_date: str = None,
        request_unique_id: str = None,
    ):
        # 云上租户id
        self.cloud_tenant_id = cloud_tenant_id
        # 打款金额，单位分
        self.payment_amount = payment_amount
        # 服务商名称 - 即云租户名称，比如南京飞翰
        self.supplier_name = supplier_name
        # 打款日期
        self.payment_date = payment_date
        # 唯一请求id，即payment_record_id
        self.request_unique_id = request_unique_id

    def validate(self):
        self.validate_required(self.cloud_tenant_id, 'cloud_tenant_id')
        self.validate_required(self.payment_amount, 'payment_amount')
        self.validate_required(self.supplier_name, 'supplier_name')
        self.validate_required(self.payment_date, 'payment_date')
        if self.payment_date is not None:
            self.validate_pattern(self.payment_date, 'payment_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.request_unique_id, 'request_unique_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cloud_tenant_id is not None:
            result['cloud_tenant_id'] = self.cloud_tenant_id
        if self.payment_amount is not None:
            result['payment_amount'] = self.payment_amount
        if self.supplier_name is not None:
            result['supplier_name'] = self.supplier_name
        if self.payment_date is not None:
            result['payment_date'] = self.payment_date
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cloud_tenant_id') is not None:
            self.cloud_tenant_id = m.get('cloud_tenant_id')
        if m.get('payment_amount') is not None:
            self.payment_amount = m.get('payment_amount')
        if m.get('supplier_name') is not None:
            self.supplier_name = m.get('supplier_name')
        if m.get('payment_date') is not None:
            self.payment_date = m.get('payment_date')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        return self


class AgentChatCustomResponse(TeaModel):
    def __init__(
        self,
        message_id: str = None,
        content: str = None,
    ):
        # 消息id
        self.message_id = message_id
        # 内容
        self.content = content

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class OrgOverviewData(TeaModel):
    def __init__(
        self,
        total_budget_amt: str = None,
        huabei_budget_amt: str = None,
        jiebei_budget_amt: str = None,
        xiaowei_budget_amt: str = None,
        service_budget_amt: str = None,
        total_repayment_amt: str = None,
        huabei_repayment_amt: str = None,
        jiebei_repayment_amt: str = None,
        xiaowei_repayment_amt: str = None,
        total_trade_amt: str = None,
        huabei_trade_amt: str = None,
        jiebei_trade_amt: str = None,
        xiaowei_trade_amt: str = None,
        internal_subsidy_amt: str = None,
        total_net_repayment_amt: str = None,
        activity_roi: str = None,
        huabei_roi: str = None,
        jiebei_roi: str = None,
        xiaowei_roi: str = None,
    ):
        # 预算总金额
        self.total_budget_amt = total_budget_amt
        # 花呗预算金额
        self.huabei_budget_amt = huabei_budget_amt
        # 借呗预算金额
        self.jiebei_budget_amt = jiebei_budget_amt
        # 小微预算金额
        self.xiaowei_budget_amt = xiaowei_budget_amt
        # 服务费预算金额
        self.service_budget_amt = service_budget_amt
        # 总回款金额
        self.total_repayment_amt = total_repayment_amt
        # 花呗回款金额
        self.huabei_repayment_amt = huabei_repayment_amt
        # 借呗回款金额
        self.jiebei_repayment_amt = jiebei_repayment_amt
        # 小微回款金额
        self.xiaowei_repayment_amt = xiaowei_repayment_amt
        # 总交易金额
        self.total_trade_amt = total_trade_amt
        # 花呗交易金额
        self.huabei_trade_amt = huabei_trade_amt
        # 借呗交易金额
        self.jiebei_trade_amt = jiebei_trade_amt
        # 小微交易金额
        self.xiaowei_trade_amt = xiaowei_trade_amt
        # 内部补贴金额
        self.internal_subsidy_amt = internal_subsidy_amt
        # 净回款额
        self.total_net_repayment_amt = total_net_repayment_amt
        # 活动roi
        self.activity_roi = activity_roi
        # 花呗roi
        self.huabei_roi = huabei_roi
        # 借呗roi
        self.jiebei_roi = jiebei_roi
        # 小微roi
        self.xiaowei_roi = xiaowei_roi

    def validate(self):
        self.validate_required(self.total_budget_amt, 'total_budget_amt')
        self.validate_required(self.huabei_budget_amt, 'huabei_budget_amt')
        self.validate_required(self.jiebei_budget_amt, 'jiebei_budget_amt')
        self.validate_required(self.xiaowei_budget_amt, 'xiaowei_budget_amt')
        self.validate_required(self.service_budget_amt, 'service_budget_amt')
        self.validate_required(self.total_repayment_amt, 'total_repayment_amt')
        self.validate_required(self.huabei_repayment_amt, 'huabei_repayment_amt')
        self.validate_required(self.jiebei_repayment_amt, 'jiebei_repayment_amt')
        self.validate_required(self.xiaowei_repayment_amt, 'xiaowei_repayment_amt')
        self.validate_required(self.total_trade_amt, 'total_trade_amt')
        self.validate_required(self.huabei_trade_amt, 'huabei_trade_amt')
        self.validate_required(self.jiebei_trade_amt, 'jiebei_trade_amt')
        self.validate_required(self.xiaowei_trade_amt, 'xiaowei_trade_amt')
        self.validate_required(self.internal_subsidy_amt, 'internal_subsidy_amt')
        self.validate_required(self.total_net_repayment_amt, 'total_net_repayment_amt')
        self.validate_required(self.activity_roi, 'activity_roi')
        self.validate_required(self.huabei_roi, 'huabei_roi')
        self.validate_required(self.jiebei_roi, 'jiebei_roi')
        self.validate_required(self.xiaowei_roi, 'xiaowei_roi')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total_budget_amt is not None:
            result['total_budget_amt'] = self.total_budget_amt
        if self.huabei_budget_amt is not None:
            result['huabei_budget_amt'] = self.huabei_budget_amt
        if self.jiebei_budget_amt is not None:
            result['jiebei_budget_amt'] = self.jiebei_budget_amt
        if self.xiaowei_budget_amt is not None:
            result['xiaowei_budget_amt'] = self.xiaowei_budget_amt
        if self.service_budget_amt is not None:
            result['service_budget_amt'] = self.service_budget_amt
        if self.total_repayment_amt is not None:
            result['total_repayment_amt'] = self.total_repayment_amt
        if self.huabei_repayment_amt is not None:
            result['huabei_repayment_amt'] = self.huabei_repayment_amt
        if self.jiebei_repayment_amt is not None:
            result['jiebei_repayment_amt'] = self.jiebei_repayment_amt
        if self.xiaowei_repayment_amt is not None:
            result['xiaowei_repayment_amt'] = self.xiaowei_repayment_amt
        if self.total_trade_amt is not None:
            result['total_trade_amt'] = self.total_trade_amt
        if self.huabei_trade_amt is not None:
            result['huabei_trade_amt'] = self.huabei_trade_amt
        if self.jiebei_trade_amt is not None:
            result['jiebei_trade_amt'] = self.jiebei_trade_amt
        if self.xiaowei_trade_amt is not None:
            result['xiaowei_trade_amt'] = self.xiaowei_trade_amt
        if self.internal_subsidy_amt is not None:
            result['internal_subsidy_amt'] = self.internal_subsidy_amt
        if self.total_net_repayment_amt is not None:
            result['total_net_repayment_amt'] = self.total_net_repayment_amt
        if self.activity_roi is not None:
            result['activity_roi'] = self.activity_roi
        if self.huabei_roi is not None:
            result['huabei_roi'] = self.huabei_roi
        if self.jiebei_roi is not None:
            result['jiebei_roi'] = self.jiebei_roi
        if self.xiaowei_roi is not None:
            result['xiaowei_roi'] = self.xiaowei_roi
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total_budget_amt') is not None:
            self.total_budget_amt = m.get('total_budget_amt')
        if m.get('huabei_budget_amt') is not None:
            self.huabei_budget_amt = m.get('huabei_budget_amt')
        if m.get('jiebei_budget_amt') is not None:
            self.jiebei_budget_amt = m.get('jiebei_budget_amt')
        if m.get('xiaowei_budget_amt') is not None:
            self.xiaowei_budget_amt = m.get('xiaowei_budget_amt')
        if m.get('service_budget_amt') is not None:
            self.service_budget_amt = m.get('service_budget_amt')
        if m.get('total_repayment_amt') is not None:
            self.total_repayment_amt = m.get('total_repayment_amt')
        if m.get('huabei_repayment_amt') is not None:
            self.huabei_repayment_amt = m.get('huabei_repayment_amt')
        if m.get('jiebei_repayment_amt') is not None:
            self.jiebei_repayment_amt = m.get('jiebei_repayment_amt')
        if m.get('xiaowei_repayment_amt') is not None:
            self.xiaowei_repayment_amt = m.get('xiaowei_repayment_amt')
        if m.get('total_trade_amt') is not None:
            self.total_trade_amt = m.get('total_trade_amt')
        if m.get('huabei_trade_amt') is not None:
            self.huabei_trade_amt = m.get('huabei_trade_amt')
        if m.get('jiebei_trade_amt') is not None:
            self.jiebei_trade_amt = m.get('jiebei_trade_amt')
        if m.get('xiaowei_trade_amt') is not None:
            self.xiaowei_trade_amt = m.get('xiaowei_trade_amt')
        if m.get('internal_subsidy_amt') is not None:
            self.internal_subsidy_amt = m.get('internal_subsidy_amt')
        if m.get('total_net_repayment_amt') is not None:
            self.total_net_repayment_amt = m.get('total_net_repayment_amt')
        if m.get('activity_roi') is not None:
            self.activity_roi = m.get('activity_roi')
        if m.get('huabei_roi') is not None:
            self.huabei_roi = m.get('huabei_roi')
        if m.get('jiebei_roi') is not None:
            self.jiebei_roi = m.get('jiebei_roi')
        if m.get('xiaowei_roi') is not None:
            self.xiaowei_roi = m.get('xiaowei_roi')
        return self


class AgentChatResponse(TeaModel):
    def __init__(
        self,
        success: bool = None,
        data: AgentChatData = None,
    ):
        # 是否结束
        self.success = success
        # 对话data数据
        self.data = data

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.data, 'data')
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('data') is not None:
            temp_model = AgentChatData()
            self.data = temp_model.from_map(m['data'])
        return self


class VoucherConsultBusinessContext(TeaModel):
    def __init__(
        self,
        asset_type_code_list: List[str] = None,
        order_amount: str = None,
        payee_user_id: str = None,
        biz_context: str = None,
    ):
        # 指定资产编码列表
        self.asset_type_code_list = asset_type_code_list
        # 订单金额
        self.order_amount = order_amount
        # 收款账号
        self.payee_user_id = payee_user_id
        # 业务上下文信息
        self.biz_context = biz_context

    def validate(self):
        self.validate_required(self.asset_type_code_list, 'asset_type_code_list')
        self.validate_required(self.order_amount, 'order_amount')
        self.validate_required(self.payee_user_id, 'payee_user_id')
        self.validate_required(self.biz_context, 'biz_context')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.asset_type_code_list is not None:
            result['asset_type_code_list'] = self.asset_type_code_list
        if self.order_amount is not None:
            result['order_amount'] = self.order_amount
        if self.payee_user_id is not None:
            result['payee_user_id'] = self.payee_user_id
        if self.biz_context is not None:
            result['biz_context'] = self.biz_context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset_type_code_list') is not None:
            self.asset_type_code_list = m.get('asset_type_code_list')
        if m.get('order_amount') is not None:
            self.order_amount = m.get('order_amount')
        if m.get('payee_user_id') is not None:
            self.payee_user_id = m.get('payee_user_id')
        if m.get('biz_context') is not None:
            self.biz_context = m.get('biz_context')
        return self


class OrgAlipayTradeData(TeaModel):
    def __init__(
        self,
        alipay_order_no: str = None,
        gmt_create: str = None,
        gmt_pay: str = None,
        gmt_refund: str = None,
        goods_memo: str = None,
        goods_title: str = None,
        merchant_order_no: str = None,
        net_mdiscount: str = None,
        other_account: str = None,
        refund_amount: str = None,
        service_fee: str = None,
        store_name: str = None,
        store_no: str = None,
        total_amount: str = None,
        trade_status: str = None,
        trade_type: str = None,
    ):
        # 支付宝订单号
        self.alipay_order_no = alipay_order_no
        # 交易创建时间
        self.gmt_create = gmt_create
        # 交易支付时间
        self.gmt_pay = gmt_pay
        # 交易退款时间
        self.gmt_refund = gmt_refund
        # 商品备注信息
        self.goods_memo = goods_memo
        # 机构名称
        self.goods_title = goods_title
        # 商户订单号，创建支付宝交易时传入的信息
        self.merchant_order_no = merchant_order_no
        # 商家优惠金额
        self.net_mdiscount = net_mdiscount
        # 对方账户
        self.other_account = other_account
        # 订单退款金额
        self.refund_amount = refund_amount
        # 服务费金额
        self.service_fee = service_fee
        # 门店名称
        self.store_name = store_name
        # 门店编号
        self.store_no = store_no
        # 订单金额
        self.total_amount = total_amount
        # 订单状态(待付款,成功,关闭,待发货,待确认收货,已预付,进行中)
        self.trade_status = trade_status
        # 业务类型，帮助商户作为对账参考
        self.trade_type = trade_type

    def validate(self):
        self.validate_required(self.alipay_order_no, 'alipay_order_no')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.gmt_pay, 'gmt_pay')
        self.validate_required(self.gmt_refund, 'gmt_refund')
        self.validate_required(self.goods_title, 'goods_title')
        self.validate_required(self.merchant_order_no, 'merchant_order_no')
        self.validate_required(self.net_mdiscount, 'net_mdiscount')
        self.validate_required(self.other_account, 'other_account')
        self.validate_required(self.refund_amount, 'refund_amount')
        self.validate_required(self.service_fee, 'service_fee')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.trade_status, 'trade_status')
        self.validate_required(self.trade_type, 'trade_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.alipay_order_no is not None:
            result['alipay_order_no'] = self.alipay_order_no
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_pay is not None:
            result['gmt_pay'] = self.gmt_pay
        if self.gmt_refund is not None:
            result['gmt_refund'] = self.gmt_refund
        if self.goods_memo is not None:
            result['goods_memo'] = self.goods_memo
        if self.goods_title is not None:
            result['goods_title'] = self.goods_title
        if self.merchant_order_no is not None:
            result['merchant_order_no'] = self.merchant_order_no
        if self.net_mdiscount is not None:
            result['net_mdiscount'] = self.net_mdiscount
        if self.other_account is not None:
            result['other_account'] = self.other_account
        if self.refund_amount is not None:
            result['refund_amount'] = self.refund_amount
        if self.service_fee is not None:
            result['service_fee'] = self.service_fee
        if self.store_name is not None:
            result['store_name'] = self.store_name
        if self.store_no is not None:
            result['store_no'] = self.store_no
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.trade_status is not None:
            result['trade_status'] = self.trade_status
        if self.trade_type is not None:
            result['trade_type'] = self.trade_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alipay_order_no') is not None:
            self.alipay_order_no = m.get('alipay_order_no')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_pay') is not None:
            self.gmt_pay = m.get('gmt_pay')
        if m.get('gmt_refund') is not None:
            self.gmt_refund = m.get('gmt_refund')
        if m.get('goods_memo') is not None:
            self.goods_memo = m.get('goods_memo')
        if m.get('goods_title') is not None:
            self.goods_title = m.get('goods_title')
        if m.get('merchant_order_no') is not None:
            self.merchant_order_no = m.get('merchant_order_no')
        if m.get('net_mdiscount') is not None:
            self.net_mdiscount = m.get('net_mdiscount')
        if m.get('other_account') is not None:
            self.other_account = m.get('other_account')
        if m.get('refund_amount') is not None:
            self.refund_amount = m.get('refund_amount')
        if m.get('service_fee') is not None:
            self.service_fee = m.get('service_fee')
        if m.get('store_name') is not None:
            self.store_name = m.get('store_name')
        if m.get('store_no') is not None:
            self.store_no = m.get('store_no')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('trade_status') is not None:
            self.trade_status = m.get('trade_status')
        if m.get('trade_type') is not None:
            self.trade_type = m.get('trade_type')
        return self


class BenefitWriteOffMonthFileData(TeaModel):
    def __init__(
        self,
        billing_month: str = None,
        file_filed_id: str = None,
    ):
        # 所属月份
        self.billing_month = billing_month
        # AFTS 上传到文件 id
        self.file_filed_id = file_filed_id

    def validate(self):
        self.validate_required(self.billing_month, 'billing_month')
        self.validate_required(self.file_filed_id, 'file_filed_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.billing_month is not None:
            result['billing_month'] = self.billing_month
        if self.file_filed_id is not None:
            result['file_filed_id'] = self.file_filed_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('billing_month') is not None:
            self.billing_month = m.get('billing_month')
        if m.get('file_filed_id') is not None:
            self.file_filed_id = m.get('file_filed_id')
        return self


class CallbackAntdigitalAssetOrgoperationRepayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        repay_record_no: str = None,
        status: str = None,
        ext_info: str = None,
        request_unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 还款编号
        self.repay_record_no = repay_record_no
        # 还款处理状态
        self.status = status
        # 额外的信息
        self.ext_info = ext_info
        # 请求唯一id，最长32字符
        # 
        self.request_unique_id = request_unique_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.repay_record_no, 'repay_record_no')
        self.validate_required(self.status, 'status')
        self.validate_required(self.request_unique_id, 'request_unique_id')

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
        if self.repay_record_no is not None:
            result['repay_record_no'] = self.repay_record_no
        if self.status is not None:
            result['status'] = self.status
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.request_unique_id is not None:
            result['request_unique_id'] = self.request_unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('repay_record_no') is not None:
            self.repay_record_no = m.get('repay_record_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('request_unique_id') is not None:
            self.request_unique_id = m.get('request_unique_id')
        return self


class CallbackAntdigitalAssetOrgoperationRepayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: RepayCallBackResData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款回调结果
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
            temp_model = RepayCallBackResData()
            self.data = temp_model.from_map(m['data'])
        return self


