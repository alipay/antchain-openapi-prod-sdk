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


class BatchQueryOutputModelInfo(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
        value_type: str = None,
    ):
        # 变量名称
        self.name = name
        # 变量值
        self.value = value
        # 变量值类型
        self.value_type = value_type

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')
        self.validate_required(self.value_type, 'value_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.value is not None:
            result['value'] = self.value
        if self.value_type is not None:
            result['value_type'] = self.value_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('value_type') is not None:
            self.value_type = m.get('value_type')
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


class BackflowEventRecordProperty(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # 属性code
        self.key = key
        # 属性value，统一为字符串
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
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


class ActionParamInfo(TeaModel):
    def __init__(
        self,
        content_type: str = None,
        action_param: List[str] = None,
    ):
        # 触达媒介类型
        self.content_type = content_type
        # 触达媒介参数列表
        self.action_param = action_param

    def validate(self):
        self.validate_required(self.content_type, 'content_type')
        self.validate_required(self.action_param, 'action_param')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.action_param is not None:
            result['action_param'] = self.action_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('action_param') is not None:
            self.action_param = m.get('action_param')
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


class CouponInfo(TeaModel):
    def __init__(
        self,
        coupon_id: str = None,
        coupon_name: str = None,
        status: str = None,
        use_condition: str = None,
        coupon_code: str = None,
        coupon_type: str = None,
        coupon_value: str = None,
        coupon_amount: str = None,
        expired_time: str = None,
        effective_time: str = None,
        use_detail: str = None,
        min_amount: str = None,
        max_amount: str = None,
        min_period: str = None,
        max_period: str = None,
        min_day: str = None,
        repayment_method: str = None,
        is_period_limit: str = None,
        repay_condition: str = None,
        repay_ways: str = None,
        coupon_model_no: str = None,
        to_maturity: str = None,
    ):
        # 优惠券Id
        self.coupon_id = coupon_id
        # 优惠券名称
        self.coupon_name = coupon_name
        # 优惠券状态
        # unUsed-未使用
        # Used-已使用
        # Expired-过期
        self.status = status
        # 使用场景
        # 01-提款使用
        # 02-还款使用
        self.use_condition = use_condition
        # 优惠码
        self.coupon_code = coupon_code
        # 优惠券类型
        # 01-金额优惠
        # 02-天数优惠
        # 03-折扣优惠
        # 04-期数优惠
        # 05-固定利率
        self.coupon_type = coupon_type
        # 优惠券面额
        # coupon_type=01 时为优惠金额
        # coupon_type=02 时为减免天数
        # coupon_type=03 时为折扣值（如6 折）
        # coupon_type=04 时为减免期数
        # coupon_type=05 时为折扣值（如 8.88 为利率8.88%）
        self.coupon_value = coupon_value
        # 当 coupon_type=01 时，才会有优惠金额
        self.coupon_amount = coupon_amount
        # 过期时间yyyy-MM-dd HH:mm:ss
        self.expired_time = expired_time
        # 生效时间yyyy-MM-dd HH:mm:ss
        self.effective_time = effective_time
        # 使用规则
        self.use_detail = use_detail
        # 贷款最低金额
        self.min_amount = min_amount
        # 贷款最高金额
        self.max_amount = max_amount
        # 最低贷款期数
        self.min_period = min_period
        # 最高贷款期数
        self.max_period = max_period
        # 贷款最低期限天数
        self.min_day = min_day
        # 还款方式
        # 1-等额本息
        # 2-等额本金
        # 3-等本等费
        # 4-按期付息到期还本
        # 5-到期一次性还本付息
        # 6-等本等费-总费率
        # 7-等额本息(长期)
        self.repayment_method = repayment_method
        # 是否有贷款期数要求
        # 0：否
        # 1：是
        self.is_period_limit = is_period_limit
        # 贷款期限要求还款条件
        # 01：可提前还款
        # 02：不可提前还款
        # isPeriodLimit=1 && repayCondition=01 代表：有可提前还款锁期
        # isPeriodLimit=1 && repayCondition=02 代表：有不可提前还款锁期
        self.repay_condition = repay_condition
        # 还款场景
        # 01-到期还款
        # 02-即期还款
        self.repay_ways = repay_ways
        # 优惠模板Id
        self.coupon_model_no = coupon_model_no
        # 至到期:X年X月X日
        # 0：不是至到期券
        # 1：是至到期券
        self.to_maturity = to_maturity

    def validate(self):
        self.validate_required(self.coupon_id, 'coupon_id')
        self.validate_required(self.coupon_name, 'coupon_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.use_condition, 'use_condition')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        if self.coupon_name is not None:
            result['coupon_name'] = self.coupon_name
        if self.status is not None:
            result['status'] = self.status
        if self.use_condition is not None:
            result['use_condition'] = self.use_condition
        if self.coupon_code is not None:
            result['coupon_code'] = self.coupon_code
        if self.coupon_type is not None:
            result['coupon_type'] = self.coupon_type
        if self.coupon_value is not None:
            result['coupon_value'] = self.coupon_value
        if self.coupon_amount is not None:
            result['coupon_amount'] = self.coupon_amount
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.effective_time is not None:
            result['effective_time'] = self.effective_time
        if self.use_detail is not None:
            result['use_detail'] = self.use_detail
        if self.min_amount is not None:
            result['min_amount'] = self.min_amount
        if self.max_amount is not None:
            result['max_amount'] = self.max_amount
        if self.min_period is not None:
            result['min_period'] = self.min_period
        if self.max_period is not None:
            result['max_period'] = self.max_period
        if self.min_day is not None:
            result['min_day'] = self.min_day
        if self.repayment_method is not None:
            result['repayment_method'] = self.repayment_method
        if self.is_period_limit is not None:
            result['is_period_limit'] = self.is_period_limit
        if self.repay_condition is not None:
            result['repay_condition'] = self.repay_condition
        if self.repay_ways is not None:
            result['repay_ways'] = self.repay_ways
        if self.coupon_model_no is not None:
            result['coupon_model_no'] = self.coupon_model_no
        if self.to_maturity is not None:
            result['to_maturity'] = self.to_maturity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        if m.get('coupon_name') is not None:
            self.coupon_name = m.get('coupon_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('use_condition') is not None:
            self.use_condition = m.get('use_condition')
        if m.get('coupon_code') is not None:
            self.coupon_code = m.get('coupon_code')
        if m.get('coupon_type') is not None:
            self.coupon_type = m.get('coupon_type')
        if m.get('coupon_value') is not None:
            self.coupon_value = m.get('coupon_value')
        if m.get('coupon_amount') is not None:
            self.coupon_amount = m.get('coupon_amount')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('effective_time') is not None:
            self.effective_time = m.get('effective_time')
        if m.get('use_detail') is not None:
            self.use_detail = m.get('use_detail')
        if m.get('min_amount') is not None:
            self.min_amount = m.get('min_amount')
        if m.get('max_amount') is not None:
            self.max_amount = m.get('max_amount')
        if m.get('min_period') is not None:
            self.min_period = m.get('min_period')
        if m.get('max_period') is not None:
            self.max_period = m.get('max_period')
        if m.get('min_day') is not None:
            self.min_day = m.get('min_day')
        if m.get('repayment_method') is not None:
            self.repayment_method = m.get('repayment_method')
        if m.get('is_period_limit') is not None:
            self.is_period_limit = m.get('is_period_limit')
        if m.get('repay_condition') is not None:
            self.repay_condition = m.get('repay_condition')
        if m.get('repay_ways') is not None:
            self.repay_ways = m.get('repay_ways')
        if m.get('coupon_model_no') is not None:
            self.coupon_model_no = m.get('coupon_model_no')
        if m.get('to_maturity') is not None:
            self.to_maturity = m.get('to_maturity')
        return self


class UmktInfoModel(TeaModel):
    def __init__(
        self,
        scene_strategy_id: int = None,
        umkt_result: int = None,
        umkt_out_put_info: str = None,
    ):
        # 场景策略id
        self.scene_strategy_id = scene_strategy_id
        # 实时营销结果
        self.umkt_result = umkt_result
        # json 结构的营销额外输出信息
        self.umkt_out_put_info = umkt_out_put_info

    def validate(self):
        self.validate_required(self.scene_strategy_id, 'scene_strategy_id')
        self.validate_required(self.umkt_result, 'umkt_result')
        self.validate_required(self.umkt_out_put_info, 'umkt_out_put_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_strategy_id is not None:
            result['scene_strategy_id'] = self.scene_strategy_id
        if self.umkt_result is not None:
            result['umkt_result'] = self.umkt_result
        if self.umkt_out_put_info is not None:
            result['umkt_out_put_info'] = self.umkt_out_put_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_strategy_id') is not None:
            self.scene_strategy_id = m.get('scene_strategy_id')
        if m.get('umkt_result') is not None:
            self.umkt_result = m.get('umkt_result')
        if m.get('umkt_out_put_info') is not None:
            self.umkt_out_put_info = m.get('umkt_out_put_info')
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
        success_count: int = None,
        fail_count: int = None,
        waiting_sub_task_count: int = None,
        total_count: int = None,
    ):
        # actionDriverCode类型
        self.action_driver_code = action_driver_code
        # 成功数
        self.success_count = success_count
        # 失败数
        self.fail_count = fail_count
        # 待触达的手机号数
        self.waiting_sub_task_count = waiting_sub_task_count
        # 已收到的回执数
        self.total_count = total_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.action_driver_code is not None:
            result['action_driver_code'] = self.action_driver_code
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.fail_count is not None:
            result['fail_count'] = self.fail_count
        if self.waiting_sub_task_count is not None:
            result['waiting_sub_task_count'] = self.waiting_sub_task_count
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_driver_code') is not None:
            self.action_driver_code = m.get('action_driver_code')
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('fail_count') is not None:
            self.fail_count = m.get('fail_count')
        if m.get('waiting_sub_task_count') is not None:
            self.waiting_sub_task_count = m.get('waiting_sub_task_count')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
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
        already_guarantee_fee: int = None,
        already_liquidated_damages: int = None,
        rest_guarantee_fee: int = None,
        rest_liquidated_damages: int = None,
        need_guarantee_fee: int = None,
        need_liquidated_damages: int = None,
        overdue_days: int = None,
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
        # 已还担保费
        self.already_guarantee_fee = already_guarantee_fee
        # 已还违约金
        self.already_liquidated_damages = already_liquidated_damages
        # 当期剩余担保费
        self.rest_guarantee_fee = rest_guarantee_fee
        # 当期剩余违约金
        self.rest_liquidated_damages = rest_liquidated_damages
        # 应还担保费
        self.need_guarantee_fee = need_guarantee_fee
        # 应还违约金
        self.need_liquidated_damages = need_liquidated_damages
        # 逾期天数
        self.overdue_days = overdue_days

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
        self.validate_required(self.already_guarantee_fee, 'already_guarantee_fee')
        self.validate_required(self.already_liquidated_damages, 'already_liquidated_damages')
        self.validate_required(self.rest_guarantee_fee, 'rest_guarantee_fee')
        self.validate_required(self.rest_liquidated_damages, 'rest_liquidated_damages')
        self.validate_required(self.need_guarantee_fee, 'need_guarantee_fee')
        self.validate_required(self.need_liquidated_damages, 'need_liquidated_damages')
        self.validate_required(self.overdue_days, 'overdue_days')

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
        if self.already_guarantee_fee is not None:
            result['already_guarantee_fee'] = self.already_guarantee_fee
        if self.already_liquidated_damages is not None:
            result['already_liquidated_damages'] = self.already_liquidated_damages
        if self.rest_guarantee_fee is not None:
            result['rest_guarantee_fee'] = self.rest_guarantee_fee
        if self.rest_liquidated_damages is not None:
            result['rest_liquidated_damages'] = self.rest_liquidated_damages
        if self.need_guarantee_fee is not None:
            result['need_guarantee_fee'] = self.need_guarantee_fee
        if self.need_liquidated_damages is not None:
            result['need_liquidated_damages'] = self.need_liquidated_damages
        if self.overdue_days is not None:
            result['overdue_days'] = self.overdue_days
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
        if m.get('already_guarantee_fee') is not None:
            self.already_guarantee_fee = m.get('already_guarantee_fee')
        if m.get('already_liquidated_damages') is not None:
            self.already_liquidated_damages = m.get('already_liquidated_damages')
        if m.get('rest_guarantee_fee') is not None:
            self.rest_guarantee_fee = m.get('rest_guarantee_fee')
        if m.get('rest_liquidated_damages') is not None:
            self.rest_liquidated_damages = m.get('rest_liquidated_damages')
        if m.get('need_guarantee_fee') is not None:
            self.need_guarantee_fee = m.get('need_guarantee_fee')
        if m.get('need_liquidated_damages') is not None:
            self.need_liquidated_damages = m.get('need_liquidated_damages')
        if m.get('overdue_days') is not None:
            self.overdue_days = m.get('overdue_days')
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


class SmsTemplate(TeaModel):
    def __init__(
        self,
        scene_strategy_id: str = None,
        scene_strategy_name: str = None,
        template_content: str = None,
    ):
        # 场景策略ID
        self.scene_strategy_id = scene_strategy_id
        # 计划名称
        self.scene_strategy_name = scene_strategy_name
        # 模板内容
        self.template_content = template_content

    def validate(self):
        self.validate_required(self.scene_strategy_id, 'scene_strategy_id')
        self.validate_required(self.scene_strategy_name, 'scene_strategy_name')
        self.validate_required(self.template_content, 'template_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_strategy_id is not None:
            result['scene_strategy_id'] = self.scene_strategy_id
        if self.scene_strategy_name is not None:
            result['scene_strategy_name'] = self.scene_strategy_name
        if self.template_content is not None:
            result['template_content'] = self.template_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_strategy_id') is not None:
            self.scene_strategy_id = m.get('scene_strategy_id')
        if m.get('scene_strategy_name') is not None:
            self.scene_strategy_name = m.get('scene_strategy_name')
        if m.get('template_content') is not None:
            self.template_content = m.get('template_content')
        return self


class BackflowEventRecord(TeaModel):
    def __init__(
        self,
        properties: List[BackflowEventRecordProperty] = None,
    ):
        # 回流事件部分分组后的记录list
        self.properties = properties

    def validate(self):
        self.validate_required(self.properties, 'properties')
        if self.properties:
            for k in self.properties:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['properties'] = []
        if self.properties is not None:
            for k in self.properties:
                result['properties'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.properties = []
        if m.get('properties') is not None:
            for k in m.get('properties'):
                temp_model = BackflowEventRecordProperty()
                self.properties.append(temp_model.from_map(k))
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


class RepayInfos(TeaModel):
    def __init__(
        self,
        period: int = None,
        amount: int = None,
        principal: int = None,
        interest: int = None,
        channel_amt: int = None,
        fee: int = None,
        punish: int = None,
        guarantee_fee: int = None,
        liquidated_damages: int = None,
    ):
        # 期次
        self.period = period
        # 实还总额
        self.amount = amount
        # 实还本金
        self.principal = principal
        # 实还利息
        self.interest = interest
        # 实还通道手续费
        self.channel_amt = channel_amt
        # 实还手续费
        self.fee = fee
        # 实收罚息
        self.punish = punish
        # 担保费
        self.guarantee_fee = guarantee_fee
        # 违约金
        self.liquidated_damages = liquidated_damages

    def validate(self):
        self.validate_required(self.period, 'period')
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.principal, 'principal')
        self.validate_required(self.interest, 'interest')
        self.validate_required(self.channel_amt, 'channel_amt')
        self.validate_required(self.fee, 'fee')
        self.validate_required(self.punish, 'punish')
        self.validate_required(self.guarantee_fee, 'guarantee_fee')
        self.validate_required(self.liquidated_damages, 'liquidated_damages')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period is not None:
            result['period'] = self.period
        if self.amount is not None:
            result['amount'] = self.amount
        if self.principal is not None:
            result['principal'] = self.principal
        if self.interest is not None:
            result['interest'] = self.interest
        if self.channel_amt is not None:
            result['channel_amt'] = self.channel_amt
        if self.fee is not None:
            result['fee'] = self.fee
        if self.punish is not None:
            result['punish'] = self.punish
        if self.guarantee_fee is not None:
            result['guarantee_fee'] = self.guarantee_fee
        if self.liquidated_damages is not None:
            result['liquidated_damages'] = self.liquidated_damages
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period') is not None:
            self.period = m.get('period')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('principal') is not None:
            self.principal = m.get('principal')
        if m.get('interest') is not None:
            self.interest = m.get('interest')
        if m.get('channel_amt') is not None:
            self.channel_amt = m.get('channel_amt')
        if m.get('fee') is not None:
            self.fee = m.get('fee')
        if m.get('punish') is not None:
            self.punish = m.get('punish')
        if m.get('guarantee_fee') is not None:
            self.guarantee_fee = m.get('guarantee_fee')
        if m.get('liquidated_damages') is not None:
            self.liquidated_damages = m.get('liquidated_damages')
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


class UserAggregationInfo(TeaModel):
    def __init__(
        self,
        status: str = None,
        credit_amount: int = None,
        available_amount: int = None,
        should_pay_amount: int = None,
        overdue_amount: int = None,
        next_period_amount: int = None,
        next_period_repay_time: str = None,
        next_apply_time: str = None,
        coupon_list: List[CouponInfo] = None,
    ):
        # 状态
        # 0: 未授信
        # 1: 授信中
        # 2: 已授信未支用
        # 3: 支用中
        # 4: 已支用
        # 5: 借据逾期
        # 6: 授信过期
        # 7: 授信冻结
        # 8: 可重新授信
        # 9: 授信拒绝
        self.status = status
        # 总额度
        self.credit_amount = credit_amount
        # 可用额度
        self.available_amount = available_amount
        # 待还总金额
        self.should_pay_amount = should_pay_amount
        # 逾期总金额
        self.overdue_amount = overdue_amount
        # 下一期应还金额
        self.next_period_amount = next_period_amount
        # 下一期还款时间yyyy-MM-dd
        self.next_period_repay_time = next_period_repay_time
        # 下次可授信时间yyyy-MM-dd
        self.next_apply_time = next_apply_time
        # 优惠券列表
        self.coupon_list = coupon_list

    def validate(self):
        self.validate_required(self.status, 'status')
        if self.coupon_list:
            for k in self.coupon_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.status is not None:
            result['status'] = self.status
        if self.credit_amount is not None:
            result['credit_amount'] = self.credit_amount
        if self.available_amount is not None:
            result['available_amount'] = self.available_amount
        if self.should_pay_amount is not None:
            result['should_pay_amount'] = self.should_pay_amount
        if self.overdue_amount is not None:
            result['overdue_amount'] = self.overdue_amount
        if self.next_period_amount is not None:
            result['next_period_amount'] = self.next_period_amount
        if self.next_period_repay_time is not None:
            result['next_period_repay_time'] = self.next_period_repay_time
        if self.next_apply_time is not None:
            result['next_apply_time'] = self.next_apply_time
        result['coupon_list'] = []
        if self.coupon_list is not None:
            for k in self.coupon_list:
                result['coupon_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('credit_amount') is not None:
            self.credit_amount = m.get('credit_amount')
        if m.get('available_amount') is not None:
            self.available_amount = m.get('available_amount')
        if m.get('should_pay_amount') is not None:
            self.should_pay_amount = m.get('should_pay_amount')
        if m.get('overdue_amount') is not None:
            self.overdue_amount = m.get('overdue_amount')
        if m.get('next_period_amount') is not None:
            self.next_period_amount = m.get('next_period_amount')
        if m.get('next_period_repay_time') is not None:
            self.next_period_repay_time = m.get('next_period_repay_time')
        if m.get('next_apply_time') is not None:
            self.next_apply_time = m.get('next_apply_time')
        self.coupon_list = []
        if m.get('coupon_list') is not None:
            for k in m.get('coupon_list'):
                temp_model = CouponInfo()
                self.coupon_list.append(temp_model.from_map(k))
        return self


class SceneInfos(TeaModel):
    def __init__(
        self,
        decision: str = None,
        scene_code: str = None,
    ):
        # 决策结果
        self.decision = decision
        # 场景code
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.decision, 'decision')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.decision is not None:
            result['decision'] = self.decision
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class ActionPlanDetailInfo(TeaModel):
    def __init__(
        self,
        scene_strategy_id: int = None,
        scene_strategy_name: str = None,
        scene_strategy_status: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        action_param_info: List[ActionParamInfo] = None,
    ):
        # 场景策略id
        self.scene_strategy_id = scene_strategy_id
        # 场景策略名称
        self.scene_strategy_name = scene_strategy_name
        # 场景策略状态
        self.scene_strategy_status = scene_strategy_status
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 触达媒介参数信息
        self.action_param_info = action_param_info

    def validate(self):
        self.validate_required(self.scene_strategy_id, 'scene_strategy_id')
        self.validate_required(self.scene_strategy_name, 'scene_strategy_name')
        self.validate_required(self.scene_strategy_status, 'scene_strategy_status')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.action_param_info, 'action_param_info')
        if self.action_param_info:
            for k in self.action_param_info:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_strategy_id is not None:
            result['scene_strategy_id'] = self.scene_strategy_id
        if self.scene_strategy_name is not None:
            result['scene_strategy_name'] = self.scene_strategy_name
        if self.scene_strategy_status is not None:
            result['scene_strategy_status'] = self.scene_strategy_status
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        result['action_param_info'] = []
        if self.action_param_info is not None:
            for k in self.action_param_info:
                result['action_param_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_strategy_id') is not None:
            self.scene_strategy_id = m.get('scene_strategy_id')
        if m.get('scene_strategy_name') is not None:
            self.scene_strategy_name = m.get('scene_strategy_name')
        if m.get('scene_strategy_status') is not None:
            self.scene_strategy_status = m.get('scene_strategy_status')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        self.action_param_info = []
        if m.get('action_param_info') is not None:
            for k in m.get('action_param_info'):
                temp_model = ActionParamInfo()
                self.action_param_info.append(temp_model.from_map(k))
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


class QueryInfo(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
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


class UmktOfflineDecisionTaskDetailInfo(TeaModel):
    def __init__(
        self,
        task_id: int = None,
        decision_plan_id: int = None,
        decision_result_status: str = None,
        status_remark: str = None,
    ):
        # 任务id
        self.task_id = task_id
        # 圈客计划id
        self.decision_plan_id = decision_plan_id
        # 圈客结果状态
        self.decision_result_status = decision_result_status
        # 圈客结果状态描述
        self.status_remark = status_remark

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.decision_plan_id, 'decision_plan_id')
        self.validate_required(self.decision_result_status, 'decision_result_status')
        self.validate_required(self.status_remark, 'status_remark')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.decision_plan_id is not None:
            result['decision_plan_id'] = self.decision_plan_id
        if self.decision_result_status is not None:
            result['decision_result_status'] = self.decision_result_status
        if self.status_remark is not None:
            result['status_remark'] = self.status_remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('decision_plan_id') is not None:
            self.decision_plan_id = m.get('decision_plan_id')
        if m.get('decision_result_status') is not None:
            self.decision_result_status = m.get('decision_result_status')
        if m.get('status_remark') is not None:
            self.status_remark = m.get('status_remark')
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


class CustomInfoResult(TeaModel):
    def __init__(
        self,
        credit_code: str = None,
        company_name: str = None,
        legal_name: str = None,
        id_card: str = None,
        phone_number: str = None,
        account: str = None,
        password: str = None,
    ):
        # 社会信用代码
        self.credit_code = credit_code
        # 公司名称
        self.company_name = company_name
        # 法人姓名
        self.legal_name = legal_name
        # 身份证号
        self.id_card = id_card
        # 手机号
        self.phone_number = phone_number
        # 账号
        self.account = account
        # 密码
        self.password = password

    def validate(self):
        self.validate_required(self.credit_code, 'credit_code')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.legal_name, 'legal_name')
        self.validate_required(self.id_card, 'id_card')
        self.validate_required(self.phone_number, 'phone_number')
        self.validate_required(self.account, 'account')
        self.validate_required(self.password, 'password')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.credit_code is not None:
            result['credit_code'] = self.credit_code
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.legal_name is not None:
            result['legal_name'] = self.legal_name
        if self.id_card is not None:
            result['id_card'] = self.id_card
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        if self.account is not None:
            result['account'] = self.account
        if self.password is not None:
            result['password'] = self.password
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('credit_code') is not None:
            self.credit_code = m.get('credit_code')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('legal_name') is not None:
            self.legal_name = m.get('legal_name')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('password') is not None:
            self.password = m.get('password')
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


class ApplyInfo(TeaModel):
    def __init__(
        self,
        apply_no: str = None,
        fund_code: str = None,
        fund_name: str = None,
        rate_value: int = None,
        rate_value_day: int = None,
        days_num_year: int = None,
        total_amount: int = None,
        balance_amount: int = None,
    ):
        # 授信编号
        self.apply_no = apply_no
        # 资金方编号
        self.fund_code = fund_code
        # 资金方名称
        self.fund_name = fund_name
        # 贷款利率
        self.rate_value = rate_value
        # 贷款日利率
        self.rate_value_day = rate_value_day
        # 年天数
        self.days_num_year = days_num_year
        # 总授信额度
        self.total_amount = total_amount
        # 可用额度
        self.balance_amount = balance_amount

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.apply_no is not None:
            result['apply_no'] = self.apply_no
        if self.fund_code is not None:
            result['fund_code'] = self.fund_code
        if self.fund_name is not None:
            result['fund_name'] = self.fund_name
        if self.rate_value is not None:
            result['rate_value'] = self.rate_value
        if self.rate_value_day is not None:
            result['rate_value_day'] = self.rate_value_day
        if self.days_num_year is not None:
            result['days_num_year'] = self.days_num_year
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.balance_amount is not None:
            result['balance_amount'] = self.balance_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apply_no') is not None:
            self.apply_no = m.get('apply_no')
        if m.get('fund_code') is not None:
            self.fund_code = m.get('fund_code')
        if m.get('fund_name') is not None:
            self.fund_name = m.get('fund_name')
        if m.get('rate_value') is not None:
            self.rate_value = m.get('rate_value')
        if m.get('rate_value_day') is not None:
            self.rate_value_day = m.get('rate_value_day')
        if m.get('days_num_year') is not None:
            self.days_num_year = m.get('days_num_year')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('balance_amount') is not None:
            self.balance_amount = m.get('balance_amount')
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


class CustomerUmktInfosModel(TeaModel):
    def __init__(
        self,
        umkt_results: List[UmktInfoModel] = None,
        customer_key: str = None,
    ):
        # 归属用户的混合营销决策结果
        self.umkt_results = umkt_results
        # 用户凭证
        self.customer_key = customer_key

    def validate(self):
        self.validate_required(self.umkt_results, 'umkt_results')
        if self.umkt_results:
            for k in self.umkt_results:
                if k:
                    k.validate()
        self.validate_required(self.customer_key, 'customer_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['umkt_results'] = []
        if self.umkt_results is not None:
            for k in self.umkt_results:
                result['umkt_results'].append(k.to_map() if k else None)
        if self.customer_key is not None:
            result['customer_key'] = self.customer_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.umkt_results = []
        if m.get('umkt_results') is not None:
            for k in m.get('umkt_results'):
                temp_model = UmktInfoModel()
                self.umkt_results.append(temp_model.from_map(k))
        if m.get('customer_key') is not None:
            self.customer_key = m.get('customer_key')
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


class GwFundRouterResult(TeaModel):
    def __init__(
        self,
        fund_code: str = None,
        abbre_fund_name: str = None,
    ):
        # 资金方代码
        self.fund_code = fund_code
        # 资金方简称
        self.abbre_fund_name = abbre_fund_name

    def validate(self):
        self.validate_required(self.fund_code, 'fund_code')
        self.validate_required(self.abbre_fund_name, 'abbre_fund_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.fund_code is not None:
            result['fund_code'] = self.fund_code
        if self.abbre_fund_name is not None:
            result['abbre_fund_name'] = self.abbre_fund_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fund_code') is not None:
            self.fund_code = m.get('fund_code')
        if m.get('abbre_fund_name') is not None:
            self.abbre_fund_name = m.get('abbre_fund_name')
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


class RobotCallCustomerParam(TeaModel):
    def __init__(
        self,
        customer_key: str = None,
        customer_out_info: str = None,
        properties: str = None,
    ):
        # 手机号/手机号md5
        self.customer_key = customer_key
        # 用户维度透传字段
        self.customer_out_info = customer_out_info
        # 外呼话术变量字段
        self.properties = properties

    def validate(self):
        self.validate_required(self.customer_key, 'customer_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.customer_key is not None:
            result['customer_key'] = self.customer_key
        if self.customer_out_info is not None:
            result['customer_out_info'] = self.customer_out_info
        if self.properties is not None:
            result['properties'] = self.properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('customer_key') is not None:
            self.customer_key = m.get('customer_key')
        if m.get('customer_out_info') is not None:
            self.customer_out_info = m.get('customer_out_info')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
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


class CpaasSmsTemplate(TeaModel):
    def __init__(
        self,
        template_type: str = None,
        template_name: str = None,
        template_content: str = None,
        status: str = None,
        template_code: str = None,
        fail_reason: str = None,
        create_time: str = None,
    ):
        # 模板类型
        self.template_type = template_type
        # 模板名称
        self.template_name = template_name
        # 模板内容
        self.template_content = template_content
        # 审批状态
        self.status = status
        # 模版code
        self.template_code = template_code
        # 审核未通过原因
        self.fail_reason = fail_reason
        # 短信创建时间
        self.create_time = create_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_type is not None:
            result['template_type'] = self.template_type
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.template_content is not None:
            result['template_content'] = self.template_content
        if self.status is not None:
            result['status'] = self.status
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_type') is not None:
            self.template_type = m.get('template_type')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('template_content') is not None:
            self.template_content = m.get('template_content')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        return self


class VariableDetails(TeaModel):
    def __init__(
        self,
        variable_name: str = None,
        variable_value: str = None,
        variable_type: str = None,
    ):
        # 输出变量名称
        self.variable_name = variable_name
        # 输出变量值
        self.variable_value = variable_value
        # 输出变量值类型
        self.variable_type = variable_type

    def validate(self):
        self.validate_required(self.variable_name, 'variable_name')
        self.validate_required(self.variable_value, 'variable_value')
        self.validate_required(self.variable_type, 'variable_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.variable_name is not None:
            result['variable_name'] = self.variable_name
        if self.variable_value is not None:
            result['variable_value'] = self.variable_value
        if self.variable_type is not None:
            result['variable_type'] = self.variable_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('variable_name') is not None:
            self.variable_name = m.get('variable_name')
        if m.get('variable_value') is not None:
            self.variable_value = m.get('variable_value')
        if m.get('variable_type') is not None:
            self.variable_type = m.get('variable_type')
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


class CommonNotyfyResult(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        biz_response: str = None,
    ):
        # 请求id
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


class PlatformRepayTypeInfo(TeaModel):
    def __init__(
        self,
        repay_type: str = None,
        periods: List[str] = None,
    ):
        # 1：等额本息
        # 2：等额本金
        # 3：按期付息到期还本（先息后本）
        self.repay_type = repay_type
        # {”1“，”2“}
        self.periods = periods

    def validate(self):
        self.validate_required(self.repay_type, 'repay_type')
        self.validate_required(self.periods, 'periods')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.repay_type is not None:
            result['repay_type'] = self.repay_type
        if self.periods is not None:
            result['periods'] = self.periods
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('repay_type') is not None:
            self.repay_type = m.get('repay_type')
        if m.get('periods') is not None:
            self.periods = m.get('periods')
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
        marital_status: str = None,
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
        # 婚姻状态：00-未婚，01-已婚，02-离婚，03-丧偶，99-未知
        self.marital_status = marital_status

    def validate(self):
        self.validate_required(self.custom_name, 'custom_name')
        self.validate_required(self.card_no, 'card_no')
        self.validate_required(self.id_type, 'id_type')
        self.validate_required(self.cert_sign_date, 'cert_sign_date')
        self.validate_required(self.cert_validate, 'cert_validate')
        self.validate_required(self.cert_adr, 'cert_adr')
        self.validate_required(self.mobile, 'mobile')

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
        if self.marital_status is not None:
            result['marital_status'] = self.marital_status
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
        if m.get('marital_status') is not None:
            self.marital_status = m.get('marital_status')
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


class CustomerDetail(TeaModel):
    def __init__(
        self,
        customer_key: str = None,
        channel_params: str = None,
        ext_info: str = None,
    ):
        # 用户标识
        self.customer_key = customer_key
        # 渠道参数
        self.channel_params = channel_params
        # 用户透传字段
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.customer_key, 'customer_key')
        self.validate_required(self.channel_params, 'channel_params')
        self.validate_required(self.ext_info, 'ext_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.customer_key is not None:
            result['customer_key'] = self.customer_key
        if self.channel_params is not None:
            result['channel_params'] = self.channel_params
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('customer_key') is not None:
            self.customer_key = m.get('customer_key')
        if m.get('channel_params') is not None:
            self.channel_params = m.get('channel_params')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class CustomerBankCardInfo(TeaModel):
    def __init__(
        self,
        bank_name: str = None,
        bank_code: str = None,
        bank_card_no: str = None,
        signed: str = None,
        acct_bank_card: str = None,
    ):
        # 银行名称
        self.bank_name = bank_name
        # 银行编码
        self.bank_code = bank_code
        # 银行卡号
        self.bank_card_no = bank_card_no
        # 是否已签约
        self.signed = signed
        # 是否为账户代扣银行卡
        self.acct_bank_card = acct_bank_card

    def validate(self):
        self.validate_required(self.bank_name, 'bank_name')
        self.validate_required(self.bank_code, 'bank_code')
        self.validate_required(self.bank_card_no, 'bank_card_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.bank_code is not None:
            result['bank_code'] = self.bank_code
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.signed is not None:
            result['signed'] = self.signed
        if self.acct_bank_card is not None:
            result['acct_bank_card'] = self.acct_bank_card
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('bank_code') is not None:
            self.bank_code = m.get('bank_code')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('signed') is not None:
            self.signed = m.get('signed')
        if m.get('acct_bank_card') is not None:
            self.acct_bank_card = m.get('acct_bank_card')
        return self


class Supplier(TeaModel):
    def __init__(
        self,
        supplier_id: str = None,
        supplier_name: str = None,
    ):
        # 供应商id
        self.supplier_id = supplier_id
        # 供应商名字
        self.supplier_name = supplier_name

    def validate(self):
        self.validate_required(self.supplier_id, 'supplier_id')
        self.validate_required(self.supplier_name, 'supplier_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.supplier_id is not None:
            result['supplier_id'] = self.supplier_id
        if self.supplier_name is not None:
            result['supplier_name'] = self.supplier_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('supplier_id') is not None:
            self.supplier_id = m.get('supplier_id')
        if m.get('supplier_name') is not None:
            self.supplier_name = m.get('supplier_name')
        return self


class QueryResult(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
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


class RdaasTaxDecsionServiceIndicator(TeaModel):
    def __init__(
        self,
        id: str = None,
        service_id: str = None,
        property_name: str = None,
        property_value: str = None,
        decision_tenant: str = None,
        create_time: str = None,
    ):
        # 决策指标id
        self.id = id
        # 决策服务id
        self.service_id = service_id
        # 属性名
        self.property_name = property_name
        # 属性值或指标值
        self.property_value = property_value
        # 决策租户
        self.decision_tenant = decision_tenant
        # 创建时间，格式:yyyy-MM-dd HH:mm:ss
        self.create_time = create_time

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.property_name, 'property_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.property_name is not None:
            result['property_name'] = self.property_name
        if self.property_value is not None:
            result['property_value'] = self.property_value
        if self.decision_tenant is not None:
            result['decision_tenant'] = self.decision_tenant
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('property_name') is not None:
            self.property_name = m.get('property_name')
        if m.get('property_value') is not None:
            self.property_value = m.get('property_value')
        if m.get('decision_tenant') is not None:
            self.decision_tenant = m.get('decision_tenant')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        return self


class GetAgreementUrlResponseData(TeaModel):
    def __init__(
        self,
        title: str = None,
        agreement_url: str = None,
        file_base_64: str = None,
        pic_file_base_64list: List[str] = None,
        pic_oss_path_list: List[str] = None,
        organization_name: str = None,
        file_type: str = None,
        file_type_name: str = None,
    ):
        # 协议标题
        self.title = title
        # 协议地址
        self.agreement_url = agreement_url
        # 协议文件Base64
        self.file_base_64 = file_base_64
        # 协议图片文件base64集合
        self.pic_file_base_64list = pic_file_base_64list
        # 图片文件oss集合
        self.pic_oss_path_list = pic_oss_path_list
        # 机构名称
        self.organization_name = organization_name
        # 协议类型-code
        self.file_type = file_type
        # 协议类型-名称
        self.file_type_name = file_type_name

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.organization_name, 'organization_name')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.file_type_name, 'file_type_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.agreement_url is not None:
            result['agreement_url'] = self.agreement_url
        if self.file_base_64 is not None:
            result['file_base64'] = self.file_base_64
        if self.pic_file_base_64list is not None:
            result['pic_file_base64_list'] = self.pic_file_base_64list
        if self.pic_oss_path_list is not None:
            result['pic_oss_path_list'] = self.pic_oss_path_list
        if self.organization_name is not None:
            result['organization_name'] = self.organization_name
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.file_type_name is not None:
            result['file_type_name'] = self.file_type_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('agreement_url') is not None:
            self.agreement_url = m.get('agreement_url')
        if m.get('file_base64') is not None:
            self.file_base_64 = m.get('file_base64')
        if m.get('pic_file_base64_list') is not None:
            self.pic_file_base_64list = m.get('pic_file_base64_list')
        if m.get('pic_oss_path_list') is not None:
            self.pic_oss_path_list = m.get('pic_oss_path_list')
        if m.get('organization_name') is not None:
            self.organization_name = m.get('organization_name')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('file_type_name') is not None:
            self.file_type_name = m.get('file_type_name')
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


class BatchQueryResult(TeaModel):
    def __init__(
        self,
        query_key: str = None,
        decision: str = None,
        output_info: BatchQueryOutputModelInfo = None,
    ):
        # 查询主体
        self.query_key = query_key
        # 单用户决策结果
        self.decision = decision
        # 输出变量信息
        self.output_info = output_info

    def validate(self):
        self.validate_required(self.query_key, 'query_key')
        self.validate_required(self.decision, 'decision')
        self.validate_required(self.output_info, 'output_info')
        if self.output_info:
            self.output_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.query_key is not None:
            result['query_key'] = self.query_key
        if self.decision is not None:
            result['decision'] = self.decision
        if self.output_info is not None:
            result['output_info'] = self.output_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('query_key') is not None:
            self.query_key = m.get('query_key')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('output_info') is not None:
            temp_model = BatchQueryOutputModelInfo()
            self.output_info = temp_model.from_map(m['output_info'])
        return self


class CommonRobotCallDetail(TeaModel):
    def __init__(
        self,
        ext_info: str = None,
        result_code: str = None,
        customer_key: str = None,
        current_call_times: int = None,
        key_template: str = None,
        batch_id: str = None,
        call_type: int = None,
        tag: str = None,
        call_id: str = None,
        task_id: int = None,
        template_id: int = None,
        status_code: int = None,
        status_description: str = None,
        transfer_status_code: int = None,
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
        sms: str = None,
        chat_record: str = None,
        chats: str = None,
        add_wx: int = None,
        add_wx_status: str = None,
        answer_recall: int = None,
        properties: str = None,
        biz_properties: str = None,
        intercept_reason: str = None,
    ):
        # 客户请求时的透传字段
        self.ext_info = ext_info
        # 成功触达：OK；未触达：AI_ROBOT_CALL_REQUEST_NOT_EXIST
        self.result_code = result_code
        # 外呼号码
        self.customer_key = customer_key
        # 呼叫次数
        self.current_call_times = current_call_times
        # 号码模版
        self.key_template = key_template
        # 导入号码时返回的批次号
        self.batch_id = batch_id
        # 2001:批量-预测外呼，2002:批量-AI外呼-不转人工，2003:批量-AI外呼-接通转人工，2004: 批量-AI外呼-智能转人工,2005:批量-语音通知
        self.call_type = call_type
        # 用户自定义标签
        self.tag = tag
        # 外呼id
        self.call_id = call_id
        # 外呼任务编号
        self.task_id = task_id
        # AI话术ID
        self.template_id = template_id
        # 外呼状态编码
        self.status_code = status_code
        # 外呼状态描述
        self.status_description = status_description
        # 转人工状态编码
        self.transfer_status_code = transfer_status_code
        # 转人工状态
        self.transfer_status = transfer_status
        # 分配坐席ID
        self.agent_id = agent_id
        # 坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
        self.agent_tag = agent_tag
        # 坐席分机号
        self.agent_extension = agent_extension
        # 导入时间
        self.import_time = import_time
        # 开始通话时间
        self.call_begin_time = call_begin_time
        # 振铃时长，单位ms
        self.ring_time = ring_time
        # 接通时间
        self.answer_time = answer_time
        # 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
        self.speaking_time = speaking_time
        # 通话时长，单位：秒
        self.speaking_duration = speaking_duration
        # 挂断时间
        self.hangup_time = hangup_time
        # 对话轮次
        self.speaking_turns = speaking_turns
        # 人工通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
        self.agent_speaking_time = agent_speaking_time
        # 人工通话时长，单位：秒
        self.agent_speaking_duration = agent_speaking_duration
        # 意向标签
        self.intent_tag = intent_tag
        # 意向说明
        self.intent_description = intent_description
        # 个性标签
        self.individual_tag = individual_tag
        # 回复关键词
        self.keywords = keywords
        # 挂机方式，AI挂机1，坐席挂机2，客户挂机3
        self.hungup_type = hungup_type
        # 挂机短信，可选值：1、2
        # 1:发送，2:不发送
        self.sms = sms
        # 对话录音，URL，可以为空
        self.chat_record = chat_record
        # 聊天记录，可以为空
        self.chats = chats
        # 可选值：0、1
        # 0:不添加，1:添加
        self.add_wx = add_wx
        # 加微进度，可选值：已申请、加微成功
        self.add_wx_status = add_wx_status
        # 是否接通重呼，可选值：0、1
        # 0正常外呼，1接通重呼
        self.answer_recall = answer_recall
        # 导入号码时的参数值
        self.properties = properties
        # 导入号码时的业务参数值，原样返回
        self.biz_properties = biz_properties
        # 拦截原因：当状态为已拦截时，可选值：黑名单拦截，灰名单拦截，异常号码拦截
        self.intercept_reason = intercept_reason

    def validate(self):
        self.validate_required(self.ext_info, 'ext_info')
        self.validate_required(self.result_code, 'result_code')
        self.validate_required(self.customer_key, 'customer_key')
        self.validate_required(self.current_call_times, 'current_call_times')
        self.validate_required(self.key_template, 'key_template')
        self.validate_required(self.batch_id, 'batch_id')
        self.validate_required(self.call_type, 'call_type')
        self.validate_required(self.call_id, 'call_id')
        self.validate_required(self.task_id, 'task_id')
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
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.result_code is not None:
            result['result_code'] = self.result_code
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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
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
        return self


class PayMethodLockResult(TeaModel):
    def __init__(
        self,
        sign_status: str = None,
        account_id: str = None,
        login_id: str = None,
        pay_channel: str = None,
        account_name: str = None,
    ):
        # 签约结果
        self.sign_status = sign_status
        # 账号
        self.account_id = account_id
        # 登录号
        self.login_id = login_id
        # 支付公司
        self.pay_channel = pay_channel
        # 绑定账号名称
        self.account_name = account_name

    def validate(self):
        self.validate_required(self.sign_status, 'sign_status')
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.login_id, 'login_id')
        self.validate_required(self.pay_channel, 'pay_channel')
        self.validate_required(self.account_name, 'account_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sign_status is not None:
            result['sign_status'] = self.sign_status
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.login_id is not None:
            result['login_id'] = self.login_id
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        if self.account_name is not None:
            result['account_name'] = self.account_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sign_status') is not None:
            self.sign_status = m.get('sign_status')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('login_id') is not None:
            self.login_id = m.get('login_id')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        if m.get('account_name') is not None:
            self.account_name = m.get('account_name')
        return self


class Contract(TeaModel):
    def __init__(
        self,
        relation_no: str = None,
        contract_no: str = None,
        contract_name: str = None,
        contract_type: str = None,
        custom_no: str = None,
        save_path: str = None,
        contract_amount: int = None,
        disburse_contract_no: str = None,
        credit_contract_no: str = None,
    ):
        # 关联编号
        self.relation_no = relation_no
        # 合同编号
        self.contract_no = contract_no
        # 合同名称
        self.contract_name = contract_name
        # 合同类型
        self.contract_type = contract_type
        # 客户编号
        self.custom_no = custom_no
        # 合同存放目录
        self.save_path = save_path
        # 合同金额
        self.contract_amount = contract_amount
        # 用信合同编号
        self.disburse_contract_no = disburse_contract_no
        # 授信合同编号
        self.credit_contract_no = credit_contract_no

    def validate(self):
        self.validate_required(self.relation_no, 'relation_no')
        self.validate_required(self.contract_no, 'contract_no')
        self.validate_required(self.contract_name, 'contract_name')
        self.validate_required(self.contract_type, 'contract_type')
        self.validate_required(self.custom_no, 'custom_no')
        self.validate_required(self.save_path, 'save_path')
        self.validate_required(self.contract_amount, 'contract_amount')
        self.validate_required(self.disburse_contract_no, 'disburse_contract_no')
        self.validate_required(self.credit_contract_no, 'credit_contract_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
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
        if self.disburse_contract_no is not None:
            result['disburse_contract_no'] = self.disburse_contract_no
        if self.credit_contract_no is not None:
            result['credit_contract_no'] = self.credit_contract_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
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
        if m.get('disburse_contract_no') is not None:
            self.disburse_contract_no = m.get('disburse_contract_no')
        if m.get('credit_contract_no') is not None:
            self.credit_contract_no = m.get('credit_contract_no')
        return self


class AICallbackMessage(TeaModel):
    def __init__(
        self,
        batch_id: str = None,
        tag: str = None,
        call_id: str = None,
        template_id: int = None,
        status_code: int = None,
        status_description: str = None,
        import_time: str = None,
        call_begin_time: str = None,
        ring_time: int = None,
        answer_time: str = None,
        speaking_duration: int = None,
        hangup_time: str = None,
        speaking_turns: int = None,
        intent_tag: str = None,
        intent_description: str = None,
        individual_tag: str = None,
        keywords: str = None,
        chat_record: str = None,
        properties: str = None,
    ):
        # 批次号
        self.batch_id = batch_id
        # 用户标签
        self.tag = tag
        # 外呼id
        self.call_id = call_id
        # 外呼的话术模板Id
        self.template_id = template_id
        # 外呼状态编码
        self.status_code = status_code
        # 外呼状态描述
        self.status_description = status_description
        # 导入时间
        self.import_time = import_time
        # 开始通话时间
        self.call_begin_time = call_begin_time
        # 振铃时长, 单位毫秒
        self.ring_time = ring_time
        # 接通时间
        self.answer_time = answer_time
        # AI通话时长,单位s
        self.speaking_duration = speaking_duration
        # 挂断时间
        self.hangup_time = hangup_time
        # 对话轮次
        self.speaking_turns = speaking_turns
        # 意向标签
        self.intent_tag = intent_tag
        # 意向说明
        self.intent_description = intent_description
        # 个性标签
        self.individual_tag = individual_tag
        # 回复关键词
        self.keywords = keywords
        # 对话录音
        self.chat_record = chat_record
        # 参数值
        self.properties = properties

    def validate(self):
        self.validate_required(self.tag, 'tag')
        self.validate_required(self.call_id, 'call_id')
        self.validate_required(self.status_code, 'status_code')
        self.validate_required(self.status_description, 'status_description')
        self.validate_required(self.import_time, 'import_time')
        self.validate_required(self.call_begin_time, 'call_begin_time')
        self.validate_required(self.ring_time, 'ring_time')
        self.validate_required(self.answer_time, 'answer_time')
        self.validate_required(self.speaking_duration, 'speaking_duration')
        self.validate_required(self.hangup_time, 'hangup_time')
        self.validate_required(self.speaking_turns, 'speaking_turns')
        self.validate_required(self.intent_tag, 'intent_tag')
        self.validate_required(self.intent_description, 'intent_description')
        self.validate_required(self.individual_tag, 'individual_tag')
        self.validate_required(self.keywords, 'keywords')
        self.validate_required(self.properties, 'properties')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.batch_id is not None:
            result['batch_id'] = self.batch_id
        if self.tag is not None:
            result['tag'] = self.tag
        if self.call_id is not None:
            result['call_id'] = self.call_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.status_code is not None:
            result['status_code'] = self.status_code
        if self.status_description is not None:
            result['status_description'] = self.status_description
        if self.import_time is not None:
            result['import_time'] = self.import_time
        if self.call_begin_time is not None:
            result['call_begin_time'] = self.call_begin_time
        if self.ring_time is not None:
            result['ring_time'] = self.ring_time
        if self.answer_time is not None:
            result['answer_time'] = self.answer_time
        if self.speaking_duration is not None:
            result['speaking_duration'] = self.speaking_duration
        if self.hangup_time is not None:
            result['hangup_time'] = self.hangup_time
        if self.speaking_turns is not None:
            result['speaking_turns'] = self.speaking_turns
        if self.intent_tag is not None:
            result['intent_tag'] = self.intent_tag
        if self.intent_description is not None:
            result['intent_description'] = self.intent_description
        if self.individual_tag is not None:
            result['individual_tag'] = self.individual_tag
        if self.keywords is not None:
            result['keywords'] = self.keywords
        if self.chat_record is not None:
            result['chat_record'] = self.chat_record
        if self.properties is not None:
            result['properties'] = self.properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('batch_id') is not None:
            self.batch_id = m.get('batch_id')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        if m.get('call_id') is not None:
            self.call_id = m.get('call_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('status_code') is not None:
            self.status_code = m.get('status_code')
        if m.get('status_description') is not None:
            self.status_description = m.get('status_description')
        if m.get('import_time') is not None:
            self.import_time = m.get('import_time')
        if m.get('call_begin_time') is not None:
            self.call_begin_time = m.get('call_begin_time')
        if m.get('ring_time') is not None:
            self.ring_time = m.get('ring_time')
        if m.get('answer_time') is not None:
            self.answer_time = m.get('answer_time')
        if m.get('speaking_duration') is not None:
            self.speaking_duration = m.get('speaking_duration')
        if m.get('hangup_time') is not None:
            self.hangup_time = m.get('hangup_time')
        if m.get('speaking_turns') is not None:
            self.speaking_turns = m.get('speaking_turns')
        if m.get('intent_tag') is not None:
            self.intent_tag = m.get('intent_tag')
        if m.get('intent_description') is not None:
            self.intent_description = m.get('intent_description')
        if m.get('individual_tag') is not None:
            self.individual_tag = m.get('individual_tag')
        if m.get('keywords') is not None:
            self.keywords = m.get('keywords')
        if m.get('chat_record') is not None:
            self.chat_record = m.get('chat_record')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
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


class ShortUrlInfo(TeaModel):
    def __init__(
        self,
        mobile: str = None,
        short_url: str = None,
    ):
        # 支持卡片短信的手机号
        self.mobile = mobile
        # 解析生成的短链
        self.short_url = short_url

    def validate(self):
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.short_url, 'short_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.short_url is not None:
            result['short_url'] = self.short_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('short_url') is not None:
            self.short_url = m.get('short_url')
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


class RdaasTaxDecsionService(TeaModel):
    def __init__(
        self,
        id: str = None,
        service_name: str = None,
        service_zone: str = None,
        channel: str = None,
        decision_tenant: str = None,
        status: str = None,
        create_time: str = None,
    ):
        # 决策服务id
        self.id = id
        # 产品编码
        self.service_name = service_name
        # 区域编码
        self.service_zone = service_zone
        # 渠道
        self.channel = channel
        # 决策租户
        self.decision_tenant = decision_tenant
        # 是否启用
        self.status = status
        # 创建时间，格式:yyyy-MM-dd HH:mm:ss
        self.create_time = create_time

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.service_name, 'service_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.service_name is not None:
            result['service_name'] = self.service_name
        if self.service_zone is not None:
            result['service_zone'] = self.service_zone
        if self.channel is not None:
            result['channel'] = self.channel
        if self.decision_tenant is not None:
            result['decision_tenant'] = self.decision_tenant
        if self.status is not None:
            result['status'] = self.status
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('service_name') is not None:
            self.service_name = m.get('service_name')
        if m.get('service_zone') is not None:
            self.service_zone = m.get('service_zone')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('decision_tenant') is not None:
            self.decision_tenant = m.get('decision_tenant')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
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


class FundChainLockResult(TeaModel):
    def __init__(
        self,
        name: str = None,
        id: str = None,
        status: str = None,
    ):
        # 店铺名称
        self.name = name
        # 店铺id
        self.id = id
        # 0:成功
        # 1:失败
        # 2:处理中
        self.status = status

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.id, 'id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.id is not None:
            result['id'] = self.id
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('status') is not None:
            self.status = m.get('status')
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


class CertificateInfo(TeaModel):
    def __init__(
        self,
        status: str = None,
        relation_no: str = None,
        certificate_url: str = None,
        certificate_base_64: str = None,
        message: str = None,
    ):
        # 结清证明开具结果，0：有结清证明、1：无结清证明、2：开具中、3：暂不支持开具
        self.status = status
        # 用信申请订单号
        self.relation_no = relation_no
        # 结清证明url
        self.certificate_url = certificate_url
        # 结清证明文件Base64
        self.certificate_base_64 = certificate_base_64
        # 说明
        self.message = message

    def validate(self):
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.status is not None:
            result['status'] = self.status
        if self.relation_no is not None:
            result['relation_no'] = self.relation_no
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.certificate_base_64 is not None:
            result['certificate_base64'] = self.certificate_base_64
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('relation_no') is not None:
            self.relation_no = m.get('relation_no')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('certificate_base64') is not None:
            self.certificate_base_64 = m.get('certificate_base64')
        if m.get('message') is not None:
            self.message = m.get('message')
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


class OfflineDecisionPlanDetail(TeaModel):
    def __init__(
        self,
        decision_plan_id: str = None,
        decision_result_status: str = None,
    ):
        # 圈客计划ID
        self.decision_plan_id = decision_plan_id
        # 离线圈客执行任务状态
        self.decision_result_status = decision_result_status

    def validate(self):
        self.validate_required(self.decision_plan_id, 'decision_plan_id')
        self.validate_required(self.decision_result_status, 'decision_result_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.decision_plan_id is not None:
            result['decision_plan_id'] = self.decision_plan_id
        if self.decision_result_status is not None:
            result['decision_result_status'] = self.decision_result_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('decision_plan_id') is not None:
            self.decision_plan_id = m.get('decision_plan_id')
        if m.get('decision_result_status') is not None:
            self.decision_result_status = m.get('decision_result_status')
        return self


class UserClassifyInfo(TeaModel):
    def __init__(
        self,
        version: str = None,
        rate_classify: str = None,
        classify_ext_1: str = None,
        classify_ext_2: str = None,
    ):
        # 版本号
        self.version = version
        # 流量分层
        self.rate_classify = rate_classify
        # 流量扩展分层1
        self.classify_ext_1 = classify_ext_1
        # 流量扩展分层2
        self.classify_ext_2 = classify_ext_2

    def validate(self):
        self.validate_required(self.version, 'version')
        self.validate_required(self.rate_classify, 'rate_classify')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.version is not None:
            result['version'] = self.version
        if self.rate_classify is not None:
            result['rate_classify'] = self.rate_classify
        if self.classify_ext_1 is not None:
            result['classify_ext1'] = self.classify_ext_1
        if self.classify_ext_2 is not None:
            result['classify_ext2'] = self.classify_ext_2
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('rate_classify') is not None:
            self.rate_classify = m.get('rate_classify')
        if m.get('classify_ext1') is not None:
            self.classify_ext_1 = m.get('classify_ext1')
        if m.get('classify_ext2') is not None:
            self.classify_ext_2 = m.get('classify_ext2')
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
        pay_date_sup: str = None,
        expire_date_sup: str = None,
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
        # 发放日期（兼容字段）
        self.pay_date_sup = pay_date_sup
        # 到期日期（兼容字段）
        self.expire_date_sup = expire_date_sup

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
        if self.pay_date_sup is not None:
            self.validate_pattern(self.pay_date_sup, 'pay_date_sup', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.expire_date_sup is not None:
            self.validate_pattern(self.expire_date_sup, 'expire_date_sup', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.pay_date_sup is not None:
            result['pay_date_sup'] = self.pay_date_sup
        if self.expire_date_sup is not None:
            result['expire_date_sup'] = self.expire_date_sup
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
        if m.get('pay_date_sup') is not None:
            self.pay_date_sup = m.get('pay_date_sup')
        if m.get('expire_date_sup') is not None:
            self.expire_date_sup = m.get('expire_date_sup')
        return self


class EventInfo(TeaModel):
    def __init__(
        self,
        event_code: str = None,
        gmt_occur: str = None,
    ):
        # 事件编码
        self.event_code = event_code
        # 事件产生时间
        self.gmt_occur = gmt_occur

    def validate(self):
        self.validate_required(self.event_code, 'event_code')
        self.validate_required(self.gmt_occur, 'gmt_occur')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.event_code is not None:
            result['event_code'] = self.event_code
        if self.gmt_occur is not None:
            result['gmt_occur'] = self.gmt_occur
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('event_code') is not None:
            self.event_code = m.get('event_code')
        if m.get('gmt_occur') is not None:
            self.gmt_occur = m.get('gmt_occur')
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
        discount_after_need_amt: int = None,
        discount_after_interest: int = None,
        discount_interest: int = None,
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
        # 优惠后应还金额
        self.discount_after_need_amt = discount_after_need_amt
        # 优惠后应还利息
        self.discount_after_interest = discount_after_interest
        # 优惠利息
        self.discount_interest = discount_interest

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
        if self.discount_after_need_amt is not None:
            result['discount_after_need_amt'] = self.discount_after_need_amt
        if self.discount_after_interest is not None:
            result['discount_after_interest'] = self.discount_after_interest
        if self.discount_interest is not None:
            result['discount_interest'] = self.discount_interest
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
        if m.get('discount_after_need_amt') is not None:
            self.discount_after_need_amt = m.get('discount_after_need_amt')
        if m.get('discount_after_interest') is not None:
            self.discount_after_interest = m.get('discount_after_interest')
        if m.get('discount_interest') is not None:
            self.discount_interest = m.get('discount_interest')
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


class TenantActionPlanInfo(TeaModel):
    def __init__(
        self,
        scene_strategy_id: int = None,
        scene_strategy_name: str = None,
        scene_strategy_status: str = None,
        action_driver_code: int = None,
        channel_code: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        action_param_info: List[str] = None,
        is_param_query_done: bool = None,
    ):
        # 场景策略id
        self.scene_strategy_id = scene_strategy_id
        # 营销名称
        self.scene_strategy_name = scene_strategy_name
        # 营销状态
        self.scene_strategy_status = scene_strategy_status
        # 渠道id
        self.action_driver_code = action_driver_code
        # 渠道类型
        self.channel_code = channel_code
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 场景策略入参名
        self.action_param_info = action_param_info
        # 参数查询是否完成
        self.is_param_query_done = is_param_query_done

    def validate(self):
        self.validate_required(self.scene_strategy_id, 'scene_strategy_id')
        self.validate_required(self.scene_strategy_name, 'scene_strategy_name')
        self.validate_required(self.scene_strategy_status, 'scene_strategy_status')
        self.validate_required(self.action_driver_code, 'action_driver_code')
        self.validate_required(self.channel_code, 'channel_code')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_strategy_id is not None:
            result['scene_strategy_id'] = self.scene_strategy_id
        if self.scene_strategy_name is not None:
            result['scene_strategy_name'] = self.scene_strategy_name
        if self.scene_strategy_status is not None:
            result['scene_strategy_status'] = self.scene_strategy_status
        if self.action_driver_code is not None:
            result['action_driver_code'] = self.action_driver_code
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.action_param_info is not None:
            result['action_param_info'] = self.action_param_info
        if self.is_param_query_done is not None:
            result['is_param_query_done'] = self.is_param_query_done
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_strategy_id') is not None:
            self.scene_strategy_id = m.get('scene_strategy_id')
        if m.get('scene_strategy_name') is not None:
            self.scene_strategy_name = m.get('scene_strategy_name')
        if m.get('scene_strategy_status') is not None:
            self.scene_strategy_status = m.get('scene_strategy_status')
        if m.get('action_driver_code') is not None:
            self.action_driver_code = m.get('action_driver_code')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('action_param_info') is not None:
            self.action_param_info = m.get('action_param_info')
        if m.get('is_param_query_done') is not None:
            self.is_param_query_done = m.get('is_param_query_done')
        return self


class PushQmpBackflowEventRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        event_id: int = None,
        event_records: List[BackflowEventRecord] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 回流事件id，对应租户回流事件id
        self.event_id = event_id
        # 回流事件记录列表
        self.event_records = event_records

    def validate(self):
        self.validate_required(self.event_id, 'event_id')
        self.validate_required(self.event_records, 'event_records')
        if self.event_records:
            for k in self.event_records:
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
        if self.event_id is not None:
            result['event_id'] = self.event_id
        result['event_records'] = []
        if self.event_records is not None:
            for k in self.event_records:
                result['event_records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        self.event_records = []
        if m.get('event_records') is not None:
            for k in m.get('event_records'):
                temp_model = BackflowEventRecord()
                self.event_records.append(temp_model.from_map(k))
        return self


class PushQmpBackflowEventResponse(TeaModel):
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


