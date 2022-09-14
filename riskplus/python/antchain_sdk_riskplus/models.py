# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List, BinaryIO


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


class RtopLevelDistribution(TeaModel):
    def __init__(
        self,
        count: int = None,
        level: str = None,
    ):
        # 统计值
        self.count = count
        # 等级
        self.level = level

    def validate(self):
        self.validate_required(self.count, 'count')
        self.validate_required(self.level, 'level')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.count is not None:
            result['count'] = self.count
        if self.level is not None:
            result['level'] = self.level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('level') is not None:
            self.level = m.get('level')
        return self


class OutParams(TeaModel):
    def __init__(
        self,
        name: str = None,
        desc: str = None,
        value: str = None,
    ):
        # 输出参数
        self.name = name
        # 参数描述
        self.desc = desc
        # 参数值
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.desc is not None:
            result['desc'] = self.desc
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class InfoCodes(TeaModel):
    def __init__(
        self,
        name: str = None,
    ):
        # infocode
        self.name = name

    def validate(self):
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class Contact(TeaModel):
    def __init__(
        self,
        kind: str = None,
        name: str = None,
        mobile: str = None,
    ):
        # 联系人类型
        # 1配偶
        # 2父母
        # 3子女
        # 4兄弟
        # 5姐妹
        # 6朋友
        # 7其他
        self.kind = kind
        # 联系人姓名
        self.name = name
        # 联系人手机号
        self.mobile = mobile

    def validate(self):
        self.validate_required(self.kind, 'kind')
        self.validate_required(self.name, 'name')
        self.validate_required(self.mobile, 'mobile')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.kind is not None:
            result['kind'] = self.kind
        if self.name is not None:
            result['name'] = self.name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('kind') is not None:
            self.kind = m.get('kind')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        return self


class RtopCrowdRiskFeatureTag(TeaModel):
    def __init__(
        self,
        tag_explanation: str = None,
        tag_name: str = None,
    ):
        # 标签描述
        self.tag_explanation = tag_explanation
        # 标签名称
        self.tag_name = tag_name

    def validate(self):
        self.validate_required(self.tag_explanation, 'tag_explanation')
        self.validate_required(self.tag_name, 'tag_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tag_explanation is not None:
            result['tag_explanation'] = self.tag_explanation
        if self.tag_name is not None:
            result['tag_name'] = self.tag_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tag_explanation') is not None:
            self.tag_explanation = m.get('tag_explanation')
        if m.get('tag_name') is not None:
            self.tag_name = m.get('tag_name')
        return self


class RiskDetail(TeaModel):
    def __init__(
        self,
        rule_weight: str = None,
        rule_name: str = None,
    ):
        # 反欺诈风险数据服务命中规则风险权重
        self.rule_weight = rule_weight
        # 反欺诈风险数据服务命中规则名称
        self.rule_name = rule_name

    def validate(self):
        self.validate_required(self.rule_weight, 'rule_weight')
        self.validate_required(self.rule_name, 'rule_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.rule_weight is not None:
            result['rule_weight'] = self.rule_weight
        if self.rule_name is not None:
            result['rule_name'] = self.rule_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('rule_weight') is not None:
            self.rule_weight = m.get('rule_weight')
        if m.get('rule_name') is not None:
            self.rule_name = m.get('rule_name')
        return self


class DecisionFlow(TeaModel):
    def __init__(
        self,
        decision_flow: OutParams = None,
        decision: str = None,
        info_codes: InfoCodes = None,
    ):
        # 输出参数
        self.decision_flow = decision_flow
        # 决策结果
        self.decision = decision
        # infocodes
        self.info_codes = info_codes

    def validate(self):
        if self.decision_flow:
            self.decision_flow.validate()
        self.validate_required(self.decision, 'decision')
        if self.info_codes:
            self.info_codes.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.decision_flow is not None:
            result['decision_flow'] = self.decision_flow.to_map()
        if self.decision is not None:
            result['decision'] = self.decision
        if self.info_codes is not None:
            result['info_codes'] = self.info_codes.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('decision_flow') is not None:
            temp_model = OutParams()
            self.decision_flow = temp_model.from_map(m['decision_flow'])
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('info_codes') is not None:
            temp_model = InfoCodes()
            self.info_codes = temp_model.from_map(m['info_codes'])
        return self


class BaseCustomerUmktInfoModel(TeaModel):
    def __init__(
        self,
        customer_key: str = None,
        query_template: str = None,
        umkt_result: int = None,
    ):
        # 用户凭证
        self.customer_key = customer_key
        # 输入模板
        self.query_template = query_template
        # 实时营销结果
        self.umkt_result = umkt_result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.customer_key is not None:
            result['customer_key'] = self.customer_key
        if self.query_template is not None:
            result['query_template'] = self.query_template
        if self.umkt_result is not None:
            result['umkt_result'] = self.umkt_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('customer_key') is not None:
            self.customer_key = m.get('customer_key')
        if m.get('query_template') is not None:
            self.query_template = m.get('query_template')
        if m.get('umkt_result') is not None:
            self.umkt_result = m.get('umkt_result')
        return self


class RtopTypeDistribution(TeaModel):
    def __init__(
        self,
        count: int = None,
        level_distribution: List[RtopLevelDistribution] = None,
        type: str = None,
    ):
        # 统计值
        self.count = count
        # 当前类型下的等级分布
        self.level_distribution = level_distribution
        # 类型
        self.type = type

    def validate(self):
        self.validate_required(self.count, 'count')
        self.validate_required(self.level_distribution, 'level_distribution')
        if self.level_distribution:
            for k in self.level_distribution:
                if k:
                    k.validate()
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.count is not None:
            result['count'] = self.count
        result['levelDistribution'] = []
        if self.level_distribution is not None:
            for k in self.level_distribution:
                result['levelDistribution'].append(k.to_map() if k else None)
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('count') is not None:
            self.count = m.get('count')
        self.level_distribution = []
        if m.get('levelDistribution') is not None:
            for k in m.get('levelDistribution'):
                temp_model = RtopLevelDistribution()
                self.level_distribution.append(temp_model.from_map(k))
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class RtopRiskTag(TeaModel):
    def __init__(
        self,
        tag_id: str = None,
        tag_name: str = None,
        tag_type: str = None,
        tag_text: str = None,
        tag_clue: str = None,
        clue_detail_type: str = None,
        tag_clue_detail: str = None,
    ):
        # 标签ID
        self.tag_id = tag_id
        # 标签名称
        self.tag_name = tag_name
        # 标签类型
        self.tag_type = tag_type
        # 标签文本
        self.tag_text = tag_text
        # 线索概览
        self.tag_clue = tag_clue
        # 线索明细类型
        self.clue_detail_type = clue_detail_type
        # 线索明细
        self.tag_clue_detail = tag_clue_detail

    def validate(self):
        self.validate_required(self.tag_id, 'tag_id')
        self.validate_required(self.tag_name, 'tag_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        if self.tag_name is not None:
            result['tag_name'] = self.tag_name
        if self.tag_type is not None:
            result['tag_type'] = self.tag_type
        if self.tag_text is not None:
            result['tag_text'] = self.tag_text
        if self.tag_clue is not None:
            result['tag_clue'] = self.tag_clue
        if self.clue_detail_type is not None:
            result['clue_detail_type'] = self.clue_detail_type
        if self.tag_clue_detail is not None:
            result['tag_clue_detail'] = self.tag_clue_detail
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        if m.get('tag_name') is not None:
            self.tag_name = m.get('tag_name')
        if m.get('tag_type') is not None:
            self.tag_type = m.get('tag_type')
        if m.get('tag_text') is not None:
            self.tag_text = m.get('tag_text')
        if m.get('tag_clue') is not None:
            self.tag_clue = m.get('tag_clue')
        if m.get('clue_detail_type') is not None:
            self.clue_detail_type = m.get('clue_detail_type')
        if m.get('tag_clue_detail') is not None:
            self.tag_clue_detail = m.get('tag_clue_detail')
        return self


class StatisticInfoDetail(TeaModel):
    def __init__(
        self,
        action_driver_code: int = None,
        invoke_count: int = None,
        success_count: int = None,
        fail_count: int = None,
        finish_count: int = None,
    ):
        # actionDriverCode类型
        self.action_driver_code = action_driver_code
        # 调用总数
        self.invoke_count = invoke_count
        # 成功数
        self.success_count = success_count
        # 失败数
        self.fail_count = fail_count
        # 已处理完成任务数
        self.finish_count = finish_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_driver_code is not None:
            result['action_driver_code'] = self.action_driver_code
        if self.invoke_count is not None:
            result['invoke_count'] = self.invoke_count
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.fail_count is not None:
            result['fail_count'] = self.fail_count
        if self.finish_count is not None:
            result['finish_count'] = self.finish_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_driver_code') is not None:
            self.action_driver_code = m.get('action_driver_code')
        if m.get('invoke_count') is not None:
            self.invoke_count = m.get('invoke_count')
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('fail_count') is not None:
            self.fail_count = m.get('fail_count')
        if m.get('finish_count') is not None:
            self.finish_count = m.get('finish_count')
        return self


class ReceiptInfo(TeaModel):
    def __init__(
        self,
        custom_name: str = None,
        card_no: str = None,
        mobile: str = None,
        apply_amount: int = None,
        loan_amount: int = None,
        period: int = None,
        cur_period: int = None,
        repay_type: str = None,
        repay_date: str = None,
        loan_time: str = None,
        status: str = None,
        already_corpus: int = None,
        already_accrual: int = None,
        already_date: str = None,
        workflow_status: str = None,
        receipt_no: str = None,
    ):
        # 客户名
        self.custom_name = custom_name
        # 证件号码
        self.card_no = card_no
        # 手机号
        self.mobile = mobile
        # 贷款金额
        self.apply_amount = apply_amount
        # 发放金额
        self.loan_amount = loan_amount
        # 期数
        self.period = period
        # 当前期数
        self.cur_period = cur_period
        # 还款方式1：等额本息，2：等额本金，3：按月付息到期还本，4：利随本清，5：自由还款
        self.repay_type = repay_type
        # 还款日
        self.repay_date = repay_date
        # 放款时间
        self.loan_time = loan_time
        # 借据状态0：未还清，1：已还清，2：已提前还清
        self.status = status
        # 已还本金
        self.already_corpus = already_corpus
        # 已还利息
        self.already_accrual = already_accrual
        # 结清日期
        self.already_date = already_date
        # 审批状态0：通过 1：拒绝 2：审批中 3：失败
        self.workflow_status = workflow_status
        # 借据编号
        self.receipt_no = receipt_no

    def validate(self):
        self.validate_required(self.custom_name, 'custom_name')
        self.validate_required(self.card_no, 'card_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.apply_amount, 'apply_amount')
        self.validate_required(self.loan_amount, 'loan_amount')
        self.validate_required(self.period, 'period')
        self.validate_required(self.cur_period, 'cur_period')
        self.validate_required(self.repay_type, 'repay_type')
        self.validate_required(self.repay_date, 'repay_date')
        self.validate_required(self.loan_time, 'loan_time')
        if self.loan_time is not None:
            self.validate_pattern(self.loan_time, 'loan_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.status, 'status')
        self.validate_required(self.already_corpus, 'already_corpus')
        self.validate_required(self.already_accrual, 'already_accrual')
        self.validate_required(self.already_date, 'already_date')
        if self.already_date is not None:
            self.validate_pattern(self.already_date, 'already_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.workflow_status, 'workflow_status')
        self.validate_required(self.receipt_no, 'receipt_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.custom_name is not None:
            result['custom_name'] = self.custom_name
        if self.card_no is not None:
            result['card_no'] = self.card_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.apply_amount is not None:
            result['apply_amount'] = self.apply_amount
        if self.loan_amount is not None:
            result['loan_amount'] = self.loan_amount
        if self.period is not None:
            result['period'] = self.period
        if self.cur_period is not None:
            result['cur_period'] = self.cur_period
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.repay_date is not None:
            result['repay_date'] = self.repay_date
        if self.loan_time is not None:
            result['loan_time'] = self.loan_time
        if self.status is not None:
            result['status'] = self.status
        if self.already_corpus is not None:
            result['already_corpus'] = self.already_corpus
        if self.already_accrual is not None:
            result['already_accrual'] = self.already_accrual
        if self.already_date is not None:
            result['already_date'] = self.already_date
        if self.workflow_status is not None:
            result['workflow_status'] = self.workflow_status
        if self.receipt_no is not None:
            result['receipt_no'] = self.receipt_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('custom_name') is not None:
            self.custom_name = m.get('custom_name')
        if m.get('card_no') is not None:
            self.card_no = m.get('card_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('apply_amount') is not None:
            self.apply_amount = m.get('apply_amount')
        if m.get('loan_amount') is not None:
            self.loan_amount = m.get('loan_amount')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('cur_period') is not None:
            self.cur_period = m.get('cur_period')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('repay_date') is not None:
            self.repay_date = m.get('repay_date')
        if m.get('loan_time') is not None:
            self.loan_time = m.get('loan_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('already_corpus') is not None:
            self.already_corpus = m.get('already_corpus')
        if m.get('already_accrual') is not None:
            self.already_accrual = m.get('already_accrual')
        if m.get('already_date') is not None:
            self.already_date = m.get('already_date')
        if m.get('workflow_status') is not None:
            self.workflow_status = m.get('workflow_status')
        if m.get('receipt_no') is not None:
            self.receipt_no = m.get('receipt_no')
        return self


class RepayRef(TeaModel):
    def __init__(
        self,
        custom_no: str = None,
        period: str = None,
        need_amount: int = None,
        trans_principal: int = None,
        need_accrual: int = None,
        need_fee: int = None,
        already_amount: int = None,
        already_corpus: int = None,
        already_overcorpus: int = None,
        already_accrual: int = None,
        already_punish: int = None,
        already_fee: int = None,
        rate: int = None,
        penalty_value: int = None,
        rest_amount: int = None,
        rest_corpus: int = None,
        rest_accrual: int = None,
        rest_punish: int = None,
        remain_corpus: int = None,
        receipt_no: str = None,
        status: str = None,
        settle_date: str = None,
        trade_date: str = None,
    ):
        # 客户编码
        self.custom_no = custom_no
        # 当前期数
        self.period = period
        # 应还总额
        self.need_amount = need_amount
        # 应还本金
        self.trans_principal = trans_principal
        # 应还利息
        self.need_accrual = need_accrual
        # 应还手续费
        self.need_fee = need_fee
        # 已还总额
        self.already_amount = already_amount
        # 已还本金
        self.already_corpus = already_corpus
        # 已还逾期本金
        self.already_overcorpus = already_overcorpus
        # 已还利息
        self.already_accrual = already_accrual
        # 已还逾期息
        self.already_punish = already_punish
        # 已还手续费
        self.already_fee = already_fee
        # 利率
        self.rate = rate
        # 罚息率
        self.penalty_value = penalty_value
        # 当期剩余总额
        self.rest_amount = rest_amount
        # 当期剩余本金
        self.rest_corpus = rest_corpus
        # 当期剩余利息
        self.rest_accrual = rest_accrual
        # 当期剩余罚息
        self.rest_punish = rest_punish
        # 期末本金
        self.remain_corpus = remain_corpus
        # 借据编号
        self.receipt_no = receipt_no
        # 还款状态1：已还清 2 未还 3 部分还款
        self.status = status
        # 应还日期
        self.settle_date = settle_date
        # 还款日期
        self.trade_date = trade_date

    def validate(self):
        self.validate_required(self.custom_no, 'custom_no')
        self.validate_required(self.period, 'period')
        self.validate_required(self.need_amount, 'need_amount')
        self.validate_required(self.trans_principal, 'trans_principal')
        self.validate_required(self.need_accrual, 'need_accrual')
        self.validate_required(self.need_fee, 'need_fee')
        self.validate_required(self.already_amount, 'already_amount')
        self.validate_required(self.already_corpus, 'already_corpus')
        self.validate_required(self.already_overcorpus, 'already_overcorpus')
        self.validate_required(self.already_accrual, 'already_accrual')
        self.validate_required(self.already_punish, 'already_punish')
        self.validate_required(self.already_fee, 'already_fee')
        self.validate_required(self.rate, 'rate')
        self.validate_required(self.penalty_value, 'penalty_value')
        self.validate_required(self.rest_amount, 'rest_amount')
        self.validate_required(self.rest_corpus, 'rest_corpus')
        self.validate_required(self.rest_accrual, 'rest_accrual')
        self.validate_required(self.rest_punish, 'rest_punish')
        self.validate_required(self.remain_corpus, 'remain_corpus')
        self.validate_required(self.receipt_no, 'receipt_no')
        self.validate_required(self.status, 'status')
        self.validate_required(self.settle_date, 'settle_date')
        if self.settle_date is not None:
            self.validate_pattern(self.settle_date, 'settle_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.trade_date, 'trade_date')
        if self.trade_date is not None:
            self.validate_pattern(self.trade_date, 'trade_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.period is not None:
            result['period'] = self.period
        if self.need_amount is not None:
            result['need_amount'] = self.need_amount
        if self.trans_principal is not None:
            result['trans_principal'] = self.trans_principal
        if self.need_accrual is not None:
            result['need_accrual'] = self.need_accrual
        if self.need_fee is not None:
            result['need_fee'] = self.need_fee
        if self.already_amount is not None:
            result['already_amount'] = self.already_amount
        if self.already_corpus is not None:
            result['already_corpus'] = self.already_corpus
        if self.already_overcorpus is not None:
            result['already_overcorpus'] = self.already_overcorpus
        if self.already_accrual is not None:
            result['already_accrual'] = self.already_accrual
        if self.already_punish is not None:
            result['already_punish'] = self.already_punish
        if self.already_fee is not None:
            result['already_fee'] = self.already_fee
        if self.rate is not None:
            result['rate'] = self.rate
        if self.penalty_value is not None:
            result['penalty_value'] = self.penalty_value
        if self.rest_amount is not None:
            result['rest_amount'] = self.rest_amount
        if self.rest_corpus is not None:
            result['rest_corpus'] = self.rest_corpus
        if self.rest_accrual is not None:
            result['rest_accrual'] = self.rest_accrual
        if self.rest_punish is not None:
            result['rest_punish'] = self.rest_punish
        if self.remain_corpus is not None:
            result['remain_corpus'] = self.remain_corpus
        if self.receipt_no is not None:
            result['receipt_no'] = self.receipt_no
        if self.status is not None:
            result['status'] = self.status
        if self.settle_date is not None:
            result['settle_date'] = self.settle_date
        if self.trade_date is not None:
            result['trade_date'] = self.trade_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('need_amount') is not None:
            self.need_amount = m.get('need_amount')
        if m.get('trans_principal') is not None:
            self.trans_principal = m.get('trans_principal')
        if m.get('need_accrual') is not None:
            self.need_accrual = m.get('need_accrual')
        if m.get('need_fee') is not None:
            self.need_fee = m.get('need_fee')
        if m.get('already_amount') is not None:
            self.already_amount = m.get('already_amount')
        if m.get('already_corpus') is not None:
            self.already_corpus = m.get('already_corpus')
        if m.get('already_overcorpus') is not None:
            self.already_overcorpus = m.get('already_overcorpus')
        if m.get('already_accrual') is not None:
            self.already_accrual = m.get('already_accrual')
        if m.get('already_punish') is not None:
            self.already_punish = m.get('already_punish')
        if m.get('already_fee') is not None:
            self.already_fee = m.get('already_fee')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        if m.get('penalty_value') is not None:
            self.penalty_value = m.get('penalty_value')
        if m.get('rest_amount') is not None:
            self.rest_amount = m.get('rest_amount')
        if m.get('rest_corpus') is not None:
            self.rest_corpus = m.get('rest_corpus')
        if m.get('rest_accrual') is not None:
            self.rest_accrual = m.get('rest_accrual')
        if m.get('rest_punish') is not None:
            self.rest_punish = m.get('rest_punish')
        if m.get('remain_corpus') is not None:
            self.remain_corpus = m.get('remain_corpus')
        if m.get('receipt_no') is not None:
            self.receipt_no = m.get('receipt_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('settle_date') is not None:
            self.settle_date = m.get('settle_date')
        if m.get('trade_date') is not None:
            self.trade_date = m.get('trade_date')
        return self


class RuleDetail(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 规则细节名称
        self.name = name
        # 规则细节值
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class SecurityScene(TeaModel):
    def __init__(
        self,
        access_channel: str = None,
        ctu_params: str = None,
        product_name: str = None,
        product_node: str = None,
        security_scene_params: str = None,
        system_name: str = None,
        total_fee: str = None,
    ):
        # 接入渠道
        self.access_channel = access_channel
        # 事件信息
        self.ctu_params = ctu_params
        # 产品名称
        self.product_name = product_name
        # 产品节点
        self.product_node = product_node
        # 扩展参数
        self.security_scene_params = security_scene_params
        # 系统名称
        self.system_name = system_name
        # 总金额
        self.total_fee = total_fee

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_channel is not None:
            result['access_channel'] = self.access_channel
        if self.ctu_params is not None:
            result['ctu_params'] = self.ctu_params
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_node is not None:
            result['product_node'] = self.product_node
        if self.security_scene_params is not None:
            result['security_scene_params'] = self.security_scene_params
        if self.system_name is not None:
            result['system_name'] = self.system_name
        if self.total_fee is not None:
            result['total_fee'] = self.total_fee
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_channel') is not None:
            self.access_channel = m.get('access_channel')
        if m.get('ctu_params') is not None:
            self.ctu_params = m.get('ctu_params')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_node') is not None:
            self.product_node = m.get('product_node')
        if m.get('security_scene_params') is not None:
            self.security_scene_params = m.get('security_scene_params')
        if m.get('system_name') is not None:
            self.system_name = m.get('system_name')
        if m.get('total_fee') is not None:
            self.total_fee = m.get('total_fee')
        return self


class RtopStarCompanyInfo(TeaModel):
    def __init__(
        self,
        categories: List[str] = None,
        operating_place: str = None,
        operating_province: str = None,
        org_name: str = None,
        risk_score: int = None,
        risk_tags: List[str] = None,
        risk_tag_details: List[RtopRiskTag] = None,
        risk_tag_ids: List[str] = None,
        uc_code: str = None,
    ):
        # 行业
        self.categories = categories
        # 经营地址
        self.operating_place = operating_place
        # 经营省份
        self.operating_province = operating_province
        # 企业名称
        self.org_name = org_name
        # 风险分数
        self.risk_score = risk_score
        # 风险标签
        self.risk_tags = risk_tags
        # 风险线索
        self.risk_tag_details = risk_tag_details
        # 风险标签Id集合
        self.risk_tag_ids = risk_tag_ids
        # 统一社会信用代码
        self.uc_code = uc_code

    def validate(self):
        if self.risk_tag_details:
            for k in self.risk_tag_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.categories is not None:
            result['categories'] = self.categories
        if self.operating_place is not None:
            result['operating_place'] = self.operating_place
        if self.operating_province is not None:
            result['operating_province'] = self.operating_province
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_tags is not None:
            result['risk_tags'] = self.risk_tags
        result['risk_tag_details'] = []
        if self.risk_tag_details is not None:
            for k in self.risk_tag_details:
                result['risk_tag_details'].append(k.to_map() if k else None)
        if self.risk_tag_ids is not None:
            result['risk_tag_ids'] = self.risk_tag_ids
        if self.uc_code is not None:
            result['uc_code'] = self.uc_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('categories') is not None:
            self.categories = m.get('categories')
        if m.get('operating_place') is not None:
            self.operating_place = m.get('operating_place')
        if m.get('operating_province') is not None:
            self.operating_province = m.get('operating_province')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_tags') is not None:
            self.risk_tags = m.get('risk_tags')
        self.risk_tag_details = []
        if m.get('risk_tag_details') is not None:
            for k in m.get('risk_tag_details'):
                temp_model = RtopRiskTag()
                self.risk_tag_details.append(temp_model.from_map(k))
        if m.get('risk_tag_ids') is not None:
            self.risk_tag_ids = m.get('risk_tag_ids')
        if m.get('uc_code') is not None:
            self.uc_code = m.get('uc_code')
        return self


class RtopDateDistribution(TeaModel):
    def __init__(
        self,
        count: int = None,
        date: str = None,
    ):
        # 统计值
        self.count = count
        # 年龄
        self.date = date

    def validate(self):
        self.validate_required(self.count, 'count')
        self.validate_required(self.date, 'date')
        if self.date is not None:
            self.validate_pattern(self.date, 'date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.count is not None:
            result['count'] = self.count
        if self.date is not None:
            result['date'] = self.date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('date') is not None:
            self.date = m.get('date')
        return self


class PersonalInfo(TeaModel):
    def __init__(
        self,
        custom_name: str = None,
        card_no: str = None,
        id_type: str = None,
        cert_sign_date: str = None,
        cert_validate: str = None,
        cert_adr: str = None,
        mobile: str = None,
        education: str = None,
        province: str = None,
        city: str = None,
        area: str = None,
        address: str = None,
        sex: str = None,
        nation: str = None,
    ):
        # 客户姓名
        self.custom_name = custom_name
        # 身份证号码(18位)
        self.card_no = card_no
        # 1-身份证
        self.id_type = id_type
        # 证件开始日期(格式：YYYY-MM-DD)
        # 
        self.cert_sign_date = cert_sign_date
        # 格式：YYYY-MM-DD，身份证有效期为长期的送: 9999-12-31
        self.cert_validate = cert_validate
        # 证件地址
        self.cert_adr = cert_adr
        # 手机号
        self.mobile = mobile
        # 学历
        self.education = education
        # 所在省份 汉字
        self.province = province
        # 所在城市 汉字
        self.city = city
        # 地区名称 汉字
        self.area = area
        # 详细地址
        self.address = address
        # 性别M-男
        # F-女
        self.sex = sex
        # 民族
        self.nation = nation

    def validate(self):
        self.validate_required(self.custom_name, 'custom_name')
        self.validate_required(self.card_no, 'card_no')
        self.validate_required(self.id_type, 'id_type')
        self.validate_required(self.cert_sign_date, 'cert_sign_date')
        self.validate_required(self.cert_validate, 'cert_validate')
        self.validate_required(self.cert_adr, 'cert_adr')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.education, 'education')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.custom_name is not None:
            result['custom_name'] = self.custom_name
        if self.card_no is not None:
            result['card_no'] = self.card_no
        if self.id_type is not None:
            result['id_type'] = self.id_type
        if self.cert_sign_date is not None:
            result['cert_sign_date'] = self.cert_sign_date
        if self.cert_validate is not None:
            result['cert_validate'] = self.cert_validate
        if self.cert_adr is not None:
            result['cert_adr'] = self.cert_adr
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.education is not None:
            result['education'] = self.education
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
        if self.area is not None:
            result['area'] = self.area
        if self.address is not None:
            result['address'] = self.address
        if self.sex is not None:
            result['sex'] = self.sex
        if self.nation is not None:
            result['nation'] = self.nation
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('custom_name') is not None:
            self.custom_name = m.get('custom_name')
        if m.get('card_no') is not None:
            self.card_no = m.get('card_no')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        if m.get('cert_sign_date') is not None:
            self.cert_sign_date = m.get('cert_sign_date')
        if m.get('cert_validate') is not None:
            self.cert_validate = m.get('cert_validate')
        if m.get('cert_adr') is not None:
            self.cert_adr = m.get('cert_adr')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('education') is not None:
            self.education = m.get('education')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('area') is not None:
            self.area = m.get('area')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('sex') is not None:
            self.sex = m.get('sex')
        if m.get('nation') is not None:
            self.nation = m.get('nation')
        return self


class RepayResult(TeaModel):
    def __init__(
        self,
        custom_no: str = None,
        period: str = None,
        need_amount: int = None,
        need_corpus: int = None,
        need_accrual: int = None,
        need_fee: int = None,
        already_amount: int = None,
        already_corpus: int = None,
        already_overcorpus: int = None,
        already_accrual: int = None,
        already_punish: int = None,
        already_fee: int = None,
        rate: int = None,
        penalty_value: int = None,
        rest_amount: int = None,
        rest_corpus: int = None,
        rest_accrual: int = None,
        rest_punish: int = None,
        remain_corpus: int = None,
        receipt_no: str = None,
        status: str = None,
        settle_date: str = None,
        trade_date: str = None,
    ):
        # 客户编码
        self.custom_no = custom_no
        # 当前期数
        self.period = period
        # 应还总额
        self.need_amount = need_amount
        # 应还本金
        self.need_corpus = need_corpus
        # 应还利息
        self.need_accrual = need_accrual
        # 应还手续费
        self.need_fee = need_fee
        # 已还总额
        self.already_amount = already_amount
        # 已还本金
        self.already_corpus = already_corpus
        # 已还逾期本金
        self.already_overcorpus = already_overcorpus
        # 已还利息
        self.already_accrual = already_accrual
        # 已还逾期息
        self.already_punish = already_punish
        # 已还手续费
        self.already_fee = already_fee
        # 利率
        self.rate = rate
        # 罚息率
        self.penalty_value = penalty_value
        # 当期剩余总额
        self.rest_amount = rest_amount
        # 当期剩余本金
        self.rest_corpus = rest_corpus
        # 当期剩余利息
        self.rest_accrual = rest_accrual
        # 当期剩余罚息
        self.rest_punish = rest_punish
        # 期末本金
        self.remain_corpus = remain_corpus
        # 借据编号
        self.receipt_no = receipt_no
        # 还款状态1：已还清 2 未还 3 部分还款
        self.status = status
        # 应还日期
        self.settle_date = settle_date
        # 还款日期
        self.trade_date = trade_date

    def validate(self):
        self.validate_required(self.custom_no, 'custom_no')
        self.validate_required(self.period, 'period')
        self.validate_required(self.need_amount, 'need_amount')
        self.validate_required(self.need_corpus, 'need_corpus')
        self.validate_required(self.need_accrual, 'need_accrual')
        self.validate_required(self.need_fee, 'need_fee')
        self.validate_required(self.already_amount, 'already_amount')
        self.validate_required(self.already_corpus, 'already_corpus')
        self.validate_required(self.already_overcorpus, 'already_overcorpus')
        self.validate_required(self.already_accrual, 'already_accrual')
        self.validate_required(self.already_punish, 'already_punish')
        self.validate_required(self.already_fee, 'already_fee')
        self.validate_required(self.rate, 'rate')
        self.validate_required(self.penalty_value, 'penalty_value')
        self.validate_required(self.rest_amount, 'rest_amount')
        self.validate_required(self.rest_corpus, 'rest_corpus')
        self.validate_required(self.rest_accrual, 'rest_accrual')
        self.validate_required(self.rest_punish, 'rest_punish')
        self.validate_required(self.remain_corpus, 'remain_corpus')
        self.validate_required(self.receipt_no, 'receipt_no')
        self.validate_required(self.status, 'status')
        self.validate_required(self.settle_date, 'settle_date')
        if self.settle_date is not None:
            self.validate_pattern(self.settle_date, 'settle_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.trade_date, 'trade_date')
        if self.trade_date is not None:
            self.validate_pattern(self.trade_date, 'trade_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.period is not None:
            result['period'] = self.period
        if self.need_amount is not None:
            result['need_amount'] = self.need_amount
        if self.need_corpus is not None:
            result['need_corpus'] = self.need_corpus
        if self.need_accrual is not None:
            result['need_accrual'] = self.need_accrual
        if self.need_fee is not None:
            result['need_fee'] = self.need_fee
        if self.already_amount is not None:
            result['already_amount'] = self.already_amount
        if self.already_corpus is not None:
            result['already_corpus'] = self.already_corpus
        if self.already_overcorpus is not None:
            result['already_overcorpus'] = self.already_overcorpus
        if self.already_accrual is not None:
            result['already_accrual'] = self.already_accrual
        if self.already_punish is not None:
            result['already_punish'] = self.already_punish
        if self.already_fee is not None:
            result['already_fee'] = self.already_fee
        if self.rate is not None:
            result['rate'] = self.rate
        if self.penalty_value is not None:
            result['penalty_value'] = self.penalty_value
        if self.rest_amount is not None:
            result['rest_amount'] = self.rest_amount
        if self.rest_corpus is not None:
            result['rest_corpus'] = self.rest_corpus
        if self.rest_accrual is not None:
            result['rest_accrual'] = self.rest_accrual
        if self.rest_punish is not None:
            result['rest_punish'] = self.rest_punish
        if self.remain_corpus is not None:
            result['remain_corpus'] = self.remain_corpus
        if self.receipt_no is not None:
            result['receipt_no'] = self.receipt_no
        if self.status is not None:
            result['status'] = self.status
        if self.settle_date is not None:
            result['settle_date'] = self.settle_date
        if self.trade_date is not None:
            result['trade_date'] = self.trade_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('need_amount') is not None:
            self.need_amount = m.get('need_amount')
        if m.get('need_corpus') is not None:
            self.need_corpus = m.get('need_corpus')
        if m.get('need_accrual') is not None:
            self.need_accrual = m.get('need_accrual')
        if m.get('need_fee') is not None:
            self.need_fee = m.get('need_fee')
        if m.get('already_amount') is not None:
            self.already_amount = m.get('already_amount')
        if m.get('already_corpus') is not None:
            self.already_corpus = m.get('already_corpus')
        if m.get('already_overcorpus') is not None:
            self.already_overcorpus = m.get('already_overcorpus')
        if m.get('already_accrual') is not None:
            self.already_accrual = m.get('already_accrual')
        if m.get('already_punish') is not None:
            self.already_punish = m.get('already_punish')
        if m.get('already_fee') is not None:
            self.already_fee = m.get('already_fee')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        if m.get('penalty_value') is not None:
            self.penalty_value = m.get('penalty_value')
        if m.get('rest_amount') is not None:
            self.rest_amount = m.get('rest_amount')
        if m.get('rest_corpus') is not None:
            self.rest_corpus = m.get('rest_corpus')
        if m.get('rest_accrual') is not None:
            self.rest_accrual = m.get('rest_accrual')
        if m.get('rest_punish') is not None:
            self.rest_punish = m.get('rest_punish')
        if m.get('remain_corpus') is not None:
            self.remain_corpus = m.get('remain_corpus')
        if m.get('receipt_no') is not None:
            self.receipt_no = m.get('receipt_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('settle_date') is not None:
            self.settle_date = m.get('settle_date')
        if m.get('trade_date') is not None:
            self.trade_date = m.get('trade_date')
        return self


class DfSceneInfos(TeaModel):
    def __init__(
        self,
        scene_code: str = None,
        scene_decision: str = None,
        decision_flow: DecisionFlow = None,
    ):
        # scene_code
        self.scene_code = scene_code
        # 拒绝
        self.scene_decision = scene_decision
        # decision_flow
        self.decision_flow = decision_flow

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.scene_decision, 'scene_decision')
        self.validate_required(self.decision_flow, 'decision_flow')
        if self.decision_flow:
            self.decision_flow.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.scene_decision is not None:
            result['scene_decision'] = self.scene_decision
        if self.decision_flow is not None:
            result['decision_flow'] = self.decision_flow.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('scene_decision') is not None:
            self.scene_decision = m.get('scene_decision')
        if m.get('decision_flow') is not None:
            temp_model = DecisionFlow()
            self.decision_flow = temp_model.from_map(m['decision_flow'])
        return self


class RiskInfo(TeaModel):
    def __init__(
        self,
        risk_group_desc: str = None,
        risk_group: str = None,
        risk_group_category: str = None,
        risk_details: List[RiskDetail] = None,
    ):
        # 反欺诈风险数据服务风险组描述
        self.risk_group_desc = risk_group_desc
        # 反欺诈风险数据服务风险组名
        self.risk_group = risk_group
        # 反欺诈风险数据服务风险组类别
        self.risk_group_category = risk_group_category
        # 反欺诈风险数据服务风险组信息
        self.risk_details = risk_details

    def validate(self):
        self.validate_required(self.risk_group_desc, 'risk_group_desc')
        self.validate_required(self.risk_group, 'risk_group')
        self.validate_required(self.risk_group_category, 'risk_group_category')
        self.validate_required(self.risk_details, 'risk_details')
        if self.risk_details:
            for k in self.risk_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_group_desc is not None:
            result['risk_group_desc'] = self.risk_group_desc
        if self.risk_group is not None:
            result['risk_group'] = self.risk_group
        if self.risk_group_category is not None:
            result['risk_group_category'] = self.risk_group_category
        result['risk_details'] = []
        if self.risk_details is not None:
            for k in self.risk_details:
                result['risk_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_group_desc') is not None:
            self.risk_group_desc = m.get('risk_group_desc')
        if m.get('risk_group') is not None:
            self.risk_group = m.get('risk_group')
        if m.get('risk_group_category') is not None:
            self.risk_group_category = m.get('risk_group_category')
        self.risk_details = []
        if m.get('risk_details') is not None:
            for k in m.get('risk_details'):
                temp_model = RiskDetail()
                self.risk_details.append(temp_model.from_map(k))
        return self


class UpdateCustomerRelationResponseData(TeaModel):
    def __init__(
        self,
        id: int = None,
        channel_code: str = None,
        channel_no: str = None,
        customer_no: str = None,
        create_time: str = None,
        update_time: str = None,
    ):
        # id
        self.id = id
        # 渠道编码
        self.channel_code = channel_code
        # 渠道id
        self.channel_no = channel_no
        # 客户号
        self.customer_no = customer_no
        # 创建时间
        self.create_time = create_time
        # 更新时间
        self.update_time = update_time

    def validate(self):
        if self.create_time is not None:
            self.validate_pattern(self.create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.update_time is not None:
            self.validate_pattern(self.update_time, 'update_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.channel_no is not None:
            result['channel_no'] = self.channel_no
        if self.customer_no is not None:
            result['customer_no'] = self.customer_no
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('channel_no') is not None:
            self.channel_no = m.get('channel_no')
        if m.get('customer_no') is not None:
            self.customer_no = m.get('customer_no')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class RtopCompanyRiskFactor(TeaModel):
    def __init__(
        self,
        name: str = None,
        score: int = None,
    ):
        # 维度名称
        self.name = name
        # 维度分数
        self.score = score

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class Material(TeaModel):
    def __init__(
        self,
        m_type: str = None,
        big_code: str = None,
        small_code: str = None,
        meterial_name: str = None,
        file_path: str = None,
    ):
        # 资料类型0-风控报告1-合同2-图片3-附件
        self.m_type = m_type
        # 大类编码00-风控报告10-合同20身份证图片26人脸图片30-附件
        self.big_code = big_code
        # 小类编码
        # 201-身份证人脸面202身份证国徽面212-活体人脸图片
        self.small_code = small_code
        # 资料名称
        self.meterial_name = meterial_name
        # 文件地址
        self.file_path = file_path

    def validate(self):
        self.validate_required(self.m_type, 'm_type')
        self.validate_required(self.big_code, 'big_code')
        self.validate_required(self.small_code, 'small_code')
        self.validate_required(self.meterial_name, 'meterial_name')
        self.validate_required(self.file_path, 'file_path')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.m_type is not None:
            result['m_type'] = self.m_type
        if self.big_code is not None:
            result['big_code'] = self.big_code
        if self.small_code is not None:
            result['small_code'] = self.small_code
        if self.meterial_name is not None:
            result['meterial_name'] = self.meterial_name
        if self.file_path is not None:
            result['file_path'] = self.file_path
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('m_type') is not None:
            self.m_type = m.get('m_type')
        if m.get('big_code') is not None:
            self.big_code = m.get('big_code')
        if m.get('small_code') is not None:
            self.small_code = m.get('small_code')
        if m.get('meterial_name') is not None:
            self.meterial_name = m.get('meterial_name')
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        return self


class CustomReceiptStatus(TeaModel):
    def __init__(
        self,
        receipt_flag: bool = None,
    ):
        # 是否结清
        self.receipt_flag = receipt_flag

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.receipt_flag is not None:
            result['receipt_flag'] = self.receipt_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('receipt_flag') is not None:
            self.receipt_flag = m.get('receipt_flag')
        return self


class RiskData(TeaModel):
    def __init__(
        self,
        contacts: List[Contact] = None,
        face_point: str = None,
        face_source: str = None,
    ):
        # 联系人信息列表
        self.contacts = contacts
        # 人脸对比分
        self.face_point = face_point
        # 活体供应商
        self.face_source = face_source

    def validate(self):
        self.validate_required(self.contacts, 'contacts')
        if self.contacts:
            for k in self.contacts:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['contacts'] = []
        if self.contacts is not None:
            for k in self.contacts:
                result['contacts'].append(k.to_map() if k else None)
        if self.face_point is not None:
            result['face_point'] = self.face_point
        if self.face_source is not None:
            result['face_source'] = self.face_source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.contacts = []
        if m.get('contacts') is not None:
            for k in m.get('contacts'):
                temp_model = Contact()
                self.contacts.append(temp_model.from_map(k))
        if m.get('face_point') is not None:
            self.face_point = m.get('face_point')
        if m.get('face_source') is not None:
            self.face_source = m.get('face_source')
        return self


class SecurityDataQueryStruct(TeaModel):
    def __init__(
        self,
        params: str = None,
        type: str = None,
        version: str = None,
    ):
        # 请求数据参数
        self.params = params
        # 请求数据类型
        self.type = type
        # 请求数据版本
        self.version = version

    def validate(self):
        self.validate_required(self.params, 'params')
        self.validate_required(self.type, 'type')
        self.validate_required(self.version, 'version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.params is not None:
            result['params'] = self.params
        if self.type is not None:
            result['type'] = self.type
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class RiskLabelInfo(TeaModel):
    def __init__(
        self,
        clue_detail_type: str = None,
        dt: str = None,
        gmt_create: str = None,
        id: int = None,
        is_deleted: int = None,
        mct_one_id: str = None,
        operator_id: str = None,
        op_type: str = None,
        org_name: str = None,
        risk_detail_type: str = None,
        risk_dimension_type: str = None,
        tag_clue: str = None,
        tag_clue_detail: str = None,
        tag_id: str = None,
        tag_list_headers: str = None,
        tag_list_order_column: str = None,
        tag_list_order_type: str = None,
        tag_text: str = None,
        tag_trend_chart_name: str = None,
        update_date: str = None,
    ):
        # 线索明细类型(字段停用)
        self.clue_detail_type = clue_detail_type
        # odps数据产出时间，冗余字段，业务上不需要，以备错误排查
        self.dt = dt
        # 数据产生时间
        self.gmt_create = gmt_create
        # 记录唯一ID
        self.id = id
        # 0-正常 1-删除
        self.is_deleted = is_deleted
        # 企业ID
        self.mct_one_id = mct_one_id
        # 操作人ID
        self.operator_id = operator_id
        # 操作类型
        # add、delete、update
        self.op_type = op_type
        # 企业名称
        self.org_name = org_name
        # 线索类型
        self.risk_detail_type = risk_detail_type
        # 风险维度
        # 
        self.risk_dimension_type = risk_dimension_type
        # 线索概览
        self.tag_clue = tag_clue
        # 线索明细
        self.tag_clue_detail = tag_clue_detail
        # 标签ID
        self.tag_id = tag_id
        # 线索列表表头，英文逗号分隔
        # 
        self.tag_list_headers = tag_list_headers
        # 标签列表，排序字段
        self.tag_list_order_column = tag_list_order_column
        # 标签列表排序方式
        self.tag_list_order_type = tag_list_order_type
        # 标签文本
        self.tag_text = tag_text
        # 趋势图表名
        self.tag_trend_chart_name = tag_trend_chart_name
        # 数据同步到公有云时间(业务上赋值当天)
        self.update_date = update_date

    def validate(self):
        self.validate_required(self.clue_detail_type, 'clue_detail_type')
        self.validate_required(self.gmt_create, 'gmt_create')
        self.validate_required(self.id, 'id')
        self.validate_required(self.is_deleted, 'is_deleted')
        self.validate_required(self.mct_one_id, 'mct_one_id')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.op_type, 'op_type')
        self.validate_required(self.org_name, 'org_name')
        self.validate_required(self.risk_detail_type, 'risk_detail_type')
        self.validate_required(self.risk_dimension_type, 'risk_dimension_type')
        self.validate_required(self.tag_clue, 'tag_clue')
        self.validate_required(self.tag_clue_detail, 'tag_clue_detail')
        self.validate_required(self.tag_id, 'tag_id')
        self.validate_required(self.tag_list_headers, 'tag_list_headers')
        self.validate_required(self.tag_list_order_column, 'tag_list_order_column')
        self.validate_required(self.tag_list_order_type, 'tag_list_order_type')
        self.validate_required(self.tag_text, 'tag_text')
        self.validate_required(self.tag_trend_chart_name, 'tag_trend_chart_name')
        self.validate_required(self.update_date, 'update_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.clue_detail_type is not None:
            result['clue_detail_type'] = self.clue_detail_type
        if self.dt is not None:
            result['dt'] = self.dt
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.id is not None:
            result['id'] = self.id
        if self.is_deleted is not None:
            result['is_deleted'] = self.is_deleted
        if self.mct_one_id is not None:
            result['mct_one_id'] = self.mct_one_id
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.op_type is not None:
            result['op_type'] = self.op_type
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.risk_detail_type is not None:
            result['risk_detail_type'] = self.risk_detail_type
        if self.risk_dimension_type is not None:
            result['risk_dimension_type'] = self.risk_dimension_type
        if self.tag_clue is not None:
            result['tag_clue'] = self.tag_clue
        if self.tag_clue_detail is not None:
            result['tag_clue_detail'] = self.tag_clue_detail
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        if self.tag_list_headers is not None:
            result['tag_list_headers'] = self.tag_list_headers
        if self.tag_list_order_column is not None:
            result['tag_list_order_column'] = self.tag_list_order_column
        if self.tag_list_order_type is not None:
            result['tag_list_order_type'] = self.tag_list_order_type
        if self.tag_text is not None:
            result['tag_text'] = self.tag_text
        if self.tag_trend_chart_name is not None:
            result['tag_trend_chart_name'] = self.tag_trend_chart_name
        if self.update_date is not None:
            result['update_date'] = self.update_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('clue_detail_type') is not None:
            self.clue_detail_type = m.get('clue_detail_type')
        if m.get('dt') is not None:
            self.dt = m.get('dt')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('is_deleted') is not None:
            self.is_deleted = m.get('is_deleted')
        if m.get('mct_one_id') is not None:
            self.mct_one_id = m.get('mct_one_id')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('op_type') is not None:
            self.op_type = m.get('op_type')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('risk_detail_type') is not None:
            self.risk_detail_type = m.get('risk_detail_type')
        if m.get('risk_dimension_type') is not None:
            self.risk_dimension_type = m.get('risk_dimension_type')
        if m.get('tag_clue') is not None:
            self.tag_clue = m.get('tag_clue')
        if m.get('tag_clue_detail') is not None:
            self.tag_clue_detail = m.get('tag_clue_detail')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        if m.get('tag_list_headers') is not None:
            self.tag_list_headers = m.get('tag_list_headers')
        if m.get('tag_list_order_column') is not None:
            self.tag_list_order_column = m.get('tag_list_order_column')
        if m.get('tag_list_order_type') is not None:
            self.tag_list_order_type = m.get('tag_list_order_type')
        if m.get('tag_text') is not None:
            self.tag_text = m.get('tag_text')
        if m.get('tag_trend_chart_name') is not None:
            self.tag_trend_chart_name = m.get('tag_trend_chart_name')
        if m.get('update_date') is not None:
            self.update_date = m.get('update_date')
        return self


class RtopCompanyFeedback(TeaModel):
    def __init__(
        self,
        id: int = None,
        company_id: str = None,
        feedback_reason: str = None,
        feedback_reason_detail: str = None,
        comment: str = None,
    ):
        # 主键
        self.id = id
        # 企业ID
        self.company_id = company_id
        # 反馈原因
        self.feedback_reason = feedback_reason
        # 反馈原因详情
        self.feedback_reason_detail = feedback_reason_detail
        # 评论
        self.comment = comment

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.feedback_reason, 'feedback_reason')
        self.validate_required(self.feedback_reason_detail, 'feedback_reason_detail')
        self.validate_required(self.comment, 'comment')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.feedback_reason is not None:
            result['feedback_reason'] = self.feedback_reason
        if self.feedback_reason_detail is not None:
            result['feedback_reason_detail'] = self.feedback_reason_detail
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('feedback_reason') is not None:
            self.feedback_reason = m.get('feedback_reason')
        if m.get('feedback_reason_detail') is not None:
            self.feedback_reason_detail = m.get('feedback_reason_detail')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class RuntimeResult(TeaModel):
    def __init__(
        self,
        code: int = None,
        success: bool = None,
        resultmsg: str = None,
        data: str = None,
    ):
        # 上传成功
        self.code = code
        # true代表上传成功，false代表上传失败
        self.success = success
        # 上文件传成功
        self.resultmsg = resultmsg
        # 文件上传结果
        self.data = data

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.success, 'success')
        self.validate_required(self.resultmsg, 'resultmsg')
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.success is not None:
            result['success'] = self.success
        if self.resultmsg is not None:
            result['resultmsg'] = self.resultmsg
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('resultmsg') is not None:
            self.resultmsg = m.get('resultmsg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class RtopMonitorCompanyFeature(TeaModel):
    def __init__(
        self,
        description: str = None,
        name: str = None,
        risk_tags: List[str] = None,
        score: int = None,
    ):
        # 特征的描述
        self.description = description
        # 特征的名称
        self.name = name
        # 特征里的风险标签列表
        self.risk_tags = risk_tags
        # 特征的评分
        self.score = score

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.score, 'score')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.description is not None:
            result['description'] = self.description
        if self.name is not None:
            result['name'] = self.name
        if self.risk_tags is not None:
            result['risk_tags'] = self.risk_tags
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('risk_tags') is not None:
            self.risk_tags = m.get('risk_tags')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class RtopCompanyRiskInfo(TeaModel):
    def __init__(
        self,
        place_type: str = None,
        place_name: str = None,
        mct_one_id: str = None,
        uc_code: str = None,
        reg_no: str = None,
        org_code: str = None,
        org_name: str = None,
        risk_score: str = None,
        risk_shift_rank: str = None,
        risk_type: str = None,
        risk_tags_id: List[str] = None,
        tags_clue: str = None,
        tags_clue_detail: str = None,
    ):
        # 区域类型
        self.place_type = place_type
        # 区域
        self.place_name = place_name
        # 企业唯一id
        self.mct_one_id = mct_one_id
        # 企业统一社会信用代码
        self.uc_code = uc_code
        # 工商注册号
        self.reg_no = reg_no
        # 组织机构代码
        self.org_code = org_code
        # 企业名
        self.org_name = org_name
        # 风险评分
        self.risk_score = risk_score
        # 风险变化程度排序，根据分值波动大小，标签变更次数排序
        self.risk_shift_rank = risk_shift_rank
        # 风险定性
        self.risk_type = risk_type
        # 风险标签id列表
        self.risk_tags_id = risk_tags_id
        # 线索
        self.tags_clue = tags_clue
        # 风险线索明细
        self.tags_clue_detail = tags_clue_detail

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.mct_one_id is not None:
            result['mct_one_id'] = self.mct_one_id
        if self.uc_code is not None:
            result['uc_code'] = self.uc_code
        if self.reg_no is not None:
            result['reg_no'] = self.reg_no
        if self.org_code is not None:
            result['org_code'] = self.org_code
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_shift_rank is not None:
            result['risk_shift_rank'] = self.risk_shift_rank
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.risk_tags_id is not None:
            result['risk_tags_id'] = self.risk_tags_id
        if self.tags_clue is not None:
            result['tags_clue'] = self.tags_clue
        if self.tags_clue_detail is not None:
            result['tags_clue_detail'] = self.tags_clue_detail
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('mct_one_id') is not None:
            self.mct_one_id = m.get('mct_one_id')
        if m.get('uc_code') is not None:
            self.uc_code = m.get('uc_code')
        if m.get('reg_no') is not None:
            self.reg_no = m.get('reg_no')
        if m.get('org_code') is not None:
            self.org_code = m.get('org_code')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_shift_rank') is not None:
            self.risk_shift_rank = m.get('risk_shift_rank')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('risk_tags_id') is not None:
            self.risk_tags_id = m.get('risk_tags_id')
        if m.get('tags_clue') is not None:
            self.tags_clue = m.get('tags_clue')
        if m.get('tags_clue_detail') is not None:
            self.tags_clue_detail = m.get('tags_clue_detail')
        return self


class OverdueInfoResponse(TeaModel):
    def __init__(
        self,
        over_due_flag: bool = None,
        over_days: int = None,
        valuable_over_days: int = None,
        over_period_count: int = None,
        over_principal: int = None,
        over_interest: int = None,
        over_punish: int = None,
        need_overdue_amount: int = None,
        current_need_amount: int = None,
        total_amount: int = None,
        settle_date: str = None,
        receipt_no: str = None,
        already_repay_period_count: int = None,
        loan_period_count: int = None,
        outstanding_principal: int = None,
        loan_time: str = None,
        settle_flag: bool = None,
        nearest_repay_time: str = None,
    ):
        # 逾期标识
        # true：逾期
        # false：未逾期
        self.over_due_flag = over_due_flag
        # 逾期天数
        self.over_days = over_days
        # 逾期金额在50元以上的客户的逾期天数
        self.valuable_over_days = valuable_over_days
        # 逾期期数
        self.over_period_count = over_period_count
        # 逾期本金
        self.over_principal = over_principal
        # 逾期利息
        self.over_interest = over_interest
        # 应还罚息
        self.over_punish = over_punish
        # 应还逾期总额
        self.need_overdue_amount = need_overdue_amount
        # 当前应还总额
        self.current_need_amount = current_need_amount
        # 总剩余应还
        self.total_amount = total_amount
        # 数据日期
        self.settle_date = settle_date
        # 借款唯一编号
        self.receipt_no = receipt_no
        # 已还期数
        self.already_repay_period_count = already_repay_period_count
        # 贷款期数
        self.loan_period_count = loan_period_count
        # 未还本金
        self.outstanding_principal = outstanding_principal
        # 放款日期
        self.loan_time = loan_time
        # 结清标志
        self.settle_flag = settle_flag
        # 最近一次还款日期
        self.nearest_repay_time = nearest_repay_time

    def validate(self):
        self.validate_required(self.over_due_flag, 'over_due_flag')
        self.validate_required(self.over_days, 'over_days')
        self.validate_required(self.valuable_over_days, 'valuable_over_days')
        self.validate_required(self.over_period_count, 'over_period_count')
        self.validate_required(self.over_principal, 'over_principal')
        self.validate_required(self.over_interest, 'over_interest')
        self.validate_required(self.over_punish, 'over_punish')
        self.validate_required(self.need_overdue_amount, 'need_overdue_amount')
        self.validate_required(self.current_need_amount, 'current_need_amount')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.settle_date, 'settle_date')
        if self.settle_date is not None:
            self.validate_pattern(self.settle_date, 'settle_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.receipt_no, 'receipt_no')
        self.validate_required(self.already_repay_period_count, 'already_repay_period_count')
        self.validate_required(self.loan_period_count, 'loan_period_count')
        self.validate_required(self.outstanding_principal, 'outstanding_principal')
        self.validate_required(self.loan_time, 'loan_time')
        if self.loan_time is not None:
            self.validate_pattern(self.loan_time, 'loan_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.settle_flag, 'settle_flag')
        self.validate_required(self.nearest_repay_time, 'nearest_repay_time')
        if self.nearest_repay_time is not None:
            self.validate_pattern(self.nearest_repay_time, 'nearest_repay_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.over_due_flag is not None:
            result['over_due_flag'] = self.over_due_flag
        if self.over_days is not None:
            result['over_days'] = self.over_days
        if self.valuable_over_days is not None:
            result['valuable_over_days'] = self.valuable_over_days
        if self.over_period_count is not None:
            result['over_period_count'] = self.over_period_count
        if self.over_principal is not None:
            result['over_principal'] = self.over_principal
        if self.over_interest is not None:
            result['over_interest'] = self.over_interest
        if self.over_punish is not None:
            result['over_punish'] = self.over_punish
        if self.need_overdue_amount is not None:
            result['need_overdue_amount'] = self.need_overdue_amount
        if self.current_need_amount is not None:
            result['current_need_amount'] = self.current_need_amount
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.settle_date is not None:
            result['settle_date'] = self.settle_date
        if self.receipt_no is not None:
            result['receipt_no'] = self.receipt_no
        if self.already_repay_period_count is not None:
            result['already_repay_period_count'] = self.already_repay_period_count
        if self.loan_period_count is not None:
            result['loan_period_count'] = self.loan_period_count
        if self.outstanding_principal is not None:
            result['outstanding_principal'] = self.outstanding_principal
        if self.loan_time is not None:
            result['loan_time'] = self.loan_time
        if self.settle_flag is not None:
            result['settle_flag'] = self.settle_flag
        if self.nearest_repay_time is not None:
            result['nearest_repay_time'] = self.nearest_repay_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('over_due_flag') is not None:
            self.over_due_flag = m.get('over_due_flag')
        if m.get('over_days') is not None:
            self.over_days = m.get('over_days')
        if m.get('valuable_over_days') is not None:
            self.valuable_over_days = m.get('valuable_over_days')
        if m.get('over_period_count') is not None:
            self.over_period_count = m.get('over_period_count')
        if m.get('over_principal') is not None:
            self.over_principal = m.get('over_principal')
        if m.get('over_interest') is not None:
            self.over_interest = m.get('over_interest')
        if m.get('over_punish') is not None:
            self.over_punish = m.get('over_punish')
        if m.get('need_overdue_amount') is not None:
            self.need_overdue_amount = m.get('need_overdue_amount')
        if m.get('current_need_amount') is not None:
            self.current_need_amount = m.get('current_need_amount')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('settle_date') is not None:
            self.settle_date = m.get('settle_date')
        if m.get('receipt_no') is not None:
            self.receipt_no = m.get('receipt_no')
        if m.get('already_repay_period_count') is not None:
            self.already_repay_period_count = m.get('already_repay_period_count')
        if m.get('loan_period_count') is not None:
            self.loan_period_count = m.get('loan_period_count')
        if m.get('outstanding_principal') is not None:
            self.outstanding_principal = m.get('outstanding_principal')
        if m.get('loan_time') is not None:
            self.loan_time = m.get('loan_time')
        if m.get('settle_flag') is not None:
            self.settle_flag = m.get('settle_flag')
        if m.get('nearest_repay_time') is not None:
            self.nearest_repay_time = m.get('nearest_repay_time')
        return self


class RtopRiskStormCompanyAnnualReport(TeaModel):
    def __init__(
        self,
        annual_report_count: int = None,
        annual_report_has_equity_transfer: bool = None,
        annual_report_has_external_guarantee: bool = None,
        annual_report_has_external_invest: bool = None,
        annual_report_main_business_income: str = None,
        annual_report_net_profit: str = None,
        annual_report_release_date: str = None,
        annual_report_sh_actual_paid: str = None,
        annual_report_staff_count: int = None,
        annual_report_total_assets: str = None,
        annual_report_total_liabilities: str = None,
        annual_report_total_operating_income: str = None,
        annual_report_total_owner_equity: str = None,
        annual_report_total_profit: str = None,
        annual_report_total_tax: str = None,
        annual_report_year: str = None,
    ):
        # 年报个数
        self.annual_report_count = annual_report_count
        # 年报是否发生股权转让
        self.annual_report_has_equity_transfer = annual_report_has_equity_transfer
        # 年报是否对外提供担保
        self.annual_report_has_external_guarantee = annual_report_has_external_guarantee
        # 年报是否对外投资
        self.annual_report_has_external_invest = annual_report_has_external_invest
        # 营业总收入中主营业务收入
        self.annual_report_main_business_income = annual_report_main_business_income
        # 年报净利润
        self.annual_report_net_profit = annual_report_net_profit
        # 年报发布日期
        self.annual_report_release_date = annual_report_release_date
        # 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
        self.annual_report_sh_actual_paid = annual_report_sh_actual_paid
        # 年报公司人数
        self.annual_report_staff_count = annual_report_staff_count
        # 资产总额
        self.annual_report_total_assets = annual_report_total_assets
        # 负债总额
        self.annual_report_total_liabilities = annual_report_total_liabilities
        # 营业总收入
        self.annual_report_total_operating_income = annual_report_total_operating_income
        # 年报所有者权益合计
        self.annual_report_total_owner_equity = annual_report_total_owner_equity
        # 年报利润总额
        self.annual_report_total_profit = annual_report_total_profit
        # 纳税总额
        self.annual_report_total_tax = annual_report_total_tax
        # 年报报送年度
        self.annual_report_year = annual_report_year

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.annual_report_count is not None:
            result['annual_report_count'] = self.annual_report_count
        if self.annual_report_has_equity_transfer is not None:
            result['annual_report_has_equity_transfer'] = self.annual_report_has_equity_transfer
        if self.annual_report_has_external_guarantee is not None:
            result['annual_report_has_external_guarantee'] = self.annual_report_has_external_guarantee
        if self.annual_report_has_external_invest is not None:
            result['annual_report_has_external_invest'] = self.annual_report_has_external_invest
        if self.annual_report_main_business_income is not None:
            result['annual_report_main_business_income'] = self.annual_report_main_business_income
        if self.annual_report_net_profit is not None:
            result['annual_report_net_profit'] = self.annual_report_net_profit
        if self.annual_report_release_date is not None:
            result['annual_report_release_date'] = self.annual_report_release_date
        if self.annual_report_sh_actual_paid is not None:
            result['annual_report_sh_actual_paid'] = self.annual_report_sh_actual_paid
        if self.annual_report_staff_count is not None:
            result['annual_report_staff_count'] = self.annual_report_staff_count
        if self.annual_report_total_assets is not None:
            result['annual_report_total_assets'] = self.annual_report_total_assets
        if self.annual_report_total_liabilities is not None:
            result['annual_report_total_liabilities'] = self.annual_report_total_liabilities
        if self.annual_report_total_operating_income is not None:
            result['annual_report_total_operating_income'] = self.annual_report_total_operating_income
        if self.annual_report_total_owner_equity is not None:
            result['annual_report_total_owner_equity'] = self.annual_report_total_owner_equity
        if self.annual_report_total_profit is not None:
            result['annual_report_total_profit'] = self.annual_report_total_profit
        if self.annual_report_total_tax is not None:
            result['annual_report_total_tax'] = self.annual_report_total_tax
        if self.annual_report_year is not None:
            result['annual_report_year'] = self.annual_report_year
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('annual_report_count') is not None:
            self.annual_report_count = m.get('annual_report_count')
        if m.get('annual_report_has_equity_transfer') is not None:
            self.annual_report_has_equity_transfer = m.get('annual_report_has_equity_transfer')
        if m.get('annual_report_has_external_guarantee') is not None:
            self.annual_report_has_external_guarantee = m.get('annual_report_has_external_guarantee')
        if m.get('annual_report_has_external_invest') is not None:
            self.annual_report_has_external_invest = m.get('annual_report_has_external_invest')
        if m.get('annual_report_main_business_income') is not None:
            self.annual_report_main_business_income = m.get('annual_report_main_business_income')
        if m.get('annual_report_net_profit') is not None:
            self.annual_report_net_profit = m.get('annual_report_net_profit')
        if m.get('annual_report_release_date') is not None:
            self.annual_report_release_date = m.get('annual_report_release_date')
        if m.get('annual_report_sh_actual_paid') is not None:
            self.annual_report_sh_actual_paid = m.get('annual_report_sh_actual_paid')
        if m.get('annual_report_staff_count') is not None:
            self.annual_report_staff_count = m.get('annual_report_staff_count')
        if m.get('annual_report_total_assets') is not None:
            self.annual_report_total_assets = m.get('annual_report_total_assets')
        if m.get('annual_report_total_liabilities') is not None:
            self.annual_report_total_liabilities = m.get('annual_report_total_liabilities')
        if m.get('annual_report_total_operating_income') is not None:
            self.annual_report_total_operating_income = m.get('annual_report_total_operating_income')
        if m.get('annual_report_total_owner_equity') is not None:
            self.annual_report_total_owner_equity = m.get('annual_report_total_owner_equity')
        if m.get('annual_report_total_profit') is not None:
            self.annual_report_total_profit = m.get('annual_report_total_profit')
        if m.get('annual_report_total_tax') is not None:
            self.annual_report_total_tax = m.get('annual_report_total_tax')
        if m.get('annual_report_year') is not None:
            self.annual_report_year = m.get('annual_report_year')
        return self


class StrategyUploadResult(TeaModel):
    def __init__(
        self,
        rule_meta_id: int = None,
        scene_id: int = None,
        tenant_scene_id: int = None,
        decision_rule_id: int = None,
        scene_strategy_id: int = None,
    ):
        # 元数据id
        self.rule_meta_id = rule_meta_id
        # 场景id
        self.scene_id = scene_id
        # 租户场景id
        self.tenant_scene_id = tenant_scene_id
        # 圈客规则id
        self.decision_rule_id = decision_rule_id
        # 场景策略id
        self.scene_strategy_id = scene_strategy_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.rule_meta_id is not None:
            result['rule_meta_id'] = self.rule_meta_id
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
        if self.tenant_scene_id is not None:
            result['tenant_scene_id'] = self.tenant_scene_id
        if self.decision_rule_id is not None:
            result['decision_rule_id'] = self.decision_rule_id
        if self.scene_strategy_id is not None:
            result['scene_strategy_id'] = self.scene_strategy_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('rule_meta_id') is not None:
            self.rule_meta_id = m.get('rule_meta_id')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        if m.get('tenant_scene_id') is not None:
            self.tenant_scene_id = m.get('tenant_scene_id')
        if m.get('decision_rule_id') is not None:
            self.decision_rule_id = m.get('decision_rule_id')
        if m.get('scene_strategy_id') is not None:
            self.scene_strategy_id = m.get('scene_strategy_id')
        return self


class RtopRiskyCompany(TeaModel):
    def __init__(
        self,
        company_id: str = None,
        change_score: str = None,
        change_level: str = None,
        new_added_time: str = None,
        head_register_place: str = None,
        data_time: str = None,
    ):
        # 企业ID
        self.company_id = company_id
        # 异动分数
        self.change_score = change_score
        # 异动程度
        self.change_level = change_level
        # 新增企业的时间
        self.new_added_time = new_added_time
        # 总公司注册地
        self.head_register_place = head_register_place
        # 数据的时间
        self.data_time = data_time

    def validate(self):
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.change_score, 'change_score')
        self.validate_required(self.change_level, 'change_level')
        self.validate_required(self.new_added_time, 'new_added_time')
        if self.new_added_time is not None:
            self.validate_pattern(self.new_added_time, 'new_added_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.head_register_place, 'head_register_place')
        self.validate_required(self.data_time, 'data_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.change_score is not None:
            result['change_score'] = self.change_score
        if self.change_level is not None:
            result['change_level'] = self.change_level
        if self.new_added_time is not None:
            result['new_added_time'] = self.new_added_time
        if self.head_register_place is not None:
            result['head_register_place'] = self.head_register_place
        if self.data_time is not None:
            result['data_time'] = self.data_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('change_score') is not None:
            self.change_score = m.get('change_score')
        if m.get('change_level') is not None:
            self.change_level = m.get('change_level')
        if m.get('new_added_time') is not None:
            self.new_added_time = m.get('new_added_time')
        if m.get('head_register_place') is not None:
            self.head_register_place = m.get('head_register_place')
        if m.get('data_time') is not None:
            self.data_time = m.get('data_time')
        return self


class ZhimaQueryResp(TeaModel):
    def __init__(
        self,
        ep_cert_no: str = None,
        ep_name: str = None,
        failed_code: str = None,
        passed: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 认证的企业证件号
        self.ep_cert_no = ep_cert_no
        # 认证的企业名
        self.ep_name = ep_name
        # 认证不通过的错误码
        self.failed_code = failed_code
        # 认证是否通过，通过为true，不通过为false
        self.passed = passed
        # 10000是成功，其余是失败
        self.result_code = result_code
        # 
        self.result_msg = result_msg
        # 
        self.sub_code = sub_code
        # 
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.result_code, 'result_code')
        self.validate_required(self.result_msg, 'result_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ep_cert_no is not None:
            result['ep_cert_no'] = self.ep_cert_no
        if self.ep_name is not None:
            result['ep_name'] = self.ep_name
        if self.failed_code is not None:
            result['failed_code'] = self.failed_code
        if self.passed is not None:
            result['passed'] = self.passed
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ep_cert_no') is not None:
            self.ep_cert_no = m.get('ep_cert_no')
        if m.get('ep_name') is not None:
            self.ep_name = m.get('ep_name')
        if m.get('failed_code') is not None:
            self.failed_code = m.get('failed_code')
        if m.get('passed') is not None:
            self.passed = m.get('passed')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class DefinInnerChannelNotifyResult(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        biz_response: str = None,
    ):
        # 请求编号
        self.request_id = request_id
        # 业务响应Json
        self.biz_response = biz_response

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.biz_response, 'biz_response')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.biz_response is not None:
            result['biz_response'] = self.biz_response
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('biz_response') is not None:
            self.biz_response = m.get('biz_response')
        return self


class RtopCrowdRiskSummaryResp(TeaModel):
    def __init__(
        self,
        active_city: str = None,
        active_county: str = None,
        active_province: str = None,
        clue_tags: List[str] = None,
        company_id: str = None,
        company_name: str = None,
        crowd_risk_level: str = None,
        crowd_risk_score: int = None,
        crowd_risk_type: str = None,
        detected_time: str = None,
        money_involved: int = None,
        people_involved: int = None,
        registered_city: str = None,
        registered_county: str = None,
        registered_province: str = None,
    ):
        # 活跃市
        self.active_city = active_city
        # 活跃县
        self.active_county = active_county
        # 活跃省
        self.active_province = active_province
        # 风险标签
        self.clue_tags = clue_tags
        # 企业ID
        self.company_id = company_id
        # 企业名称
        self.company_name = company_name
        # 风险等级
        self.crowd_risk_level = crowd_risk_level
        # 涉众风险分数
        self.crowd_risk_score = crowd_risk_score
        # 涉众风险类型
        self.crowd_risk_type = crowd_risk_type
        # 发现时间
        self.detected_time = detected_time
        # 影响金额
        self.money_involved = money_involved
        # 影响人数
        self.people_involved = people_involved
        # 注册市
        self.registered_city = registered_city
        # 注册县
        self.registered_county = registered_county
        # 注册省
        self.registered_province = registered_province

    def validate(self):
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.company_name, 'company_name')
        if self.detected_time is not None:
            self.validate_pattern(self.detected_time, 'detected_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.active_city is not None:
            result['active_city'] = self.active_city
        if self.active_county is not None:
            result['active_county'] = self.active_county
        if self.active_province is not None:
            result['active_province'] = self.active_province
        if self.clue_tags is not None:
            result['clue_tags'] = self.clue_tags
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.crowd_risk_level is not None:
            result['crowd_risk_level'] = self.crowd_risk_level
        if self.crowd_risk_score is not None:
            result['crowd_risk_score'] = self.crowd_risk_score
        if self.crowd_risk_type is not None:
            result['crowd_risk_type'] = self.crowd_risk_type
        if self.detected_time is not None:
            result['detected_time'] = self.detected_time
        if self.money_involved is not None:
            result['money_involved'] = self.money_involved
        if self.people_involved is not None:
            result['people_involved'] = self.people_involved
        if self.registered_city is not None:
            result['registered_city'] = self.registered_city
        if self.registered_county is not None:
            result['registered_county'] = self.registered_county
        if self.registered_province is not None:
            result['registered_province'] = self.registered_province
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('active_city') is not None:
            self.active_city = m.get('active_city')
        if m.get('active_county') is not None:
            self.active_county = m.get('active_county')
        if m.get('active_province') is not None:
            self.active_province = m.get('active_province')
        if m.get('clue_tags') is not None:
            self.clue_tags = m.get('clue_tags')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('crowd_risk_level') is not None:
            self.crowd_risk_level = m.get('crowd_risk_level')
        if m.get('crowd_risk_score') is not None:
            self.crowd_risk_score = m.get('crowd_risk_score')
        if m.get('crowd_risk_type') is not None:
            self.crowd_risk_type = m.get('crowd_risk_type')
        if m.get('detected_time') is not None:
            self.detected_time = m.get('detected_time')
        if m.get('money_involved') is not None:
            self.money_involved = m.get('money_involved')
        if m.get('people_involved') is not None:
            self.people_involved = m.get('people_involved')
        if m.get('registered_city') is not None:
            self.registered_city = m.get('registered_city')
        if m.get('registered_county') is not None:
            self.registered_county = m.get('registered_county')
        if m.get('registered_province') is not None:
            self.registered_province = m.get('registered_province')
        return self


class StatisticResult(TeaModel):
    def __init__(
        self,
        valid_count: int = None,
        statistic_info_detail_list: List[StatisticInfoDetail] = None,
    ):
        # 有效任务总数量
        self.valid_count = valid_count
        # 各类actionDriverCode的统计结果集合
        self.statistic_info_detail_list = statistic_info_detail_list

    def validate(self):
        self.validate_required(self.valid_count, 'valid_count')
        self.validate_required(self.statistic_info_detail_list, 'statistic_info_detail_list')
        if self.statistic_info_detail_list:
            for k in self.statistic_info_detail_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.valid_count is not None:
            result['valid_count'] = self.valid_count
        result['statistic_info_detail_list'] = []
        if self.statistic_info_detail_list is not None:
            for k in self.statistic_info_detail_list:
                result['statistic_info_detail_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('valid_count') is not None:
            self.valid_count = m.get('valid_count')
        self.statistic_info_detail_list = []
        if m.get('statistic_info_detail_list') is not None:
            for k in m.get('statistic_info_detail_list'):
                temp_model = StatisticInfoDetail()
                self.statistic_info_detail_list.append(temp_model.from_map(k))
        return self


class RiskLabelConfigInfo(TeaModel):
    def __init__(
        self,
        id: int = None,
        tag_id: str = None,
        tag_text: str = None,
        risk_dimension_type: str = None,
        risk_detail_type: str = None,
        tag_trend_chart_name: str = None,
        tag_list_headers: str = None,
        tag_list_order_column: str = None,
        tag_list_order_type: str = None,
        is_delete: int = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        operator_id: str = None,
    ):
        # id
        self.id = id
        # 线索ID
        self.tag_id = tag_id
        # 标签文本
        self.tag_text = tag_text
        # 风险维度
        self.risk_dimension_type = risk_dimension_type
        # 线索类型
        self.risk_detail_type = risk_detail_type
        # 趋势图表名
        self.tag_trend_chart_name = tag_trend_chart_name
        # 线索列表表头，英文逗号分隔
        self.tag_list_headers = tag_list_headers
        # 标签列表，排序字段
        self.tag_list_order_column = tag_list_order_column
        # 标签列表排序方式
        self.tag_list_order_type = tag_list_order_type
        # 标记删除
        self.is_delete = is_delete
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 操作人ID
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.tag_id, 'tag_id')
        self.validate_required(self.tag_text, 'tag_text')
        self.validate_required(self.risk_dimension_type, 'risk_dimension_type')
        self.validate_required(self.risk_detail_type, 'risk_detail_type')
        self.validate_required(self.tag_trend_chart_name, 'tag_trend_chart_name')
        self.validate_required(self.tag_list_headers, 'tag_list_headers')
        self.validate_required(self.tag_list_order_column, 'tag_list_order_column')
        self.validate_required(self.tag_list_order_type, 'tag_list_order_type')
        self.validate_required(self.is_delete, 'is_delete')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.operator_id, 'operator_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        if self.tag_text is not None:
            result['tag_text'] = self.tag_text
        if self.risk_dimension_type is not None:
            result['risk_dimension_type'] = self.risk_dimension_type
        if self.risk_detail_type is not None:
            result['risk_detail_type'] = self.risk_detail_type
        if self.tag_trend_chart_name is not None:
            result['tag_trend_chart_name'] = self.tag_trend_chart_name
        if self.tag_list_headers is not None:
            result['tag_list_headers'] = self.tag_list_headers
        if self.tag_list_order_column is not None:
            result['tag_list_order_column'] = self.tag_list_order_column
        if self.tag_list_order_type is not None:
            result['tag_list_order_type'] = self.tag_list_order_type
        if self.is_delete is not None:
            result['is_delete'] = self.is_delete
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        if m.get('tag_text') is not None:
            self.tag_text = m.get('tag_text')
        if m.get('risk_dimension_type') is not None:
            self.risk_dimension_type = m.get('risk_dimension_type')
        if m.get('risk_detail_type') is not None:
            self.risk_detail_type = m.get('risk_detail_type')
        if m.get('tag_trend_chart_name') is not None:
            self.tag_trend_chart_name = m.get('tag_trend_chart_name')
        if m.get('tag_list_headers') is not None:
            self.tag_list_headers = m.get('tag_list_headers')
        if m.get('tag_list_order_column') is not None:
            self.tag_list_order_column = m.get('tag_list_order_column')
        if m.get('tag_list_order_type') is not None:
            self.tag_list_order_type = m.get('tag_list_order_type')
        if m.get('is_delete') is not None:
            self.is_delete = m.get('is_delete')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class StrategyDetails(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        decision: str = None,
        scene_code: str = None,
    ):
        # 策略id
        self.id = id
        # 策略名称
        self.name = name
        # 决策结果
        self.decision = decision
        # 场景码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.decision, 'decision')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.decision is not None:
            result['decision'] = self.decision
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class SecurityResultInfos(TeaModel):
    def __init__(
        self,
        decision: str = None,
        risk_score: int = None,
        scene_code: str = None,
    ):
        # 反欺诈风险数据服务风险建议决策
        self.decision = decision
        # 反欺诈风险数据服务风险分
        self.risk_score = risk_score
        # 反欺诈风险数据服务场景码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.decision, 'decision')
        self.validate_required(self.risk_score, 'risk_score')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.decision is not None:
            result['decision'] = self.decision
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class RtopAgeDistribution(TeaModel):
    def __init__(
        self,
        age: str = None,
        count: int = None,
    ):
        # 年龄
        self.age = age
        # 统计值
        self.count = count

    def validate(self):
        self.validate_required(self.age, 'age')
        self.validate_required(self.count, 'count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.age is not None:
            result['age'] = self.age
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('age') is not None:
            self.age = m.get('age')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class CompanyInfo(TeaModel):
    def __init__(
        self,
        active_addr_json: str = None,
        active_city: str = None,
        active_county: str = None,
        active_province: str = None,
        categories: str = None,
        check_date: str = None,
        del_flag: str = None,
        dt: str = None,
        former_org_names: str = None,
        head_office: str = None,
        id: int = None,
        involved_amount: int = None,
        involved_people: int = None,
        key_rela_orgs: str = None,
        legal_representative: str = None,
        mct_one_id: str = None,
        operating_addr_json: str = None,
        operating_city: str = None,
        operating_county: str = None,
        operating_place: str = None,
        operating_province: str = None,
        oprt_actv_state: str = None,
        oprt_end_date: str = None,
        oprt_scope: str = None,
        oprt_start_date: str = None,
        op_type: str = None,
        org_code: str = None,
        org_email: str = None,
        org_name: str = None,
        org_reg_cptl_rmb: str = None,
        org_state: str = None,
        org_tel: str = None,
        org_type: str = None,
        platform_name: str = None,
        platform_states: str = None,
        register_capital_currency: str = None,
        register_capital_value: str = None,
        register_city: str = None,
        register_county: str = None,
        register_date: str = None,
        register_place: str = None,
        register_province: str = None,
        registration_authority: str = None,
        reg_no: str = None,
        riskstorm_company_id: str = None,
        risk_factors: str = None,
        risk_graph_json: str = None,
        risk_message: str = None,
        risk_score: int = None,
        risk_score_trend: str = None,
        risk_score_weekly_float: int = None,
        risk_tags: str = None,
        risk_tags_id: str = None,
        risk_type: str = None,
        search_content: str = None,
        spread_number: int = None,
        spread_num_distribution: str = None,
        uc_code: str = None,
        update_date: str = None,
        platform: str = None,
    ):
        # 活跃地json
        self.active_addr_json = active_addr_json
        # 活跃市(字段停用)
        self.active_city = active_city
        # 活跃县(字段停用)
        self.active_county = active_county
        # 活跃省(字段停用)
        self.active_province = active_province
        # 类经融行业分类
        self.categories = categories
        # 核准日期
        self.check_date = check_date
        # 删除标志
        self.del_flag = del_flag
        # odps数据产生时间，业务上不关心
        self.dt = dt
        # 企业曾用名
        self.former_org_names = former_org_names
        # {"mct_one_id":"ID1","org_name":"总公司名称1"}
        self.head_office = head_office
        # 记录ID
        self.id = id
        # 影响金额
        self.involved_amount = involved_amount
        # 影响人数
        self.involved_people = involved_people
        # 重要关联企业,json格式
        self.key_rela_orgs = key_rela_orgs
        # 法人
        self.legal_representative = legal_representative
        # 企业ID
        self.mct_one_id = mct_one_id
        # 经营地json
        self.operating_addr_json = operating_addr_json
        # 经营市(字段停用)
        self.operating_city = operating_city
        # 经营县(字段停用)
        self.operating_county = operating_county
        # 经营地址(字段停用)
        self.operating_place = operating_place
        # 经营省(字段停用)
        self.operating_province = operating_province
        # 营运状态(1:营运0:不营运)
        self.oprt_actv_state = oprt_actv_state
        # 经营期限至
        self.oprt_end_date = oprt_end_date
        # 经营范围
        self.oprt_scope = oprt_scope
        # 经营期限自
        self.oprt_start_date = oprt_start_date
        # 操作类型
        # 
        self.op_type = op_type
        # 组织机构代码
        self.org_code = org_code
        # 电子邮箱
        self.org_email = org_email
        # 企业名
        self.org_name = org_name
        # 注册资本折人民币(万元)
        self.org_reg_cptl_rmb = org_reg_cptl_rmb
        # 企业状态
        self.org_state = org_state
        # 联系电话
        self.org_tel = org_tel
        # 企业类型
        self.org_type = org_type
        # 平台名
        self.platform_name = platform_name
        # 平台状态
        self.platform_states = platform_states
        # 注册资本币种
        self.register_capital_currency = register_capital_currency
        # 注册资本值
        self.register_capital_value = register_capital_value
        # 注册市
        self.register_city = register_city
        # 注册区县
        self.register_county = register_county
        # 注册时间
        self.register_date = register_date
        # 注册地址
        self.register_place = register_place
        # 注册省
        self.register_province = register_province
        # 登记机关
        self.registration_authority = registration_authority
        # 工商注册号
        self.reg_no = reg_no
        # 风报企业ID
        self.riskstorm_company_id = riskstorm_company_id
        # 风险维度
        self.risk_factors = risk_factors
        # 风险图谱可视化数据
        self.risk_graph_json = risk_graph_json
        # 风险报文
        self.risk_message = risk_message
        # 风险指数
        self.risk_score = risk_score
        # 风险指数，按日的趋势图
        self.risk_score_trend = risk_score_trend
        # 风险指数周波动
        self.risk_score_weekly_float = risk_score_weekly_float
        # 风险标签(字段停用)
        self.risk_tags = risk_tags
        # 风险标签ID
        self.risk_tags_id = risk_tags_id
        # 风险定性
        self.risk_type = risk_type
        # 搜索内容
        self.search_content = search_content
        # 传播人次
        self.spread_number = spread_number
        # 影响地区人次分布,json格式如下
        self.spread_num_distribution = spread_num_distribution
        # 社会统一信用代码
        self.uc_code = uc_code
        # 公有云数据库产生时间
        self.update_date = update_date
        # 平台json
        self.platform = platform

    def validate(self):
        self.validate_required(self.active_addr_json, 'active_addr_json')
        self.validate_required(self.active_city, 'active_city')
        self.validate_required(self.active_county, 'active_county')
        self.validate_required(self.active_province, 'active_province')
        self.validate_required(self.categories, 'categories')
        self.validate_required(self.check_date, 'check_date')
        self.validate_required(self.del_flag, 'del_flag')
        self.validate_required(self.dt, 'dt')
        self.validate_required(self.former_org_names, 'former_org_names')
        self.validate_required(self.head_office, 'head_office')
        self.validate_required(self.id, 'id')
        self.validate_required(self.involved_amount, 'involved_amount')
        self.validate_required(self.involved_people, 'involved_people')
        self.validate_required(self.key_rela_orgs, 'key_rela_orgs')
        self.validate_required(self.legal_representative, 'legal_representative')
        self.validate_required(self.mct_one_id, 'mct_one_id')
        self.validate_required(self.operating_addr_json, 'operating_addr_json')
        self.validate_required(self.operating_city, 'operating_city')
        self.validate_required(self.operating_county, 'operating_county')
        self.validate_required(self.operating_place, 'operating_place')
        self.validate_required(self.operating_province, 'operating_province')
        self.validate_required(self.oprt_actv_state, 'oprt_actv_state')
        self.validate_required(self.oprt_end_date, 'oprt_end_date')
        self.validate_required(self.oprt_scope, 'oprt_scope')
        self.validate_required(self.oprt_start_date, 'oprt_start_date')
        self.validate_required(self.op_type, 'op_type')
        self.validate_required(self.org_code, 'org_code')
        self.validate_required(self.org_email, 'org_email')
        self.validate_required(self.org_name, 'org_name')
        self.validate_required(self.org_reg_cptl_rmb, 'org_reg_cptl_rmb')
        self.validate_required(self.org_state, 'org_state')
        self.validate_required(self.org_tel, 'org_tel')
        self.validate_required(self.org_type, 'org_type')
        self.validate_required(self.platform_name, 'platform_name')
        self.validate_required(self.platform_states, 'platform_states')
        self.validate_required(self.register_capital_currency, 'register_capital_currency')
        self.validate_required(self.register_capital_value, 'register_capital_value')
        self.validate_required(self.register_city, 'register_city')
        self.validate_required(self.register_county, 'register_county')
        self.validate_required(self.register_date, 'register_date')
        self.validate_required(self.register_place, 'register_place')
        self.validate_required(self.register_province, 'register_province')
        self.validate_required(self.registration_authority, 'registration_authority')
        self.validate_required(self.reg_no, 'reg_no')
        self.validate_required(self.riskstorm_company_id, 'riskstorm_company_id')
        self.validate_required(self.risk_factors, 'risk_factors')
        self.validate_required(self.risk_graph_json, 'risk_graph_json')
        self.validate_required(self.risk_message, 'risk_message')
        self.validate_required(self.risk_score, 'risk_score')
        self.validate_required(self.risk_score_trend, 'risk_score_trend')
        self.validate_required(self.risk_score_weekly_float, 'risk_score_weekly_float')
        self.validate_required(self.risk_tags, 'risk_tags')
        self.validate_required(self.risk_tags_id, 'risk_tags_id')
        self.validate_required(self.risk_type, 'risk_type')
        self.validate_required(self.search_content, 'search_content')
        self.validate_required(self.spread_number, 'spread_number')
        self.validate_required(self.spread_num_distribution, 'spread_num_distribution')
        self.validate_required(self.uc_code, 'uc_code')
        self.validate_required(self.update_date, 'update_date')
        self.validate_required(self.platform, 'platform')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.active_addr_json is not None:
            result['active_addr_json'] = self.active_addr_json
        if self.active_city is not None:
            result['active_city'] = self.active_city
        if self.active_county is not None:
            result['active_county'] = self.active_county
        if self.active_province is not None:
            result['active_province'] = self.active_province
        if self.categories is not None:
            result['categories'] = self.categories
        if self.check_date is not None:
            result['check_date'] = self.check_date
        if self.del_flag is not None:
            result['del_flag'] = self.del_flag
        if self.dt is not None:
            result['dt'] = self.dt
        if self.former_org_names is not None:
            result['former_org_names'] = self.former_org_names
        if self.head_office is not None:
            result['head_office'] = self.head_office
        if self.id is not None:
            result['id'] = self.id
        if self.involved_amount is not None:
            result['involved_amount'] = self.involved_amount
        if self.involved_people is not None:
            result['involved_people'] = self.involved_people
        if self.key_rela_orgs is not None:
            result['key_rela_orgs'] = self.key_rela_orgs
        if self.legal_representative is not None:
            result['legal_representative'] = self.legal_representative
        if self.mct_one_id is not None:
            result['mct_one_id'] = self.mct_one_id
        if self.operating_addr_json is not None:
            result['operating_addr_json'] = self.operating_addr_json
        if self.operating_city is not None:
            result['operating_city'] = self.operating_city
        if self.operating_county is not None:
            result['operating_county'] = self.operating_county
        if self.operating_place is not None:
            result['operating_place'] = self.operating_place
        if self.operating_province is not None:
            result['operating_province'] = self.operating_province
        if self.oprt_actv_state is not None:
            result['oprt_actv_state'] = self.oprt_actv_state
        if self.oprt_end_date is not None:
            result['oprt_end_date'] = self.oprt_end_date
        if self.oprt_scope is not None:
            result['oprt_scope'] = self.oprt_scope
        if self.oprt_start_date is not None:
            result['oprt_start_date'] = self.oprt_start_date
        if self.op_type is not None:
            result['op_type'] = self.op_type
        if self.org_code is not None:
            result['org_code'] = self.org_code
        if self.org_email is not None:
            result['org_email'] = self.org_email
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.org_reg_cptl_rmb is not None:
            result['org_reg_cptl_rmb'] = self.org_reg_cptl_rmb
        if self.org_state is not None:
            result['org_state'] = self.org_state
        if self.org_tel is not None:
            result['org_tel'] = self.org_tel
        if self.org_type is not None:
            result['org_type'] = self.org_type
        if self.platform_name is not None:
            result['platform_name'] = self.platform_name
        if self.platform_states is not None:
            result['platform_states'] = self.platform_states
        if self.register_capital_currency is not None:
            result['register_capital_currency'] = self.register_capital_currency
        if self.register_capital_value is not None:
            result['register_capital_value'] = self.register_capital_value
        if self.register_city is not None:
            result['register_city'] = self.register_city
        if self.register_county is not None:
            result['register_county'] = self.register_county
        if self.register_date is not None:
            result['register_date'] = self.register_date
        if self.register_place is not None:
            result['register_place'] = self.register_place
        if self.register_province is not None:
            result['register_province'] = self.register_province
        if self.registration_authority is not None:
            result['registration_authority'] = self.registration_authority
        if self.reg_no is not None:
            result['reg_no'] = self.reg_no
        if self.riskstorm_company_id is not None:
            result['riskstorm_company_id'] = self.riskstorm_company_id
        if self.risk_factors is not None:
            result['risk_factors'] = self.risk_factors
        if self.risk_graph_json is not None:
            result['risk_graph_json'] = self.risk_graph_json
        if self.risk_message is not None:
            result['risk_message'] = self.risk_message
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_score_trend is not None:
            result['risk_score_trend'] = self.risk_score_trend
        if self.risk_score_weekly_float is not None:
            result['risk_score_weekly_float'] = self.risk_score_weekly_float
        if self.risk_tags is not None:
            result['risk_tags'] = self.risk_tags
        if self.risk_tags_id is not None:
            result['risk_tags_id'] = self.risk_tags_id
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.search_content is not None:
            result['search_content'] = self.search_content
        if self.spread_number is not None:
            result['spread_number'] = self.spread_number
        if self.spread_num_distribution is not None:
            result['spread_num_distribution'] = self.spread_num_distribution
        if self.uc_code is not None:
            result['uc_code'] = self.uc_code
        if self.update_date is not None:
            result['update_date'] = self.update_date
        if self.platform is not None:
            result['platform'] = self.platform
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('active_addr_json') is not None:
            self.active_addr_json = m.get('active_addr_json')
        if m.get('active_city') is not None:
            self.active_city = m.get('active_city')
        if m.get('active_county') is not None:
            self.active_county = m.get('active_county')
        if m.get('active_province') is not None:
            self.active_province = m.get('active_province')
        if m.get('categories') is not None:
            self.categories = m.get('categories')
        if m.get('check_date') is not None:
            self.check_date = m.get('check_date')
        if m.get('del_flag') is not None:
            self.del_flag = m.get('del_flag')
        if m.get('dt') is not None:
            self.dt = m.get('dt')
        if m.get('former_org_names') is not None:
            self.former_org_names = m.get('former_org_names')
        if m.get('head_office') is not None:
            self.head_office = m.get('head_office')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('involved_amount') is not None:
            self.involved_amount = m.get('involved_amount')
        if m.get('involved_people') is not None:
            self.involved_people = m.get('involved_people')
        if m.get('key_rela_orgs') is not None:
            self.key_rela_orgs = m.get('key_rela_orgs')
        if m.get('legal_representative') is not None:
            self.legal_representative = m.get('legal_representative')
        if m.get('mct_one_id') is not None:
            self.mct_one_id = m.get('mct_one_id')
        if m.get('operating_addr_json') is not None:
            self.operating_addr_json = m.get('operating_addr_json')
        if m.get('operating_city') is not None:
            self.operating_city = m.get('operating_city')
        if m.get('operating_county') is not None:
            self.operating_county = m.get('operating_county')
        if m.get('operating_place') is not None:
            self.operating_place = m.get('operating_place')
        if m.get('operating_province') is not None:
            self.operating_province = m.get('operating_province')
        if m.get('oprt_actv_state') is not None:
            self.oprt_actv_state = m.get('oprt_actv_state')
        if m.get('oprt_end_date') is not None:
            self.oprt_end_date = m.get('oprt_end_date')
        if m.get('oprt_scope') is not None:
            self.oprt_scope = m.get('oprt_scope')
        if m.get('oprt_start_date') is not None:
            self.oprt_start_date = m.get('oprt_start_date')
        if m.get('op_type') is not None:
            self.op_type = m.get('op_type')
        if m.get('org_code') is not None:
            self.org_code = m.get('org_code')
        if m.get('org_email') is not None:
            self.org_email = m.get('org_email')
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('org_reg_cptl_rmb') is not None:
            self.org_reg_cptl_rmb = m.get('org_reg_cptl_rmb')
        if m.get('org_state') is not None:
            self.org_state = m.get('org_state')
        if m.get('org_tel') is not None:
            self.org_tel = m.get('org_tel')
        if m.get('org_type') is not None:
            self.org_type = m.get('org_type')
        if m.get('platform_name') is not None:
            self.platform_name = m.get('platform_name')
        if m.get('platform_states') is not None:
            self.platform_states = m.get('platform_states')
        if m.get('register_capital_currency') is not None:
            self.register_capital_currency = m.get('register_capital_currency')
        if m.get('register_capital_value') is not None:
            self.register_capital_value = m.get('register_capital_value')
        if m.get('register_city') is not None:
            self.register_city = m.get('register_city')
        if m.get('register_county') is not None:
            self.register_county = m.get('register_county')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
        if m.get('register_place') is not None:
            self.register_place = m.get('register_place')
        if m.get('register_province') is not None:
            self.register_province = m.get('register_province')
        if m.get('registration_authority') is not None:
            self.registration_authority = m.get('registration_authority')
        if m.get('reg_no') is not None:
            self.reg_no = m.get('reg_no')
        if m.get('riskstorm_company_id') is not None:
            self.riskstorm_company_id = m.get('riskstorm_company_id')
        if m.get('risk_factors') is not None:
            self.risk_factors = m.get('risk_factors')
        if m.get('risk_graph_json') is not None:
            self.risk_graph_json = m.get('risk_graph_json')
        if m.get('risk_message') is not None:
            self.risk_message = m.get('risk_message')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_score_trend') is not None:
            self.risk_score_trend = m.get('risk_score_trend')
        if m.get('risk_score_weekly_float') is not None:
            self.risk_score_weekly_float = m.get('risk_score_weekly_float')
        if m.get('risk_tags') is not None:
            self.risk_tags = m.get('risk_tags')
        if m.get('risk_tags_id') is not None:
            self.risk_tags_id = m.get('risk_tags_id')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('search_content') is not None:
            self.search_content = m.get('search_content')
        if m.get('spread_number') is not None:
            self.spread_number = m.get('spread_number')
        if m.get('spread_num_distribution') is not None:
            self.spread_num_distribution = m.get('spread_num_distribution')
        if m.get('uc_code') is not None:
            self.uc_code = m.get('uc_code')
        if m.get('update_date') is not None:
            self.update_date = m.get('update_date')
        if m.get('platform') is not None:
            self.platform = m.get('platform')
        return self


class EventResultSyncDetail(TeaModel):
    def __init__(
        self,
        event_id: str = None,
        plan_id: str = None,
        msg_id: str = None,
        event_time: str = None,
        event_type: int = None,
        state: int = None,
        key_type: str = None,
        customer_key: str = None,
        ext_data: str = None,
    ):
        # 事件唯一id（单个租户全局唯一）
        self.event_id = event_id
        # 营销计划id
        self.plan_id = plan_id
        # 消息id
        self.msg_id = msg_id
        # 事件时间
        self.event_time = event_time
        # 事件类型：1为富信贴尾
        self.event_type = event_type
        # 1为成功 2为失败
        self.state = state
        # 用户key类型
        self.key_type = key_type
        # 手机号
        self.customer_key = customer_key
        # 扩展字段
        self.ext_data = ext_data

    def validate(self):
        self.validate_required(self.event_id, 'event_id')
        self.validate_required(self.plan_id, 'plan_id')
        self.validate_required(self.msg_id, 'msg_id')
        self.validate_required(self.event_time, 'event_time')
        self.validate_required(self.event_type, 'event_type')
        self.validate_required(self.state, 'state')
        self.validate_required(self.key_type, 'key_type')
        self.validate_required(self.customer_key, 'customer_key')
        self.validate_required(self.ext_data, 'ext_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.event_id is not None:
            result['event_id'] = self.event_id
        if self.plan_id is not None:
            result['plan_id'] = self.plan_id
        if self.msg_id is not None:
            result['msg_id'] = self.msg_id
        if self.event_time is not None:
            result['event_time'] = self.event_time
        if self.event_type is not None:
            result['event_type'] = self.event_type
        if self.state is not None:
            result['state'] = self.state
        if self.key_type is not None:
            result['key_type'] = self.key_type
        if self.customer_key is not None:
            result['customer_key'] = self.customer_key
        if self.ext_data is not None:
            result['ext_data'] = self.ext_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        if m.get('plan_id') is not None:
            self.plan_id = m.get('plan_id')
        if m.get('msg_id') is not None:
            self.msg_id = m.get('msg_id')
        if m.get('event_time') is not None:
            self.event_time = m.get('event_time')
        if m.get('event_type') is not None:
            self.event_type = m.get('event_type')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('key_type') is not None:
            self.key_type = m.get('key_type')
        if m.get('customer_key') is not None:
            self.customer_key = m.get('customer_key')
        if m.get('ext_data') is not None:
            self.ext_data = m.get('ext_data')
        return self


class RtopCompanyAlarm(TeaModel):
    def __init__(
        self,
        company_id: str = None,
        alarm_type: str = None,
        alarm_idx: str = None,
        alarm_date: str = None,
        alarm_flag: str = None,
    ):
        # 企业ID
        self.company_id = company_id
        # 预警类型
        self.alarm_type = alarm_type
        # 预警序号
        self.alarm_idx = alarm_idx
        # 预警日期
        self.alarm_date = alarm_date
        # 预警标识，是否需要预警
        self.alarm_flag = alarm_flag

    def validate(self):
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.alarm_type, 'alarm_type')
        self.validate_required(self.alarm_idx, 'alarm_idx')
        self.validate_required(self.alarm_date, 'alarm_date')
        self.validate_required(self.alarm_flag, 'alarm_flag')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.alarm_type is not None:
            result['alarm_type'] = self.alarm_type
        if self.alarm_idx is not None:
            result['alarm_idx'] = self.alarm_idx
        if self.alarm_date is not None:
            result['alarm_date'] = self.alarm_date
        if self.alarm_flag is not None:
            result['alarm_flag'] = self.alarm_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('alarm_type') is not None:
            self.alarm_type = m.get('alarm_type')
        if m.get('alarm_idx') is not None:
            self.alarm_idx = m.get('alarm_idx')
        if m.get('alarm_date') is not None:
            self.alarm_date = m.get('alarm_date')
        if m.get('alarm_flag') is not None:
            self.alarm_flag = m.get('alarm_flag')
        return self


class RpcommonResp(TeaModel):
    def __init__(
        self,
        success: bool = None,
        result_msg: str = None,
        response_code: str = None,
        data: str = None,
    ):
        # 调用是否成功
        self.success = success
        # 结果描述
        self.result_msg = result_msg
        # 结果码
        self.response_code = response_code
        # 具体返回值.jsonString形式
        self.data = data

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.result_msg, 'result_msg')
        self.validate_required(self.response_code, 'response_code')
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CompanyItems(TeaModel):
    def __init__(
        self,
        company_id: str = None,
        company_name: str = None,
        matching_name: str = None,
        matching_type: str = None,
        matching_value: str = None,
        uc_code: str = None,
    ):
        # 公司id
        self.company_id = company_id
        # 蚂蚁科技集团股份有限公司
        self.company_name = company_name
        # 匹配名称
        self.matching_name = matching_name
        # 匹配类型
        self.matching_type = matching_type
        # 匹配值
        self.matching_value = matching_value
        # 返回标识
        self.uc_code = uc_code

    def validate(self):
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.matching_name, 'matching_name')
        self.validate_required(self.matching_type, 'matching_type')
        self.validate_required(self.matching_value, 'matching_value')
        self.validate_required(self.uc_code, 'uc_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.matching_name is not None:
            result['matching_name'] = self.matching_name
        if self.matching_type is not None:
            result['matching_type'] = self.matching_type
        if self.matching_value is not None:
            result['matching_value'] = self.matching_value
        if self.uc_code is not None:
            result['uc_code'] = self.uc_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('matching_name') is not None:
            self.matching_name = m.get('matching_name')
        if m.get('matching_type') is not None:
            self.matching_type = m.get('matching_type')
        if m.get('matching_value') is not None:
            self.matching_value = m.get('matching_value')
        if m.get('uc_code') is not None:
            self.uc_code = m.get('uc_code')
        return self


class RtopTagImage(TeaModel):
    def __init__(
        self,
        id: int = None,
        image: str = None,
    ):
        # 标签图片表主键
        self.id = id
        # 图片
        self.image = image

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.image is not None:
            result['image'] = self.image
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('image') is not None:
            self.image = m.get('image')
        return self


class RtopGenderDistribution(TeaModel):
    def __init__(
        self,
        count: int = None,
        gender: str = None,
    ):
        # 统计值
        self.count = count
        # 性别
        self.gender = gender

    def validate(self):
        self.validate_required(self.count, 'count')
        self.validate_required(self.gender, 'gender')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.count is not None:
            result['count'] = self.count
        if self.gender is not None:
            result['gender'] = self.gender
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('gender') is not None:
            self.gender = m.get('gender')
        return self


class CustomRelationStatus(TeaModel):
    def __init__(
        self,
        reg_flag: bool = None,
    ):
        # 是否联登
        self.reg_flag = reg_flag

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.reg_flag is not None:
            result['reg_flag'] = self.reg_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('reg_flag') is not None:
            self.reg_flag = m.get('reg_flag')
        return self


class RtopRiskGeneNode(TeaModel):
    def __init__(
        self,
        main_company_id: str = None,
        main_company_name: str = None,
        node_id: str = None,
        node_name: str = None,
        node_cert_no: str = None,
        node_type: str = None,
        node_ext_json: str = None,
        risk_label: str = None,
        risk_mode: str = None,
    ):
        # 主企业唯一ID
        self.main_company_id = main_company_id
        # 主企业名称
        self.main_company_name = main_company_name
        # 节点唯一ID
        self.node_id = node_id
        # 节点名称
        self.node_name = node_name
        # 节点证件号码
        self.node_cert_no = node_cert_no
        # 节点类型，枚举值
        self.node_type = node_type
        # 节点扩展信息
        self.node_ext_json = node_ext_json
        # 基因模式
        self.risk_label = risk_label
        # 基因模式
        self.risk_mode = risk_mode

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.main_company_id is not None:
            result['main_company_id'] = self.main_company_id
        if self.main_company_name is not None:
            result['main_company_name'] = self.main_company_name
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.node_name is not None:
            result['node_name'] = self.node_name
        if self.node_cert_no is not None:
            result['node_cert_no'] = self.node_cert_no
        if self.node_type is not None:
            result['node_type'] = self.node_type
        if self.node_ext_json is not None:
            result['node_ext_json'] = self.node_ext_json
        if self.risk_label is not None:
            result['risk_label'] = self.risk_label
        if self.risk_mode is not None:
            result['risk_mode'] = self.risk_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('main_company_id') is not None:
            self.main_company_id = m.get('main_company_id')
        if m.get('main_company_name') is not None:
            self.main_company_name = m.get('main_company_name')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('node_name') is not None:
            self.node_name = m.get('node_name')
        if m.get('node_cert_no') is not None:
            self.node_cert_no = m.get('node_cert_no')
        if m.get('node_type') is not None:
            self.node_type = m.get('node_type')
        if m.get('node_ext_json') is not None:
            self.node_ext_json = m.get('node_ext_json')
        if m.get('risk_label') is not None:
            self.risk_label = m.get('risk_label')
        if m.get('risk_mode') is not None:
            self.risk_mode = m.get('risk_mode')
        return self


class RtopPopulationDistribution(TeaModel):
    def __init__(
        self,
        city: str = None,
        count: int = None,
    ):
        # 市
        self.city = city
        # 统计值
        self.count = count

    def validate(self):
        self.validate_required(self.city, 'city')
        self.validate_required(self.count, 'count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.city is not None:
            result['city'] = self.city
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class DubheFileInfo(TeaModel):
    def __init__(
        self,
        file_path: str = None,
    ):
        # 文件访问路径
        self.file_path = file_path

    def validate(self):
        self.validate_required(self.file_path, 'file_path')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_path is not None:
            result['file_path'] = self.file_path
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        return self


class ServiceContext(TeaModel):
    def __init__(
        self,
        client_ip: str = None,
        client_pcidguid: str = None,
        server_name: str = None,
        session_id: str = None,
        user_id: str = None,
    ):
        # 客户端IP
        self.client_ip = client_ip
        # 客户端UMID
        self.client_pcidguid = client_pcidguid
        # 服务器名
        self.server_name = server_name
        # 会话ID
        self.session_id = session_id
        # 用户ID
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.client_ip is not None:
            result['client_ip'] = self.client_ip
        if self.client_pcidguid is not None:
            result['client_pcidguid'] = self.client_pcidguid
        if self.server_name is not None:
            result['server_name'] = self.server_name
        if self.session_id is not None:
            result['session_id'] = self.session_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('client_ip') is not None:
            self.client_ip = m.get('client_ip')
        if m.get('client_pcidguid') is not None:
            self.client_pcidguid = m.get('client_pcidguid')
        if m.get('server_name') is not None:
            self.server_name = m.get('server_name')
        if m.get('session_id') is not None:
            self.session_id = m.get('session_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class CustomerUmktInfoModel(TeaModel):
    def __init__(
        self,
        base_info: BaseCustomerUmktInfoModel = None,
        umkt_out_put_info: str = None,
    ):
        # 基本圈客结果信息
        self.base_info = base_info
        # 额外的营销分结果
        self.umkt_out_put_info = umkt_out_put_info

    def validate(self):
        self.validate_required(self.base_info, 'base_info')
        if self.base_info:
            self.base_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.base_info is not None:
            result['base_info'] = self.base_info.to_map()
        if self.umkt_out_put_info is not None:
            result['umkt_out_put_info'] = self.umkt_out_put_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('base_info') is not None:
            temp_model = BaseCustomerUmktInfoModel()
            self.base_info = temp_model.from_map(m['base_info'])
        if m.get('umkt_out_put_info') is not None:
            self.umkt_out_put_info = m.get('umkt_out_put_info')
        return self


class ModelDetails(TeaModel):
    def __init__(
        self,
        scene_code: str = None,
        score: str = None,
    ):
        # 风险场景编码
        self.scene_code = scene_code
        # 该风险场景的风险分值
        # 
        self.score = score

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.score, 'score')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class RtopCompanyOpinionCount(TeaModel):
    def __init__(
        self,
        company_name: str = None,
        count: int = None,
    ):
        # 企业名称
        self.company_name = company_name
        # 企业对应的舆情数量
        self.count = count

    def validate(self):
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.count, 'count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class RtopRegionalDistribution(TeaModel):
    def __init__(
        self,
        count: int = None,
        place: str = None,
        type_distribution: List[RtopTypeDistribution] = None,
    ):
        # 统计值
        self.count = count
        # 地区
        self.place = place
        # 当前地区的涉众风险类型分布，即非法集资有多少企业，传销有多少企业
        self.type_distribution = type_distribution

    def validate(self):
        self.validate_required(self.count, 'count')
        self.validate_required(self.place, 'place')
        if self.type_distribution:
            for k in self.type_distribution:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.count is not None:
            result['count'] = self.count
        if self.place is not None:
            result['place'] = self.place
        result['type_distribution'] = []
        if self.type_distribution is not None:
            for k in self.type_distribution:
                result['type_distribution'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('place') is not None:
            self.place = m.get('place')
        self.type_distribution = []
        if m.get('type_distribution') is not None:
            for k in m.get('type_distribution'):
                temp_model = RtopTypeDistribution()
                self.type_distribution.append(temp_model.from_map(k))
        return self


class RiskLabelFilterConfigInfo(TeaModel):
    def __init__(
        self,
        gmt_create: str = None,
        gmt_modified: str = None,
        id: int = None,
        is_base: int = None,
        is_delete: int = None,
        operator_id: str = None,
        place_name: str = None,
        place_type: str = None,
        tag_id: str = None,
    ):
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # id
        self.id = id
        # 是否为基本筛选标签
        self.is_base = is_base
        # 标记删除
        self.is_delete = is_delete
        # 操作人员ID
        self.operator_id = operator_id
        # 地区名
        self.place_name = place_name
        # 地区类型
        self.place_type = place_type
        # 标签ID
        self.tag_id = tag_id

    def validate(self):
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.id, 'id')
        self.validate_required(self.is_base, 'is_base')
        self.validate_required(self.is_delete, 'is_delete')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.place_name, 'place_name')
        self.validate_required(self.place_type, 'place_type')
        self.validate_required(self.tag_id, 'tag_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.id is not None:
            result['id'] = self.id
        if self.is_base is not None:
            result['is_base'] = self.is_base
        if self.is_delete is not None:
            result['is_delete'] = self.is_delete
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('is_base') is not None:
            self.is_base = m.get('is_base')
        if m.get('is_delete') is not None:
            self.is_delete = m.get('is_delete')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        return self


class JobInfo(TeaModel):
    def __init__(
        self,
        job_type: str = None,
        work_position: str = None,
        job_life: str = None,
        current_job_life: int = None,
        company_name: str = None,
        company_industry_type: str = None,
        company_tel: str = None,
        company_province: str = None,
        company_city: str = None,
        company_area: str = None,
        company_street: str = None,
        company_address: str = None,
        year_salary: int = None,
    ):
        # 职业
        self.job_type = job_type
        # 职务
        self.work_position = work_position
        # 工作年限
        self.job_life = job_life
        # 本单位工作年限
        self.current_job_life = current_job_life
        # 公司名称
        self.company_name = company_name
        # 公司行业类型
        self.company_industry_type = company_industry_type
        # 公司电话
        self.company_tel = company_tel
        # 公司省份
        self.company_province = company_province
        # 公司城市
        self.company_city = company_city
        # 公司区域
        self.company_area = company_area
        # 公司街道
        self.company_street = company_street
        # 公司详细地址
        self.company_address = company_address
        # 年收入
        self.year_salary = year_salary

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.job_type is not None:
            result['job_type'] = self.job_type
        if self.work_position is not None:
            result['work_position'] = self.work_position
        if self.job_life is not None:
            result['job_life'] = self.job_life
        if self.current_job_life is not None:
            result['current_job_life'] = self.current_job_life
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.company_industry_type is not None:
            result['company_industry_type'] = self.company_industry_type
        if self.company_tel is not None:
            result['company_tel'] = self.company_tel
        if self.company_province is not None:
            result['company_province'] = self.company_province
        if self.company_city is not None:
            result['company_city'] = self.company_city
        if self.company_area is not None:
            result['company_area'] = self.company_area
        if self.company_street is not None:
            result['company_street'] = self.company_street
        if self.company_address is not None:
            result['company_address'] = self.company_address
        if self.year_salary is not None:
            result['year_salary'] = self.year_salary
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('job_type') is not None:
            self.job_type = m.get('job_type')
        if m.get('work_position') is not None:
            self.work_position = m.get('work_position')
        if m.get('job_life') is not None:
            self.job_life = m.get('job_life')
        if m.get('current_job_life') is not None:
            self.current_job_life = m.get('current_job_life')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('company_industry_type') is not None:
            self.company_industry_type = m.get('company_industry_type')
        if m.get('company_tel') is not None:
            self.company_tel = m.get('company_tel')
        if m.get('company_province') is not None:
            self.company_province = m.get('company_province')
        if m.get('company_city') is not None:
            self.company_city = m.get('company_city')
        if m.get('company_area') is not None:
            self.company_area = m.get('company_area')
        if m.get('company_street') is not None:
            self.company_street = m.get('company_street')
        if m.get('company_address') is not None:
            self.company_address = m.get('company_address')
        if m.get('year_salary') is not None:
            self.year_salary = m.get('year_salary')
        return self


class RtopCrowdRiskFeatureResp(TeaModel):
    def __init__(
        self,
        clue_tags: List[RtopCrowdRiskFeatureTag] = None,
        feature_name: str = None,
        score: int = None,
    ):
        # 特征标签列表
        self.clue_tags = clue_tags
        # 特征名称
        self.feature_name = feature_name
        # 特征​分数
        self.score = score

    def validate(self):
        if self.clue_tags:
            for k in self.clue_tags:
                if k:
                    k.validate()
        self.validate_required(self.feature_name, 'feature_name')
        self.validate_required(self.score, 'score')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['clue_tags'] = []
        if self.clue_tags is not None:
            for k in self.clue_tags:
                result['clue_tags'].append(k.to_map() if k else None)
        if self.feature_name is not None:
            result['feature_name'] = self.feature_name
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.clue_tags = []
        if m.get('clue_tags') is not None:
            for k in m.get('clue_tags'):
                temp_model = RtopCrowdRiskFeatureTag()
                self.clue_tags.append(temp_model.from_map(k))
        if m.get('feature_name') is not None:
            self.feature_name = m.get('feature_name')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class LiveInfo(TeaModel):
    def __init__(
        self,
        live_province: str = None,
        live_city: str = None,
        live_area: str = None,
        live_street: str = None,
        live_address: str = None,
        live_years: int = None,
    ):
        # 居住省份
        self.live_province = live_province
        # 居住城市
        self.live_city = live_city
        # 居住区域
        self.live_area = live_area
        # 居住街道
        self.live_street = live_street
        # 居住详细地址
        self.live_address = live_address
        # 居住年限
        self.live_years = live_years

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.live_province is not None:
            result['live_province'] = self.live_province
        if self.live_city is not None:
            result['live_city'] = self.live_city
        if self.live_area is not None:
            result['live_area'] = self.live_area
        if self.live_street is not None:
            result['live_street'] = self.live_street
        if self.live_address is not None:
            result['live_address'] = self.live_address
        if self.live_years is not None:
            result['live_years'] = self.live_years
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('live_province') is not None:
            self.live_province = m.get('live_province')
        if m.get('live_city') is not None:
            self.live_city = m.get('live_city')
        if m.get('live_area') is not None:
            self.live_area = m.get('live_area')
        if m.get('live_street') is not None:
            self.live_street = m.get('live_street')
        if m.get('live_address') is not None:
            self.live_address = m.get('live_address')
        if m.get('live_years') is not None:
            self.live_years = m.get('live_years')
        return self


class RiskStormLabelResp(TeaModel):
    def __init__(
        self,
        label_count: int = None,
        label_id: str = None,
        label_name: str = None,
    ):
        # 标签次数
        self.label_count = label_count
        # 标签id
        self.label_id = label_id
        # 标签名称
        self.label_name = label_name

    def validate(self):
        self.validate_required(self.label_count, 'label_count')
        self.validate_required(self.label_id, 'label_id')
        self.validate_required(self.label_name, 'label_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.label_count is not None:
            result['label_count'] = self.label_count
        if self.label_id is not None:
            result['label_id'] = self.label_id
        if self.label_name is not None:
            result['label_name'] = self.label_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('label_count') is not None:
            self.label_count = m.get('label_count')
        if m.get('label_id') is not None:
            self.label_id = m.get('label_id')
        if m.get('label_name') is not None:
            self.label_name = m.get('label_name')
        return self


class RepayInfo(TeaModel):
    def __init__(
        self,
        overdue_flag: bool = None,
        over_days: int = None,
        valuable_over_days: int = None,
        over_period_count: int = None,
        over_principal: int = None,
        over_interest: int = None,
        over_punish: int = None,
        need_overdue_amount: int = None,
        current_need_amount: int = None,
        total_amount: int = None,
    ):
        # true：逾期
        # false：未逾期
        self.overdue_flag = overdue_flag
        # 逾期天数
        self.over_days = over_days
        # 逾期金额在50元以上的客户的逾期天数
        self.valuable_over_days = valuable_over_days
        # 逾期期数
        self.over_period_count = over_period_count
        # 逾期本金
        self.over_principal = over_principal
        # 逾期利息
        self.over_interest = over_interest
        # 应还罚息
        self.over_punish = over_punish
        # 应还逾期总额
        self.need_overdue_amount = need_overdue_amount
        # 当前应还总额（包含逾期和当前期）
        self.current_need_amount = current_need_amount
        # 总剩余应还
        self.total_amount = total_amount

    def validate(self):
        self.validate_required(self.overdue_flag, 'overdue_flag')
        self.validate_required(self.over_days, 'over_days')
        self.validate_required(self.valuable_over_days, 'valuable_over_days')
        self.validate_required(self.over_period_count, 'over_period_count')
        self.validate_required(self.over_principal, 'over_principal')
        self.validate_required(self.over_interest, 'over_interest')
        self.validate_required(self.over_punish, 'over_punish')
        self.validate_required(self.need_overdue_amount, 'need_overdue_amount')
        self.validate_required(self.current_need_amount, 'current_need_amount')
        self.validate_required(self.total_amount, 'total_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.overdue_flag is not None:
            result['overdue_flag'] = self.overdue_flag
        if self.over_days is not None:
            result['over_days'] = self.over_days
        if self.valuable_over_days is not None:
            result['valuable_over_days'] = self.valuable_over_days
        if self.over_period_count is not None:
            result['over_period_count'] = self.over_period_count
        if self.over_principal is not None:
            result['over_principal'] = self.over_principal
        if self.over_interest is not None:
            result['over_interest'] = self.over_interest
        if self.over_punish is not None:
            result['over_punish'] = self.over_punish
        if self.need_overdue_amount is not None:
            result['need_overdue_amount'] = self.need_overdue_amount
        if self.current_need_amount is not None:
            result['current_need_amount'] = self.current_need_amount
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('overdue_flag') is not None:
            self.overdue_flag = m.get('overdue_flag')
        if m.get('over_days') is not None:
            self.over_days = m.get('over_days')
        if m.get('valuable_over_days') is not None:
            self.valuable_over_days = m.get('valuable_over_days')
        if m.get('over_period_count') is not None:
            self.over_period_count = m.get('over_period_count')
        if m.get('over_principal') is not None:
            self.over_principal = m.get('over_principal')
        if m.get('over_interest') is not None:
            self.over_interest = m.get('over_interest')
        if m.get('over_punish') is not None:
            self.over_punish = m.get('over_punish')
        if m.get('need_overdue_amount') is not None:
            self.need_overdue_amount = m.get('need_overdue_amount')
        if m.get('current_need_amount') is not None:
            self.current_need_amount = m.get('current_need_amount')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        return self


class ZhimaIdentifyResp(TeaModel):
    def __init__(
        self,
        biz_no: str = None,
        certify_url: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 唯一ID，接口正常的话有此字段
        self.biz_no = biz_no
        # 带参数的回调地址，接口正常的话有此字段
        self.certify_url = certify_url
        # 蚂蚁调用芝麻的错误码
        self.result_code = result_code
        # 蚂蚁调用芝麻的结果描述
        self.result_msg = result_msg
        # 蚂蚁调用芝麻的错误码
        self.sub_code = sub_code
        # 蚂蚁调用芝麻信息
        self.sub_msg = sub_msg

    def validate(self):
        self.validate_required(self.result_code, 'result_code')
        self.validate_required(self.result_msg, 'result_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.certify_url is not None:
            result['certify_url'] = self.certify_url
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('certify_url') is not None:
            self.certify_url = m.get('certify_url')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class CreditAmount(TeaModel):
    def __init__(
        self,
        credit_amount: int = None,
        rest_amount: int = None,
        pay_date: str = None,
        expire_date: str = None,
        rate_unit: str = None,
        rate_value: int = None,
        repay_way: str = None,
        status: str = None,
    ):
        # 授信额度
        self.credit_amount = credit_amount
        # 授信余额
        self.rest_amount = rest_amount
        # 发放日期
        self.pay_date = pay_date
        # 到期日期
        self.expire_date = expire_date
        # 利率单位(1:年，2：月，3：日)
        self.rate_unit = rate_unit
        # 执行利率,利率值，单位%\
        # 年化5%，rateValue=5
        # 
        self.rate_value = rate_value
        # 还款方式1等额本息2等额本金3先息后本4一次性利随本清5只还本金6等本等息
        self.repay_way = repay_way
        # 状态0-正常 1-冻结 2-终止
        self.status = status

    def validate(self):
        self.validate_required(self.credit_amount, 'credit_amount')
        self.validate_required(self.rest_amount, 'rest_amount')
        self.validate_required(self.pay_date, 'pay_date')
        if self.pay_date is not None:
            self.validate_pattern(self.pay_date, 'pay_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.expire_date, 'expire_date')
        if self.expire_date is not None:
            self.validate_pattern(self.expire_date, 'expire_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.rate_unit, 'rate_unit')
        self.validate_required(self.rate_value, 'rate_value')
        self.validate_required(self.repay_way, 'repay_way')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.credit_amount is not None:
            result['credit_amount'] = self.credit_amount
        if self.rest_amount is not None:
            result['rest_amount'] = self.rest_amount
        if self.pay_date is not None:
            result['pay_date'] = self.pay_date
        if self.expire_date is not None:
            result['expire_date'] = self.expire_date
        if self.rate_unit is not None:
            result['rate_unit'] = self.rate_unit
        if self.rate_value is not None:
            result['rate_value'] = self.rate_value
        if self.repay_way is not None:
            result['repay_way'] = self.repay_way
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('credit_amount') is not None:
            self.credit_amount = m.get('credit_amount')
        if m.get('rest_amount') is not None:
            self.rest_amount = m.get('rest_amount')
        if m.get('pay_date') is not None:
            self.pay_date = m.get('pay_date')
        if m.get('expire_date') is not None:
            self.expire_date = m.get('expire_date')
        if m.get('rate_unit') is not None:
            self.rate_unit = m.get('rate_unit')
        if m.get('rate_value') is not None:
            self.rate_value = m.get('rate_value')
        if m.get('repay_way') is not None:
            self.repay_way = m.get('repay_way')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class RtopCompanyOpinionDetail(TeaModel):
    def __init__(
        self,
        doc_content: str = None,
        doc_id: str = None,
        doc_title: str = None,
        doc_url: str = None,
        emotion_score: str = None,
        entity_relevancy_score: str = None,
        hit_keywords: str = None,
        media_influence_score: str = None,
        media_name: str = None,
        media_propagation_score: str = None,
        publish_time: str = None,
        similar_docs: int = None,
    ):
        # 具体的舆情内容
        self.doc_content = doc_content
        # 舆情的id
        self.doc_id = doc_id
        # 舆情的标题
        self.doc_title = doc_title
        # 舆情的url
        self.doc_url = doc_url
        # 情感得分
        self.emotion_score = emotion_score
        # 实体相关度得分
        self.entity_relevancy_score = entity_relevancy_score
        # 命中的关键词
        self.hit_keywords = hit_keywords
        # 媒体影响力得分
        self.media_influence_score = media_influence_score
        # 来源媒体
        self.media_name = media_name
        # 媒体传播得分
        self.media_propagation_score = media_propagation_score
        # 舆情的发布时间
        self.publish_time = publish_time
        # 相似文章数
        self.similar_docs = similar_docs

    def validate(self):
        self.validate_required(self.doc_content, 'doc_content')
        self.validate_required(self.doc_id, 'doc_id')
        self.validate_required(self.doc_title, 'doc_title')
        self.validate_required(self.doc_url, 'doc_url')
        self.validate_required(self.media_name, 'media_name')
        self.validate_required(self.publish_time, 'publish_time')
        if self.publish_time is not None:
            self.validate_pattern(self.publish_time, 'publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.doc_content is not None:
            result['doc_content'] = self.doc_content
        if self.doc_id is not None:
            result['doc_id'] = self.doc_id
        if self.doc_title is not None:
            result['doc_title'] = self.doc_title
        if self.doc_url is not None:
            result['doc_url'] = self.doc_url
        if self.emotion_score is not None:
            result['emotion_score'] = self.emotion_score
        if self.entity_relevancy_score is not None:
            result['entity_relevancy_score'] = self.entity_relevancy_score
        if self.hit_keywords is not None:
            result['hit_keywords'] = self.hit_keywords
        if self.media_influence_score is not None:
            result['media_influence_score'] = self.media_influence_score
        if self.media_name is not None:
            result['media_name'] = self.media_name
        if self.media_propagation_score is not None:
            result['media_propagation_score'] = self.media_propagation_score
        if self.publish_time is not None:
            result['publish_time'] = self.publish_time
        if self.similar_docs is not None:
            result['similar_docs'] = self.similar_docs
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('doc_content') is not None:
            self.doc_content = m.get('doc_content')
        if m.get('doc_id') is not None:
            self.doc_id = m.get('doc_id')
        if m.get('doc_title') is not None:
            self.doc_title = m.get('doc_title')
        if m.get('doc_url') is not None:
            self.doc_url = m.get('doc_url')
        if m.get('emotion_score') is not None:
            self.emotion_score = m.get('emotion_score')
        if m.get('entity_relevancy_score') is not None:
            self.entity_relevancy_score = m.get('entity_relevancy_score')
        if m.get('hit_keywords') is not None:
            self.hit_keywords = m.get('hit_keywords')
        if m.get('media_influence_score') is not None:
            self.media_influence_score = m.get('media_influence_score')
        if m.get('media_name') is not None:
            self.media_name = m.get('media_name')
        if m.get('media_propagation_score') is not None:
            self.media_propagation_score = m.get('media_propagation_score')
        if m.get('publish_time') is not None:
            self.publish_time = m.get('publish_time')
        if m.get('similar_docs') is not None:
            self.similar_docs = m.get('similar_docs')
        return self


class SmsReponse(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        code: str = None,
        message: str = None,
        request_id: str = None,
    ):
        # 发送回执ID
        self.biz_id = biz_id
        # 请求状态码; OK表示成功, 其他表示失败
        self.code = code
        # 是否调用接口成功的描述
        self.message = message
        # 请求ID
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class RepayTrail(TeaModel):
    def __init__(
        self,
        period: str = None,
        need_amt: int = None,
        already_amt: int = None,
        trans_principal: int = None,
        trans_interest: int = None,
        trans_fee: int = None,
        remain_principal: int = None,
        repay_time: str = None,
        start_time: str = None,
        end_time: str = None,
        trial_no: str = None,
    ):
        # 期数
        self.period = period
        # 每期应还金额
        self.need_amt = need_amt
        # 每期已还金额
        self.already_amt = already_amt
        # 每期应还本金
        self.trans_principal = trans_principal
        # 每期应还利息
        self.trans_interest = trans_interest
        # 每期还款费用
        self.trans_fee = trans_fee
        # 剩余本金
        self.remain_principal = remain_principal
        # 还款时间
        self.repay_time = repay_time
        # 计息开始时间
        self.start_time = start_time
        # 计息结束时间
        self.end_time = end_time
        # 试算编号
        self.trial_no = trial_no

    def validate(self):
        self.validate_required(self.period, 'period')
        self.validate_required(self.need_amt, 'need_amt')
        self.validate_required(self.already_amt, 'already_amt')
        self.validate_required(self.trans_principal, 'trans_principal')
        self.validate_required(self.trans_interest, 'trans_interest')
        self.validate_required(self.trans_fee, 'trans_fee')
        self.validate_required(self.remain_principal, 'remain_principal')
        self.validate_required(self.repay_time, 'repay_time')
        if self.repay_time is not None:
            self.validate_pattern(self.repay_time, 'repay_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.trial_no, 'trial_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period is not None:
            result['period'] = self.period
        if self.need_amt is not None:
            result['need_amt'] = self.need_amt
        if self.already_amt is not None:
            result['already_amt'] = self.already_amt
        if self.trans_principal is not None:
            result['trans_principal'] = self.trans_principal
        if self.trans_interest is not None:
            result['trans_interest'] = self.trans_interest
        if self.trans_fee is not None:
            result['trans_fee'] = self.trans_fee
        if self.remain_principal is not None:
            result['remain_principal'] = self.remain_principal
        if self.repay_time is not None:
            result['repay_time'] = self.repay_time
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.trial_no is not None:
            result['trial_no'] = self.trial_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('need_amt') is not None:
            self.need_amt = m.get('need_amt')
        if m.get('already_amt') is not None:
            self.already_amt = m.get('already_amt')
        if m.get('trans_principal') is not None:
            self.trans_principal = m.get('trans_principal')
        if m.get('trans_interest') is not None:
            self.trans_interest = m.get('trans_interest')
        if m.get('trans_fee') is not None:
            self.trans_fee = m.get('trans_fee')
        if m.get('remain_principal') is not None:
            self.remain_principal = m.get('remain_principal')
        if m.get('repay_time') is not None:
            self.repay_time = m.get('repay_time')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('trial_no') is not None:
            self.trial_no = m.get('trial_no')
        return self


class CustomStatus(TeaModel):
    def __init__(
        self,
        apply_flag: bool = None,
        status: str = None,
        msg: str = None,
    ):
        # 是否进行过授信申请
        self.apply_flag = apply_flag
        # 0:通过； 1:拒绝； 2:处理中；
        self.status = status
        # 拒绝原因
        self.msg = msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.apply_flag is not None:
            result['apply_flag'] = self.apply_flag
        if self.status is not None:
            result['status'] = self.status
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apply_flag') is not None:
            self.apply_flag = m.get('apply_flag')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class XNameValuePair(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 键名
        self.name = name
        # 键值
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class QuerySecurityPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        risk_type: str = None,
        security_scene: SecurityScene = None,
        service_context: ServiceContext = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 风险类型：表示风险处理或风险咨询——process/advice
        self.risk_type = risk_type
        self.security_scene = security_scene
        self.service_context = service_context

    def validate(self):
        self.validate_required(self.risk_type, 'risk_type')
        self.validate_required(self.security_scene, 'security_scene')
        if self.security_scene:
            self.security_scene.validate()
        self.validate_required(self.service_context, 'service_context')
        if self.service_context:
            self.service_context.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.security_scene is not None:
            result['security_scene'] = self.security_scene.to_map()
        if self.service_context is not None:
            result['service_context'] = self.service_context.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('security_scene') is not None:
            temp_model = SecurityScene()
            self.security_scene = temp_model.from_map(m['security_scene'])
        if m.get('service_context') is not None:
            temp_model = ServiceContext()
            self.service_context = temp_model.from_map(m['service_context'])
        return self


class QuerySecurityPolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        level: int = None,
        security_id: str = None,
        security_result: str = None,
        success: str = None,
        template_code: str = None,
        template_desc: str = None,
        verify_id: str = None,
        verify_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险咨询情况下返回的风险等级，风险处理不会返回该值
        self.level = level
        # 反馈成功之后的id
        self.security_id = security_id
        # 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
        self.security_result = security_result
        # 是否成功
        self.success = success
        # 有风险需要失败业务情况下的返回码
        self.template_code = template_code
        # 有风险需要失败业务情况下的返回码描述
        self.template_desc = template_desc
        # native场景下的核身id
        self.verify_id = verify_id
        # h5场景下的核身地址
        self.verify_url = verify_url

    def validate(self):
        self.validate_required(self.success, 'success')

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
        if self.level is not None:
            result['level'] = self.level
        if self.security_id is not None:
            result['security_id'] = self.security_id
        if self.security_result is not None:
            result['security_result'] = self.security_result
        if self.success is not None:
            result['success'] = self.success
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_desc is not None:
            result['template_desc'] = self.template_desc
        if self.verify_id is not None:
            result['verify_id'] = self.verify_id
        if self.verify_url is not None:
            result['verify_url'] = self.verify_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('security_id') is not None:
            self.security_id = m.get('security_id')
        if m.get('security_result') is not None:
            self.security_result = m.get('security_result')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_desc') is not None:
            self.template_desc = m.get('template_desc')
        if m.get('verify_id') is not None:
            self.verify_id = m.get('verify_id')
        if m.get('verify_url') is not None:
            self.verify_url = m.get('verify_url')
        return self


class SendSecurityDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        security_content: str = None,
        security_sign: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 安全累计属性列表字段，安全属性列表
        self.security_content = security_content
        # 代码发送给安全核心的事件编码
        self.security_sign = security_sign

    def validate(self):
        self.validate_required(self.security_content, 'security_content')
        self.validate_required(self.security_sign, 'security_sign')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.security_content is not None:
            result['security_content'] = self.security_content
        if self.security_sign is not None:
            result['security_sign'] = self.security_sign
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('security_content') is not None:
            self.security_content = m.get('security_content')
        if m.get('security_sign') is not None:
            self.security_sign = m.get('security_sign')
        return self


class SendSecurityDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

    def validate(self):
        self.validate_required(self.success, 'success')

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
        return self


class ConfirmSecurityPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        confirm_params: str = None,
        security_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 二次确认参数，防止篡改
        self.confirm_params = confirm_params
        # 代码发送给安全核心的事件编码
        self.security_id = security_id

    def validate(self):
        self.validate_required(self.confirm_params, 'confirm_params')
        self.validate_required(self.security_id, 'security_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.confirm_params is not None:
            result['confirm_params'] = self.confirm_params
        if self.security_id is not None:
            result['security_id'] = self.security_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('confirm_params') is not None:
            self.confirm_params = m.get('confirm_params')
        if m.get('security_id') is not None:
            self.security_id = m.get('security_id')
        return self


class ConfirmSecurityPolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

    def validate(self):
        self.validate_required(self.success, 'success')

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
        return self


class CheckSecurityRdsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        rds_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 输入大字段，具体见接入文档
        self.rds_content = rds_content

    def validate(self):
        self.validate_required(self.rds_content, 'rds_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.rds_content is not None:
            result['rds_content'] = self.rds_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('rds_content') is not None:
            self.rds_content = m.get('rds_content')
        return self


class CheckSecurityRdsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.result = result

    def validate(self):
        self.validate_required(self.result, 'result')

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QuerySecurityDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        req_info: List[SecurityDataQueryStruct] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.req_info = req_info

    def validate(self):
        self.validate_required(self.req_info, 'req_info')
        if self.req_info:
            for k in self.req_info:
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
        result['req_info'] = []
        if self.req_info is not None:
            for k in self.req_info:
                result['req_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.req_info = []
        if m.get('req_info') is not None:
            for k in m.get('req_info'):
                temp_model = SecurityDataQueryStruct()
                self.req_info.append(temp_model.from_map(k))
        return self


class QuerySecurityDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

    def validate(self):
        self.validate_required(self.success, 'success')

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
        return self


class CheckSecurityDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        req_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 入参为Map转换后的String
        self.req_info = req_info

    def validate(self):
        self.validate_required(self.req_info, 'req_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.req_info is not None:
            result['req_info'] = self.req_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('req_info') is not None:
            self.req_info = m.get('req_info')
        return self


class CheckSecurityDataResponse(TeaModel):
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
        # code表示状态，message为提示，data为返回结果
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


class ExecSecurityRiskdataserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        event_info: str = None,
        risk_data_serviace_apply_id: str = None,
        risk_data_service_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 风险数据服务请求事件属性详情
        self.event_info = event_info
        # 反欺诈数据服务查询请求唯一凭证，为申请成功后得到，当请求类型是query时必填
        self.risk_data_serviace_apply_id = risk_data_serviace_apply_id
        # 反欺诈风险数据服务请求类型（query or apply）
        self.risk_data_service_type = risk_data_service_type

    def validate(self):
        self.validate_required(self.event_info, 'event_info')
        self.validate_required(self.risk_data_service_type, 'risk_data_service_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.event_info is not None:
            result['event_info'] = self.event_info
        if self.risk_data_serviace_apply_id is not None:
            result['risk_data_serviace_apply_id'] = self.risk_data_serviace_apply_id
        if self.risk_data_service_type is not None:
            result['risk_data_service_type'] = self.risk_data_service_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('event_info') is not None:
            self.event_info = m.get('event_info')
        if m.get('risk_data_serviace_apply_id') is not None:
            self.risk_data_serviace_apply_id = m.get('risk_data_serviace_apply_id')
        if m.get('risk_data_service_type') is not None:
            self.risk_data_service_type = m.get('risk_data_service_type')
        return self


class ExecSecurityRiskdataserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_data_service_apply_id: str = None,
        risk_infos: List[RiskInfo] = None,
        security_id: str = None,
        security_result_infos: SecurityResultInfos = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 反欺诈风险数据服务申请成功时返回的查询凭证（申请请求时存在）
        self.risk_data_service_apply_id = risk_data_service_apply_id
        # 反欺诈风险数据服务查询请求结果中风险详细信息字段（查询请求时存在）
        self.risk_infos = risk_infos
        # 请求响应业务唯一id
        self.security_id = security_id
        # 反欺诈风险数据服务查询成功时得到风险建议结果信息（查询请求时存在）
        self.security_result_infos = security_result_infos
        # 请求是否成功
        self.success = success

    def validate(self):
        if self.risk_infos:
            for k in self.risk_infos:
                if k:
                    k.validate()
        if self.security_result_infos:
            self.security_result_infos.validate()

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
        if self.risk_data_service_apply_id is not None:
            result['risk_data_service_apply_id'] = self.risk_data_service_apply_id
        result['risk_infos'] = []
        if self.risk_infos is not None:
            for k in self.risk_infos:
                result['risk_infos'].append(k.to_map() if k else None)
        if self.security_id is not None:
            result['security_id'] = self.security_id
        if self.security_result_infos is not None:
            result['security_result_infos'] = self.security_result_infos.to_map()
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('risk_data_service_apply_id') is not None:
            self.risk_data_service_apply_id = m.get('risk_data_service_apply_id')
        self.risk_infos = []
        if m.get('risk_infos') is not None:
            for k in m.get('risk_infos'):
                temp_model = RiskInfo()
                self.risk_infos.append(temp_model.from_map(k))
        if m.get('security_id') is not None:
            self.security_id = m.get('security_id')
        if m.get('security_result_infos') is not None:
            temp_model = SecurityResultInfos()
            self.security_result_infos = temp_model.from_map(m['security_result_infos'])
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryDubheTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        testid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 测试id字段
        self.testid = testid

    def validate(self):
        self.validate_required(self.testid, 'testid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.testid is not None:
            result['testid'] = self.testid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('testid') is not None:
            self.testid = m.get('testid')
        return self


class QueryDubheTestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        test_response_str: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 测试返回体
        self.test_response_str = test_response_str

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
        if self.test_response_str is not None:
            result['test_response_str'] = self.test_response_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('test_response_str') is not None:
            self.test_response_str = m.get('test_response_str')
        return self


class QueryDubheRouterFundrouterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        card_no: str = None,
        mobile: str = None,
        custom_name: str = None,
        prod_no: str = None,
        channel_type: str = None,
        custom_type: str = None,
        traffic_platform: str = None,
        traffic_source_name: str = None,
        traffic_ad_id: str = None,
        traffic_mkt_id: str = None,
        click_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 身份证号(md5加密32位)
        self.card_no = card_no
        # 手机号（MD5加密，32位）
        self.mobile = mobile
        # 客户姓名
        self.custom_name = custom_name
        # 合作方产品编号
        self.prod_no = prod_no
        # 渠道类型
        self.channel_type = channel_type
        # 客户类型
        self.custom_type = custom_type
        # 导流平台
        self.traffic_platform = traffic_platform
        # 流量名称
        self.traffic_source_name = traffic_source_name
        # 广告位标志
        self.traffic_ad_id = traffic_ad_id
        # 预留
        self.traffic_mkt_id = traffic_mkt_id
        # 预留
        self.click_id = click_id

    def validate(self):
        self.validate_required(self.card_no, 'card_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.custom_name, 'custom_name')
        self.validate_required(self.prod_no, 'prod_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.card_no is not None:
            result['card_no'] = self.card_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.custom_name is not None:
            result['custom_name'] = self.custom_name
        if self.prod_no is not None:
            result['prod_no'] = self.prod_no
        if self.channel_type is not None:
            result['channel_type'] = self.channel_type
        if self.custom_type is not None:
            result['custom_type'] = self.custom_type
        if self.traffic_platform is not None:
            result['traffic_platform'] = self.traffic_platform
        if self.traffic_source_name is not None:
            result['traffic_source_name'] = self.traffic_source_name
        if self.traffic_ad_id is not None:
            result['traffic_ad_id'] = self.traffic_ad_id
        if self.traffic_mkt_id is not None:
            result['traffic_mkt_id'] = self.traffic_mkt_id
        if self.click_id is not None:
            result['click_id'] = self.click_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('card_no') is not None:
            self.card_no = m.get('card_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('custom_name') is not None:
            self.custom_name = m.get('custom_name')
        if m.get('prod_no') is not None:
            self.prod_no = m.get('prod_no')
        if m.get('channel_type') is not None:
            self.channel_type = m.get('channel_type')
        if m.get('custom_type') is not None:
            self.custom_type = m.get('custom_type')
        if m.get('traffic_platform') is not None:
            self.traffic_platform = m.get('traffic_platform')
        if m.get('traffic_source_name') is not None:
            self.traffic_source_name = m.get('traffic_source_name')
        if m.get('traffic_ad_id') is not None:
            self.traffic_ad_id = m.get('traffic_ad_id')
        if m.get('traffic_mkt_id') is not None:
            self.traffic_mkt_id = m.get('traffic_mkt_id')
        if m.get('click_id') is not None:
            self.click_id = m.get('click_id')
        return self


class QueryDubheRouterFundrouterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        fund_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资金方代码
        self.fund_code = fund_code

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
        if self.fund_code is not None:
            result['fund_code'] = self.fund_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('fund_code') is not None:
            self.fund_code = m.get('fund_code')
        return self


class ApplyDubheCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        personal_info: PersonalInfo = None,
        open_id: str = None,
        order_no: str = None,
        borrower_live_info: LiveInfo = None,
        borrower_emp_info: JobInfo = None,
        prod_no: str = None,
        risk_data: RiskData = None,
        loan_reason: str = None,
        materials: List[Material] = None,
        traffic_platform: str = None,
        traffic_source_name: str = None,
        traffic_ad_id: str = None,
        traffic_mkt_id: str = None,
        click_id: str = None,
        channel_type: str = None,
        custom_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 基础信息
        self.personal_info = personal_info
        # 资产方用户唯一标识
        self.open_id = open_id
        # 订单号
        self.order_no = order_no
        # 居住信息
        self.borrower_live_info = borrower_live_info
        # 工作信息
        self.borrower_emp_info = borrower_emp_info
        # 产品编号
        self.prod_no = prod_no
        # 风险数据对象
        self.risk_data = risk_data
        # 借款用途
        self.loan_reason = loan_reason
        # 资料文件
        self.materials = materials
        # 导流平台
        self.traffic_platform = traffic_platform
        # 流量名称
        self.traffic_source_name = traffic_source_name
        # 广告位标志
        self.traffic_ad_id = traffic_ad_id
        # 预留
        self.traffic_mkt_id = traffic_mkt_id
        # 预留
        self.click_id = click_id
        # 渠道类型
        self.channel_type = channel_type
        # 客户类型
        self.custom_type = custom_type

    def validate(self):
        self.validate_required(self.personal_info, 'personal_info')
        if self.personal_info:
            self.personal_info.validate()
        self.validate_required(self.open_id, 'open_id')
        self.validate_required(self.order_no, 'order_no')
        if self.borrower_live_info:
            self.borrower_live_info.validate()
        if self.borrower_emp_info:
            self.borrower_emp_info.validate()
        self.validate_required(self.prod_no, 'prod_no')
        if self.risk_data:
            self.risk_data.validate()
        if self.materials:
            for k in self.materials:
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
        if self.personal_info is not None:
            result['personal_info'] = self.personal_info.to_map()
        if self.open_id is not None:
            result['open_id'] = self.open_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.borrower_live_info is not None:
            result['borrower_live_info'] = self.borrower_live_info.to_map()
        if self.borrower_emp_info is not None:
            result['borrower_emp_info'] = self.borrower_emp_info.to_map()
        if self.prod_no is not None:
            result['prod_no'] = self.prod_no
        if self.risk_data is not None:
            result['risk_data'] = self.risk_data.to_map()
        if self.loan_reason is not None:
            result['loan_reason'] = self.loan_reason
        result['materials'] = []
        if self.materials is not None:
            for k in self.materials:
                result['materials'].append(k.to_map() if k else None)
        if self.traffic_platform is not None:
            result['traffic_platform'] = self.traffic_platform
        if self.traffic_source_name is not None:
            result['traffic_source_name'] = self.traffic_source_name
        if self.traffic_ad_id is not None:
            result['traffic_ad_id'] = self.traffic_ad_id
        if self.traffic_mkt_id is not None:
            result['traffic_mkt_id'] = self.traffic_mkt_id
        if self.click_id is not None:
            result['click_id'] = self.click_id
        if self.channel_type is not None:
            result['channel_type'] = self.channel_type
        if self.custom_type is not None:
            result['custom_type'] = self.custom_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('personal_info') is not None:
            temp_model = PersonalInfo()
            self.personal_info = temp_model.from_map(m['personal_info'])
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('borrower_live_info') is not None:
            temp_model = LiveInfo()
            self.borrower_live_info = temp_model.from_map(m['borrower_live_info'])
        if m.get('borrower_emp_info') is not None:
            temp_model = JobInfo()
            self.borrower_emp_info = temp_model.from_map(m['borrower_emp_info'])
        if m.get('prod_no') is not None:
            self.prod_no = m.get('prod_no')
        if m.get('risk_data') is not None:
            temp_model = RiskData()
            self.risk_data = temp_model.from_map(m['risk_data'])
        if m.get('loan_reason') is not None:
            self.loan_reason = m.get('loan_reason')
        self.materials = []
        if m.get('materials') is not None:
            for k in m.get('materials'):
                temp_model = Material()
                self.materials.append(temp_model.from_map(k))
        if m.get('traffic_platform') is not None:
            self.traffic_platform = m.get('traffic_platform')
        if m.get('traffic_source_name') is not None:
            self.traffic_source_name = m.get('traffic_source_name')
        if m.get('traffic_ad_id') is not None:
            self.traffic_ad_id = m.get('traffic_ad_id')
        if m.get('traffic_mkt_id') is not None:
            self.traffic_mkt_id = m.get('traffic_mkt_id')
        if m.get('click_id') is not None:
            self.click_id = m.get('click_id')
        if m.get('channel_type') is not None:
            self.channel_type = m.get('channel_type')
        if m.get('custom_type') is not None:
            self.custom_type = m.get('custom_type')
        return self


class ApplyDubheCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        custom_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户编号
        self.custom_no = custom_no

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
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        return self


class QueryDubheCreditStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授信申请订单号
        self.original_order_no = original_order_no
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class QueryDubheCreditStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        msg: str = None,
        credit_amt: int = None,
        period: int = None,
        repay_type: str = None,
        credit_info: CreditAmount = None,
        custom_no: str = None,
        apply_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授信状态（0-通过/1-不通过2-处理中）
        self.status = status
        # 拒绝原因
        self.msg = msg
        # 授信额度
        self.credit_amt = credit_amt
        # 期数
        self.period = period
        # 还款方式
        self.repay_type = repay_type
        # 额度信息
        self.credit_info = credit_info
        # 客户编号(该客户的唯一标识，后续接口需要用到)
        self.custom_no = custom_no
        # 授信申请编号
        self.apply_no = apply_no

    def validate(self):
        if self.credit_info:
            self.credit_info.validate()

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
        if self.msg is not None:
            result['msg'] = self.msg
        if self.credit_amt is not None:
            result['credit_amt'] = self.credit_amt
        if self.period is not None:
            result['period'] = self.period
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.credit_info is not None:
            result['credit_info'] = self.credit_info.to_map()
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.apply_no is not None:
            result['apply_no'] = self.apply_no
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('credit_amt') is not None:
            self.credit_amt = m.get('credit_amt')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('credit_info') is not None:
            temp_model = CreditAmount()
            self.credit_info = temp_model.from_map(m['credit_info'])
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('apply_no') is not None:
            self.apply_no = m.get('apply_no')
        return self


class CountDubheRepayReftrialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        original_order_no: str = None,
        prod_no: str = None,
        apply_amount: int = None,
        apply_period: int = None,
        repay_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 授信申请订单号
        self.original_order_no = original_order_no
        # 产品编号
        self.prod_no = prod_no
        # 借款金额
        self.apply_amount = apply_amount
        # 借款期数
        self.apply_period = apply_period
        # 还款方式
        self.repay_type = repay_type

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.prod_no, 'prod_no')
        self.validate_required(self.apply_amount, 'apply_amount')
        self.validate_required(self.apply_period, 'apply_period')
        self.validate_required(self.repay_type, 'repay_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.prod_no is not None:
            result['prod_no'] = self.prod_no
        if self.apply_amount is not None:
            result['apply_amount'] = self.apply_amount
        if self.apply_period is not None:
            result['apply_period'] = self.apply_period
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('prod_no') is not None:
            self.prod_no = m.get('prod_no')
        if m.get('apply_amount') is not None:
            self.apply_amount = m.get('apply_amount')
        if m.get('apply_period') is not None:
            self.apply_period = m.get('apply_period')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        return self


class CountDubheRepayReftrialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repay_ref_list: List[RepayRef] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款计划试算结果
        self.repay_ref_list = repay_ref_list

    def validate(self):
        if self.repay_ref_list:
            for k in self.repay_ref_list:
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
        result['repay_ref_list'] = []
        if self.repay_ref_list is not None:
            for k in self.repay_ref_list:
                result['repay_ref_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.repay_ref_list = []
        if m.get('repay_ref_list') is not None:
            for k in m.get('repay_ref_list'):
                temp_model = RepayRef()
                self.repay_ref_list.append(temp_model.from_map(k))
        return self


class QueryDubheRepayListRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        original_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 用信申请订单号
        self.original_order_no = original_order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.original_order_no, 'original_order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        return self


class QueryDubheRepayListResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repay_ref_list: List[RepayRef] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款计划查询结果
        self.repay_ref_list = repay_ref_list

    def validate(self):
        if self.repay_ref_list:
            for k in self.repay_ref_list:
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
        result['repay_ref_list'] = []
        if self.repay_ref_list is not None:
            for k in self.repay_ref_list:
                result['repay_ref_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.repay_ref_list = []
        if m.get('repay_ref_list') is not None:
            for k in m.get('repay_ref_list'):
                temp_model = RepayRef()
                self.repay_ref_list.append(temp_model.from_map(k))
        return self


class ApplyDubheUsecreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        loan_amount: int = None,
        period: int = None,
        open_id: str = None,
        order_on: str = None,
        repay_type: str = None,
        loan_way: str = None,
        channel_type: str = None,
        custom_type: str = None,
        repay_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授信申请订单号
        self.original_order_no = original_order_no
        # 用信金额
        self.loan_amount = loan_amount
        # 期数
        self.period = period
        # 资产方用户唯一标识
        self.open_id = open_id
        # 订单号
        self.order_on = order_on
        # 还款方式
        self.repay_type = repay_type
        # 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
        self.loan_way = loan_way
        # 1: APP
        # 2: 支付宝小程序
        # 3：微信小程序
        # 4：微信公众号
        # 5：PC网页
        # 默认1
        self.channel_type = channel_type
        # 1: 新增客户
        # 2：存量激活客户
        # 3：目标营销客户
        # 默认1
        self.custom_type = custom_type
        # 指定还款日（仅无在贷借据时生效）
        self.repay_date = repay_date

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.loan_amount, 'loan_amount')
        self.validate_required(self.period, 'period')
        self.validate_required(self.open_id, 'open_id')
        self.validate_required(self.order_on, 'order_on')
        self.validate_required(self.repay_type, 'repay_type')
        self.validate_required(self.loan_way, 'loan_way')
        self.validate_required(self.channel_type, 'channel_type')
        self.validate_required(self.custom_type, 'custom_type')
        self.validate_required(self.repay_date, 'repay_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.loan_amount is not None:
            result['loan_amount'] = self.loan_amount
        if self.period is not None:
            result['period'] = self.period
        if self.open_id is not None:
            result['open_id'] = self.open_id
        if self.order_on is not None:
            result['order_on'] = self.order_on
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.loan_way is not None:
            result['loan_way'] = self.loan_way
        if self.channel_type is not None:
            result['channel_type'] = self.channel_type
        if self.custom_type is not None:
            result['custom_type'] = self.custom_type
        if self.repay_date is not None:
            result['repay_date'] = self.repay_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('loan_amount') is not None:
            self.loan_amount = m.get('loan_amount')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        if m.get('order_on') is not None:
            self.order_on = m.get('order_on')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('loan_way') is not None:
            self.loan_way = m.get('loan_way')
        if m.get('channel_type') is not None:
            self.channel_type = m.get('channel_type')
        if m.get('custom_type') is not None:
            self.custom_type = m.get('custom_type')
        if m.get('repay_date') is not None:
            self.repay_date = m.get('repay_date')
        return self


class ApplyDubheUsecreditResponse(TeaModel):
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


class QueryDubheUsecreditStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        order_on: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用信申请订单号
        self.original_order_no = original_order_no
        # 请求网络流水号
        self.order_on = order_on

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.order_on, 'order_on')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.order_on is not None:
            result['order_on'] = self.order_on
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('order_on') is not None:
            self.order_on = m.get('order_on')
        return self


class QueryDubheUsecreditStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        msg: str = None,
        receipt_info: ReceiptInfo = None,
        repay_ref: List[RepayRef] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用信状态（0-通过/1-不通过2-处理中）
        self.status = status
        # 拒绝原因
        self.msg = msg
        # 借据信息
        self.receipt_info = receipt_info
        # 还款计划列表
        self.repay_ref = repay_ref

    def validate(self):
        if self.receipt_info:
            self.receipt_info.validate()
        if self.repay_ref:
            for k in self.repay_ref:
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
        if self.status is not None:
            result['status'] = self.status
        if self.msg is not None:
            result['msg'] = self.msg
        if self.receipt_info is not None:
            result['receipt_info'] = self.receipt_info.to_map()
        result['repay_ref'] = []
        if self.repay_ref is not None:
            for k in self.repay_ref:
                result['repay_ref'].append(k.to_map() if k else None)
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('receipt_info') is not None:
            temp_model = ReceiptInfo()
            self.receipt_info = temp_model.from_map(m['receipt_info'])
        self.repay_ref = []
        if m.get('repay_ref') is not None:
            for k in m.get('repay_ref'):
                temp_model = RepayRef()
                self.repay_ref.append(temp_model.from_map(k))
        return self


class CountDubheRepayTrialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        repay_type: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用信申请订单号
        self.original_order_no = original_order_no
        # 还款类型1:当期结清，2：正常还款3：全部结清
        self.repay_type = repay_type
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.repay_type, 'repay_type')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CountDubheRepayTrialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        real_principal: int = None,
        real_interest: int = None,
        real_over_amt: int = None,
        service_charge: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款本金
        self.real_principal = real_principal
        # 还款利息
        self.real_interest = real_interest
        # 还款费用
        self.real_over_amt = real_over_amt
        # 服务费
        self.service_charge = service_charge

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
        if self.real_principal is not None:
            result['real_principal'] = self.real_principal
        if self.real_interest is not None:
            result['real_interest'] = self.real_interest
        if self.real_over_amt is not None:
            result['real_over_amt'] = self.real_over_amt
        if self.service_charge is not None:
            result['service_charge'] = self.service_charge
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('real_principal') is not None:
            self.real_principal = m.get('real_principal')
        if m.get('real_interest') is not None:
            self.real_interest = m.get('real_interest')
        if m.get('real_over_amt') is not None:
            self.real_over_amt = m.get('real_over_amt')
        if m.get('service_charge') is not None:
            self.service_charge = m.get('service_charge')
        return self


class RepayDubheRepayCheckstandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        repay_type: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用信申请订单号
        self.original_order_no = original_order_no
        # 还款类型1:当期结清，2：正常还款3：全部结清
        self.repay_type = repay_type
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.repay_type, 'repay_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class RepayDubheRepayCheckstandResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        checkstand_address: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 收银台地址(成功就有值)
        self.checkstand_address = checkstand_address

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
        if self.checkstand_address is not None:
            result['checkstand_address'] = self.checkstand_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('checkstand_address') is not None:
            self.checkstand_address = m.get('checkstand_address')
        return self


class QueryDubheRepayInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 原还款订单号
        self.original_order_no = original_order_no
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class QueryDubheRepayInfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repay_no: str = None,
        receipt_no: str = None,
        custom_no: str = None,
        custom_name: str = None,
        repay_type: str = None,
        repay_sign: str = None,
        repay_date: str = None,
        repay_amount: int = None,
        repay_principal: int = None,
        repay_interest: int = None,
        channel_amt: int = None,
        repay_fee: str = None,
        repay_punish: int = None,
        repay_account: str = None,
        repay_account_name: str = None,
        repay_mobile: str = None,
        repay_bank_no: str = None,
        repay_bank_name: str = None,
        repay_status: str = None,
        fail_reason: str = None,
        apply_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款编号
        self.repay_no = repay_no
        # 借据编码
        self.receipt_no = receipt_no
        # 客户编号
        self.custom_no = custom_no
        # 客户名称
        self.custom_name = custom_name
        # 还款类型1:提前还款，2：正常还款 3:批量还款 4：自由还款
        self.repay_type = repay_type
        # 还款标志1 线下还款 2 用户主动还款 3 系统代扣
        self.repay_sign = repay_sign
        # 还款日期
        self.repay_date = repay_date
        # 实还总额
        self.repay_amount = repay_amount
        # 实还本金
        self.repay_principal = repay_principal
        # 实还利息
        self.repay_interest = repay_interest
        # 实还通道手续费
        self.channel_amt = channel_amt
        # 实还手续费
        self.repay_fee = repay_fee
        # 实收罚息
        self.repay_punish = repay_punish
        # 还款账户
        self.repay_account = repay_account
        # 还款账户名称
        self.repay_account_name = repay_account_name
        # 还款账户的手机号
        self.repay_mobile = repay_mobile
        # 还款账户银行行号
        self.repay_bank_no = repay_bank_no
        # 还款账户银行名称
        self.repay_bank_name = repay_bank_name
        # 还款状态0:失败 1成功 2-审批中 3-还款中
        self.repay_status = repay_status
        # 失败原因
        self.fail_reason = fail_reason
        # 授信申请编号
        self.apply_no = apply_no

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
        if self.repay_no is not None:
            result['repay_no'] = self.repay_no
        if self.receipt_no is not None:
            result['receipt_no'] = self.receipt_no
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.custom_name is not None:
            result['custom_name'] = self.custom_name
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.repay_sign is not None:
            result['repay_sign'] = self.repay_sign
        if self.repay_date is not None:
            result['repay_date'] = self.repay_date
        if self.repay_amount is not None:
            result['repay_amount'] = self.repay_amount
        if self.repay_principal is not None:
            result['repay_principal'] = self.repay_principal
        if self.repay_interest is not None:
            result['repay_interest'] = self.repay_interest
        if self.channel_amt is not None:
            result['channel_amt'] = self.channel_amt
        if self.repay_fee is not None:
            result['repay_fee'] = self.repay_fee
        if self.repay_punish is not None:
            result['repay_punish'] = self.repay_punish
        if self.repay_account is not None:
            result['repay_account'] = self.repay_account
        if self.repay_account_name is not None:
            result['repay_account_name'] = self.repay_account_name
        if self.repay_mobile is not None:
            result['repay_mobile'] = self.repay_mobile
        if self.repay_bank_no is not None:
            result['repay_bank_no'] = self.repay_bank_no
        if self.repay_bank_name is not None:
            result['repay_bank_name'] = self.repay_bank_name
        if self.repay_status is not None:
            result['repay_status'] = self.repay_status
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        if self.apply_no is not None:
            result['apply_no'] = self.apply_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('repay_no') is not None:
            self.repay_no = m.get('repay_no')
        if m.get('receipt_no') is not None:
            self.receipt_no = m.get('receipt_no')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('custom_name') is not None:
            self.custom_name = m.get('custom_name')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('repay_sign') is not None:
            self.repay_sign = m.get('repay_sign')
        if m.get('repay_date') is not None:
            self.repay_date = m.get('repay_date')
        if m.get('repay_amount') is not None:
            self.repay_amount = m.get('repay_amount')
        if m.get('repay_principal') is not None:
            self.repay_principal = m.get('repay_principal')
        if m.get('repay_interest') is not None:
            self.repay_interest = m.get('repay_interest')
        if m.get('channel_amt') is not None:
            self.channel_amt = m.get('channel_amt')
        if m.get('repay_fee') is not None:
            self.repay_fee = m.get('repay_fee')
        if m.get('repay_punish') is not None:
            self.repay_punish = m.get('repay_punish')
        if m.get('repay_account') is not None:
            self.repay_account = m.get('repay_account')
        if m.get('repay_account_name') is not None:
            self.repay_account_name = m.get('repay_account_name')
        if m.get('repay_mobile') is not None:
            self.repay_mobile = m.get('repay_mobile')
        if m.get('repay_bank_no') is not None:
            self.repay_bank_no = m.get('repay_bank_no')
        if m.get('repay_bank_name') is not None:
            self.repay_bank_name = m.get('repay_bank_name')
        if m.get('repay_status') is not None:
            self.repay_status = m.get('repay_status')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        if m.get('apply_no') is not None:
            self.apply_no = m.get('apply_no')
        return self


class UpdateDubheCustomerInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        custom_name: str = None,
        census_register: str = None,
        card_no: str = None,
        mobile: str = None,
        custom_no: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户姓名(可修改字段)
        self.custom_name = custom_name
        # 户籍所在地(可修改字段)
        self.census_register = census_register
        # 证件号码(可修改字段)
        self.card_no = card_no
        # 手机号码(可修改字段)
        self.mobile = mobile
        # 客户编号(唯一不变)
        self.custom_no = custom_no
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.custom_no, 'custom_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.custom_name is not None:
            result['custom_name'] = self.custom_name
        if self.census_register is not None:
            result['census_register'] = self.census_register
        if self.card_no is not None:
            result['card_no'] = self.card_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('custom_name') is not None:
            self.custom_name = m.get('custom_name')
        if m.get('census_register') is not None:
            self.census_register = m.get('census_register')
        if m.get('card_no') is not None:
            self.card_no = m.get('card_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class UpdateDubheCustomerInfoResponse(TeaModel):
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


class ApplyDubheCustomerAgreementsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        custom_no: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户编号
        self.custom_no = custom_no
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.custom_no, 'custom_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class ApplyDubheCustomerAgreementsignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sdk_params: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # sdkParams返回给商户app客户端，作为客户端唤起sdk的入参
        self.sdk_params = sdk_params

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
        if self.sdk_params is not None:
            result['sdk_params'] = self.sdk_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sdk_params') is not None:
            self.sdk_params = m.get('sdk_params')
        return self


class QueryDubheCustomerAgreementsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        custom_no: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户编号
        self.custom_no = custom_no
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.custom_no, 'custom_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class QueryDubheCustomerAgreementsignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        custom_no: str = None,
        trans_serials: str = None,
        status: str = None,
        sign_time: str = None,
        valid_time: str = None,
        invalid_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户编号
        self.custom_no = custom_no
        # 流水号(代扣协议中标示用户的唯一签约号)
        self.trans_serials = trans_serials
        # 协议签约状态(0-成功1-失败2-处理中)
        self.status = status
        # 协议签约时间(支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss)
        self.sign_time = sign_time
        # 协议生效时间(用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss)
        self.valid_time = valid_time
        # 协议失效时间(用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss)
        self.invalid_time = invalid_time

    def validate(self):
        if self.sign_time is not None:
            self.validate_pattern(self.sign_time, 'sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.valid_time is not None:
            self.validate_pattern(self.valid_time, 'valid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.invalid_time is not None:
            self.validate_pattern(self.invalid_time, 'invalid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.trans_serials is not None:
            result['trans_serials'] = self.trans_serials
        if self.status is not None:
            result['status'] = self.status
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.invalid_time is not None:
            result['invalid_time'] = self.invalid_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('trans_serials') is not None:
            self.trans_serials = m.get('trans_serials')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('invalid_time') is not None:
            self.invalid_time = m.get('invalid_time')
        return self


class RepayDubheRepayWithholdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        repay_type: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # originalOrderNo
        self.original_order_no = original_order_no
        # 还款类型1:当期结清，2：正常还款3：全部结清
        self.repay_type = repay_type
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.repay_type, 'repay_type')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class RepayDubheRepayWithholdResponse(TeaModel):
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


class QueryDubheSearchContractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 原用信订单号
        self.original_order_no = original_order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        return self


class QueryDubheSearchContractResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        relation_no: str = None,
        contract_no: str = None,
        contract_name: str = None,
        contract_type: str = None,
        custom_no: str = None,
        save_path: str = None,
        contract_amount: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 关联编号（授信/用信）
        self.relation_no = relation_no
        # 合同编号
        self.contract_no = contract_no
        # 合同名称
        self.contract_name = contract_name
        # 合同类型
        self.contract_type = contract_type
        # 客户编号
        self.custom_no = custom_no
        # 下载地址
        self.save_path = save_path
        # 合同金额
        self.contract_amount = contract_amount

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
        if self.relation_no is not None:
            result['relation_no'] = self.relation_no
        if self.contract_no is not None:
            result['contract_no'] = self.contract_no
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.save_path is not None:
            result['save_path'] = self.save_path
        if self.contract_amount is not None:
            result['contract_amount'] = self.contract_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('relation_no') is not None:
            self.relation_no = m.get('relation_no')
        if m.get('contract_no') is not None:
            self.contract_no = m.get('contract_no')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('save_path') is not None:
            self.save_path = m.get('save_path')
        if m.get('contract_amount') is not None:
            self.contract_amount = m.get('contract_amount')
        return self


class QueryDubheReceiptOverdueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        contract_no: str = None,
        channel_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合同编号
        self.contract_no = contract_no
        # 渠道号
        self.channel_code = channel_code

    def validate(self):
        self.validate_required(self.contract_no, 'contract_no')
        self.validate_required(self.channel_code, 'channel_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.contract_no is not None:
            result['contract_no'] = self.contract_no
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('contract_no') is not None:
            self.contract_no = m.get('contract_no')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        return self


class QueryDubheReceiptOverdueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: OverdueInfoResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 逾期信息响应
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
            temp_model = OverdueInfoResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class SendDubbridgeSmsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        phone_numbers: str = None,
        sign_name: str = None,
        template_code: str = None,
        template_param: str = None,
        sms_up_extend_code: str = None,
        out_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 接收短信的手机号码。支持对多个手机号码发送短信，手机号码之间以英文逗号（,）分隔。上限为1000个手机号码。批量调用相对于单条调用及时性稍有延迟。
        self.phone_numbers = phone_numbers
        # 短信签名
        self.sign_name = sign_name
        # 短信模板CODE
        self.template_code = template_code
        # 短信模板变量对应的值，JSON格式
        self.template_param = template_param
        # 上行短信扩展码
        self.sms_up_extend_code = sms_up_extend_code
        # 外部流水扩展
        self.out_id = out_id

    def validate(self):
        self.validate_required(self.phone_numbers, 'phone_numbers')
        self.validate_required(self.sign_name, 'sign_name')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.out_id, 'out_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.phone_numbers is not None:
            result['phone_numbers'] = self.phone_numbers
        if self.sign_name is not None:
            result['sign_name'] = self.sign_name
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_param is not None:
            result['template_param'] = self.template_param
        if self.sms_up_extend_code is not None:
            result['sms_up_extend_code'] = self.sms_up_extend_code
        if self.out_id is not None:
            result['out_id'] = self.out_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('phone_numbers') is not None:
            self.phone_numbers = m.get('phone_numbers')
        if m.get('sign_name') is not None:
            self.sign_name = m.get('sign_name')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_param') is not None:
            self.template_param = m.get('template_param')
        if m.get('sms_up_extend_code') is not None:
            self.sms_up_extend_code = m.get('sms_up_extend_code')
        if m.get('out_id') is not None:
            self.out_id = m.get('out_id')
        return self


class SendDubbridgeSmsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response: SmsReponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 云通信发送结果
        self.response = response

    def validate(self):
        if self.response:
            self.response.validate()

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
            result['response'] = self.response.to_map()
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
            temp_model = SmsReponse()
            self.response = temp_model.from_map(m['response'])
        return self


class SendDubbridgeSmsBatchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_code: str = None,
        phone_number_json: str = None,
        sign_name_json: str = None,
        template_param_json: str = None,
        sms_up_extend_code_json: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 短信模板code
        self.template_code = template_code
        # 接收短信的手机号码，JSON数组格式
        self.phone_number_json = phone_number_json
        # 短信签名名称，JSON数组格式
        self.sign_name_json = sign_name_json
        # 短信模板变量对应的实际值，JSON数组格式
        self.template_param_json = template_param_json
        # 上行短信扩展码，JSON数组格式。无特殊需要此字段的用户请忽略此字段
        self.sms_up_extend_code_json = sms_up_extend_code_json

    def validate(self):
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.phone_number_json, 'phone_number_json')
        self.validate_required(self.sign_name_json, 'sign_name_json')
        self.validate_required(self.template_param_json, 'template_param_json')
        self.validate_required(self.sms_up_extend_code_json, 'sms_up_extend_code_json')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.phone_number_json is not None:
            result['phone_number_json'] = self.phone_number_json
        if self.sign_name_json is not None:
            result['sign_name_json'] = self.sign_name_json
        if self.template_param_json is not None:
            result['template_param_json'] = self.template_param_json
        if self.sms_up_extend_code_json is not None:
            result['sms_up_extend_code_json'] = self.sms_up_extend_code_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('phone_number_json') is not None:
            self.phone_number_json = m.get('phone_number_json')
        if m.get('sign_name_json') is not None:
            self.sign_name_json = m.get('sign_name_json')
        if m.get('template_param_json') is not None:
            self.template_param_json = m.get('template_param_json')
        if m.get('sms_up_extend_code_json') is not None:
            self.sms_up_extend_code_json = m.get('sms_up_extend_code_json')
        return self


class SendDubbridgeSmsBatchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response: SmsReponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 云通信短信发送结果
        self.response = response

    def validate(self):
        if self.response:
            self.response.validate()

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
            result['response'] = self.response.to_map()
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
            temp_model = SmsReponse()
            self.response = temp_model.from_map(m['response'])
        return self


class QueryDubbridgeRouterFundrouterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        card_no: str = None,
        mobile: str = None,
        custom_name: str = None,
        prod_no: str = None,
        channel_type: str = None,
        custom_type: str = None,
        traffic_platform: str = None,
        traffic_source_name: str = None,
        traffic_ad_id: str = None,
        traffic_mkt_id: str = None,
        click_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 身份证号
        self.card_no = card_no
        # 手机号
        self.mobile = mobile
        # 姓名
        self.custom_name = custom_name
        # 合作方产品编号
        self.prod_no = prod_no
        # 渠道类型
        self.channel_type = channel_type
        # 客户类型
        self.custom_type = custom_type
        # 导流平台
        self.traffic_platform = traffic_platform
        # 流量名称
        self.traffic_source_name = traffic_source_name
        # 广告位标志
        self.traffic_ad_id = traffic_ad_id
        # 预留
        self.traffic_mkt_id = traffic_mkt_id
        # 预留
        self.click_id = click_id

    def validate(self):
        self.validate_required(self.card_no, 'card_no')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.custom_name, 'custom_name')
        self.validate_required(self.prod_no, 'prod_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.card_no is not None:
            result['card_no'] = self.card_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.custom_name is not None:
            result['custom_name'] = self.custom_name
        if self.prod_no is not None:
            result['prod_no'] = self.prod_no
        if self.channel_type is not None:
            result['channel_type'] = self.channel_type
        if self.custom_type is not None:
            result['custom_type'] = self.custom_type
        if self.traffic_platform is not None:
            result['traffic_platform'] = self.traffic_platform
        if self.traffic_source_name is not None:
            result['traffic_source_name'] = self.traffic_source_name
        if self.traffic_ad_id is not None:
            result['traffic_ad_id'] = self.traffic_ad_id
        if self.traffic_mkt_id is not None:
            result['traffic_mkt_id'] = self.traffic_mkt_id
        if self.click_id is not None:
            result['click_id'] = self.click_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('card_no') is not None:
            self.card_no = m.get('card_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('custom_name') is not None:
            self.custom_name = m.get('custom_name')
        if m.get('prod_no') is not None:
            self.prod_no = m.get('prod_no')
        if m.get('channel_type') is not None:
            self.channel_type = m.get('channel_type')
        if m.get('custom_type') is not None:
            self.custom_type = m.get('custom_type')
        if m.get('traffic_platform') is not None:
            self.traffic_platform = m.get('traffic_platform')
        if m.get('traffic_source_name') is not None:
            self.traffic_source_name = m.get('traffic_source_name')
        if m.get('traffic_ad_id') is not None:
            self.traffic_ad_id = m.get('traffic_ad_id')
        if m.get('traffic_mkt_id') is not None:
            self.traffic_mkt_id = m.get('traffic_mkt_id')
        if m.get('click_id') is not None:
            self.click_id = m.get('click_id')
        return self


class QueryDubbridgeRouterFundrouterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        fund_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资金方代码
        self.fund_code = fund_code

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
        if self.fund_code is not None:
            result['fund_code'] = self.fund_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('fund_code') is not None:
            self.fund_code = m.get('fund_code')
        return self


class ApplyDubbridgeCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        personal_info: PersonalInfo = None,
        open_id: str = None,
        order_no: str = None,
        borrower_live_info: LiveInfo = None,
        borrower_emp_info: JobInfo = None,
        prod_no: str = None,
        risk_data: RiskData = None,
        loan_reason: str = None,
        materials: List[Material] = None,
        traffic_platform: str = None,
        traffic_source_name: str = None,
        traffic_ad_id: str = None,
        traffic_mkt_id: str = None,
        click_id: str = None,
        channel_type: str = None,
        custom_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 基础信息
        self.personal_info = personal_info
        # 资产方用户唯一标识
        self.open_id = open_id
        # 订单号
        self.order_no = order_no
        # 居住信息
        self.borrower_live_info = borrower_live_info
        # 工作信息
        self.borrower_emp_info = borrower_emp_info
        # 产品编号
        self.prod_no = prod_no
        # 风险数据对象
        self.risk_data = risk_data
        # 借款用途
        self.loan_reason = loan_reason
        # 资料文件
        self.materials = materials
        # 导流平台
        self.traffic_platform = traffic_platform
        # 流量名称
        self.traffic_source_name = traffic_source_name
        # 广告位标志
        self.traffic_ad_id = traffic_ad_id
        # 预留
        self.traffic_mkt_id = traffic_mkt_id
        # 预留
        self.click_id = click_id
        # 渠道类型
        self.channel_type = channel_type
        # 客户类型
        self.custom_type = custom_type

    def validate(self):
        self.validate_required(self.personal_info, 'personal_info')
        if self.personal_info:
            self.personal_info.validate()
        self.validate_required(self.open_id, 'open_id')
        self.validate_required(self.order_no, 'order_no')
        if self.borrower_live_info:
            self.borrower_live_info.validate()
        if self.borrower_emp_info:
            self.borrower_emp_info.validate()
        self.validate_required(self.prod_no, 'prod_no')
        if self.risk_data:
            self.risk_data.validate()
        if self.materials:
            for k in self.materials:
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
        if self.personal_info is not None:
            result['personal_info'] = self.personal_info.to_map()
        if self.open_id is not None:
            result['open_id'] = self.open_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.borrower_live_info is not None:
            result['borrower_live_info'] = self.borrower_live_info.to_map()
        if self.borrower_emp_info is not None:
            result['borrower_emp_info'] = self.borrower_emp_info.to_map()
        if self.prod_no is not None:
            result['prod_no'] = self.prod_no
        if self.risk_data is not None:
            result['risk_data'] = self.risk_data.to_map()
        if self.loan_reason is not None:
            result['loan_reason'] = self.loan_reason
        result['materials'] = []
        if self.materials is not None:
            for k in self.materials:
                result['materials'].append(k.to_map() if k else None)
        if self.traffic_platform is not None:
            result['traffic_platform'] = self.traffic_platform
        if self.traffic_source_name is not None:
            result['traffic_source_name'] = self.traffic_source_name
        if self.traffic_ad_id is not None:
            result['traffic_ad_id'] = self.traffic_ad_id
        if self.traffic_mkt_id is not None:
            result['traffic_mkt_id'] = self.traffic_mkt_id
        if self.click_id is not None:
            result['click_id'] = self.click_id
        if self.channel_type is not None:
            result['channel_type'] = self.channel_type
        if self.custom_type is not None:
            result['custom_type'] = self.custom_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('personal_info') is not None:
            temp_model = PersonalInfo()
            self.personal_info = temp_model.from_map(m['personal_info'])
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('borrower_live_info') is not None:
            temp_model = LiveInfo()
            self.borrower_live_info = temp_model.from_map(m['borrower_live_info'])
        if m.get('borrower_emp_info') is not None:
            temp_model = JobInfo()
            self.borrower_emp_info = temp_model.from_map(m['borrower_emp_info'])
        if m.get('prod_no') is not None:
            self.prod_no = m.get('prod_no')
        if m.get('risk_data') is not None:
            temp_model = RiskData()
            self.risk_data = temp_model.from_map(m['risk_data'])
        if m.get('loan_reason') is not None:
            self.loan_reason = m.get('loan_reason')
        self.materials = []
        if m.get('materials') is not None:
            for k in m.get('materials'):
                temp_model = Material()
                self.materials.append(temp_model.from_map(k))
        if m.get('traffic_platform') is not None:
            self.traffic_platform = m.get('traffic_platform')
        if m.get('traffic_source_name') is not None:
            self.traffic_source_name = m.get('traffic_source_name')
        if m.get('traffic_ad_id') is not None:
            self.traffic_ad_id = m.get('traffic_ad_id')
        if m.get('traffic_mkt_id') is not None:
            self.traffic_mkt_id = m.get('traffic_mkt_id')
        if m.get('click_id') is not None:
            self.click_id = m.get('click_id')
        if m.get('channel_type') is not None:
            self.channel_type = m.get('channel_type')
        if m.get('custom_type') is not None:
            self.custom_type = m.get('custom_type')
        return self


class ApplyDubbridgeCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        custom_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户编号
        self.custom_no = custom_no

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
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        return self


class UploadDubbridgeFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        channel_code: str = None,
        file_name: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 渠道号
        self.channel_code = channel_code
        # 文件名
        self.file_name = file_name
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 32)
        self.validate_required(self.channel_code, 'channel_code')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadDubbridgeFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_info: DubheFileInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件信息
        self.file_info = file_info

    def validate(self):
        if self.file_info:
            self.file_info.validate()

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
        if self.file_info is not None:
            result['file_info'] = self.file_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_info') is not None:
            temp_model = DubheFileInfo()
            self.file_info = temp_model.from_map(m['file_info'])
        return self


class BindDubbridgeCustomerBankcardRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        customer_no: str = None,
        bank_card_no: str = None,
        channel_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 客户编号
        self.customer_no = customer_no
        # 银行卡号
        self.bank_card_no = bank_card_no
        # 渠道描述，具体请见分配
        self.channel_code = channel_code

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.customer_no, 'customer_no')
        self.validate_required(self.bank_card_no, 'bank_card_no')
        self.validate_required(self.channel_code, 'channel_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.customer_no is not None:
            result['customer_no'] = self.customer_no
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('customer_no') is not None:
            self.customer_no = m.get('customer_no')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        return self


class BindDubbridgeCustomerBankcardResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        bind_serial_no: str = None,
        customer_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 绑卡流水
        self.bind_serial_no = bind_serial_no
        # 客户号
        self.customer_no = customer_no

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
        if self.bind_serial_no is not None:
            result['bind_serial_no'] = self.bind_serial_no
        if self.customer_no is not None:
            result['customer_no'] = self.customer_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('bind_serial_no') is not None:
            self.bind_serial_no = m.get('bind_serial_no')
        if m.get('customer_no') is not None:
            self.customer_no = m.get('customer_no')
        return self


class VerifyDubbridgeCustomerBankcardRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        custom_no: str = None,
        bind_serial_no: str = None,
        bind_valid_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 客户号
        self.custom_no = custom_no
        # 绑卡流水
        self.bind_serial_no = bind_serial_no
        # 绑卡验证码
        self.bind_valid_code = bind_valid_code

    def validate(self):
        self.validate_required(self.bind_serial_no, 'bind_serial_no')
        self.validate_required(self.bind_valid_code, 'bind_valid_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.bind_serial_no is not None:
            result['bind_serial_no'] = self.bind_serial_no
        if self.bind_valid_code is not None:
            result['bind_valid_code'] = self.bind_valid_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('bind_serial_no') is not None:
            self.bind_serial_no = m.get('bind_serial_no')
        if m.get('bind_valid_code') is not None:
            self.bind_valid_code = m.get('bind_valid_code')
        return self


class VerifyDubbridgeCustomerBankcardResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        bind_serial_no: str = None,
        sign_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 绑卡流水
        self.bind_serial_no = bind_serial_no
        # 签约结果
        self.sign_result = sign_result

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
        if self.bind_serial_no is not None:
            result['bind_serial_no'] = self.bind_serial_no
        if self.sign_result is not None:
            result['sign_result'] = self.sign_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('bind_serial_no') is not None:
            self.bind_serial_no = m.get('bind_serial_no')
        if m.get('sign_result') is not None:
            self.sign_result = m.get('sign_result')
        return self


class NotifyDubbridgeDefininnerchannelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        seq_no: str = None,
        api_name: str = None,
        inst_member_code: str = None,
        biz_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用流水
        self.seq_no = seq_no
        # 机构平台接口名
        self.api_name = api_name
        # 机构编号
        self.inst_member_code = inst_member_code
        # 业务参数Json
        self.biz_param = biz_param

    def validate(self):
        self.validate_required(self.seq_no, 'seq_no')
        self.validate_required(self.api_name, 'api_name')
        self.validate_required(self.inst_member_code, 'inst_member_code')
        self.validate_required(self.biz_param, 'biz_param')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.seq_no is not None:
            result['seq_no'] = self.seq_no
        if self.api_name is not None:
            result['api_name'] = self.api_name
        if self.inst_member_code is not None:
            result['inst_member_code'] = self.inst_member_code
        if self.biz_param is not None:
            result['biz_param'] = self.biz_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('seq_no') is not None:
            self.seq_no = m.get('seq_no')
        if m.get('api_name') is not None:
            self.api_name = m.get('api_name')
        if m.get('inst_member_code') is not None:
            self.inst_member_code = m.get('inst_member_code')
        if m.get('biz_param') is not None:
            self.biz_param = m.get('biz_param')
        return self


class NotifyDubbridgeDefininnerchannelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: DefinInnerChannelNotifyResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 处理结果
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
            temp_model = DefinInnerChannelNotifyResult()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryDubbridgeCreditStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        order_no: str = None,
        open_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授信申请订单号
        self.original_order_no = original_order_no
        # 订单号
        self.order_no = order_no
        # 三方客户id
        self.open_id = open_id

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.open_id is not None:
            result['open_id'] = self.open_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        return self


class QueryDubbridgeCreditStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        msg: str = None,
        credit_amt: int = None,
        period: int = None,
        repay_type: str = None,
        credit_info: CreditAmount = None,
        custom_no: str = None,
        apply_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授信状态（0-通过/1-不通过2-处理中）
        self.status = status
        # 拒绝原因
        self.msg = msg
        # 授信额度
        self.credit_amt = credit_amt
        # 期数
        self.period = period
        # 还款方式
        self.repay_type = repay_type
        # 额度信息
        self.credit_info = credit_info
        # 客户编号(该客户的唯一标识，后续接口需要用到)
        self.custom_no = custom_no
        # 授信申请编号
        self.apply_no = apply_no

    def validate(self):
        if self.credit_info:
            self.credit_info.validate()

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
        if self.msg is not None:
            result['msg'] = self.msg
        if self.credit_amt is not None:
            result['credit_amt'] = self.credit_amt
        if self.period is not None:
            result['period'] = self.period
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.credit_info is not None:
            result['credit_info'] = self.credit_info.to_map()
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.apply_no is not None:
            result['apply_no'] = self.apply_no
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('credit_amt') is not None:
            self.credit_amt = m.get('credit_amt')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('credit_info') is not None:
            temp_model = CreditAmount()
            self.credit_info = temp_model.from_map(m['credit_info'])
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('apply_no') is not None:
            self.apply_no = m.get('apply_no')
        return self


class QueryDubbridgeRiskinfoEnterprisescoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        social_credit_code: str = None,
        mobile: str = None,
        customer_no: str = None,
        channel_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 统一信用代码
        self.social_credit_code = social_credit_code
        # 手机号
        self.mobile = mobile
        # 客户号
        self.customer_no = customer_no
        # 渠道号
        self.channel_code = channel_code

    def validate(self):
        self.validate_required(self.social_credit_code, 'social_credit_code')
        self.validate_required(self.customer_no, 'customer_no')
        self.validate_required(self.channel_code, 'channel_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.social_credit_code is not None:
            result['social_credit_code'] = self.social_credit_code
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.customer_no is not None:
            result['customer_no'] = self.customer_no
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('social_credit_code') is not None:
            self.social_credit_code = m.get('social_credit_code')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('customer_no') is not None:
            self.customer_no = m.get('customer_no')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        return self


class QueryDubbridgeRiskinfoEnterprisescoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        score: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 小微分
        self.score = score

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
        return self


class QueryDubbridgeRiskinfoCommonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        query_id: str = None,
        id_type: str = None,
        open_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询id
        self.query_id = query_id
        # 查询id类型
        self.id_type = id_type
        # 用户id
        self.open_id = open_id

    def validate(self):
        self.validate_required(self.query_id, 'query_id')
        self.validate_required(self.id_type, 'id_type')
        self.validate_required(self.open_id, 'open_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.query_id is not None:
            result['query_id'] = self.query_id
        if self.id_type is not None:
            result['id_type'] = self.id_type
        if self.open_id is not None:
            result['open_id'] = self.open_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('query_id') is not None:
            self.query_id = m.get('query_id')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        return self


class QueryDubbridgeRiskinfoCommonResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        query_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风控信息Json字符串
        self.query_result = query_result

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
        if self.query_result is not None:
            result['query_result'] = self.query_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('query_result') is not None:
            self.query_result = m.get('query_result')
        return self


class UpdateDubbridgeInstitutionCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        serial_no: str = None,
        credit_no: str = None,
        name: str = None,
        cert_no: str = None,
        apply_type: str = None,
        credit_amount: str = None,
        credit_rate: str = None,
        source: str = None,
        reason_code: str = None,
        reason_msg: str = None,
        ext_info_ts: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 机构请求流水号，用于幂等。行方需确保唯一性
        self.serial_no = serial_no
        # 授信编号，授信申请时同申请单号一致，调额等操作同前授信申请时的授信编号一致
        self.credit_no = credit_no
        # 客户姓名
        self.name = name
        # 身份证号
        self.cert_no = cert_no
        # ADJUST_AMT_APPLY|ADJUST_RATE_APPLY|CLEAR_UP_APPLY|FROZEN_APPLY|UN_FROZEN_APPLY
        self.apply_type = apply_type
        # 基础固额-申请调整值，单位分，机构发起调额场景下有值
        self.credit_amount = credit_amount
        # 年利率-申请调整值，机构发起调价场景下有值
        self.credit_rate = credit_rate
        # 申请来源
        self.source = source
        # 机构申请原因码
        self.reason_code = reason_code
        # 机构发起原因描述
        self.reason_msg = reason_msg
        # 透传授信阶段天枢字段，json格式
        self.ext_info_ts = ext_info_ts
        # 扩展信息，json格式
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.serial_no, 'serial_no')
        self.validate_required(self.credit_no, 'credit_no')
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.apply_type, 'apply_type')
        self.validate_required(self.source, 'source')
        self.validate_required(self.reason_code, 'reason_code')
        self.validate_required(self.reason_msg, 'reason_msg')
        self.validate_required(self.ext_info_ts, 'ext_info_ts')
        self.validate_required(self.ext_info, 'ext_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.serial_no is not None:
            result['serial_no'] = self.serial_no
        if self.credit_no is not None:
            result['credit_no'] = self.credit_no
        if self.name is not None:
            result['name'] = self.name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        if self.credit_amount is not None:
            result['credit_amount'] = self.credit_amount
        if self.credit_rate is not None:
            result['credit_rate'] = self.credit_rate
        if self.source is not None:
            result['source'] = self.source
        if self.reason_code is not None:
            result['reason_code'] = self.reason_code
        if self.reason_msg is not None:
            result['reason_msg'] = self.reason_msg
        if self.ext_info_ts is not None:
            result['ext_info_ts'] = self.ext_info_ts
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('serial_no') is not None:
            self.serial_no = m.get('serial_no')
        if m.get('credit_no') is not None:
            self.credit_no = m.get('credit_no')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        if m.get('credit_amount') is not None:
            self.credit_amount = m.get('credit_amount')
        if m.get('credit_rate') is not None:
            self.credit_rate = m.get('credit_rate')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('reason_code') is not None:
            self.reason_code = m.get('reason_code')
        if m.get('reason_msg') is not None:
            self.reason_msg = m.get('reason_msg')
        if m.get('ext_info_ts') is not None:
            self.ext_info_ts = m.get('ext_info_ts')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class UpdateDubbridgeInstitutionCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        apply_no: str = None,
        serial_no: str = None,
        biz_code: str = None,
        biz_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 蚂蚁端返回申请单号
        self.apply_no = apply_no
        # 机构请求流水号，用于幂等
        self.serial_no = serial_no
        # 业务响应码
        self.biz_code = biz_code
        # 业务消息
        self.biz_msg = biz_msg

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
        if self.apply_no is not None:
            result['apply_no'] = self.apply_no
        if self.serial_no is not None:
            result['serial_no'] = self.serial_no
        if self.biz_code is not None:
            result['biz_code'] = self.biz_code
        if self.biz_msg is not None:
            result['biz_msg'] = self.biz_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('apply_no') is not None:
            self.apply_no = m.get('apply_no')
        if m.get('serial_no') is not None:
            self.serial_no = m.get('serial_no')
        if m.get('biz_code') is not None:
            self.biz_code = m.get('biz_code')
        if m.get('biz_msg') is not None:
            self.biz_msg = m.get('biz_msg')
        return self


class QueryDubbridgeRiskinfoBusinessinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        channel_code: str = None,
        customer_no: str = None,
        social_credit_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 渠道号
        self.channel_code = channel_code
        # 客户号
        self.customer_no = customer_no
        # 统一社会信用代码
        self.social_credit_code = social_credit_code

    def validate(self):
        self.validate_required(self.channel_code, 'channel_code')
        self.validate_required(self.customer_no, 'customer_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.customer_no is not None:
            result['customer_no'] = self.customer_no
        if self.social_credit_code is not None:
            result['social_credit_code'] = self.social_credit_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('customer_no') is not None:
            self.customer_no = m.get('customer_no')
        if m.get('social_credit_code') is not None:
            self.social_credit_code = m.get('social_credit_code')
        return self


class QueryDubbridgeRiskinfoBusinessinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业经营信息
        self.info = info

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
        if self.info is not None:
            result['info'] = self.info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('info') is not None:
            self.info = m.get('info')
        return self


class ApplyDubbridgeCustomerAgreementsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        custom_no: str = None,
        custom_name: str = None,
        card_no: str = None,
        id_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 客户编号
        self.custom_no = custom_no
        # 张三
        self.custom_name = custom_name
        # 110101xxxxxxxx
        self.card_no = card_no
        # 证件类型
        self.id_type = id_type

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.custom_no, 'custom_no')
        self.validate_required(self.custom_name, 'custom_name')
        self.validate_required(self.card_no, 'card_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.custom_name is not None:
            result['custom_name'] = self.custom_name
        if self.card_no is not None:
            result['card_no'] = self.card_no
        if self.id_type is not None:
            result['id_type'] = self.id_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('custom_name') is not None:
            self.custom_name = m.get('custom_name')
        if m.get('card_no') is not None:
            self.card_no = m.get('card_no')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        return self


class ApplyDubbridgeCustomerAgreementsignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sdk_params: str = None,
        custom_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # sdkParams返回给商户app客户端，作为客户端唤起sdk的入参
        self.sdk_params = sdk_params
        # 客户编号
        self.custom_no = custom_no

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
        if self.sdk_params is not None:
            result['sdk_params'] = self.sdk_params
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sdk_params') is not None:
            self.sdk_params = m.get('sdk_params')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        return self


class QueryDubbridgeAccountStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        custom_no: str = None,
        open_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户编号（资产方用户唯一标记二选一）
        self.custom_no = custom_no
        # 资产方用户唯一标识（资产方用户唯一标记二选一）
        self.open_id = open_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.open_id is not None:
            result['open_id'] = self.open_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        return self


class QueryDubbridgeAccountStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: CustomStatus = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授信申请状态
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
            temp_model = CustomStatus()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryDubbridgeAccountCustomRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        channel_code: str = None,
        custom_no: str = None,
        open_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 渠道号
        self.channel_code = channel_code
        # 客户编码
        self.custom_no = custom_no
        # open_id
        self.open_id = open_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.open_id is not None:
            result['open_id'] = self.open_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        return self


class QueryDubbridgeAccountCustomResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: CustomRelationStatus = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否进行过授信申请
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
            temp_model = CustomRelationStatus()
            self.data = temp_model.from_map(m['data'])
        return self


class UpdateDubbridgeAccountCustomRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        channel_code: str = None,
        new_open_id: str = None,
        source_open_id: str = None,
        customer_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 渠道编码
        self.channel_code = channel_code
        # 新渠道id
        self.new_open_id = new_open_id
        # 原渠道id
        self.source_open_id = source_open_id
        # 客户号
        self.customer_no = customer_no

    def validate(self):
        self.validate_required(self.channel_code, 'channel_code')
        self.validate_required(self.new_open_id, 'new_open_id')
        self.validate_required(self.source_open_id, 'source_open_id')
        self.validate_required(self.customer_no, 'customer_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.new_open_id is not None:
            result['new_open_id'] = self.new_open_id
        if self.source_open_id is not None:
            result['source_open_id'] = self.source_open_id
        if self.customer_no is not None:
            result['customer_no'] = self.customer_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('new_open_id') is not None:
            self.new_open_id = m.get('new_open_id')
        if m.get('source_open_id') is not None:
            self.source_open_id = m.get('source_open_id')
        if m.get('customer_no') is not None:
            self.customer_no = m.get('customer_no')
        return self


class UpdateDubbridgeAccountCustomResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: UpdateCustomerRelationResponseData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 更新渠道返回体
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
            temp_model = UpdateCustomerRelationResponseData()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryDubbridgeCustomerAgreementsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        custom_no: str = None,
        order_no: str = None,
        fund_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户编码
        self.custom_no = custom_no
        # 订单号
        self.order_no = order_no
        # 资金方编号
        self.fund_code = fund_code

    def validate(self):
        self.validate_required(self.custom_no, 'custom_no')
        self.validate_required(self.fund_code, 'fund_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.fund_code is not None:
            result['fund_code'] = self.fund_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('fund_code') is not None:
            self.fund_code = m.get('fund_code')
        return self


class QueryDubbridgeCustomerAgreementsignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        custom_no: str = None,
        trans_serials: str = None,
        status: str = None,
        sign_time: str = None,
        valid_time: str = None,
        invalid_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户编号
        self.custom_no = custom_no
        # 流水号(代扣协议中标示用户的唯一签约号)
        self.trans_serials = trans_serials
        # 协议签约状态(0-成功1-失败2-处理中)
        self.status = status
        # 协议签约时间(支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss)
        self.sign_time = sign_time
        # 协议生效时间(用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss)
        self.valid_time = valid_time
        # 协议失效时间(用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss)
        self.invalid_time = invalid_time

    def validate(self):
        if self.sign_time is not None:
            self.validate_pattern(self.sign_time, 'sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.valid_time is not None:
            self.validate_pattern(self.valid_time, 'valid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.invalid_time is not None:
            self.validate_pattern(self.invalid_time, 'invalid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.trans_serials is not None:
            result['trans_serials'] = self.trans_serials
        if self.status is not None:
            result['status'] = self.status
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.invalid_time is not None:
            result['invalid_time'] = self.invalid_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('trans_serials') is not None:
            self.trans_serials = m.get('trans_serials')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('invalid_time') is not None:
            self.invalid_time = m.get('invalid_time')
        return self


class UpdateDubbridgeCustomerInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        custom_name: str = None,
        census_register: str = None,
        card_no: str = None,
        mobile: str = None,
        custom_no: str = None,
        order_no: str = None,
        id_valid_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户姓名(可修改字段)
        self.custom_name = custom_name
        # 户籍所在地(可修改字段)
        self.census_register = census_register
        # 证件号码(可修改字段)
        self.card_no = card_no
        # 手机号码(可修改字段)
        self.mobile = mobile
        # 客户编号(唯一不变)
        self.custom_no = custom_no
        # 订单号
        self.order_no = order_no
        # 身份证有效期
        self.id_valid_date = id_valid_date

    def validate(self):
        self.validate_required(self.custom_no, 'custom_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.custom_name is not None:
            result['custom_name'] = self.custom_name
        if self.census_register is not None:
            result['census_register'] = self.census_register
        if self.card_no is not None:
            result['card_no'] = self.card_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.id_valid_date is not None:
            result['id_valid_date'] = self.id_valid_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('custom_name') is not None:
            self.custom_name = m.get('custom_name')
        if m.get('census_register') is not None:
            self.census_register = m.get('census_register')
        if m.get('card_no') is not None:
            self.card_no = m.get('card_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('id_valid_date') is not None:
            self.id_valid_date = m.get('id_valid_date')
        return self


class UpdateDubbridgeCustomerInfoResponse(TeaModel):
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


class QueryDubbridgeReceiptOverdueRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        contract_no: str = None,
        channel_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合同编码
        self.contract_no = contract_no
        # 渠道编码
        self.channel_code = channel_code

    def validate(self):
        self.validate_required(self.contract_no, 'contract_no')
        self.validate_required(self.channel_code, 'channel_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.contract_no is not None:
            result['contract_no'] = self.contract_no
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('contract_no') is not None:
            self.contract_no = m.get('contract_no')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        return self


class QueryDubbridgeReceiptOverdueResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: OverdueInfoResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 逾期信息响应
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
            temp_model = OverdueInfoResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class RepayDubbridgeRepayCheckstandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        repay_type: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用信申请订单号
        self.original_order_no = original_order_no
        # 还款类型1:当期结清，2：正常还款3：全部结清
        self.repay_type = repay_type
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.repay_type, 'repay_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class RepayDubbridgeRepayCheckstandResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        checkstand_address: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 收银台地址(成功就有值)
        self.checkstand_address = checkstand_address

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
        if self.checkstand_address is not None:
            result['checkstand_address'] = self.checkstand_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('checkstand_address') is not None:
            self.checkstand_address = m.get('checkstand_address')
        return self


class QueryDubbridgeRepayInfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 原还款订单号
        self.original_order_no = original_order_no
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class QueryDubbridgeRepayInfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repay_no: str = None,
        receipt_no: str = None,
        custom_no: str = None,
        custom_name: str = None,
        repay_type: str = None,
        repay_sign: str = None,
        repay_date: str = None,
        repay_amount: int = None,
        repay_principal: int = None,
        repay_interest: int = None,
        channel_amt: int = None,
        repay_fee: str = None,
        repay_punish: int = None,
        repay_account: str = None,
        repay_account_name: str = None,
        repay_mobile: str = None,
        repay_bank_no: str = None,
        repay_bank_name: str = None,
        repay_status: str = None,
        fail_reason: str = None,
        apply_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款编号
        self.repay_no = repay_no
        # 借据编码
        self.receipt_no = receipt_no
        # 客户编号
        self.custom_no = custom_no
        # 客户名称
        self.custom_name = custom_name
        # 还款类型1:提前还款，2：正常还款 3:批量还款 4：自由还款
        self.repay_type = repay_type
        # repay_sign
        self.repay_sign = repay_sign
        # 还款日期
        self.repay_date = repay_date
        # 实还总额
        self.repay_amount = repay_amount
        # 实还本金
        self.repay_principal = repay_principal
        # 实还利息
        self.repay_interest = repay_interest
        # 实还通道手续费
        self.channel_amt = channel_amt
        # 实还手续费
        self.repay_fee = repay_fee
        # 实收罚息
        self.repay_punish = repay_punish
        # 还款账户
        self.repay_account = repay_account
        # 还款账户名称
        self.repay_account_name = repay_account_name
        # 还款账户的手机号
        self.repay_mobile = repay_mobile
        # 还款账户银行行号
        self.repay_bank_no = repay_bank_no
        # 还款账户银行名称
        self.repay_bank_name = repay_bank_name
        # 还款状态0:失败 1成功 2-审批中 3-还款中
        self.repay_status = repay_status
        # 失败原因
        self.fail_reason = fail_reason
        # 授信申请编号
        self.apply_no = apply_no

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
        if self.repay_no is not None:
            result['repay_no'] = self.repay_no
        if self.receipt_no is not None:
            result['receipt_no'] = self.receipt_no
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.custom_name is not None:
            result['custom_name'] = self.custom_name
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.repay_sign is not None:
            result['repay_sign'] = self.repay_sign
        if self.repay_date is not None:
            result['repay_date'] = self.repay_date
        if self.repay_amount is not None:
            result['repay_amount'] = self.repay_amount
        if self.repay_principal is not None:
            result['repay_principal'] = self.repay_principal
        if self.repay_interest is not None:
            result['repay_interest'] = self.repay_interest
        if self.channel_amt is not None:
            result['channel_amt'] = self.channel_amt
        if self.repay_fee is not None:
            result['repay_fee'] = self.repay_fee
        if self.repay_punish is not None:
            result['repay_punish'] = self.repay_punish
        if self.repay_account is not None:
            result['repay_account'] = self.repay_account
        if self.repay_account_name is not None:
            result['repay_account_name'] = self.repay_account_name
        if self.repay_mobile is not None:
            result['repay_mobile'] = self.repay_mobile
        if self.repay_bank_no is not None:
            result['repay_bank_no'] = self.repay_bank_no
        if self.repay_bank_name is not None:
            result['repay_bank_name'] = self.repay_bank_name
        if self.repay_status is not None:
            result['repay_status'] = self.repay_status
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        if self.apply_no is not None:
            result['apply_no'] = self.apply_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('repay_no') is not None:
            self.repay_no = m.get('repay_no')
        if m.get('receipt_no') is not None:
            self.receipt_no = m.get('receipt_no')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('custom_name') is not None:
            self.custom_name = m.get('custom_name')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('repay_sign') is not None:
            self.repay_sign = m.get('repay_sign')
        if m.get('repay_date') is not None:
            self.repay_date = m.get('repay_date')
        if m.get('repay_amount') is not None:
            self.repay_amount = m.get('repay_amount')
        if m.get('repay_principal') is not None:
            self.repay_principal = m.get('repay_principal')
        if m.get('repay_interest') is not None:
            self.repay_interest = m.get('repay_interest')
        if m.get('channel_amt') is not None:
            self.channel_amt = m.get('channel_amt')
        if m.get('repay_fee') is not None:
            self.repay_fee = m.get('repay_fee')
        if m.get('repay_punish') is not None:
            self.repay_punish = m.get('repay_punish')
        if m.get('repay_account') is not None:
            self.repay_account = m.get('repay_account')
        if m.get('repay_account_name') is not None:
            self.repay_account_name = m.get('repay_account_name')
        if m.get('repay_mobile') is not None:
            self.repay_mobile = m.get('repay_mobile')
        if m.get('repay_bank_no') is not None:
            self.repay_bank_no = m.get('repay_bank_no')
        if m.get('repay_bank_name') is not None:
            self.repay_bank_name = m.get('repay_bank_name')
        if m.get('repay_status') is not None:
            self.repay_status = m.get('repay_status')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        if m.get('apply_no') is not None:
            self.apply_no = m.get('apply_no')
        return self


class QueryDubbridgeRepayListRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        original_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 用信申请订单号
        self.original_order_no = original_order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.original_order_no, 'original_order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        return self


class QueryDubbridgeRepayListResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repay_result_list: List[RepayResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款计划查询结果
        self.repay_result_list = repay_result_list

    def validate(self):
        if self.repay_result_list:
            for k in self.repay_result_list:
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
        result['repay_result_list'] = []
        if self.repay_result_list is not None:
            for k in self.repay_result_list:
                result['repay_result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.repay_result_list = []
        if m.get('repay_result_list') is not None:
            for k in m.get('repay_result_list'):
                temp_model = RepayResult()
                self.repay_result_list.append(temp_model.from_map(k))
        return self


class CountDubbridgeRepayReftrialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        original_order_no: str = None,
        prod_no: str = None,
        apply_amount: int = None,
        apply_period: int = None,
        repay_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 授信申请订单号
        self.original_order_no = original_order_no
        # 产品编号
        self.prod_no = prod_no
        # 借款金额
        self.apply_amount = apply_amount
        # 借款期数
        self.apply_period = apply_period
        # 还款方式1：等额本息，2：等额本金
        self.repay_type = repay_type

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.prod_no, 'prod_no')
        self.validate_required(self.apply_amount, 'apply_amount')
        self.validate_required(self.apply_period, 'apply_period')
        self.validate_required(self.repay_type, 'repay_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.prod_no is not None:
            result['prod_no'] = self.prod_no
        if self.apply_amount is not None:
            result['apply_amount'] = self.apply_amount
        if self.apply_period is not None:
            result['apply_period'] = self.apply_period
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('prod_no') is not None:
            self.prod_no = m.get('prod_no')
        if m.get('apply_amount') is not None:
            self.apply_amount = m.get('apply_amount')
        if m.get('apply_period') is not None:
            self.apply_period = m.get('apply_period')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        return self


class CountDubbridgeRepayReftrialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        repay_trail_list: List[RepayTrail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款计划试算结果
        self.repay_trail_list = repay_trail_list

    def validate(self):
        if self.repay_trail_list:
            for k in self.repay_trail_list:
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
        result['repay_trail_list'] = []
        if self.repay_trail_list is not None:
            for k in self.repay_trail_list:
                result['repay_trail_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.repay_trail_list = []
        if m.get('repay_trail_list') is not None:
            for k in m.get('repay_trail_list'):
                temp_model = RepayTrail()
                self.repay_trail_list.append(temp_model.from_map(k))
        return self


class CountDubbridgeRepayTrialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        repay_type: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用信申请订单号
        self.original_order_no = original_order_no
        # 还款类型1:当期结清，2：正常还款3：全部结清
        self.repay_type = repay_type
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.repay_type, 'repay_type')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CountDubbridgeRepayTrialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        real_principal: int = None,
        real_interest: int = None,
        real_over_amt: int = None,
        service_charge: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 还款本金
        self.real_principal = real_principal
        # 还款利息
        self.real_interest = real_interest
        # 还款费用
        self.real_over_amt = real_over_amt
        # 服务费
        self.service_charge = service_charge

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
        if self.real_principal is not None:
            result['real_principal'] = self.real_principal
        if self.real_interest is not None:
            result['real_interest'] = self.real_interest
        if self.real_over_amt is not None:
            result['real_over_amt'] = self.real_over_amt
        if self.service_charge is not None:
            result['service_charge'] = self.service_charge
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('real_principal') is not None:
            self.real_principal = m.get('real_principal')
        if m.get('real_interest') is not None:
            self.real_interest = m.get('real_interest')
        if m.get('real_over_amt') is not None:
            self.real_over_amt = m.get('real_over_amt')
        if m.get('service_charge') is not None:
            self.service_charge = m.get('service_charge')
        return self


class RepayDubbridgeRepayWithholdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        repay_type: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授信申请订单号
        self.original_order_no = original_order_no
        # 还款类型1:当期结清，2：正常还款3：全部结清
        self.repay_type = repay_type
        # 订单号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.repay_type, 'repay_type')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class RepayDubbridgeRepayWithholdResponse(TeaModel):
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


class QueryDubbridgeSearchContractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        customer_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 原用信订单号
        self.original_order_no = original_order_no
        # 客户号
        self.customer_no = customer_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.customer_no, 'customer_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.customer_no is not None:
            result['customer_no'] = self.customer_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('customer_no') is not None:
            self.customer_no = m.get('customer_no')
        return self


class QueryDubbridgeSearchContractResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        relation_no: str = None,
        contract_no: str = None,
        contract_name: str = None,
        contract_type: str = None,
        custom_no: str = None,
        save_path: str = None,
        contract_amount: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 关联编号（授信/用信）
        self.relation_no = relation_no
        # 合同编号
        self.contract_no = contract_no
        # 合同名称
        self.contract_name = contract_name
        # 合同类型：0:电子合同签署授权协议 1:借款合同 2:抵押合同 3:担保合同 4:用信合同 5:通用合同 6:征信授权书
        self.contract_type = contract_type
        # 客户编号
        self.custom_no = custom_no
        # 下载地址
        self.save_path = save_path
        # 合同金额
        self.contract_amount = contract_amount

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
        if self.relation_no is not None:
            result['relation_no'] = self.relation_no
        if self.contract_no is not None:
            result['contract_no'] = self.contract_no
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.save_path is not None:
            result['save_path'] = self.save_path
        if self.contract_amount is not None:
            result['contract_amount'] = self.contract_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('relation_no') is not None:
            self.relation_no = m.get('relation_no')
        if m.get('contract_no') is not None:
            self.contract_no = m.get('contract_no')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('save_path') is not None:
            self.save_path = m.get('save_path')
        if m.get('contract_amount') is not None:
            self.contract_amount = m.get('contract_amount')
        return self


class ApplyDubbridgeUsecreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        loan_amount: int = None,
        period: int = None,
        open_id: str = None,
        order_no: str = None,
        repay_type: str = None,
        loan_way: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授信申请订单号
        self.original_order_no = original_order_no
        # 用信金额
        self.loan_amount = loan_amount
        # 期数
        self.period = period
        # 资产方用户唯一标识
        self.open_id = open_id
        # 订单号
        self.order_no = order_no
        # 还款方式:1：等额本息，2：等额本金
        self.repay_type = repay_type
        # 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
        self.loan_way = loan_way

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.loan_amount, 'loan_amount')
        self.validate_required(self.period, 'period')
        self.validate_required(self.open_id, 'open_id')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.repay_type, 'repay_type')
        self.validate_required(self.loan_way, 'loan_way')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.loan_amount is not None:
            result['loan_amount'] = self.loan_amount
        if self.period is not None:
            result['period'] = self.period
        if self.open_id is not None:
            result['open_id'] = self.open_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.loan_way is not None:
            result['loan_way'] = self.loan_way
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('loan_amount') is not None:
            self.loan_amount = m.get('loan_amount')
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('loan_way') is not None:
            self.loan_way = m.get('loan_way')
        return self


class ApplyDubbridgeUsecreditResponse(TeaModel):
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


class QueryDubbridgeUsecreditStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        original_order_no: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用信申请订单号
        self.original_order_no = original_order_no
        # 请求网络流水号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class QueryDubbridgeUsecreditStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        msg: str = None,
        receipt_info: ReceiptInfo = None,
        repay_ref: List[RepayRef] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用信状态（0-通过/1-不通过2-处理中）
        self.status = status
        # 拒绝原因
        self.msg = msg
        # 借据信息
        self.receipt_info = receipt_info
        # 还款计划列表
        self.repay_ref = repay_ref

    def validate(self):
        if self.receipt_info:
            self.receipt_info.validate()
        if self.repay_ref:
            for k in self.repay_ref:
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
        if self.status is not None:
            result['status'] = self.status
        if self.msg is not None:
            result['msg'] = self.msg
        if self.receipt_info is not None:
            result['receipt_info'] = self.receipt_info.to_map()
        result['repay_ref'] = []
        if self.repay_ref is not None:
            for k in self.repay_ref:
                result['repay_ref'].append(k.to_map() if k else None)
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('receipt_info') is not None:
            temp_model = ReceiptInfo()
            self.receipt_info = temp_model.from_map(m['receipt_info'])
        self.repay_ref = []
        if m.get('repay_ref') is not None:
            for k in m.get('repay_ref'):
                temp_model = RepayRef()
                self.repay_ref.append(temp_model.from_map(k))
        return self


class QueryDubbridgeReceiptStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        open_id: str = None,
        custom_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # open_id
        self.open_id = open_id
        # 客户号
        self.custom_no = custom_no

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.open_id is not None:
            result['open_id'] = self.open_id
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        return self


class QueryDubbridgeReceiptStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: CustomReceiptStatus = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否结清结构体
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
            temp_model = CustomReceiptStatus()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryDubbridgeCustomerCommonagreementsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        custom_no: str = None,
        fund_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 客户编号
        self.custom_no = custom_no
        # 资金方编号
        self.fund_code = fund_code

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.custom_no, 'custom_no')
        self.validate_required(self.fund_code, 'fund_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.fund_code is not None:
            result['fund_code'] = self.fund_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('fund_code') is not None:
            self.fund_code = m.get('fund_code')
        return self


class QueryDubbridgeCustomerCommonagreementsignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        custom_no: str = None,
        custom_name: str = None,
        trans_serials: str = None,
        status: str = None,
        account_user_id: str = None,
        account_no: str = None,
        protocol_no: str = None,
        sign_time: str = None,
        valid_time: str = None,
        invalid_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客户编号
        self.custom_no = custom_no
        # 客户名称
        self.custom_name = custom_name
        # 流水号
        self.trans_serials = trans_serials
        # 签约状态
        self.status = status
        # 签约用户唯一标识
        self.account_user_id = account_user_id
        # 脱敏的签约账号
        self.account_no = account_no
        # 协议号
        self.protocol_no = protocol_no
        # 协议签约时间
        self.sign_time = sign_time
        # 协议生效时间
        self.valid_time = valid_time
        # 协议失效时间
        self.invalid_time = invalid_time

    def validate(self):
        if self.sign_time is not None:
            self.validate_pattern(self.sign_time, 'sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.valid_time is not None:
            self.validate_pattern(self.valid_time, 'valid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.invalid_time is not None:
            self.validate_pattern(self.invalid_time, 'invalid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        if self.custom_name is not None:
            result['custom_name'] = self.custom_name
        if self.trans_serials is not None:
            result['trans_serials'] = self.trans_serials
        if self.status is not None:
            result['status'] = self.status
        if self.account_user_id is not None:
            result['account_user_id'] = self.account_user_id
        if self.account_no is not None:
            result['account_no'] = self.account_no
        if self.protocol_no is not None:
            result['protocol_no'] = self.protocol_no
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.invalid_time is not None:
            result['invalid_time'] = self.invalid_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        if m.get('custom_name') is not None:
            self.custom_name = m.get('custom_name')
        if m.get('trans_serials') is not None:
            self.trans_serials = m.get('trans_serials')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('account_user_id') is not None:
            self.account_user_id = m.get('account_user_id')
        if m.get('account_no') is not None:
            self.account_no = m.get('account_no')
        if m.get('protocol_no') is not None:
            self.protocol_no = m.get('protocol_no')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('invalid_time') is not None:
            self.invalid_time = m.get('invalid_time')
        return self


class QueryDubbridgeCompanyItemsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        keyword: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询字段（公司名、产品名、平台名等不能为空）
        self.keyword = keyword

    def validate(self):
        self.validate_required(self.keyword, 'keyword')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.keyword is not None:
            result['keyword'] = self.keyword
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        return self


class QueryDubbridgeCompanyItemsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        business_items: List[CompanyItems] = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回公司列表
        self.business_items = business_items
        # 企业信息个数
        self.total = total

    def validate(self):
        if self.business_items:
            for k in self.business_items:
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
        result['business_items'] = []
        if self.business_items is not None:
            for k in self.business_items:
                result['business_items'].append(k.to_map() if k else None)
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.business_items = []
        if m.get('business_items') is not None:
            for k in m.get('business_items'):
                temp_model = CompanyItems()
                self.business_items.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class UpdateDubbridgeFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        original_order_no: str = None,
        custom_no: str = None,
        materials: List[Material] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_no = order_no
        # 授信申请订单号(资产方)
        self.original_order_no = original_order_no
        # 客户编号
        self.custom_no = custom_no
        # 资料文件
        self.materials = materials

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.original_order_no, 'original_order_no')
        self.validate_required(self.custom_no, 'custom_no')
        self.validate_required(self.materials, 'materials')
        if self.materials:
            for k in self.materials:
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
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.original_order_no is not None:
            result['original_order_no'] = self.original_order_no
        if self.custom_no is not None:
            result['custom_no'] = self.custom_no
        result['materials'] = []
        if self.materials is not None:
            for k in self.materials:
                result['materials'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('original_order_no') is not None:
            self.original_order_no = m.get('original_order_no')
        if m.get('custom_no') is not None:
            self.custom_no = m.get('custom_no')
        self.materials = []
        if m.get('materials') is not None:
            for k in m.get('materials'):
                temp_model = Material()
                self.materials.append(temp_model.from_map(k))
        return self


class UpdateDubbridgeFileResponse(TeaModel):
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


class QueryDubbridgeCreditUrlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class QueryDubbridgeCreditUrlResponse(TeaModel):
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


class QueryDubbridgeBusinessDetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        keyword: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询字段（注册号，社会统一信用代码，公司名称）
        self.keyword = keyword

    def validate(self):
        self.validate_required(self.keyword, 'keyword')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.keyword is not None:
            result['keyword'] = self.keyword
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        return self


class QueryDubbridgeBusinessDetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        uc_code: str = None,
        register_date: str = None,
        operating_addr_json: str = None,
        address_detail: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 社会统一信用代码
        self.uc_code = uc_code
        # 注册日期
        self.register_date = register_date
        # 经营地址
        self.operating_addr_json = operating_addr_json
        # 详细地址
        self.address_detail = address_detail

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
        if self.uc_code is not None:
            result['uc_code'] = self.uc_code
        if self.register_date is not None:
            result['register_date'] = self.register_date
        if self.operating_addr_json is not None:
            result['operating_addr_json'] = self.operating_addr_json
        if self.address_detail is not None:
            result['address_detail'] = self.address_detail
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('uc_code') is not None:
            self.uc_code = m.get('uc_code')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
        if m.get('operating_addr_json') is not None:
            self.operating_addr_json = m.get('operating_addr_json')
        if m.get('address_detail') is not None:
            self.address_detail = m.get('address_detail')
        return self


class VerifyFinserviceZhimaIdentifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        legal_person_cert_name: str = None,
        legal_person_cert_no: str = None,
        merchant_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需要校验的人姓名
        self.legal_person_cert_name = legal_person_cert_name
        # 需要校验的人身份证号
        self.legal_person_cert_no = legal_person_cert_no
        # 认证结束后的商户回调地址。
        self.merchant_url = merchant_url

    def validate(self):
        self.validate_required(self.legal_person_cert_name, 'legal_person_cert_name')
        self.validate_required(self.legal_person_cert_no, 'legal_person_cert_no')
        self.validate_required(self.merchant_url, 'merchant_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.legal_person_cert_name is not None:
            result['legal_person_cert_name'] = self.legal_person_cert_name
        if self.legal_person_cert_no is not None:
            result['legal_person_cert_no'] = self.legal_person_cert_no
        if self.merchant_url is not None:
            result['merchant_url'] = self.merchant_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('legal_person_cert_name') is not None:
            self.legal_person_cert_name = m.get('legal_person_cert_name')
        if m.get('legal_person_cert_no') is not None:
            self.legal_person_cert_no = m.get('legal_person_cert_no')
        if m.get('merchant_url') is not None:
            self.merchant_url = m.get('merchant_url')
        return self


class VerifyFinserviceZhimaIdentifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ZhimaIdentifyResp = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
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
            temp_model = ZhimaIdentifyResp()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryFinserviceZhimaIdentifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 初始化时候返回的唯一标识
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class QueryFinserviceZhimaIdentifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ZhimaQueryResp = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
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
            temp_model = ZhimaQueryResp()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryMdipDataserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_code: str = None,
        service_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 服务编码
        self.service_code = service_code
        # 服务参数
        self.service_param = service_param

    def validate(self):
        self.validate_required(self.service_code, 'service_code')
        self.validate_required(self.service_param, 'service_param')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.service_param is not None:
            result['service_param'] = self.service_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('service_param') is not None:
            self.service_param = m.get('service_param')
        return self


class QueryMdipDataserviceResponse(TeaModel):
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
        # 多源查询结果值
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


class ReceiveMdipParamsFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # file_id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class ReceiveMdipParamsFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content: RuntimeResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件上传结果
        self.content = content

    def validate(self):
        if self.content:
            self.content.validate()

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
        if self.content is not None:
            result['content'] = self.content.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content') is not None:
            temp_model = RuntimeResult()
            self.content = temp_model.from_map(m['content'])
        return self


class QueryRbbGenericInvokeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        permission: str = None,
        title: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # {"platformId":1234,"method":"riskQuery"}
        self.content = content
        # 账号的所有权限点，逗号分隔
        self.permission = permission
        # 标题备用
        self.title = title

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.permission, 'permission')
        self.validate_required(self.title, 'title')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.permission is not None:
            result['permission'] = self.permission
        if self.title is not None:
            result['title'] = self.title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('permission') is not None:
            self.permission = m.get('permission')
        if m.get('title') is not None:
            self.title = m.get('title')
        return self


class QueryRbbGenericInvokeResponse(TeaModel):
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
        # 返回数据内容
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


class CreateRbbTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        password: str = None,
        username: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展字段
        self.content = content
        # 新人用户密码，用来做映射生成token
        self.password = password
        # 用户
        self.username = username

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.password, 'password')
        self.validate_required(self.username, 'username')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.password is not None:
            result['password'] = self.password
        if self.username is not None:
            result['username'] = self.username
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('username') is not None:
            self.username = m.get('username')
        return self


class CreateRbbTokenResponse(TeaModel):
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


class CreateRbbApiGwtokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extension: str = None,
        password: str = None,
        username: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 扩展字段
        self.extension = extension
        # 新人用户密码，用来做映射生成token
        self.password = password
        # 用户
        self.username = username

    def validate(self):
        self.validate_required(self.password, 'password')
        self.validate_required(self.username, 'username')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.extension is not None:
            result['extension'] = self.extension
        if self.password is not None:
            result['password'] = self.password
        if self.username is not None:
            result['username'] = self.username
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('username') is not None:
            self.username = m.get('username')
        return self


class CreateRbbApiGwtokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        logintoken: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回登录token
        self.logintoken = logintoken

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
        if self.logintoken is not None:
            result['logintoken'] = self.logintoken
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('logintoken') is not None:
            self.logintoken = m.get('logintoken')
        return self


class QueryRbbGeneralRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        extension: str = None,
        queryname: str = None,
        queryparas: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 额外参数json
        self.extension = extension
        # 通用查询名称
        self.queryname = queryname
        # 查询参数JSON字符串
        self.queryparas = queryparas

    def validate(self):
        self.validate_required(self.queryname, 'queryname')
        if self.queryname is not None:
            self.validate_max_length(self.queryname, 'queryname', 200)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.extension is not None:
            result['extension'] = self.extension
        if self.queryname is not None:
            result['queryname'] = self.queryname
        if self.queryparas is not None:
            result['queryparas'] = self.queryparas
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        if m.get('queryname') is not None:
            self.queryname = m.get('queryname')
        if m.get('queryparas') is not None:
            self.queryparas = m.get('queryparas')
        return self


class QueryRbbGeneralResponse(TeaModel):
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
        # json字符串表示的通用查询结果
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


class GetRbbLoginTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        username: str = None,
        password: str = None,
        extension: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户名
        self.username = username
        # 密码
        self.password = password
        # 扩展json字符串
        self.extension = extension

    def validate(self):
        self.validate_required(self.username, 'username')
        self.validate_required(self.password, 'password')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.username is not None:
            result['username'] = self.username
        if self.password is not None:
            result['password'] = self.password
        if self.extension is not None:
            result['extension'] = self.extension
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('username') is not None:
            self.username = m.get('username')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('extension') is not None:
            self.extension = m.get('extension')
        return self


class GetRbbLoginTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        logintoken: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 登录token，5分钟有效
        self.logintoken = logintoken

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
        if self.logintoken is not None:
            result['logintoken'] = self.logintoken
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('logintoken') is not None:
            self.logintoken = m.get('logintoken')
        return self


class CreateRbbTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        effective_end_date: str = None,
        tenant_code: str = None,
        tenant_name: str = None,
        tenant_property_json: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户过期时间，不填表示永不过期
        self.effective_end_date = effective_end_date
        # 租户编码，必须全局唯一
        self.tenant_code = tenant_code
        # 租户名称
        self.tenant_name = tenant_name
        # 租户自定义属性，JSON格式，可以为空
        self.tenant_property_json = tenant_property_json

    def validate(self):
        if self.effective_end_date is not None:
            self.validate_pattern(self.effective_end_date, 'effective_end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.tenant_code, 'tenant_code')
        if self.tenant_code is not None:
            self.validate_max_length(self.tenant_code, 'tenant_code', 64)
        self.validate_required(self.tenant_name, 'tenant_name')
        if self.tenant_name is not None:
            self.validate_max_length(self.tenant_name, 'tenant_name', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.effective_end_date is not None:
            result['effective_end_date'] = self.effective_end_date
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.tenant_property_json is not None:
            result['tenant_property_json'] = self.tenant_property_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('effective_end_date') is not None:
            self.effective_end_date = m.get('effective_end_date')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('tenant_property_json') is not None:
            self.tenant_property_json = m.get('tenant_property_json')
        return self


class CreateRbbTenantResponse(TeaModel):
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


class CreateRbbUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        email: str = None,
        full_name: str = None,
        password: str = None,
        phone: str = None,
        tenant_code: str = None,
        user_name: str = None,
        user_property_json: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户邮箱，非必填
        self.email = email
        # 用户姓名、真实名称，不要求全局唯一
        self.full_name = full_name
        # 用户密码
        self.password = password
        # 用户电话号码，非必填
        self.phone = phone
        # 用户所属租户编码
        self.tenant_code = tenant_code
        # 用户名，必须全局唯一
        self.user_name = user_name
        # 用户属性扩展字段，json格式，可以为空
        self.user_property_json = user_property_json

    def validate(self):
        if self.email is not None:
            self.validate_max_length(self.email, 'email', 128)
        self.validate_required(self.full_name, 'full_name')
        if self.full_name is not None:
            self.validate_max_length(self.full_name, 'full_name', 64)
        self.validate_required(self.password, 'password')
        if self.password is not None:
            self.validate_max_length(self.password, 'password', 200)
        if self.phone is not None:
            self.validate_max_length(self.phone, 'phone', 64)
        if self.tenant_code is not None:
            self.validate_max_length(self.tenant_code, 'tenant_code', 64)
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.email is not None:
            result['email'] = self.email
        if self.full_name is not None:
            result['full_name'] = self.full_name
        if self.password is not None:
            result['password'] = self.password
        if self.phone is not None:
            result['phone'] = self.phone
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_property_json is not None:
            result['user_property_json'] = self.user_property_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('full_name') is not None:
            self.full_name = m.get('full_name')
        if m.get('password') is not None:
            self.password = m.get('password')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_property_json') is not None:
            self.user_property_json = m.get('user_property_json')
        return self


class CreateRbbUserResponse(TeaModel):
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


class ExecRbbCompanyGuardRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        keyword: str = None,
        rule_id: int = None,
        params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称或统一社会信用代码
        self.keyword = keyword
        # 规则ID，在风险大脑系统中配置
        self.rule_id = rule_id
        # 额外参数，与规则有关
        self.params = params

    def validate(self):
        self.validate_required(self.keyword, 'keyword')
        self.validate_required(self.rule_id, 'rule_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.keyword is not None:
            result['keyword'] = self.keyword
        if self.rule_id is not None:
            result['rule_id'] = self.rule_id
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        if m.get('rule_id') is not None:
            self.rule_id = m.get('rule_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class ExecRbbCompanyGuardResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        decision: str = None,
        results: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 决策结果，ACCEPT/REJECT/TBD
        self.decision = decision
        # 准入执行结果的快照
        self.results = results

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
        if self.decision is not None:
            result['decision'] = self.decision
        if self.results is not None:
            result['results'] = self.results
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('results') is not None:
            self.results = m.get('results')
        return self


class ApplyRbbCompanyCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        keyword: str = None,
        rule_id: int = None,
        params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称、统一社会信用代码
        self.keyword = keyword
        # 规则ID，需提前在蚁盾中进行配置
        self.rule_id = rule_id
        # 额外参数，与规则有关
        self.params = params

    def validate(self):
        self.validate_required(self.keyword, 'keyword')
        self.validate_required(self.rule_id, 'rule_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.keyword is not None:
            result['keyword'] = self.keyword
        if self.rule_id is not None:
            result['rule_id'] = self.rule_id
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        if m.get('rule_id') is not None:
            self.rule_id = m.get('rule_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class ApplyRbbCompanyCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询token，用于查询授信结果
        self.token = token

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
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QueryRbbCompanyCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询token，从apply接口获得
        self.token = token

    def validate(self):
        self.validate_required(self.token, 'token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QueryRbbCompanyCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        credit_amount: int = None,
        extra: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授信额度，单位元
        self.credit_amount = credit_amount
        # 额外特征字段
        self.extra = extra

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
        if self.credit_amount is not None:
            result['credit_amount'] = self.credit_amount
        if self.extra is not None:
            result['extra'] = self.extra
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('credit_amount') is not None:
            self.credit_amount = m.get('credit_amount')
        if m.get('extra') is not None:
            self.extra = m.get('extra')
        return self


class QueryRbbRegdatasyncPreparedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询该bizDate数据分区的数据是否已经准备好
        self.biz_date = biz_date

    def validate(self):
        self.validate_required(self.biz_date, 'biz_date')
        if self.biz_date is not None:
            self.validate_max_length(self.biz_date, 'biz_date', 8)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_date is not None:
            result['biz_date'] = self.biz_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_date') is not None:
            self.biz_date = m.get('biz_date')
        return self


class QueryRbbRegdatasyncPreparedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        prepared: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 指定时间分区的数据是否已经准备完毕
        self.prepared = prepared

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
        if self.prepared is not None:
            result['prepared'] = self.prepared
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('prepared') is not None:
            self.prepared = m.get('prepared')
        return self


class StartRbbRegdatasyncScheduleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 同步时间分区
        self.biz_date = biz_date

    def validate(self):
        self.validate_required(self.biz_date, 'biz_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_date is not None:
            result['biz_date'] = self.biz_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_date') is not None:
            self.biz_date = m.get('biz_date')
        return self


class StartRbbRegdatasyncScheduleResponse(TeaModel):
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


class FinishRbbRegdatasyncScheduleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_date: str = None,
        sync_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 时间分区
        self.biz_date = biz_date
        # 记录当前分区离线同步情况
        self.sync_info = sync_info

    def validate(self):
        self.validate_required(self.biz_date, 'biz_date')
        if self.biz_date is not None:
            self.validate_max_length(self.biz_date, 'biz_date', 8)
        self.validate_required(self.sync_info, 'sync_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_date is not None:
            result['biz_date'] = self.biz_date
        if self.sync_info is not None:
            result['sync_info'] = self.sync_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_date') is not None:
            self.biz_date = m.get('biz_date')
        if m.get('sync_info') is not None:
            self.sync_info = m.get('sync_info')
        return self


class FinishRbbRegdatasyncScheduleResponse(TeaModel):
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


class ApplyRbbCompanyGuardRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        keyword: str = None,
        rule_id: int = None,
        params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称、统一社会信用代码或注册号
        self.keyword = keyword
        # 规则ID
        self.rule_id = rule_id
        # 额外参数，与具体规则相关
        self.params = params

    def validate(self):
        self.validate_required(self.keyword, 'keyword')
        self.validate_required(self.rule_id, 'rule_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.keyword is not None:
            result['keyword'] = self.keyword
        if self.rule_id is not None:
            result['rule_id'] = self.rule_id
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        if m.get('rule_id') is not None:
            self.rule_id = m.get('rule_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class ApplyRbbCompanyGuardResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询token
        self.token = token

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
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QueryRbbCompanyGuardRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询token
        self.token = token

    def validate(self):
        self.validate_required(self.token, 'token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class QueryRbbCompanyGuardResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        decision: str = None,
        results: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 决策结果，ACCEPT/REJECT/TBD
        # 
        self.decision = decision
        # 准入执行结果的快照
        # 
        self.results = results

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
        if self.decision is not None:
            result['decision'] = self.decision
        if self.results is not None:
            result['results'] = self.results
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('results') is not None:
            self.results = m.get('results')
        return self


class QueryRbbObtsZsearchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        index: str = None,
        type: str = None,
        operation_method: str = None,
        entity_string: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 索引名称
        self.index = index
        # 类型名称
        self.type = type
        # 操作方法
        self.operation_method = operation_method
        # 查询语句
        self.entity_string = entity_string

    def validate(self):
        self.validate_required(self.index, 'index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.index is not None:
            result['index'] = self.index
        if self.type is not None:
            result['type'] = self.type
        if self.operation_method is not None:
            result['operation_method'] = self.operation_method
        if self.entity_string is not None:
            result['entity_string'] = self.entity_string
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('index') is not None:
            self.index = m.get('index')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('operation_method') is not None:
            self.operation_method = m.get('operation_method')
        if m.get('entity_string') is not None:
            self.entity_string = m.get('entity_string')
        return self


class QueryRbbObtsZsearchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        zsearch_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # zsearch查询结果
        self.zsearch_result = zsearch_result

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
        if self.zsearch_result is not None:
            result['zsearch_result'] = self.zsearch_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('zsearch_result') is not None:
            self.zsearch_result = m.get('zsearch_result')
        return self


class PushRbbCustomerCompanyinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        uc_code: str = None,
        company_name: str = None,
        type: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业的统一社会信用代码
        self.uc_code = uc_code
        # 企业名称
        self.company_name = company_name
        # 企业信息的类型
        self.type = type
        # 企业信息的内容
        self.content = content

    def validate(self):
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.uc_code is not None:
            result['uc_code'] = self.uc_code
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.type is not None:
            result['type'] = self.type
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('uc_code') is not None:
            self.uc_code = m.get('uc_code')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class PushRbbCustomerCompanyinfoResponse(TeaModel):
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


class QueryRpgwSignUrlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_code: str = None,
        platform_user_identification: str = None,
        user_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业标识，固定值
        self.company_code = company_code
        # 调用方平台用户id
        self.platform_user_identification = platform_user_identification
        # 手机号
        self.user_code = user_code

    def validate(self):
        self.validate_required(self.company_code, 'company_code')
        self.validate_required(self.platform_user_identification, 'platform_user_identification')
        self.validate_required(self.user_code, 'user_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_code is not None:
            result['company_code'] = self.company_code
        if self.platform_user_identification is not None:
            result['platform_user_identification'] = self.platform_user_identification
        if self.user_code is not None:
            result['user_code'] = self.user_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_code') is not None:
            self.company_code = m.get('company_code')
        if m.get('platform_user_identification') is not None:
            self.platform_user_identification = m.get('platform_user_identification')
        if m.get('user_code') is not None:
            self.user_code = m.get('user_code')
        return self


class QueryRpgwSignUrlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约地址
        self.result_data = result_data

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
        if self.result_data is not None:
            result['result_data'] = self.result_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_data') is not None:
            self.result_data = m.get('result_data')
        return self


class RegisterRpgwUserEinvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_code: str = None,
        platform_user_identification: str = None,
        identification_number: str = None,
        mobile_phone: str = None,
        user_name: str = None,
        identity_front_pic: str = None,
        identity_back_pic: str = None,
        idcard_validity_start: str = None,
        idcard_validity_end: str = None,
        identity_time: str = None,
        register_mode: str = None,
        register_time: str = None,
        face_pic: str = None,
        alipay_account: str = None,
        wxpay_account: str = None,
        bankcard_no: str = None,
        bank_name: str = None,
        bankcard_city: str = None,
        city: str = None,
        ext_json: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业标识，固定值
        self.company_code = company_code
        # 调用方平台用户id
        self.platform_user_identification = platform_user_identification
        # 身份证号码
        self.identification_number = identification_number
        # 用户手机号
        self.mobile_phone = mobile_phone
        # 用户姓名
        self.user_name = user_name
        # 身份证照片人像面照片url
        self.identity_front_pic = identity_front_pic
        # 身份证照片国徽面url
        self.identity_back_pic = identity_back_pic
        # 身份证有效期开始时间，格式yyyy-MM-dd
        self.idcard_validity_start = idcard_validity_start
        # 身份证有效期结束时间，格式yyyy-MM-dd
        self.idcard_validity_end = idcard_validity_end
        # 实名认证时间，格式yyyy-MM-dd HH:mm:ss
        self.identity_time = identity_time
        # 注册模式，固定值
        self.register_mode = register_mode
        # 注册时间，格式yyyy-MM-dd HH:mm:ss
        self.register_time = register_time
        # 用户人脸照片url
        self.face_pic = face_pic
        # 支付宝账号，实名认证的支付宝登录邮箱或手机登录，其账户姓名好和实人认证姓名一致
        self.alipay_account = alipay_account
        # 微信支付个人账户（openid）
        self.wxpay_account = wxpay_account
        # 银行卡号，标准一类或二类卡格式，持卡人为本用户
        self.bankcard_no = bankcard_no
        # 开户行名称
        self.bank_name = bank_name
        # 开户行归属地省市
        self.bankcard_city = bankcard_city
        # 用户所在省市
        self.city = city
        # 拓展信息
        self.ext_json = ext_json

    def validate(self):
        self.validate_required(self.company_code, 'company_code')
        self.validate_required(self.platform_user_identification, 'platform_user_identification')
        self.validate_required(self.identification_number, 'identification_number')
        self.validate_required(self.mobile_phone, 'mobile_phone')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.identity_front_pic, 'identity_front_pic')
        self.validate_required(self.identity_back_pic, 'identity_back_pic')
        self.validate_required(self.idcard_validity_start, 'idcard_validity_start')
        self.validate_required(self.idcard_validity_end, 'idcard_validity_end')
        self.validate_required(self.identity_time, 'identity_time')
        self.validate_required(self.register_mode, 'register_mode')
        self.validate_required(self.register_time, 'register_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_code is not None:
            result['company_code'] = self.company_code
        if self.platform_user_identification is not None:
            result['platform_user_identification'] = self.platform_user_identification
        if self.identification_number is not None:
            result['identification_number'] = self.identification_number
        if self.mobile_phone is not None:
            result['mobile_phone'] = self.mobile_phone
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.identity_front_pic is not None:
            result['identity_front_pic'] = self.identity_front_pic
        if self.identity_back_pic is not None:
            result['identity_back_pic'] = self.identity_back_pic
        if self.idcard_validity_start is not None:
            result['idcard_validity_start'] = self.idcard_validity_start
        if self.idcard_validity_end is not None:
            result['idcard_validity_end'] = self.idcard_validity_end
        if self.identity_time is not None:
            result['identity_time'] = self.identity_time
        if self.register_mode is not None:
            result['register_mode'] = self.register_mode
        if self.register_time is not None:
            result['register_time'] = self.register_time
        if self.face_pic is not None:
            result['face_pic'] = self.face_pic
        if self.alipay_account is not None:
            result['alipay_account'] = self.alipay_account
        if self.wxpay_account is not None:
            result['wxpay_account'] = self.wxpay_account
        if self.bankcard_no is not None:
            result['bankcard_no'] = self.bankcard_no
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.bankcard_city is not None:
            result['bankcard_city'] = self.bankcard_city
        if self.city is not None:
            result['city'] = self.city
        if self.ext_json is not None:
            result['ext_json'] = self.ext_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_code') is not None:
            self.company_code = m.get('company_code')
        if m.get('platform_user_identification') is not None:
            self.platform_user_identification = m.get('platform_user_identification')
        if m.get('identification_number') is not None:
            self.identification_number = m.get('identification_number')
        if m.get('mobile_phone') is not None:
            self.mobile_phone = m.get('mobile_phone')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('identity_front_pic') is not None:
            self.identity_front_pic = m.get('identity_front_pic')
        if m.get('identity_back_pic') is not None:
            self.identity_back_pic = m.get('identity_back_pic')
        if m.get('idcard_validity_start') is not None:
            self.idcard_validity_start = m.get('idcard_validity_start')
        if m.get('idcard_validity_end') is not None:
            self.idcard_validity_end = m.get('idcard_validity_end')
        if m.get('identity_time') is not None:
            self.identity_time = m.get('identity_time')
        if m.get('register_mode') is not None:
            self.register_mode = m.get('register_mode')
        if m.get('register_time') is not None:
            self.register_time = m.get('register_time')
        if m.get('face_pic') is not None:
            self.face_pic = m.get('face_pic')
        if m.get('alipay_account') is not None:
            self.alipay_account = m.get('alipay_account')
        if m.get('wxpay_account') is not None:
            self.wxpay_account = m.get('wxpay_account')
        if m.get('bankcard_no') is not None:
            self.bankcard_no = m.get('bankcard_no')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('bankcard_city') is not None:
            self.bankcard_city = m.get('bankcard_city')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('ext_json') is not None:
            self.ext_json = m.get('ext_json')
        return self


class RegisterRpgwUserEinvoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户在我方的id
        self.result_data = result_data

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
        if self.result_data is not None:
            result['result_data'] = self.result_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_data') is not None:
            self.result_data = m.get('result_data')
        return self


class QueryRpgwUserSignurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_code: str = None,
        platform_user_identification: str = None,
        user_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业标识，固定值
        self.company_code = company_code
        # 调用方平台用户id
        self.platform_user_identification = platform_user_identification
        # 手机号
        self.user_code = user_code

    def validate(self):
        self.validate_required(self.company_code, 'company_code')
        self.validate_required(self.platform_user_identification, 'platform_user_identification')
        self.validate_required(self.user_code, 'user_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_code is not None:
            result['company_code'] = self.company_code
        if self.platform_user_identification is not None:
            result['platform_user_identification'] = self.platform_user_identification
        if self.user_code is not None:
            result['user_code'] = self.user_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_code') is not None:
            self.company_code = m.get('company_code')
        if m.get('platform_user_identification') is not None:
            self.platform_user_identification = m.get('platform_user_identification')
        if m.get('user_code') is not None:
            self.user_code = m.get('user_code')
        return self


class QueryRpgwUserSignurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约地址
        self.result_data = result_data

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
        if self.result_data is not None:
            result['result_data'] = self.result_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_data') is not None:
            self.result_data = m.get('result_data')
        return self


class WithdrawRpgwUserCommissionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_number: str = None,
        user_order_numbers: str = None,
        withdrawer_id: str = None,
        withdrawer_alipay_id: str = None,
        withdrawer_name: str = None,
        withdrawer_phone_number: str = None,
        withdrawer_id_number: str = None,
        withdraw_amount: str = None,
        order_title: str = None,
        remark: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 提现业务单号
        self.order_number = order_number
        # 任务单号
        self.user_order_numbers = user_order_numbers
        # 提现人id
        self.withdrawer_id = withdrawer_id
        # 提现人支付宝id
        self.withdrawer_alipay_id = withdrawer_alipay_id
        # 提现人姓名
        self.withdrawer_name = withdrawer_name
        # 提现人手机
        self.withdrawer_phone_number = withdrawer_phone_number
        # 提现人身份证
        self.withdrawer_id_number = withdrawer_id_number
        # 提现金额
        self.withdraw_amount = withdraw_amount
        # 提现附言
        self.order_title = order_title
        # 业务备注
        self.remark = remark

    def validate(self):
        self.validate_required(self.order_number, 'order_number')
        self.validate_required(self.user_order_numbers, 'user_order_numbers')
        self.validate_required(self.withdrawer_id, 'withdrawer_id')
        self.validate_required(self.withdrawer_alipay_id, 'withdrawer_alipay_id')
        self.validate_required(self.withdrawer_name, 'withdrawer_name')
        self.validate_required(self.withdrawer_id_number, 'withdrawer_id_number')
        self.validate_required(self.withdraw_amount, 'withdraw_amount')
        self.validate_required(self.order_title, 'order_title')
        self.validate_required(self.remark, 'remark')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_number is not None:
            result['order_number'] = self.order_number
        if self.user_order_numbers is not None:
            result['user_order_numbers'] = self.user_order_numbers
        if self.withdrawer_id is not None:
            result['withdrawer_id'] = self.withdrawer_id
        if self.withdrawer_alipay_id is not None:
            result['withdrawer_alipay_id'] = self.withdrawer_alipay_id
        if self.withdrawer_name is not None:
            result['withdrawer_name'] = self.withdrawer_name
        if self.withdrawer_phone_number is not None:
            result['withdrawer_phone_number'] = self.withdrawer_phone_number
        if self.withdrawer_id_number is not None:
            result['withdrawer_id_number'] = self.withdrawer_id_number
        if self.withdraw_amount is not None:
            result['withdraw_amount'] = self.withdraw_amount
        if self.order_title is not None:
            result['order_title'] = self.order_title
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_number') is not None:
            self.order_number = m.get('order_number')
        if m.get('user_order_numbers') is not None:
            self.user_order_numbers = m.get('user_order_numbers')
        if m.get('withdrawer_id') is not None:
            self.withdrawer_id = m.get('withdrawer_id')
        if m.get('withdrawer_alipay_id') is not None:
            self.withdrawer_alipay_id = m.get('withdrawer_alipay_id')
        if m.get('withdrawer_name') is not None:
            self.withdrawer_name = m.get('withdrawer_name')
        if m.get('withdrawer_phone_number') is not None:
            self.withdrawer_phone_number = m.get('withdrawer_phone_number')
        if m.get('withdrawer_id_number') is not None:
            self.withdrawer_id_number = m.get('withdrawer_id_number')
        if m.get('withdraw_amount') is not None:
            self.withdraw_amount = m.get('withdraw_amount')
        if m.get('order_title') is not None:
            self.order_title = m.get('order_title')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class WithdrawRpgwUserCommissionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 提现结果
        self.result_data = result_data

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
        if self.result_data is not None:
            result['result_data'] = self.result_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_data') is not None:
            self.result_data = m.get('result_data')
        return self


class SyncRpgwUserOrderinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_number: str = None,
        order_type: str = None,
        order_amount: str = None,
        order_time: str = None,
        inviter_id: str = None,
        inviter_name: str = None,
        inviter_phone_number: str = None,
        inviter_id_number: str = None,
        invitation_code: str = None,
        invitee_id: str = None,
        invitee_name: str = None,
        invitee_phone_number: str = None,
        invitee_id_number: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_number = order_number
        # REGISTER与PURCHASE二选一
        self.order_type = order_type
        # 注册/下单总佣金
        self.order_amount = order_amount
        # 时间，格式为yyyy-MM-dd HH:mm:ss
        self.order_time = order_time
        # 邀请人id
        self.inviter_id = inviter_id
        # 邀请人姓名
        self.inviter_name = inviter_name
        # 邀请人手机号
        self.inviter_phone_number = inviter_phone_number
        # 邀请人身份证号
        self.inviter_id_number = inviter_id_number
        # 邀请码
        self.invitation_code = invitation_code
        # 被邀请人id
        self.invitee_id = invitee_id
        # 被邀请人姓名
        self.invitee_name = invitee_name
        # 被邀请人手机号
        self.invitee_phone_number = invitee_phone_number
        # 被邀请人身份证
        self.invitee_id_number = invitee_id_number

    def validate(self):
        self.validate_required(self.order_number, 'order_number')
        self.validate_required(self.order_type, 'order_type')
        self.validate_required(self.order_amount, 'order_amount')
        self.validate_required(self.order_time, 'order_time')
        self.validate_required(self.inviter_id, 'inviter_id')
        self.validate_required(self.inviter_name, 'inviter_name')
        self.validate_required(self.inviter_phone_number, 'inviter_phone_number')
        self.validate_required(self.inviter_id_number, 'inviter_id_number')
        self.validate_required(self.invitee_id, 'invitee_id')
        self.validate_required(self.invitee_phone_number, 'invitee_phone_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_number is not None:
            result['order_number'] = self.order_number
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.order_amount is not None:
            result['order_amount'] = self.order_amount
        if self.order_time is not None:
            result['order_time'] = self.order_time
        if self.inviter_id is not None:
            result['inviter_id'] = self.inviter_id
        if self.inviter_name is not None:
            result['inviter_name'] = self.inviter_name
        if self.inviter_phone_number is not None:
            result['inviter_phone_number'] = self.inviter_phone_number
        if self.inviter_id_number is not None:
            result['inviter_id_number'] = self.inviter_id_number
        if self.invitation_code is not None:
            result['invitation_code'] = self.invitation_code
        if self.invitee_id is not None:
            result['invitee_id'] = self.invitee_id
        if self.invitee_name is not None:
            result['invitee_name'] = self.invitee_name
        if self.invitee_phone_number is not None:
            result['invitee_phone_number'] = self.invitee_phone_number
        if self.invitee_id_number is not None:
            result['invitee_id_number'] = self.invitee_id_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_number') is not None:
            self.order_number = m.get('order_number')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('order_amount') is not None:
            self.order_amount = m.get('order_amount')
        if m.get('order_time') is not None:
            self.order_time = m.get('order_time')
        if m.get('inviter_id') is not None:
            self.inviter_id = m.get('inviter_id')
        if m.get('inviter_name') is not None:
            self.inviter_name = m.get('inviter_name')
        if m.get('inviter_phone_number') is not None:
            self.inviter_phone_number = m.get('inviter_phone_number')
        if m.get('inviter_id_number') is not None:
            self.inviter_id_number = m.get('inviter_id_number')
        if m.get('invitation_code') is not None:
            self.invitation_code = m.get('invitation_code')
        if m.get('invitee_id') is not None:
            self.invitee_id = m.get('invitee_id')
        if m.get('invitee_name') is not None:
            self.invitee_name = m.get('invitee_name')
        if m.get('invitee_phone_number') is not None:
            self.invitee_phone_number = m.get('invitee_phone_number')
        if m.get('invitee_id_number') is not None:
            self.invitee_id_number = m.get('invitee_id_number')
        return self


class SyncRpgwUserOrderinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 同步结果
        self.result_data = result_data

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
        if self.result_data is not None:
            result['result_data'] = self.result_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_data') is not None:
            self.result_data = m.get('result_data')
        return self


class NotifyRpgwUserSignresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        platform_user_identification: str = None,
        user_code: str = None,
        sign_result: str = None,
        result_desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用方平台用户id
        self.platform_user_identification = platform_user_identification
        # 用户手机号
        self.user_code = user_code
        # 签约结果，1成功，0失败
        self.sign_result = sign_result
        # 失败原因描述
        self.result_desc = result_desc

    def validate(self):
        self.validate_required(self.platform_user_identification, 'platform_user_identification')
        self.validate_required(self.user_code, 'user_code')
        self.validate_required(self.sign_result, 'sign_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.platform_user_identification is not None:
            result['platform_user_identification'] = self.platform_user_identification
        if self.user_code is not None:
            result['user_code'] = self.user_code
        if self.sign_result is not None:
            result['sign_result'] = self.sign_result
        if self.result_desc is not None:
            result['result_desc'] = self.result_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('platform_user_identification') is not None:
            self.platform_user_identification = m.get('platform_user_identification')
        if m.get('user_code') is not None:
            self.user_code = m.get('user_code')
        if m.get('sign_result') is not None:
            self.sign_result = m.get('sign_result')
        if m.get('result_desc') is not None:
            self.result_desc = m.get('result_desc')
        return self


class NotifyRpgwUserSignresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 通知结果
        self.result_data = result_data

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
        if self.result_data is not None:
            result['result_data'] = self.result_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_data') is not None:
            self.result_data = m.get('result_data')
        return self


class QueryRtopCompanyOpinionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        end_time: str = None,
        page_num: int = None,
        page_size: int = None,
        place_name: str = None,
        place_type: str = None,
        start_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 结束时间
        self.end_time = end_time
        # 页码
        self.page_num = page_num
        # 一页的数量
        self.page_size = page_size
        # 所在地的名称
        self.place_name = place_name
        # 地区类型
        self.place_type = place_type
        # 开始时间
        self.start_time = start_time

    def validate(self):
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.place_name, 'place_name')
        self.validate_required(self.place_type, 'place_type')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class QueryRtopCompanyOpinionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_opinion_count: List[RtopCompanyOpinionCount] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        self.company_opinion_count = company_opinion_count
        # 页码
        self.page_num = page_num
        # 一页的数量
        self.page_size = page_size
        # 总的记录数
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.company_opinion_count, 'company_opinion_count')
        if self.company_opinion_count:
            for k in self.company_opinion_count:
                if k:
                    k.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_count, 'total_count')

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
        result['company_opinion_count'] = []
        if self.company_opinion_count is not None:
            for k in self.company_opinion_count:
                result['company_opinion_count'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.company_opinion_count = []
        if m.get('company_opinion_count') is not None:
            for k in m.get('company_opinion_count'):
                temp_model = RtopCompanyOpinionCount()
                self.company_opinion_count.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class ListRtopCompanyOpinionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_name: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 地区类型
        self.company_name = company_name
        # 页码
        self.page_num = page_num
        # 一页的数量
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListRtopCompanyOpinionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_opinion_details: List[RtopCompanyOpinionDetail] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        self.company_opinion_details = company_opinion_details
        # 页码
        self.page_num = page_num
        # 一页的数量
        self.page_size = page_size
        # 总的记录数
        self.total_count = total_count

    def validate(self):
        self.validate_required(self.company_opinion_details, 'company_opinion_details')
        if self.company_opinion_details:
            for k in self.company_opinion_details:
                if k:
                    k.validate()
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_count, 'total_count')

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
        result['company_opinion_details'] = []
        if self.company_opinion_details is not None:
            for k in self.company_opinion_details:
                result['company_opinion_details'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.company_opinion_details = []
        if m.get('company_opinion_details') is not None:
            for k in m.get('company_opinion_details'):
                temp_model = RtopCompanyOpinionDetail()
                self.company_opinion_details.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class GetRtopCompanyMonitorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 地区类型
        self.company_name = company_name

    def validate(self):
        self.validate_required(self.company_name, 'company_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        return self


class GetRtopCompanyMonitorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        active_city: str = None,
        company_category: str = None,
        crowd_risk_type: str = None,
        features: List[RtopMonitorCompanyFeature] = None,
        money_involved: int = None,
        monitor_risk_tags: List[str] = None,
        monitor_score: int = None,
        people_involved: int = None,
        registered_city: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 活跃市，不带国家和地区的代码
        self.active_city = active_city
        # 监测企业的行业
        self.company_category = company_category
        # 涉众风险类型
        self.crowd_risk_type = crowd_risk_type
        self.features = features
        # 影响金额
        self.money_involved = money_involved
        self.monitor_risk_tags = monitor_risk_tags
        # 监测企业的评分
        self.monitor_score = monitor_score
        # 影响人数
        self.people_involved = people_involved
        # 注册市，不带国家和地区的代码
        self.registered_city = registered_city

    def validate(self):
        self.validate_required(self.active_city, 'active_city')
        self.validate_required(self.crowd_risk_type, 'crowd_risk_type')
        self.validate_required(self.features, 'features')
        if self.features:
            for k in self.features:
                if k:
                    k.validate()
        self.validate_required(self.money_involved, 'money_involved')
        self.validate_required(self.monitor_risk_tags, 'monitor_risk_tags')
        self.validate_required(self.monitor_score, 'monitor_score')
        self.validate_required(self.people_involved, 'people_involved')
        self.validate_required(self.registered_city, 'registered_city')

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
        if self.active_city is not None:
            result['active_city'] = self.active_city
        if self.company_category is not None:
            result['company_category'] = self.company_category
        if self.crowd_risk_type is not None:
            result['crowd_risk_type'] = self.crowd_risk_type
        result['features'] = []
        if self.features is not None:
            for k in self.features:
                result['features'].append(k.to_map() if k else None)
        if self.money_involved is not None:
            result['money_involved'] = self.money_involved
        if self.monitor_risk_tags is not None:
            result['monitor_risk_tags'] = self.monitor_risk_tags
        if self.monitor_score is not None:
            result['monitor_score'] = self.monitor_score
        if self.people_involved is not None:
            result['people_involved'] = self.people_involved
        if self.registered_city is not None:
            result['registered_city'] = self.registered_city
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('active_city') is not None:
            self.active_city = m.get('active_city')
        if m.get('company_category') is not None:
            self.company_category = m.get('company_category')
        if m.get('crowd_risk_type') is not None:
            self.crowd_risk_type = m.get('crowd_risk_type')
        self.features = []
        if m.get('features') is not None:
            for k in m.get('features'):
                temp_model = RtopMonitorCompanyFeature()
                self.features.append(temp_model.from_map(k))
        if m.get('money_involved') is not None:
            self.money_involved = m.get('money_involved')
        if m.get('monitor_risk_tags') is not None:
            self.monitor_risk_tags = m.get('monitor_risk_tags')
        if m.get('monitor_score') is not None:
            self.monitor_score = m.get('monitor_score')
        if m.get('people_involved') is not None:
            self.people_involved = m.get('people_involved')
        if m.get('registered_city') is not None:
            self.registered_city = m.get('registered_city')
        return self


class QueryRtopCrowdriskStatisticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        end_time: str = None,
        place_name: str = None,
        place_type: str = None,
        start_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 结束时间
        self.end_time = end_time
        # 所在地的名称
        self.place_name = place_name
        # 地区类型
        self.place_type = place_type
        # 开始时间
        self.start_time = start_time

    def validate(self):
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class QueryRtopCrowdriskStatisticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        level_distribution: List[RtopLevelDistribution] = None,
        region_distribution: List[RtopRegionalDistribution] = None,
        type_distribution: List[RtopTypeDistribution] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        self.level_distribution = level_distribution
        # 按地区统计
        self.region_distribution = region_distribution
        self.type_distribution = type_distribution

    def validate(self):
        if self.level_distribution:
            for k in self.level_distribution:
                if k:
                    k.validate()
        if self.region_distribution:
            for k in self.region_distribution:
                if k:
                    k.validate()
        if self.type_distribution:
            for k in self.type_distribution:
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
        result['level_distribution'] = []
        if self.level_distribution is not None:
            for k in self.level_distribution:
                result['level_distribution'].append(k.to_map() if k else None)
        result['region_distribution'] = []
        if self.region_distribution is not None:
            for k in self.region_distribution:
                result['region_distribution'].append(k.to_map() if k else None)
        result['type_distribution'] = []
        if self.type_distribution is not None:
            for k in self.type_distribution:
                result['type_distribution'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.level_distribution = []
        if m.get('level_distribution') is not None:
            for k in m.get('level_distribution'):
                temp_model = RtopLevelDistribution()
                self.level_distribution.append(temp_model.from_map(k))
        self.region_distribution = []
        if m.get('region_distribution') is not None:
            for k in m.get('region_distribution'):
                temp_model = RtopRegionalDistribution()
                self.region_distribution.append(temp_model.from_map(k))
        self.type_distribution = []
        if m.get('type_distribution') is not None:
            for k in m.get('type_distribution'):
                temp_model = RtopTypeDistribution()
                self.type_distribution.append(temp_model.from_map(k))
        return self


class ListRtopCrowdriskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        active_places: List[str] = None,
        crowd_risk_levels: List[str] = None,
        crowd_risk_types: List[str] = None,
        end_time: str = None,
        page_num: int = None,
        page_size: int = None,
        place_name: str = None,
        place_type: str = None,
        reg_places: List[str] = None,
        sort_by: str = None,
        sort_type: str = None,
        start_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活跃地筛选
        self.active_places = active_places
        # 风险等级
        self.crowd_risk_levels = crowd_risk_levels
        # 风险类型
        self.crowd_risk_types = crowd_risk_types
        # 结束时间
        self.end_time = end_time
        # 页码
        self.page_num = page_num
        # 每页条数
        self.page_size = page_size
        # 所在地的名称
        self.place_name = place_name
        # 地区类型
        self.place_type = place_type
        # 注册地筛选
        self.reg_places = reg_places
        # 排序字段
        self.sort_by = sort_by
        # 排序方式
        self.sort_type = sort_type
        # 开始时间
        self.start_time = start_time

    def validate(self):
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.active_places is not None:
            result['active_places'] = self.active_places
        if self.crowd_risk_levels is not None:
            result['crowd_risk_levels'] = self.crowd_risk_levels
        if self.crowd_risk_types is not None:
            result['crowd_risk_types'] = self.crowd_risk_types
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.reg_places is not None:
            result['reg_places'] = self.reg_places
        if self.sort_by is not None:
            result['sort_by'] = self.sort_by
        if self.sort_type is not None:
            result['sort_type'] = self.sort_type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('active_places') is not None:
            self.active_places = m.get('active_places')
        if m.get('crowd_risk_levels') is not None:
            self.crowd_risk_levels = m.get('crowd_risk_levels')
        if m.get('crowd_risk_types') is not None:
            self.crowd_risk_types = m.get('crowd_risk_types')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('reg_places') is not None:
            self.reg_places = m.get('reg_places')
        if m.get('sort_by') is not None:
            self.sort_by = m.get('sort_by')
        if m.get('sort_type') is not None:
            self.sort_type = m.get('sort_type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class ListRtopCrowdriskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        companys: List[RtopCrowdRiskSummaryResp] = None,
        page_num: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业列表
        self.companys = companys
        # 页码
        self.page_num = page_num
        # 每页条数
        self.page_size = page_size
        # 总数
        self.total_count = total_count

    def validate(self):
        if self.companys:
            for k in self.companys:
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
        result['companys'] = []
        if self.companys is not None:
            for k in self.companys:
                result['companys'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.companys = []
        if m.get('companys') is not None:
            for k in m.get('companys'):
                temp_model = RtopCrowdRiskSummaryResp()
                self.companys.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class QueryRtopCrowdriskDetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
        place_name: str = None,
        place_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业ID
        self.company_id = company_id
        # 所在地的名称
        self.place_name = place_name
        # 地区类型
        self.place_type = place_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        return self


class QueryRtopCrowdriskDetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        active_city: str = None,
        active_county: str = None,
        active_province: str = None,
        age_distribution: List[RtopAgeDistribution] = None,
        clue_tags: List[str] = None,
        conclusion: str = None,
        crowd_risk_level: str = None,
        crowd_risk_score: int = None,
        crowd_risk_type: str = None,
        detected_time: str = None,
        features: List[RtopCrowdRiskFeatureResp] = None,
        gender_distribution: List[RtopGenderDistribution] = None,
        last_active_time: str = None,
        money_involved: int = None,
        money_involved_history: List[RtopDateDistribution] = None,
        people_involved: int = None,
        people_involved_history: List[RtopDateDistribution] = None,
        population_distribution: List[RtopPopulationDistribution] = None,
        registered_city: str = None,
        registered_county: str = None,
        registered_province: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 活跃市
        self.active_city = active_city
        # 活跃县
        self.active_county = active_county
        # 活跃省
        self.active_province = active_province
        # 年龄分布
        self.age_distribution = age_distribution
        # 线索标签
        self.clue_tags = clue_tags
        # 报文
        self.conclusion = conclusion
        # 风险等级
        self.crowd_risk_level = crowd_risk_level
        # 涉众风险分析的分数
        self.crowd_risk_score = crowd_risk_score
        # 风险类型
        self.crowd_risk_type = crowd_risk_type
        # 发现时间
        self.detected_time = detected_time
        # 特征
        self.features = features
        # 性别分布
        self.gender_distribution = gender_distribution
        # 上次活跃时间
        self.last_active_time = last_active_time
        # 涉案金额
        self.money_involved = money_involved
        # 影响金额的历史曲线
        self.money_involved_history = money_involved_history
        # 涉案人数
        self.people_involved = people_involved
        # 影响人数的历史曲线
        self.people_involved_history = people_involved_history
        # 影响的人数分布，key为地区城市，value为影响的人数
        self.population_distribution = population_distribution
        # 注册市
        self.registered_city = registered_city
        # 注册县
        self.registered_county = registered_county
        # 注册省
        self.registered_province = registered_province

    def validate(self):
        if self.age_distribution:
            for k in self.age_distribution:
                if k:
                    k.validate()
        if self.detected_time is not None:
            self.validate_pattern(self.detected_time, 'detected_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.features:
            for k in self.features:
                if k:
                    k.validate()
        if self.gender_distribution:
            for k in self.gender_distribution:
                if k:
                    k.validate()
        if self.last_active_time is not None:
            self.validate_pattern(self.last_active_time, 'last_active_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.money_involved_history:
            for k in self.money_involved_history:
                if k:
                    k.validate()
        if self.people_involved_history:
            for k in self.people_involved_history:
                if k:
                    k.validate()
        if self.population_distribution:
            for k in self.population_distribution:
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
        if self.active_city is not None:
            result['active_city'] = self.active_city
        if self.active_county is not None:
            result['active_county'] = self.active_county
        if self.active_province is not None:
            result['active_province'] = self.active_province
        result['age_distribution'] = []
        if self.age_distribution is not None:
            for k in self.age_distribution:
                result['age_distribution'].append(k.to_map() if k else None)
        if self.clue_tags is not None:
            result['clue_tags'] = self.clue_tags
        if self.conclusion is not None:
            result['conclusion'] = self.conclusion
        if self.crowd_risk_level is not None:
            result['crowd_risk_level'] = self.crowd_risk_level
        if self.crowd_risk_score is not None:
            result['crowd_risk_score'] = self.crowd_risk_score
        if self.crowd_risk_type is not None:
            result['crowd_risk_type'] = self.crowd_risk_type
        if self.detected_time is not None:
            result['detected_time'] = self.detected_time
        result['features'] = []
        if self.features is not None:
            for k in self.features:
                result['features'].append(k.to_map() if k else None)
        result['gender_distribution'] = []
        if self.gender_distribution is not None:
            for k in self.gender_distribution:
                result['gender_distribution'].append(k.to_map() if k else None)
        if self.last_active_time is not None:
            result['last_active_time'] = self.last_active_time
        if self.money_involved is not None:
            result['money_involved'] = self.money_involved
        result['money_involved_history'] = []
        if self.money_involved_history is not None:
            for k in self.money_involved_history:
                result['money_involved_history'].append(k.to_map() if k else None)
        if self.people_involved is not None:
            result['people_involved'] = self.people_involved
        result['people_involved_history'] = []
        if self.people_involved_history is not None:
            for k in self.people_involved_history:
                result['people_involved_history'].append(k.to_map() if k else None)
        result['population_distribution'] = []
        if self.population_distribution is not None:
            for k in self.population_distribution:
                result['population_distribution'].append(k.to_map() if k else None)
        if self.registered_city is not None:
            result['registered_city'] = self.registered_city
        if self.registered_county is not None:
            result['registered_county'] = self.registered_county
        if self.registered_province is not None:
            result['registered_province'] = self.registered_province
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('active_city') is not None:
            self.active_city = m.get('active_city')
        if m.get('active_county') is not None:
            self.active_county = m.get('active_county')
        if m.get('active_province') is not None:
            self.active_province = m.get('active_province')
        self.age_distribution = []
        if m.get('age_distribution') is not None:
            for k in m.get('age_distribution'):
                temp_model = RtopAgeDistribution()
                self.age_distribution.append(temp_model.from_map(k))
        if m.get('clue_tags') is not None:
            self.clue_tags = m.get('clue_tags')
        if m.get('conclusion') is not None:
            self.conclusion = m.get('conclusion')
        if m.get('crowd_risk_level') is not None:
            self.crowd_risk_level = m.get('crowd_risk_level')
        if m.get('crowd_risk_score') is not None:
            self.crowd_risk_score = m.get('crowd_risk_score')
        if m.get('crowd_risk_type') is not None:
            self.crowd_risk_type = m.get('crowd_risk_type')
        if m.get('detected_time') is not None:
            self.detected_time = m.get('detected_time')
        self.features = []
        if m.get('features') is not None:
            for k in m.get('features'):
                temp_model = RtopCrowdRiskFeatureResp()
                self.features.append(temp_model.from_map(k))
        self.gender_distribution = []
        if m.get('gender_distribution') is not None:
            for k in m.get('gender_distribution'):
                temp_model = RtopGenderDistribution()
                self.gender_distribution.append(temp_model.from_map(k))
        if m.get('last_active_time') is not None:
            self.last_active_time = m.get('last_active_time')
        if m.get('money_involved') is not None:
            self.money_involved = m.get('money_involved')
        self.money_involved_history = []
        if m.get('money_involved_history') is not None:
            for k in m.get('money_involved_history'):
                temp_model = RtopDateDistribution()
                self.money_involved_history.append(temp_model.from_map(k))
        if m.get('people_involved') is not None:
            self.people_involved = m.get('people_involved')
        self.people_involved_history = []
        if m.get('people_involved_history') is not None:
            for k in m.get('people_involved_history'):
                temp_model = RtopDateDistribution()
                self.people_involved_history.append(temp_model.from_map(k))
        self.population_distribution = []
        if m.get('population_distribution') is not None:
            for k in m.get('population_distribution'):
                temp_model = RtopPopulationDistribution()
                self.population_distribution.append(temp_model.from_map(k))
        if m.get('registered_city') is not None:
            self.registered_city = m.get('registered_city')
        if m.get('registered_county') is not None:
            self.registered_county = m.get('registered_county')
        if m.get('registered_province') is not None:
            self.registered_province = m.get('registered_province')
        return self


class QueryRtopRiskstormRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业ID
        self.company_id = company_id
        # 数据类型
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryRtopRiskstormResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        annual_reports: List[RtopRiskStormCompanyAnnualReport] = None,
        risk_labels: List[RiskStormLabelResp] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 年报数据
        self.annual_reports = annual_reports
        # 风险标签数据
        self.risk_labels = risk_labels

    def validate(self):
        if self.annual_reports:
            for k in self.annual_reports:
                if k:
                    k.validate()
        if self.risk_labels:
            for k in self.risk_labels:
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
        result['annual_reports'] = []
        if self.annual_reports is not None:
            for k in self.annual_reports:
                result['annual_reports'].append(k.to_map() if k else None)
        result['risk_labels'] = []
        if self.risk_labels is not None:
            for k in self.risk_labels:
                result['risk_labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.annual_reports = []
        if m.get('annual_reports') is not None:
            for k in m.get('annual_reports'):
                temp_model = RtopRiskStormCompanyAnnualReport()
                self.annual_reports.append(temp_model.from_map(k))
        self.risk_labels = []
        if m.get('risk_labels') is not None:
            for k in m.get('risk_labels'):
                temp_model = RiskStormLabelResp()
                self.risk_labels.append(temp_model.from_map(k))
        return self


class QueryRtopCrowdriskSumRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_ids: List[str] = None,
        place_name: str = None,
        place_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 指定的企业ID列表，企业ID数量不超过100个。
        self.company_ids = company_ids
        # 指定的地区名称，例如温州市、鹿城区等
        self.place_name = place_name
        # 地区类型，PROVINCE表示省，CITY表示市，COUNTY表示县
        self.place_type = place_type

    def validate(self):
        self.validate_required(self.company_ids, 'company_ids')
        self.validate_required(self.place_name, 'place_name')
        self.validate_required(self.place_type, 'place_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_ids is not None:
            result['company_ids'] = self.company_ids
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_ids') is not None:
            self.company_ids = m.get('company_ids')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        return self


class QueryRtopCrowdriskSumResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        money_involved: int = None,
        people_involved: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询企业的影响金额之和
        self.money_involved = money_involved
        # 查询企业的影响人数之和
        self.people_involved = people_involved

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
        if self.money_involved is not None:
            result['money_involved'] = self.money_involved
        if self.people_involved is not None:
            result['people_involved'] = self.people_involved
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('money_involved') is not None:
            self.money_involved = m.get('money_involved')
        if m.get('people_involved') is not None:
            self.people_involved = m.get('people_involved')
        return self


class GetRtopCompanyDetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业ID
        self.company_id = company_id

    def validate(self):
        self.validate_required(self.company_id, 'company_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        return self


class GetRtopCompanyDetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_score: int = None,
        risk_features: str = None,
        risk_tags: List[RtopRiskTag] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险分数
        self.risk_score = risk_score
        # 风险维度特征
        self.risk_features = risk_features
        # 风险标签列表
        self.risk_tags = risk_tags

    def validate(self):
        if self.risk_tags:
            for k in self.risk_tags:
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
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_features is not None:
            result['risk_features'] = self.risk_features
        result['risk_tags'] = []
        if self.risk_tags is not None:
            for k in self.risk_tags:
                result['risk_tags'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_features') is not None:
            self.risk_features = m.get('risk_features')
        self.risk_tags = []
        if m.get('risk_tags') is not None:
            for k in m.get('risk_tags'):
                temp_model = RtopRiskTag()
                self.risk_tags.append(temp_model.from_map(k))
        return self


class QueryRtopCompanyRiskinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        ak: str = None,
        biz_type: str = None,
        memo: str = None,
        place_name: str = None,
        place_type: str = None,
        sk: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户access key
        self.ak = ak
        # 业务场景 ""
        self.biz_type = biz_type
        # 预留字段
        self.memo = memo
        # 区域中文名称
        self.place_name = place_name
        # 区域类型
        self.place_type = place_type
        # 租户seceret key
        self.sk = sk

    def validate(self):
        self.validate_required(self.ak, 'ak')
        self.validate_required(self.place_name, 'place_name')
        self.validate_required(self.place_type, 'place_type')
        self.validate_required(self.sk, 'sk')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.ak is not None:
            result['ak'] = self.ak
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.memo is not None:
            result['memo'] = self.memo
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        if self.sk is not None:
            result['sk'] = self.sk
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('ak') is not None:
            self.ak = m.get('ak')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        if m.get('sk') is not None:
            self.sk = m.get('sk')
        return self


class QueryRtopCompanyRiskinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[RtopCompanyRiskInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业列表
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
                temp_model = RtopCompanyRiskInfo()
                self.data.append(temp_model.from_map(k))
        return self


class ExecRtopGenericInvokeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        content: str = None,
        permission: str = None,
        title: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # {"platformId":1234}
        self.content = content
        # 这个账号的所有权限点，逗号分隔
        self.permission = permission
        # title
        self.title = title

    def validate(self):
        self.validate_required(self.content, 'content')
        self.validate_required(self.permission, 'permission')
        self.validate_required(self.title, 'title')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.content is not None:
            result['content'] = self.content
        if self.permission is not None:
            result['permission'] = self.permission
        if self.title is not None:
            result['title'] = self.title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('permission') is not None:
            self.permission = m.get('permission')
        if m.get('title') is not None:
            self.title = m.get('title')
        return self


class ExecRtopGenericInvokeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        response_code: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口数据
        self.data = data
        # response_code
        self.response_code = response_code
        # 是否请求成功
        self.success = success

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
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
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
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CreateRtopTokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class CreateRtopTokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
        response_code: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回数据
        self.data = data
        # 返回码
        self.response_code = response_code
        # 成功，失败
        self.success = success

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
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
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
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRtopRisklabelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_no: int = None,
        page_size: int = None,
        scroll_id: str = None,
        mct_one_id: str = None,
        update_date: str = None,
        tag_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # pageNo
        self.page_no = page_no
        # pageSize
        self.page_size = page_size
        # scroll_id
        self.scroll_id = scroll_id
        # mct_one_id  -- search after使用
        self.mct_one_id = mct_one_id
        # 数据更新日期
        self.update_date = update_date
        # tag_id  -- search after使用
        self.tag_id = tag_id

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.update_date, 'update_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.scroll_id is not None:
            result['scroll_id'] = self.scroll_id
        if self.mct_one_id is not None:
            result['mct_one_id'] = self.mct_one_id
        if self.update_date is not None:
            result['update_date'] = self.update_date
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('scroll_id') is not None:
            self.scroll_id = m.get('scroll_id')
        if m.get('mct_one_id') is not None:
            self.mct_one_id = m.get('mct_one_id')
        if m.get('update_date') is not None:
            self.update_date = m.get('update_date')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        return self


class QueryRtopRisklabelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_code: str = None,
        risk_label_infos: List[RiskLabelInfo] = None,
        scroll_id: str = None,
        success: bool = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回码
        self.response_code = response_code
        # 标签信息
        self.risk_label_infos = risk_label_infos
        # scroll_id
        self.scroll_id = scroll_id
        # 是否调用成功
        self.success = success
        # total
        self.total = total

    def validate(self):
        if self.risk_label_infos:
            for k in self.risk_label_infos:
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
        if self.response_code is not None:
            result['response_code'] = self.response_code
        result['risk_label_infos'] = []
        if self.risk_label_infos is not None:
            for k in self.risk_label_infos:
                result['risk_label_infos'].append(k.to_map() if k else None)
        if self.scroll_id is not None:
            result['scroll_id'] = self.scroll_id
        if self.success is not None:
            result['success'] = self.success
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        self.risk_label_infos = []
        if m.get('risk_label_infos') is not None:
            for k in m.get('risk_label_infos'):
                temp_model = RiskLabelInfo()
                self.risk_label_infos.append(temp_model.from_map(k))
        if m.get('scroll_id') is not None:
            self.scroll_id = m.get('scroll_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class QueryRtopCompanyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_ids: List[str] = None,
        update_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 公司ID集合
        self.company_ids = company_ids
        # 数据同步到公有云时间(业务上赋值当天)
        self.update_date = update_date

    def validate(self):
        self.validate_required(self.company_ids, 'company_ids')
        self.validate_required(self.update_date, 'update_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_ids is not None:
            result['company_ids'] = self.company_ids
        if self.update_date is not None:
            result['update_date'] = self.update_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_ids') is not None:
            self.company_ids = m.get('company_ids')
        if m.get('update_date') is not None:
            self.update_date = m.get('update_date')
        return self


class QueryRtopCompanyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_infos: List[CompanyInfo] = None,
        response_code: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业信息列表
        self.company_infos = company_infos
        # 返回码
        self.response_code = response_code
        # 是否调用成功
        self.success = success

    def validate(self):
        if self.company_infos:
            for k in self.company_infos:
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
        result['company_infos'] = []
        if self.company_infos is not None:
            for k in self.company_infos:
                result['company_infos'].append(k.to_map() if k else None)
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.company_infos = []
        if m.get('company_infos') is not None:
            for k in m.get('company_infos'):
                temp_model = CompanyInfo()
                self.company_infos.append(temp_model.from_map(k))
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRtopRisklabelFilterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_no: int = None,
        page_size: int = None,
        place_name: str = None,
        place_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # pageNo
        self.page_no = page_no
        # page_size
        self.page_size = page_size
        # 成都市
        self.place_name = place_name
        # CITY
        self.place_type = place_type

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.place_name, 'place_name')
        self.validate_required(self.place_type, 'place_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.place_name is not None:
            result['place_name'] = self.place_name
        if self.place_type is not None:
            result['place_type'] = self.place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('place_name') is not None:
            self.place_name = m.get('place_name')
        if m.get('place_type') is not None:
            self.place_type = m.get('place_type')
        return self


class QueryRtopRisklabelFilterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_code: str = None,
        risk_label_filter_config_info: List[RiskLabelFilterConfigInfo] = None,
        success: bool = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回码
        self.response_code = response_code
        # 标签配置全量信息
        self.risk_label_filter_config_info = risk_label_filter_config_info
        # 是否调用成功
        self.success = success
        # 总数
        self.total = total

    def validate(self):
        if self.risk_label_filter_config_info:
            for k in self.risk_label_filter_config_info:
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
        if self.response_code is not None:
            result['response_code'] = self.response_code
        result['risk_label_filter_config_info'] = []
        if self.risk_label_filter_config_info is not None:
            for k in self.risk_label_filter_config_info:
                result['risk_label_filter_config_info'].append(k.to_map() if k else None)
        if self.success is not None:
            result['success'] = self.success
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        self.risk_label_filter_config_info = []
        if m.get('risk_label_filter_config_info') is not None:
            for k in m.get('risk_label_filter_config_info'):
                temp_model = RiskLabelFilterConfigInfo()
                self.risk_label_filter_config_info.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class PullRegtechNewsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        news_max_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 表示本地数据库中舆情数据中的最大id
        self.news_max_id = news_max_id

    def validate(self):
        self.validate_required(self.news_max_id, 'news_max_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.news_max_id is not None:
            result['news_max_id'] = self.news_max_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('news_max_id') is not None:
            self.news_max_id = m.get('news_max_id')
        return self


class PullRegtechNewsResponse(TeaModel):
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
        # 返回的数据体
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


class QueryRtopCompanyFeedbackRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_no: int = None,
        page_size: int = None,
        user_place: str = None,
        user_place_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前是第几页
        self.page_no = page_no
        # 每一页的记录条数
        self.page_size = page_size
        # 用户属地
        self.user_place = user_place
        # 用户所在地类型
        self.user_place_type = user_place_type

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.user_place, 'user_place')
        self.validate_required(self.user_place_type, 'user_place_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.user_place is not None:
            result['user_place'] = self.user_place
        if self.user_place_type is not None:
            result['user_place_type'] = self.user_place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('user_place') is not None:
            self.user_place = m.get('user_place')
        if m.get('user_place_type') is not None:
            self.user_place_type = m.get('user_place_type')
        return self


class QueryRtopCompanyFeedbackResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_feedbacks: List[RtopCompanyFeedback] = None,
        response_code: str = None,
        success: bool = None,
        total_num: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业反馈列表
        self.company_feedbacks = company_feedbacks
        # 返回码
        self.response_code = response_code
        # 是否调用成功
        self.success = success
        # 总条数
        self.total_num = total_num

    def validate(self):
        if self.company_feedbacks:
            for k in self.company_feedbacks:
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
        result['company_feedbacks'] = []
        if self.company_feedbacks is not None:
            for k in self.company_feedbacks:
                result['company_feedbacks'].append(k.to_map() if k else None)
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.company_feedbacks = []
        if m.get('company_feedbacks') is not None:
            for k in m.get('company_feedbacks'):
                temp_model = RtopCompanyFeedback()
                self.company_feedbacks.append(temp_model.from_map(k))
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class QueryRtopCompanyAlarmRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_time: str = None,
        page_no: int = None,
        page_size: int = None,
        user_place: str = None,
        user_place_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据的时间
        self.data_time = data_time
        # 当前是第几页
        self.page_no = page_no
        # 每一页的记录条数
        self.page_size = page_size
        # 用户属地
        self.user_place = user_place
        # 用户所在地类型
        self.user_place_type = user_place_type

    def validate(self):
        self.validate_required(self.data_time, 'data_time')
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.user_place, 'user_place')
        self.validate_required(self.user_place_type, 'user_place_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_time is not None:
            result['data_time'] = self.data_time
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.user_place is not None:
            result['user_place'] = self.user_place
        if self.user_place_type is not None:
            result['user_place_type'] = self.user_place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_time') is not None:
            self.data_time = m.get('data_time')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('user_place') is not None:
            self.user_place = m.get('user_place')
        if m.get('user_place_type') is not None:
            self.user_place_type = m.get('user_place_type')
        return self


class QueryRtopCompanyAlarmResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_alarms: List[RtopCompanyAlarm] = None,
        response_code: str = None,
        success: bool = None,
        total_num: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预警企业列表
        self.company_alarms = company_alarms
        # 返回码
        self.response_code = response_code
        # 是否调用成功
        self.success = success
        # 总条数
        self.total_num = total_num

    def validate(self):
        if self.company_alarms:
            for k in self.company_alarms:
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
        result['company_alarms'] = []
        if self.company_alarms is not None:
            for k in self.company_alarms:
                result['company_alarms'].append(k.to_map() if k else None)
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.company_alarms = []
        if m.get('company_alarms') is not None:
            for k in m.get('company_alarms'):
                temp_model = RtopCompanyAlarm()
                self.company_alarms.append(temp_model.from_map(k))
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class QueryRtopCompanyRiskyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_time: str = None,
        list_type: str = None,
        page_no: int = None,
        page_size: int = None,
        type: str = None,
        user_place: str = None,
        user_place_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据时间
        self.data_time = data_time
        # 全局态势中的列表 类型
        self.list_type = list_type
        # 当前是第几页
        self.page_no = page_no
        # 每一页的记录条数
        self.page_size = page_size
        # 全局动态类型
        self.type = type
        # 用户属地
        self.user_place = user_place
        # 用户所在地类型
        self.user_place_type = user_place_type

    def validate(self):
        self.validate_required(self.data_time, 'data_time')
        self.validate_required(self.list_type, 'list_type')
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.type, 'type')
        self.validate_required(self.user_place, 'user_place')
        self.validate_required(self.user_place_type, 'user_place_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_time is not None:
            result['data_time'] = self.data_time
        if self.list_type is not None:
            result['list_type'] = self.list_type
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.type is not None:
            result['type'] = self.type
        if self.user_place is not None:
            result['user_place'] = self.user_place
        if self.user_place_type is not None:
            result['user_place_type'] = self.user_place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_time') is not None:
            self.data_time = m.get('data_time')
        if m.get('list_type') is not None:
            self.list_type = m.get('list_type')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('user_place') is not None:
            self.user_place = m.get('user_place')
        if m.get('user_place_type') is not None:
            self.user_place_type = m.get('user_place_type')
        return self


class QueryRtopCompanyRiskyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_code: str = None,
        risky_companies: List[RtopRiskyCompany] = None,
        success: bool = None,
        total_num: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回码
        self.response_code = response_code
        # 全局动态中的企业列表
        self.risky_companies = risky_companies
        # 是否调用成功
        self.success = success
        # 总条数
        self.total_num = total_num

    def validate(self):
        if self.risky_companies:
            for k in self.risky_companies:
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
        if self.response_code is not None:
            result['response_code'] = self.response_code
        result['risky_companies'] = []
        if self.risky_companies is not None:
            for k in self.risky_companies:
                result['risky_companies'].append(k.to_map() if k else None)
        if self.success is not None:
            result['success'] = self.success
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        self.risky_companies = []
        if m.get('risky_companies') is not None:
            for k in m.get('risky_companies'):
                temp_model = RtopRiskyCompany()
                self.risky_companies.append(temp_model.from_map(k))
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class QueryRtopCompanyListRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        active_areas: List[str] = None,
        categories: List[str] = None,
        company_states: List[str] = None,
        feedback: List[str] = None,
        max_risk_score: int = None,
        max_risk_score_weekly_float: str = None,
        max_spread_number: int = None,
        min_risk_score: int = None,
        min_risk_score_weekly_float: str = None,
        min_spread_number: int = None,
        normal_operation: bool = None,
        operate_areas: List[str] = None,
        page_no: int = None,
        page_size: int = None,
        platform_states: List[str] = None,
        register_areas: List[str] = None,
        risky_dimensions: List[str] = None,
        risk_tags: List[str] = None,
        risk_types: List[str] = None,
        sort_field: str = None,
        sort_type: str = None,
        user_place: str = None,
        user_place_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活跃地区
        self.active_areas = active_areas
        # 企业类型
        self.categories = categories
        # 企业状态
        self.company_states = company_states
        # 反馈
        self.feedback = feedback
        # 风险指数最大值
        self.max_risk_score = max_risk_score
        # 指数周波动最大值
        self.max_risk_score_weekly_float = max_risk_score_weekly_float
        # 传播人次最大值
        self.max_spread_number = max_spread_number
        # 风险指数最小值
        self.min_risk_score = min_risk_score
        # 指数周波动最小值
        self.min_risk_score_weekly_float = min_risk_score_weekly_float
        # 传播人次最小值
        self.min_spread_number = min_spread_number
        # 正常营运状态
        self.normal_operation = normal_operation
        # 经营地区
        self.operate_areas = operate_areas
        # 当前是第几页
        self.page_no = page_no
        # 每一页的记录条数
        self.page_size = page_size
        # 平台状态
        self.platform_states = platform_states
        # 注册地区
        self.register_areas = register_areas
        # 高风险维度
        self.risky_dimensions = risky_dimensions
        # 风险标签
        self.risk_tags = risk_tags
        # 风险定性
        self.risk_types = risk_types
        # 排序字段
        self.sort_field = sort_field
        # 排序类型
        self.sort_type = sort_type
        # 用户属地
        self.user_place = user_place
        # 用户所在地类型
        self.user_place_type = user_place_type

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.user_place, 'user_place')
        self.validate_required(self.user_place_type, 'user_place_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.active_areas is not None:
            result['active_areas'] = self.active_areas
        if self.categories is not None:
            result['categories'] = self.categories
        if self.company_states is not None:
            result['company_states'] = self.company_states
        if self.feedback is not None:
            result['feedback'] = self.feedback
        if self.max_risk_score is not None:
            result['max_risk_score'] = self.max_risk_score
        if self.max_risk_score_weekly_float is not None:
            result['max_risk_score_weekly_float'] = self.max_risk_score_weekly_float
        if self.max_spread_number is not None:
            result['max_spread_number'] = self.max_spread_number
        if self.min_risk_score is not None:
            result['min_risk_score'] = self.min_risk_score
        if self.min_risk_score_weekly_float is not None:
            result['min_risk_score_weekly_float'] = self.min_risk_score_weekly_float
        if self.min_spread_number is not None:
            result['min_spread_number'] = self.min_spread_number
        if self.normal_operation is not None:
            result['normal_operation'] = self.normal_operation
        if self.operate_areas is not None:
            result['operate_areas'] = self.operate_areas
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.platform_states is not None:
            result['platform_states'] = self.platform_states
        if self.register_areas is not None:
            result['register_areas'] = self.register_areas
        if self.risky_dimensions is not None:
            result['risky_dimensions'] = self.risky_dimensions
        if self.risk_tags is not None:
            result['risk_tags'] = self.risk_tags
        if self.risk_types is not None:
            result['risk_types'] = self.risk_types
        if self.sort_field is not None:
            result['sort_field'] = self.sort_field
        if self.sort_type is not None:
            result['sort_type'] = self.sort_type
        if self.user_place is not None:
            result['user_place'] = self.user_place
        if self.user_place_type is not None:
            result['user_place_type'] = self.user_place_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('active_areas') is not None:
            self.active_areas = m.get('active_areas')
        if m.get('categories') is not None:
            self.categories = m.get('categories')
        if m.get('company_states') is not None:
            self.company_states = m.get('company_states')
        if m.get('feedback') is not None:
            self.feedback = m.get('feedback')
        if m.get('max_risk_score') is not None:
            self.max_risk_score = m.get('max_risk_score')
        if m.get('max_risk_score_weekly_float') is not None:
            self.max_risk_score_weekly_float = m.get('max_risk_score_weekly_float')
        if m.get('max_spread_number') is not None:
            self.max_spread_number = m.get('max_spread_number')
        if m.get('min_risk_score') is not None:
            self.min_risk_score = m.get('min_risk_score')
        if m.get('min_risk_score_weekly_float') is not None:
            self.min_risk_score_weekly_float = m.get('min_risk_score_weekly_float')
        if m.get('min_spread_number') is not None:
            self.min_spread_number = m.get('min_spread_number')
        if m.get('normal_operation') is not None:
            self.normal_operation = m.get('normal_operation')
        if m.get('operate_areas') is not None:
            self.operate_areas = m.get('operate_areas')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('platform_states') is not None:
            self.platform_states = m.get('platform_states')
        if m.get('register_areas') is not None:
            self.register_areas = m.get('register_areas')
        if m.get('risky_dimensions') is not None:
            self.risky_dimensions = m.get('risky_dimensions')
        if m.get('risk_tags') is not None:
            self.risk_tags = m.get('risk_tags')
        if m.get('risk_types') is not None:
            self.risk_types = m.get('risk_types')
        if m.get('sort_field') is not None:
            self.sort_field = m.get('sort_field')
        if m.get('sort_type') is not None:
            self.sort_type = m.get('sort_type')
        if m.get('user_place') is not None:
            self.user_place = m.get('user_place')
        if m.get('user_place_type') is not None:
            self.user_place_type = m.get('user_place_type')
        return self


class QueryRtopCompanyListResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_ids: List[str] = None,
        response_code: str = None,
        success: bool = None,
        total_num: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业id列表
        self.company_ids = company_ids
        # 返回码
        self.response_code = response_code
        # 是否调用成功
        self.success = success
        # 总条数
        self.total_num = total_num

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
        if self.company_ids is not None:
            result['company_ids'] = self.company_ids
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
        if self.total_num is not None:
            result['total_num'] = self.total_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('company_ids') is not None:
            self.company_ids = m.get('company_ids')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        return self


class QueryRtopRisklabelConfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # page_no
        self.page_no = page_no
        # page_size
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryRtopRisklabelConfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_code: str = None,
        success: bool = None,
        tag_config: List[RiskLabelConfigInfo] = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回码
        # 
        self.response_code = response_code
        # 是否调用成功
        # 
        self.success = success
        # 列表
        self.tag_config = tag_config
        # 总数
        self.total = total

    def validate(self):
        if self.tag_config:
            for k in self.tag_config:
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
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
        result['tag_config'] = []
        if self.tag_config is not None:
            for k in self.tag_config:
                result['tag_config'].append(k.to_map() if k else None)
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        self.tag_config = []
        if m.get('tag_config') is not None:
            for k in m.get('tag_config'):
                temp_model = RiskLabelConfigInfo()
                self.tag_config.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class QueryRtopCompanyRiskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业id
        self.company_id = company_id

    def validate(self):
        self.validate_required(self.company_id, 'company_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        return self


class QueryRtopCompanyRiskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_factors: List[RtopCompanyRiskFactor] = None,
        risk_level: str = None,
        risk_message: str = None,
        risk_score: int = None,
        risk_tags: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险维度
        self.risk_factors = risk_factors
        # 风险等级
        self.risk_level = risk_level
        # 风险报文
        self.risk_message = risk_message
        # 风险分数
        self.risk_score = risk_score
        # 风险标签
        self.risk_tags = risk_tags

    def validate(self):
        if self.risk_factors:
            for k in self.risk_factors:
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
        result['risk_factors'] = []
        if self.risk_factors is not None:
            for k in self.risk_factors:
                result['risk_factors'].append(k.to_map() if k else None)
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        if self.risk_message is not None:
            result['risk_message'] = self.risk_message
        if self.risk_score is not None:
            result['risk_score'] = self.risk_score
        if self.risk_tags is not None:
            result['risk_tags'] = self.risk_tags
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.risk_factors = []
        if m.get('risk_factors') is not None:
            for k in m.get('risk_factors'):
                temp_model = RtopCompanyRiskFactor()
                self.risk_factors.append(temp_model.from_map(k))
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        if m.get('risk_message') is not None:
            self.risk_message = m.get('risk_message')
        if m.get('risk_score') is not None:
            self.risk_score = m.get('risk_score')
        if m.get('risk_tags') is not None:
            self.risk_tags = m.get('risk_tags')
        return self


class ListRtopCompanyRelatedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业id
        self.company_id = company_id

    def validate(self):
        self.validate_required(self.company_id, 'company_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        return self


class ListRtopCompanyRelatedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        companies: List[RtopRiskGeneNode] = None,
        response_code: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # node
        self.companies = companies
        # 返回码
        # 
        self.response_code = response_code
        # 是否调用成功
        # 
        self.success = success

    def validate(self):
        if self.companies:
            for k in self.companies:
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
        result['companies'] = []
        if self.companies is not None:
            for k in self.companies:
                result['companies'].append(k.to_map() if k else None)
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.companies = []
        if m.get('companies') is not None:
            for k in m.get('companies'):
                temp_model = RtopRiskGeneNode()
                self.companies.append(temp_model.from_map(k))
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRtopTagImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_id: str = None,
        tag_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业ID
        self.company_id = company_id
        # 标签ID
        self.tag_id = tag_id

    def validate(self):
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.tag_id, 'tag_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.tag_id is not None:
            result['tag_id'] = self.tag_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('tag_id') is not None:
            self.tag_id = m.get('tag_id')
        return self


class QueryRtopTagImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        risk_images: List[RtopTagImage] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 标签图片列表
        self.risk_images = risk_images

    def validate(self):
        if self.risk_images:
            for k in self.risk_images:
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
        result['risk_images'] = []
        if self.risk_images is not None:
            for k in self.risk_images:
                result['risk_images'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.risk_images = []
        if m.get('risk_images') is not None:
            for k in m.get('risk_images'):
                temp_model = RtopTagImage()
                self.risk_images.append(temp_model.from_map(k))
        return self


class ListRtopStarCompanyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 页码
        self.page_no = page_no
        # 一页条数
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListRtopStarCompanyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_infos: List[RtopStarCompanyInfo] = None,
        page_no: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业列表
        self.company_infos = company_infos
        # 页码
        self.page_no = page_no
        # 一页条数
        self.page_size = page_size
        # 总的记录数
        self.total_count = total_count

    def validate(self):
        if self.company_infos:
            for k in self.company_infos:
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
        result['company_infos'] = []
        if self.company_infos is not None:
            for k in self.company_infos:
                result['company_infos'].append(k.to_map() if k else None)
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.company_infos = []
        if m.get('company_infos') is not None:
            for k in m.get('company_infos'):
                temp_model = RtopStarCompanyInfo()
                self.company_infos.append(temp_model.from_map(k))
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class QueryRpSecurityPolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        risk_type: str = None,
        security_scene: SecurityScene = None,
        service_context: ServiceContext = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 风险类型：表示风险处理或风险咨询——process/advice
        self.risk_type = risk_type
        # security_scene
        self.security_scene = security_scene
        # service_context
        self.service_context = service_context

    def validate(self):
        self.validate_required(self.risk_type, 'risk_type')
        self.validate_required(self.security_scene, 'security_scene')
        if self.security_scene:
            self.security_scene.validate()
        self.validate_required(self.service_context, 'service_context')
        if self.service_context:
            self.service_context.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.security_scene is not None:
            result['security_scene'] = self.security_scene.to_map()
        if self.service_context is not None:
            result['service_context'] = self.service_context.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('security_scene') is not None:
            temp_model = SecurityScene()
            self.security_scene = temp_model.from_map(m['security_scene'])
        if m.get('service_context') is not None:
            temp_model = ServiceContext()
            self.service_context = temp_model.from_map(m['service_context'])
        return self


class QueryRpSecurityPolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        model_details: List[ModelDetails] = None,
        security_id: str = None,
        security_result: str = None,
        strategy_details: List[StrategyDetails] = None,
        df_scene_infos: DfSceneInfos = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型结果详情
        # 
        self.model_details = model_details
        # 反馈成功之后的id
        self.security_id = security_id
        # 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
        self.security_result = security_result
        # 策略结果详情
        # 
        self.strategy_details = strategy_details
        # 决策流信息
        self.df_scene_infos = df_scene_infos

    def validate(self):
        if self.model_details:
            for k in self.model_details:
                if k:
                    k.validate()
        if self.strategy_details:
            for k in self.strategy_details:
                if k:
                    k.validate()
        if self.df_scene_infos:
            self.df_scene_infos.validate()

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
        result['model_details'] = []
        if self.model_details is not None:
            for k in self.model_details:
                result['model_details'].append(k.to_map() if k else None)
        if self.security_id is not None:
            result['security_id'] = self.security_id
        if self.security_result is not None:
            result['security_result'] = self.security_result
        result['strategy_details'] = []
        if self.strategy_details is not None:
            for k in self.strategy_details:
                result['strategy_details'].append(k.to_map() if k else None)
        if self.df_scene_infos is not None:
            result['df_scene_infos'] = self.df_scene_infos.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.model_details = []
        if m.get('model_details') is not None:
            for k in m.get('model_details'):
                temp_model = ModelDetails()
                self.model_details.append(temp_model.from_map(k))
        if m.get('security_id') is not None:
            self.security_id = m.get('security_id')
        if m.get('security_result') is not None:
            self.security_result = m.get('security_result')
        self.strategy_details = []
        if m.get('strategy_details') is not None:
            for k in m.get('strategy_details'):
                temp_model = StrategyDetails()
                self.strategy_details.append(temp_model.from_map(k))
        if m.get('df_scene_infos') is not None:
            temp_model = DfSceneInfos()
            self.df_scene_infos = temp_model.from_map(m['df_scene_infos'])
        return self


class QuerySnapshotEventRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        event_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 事件id
        self.event_id = event_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.event_id is not None:
            result['event_id'] = self.event_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        return self


class QuerySnapshotEventResponse(TeaModel):
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


class UploadUmktParamsFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        scene_strategy_id: int = None,
        exec_time: str = None,
        file_template: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # file_id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 场景策略id
        self.scene_strategy_id = scene_strategy_id
        # 预计执行时间，不设置则为立即执行
        self.exec_time = exec_time
        # 支持不同的文件模版：
        # MOBILE_MD5_WITH_MS_VARIABLE、MOBILE_MD5
        # 后续支持
        # DEVICE_MD5
        self.file_template = file_template

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.scene_strategy_id, 'scene_strategy_id')
        if self.scene_strategy_id is not None:
            self.validate_minimum(self.scene_strategy_id, 'scene_strategy_id', 1)
        if self.exec_time is not None:
            self.validate_pattern(self.exec_time, 'exec_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.file_template, 'file_template')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.scene_strategy_id is not None:
            result['scene_strategy_id'] = self.scene_strategy_id
        if self.exec_time is not None:
            result['exec_time'] = self.exec_time
        if self.file_template is not None:
            result['file_template'] = self.file_template
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('scene_strategy_id') is not None:
            self.scene_strategy_id = m.get('scene_strategy_id')
        if m.get('exec_time') is not None:
            self.exec_time = m.get('exec_time')
        if m.get('file_template') is not None:
            self.file_template = m.get('file_template')
        return self


class UploadUmktParamsFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上传后返回的任务id
        self.task_id = task_id

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
        return self


class BatchqueryUmktRtMarketingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_strategy_id: int = None,
        query_template: str = None,
        customer_keys: List[str] = None,
        biz_serial_no: str = None,
        visit_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景营销策略id
        self.scene_strategy_id = scene_strategy_id
        # 用户列表传输模版
        self.query_template = query_template
        # 用户查询凭证列表
        self.customer_keys = customer_keys
        # 业务方流水号
        self.biz_serial_no = biz_serial_no
        # 访问类型，PROD/TEST，正式流量/测试流量
        self.visit_type = visit_type

    def validate(self):
        self.validate_required(self.scene_strategy_id, 'scene_strategy_id')
        self.validate_required(self.customer_keys, 'customer_keys')
        self.validate_required(self.biz_serial_no, 'biz_serial_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_strategy_id is not None:
            result['scene_strategy_id'] = self.scene_strategy_id
        if self.query_template is not None:
            result['query_template'] = self.query_template
        if self.customer_keys is not None:
            result['customer_keys'] = self.customer_keys
        if self.biz_serial_no is not None:
            result['biz_serial_no'] = self.biz_serial_no
        if self.visit_type is not None:
            result['visit_type'] = self.visit_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_strategy_id') is not None:
            self.scene_strategy_id = m.get('scene_strategy_id')
        if m.get('query_template') is not None:
            self.query_template = m.get('query_template')
        if m.get('customer_keys') is not None:
            self.customer_keys = m.get('customer_keys')
        if m.get('biz_serial_no') is not None:
            self.biz_serial_no = m.get('biz_serial_no')
        if m.get('visit_type') is not None:
            self.visit_type = m.get('visit_type')
        return self


class BatchqueryUmktRtMarketingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        query_result: List[CustomerUmktInfoModel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 处理是否成功
        self.success = success
        # 实时营销单条结果
        self.query_result = query_result

    def validate(self):
        if self.query_result:
            for k in self.query_result:
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
        if self.success is not None:
            result['success'] = self.success
        result['query_result'] = []
        if self.query_result is not None:
            for k in self.query_result:
                result['query_result'].append(k.to_map() if k else None)
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
        self.query_result = []
        if m.get('query_result') is not None:
            for k in m.get('query_result'):
                temp_model = CustomerUmktInfoModel()
                self.query_result.append(temp_model.from_map(k))
        return self


class SyncUmktRtEventresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        detail: List[EventResultSyncDetail] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 详细事件明细
        self.detail = detail

    def validate(self):
        self.validate_required(self.detail, 'detail')
        if self.detail:
            for k in self.detail:
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
        result['detail'] = []
        if self.detail is not None:
            for k in self.detail:
                result['detail'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.detail = []
        if m.get('detail') is not None:
            for k in m.get('detail'):
                temp_model = EventResultSyncDetail()
                self.detail.append(temp_model.from_map(k))
        return self


class SyncUmktRtEventresultResponse(TeaModel):
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


class ImportUmktSceneUploadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        key: str = None,
        value: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需要刷新的key
        self.key = key
        # 需要刷新的value，可能是json格式
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class ImportUmktSceneUploadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        upload_result: StrategyUploadResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求结果
        self.success = success
        # 场景构建结果体
        self.upload_result = upload_result

    def validate(self):
        if self.upload_result:
            self.upload_result.validate()

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
        if self.upload_result is not None:
            result['upload_result'] = self.upload_result.to_map()
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
        if m.get('upload_result') is not None:
            temp_model = StrategyUploadResult()
            self.upload_result = temp_model.from_map(m['upload_result'])
        return self


class BatchqueryUmktRtTailmarketingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        plan_id: str = None,
        query_template: str = None,
        customer_keys: List[str] = None,
        biz_serial_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 营销计划id
        self.plan_id = plan_id
        # 
        # 用户列表传输模版
        self.query_template = query_template
        # 
        # 用户查询凭证列表
        self.customer_keys = customer_keys
        # 业务方流水号
        self.biz_serial_no = biz_serial_no

    def validate(self):
        self.validate_required(self.plan_id, 'plan_id')
        self.validate_required(self.query_template, 'query_template')
        self.validate_required(self.customer_keys, 'customer_keys')
        self.validate_required(self.biz_serial_no, 'biz_serial_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.plan_id is not None:
            result['plan_id'] = self.plan_id
        if self.query_template is not None:
            result['query_template'] = self.query_template
        if self.customer_keys is not None:
            result['customer_keys'] = self.customer_keys
        if self.biz_serial_no is not None:
            result['biz_serial_no'] = self.biz_serial_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('plan_id') is not None:
            self.plan_id = m.get('plan_id')
        if m.get('query_template') is not None:
            self.query_template = m.get('query_template')
        if m.get('customer_keys') is not None:
            self.customer_keys = m.get('customer_keys')
        if m.get('biz_serial_no') is not None:
            self.biz_serial_no = m.get('biz_serial_no')
        return self


class BatchqueryUmktRtTailmarketingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        query_result: List[CustomerUmktInfoModel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 
        # 实时营销单条结果
        self.query_result = query_result

    def validate(self):
        if self.query_result:
            for k in self.query_result:
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
        result['query_result'] = []
        if self.query_result is not None:
            for k in self.query_result:
                result['query_result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.query_result = []
        if m.get('query_result') is not None:
            for k in m.get('query_result'):
                temp_model = CustomerUmktInfoModel()
                self.query_result.append(temp_model.from_map(k))
        return self


class QueryUmktScenestrategyTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_strategy_id: int = None,
        query_template: str = None,
        customer_keys: List[str] = None,
        biz_serial_no: str = None,
        pretend_tenant: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景策略id
        self.scene_strategy_id = scene_strategy_id
        # 查询模版
        self.query_template = query_template
        # 用户查询凭证列表
        # 
        self.customer_keys = customer_keys
        # 业务方流水号
        self.biz_serial_no = biz_serial_no
        # 伪装租户id
        self.pretend_tenant = pretend_tenant

    def validate(self):
        self.validate_required(self.scene_strategy_id, 'scene_strategy_id')
        self.validate_required(self.customer_keys, 'customer_keys')
        self.validate_required(self.biz_serial_no, 'biz_serial_no')
        self.validate_required(self.pretend_tenant, 'pretend_tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_strategy_id is not None:
            result['scene_strategy_id'] = self.scene_strategy_id
        if self.query_template is not None:
            result['query_template'] = self.query_template
        if self.customer_keys is not None:
            result['customer_keys'] = self.customer_keys
        if self.biz_serial_no is not None:
            result['biz_serial_no'] = self.biz_serial_no
        if self.pretend_tenant is not None:
            result['pretend_tenant'] = self.pretend_tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_strategy_id') is not None:
            self.scene_strategy_id = m.get('scene_strategy_id')
        if m.get('query_template') is not None:
            self.query_template = m.get('query_template')
        if m.get('customer_keys') is not None:
            self.customer_keys = m.get('customer_keys')
        if m.get('biz_serial_no') is not None:
            self.biz_serial_no = m.get('biz_serial_no')
        if m.get('pretend_tenant') is not None:
            self.pretend_tenant = m.get('pretend_tenant')
        return self


class QueryUmktScenestrategyTestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        query_result: List[CustomerUmktInfoModel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 处理结果
        self.success = success
        # 实时营销单条结果
        self.query_result = query_result

    def validate(self):
        if self.query_result:
            for k in self.query_result:
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
        if self.success is not None:
            result['success'] = self.success
        result['query_result'] = []
        if self.query_result is not None:
            for k in self.query_result:
                result['query_result'].append(k.to_map() if k else None)
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
        self.query_result = []
        if m.get('query_result') is not None:
            for k in m.get('query_result'):
                temp_model = CustomerUmktInfoModel()
                self.query_result.append(temp_model.from_map(k))
        return self


class ApplyUmktRobotcallRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        called_show_number: str = None,
        called_number: str = None,
        robot_id: int = None,
        record_flag: bool = None,
        early_media_asr: bool = None,
        params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外呼主叫号码
        self.called_show_number = called_show_number
        # 被叫号码
        self.called_number = called_number
        # 机器人id
        self.robot_id = robot_id
        # 是否开启录音
        self.record_flag = record_flag
        # 是否开启早媒体
        self.early_media_asr = early_media_asr
        # 机器人参数
        self.params = params

    def validate(self):
        self.validate_required(self.called_show_number, 'called_show_number')
        self.validate_required(self.called_number, 'called_number')
        self.validate_required(self.robot_id, 'robot_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.called_show_number is not None:
            result['called_show_number'] = self.called_show_number
        if self.called_number is not None:
            result['called_number'] = self.called_number
        if self.robot_id is not None:
            result['robot_id'] = self.robot_id
        if self.record_flag is not None:
            result['record_flag'] = self.record_flag
        if self.early_media_asr is not None:
            result['early_media_asr'] = self.early_media_asr
        if self.params is not None:
            result['params'] = self.params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('called_show_number') is not None:
            self.called_show_number = m.get('called_show_number')
        if m.get('called_number') is not None:
            self.called_number = m.get('called_number')
        if m.get('robot_id') is not None:
            self.robot_id = m.get('robot_id')
        if m.get('record_flag') is not None:
            self.record_flag = m.get('record_flag')
        if m.get('early_media_asr') is not None:
            self.early_media_asr = m.get('early_media_asr')
        if m.get('params') is not None:
            self.params = m.get('params')
        return self


class ApplyUmktRobotcallResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        call_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 呼叫记录id
        self.call_id = call_id

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
        if self.call_id is not None:
            result['call_id'] = self.call_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('call_id') is not None:
            self.call_id = m.get('call_id')
        return self


class QueryUmktDataaccessStatisticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询回执统计的任务id
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryUmktDataaccessStatisticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        statistic_result: StatisticResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 回执统计结果
        self.statistic_result = statistic_result

    def validate(self):
        if self.statistic_result:
            self.statistic_result.validate()

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
        if self.statistic_result is not None:
            result['statistic_result'] = self.statistic_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('statistic_result') is not None:
            temp_model = StatisticResult()
            self.statistic_result = temp_model.from_map(m['statistic_result'])
        return self


class CancelUmktDataaccessOfflinetaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 离线批量任务id
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class CancelUmktDataaccessOfflinetaskResponse(TeaModel):
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


class QueryUmktRtMarketingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_strategy_id: int = None,
        query_template: str = None,
        customer_key: str = None,
        biz_serial_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景策略id，决策重点
        self.scene_strategy_id = scene_strategy_id
        # 用户凭证模版
        self.query_template = query_template
        # 用户查询凭证
        self.customer_key = customer_key
        # 业务流水号
        self.biz_serial_no = biz_serial_no

    def validate(self):
        self.validate_required(self.scene_strategy_id, 'scene_strategy_id')
        self.validate_required(self.query_template, 'query_template')
        self.validate_required(self.customer_key, 'customer_key')
        self.validate_required(self.biz_serial_no, 'biz_serial_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_strategy_id is not None:
            result['scene_strategy_id'] = self.scene_strategy_id
        if self.query_template is not None:
            result['query_template'] = self.query_template
        if self.customer_key is not None:
            result['customer_key'] = self.customer_key
        if self.biz_serial_no is not None:
            result['biz_serial_no'] = self.biz_serial_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_strategy_id') is not None:
            self.scene_strategy_id = m.get('scene_strategy_id')
        if m.get('query_template') is not None:
            self.query_template = m.get('query_template')
        if m.get('customer_key') is not None:
            self.customer_key = m.get('customer_key')
        if m.get('biz_serial_no') is not None:
            self.biz_serial_no = m.get('biz_serial_no')
        return self


class QueryUmktRtMarketingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        query_result: CustomerUmktInfoModel = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实时单个营销结果
        self.query_result = query_result

    def validate(self):
        if self.query_result:
            self.query_result.validate()

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
        if self.query_result is not None:
            result['query_result'] = self.query_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('query_result') is not None:
            temp_model = CustomerUmktInfoModel()
            self.query_result = temp_model.from_map(m['query_result'])
        return self


class CreateAntcloudGatewayxFileUploadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_code: str = None,
        file_label: str = None,
        file_metadata: str = None,
        file_name: str = None,
        mime_type: str = None,
        api_cluster: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 上传文件作用的openapi method
        self.api_code = api_code
        # 文件标签，多个标签;分割
        self.file_label = file_label
        # 自定义的文件元数据
        self.file_metadata = file_metadata
        # 文件名，不传则随机生成文件名
        self.file_name = file_name
        # 文件的多媒体类型
        self.mime_type = mime_type
        # 产品方的api归属集群，即productInstanceId
        self.api_cluster = api_cluster

    def validate(self):
        self.validate_required(self.api_code, 'api_code')
        if self.file_label is not None:
            self.validate_max_length(self.file_label, 'file_label', 100)
        if self.file_metadata is not None:
            self.validate_max_length(self.file_metadata, 'file_metadata', 1000)
        if self.file_name is not None:
            self.validate_max_length(self.file_name, 'file_name', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.api_code is not None:
            result['api_code'] = self.api_code
        if self.file_label is not None:
            result['file_label'] = self.file_label
        if self.file_metadata is not None:
            result['file_metadata'] = self.file_metadata
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.mime_type is not None:
            result['mime_type'] = self.mime_type
        if self.api_cluster is not None:
            result['api_cluster'] = self.api_cluster
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_code') is not None:
            self.api_code = m.get('api_code')
        if m.get('file_label') is not None:
            self.file_label = m.get('file_label')
        if m.get('file_metadata') is not None:
            self.file_metadata = m.get('file_metadata')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('mime_type') is not None:
            self.mime_type = m.get('mime_type')
        if m.get('api_cluster') is not None:
            self.api_cluster = m.get('api_cluster')
        return self


class CreateAntcloudGatewayxFileUploadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        expired_time: str = None,
        file_id: str = None,
        upload_headers: List[XNameValuePair] = None,
        upload_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上传有效期
        self.expired_time = expired_time
        # 32位文件唯一id
        self.file_id = file_id
        # 放入http请求头里
        self.upload_headers = upload_headers
        # 文件上传地址
        self.upload_url = upload_url

    def validate(self):
        if self.expired_time is not None:
            self.validate_pattern(self.expired_time, 'expired_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.upload_headers:
            for k in self.upload_headers:
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
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.file_id is not None:
            result['file_id'] = self.file_id
        result['upload_headers'] = []
        if self.upload_headers is not None:
            for k in self.upload_headers:
                result['upload_headers'].append(k.to_map() if k else None)
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
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        self.upload_headers = []
        if m.get('upload_headers') is not None:
            for k in m.get('upload_headers'):
                temp_model = XNameValuePair()
                self.upload_headers.append(temp_model.from_map(k))
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        return self


