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


class AiExtraAttr(TeaModel):
    def __init__(
        self,
        time_range_thres: str = None,
        abnormal_value_thres: str = None,
        value_range_thres: str = None,
        algo_score_thres: str = None,
    ):
        # time_range_thres
        self.time_range_thres = time_range_thres
        # abnormal_value_thres
        self.abnormal_value_thres = abnormal_value_thres
        # value_range_thres
        self.value_range_thres = value_range_thres
        # algo_score_thres
        self.algo_score_thres = algo_score_thres

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.time_range_thres is not None:
            result['time_range_thres'] = self.time_range_thres
        if self.abnormal_value_thres is not None:
            result['abnormal_value_thres'] = self.abnormal_value_thres
        if self.value_range_thres is not None:
            result['value_range_thres'] = self.value_range_thres
        if self.algo_score_thres is not None:
            result['algo_score_thres'] = self.algo_score_thres
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time_range_thres') is not None:
            self.time_range_thres = m.get('time_range_thres')
        if m.get('abnormal_value_thres') is not None:
            self.abnormal_value_thres = m.get('abnormal_value_thres')
        if m.get('value_range_thres') is not None:
            self.value_range_thres = m.get('value_range_thres')
        if m.get('algo_score_thres') is not None:
            self.algo_score_thres = m.get('algo_score_thres')
        return self


class Threshold(TeaModel):
    def __init__(
        self,
        level_1: str = None,
        level_2: str = None,
        level_3: str = None,
        im: str = None,
        sms: str = None,
        control_plan: str = None,
    ):
        # level1
        self.level_1 = level_1
        # level2
        self.level_2 = level_2
        # level3
        self.level_3 = level_3
        # im
        self.im = im
        # sms
        self.sms = sms
        # control_plan
        self.control_plan = control_plan

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.level_1 is not None:
            result['level1'] = self.level_1
        if self.level_2 is not None:
            result['level2'] = self.level_2
        if self.level_3 is not None:
            result['level3'] = self.level_3
        if self.im is not None:
            result['im'] = self.im
        if self.sms is not None:
            result['sms'] = self.sms
        if self.control_plan is not None:
            result['control_plan'] = self.control_plan
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('level1') is not None:
            self.level_1 = m.get('level1')
        if m.get('level2') is not None:
            self.level_2 = m.get('level2')
        if m.get('level3') is not None:
            self.level_3 = m.get('level3')
        if m.get('im') is not None:
            self.im = m.get('im')
        if m.get('sms') is not None:
            self.sms = m.get('sms')
        if m.get('control_plan') is not None:
            self.control_plan = m.get('control_plan')
        return self


class DimFilter(TeaModel):
    def __init__(
        self,
        dim_index: int = None,
        dim_name: str = None,
        white_names: List[str] = None,
        black_names: List[str] = None,
    ):
        # dim_index
        self.dim_index = dim_index
        # dim_name
        self.dim_name = dim_name
        # white_names
        self.white_names = white_names
        # black_names
        self.black_names = black_names

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.dim_index is not None:
            result['dim_index'] = self.dim_index
        if self.dim_name is not None:
            result['dim_name'] = self.dim_name
        if self.white_names is not None:
            result['white_names'] = self.white_names
        if self.black_names is not None:
            result['black_names'] = self.black_names
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('dim_index') is not None:
            self.dim_index = m.get('dim_index')
        if m.get('dim_name') is not None:
            self.dim_name = m.get('dim_name')
        if m.get('white_names') is not None:
            self.white_names = m.get('white_names')
        if m.get('black_names') is not None:
            self.black_names = m.get('black_names')
        return self


class TimeFilter(TeaModel):
    def __init__(
        self,
        from_: str = None,
        to: str = None,
        weeks: List[int] = None,
    ):
        # from
        self.from_ = from_
        # to
        self.to = to
        # weeks
        self.weeks = weeks

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.weeks is not None:
            result['weeks'] = self.weeks
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('weeks') is not None:
            self.weeks = m.get('weeks')
        return self


class Trigger(TeaModel):
    def __init__(
        self,
        value_field: str = None,
        value_index: int = None,
        type: str = None,
        n: int = None,
        compare: str = None,
        compare_percent: str = None,
        threshold: Threshold = None,
        threshold_copy: Threshold = None,
        value_is_percent: bool = None,
    ):
        # value_field
        self.value_field = value_field
        # value_index
        self.value_index = value_index
        # type
        self.type = type
        # n
        self.n = n
        # compare
        self.compare = compare
        # compare_percent
        self.compare_percent = compare_percent
        # threshold
        self.threshold = threshold
        # threshold_copy
        self.threshold_copy = threshold_copy
        # value_is_percent
        self.value_is_percent = value_is_percent

    def validate(self):
        if self.threshold:
            self.threshold.validate()
        if self.threshold_copy:
            self.threshold_copy.validate()

    def to_map(self):
        result = dict()
        if self.value_field is not None:
            result['value_field'] = self.value_field
        if self.value_index is not None:
            result['value_index'] = self.value_index
        if self.type is not None:
            result['type'] = self.type
        if self.n is not None:
            result['n'] = self.n
        if self.compare is not None:
            result['compare'] = self.compare
        if self.compare_percent is not None:
            result['compare_percent'] = self.compare_percent
        if self.threshold is not None:
            result['threshold'] = self.threshold.to_map()
        if self.threshold_copy is not None:
            result['threshold_copy'] = self.threshold_copy.to_map()
        if self.value_is_percent is not None:
            result['value_is_percent'] = self.value_is_percent
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('value_field') is not None:
            self.value_field = m.get('value_field')
        if m.get('value_index') is not None:
            self.value_index = m.get('value_index')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('n') is not None:
            self.n = m.get('n')
        if m.get('compare') is not None:
            self.compare = m.get('compare')
        if m.get('compare_percent') is not None:
            self.compare_percent = m.get('compare_percent')
        if m.get('threshold') is not None:
            temp_model = Threshold()
            self.threshold = temp_model.from_map(m['threshold'])
        if m.get('threshold_copy') is not None:
            temp_model = Threshold()
            self.threshold_copy = temp_model.from_map(m['threshold_copy'])
        if m.get('value_is_percent') is not None:
            self.value_is_percent = m.get('value_is_percent')
        return self


class ControlPlan(TeaModel):
    def __init__(
        self,
        action_id: int = None,
        name: str = None,
        plugin_type: str = None,
        plugin_id: str = None,
        file_id: int = None,
        ds_name: str = None,
    ):
        # action_id
        self.action_id = action_id
        # name
        self.name = name
        # plugin_type
        self.plugin_type = plugin_type
        # plugin_id
        self.plugin_id = plugin_id
        # file_id
        self.file_id = file_id
        # ds_name
        self.ds_name = ds_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.action_id is not None:
            result['action_id'] = self.action_id
        if self.name is not None:
            result['name'] = self.name
        if self.plugin_type is not None:
            result['plugin_type'] = self.plugin_type
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.ds_name is not None:
            result['ds_name'] = self.ds_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('action_id') is not None:
            self.action_id = m.get('action_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('plugin_type') is not None:
            self.plugin_type = m.get('plugin_type')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('ds_name') is not None:
            self.ds_name = m.get('ds_name')
        return self


class TimeRange(TeaModel):
    def __init__(
        self,
        start: int = None,
        end: int = None,
    ):
        # start
        self.start = start
        # end
        self.end = end

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.start is not None:
            result['start'] = self.start
        if self.end is not None:
            result['end'] = self.end
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('start') is not None:
            self.start = m.get('start')
        if m.get('end') is not None:
            self.end = m.get('end')
        return self


class AiAlarmParams(TeaModel):
    def __init__(
        self,
        value_fields: List[str] = None,
        ai_algo_code: str = None,
        ai_extra_attr: AiExtraAttr = None,
    ):
        # value_fields
        self.value_fields = value_fields
        # ai_algo_code
        self.ai_algo_code = ai_algo_code
        # ai_extra_attr
        self.ai_extra_attr = ai_extra_attr

    def validate(self):
        if self.ai_extra_attr:
            self.ai_extra_attr.validate()

    def to_map(self):
        result = dict()
        if self.value_fields is not None:
            result['value_fields'] = self.value_fields
        if self.ai_algo_code is not None:
            result['ai_algo_code'] = self.ai_algo_code
        if self.ai_extra_attr is not None:
            result['ai_extra_attr'] = self.ai_extra_attr.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('value_fields') is not None:
            self.value_fields = m.get('value_fields')
        if m.get('ai_algo_code') is not None:
            self.ai_algo_code = m.get('ai_algo_code')
        if m.get('ai_extra_attr') is not None:
            temp_model = AiExtraAttr()
            self.ai_extra_attr = temp_model.from_map(m['ai_extra_attr'])
        return self


class Rule(TeaModel):
    def __init__(
        self,
        ai_alarm_params: AiAlarmParams = None,
        name: str = None,
        run_type: str = None,
        cal_time_range: TimeRange = None,
        exclude_data_time_range: TimeRange = None,
        dim_filters: List[DimFilter] = None,
        time_filter: TimeFilter = None,
        triggers: List[Trigger] = None,
        andor: str = None,
        control_plan_auto: bool = None,
        control_plans: List[ControlPlan] = None,
        function_id: int = None,
        from_tmp_rule: int = None,
        rule_type: str = None,
        ports: List[str] = None,
        group_by: List[str] = None,
    ):
        # ai_alarm_params
        self.ai_alarm_params = ai_alarm_params
        # name
        self.name = name
        # run_type
        self.run_type = run_type
        # cal_time_range
        self.cal_time_range = cal_time_range
        # exclude_data_time_range
        self.exclude_data_time_range = exclude_data_time_range
        # dim_filters
        self.dim_filters = dim_filters
        # time_filter
        self.time_filter = time_filter
        # triggers
        self.triggers = triggers
        # andor
        self.andor = andor
        # control_plan_auto
        self.control_plan_auto = control_plan_auto
        # control_plans
        self.control_plans = control_plans
        # function_id
        self.function_id = function_id
        # from_tmp_rule
        self.from_tmp_rule = from_tmp_rule
        # rule_type
        self.rule_type = rule_type
        # ports
        self.ports = ports
        # group_by
        self.group_by = group_by

    def validate(self):
        if self.ai_alarm_params:
            self.ai_alarm_params.validate()
        if self.cal_time_range:
            self.cal_time_range.validate()
        if self.exclude_data_time_range:
            self.exclude_data_time_range.validate()
        if self.dim_filters:
            for k in self.dim_filters:
                if k:
                    k.validate()
        if self.time_filter:
            self.time_filter.validate()
        if self.triggers:
            for k in self.triggers:
                if k:
                    k.validate()
        if self.control_plans:
            for k in self.control_plans:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.ai_alarm_params is not None:
            result['ai_alarm_params'] = self.ai_alarm_params.to_map()
        if self.name is not None:
            result['name'] = self.name
        if self.run_type is not None:
            result['run_type'] = self.run_type
        if self.cal_time_range is not None:
            result['cal_time_range'] = self.cal_time_range.to_map()
        if self.exclude_data_time_range is not None:
            result['exclude_data_time_range'] = self.exclude_data_time_range.to_map()
        result['dim_filters'] = []
        if self.dim_filters is not None:
            for k in self.dim_filters:
                result['dim_filters'].append(k.to_map() if k else None)
        if self.time_filter is not None:
            result['time_filter'] = self.time_filter.to_map()
        result['triggers'] = []
        if self.triggers is not None:
            for k in self.triggers:
                result['triggers'].append(k.to_map() if k else None)
        if self.andor is not None:
            result['andor'] = self.andor
        if self.control_plan_auto is not None:
            result['control_plan_auto'] = self.control_plan_auto
        result['control_plans'] = []
        if self.control_plans is not None:
            for k in self.control_plans:
                result['control_plans'].append(k.to_map() if k else None)
        if self.function_id is not None:
            result['function_id'] = self.function_id
        if self.from_tmp_rule is not None:
            result['from_tmp_rule'] = self.from_tmp_rule
        if self.rule_type is not None:
            result['rule_type'] = self.rule_type
        if self.ports is not None:
            result['ports'] = self.ports
        if self.group_by is not None:
            result['group_by'] = self.group_by
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ai_alarm_params') is not None:
            temp_model = AiAlarmParams()
            self.ai_alarm_params = temp_model.from_map(m['ai_alarm_params'])
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('run_type') is not None:
            self.run_type = m.get('run_type')
        if m.get('cal_time_range') is not None:
            temp_model = TimeRange()
            self.cal_time_range = temp_model.from_map(m['cal_time_range'])
        if m.get('exclude_data_time_range') is not None:
            temp_model = TimeRange()
            self.exclude_data_time_range = temp_model.from_map(m['exclude_data_time_range'])
        self.dim_filters = []
        if m.get('dim_filters') is not None:
            for k in m.get('dim_filters'):
                temp_model = DimFilter()
                self.dim_filters.append(temp_model.from_map(k))
        if m.get('time_filter') is not None:
            temp_model = TimeFilter()
            self.time_filter = temp_model.from_map(m['time_filter'])
        self.triggers = []
        if m.get('triggers') is not None:
            for k in m.get('triggers'):
                temp_model = Trigger()
                self.triggers.append(temp_model.from_map(k))
        if m.get('andor') is not None:
            self.andor = m.get('andor')
        if m.get('control_plan_auto') is not None:
            self.control_plan_auto = m.get('control_plan_auto')
        self.control_plans = []
        if m.get('control_plans') is not None:
            for k in m.get('control_plans'):
                temp_model = ControlPlan()
                self.control_plans.append(temp_model.from_map(k))
        if m.get('function_id') is not None:
            self.function_id = m.get('function_id')
        if m.get('from_tmp_rule') is not None:
            self.from_tmp_rule = m.get('from_tmp_rule')
        if m.get('rule_type') is not None:
            self.rule_type = m.get('rule_type')
        if m.get('ports') is not None:
            self.ports = m.get('ports')
        if m.get('group_by') is not None:
            self.group_by = m.get('group_by')
        return self


class Model(TeaModel):
    def __init__(
        self,
        rules: List[Rule] = None,
        batch_rule_id: str = None,
    ):
        # rules
        self.rules = rules
        # batch_rule_id
        self.batch_rule_id = batch_rule_id

    def validate(self):
        if self.rules:
            for k in self.rules:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['rules'] = []
        if self.rules is not None:
            for k in self.rules:
                result['rules'].append(k.to_map() if k else None)
        if self.batch_rule_id is not None:
            result['batch_rule_id'] = self.batch_rule_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.rules = []
        if m.get('rules') is not None:
            for k in m.get('rules'):
                temp_model = Rule()
                self.rules.append(temp_model.from_map(k))
        if m.get('batch_rule_id') is not None:
            self.batch_rule_id = m.get('batch_rule_id')
        return self


class StackState(TeaModel):
    def __init__(
        self,
        state: str = None,
        values: List[str] = None,
        is_black: bool = None,
    ):
        # state
        self.state = state
        # values
        self.values = values
        # is_black
        self.is_black = is_black

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.state is not None:
            result['state'] = self.state
        if self.values is not None:
            result['values'] = self.values
        if self.is_black is not None:
            result['is_black'] = self.is_black
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('values') is not None:
            self.values = m.get('values')
        if m.get('is_black') is not None:
            self.is_black = m.get('is_black')
        return self


class AlarmHistory(TeaModel):
    def __init__(
        self,
        alarm_level: int = None,
        alarm_pkg_id: int = None,
        alarm_rule_name: str = None,
        alarm_source_type: str = None,
        alarm_time: int = None,
        biz_domain_id: int = None,
        context: str = None,
        custom_plugin_id: int = None,
        id: int = None,
        meta_group_id: int = None,
        msg: str = None,
        stack_entity_id: int = None,
        stack_id: int = None,
        stack_monitor_item_name: str = None,
        stack_universal_table_id: str = None,
        tag_value_id: int = None,
        tenant_id: int = None,
        workspace_id: int = None,
    ):
        # alarm_level
        self.alarm_level = alarm_level
        # alarmPkgId
        self.alarm_pkg_id = alarm_pkg_id
        # alarm_rule_name
        self.alarm_rule_name = alarm_rule_name
        # alarmSourceType
        self.alarm_source_type = alarm_source_type
        # alarm_time
        self.alarm_time = alarm_time
        # biz_domain_id
        self.biz_domain_id = biz_domain_id
        # context
        self.context = context
        # custom_plugin_id
        self.custom_plugin_id = custom_plugin_id
        # id
        self.id = id
        # meta_group_id
        self.meta_group_id = meta_group_id
        # msg
        self.msg = msg
        # stack_entity_id
        self.stack_entity_id = stack_entity_id
        # stack_id
        self.stack_id = stack_id
        # stack_monitor_item_name
        self.stack_monitor_item_name = stack_monitor_item_name
        # stack_universal_table_id
        self.stack_universal_table_id = stack_universal_table_id
        # tag_value_id
        self.tag_value_id = tag_value_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.alarm_level is not None:
            result['alarm_level'] = self.alarm_level
        if self.alarm_pkg_id is not None:
            result['alarm_pkg_id'] = self.alarm_pkg_id
        if self.alarm_rule_name is not None:
            result['alarm_rule_name'] = self.alarm_rule_name
        if self.alarm_source_type is not None:
            result['alarm_source_type'] = self.alarm_source_type
        if self.alarm_time is not None:
            result['alarm_time'] = self.alarm_time
        if self.biz_domain_id is not None:
            result['biz_domain_id'] = self.biz_domain_id
        if self.context is not None:
            result['context'] = self.context
        if self.custom_plugin_id is not None:
            result['custom_plugin_id'] = self.custom_plugin_id
        if self.id is not None:
            result['id'] = self.id
        if self.meta_group_id is not None:
            result['meta_group_id'] = self.meta_group_id
        if self.msg is not None:
            result['msg'] = self.msg
        if self.stack_entity_id is not None:
            result['stack_entity_id'] = self.stack_entity_id
        if self.stack_id is not None:
            result['stack_id'] = self.stack_id
        if self.stack_monitor_item_name is not None:
            result['stack_monitor_item_name'] = self.stack_monitor_item_name
        if self.stack_universal_table_id is not None:
            result['stack_universal_table_id'] = self.stack_universal_table_id
        if self.tag_value_id is not None:
            result['tag_value_id'] = self.tag_value_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alarm_level') is not None:
            self.alarm_level = m.get('alarm_level')
        if m.get('alarm_pkg_id') is not None:
            self.alarm_pkg_id = m.get('alarm_pkg_id')
        if m.get('alarm_rule_name') is not None:
            self.alarm_rule_name = m.get('alarm_rule_name')
        if m.get('alarm_source_type') is not None:
            self.alarm_source_type = m.get('alarm_source_type')
        if m.get('alarm_time') is not None:
            self.alarm_time = m.get('alarm_time')
        if m.get('biz_domain_id') is not None:
            self.biz_domain_id = m.get('biz_domain_id')
        if m.get('context') is not None:
            self.context = m.get('context')
        if m.get('custom_plugin_id') is not None:
            self.custom_plugin_id = m.get('custom_plugin_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('meta_group_id') is not None:
            self.meta_group_id = m.get('meta_group_id')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('stack_entity_id') is not None:
            self.stack_entity_id = m.get('stack_entity_id')
        if m.get('stack_id') is not None:
            self.stack_id = m.get('stack_id')
        if m.get('stack_monitor_item_name') is not None:
            self.stack_monitor_item_name = m.get('stack_monitor_item_name')
        if m.get('stack_universal_table_id') is not None:
            self.stack_universal_table_id = m.get('stack_universal_table_id')
        if m.get('tag_value_id') is not None:
            self.tag_value_id = m.get('tag_value_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class OpsFilter(TeaModel):
    def __init__(
        self,
        black: bool = None,
        names: List[str] = None,
    ):
        # black
        self.black = black
        # names
        self.names = names

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.black is not None:
            result['black'] = self.black
        if self.names is not None:
            result['names'] = self.names
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('black') is not None:
            self.black = m.get('black')
        if m.get('names') is not None:
            self.names = m.get('names')
        return self


class KeySet(TeaModel):
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


class AlarmDO(TeaModel):
    def __init__(
        self,
        model: Model = None,
        level: str = None,
        frequency: int = None,
        silent_minute: str = None,
        emergency_copy: str = None,
        emergency_url: str = None,
        time_zone: str = None,
        time_zone_custom: bool = None,
    ):
        # model
        self.model = model
        # level
        self.level = level
        # frequency
        self.frequency = frequency
        # silent_minute
        self.silent_minute = silent_minute
        # emergency_copy
        self.emergency_copy = emergency_copy
        # emergency_url
        self.emergency_url = emergency_url
        # time_zone
        self.time_zone = time_zone
        # time_zone_custom
        self.time_zone_custom = time_zone_custom

    def validate(self):
        if self.model:
            self.model.validate()

    def to_map(self):
        result = dict()
        if self.model is not None:
            result['model'] = self.model.to_map()
        if self.level is not None:
            result['level'] = self.level
        if self.frequency is not None:
            result['frequency'] = self.frequency
        if self.silent_minute is not None:
            result['silent_minute'] = self.silent_minute
        if self.emergency_copy is not None:
            result['emergency_copy'] = self.emergency_copy
        if self.emergency_url is not None:
            result['emergency_url'] = self.emergency_url
        if self.time_zone is not None:
            result['time_zone'] = self.time_zone
        if self.time_zone_custom is not None:
            result['time_zone_custom'] = self.time_zone_custom
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model') is not None:
            temp_model = Model()
            self.model = temp_model.from_map(m['model'])
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('frequency') is not None:
            self.frequency = m.get('frequency')
        if m.get('silent_minute') is not None:
            self.silent_minute = m.get('silent_minute')
        if m.get('emergency_copy') is not None:
            self.emergency_copy = m.get('emergency_copy')
        if m.get('emergency_url') is not None:
            self.emergency_url = m.get('emergency_url')
        if m.get('time_zone') is not None:
            self.time_zone = m.get('time_zone')
        if m.get('time_zone_custom') is not None:
            self.time_zone_custom = m.get('time_zone_custom')
        return self


class TimeSeriesMetricsField(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # Field key
        self.key = key
        # Field value
        self.value = value

    def validate(self):
        pass

    def to_map(self):
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


class TopAlarmDO(TeaModel):
    def __init__(
        self,
        error: str = None,
        error_count: int = None,
        warn: str = None,
        warn_count: int = None,
        alarm_level: int = None,
        max_alarm_count: int = None,
        emergency_copy: str = None,
        emergency_url: str = None,
    ):
        # error
        self.error = error
        # error_count
        self.error_count = error_count
        # warn
        self.warn = warn
        # warn_count
        self.warn_count = warn_count
        # alarm_level
        self.alarm_level = alarm_level
        # max_alarm_count
        self.max_alarm_count = max_alarm_count
        # emergency_copy
        self.emergency_copy = emergency_copy
        # emergency_url
        self.emergency_url = emergency_url

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.error is not None:
            result['error'] = self.error
        if self.error_count is not None:
            result['error_count'] = self.error_count
        if self.warn is not None:
            result['warn'] = self.warn
        if self.warn_count is not None:
            result['warn_count'] = self.warn_count
        if self.alarm_level is not None:
            result['alarm_level'] = self.alarm_level
        if self.max_alarm_count is not None:
            result['max_alarm_count'] = self.max_alarm_count
        if self.emergency_copy is not None:
            result['emergency_copy'] = self.emergency_copy
        if self.emergency_url is not None:
            result['emergency_url'] = self.emergency_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('error') is not None:
            self.error = m.get('error')
        if m.get('error_count') is not None:
            self.error_count = m.get('error_count')
        if m.get('warn') is not None:
            self.warn = m.get('warn')
        if m.get('warn_count') is not None:
            self.warn_count = m.get('warn_count')
        if m.get('alarm_level') is not None:
            self.alarm_level = m.get('alarm_level')
        if m.get('max_alarm_count') is not None:
            self.max_alarm_count = m.get('max_alarm_count')
        if m.get('emergency_copy') is not None:
            self.emergency_copy = m.get('emergency_copy')
        if m.get('emergency_url') is not None:
            self.emergency_url = m.get('emergency_url')
        return self


class PontusTrendRequest(TeaModel):
    def __init__(
        self,
        token: str = None,
        metric_table: str = None,
        site_env: str = None,
        view_id: str = None,
        period_type: str = None,
        extra_dim_names: List[str] = None,
        metric_filter: str = None,
        start: int = None,
        end: int = None,
        dim_conditions_list: List[KeySet] = None,
        dim_expression: KeySet = None,
        dim_expression_list: List[KeySet] = None,
    ):
        # token
        self.token = token
        # metric_table
        self.metric_table = metric_table
        # site_env
        self.site_env = site_env
        # view_id
        self.view_id = view_id
        # period_type
        self.period_type = period_type
        # extraDimNames
        self.extra_dim_names = extra_dim_names
        # metric_filter
        self.metric_filter = metric_filter
        # start
        self.start = start
        # end
        self.end = end
        # dim_conditions_list
        self.dim_conditions_list = dim_conditions_list
        # dim_expression
        self.dim_expression = dim_expression
        # dim_expression_list
        self.dim_expression_list = dim_expression_list

    def validate(self):
        if self.dim_conditions_list:
            for k in self.dim_conditions_list:
                if k:
                    k.validate()
        if self.dim_expression:
            self.dim_expression.validate()
        if self.dim_expression_list:
            for k in self.dim_expression_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.token is not None:
            result['token'] = self.token
        if self.metric_table is not None:
            result['metric_table'] = self.metric_table
        if self.site_env is not None:
            result['site_env'] = self.site_env
        if self.view_id is not None:
            result['view_id'] = self.view_id
        if self.period_type is not None:
            result['period_type'] = self.period_type
        if self.extra_dim_names is not None:
            result['extra_dim_names'] = self.extra_dim_names
        if self.metric_filter is not None:
            result['metric_filter'] = self.metric_filter
        if self.start is not None:
            result['start'] = self.start
        if self.end is not None:
            result['end'] = self.end
        result['dim_conditions_list'] = []
        if self.dim_conditions_list is not None:
            for k in self.dim_conditions_list:
                result['dim_conditions_list'].append(k.to_map() if k else None)
        if self.dim_expression is not None:
            result['dim_expression'] = self.dim_expression.to_map()
        result['dim_expression_list'] = []
        if self.dim_expression_list is not None:
            for k in self.dim_expression_list:
                result['dim_expression_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('metric_table') is not None:
            self.metric_table = m.get('metric_table')
        if m.get('site_env') is not None:
            self.site_env = m.get('site_env')
        if m.get('view_id') is not None:
            self.view_id = m.get('view_id')
        if m.get('period_type') is not None:
            self.period_type = m.get('period_type')
        if m.get('extra_dim_names') is not None:
            self.extra_dim_names = m.get('extra_dim_names')
        if m.get('metric_filter') is not None:
            self.metric_filter = m.get('metric_filter')
        if m.get('start') is not None:
            self.start = m.get('start')
        if m.get('end') is not None:
            self.end = m.get('end')
        self.dim_conditions_list = []
        if m.get('dim_conditions_list') is not None:
            for k in m.get('dim_conditions_list'):
                temp_model = KeySet()
                self.dim_conditions_list.append(temp_model.from_map(k))
        if m.get('dim_expression') is not None:
            temp_model = KeySet()
            self.dim_expression = temp_model.from_map(m['dim_expression'])
        self.dim_expression_list = []
        if m.get('dim_expression_list') is not None:
            for k in m.get('dim_expression_list'):
                temp_model = KeySet()
                self.dim_expression_list.append(temp_model.from_map(k))
        return self


class AlarmHistoryListKeySet(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: List[AlarmHistory] = None,
    ):
        # key
        self.key = key
        # AlarmHistoryListKeySet
        self.value = value

    def validate(self):
        if self.value:
            for k in self.value:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        result['value'] = []
        if self.value is not None:
            for k in self.value:
                result['value'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        self.value = []
        if m.get('value') is not None:
            for k in m.get('value'):
                temp_model = AlarmHistory()
                self.value.append(temp_model.from_map(k))
        return self


class OpsmetaSchema(TeaModel):
    def __init__(
        self,
        envs: List[str] = None,
        idc: OpsFilter = None,
        ldc: OpsFilter = None,
        server: OpsFilter = None,
    ):
        # envs
        self.envs = envs
        # idc
        self.idc = idc
        # ldc
        self.ldc = ldc
        # server
        self.server = server

    def validate(self):
        if self.idc:
            self.idc.validate()
        if self.ldc:
            self.ldc.validate()
        if self.server:
            self.server.validate()

    def to_map(self):
        result = dict()
        if self.envs is not None:
            result['envs'] = self.envs
        if self.idc is not None:
            result['idc'] = self.idc.to_map()
        if self.ldc is not None:
            result['ldc'] = self.ldc.to_map()
        if self.server is not None:
            result['server'] = self.server.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('envs') is not None:
            self.envs = m.get('envs')
        if m.get('idc') is not None:
            temp_model = OpsFilter()
            self.idc = temp_model.from_map(m['idc'])
        if m.get('ldc') is not None:
            temp_model = OpsFilter()
            self.ldc = temp_model.from_map(m['ldc'])
        if m.get('server') is not None:
            temp_model = OpsFilter()
            self.server = temp_model.from_map(m['server'])
        return self


class TimeSeriesMetricsPoint(TeaModel):
    def __init__(
        self,
        timestamp: int = None,
        value: List[TimeSeriesMetricsField] = None,
    ):
        # 时间戳 (毫秒)
        self.timestamp = timestamp
        # Metrics 某时间点的具体值
        self.value = value

    def validate(self):
        if self.value:
            for k in self.value:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        result['value'] = []
        if self.value is not None:
            for k in self.value:
                result['value'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        self.value = []
        if m.get('value') is not None:
            for k in m.get('value'):
                temp_model = TimeSeriesMetricsField()
                self.value.append(temp_model.from_map(k))
        return self


class AlarmTypeStatsVO(TeaModel):
    def __init__(
        self,
        custom_plugin: int = None,
        meta_group: int = None,
        stack_universal_table: int = None,
    ):
        # custom_plugin
        self.custom_plugin = custom_plugin
        # meta_group
        self.meta_group = meta_group
        # stack_universal_table
        self.stack_universal_table = stack_universal_table

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.custom_plugin is not None:
            result['custom_plugin'] = self.custom_plugin
        if self.meta_group is not None:
            result['meta_group'] = self.meta_group
        if self.stack_universal_table is not None:
            result['stack_universal_table'] = self.stack_universal_table
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('custom_plugin') is not None:
            self.custom_plugin = m.get('custom_plugin')
        if m.get('meta_group') is not None:
            self.meta_group = m.get('meta_group')
        if m.get('stack_universal_table') is not None:
            self.stack_universal_table = m.get('stack_universal_table')
        return self


class SaveSchema(TeaModel):
    def __init__(
        self,
        capacity: int = None,
        reserved: str = None,
        max_key_size: int = None,
    ):
        # capacity
        self.capacity = capacity
        # reserved
        self.reserved = reserved
        # max_key_size
        self.max_key_size = max_key_size

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.capacity is not None:
            result['capacity'] = self.capacity
        if self.reserved is not None:
            result['reserved'] = self.reserved
        if self.max_key_size is not None:
            result['max_key_size'] = self.max_key_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('capacity') is not None:
            self.capacity = m.get('capacity')
        if m.get('reserved') is not None:
            self.reserved = m.get('reserved')
        if m.get('max_key_size') is not None:
            self.max_key_size = m.get('max_key_size')
        return self


class AlarmNotifyStats(TeaModel):
    def __init__(
        self,
        alarm_time: int = None,
        count: int = None,
        notify_channel: str = None,
    ):
        # alarm_time
        self.alarm_time = alarm_time
        # count
        self.count = count
        # notify_channel
        self.notify_channel = notify_channel

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.alarm_time is not None:
            result['alarm_time'] = self.alarm_time
        if self.count is not None:
            result['count'] = self.count
        if self.notify_channel is not None:
            result['notify_channel'] = self.notify_channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alarm_time') is not None:
            self.alarm_time = m.get('alarm_time')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('notify_channel') is not None:
            self.notify_channel = m.get('notify_channel')
        return self


class KeyValuePair(TeaModel):
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


class AlarmLevelStatsVO(TeaModel):
    def __init__(
        self,
        l_0: int = None,
        l_1: int = None,
        l_2: int = None,
    ):
        # l0
        self.l_0 = l_0
        # l1
        self.l_1 = l_1
        # l2
        self.l_2 = l_2

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.l_0 is not None:
            result['l0'] = self.l_0
        if self.l_1 is not None:
            result['l1'] = self.l_1
        if self.l_2 is not None:
            result['l2'] = self.l_2
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('l0') is not None:
            self.l_0 = m.get('l0')
        if m.get('l1') is not None:
            self.l_1 = m.get('l1')
        if m.get('l2') is not None:
            self.l_2 = m.get('l2')
        return self


class PageQuery(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        page_index: int = None,
        cur_index: int = None,
    ):
        # page_size
        self.page_size = page_size
        # page_index
        self.page_index = page_index
        # cur_index
        self.cur_index = cur_index

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.cur_index is not None:
            result['cur_index'] = self.cur_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('cur_index') is not None:
            self.cur_index = m.get('cur_index')
        return self


class FolderPath(TeaModel):
    def __init__(
        self,
        id: int = None,
        name: str = None,
        type: str = None,
    ):
        # id
        self.id = id
        # name
        self.name = name
        # v
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class AlarmPkgDO(TeaModel):
    def __init__(
        self,
        biz_groupby_name: str = None,
        id: int = None,
        name: str = None,
        stack_metric_group_metric_table: str = None,
        tag_value: str = None,
        uuid: str = None,
        alarm: AlarmDO = None,
        top_alarm: TopAlarmDO = None,
    ):
        # biz_groupby_name
        self.biz_groupby_name = biz_groupby_name
        # id
        self.id = id
        # name
        self.name = name
        # stack_metric_group_metric_table
        self.stack_metric_group_metric_table = stack_metric_group_metric_table
        # tag_value
        self.tag_value = tag_value
        # uuid
        self.uuid = uuid
        # alarm
        self.alarm = alarm
        # top_alarm
        self.top_alarm = top_alarm

    def validate(self):
        if self.alarm:
            self.alarm.validate()
        if self.top_alarm:
            self.top_alarm.validate()

    def to_map(self):
        result = dict()
        if self.biz_groupby_name is not None:
            result['biz_groupby_name'] = self.biz_groupby_name
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.stack_metric_group_metric_table is not None:
            result['stack_metric_group_metric_table'] = self.stack_metric_group_metric_table
        if self.tag_value is not None:
            result['tag_value'] = self.tag_value
        if self.uuid is not None:
            result['uuid'] = self.uuid
        if self.alarm is not None:
            result['alarm'] = self.alarm.to_map()
        if self.top_alarm is not None:
            result['top_alarm'] = self.top_alarm.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_groupby_name') is not None:
            self.biz_groupby_name = m.get('biz_groupby_name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('stack_metric_group_metric_table') is not None:
            self.stack_metric_group_metric_table = m.get('stack_metric_group_metric_table')
        if m.get('tag_value') is not None:
            self.tag_value = m.get('tag_value')
        if m.get('uuid') is not None:
            self.uuid = m.get('uuid')
        if m.get('alarm') is not None:
            temp_model = AlarmDO()
            self.alarm = temp_model.from_map(m['alarm'])
        if m.get('top_alarm') is not None:
            temp_model = TopAlarmDO()
            self.top_alarm = temp_model.from_map(m['top_alarm'])
        return self


class StatusDO(TeaModel):
    def __init__(
        self,
        creater: str = None,
        create_time: int = None,
        operator: str = None,
        update_time: int = None,
        status_desc: str = None,
        compute_close: bool = None,
        degrade_reason: str = None,
        degrade_operator: str = None,
        degrade_time: str = None,
        degrade_time_v2: int = None,
    ):
        # creater
        self.creater = creater
        # create_time
        self.create_time = create_time
        # operator
        self.operator = operator
        # update_time
        self.update_time = update_time
        # status_desc
        self.status_desc = status_desc
        # compute_close
        self.compute_close = compute_close
        # degrade_reason
        self.degrade_reason = degrade_reason
        # degrade_operator
        self.degrade_operator = degrade_operator
        # degrade_time
        self.degrade_time = degrade_time
        # degrade_time_v2
        self.degrade_time_v2 = degrade_time_v2

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.creater is not None:
            result['creater'] = self.creater
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.operator is not None:
            result['operator'] = self.operator
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.status_desc is not None:
            result['status_desc'] = self.status_desc
        if self.compute_close is not None:
            result['compute_close'] = self.compute_close
        if self.degrade_reason is not None:
            result['degrade_reason'] = self.degrade_reason
        if self.degrade_operator is not None:
            result['degrade_operator'] = self.degrade_operator
        if self.degrade_time is not None:
            result['degrade_time'] = self.degrade_time
        if self.degrade_time_v2 is not None:
            result['degrade_time_v2'] = self.degrade_time_v2
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('creater') is not None:
            self.creater = m.get('creater')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('status_desc') is not None:
            self.status_desc = m.get('status_desc')
        if m.get('compute_close') is not None:
            self.compute_close = m.get('compute_close')
        if m.get('degrade_reason') is not None:
            self.degrade_reason = m.get('degrade_reason')
        if m.get('degrade_operator') is not None:
            self.degrade_operator = m.get('degrade_operator')
        if m.get('degrade_time') is not None:
            self.degrade_time = m.get('degrade_time')
        if m.get('degrade_time_v2') is not None:
            self.degrade_time_v2 = m.get('degrade_time_v2')
        return self


class Condition(TeaModel):
    def __init__(
        self,
        plugin: str = None,
        content_type: str = None,
        tag: str = None,
        ds_id: str = None,
        new_cp_id: str = None,
        start: int = None,
        end: int = None,
        tick_interval: int = None,
        use_new: bool = None,
        groupby: List[str] = None,
        values: List[KeySet] = None,
        tenant_id: int = None,
        workspace_id: int = None,
        am_old_data_struct: bool = None,
        am_is_spm: bool = None,
        old_ds_id: str = None,
    ):
        # plugin
        self.plugin = plugin
        # content_type
        self.content_type = content_type
        # tag
        self.tag = tag
        # ds_id
        self.ds_id = ds_id
        # new_cp_id
        self.new_cp_id = new_cp_id
        # start
        self.start = start
        # end
        self.end = end
        # tick_interval
        self.tick_interval = tick_interval
        # use_new
        self.use_new = use_new
        # groupby
        self.groupby = groupby
        # values
        self.values = values
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # am_old_data_struct
        self.am_old_data_struct = am_old_data_struct
        # am_is_spm
        self.am_is_spm = am_is_spm
        # old_ds_id
        self.old_ds_id = old_ds_id

    def validate(self):
        if self.values:
            for k in self.values:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.plugin is not None:
            result['plugin'] = self.plugin
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.tag is not None:
            result['tag'] = self.tag
        if self.ds_id is not None:
            result['ds_id'] = self.ds_id
        if self.new_cp_id is not None:
            result['new_cp_id'] = self.new_cp_id
        if self.start is not None:
            result['start'] = self.start
        if self.end is not None:
            result['end'] = self.end
        if self.tick_interval is not None:
            result['tick_interval'] = self.tick_interval
        if self.use_new is not None:
            result['use_new'] = self.use_new
        if self.groupby is not None:
            result['groupby'] = self.groupby
        result['values'] = []
        if self.values is not None:
            for k in self.values:
                result['values'].append(k.to_map() if k else None)
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.am_old_data_struct is not None:
            result['am_old_data_struct'] = self.am_old_data_struct
        if self.am_is_spm is not None:
            result['am_is_spm'] = self.am_is_spm
        if self.old_ds_id is not None:
            result['old_ds_id'] = self.old_ds_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('plugin') is not None:
            self.plugin = m.get('plugin')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        if m.get('ds_id') is not None:
            self.ds_id = m.get('ds_id')
        if m.get('new_cp_id') is not None:
            self.new_cp_id = m.get('new_cp_id')
        if m.get('start') is not None:
            self.start = m.get('start')
        if m.get('end') is not None:
            self.end = m.get('end')
        if m.get('tick_interval') is not None:
            self.tick_interval = m.get('tick_interval')
        if m.get('use_new') is not None:
            self.use_new = m.get('use_new')
        if m.get('groupby') is not None:
            self.groupby = m.get('groupby')
        self.values = []
        if m.get('values') is not None:
            for k in m.get('values'):
                temp_model = KeySet()
                self.values.append(temp_model.from_map(k))
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('am_old_data_struct') is not None:
            self.am_old_data_struct = m.get('am_old_data_struct')
        if m.get('am_is_spm') is not None:
            self.am_is_spm = m.get('am_is_spm')
        if m.get('old_ds_id') is not None:
            self.old_ds_id = m.get('old_ds_id')
        return self


class StackExpression(TeaModel):
    def __init__(
        self,
        states: List[StackState] = None,
        andor: bool = None,
    ):
        # states
        self.states = states
        # andor
        self.andor = andor

    def validate(self):
        if self.states:
            for k in self.states:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['states'] = []
        if self.states is not None:
            for k in self.states:
                result['states'].append(k.to_map() if k else None)
        if self.andor is not None:
            result['andor'] = self.andor
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.states = []
        if m.get('states') is not None:
            for k in m.get('states'):
                temp_model = StackState()
                self.states.append(temp_model.from_map(k))
        if m.get('andor') is not None:
            self.andor = m.get('andor')
        return self


class IpFileOs(TeaModel):
    def __init__(
        self,
        error_msg: str = None,
        ip: str = None,
        next_file_id: str = None,
        next_offset: int = None,
        uuid: str = None,
    ):
        # error_msg
        self.error_msg = error_msg
        # ip
        self.ip = ip
        # next_file_id
        self.next_file_id = next_file_id
        # next_offset
        self.next_offset = next_offset
        # uuid
        self.uuid = uuid

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.ip is not None:
            result['ip'] = self.ip
        if self.next_file_id is not None:
            result['next_file_id'] = self.next_file_id
        if self.next_offset is not None:
            result['next_offset'] = self.next_offset
        if self.uuid is not None:
            result['uuid'] = self.uuid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        if m.get('next_file_id') is not None:
            self.next_file_id = m.get('next_file_id')
        if m.get('next_offset') is not None:
            self.next_offset = m.get('next_offset')
        if m.get('uuid') is not None:
            self.uuid = m.get('uuid')
        return self


class AlarmHistoryListKeySetMap(TeaModel):
    def __init__(
        self,
        key: str = None,
        entity: List[AlarmHistoryListKeySet] = None,
    ):
        # key
        self.key = key
        # value
        self.entity = entity

    def validate(self):
        if self.entity:
            for k in self.entity:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        result['entity'] = []
        if self.entity is not None:
            for k in self.entity:
                result['entity'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        self.entity = []
        if m.get('entity') is not None:
            for k in m.get('entity'):
                temp_model = AlarmHistoryListKeySet()
                self.entity.append(temp_model.from_map(k))
        return self


class StringValue(TeaModel):
    def __init__(
        self,
        value: str = None,
    ):
        # value
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class AlarmTypeStatsVOKeySet(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: AlarmTypeStatsVO = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        if self.value:
            self.value.validate()

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            temp_model = AlarmTypeStatsVO()
            self.value = temp_model.from_map(m['value'])
        return self


class AlarmAppStats(TeaModel):
    def __init__(
        self,
        app: str = None,
        alarm_level: int = None,
        count: int = None,
        stack_universal_table_id: str = None,
    ):
        # app
        self.app = app
        # alarm_level
        self.alarm_level = alarm_level
        # count
        self.count = count
        # stack_universal_table_id
        self.stack_universal_table_id = stack_universal_table_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.app is not None:
            result['app'] = self.app
        if self.alarm_level is not None:
            result['alarm_level'] = self.alarm_level
        if self.count is not None:
            result['count'] = self.count
        if self.stack_universal_table_id is not None:
            result['stack_universal_table_id'] = self.stack_universal_table_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app') is not None:
            self.app = m.get('app')
        if m.get('alarm_level') is not None:
            self.alarm_level = m.get('alarm_level')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('stack_universal_table_id') is not None:
            self.stack_universal_table_id = m.get('stack_universal_table_id')
        return self


class FolderRequestCmd(TeaModel):
    def __init__(
        self,
        custom_plugin_id: int = None,
        folder_id: int = None,
        include_me: bool = None,
        include_plugin_name: bool = None,
    ):
        # custom_plugin_id
        self.custom_plugin_id = custom_plugin_id
        # folder_id
        self.folder_id = folder_id
        # include_me
        self.include_me = include_me
        # include_plugin_name
        self.include_plugin_name = include_plugin_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.custom_plugin_id is not None:
            result['custom_plugin_id'] = self.custom_plugin_id
        if self.folder_id is not None:
            result['folder_id'] = self.folder_id
        if self.include_me is not None:
            result['include_me'] = self.include_me
        if self.include_plugin_name is not None:
            result['include_plugin_name'] = self.include_plugin_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('custom_plugin_id') is not None:
            self.custom_plugin_id = m.get('custom_plugin_id')
        if m.get('folder_id') is not None:
            self.folder_id = m.get('folder_id')
        if m.get('include_me') is not None:
            self.include_me = m.get('include_me')
        if m.get('include_plugin_name') is not None:
            self.include_plugin_name = m.get('include_plugin_name')
        return self


class LongKeySet(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: int = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        pass

    def to_map(self):
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


class TraceTreeItem(TeaModel):
    def __init__(
        self,
        app: str = None,
        component: str = None,
        duration: int = None,
        idc: str = None,
        info: str = None,
        ip: str = None,
        kind: str = None,
        parent_id: str = None,
        request_size: int = None,
        response_size: int = None,
        span_id: str = None,
        start_time: int = None,
        status: str = None,
        tags: List[KeySet] = None,
        tree_id: int = None,
        tree_parent_id: int = None,
        unit: str = None,
    ):
        # 应用名
        self.app = app
        # 组件类型
        self.component = component
        # 耗时, 毫秒
        self.duration = duration
        # 机房信息
        self.idc = idc
        # 描述信息
        self.info = info
        # ip
        self.ip = ip
        # 对应的span的类型 枚举类型 CLIENT SERVER CONSUMER PRODUCER
        self.kind = kind
        # parent span id
        self.parent_id = parent_id
        # 请求体字节大小, 如果取不到就为-1
        self.request_size = request_size
        # 响应体大小, 如果取不到就为-1
        self.response_size = response_size
        # span id
        self.span_id = span_id
        # 开始时间, 毫秒时间戳
        self.start_time = start_time
        # 状态码
        self.status = status
        # 键值对
        self.tags = tags
        # 节点的id, 没有业务语义, 用于帮助前端还原树状结构
        self.tree_id = tree_id
        # 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
        self.tree_parent_id = tree_parent_id
        # 单元化信息
        self.unit = unit

    def validate(self):
        if self.tags:
            for k in self.tags:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.app is not None:
            result['app'] = self.app
        if self.component is not None:
            result['component'] = self.component
        if self.duration is not None:
            result['duration'] = self.duration
        if self.idc is not None:
            result['idc'] = self.idc
        if self.info is not None:
            result['info'] = self.info
        if self.ip is not None:
            result['ip'] = self.ip
        if self.kind is not None:
            result['kind'] = self.kind
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.request_size is not None:
            result['request_size'] = self.request_size
        if self.response_size is not None:
            result['response_size'] = self.response_size
        if self.span_id is not None:
            result['span_id'] = self.span_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.status is not None:
            result['status'] = self.status
        result['tags'] = []
        if self.tags is not None:
            for k in self.tags:
                result['tags'].append(k.to_map() if k else None)
        if self.tree_id is not None:
            result['tree_id'] = self.tree_id
        if self.tree_parent_id is not None:
            result['tree_parent_id'] = self.tree_parent_id
        if self.unit is not None:
            result['unit'] = self.unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app') is not None:
            self.app = m.get('app')
        if m.get('component') is not None:
            self.component = m.get('component')
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        if m.get('idc') is not None:
            self.idc = m.get('idc')
        if m.get('info') is not None:
            self.info = m.get('info')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        if m.get('kind') is not None:
            self.kind = m.get('kind')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('request_size') is not None:
            self.request_size = m.get('request_size')
        if m.get('response_size') is not None:
            self.response_size = m.get('response_size')
        if m.get('span_id') is not None:
            self.span_id = m.get('span_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.tags = []
        if m.get('tags') is not None:
            for k in m.get('tags'):
                temp_model = KeySet()
                self.tags.append(temp_model.from_map(k))
        if m.get('tree_id') is not None:
            self.tree_id = m.get('tree_id')
        if m.get('tree_parent_id') is not None:
            self.tree_parent_id = m.get('tree_parent_id')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        return self


class ErrorRealte(TeaModel):
    def __init__(
        self,
        ips: List[str] = None,
        log_paths: List[str] = None,
    ):
        # ips
        self.ips = ips
        # log_paths
        self.log_paths = log_paths

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.ips is not None:
            result['ips'] = self.ips
        if self.log_paths is not None:
            result['log_paths'] = self.log_paths
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ips') is not None:
            self.ips = m.get('ips')
        if m.get('log_paths') is not None:
            self.log_paths = m.get('log_paths')
        return self


class FolderPaths(TeaModel):
    def __init__(
        self,
        paths: List[FolderPath] = None,
    ):
        # paths
        self.paths = paths

    def validate(self):
        if self.paths:
            for k in self.paths:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['paths'] = []
        if self.paths is not None:
            for k in self.paths:
                result['paths'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.paths = []
        if m.get('paths') is not None:
            for k in m.get('paths'):
                temp_model = FolderPath()
                self.paths.append(temp_model.from_map(k))
        return self


class CallErrorMessage(TeaModel):
    def __init__(
        self,
        error_code: str = None,
        message: str = None,
        cause: str = None,
    ):
        # error_code
        self.error_code = error_code
        # message
        self.message = message
        # cause
        self.cause = cause

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.message is not None:
            result['message'] = self.message
        if self.cause is not None:
            result['cause'] = self.cause
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('cause') is not None:
            self.cause = m.get('cause')
        return self


class TimeSeriesMetrics(TeaModel):
    def __init__(
        self,
        start_time: int = None,
        end_time: int = None,
        tags: List[KeyValuePair] = None,
        type: str = None,
        values: List[TimeSeriesMetricsPoint] = None,
    ):
        # 开始时间, 毫秒时间戳
        self.start_time = start_time
        # 结束时间, 毫秒时间戳
        self.end_time = end_time
        # 标识 metrics，类似 sql 查询条件
        self.tags = tags
        # 指标的分类
        self.type = type
        # Metrics 多个 point 的集合
        self.values = values

    def validate(self):
        if self.tags:
            for k in self.tags:
                if k:
                    k.validate()
        if self.values:
            for k in self.values:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        result['tags'] = []
        if self.tags is not None:
            for k in self.tags:
                result['tags'].append(k.to_map() if k else None)
        if self.type is not None:
            result['type'] = self.type
        result['values'] = []
        if self.values is not None:
            for k in self.values:
                result['values'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        self.tags = []
        if m.get('tags') is not None:
            for k in m.get('tags'):
                temp_model = KeyValuePair()
                self.tags.append(temp_model.from_map(k))
        if m.get('type') is not None:
            self.type = m.get('type')
        self.values = []
        if m.get('values') is not None:
            for k in m.get('values'):
                temp_model = TimeSeriesMetricsPoint()
                self.values.append(temp_model.from_map(k))
        return self


class TraceSpanSearchTagConfig(TeaModel):
    def __init__(
        self,
        key: str = None,
        name: str = None,
        multiple: bool = None,
        values: List[str] = None,
    ):
        # 字段的key
        self.key = key
        # 中文标签
        self.name = name
        # 是否支持多选
        self.multiple = multiple
        # 如果该数组非空, 那么表明用户只能从数组给定的值中进行选择, 否则意味着用户可以随意填写.
        self.values = values

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.name is not None:
            result['name'] = self.name
        if self.multiple is not None:
            result['multiple'] = self.multiple
        if self.values is not None:
            result['values'] = self.values
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('multiple') is not None:
            self.multiple = m.get('multiple')
        if m.get('values') is not None:
            self.values = m.get('values')
        return self


class RequestParams(TeaModel):
    def __init__(
        self,
        req_type: str = None,
        condition: Condition = None,
        dim_condition: PontusTrendRequest = None,
        tenant: str = None,
        zones: str = None,
        from_front: bool = None,
        fuzzy: bool = None,
        valid_key_count: int = None,
        can_switch: bool = None,
    ):
        # req_type
        self.req_type = req_type
        # condition
        self.condition = condition
        # dimCondition
        self.dim_condition = dim_condition
        # tenant
        self.tenant = tenant
        # zones
        self.zones = zones
        # from_front
        self.from_front = from_front
        # fuzzy
        self.fuzzy = fuzzy
        # validKeyCount
        self.valid_key_count = valid_key_count
        # can_switch
        self.can_switch = can_switch

    def validate(self):
        if self.condition:
            self.condition.validate()
        if self.dim_condition:
            self.dim_condition.validate()

    def to_map(self):
        result = dict()
        if self.req_type is not None:
            result['req_type'] = self.req_type
        if self.condition is not None:
            result['condition'] = self.condition.to_map()
        if self.dim_condition is not None:
            result['dim_condition'] = self.dim_condition.to_map()
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.zones is not None:
            result['zones'] = self.zones
        if self.from_front is not None:
            result['from_front'] = self.from_front
        if self.fuzzy is not None:
            result['fuzzy'] = self.fuzzy
        if self.valid_key_count is not None:
            result['valid_key_count'] = self.valid_key_count
        if self.can_switch is not None:
            result['can_switch'] = self.can_switch
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_type') is not None:
            self.req_type = m.get('req_type')
        if m.get('condition') is not None:
            temp_model = Condition()
            self.condition = temp_model.from_map(m['condition'])
        if m.get('dim_condition') is not None:
            temp_model = PontusTrendRequest()
            self.dim_condition = temp_model.from_map(m['dim_condition'])
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('zones') is not None:
            self.zones = m.get('zones')
        if m.get('from_front') is not None:
            self.from_front = m.get('from_front')
        if m.get('fuzzy') is not None:
            self.fuzzy = m.get('fuzzy')
        if m.get('valid_key_count') is not None:
            self.valid_key_count = m.get('valid_key_count')
        if m.get('can_switch') is not None:
            self.can_switch = m.get('can_switch')
        return self


class TopologyNode(TeaModel):
    def __init__(
        self,
        app: str = None,
        type: str = None,
        id: str = None,
    ):
        # 应用名
        self.app = app
        # 节点类型: APP DB MQ CACHE
        self.type = type
        # 节点id
        self.id = id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.app is not None:
            result['app'] = self.app
        if self.type is not None:
            result['type'] = self.type
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app') is not None:
            self.app = m.get('app')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class AppDO(TeaModel):
    def __init__(
        self,
        name: str = None,
    ):
        # 应用名称
        self.name = name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class TopologyEdge(TeaModel):
    def __init__(
        self,
        id: str = None,
        source: str = None,
        target: str = None,
    ):
        # id
        self.id = id
        # source节点的id
        self.source = source
        # target节点的id
        self.target = target

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.source is not None:
            result['source'] = self.source
        if self.target is not None:
            result['target'] = self.target
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('target') is not None:
            self.target = m.get('target')
        return self


class AppStats(TeaModel):
    def __init__(
        self,
        app_list: List[str] = None,
        page_query: PageQuery = None,
    ):
        # app_list
        self.app_list = app_list
        # page_query
        self.page_query = page_query

    def validate(self):
        if self.page_query:
            self.page_query.validate()

    def to_map(self):
        result = dict()
        if self.app_list is not None:
            result['app_list'] = self.app_list
        if self.page_query is not None:
            result['page_query'] = self.page_query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('app_list') is not None:
            self.app_list = m.get('app_list')
        if m.get('page_query') is not None:
            temp_model = PageQuery()
            self.page_query = temp_model.from_map(m['page_query'])
        return self


class UniversalBodyCmd(TeaModel):
    def __init__(
        self,
        body: str = None,
        id: int = None,
        model_name: str = None,
        op: str = None,
        parse_long_text: bool = None,
        page_size: int = None,
        page_index: int = None,
        cur_index: int = None,
    ):
        # body
        self.body = body
        # id
        self.id = id
        # model_name
        self.model_name = model_name
        # op
        self.op = op
        # parse_long_text
        self.parse_long_text = parse_long_text
        # page_size
        self.page_size = page_size
        # page_index
        self.page_index = page_index
        # cur_index
        self.cur_index = cur_index

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.body is not None:
            result['body'] = self.body
        if self.id is not None:
            result['id'] = self.id
        if self.model_name is not None:
            result['model_name'] = self.model_name
        if self.op is not None:
            result['op'] = self.op
        if self.parse_long_text is not None:
            result['parse_long_text'] = self.parse_long_text
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.cur_index is not None:
            result['cur_index'] = self.cur_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('body') is not None:
            self.body = m.get('body')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('model_name') is not None:
            self.model_name = m.get('model_name')
        if m.get('op') is not None:
            self.op = m.get('op')
        if m.get('parse_long_text') is not None:
            self.parse_long_text = m.get('parse_long_text')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('cur_index') is not None:
            self.cur_index = m.get('cur_index')
        return self


class AlarmLevelStatsVOKeySet(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: AlarmLevelStatsVO = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        if self.value:
            self.value.validate()

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            temp_model = AlarmLevelStatsVO()
            self.value = temp_model.from_map(m['value'])
        return self


class PluginModelDO(TeaModel):
    def __init__(
        self,
        id: int = None,
        parent_folder_id: int = None,
        plugin_id: int = None,
        plugin_type: str = None,
        name: str = None,
        xflush_apps: str = None,
        stack_expression: StackExpression = None,
        cal_conf: str = None,
        opsmeta_schema: OpsmetaSchema = None,
        save_schema: SaveSchema = None,
        status: StatusDO = None,
        outside_domain_id: int = None,
        old_folder_id: int = None,
        tenant_id: int = None,
        workspace_id: int = None,
        biz_domain_id: int = None,
        creater: str = None,
        gmt_create: int = None,
        modifier: str = None,
        gmt_modified: int = None,
        alarm_pkgs: List[AlarmPkgDO] = None,
        noc: str = None,
        position: str = None,
        alarmed: bool = None,
        recent_alarm_history_id: str = None,
        recent_alarm: int = None,
        key_cms: bool = None,
        key_cms_sort: int = None,
        status_desc: str = None,
        data_from: int = None,
        data_to: int = None,
        from_source: str = None,
    ):
        # id
        self.id = id
        # parent_folder_id
        self.parent_folder_id = parent_folder_id
        # plugin_id
        self.plugin_id = plugin_id
        # plugin_type
        self.plugin_type = plugin_type
        # name
        self.name = name
        # xflush_apps
        self.xflush_apps = xflush_apps
        # stack_expression
        self.stack_expression = stack_expression
        # cal_conf
        self.cal_conf = cal_conf
        # opsmeta_schema
        self.opsmeta_schema = opsmeta_schema
        # save_schema
        self.save_schema = save_schema
        # status
        self.status = status
        # outside_domain_id
        self.outside_domain_id = outside_domain_id
        # old_folder_id
        self.old_folder_id = old_folder_id
        # tenant_id
        self.tenant_id = tenant_id
        # workspace_id
        self.workspace_id = workspace_id
        # biz_domain_id
        self.biz_domain_id = biz_domain_id
        # creater
        self.creater = creater
        # gmt_create
        self.gmt_create = gmt_create
        # modifier
        self.modifier = modifier
        # gmt_modified
        self.gmt_modified = gmt_modified
        # alarm_pkgs
        self.alarm_pkgs = alarm_pkgs
        # noc
        self.noc = noc
        # position
        self.position = position
        # alarmed
        self.alarmed = alarmed
        # recent_alarm_history_id
        self.recent_alarm_history_id = recent_alarm_history_id
        # recent_alarm
        self.recent_alarm = recent_alarm
        # key_cms
        self.key_cms = key_cms
        # key_cms_sort
        self.key_cms_sort = key_cms_sort
        # status_desc
        self.status_desc = status_desc
        # data_from
        self.data_from = data_from
        # data_to
        self.data_to = data_to
        # from_source
        self.from_source = from_source

    def validate(self):
        if self.stack_expression:
            self.stack_expression.validate()
        if self.opsmeta_schema:
            self.opsmeta_schema.validate()
        if self.save_schema:
            self.save_schema.validate()
        if self.status:
            self.status.validate()
        if self.alarm_pkgs:
            for k in self.alarm_pkgs:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.parent_folder_id is not None:
            result['parent_folder_id'] = self.parent_folder_id
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.plugin_type is not None:
            result['plugin_type'] = self.plugin_type
        if self.name is not None:
            result['name'] = self.name
        if self.xflush_apps is not None:
            result['xflush_apps'] = self.xflush_apps
        if self.stack_expression is not None:
            result['stack_expression'] = self.stack_expression.to_map()
        if self.cal_conf is not None:
            result['cal_conf'] = self.cal_conf
        if self.opsmeta_schema is not None:
            result['opsmeta_schema'] = self.opsmeta_schema.to_map()
        if self.save_schema is not None:
            result['save_schema'] = self.save_schema.to_map()
        if self.status is not None:
            result['status'] = self.status.to_map()
        if self.outside_domain_id is not None:
            result['outside_domain_id'] = self.outside_domain_id
        if self.old_folder_id is not None:
            result['old_folder_id'] = self.old_folder_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.biz_domain_id is not None:
            result['biz_domain_id'] = self.biz_domain_id
        if self.creater is not None:
            result['creater'] = self.creater
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.modifier is not None:
            result['modifier'] = self.modifier
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        result['alarm_pkgs'] = []
        if self.alarm_pkgs is not None:
            for k in self.alarm_pkgs:
                result['alarm_pkgs'].append(k.to_map() if k else None)
        if self.noc is not None:
            result['noc'] = self.noc
        if self.position is not None:
            result['position'] = self.position
        if self.alarmed is not None:
            result['alarmed'] = self.alarmed
        if self.recent_alarm_history_id is not None:
            result['recent_alarm_history_id'] = self.recent_alarm_history_id
        if self.recent_alarm is not None:
            result['recent_alarm'] = self.recent_alarm
        if self.key_cms is not None:
            result['key_cms'] = self.key_cms
        if self.key_cms_sort is not None:
            result['key_cms_sort'] = self.key_cms_sort
        if self.status_desc is not None:
            result['status_desc'] = self.status_desc
        if self.data_from is not None:
            result['data_from'] = self.data_from
        if self.data_to is not None:
            result['data_to'] = self.data_to
        if self.from_source is not None:
            result['from_source'] = self.from_source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('parent_folder_id') is not None:
            self.parent_folder_id = m.get('parent_folder_id')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('plugin_type') is not None:
            self.plugin_type = m.get('plugin_type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('xflush_apps') is not None:
            self.xflush_apps = m.get('xflush_apps')
        if m.get('stack_expression') is not None:
            temp_model = StackExpression()
            self.stack_expression = temp_model.from_map(m['stack_expression'])
        if m.get('cal_conf') is not None:
            self.cal_conf = m.get('cal_conf')
        if m.get('opsmeta_schema') is not None:
            temp_model = OpsmetaSchema()
            self.opsmeta_schema = temp_model.from_map(m['opsmeta_schema'])
        if m.get('save_schema') is not None:
            temp_model = SaveSchema()
            self.save_schema = temp_model.from_map(m['save_schema'])
        if m.get('status') is not None:
            temp_model = StatusDO()
            self.status = temp_model.from_map(m['status'])
        if m.get('outside_domain_id') is not None:
            self.outside_domain_id = m.get('outside_domain_id')
        if m.get('old_folder_id') is not None:
            self.old_folder_id = m.get('old_folder_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('biz_domain_id') is not None:
            self.biz_domain_id = m.get('biz_domain_id')
        if m.get('creater') is not None:
            self.creater = m.get('creater')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('modifier') is not None:
            self.modifier = m.get('modifier')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        self.alarm_pkgs = []
        if m.get('alarm_pkgs') is not None:
            for k in m.get('alarm_pkgs'):
                temp_model = AlarmPkgDO()
                self.alarm_pkgs.append(temp_model.from_map(k))
        if m.get('noc') is not None:
            self.noc = m.get('noc')
        if m.get('position') is not None:
            self.position = m.get('position')
        if m.get('alarmed') is not None:
            self.alarmed = m.get('alarmed')
        if m.get('recent_alarm_history_id') is not None:
            self.recent_alarm_history_id = m.get('recent_alarm_history_id')
        if m.get('recent_alarm') is not None:
            self.recent_alarm = m.get('recent_alarm')
        if m.get('key_cms') is not None:
            self.key_cms = m.get('key_cms')
        if m.get('key_cms_sort') is not None:
            self.key_cms_sort = m.get('key_cms_sort')
        if m.get('status_desc') is not None:
            self.status_desc = m.get('status_desc')
        if m.get('data_from') is not None:
            self.data_from = m.get('data_from')
        if m.get('data_to') is not None:
            self.data_to = m.get('data_to')
        if m.get('from_source') is not None:
            self.from_source = m.get('from_source')
        return self


class TraceSpan(TeaModel):
    def __init__(
        self,
        component: str = None,
        duration: int = None,
        info: str = None,
        kind: str = None,
        local_ip: str = None,
        local_service_name: str = None,
        local_idc_name: str = None,
        local_cell_name: str = None,
        name: str = None,
        parent_id: str = None,
        remote_ip: str = None,
        remote_service_name: str = None,
        remote_idc_name: str = None,
        remote_cell_name: str = None,
        span_id: str = None,
        start_time: int = None,
        status: str = None,
        tags: List[KeySet] = None,
        trace_id: str = None,
    ):
        # 组件类型
        self.component = component
        # 毫秒耗时
        self.duration = duration
        # 服务描述信息
        self.info = info
        # span kind, CLIENT SERVER PRODUCER CONSUMER
        self.kind = kind
        # local endpoint ip
        self.local_ip = local_ip
        # local endpoint service name
        self.local_service_name = local_service_name
        # local idc name
        self.local_idc_name = local_idc_name
        # local cell name
        self.local_cell_name = local_cell_name
        # name
        self.name = name
        # parent_id
        self.parent_id = parent_id
        # remote endpoint ip
        self.remote_ip = remote_ip
        # remote endpoint service name
        self.remote_service_name = remote_service_name
        # remote idc name
        self.remote_idc_name = remote_idc_name
        # remote cell name
        self.remote_cell_name = remote_cell_name
        # span_id
        self.span_id = span_id
        # 开始时间, 毫秒时间戳
        self.start_time = start_time
        # 状态码
        self.status = status
        # span tags, 是关于span的键值对
        self.tags = tags
        # trace id
        self.trace_id = trace_id

    def validate(self):
        if self.tags:
            for k in self.tags:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.component is not None:
            result['component'] = self.component
        if self.duration is not None:
            result['duration'] = self.duration
        if self.info is not None:
            result['info'] = self.info
        if self.kind is not None:
            result['kind'] = self.kind
        if self.local_ip is not None:
            result['local_ip'] = self.local_ip
        if self.local_service_name is not None:
            result['local_service_name'] = self.local_service_name
        if self.local_idc_name is not None:
            result['local_idc_name'] = self.local_idc_name
        if self.local_cell_name is not None:
            result['local_cell_name'] = self.local_cell_name
        if self.name is not None:
            result['name'] = self.name
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.remote_ip is not None:
            result['remote_ip'] = self.remote_ip
        if self.remote_service_name is not None:
            result['remote_service_name'] = self.remote_service_name
        if self.remote_idc_name is not None:
            result['remote_idc_name'] = self.remote_idc_name
        if self.remote_cell_name is not None:
            result['remote_cell_name'] = self.remote_cell_name
        if self.span_id is not None:
            result['span_id'] = self.span_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.status is not None:
            result['status'] = self.status
        result['tags'] = []
        if self.tags is not None:
            for k in self.tags:
                result['tags'].append(k.to_map() if k else None)
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('component') is not None:
            self.component = m.get('component')
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        if m.get('info') is not None:
            self.info = m.get('info')
        if m.get('kind') is not None:
            self.kind = m.get('kind')
        if m.get('local_ip') is not None:
            self.local_ip = m.get('local_ip')
        if m.get('local_service_name') is not None:
            self.local_service_name = m.get('local_service_name')
        if m.get('local_idc_name') is not None:
            self.local_idc_name = m.get('local_idc_name')
        if m.get('local_cell_name') is not None:
            self.local_cell_name = m.get('local_cell_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('remote_ip') is not None:
            self.remote_ip = m.get('remote_ip')
        if m.get('remote_service_name') is not None:
            self.remote_service_name = m.get('remote_service_name')
        if m.get('remote_idc_name') is not None:
            self.remote_idc_name = m.get('remote_idc_name')
        if m.get('remote_cell_name') is not None:
            self.remote_cell_name = m.get('remote_cell_name')
        if m.get('span_id') is not None:
            self.span_id = m.get('span_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.tags = []
        if m.get('tags') is not None:
            for k in m.get('tags'):
                temp_model = KeySet()
                self.tags.append(temp_model.from_map(k))
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        return self


class ModelTreeNode(TeaModel):
    def __init__(
        self,
        name: str = None,
        id: int = None,
        plugin_name: str = None,
        type: str = None,
    ):
        # name
        self.name = name
        # id
        self.id = id
        # plugin_name
        self.plugin_name = plugin_name
        # type
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.id is not None:
            result['id'] = self.id
        if self.plugin_name is not None:
            result['plugin_name'] = self.plugin_name
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('plugin_name') is not None:
            self.plugin_name = m.get('plugin_name')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class AlarmNotifyStatsKeySet(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: AlarmNotifyStats = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        if self.value:
            self.value.validate()

    def to_map(self):
        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            temp_model = AlarmNotifyStats()
            self.value = temp_model.from_map(m['value'])
        return self


class QueryRmsAgentloglocateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        app_id: str = None,
        batch_ip_files: List[IpFileOs] = None,
        charset_str: str = None,
        error_msg: str = None,
        ips: List[str] = None,
        ip_file: IpFileOs = None,
        is_batch: bool = None,
        log_path: str = None,
        log_paths: List[str] = None,
        time: int = None,
    ):
        self.auth_token = auth_token
        # app_id
        self.app_id = app_id
        # batch_ip_files
        self.batch_ip_files = batch_ip_files
        # charset_str
        self.charset_str = charset_str
        # error_msg
        self.error_msg = error_msg
        # ips
        self.ips = ips
        # ip_file
        self.ip_file = ip_file
        # is_batch
        self.is_batch = is_batch
        # log_path
        self.log_path = log_path
        # log_paths
        self.log_paths = log_paths
        # time
        self.time = time

    def validate(self):
        if self.batch_ip_files:
            for k in self.batch_ip_files:
                if k:
                    k.validate()
        if self.ip_file:
            self.ip_file.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.app_id is not None:
            result['app_id'] = self.app_id
        result['batch_ip_files'] = []
        if self.batch_ip_files is not None:
            for k in self.batch_ip_files:
                result['batch_ip_files'].append(k.to_map() if k else None)
        if self.charset_str is not None:
            result['charset_str'] = self.charset_str
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.ips is not None:
            result['ips'] = self.ips
        if self.ip_file is not None:
            result['ip_file'] = self.ip_file.to_map()
        if self.is_batch is not None:
            result['is_batch'] = self.is_batch
        if self.log_path is not None:
            result['log_path'] = self.log_path
        if self.log_paths is not None:
            result['log_paths'] = self.log_paths
        if self.time is not None:
            result['time'] = self.time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        self.batch_ip_files = []
        if m.get('batch_ip_files') is not None:
            for k in m.get('batch_ip_files'):
                temp_model = IpFileOs()
                self.batch_ip_files.append(temp_model.from_map(k))
        if m.get('charset_str') is not None:
            self.charset_str = m.get('charset_str')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('ips') is not None:
            self.ips = m.get('ips')
        if m.get('ip_file') is not None:
            temp_model = IpFileOs()
            self.ip_file = temp_model.from_map(m['ip_file'])
        if m.get('is_batch') is not None:
            self.is_batch = m.get('is_batch')
        if m.get('log_path') is not None:
            self.log_path = m.get('log_path')
        if m.get('log_paths') is not None:
            self.log_paths = m.get('log_paths')
        if m.get('time') is not None:
            self.time = m.get('time')
        return self


class QueryRmsAgentloglocateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        error_message: CallErrorMessage = None,
        result: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # success
        self.success = success
        # error_message
        self.error_message = error_message
        # result
        self.result = result

    def validate(self):
        if self.error_message:
            self.error_message.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        if self.error_message is not None:
            result['error_message'] = self.error_message.to_map()
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_message') is not None:
            temp_model = CallErrorMessage()
            self.error_message = temp_model.from_map(m['error_message'])
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryRmsAgenttailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        app_name: str = None,
        prefer_host: str = None,
        full_path: str = None,
        scan_dirs: List[str] = None,
        need_bytes: int = None,
        line_break_str: str = None,
        extra_suffixs: List[str] = None,
        charset_str: str = None,
    ):
        self.auth_token = auth_token
        # tenant_id
        self.tenant_id = tenant_id
        # app_name
        self.app_name = app_name
        # prefer_host
        self.prefer_host = prefer_host
        # full_path
        self.full_path = full_path
        # scan_dirs
        self.scan_dirs = scan_dirs
        # need_bytes
        self.need_bytes = need_bytes
        # line_break_str
        self.line_break_str = line_break_str
        # extra_suffixs
        self.extra_suffixs = extra_suffixs
        # charset_str
        self.charset_str = charset_str

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.prefer_host is not None:
            result['prefer_host'] = self.prefer_host
        if self.full_path is not None:
            result['full_path'] = self.full_path
        if self.scan_dirs is not None:
            result['scan_dirs'] = self.scan_dirs
        if self.need_bytes is not None:
            result['need_bytes'] = self.need_bytes
        if self.line_break_str is not None:
            result['line_break_str'] = self.line_break_str
        if self.extra_suffixs is not None:
            result['extra_suffixs'] = self.extra_suffixs
        if self.charset_str is not None:
            result['charset_str'] = self.charset_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('prefer_host') is not None:
            self.prefer_host = m.get('prefer_host')
        if m.get('full_path') is not None:
            self.full_path = m.get('full_path')
        if m.get('scan_dirs') is not None:
            self.scan_dirs = m.get('scan_dirs')
        if m.get('need_bytes') is not None:
            self.need_bytes = m.get('need_bytes')
        if m.get('line_break_str') is not None:
            self.line_break_str = m.get('line_break_str')
        if m.get('extra_suffixs') is not None:
            self.extra_suffixs = m.get('extra_suffixs')
        if m.get('charset_str') is not None:
            self.charset_str = m.get('charset_str')
        return self


class QueryRmsAgenttailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        error_message: CallErrorMessage = None,
        result: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # success
        self.success = success
        # error_message
        self.error_message = error_message
        # result
        self.result = result

    def validate(self):
        if self.error_message:
            self.error_message.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        if self.error_message is not None:
            result['error_message'] = self.error_message.to_map()
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_message') is not None:
            temp_model = CallErrorMessage()
            self.error_message = temp_model.from_map(m['error_message'])
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryRmsAgentbrowserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        app_name: str = None,
        extra_suffixs: List[str] = None,
        scan_dirs: List[str] = None,
        prefer_host: str = None,
        tenant_id: str = None,
    ):
        self.auth_token = auth_token
        # app_name
        self.app_name = app_name
        # extra_suffixs
        self.extra_suffixs = extra_suffixs
        # scan_dirs
        self.scan_dirs = scan_dirs
        # prefer_host
        self.prefer_host = prefer_host
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.app_name is not None:
            result['app_name'] = self.app_name
        if self.extra_suffixs is not None:
            result['extra_suffixs'] = self.extra_suffixs
        if self.scan_dirs is not None:
            result['scan_dirs'] = self.scan_dirs
        if self.prefer_host is not None:
            result['prefer_host'] = self.prefer_host
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        if m.get('extra_suffixs') is not None:
            self.extra_suffixs = m.get('extra_suffixs')
        if m.get('scan_dirs') is not None:
            self.scan_dirs = m.get('scan_dirs')
        if m.get('prefer_host') is not None:
            self.prefer_host = m.get('prefer_host')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryRmsAgentbrowserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        error_message: CallErrorMessage = None,
        result: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # success
        self.success = success
        # error_message
        self.error_message = error_message
        # result
        self.result = result

    def validate(self):
        if self.error_message:
            self.error_message.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        if self.error_message is not None:
            result['error_message'] = self.error_message.to_map()
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_message') is not None:
            temp_model = CallErrorMessage()
            self.error_message = temp_model.from_map(m['error_message'])
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryRmsAlarmhistorytypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        from_: int = None,
        to: int = None,
    ):
        self.auth_token = auth_token
        # from
        self.from_ = from_
        # to
        self.to = to

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        return self


class QueryRmsAlarmhistorytypeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AlarmTypeStatsVOKeySet] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AlarmTypeStatsVOKeySet()
                self.data.append(temp_model.from_map(k))
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsAlarmhistorylevelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        from_: int = None,
        to: int = None,
    ):
        self.auth_token = auth_token
        # from
        self.from_ = from_
        # to
        self.to = to

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        return self


class QueryRmsAlarmhistorylevelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AlarmLevelStatsVOKeySet] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AlarmLevelStatsVOKeySet()
                self.data.append(temp_model.from_map(k))
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsNotifyhistoryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        from_: int = None,
        login_name: str = None,
        to: int = None,
    ):
        self.auth_token = auth_token
        # from
        self.from_ = from_
        # login_name
        self.login_name = login_name
        # to
        self.to = to

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.from_ is not None:
            result['from'] = self.from_
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.to is not None:
            result['to'] = self.to
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('to') is not None:
            self.to = m.get('to')
        return self


class QueryRmsNotifyhistoryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AlarmNotifyStats] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AlarmNotifyStats()
                self.data.append(temp_model.from_map(k))
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsStackentityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class QueryRmsStackentityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[LongKeySet] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = LongKeySet()
                self.data.append(temp_model.from_map(k))
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsAlarmhistoryappcountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        app_list: AppStats = None,
        from_: int = None,
        to: int = None,
    ):
        self.auth_token = auth_token
        # app_list
        self.app_list = app_list
        # from
        self.from_ = from_
        # to
        self.to = to

    def validate(self):
        if self.app_list:
            self.app_list.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.app_list is not None:
            result['app_list'] = self.app_list.to_map()
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('app_list') is not None:
            temp_model = AppStats()
            self.app_list = temp_model.from_map(m['app_list'])
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        return self


class QueryRmsAlarmhistoryappcountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AlarmAppStats] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AlarmAppStats()
                self.data.append(temp_model.from_map(k))
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsAlarmhistoryappstatsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        app_list: AppStats = None,
        from_: int = None,
        to: int = None,
    ):
        self.auth_token = auth_token
        # app_list
        self.app_list = app_list
        # from
        self.from_ = from_
        # to
        self.to = to

    def validate(self):
        if self.app_list:
            self.app_list.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.app_list is not None:
            result['app_list'] = self.app_list.to_map()
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('app_list') is not None:
            temp_model = AppStats()
            self.app_list = temp_model.from_map(m['app_list'])
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        return self


class QueryRmsAlarmhistoryappstatsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AlarmHistoryListKeySetMap] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AlarmHistoryListKeySetMap()
                self.data.append(temp_model.from_map(k))
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsAppstatspageableRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        app_list: AppStats = None,
        from_: int = None,
        to: int = None,
    ):
        self.auth_token = auth_token
        # app_list
        self.app_list = app_list
        # from
        self.from_ = from_
        # to
        self.to = to

    def validate(self):
        if self.app_list:
            self.app_list.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.app_list is not None:
            result['app_list'] = self.app_list.to_map()
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('app_list') is not None:
            temp_model = AppStats()
            self.app_list = temp_model.from_map(m['app_list'])
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        return self


class QueryRmsAppstatspageableResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[AlarmHistoryListKeySetMap] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = AlarmHistoryListKeySetMap()
                self.data.append(temp_model.from_map(k))
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsLogreaderrorRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        app: str = None,
        time: int = None,
    ):
        self.auth_token = auth_token
        # app
        self.app = app
        # time
        self.time = time

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.app is not None:
            result['app'] = self.app
        if self.time is not None:
            result['time'] = self.time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('app') is not None:
            self.app = m.get('app')
        if m.get('time') is not None:
            self.time = m.get('time')
        return self


class QueryRmsLogreaderrorResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: ErrorRealte = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data.to_map()
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
            temp_model = ErrorRealte()
            self.data = temp_model.from_map(m['data'])
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsUniversalreadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cmds: List[UniversalBodyCmd] = None,
        rid: str = None,
    ):
        self.auth_token = auth_token
        # cmds
        self.cmds = cmds
        # rid
        self.rid = rid

    def validate(self):
        if self.cmds:
            for k in self.cmds:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        result['cmds'] = []
        if self.cmds is not None:
            for k in self.cmds:
                result['cmds'].append(k.to_map() if k else None)
        if self.rid is not None:
            result['rid'] = self.rid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        self.cmds = []
        if m.get('cmds') is not None:
            for k in m.get('cmds'):
                temp_model = UniversalBodyCmd()
                self.cmds.append(temp_model.from_map(k))
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        return self


class QueryRmsUniversalreadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsUniversalwriteRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        cmds: List[UniversalBodyCmd] = None,
        rid: str = None,
    ):
        self.auth_token = auth_token
        # cmds
        self.cmds = cmds
        # rid
        self.rid = rid

    def validate(self):
        if self.cmds:
            for k in self.cmds:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        result['cmds'] = []
        if self.cmds is not None:
            for k in self.cmds:
                result['cmds'].append(k.to_map() if k else None)
        if self.rid is not None:
            result['rid'] = self.rid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        self.cmds = []
        if m.get('cmds') is not None:
            for k in m.get('cmds'):
                temp_model = UniversalBodyCmd()
                self.cmds.append(temp_model.from_map(k))
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        return self


class QueryRmsUniversalwriteResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CreateRmsPluginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
        file_id: int = None,
        id: int = None,
        outside_bizdomain: str = None,
        plugin_id: int = None,
        table: str = None,
    ):
        self.auth_token = auth_token
        # body
        self.body = body
        # file_id
        self.file_id = file_id
        # id
        self.id = id
        # outside_bizdomain
        self.outside_bizdomain = outside_bizdomain
        # plugin_id
        self.plugin_id = plugin_id
        # table
        self.table = table

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.id is not None:
            result['id'] = self.id
        if self.outside_bizdomain is not None:
            result['outside_bizdomain'] = self.outside_bizdomain
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.table is not None:
            result['table'] = self.table
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('outside_bizdomain') is not None:
            self.outside_bizdomain = m.get('outside_bizdomain')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('table') is not None:
            self.table = m.get('table')
        return self


class CreateRmsPluginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: bool = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class DeleteRmsPluginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
        file_id: int = None,
        id: int = None,
        outside_bizdomain: str = None,
        plugin_id: int = None,
        table: str = None,
    ):
        self.auth_token = auth_token
        # body
        self.body = body
        # file_id
        self.file_id = file_id
        # id
        self.id = id
        # outside_bizdomain
        self.outside_bizdomain = outside_bizdomain
        # plugin_id
        self.plugin_id = plugin_id
        # table
        self.table = table

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.id is not None:
            result['id'] = self.id
        if self.outside_bizdomain is not None:
            result['outside_bizdomain'] = self.outside_bizdomain
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.table is not None:
            result['table'] = self.table
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('outside_bizdomain') is not None:
            self.outside_bizdomain = m.get('outside_bizdomain')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('table') is not None:
            self.table = m.get('table')
        return self


class DeleteRmsPluginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: bool = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CloseRmsPluginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
        file_id: int = None,
        id: int = None,
        outside_bizdomain: str = None,
        plugin_id: int = None,
        table: str = None,
    ):
        self.auth_token = auth_token
        # body
        self.body = body
        # file_id
        self.file_id = file_id
        # id
        self.id = id
        # outside_bizdomain
        self.outside_bizdomain = outside_bizdomain
        # plugin_id
        self.plugin_id = plugin_id
        # table
        self.table = table

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.id is not None:
            result['id'] = self.id
        if self.outside_bizdomain is not None:
            result['outside_bizdomain'] = self.outside_bizdomain
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.table is not None:
            result['table'] = self.table
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('outside_bizdomain') is not None:
            self.outside_bizdomain = m.get('outside_bizdomain')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('table') is not None:
            self.table = m.get('table')
        return self


class CloseRmsPluginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: bool = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class OpenRmsPluginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
        file_id: int = None,
        id: int = None,
        outside_bizdomain: str = None,
        plugin_id: int = None,
        table: str = None,
    ):
        self.auth_token = auth_token
        # body
        self.body = body
        # file_id
        self.file_id = file_id
        # id
        self.id = id
        # outside_bizdomain
        self.outside_bizdomain = outside_bizdomain
        # plugin_id
        self.plugin_id = plugin_id
        # table
        self.table = table

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.id is not None:
            result['id'] = self.id
        if self.outside_bizdomain is not None:
            result['outside_bizdomain'] = self.outside_bizdomain
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.table is not None:
            result['table'] = self.table
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('outside_bizdomain') is not None:
            self.outside_bizdomain = m.get('outside_bizdomain')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('table') is not None:
            self.table = m.get('table')
        return self


class OpenRmsPluginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: bool = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class UpdateRmsPluginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
        file_id: int = None,
        id: int = None,
        outside_bizdomain: str = None,
        plugin_id: int = None,
        table: str = None,
    ):
        self.auth_token = auth_token
        # body
        self.body = body
        # file_id
        self.file_id = file_id
        # id
        self.id = id
        # outside_bizdomain
        self.outside_bizdomain = outside_bizdomain
        # plugin_id
        self.plugin_id = plugin_id
        # table
        self.table = table

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.id is not None:
            result['id'] = self.id
        if self.outside_bizdomain is not None:
            result['outside_bizdomain'] = self.outside_bizdomain
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.table is not None:
            result['table'] = self.table
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('outside_bizdomain') is not None:
            self.outside_bizdomain = m.get('outside_bizdomain')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('table') is not None:
            self.table = m.get('table')
        return self


class UpdateRmsPluginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: bool = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsPluginbytypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
        file_id: int = None,
        id: int = None,
        outside_bizdomain: str = None,
        plugin_id: int = None,
        table: str = None,
    ):
        self.auth_token = auth_token
        # body
        self.body = body
        # file_id
        self.file_id = file_id
        # id
        self.id = id
        # outside_bizdomain
        self.outside_bizdomain = outside_bizdomain
        # plugin_id
        self.plugin_id = plugin_id
        # table
        self.table = table

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.id is not None:
            result['id'] = self.id
        if self.outside_bizdomain is not None:
            result['outside_bizdomain'] = self.outside_bizdomain
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.table is not None:
            result['table'] = self.table
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('outside_bizdomain') is not None:
            self.outside_bizdomain = m.get('outside_bizdomain')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('table') is not None:
            self.table = m.get('table')
        return self


class QueryRmsPluginbytypeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[PluginModelDO] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = PluginModelDO()
                self.data.append(temp_model.from_map(k))
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsPluginbyfolderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
        file_id: int = None,
        id: int = None,
        outside_bizdomain: str = None,
        plugin_id: int = None,
        table: str = None,
    ):
        self.auth_token = auth_token
        # body
        self.body = body
        # file_id
        self.file_id = file_id
        # id
        self.id = id
        # outside_bizdomain
        self.outside_bizdomain = outside_bizdomain
        # plugin_id
        self.plugin_id = plugin_id
        # table
        self.table = table

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.id is not None:
            result['id'] = self.id
        if self.outside_bizdomain is not None:
            result['outside_bizdomain'] = self.outside_bizdomain
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.table is not None:
            result['table'] = self.table
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('outside_bizdomain') is not None:
            self.outside_bizdomain = m.get('outside_bizdomain')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('table') is not None:
            self.table = m.get('table')
        return self


class QueryRmsPluginbyfolderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[ModelTreeNode] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ModelTreeNode()
                self.data.append(temp_model.from_map(k))
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsPluginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
        file_id: int = None,
        id: int = None,
        outside_bizdomain: str = None,
        plugin_id: int = None,
        table: str = None,
    ):
        self.auth_token = auth_token
        # body
        self.body = body
        # file_id
        self.file_id = file_id
        # id
        self.id = id
        # outside_bizdomain
        self.outside_bizdomain = outside_bizdomain
        # plugin_id
        self.plugin_id = plugin_id
        # table
        self.table = table

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.id is not None:
            result['id'] = self.id
        if self.outside_bizdomain is not None:
            result['outside_bizdomain'] = self.outside_bizdomain
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.table is not None:
            result['table'] = self.table
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('outside_bizdomain') is not None:
            self.outside_bizdomain = m.get('outside_bizdomain')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('table') is not None:
            self.table = m.get('table')
        return self


class QueryRmsPluginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: PluginModelDO = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data.to_map()
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
            temp_model = PluginModelDO()
            self.data = temp_model.from_map(m['data'])
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsPlugintestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        body: str = None,
        file_id: int = None,
        id: int = None,
        outside_bizdomain: str = None,
        plugin_id: int = None,
        table: str = None,
    ):
        self.auth_token = auth_token
        # body
        self.body = body
        # file_id
        self.file_id = file_id
        # id
        self.id = id
        # outside_bizdomain
        self.outside_bizdomain = outside_bizdomain
        # plugin_id
        self.plugin_id = plugin_id
        # table
        self.table = table

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.body is not None:
            result['body'] = self.body
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.id is not None:
            result['id'] = self.id
        if self.outside_bizdomain is not None:
            result['outside_bizdomain'] = self.outside_bizdomain
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.table is not None:
            result['table'] = self.table
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('body') is not None:
            self.body = m.get('body')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('outside_bizdomain') is not None:
            self.outside_bizdomain = m.get('outside_bizdomain')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('table') is not None:
            self.table = m.get('table')
        return self


class QueryRmsPlugintestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: Threshold = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data.to_map()
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
            temp_model = Threshold()
            self.data = temp_model.from_map(m['data'])
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsPathRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        requests: List[FolderRequestCmd] = None,
    ):
        self.auth_token = auth_token
        # requests
        self.requests = requests

    def validate(self):
        if self.requests:
            for k in self.requests:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        result['requests'] = []
        if self.requests is not None:
            for k in self.requests:
                result['requests'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        self.requests = []
        if m.get('requests') is not None:
            for k in m.get('requests'):
                temp_model = FolderRequestCmd()
                self.requests.append(temp_model.from_map(k))
        return self


class QueryRmsPathResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[FolderPaths] = None,
        error_code: str = None,
        rid: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # data
        self.data = data
        # error_code
        self.error_code = error_code
        # rid
        self.rid = rid
        # success
        self.success = success

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
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
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.rid is not None:
            result['rid'] = self.rid
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = FolderPaths()
                self.data.append(temp_model.from_map(k))
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('rid') is not None:
            self.rid = m.get('rid')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ExecRmsUniversalcleankeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        req_params: List[KeySet] = None,
        tenant_id: str = None,
    ):
        self.auth_token = auth_token
        # req_params
        self.req_params = req_params
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        if self.req_params:
            for k in self.req_params:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        result['req_params'] = []
        if self.req_params is not None:
            for k in self.req_params:
                result['req_params'].append(k.to_map() if k else None)
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        self.req_params = []
        if m.get('req_params') is not None:
            for k in m.get('req_params'):
                temp_model = KeySet()
                self.req_params.append(temp_model.from_map(k))
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class ExecRmsUniversalcleankeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_message: CallErrorMessage = None,
        part_suc: bool = None,
        result: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # error_message
        self.error_message = error_message
        # part_suc
        self.part_suc = part_suc
        # result
        self.result = result
        # success
        self.success = success

    def validate(self):
        if self.error_message:
            self.error_message.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.error_message is not None:
            result['error_message'] = self.error_message.to_map()
        if self.part_suc is not None:
            result['part_suc'] = self.part_suc
        if self.result is not None:
            result['result'] = self.result
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
        if m.get('error_message') is not None:
            temp_model = CallErrorMessage()
            self.error_message = temp_model.from_map(m['error_message'])
        if m.get('part_suc') is not None:
            self.part_suc = m.get('part_suc')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryRmsUniversalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        post_body: str = None,
        tenant_id: str = None,
    ):
        self.auth_token = auth_token
        # post_body
        self.post_body = post_body
        # tenant_id
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.post_body is not None:
            result['post_body'] = self.post_body
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('post_body') is not None:
            self.post_body = m.get('post_body')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryRmsUniversalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # result
        self.result = result

    def validate(self):
        pass

    def to_map(self):
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


class QueryRmsTracespanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        app: str = None,
        end_time: int = None,
        extensions: List[KeySet] = None,
        max_duration: int = None,
        min_duration: int = None,
        page_number: int = None,
        page_size: int = None,
        start_time: int = None,
        status: str = None,
        tags: List[KeySet] = None,
        trace_id: str = None,
        workspace_id: int = None,
    ):
        self.auth_token = auth_token
        # 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
        self.app = app
        # 最大的毫秒开始时间戳
        self.end_time = end_time
        # 万能扩展字段
        self.extensions = extensions
        # 最大毫秒耗时
        self.max_duration = max_duration
        # 最小毫秒耗时
        self.min_duration = min_duration
        # 分页号
        self.page_number = page_number
        # 分页大小
        self.page_size = page_size
        # 搜索的毫秒开始时间戳
        self.start_time = start_time
        # 结果码
        self.status = status
        # 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
        self.tags = tags
        # 按traceId搜索时会用到 此时其他条件自动失效
        self.trace_id = trace_id
        # workspace_id
        self.workspace_id = workspace_id

    def validate(self):
        if self.extensions:
            for k in self.extensions:
                if k:
                    k.validate()
        if self.tags:
            for k in self.tags:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.app is not None:
            result['app'] = self.app
        if self.end_time is not None:
            result['end_time'] = self.end_time
        result['extensions'] = []
        if self.extensions is not None:
            for k in self.extensions:
                result['extensions'].append(k.to_map() if k else None)
        if self.max_duration is not None:
            result['max_duration'] = self.max_duration
        if self.min_duration is not None:
            result['min_duration'] = self.min_duration
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.status is not None:
            result['status'] = self.status
        result['tags'] = []
        if self.tags is not None:
            for k in self.tags:
                result['tags'].append(k.to_map() if k else None)
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('app') is not None:
            self.app = m.get('app')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        self.extensions = []
        if m.get('extensions') is not None:
            for k in m.get('extensions'):
                temp_model = KeySet()
                self.extensions.append(temp_model.from_map(k))
        if m.get('max_duration') is not None:
            self.max_duration = m.get('max_duration')
        if m.get('min_duration') is not None:
            self.min_duration = m.get('min_duration')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.tags = []
        if m.get('tags') is not None:
            for k in m.get('tags'):
                temp_model = KeySet()
                self.tags.append(temp_model.from_map(k))
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        return self


class QueryRmsTracespanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_number: int = None,
        page_size: int = None,
        spans: List[TraceSpan] = None,
        total_page: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 分页号
        self.page_number = page_number
        # 分页大小
        self.page_size = page_size
        # 搜索出的spans, 查无结果时为空数组
        self.spans = spans
        # 总页数
        self.total_page = total_page

    def validate(self):
        if self.spans:
            for k in self.spans:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['spans'] = []
        if self.spans is not None:
            for k in self.spans:
                result['spans'].append(k.to_map() if k else None)
        if self.total_page is not None:
            result['total_page'] = self.total_page
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.spans = []
        if m.get('spans') is not None:
            for k in m.get('spans'):
                temp_model = TraceSpan()
                self.spans.append(temp_model.from_map(k))
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        return self


class GetRmsTracespanqueryconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
    ):
        self.auth_token = auth_token

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class GetRmsTracespanqueryconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tag_configs: List[TraceSpanSearchTagConfig] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 支持的tags列表
        self.tag_configs = tag_configs

    def validate(self):
        if self.tag_configs:
            for k in self.tag_configs:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['tag_configs'] = []
        if self.tag_configs is not None:
            for k in self.tag_configs:
                result['tag_configs'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.tag_configs = []
        if m.get('tag_configs') is not None:
            for k in m.get('tag_configs'):
                temp_model = TraceSpanSearchTagConfig()
                self.tag_configs.append(temp_model.from_map(k))
        return self


class DescribeRmsTracetreeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        trace_id: str = None,
    ):
        self.auth_token = auth_token
        # trace_id
        self.trace_id = trace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        return self


class DescribeRmsTracetreeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_tree_items: List[TraceTreeItem] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 树状图结构体
        # 找不到数据时 trace_tree_items 为空数组, 并不会报错
        self.trace_tree_items = trace_tree_items

    def validate(self):
        if self.trace_tree_items:
            for k in self.trace_tree_items:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['trace_tree_items'] = []
        if self.trace_tree_items is not None:
            for k in self.trace_tree_items:
                result['trace_tree_items'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.trace_tree_items = []
        if m.get('trace_tree_items') is not None:
            for k in m.get('trace_tree_items'):
                temp_model = TraceTreeItem()
                self.trace_tree_items.append(temp_model.from_map(k))
        return self


class CallbackSpiCompletecommodityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        data: str = None,
    ):
        self.auth_token = auth_token
        # 南天门的请求体都是做成json字符串放在data字段里
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackSpiCompletecommodityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        data: str = None,
        message: str = None,
        synchro: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # code
        self.code = code
        # data
        self.data = data
        # message
        self.message = message
        # synchro
        self.synchro = synchro
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.code is not None:
            result['code'] = self.code
        if self.data is not None:
            result['data'] = self.data
        if self.message is not None:
            result['message'] = self.message
        if self.synchro is not None:
            result['synchro'] = self.synchro
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('synchro') is not None:
            self.synchro = m.get('synchro')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CallbackSpiPayordercallbackRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        data: str = None,
    ):
        self.auth_token = auth_token
        # 南天门支付后回调请求, 见 http://help.aliyun-inc.com/internaldoc/detail/134798.html?spm=ntm.workbench-devPlatform-extendPoint.0.0.42a919afQhBhEB.
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackSpiPayordercallbackResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        data: str = None,
        message: str = None,
        synchro: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # code
        self.code = code
        # data
        self.data = data
        # message
        self.message = message
        # synchro
        self.synchro = synchro
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.code is not None:
            result['code'] = self.code
        if self.data is not None:
            result['data'] = self.data
        if self.message is not None:
            result['message'] = self.message
        if self.synchro is not None:
            result['synchro'] = self.synchro
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('synchro') is not None:
            self.synchro = m.get('synchro')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CallbackSpiCompleteorderparamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        data: str = None,
    ):
        self.auth_token = auth_token
        # data
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackSpiCompleteorderparamResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        data: str = None,
        message: str = None,
        synchro: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # code
        self.code = code
        # data
        self.data = data
        # message
        self.message = message
        # synchro
        self.synchro = synchro
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.code is not None:
            result['code'] = self.code
        if self.data is not None:
            result['data'] = self.data
        if self.message is not None:
            result['message'] = self.message
        if self.synchro is not None:
            result['synchro'] = self.synchro
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('synchro') is not None:
            self.synchro = m.get('synchro')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CallbackSpiVerifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        data: str = None,
    ):
        self.auth_token = auth_token
        # data
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackSpiVerifyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        data: str = None,
        message: str = None,
        synchro: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # code
        self.code = code
        # data
        self.data = data
        # message
        self.message = message
        # synchro
        self.synchro = synchro
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.code is not None:
            result['code'] = self.code
        if self.data is not None:
            result['data'] = self.data
        if self.message is not None:
            result['message'] = self.message
        if self.synchro is not None:
            result['synchro'] = self.synchro
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('synchro') is not None:
            self.synchro = m.get('synchro')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CallbackSpiRefundRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        data: str = None,
    ):
        self.auth_token = auth_token
        # data
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackSpiRefundResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        data: str = None,
        message: str = None,
        synchro: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # code
        self.code = code
        # data
        self.data = data
        # message
        self.message = message
        # synchro
        self.synchro = synchro
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.code is not None:
            result['code'] = self.code
        if self.data is not None:
            result['data'] = self.data
        if self.message is not None:
            result['message'] = self.message
        if self.synchro is not None:
            result['synchro'] = self.synchro
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('synchro') is not None:
            self.synchro = m.get('synchro')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class CallbackSpiLifecycleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        data: str = None,
    ):
        self.auth_token = auth_token
        # data
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackSpiLifecycleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        data: str = None,
        message: str = None,
        synchro: str = None,
        success: bool = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # code
        self.code = code
        # data
        self.data = data
        # message
        self.message = message
        # a synchro
        self.synchro = synchro
        # success
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.code is not None:
            result['code'] = self.code
        if self.data is not None:
            result['data'] = self.data
        if self.message is not None:
            result['message'] = self.message
        if self.synchro is not None:
            result['synchro'] = self.synchro
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('synchro') is not None:
            self.synchro = m.get('synchro')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class DescribeRmsTimeseriesmetricsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        aggregator: str = None,
        end_time: int = None,
        metrics: List[StringValue] = None,
        start_time: int = None,
        tags: List[KeyValuePair] = None,
        type: str = None,
        workspace_id: int = None,
        workspace_name: str = None,
    ):
        self.auth_token = auth_token
        # sum或none
        self.aggregator = aggregator
        # 结束毫秒时间戳
        self.end_time = end_time
        # metrics字段名称
        self.metrics = metrics
        # 开始毫秒时间戳
        self.start_time = start_time
        # 扩展字段tags
        self.tags = tags
        # metrics类型
        self.type = type
        # workspace_id或workspace_name选填一个
        self.workspace_id = workspace_id
        # workspace_id或workspace_name选填一个
        self.workspace_name = workspace_name

    def validate(self):
        if self.metrics:
            for k in self.metrics:
                if k:
                    k.validate()
        if self.tags:
            for k in self.tags:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.aggregator is not None:
            result['aggregator'] = self.aggregator
        if self.end_time is not None:
            result['end_time'] = self.end_time
        result['metrics'] = []
        if self.metrics is not None:
            for k in self.metrics:
                result['metrics'].append(k.to_map() if k else None)
        if self.start_time is not None:
            result['start_time'] = self.start_time
        result['tags'] = []
        if self.tags is not None:
            for k in self.tags:
                result['tags'].append(k.to_map() if k else None)
        if self.type is not None:
            result['type'] = self.type
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('aggregator') is not None:
            self.aggregator = m.get('aggregator')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        self.metrics = []
        if m.get('metrics') is not None:
            for k in m.get('metrics'):
                temp_model = StringValue()
                self.metrics.append(temp_model.from_map(k))
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        self.tags = []
        if m.get('tags') is not None:
            for k in m.get('tags'):
                temp_model = KeyValuePair()
                self.tags.append(temp_model.from_map(k))
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        return self


class DescribeRmsTimeseriesmetricsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        results: List[TimeSeriesMetrics] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # metrics reulsts
        self.results = results

    def validate(self):
        if self.results:
            for k in self.results:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['results'] = []
        if self.results is not None:
            for k in self.results:
                result['results'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.results = []
        if m.get('results') is not None:
            for k in m.get('results'):
                temp_model = TimeSeriesMetrics()
                self.results.append(temp_model.from_map(k))
        return self


class DescribeRmsTopologyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        end_time: int = None,
        start_time: int = None,
        workspace_id: int = None,
        workspace_name: str = None,
    ):
        self.auth_token = auth_token
        # 结束毫秒时间戳
        self.end_time = end_time
        # 开始毫秒时间戳
        self.start_time = start_time
        # workspace_id或workspace_name二选一
        self.workspace_id = workspace_id
        # workspace_id或workspace_name二选一
        self.workspace_name = workspace_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.workspace_id is not None:
            result['workspace_id'] = self.workspace_id
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('workspace_id') is not None:
            self.workspace_id = m.get('workspace_id')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        return self


class DescribeRmsTopologyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nodes: List[TopologyNode] = None,
        edges: List[TopologyEdge] = None,
        node_metrics: List[TimeSeriesMetrics] = None,
        edge_metrics: List[TimeSeriesMetrics] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 拓扑节点
        self.nodes = nodes
        # 拓扑边
        self.edges = edges
        # 节点性能指标
        self.node_metrics = node_metrics
        # 边性能指标
        self.edge_metrics = edge_metrics

    def validate(self):
        if self.nodes:
            for k in self.nodes:
                if k:
                    k.validate()
        if self.edges:
            for k in self.edges:
                if k:
                    k.validate()
        if self.node_metrics:
            for k in self.node_metrics:
                if k:
                    k.validate()
        if self.edge_metrics:
            for k in self.edge_metrics:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['nodes'] = []
        if self.nodes is not None:
            for k in self.nodes:
                result['nodes'].append(k.to_map() if k else None)
        result['edges'] = []
        if self.edges is not None:
            for k in self.edges:
                result['edges'].append(k.to_map() if k else None)
        result['node_metrics'] = []
        if self.node_metrics is not None:
            for k in self.node_metrics:
                result['node_metrics'].append(k.to_map() if k else None)
        result['edge_metrics'] = []
        if self.edge_metrics is not None:
            for k in self.edge_metrics:
                result['edge_metrics'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.nodes = []
        if m.get('nodes') is not None:
            for k in m.get('nodes'):
                temp_model = TopologyNode()
                self.nodes.append(temp_model.from_map(k))
        self.edges = []
        if m.get('edges') is not None:
            for k in m.get('edges'):
                temp_model = TopologyEdge()
                self.edges.append(temp_model.from_map(k))
        self.node_metrics = []
        if m.get('node_metrics') is not None:
            for k in m.get('node_metrics'):
                temp_model = TimeSeriesMetrics()
                self.node_metrics.append(temp_model.from_map(k))
        self.edge_metrics = []
        if m.get('edge_metrics') is not None:
            for k in m.get('edge_metrics'):
                temp_model = TimeSeriesMetrics()
                self.edge_metrics.append(temp_model.from_map(k))
        return self


class QueryMetricsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        start: int = None,
        end: int = None,
        plugin: str = None,
        ds_id: int = None,
        content_type: str = None,
        workspace_name: str = None,
    ):
        self.auth_token = auth_token
        # 开始时间
        self.start = start
        # 结束时间
        self.end = end
        # 插件类型
        self.plugin = plugin
        # 监控指标 ID
        self.ds_id = ds_id
        # contentType
        self.content_type = content_type
        # 工作空间
        self.workspace_name = workspace_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.start is not None:
            result['start'] = self.start
        if self.end is not None:
            result['end'] = self.end
        if self.plugin is not None:
            result['plugin'] = self.plugin
        if self.ds_id is not None:
            result['ds_id'] = self.ds_id
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('start') is not None:
            self.start = m.get('start')
        if m.get('end') is not None:
            self.end = m.get('end')
        if m.get('plugin') is not None:
            self.plugin = m.get('plugin')
        if m.get('ds_id') is not None:
            self.ds_id = m.get('ds_id')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        return self


class QueryMetricsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 查询数据结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
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


class QueryTraceSpanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        trace_id: str = None,
        app: str = None,
        start_time: int = None,
        end_time: int = None,
        min_duration: int = None,
        max_duration: int = None,
        current_page: int = None,
        page_size: int = None,
        tags: List[KeySet] = None,
        workspace_name: str = None,
    ):
        self.auth_token = auth_token
        # 按traceId搜索时会用到 此时其他条件自动失效
        self.trace_id = trace_id
        # 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
        self.app = app
        # 搜索的毫秒开始时间戳
        self.start_time = start_time
        # 最大的毫秒开始时间戳
        self.end_time = end_time
        # 最小毫秒耗时
        self.min_duration = min_duration
        # 最大毫秒耗时
        self.max_duration = max_duration
        # 分页号
        self.current_page = current_page
        # 每页记录条数
        self.page_size = page_size
        # 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
        self.tags = tags
        # 工作空间
        self.workspace_name = workspace_name

    def validate(self):
        if self.tags:
            for k in self.tags:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.app is not None:
            result['app'] = self.app
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.min_duration is not None:
            result['min_duration'] = self.min_duration
        if self.max_duration is not None:
            result['max_duration'] = self.max_duration
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['tags'] = []
        if self.tags is not None:
            for k in self.tags:
                result['tags'].append(k.to_map() if k else None)
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('app') is not None:
            self.app = m.get('app')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('min_duration') is not None:
            self.min_duration = m.get('min_duration')
        if m.get('max_duration') is not None:
            self.max_duration = m.get('max_duration')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.tags = []
        if m.get('tags') is not None:
            for k in m.get('tags'):
                temp_model = KeySet()
                self.tags.append(temp_model.from_map(k))
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        return self


class QueryTraceSpanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_number: int = None,
        page_size: int = None,
        total_page: int = None,
        total_number: int = None,
        spans: List[TraceSpan] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 分页号
        self.page_number = page_number
        # 分页大小
        self.page_size = page_size
        # 总页数
        self.total_page = total_page
        # 查询总数
        self.total_number = total_number
        # 搜索出的spans, 查无结果时为空数组
        self.spans = spans

    def validate(self):
        if self.spans:
            for k in self.spans:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_page is not None:
            result['total_page'] = self.total_page
        if self.total_number is not None:
            result['total_number'] = self.total_number
        result['spans'] = []
        if self.spans is not None:
            for k in self.spans:
                result['spans'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        if m.get('total_number') is not None:
            self.total_number = m.get('total_number')
        self.spans = []
        if m.get('spans') is not None:
            for k in m.get('spans'):
                temp_model = TraceSpan()
                self.spans.append(temp_model.from_map(k))
        return self


class ListAppRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        current_page: int = None,
        page_size: int = None,
        workspace_name: str = None,
    ):
        self.auth_token = auth_token
        # 实际SQL查询时LIMIT的第一个字段
        self.current_page = current_page
        # 页面大小
        self.page_size = page_size
        # 工作空间
        self.workspace_name = workspace_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        return self


class ListAppResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[AppDO] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 返回结果：应用列表
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
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
                temp_model = AppDO()
                self.result.append(temp_model.from_map(k))
        return self


class CreateCustompluginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        workspace_name: str = None,
        plugin_type: str = None,
        name: str = None,
        parent_folder_id: int = None,
        is_open: bool = None,
        alarm_pkgs: AlarmPkgDO = None,
    ):
        self.auth_token = auth_token
        # 工作空间
        self.workspace_name = workspace_name
        # 监控产品类型
        self.plugin_type = plugin_type
        # 监控配置名
        self.name = name
        # 父级文件夹 ID
        self.parent_folder_id = parent_folder_id
        # 是否生效
        self.is_open = is_open
        # 告警套餐
        self.alarm_pkgs = alarm_pkgs

    def validate(self):
        if self.alarm_pkgs:
            self.alarm_pkgs.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        if self.plugin_type is not None:
            result['plugin_type'] = self.plugin_type
        if self.name is not None:
            result['name'] = self.name
        if self.parent_folder_id is not None:
            result['parent_folder_id'] = self.parent_folder_id
        if self.is_open is not None:
            result['is_open'] = self.is_open
        if self.alarm_pkgs is not None:
            result['alarm_pkgs'] = self.alarm_pkgs.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        if m.get('plugin_type') is not None:
            self.plugin_type = m.get('plugin_type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('parent_folder_id') is not None:
            self.parent_folder_id = m.get('parent_folder_id')
        if m.get('is_open') is not None:
            self.is_open = m.get('is_open')
        if m.get('alarm_pkgs') is not None:
            temp_model = AlarmPkgDO()
            self.alarm_pkgs = temp_model.from_map(m['alarm_pkgs'])
        return self


class CreateCustompluginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
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


class DeleteCustompluginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        plugin_type: str = None,
        id: int = None,
        workspace_name: str = None,
    ):
        self.auth_token = auth_token
        # 监控产品类型
        self.plugin_type = plugin_type
        # id
        self.id = id
        # 工作空间
        self.workspace_name = workspace_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.plugin_type is not None:
            result['plugin_type'] = self.plugin_type
        if self.id is not None:
            result['id'] = self.id
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('plugin_type') is not None:
            self.plugin_type = m.get('plugin_type')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        return self


class DeleteCustompluginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
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


class CreateFolderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        workspace_name: str = None,
        name: str = None,
        parent_folder_id: int = None,
    ):
        self.auth_token = auth_token
        # 工作空间
        self.workspace_name = workspace_name
        # 文件夹名称
        self.name = name
        # 父级文件夹id
        self.parent_folder_id = parent_folder_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        if self.name is not None:
            result['name'] = self.name
        if self.parent_folder_id is not None:
            result['parent_folder_id'] = self.parent_folder_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('parent_folder_id') is not None:
            self.parent_folder_id = m.get('parent_folder_id')
        return self


class CreateFolderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        folder_id: int = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 文件夹 ID
        self.folder_id = folder_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.folder_id is not None:
            result['folder_id'] = self.folder_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('folder_id') is not None:
            self.folder_id = m.get('folder_id')
        return self


class UpdateFolderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        id: int = None,
        name: str = None,
        workspace_name: str = None,
    ):
        self.auth_token = auth_token
        # 文件夹id
        self.id = id
        # 文件夹新名称
        self.name = name
        # 工作空间
        self.workspace_name = workspace_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        return self


class UpdateFolderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
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


class QueryTraceConfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        workspace_name: str = None,
    ):
        self.auth_token = auth_token
        # 工作空间
        self.workspace_name = workspace_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        return self


class QueryTraceConfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tags: List[TraceSpanSearchTagConfig] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 链路配置
        self.tags = tags

    def validate(self):
        if self.tags:
            for k in self.tags:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['tags'] = []
        if self.tags is not None:
            for k in self.tags:
                result['tags'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.tags = []
        if m.get('tags') is not None:
            for k in m.get('tags'):
                temp_model = TraceSpanSearchTagConfig()
                self.tags.append(temp_model.from_map(k))
        return self


class QueryFolderPathRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        custom_plugin_id: int = None,
        folder_id: int = None,
        include_plugin_name: bool = None,
    ):
        self.auth_token = auth_token
        # 自定义监控 ID
        self.custom_plugin_id = custom_plugin_id
        # 文件夹 ID
        self.folder_id = folder_id
        # 是否包含插件名
        self.include_plugin_name = include_plugin_name

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.custom_plugin_id is not None:
            result['custom_plugin_id'] = self.custom_plugin_id
        if self.folder_id is not None:
            result['folder_id'] = self.folder_id
        if self.include_plugin_name is not None:
            result['include_plugin_name'] = self.include_plugin_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('custom_plugin_id') is not None:
            self.custom_plugin_id = m.get('custom_plugin_id')
        if m.get('folder_id') is not None:
            self.folder_id = m.get('folder_id')
        if m.get('include_plugin_name') is not None:
            self.include_plugin_name = m.get('include_plugin_name')
        return self


class QueryFolderPathResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        paths: List[FolderPath] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 文件夹路径
        self.paths = paths

    def validate(self):
        if self.paths:
            for k in self.paths:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['paths'] = []
        if self.paths is not None:
            for k in self.paths:
                result['paths'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.paths = []
        if m.get('paths') is not None:
            for k in m.get('paths'):
                temp_model = FolderPath()
                self.paths.append(temp_model.from_map(k))
        return self


class QueryTraceDetailRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        workspace_name: str = None,
        trace_id: str = None,
        backup_entryip: str = None,
        first_query: bool = None,
    ):
        self.auth_token = auth_token
        # 工作空间
        self.workspace_name = workspace_name
        # traceId
        self.trace_id = trace_id
        # 备选的入口ip
        self.backup_entryip = backup_entryip
        # 是否为第一次查询
        self.first_query = first_query

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.backup_entryip is not None:
            result['backup_entryip'] = self.backup_entryip
        if self.first_query is not None:
            result['first_query'] = self.first_query
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('backup_entryip') is not None:
            self.backup_entryip = m.get('backup_entryip')
        if m.get('first_query') is not None:
            self.first_query = m.get('first_query')
        return self


class QueryTraceDetailResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trace_tree_item: TraceTreeItem = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # TaceTreeItem
        self.trace_tree_item = trace_tree_item

    def validate(self):
        if self.trace_tree_item:
            self.trace_tree_item.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.trace_tree_item is not None:
            result['trace_tree_item'] = self.trace_tree_item.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trace_tree_item') is not None:
            temp_model = TraceTreeItem()
            self.trace_tree_item = temp_model.from_map(m['trace_tree_item'])
        return self


class QueryTraceTopologyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        end_time: int = None,
        start_time: int = None,
        workspace_name: str = None,
        app: str = None,
        trace_id: str = None,
    ):
        self.auth_token = auth_token
        # 结束毫秒时间戳
        self.end_time = end_time
        # 开始毫秒时间戳
        self.start_time = start_time
        # 工作空间
        self.workspace_name = workspace_name
        # app
        self.app = app
        # trace_id
        self.trace_id = trace_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        if self.app is not None:
            result['app'] = self.app
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        if m.get('app') is not None:
            self.app = m.get('app')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        return self


class QueryTraceTopologyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nodes: TopologyNode = None,
        edges: TopologyEdge = None,
        node_metrics: TimeSeriesMetrics = None,
        edge_metrics: TimeSeriesMetrics = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # 拓扑节点
        self.nodes = nodes
        # 拓扑边
        self.edges = edges
        # 节点性能指标
        self.node_metrics = node_metrics
        # 边性能指标
        self.edge_metrics = edge_metrics

    def validate(self):
        if self.nodes:
            self.nodes.validate()
        if self.edges:
            self.edges.validate()
        if self.node_metrics:
            self.node_metrics.validate()
        if self.edge_metrics:
            self.edge_metrics.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.nodes is not None:
            result['nodes'] = self.nodes.to_map()
        if self.edges is not None:
            result['edges'] = self.edges.to_map()
        if self.node_metrics is not None:
            result['node_metrics'] = self.node_metrics.to_map()
        if self.edge_metrics is not None:
            result['edge_metrics'] = self.edge_metrics.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nodes') is not None:
            temp_model = TopologyNode()
            self.nodes = temp_model.from_map(m['nodes'])
        if m.get('edges') is not None:
            temp_model = TopologyEdge()
            self.edges = temp_model.from_map(m['edges'])
        if m.get('node_metrics') is not None:
            temp_model = TimeSeriesMetrics()
            self.node_metrics = temp_model.from_map(m['node_metrics'])
        if m.get('edge_metrics') is not None:
            temp_model = TimeSeriesMetrics()
            self.edge_metrics = temp_model.from_map(m['edge_metrics'])
        return self


class QueryTraceMetricsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        aggregator: str = None,
        end_time: int = None,
        start_time: int = None,
        metrics: List[str] = None,
        tags: List[KeyValuePair] = None,
        type: str = None,
        workspace_name: str = None,
    ):
        self.auth_token = auth_token
        # sum或none
        self.aggregator = aggregator
        # 结束毫秒时间戳
        self.end_time = end_time
        # 开始毫秒时间戳
        self.start_time = start_time
        # metrics字段名称
        self.metrics = metrics
        # 扩展字段tags
        self.tags = tags
        # metrics类型
        self.type = type
        # 工作空间
        self.workspace_name = workspace_name

    def validate(self):
        if self.tags:
            for k in self.tags:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.aggregator is not None:
            result['aggregator'] = self.aggregator
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.metrics is not None:
            result['metrics'] = self.metrics
        result['tags'] = []
        if self.tags is not None:
            for k in self.tags:
                result['tags'].append(k.to_map() if k else None)
        if self.type is not None:
            result['type'] = self.type
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('aggregator') is not None:
            self.aggregator = m.get('aggregator')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('metrics') is not None:
            self.metrics = m.get('metrics')
        self.tags = []
        if m.get('tags') is not None:
            for k in m.get('tags'):
                temp_model = KeyValuePair()
                self.tags.append(temp_model.from_map(k))
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        return self


class QueryTraceMetricsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: TimeSeriesMetrics = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # metrics reulsts
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
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
            temp_model = TimeSeriesMetrics()
            self.result = temp_model.from_map(m['result'])
        return self


class GetCustompluginRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        workspace_name: str = None,
        id: int = None,
        plugin_type: str = None,
    ):
        self.auth_token = auth_token
        # 工作空间
        self.workspace_name = workspace_name
        # 自定义监控指标 ID
        self.id = id
        # 类型
        self.plugin_type = plugin_type

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.workspace_name is not None:
            result['workspace_name'] = self.workspace_name
        if self.id is not None:
            result['id'] = self.id
        if self.plugin_type is not None:
            result['plugin_type'] = self.plugin_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('workspace_name') is not None:
            self.workspace_name = m.get('workspace_name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('plugin_type') is not None:
            self.plugin_type = m.get('plugin_type')
        return self


class GetCustompluginResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        id: int = None,
        name: str = None,
        alarmed: bool = None,
        plugin_id: int = None,
        plugin_type: str = None,
        creator: str = None,
        modifier: str = None,
        gmt_create: int = None,
        gmt_modified: int = None,
        alarm_pkgs: List[AlarmPkgDO] = None,
    ):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        # ID
        self.id = id
        # 自定义监控名称
        self.name = name
        # 是否有报警
        self.alarmed = alarmed
        # 监控类型id
        self.plugin_id = plugin_id
        # 监控类型
        self.plugin_type = plugin_type
        # 创建者
        self.creator = creator
        # 最后修改者
        self.modifier = modifier
        # 创建时间戳
        self.gmt_create = gmt_create
        # 最后修改时间 - 时间戳
        self.gmt_modified = gmt_modified
        # 告警套餐列表
        self.alarm_pkgs = alarm_pkgs

    def validate(self):
        if self.alarm_pkgs:
            for k in self.alarm_pkgs:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.alarmed is not None:
            result['alarmed'] = self.alarmed
        if self.plugin_id is not None:
            result['plugin_id'] = self.plugin_id
        if self.plugin_type is not None:
            result['plugin_type'] = self.plugin_type
        if self.creator is not None:
            result['creator'] = self.creator
        if self.modifier is not None:
            result['modifier'] = self.modifier
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        result['alarm_pkgs'] = []
        if self.alarm_pkgs is not None:
            for k in self.alarm_pkgs:
                result['alarm_pkgs'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('alarmed') is not None:
            self.alarmed = m.get('alarmed')
        if m.get('plugin_id') is not None:
            self.plugin_id = m.get('plugin_id')
        if m.get('plugin_type') is not None:
            self.plugin_type = m.get('plugin_type')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('modifier') is not None:
            self.modifier = m.get('modifier')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        self.alarm_pkgs = []
        if m.get('alarm_pkgs') is not None:
            for k in m.get('alarm_pkgs'):
                temp_model = AlarmPkgDO()
                self.alarm_pkgs.append(temp_model.from_map(k))
        return self


